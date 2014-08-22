package dev.tnclark8012.apps.android.dogshow.util.image;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.util.Utils;
import eu.janmuller.android.simplecropimage.CropImage;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class ImageChooserActivity extends Activity {
	public static final String TAG = makeLogTag(ImageChooserActivity.class);

	public static final String TEMP_PHOTO_FILE_NAME = "temp_photo.jpg";

	public static final int REQUEST_CODE_GALLERY = 0x1;
	public static final int REQUEST_CODE_TAKE_PICTURE = 0x2;
	public static final int REQUEST_CODE_CROP_IMAGE = 0x3;
	public static final int RESULT_CODE_IMAGE_URI = 0x4;

	public static final String EXTRA_RESULT_IMAGE_URI = "result-image-uri";

	public static final String ACTION_CHOOSE = "choose";
	public static final String ACTION_CAPTURE = "capture";
	private File mFileTemp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState); 
		String action = getIntent().getAction();
		if (action.equals(ACTION_CHOOSE)) {
			openGallery();
		} else if (action.equals(ACTION_CAPTURE)) {
			takePicture();
		} else {
			LOGW(TAG, "Unknown intent action: " + action + ". Expecting "
					+ ACTION_CHOOSE + " or " + ACTION_CAPTURE);
			finish();
		}

		String state = Environment.getExternalStorageState();
		if (Environment.MEDIA_MOUNTED.equals(state)) {
			mFileTemp = new File(Environment.getExternalStorageDirectory(),
					TEMP_PHOTO_FILE_NAME);
		} else {
			mFileTemp = new File(getFilesDir(), TEMP_PHOTO_FILE_NAME);
		}
		try {
			mFileTemp.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void takePicture() {

		Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

		try {
			Uri mImageCaptureUri = null;
			String state = Environment.getExternalStorageState();
			if (Environment.MEDIA_MOUNTED.equals(state)) {
				mImageCaptureUri = Uri.fromFile(mFileTemp);
			} else {
				/*
				 * The solution is taken from here:
				 * http://stackoverflow.com/questions
				 * /10042695/how-to-get-camera-result-as-a-uri-in-data-folder
				 */
				mImageCaptureUri = DogshowContract.BASE_CONTENT_URI;
			}
			intent.putExtra(android.provider.MediaStore.EXTRA_OUTPUT,
					mImageCaptureUri);
			intent.putExtra("return-data", true);
			startActivityForResult(intent, REQUEST_CODE_TAKE_PICTURE);
		} catch (ActivityNotFoundException e) {

			LOGD(TAG, "cannot take picture", e);
		}
	}

	private void openGallery() {

		Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
		photoPickerIntent.setType("image/*");
		startActivityForResult(photoPickerIntent, REQUEST_CODE_GALLERY);
	}

	private void startCropImage(Uri uri) {

		Intent intent = new Intent(this, CropImage.class);
		intent.putExtras(getIntent().getExtras());
		intent.putExtra(CropImage.RETURN_DATA, true);
		intent.putExtra(CropImage.SCALE, true);
		intent.putExtra(CropImage.IMAGE_PATH, uri.toString());
		Resources res = getResources();

		intent.putExtra(CropImage.ASPECT_X, 3);
		intent.putExtra(CropImage.ASPECT_Y, 2);

		startActivityForResult(intent, REQUEST_CODE_CROP_IMAGE);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		if (resultCode != RESULT_OK) {

			if (requestCode == REQUEST_CODE_CROP_IMAGE) {
				openGallery();
			} else {
				finish();
			}
			return;
		}

		Bitmap bitmap;

		switch (requestCode) {

		case REQUEST_CODE_GALLERY:

			try {
				//
				// InputStream inputStream =
				// getContentResolver().openInputStream(data.getData());
				// FileOutputStream fileOutputStream = new
				// FileOutputStream(mFileTemp);
				// copyStream(inputStream, fileOutputStream);
				// fileOutputStream.close();
				// inputStream.close();

				startCropImage(data.getData());

			} catch (Exception e) {

				LOGE(TAG, "Error while creating temp file", e);
			}

			break;
		case REQUEST_CODE_TAKE_PICTURE:
			// startCropImage();
			break;
		case REQUEST_CODE_CROP_IMAGE:
			bitmap = data
					.getParcelableExtra(CropImage.RETURN_DATA_AS_BITMAP);
			Uri uri = Utils.storeImage(this, bitmap);
			Intent intent = new Intent();
			intent.setData(uri);
			setResult(Activity.RESULT_OK, intent);
			finish();
			break;
		}
		super.onActivityResult(requestCode, resultCode, data);
	}

	public static void copyStream(InputStream input, OutputStream output)
			throws IOException {

		byte[] buffer = new byte[1024];
		int bytesRead;
		while ((bytesRead = input.read(buffer)) != -1) {
			output.write(buffer, 0, bytesRead);
		}
	}
}

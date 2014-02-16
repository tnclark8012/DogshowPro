package dev.tnclark8012.apps.android.dogshow.util.image;

import android.graphics.Bitmap;
import android.view.View;

import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.ImageLoadingListener;

public abstract class SimpleImageLoadingListener implements ImageLoadingListener{
	 
	@Override
	public void onLoadingStarted(String imageUri, View view) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public abstract void onLoadingComplete(String imageUri, View view, Bitmap loadedImage);

	@Override
	public void onLoadingCancelled(String imageUri, View view) {
		// TODO Auto-generated method stub
		
	}

}

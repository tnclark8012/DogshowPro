package dev.tnclark8012.apps.android.dogshow.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

import dev.tnclark8012.apps.android.dogshow.R;

public class TypefacedAutoCompleteTextView extends AutoCompleteTextView {
	public static final String DEFAULT_FONT = "Roboto-Regular.ttf";
    public TypefacedAutoCompleteTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        //Typeface.createFromAsset doesn't work in the layout editor. Skipping...
        if (isInEditMode()) {
            return;
        }

        TypedArray styledAttrs = context.obtainStyledAttributes(attrs, R.styleable.TypefacedTextView);
        String fontName = styledAttrs.getString(R.styleable.TypefacedTextView_typeface);
        styledAttrs.recycle();
        
        if (fontName == null) {
        	fontName = DEFAULT_FONT;
        }
        	Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/"+fontName);
            setTypeface(typeface);
    }

}
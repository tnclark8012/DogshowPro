package dev.tclark.dogshow.apps.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import dev.tclark.dogshow.apps.android.R;

public class TypefacedTextView extends TextView {
	public static final String DEFAULT_FONT = "Roboto-Regular.ttf";
    public TypefacedTextView(Context context, AttributeSet attrs) {
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
package dev.tnclark8012.woof.ui.widget;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import dev.tnclark8012.woof.R;

/**
 * Created by taylorc on 6/1/2015.
 */
public class SimpleDividerItemDecoration extends RecyclerView.ItemDecoration {
    private Drawable mDividerDrawable;

    public SimpleDividerItemDecoration(Resources resources)
    {
        // Using deprecated API since min-API is too low for Theme
        mDividerDrawable = resources.getDrawable(R.drawable.list_divider);
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {

        int top;
        int right = parent.getWidth() - parent.getPaddingRight();
        int bottom;
        int left = parent.getPaddingLeft();

        int childCount = parent.getChildCount();
        RecyclerView.LayoutParams layoutParams;
        for(int i = 0; i < childCount; i++)
        {
            View child = parent.getChildAt(i);
            layoutParams = (RecyclerView.LayoutParams)child.getLayoutParams();
            top = layoutParams.bottomMargin + child.getBottom();
            bottom = mDividerDrawable.getIntrinsicHeight() + top;
            mDividerDrawable.setBounds(left, top, right, bottom);
            mDividerDrawable.draw(c);
        }
    }
}

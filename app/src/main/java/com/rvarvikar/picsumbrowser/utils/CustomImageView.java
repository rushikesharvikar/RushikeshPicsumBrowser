package com.rvarvikar.picsumbrowser.utils;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

public class CustomImageView extends AppCompatImageView {
    public CustomImageView(Context context) {
            super(context);
        }

    public CustomImageView(Context context, @Nullable AttributeSet attrs) {
            super(context, attrs);
        }

    public CustomImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
        }

        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);

            int width = getMeasuredWidth();
            setMeasuredDimension(width, width);
        }
    }
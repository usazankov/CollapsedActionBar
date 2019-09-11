package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ToggleButton;
import android.support.design.widget.CoordinatorLayout;


@CoordinatorLayout.DefaultBehavior(CustomToggleButtonBehavior.class)
public class CustomToogleButton extends ToggleButton {
    public CustomToogleButton(Context context) { super(context); }

    public CustomToogleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomToogleButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}

package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.support.design.widget.AppBarLayout;

public class CustomToggleButtonBehavior extends CoordinatorLayout.Behavior<CustomToogleButton> {

    public CustomToggleButtonBehavior() {
        super();
        //Used when the layout has a behavior attached via the Annotation;
    }

    public CustomToggleButtonBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        //Used when the layout has a behavior attached via xml (Within the xml file e.g.
        //<app:layout_behavior=".link.to.your.behavior">
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, CustomToogleButton child, View dependency) {
        return dependency instanceof AppBarLayout;
    }

    @Override
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout parent, @NonNull CustomToogleButton child, @NonNull View dependency) {
        AppBarLayout appBarLayout = (AppBarLayout) dependency;
        int bottom = appBarLayout.getBottom();
        int height = appBarLayout.getHeight()/2;
        if (bottom <= height) {
            child.setText("Visible");
        } else {
            child.setText("HIDE");
        }
        return true;
    }
}

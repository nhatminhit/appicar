package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import d.x0;

@x0({x0.a.LIBRARY_GROUP})
@SuppressLint({"AppCompatCustomView"})
public class VisibilityAwareImageButton extends ImageButton {
    public int O;

    public VisibilityAwareImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.O = getVisibility();
    }

    public final void c(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.O = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.O;
    }

    public void setVisibility(int i10) {
        c(i10, true);
    }
}

package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.w0;
import i9.a;

public class TabItem extends View {
    public final CharSequence O;
    public final Drawable P;
    public final int Q;

    public TabItem(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        w0 F = w0.F(context, attributeSet, a.o.TabItem);
        this.O = F.x(a.o.TabItem_android_text);
        this.P = F.h(a.o.TabItem_android_icon);
        this.Q = F.u(a.o.TabItem_android_layout, 0);
        F.I();
    }
}

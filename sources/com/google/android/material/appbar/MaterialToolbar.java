package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import d.l;
import d.m0;
import d.o0;
import d.t0;
import f1.w1;
import i9.a;
import o0.d;
import z9.j;
import z9.k;

public class MaterialToolbar extends Toolbar {
    public static final int I0 = a.n.Widget_MaterialComponents_Toolbar;
    @o0
    public Integer H0;

    public MaterialToolbar(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialToolbar(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.toolbarStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(@d.m0 android.content.Context r7, @d.o0 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = I0
            android.content.Context r7 = ca.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r7 = r6.getContext()
            int[] r2 = i9.a.o.MaterialToolbar
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r7
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r9 = i9.a.o.MaterialToolbar_navigationIconTint
            boolean r0 = r8.hasValue(r9)
            if (r0 == 0) goto L_0x0029
            r0 = -1
            int r9 = r8.getColor(r9, r0)
            r6.setNavigationIconTint(r9)
        L_0x0029:
            r8.recycle()
            r6.S(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void S(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            j jVar = new j();
            jVar.n0(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            jVar.Y(context);
            jVar.m0(w1.P(this));
            w1.G1(this, jVar);
        }
    }

    @o0
    public final Drawable T(@o0 Drawable drawable) {
        if (drawable == null || this.H0 == null) {
            return drawable;
        }
        Drawable r10 = d.r(drawable);
        d.n(r10, this.H0.intValue());
        return r10;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    @t0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        k.d(this, f10);
    }

    public void setNavigationIcon(@o0 Drawable drawable) {
        super.setNavigationIcon(T(drawable));
    }

    public void setNavigationIconTint(@l int i10) {
        this.H0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }
}

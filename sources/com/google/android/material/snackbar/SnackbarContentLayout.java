package com.google.android.material.snackbar;

import aa.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import d.m0;
import d.o0;
import d.x0;
import f1.w1;
import i9.a;

@x0({x0.a.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements a {
    public TextView O;
    public Button P;
    public int Q;
    public int R;

    public SnackbarContentLayout(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public SnackbarContentLayout(@m0 Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.SnackbarLayout);
        this.Q = obtainStyledAttributes.getDimensionPixelSize(a.o.SnackbarLayout_android_maxWidth, -1);
        this.R = obtainStyledAttributes.getDimensionPixelSize(a.o.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    public static void d(@m0 View view, int i10, int i11) {
        if (w1.X0(view)) {
            w1.b2(view, w1.j0(view), i10, w1.i0(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    public void a(int i10, int i11) {
        this.O.setAlpha(0.0f);
        long j10 = (long) i11;
        long j11 = (long) i10;
        this.O.animate().alpha(1.0f).setDuration(j10).setStartDelay(j11).start();
        if (this.P.getVisibility() == 0) {
            this.P.setAlpha(0.0f);
            this.P.animate().alpha(1.0f).setDuration(j10).setStartDelay(j11).start();
        }
    }

    public void b(int i10, int i11) {
        this.O.setAlpha(1.0f);
        long j10 = (long) i11;
        long j11 = (long) i10;
        this.O.animate().alpha(0.0f).setDuration(j10).setStartDelay(j11).start();
        if (this.P.getVisibility() == 0) {
            this.P.setAlpha(1.0f);
            this.P.animate().alpha(0.0f).setDuration(j10).setStartDelay(j11).start();
        }
    }

    public void c(float f10) {
        if (f10 != 1.0f) {
            this.P.setTextColor(o9.a.g(o9.a.d(this, a.c.colorSurface), this.P.getCurrentTextColor(), f10));
        }
    }

    public final boolean e(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.O.getPaddingTop() == i11 && this.O.getPaddingBottom() == i12) {
            return z10;
        }
        d(this.O, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.P;
    }

    public TextView getMessageView() {
        return this.O;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.O = (TextView) findViewById(a.h.snackbar_text);
        this.P = (Button) findViewById(a.h.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (e(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (e(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.Q
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.Q
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = i9.a.f.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = i9.a.f.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.O
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = r4
            goto L_0x003d
        L_0x003c:
            r2 = r3
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.R
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.P
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.R
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.e(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.e(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r3 = r4
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            super.onMeasure(r8, r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i10) {
        this.R = i10;
    }
}

package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import d.x0;
import f1.o;
import f1.w1;
import i9.a;

@x0({x0.a.LIBRARY_GROUP})
public class FlowLayout extends ViewGroup {
    public int O;
    public int P;
    public boolean Q;
    public int R;

    public FlowLayout(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public FlowLayout(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.Q = false;
        d(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(@m0 Context context, @o0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.Q = false;
        d(context, attributeSet);
    }

    public static int a(int i10, int i11, int i12) {
        return i11 != Integer.MIN_VALUE ? i11 != 1073741824 ? i12 : i10 : Math.min(i12, i10);
    }

    public int b(@m0 View view) {
        Object tag = view.getTag(a.h.row_index_key);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    public boolean c() {
        return this.Q;
    }

    public final void d(@m0 Context context, @o0 AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.o.FlowLayout, 0, 0);
        this.O = obtainStyledAttributes.getDimensionPixelSize(a.o.FlowLayout_lineSpacing, 0);
        this.P = obtainStyledAttributes.getDimensionPixelSize(a.o.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.P;
    }

    public int getLineSpacing() {
        return this.O;
    }

    public int getRowCount() {
        return this.R;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (getChildCount() == 0) {
            this.R = 0;
            return;
        }
        this.R = 1;
        boolean z11 = w1.X(this) == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i16 = (i12 - i10) - paddingLeft;
        int i17 = paddingRight;
        int i18 = paddingTop;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(a.h.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = o.c(marginLayoutParams);
                    i15 = o.b(marginLayoutParams);
                } else {
                    i15 = 0;
                    i14 = 0;
                }
                int measuredWidth = i17 + i14 + childAt.getMeasuredWidth();
                if (!this.Q && measuredWidth > i16) {
                    i18 = this.O + paddingTop;
                    this.R++;
                    i17 = paddingRight;
                }
                childAt.setTag(a.h.row_index_key, Integer.valueOf(this.R - 1));
                int i20 = i17 + i14;
                int measuredWidth2 = childAt.getMeasuredWidth() + i20;
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                if (z11) {
                    i20 = i16 - measuredWidth2;
                    measuredWidth2 = (i16 - i17) - i14;
                }
                childAt.layout(i20, i18, measuredWidth2, measuredHeight);
                i17 += i14 + i15 + childAt.getMeasuredWidth() + this.P;
                paddingTop = measuredHeight;
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i15 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                int i19 = i10;
                int i20 = i11;
            } else {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.leftMargin + 0;
                    i12 = marginLayoutParams.rightMargin + 0;
                } else {
                    i13 = 0;
                    i12 = 0;
                }
                int i21 = paddingLeft;
                if (paddingLeft + i13 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    i14 = i21;
                } else {
                    i14 = getPaddingLeft();
                    i16 = this.O + paddingTop;
                }
                int measuredWidth = i14 + i13 + childAt.getMeasuredWidth();
                int measuredHeight = i16 + childAt.getMeasuredHeight();
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                paddingLeft = i14 + i13 + i12 + childAt.getMeasuredWidth() + this.P;
                if (i18 == getChildCount() - 1) {
                    i17 += i12;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i17 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i10) {
        this.P = i10;
    }

    public void setLineSpacing(int i10) {
        this.O = i10;
    }

    public void setSingleLine(boolean z10) {
        this.Q = z10;
    }
}

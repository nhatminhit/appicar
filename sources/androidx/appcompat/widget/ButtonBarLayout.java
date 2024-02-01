package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import d.m0;
import d.o0;
import d.x0;
import f.a;
import f1.w1;

@x0({x0.a.Q})
public class ButtonBarLayout extends LinearLayout {
    public static final int R = 16;
    public boolean O;
    public int P = -1;
    public int Q = 0;

    public ButtonBarLayout(@m0 Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = a.n.ButtonBarLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        w1.x1(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.O = obtainStyledAttributes.getBoolean(a.n.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z10) {
        setOrientation(z10 ? 1 : 0);
        setGravity(z10 ? 8388613 : 80);
        View findViewById = findViewById(a.h.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z10 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public final int a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean b() {
        return getOrientation() == 1;
    }

    public int getMinimumHeight() {
        return Math.max(this.Q, super.getMinimumHeight());
    }

    public void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        if (this.O) {
            if (size > this.P && b()) {
                setStacked(false);
            }
            this.P = size;
        }
        if (b() || View.MeasureSpec.getMode(i10) != 1073741824) {
            i12 = i10;
            z10 = false;
        } else {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(i12, i11);
        if (this.O && !b()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int a10 = a(0);
        if (a10 >= 0) {
            View childAt = getChildAt(a10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int a11 = a(a10 + 1);
                if (a11 >= 0) {
                    paddingTop += getChildAt(a11).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i13 = paddingTop;
            } else {
                i13 = paddingTop + getPaddingBottom();
            }
        }
        if (w1.c0(this) != i13) {
            setMinimumHeight(i13);
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            if (!z10 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}

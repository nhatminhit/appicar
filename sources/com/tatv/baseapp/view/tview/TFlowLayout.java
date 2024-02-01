package com.tatv.baseapp.view.tview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class TFlowLayout extends ViewGroup {
    public static final /* synthetic */ boolean P = false;
    public int O;

    public static class a extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public final int f17792a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17793b;

        public a(int i10, int i11) {
            super(0, 0);
            this.f17792a = i10;
            this.f17793b = i11;
        }
    }

    static {
        Class<TFlowLayout> cls = TFlowLayout.class;
    }

    public TFlowLayout(Context context) {
        super(context);
    }

    public TFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TFlowLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(10, 10);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(10, 10);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                a aVar = (a) childAt.getLayoutParams();
                if (paddingLeft + measuredWidth > i14) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += this.O;
                }
                childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, measuredHeight + paddingTop);
                paddingLeft += measuredWidth + aVar.f17792a;
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int makeMeasureSpec = View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = childAt.getMeasuredWidth();
                i13 = Math.max(i13, childAt.getMeasuredHeight() + aVar.f17793b);
                if (paddingLeft + measuredWidth > size) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += i13;
                }
                paddingLeft += measuredWidth + aVar.f17792a;
            }
        }
        this.O = i13;
        if (View.MeasureSpec.getMode(i11) == 0) {
            size2 = paddingTop + i13;
        } else if (View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = paddingTop + i13) < size2) {
            size2 = i12;
        }
        setMeasuredDimension(size, size2);
    }
}

package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import v.a;

public class MotionHelper extends ConstraintHelper implements a, MotionLayout.i {

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1578a0 = false;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f1579b0 = false;

    /* renamed from: c0  reason: collision with root package name */
    public float f1580c0;

    /* renamed from: d0  reason: collision with root package name */
    public View[] f1581d0;

    public MotionHelper(Context context) {
        super(context);
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        o(attributeSet);
    }

    public boolean A() {
        return this.f1578a0;
    }

    public void B(View view, float f10) {
    }

    public void a(MotionLayout motionLayout, int i10, int i11, float f10) {
    }

    public void b(MotionLayout motionLayout, int i10, int i11) {
    }

    public void c(MotionLayout motionLayout, int i10, boolean z10, float f10) {
    }

    public void d(MotionLayout motionLayout, int i10) {
    }

    public float getProgress() {
        return this.f1580c0;
    }

    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.MotionHelper_onShow) {
                    this.f1578a0 = obtainStyledAttributes.getBoolean(index, this.f1578a0);
                } else if (index == e.m.MotionHelper_onHide) {
                    this.f1579b0 = obtainStyledAttributes.getBoolean(index, this.f1579b0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f1580c0 = f10;
        int i10 = 0;
        if (this.P > 0) {
            this.f1581d0 = n((ConstraintLayout) getParent());
            while (i10 < this.P) {
                B(this.f1581d0[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof MotionHelper)) {
                B(childAt, f10);
            }
            i10++;
        }
    }

    public boolean z() {
        return this.f1579b0;
    }
}

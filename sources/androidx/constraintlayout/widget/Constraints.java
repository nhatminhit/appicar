package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;

public class Constraints extends ViewGroup {
    public static final String P = "Constraints";
    public d O;

    public static class a extends ConstraintLayout.b {
        public float H0;
        public boolean I0;
        public float J0;
        public float K0;
        public float L0;
        public float M0;
        public float N0;
        public float O0;
        public float P0;
        public float Q0;
        public float R0;
        public float S0;
        public float T0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.H0 = 1.0f;
            this.I0 = false;
            this.J0 = 0.0f;
            this.K0 = 0.0f;
            this.L0 = 0.0f;
            this.M0 = 0.0f;
            this.N0 = 1.0f;
            this.O0 = 1.0f;
            this.P0 = 0.0f;
            this.Q0 = 0.0f;
            this.R0 = 0.0f;
            this.S0 = 0.0f;
            this.T0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.H0 = 1.0f;
            this.I0 = false;
            this.J0 = 0.0f;
            this.K0 = 0.0f;
            this.L0 = 0.0f;
            this.M0 = 0.0f;
            this.N0 = 1.0f;
            this.O0 = 1.0f;
            this.P0 = 0.0f;
            this.Q0 = 0.0f;
            this.R0 = 0.0f;
            this.S0 = 0.0f;
            this.T0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.ConstraintSet_android_alpha) {
                    this.H0 = obtainStyledAttributes.getFloat(index, this.H0);
                } else if (index == e.m.ConstraintSet_android_elevation) {
                    this.J0 = obtainStyledAttributes.getFloat(index, this.J0);
                    this.I0 = true;
                } else if (index == e.m.ConstraintSet_android_rotationX) {
                    this.L0 = obtainStyledAttributes.getFloat(index, this.L0);
                } else if (index == e.m.ConstraintSet_android_rotationY) {
                    this.M0 = obtainStyledAttributes.getFloat(index, this.M0);
                } else if (index == e.m.ConstraintSet_android_rotation) {
                    this.K0 = obtainStyledAttributes.getFloat(index, this.K0);
                } else if (index == e.m.ConstraintSet_android_scaleX) {
                    this.N0 = obtainStyledAttributes.getFloat(index, this.N0);
                } else if (index == e.m.ConstraintSet_android_scaleY) {
                    this.O0 = obtainStyledAttributes.getFloat(index, this.O0);
                } else if (index == e.m.ConstraintSet_android_transformPivotX) {
                    this.P0 = obtainStyledAttributes.getFloat(index, this.P0);
                } else if (index == e.m.ConstraintSet_android_transformPivotY) {
                    this.Q0 = obtainStyledAttributes.getFloat(index, this.Q0);
                } else if (index == e.m.ConstraintSet_android_translationX) {
                    this.R0 = obtainStyledAttributes.getFloat(index, this.R0);
                } else if (index == e.m.ConstraintSet_android_translationY) {
                    this.S0 = obtainStyledAttributes.getFloat(index, this.S0);
                } else if (index == e.m.ConstraintSet_android_translationZ) {
                    this.T0 = obtainStyledAttributes.getFloat(index, this.T0);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public a(a aVar) {
            super((ConstraintLayout.b) aVar);
            this.H0 = 1.0f;
            this.I0 = false;
            this.J0 = 0.0f;
            this.K0 = 0.0f;
            this.L0 = 0.0f;
            this.M0 = 0.0f;
            this.N0 = 1.0f;
            this.O0 = 1.0f;
            this.P0 = 0.0f;
            this.Q0 = 0.0f;
            this.R0 = 0.0f;
            this.S0 = 0.0f;
            this.T0 = 0.0f;
        }
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(attributeSet);
        super.setVisibility(8);
    }

    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public final void c(AttributeSet attributeSet) {
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public d getConstraintSet() {
        if (this.O == null) {
            this.O = new d();
        }
        this.O.C(this);
        return this.O;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}

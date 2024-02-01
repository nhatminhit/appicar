package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;

public class Layer extends ConstraintHelper {

    /* renamed from: s0  reason: collision with root package name */
    public static final String f1559s0 = "Layer";

    /* renamed from: a0  reason: collision with root package name */
    public float f1560a0 = Float.NaN;

    /* renamed from: b0  reason: collision with root package name */
    public float f1561b0 = Float.NaN;

    /* renamed from: c0  reason: collision with root package name */
    public float f1562c0 = Float.NaN;

    /* renamed from: d0  reason: collision with root package name */
    public ConstraintLayout f1563d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f1564e0 = 1.0f;

    /* renamed from: f0  reason: collision with root package name */
    public float f1565f0 = 1.0f;

    /* renamed from: g0  reason: collision with root package name */
    public float f1566g0 = Float.NaN;

    /* renamed from: h0  reason: collision with root package name */
    public float f1567h0 = Float.NaN;

    /* renamed from: i0  reason: collision with root package name */
    public float f1568i0 = Float.NaN;

    /* renamed from: j0  reason: collision with root package name */
    public float f1569j0 = Float.NaN;

    /* renamed from: k0  reason: collision with root package name */
    public float f1570k0 = Float.NaN;

    /* renamed from: l0  reason: collision with root package name */
    public float f1571l0 = Float.NaN;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f1572m0 = true;

    /* renamed from: n0  reason: collision with root package name */
    public View[] f1573n0 = null;

    /* renamed from: o0  reason: collision with root package name */
    public float f1574o0 = 0.0f;

    /* renamed from: p0  reason: collision with root package name */
    public float f1575p0 = 0.0f;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f1576q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f1577r0;

    public Layer(Context context) {
        super(context);
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Layer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public final void A() {
        int i10;
        if (this.f1563d0 != null && (i10 = this.P) != 0) {
            View[] viewArr = this.f1573n0;
            if (viewArr == null || viewArr.length != i10) {
                this.f1573n0 = new View[i10];
            }
            for (int i11 = 0; i11 < this.P; i11++) {
                this.f1573n0[i11] = this.f1563d0.o(this.O[i11]);
            }
        }
    }

    public final void B() {
        if (this.f1563d0 != null) {
            if (this.f1573n0 == null) {
                A();
            }
            z();
            double radians = Float.isNaN(this.f1562c0) ? 0.0d : Math.toRadians((double) this.f1562c0);
            float sin = (float) Math.sin(radians);
            float cos = (float) Math.cos(radians);
            float f10 = this.f1564e0;
            float f11 = f10 * cos;
            float f12 = this.f1565f0;
            float f13 = (-f12) * sin;
            float f14 = f10 * sin;
            float f15 = f12 * cos;
            for (int i10 = 0; i10 < this.P; i10++) {
                View view = this.f1573n0[i10];
                float left = ((float) ((view.getLeft() + view.getRight()) / 2)) - this.f1566g0;
                float top = ((float) ((view.getTop() + view.getBottom()) / 2)) - this.f1567h0;
                view.setTranslationX((((f11 * left) + (f13 * top)) - left) + this.f1574o0);
                view.setTranslationY((((left * f14) + (f15 * top)) - top) + this.f1575p0);
                view.setScaleY(this.f1565f0);
                view.setScaleX(this.f1564e0);
                if (!Float.isNaN(this.f1562c0)) {
                    view.setRotation(this.f1562c0);
                }
            }
        }
    }

    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.S = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.ConstraintLayout_Layout_android_visibility) {
                    this.f1576q0 = true;
                } else if (index == e.m.ConstraintLayout_Layout_android_elevation) {
                    this.f1577r0 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1563d0 = (ConstraintLayout) getParent();
        if (this.f1576q0 || this.f1577r0) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.P; i10++) {
                View o10 = this.f1563d0.o(this.O[i10]);
                if (o10 != null) {
                    if (this.f1576q0) {
                        o10.setVisibility(visibility);
                    }
                    if (this.f1577r0 && elevation > 0.0f) {
                        o10.setTranslationZ(o10.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        i();
    }

    public void setPivotX(float f10) {
        this.f1560a0 = f10;
        B();
    }

    public void setPivotY(float f10) {
        this.f1561b0 = f10;
        B();
    }

    public void setRotation(float f10) {
        this.f1562c0 = f10;
        B();
    }

    public void setScaleX(float f10) {
        this.f1564e0 = f10;
        B();
    }

    public void setScaleY(float f10) {
        this.f1565f0 = f10;
        B();
    }

    public void setTranslationX(float f10) {
        this.f1574o0 = f10;
        B();
    }

    public void setTranslationY(float f10) {
        this.f1575p0 = f10;
        B();
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        i();
    }

    public void t(ConstraintLayout constraintLayout) {
        A();
        this.f1566g0 = Float.NaN;
        this.f1567h0 = Float.NaN;
        z.e b10 = ((ConstraintLayout.b) getLayoutParams()).b();
        b10.H1(0);
        b10.d1(0);
        z();
        layout(((int) this.f1570k0) - getPaddingLeft(), ((int) this.f1571l0) - getPaddingTop(), ((int) this.f1568i0) + getPaddingRight(), ((int) this.f1569j0) + getPaddingBottom());
        B();
    }

    public void v(ConstraintLayout constraintLayout) {
        this.f1563d0 = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f || !Float.isNaN(this.f1562c0)) {
            this.f1562c0 = rotation;
        }
    }

    public void z() {
        if (this.f1563d0 != null) {
            if (!this.f1572m0 && !Float.isNaN(this.f1566g0) && !Float.isNaN(this.f1567h0)) {
                return;
            }
            if (Float.isNaN(this.f1560a0) || Float.isNaN(this.f1561b0)) {
                View[] n10 = n(this.f1563d0);
                int left = n10[0].getLeft();
                int top = n10[0].getTop();
                int right = n10[0].getRight();
                int bottom = n10[0].getBottom();
                for (int i10 = 0; i10 < this.P; i10++) {
                    View view = n10[i10];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.f1568i0 = (float) right;
                this.f1569j0 = (float) bottom;
                this.f1570k0 = (float) left;
                this.f1571l0 = (float) top;
                this.f1566g0 = Float.isNaN(this.f1560a0) ? (float) ((left + right) / 2) : this.f1560a0;
                this.f1567h0 = Float.isNaN(this.f1561b0) ? (float) ((top + bottom) / 2) : this.f1561b0;
                return;
            }
            this.f1567h0 = this.f1561b0;
            this.f1566g0 = this.f1560a0;
        }
    }
}

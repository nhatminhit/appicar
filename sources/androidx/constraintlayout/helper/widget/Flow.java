package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.e;
import z.g;
import z.j;
import z.m;

public class Flow extends VirtualLayout {

    /* renamed from: d0  reason: collision with root package name */
    public static final String f1542d0 = "Flow";

    /* renamed from: e0  reason: collision with root package name */
    public static final int f1543e0 = 0;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f1544f0 = 1;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f1545g0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f1546h0 = 1;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f1547i0 = 2;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f1548j0 = 0;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f1549k0 = 1;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f1550l0 = 2;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f1551m0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f1552n0 = 1;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f1553o0 = 2;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f1554p0 = 0;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f1555q0 = 1;

    /* renamed from: r0  reason: collision with root package name */
    public static final int f1556r0 = 2;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f1557s0 = 3;

    /* renamed from: c0  reason: collision with root package name */
    public g f1558c0;

    public Flow(Context context) {
        super(context);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.f1558c0 = new g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.ConstraintLayout_Layout_android_orientation) {
                    this.f1558c0.Y2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_android_padding) {
                    this.f1558c0.e2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_android_paddingStart) {
                    this.f1558c0.j2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f1558c0.g2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f1558c0.h2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_android_paddingTop) {
                    this.f1558c0.k2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_android_paddingRight) {
                    this.f1558c0.i2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f1558c0.f2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f1558c0.d3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f1558c0.S2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f1558c0.c3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f1558c0.M2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f1558c0.U2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f1558c0.O2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f1558c0.W2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f1558c0.Q2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == e.m.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f1558c0.L2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == e.m.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f1558c0.T2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == e.m.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f1558c0.N2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == e.m.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f1558c0.V2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == e.m.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f1558c0.a3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == e.m.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f1558c0.P2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == e.m.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f1558c0.Z2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == e.m.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f1558c0.R2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f1558c0.b3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f1558c0.X2(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.R = this.f1558c0;
        y();
    }

    @SuppressLint({"WrongCall"})
    public void onMeasure(int i10, int i11) {
        z(this.f1558c0, i10, i11);
    }

    public void p(d.a aVar, j jVar, ConstraintLayout.b bVar, SparseArray<z.e> sparseArray) {
        super.p(aVar, jVar, bVar, sparseArray);
        if (jVar instanceof g) {
            g gVar = (g) jVar;
            int i10 = bVar.S;
            if (i10 != -1) {
                gVar.Y2(i10);
            }
        }
    }

    public void r(z.e eVar, boolean z10) {
        this.f1558c0.Q1(z10);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f1558c0.L2(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f1558c0.M2(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f1558c0.N2(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f1558c0.O2(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f1558c0.P2(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f1558c0.Q2(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f1558c0.R2(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f1558c0.S2(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f1558c0.X2(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f1558c0.Y2(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f1558c0.e2(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f1558c0.f2(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f1558c0.h2(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f1558c0.i2(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f1558c0.k2(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f1558c0.Z2(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f1558c0.a3(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f1558c0.b3(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f1558c0.c3(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f1558c0.d3(i10);
        requestLayout();
    }

    public void z(m mVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mVar != null) {
            mVar.Y1(mode, size, mode2, size2);
            setMeasuredDimension(mVar.T1(), mVar.S1());
            return;
        }
        setMeasuredDimension(0, 0);
    }
}

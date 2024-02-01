package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import d.l;
import d.m0;
import d.o0;
import d.q;
import f1.w1;
import i9.a;
import z9.j;
import z9.m;

public class d extends ConstraintLayout {
    public static final String A0 = "skip";

    /* renamed from: x0  reason: collision with root package name */
    public final Runnable f17656x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f17657y0;

    /* renamed from: z0  reason: collision with root package name */
    public j f17658z0;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            d.this.L();
        }
    }

    public d(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public d(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public d(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(a.k.material_radial_view_group, this);
        w1.G1(this, H());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.RadialViewGroup, i10, 0);
        this.f17657y0 = obtainStyledAttributes.getDimensionPixelSize(a.o.RadialViewGroup_materialCircleRadius, 0);
        this.f17656x0 = new a();
        obtainStyledAttributes.recycle();
    }

    public static boolean K(View view) {
        return A0.equals(view.getTag());
    }

    public final Drawable H() {
        j jVar = new j();
        this.f17658z0 = jVar;
        jVar.k0(new m(0.5f));
        this.f17658z0.n0(ColorStateList.valueOf(-1));
        return this.f17658z0;
    }

    @q
    public int I() {
        return this.f17657y0;
    }

    public void J(@q int i10) {
        this.f17657y0 = i10;
        L();
    }

    public void L() {
        int childCount = getChildCount();
        int i10 = 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            if (K(getChildAt(i11))) {
                i10++;
            }
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.A(this);
        float f10 = 0.0f;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int id2 = childAt.getId();
            int i13 = a.h.circle_center;
            if (id2 != i13 && !K(childAt)) {
                dVar.F(childAt.getId(), i13, this.f17657y0, f10);
                f10 += 360.0f / ((float) (childCount - i10));
            }
        }
        dVar.l(this);
    }

    public final void M() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f17656x0);
            handler.post(this.f17656x0);
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(w1.B());
        }
        M();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        L();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        M();
    }

    public void setBackgroundColor(@l int i10) {
        this.f17658z0.n0(ColorStateList.valueOf(i10));
    }
}

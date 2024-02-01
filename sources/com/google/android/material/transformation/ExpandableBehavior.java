package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d.i;
import d.m0;
import d.o0;
import f1.w1;
import java.util.List;
import s9.b;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: b  reason: collision with root package name */
    public static final int f17662b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f17663c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f17664d = 2;

    /* renamed from: a  reason: collision with root package name */
    public int f17665a = 0;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View O;
        public final /* synthetic */ int P;
        public final /* synthetic */ b Q;

        public a(View view, int i10, b bVar) {
            this.O = view;
            this.P = i10;
            this.Q = bVar;
        }

        public boolean onPreDraw() {
            this.O.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f17665a == this.P) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                b bVar = this.Q;
                expandableBehavior.K((View) bVar, this.O, bVar.b(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @o0
    public static <T extends ExpandableBehavior> T J(@m0 View view, @m0 Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.g) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.g) layoutParams).f();
            if (f10 instanceof ExpandableBehavior) {
                return (ExpandableBehavior) cls.cast(f10);
            }
            throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final boolean H(boolean z10) {
        if (!z10) {
            return this.f17665a == 1;
        }
        int i10 = this.f17665a;
        return i10 == 0 || i10 == 2;
    }

    @o0
    public b I(@m0 CoordinatorLayout coordinatorLayout, @m0 View view) {
        List<View> w10 = coordinatorLayout.w(view);
        int size = w10.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = w10.get(i10);
            if (f(coordinatorLayout, view, view2)) {
                return (b) view2;
            }
        }
        return null;
    }

    public abstract boolean K(View view, View view2, boolean z10, boolean z11);

    public abstract boolean f(CoordinatorLayout coordinatorLayout, View view, View view2);

    @i
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = (b) view2;
        if (!H(bVar.b())) {
            return false;
        }
        this.f17665a = bVar.b() ? 1 : 2;
        return K((View) bVar, view, bVar.b(), true);
    }

    @i
    public boolean m(@m0 CoordinatorLayout coordinatorLayout, @m0 View view, int i10) {
        b I;
        if (w1.T0(view) || (I = I(coordinatorLayout, view)) == null || !H(I.b())) {
            return false;
        }
        int i11 = I.b() ? 1 : 2;
        this.f17665a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, I));
        return false;
    }
}

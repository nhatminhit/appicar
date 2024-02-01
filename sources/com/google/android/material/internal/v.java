package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import d.m0;
import d.o0;
import d.q;
import d.x0;
import f1.e3;
import f1.p0;
import f1.w1;
import i9.a;

@x0({x0.a.LIBRARY_GROUP})
public class v {

    public static class a implements Runnable {
        public final /* synthetic */ View O;

        public a(View view) {
            this.O = view;
        }

        public void run() {
            ((InputMethodManager) this.O.getContext().getSystemService("input_method")).showSoftInput(this.O, 1);
        }
    }

    public static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f17263a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f17264b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f17265c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e f17266d;

        public b(boolean z10, boolean z11, boolean z12, e eVar) {
            this.f17263a = z10;
            this.f17264b = z11;
            this.f17265c = z12;
            this.f17266d = eVar;
        }

        @m0
        public e3 a(View view, @m0 e3 e3Var, @m0 f fVar) {
            if (this.f17263a) {
                fVar.f17272d += e3Var.o();
            }
            boolean j10 = v.j(view);
            if (this.f17264b) {
                if (j10) {
                    fVar.f17271c += e3Var.p();
                } else {
                    fVar.f17269a += e3Var.p();
                }
            }
            if (this.f17265c) {
                if (j10) {
                    fVar.f17269a += e3Var.q();
                } else {
                    fVar.f17271c += e3Var.q();
                }
            }
            fVar.a(view);
            e eVar = this.f17266d;
            return eVar != null ? eVar.a(view, e3Var, fVar) : e3Var;
        }
    }

    public static class c implements p0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f17267a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f17268b;

        public c(e eVar, f fVar) {
            this.f17267a = eVar;
            this.f17268b = fVar;
        }

        public e3 a(View view, e3 e3Var) {
            return this.f17267a.a(view, e3Var, new f(this.f17268b));
        }
    }

    public static class d implements View.OnAttachStateChangeListener {
        public void onViewAttachedToWindow(@m0 View view) {
            view.removeOnAttachStateChangeListener(this);
            w1.t1(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface e {
        e3 a(View view, e3 e3Var, f fVar);
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public int f17269a;

        /* renamed from: b  reason: collision with root package name */
        public int f17270b;

        /* renamed from: c  reason: collision with root package name */
        public int f17271c;

        /* renamed from: d  reason: collision with root package name */
        public int f17272d;

        public f(int i10, int i11, int i12, int i13) {
            this.f17269a = i10;
            this.f17270b = i11;
            this.f17271c = i12;
            this.f17272d = i13;
        }

        public f(@m0 f fVar) {
            this.f17269a = fVar.f17269a;
            this.f17270b = fVar.f17270b;
            this.f17271c = fVar.f17271c;
            this.f17272d = fVar.f17272d;
        }

        public void a(View view) {
            w1.b2(view, this.f17269a, this.f17270b, this.f17271c, this.f17272d);
        }
    }

    public static void a(@o0 View view, @m0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void b(@m0 View view, @o0 AttributeSet attributeSet, int i10, int i11) {
        c(view, attributeSet, i10, i11, (e) null);
    }

    public static void c(@m0 View view, @o0 AttributeSet attributeSet, int i10, int i11, @o0 e eVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, a.o.Insets, i10, i11);
        boolean z10 = obtainStyledAttributes.getBoolean(a.o.Insets_paddingBottomSystemWindowInsets, false);
        boolean z11 = obtainStyledAttributes.getBoolean(a.o.Insets_paddingLeftSystemWindowInsets, false);
        boolean z12 = obtainStyledAttributes.getBoolean(a.o.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        d(view, new b(z10, z11, z12, eVar));
    }

    public static void d(@m0 View view, @m0 e eVar) {
        w1.Y1(view, new c(eVar, new f(w1.j0(view), view.getPaddingTop(), w1.i0(view), view.getPaddingBottom())));
        n(view);
    }

    public static float e(@m0 Context context, @q(unit = 0) int i10) {
        return TypedValue.applyDimension(1, (float) i10, context.getResources().getDisplayMetrics());
    }

    @o0
    public static ViewGroup f(@o0 View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @o0
    public static u g(@m0 View view) {
        return h(f(view));
    }

    @o0
    public static u h(@o0 View view) {
        if (view == null) {
            return null;
        }
        return new t(view);
    }

    public static float i(@m0 View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f10 += w1.P((View) parent);
        }
        return f10;
    }

    public static boolean j(View view) {
        return w1.X(view) == 1;
    }

    public static PorterDuff.Mode k(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void l(@o0 View view, @m0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            m(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void m(@m0 ViewTreeObserver viewTreeObserver, @m0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void n(@m0 View view) {
        if (w1.N0(view)) {
            w1.t1(view);
        } else {
            view.addOnAttachStateChangeListener(new d());
        }
    }

    public static void o(@m0 View view) {
        view.requestFocus();
        view.post(new a(view));
    }
}

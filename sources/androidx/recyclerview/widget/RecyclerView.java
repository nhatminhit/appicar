package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.g0;
import androidx.recyclerview.widget.h0;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.y;
import d.g1;
import d.m0;
import d.o0;
import d.r0;
import d.x0;
import f1.h0;
import f1.i0;
import f1.k0;
import f1.n2;
import f1.v0;
import f1.w1;
import g1.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s2.a;

public class RecyclerView extends ViewGroup implements v0, h0, i0 {
    public static final int A1 = -1;
    public static final long B1 = -1;
    public static final int C1 = -1;
    public static final int D1 = 0;
    public static final int E1 = 1;
    public static final int F1 = Integer.MIN_VALUE;
    public static final int G1 = 2000;
    public static final String H1 = "RV Scroll";
    public static final String I1 = "RV OnLayout";
    public static final String J1 = "RV FullInvalidate";
    public static final String K1 = "RV PartialInvalidate";
    public static final String L1 = "RV OnBindView";
    public static final String M1 = "RV Prefetch";
    public static final String N1 = "RV Nested Prefetch";
    public static final String O1 = "RV CreateView";
    public static final Class<?>[] P1;
    public static final int Q1 = -1;
    public static final int R1 = 0;
    public static final int S1 = 1;
    public static final int T1 = 2;
    public static final long U1 = Long.MAX_VALUE;
    public static final Interpolator V1 = new c();

    /* renamed from: m1  reason: collision with root package name */
    public static final String f3122m1 = "RecyclerView";

    /* renamed from: n1  reason: collision with root package name */
    public static final boolean f3123n1 = false;

    /* renamed from: o1  reason: collision with root package name */
    public static final boolean f3124o1 = false;

    /* renamed from: p1  reason: collision with root package name */
    public static final int[] f3125p1 = {16843830};

    /* renamed from: q1  reason: collision with root package name */
    public static final boolean f3126q1 = false;

    /* renamed from: r1  reason: collision with root package name */
    public static final boolean f3127r1 = true;

    /* renamed from: s1  reason: collision with root package name */
    public static final boolean f3128s1 = true;

    /* renamed from: t1  reason: collision with root package name */
    public static final boolean f3129t1 = true;

    /* renamed from: u1  reason: collision with root package name */
    public static final boolean f3130u1 = false;

    /* renamed from: v1  reason: collision with root package name */
    public static final boolean f3131v1 = false;

    /* renamed from: w1  reason: collision with root package name */
    public static final boolean f3132w1 = false;

    /* renamed from: x1  reason: collision with root package name */
    public static final int f3133x1 = 0;

    /* renamed from: y1  reason: collision with root package name */
    public static final int f3134y1 = 1;

    /* renamed from: z1  reason: collision with root package name */
    public static final int f3135z1 = 1;
    public EdgeEffect A0;
    public EdgeEffect B0;
    public EdgeEffect C0;
    public l D0;
    public int E0;
    public int F0;
    public VelocityTracker G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public int L0;
    public r M0;
    public final int N0;
    public final y O;
    public final int O0;
    public final w P;
    public float P0;
    public SavedState Q;
    public float Q0;
    public a R;
    public boolean R0;
    public g S;
    public final d0 S0;
    public final h0 T;
    public l T0;
    public boolean U;
    public l.b U0;
    public final Runnable V;
    public final b0 V0;
    public final Rect W;
    public t W0;
    public List<t> X0;
    public boolean Y0;
    public boolean Z0;

    /* renamed from: a0  reason: collision with root package name */
    public final Rect f3136a0;

    /* renamed from: a1  reason: collision with root package name */
    public l.c f3137a1;

    /* renamed from: b0  reason: collision with root package name */
    public final RectF f3138b0;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f3139b1;

    /* renamed from: c0  reason: collision with root package name */
    public g f3140c0;

    /* renamed from: c1  reason: collision with root package name */
    public y f3141c1;
    @g1

    /* renamed from: d0  reason: collision with root package name */
    public o f3142d0;

    /* renamed from: d1  reason: collision with root package name */
    public j f3143d1;

    /* renamed from: e0  reason: collision with root package name */
    public x f3144e0;

    /* renamed from: e1  reason: collision with root package name */
    public final int[] f3145e1;

    /* renamed from: f0  reason: collision with root package name */
    public final ArrayList<n> f3146f0;

    /* renamed from: f1  reason: collision with root package name */
    public k0 f3147f1;

    /* renamed from: g0  reason: collision with root package name */
    public final ArrayList<s> f3148g0;

    /* renamed from: g1  reason: collision with root package name */
    public final int[] f3149g1;

    /* renamed from: h0  reason: collision with root package name */
    public s f3150h0;

    /* renamed from: h1  reason: collision with root package name */
    public final int[] f3151h1;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f3152i0;

    /* renamed from: i1  reason: collision with root package name */
    public final int[] f3153i1;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f3154j0;
    @g1

    /* renamed from: j1  reason: collision with root package name */
    public final List<e0> f3155j1;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f3156k0;

    /* renamed from: k1  reason: collision with root package name */
    public Runnable f3157k1;
    @g1

    /* renamed from: l0  reason: collision with root package name */
    public boolean f3158l0;

    /* renamed from: l1  reason: collision with root package name */
    public final h0.b f3159l1;

    /* renamed from: m0  reason: collision with root package name */
    public int f3160m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f3161n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f3162o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f3163p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f3164q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f3165r0;

    /* renamed from: s0  reason: collision with root package name */
    public final AccessibilityManager f3166s0;

    /* renamed from: t0  reason: collision with root package name */
    public List<q> f3167t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f3168u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f3169v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f3170w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f3171x0;
    @m0

    /* renamed from: y0  reason: collision with root package name */
    public k f3172y0;

    /* renamed from: z0  reason: collision with root package name */
    public EdgeEffect f3173z0;

    @x0({x0.a.O})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Parcelable Q;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Q = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void b(SavedState savedState) {
            this.Q = savedState.Q;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.Q, 0);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3158l0 && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f3152i0) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f3162o0) {
                    recyclerView2.f3161n0 = true;
                } else {
                    recyclerView2.E();
                }
            }
        }
    }

    public static abstract class a0 {

        /* renamed from: a  reason: collision with root package name */
        public int f3174a = -1;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f3175b;

        /* renamed from: c  reason: collision with root package name */
        public o f3176c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3177d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3178e;

        /* renamed from: f  reason: collision with root package name */
        public View f3179f;

        /* renamed from: g  reason: collision with root package name */
        public final a f3180g = new a(0, 0);

        /* renamed from: h  reason: collision with root package name */
        public boolean f3181h;

        public static class a {

            /* renamed from: h  reason: collision with root package name */
            public static final int f3182h = Integer.MIN_VALUE;

            /* renamed from: a  reason: collision with root package name */
            public int f3183a;

            /* renamed from: b  reason: collision with root package name */
            public int f3184b;

            /* renamed from: c  reason: collision with root package name */
            public int f3185c;

            /* renamed from: d  reason: collision with root package name */
            public int f3186d;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f3187e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f3188f;

            /* renamed from: g  reason: collision with root package name */
            public int f3189g;

            public a(@r0 int i10, @r0 int i11) {
                this(i10, i11, Integer.MIN_VALUE, (Interpolator) null);
            }

            public a(@r0 int i10, @r0 int i11, int i12) {
                this(i10, i11, i12, (Interpolator) null);
            }

            public a(@r0 int i10, @r0 int i11, int i12, @o0 Interpolator interpolator) {
                this.f3186d = -1;
                this.f3188f = false;
                this.f3189g = 0;
                this.f3183a = i10;
                this.f3184b = i11;
                this.f3185c = i12;
                this.f3187e = interpolator;
            }

            public int a() {
                return this.f3185c;
            }

            @r0
            public int b() {
                return this.f3183a;
            }

            @r0
            public int c() {
                return this.f3184b;
            }

            @o0
            public Interpolator d() {
                return this.f3187e;
            }

            public boolean e() {
                return this.f3186d >= 0;
            }

            public void f(int i10) {
                this.f3186d = i10;
            }

            public void g(RecyclerView recyclerView) {
                int i10 = this.f3186d;
                if (i10 >= 0) {
                    this.f3186d = -1;
                    recyclerView.P0(i10);
                    this.f3188f = false;
                } else if (this.f3188f) {
                    m();
                    recyclerView.S0.f(this.f3183a, this.f3184b, this.f3185c, this.f3187e);
                    this.f3189g++;
                    this.f3188f = false;
                } else {
                    this.f3189g = 0;
                }
            }

            public void h(int i10) {
                this.f3188f = true;
                this.f3185c = i10;
            }

            public void i(@r0 int i10) {
                this.f3188f = true;
                this.f3183a = i10;
            }

            public void j(@r0 int i10) {
                this.f3188f = true;
                this.f3184b = i10;
            }

            public void k(@o0 Interpolator interpolator) {
                this.f3188f = true;
                this.f3187e = interpolator;
            }

            public void l(@r0 int i10, @r0 int i11, int i12, @o0 Interpolator interpolator) {
                this.f3183a = i10;
                this.f3184b = i11;
                this.f3185c = i12;
                this.f3187e = interpolator;
                this.f3188f = true;
            }

            public final void m() {
                if (this.f3187e != null && this.f3185c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f3185c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }

        public interface b {
            @o0
            PointF a(int i10);
        }

        @o0
        public PointF a(int i10) {
            o e10 = e();
            if (e10 instanceof b) {
                return ((b) e10).a(i10);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb2.append(b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f3175b.f3142d0.J(i10);
        }

        public int c() {
            return this.f3175b.f3142d0.Q();
        }

        public int d(View view) {
            return this.f3175b.q0(view);
        }

        @o0
        public o e() {
            return this.f3176c;
        }

        public int f() {
            return this.f3174a;
        }

        @Deprecated
        public void g(int i10) {
            this.f3175b.C1(i10);
        }

        public boolean h() {
            return this.f3177d;
        }

        public boolean i() {
            return this.f3178e;
        }

        public void j(@m0 PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void k(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f3175b;
            if (this.f3174a == -1 || recyclerView == null) {
                s();
            }
            if (this.f3177d && this.f3179f == null && this.f3176c != null && (a10 = a(this.f3174a)) != null) {
                float f10 = a10.x;
                if (!(f10 == 0.0f && a10.y == 0.0f)) {
                    recyclerView.B1((int) Math.signum(f10), (int) Math.signum(a10.y), (int[]) null);
                }
            }
            this.f3177d = false;
            View view = this.f3179f;
            if (view != null) {
                if (d(view) == this.f3174a) {
                    p(this.f3179f, recyclerView.V0, this.f3180g);
                    this.f3180g.g(recyclerView);
                    s();
                } else {
                    this.f3179f = null;
                }
            }
            if (this.f3178e) {
                m(i10, i11, recyclerView.V0, this.f3180g);
                boolean e10 = this.f3180g.e();
                this.f3180g.g(recyclerView);
                if (e10 && this.f3178e) {
                    this.f3177d = true;
                    recyclerView.S0.e();
                }
            }
        }

        public void l(View view) {
            if (d(view) == f()) {
                this.f3179f = view;
            }
        }

        public abstract void m(@r0 int i10, @r0 int i11, @m0 b0 b0Var, @m0 a aVar);

        public abstract void n();

        public abstract void o();

        public abstract void p(@m0 View view, @m0 b0 b0Var, @m0 a aVar);

        public void q(int i10) {
            this.f3174a = i10;
        }

        public void r(RecyclerView recyclerView, o oVar) {
            recyclerView.S0.g();
            if (this.f3181h) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("An instance of ");
                sb2.append(getClass().getSimpleName());
                sb2.append(" was started more than once. Each instance of");
                sb2.append(getClass().getSimpleName());
                sb2.append(" is intended to only be used once. You should create a new instance for each use.");
            }
            this.f3175b = recyclerView;
            this.f3176c = oVar;
            int i10 = this.f3174a;
            if (i10 != -1) {
                recyclerView.V0.f3193a = i10;
                this.f3178e = true;
                this.f3177d = true;
                this.f3179f = b(f());
                n();
                this.f3175b.S0.e();
                this.f3181h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final void s() {
            if (this.f3178e) {
                this.f3178e = false;
                o();
                this.f3175b.V0.f3193a = -1;
                this.f3179f = null;
                this.f3174a = -1;
                this.f3177d = false;
                this.f3176c.w1(this);
                this.f3176c = null;
                this.f3175b = null;
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            l lVar = RecyclerView.this.D0;
            if (lVar != null) {
                lVar.x();
            }
            RecyclerView.this.f3139b1 = false;
        }
    }

    public static class b0 {

        /* renamed from: r  reason: collision with root package name */
        public static final int f3190r = 1;

        /* renamed from: s  reason: collision with root package name */
        public static final int f3191s = 2;

        /* renamed from: t  reason: collision with root package name */
        public static final int f3192t = 4;

        /* renamed from: a  reason: collision with root package name */
        public int f3193a = -1;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<Object> f3194b;

        /* renamed from: c  reason: collision with root package name */
        public int f3195c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f3196d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f3197e = 1;

        /* renamed from: f  reason: collision with root package name */
        public int f3198f = 0;

        /* renamed from: g  reason: collision with root package name */
        public boolean f3199g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3200h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f3201i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f3202j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f3203k = false;

        /* renamed from: l  reason: collision with root package name */
        public boolean f3204l = false;

        /* renamed from: m  reason: collision with root package name */
        public int f3205m;

        /* renamed from: n  reason: collision with root package name */
        public long f3206n;

        /* renamed from: o  reason: collision with root package name */
        public int f3207o;

        /* renamed from: p  reason: collision with root package name */
        public int f3208p;

        /* renamed from: q  reason: collision with root package name */
        public int f3209q;

        public void a(int i10) {
            if ((this.f3197e & i10) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f3197e));
            }
        }

        public boolean b() {
            return this.f3199g;
        }

        public <T> T c(int i10) {
            SparseArray<Object> sparseArray = this.f3194b;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        public int d() {
            return this.f3200h ? this.f3195c - this.f3196d : this.f3198f;
        }

        public int e() {
            return this.f3208p;
        }

        public int f() {
            return this.f3209q;
        }

        public int g() {
            return this.f3193a;
        }

        public boolean h() {
            return this.f3193a != -1;
        }

        public boolean i() {
            return this.f3202j;
        }

        public boolean j() {
            return this.f3200h;
        }

        public void k(g gVar) {
            this.f3197e = 1;
            this.f3198f = gVar.e();
            this.f3200h = false;
            this.f3201i = false;
            this.f3202j = false;
        }

        public void l(int i10, Object obj) {
            if (this.f3194b == null) {
                this.f3194b = new SparseArray<>();
            }
            this.f3194b.put(i10, obj);
        }

        public void m(int i10) {
            SparseArray<Object> sparseArray = this.f3194b;
            if (sparseArray != null) {
                sparseArray.remove(i10);
            }
        }

        public boolean n() {
            return this.f3204l;
        }

        public boolean o() {
            return this.f3203k;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3193a + ", mData=" + this.f3194b + ", mItemCount=" + this.f3198f + ", mIsMeasuring=" + this.f3202j + ", mPreviousLayoutItemCount=" + this.f3195c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3196d + ", mStructureChanged=" + this.f3199g + ", mInPreLayout=" + this.f3200h + ", mRunSimpleAnimations=" + this.f3203k + ", mRunPredictiveAnimations=" + this.f3204l + '}';
        }
    }

    public static class c implements Interpolator {
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public static abstract class c0 {
        @o0
        public abstract View a(@m0 w wVar, int i10, int i11);
    }

    public class d implements h0.b {
        public d() {
        }

        public void a(e0 e0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3142d0.F1(e0Var.f3220a, recyclerView.P);
        }

        public void b(e0 e0Var, l.d dVar, l.d dVar2) {
            RecyclerView.this.s(e0Var, dVar, dVar2);
        }

        public void c(e0 e0Var, @m0 l.d dVar, @o0 l.d dVar2) {
            RecyclerView.this.P.K(e0Var);
            RecyclerView.this.u(e0Var, dVar, dVar2);
        }

        public void d(e0 e0Var, @m0 l.d dVar, @m0 l.d dVar2) {
            e0Var.H(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z10 = recyclerView.f3168u0;
            l lVar = recyclerView.D0;
            if (z10) {
                if (!lVar.b(e0Var, e0Var, dVar, dVar2)) {
                    return;
                }
            } else if (!lVar.d(e0Var, dVar, dVar2)) {
                return;
            }
            RecyclerView.this.f1();
        }
    }

    public class d0 implements Runnable {
        public int O;
        public int P;
        public OverScroller Q;
        public Interpolator R;
        public boolean S = false;
        public boolean T = false;

        public d0() {
            Interpolator interpolator = RecyclerView.V1;
            this.R = interpolator;
            this.Q = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i10, int i11, int i12, int i13) {
            int i14;
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            boolean z10 = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i12 * i12) + (i13 * i13)));
            int sqrt2 = (int) Math.sqrt((double) ((i10 * i10) + (i11 * i11)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i15 = width / 2;
            float f10 = (float) width;
            float f11 = (float) i15;
            float b10 = f11 + (b(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f10)) * f11);
            if (sqrt > 0) {
                i14 = Math.round(Math.abs(b10 / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    abs = abs2;
                }
                i14 = (int) (((((float) abs) / f10) + 1.0f) * 300.0f);
            }
            return Math.min(i14, 2000);
        }

        public final float b(float f10) {
            return (float) Math.sin((double) ((f10 - 0.5f) * 0.47123894f));
        }

        public void c(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.P = 0;
            this.O = 0;
            Interpolator interpolator = this.R;
            Interpolator interpolator2 = RecyclerView.V1;
            if (interpolator != interpolator2) {
                this.R = interpolator2;
                this.Q = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.Q.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        public final void d() {
            RecyclerView.this.removeCallbacks(this);
            w1.n1(RecyclerView.this, this);
        }

        public void e() {
            if (this.S) {
                this.T = true;
            } else {
                d();
            }
        }

        public void f(int i10, int i11, int i12, @o0 Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11, 0, 0);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.V1;
            }
            if (this.R != interpolator) {
                this.R = interpolator;
                this.Q = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.P = 0;
            this.O = 0;
            RecyclerView.this.setScrollState(2);
            this.Q.startScroll(0, 0, i10, i11, i13);
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.Q.abortAnimation();
        }

        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3142d0 == null) {
                g();
                return;
            }
            this.T = false;
            this.S = true;
            recyclerView.E();
            OverScroller overScroller = this.Q;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.O;
                int i13 = currY - this.P;
                this.O = currX;
                this.P = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f3153i1;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.b(i12, i13, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f3153i1;
                    i12 -= iArr2[0];
                    i13 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.D(i12, i13);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f3140c0 != null) {
                    int[] iArr3 = recyclerView3.f3153i1;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.B1(i12, i13, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f3153i1;
                    i10 = iArr4[0];
                    i11 = iArr4[1];
                    i12 -= i10;
                    i13 -= i11;
                    a0 a0Var = recyclerView4.f3142d0.f3268g;
                    if (a0Var != null && !a0Var.h() && a0Var.i()) {
                        int d10 = RecyclerView.this.V0.d();
                        if (d10 == 0) {
                            a0Var.s();
                        } else {
                            if (a0Var.f() >= d10) {
                                a0Var.q(d10 - 1);
                            }
                            a0Var.k(i10, i11);
                        }
                    }
                } else {
                    i11 = 0;
                    i10 = 0;
                }
                if (!RecyclerView.this.f3146f0.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f3153i1;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.c(i10, i11, i12, i13, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f3153i1;
                int i14 = i12 - iArr6[0];
                int i15 = i13 - iArr6[1];
                if (!(i10 == 0 && i11 == 0)) {
                    recyclerView6.Q(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                a0 a0Var2 = RecyclerView.this.f3142d0.f3268g;
                if ((a0Var2 != null && a0Var2.h()) || !z10) {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    l lVar = recyclerView7.T0;
                    if (lVar != null) {
                        lVar.f(recyclerView7, i10, i11);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.h(i16, currVelocity);
                    }
                    if (RecyclerView.f3129t1) {
                        RecyclerView.this.U0.b();
                    }
                }
            }
            a0 a0Var3 = RecyclerView.this.f3142d0.f3268g;
            if (a0Var3 != null && a0Var3.h()) {
                a0Var3.k(0, 0);
            }
            this.S = false;
            if (this.T) {
                d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.g(1);
        }
    }

    public class e implements g.b {
        public e() {
        }

        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        public void b(View view) {
            e0 t02 = RecyclerView.t0(view);
            if (t02 != null) {
                t02.C(RecyclerView.this);
            }
        }

        public int c() {
            return RecyclerView.this.getChildCount();
        }

        public void d() {
            int c10 = c();
            for (int i10 = 0; i10 < c10; i10++) {
                View a10 = a(i10);
                RecyclerView.this.J(a10);
                a10.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        public e0 f(View view) {
            return RecyclerView.t0(view);
        }

        public void g(int i10) {
            e0 t02;
            View a10 = a(i10);
            if (!(a10 == null || (t02 = RecyclerView.t0(a10)) == null)) {
                if (!t02.y() || t02.K()) {
                    t02.b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + t02 + RecyclerView.this.X());
                }
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        public void h(View view) {
            e0 t02 = RecyclerView.t0(view);
            if (t02 != null) {
                t02.D(RecyclerView.this);
            }
        }

        public void i(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.I(view);
        }

        public void j(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.J(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        public void k(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            e0 t02 = RecyclerView.t0(view);
            if (t02 != null) {
                if (t02.y() || t02.K()) {
                    t02.f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + t02 + RecyclerView.this.X());
                }
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    public static abstract class e0 {
        public static final int A = 512;
        public static final int B = 1024;
        public static final int C = 2048;
        public static final int D = 4096;
        public static final int E = -1;
        public static final int F = 8192;
        public static final List<Object> G = Collections.emptyList();

        /* renamed from: s  reason: collision with root package name */
        public static final int f3212s = 1;

        /* renamed from: t  reason: collision with root package name */
        public static final int f3213t = 2;

        /* renamed from: u  reason: collision with root package name */
        public static final int f3214u = 4;

        /* renamed from: v  reason: collision with root package name */
        public static final int f3215v = 8;

        /* renamed from: w  reason: collision with root package name */
        public static final int f3216w = 16;

        /* renamed from: x  reason: collision with root package name */
        public static final int f3217x = 32;

        /* renamed from: y  reason: collision with root package name */
        public static final int f3218y = 128;

        /* renamed from: z  reason: collision with root package name */
        public static final int f3219z = 256;
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final View f3220a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<RecyclerView> f3221b;

        /* renamed from: c  reason: collision with root package name */
        public int f3222c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f3223d = -1;

        /* renamed from: e  reason: collision with root package name */
        public long f3224e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f3225f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f3226g = -1;

        /* renamed from: h  reason: collision with root package name */
        public e0 f3227h = null;

        /* renamed from: i  reason: collision with root package name */
        public e0 f3228i = null;

        /* renamed from: j  reason: collision with root package name */
        public int f3229j;

        /* renamed from: k  reason: collision with root package name */
        public List<Object> f3230k = null;

        /* renamed from: l  reason: collision with root package name */
        public List<Object> f3231l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f3232m = 0;

        /* renamed from: n  reason: collision with root package name */
        public w f3233n = null;

        /* renamed from: o  reason: collision with root package name */
        public boolean f3234o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f3235p = 0;
        @g1

        /* renamed from: q  reason: collision with root package name */
        public int f3236q = -1;

        /* renamed from: r  reason: collision with root package name */
        public RecyclerView f3237r;

        public e0(@m0 View view) {
            if (view != null) {
                this.f3220a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public boolean A() {
            return (this.f3229j & 2) != 0;
        }

        public void B(int i10, boolean z10) {
            if (this.f3223d == -1) {
                this.f3223d = this.f3222c;
            }
            if (this.f3226g == -1) {
                this.f3226g = this.f3222c;
            }
            if (z10) {
                this.f3226g += i10;
            }
            this.f3222c += i10;
            if (this.f3220a.getLayoutParams() != null) {
                ((p) this.f3220a.getLayoutParams()).f3288c = true;
            }
        }

        public void C(RecyclerView recyclerView) {
            int i10 = this.f3236q;
            if (i10 == -1) {
                i10 = w1.T(this.f3220a);
            }
            this.f3235p = i10;
            recyclerView.E1(this, 4);
        }

        public void D(RecyclerView recyclerView) {
            recyclerView.E1(this, this.f3235p);
            this.f3235p = 0;
        }

        public void E() {
            this.f3229j = 0;
            this.f3222c = -1;
            this.f3223d = -1;
            this.f3224e = -1;
            this.f3226g = -1;
            this.f3232m = 0;
            this.f3227h = null;
            this.f3228i = null;
            d();
            this.f3235p = 0;
            this.f3236q = -1;
            RecyclerView.z(this);
        }

        public void F() {
            if (this.f3223d == -1) {
                this.f3223d = this.f3222c;
            }
        }

        public void G(int i10, int i11) {
            this.f3229j = (i10 & i11) | (this.f3229j & (~i11));
        }

        public final void H(boolean z10) {
            int i10;
            int i11 = this.f3232m;
            int i12 = z10 ? i11 - 1 : i11 + 1;
            this.f3232m = i12;
            if (i12 < 0) {
                this.f3232m = 0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb2.append(this);
                return;
            }
            if (!z10 && i12 == 1) {
                i10 = this.f3229j | 16;
            } else if (z10 && i12 == 0) {
                i10 = this.f3229j & -17;
            } else {
                return;
            }
            this.f3229j = i10;
        }

        public void I(w wVar, boolean z10) {
            this.f3233n = wVar;
            this.f3234o = z10;
        }

        public boolean J() {
            return (this.f3229j & 16) != 0;
        }

        public boolean K() {
            return (this.f3229j & 128) != 0;
        }

        public void L() {
            this.f3229j &= -129;
        }

        public void M() {
            this.f3233n.K(this);
        }

        public boolean N() {
            return (this.f3229j & 32) != 0;
        }

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f3229j) == 0) {
                g();
                this.f3230k.add(obj);
            }
        }

        public void b(int i10) {
            this.f3229j = i10 | this.f3229j;
        }

        public void c() {
            this.f3223d = -1;
            this.f3226g = -1;
        }

        public void d() {
            List<Object> list = this.f3230k;
            if (list != null) {
                list.clear();
            }
            this.f3229j &= -1025;
        }

        public void e() {
            this.f3229j &= -33;
        }

        public void f() {
            this.f3229j &= -257;
        }

        public final void g() {
            if (this.f3230k == null) {
                ArrayList arrayList = new ArrayList();
                this.f3230k = arrayList;
                this.f3231l = Collections.unmodifiableList(arrayList);
            }
        }

        public boolean h() {
            return (this.f3229j & 16) == 0 && w1.L0(this.f3220a);
        }

        public void i(int i10, int i11, boolean z10) {
            b(8);
            B(i11, z10);
            this.f3222c = i10;
        }

        public final int j() {
            RecyclerView recyclerView = this.f3237r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m0(this);
        }

        public final long k() {
            return this.f3224e;
        }

        public final int l() {
            return this.f3225f;
        }

        public final int m() {
            int i10 = this.f3226g;
            return i10 == -1 ? this.f3222c : i10;
        }

        public final int n() {
            return this.f3223d;
        }

        @Deprecated
        public final int o() {
            int i10 = this.f3226g;
            return i10 == -1 ? this.f3222c : i10;
        }

        public List<Object> p() {
            if ((this.f3229j & 1024) != 0) {
                return G;
            }
            List<Object> list = this.f3230k;
            return (list == null || list.size() == 0) ? G : this.f3231l;
        }

        public boolean q(int i10) {
            return (i10 & this.f3229j) != 0;
        }

        public boolean r() {
            return (this.f3229j & 512) != 0 || u();
        }

        public boolean s() {
            return (this.f3220a.getParent() == null || this.f3220a.getParent() == this.f3237r) ? false : true;
        }

        public boolean t() {
            return (this.f3229j & 1) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb2 = new StringBuilder(simpleName + p7.a.f11638i + Integer.toHexString(hashCode()) + " position=" + this.f3222c + " id=" + this.f3224e + ", oldPos=" + this.f3223d + ", pLpos:" + this.f3226g);
            if (x()) {
                sb2.append(" scrap ");
                sb2.append(this.f3234o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (u()) {
                sb2.append(" invalid");
            }
            if (!t()) {
                sb2.append(" unbound");
            }
            if (A()) {
                sb2.append(" update");
            }
            if (w()) {
                sb2.append(" removed");
            }
            if (K()) {
                sb2.append(" ignored");
            }
            if (y()) {
                sb2.append(" tmpDetached");
            }
            if (!v()) {
                sb2.append(" not recyclable(" + this.f3232m + ")");
            }
            if (r()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f3220a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append(p7.a.f11639j);
            return sb2.toString();
        }

        public boolean u() {
            return (this.f3229j & 4) != 0;
        }

        public final boolean v() {
            return (this.f3229j & 16) == 0 && !w1.L0(this.f3220a);
        }

        public boolean w() {
            return (this.f3229j & 8) != 0;
        }

        public boolean x() {
            return this.f3233n != null;
        }

        public boolean y() {
            return (this.f3229j & 256) != 0;
        }

        public boolean z() {
            return (this.f3229j & 2) != 0;
        }
    }

    public class f implements a.C0046a {
        public f() {
        }

        public void a(int i10, int i11) {
            RecyclerView.this.V0(i10, i11);
            RecyclerView.this.Y0 = true;
        }

        public void b(a.b bVar) {
            i(bVar);
        }

        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.Q1(i10, i11, obj);
            RecyclerView.this.Z0 = true;
        }

        public void d(a.b bVar) {
            i(bVar);
        }

        public e0 e(int i10) {
            e0 k02 = RecyclerView.this.k0(i10, true);
            if (k02 != null && !RecyclerView.this.S.n(k02.f3220a)) {
                return k02;
            }
            return null;
        }

        public void f(int i10, int i11) {
            RecyclerView.this.W0(i10, i11, false);
            RecyclerView.this.Y0 = true;
        }

        public void g(int i10, int i11) {
            RecyclerView.this.U0(i10, i11);
            RecyclerView.this.Y0 = true;
        }

        public void h(int i10, int i11) {
            RecyclerView.this.W0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.Y0 = true;
            recyclerView.V0.f3196d += i11;
        }

        public void i(a.b bVar) {
            int i10 = bVar.f3353a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f3142d0.i1(recyclerView, bVar.f3354b, bVar.f3356d);
            } else if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f3142d0.l1(recyclerView2, bVar.f3354b, bVar.f3356d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f3142d0.n1(recyclerView3, bVar.f3354b, bVar.f3356d, bVar.f3355c);
            } else if (i10 == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f3142d0.k1(recyclerView4, bVar.f3354b, bVar.f3356d, 1);
            }
        }
    }

    public static abstract class g<VH extends e0> {

        /* renamed from: a  reason: collision with root package name */
        public final h f3239a = new h();

        /* renamed from: b  reason: collision with root package name */
        public boolean f3240b = false;

        public void A(@m0 VH vh2) {
        }

        public void B(@m0 VH vh2) {
        }

        public void C(@m0 i iVar) {
            this.f3239a.registerObserver(iVar);
        }

        public void D(boolean z10) {
            if (!h()) {
                this.f3240b = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void E(@m0 i iVar) {
            this.f3239a.unregisterObserver(iVar);
        }

        public final void c(@m0 VH vh2, int i10) {
            vh2.f3222c = i10;
            if (i()) {
                vh2.f3224e = f(i10);
            }
            vh2.G(1, 519);
            x0.b0.b(RecyclerView.L1);
            v(vh2, i10, vh2.p());
            vh2.d();
            ViewGroup.LayoutParams layoutParams = vh2.f3220a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f3288c = true;
            }
            x0.b0.d();
        }

        @m0
        public final VH d(@m0 ViewGroup viewGroup, int i10) {
            try {
                x0.b0.b(RecyclerView.O1);
                VH w10 = w(viewGroup, i10);
                if (w10.f3220a.getParent() == null) {
                    w10.f3225f = i10;
                    return w10;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                x0.b0.d();
            }
        }

        public abstract int e();

        public long f(int i10) {
            return -1;
        }

        public int g(int i10) {
            return 0;
        }

        public final boolean h() {
            return this.f3239a.a();
        }

        public final boolean i() {
            return this.f3240b;
        }

        public final void j() {
            this.f3239a.b();
        }

        public final void k(int i10) {
            this.f3239a.d(i10, 1);
        }

        public final void l(int i10, @o0 Object obj) {
            this.f3239a.e(i10, 1, obj);
        }

        public final void m(int i10) {
            this.f3239a.f(i10, 1);
        }

        public final void n(int i10, int i11) {
            this.f3239a.c(i10, i11);
        }

        public final void o(int i10, int i11) {
            this.f3239a.d(i10, i11);
        }

        public final void p(int i10, int i11, @o0 Object obj) {
            this.f3239a.e(i10, i11, obj);
        }

        public final void q(int i10, int i11) {
            this.f3239a.f(i10, i11);
        }

        public final void r(int i10, int i11) {
            this.f3239a.g(i10, i11);
        }

        public final void s(int i10) {
            this.f3239a.g(i10, 1);
        }

        public void t(@m0 RecyclerView recyclerView) {
        }

        public abstract void u(@m0 VH vh2, int i10);

        public void v(@m0 VH vh2, int i10, @m0 List<Object> list) {
            u(vh2, i10);
        }

        @m0
        public abstract VH w(@m0 ViewGroup viewGroup, int i10);

        public void x(@m0 RecyclerView recyclerView) {
        }

        public boolean y(@m0 VH vh2) {
            return false;
        }

        public void z(@m0 VH vh2) {
        }
    }

    public static class h extends Observable<i> {
        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).e(i10, i11, 1);
            }
        }

        public void d(int i10, int i11) {
            e(i10, i11, (Object) null);
        }

        public void e(int i10, int i11, @o0 Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).c(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).d(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).f(i10, i11);
            }
        }
    }

    public static abstract class i {
        public void a() {
        }

        public void b(int i10, int i11) {
        }

        public void c(int i10, int i11, @o0 Object obj) {
            b(i10, i11);
        }

        public void d(int i10, int i11) {
        }

        public void e(int i10, int i11, int i12) {
        }

        public void f(int i10, int i11) {
        }
    }

    public interface j {
        int a(int i10, int i11);
    }

    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public static final int f3241a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final int f3242b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static final int f3243c = 2;

        /* renamed from: d  reason: collision with root package name */
        public static final int f3244d = 3;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        @m0
        public EdgeEffect a(@m0 RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {

        /* renamed from: g  reason: collision with root package name */
        public static final int f3245g = 2;

        /* renamed from: h  reason: collision with root package name */
        public static final int f3246h = 8;

        /* renamed from: i  reason: collision with root package name */
        public static final int f3247i = 4;

        /* renamed from: j  reason: collision with root package name */
        public static final int f3248j = 2048;

        /* renamed from: k  reason: collision with root package name */
        public static final int f3249k = 4096;

        /* renamed from: a  reason: collision with root package name */
        public c f3250a = null;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f3251b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public long f3252c = 120;

        /* renamed from: d  reason: collision with root package name */
        public long f3253d = 120;

        /* renamed from: e  reason: collision with root package name */
        public long f3254e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f3255f = 250;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public interface b {
            void a();
        }

        public interface c {
            void a(@m0 e0 e0Var);
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f3256a;

            /* renamed from: b  reason: collision with root package name */
            public int f3257b;

            /* renamed from: c  reason: collision with root package name */
            public int f3258c;

            /* renamed from: d  reason: collision with root package name */
            public int f3259d;

            /* renamed from: e  reason: collision with root package name */
            public int f3260e;

            @m0
            public d a(@m0 e0 e0Var) {
                return b(e0Var, 0);
            }

            @m0
            public d b(@m0 e0 e0Var, int i10) {
                View view = e0Var.f3220a;
                this.f3256a = view.getLeft();
                this.f3257b = view.getTop();
                this.f3258c = view.getRight();
                this.f3259d = view.getBottom();
                return this;
            }
        }

        public static int e(e0 e0Var) {
            int i10 = e0Var.f3229j & 14;
            if (e0Var.u()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i10;
            }
            int n10 = e0Var.n();
            int j10 = e0Var.j();
            return (n10 == -1 || j10 == -1 || n10 == j10) ? i10 : i10 | 2048;
        }

        public void A(c cVar) {
            this.f3250a = cVar;
        }

        public void B(long j10) {
            this.f3254e = j10;
        }

        public void C(long j10) {
            this.f3253d = j10;
        }

        public abstract boolean a(@m0 e0 e0Var, @o0 d dVar, @m0 d dVar2);

        public abstract boolean b(@m0 e0 e0Var, @m0 e0 e0Var2, @m0 d dVar, @m0 d dVar2);

        public abstract boolean c(@m0 e0 e0Var, @m0 d dVar, @o0 d dVar2);

        public abstract boolean d(@m0 e0 e0Var, @m0 d dVar, @m0 d dVar2);

        public boolean f(@m0 e0 e0Var) {
            return true;
        }

        public boolean g(@m0 e0 e0Var, @m0 List<Object> list) {
            return f(e0Var);
        }

        public final void h(@m0 e0 e0Var) {
            t(e0Var);
            c cVar = this.f3250a;
            if (cVar != null) {
                cVar.a(e0Var);
            }
        }

        public final void i(@m0 e0 e0Var) {
            u(e0Var);
        }

        public final void j() {
            int size = this.f3251b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f3251b.get(i10).a();
            }
            this.f3251b.clear();
        }

        public abstract void k(@m0 e0 e0Var);

        public abstract void l();

        public long m() {
            return this.f3252c;
        }

        public long n() {
            return this.f3255f;
        }

        public long o() {
            return this.f3254e;
        }

        public long p() {
            return this.f3253d;
        }

        public abstract boolean q();

        public final boolean r(@o0 b bVar) {
            boolean q10 = q();
            if (bVar != null) {
                if (!q10) {
                    bVar.a();
                } else {
                    this.f3251b.add(bVar);
                }
            }
            return q10;
        }

        @m0
        public d s() {
            return new d();
        }

        public void t(@m0 e0 e0Var) {
        }

        public void u(@m0 e0 e0Var) {
        }

        @m0
        public d v(@m0 b0 b0Var, @m0 e0 e0Var) {
            return s().a(e0Var);
        }

        @m0
        public d w(@m0 b0 b0Var, @m0 e0 e0Var, int i10, @m0 List<Object> list) {
            return s().a(e0Var);
        }

        public abstract void x();

        public void y(long j10) {
            this.f3252c = j10;
        }

        public void z(long j10) {
            this.f3255f = j10;
        }
    }

    public class m implements l.c {
        public m() {
        }

        public void a(e0 e0Var) {
            e0Var.H(true);
            if (e0Var.f3227h != null && e0Var.f3228i == null) {
                e0Var.f3227h = null;
            }
            e0Var.f3228i = null;
            if (!e0Var.J() && !RecyclerView.this.o1(e0Var.f3220a) && e0Var.y()) {
                RecyclerView.this.removeDetachedView(e0Var.f3220a, false);
            }
        }
    }

    public static abstract class n {
        @Deprecated
        public void f(@m0 Rect rect, int i10, @m0 RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void g(@m0 Rect rect, @m0 View view, @m0 RecyclerView recyclerView, @m0 b0 b0Var) {
            f(rect, ((p) view.getLayoutParams()).b(), recyclerView);
        }

        @Deprecated
        public void h(@m0 Canvas canvas, @m0 RecyclerView recyclerView) {
        }

        public void i(@m0 Canvas canvas, @m0 RecyclerView recyclerView, @m0 b0 b0Var) {
            h(canvas, recyclerView);
        }

        @Deprecated
        public void j(@m0 Canvas canvas, @m0 RecyclerView recyclerView) {
        }

        public void k(@m0 Canvas canvas, @m0 RecyclerView recyclerView, @m0 b0 b0Var) {
            j(canvas, recyclerView);
        }
    }

    public static abstract class o {

        /* renamed from: a  reason: collision with root package name */
        public g f3262a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f3263b;

        /* renamed from: c  reason: collision with root package name */
        public final g0.b f3264c;

        /* renamed from: d  reason: collision with root package name */
        public final g0.b f3265d;

        /* renamed from: e  reason: collision with root package name */
        public g0 f3266e;

        /* renamed from: f  reason: collision with root package name */
        public g0 f3267f;
        @o0

        /* renamed from: g  reason: collision with root package name */
        public a0 f3268g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3269h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f3270i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f3271j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f3272k = true;

        /* renamed from: l  reason: collision with root package name */
        public boolean f3273l = true;

        /* renamed from: m  reason: collision with root package name */
        public int f3274m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f3275n;

        /* renamed from: o  reason: collision with root package name */
        public int f3276o;

        /* renamed from: p  reason: collision with root package name */
        public int f3277p;

        /* renamed from: q  reason: collision with root package name */
        public int f3278q;

        /* renamed from: r  reason: collision with root package name */
        public int f3279r;

        public class a implements g0.b {
            public a() {
            }

            public View a(int i10) {
                return o.this.P(i10);
            }

            public int b(View view) {
                return o.this.Y(view) - ((p) view.getLayoutParams()).leftMargin;
            }

            public int c() {
                return o.this.o0();
            }

            public int d() {
                return o.this.z0() - o.this.p0();
            }

            public int e(View view) {
                return o.this.b0(view) + ((p) view.getLayoutParams()).rightMargin;
            }
        }

        public class b implements g0.b {
            public b() {
            }

            public View a(int i10) {
                return o.this.P(i10);
            }

            public int b(View view) {
                return o.this.c0(view) - ((p) view.getLayoutParams()).topMargin;
            }

            public int c() {
                return o.this.r0();
            }

            public int d() {
                return o.this.e0() - o.this.m0();
            }

            public int e(View view) {
                return o.this.W(view) + ((p) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f3282a;

            /* renamed from: b  reason: collision with root package name */
            public int f3283b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f3284c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f3285d;
        }

        public o() {
            a aVar = new a();
            this.f3264c = aVar;
            b bVar = new b();
            this.f3265d = bVar;
            this.f3266e = new g0(aVar);
            this.f3267f = new g0(bVar);
        }

        public static boolean L0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int R(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0020
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001e
            L_0x001c:
                r5 = r3
                goto L_0x0031
            L_0x001e:
                if (r7 != r1) goto L_0x0022
            L_0x0020:
                r7 = r4
                goto L_0x0031
            L_0x0022:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r7 = r4
                r5 = r6
                goto L_0x0031
            L_0x002c:
                r7 = r4
                r5 = r2
                goto L_0x0031
            L_0x002f:
                r5 = r6
                r7 = r5
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.R(int, int, int, int, boolean):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            if (r3 >= 0) goto L_0x0011;
         */
        @java.lang.Deprecated
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int S(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x000f
                if (r3 < 0) goto L_0x000d
                goto L_0x0011
            L_0x000d:
                r3 = r2
                goto L_0x001e
            L_0x000f:
                if (r3 < 0) goto L_0x0013
            L_0x0011:
                r2 = r0
                goto L_0x001e
            L_0x0013:
                r4 = -1
                if (r3 != r4) goto L_0x0018
                r3 = r1
                goto L_0x0011
            L_0x0018:
                r4 = -2
                if (r3 != r4) goto L_0x000d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L_0x001e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.S(int, int, int, boolean):int");
        }

        public static int q(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        public static d t0(@m0 Context context, @o0 AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.RecyclerView, i10, i11);
            dVar.f3282a = obtainStyledAttributes.getInt(a.j.RecyclerView_android_orientation, 1);
            dVar.f3283b = obtainStyledAttributes.getInt(a.j.RecyclerView_spanCount, 1);
            dVar.f3284c = obtainStyledAttributes.getBoolean(a.j.RecyclerView_reverseLayout, false);
            dVar.f3285d = obtainStyledAttributes.getBoolean(a.j.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public void A(@m0 View view, @m0 w wVar) {
            P1(wVar, this.f3262a.m(view), view);
        }

        public int A0() {
            return this.f3276o;
        }

        public boolean A1(@m0 w wVar, @m0 b0 b0Var, @m0 View view, int i10, @o0 Bundle bundle) {
            return false;
        }

        public void B(int i10, @m0 w wVar) {
            P1(wVar, i10, P(i10));
        }

        public boolean B0() {
            int Q = Q();
            for (int i10 = 0; i10 < Q; i10++) {
                ViewGroup.LayoutParams layoutParams = P(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void B1(Runnable runnable) {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView != null) {
                w1.n1(recyclerView, runnable);
            }
        }

        public void C(@m0 View view) {
            int m10 = this.f3262a.m(view);
            if (m10 >= 0) {
                E(m10, view);
            }
        }

        public boolean C0() {
            RecyclerView recyclerView = this.f3263b;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void C1() {
            for (int Q = Q() - 1; Q >= 0; Q--) {
                this.f3262a.q(Q);
            }
        }

        public void D(int i10) {
            E(i10, P(i10));
        }

        public void D0(@m0 View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f3263b;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f3263b.X());
            }
            e0 t02 = RecyclerView.t0(view);
            t02.b(128);
            this.f3263b.T.q(t02);
        }

        public void D1(@m0 w wVar) {
            for (int Q = Q() - 1; Q >= 0; Q--) {
                if (!RecyclerView.t0(P(Q)).K()) {
                    G1(Q, wVar);
                }
            }
        }

        public final void E(int i10, @m0 View view) {
            this.f3262a.d(i10);
        }

        public boolean E0() {
            return this.f3270i;
        }

        public void E1(w wVar) {
            int k10 = wVar.k();
            for (int i10 = k10 - 1; i10 >= 0; i10--) {
                View o10 = wVar.o(i10);
                e0 t02 = RecyclerView.t0(o10);
                if (!t02.K()) {
                    t02.H(false);
                    if (t02.y()) {
                        this.f3263b.removeDetachedView(o10, false);
                    }
                    l lVar = this.f3263b.D0;
                    if (lVar != null) {
                        lVar.k(t02);
                    }
                    t02.H(true);
                    wVar.z(o10);
                }
            }
            wVar.f();
            if (k10 > 0) {
                this.f3263b.invalidate();
            }
        }

        public void F(RecyclerView recyclerView) {
            this.f3270i = true;
            X0(recyclerView);
        }

        public boolean F0() {
            return this.f3271j;
        }

        public void F1(@m0 View view, @m0 w wVar) {
            J1(view);
            wVar.C(view);
        }

        public void G(RecyclerView recyclerView, w wVar) {
            this.f3270i = false;
            Z0(recyclerView, wVar);
        }

        public boolean G0() {
            RecyclerView recyclerView = this.f3263b;
            return recyclerView != null && recyclerView.isFocused();
        }

        public void G1(int i10, @m0 w wVar) {
            View P = P(i10);
            K1(i10);
            wVar.C(P);
        }

        public void H(View view) {
            l lVar = this.f3263b.D0;
            if (lVar != null) {
                lVar.k(RecyclerView.t0(view));
            }
        }

        public final boolean H0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int o02 = o0();
            int r02 = r0();
            int z02 = z0() - p0();
            int e02 = e0() - m0();
            Rect rect = this.f3263b.W;
            X(focusedChild, rect);
            return rect.left - i10 < z02 && rect.right - i10 > o02 && rect.top - i11 < e02 && rect.bottom - i11 > r02;
        }

        public boolean H1(Runnable runnable) {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @o0
        public View I(@m0 View view) {
            View a02;
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView == null || (a02 = recyclerView.a0(view)) == null || this.f3262a.n(a02)) {
                return null;
            }
            return a02;
        }

        public final boolean I0() {
            return this.f3273l;
        }

        public void I1(@m0 View view) {
            this.f3263b.removeDetachedView(view, false);
        }

        @o0
        public View J(int i10) {
            int Q = Q();
            for (int i11 = 0; i11 < Q; i11++) {
                View P = P(i11);
                e0 t02 = RecyclerView.t0(P);
                if (t02 != null && t02.m() == i10 && !t02.K() && (this.f3263b.V0.j() || !t02.w())) {
                    return P;
                }
            }
            return null;
        }

        public boolean J0(@m0 w wVar, @m0 b0 b0Var) {
            return false;
        }

        public void J1(View view) {
            this.f3262a.p(view);
        }

        public abstract p K();

        public boolean K0() {
            return this.f3272k;
        }

        public void K1(int i10) {
            if (P(i10) != null) {
                this.f3262a.q(i10);
            }
        }

        public p L(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public boolean L1(@m0 RecyclerView recyclerView, @m0 View view, @m0 Rect rect, boolean z10) {
            return M1(recyclerView, view, rect, z10, false);
        }

        public p M(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public boolean M0() {
            a0 a0Var = this.f3268g;
            return a0Var != null && a0Var.i();
        }

        public boolean M1(@m0 RecyclerView recyclerView, @m0 View view, @m0 Rect rect, boolean z10, boolean z11) {
            int[] T = T(view, rect);
            int i10 = T[0];
            int i11 = T[1];
            if ((z11 && !H0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.G1(i10, i11);
            }
            return true;
        }

        public int N() {
            return -1;
        }

        public boolean N0(@m0 View view, boolean z10, boolean z11) {
            boolean z12 = this.f3266e.b(view, 24579) && this.f3267f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public void N1() {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int O(@m0 View view) {
            return ((p) view.getLayoutParams()).f3287b.bottom;
        }

        public void O0(@m0 View view, int i10, int i11, int i12, int i13) {
            Rect rect = ((p) view.getLayoutParams()).f3287b;
            view.layout(i10 + rect.left, i11 + rect.top, i12 - rect.right, i13 - rect.bottom);
        }

        public void O1() {
            this.f3269h = true;
        }

        @o0
        public View P(int i10) {
            g gVar = this.f3262a;
            if (gVar != null) {
                return gVar.f(i10);
            }
            return null;
        }

        public void P0(@m0 View view, int i10, int i11, int i12, int i13) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f3287b;
            view.layout(i10 + rect.left + pVar.leftMargin, i11 + rect.top + pVar.topMargin, (i12 - rect.right) - pVar.rightMargin, (i13 - rect.bottom) - pVar.bottomMargin);
        }

        public final void P1(w wVar, int i10, View view) {
            e0 t02 = RecyclerView.t0(view);
            if (!t02.K()) {
                if (!t02.u() || t02.w() || this.f3263b.f3140c0.i()) {
                    D(i10);
                    wVar.E(view);
                    this.f3263b.T.k(t02);
                    return;
                }
                K1(i10);
                wVar.D(t02);
            }
        }

        public int Q() {
            g gVar = this.f3262a;
            if (gVar != null) {
                return gVar.g();
            }
            return 0;
        }

        public void Q0(@m0 View view, int i10, int i11) {
            p pVar = (p) view.getLayoutParams();
            Rect y02 = this.f3263b.y0(view);
            int i12 = i10 + y02.left + y02.right;
            int i13 = i11 + y02.top + y02.bottom;
            int R = R(z0(), A0(), o0() + p0() + i12, pVar.width, n());
            int R2 = R(e0(), f0(), r0() + m0() + i13, pVar.height, o());
            if (c2(view, R, R2, pVar)) {
                view.measure(R, R2);
            }
        }

        public int Q1(int i10, w wVar, b0 b0Var) {
            return 0;
        }

        public void R0(@m0 View view, int i10, int i11) {
            p pVar = (p) view.getLayoutParams();
            Rect y02 = this.f3263b.y0(view);
            int i12 = i10 + y02.left + y02.right;
            int i13 = i11 + y02.top + y02.bottom;
            int R = R(z0(), A0(), o0() + p0() + pVar.leftMargin + pVar.rightMargin + i12, pVar.width, n());
            int R2 = R(e0(), f0(), r0() + m0() + pVar.topMargin + pVar.bottomMargin + i13, pVar.height, o());
            if (c2(view, R, R2, pVar)) {
                view.measure(R, R2);
            }
        }

        public void R1(int i10) {
        }

        public void S0(int i10, int i11) {
            View P = P(i10);
            if (P != null) {
                D(i10);
                k(P, i11);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f3263b.toString());
        }

        public int S1(int i10, w wVar, b0 b0Var) {
            return 0;
        }

        public final int[] T(View view, Rect rect) {
            int[] iArr = new int[2];
            int o02 = o0();
            int r02 = r0();
            int z02 = z0() - p0();
            int e02 = e0() - m0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - o02;
            int min = Math.min(0, i10);
            int i11 = top - r02;
            int min2 = Math.min(0, i11);
            int i12 = width - z02;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - e02);
            if (i0() != 1) {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i12);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public void T0(@r0 int i10) {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView != null) {
                recyclerView.S0(i10);
            }
        }

        @Deprecated
        public void T1(boolean z10) {
            this.f3271j = z10;
        }

        public boolean U() {
            RecyclerView recyclerView = this.f3263b;
            return recyclerView != null && recyclerView.U;
        }

        public void U0(@r0 int i10) {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView != null) {
                recyclerView.T0(i10);
            }
        }

        public void U1(RecyclerView recyclerView) {
            W1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int V(@m0 w wVar, @m0 b0 b0Var) {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView == null || recyclerView.f3140c0 == null || !n()) {
                return 1;
            }
            return this.f3263b.f3140c0.e();
        }

        public void V0(@o0 g gVar, @o0 g gVar2) {
        }

        public final void V1(boolean z10) {
            if (z10 != this.f3273l) {
                this.f3273l = z10;
                this.f3274m = 0;
                RecyclerView recyclerView = this.f3263b;
                if (recyclerView != null) {
                    recyclerView.P.L();
                }
            }
        }

        public int W(@m0 View view) {
            return view.getBottom() + O(view);
        }

        public boolean W0(@m0 RecyclerView recyclerView, @m0 ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        public void W1(int i10, int i11) {
            this.f3278q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f3276o = mode;
            if (mode == 0 && !RecyclerView.f3127r1) {
                this.f3278q = 0;
            }
            this.f3279r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f3277p = mode2;
            if (mode2 == 0 && !RecyclerView.f3127r1) {
                this.f3279r = 0;
            }
        }

        public void X(@m0 View view, @m0 Rect rect) {
            RecyclerView.v0(view, rect);
        }

        @d.i
        public void X0(RecyclerView recyclerView) {
        }

        public void X1(int i10, int i11) {
            this.f3263b.setMeasuredDimension(i10, i11);
        }

        public int Y(@m0 View view) {
            return view.getLeft() - j0(view);
        }

        @Deprecated
        public void Y0(RecyclerView recyclerView) {
        }

        public void Y1(Rect rect, int i10, int i11) {
            X1(q(i10, rect.width() + o0() + p0(), l0()), q(i11, rect.height() + r0() + m0(), k0()));
        }

        public int Z(@m0 View view) {
            Rect rect = ((p) view.getLayoutParams()).f3287b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        @d.i
        public void Z0(RecyclerView recyclerView, w wVar) {
            Y0(recyclerView);
        }

        public void Z1(int i10, int i11) {
            int Q = Q();
            if (Q == 0) {
                this.f3263b.G(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MIN_VALUE;
            for (int i16 = 0; i16 < Q; i16++) {
                View P = P(i16);
                Rect rect = this.f3263b.W;
                X(P, rect);
                int i17 = rect.left;
                if (i17 < i13) {
                    i13 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i14) {
                    i14 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i15) {
                    i15 = i20;
                }
            }
            this.f3263b.W.set(i13, i14, i12, i15);
            Y1(this.f3263b.W, i10, i11);
        }

        public int a0(@m0 View view) {
            Rect rect = ((p) view.getLayoutParams()).f3287b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        @o0
        public View a1(@m0 View view, int i10, @m0 w wVar, @m0 b0 b0Var) {
            return null;
        }

        public void a2(boolean z10) {
            this.f3272k = z10;
        }

        public int b0(@m0 View view) {
            return view.getRight() + u0(view);
        }

        public void b1(@m0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3263b;
            c1(recyclerView.P, recyclerView.V0, accessibilityEvent);
        }

        public void b2(RecyclerView recyclerView) {
            int i10;
            if (recyclerView == null) {
                this.f3263b = null;
                this.f3262a = null;
                i10 = 0;
                this.f3278q = 0;
            } else {
                this.f3263b = recyclerView;
                this.f3262a = recyclerView.S;
                this.f3278q = recyclerView.getWidth();
                i10 = recyclerView.getHeight();
            }
            this.f3279r = i10;
            this.f3276o = 1073741824;
            this.f3277p = 1073741824;
        }

        public void c(View view) {
            d(view, -1);
        }

        public int c0(@m0 View view) {
            return view.getTop() - x0(view);
        }

        public void c1(@m0 w wVar, @m0 b0 b0Var, @m0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f3263b.canScrollVertically(-1) && !this.f3263b.canScrollHorizontally(-1) && !this.f3263b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                g gVar = this.f3263b.f3140c0;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.e());
                }
            }
        }

        public boolean c2(View view, int i10, int i11, p pVar) {
            return view.isLayoutRequested() || !this.f3272k || !L0(view.getWidth(), i10, pVar.width) || !L0(view.getHeight(), i11, pVar.height);
        }

        public void d(View view, int i10) {
            g(view, i10, true);
        }

        @o0
        public View d0() {
            View focusedChild;
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3262a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void d1(@m0 w wVar, @m0 b0 b0Var, @m0 g1.z zVar) {
            if (this.f3263b.canScrollVertically(-1) || this.f3263b.canScrollHorizontally(-1)) {
                zVar.a(8192);
                zVar.D1(true);
            }
            if (this.f3263b.canScrollVertically(1) || this.f3263b.canScrollHorizontally(1)) {
                zVar.a(4096);
                zVar.D1(true);
            }
            zVar.W0(z.b.f(v0(wVar, b0Var), V(wVar, b0Var), J0(wVar, b0Var), w0(wVar, b0Var)));
        }

        public boolean d2() {
            return false;
        }

        public void e(View view) {
            f(view, -1);
        }

        @r0
        public int e0() {
            return this.f3279r;
        }

        public void e1(g1.z zVar) {
            RecyclerView recyclerView = this.f3263b;
            d1(recyclerView.P, recyclerView.V0, zVar);
        }

        public boolean e2(View view, int i10, int i11, p pVar) {
            return !this.f3272k || !L0(view.getMeasuredWidth(), i10, pVar.width) || !L0(view.getMeasuredHeight(), i11, pVar.height);
        }

        public void f(View view, int i10) {
            g(view, i10, false);
        }

        public int f0() {
            return this.f3277p;
        }

        public void f1(View view, g1.z zVar) {
            e0 t02 = RecyclerView.t0(view);
            if (t02 != null && !t02.w() && !this.f3262a.n(t02.f3220a)) {
                RecyclerView recyclerView = this.f3263b;
                g1(recyclerView.P, recyclerView.V0, view, zVar);
            }
        }

        public void f2(RecyclerView recyclerView, b0 b0Var, int i10) {
        }

        public final void g(View view, int i10, boolean z10) {
            e0 t02 = RecyclerView.t0(view);
            if (z10 || t02.w()) {
                this.f3263b.T.b(t02);
            } else {
                this.f3263b.T.p(t02);
            }
            p pVar = (p) view.getLayoutParams();
            if (t02.N() || t02.x()) {
                if (t02.x()) {
                    t02.M();
                } else {
                    t02.e();
                }
                this.f3262a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3263b) {
                int m10 = this.f3262a.m(view);
                if (i10 == -1) {
                    i10 = this.f3262a.g();
                }
                if (m10 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3263b.indexOfChild(view) + this.f3263b.X());
                } else if (m10 != i10) {
                    this.f3263b.f3142d0.S0(m10, i10);
                }
            } else {
                this.f3262a.a(view, i10, false);
                pVar.f3288c = true;
                a0 a0Var = this.f3268g;
                if (a0Var != null && a0Var.i()) {
                    this.f3268g.l(view);
                }
            }
            if (pVar.f3289d) {
                t02.f3220a.invalidate();
                pVar.f3289d = false;
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.f3263b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.e();
            }
            return 0;
        }

        public void g1(@m0 w wVar, @m0 b0 b0Var, @m0 View view, @m0 g1.z zVar) {
            int i10 = 0;
            int s02 = o() ? s0(view) : 0;
            if (n()) {
                i10 = s0(view);
            }
            zVar.X0(z.c.h(s02, 1, i10, 1, false, false));
        }

        public void g2(a0 a0Var) {
            a0 a0Var2 = this.f3268g;
            if (!(a0Var2 == null || a0Var == a0Var2 || !a0Var2.i())) {
                this.f3268g.s();
            }
            this.f3268g = a0Var;
            a0Var.r(this.f3263b, this);
        }

        public void h(String str) {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView != null) {
                recyclerView.v(str);
            }
        }

        public int h0(@m0 View view) {
            return RecyclerView.t0(view).l();
        }

        @o0
        public View h1(@m0 View view, int i10) {
            return null;
        }

        public void h2(@m0 View view) {
            e0 t02 = RecyclerView.t0(view);
            t02.L();
            t02.E();
            t02.b(4);
        }

        public void i(String str) {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView != null) {
                recyclerView.w(str);
            }
        }

        public int i0() {
            return w1.X(this.f3263b);
        }

        public void i1(@m0 RecyclerView recyclerView, int i10, int i11) {
        }

        public void i2() {
            a0 a0Var = this.f3268g;
            if (a0Var != null) {
                a0Var.s();
            }
        }

        public void j(@m0 View view) {
            k(view, -1);
        }

        public int j0(@m0 View view) {
            return ((p) view.getLayoutParams()).f3287b.left;
        }

        public void j1(@m0 RecyclerView recyclerView) {
        }

        public boolean j2() {
            return false;
        }

        public void k(@m0 View view, int i10) {
            l(view, i10, (p) view.getLayoutParams());
        }

        @r0
        public int k0() {
            return w1.c0(this.f3263b);
        }

        public void k1(@m0 RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public void l(@m0 View view, int i10, p pVar) {
            e0 t02 = RecyclerView.t0(view);
            if (t02.w()) {
                this.f3263b.T.b(t02);
            } else {
                this.f3263b.T.p(t02);
            }
            this.f3262a.c(view, i10, pVar, t02.w());
        }

        @r0
        public int l0() {
            return w1.d0(this.f3263b);
        }

        public void l1(@m0 RecyclerView recyclerView, int i10, int i11) {
        }

        public void m(@m0 View view, @m0 Rect rect) {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.y0(view));
            }
        }

        @r0
        public int m0() {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void m1(@m0 RecyclerView recyclerView, int i10, int i11) {
        }

        public boolean n() {
            return false;
        }

        @r0
        public int n0() {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView != null) {
                return w1.i0(recyclerView);
            }
            return 0;
        }

        public void n1(@m0 RecyclerView recyclerView, int i10, int i11, @o0 Object obj) {
            m1(recyclerView, i10, i11);
        }

        public boolean o() {
            return false;
        }

        @r0
        public int o0() {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void o1(w wVar, b0 b0Var) {
        }

        public boolean p(p pVar) {
            return pVar != null;
        }

        @r0
        public int p0() {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void p1(b0 b0Var) {
        }

        @r0
        public int q0() {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView != null) {
                return w1.j0(recyclerView);
            }
            return 0;
        }

        public void q1(@m0 w wVar, @m0 b0 b0Var, int i10, int i11) {
            this.f3263b.G(i10, i11);
        }

        public void r(int i10, int i11, b0 b0Var, c cVar) {
        }

        @r0
        public int r0() {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        @Deprecated
        public boolean r1(@m0 RecyclerView recyclerView, @m0 View view, @o0 View view2) {
            return M0() || recyclerView.M0();
        }

        public void s(int i10, c cVar) {
        }

        public int s0(@m0 View view) {
            return ((p) view.getLayoutParams()).b();
        }

        public boolean s1(@m0 RecyclerView recyclerView, @m0 b0 b0Var, @m0 View view, @o0 View view2) {
            return r1(recyclerView, view, view2);
        }

        public int t(@m0 b0 b0Var) {
            return 0;
        }

        public void t1(Parcelable parcelable) {
        }

        public int u(@m0 b0 b0Var) {
            return 0;
        }

        public int u0(@m0 View view) {
            return ((p) view.getLayoutParams()).f3287b.right;
        }

        @o0
        public Parcelable u1() {
            return null;
        }

        public int v(@m0 b0 b0Var) {
            return 0;
        }

        public int v0(@m0 w wVar, @m0 b0 b0Var) {
            RecyclerView recyclerView = this.f3263b;
            if (recyclerView == null || recyclerView.f3140c0 == null || !o()) {
                return 1;
            }
            return this.f3263b.f3140c0.e();
        }

        public void v1(int i10) {
        }

        public int w(@m0 b0 b0Var) {
            return 0;
        }

        public int w0(@m0 w wVar, @m0 b0 b0Var) {
            return 0;
        }

        public void w1(a0 a0Var) {
            if (this.f3268g == a0Var) {
                this.f3268g = null;
            }
        }

        public int x(@m0 b0 b0Var) {
            return 0;
        }

        public int x0(@m0 View view) {
            return ((p) view.getLayoutParams()).f3287b.top;
        }

        public boolean x1(int i10, @o0 Bundle bundle) {
            RecyclerView recyclerView = this.f3263b;
            return y1(recyclerView.P, recyclerView.V0, i10, bundle);
        }

        public int y(@m0 b0 b0Var) {
            return 0;
        }

        public void y0(@m0 View view, boolean z10, @m0 Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((p) view.getLayoutParams()).f3287b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f3263b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f3263b.f3138b0;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean y1(@d.m0 androidx.recyclerview.widget.RecyclerView.w r8, @d.m0 androidx.recyclerview.widget.RecyclerView.b0 r9, int r10, @d.o0 android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f3263b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = r9
                r3 = r2
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.e0()
                int r11 = r7.r0()
                int r8 = r8 - r11
                int r11 = r7.m0()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = r9
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f3263b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.z0()
                int r11 = r7.o0()
                int r10 = r10 - r11
                int r11 = r7.p0()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.e0()
                int r10 = r7.r0()
                int r8 = r8 - r10
                int r10 = r7.m0()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = r9
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f3263b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.z0()
                int r11 = r7.o0()
                int r10 = r10 - r11
                int r11 = r7.p0()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = r9
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f3263b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.J1(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.y1(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, int, android.os.Bundle):boolean");
        }

        public void z(@m0 w wVar) {
            for (int Q = Q() - 1; Q >= 0; Q--) {
                P1(wVar, Q, P(Q));
            }
        }

        @r0
        public int z0() {
            return this.f3278q;
        }

        public boolean z1(@m0 View view, int i10, @o0 Bundle bundle) {
            RecyclerView recyclerView = this.f3263b;
            return A1(recyclerView.P, recyclerView.V0, view, i10, bundle);
        }
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public e0 f3286a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f3287b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public boolean f3288c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3289d = false;

        public p(int i10, int i11) {
            super(i10, i11);
        }

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public p(p pVar) {
            super(pVar);
        }

        public int a() {
            return this.f3286a.j();
        }

        public int b() {
            return this.f3286a.m();
        }

        @Deprecated
        public int c() {
            return this.f3286a.o();
        }

        public boolean d() {
            return this.f3286a.z();
        }

        public boolean e() {
            return this.f3286a.w();
        }

        public boolean f() {
            return this.f3286a.u();
        }

        public boolean g() {
            return this.f3286a.A();
        }
    }

    public interface q {
        void b(@m0 View view);

        void d(@m0 View view);
    }

    public static abstract class r {
        public abstract boolean a(int i10, int i11);
    }

    public interface s {
        void a(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent);

        boolean c(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent);

        void e(boolean z10);
    }

    public static abstract class t {
        public void a(@m0 RecyclerView recyclerView, int i10) {
        }

        public void b(@m0 RecyclerView recyclerView, int i10, int i11) {
        }
    }

    @x0({x0.a.Q})
    @Retention(RetentionPolicy.SOURCE)
    public @interface u {
    }

    public static class v {

        /* renamed from: c  reason: collision with root package name */
        public static final int f3290c = 5;

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<a> f3291a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f3292b = 0;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<e0> f3293a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public int f3294b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f3295c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f3296d = 0;
        }

        public void a() {
            this.f3292b++;
        }

        public void b() {
            for (int i10 = 0; i10 < this.f3291a.size(); i10++) {
                this.f3291a.valueAt(i10).f3293a.clear();
            }
        }

        public void c() {
            this.f3292b--;
        }

        public void d(int i10, long j10) {
            a h10 = h(i10);
            h10.f3296d = k(h10.f3296d, j10);
        }

        public void e(int i10, long j10) {
            a h10 = h(i10);
            h10.f3295c = k(h10.f3295c, j10);
        }

        @o0
        public e0 f(int i10) {
            a aVar = this.f3291a.get(i10);
            if (aVar == null || aVar.f3293a.isEmpty()) {
                return null;
            }
            ArrayList<e0> arrayList = aVar.f3293a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).s()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public int g(int i10) {
            return h(i10).f3293a.size();
        }

        public final a h(int i10) {
            a aVar = this.f3291a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f3291a.put(i10, aVar2);
            return aVar2;
        }

        public void i(g gVar, g gVar2, boolean z10) {
            if (gVar != null) {
                c();
            }
            if (!z10 && this.f3292b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void j(e0 e0Var) {
            int l10 = e0Var.l();
            ArrayList<e0> arrayList = h(l10).f3293a;
            if (this.f3291a.get(l10).f3294b > arrayList.size()) {
                e0Var.E();
                arrayList.add(e0Var);
            }
        }

        public long k(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        public void l(int i10, int i11) {
            a h10 = h(i10);
            h10.f3294b = i11;
            ArrayList<e0> arrayList = h10.f3293a;
            while (arrayList.size() > i11) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public int m() {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f3291a.size(); i11++) {
                ArrayList<e0> arrayList = this.f3291a.valueAt(i11).f3293a;
                if (arrayList != null) {
                    i10 += arrayList.size();
                }
            }
            return i10;
        }

        public boolean n(int i10, long j10, long j11) {
            long j12 = h(i10).f3296d;
            return j12 == 0 || j10 + j12 < j11;
        }

        public boolean o(int i10, long j10, long j11) {
            long j12 = h(i10).f3295c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class w {

        /* renamed from: j  reason: collision with root package name */
        public static final int f3297j = 2;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<e0> f3298a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<e0> f3299b = null;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e0> f3300c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final List<e0> f3301d;

        /* renamed from: e  reason: collision with root package name */
        public int f3302e;

        /* renamed from: f  reason: collision with root package name */
        public int f3303f;

        /* renamed from: g  reason: collision with root package name */
        public v f3304g;

        /* renamed from: h  reason: collision with root package name */
        public c0 f3305h;

        public w() {
            ArrayList<e0> arrayList = new ArrayList<>();
            this.f3298a = arrayList;
            this.f3301d = Collections.unmodifiableList(arrayList);
            this.f3302e = 2;
            this.f3303f = 2;
        }

        public void A() {
            for (int size = this.f3300c.size() - 1; size >= 0; size--) {
                B(size);
            }
            this.f3300c.clear();
            if (RecyclerView.f3129t1) {
                RecyclerView.this.U0.b();
            }
        }

        public void B(int i10) {
            a(this.f3300c.get(i10), true);
            this.f3300c.remove(i10);
        }

        public void C(@m0 View view) {
            e0 t02 = RecyclerView.t0(view);
            if (t02.y()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (t02.x()) {
                t02.M();
            } else if (t02.N()) {
                t02.e();
            }
            D(t02);
            if (RecyclerView.this.D0 != null && !t02.v()) {
                RecyclerView.this.D0.k(t02);
            }
        }

        public void D(e0 e0Var) {
            boolean z10;
            boolean z11 = false;
            boolean z12 = true;
            if (e0Var.x() || e0Var.f3220a.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(e0Var.x());
                sb2.append(" isAttached:");
                if (e0Var.f3220a.getParent() != null) {
                    z11 = true;
                }
                sb2.append(z11);
                sb2.append(RecyclerView.this.X());
                throw new IllegalArgumentException(sb2.toString());
            } else if (e0Var.y()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + e0Var + RecyclerView.this.X());
            } else if (!e0Var.K()) {
                boolean h10 = e0Var.h();
                g gVar = RecyclerView.this.f3140c0;
                if ((gVar != null && h10 && gVar.y(e0Var)) || e0Var.v()) {
                    if (this.f3303f <= 0 || e0Var.q(526)) {
                        z10 = false;
                    } else {
                        int size = this.f3300c.size();
                        if (size >= this.f3303f && size > 0) {
                            B(0);
                            size--;
                        }
                        if (RecyclerView.f3129t1 && size > 0 && !RecyclerView.this.U0.d(e0Var.f3222c)) {
                            int i10 = size - 1;
                            while (i10 >= 0) {
                                if (!RecyclerView.this.U0.d(this.f3300c.get(i10).f3222c)) {
                                    break;
                                }
                                i10--;
                            }
                            size = i10 + 1;
                        }
                        this.f3300c.add(size, e0Var);
                        z10 = true;
                    }
                    if (!z10) {
                        a(e0Var, true);
                    } else {
                        z12 = false;
                    }
                    z11 = z10;
                } else {
                    z12 = false;
                }
                RecyclerView.this.T.q(e0Var);
                if (!z11 && !z12 && h10) {
                    e0Var.f3237r = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.X());
            }
        }

        public void E(View view) {
            ArrayList<e0> arrayList;
            e0 t02 = RecyclerView.t0(view);
            if (!t02.q(12) && t02.z() && !RecyclerView.this.x(t02)) {
                if (this.f3299b == null) {
                    this.f3299b = new ArrayList<>();
                }
                t02.I(this, true);
                arrayList = this.f3299b;
            } else if (!t02.u() || t02.w() || RecyclerView.this.f3140c0.i()) {
                t02.I(this, false);
                arrayList = this.f3298a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.X());
            }
            arrayList.add(t02);
        }

        public void F(v vVar) {
            v vVar2 = this.f3304g;
            if (vVar2 != null) {
                vVar2.c();
            }
            this.f3304g = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.f3304g.a();
            }
        }

        public void G(c0 c0Var) {
            this.f3305h = c0Var;
        }

        public void H(int i10) {
            this.f3302e = i10;
            L();
        }

        public final boolean I(@m0 e0 e0Var, int i10, int i11, long j10) {
            e0Var.f3237r = RecyclerView.this;
            int l10 = e0Var.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 != Long.MAX_VALUE && !this.f3304g.n(l10, nanoTime, j10)) {
                return false;
            }
            RecyclerView.this.f3140c0.c(e0Var, i10);
            this.f3304g.d(e0Var.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(e0Var);
            if (!RecyclerView.this.V0.j()) {
                return true;
            }
            e0Var.f3226g = i11;
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01cb  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01ce  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01fe  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x020c  */
        @d.o0
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.e0 J(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x0228
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r1.V0
                int r1 = r1.d()
                if (r3 >= r1) goto L_0x0228
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r1.V0
                boolean r1 = r1.j()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$e0 r1 = r16.i(r17)
                if (r1 == 0) goto L_0x0028
                r4 = r7
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = r8
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$e0 r1 = r16.n(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.M(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.b(r5)
                boolean r5 = r1.x()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f3220a
                r5.removeDetachedView(r9, r8)
                r1.M()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.N()
                if (r5 == 0) goto L_0x0057
                r1.e()
            L_0x0057:
                r6.D(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = r7
            L_0x005d:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.R
                int r5 = r5.n(r3)
                if (r5 < 0) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.f3140c0
                int r9 = r9.e()
                if (r5 >= r9) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.f3140c0
                int r9 = r9.g(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.f3140c0
                boolean r10 = r10.i()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.f3140c0
                long r10 = r1.f(r5)
                androidx.recyclerview.widget.RecyclerView$e0 r1 = r6.m(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f3222c = r5
                r4 = r7
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView$c0 r0 = r6.f3305h
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e0 r1 = r1.s0(r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.K()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.X()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.X()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0102
                androidx.recyclerview.widget.RecyclerView$v r0 = r16.j()
                androidx.recyclerview.widget.RecyclerView$e0 r0 = r0.f(r9)
                if (r0 == 0) goto L_0x0101
                r0.E()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f3126q1
                if (r1 == 0) goto L_0x0101
                r6.s(r0)
            L_0x0101:
                r1 = r0
            L_0x0102:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x0120
                androidx.recyclerview.widget.RecyclerView$v r10 = r6.f3304g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.o(r11, r12, r14)
                if (r5 != 0) goto L_0x0120
                return r2
            L_0x0120:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.f3140c0
                androidx.recyclerview.widget.RecyclerView$e0 r2 = r5.d(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f3129t1
                if (r5 == 0) goto L_0x013b
                android.view.View r5 = r2.f3220a
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.e0(r5)
                if (r5 == 0) goto L_0x013b
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f3221b = r10
            L_0x013b:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$v r5 = r6.f3304g
                long r10 = r10 - r0
                r5.e(r9, r10)
                r9 = r2
                goto L_0x0182
            L_0x0149:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r2.V0
                int r2 = r2.d()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.X()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0181:
                r9 = r1
            L_0x0182:
                r10 = r4
                if (r10 == 0) goto L_0x01bb
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.V0
                boolean r0 = r0.j()
                if (r0 != 0) goto L_0x01bb
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.q(r0)
                if (r1 == 0) goto L_0x01bb
                r9.G(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.V0
                boolean r0 = r0.f3203k
                if (r0 == 0) goto L_0x01bb
                int r0 = androidx.recyclerview.widget.RecyclerView.l.e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.D0
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r1.V0
                java.util.List r4 = r9.p()
                androidx.recyclerview.widget.RecyclerView$l$d r0 = r2.w(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.k1(r9, r0)
            L_0x01bb:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.V0
                boolean r0 = r0.j()
                if (r0 == 0) goto L_0x01ce
                boolean r0 = r9.t()
                if (r0 == 0) goto L_0x01ce
                r9.f3226g = r3
                goto L_0x01e1
            L_0x01ce:
                boolean r0 = r9.t()
                if (r0 == 0) goto L_0x01e3
                boolean r0 = r9.A()
                if (r0 != 0) goto L_0x01e3
                boolean r0 = r9.u()
                if (r0 == 0) goto L_0x01e1
                goto L_0x01e3
            L_0x01e1:
                r0 = r8
                goto L_0x01f6
            L_0x01e3:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.R
                int r2 = r0.n(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.I(r1, r2, r3, r4)
            L_0x01f6:
                android.view.View r1 = r9.f3220a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x020c
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            L_0x0204:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
                android.view.View r2 = r9.f3220a
                r2.setLayoutParams(r1)
                goto L_0x021d
            L_0x020c:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x021b
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                goto L_0x0204
            L_0x021b:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
            L_0x021d:
                r1.f3286a = r9
                if (r10 == 0) goto L_0x0224
                if (r0 == 0) goto L_0x0224
                goto L_0x0225
            L_0x0224:
                r7 = r8
            L_0x0225:
                r1.f3289d = r7
                return r9
            L_0x0228:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r2.V0
                int r2 = r2.d()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.X()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.J(int, boolean, long):androidx.recyclerview.widget.RecyclerView$e0");
        }

        public void K(e0 e0Var) {
            (e0Var.f3234o ? this.f3299b : this.f3298a).remove(e0Var);
            e0Var.f3233n = null;
            e0Var.f3234o = false;
            e0Var.e();
        }

        public void L() {
            o oVar = RecyclerView.this.f3142d0;
            this.f3303f = this.f3302e + (oVar != null ? oVar.f3274m : 0);
            for (int size = this.f3300c.size() - 1; size >= 0 && this.f3300c.size() > this.f3303f; size--) {
                B(size);
            }
        }

        public boolean M(e0 e0Var) {
            if (e0Var.w()) {
                return RecyclerView.this.V0.j();
            }
            int i10 = e0Var.f3222c;
            if (i10 < 0 || i10 >= RecyclerView.this.f3140c0.e()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e0Var + RecyclerView.this.X());
            } else if (!RecyclerView.this.V0.j() && RecyclerView.this.f3140c0.g(e0Var.f3222c) != e0Var.l()) {
                return false;
            } else {
                if (RecyclerView.this.f3140c0.i()) {
                    return e0Var.k() == RecyclerView.this.f3140c0.f(e0Var.f3222c);
                }
                return true;
            }
        }

        public void N(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f3300c.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f3300c.get(size);
                if (e0Var != null && (i12 = e0Var.f3222c) >= i10 && i12 < i13) {
                    e0Var.b(2);
                    B(size);
                }
            }
        }

        public void a(@m0 e0 e0Var, boolean z10) {
            RecyclerView.z(e0Var);
            View view = e0Var.f3220a;
            y yVar = RecyclerView.this.f3141c1;
            if (yVar != null) {
                f1.a n10 = yVar.n();
                w1.z1(view, n10 instanceof y.a ? ((y.a) n10).n(view) : null);
            }
            if (z10) {
                h(e0Var);
            }
            e0Var.f3237r = null;
            j().j(e0Var);
        }

        public final void b(e0 e0Var) {
            if (RecyclerView.this.K0()) {
                View view = e0Var.f3220a;
                if (w1.T(view) == 0) {
                    w1.P1(view, 1);
                }
                y yVar = RecyclerView.this.f3141c1;
                if (yVar != null) {
                    f1.a n10 = yVar.n();
                    if (n10 instanceof y.a) {
                        ((y.a) n10).o(view);
                    }
                    w1.z1(view, n10);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(@d.m0 android.view.View r7, int r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.RecyclerView$e0 r7 = androidx.recyclerview.widget.RecyclerView.t0(r7)
                if (r7 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.R
                int r2 = r0.n(r8)
                if (r2 < 0) goto L_0x005e
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r0 = r0.f3140c0
                int r0 = r0.e()
                if (r2 >= r0) goto L_0x005e
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0 = r6
                r1 = r7
                r3 = r8
                r0.I(r1, r2, r3, r4)
                android.view.View r8 = r7.f3220a
                android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
                if (r8 != 0) goto L_0x003b
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r8 = r8.generateDefaultLayoutParams()
            L_0x0033:
                androidx.recyclerview.widget.RecyclerView$p r8 = (androidx.recyclerview.widget.RecyclerView.p) r8
                android.view.View r0 = r7.f3220a
                r0.setLayoutParams(r8)
                goto L_0x004c
            L_0x003b:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                boolean r0 = r0.checkLayoutParams(r8)
                if (r0 != 0) goto L_0x004a
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r8 = r0.generateLayoutParams((android.view.ViewGroup.LayoutParams) r8)
                goto L_0x0033
            L_0x004a:
                androidx.recyclerview.widget.RecyclerView$p r8 = (androidx.recyclerview.widget.RecyclerView.p) r8
            L_0x004c:
                r0 = 1
                r8.f3288c = r0
                r8.f3286a = r7
                android.view.View r7 = r7.f3220a
                android.view.ViewParent r7 = r7.getParent()
                if (r7 != 0) goto L_0x005a
                goto L_0x005b
            L_0x005a:
                r0 = 0
            L_0x005b:
                r8.f3289d = r0
                return
            L_0x005e:
                java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Inconsistency detected. Invalid item position "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = "(offset:"
                r0.append(r8)
                r0.append(r2)
                java.lang.String r8 = ").state:"
                r0.append(r8)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r8 = r8.V0
                int r8 = r8.d()
                r0.append(r8)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r8 = r8.X()
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                r7.<init>(r8)
                throw r7
            L_0x0096:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter"
                r8.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = r0.X()
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.c(android.view.View, int):void");
        }

        public void d() {
            this.f3298a.clear();
            A();
        }

        public void e() {
            int size = this.f3300c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f3300c.get(i10).c();
            }
            int size2 = this.f3298a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f3298a.get(i11).c();
            }
            ArrayList<e0> arrayList = this.f3299b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.f3299b.get(i12).c();
                }
            }
        }

        public void f() {
            this.f3298a.clear();
            ArrayList<e0> arrayList = this.f3299b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int g(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.V0.d()) {
                return !RecyclerView.this.V0.j() ? i10 : RecyclerView.this.R.n(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.V0.d() + RecyclerView.this.X());
        }

        public void h(@m0 e0 e0Var) {
            x xVar = RecyclerView.this.f3144e0;
            if (xVar != null) {
                xVar.a(e0Var);
            }
            g gVar = RecyclerView.this.f3140c0;
            if (gVar != null) {
                gVar.B(e0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.V0 != null) {
                recyclerView.T.q(e0Var);
            }
        }

        public e0 i(int i10) {
            int size;
            int n10;
            ArrayList<e0> arrayList = this.f3299b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    e0 e0Var = this.f3299b.get(i12);
                    if (e0Var.N() || e0Var.m() != i10) {
                        i12++;
                    } else {
                        e0Var.b(32);
                        return e0Var;
                    }
                }
                if (RecyclerView.this.f3140c0.i() && (n10 = RecyclerView.this.R.n(i10)) > 0 && n10 < RecyclerView.this.f3140c0.e()) {
                    long f10 = RecyclerView.this.f3140c0.f(n10);
                    while (i11 < size) {
                        e0 e0Var2 = this.f3299b.get(i11);
                        if (e0Var2.N() || e0Var2.k() != f10) {
                            i11++;
                        } else {
                            e0Var2.b(32);
                            return e0Var2;
                        }
                    }
                }
            }
            return null;
        }

        public v j() {
            if (this.f3304g == null) {
                this.f3304g = new v();
            }
            return this.f3304g;
        }

        public int k() {
            return this.f3298a.size();
        }

        @m0
        public List<e0> l() {
            return this.f3301d;
        }

        public e0 m(long j10, int i10, boolean z10) {
            for (int size = this.f3298a.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f3298a.get(size);
                if (e0Var.k() == j10 && !e0Var.N()) {
                    if (i10 == e0Var.l()) {
                        e0Var.b(32);
                        if (e0Var.w() && !RecyclerView.this.V0.j()) {
                            e0Var.G(2, 14);
                        }
                        return e0Var;
                    } else if (!z10) {
                        this.f3298a.remove(size);
                        RecyclerView.this.removeDetachedView(e0Var.f3220a, false);
                        z(e0Var.f3220a);
                    }
                }
            }
            int size2 = this.f3300c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                e0 e0Var2 = this.f3300c.get(size2);
                if (e0Var2.k() == j10 && !e0Var2.s()) {
                    if (i10 == e0Var2.l()) {
                        if (!z10) {
                            this.f3300c.remove(size2);
                        }
                        return e0Var2;
                    } else if (!z10) {
                        B(size2);
                        return null;
                    }
                }
            }
        }

        public e0 n(int i10, boolean z10) {
            View e10;
            int size = this.f3298a.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                e0 e0Var = this.f3298a.get(i12);
                if (e0Var.N() || e0Var.m() != i10 || e0Var.u() || (!RecyclerView.this.V0.f3200h && e0Var.w())) {
                    i12++;
                } else {
                    e0Var.b(32);
                    return e0Var;
                }
            }
            if (z10 || (e10 = RecyclerView.this.S.e(i10)) == null) {
                int size2 = this.f3300c.size();
                while (i11 < size2) {
                    e0 e0Var2 = this.f3300c.get(i11);
                    if (e0Var2.u() || e0Var2.m() != i10 || e0Var2.s()) {
                        i11++;
                    } else {
                        if (!z10) {
                            this.f3300c.remove(i11);
                        }
                        return e0Var2;
                    }
                }
                return null;
            }
            e0 t02 = RecyclerView.t0(e10);
            RecyclerView.this.S.s(e10);
            int m10 = RecyclerView.this.S.m(e10);
            if (m10 != -1) {
                RecyclerView.this.S.d(m10);
                E(e10);
                t02.b(8224);
                return t02;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + t02 + RecyclerView.this.X());
        }

        public View o(int i10) {
            return this.f3298a.get(i10).f3220a;
        }

        @m0
        public View p(int i10) {
            return q(i10, false);
        }

        public View q(int i10, boolean z10) {
            return J(i10, z10, Long.MAX_VALUE).f3220a;
        }

        public final void r(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    r((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public final void s(e0 e0Var) {
            View view = e0Var.f3220a;
            if (view instanceof ViewGroup) {
                r((ViewGroup) view, false);
            }
        }

        public void t() {
            int size = this.f3300c.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar = (p) this.f3300c.get(i10).f3220a.getLayoutParams();
                if (pVar != null) {
                    pVar.f3288c = true;
                }
            }
        }

        public void u() {
            int size = this.f3300c.size();
            for (int i10 = 0; i10 < size; i10++) {
                e0 e0Var = this.f3300c.get(i10);
                if (e0Var != null) {
                    e0Var.b(6);
                    e0Var.a((Object) null);
                }
            }
            g gVar = RecyclerView.this.f3140c0;
            if (gVar == null || !gVar.i()) {
                A();
            }
        }

        public void v(int i10, int i11) {
            int size = this.f3300c.size();
            for (int i12 = 0; i12 < size; i12++) {
                e0 e0Var = this.f3300c.get(i12);
                if (e0Var != null && e0Var.f3222c >= i10) {
                    e0Var.B(i11, true);
                }
            }
        }

        public void w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i14 = -1;
                i13 = i10;
                i12 = i11;
            } else {
                i14 = 1;
                i12 = i10;
                i13 = i11;
            }
            int size = this.f3300c.size();
            for (int i16 = 0; i16 < size; i16++) {
                e0 e0Var = this.f3300c.get(i16);
                if (e0Var != null && (i15 = e0Var.f3222c) >= i13 && i15 <= i12) {
                    if (i15 == i10) {
                        e0Var.B(i11 - i10, false);
                    } else {
                        e0Var.B(i14, false);
                    }
                }
            }
        }

        public void x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f3300c.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f3300c.get(size);
                if (e0Var != null) {
                    int i13 = e0Var.f3222c;
                    if (i13 >= i12) {
                        e0Var.B(-i11, z10);
                    } else if (i13 >= i10) {
                        e0Var.b(8);
                        B(size);
                    }
                }
            }
        }

        public void y(g gVar, g gVar2, boolean z10) {
            d();
            j().i(gVar, gVar2, z10);
        }

        public void z(View view) {
            e0 t02 = RecyclerView.t0(view);
            t02.f3233n = null;
            t02.f3234o = false;
            t02.e();
            D(t02);
        }
    }

    public interface x {
        void a(@m0 e0 e0Var);
    }

    public class y extends i {
        public y() {
        }

        public void a() {
            RecyclerView.this.w((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.V0.f3199g = true;
            recyclerView.i1(true);
            if (!RecyclerView.this.R.q()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.w((String) null);
            if (RecyclerView.this.R.s(i10, i11, obj)) {
                g();
            }
        }

        public void d(int i10, int i11) {
            RecyclerView.this.w((String) null);
            if (RecyclerView.this.R.t(i10, i11)) {
                g();
            }
        }

        public void e(int i10, int i11, int i12) {
            RecyclerView.this.w((String) null);
            if (RecyclerView.this.R.u(i10, i11, i12)) {
                g();
            }
        }

        public void f(int i10, int i11) {
            RecyclerView.this.w((String) null);
            if (RecyclerView.this.R.v(i10, i11)) {
                g();
            }
        }

        public void g() {
            if (RecyclerView.f3128s1) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f3154j0 && recyclerView.f3152i0) {
                    w1.n1(recyclerView, recyclerView.V);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f3165r0 = true;
            recyclerView2.requestLayout();
        }
    }

    public static class z implements s {
        public void a(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
        }

        public boolean c(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
            return false;
        }

        public void e(boolean z10) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            f3125p1 = r1
            f3126q1 = r3
            f3127r1 = r0
            f3128s1 = r0
            f3129t1 = r0
            f3130u1 = r3
            f3131v1 = r3
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            P1 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            V1 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public RecyclerView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0210a.recyclerViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i11 = i10;
        this.O = new y();
        this.P = new w();
        this.T = new h0();
        this.V = new a();
        this.W = new Rect();
        this.f3136a0 = new Rect();
        this.f3138b0 = new RectF();
        this.f3146f0 = new ArrayList<>();
        this.f3148g0 = new ArrayList<>();
        this.f3160m0 = 0;
        this.f3168u0 = false;
        this.f3169v0 = false;
        this.f3170w0 = 0;
        this.f3171x0 = 0;
        this.f3172y0 = new k();
        this.D0 = new h();
        this.E0 = 0;
        this.F0 = -1;
        this.P0 = Float.MIN_VALUE;
        this.Q0 = Float.MIN_VALUE;
        this.R0 = true;
        this.S0 = new d0();
        this.U0 = f3129t1 ? new l.b() : null;
        this.V0 = new b0();
        this.Y0 = false;
        this.Z0 = false;
        this.f3137a1 = new m();
        this.f3139b1 = false;
        this.f3145e1 = new int[2];
        this.f3149g1 = new int[2];
        this.f3151h1 = new int[2];
        this.f3153i1 = new int[2];
        this.f3155j1 = new ArrayList();
        this.f3157k1 = new b();
        this.f3159l1 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.L0 = viewConfiguration.getScaledTouchSlop();
        this.P0 = n2.b(viewConfiguration, context2);
        this.Q0 = n2.e(viewConfiguration, context2);
        this.N0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.O0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.D0.A(this.f3137a1);
        E0();
        G0();
        F0();
        if (w1.T(this) == 0) {
            w1.P1(this, 1);
        }
        this.f3166s0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new y(this));
        int[] iArr = a.j.RecyclerView;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i11, 0);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        }
        String string = obtainStyledAttributes.getString(a.j.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(a.j.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.U = obtainStyledAttributes.getBoolean(a.j.RecyclerView_android_clipToPadding, true);
        boolean z10 = obtainStyledAttributes.getBoolean(a.j.RecyclerView_fastScrollEnabled, false);
        this.f3156k0 = z10;
        if (z10) {
            H0((StateListDrawable) obtainStyledAttributes.getDrawable(a.j.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(a.j.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(a.j.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(a.j.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        F(context, string, attributeSet, i10, 0);
        int[] iArr2 = f3125p1;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i11, 0);
        if (i12 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i10, 0);
        }
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
    }

    @o0
    public static RecyclerView e0(@m0 View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView e02 = e0(viewGroup.getChildAt(i10));
            if (e02 != null) {
                return e02;
            }
        }
        return null;
    }

    private k0 getScrollingChildHelper() {
        if (this.f3147f1 == null) {
            this.f3147f1 = new k0(this);
        }
        return this.f3147f1;
    }

    public static e0 t0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f3286a;
    }

    public static void v0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f3287b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    public static void z(@m0 e0 e0Var) {
        Reference reference = e0Var.f3221b;
        if (reference != null) {
            Object obj = reference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        e0Var.f3221b = null;
                        return;
                    } else if (view != e0Var.f3220a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void A() {
        int j10 = this.S.j();
        for (int i10 = 0; i10 < j10; i10++) {
            e0 t02 = t0(this.S.i(i10));
            if (!t02.K()) {
                t02.c();
            }
        }
        this.P.e();
    }

    public final void A0(long j10, e0 e0Var, e0 e0Var2) {
        int g10 = this.S.g();
        for (int i10 = 0; i10 < g10; i10++) {
            e0 t02 = t0(this.S.f(i10));
            if (t02 != e0Var && n0(t02) == j10) {
                g gVar = this.f3140c0;
                if (gVar == null || !gVar.i()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + t02 + " \n View Holder 2:" + e0Var + X());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + t02 + " \n View Holder 2:" + e0Var + X());
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb2.append(e0Var2);
        sb2.append(" cannot be found but it is necessary for ");
        sb2.append(e0Var);
        sb2.append(X());
    }

    public boolean A1(int i10, int i11, MotionEvent motionEvent) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i10;
        int i17 = i11;
        MotionEvent motionEvent2 = motionEvent;
        E();
        if (this.f3140c0 != null) {
            int[] iArr = this.f3153i1;
            iArr[0] = 0;
            iArr[1] = 0;
            B1(i16, i17, iArr);
            int[] iArr2 = this.f3153i1;
            int i18 = iArr2[0];
            int i19 = iArr2[1];
            i15 = i19;
            i14 = i18;
            i13 = i16 - i18;
            i12 = i17 - i19;
        } else {
            i15 = 0;
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (!this.f3146f0.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f3153i1;
        iArr3[0] = 0;
        iArr3[1] = 0;
        c(i14, i15, i13, i12, this.f3149g1, 0, iArr3);
        int[] iArr4 = this.f3153i1;
        int i20 = iArr4[0];
        int i21 = i13 - i20;
        int i22 = iArr4[1];
        int i23 = i12 - i22;
        boolean z10 = (i20 == 0 && i22 == 0) ? false : true;
        int i24 = this.J0;
        int[] iArr5 = this.f3149g1;
        int i25 = iArr5[0];
        this.J0 = i24 - i25;
        int i26 = this.K0;
        int i27 = iArr5[1];
        this.K0 = i26 - i27;
        int[] iArr6 = this.f3151h1;
        iArr6[0] = iArr6[0] + i25;
        iArr6[1] = iArr6[1] + i27;
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !f1.g0.l(motionEvent2, 8194)) {
                j1(motionEvent.getX(), (float) i21, motionEvent.getY(), (float) i23);
            }
            D(i10, i11);
        }
        if (!(i14 == 0 && i15 == 0)) {
            Q(i14, i15);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i14 == 0 && i15 == 0) ? false : true;
    }

    public void B() {
        List<q> list = this.f3167t0;
        if (list != null) {
            list.clear();
        }
    }

    public boolean B0() {
        return this.f3154j0;
    }

    public void B1(int i10, int i11, @o0 int[] iArr) {
        L1();
        Z0();
        x0.b0.b(H1);
        Y(this.V0);
        int Q12 = i10 != 0 ? this.f3142d0.Q1(i10, this.P, this.V0) : 0;
        int S12 = i11 != 0 ? this.f3142d0.S1(i11, this.P, this.V0) : 0;
        x0.b0.d();
        u1();
        a1();
        M1(false);
        if (iArr != null) {
            iArr[0] = Q12;
            iArr[1] = S12;
        }
    }

    public void C() {
        List<t> list = this.X0;
        if (list != null) {
            list.clear();
        }
    }

    public boolean C0() {
        return !this.f3158l0 || this.f3168u0 || this.R.q();
    }

    public void C1(int i10) {
        if (!this.f3162o0) {
            N1();
            o oVar = this.f3142d0;
            if (oVar != null) {
                oVar.R1(i10);
                awakenScrollBars();
            }
        }
    }

    public void D(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.f3173z0;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.f3173z0.onRelease();
            z10 = this.f3173z0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.B0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.B0.onRelease();
            z10 |= this.B0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.A0.onRelease();
            z10 |= this.A0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.C0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.C0.onRelease();
            z10 |= this.C0.isFinished();
        }
        if (z10) {
            w1.l1(this);
        }
    }

    public final boolean D0() {
        int g10 = this.S.g();
        for (int i10 = 0; i10 < g10; i10++) {
            e0 t02 = t0(this.S.f(i10));
            if (t02 != null && !t02.K() && t02.z()) {
                return true;
            }
        }
        return false;
    }

    public final void D1(@o0 g gVar, boolean z10, boolean z11) {
        g gVar2 = this.f3140c0;
        if (gVar2 != null) {
            gVar2.E(this.O);
            this.f3140c0.x(this);
        }
        if (!z10 || z11) {
            n1();
        }
        this.R.z();
        g gVar3 = this.f3140c0;
        this.f3140c0 = gVar;
        if (gVar != null) {
            gVar.C(this.O);
            gVar.t(this);
        }
        o oVar = this.f3142d0;
        if (oVar != null) {
            oVar.V0(gVar3, this.f3140c0);
        }
        this.P.y(gVar3, this.f3140c0, z10);
        this.V0.f3199g = true;
    }

    public void E() {
        if (!this.f3158l0 || this.f3168u0) {
            x0.b0.b(J1);
            L();
            x0.b0.d();
        } else if (this.R.q()) {
            if (this.R.p(4) && !this.R.p(11)) {
                x0.b0.b(K1);
                L1();
                Z0();
                this.R.x();
                if (!this.f3161n0) {
                    if (D0()) {
                        L();
                    } else {
                        this.R.j();
                    }
                }
                M1(true);
                a1();
            } else if (this.R.q()) {
                x0.b0.b(J1);
                L();
            } else {
                return;
            }
            x0.b0.d();
        }
    }

    public void E0() {
        this.R = new a(new f());
    }

    @g1
    public boolean E1(e0 e0Var, int i10) {
        if (M0()) {
            e0Var.f3236q = i10;
            this.f3155j1.add(e0Var);
            return false;
        }
        w1.P1(e0Var.f3220a, i10);
        return true;
    }

    public final void F(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String x02 = x0(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(x02, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(P1);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                    } catch (NoSuchMethodException e10) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e11) {
                    e11.initCause(e10);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + x02, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + x02, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + x02, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + x02, e14);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + x02, e15);
                } catch (ClassCastException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + x02, e16);
                }
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    public final void F0() {
        if (w1.U(this) == 0) {
            w1.Q1(this, 8);
        }
    }

    public boolean F1(AccessibilityEvent accessibilityEvent) {
        int i10 = 0;
        if (!M0()) {
            return false;
        }
        int d10 = accessibilityEvent != null ? g1.b.d(accessibilityEvent) : 0;
        if (d10 != 0) {
            i10 = d10;
        }
        this.f3164q0 |= i10;
        return true;
    }

    public void G(int i10, int i11) {
        setMeasuredDimension(o.q(i10, getPaddingLeft() + getPaddingRight(), w1.d0(this)), o.q(i11, getPaddingTop() + getPaddingBottom(), w1.c0(this)));
    }

    public final void G0() {
        this.S = new g(new e());
    }

    public void G1(@r0 int i10, @r0 int i11) {
        H1(i10, i11, (Interpolator) null);
    }

    public final boolean H(int i10, int i11) {
        d0(this.f3145e1);
        int[] iArr = this.f3145e1;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    @g1
    public void H0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + X());
        }
        Resources resources = getContext().getResources();
        new k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(a.c.fastscroll_default_thickness), resources.getDimensionPixelSize(a.c.fastscroll_minimum_range), resources.getDimensionPixelOffset(a.c.fastscroll_margin));
    }

    public void H1(@r0 int i10, @r0 int i11, @o0 Interpolator interpolator) {
        I1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    public void I(View view) {
        e0 t02 = t0(view);
        X0(view);
        g gVar = this.f3140c0;
        if (!(gVar == null || t02 == null)) {
            gVar.z(t02);
        }
        List<q> list = this.f3167t0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3167t0.get(size).d(view);
            }
        }
    }

    public void I0() {
        this.C0 = null;
        this.A0 = null;
        this.B0 = null;
        this.f3173z0 = null;
    }

    public void I1(@r0 int i10, @r0 int i11, @o0 Interpolator interpolator, int i12) {
        J1(i10, i11, interpolator, i12, false);
    }

    public void J(View view) {
        e0 t02 = t0(view);
        Y0(view);
        g gVar = this.f3140c0;
        if (!(gVar == null || t02 == null)) {
            gVar.A(t02);
        }
        List<q> list = this.f3167t0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3167t0.get(size).b(view);
            }
        }
    }

    public void J0() {
        if (this.f3146f0.size() != 0) {
            o oVar = this.f3142d0;
            if (oVar != null) {
                oVar.i("Cannot invalidate item decorations during a scroll or layout");
            }
            Q0();
            requestLayout();
        }
    }

    public void J1(@r0 int i10, @r0 int i11, @o0 Interpolator interpolator, int i12, boolean z10) {
        o oVar = this.f3142d0;
        if (oVar != null && !this.f3162o0) {
            int i13 = 0;
            if (!oVar.n()) {
                i10 = 0;
            }
            if (!this.f3142d0.o()) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                if (i12 == Integer.MIN_VALUE || i12 > 0) {
                    if (z10) {
                        if (i10 != 0) {
                            i13 = 1;
                        }
                        if (i11 != 0) {
                            i13 |= 2;
                        }
                        f(i13, 1);
                    }
                    this.S0.f(i10, i11, i12, interpolator);
                    return;
                }
                scrollBy(i10, i11);
            }
        }
    }

    public final void K() {
        int i10 = this.f3164q0;
        this.f3164q0 = 0;
        if (i10 != 0 && K0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            g1.b.i(obtain, i10);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    public boolean K0() {
        AccessibilityManager accessibilityManager = this.f3166s0;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void K1(int i10) {
        o oVar;
        if (!this.f3162o0 && (oVar = this.f3142d0) != null) {
            oVar.f2(this, this.V0, i10);
        }
    }

    public void L() {
        if (this.f3140c0 != null && this.f3142d0 != null) {
            b0 b0Var = this.V0;
            b0Var.f3202j = false;
            if (b0Var.f3197e == 1) {
                M();
            } else if (!this.R.r() && this.f3142d0.z0() == getWidth() && this.f3142d0.e0() == getHeight()) {
                this.f3142d0.U1(this);
                O();
            }
            this.f3142d0.U1(this);
            N();
            O();
        }
    }

    public boolean L0() {
        l lVar = this.D0;
        return lVar != null && lVar.q();
    }

    public void L1() {
        int i10 = this.f3160m0 + 1;
        this.f3160m0 = i10;
        if (i10 == 1 && !this.f3162o0) {
            this.f3161n0 = false;
        }
    }

    public final void M() {
        boolean z10 = true;
        this.V0.a(1);
        Y(this.V0);
        this.V0.f3202j = false;
        L1();
        this.T.f();
        Z0();
        h1();
        y1();
        b0 b0Var = this.V0;
        if (!b0Var.f3203k || !this.Z0) {
            z10 = false;
        }
        b0Var.f3201i = z10;
        this.Z0 = false;
        this.Y0 = false;
        b0Var.f3200h = b0Var.f3204l;
        b0Var.f3198f = this.f3140c0.e();
        d0(this.f3145e1);
        if (this.V0.f3203k) {
            int g10 = this.S.g();
            for (int i10 = 0; i10 < g10; i10++) {
                e0 t02 = t0(this.S.f(i10));
                if (!t02.K() && (!t02.u() || this.f3140c0.i())) {
                    this.T.e(t02, this.D0.w(this.V0, t02, l.e(t02), t02.p()));
                    if (this.V0.f3201i && t02.z() && !t02.w() && !t02.K() && !t02.u()) {
                        this.T.c(n0(t02), t02);
                    }
                }
            }
        }
        if (this.V0.f3204l) {
            z1();
            b0 b0Var2 = this.V0;
            boolean z11 = b0Var2.f3199g;
            b0Var2.f3199g = false;
            this.f3142d0.o1(this.P, b0Var2);
            this.V0.f3199g = z11;
            for (int i11 = 0; i11 < this.S.g(); i11++) {
                e0 t03 = t0(this.S.f(i11));
                if (!t03.K() && !this.T.i(t03)) {
                    int e10 = l.e(t03);
                    boolean q10 = t03.q(8192);
                    if (!q10) {
                        e10 |= 4096;
                    }
                    l.d w10 = this.D0.w(this.V0, t03, e10, t03.p());
                    if (q10) {
                        k1(t03, w10);
                    } else {
                        this.T.a(t03, w10);
                    }
                }
            }
        }
        A();
        a1();
        M1(false);
        this.V0.f3197e = 2;
    }

    public boolean M0() {
        return this.f3170w0 > 0;
    }

    public void M1(boolean z10) {
        if (this.f3160m0 < 1) {
            this.f3160m0 = 1;
        }
        if (!z10 && !this.f3162o0) {
            this.f3161n0 = false;
        }
        if (this.f3160m0 == 1) {
            if (z10 && this.f3161n0 && !this.f3162o0 && this.f3142d0 != null && this.f3140c0 != null) {
                L();
            }
            if (!this.f3162o0) {
                this.f3161n0 = false;
            }
        }
        this.f3160m0--;
    }

    public final void N() {
        L1();
        Z0();
        this.V0.a(6);
        this.R.k();
        this.V0.f3198f = this.f3140c0.e();
        b0 b0Var = this.V0;
        b0Var.f3196d = 0;
        b0Var.f3200h = false;
        this.f3142d0.o1(this.P, b0Var);
        b0 b0Var2 = this.V0;
        b0Var2.f3199g = false;
        this.Q = null;
        b0Var2.f3203k = b0Var2.f3203k && this.D0 != null;
        b0Var2.f3197e = 4;
        a1();
        M1(false);
    }

    @Deprecated
    public boolean N0() {
        return isLayoutSuppressed();
    }

    public void N1() {
        setScrollState(0);
        O1();
    }

    public final void O() {
        this.V0.a(4);
        L1();
        Z0();
        b0 b0Var = this.V0;
        b0Var.f3197e = 1;
        if (b0Var.f3203k) {
            for (int g10 = this.S.g() - 1; g10 >= 0; g10--) {
                e0 t02 = t0(this.S.f(g10));
                if (!t02.K()) {
                    long n02 = n0(t02);
                    l.d v10 = this.D0.v(this.V0, t02);
                    e0 g11 = this.T.g(n02);
                    if (g11 != null && !g11.K()) {
                        boolean h10 = this.T.h(g11);
                        boolean h11 = this.T.h(t02);
                        if (!h10 || g11 != t02) {
                            l.d n10 = this.T.n(g11);
                            this.T.d(t02, v10);
                            l.d m10 = this.T.m(t02);
                            if (n10 == null) {
                                A0(n02, t02, g11);
                            } else {
                                t(g11, t02, n10, m10, h10, h11);
                            }
                        }
                    }
                    this.T.d(t02, v10);
                }
            }
            this.T.o(this.f3159l1);
        }
        this.f3142d0.E1(this.P);
        b0 b0Var2 = this.V0;
        b0Var2.f3195c = b0Var2.f3198f;
        this.f3168u0 = false;
        this.f3169v0 = false;
        b0Var2.f3203k = false;
        b0Var2.f3204l = false;
        this.f3142d0.f3269h = false;
        ArrayList<e0> arrayList = this.P.f3299b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.f3142d0;
        if (oVar.f3275n) {
            oVar.f3274m = 0;
            oVar.f3275n = false;
            this.P.L();
        }
        this.f3142d0.p1(this.V0);
        a1();
        M1(false);
        this.T.f();
        int[] iArr = this.f3145e1;
        if (H(iArr[0], iArr[1])) {
            Q(0, 0);
        }
        l1();
        w1();
    }

    public final boolean O0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || a0(view2) == null) {
            return false;
        }
        if (view == null || a0(view) == null) {
            return true;
        }
        this.W.set(0, 0, view.getWidth(), view.getHeight());
        this.f3136a0.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.W);
        offsetDescendantRectToMyCoords(view2, this.f3136a0);
        char c10 = 65535;
        int i12 = this.f3142d0.i0() == 1 ? -1 : 1;
        Rect rect = this.W;
        int i13 = rect.left;
        Rect rect2 = this.f3136a0;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 <= 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 >= 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + X());
    }

    public final void O1() {
        this.S0.g();
        o oVar = this.f3142d0;
        if (oVar != null) {
            oVar.i2();
        }
    }

    public void P(int i10) {
        o oVar = this.f3142d0;
        if (oVar != null) {
            oVar.v1(i10);
        }
        d1(i10);
        t tVar = this.W0;
        if (tVar != null) {
            tVar.a(this, i10);
        }
        List<t> list = this.X0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.X0.get(size).a(this, i10);
            }
        }
    }

    public void P0(int i10) {
        if (this.f3142d0 != null) {
            setScrollState(2);
            this.f3142d0.R1(i10);
            awakenScrollBars();
        }
    }

    public void P1(@o0 g gVar, boolean z10) {
        setLayoutFrozen(false);
        D1(gVar, true, z10);
        i1(true);
        requestLayout();
    }

    public void Q(int i10, int i11) {
        this.f3171x0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        e1(i10, i11);
        t tVar = this.W0;
        if (tVar != null) {
            tVar.b(this, i10, i11);
        }
        List<t> list = this.X0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.X0.get(size).b(this, i10, i11);
            }
        }
        this.f3171x0--;
    }

    public void Q0() {
        int j10 = this.S.j();
        for (int i10 = 0; i10 < j10; i10++) {
            ((p) this.S.i(i10).getLayoutParams()).f3288c = true;
        }
        this.P.t();
    }

    public void Q1(int i10, int i11, Object obj) {
        int i12;
        int j10 = this.S.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < j10; i14++) {
            View i15 = this.S.i(i14);
            e0 t02 = t0(i15);
            if (t02 != null && !t02.K() && (i12 = t02.f3222c) >= i10 && i12 < i13) {
                t02.b(2);
                t02.a(obj);
                ((p) i15.getLayoutParams()).f3288c = true;
            }
        }
        this.P.N(i10, i11);
    }

    public void R() {
        int i10;
        for (int size = this.f3155j1.size() - 1; size >= 0; size--) {
            e0 e0Var = this.f3155j1.get(size);
            if (e0Var.f3220a.getParent() == this && !e0Var.K() && (i10 = e0Var.f3236q) != -1) {
                w1.P1(e0Var.f3220a, i10);
                e0Var.f3236q = -1;
            }
        }
        this.f3155j1.clear();
    }

    public void R0() {
        int j10 = this.S.j();
        for (int i10 = 0; i10 < j10; i10++) {
            e0 t02 = t0(this.S.i(i10));
            if (t02 != null && !t02.K()) {
                t02.b(6);
            }
        }
        Q0();
        this.P.u();
    }

    public final boolean S(MotionEvent motionEvent) {
        s sVar = this.f3150h0;
        if (sVar != null) {
            sVar.a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f3150h0 = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return c0(motionEvent);
        }
    }

    public void S0(@r0 int i10) {
        int g10 = this.S.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.S.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void T() {
        int i10;
        int i11;
        if (this.C0 == null) {
            EdgeEffect a10 = this.f3172y0.a(this, 3);
            this.C0 = a10;
            if (this.U) {
                i11 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i10 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i11 = getMeasuredWidth();
                i10 = getMeasuredHeight();
            }
            a10.setSize(i11, i10);
        }
    }

    public void T0(@r0 int i10) {
        int g10 = this.S.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.S.f(i11).offsetTopAndBottom(i10);
        }
    }

    public void U() {
        int i10;
        int i11;
        if (this.f3173z0 == null) {
            EdgeEffect a10 = this.f3172y0.a(this, 0);
            this.f3173z0 = a10;
            if (this.U) {
                i11 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i10 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i11 = getMeasuredHeight();
                i10 = getMeasuredWidth();
            }
            a10.setSize(i11, i10);
        }
    }

    public void U0(int i10, int i11) {
        int j10 = this.S.j();
        for (int i12 = 0; i12 < j10; i12++) {
            e0 t02 = t0(this.S.i(i12));
            if (t02 != null && !t02.K() && t02.f3222c >= i10) {
                t02.B(i11, false);
                this.V0.f3199g = true;
            }
        }
        this.P.v(i10, i11);
        requestLayout();
    }

    public void V() {
        int i10;
        int i11;
        if (this.B0 == null) {
            EdgeEffect a10 = this.f3172y0.a(this, 2);
            this.B0 = a10;
            if (this.U) {
                i11 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i10 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i11 = getMeasuredHeight();
                i10 = getMeasuredWidth();
            }
            a10.setSize(i11, i10);
        }
    }

    public void V0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int j10 = this.S.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < j10; i16++) {
            e0 t02 = t0(this.S.i(i16));
            if (t02 != null && (i15 = t02.f3222c) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    t02.B(i11 - i10, false);
                } else {
                    t02.B(i14, false);
                }
                this.V0.f3199g = true;
            }
        }
        this.P.w(i10, i11);
        requestLayout();
    }

    public void W() {
        int i10;
        int i11;
        if (this.A0 == null) {
            EdgeEffect a10 = this.f3172y0.a(this, 1);
            this.A0 = a10;
            if (this.U) {
                i11 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i10 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i11 = getMeasuredWidth();
                i10 = getMeasuredHeight();
            }
            a10.setSize(i11, i10);
        }
    }

    public void W0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int j10 = this.S.j();
        for (int i13 = 0; i13 < j10; i13++) {
            e0 t02 = t0(this.S.i(i13));
            if (t02 != null && !t02.K()) {
                int i14 = t02.f3222c;
                if (i14 >= i12) {
                    t02.B(-i11, z10);
                } else if (i14 >= i10) {
                    t02.i(i10 - 1, -i11, z10);
                }
                this.V0.f3199g = true;
            }
        }
        this.P.x(i10, i11, z10);
        requestLayout();
    }

    public String X() {
        return " " + super.toString() + ", adapter:" + this.f3140c0 + ", layout:" + this.f3142d0 + ", context:" + getContext();
    }

    public void X0(@m0 View view) {
    }

    public final void Y(b0 b0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.S0.Q;
            b0Var.f3208p = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.f3209q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        b0Var.f3208p = 0;
        b0Var.f3209q = 0;
    }

    public void Y0(@m0 View view) {
    }

    @o0
    public View Z(float f10, float f11) {
        for (int g10 = this.S.g() - 1; g10 >= 0; g10--) {
            View f12 = this.S.f(g10);
            float translationX = f12.getTranslationX();
            float translationY = f12.getTranslationY();
            if (f10 >= ((float) f12.getLeft()) + translationX && f10 <= ((float) f12.getRight()) + translationX && f11 >= ((float) f12.getTop()) + translationY && f11 <= ((float) f12.getBottom()) + translationY) {
                return f12;
            }
        }
        return null;
    }

    public void Z0() {
        this.f3170w0++;
    }

    public boolean a(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().g(i10, i11, i12, i13, iArr, i14);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View a0(@d.m0 android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.a0(android.view.View):android.view.View");
    }

    public void a1() {
        b1(true);
    }

    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        o oVar = this.f3142d0;
        if (oVar == null || !oVar.W0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public boolean b(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    @o0
    public e0 b0(@m0 View view) {
        View a02 = a0(view);
        if (a02 == null) {
            return null;
        }
        return s0(a02);
    }

    public void b1(boolean z10) {
        int i10 = this.f3170w0 - 1;
        this.f3170w0 = i10;
        if (i10 < 1) {
            this.f3170w0 = 0;
            if (z10) {
                K();
                R();
            }
        }
    }

    public final void c(int i10, int i11, int i12, int i13, int[] iArr, int i14, @m0 int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final boolean c0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f3148g0.size();
        int i10 = 0;
        while (i10 < size) {
            s sVar = this.f3148g0.get(i10);
            if (!sVar.c(this, motionEvent) || action == 3) {
                i10++;
            } else {
                this.f3150h0 = sVar;
                return true;
            }
        }
        return false;
    }

    public final void c1(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.F0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.F0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.J0 = x10;
            this.H0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.K0 = y10;
            this.I0 = y10;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.f3142d0.p((p) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        o oVar = this.f3142d0;
        if (oVar != null && oVar.n()) {
            return this.f3142d0.t(this.V0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        o oVar = this.f3142d0;
        if (oVar != null && oVar.n()) {
            return this.f3142d0.u(this.V0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        o oVar = this.f3142d0;
        if (oVar != null && oVar.n()) {
            return this.f3142d0.v(this.V0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        o oVar = this.f3142d0;
        if (oVar != null && oVar.o()) {
            return this.f3142d0.w(this.V0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        o oVar = this.f3142d0;
        if (oVar != null && oVar.o()) {
            return this.f3142d0.x(this.V0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        o oVar = this.f3142d0;
        if (oVar != null && oVar.o()) {
            return this.f3142d0.y(this.V0);
        }
        return 0;
    }

    public boolean d(int i10) {
        return getScrollingChildHelper().l(i10);
    }

    public final void d0(int[] iArr) {
        int g10 = this.S.g();
        if (g10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < g10; i12++) {
            e0 t02 = t0(this.S.f(i12));
            if (!t02.K()) {
                int m10 = t02.m();
                if (m10 < i10) {
                    i10 = m10;
                }
                if (m10 > i11) {
                    i11 = m10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public void d1(int i10) {
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z10;
        int i10;
        float f10;
        super.draw(canvas);
        int size = this.f3146f0.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            this.f3146f0.get(i11).k(canvas, this, this.V0);
        }
        EdgeEffect edgeEffect = this.f3173z0;
        boolean z12 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.U ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f3173z0;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.A0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.U) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.A0;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.B0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.U ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.B0;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.C0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.U) {
                f10 = (float) ((-getWidth()) + getPaddingRight());
                i10 = (-getHeight()) + getPaddingBottom();
            } else {
                f10 = (float) (-getWidth());
                i10 = -getHeight();
            }
            canvas.translate(f10, (float) i10);
            EdgeEffect edgeEffect8 = this.C0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.D0 == null || this.f3146f0.size() <= 0 || !this.D0.q()) {
            z12 = z10;
        }
        if (z12) {
            w1.l1(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public void e1(@r0 int i10, @r0 int i11) {
    }

    public boolean f(int i10, int i11) {
        return getScrollingChildHelper().s(i10, i11);
    }

    @o0
    public final View f0() {
        e0 g02;
        b0 b0Var = this.V0;
        int i10 = b0Var.f3205m;
        if (i10 == -1) {
            i10 = 0;
        }
        int d10 = b0Var.d();
        int i11 = i10;
        while (i11 < d10) {
            e0 g03 = g0(i11);
            if (g03 == null) {
                break;
            } else if (g03.f3220a.hasFocusable()) {
                return g03.f3220a;
            } else {
                i11++;
            }
        }
        int min = Math.min(d10, i10);
        while (true) {
            min--;
            if (min < 0 || (g02 = g0(min)) == null) {
                return null;
            }
            if (g02.f3220a.hasFocusable()) {
                return g02.f3220a;
            }
        }
    }

    public void f1() {
        if (!this.f3139b1 && this.f3152i0) {
            w1.n1(this, this.f3157k1);
            this.f3139b1 = true;
        }
    }

    public View focusSearch(View view, int i10) {
        View view2;
        boolean z10;
        View h12 = this.f3142d0.h1(view, i10);
        if (h12 != null) {
            return h12;
        }
        boolean z11 = true;
        boolean z12 = this.f3140c0 != null && this.f3142d0 != null && !M0() && !this.f3162o0;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z12 || !(i10 == 2 || i10 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i10);
            if (findNextFocus != null || !z12) {
                view2 = findNextFocus;
            } else {
                E();
                if (a0(view) == null) {
                    return null;
                }
                L1();
                view2 = this.f3142d0.a1(view, i10, this.P, this.V0);
                M1(false);
            }
        } else {
            if (this.f3142d0.o()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = instance.findNextFocus(this, view, i11) == null;
                if (f3130u1) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f3142d0.n()) {
                int i12 = (this.f3142d0.i0() == 1) ^ (i10 == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i12) != null) {
                    z11 = false;
                }
                if (f3130u1) {
                    i10 = i12;
                }
                z10 = z11;
            }
            if (z10) {
                E();
                if (a0(view) == null) {
                    return null;
                }
                L1();
                this.f3142d0.a1(view, i10, this.P, this.V0);
                M1(false);
            }
            view2 = instance.findNextFocus(this, view, i10);
        }
        if (view2 == null || view2.hasFocusable()) {
            return O0(view, view2, i10) ? view2 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        v1(view2, (View) null);
        return view;
    }

    public void g(int i10) {
        getScrollingChildHelper().u(i10);
    }

    @o0
    public e0 g0(int i10) {
        e0 e0Var = null;
        if (this.f3168u0) {
            return null;
        }
        int j10 = this.S.j();
        for (int i11 = 0; i11 < j10; i11++) {
            e0 t02 = t0(this.S.i(i11));
            if (t02 != null && !t02.w() && m0(t02) == i10) {
                if (!this.S.n(t02.f3220a)) {
                    return t02;
                }
                e0Var = t02;
            }
        }
        return e0Var;
    }

    public final boolean g1() {
        return this.D0 != null && this.f3142d0.j2();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.f3142d0;
        if (oVar != null) {
            return oVar.K();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + X());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.f3142d0;
        if (oVar != null) {
            return oVar.L(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + X());
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f3142d0;
        if (oVar != null) {
            return oVar.M(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + X());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @o0
    public g getAdapter() {
        return this.f3140c0;
    }

    public int getBaseline() {
        o oVar = this.f3142d0;
        return oVar != null ? oVar.N() : super.getBaseline();
    }

    public int getChildDrawingOrder(int i10, int i11) {
        j jVar = this.f3143d1;
        return jVar == null ? super.getChildDrawingOrder(i10, i11) : jVar.a(i10, i11);
    }

    public boolean getClipToPadding() {
        return this.U;
    }

    @o0
    public y getCompatAccessibilityDelegate() {
        return this.f3141c1;
    }

    @m0
    public k getEdgeEffectFactory() {
        return this.f3172y0;
    }

    @o0
    public l getItemAnimator() {
        return this.D0;
    }

    public int getItemDecorationCount() {
        return this.f3146f0.size();
    }

    @o0
    public o getLayoutManager() {
        return this.f3142d0;
    }

    public int getMaxFlingVelocity() {
        return this.O0;
    }

    public int getMinFlingVelocity() {
        return this.N0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f3129t1) {
            return System.nanoTime();
        }
        return 0;
    }

    @o0
    public r getOnFlingListener() {
        return this.M0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.R0;
    }

    @m0
    public v getRecycledViewPool() {
        return this.P.j();
    }

    public int getScrollState() {
        return this.E0;
    }

    public void h(int i10, int i11) {
        if (i10 < 0) {
            U();
            if (this.f3173z0.isFinished()) {
                this.f3173z0.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            V();
            if (this.B0.isFinished()) {
                this.B0.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            W();
            if (this.A0.isFinished()) {
                this.A0.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            T();
            if (this.C0.isFinished()) {
                this.C0.onAbsorb(i11);
            }
        }
        if (i10 != 0 || i11 != 0) {
            w1.l1(this);
        }
    }

    public e0 h0(long j10) {
        g gVar = this.f3140c0;
        e0 e0Var = null;
        if (gVar != null && gVar.i()) {
            int j11 = this.S.j();
            for (int i10 = 0; i10 < j11; i10++) {
                e0 t02 = t0(this.S.i(i10));
                if (t02 != null && !t02.w() && t02.k() == j10) {
                    if (!this.S.n(t02.f3220a)) {
                        return t02;
                    }
                    e0Var = t02;
                }
            }
        }
        return e0Var;
    }

    public final void h1() {
        boolean z10;
        if (this.f3168u0) {
            this.R.z();
            if (this.f3169v0) {
                this.f3142d0.j1(this);
            }
        }
        if (g1()) {
            this.R.x();
        } else {
            this.R.k();
        }
        boolean z11 = false;
        boolean z12 = this.Y0 || this.Z0;
        this.V0.f3203k = this.f3158l0 && this.D0 != null && ((z10 = this.f3168u0) || z12 || this.f3142d0.f3269h) && (!z10 || this.f3140c0.i());
        b0 b0Var = this.V0;
        if (b0Var.f3203k && z12 && !this.f3168u0 && g1()) {
            z11 = true;
        }
        b0Var.f3204l = z11;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    @o0
    public e0 i0(int i10) {
        return k0(i10, false);
    }

    public void i1(boolean z10) {
        this.f3169v0 = z10 | this.f3169v0;
        this.f3168u0 = true;
        R0();
    }

    public boolean isAttachedToWindow() {
        return this.f3152i0;
    }

    public final boolean isLayoutSuppressed() {
        return this.f3162o0;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    @o0
    @Deprecated
    public e0 j0(int i10) {
        return k0(i10, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j1(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0021
            r6.U()
            android.widget.EdgeEffect r1 = r6.f3173z0
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
        L_0x001c:
            androidx.core.widget.i.e(r1, r4, r9)
            r9 = r3
            goto L_0x0039
        L_0x0021:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0038
            r6.V()
            android.widget.EdgeEffect r1 = r6.B0
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0053
            r6.W()
            android.widget.EdgeEffect r9 = r6.A0
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.i.e(r9, r1, r7)
            goto L_0x006f
        L_0x0053:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x006e
            r6.T()
            android.widget.EdgeEffect r9 = r6.C0
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.i.e(r9, r1, r2)
            goto L_0x006f
        L_0x006e:
            r3 = r9
        L_0x006f:
            if (r3 != 0) goto L_0x0079
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            f1.w1.l1(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.j1(float, float, float, float):void");
    }

    @o0
    public e0 k0(int i10, boolean z10) {
        int j10 = this.S.j();
        e0 e0Var = null;
        for (int i11 = 0; i11 < j10; i11++) {
            e0 t02 = t0(this.S.i(i11));
            if (t02 != null && !t02.w()) {
                if (z10) {
                    if (t02.f3222c != i10) {
                        continue;
                    }
                } else if (t02.m() != i10) {
                    continue;
                }
                if (!this.S.n(t02.f3220a)) {
                    return t02;
                }
                e0Var = t02;
            }
        }
        return e0Var;
    }

    public void k1(e0 e0Var, l.d dVar) {
        e0Var.G(0, 8192);
        if (this.V0.f3201i && e0Var.z() && !e0Var.w() && !e0Var.K()) {
            this.T.c(n0(e0Var), e0Var);
        }
        this.T.e(e0Var, dVar);
    }

    public boolean l0(int i10, int i11) {
        o oVar = this.f3142d0;
        if (oVar == null || this.f3162o0) {
            return false;
        }
        boolean n10 = oVar.n();
        boolean o10 = this.f3142d0.o();
        if (!n10 || Math.abs(i10) < this.N0) {
            i10 = 0;
        }
        if (!o10 || Math.abs(i11) < this.N0) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        float f10 = (float) i10;
        float f11 = (float) i11;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = n10 || o10;
            dispatchNestedFling(f10, f11, z10);
            r rVar = this.M0;
            if (rVar != null && rVar.a(i10, i11)) {
                return true;
            }
            if (z10) {
                if (o10) {
                    n10 |= true;
                }
                f(n10 ? 1 : 0, 1);
                int i12 = this.O0;
                int max = Math.max(-i12, Math.min(i10, i12));
                int i13 = this.O0;
                this.S0.c(max, Math.max(-i13, Math.min(i11, i13)));
                return true;
            }
        }
        return false;
    }

    public final void l1() {
        View findViewById;
        if (this.R0 && this.f3140c0 != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f3131v1 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.S.n(focusedChild)) {
                            return;
                        }
                    } else if (this.S.g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                e0 h02 = (this.V0.f3206n == -1 || !this.f3140c0.i()) ? null : h0(this.V0.f3206n);
                if (h02 != null && !this.S.n(h02.f3220a) && h02.f3220a.hasFocusable()) {
                    view = h02.f3220a;
                } else if (this.S.g() > 0) {
                    view = f0();
                }
                if (view != null) {
                    int i10 = this.V0.f3207o;
                    if (!(((long) i10) == -1 || (findViewById = view.findViewById(i10)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    public final void m(e0 e0Var) {
        View view = e0Var.f3220a;
        boolean z10 = view.getParent() == this;
        this.P.K(s0(view));
        if (e0Var.y()) {
            this.S.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        g gVar = this.S;
        if (!z10) {
            gVar.b(view, true);
        } else {
            gVar.k(view);
        }
    }

    public int m0(e0 e0Var) {
        if (e0Var.q(524) || !e0Var.t()) {
            return -1;
        }
        return this.R.f(e0Var.f3222c);
    }

    public final void m1() {
        boolean z10;
        EdgeEffect edgeEffect = this.f3173z0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.f3173z0.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.A0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.A0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.B0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.B0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.C0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.C0.isFinished();
        }
        if (z10) {
            w1.l1(this);
        }
    }

    public void n(@m0 n nVar) {
        o(nVar, -1);
    }

    public long n0(e0 e0Var) {
        return this.f3140c0.i() ? e0Var.k() : (long) e0Var.f3222c;
    }

    public void n1() {
        l lVar = this.D0;
        if (lVar != null) {
            lVar.l();
        }
        o oVar = this.f3142d0;
        if (oVar != null) {
            oVar.D1(this.P);
            this.f3142d0.E1(this.P);
        }
        this.P.d();
    }

    public void o(@m0 n nVar, int i10) {
        o oVar = this.f3142d0;
        if (oVar != null) {
            oVar.i("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3146f0.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f3146f0.add(nVar);
        } else {
            this.f3146f0.add(i10, nVar);
        }
        Q0();
        requestLayout();
    }

    public int o0(@m0 View view) {
        e0 t02 = t0(view);
        if (t02 != null) {
            return t02.j();
        }
        return -1;
    }

    public boolean o1(View view) {
        L1();
        boolean r10 = this.S.r(view);
        if (r10) {
            e0 t02 = t0(view);
            this.P.K(t02);
            this.P.D(t02);
        }
        M1(!r10);
        return r10;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3170w0 = 0;
        boolean z10 = true;
        this.f3152i0 = true;
        if (!this.f3158l0 || isLayoutRequested()) {
            z10 = false;
        }
        this.f3158l0 = z10;
        o oVar = this.f3142d0;
        if (oVar != null) {
            oVar.F(this);
        }
        this.f3139b1 = false;
        if (f3129t1) {
            ThreadLocal<l> threadLocal = l.S;
            l lVar = threadLocal.get();
            this.T0 = lVar;
            if (lVar == null) {
                this.T0 = new l();
                Display O2 = w1.O(this);
                float f10 = 60.0f;
                if (!isInEditMode() && O2 != null) {
                    float refreshRate = O2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                l lVar2 = this.T0;
                lVar2.Q = (long) (1.0E9f / f10);
                threadLocal.set(lVar2);
            }
            this.T0.a(this);
        }
    }

    public void onDetachedFromWindow() {
        l lVar;
        super.onDetachedFromWindow();
        l lVar2 = this.D0;
        if (lVar2 != null) {
            lVar2.l();
        }
        N1();
        this.f3152i0 = false;
        o oVar = this.f3142d0;
        if (oVar != null) {
            oVar.G(this, this.P);
        }
        this.f3155j1.clear();
        removeCallbacks(this.f3157k1);
        this.T.j();
        if (f3129t1 && (lVar = this.T0) != null) {
            lVar.j(this);
            this.T0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3146f0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3146f0.get(i10).i(canvas, this, this.V0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float f11;
        if (this.f3142d0 != null && !this.f3162o0 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f11 = this.f3142d0.o() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f3142d0.n()) {
                    f10 = motionEvent.getAxisValue(10);
                    if (!(f11 == 0.0f && f10 == 0.0f)) {
                        A1((int) (f10 * this.P0), (int) (f11 * this.Q0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f3142d0.o()) {
                        f11 = -axisValue;
                    } else if (this.f3142d0.n()) {
                        f10 = axisValue;
                        f11 = 0.0f;
                        A1((int) (f10 * this.P0), (int) (f11 * this.Q0), motionEvent);
                    }
                }
                f11 = 0.0f;
                f10 = 0.0f;
                A1((int) (f10 * this.P0), (int) (f11 * this.Q0), motionEvent);
            }
            f10 = 0.0f;
            A1((int) (f10 * this.P0), (int) (f11 * this.Q0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f3162o0) {
            return false;
        }
        this.f3150h0 = null;
        if (c0(motionEvent)) {
            y();
            return true;
        }
        o oVar = this.f3142d0;
        if (oVar == null) {
            return false;
        }
        boolean n10 = oVar.n();
        boolean o10 = this.f3142d0.o();
        if (this.G0 == null) {
            this.G0 = VelocityTracker.obtain();
        }
        this.G0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f3163p0) {
                this.f3163p0 = false;
            }
            this.F0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.J0 = x10;
            this.H0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.K0 = y10;
            this.I0 = y10;
            if (this.E0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                g(1);
            }
            int[] iArr = this.f3151h1;
            iArr[1] = 0;
            iArr[0] = 0;
            if (o10) {
                n10 |= true;
            }
            f(n10 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.G0.clear();
            g(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.F0);
            if (findPointerIndex < 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error processing scroll; pointer index for id ");
                sb2.append(this.F0);
                sb2.append(" not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.E0 != 1) {
                int i10 = x11 - this.H0;
                int i11 = y11 - this.I0;
                if (!n10 || Math.abs(i10) <= this.L0) {
                    z10 = false;
                } else {
                    this.J0 = x11;
                    z10 = true;
                }
                if (o10 && Math.abs(i11) > this.L0) {
                    this.K0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            y();
        } else if (actionMasked == 5) {
            this.F0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.J0 = x12;
            this.H0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.K0 = y12;
            this.I0 = y12;
        } else if (actionMasked == 6) {
            c1(motionEvent);
        }
        return this.E0 == 1;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        x0.b0.b(I1);
        L();
        x0.b0.d();
        this.f3158l0 = true;
    }

    public void onMeasure(int i10, int i11) {
        o oVar = this.f3142d0;
        if (oVar == null) {
            G(i10, i11);
            return;
        }
        boolean z10 = false;
        if (oVar.F0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f3142d0.q1(this.P, this.V0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            if (!z10 && this.f3140c0 != null) {
                if (this.V0.f3197e == 1) {
                    M();
                }
                this.f3142d0.W1(i10, i11);
                this.V0.f3202j = true;
                N();
                this.f3142d0.Z1(i10, i11);
                if (this.f3142d0.d2()) {
                    this.f3142d0.W1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.V0.f3202j = true;
                    N();
                    this.f3142d0.Z1(i10, i11);
                }
            }
        } else if (this.f3154j0) {
            this.f3142d0.q1(this.P, this.V0, i10, i11);
        } else {
            if (this.f3165r0) {
                L1();
                Z0();
                h1();
                a1();
                b0 b0Var = this.V0;
                if (b0Var.f3204l) {
                    b0Var.f3200h = true;
                } else {
                    this.R.k();
                    this.V0.f3200h = false;
                }
                this.f3165r0 = false;
                M1(false);
            } else if (this.V0.f3204l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.f3140c0;
            if (gVar != null) {
                this.V0.f3198f = gVar.e();
            } else {
                this.V0.f3198f = 0;
            }
            L1();
            this.f3142d0.q1(this.P, this.V0, i10, i11);
            M1(false);
            this.V0.f3200h = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (M0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.Q = savedState;
        super.onRestoreInstanceState(savedState.a());
        o oVar = this.f3142d0;
        if (oVar != null && (parcelable2 = this.Q.Q) != null) {
            oVar.t1(parcelable2);
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.Q;
        if (savedState2 != null) {
            savedState.b(savedState2);
        } else {
            o oVar = this.f3142d0;
            savedState.Q = oVar != null ? oVar.u1() : null;
        }
        return savedState;
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            I0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f3162o0
            r8 = 0
            if (r0 != 0) goto L_0x01d2
            boolean r0 = r6.f3163p0
            if (r0 == 0) goto L_0x000f
            goto L_0x01d2
        L_0x000f:
            boolean r0 = r17.S(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.y()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f3142d0
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.n()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f3142d0
            boolean r11 = r0.o()
            android.view.VelocityTracker r0 = r6.G0
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.G0 = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f3151h1
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f3151h1
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01a6
            if (r0 == r9) goto L_0x0164
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01c7
        L_0x0066:
            r17.c1(r18)
            goto L_0x01c7
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.F0 = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.J0 = r0
            r6.H0 = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.K0 = r0
            r6.I0 = r0
            goto L_0x01c7
        L_0x0087:
            r17.y()
            goto L_0x01c7
        L_0x008c:
            int r0 = r6.F0
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.F0
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            return r8
        L_0x00a9:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.J0
            int r0 = r0 - r13
            int r1 = r6.K0
            int r1 = r1 - r14
            int r2 = r6.E0
            if (r2 == r9) goto L_0x00ee
            if (r10 == 0) goto L_0x00d4
            int r2 = r6.L0
            if (r0 <= 0) goto L_0x00cb
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d0
        L_0x00cb:
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d0:
            if (r0 == 0) goto L_0x00d4
            r2 = r9
            goto L_0x00d5
        L_0x00d4:
            r2 = r8
        L_0x00d5:
            if (r11 == 0) goto L_0x00e9
            int r3 = r6.L0
            if (r1 <= 0) goto L_0x00e1
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00e6
        L_0x00e1:
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00e6:
            if (r1 == 0) goto L_0x00e9
            r2 = r9
        L_0x00e9:
            if (r2 == 0) goto L_0x00ee
            r6.setScrollState(r9)
        L_0x00ee:
            r15 = r0
            r16 = r1
            int r0 = r6.E0
            if (r0 != r9) goto L_0x01c7
            int[] r3 = r6.f3153i1
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x00ff
            r1 = r15
            goto L_0x0100
        L_0x00ff:
            r1 = r8
        L_0x0100:
            if (r11 == 0) goto L_0x0105
            r2 = r16
            goto L_0x0106
        L_0x0105:
            r2 = r8
        L_0x0106:
            int[] r4 = r6.f3149g1
            r5 = 0
            r0 = r17
            boolean r0 = r0.b(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0133
            int[] r0 = r6.f3153i1
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f3151h1
            r1 = r0[r8]
            int[] r2 = r6.f3149g1
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0133:
            r0 = r16
            int[] r1 = r6.f3149g1
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.J0 = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.K0 = r14
            if (r10 == 0) goto L_0x0145
            r1 = r15
            goto L_0x0146
        L_0x0145:
            r1 = r8
        L_0x0146:
            if (r11 == 0) goto L_0x014a
            r2 = r0
            goto L_0x014b
        L_0x014a:
            r2 = r8
        L_0x014b:
            boolean r1 = r6.A1(r1, r2, r7)
            if (r1 == 0) goto L_0x0158
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0158:
            androidx.recyclerview.widget.l r1 = r6.T0
            if (r1 == 0) goto L_0x01c7
            if (r15 != 0) goto L_0x0160
            if (r0 == 0) goto L_0x01c7
        L_0x0160:
            r1.f(r6, r15, r0)
            goto L_0x01c7
        L_0x0164:
            android.view.VelocityTracker r0 = r6.G0
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.G0
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.O0
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x0180
            android.view.VelocityTracker r1 = r6.G0
            int r2 = r6.F0
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x0181
        L_0x0180:
            r1 = r0
        L_0x0181:
            if (r11 == 0) goto L_0x018d
            android.view.VelocityTracker r2 = r6.G0
            int r3 = r6.F0
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x018e
        L_0x018d:
            r2 = r0
        L_0x018e:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x0196
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x019e
        L_0x0196:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.l0(r0, r1)
            if (r0 != 0) goto L_0x01a1
        L_0x019e:
            r6.setScrollState(r8)
        L_0x01a1:
            r17.x1()
            r8 = r9
            goto L_0x01c7
        L_0x01a6:
            int r0 = r7.getPointerId(r8)
            r6.F0 = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.J0 = r0
            r6.H0 = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.K0 = r0
            r6.I0 = r0
            if (r11 == 0) goto L_0x01c4
            r10 = r10 | 2
        L_0x01c4:
            r6.f(r10, r8)
        L_0x01c7:
            if (r8 != 0) goto L_0x01ce
            android.view.VelocityTracker r0 = r6.G0
            r0.addMovement(r12)
        L_0x01ce:
            r12.recycle()
            return r9
        L_0x01d2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(@m0 q qVar) {
        if (this.f3167t0 == null) {
            this.f3167t0 = new ArrayList();
        }
        this.f3167t0.add(qVar);
    }

    public long p0(@m0 View view) {
        e0 t02;
        g gVar = this.f3140c0;
        if (gVar == null || !gVar.i() || (t02 = t0(view)) == null) {
            return -1;
        }
        return t02.k();
    }

    public void p1(@m0 n nVar) {
        o oVar = this.f3142d0;
        if (oVar != null) {
            oVar.i("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3146f0.remove(nVar);
        if (this.f3146f0.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        Q0();
        requestLayout();
    }

    public void q(@m0 s sVar) {
        this.f3148g0.add(sVar);
    }

    public int q0(@m0 View view) {
        e0 t02 = t0(view);
        if (t02 != null) {
            return t02.m();
        }
        return -1;
    }

    public void q1(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 < 0 || i10 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
        }
        p1(z0(i10));
    }

    public void r(@m0 t tVar) {
        if (this.X0 == null) {
            this.X0 = new ArrayList();
        }
        this.X0.add(tVar);
    }

    @Deprecated
    public int r0(@m0 View view) {
        return o0(view);
    }

    public void r1(@m0 q qVar) {
        List<q> list = this.f3167t0;
        if (list != null) {
            list.remove(qVar);
        }
    }

    public void removeDetachedView(View view, boolean z10) {
        e0 t02 = t0(view);
        if (t02 != null) {
            if (t02.y()) {
                t02.f();
            } else if (!t02.K()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + t02 + X());
            }
        }
        view.clearAnimation();
        J(view);
        super.removeDetachedView(view, z10);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3142d0.s1(this, this.V0, view, view2) && view2 != null) {
            v1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f3142d0.L1(this, view, rect, z10);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f3148g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3148g0.get(i10).e(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void requestLayout() {
        if (this.f3160m0 != 0 || this.f3162o0) {
            this.f3161n0 = true;
        } else {
            super.requestLayout();
        }
    }

    public void s(@m0 e0 e0Var, @o0 l.d dVar, @m0 l.d dVar2) {
        e0Var.H(false);
        if (this.D0.a(e0Var, dVar, dVar2)) {
            f1();
        }
    }

    public e0 s0(@m0 View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return t0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void s1(@m0 s sVar) {
        this.f3148g0.remove(sVar);
        if (this.f3150h0 == sVar) {
            this.f3150h0 = null;
        }
    }

    public void scrollBy(int i10, int i11) {
        o oVar = this.f3142d0;
        if (oVar != null && !this.f3162o0) {
            boolean n10 = oVar.n();
            boolean o10 = this.f3142d0.o();
            if (n10 || o10) {
                if (!n10) {
                    i10 = 0;
                }
                if (!o10) {
                    i11 = 0;
                }
                A1(i10, i11, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i10, int i11) {
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!F1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(@o0 y yVar) {
        this.f3141c1 = yVar;
        w1.z1(this, yVar);
    }

    public void setAdapter(@o0 g gVar) {
        setLayoutFrozen(false);
        D1(gVar, false, true);
        i1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@o0 j jVar) {
        if (jVar != this.f3143d1) {
            this.f3143d1 = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    public void setClipToPadding(boolean z10) {
        if (z10 != this.U) {
            I0();
        }
        this.U = z10;
        super.setClipToPadding(z10);
        if (this.f3158l0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@m0 k kVar) {
        e1.n.g(kVar);
        this.f3172y0 = kVar;
        I0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f3154j0 = z10;
    }

    public void setItemAnimator(@o0 l lVar) {
        l lVar2 = this.D0;
        if (lVar2 != null) {
            lVar2.l();
            this.D0.A((l.c) null);
        }
        this.D0 = lVar;
        if (lVar != null) {
            lVar.A(this.f3137a1);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.P.H(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(@o0 o oVar) {
        if (oVar != this.f3142d0) {
            N1();
            if (this.f3142d0 != null) {
                l lVar = this.D0;
                if (lVar != null) {
                    lVar.l();
                }
                this.f3142d0.D1(this.P);
                this.f3142d0.E1(this.P);
                this.P.d();
                if (this.f3152i0) {
                    this.f3142d0.G(this, this.P);
                }
                this.f3142d0.b2((RecyclerView) null);
                this.f3142d0 = null;
            } else {
                this.P.d();
            }
            this.S.o();
            this.f3142d0 = oVar;
            if (oVar != null) {
                if (oVar.f3263b == null) {
                    oVar.b2(this);
                    if (this.f3152i0) {
                        this.f3142d0.F(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f3263b.X());
                }
            }
            this.P.L();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().p(z10);
    }

    public void setOnFlingListener(@o0 r rVar) {
        this.M0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(@o0 t tVar) {
        this.W0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.R0 = z10;
    }

    public void setRecycledViewPool(@o0 v vVar) {
        this.P.F(vVar);
    }

    public void setRecyclerListener(@o0 x xVar) {
        this.f3144e0 = xVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i10) {
        if (i10 != this.E0) {
            this.E0 = i10;
            if (i10 != 2) {
                O1();
            }
            P(i10);
        }
    }

    public void setScrollingTouchSlop(int i10) {
        int i11;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("setScrollingTouchSlop(): bad argument constant ");
                sb2.append(i10);
                sb2.append("; using default value");
            } else {
                i11 = viewConfiguration.getScaledPagingTouchSlop();
                this.L0 = i11;
            }
        }
        i11 = viewConfiguration.getScaledTouchSlop();
        this.L0 = i11;
    }

    public void setViewCacheExtension(@o0 c0 c0Var) {
        this.P.G(c0Var);
    }

    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().r(i10);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().t();
    }

    public final void suppressLayout(boolean z10) {
        if (z10 != this.f3162o0) {
            w("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.f3162o0 = false;
                if (!(!this.f3161n0 || this.f3142d0 == null || this.f3140c0 == null)) {
                    requestLayout();
                }
                this.f3161n0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f3162o0 = true;
            this.f3163p0 = true;
            N1();
        }
    }

    public final void t(@m0 e0 e0Var, @m0 e0 e0Var2, @m0 l.d dVar, @m0 l.d dVar2, boolean z10, boolean z11) {
        e0Var.H(false);
        if (z10) {
            m(e0Var);
        }
        if (e0Var != e0Var2) {
            if (z11) {
                m(e0Var2);
            }
            e0Var.f3227h = e0Var2;
            m(e0Var);
            this.P.K(e0Var);
            e0Var2.H(false);
            e0Var2.f3228i = e0Var;
        }
        if (this.D0.b(e0Var, e0Var2, dVar, dVar2)) {
            f1();
        }
    }

    public void t1(@m0 t tVar) {
        List<t> list = this.X0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    public void u(@m0 e0 e0Var, @m0 l.d dVar, @o0 l.d dVar2) {
        m(e0Var);
        e0Var.H(false);
        if (this.D0.c(e0Var, dVar, dVar2)) {
            f1();
        }
    }

    public void u0(@m0 View view, @m0 Rect rect) {
        v0(view, rect);
    }

    public void u1() {
        e0 e0Var;
        int g10 = this.S.g();
        for (int i10 = 0; i10 < g10; i10++) {
            View f10 = this.S.f(i10);
            e0 s02 = s0(f10);
            if (!(s02 == null || (e0Var = s02.f3228i) == null)) {
                View view = e0Var.f3220a;
                int left = f10.getLeft();
                int top = f10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void v(String str) {
        if (M0()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + X());
        }
        throw new IllegalStateException(str + X());
    }

    public final void v1(@m0 View view, @o0 View view2) {
        View view3 = view2 != null ? view2 : view;
        this.W.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f3288c) {
                Rect rect = pVar.f3287b;
                Rect rect2 = this.W;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.W);
            offsetRectIntoDescendantCoords(view, this.W);
        }
        this.f3142d0.M1(this, view, this.W, !this.f3158l0, view2 == null);
    }

    public void w(String str) {
        if (M0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + X());
            }
            throw new IllegalStateException(str);
        } else if (this.f3171x0 > 0) {
            new IllegalStateException("" + X());
        }
    }

    public final int w0(View view) {
        int id2;
        loop0:
        while (true) {
            id2 = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id2;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id2;
    }

    public final void w1() {
        b0 b0Var = this.V0;
        b0Var.f3206n = -1;
        b0Var.f3205m = -1;
        b0Var.f3207o = -1;
    }

    public boolean x(e0 e0Var) {
        l lVar = this.D0;
        return lVar == null || lVar.g(e0Var, e0Var.p());
    }

    public final String x0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    public final void x1() {
        VelocityTracker velocityTracker = this.G0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        g(0);
        m1();
    }

    public final void y() {
        x1();
        setScrollState(0);
    }

    public Rect y0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f3288c) {
            return pVar.f3287b;
        }
        if (this.V0.j() && (pVar.d() || pVar.f())) {
            return pVar.f3287b;
        }
        Rect rect = pVar.f3287b;
        rect.set(0, 0, 0, 0);
        int size = this.f3146f0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.W.set(0, 0, 0, 0);
            this.f3146f0.get(i10).g(this.W, view, this, this.V0);
            int i11 = rect.left;
            Rect rect2 = this.W;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f3288c = false;
        return rect;
    }

    public final void y1() {
        e0 e0Var = null;
        View focusedChild = (!this.R0 || !hasFocus() || this.f3140c0 == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            e0Var = b0(focusedChild);
        }
        if (e0Var == null) {
            w1();
            return;
        }
        this.V0.f3206n = this.f3140c0.i() ? e0Var.k() : -1;
        this.V0.f3205m = this.f3168u0 ? -1 : e0Var.w() ? e0Var.f3223d : e0Var.j();
        this.V0.f3207o = w0(e0Var.f3220a);
    }

    @m0
    public n z0(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.f3146f0.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void z1() {
        int j10 = this.S.j();
        for (int i10 = 0; i10 < j10; i10++) {
            e0 t02 = t0(this.S.i(i10));
            if (!t02.K()) {
                t02.F();
            }
        }
    }
}

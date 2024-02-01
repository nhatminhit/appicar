package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import d.l;
import d.m0;
import d.o0;
import d.u;
import d.x0;
import f1.j;
import f1.w1;
import g1.z;
import java.util.ArrayList;
import java.util.List;
import m1.c;

public class DrawerLayout extends ViewGroup {
    public static final String C0 = "DrawerLayout";
    public static final int[] D0 = {16843828};
    public static final int E0 = 0;
    public static final int F0 = 1;
    public static final int G0 = 2;
    public static final int H0 = 0;
    public static final int I0 = 1;
    public static final int J0 = 2;
    public static final int K0 = 3;
    public static final int L0 = 64;
    public static final int M0 = 10;
    public static final int N0 = -1728053248;
    public static final int O0 = 160;
    public static final int P0 = 400;
    public static final boolean Q0 = false;
    public static final boolean R0 = true;
    public static final float S0 = 1.0f;
    public static final int[] T0 = {16842931};
    public static final boolean U0 = true;
    public static final boolean V0 = true;
    public Rect A0;
    public Matrix B0;
    public final c O;
    public float P;
    public int Q;
    public int R;
    public float S;
    public Paint T;
    public final m1.c U;
    public final m1.c V;
    public final g W;

    /* renamed from: a0  reason: collision with root package name */
    public final g f2375a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f2376b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2377c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f2378d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f2379e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f2380f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f2381g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f2382h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f2383i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f2384j0;
    @o0

    /* renamed from: k0  reason: collision with root package name */
    public d f2385k0;

    /* renamed from: l0  reason: collision with root package name */
    public List<d> f2386l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f2387m0;

    /* renamed from: n0  reason: collision with root package name */
    public float f2388n0;

    /* renamed from: o0  reason: collision with root package name */
    public Drawable f2389o0;

    /* renamed from: p0  reason: collision with root package name */
    public Drawable f2390p0;

    /* renamed from: q0  reason: collision with root package name */
    public Drawable f2391q0;

    /* renamed from: r0  reason: collision with root package name */
    public CharSequence f2392r0;

    /* renamed from: s0  reason: collision with root package name */
    public CharSequence f2393s0;

    /* renamed from: t0  reason: collision with root package name */
    public Object f2394t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f2395u0;

    /* renamed from: v0  reason: collision with root package name */
    public Drawable f2396v0;

    /* renamed from: w0  reason: collision with root package name */
    public Drawable f2397w0;

    /* renamed from: x0  reason: collision with root package name */
    public Drawable f2398x0;

    /* renamed from: y0  reason: collision with root package name */
    public Drawable f2399y0;

    /* renamed from: z0  reason: collision with root package name */
    public final ArrayList<View> f2400z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int Q = 0;
        public int R;
        public int S;
        public int T;
        public int U;

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

        public SavedState(@m0 Parcel parcel, @o0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Q = parcel.readInt();
            this.R = parcel.readInt();
            this.S = parcel.readInt();
            this.T = parcel.readInt();
            this.U = parcel.readInt();
        }

        public SavedState(@m0 Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.Q);
            parcel.writeInt(this.R);
            parcel.writeInt(this.S);
            parcel.writeInt(this.T);
            parcel.writeInt(this.U);
        }
    }

    public class a implements View.OnApplyWindowInsetsListener {
        public a() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).S(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class b extends f1.a {

        /* renamed from: d  reason: collision with root package name */
        public final Rect f2402d = new Rect();

        public b() {
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence s10;
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View p10 = DrawerLayout.this.p();
            if (p10 == null || (s10 = DrawerLayout.this.s(DrawerLayout.this.t(p10))) == null) {
                return true;
            }
            text.add(s10);
            return true;
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        public void g(View view, z zVar) {
            if (DrawerLayout.U0) {
                super.g(view, zVar);
            } else {
                z E0 = z.E0(zVar);
                super.g(view, E0);
                zVar.G1(view);
                ViewParent k02 = w1.k0(view);
                if (k02 instanceof View) {
                    zVar.x1((View) k02);
                }
                o(zVar, E0);
                E0.H0();
                n(zVar, (ViewGroup) view);
            }
            zVar.U0(DrawerLayout.class.getName());
            zVar.g1(false);
            zVar.h1(false);
            zVar.J0(z.a.f7599f);
            zVar.J0(z.a.f7600g);
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.U0 || DrawerLayout.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        public final void n(z zVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.A(childAt)) {
                    zVar.c(childAt);
                }
            }
        }

        public final void o(z zVar, z zVar2) {
            Rect rect = this.f2402d;
            zVar2.r(rect);
            zVar.P0(rect);
            zVar2.s(rect);
            zVar.Q0(rect);
            zVar.T1(zVar2.A0());
            zVar.v1(zVar2.M());
            zVar.U0(zVar2.v());
            zVar.Y0(zVar2.z());
            zVar.e1(zVar2.n0());
            zVar.V0(zVar2.i0());
            zVar.g1(zVar2.o0());
            zVar.h1(zVar2.p0());
            zVar.N0(zVar2.f0());
            zVar.E1(zVar2.x0());
            zVar.r1(zVar2.s0());
            zVar.a(zVar2.p());
        }
    }

    public static final class c extends f1.a {
        public void g(View view, z zVar) {
            super.g(view, zVar);
            if (!DrawerLayout.A(view)) {
                zVar.x1((View) null);
            }
        }
    }

    public interface d {
        void a(@m0 View view);

        void b(@m0 View view);

        void c(int i10);

        void d(@m0 View view, float f10);
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: e  reason: collision with root package name */
        public static final int f2404e = 1;

        /* renamed from: f  reason: collision with root package name */
        public static final int f2405f = 2;

        /* renamed from: g  reason: collision with root package name */
        public static final int f2406g = 4;

        /* renamed from: a  reason: collision with root package name */
        public int f2407a;

        /* renamed from: b  reason: collision with root package name */
        public float f2408b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2409c;

        /* renamed from: d  reason: collision with root package name */
        public int f2410d;

        public e(int i10, int i11) {
            super(i10, i11);
            this.f2407a = 0;
        }

        public e(int i10, int i11, int i12) {
            this(i10, i11);
            this.f2407a = i12;
        }

        public e(@m0 Context context, @o0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2407a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.T0);
            this.f2407a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public e(@m0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2407a = 0;
        }

        public e(@m0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2407a = 0;
        }

        public e(@m0 e eVar) {
            super(eVar);
            this.f2407a = 0;
            this.f2407a = eVar.f2407a;
        }
    }

    public static abstract class f implements d {
        public void a(View view) {
        }

        public void b(View view) {
        }

        public void c(int i10) {
        }

        public void d(View view, float f10) {
        }
    }

    public class g extends c.C0178c {

        /* renamed from: a  reason: collision with root package name */
        public final int f2411a;

        /* renamed from: b  reason: collision with root package name */
        public m1.c f2412b;

        /* renamed from: c  reason: collision with root package name */
        public final Runnable f2413c = new a();

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                g.this.o();
            }
        }

        public g(int i10) {
            this.f2411a = i10;
        }

        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            if (DrawerLayout.this.c(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i10, width));
        }

        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        public int d(View view) {
            if (DrawerLayout.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public void f(int i10, int i11) {
            DrawerLayout drawerLayout;
            int i12;
            if ((i10 & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i12 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i12 = 5;
            }
            View n10 = drawerLayout.n(i12);
            if (n10 != null && DrawerLayout.this.r(n10) == 0) {
                this.f2412b.d(n10, i11);
            }
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f2413c, 160);
        }

        public void i(View view, int i10) {
            ((e) view.getLayoutParams()).f2409c = false;
            n();
        }

        public void j(int i10) {
            DrawerLayout.this.a0(this.f2411a, i10, this.f2412b.z());
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.c(view, 3) ? (float) (i10 + width) : (float) (DrawerLayout.this.getWidth() - i10)) / ((float) width);
            DrawerLayout.this.Y(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        public void l(View view, float f10, float f11) {
            int i10;
            float u10 = DrawerLayout.this.u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                i10 = (i11 > 0 || (i11 == 0 && u10 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && u10 > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f2412b.T(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        public boolean m(View view, int i10) {
            return DrawerLayout.this.E(view) && DrawerLayout.this.c(view, this.f2411a) && DrawerLayout.this.r(view) == 0;
        }

        public final void n() {
            int i10 = 3;
            if (this.f2411a == 3) {
                i10 = 5;
            }
            View n10 = DrawerLayout.this.n(i10);
            if (n10 != null) {
                DrawerLayout.this.f(n10);
            }
        }

        public void o() {
            View view;
            int i10;
            int A = this.f2412b.A();
            int i11 = 0;
            boolean z10 = this.f2411a == 3;
            if (z10) {
                view = DrawerLayout.this.n(3);
                if (view != null) {
                    i11 = -view.getWidth();
                }
                i10 = i11 + A;
            } else {
                view = DrawerLayout.this.n(5);
                i10 = DrawerLayout.this.getWidth() - A;
            }
            if (view == null) {
                return;
            }
            if (((z10 && view.getLeft() < i10) || (!z10 && view.getLeft() > i10)) && DrawerLayout.this.r(view) == 0) {
                this.f2412b.V(view, i10, view.getTop());
                ((e) view.getLayoutParams()).f2409c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f2413c);
        }

        public void q(m1.c cVar) {
            this.f2412b = cVar;
        }
    }

    public DrawerLayout(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public DrawerLayout(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.O = new c();
        this.R = N0;
        this.T = new Paint();
        this.f2378d0 = true;
        this.f2379e0 = 3;
        this.f2380f0 = 3;
        this.f2381g0 = 3;
        this.f2382h0 = 3;
        this.f2396v0 = null;
        this.f2397w0 = null;
        this.f2398x0 = null;
        this.f2399y0 = null;
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.Q = (int) ((64.0f * f10) + 0.5f);
        float f11 = 400.0f * f10;
        g gVar = new g(3);
        this.W = gVar;
        g gVar2 = new g(5);
        this.f2375a0 = gVar2;
        m1.c p10 = m1.c.p(this, 1.0f, gVar);
        this.U = p10;
        p10.R(1);
        p10.S(f11);
        gVar.q(p10);
        m1.c p11 = m1.c.p(this, 1.0f, gVar2);
        this.V = p11;
        p11.R(2);
        p11.S(f11);
        gVar2.q(p11);
        setFocusableInTouchMode(true);
        w1.P1(this, 1);
        w1.z1(this, new b());
        setMotionEventSplittingEnabled(false);
        if (w1.S(this)) {
            setOnApplyWindowInsetsListener(new a());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(D0);
            try {
                this.f2389o0 = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.P = f10 * 10.0f;
        this.f2400z0 = new ArrayList<>();
    }

    public static boolean A(View view) {
        return (w1.T(view) == 4 || w1.T(view) == 2) ? false : true;
    }

    public static String w(int i10) {
        return (i10 & 3) == 3 ? "LEFT" : (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    public static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public boolean B(View view) {
        return ((e) view.getLayoutParams()).f2407a == 0;
    }

    public boolean C(int i10) {
        View n10 = n(i10);
        if (n10 != null) {
            return D(n10);
        }
        return false;
    }

    public boolean D(@m0 View view) {
        if (E(view)) {
            return (((e) view.getLayoutParams()).f2410d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean E(View view) {
        int d10 = j.d(((e) view.getLayoutParams()).f2407a, w1.X(view));
        return ((d10 & 3) == 0 && (d10 & 5) == 0) ? false : true;
    }

    public boolean F(int i10) {
        View n10 = n(i10);
        if (n10 != null) {
            return G(n10);
        }
        return false;
    }

    public boolean G(@m0 View view) {
        if (E(view)) {
            return ((e) view.getLayoutParams()).f2408b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean H(float f10, float f11, View view) {
        if (this.A0 == null) {
            this.A0 = new Rect();
        }
        view.getHitRect(this.A0);
        return this.A0.contains((int) f10, (int) f11);
    }

    public final boolean I(Drawable drawable, int i10) {
        if (drawable == null || !o0.d.h(drawable)) {
            return false;
        }
        o0.d.m(drawable, i10);
        return true;
    }

    public void J(View view, float f10) {
        float u10 = u(view);
        float width = (float) view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (u10 * width));
        if (!c(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        Y(view, f10);
    }

    public void K(int i10) {
        L(i10, true);
    }

    public void L(int i10, boolean z10) {
        View n10 = n(i10);
        if (n10 != null) {
            N(n10, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void M(@m0 View view) {
        N(view, true);
    }

    public void N(@m0 View view, boolean z10) {
        if (E(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.f2378d0) {
                eVar.f2408b = 1.0f;
                eVar.f2410d = 1;
                Z(view, true);
            } else if (z10) {
                eVar.f2410d |= 2;
                if (c(view, 3)) {
                    this.U.V(view, 0, view.getTop());
                } else {
                    this.V.V(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                J(view, 1.0f);
                a0(eVar.f2407a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void O(@m0 d dVar) {
        List<d> list;
        if (dVar != null && (list = this.f2386l0) != null) {
            list.remove(dVar);
        }
    }

    public final Drawable P() {
        int X = w1.X(this);
        if (X == 0) {
            Drawable drawable = this.f2396v0;
            if (drawable != null) {
                I(drawable, X);
                return this.f2396v0;
            }
        } else {
            Drawable drawable2 = this.f2397w0;
            if (drawable2 != null) {
                I(drawable2, X);
                return this.f2397w0;
            }
        }
        return this.f2398x0;
    }

    public final Drawable Q() {
        int X = w1.X(this);
        if (X == 0) {
            Drawable drawable = this.f2397w0;
            if (drawable != null) {
                I(drawable, X);
                return this.f2397w0;
            }
        } else {
            Drawable drawable2 = this.f2396v0;
            if (drawable2 != null) {
                I(drawable2, X);
                return this.f2396v0;
            }
        }
        return this.f2399y0;
    }

    public final void R() {
        if (!V0) {
            this.f2390p0 = P();
            this.f2391q0 = Q();
        }
    }

    @x0({x0.a.P})
    public void S(Object obj, boolean z10) {
        this.f2394t0 = obj;
        this.f2395u0 = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void T(int i10, int i11) {
        View n10;
        int d10 = j.d(i11, w1.X(this));
        if (i11 == 3) {
            this.f2379e0 = i10;
        } else if (i11 == 5) {
            this.f2380f0 = i10;
        } else if (i11 == 8388611) {
            this.f2381g0 = i10;
        } else if (i11 == 8388613) {
            this.f2382h0 = i10;
        }
        if (i10 != 0) {
            (d10 == 3 ? this.U : this.V).c();
        }
        if (i10 == 1) {
            View n11 = n(d10);
            if (n11 != null) {
                f(n11);
            }
        } else if (i10 == 2 && (n10 = n(d10)) != null) {
            M(n10);
        }
    }

    public void U(int i10, @m0 View view) {
        if (E(view)) {
            T(i10, ((e) view.getLayoutParams()).f2407a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a " + "drawer with appropriate layout_gravity");
    }

    public void V(@u int i10, int i11) {
        W(i0.d.i(getContext(), i10), i11);
    }

    public void W(Drawable drawable, int i10) {
        if (!V0) {
            if ((i10 & j.f7185b) == 8388611) {
                this.f2396v0 = drawable;
            } else if ((i10 & 8388613) == 8388613) {
                this.f2397w0 = drawable;
            } else if ((i10 & 3) == 3) {
                this.f2398x0 = drawable;
            } else if ((i10 & 5) == 5) {
                this.f2399y0 = drawable;
            } else {
                return;
            }
            R();
            invalidate();
        }
    }

    public void X(int i10, @o0 CharSequence charSequence) {
        int d10 = j.d(i10, w1.X(this));
        if (d10 == 3) {
            this.f2392r0 = charSequence;
        } else if (d10 == 5) {
            this.f2393s0 = charSequence;
        }
    }

    public void Y(View view, float f10) {
        e eVar = (e) view.getLayoutParams();
        if (f10 != eVar.f2408b) {
            eVar.f2408b = f10;
            l(view, f10);
        }
    }

    public final void Z(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            w1.P1(childAt, ((z10 || E(childAt)) && (!z10 || childAt != view)) ? 4 : 1);
        }
    }

    public void a(@m0 d dVar) {
        if (dVar != null) {
            if (this.f2386l0 == null) {
                this.f2386l0 = new ArrayList();
            }
            this.f2386l0.add(dVar);
        }
    }

    public void a0(int i10, int i11, View view) {
        int E = this.U.E();
        int E2 = this.V.E();
        int i12 = 2;
        if (E == 1 || E2 == 1) {
            i12 = 1;
        } else if (!(E == 2 || E2 == 2)) {
            i12 = 0;
        }
        if (view != null && i11 == 0) {
            float f10 = ((e) view.getLayoutParams()).f2408b;
            if (f10 == 0.0f) {
                j(view);
            } else if (f10 == 1.0f) {
                k(view);
            }
        }
        if (i12 != this.f2376b0) {
            this.f2376b0 = i12;
            List<d> list = this.f2386l0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2386l0.get(size).c(i12);
                }
            }
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z10 = false;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (!E(childAt)) {
                    this.f2400z0.add(childAt);
                } else if (D(childAt)) {
                    childAt.addFocusables(arrayList, i10, i11);
                    z10 = true;
                }
            }
            if (!z10) {
                int size = this.f2400z0.size();
                for (int i13 = 0; i13 < size; i13++) {
                    View view = this.f2400z0.get(i13);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i10, i11);
                    }
                }
            }
            this.f2400z0.clear();
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        w1.P1(view, (o() != null || E(view)) ? 4 : 1);
        if (!U0) {
            w1.z1(view, this.O);
        }
    }

    public void b() {
        if (!this.f2384j0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f2384j0 = true;
        }
    }

    public boolean c(View view, int i10) {
        return (t(view) & i10) == i10;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            f10 = Math.max(f10, ((e) getChildAt(i10).getLayoutParams()).f2408b);
        }
        this.S = f10;
        boolean o10 = this.U.o(true);
        boolean o11 = this.V.o(true);
        if (o10 || o11) {
            w1.l1(this);
        }
    }

    public void d(int i10) {
        e(i10, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.S <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (H(x10, y10, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        Drawable drawable;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean B = B(view2);
        int width = getWidth();
        int save = canvas.save();
        int i10 = 0;
        if (B) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view2 && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        float f10 = this.S;
        if (f10 <= 0.0f || !B) {
            if (this.f2390p0 != null && c(view2, 3)) {
                int intrinsicWidth = this.f2390p0.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.U.A()), 1.0f));
                this.f2390p0.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f2390p0.setAlpha((int) (max * 255.0f));
                drawable = this.f2390p0;
            } else if (this.f2391q0 != null && c(view2, 5)) {
                int intrinsicWidth2 = this.f2391q0.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.V.A()), 1.0f));
                this.f2391q0.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.f2391q0.setAlpha((int) (max2 * 255.0f));
                drawable = this.f2391q0;
            }
            drawable.draw(canvas);
        } else {
            int i13 = this.R;
            this.T.setColor((i13 & w1.f7299s) | (((int) (((float) ((-16777216 & i13) >>> 24)) * f10)) << 24));
            canvas.drawRect((float) i10, 0.0f, (float) width, (float) getHeight(), this.T);
        }
        return drawChild;
    }

    public void e(int i10, boolean z10) {
        View n10 = n(i10);
        if (n10 != null) {
            g(n10, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void f(@m0 View view) {
        g(view, true);
    }

    public void g(@m0 View view, boolean z10) {
        m1.c cVar;
        int i10;
        if (E(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.f2378d0) {
                eVar.f2408b = 0.0f;
                eVar.f2410d = 0;
            } else if (z10) {
                eVar.f2410d |= 4;
                if (c(view, 3)) {
                    cVar = this.U;
                    i10 = -view.getWidth();
                } else {
                    cVar = this.V;
                    i10 = getWidth();
                }
                cVar.V(view, i10, view.getTop());
            } else {
                J(view, 0.0f);
                a0(eVar.f2407a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (V0) {
            return this.P;
        }
        return 0.0f;
    }

    @o0
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f2389o0;
    }

    public void h() {
        i(false);
    }

    public void i(boolean z10) {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            if (E(childAt) && (!z10 || eVar.f2409c)) {
                z11 |= c(childAt, 3) ? this.U.V(childAt, -childAt.getWidth(), childAt.getTop()) : this.V.V(childAt, getWidth(), childAt.getTop());
                eVar.f2409c = false;
            }
        }
        this.W.p();
        this.f2375a0.p();
        if (z11) {
            invalidate();
        }
    }

    public void j(View view) {
        View rootView;
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f2410d & 1) == 1) {
            eVar.f2410d = 0;
            List<d> list = this.f2386l0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2386l0.get(size).b(view);
                }
            }
            Z(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    public void k(View view) {
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f2410d & 1) == 0) {
            eVar.f2410d = 1;
            List<d> list = this.f2386l0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2386l0.get(size).a(view);
                }
            }
            Z(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void l(View view, float f10) {
        List<d> list = this.f2386l0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2386l0.get(size).d(view, f10);
            }
        }
    }

    public final boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v10 = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v10);
            v10.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    public View n(int i10) {
        int d10 = j.d(i10, w1.X(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((t(childAt) & 7) == d10) {
                return childAt;
            }
        }
        return null;
    }

    public View o() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((e) childAt.getLayoutParams()).f2410d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2378d0 = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2378d0 = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2395u0 && this.f2389o0 != null) {
            Object obj = this.f2394t0;
            int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.f2389o0.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f2389o0.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        r7 = r6.U.v((int) r0, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            m1.c r1 = r6.U
            boolean r1 = r1.U(r7)
            m1.c r2 = r6.V
            boolean r2 = r2.U(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0038
        L_0x001e:
            m1.c r7 = r6.U
            boolean r7 = r7.f(r4)
            if (r7 == 0) goto L_0x0038
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.W
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f2375a0
            r7.p()
            goto L_0x0038
        L_0x0031:
            r6.i(r2)
            r6.f2383i0 = r3
            r6.f2384j0 = r3
        L_0x0038:
            r7 = r3
            goto L_0x0064
        L_0x003a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2387m0 = r0
            r6.f2388n0 = r7
            float r4 = r6.S
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005f
            m1.c r4 = r6.U
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.v(r0, r7)
            if (r7 == 0) goto L_0x005f
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L_0x005f
            r7 = r2
            goto L_0x0060
        L_0x005f:
            r7 = r3
        L_0x0060:
            r6.f2383i0 = r3
            r6.f2384j0 = r3
        L_0x0064:
            if (r1 != 0) goto L_0x0074
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.y()
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.f2384j0
            if (r7 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r2 = r3
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !z()) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View p10 = p();
        if (p10 != null && r(p10) == 0) {
            h();
        }
        return p10 != null;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f10;
        int i14;
        int measuredHeight;
        int i15;
        int i16;
        boolean z11 = true;
        this.f2377c0 = true;
        int i17 = i12 - i10;
        int childCount = getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i19 = eVar.leftMargin;
                    childAt.layout(i19, eVar.topMargin, childAt.getMeasuredWidth() + i19, eVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f11 = (float) measuredWidth;
                        i14 = (-measuredWidth) + ((int) (eVar.f2408b * f11));
                        f10 = ((float) (measuredWidth + i14)) / f11;
                    } else {
                        float f12 = (float) measuredWidth;
                        int i20 = i17 - ((int) (eVar.f2408b * f12));
                        f10 = ((float) (i17 - i20)) / f12;
                        i14 = i20;
                    }
                    boolean z12 = f10 != eVar.f2408b ? z11 : false;
                    int i21 = eVar.f2407a & 112;
                    if (i21 != 16) {
                        if (i21 != 80) {
                            measuredHeight = eVar.topMargin;
                            i15 = measuredWidth + i14;
                            i16 = measuredHeight2 + measuredHeight;
                        } else {
                            int i22 = i13 - i11;
                            measuredHeight = (i22 - eVar.bottomMargin) - childAt.getMeasuredHeight();
                            i15 = measuredWidth + i14;
                            i16 = i22 - eVar.bottomMargin;
                        }
                        childAt.layout(i14, measuredHeight, i15, i16);
                    } else {
                        int i23 = i13 - i11;
                        int i24 = (i23 - measuredHeight2) / 2;
                        int i25 = eVar.topMargin;
                        if (i24 < i25) {
                            i24 = i25;
                        } else {
                            int i26 = i24 + measuredHeight2;
                            int i27 = eVar.bottomMargin;
                            if (i26 > i23 - i27) {
                                i24 = (i23 - i27) - measuredHeight2;
                            }
                        }
                        childAt.layout(i14, i24, measuredWidth + i14, measuredHeight2 + i24);
                    }
                    if (z12) {
                        Y(childAt, f10);
                    }
                    int i28 = eVar.f2408b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i28) {
                        childAt.setVisibility(i28);
                    }
                }
            }
            i18++;
            z11 = true;
        }
        this.f2377c0 = false;
        this.f2378d0 = false;
    }

    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i12 = 0;
        boolean z10 = this.f2394t0 != null && w1.S(this);
        int X = w1.X(this);
        int childCount = getChildCount();
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (z10) {
                    int d10 = j.d(eVar.f2407a, X);
                    boolean S2 = w1.S(childAt);
                    WindowInsets windowInsets = (WindowInsets) this.f2394t0;
                    if (S2) {
                        if (d10 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i12, windowInsets.getSystemWindowInsetBottom());
                        } else if (d10 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(i12, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        if (d10 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i12, windowInsets.getSystemWindowInsetBottom());
                        } else if (d10 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(i12, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        eVar.leftMargin = windowInsets.getSystemWindowInsetLeft();
                        eVar.topMargin = windowInsets.getSystemWindowInsetTop();
                        eVar.rightMargin = windowInsets.getSystemWindowInsetRight();
                        eVar.bottomMargin = windowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - eVar.leftMargin) - eVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - eVar.topMargin) - eVar.bottomMargin, 1073741824));
                } else if (E(childAt)) {
                    if (V0) {
                        float P2 = w1.P(childAt);
                        float f10 = this.P;
                        if (P2 != f10) {
                            w1.L1(childAt, f10);
                        }
                    }
                    int t10 = t(childAt) & 7;
                    int i14 = t10 == 3 ? 1 : i12;
                    if ((i14 == 0 || !z11) && (i14 != 0 || !z12)) {
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z12 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.Q + eVar.leftMargin + eVar.rightMargin, eVar.width), ViewGroup.getChildMeasureSpec(i11, eVar.topMargin + eVar.bottomMargin, eVar.height));
                        i13++;
                        i12 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(t10) + " but this " + C0 + " already has a " + "drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i13 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i15 = i10;
            int i16 = i11;
            i13++;
            i12 = 0;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        View n10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        int i10 = savedState.Q;
        if (!(i10 == 0 || (n10 = n(i10)) == null)) {
            M(n10);
        }
        int i11 = savedState.R;
        if (i11 != 3) {
            T(i11, 3);
        }
        int i12 = savedState.S;
        if (i12 != 3) {
            T(i12, 5);
        }
        int i13 = savedState.T;
        if (i13 != 3) {
            T(i13, j.f7185b);
        }
        int i14 = savedState.U;
        if (i14 != 3) {
            T(i14, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i10) {
        R();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            e eVar = (e) getChildAt(i10).getLayoutParams();
            int i11 = eVar.f2410d;
            boolean z10 = true;
            boolean z11 = i11 == 1;
            if (i11 != 2) {
                z10 = false;
            }
            if (z11 || z10) {
                savedState.Q = eVar.f2407a;
            } else {
                i10++;
            }
        }
        savedState.R = this.f2379e0;
        savedState.S = this.f2380f0;
        savedState.T = this.f2381g0;
        savedState.U = this.f2382h0;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View o10;
        this.U.L(motionEvent);
        this.V.L(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                View v10 = this.U.v((int) x10, (int) y10);
                if (v10 != null && B(v10)) {
                    float f10 = x10 - this.f2387m0;
                    float f11 = y10 - this.f2388n0;
                    int D = this.U.D();
                    if (!((f10 * f10) + (f11 * f11) >= ((float) (D * D)) || (o10 = o()) == null || r(o10) == 2)) {
                        z10 = false;
                        i(z10);
                        this.f2383i0 = false;
                    }
                }
                z10 = true;
                i(z10);
                this.f2383i0 = false;
            } else if (action == 3) {
                i(true);
            }
            return true;
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        this.f2387m0 = x11;
        this.f2388n0 = y11;
        this.f2383i0 = false;
        this.f2384j0 = false;
        return true;
    }

    public View p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i10) {
        int X = w1.X(this);
        if (i10 == 3) {
            int i11 = this.f2379e0;
            if (i11 != 3) {
                return i11;
            }
            int i12 = X == 0 ? this.f2381g0 : this.f2382h0;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        } else if (i10 == 5) {
            int i13 = this.f2380f0;
            if (i13 != 3) {
                return i13;
            }
            int i14 = X == 0 ? this.f2382h0 : this.f2381g0;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        } else if (i10 == 8388611) {
            int i15 = this.f2381g0;
            if (i15 != 3) {
                return i15;
            }
            int i16 = X == 0 ? this.f2379e0 : this.f2380f0;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        } else if (i10 != 8388613) {
            return 0;
        } else {
            int i17 = this.f2382h0;
            if (i17 != 3) {
                return i17;
            }
            int i18 = X == 0 ? this.f2380f0 : this.f2379e0;
            if (i18 != 3) {
                return i18;
            }
            return 0;
        }
    }

    public int r(@m0 View view) {
        if (E(view)) {
            return q(((e) view.getLayoutParams()).f2407a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.f2383i0 = z10;
        if (z10) {
            i(true);
        }
    }

    public void requestLayout() {
        if (!this.f2377c0) {
            super.requestLayout();
        }
    }

    @o0
    public CharSequence s(int i10) {
        int d10 = j.d(i10, w1.X(this));
        if (d10 == 3) {
            return this.f2392r0;
        }
        if (d10 == 5) {
            return this.f2393s0;
        }
        return null;
    }

    public void setDrawerElevation(float f10) {
        this.P = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt)) {
                w1.L1(childAt, this.P);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        d dVar2 = this.f2385k0;
        if (dVar2 != null) {
            O(dVar2);
        }
        if (dVar != null) {
            a(dVar);
        }
        this.f2385k0 = dVar;
    }

    public void setDrawerLockMode(int i10) {
        T(i10, 3);
        T(i10, 5);
    }

    public void setScrimColor(@l int i10) {
        this.R = i10;
        invalidate();
    }

    public void setStatusBarBackground(int i10) {
        this.f2389o0 = i10 != 0 ? i0.d.i(getContext(), i10) : null;
        invalidate();
    }

    public void setStatusBarBackground(@o0 Drawable drawable) {
        this.f2389o0 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@l int i10) {
        this.f2389o0 = new ColorDrawable(i10);
        invalidate();
    }

    public int t(View view) {
        return j.d(((e) view.getLayoutParams()).f2407a, w1.X(this));
    }

    public float u(View view) {
        return ((e) view.getLayoutParams()).f2408b;
    }

    public final MotionEvent v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.B0 == null) {
                this.B0 = new Matrix();
            }
            matrix.invert(this.B0);
            obtain.transform(this.B0);
        }
        return obtain;
    }

    public final boolean y() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((e) getChildAt(i10).getLayoutParams()).f2409c) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        return p() != null;
    }
}

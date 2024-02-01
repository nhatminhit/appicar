package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import c0.a;
import com.google.android.material.badge.BadgeDrawable;
import d.b0;
import d.g1;
import d.l;
import d.u;
import d.v;
import d.x0;
import e1.m;
import f1.e3;
import f1.j;
import f1.l0;
import f1.m0;
import f1.o0;
import f1.p0;
import f1.w1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements l0, m0 {

    /* renamed from: l0  reason: collision with root package name */
    public static final String f2129l0 = "CoordinatorLayout";

    /* renamed from: m0  reason: collision with root package name */
    public static final String f2130m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f2131n0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f2132o0 = 1;

    /* renamed from: p0  reason: collision with root package name */
    public static final Class<?>[] f2133p0 = {Context.class, AttributeSet.class};

    /* renamed from: q0  reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<c>>> f2134q0 = new ThreadLocal<>();

    /* renamed from: r0  reason: collision with root package name */
    public static final int f2135r0 = 0;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f2136s0 = 1;

    /* renamed from: t0  reason: collision with root package name */
    public static final int f2137t0 = 2;

    /* renamed from: u0  reason: collision with root package name */
    public static final Comparator<View> f2138u0 = new i();

    /* renamed from: v0  reason: collision with root package name */
    public static final m.a<Rect> f2139v0 = new m.c(12);
    public final List<View> O;
    public final d0.a<View> P;
    public final List<View> Q;
    public final List<View> R;
    public Paint S;
    public final int[] T;
    public final int[] U;
    public boolean V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public int[] f2140a0;

    /* renamed from: b0  reason: collision with root package name */
    public View f2141b0;

    /* renamed from: c0  reason: collision with root package name */
    public View f2142c0;

    /* renamed from: d0  reason: collision with root package name */
    public h f2143d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f2144e0;

    /* renamed from: f0  reason: collision with root package name */
    public e3 f2145f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f2146g0;

    /* renamed from: h0  reason: collision with root package name */
    public Drawable f2147h0;

    /* renamed from: i0  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f2148i0;

    /* renamed from: j0  reason: collision with root package name */
    public p0 f2149j0;

    /* renamed from: k0  reason: collision with root package name */
    public final o0 f2150k0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public SparseArray<Parcelable> Q;

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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.Q = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.Q.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.Q;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.Q.keyAt(i11);
                parcelableArr[i11] = this.Q.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    public class a implements p0 {
        public a() {
        }

        public e3 a(View view, e3 e3Var) {
            return CoordinatorLayout.this.b0(e3Var);
        }
    }

    public interface b {
        @d.m0
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public static void F(@d.m0 View view, @d.o0 Object obj) {
            ((g) view.getLayoutParams()).f2169r = obj;
        }

        @d.o0
        public static Object e(@d.m0 View view) {
            return ((g) view.getLayoutParams()).f2169r;
        }

        @Deprecated
        public boolean A(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view, @d.m0 View view2, int i10) {
            return false;
        }

        public boolean B(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view, @d.m0 View view2, int i10, int i11) {
            if (i11 == 0) {
                return A(coordinatorLayout, v10, view, view2, i10);
            }
            return false;
        }

        @Deprecated
        public void C(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view) {
        }

        public void D(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view, int i10) {
            if (i10 == 0) {
                C(coordinatorLayout, v10, view);
            }
        }

        public boolean E(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 MotionEvent motionEvent) {
            return false;
        }

        public boolean a(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10) {
            return d(coordinatorLayout, v10) > 0.0f;
        }

        public boolean b(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 Rect rect) {
            return false;
        }

        @l
        public int c(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10) {
            return -16777216;
        }

        @v(from = 0.0d, to = 1.0d)
        public float d(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10) {
            return 0.0f;
        }

        public boolean f(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view) {
            return false;
        }

        @d.m0
        public e3 g(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 e3 e3Var) {
            return e3Var;
        }

        public void h(@d.m0 g gVar) {
        }

        public boolean i(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view) {
            return false;
        }

        public void j(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view) {
        }

        public void k() {
        }

        public boolean l(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 MotionEvent motionEvent) {
            return false;
        }

        public boolean m(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, int i10) {
            return false;
        }

        public boolean n(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean o(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean p(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        public void q(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view, int i10, int i11, @d.m0 int[] iArr) {
        }

        public void r(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view, int i10, int i11, @d.m0 int[] iArr, int i12) {
            if (i12 == 0) {
                q(coordinatorLayout, v10, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void s(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view, int i10, int i11, int i12, int i13) {
        }

        @Deprecated
        public void t(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                s(coordinatorLayout, v10, view, i10, i11, i12, i13);
            }
        }

        public void u(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view, int i10, int i11, int i12, int i13, int i14, @d.m0 int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            t(coordinatorLayout, v10, view, i10, i11, i12, i13, i14);
        }

        @Deprecated
        public void v(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view, @d.m0 View view2, int i10) {
        }

        public void w(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 View view, @d.m0 View view2, int i10, int i11) {
            if (i11 == 0) {
                v(coordinatorLayout, v10, view, view2, i10);
            }
        }

        public boolean x(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 Rect rect, boolean z10) {
            return false;
        }

        public void y(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10, @d.m0 Parcelable parcelable) {
        }

        @d.o0
        public Parcelable z(@d.m0 CoordinatorLayout coordinatorLayout, @d.m0 V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    @x0({x0.a.Q})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public class f implements ViewGroup.OnHierarchyChangeListener {
        public f() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2148i0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.M(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2148i0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class g extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f2152a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2153b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f2154c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f2155d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f2156e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2157f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f2158g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f2159h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f2160i;

        /* renamed from: j  reason: collision with root package name */
        public int f2161j;

        /* renamed from: k  reason: collision with root package name */
        public View f2162k;

        /* renamed from: l  reason: collision with root package name */
        public View f2163l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f2164m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f2165n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f2166o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f2167p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f2168q = new Rect();

        /* renamed from: r  reason: collision with root package name */
        public Object f2169r;

        public g(int i10, int i11) {
            super(i10, i11);
        }

        public g(@d.m0 Context context, @d.o0 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.CoordinatorLayout_Layout);
            this.f2154c = obtainStyledAttributes.getInteger(a.j.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f2157f = obtainStyledAttributes.getResourceId(a.j.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f2155d = obtainStyledAttributes.getInteger(a.j.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f2156e = obtainStyledAttributes.getInteger(a.j.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f2158g = obtainStyledAttributes.getInt(a.j.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f2159h = obtainStyledAttributes.getInt(a.j.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i10 = a.j.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i10);
            this.f2153b = hasValue;
            if (hasValue) {
                this.f2152a = CoordinatorLayout.P(context, attributeSet, obtainStyledAttributes.getString(i10));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f2152a;
            if (cVar != null) {
                cVar.h(this);
            }
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public g(g gVar) {
            super(gVar);
        }

        public boolean a() {
            return this.f2162k == null && this.f2157f != -1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f2152a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f2163l
                if (r4 == r0) goto L_0x001b
                int r0 = f1.w1.X(r2)
                boolean r0 = r1.u(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f2152a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.f(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.g.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        public boolean c() {
            if (this.f2152a == null) {
                this.f2164m = false;
            }
            return this.f2164m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2157f == -1) {
                this.f2163l = null;
                this.f2162k = null;
                return null;
            }
            if (this.f2162k == null || !v(view, coordinatorLayout)) {
                o(view, coordinatorLayout);
            }
            return this.f2162k;
        }

        @b0
        public int e() {
            return this.f2157f;
        }

        @d.o0
        public c f() {
            return this.f2152a;
        }

        public boolean g() {
            return this.f2167p;
        }

        public Rect h() {
            return this.f2168q;
        }

        public void i() {
            this.f2163l = null;
            this.f2162k = null;
        }

        public boolean j(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f2164m;
            if (z10) {
                return true;
            }
            c cVar = this.f2152a;
            boolean a10 = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z10;
            this.f2164m = a10;
            return a10;
        }

        public boolean k(int i10) {
            if (i10 == 0) {
                return this.f2165n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f2166o;
        }

        public void l() {
            this.f2167p = false;
        }

        public void m(int i10) {
            t(i10, false);
        }

        public void n() {
            this.f2164m = false;
        }

        public final void o(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f2157f);
            this.f2162k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f2163l = findViewById;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2157f) + " to anchor view " + view);
            }
            this.f2163l = null;
            this.f2162k = null;
        }

        public void p(@b0 int i10) {
            i();
            this.f2157f = i10;
        }

        public void q(@d.o0 c cVar) {
            c cVar2 = this.f2152a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.k();
                }
                this.f2152a = cVar;
                this.f2169r = null;
                this.f2153b = true;
                if (cVar != null) {
                    cVar.h(this);
                }
            }
        }

        public void r(boolean z10) {
            this.f2167p = z10;
        }

        public void s(Rect rect) {
            this.f2168q.set(rect);
        }

        public void t(int i10, boolean z10) {
            if (i10 == 0) {
                this.f2165n = z10;
            } else if (i10 == 1) {
                this.f2166o = z10;
            }
        }

        public final boolean u(View view, int i10) {
            int d10 = j.d(((g) view.getLayoutParams()).f2158g, i10);
            return d10 != 0 && (j.d(this.f2159h, i10) & d10) == d10;
        }

        public final boolean v(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2162k.getId() != this.f2157f) {
                return false;
            }
            View view2 = this.f2162k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2163l = null;
                    this.f2162k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f2163l = view2;
            return true;
        }
    }

    public class h implements ViewTreeObserver.OnPreDrawListener {
        public h() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.M(0);
            return true;
        }
    }

    public static class i implements Comparator<View> {
        /* renamed from: a */
        public int compare(View view, View view2) {
            float E0 = w1.E0(view);
            float E02 = w1.E0(view2);
            if (E0 > E02) {
                return -1;
            }
            return E0 < E02 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            f2130m0 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            f2138u0 = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f2133p0 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f2134q0 = r0
            e1.m$c r0 = new e1.m$c
            r1 = 12
            r0.<init>(r1)
            f2139v0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(@d.m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public CoordinatorLayout(@d.m0 Context context, @d.o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0072a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(@d.m0 Context context, @d.o0 AttributeSet attributeSet, @d.f int i10) {
        super(context, attributeSet, i10);
        this.O = new ArrayList();
        this.P = new d0.a<>();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.T = new int[2];
        this.U = new int[2];
        this.f2150k0 = new o0(this);
        int[] iArr = a.j.CoordinatorLayout;
        TypedArray obtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, a.i.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = a.j.CoordinatorLayout;
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, 0, a.i.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, i10, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(a.j.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2140a0 = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f2140a0.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr3 = this.f2140a0;
                iArr3[i11] = (int) (((float) iArr3[i11]) * f10);
            }
        }
        this.f2147h0 = obtainStyledAttributes.getDrawable(a.j.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        c0();
        super.setOnHierarchyChangeListener(new f());
        if (w1.T(this) == 0) {
            w1.P1(this, 1);
        }
    }

    public static c P(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f2130m0;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f2134q0;
            Map map = threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f2133p0);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    public static void T(@d.m0 Rect rect) {
        rect.setEmpty();
        f2139v0.a(rect);
    }

    public static int W(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    public static int X(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= j.f7185b;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    public static int Y(int i10) {
        return i10 == 0 ? BadgeDrawable.f16646e0 : i10;
    }

    @d.m0
    public static Rect f() {
        Rect b10 = f2139v0.b();
        return b10 == null ? new Rect() : b10;
    }

    public static int h(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public final void A(View view, int i10, Rect rect, Rect rect2, g gVar, int i11, int i12) {
        int d10 = j.d(W(gVar.f2154c), i10);
        int d11 = j.d(X(gVar.f2155d), i10);
        int i13 = d10 & 7;
        int i14 = d10 & 112;
        int i15 = d11 & 7;
        int i16 = d11 & 112;
        int width = i15 != 1 ? i15 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i16 != 16 ? i16 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i13 == 1) {
            width -= i11 / 2;
        } else if (i13 != 5) {
            width -= i11;
        }
        if (i14 == 16) {
            height -= i12 / 2;
        } else if (i14 != 80) {
            height -= i12;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    public final int B(int i10) {
        int[] iArr = this.f2140a0;
        if (iArr == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No keylines defined for ");
            sb2.append(this);
            sb2.append(" - attempted index lookup ");
            sb2.append(i10);
            return 0;
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Keyline index ");
            sb3.append(i10);
            sb3.append(" out of range for ");
            sb3.append(this);
            return 0;
        }
    }

    public void C(View view, Rect rect) {
        rect.set(((g) view.getLayoutParams()).h());
    }

    public g D(View view) {
        g gVar = (g) view.getLayoutParams();
        if (!gVar.f2153b) {
            if (view instanceof b) {
                gVar.q(((b) view).getBehavior());
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        gVar.q((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Default behavior class ");
                        sb2.append(dVar.value().getName());
                        sb2.append(" could not be instantiated. Did you forget a default constructor?");
                    }
                }
            }
            gVar.f2153b = true;
        }
        return gVar;
    }

    public final void E(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = f2138u0;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public final boolean F(View view) {
        return this.P.j(view);
    }

    public boolean G(@d.m0 View view, int i10, int i11) {
        Rect f10 = f();
        y(view, f10);
        try {
            return f10.contains(i10, i11);
        } finally {
            T(f10);
        }
    }

    public final void H(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        Rect f10 = f();
        f10.set(getPaddingLeft() + gVar.leftMargin, getPaddingTop() + gVar.topMargin, (getWidth() - getPaddingRight()) - gVar.rightMargin, (getHeight() - getPaddingBottom()) - gVar.bottomMargin);
        if (this.f2145f0 != null && w1.S(this) && !w1.S(view)) {
            f10.left += this.f2145f0.p();
            f10.top += this.f2145f0.r();
            f10.right -= this.f2145f0.q();
            f10.bottom -= this.f2145f0.o();
        }
        Rect f11 = f();
        j.b(X(gVar.f2154c), view.getMeasuredWidth(), view.getMeasuredHeight(), f10, f11, i10);
        view.layout(f11.left, f11.top, f11.right, f11.bottom);
        T(f10);
        T(f11);
    }

    public final void I(View view, View view2, int i10) {
        Rect f10 = f();
        Rect f11 = f();
        try {
            y(view2, f10);
            z(view, i10, f10, f11);
            view.layout(f11.left, f11.top, f11.right, f11.bottom);
        } finally {
            T(f10);
            T(f11);
        }
    }

    public final void J(View view, int i10, int i11) {
        g gVar = (g) view.getLayoutParams();
        int d10 = j.d(Y(gVar.f2154c), i11);
        int i12 = d10 & 7;
        int i13 = d10 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int B = B(i10) - measuredWidth;
        int i14 = 0;
        if (i12 == 1) {
            B += measuredWidth / 2;
        } else if (i12 == 5) {
            B += measuredWidth;
        }
        if (i13 == 16) {
            i14 = 0 + (measuredHeight / 2);
        } else if (i13 == 80) {
            i14 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + gVar.leftMargin, Math.min(B, ((width - getPaddingRight()) - measuredWidth) - gVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + gVar.topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - gVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    public final void K(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (w1.T0(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            g gVar = (g) view.getLayoutParams();
            c f10 = gVar.f();
            Rect f11 = f();
            Rect f12 = f();
            f12.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f10 == null || !f10.b(this, view, f11)) {
                f11.set(f12);
            } else if (!f12.contains(f11)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + f11.toShortString() + " | Bounds:" + f12.toShortString());
            }
            T(f12);
            if (f11.isEmpty()) {
                T(f11);
                return;
            }
            int d10 = j.d(gVar.f2159h, i10);
            boolean z12 = true;
            if ((d10 & 48) != 48 || (i15 = (f11.top - gVar.topMargin) - gVar.f2161j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                a0(view, i16 - i15);
                z10 = true;
            }
            if ((d10 & 80) == 80 && (height = ((getHeight() - f11.bottom) - gVar.bottomMargin) + gVar.f2161j) < (i14 = rect.bottom)) {
                a0(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                a0(view, 0);
            }
            if ((d10 & 3) != 3 || (i12 = (f11.left - gVar.leftMargin) - gVar.f2160i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                Z(view, i13 - i12);
                z11 = true;
            }
            if ((d10 & 5) != 5 || (width = ((getWidth() - f11.right) - gVar.rightMargin) + gVar.f2160i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                Z(view, width - i11);
            }
            if (!z12) {
                Z(view, 0);
            }
            T(f11);
        }
    }

    public void L(View view, int i10) {
        c f10;
        View view2 = view;
        g gVar = (g) view.getLayoutParams();
        if (gVar.f2162k != null) {
            Rect f11 = f();
            Rect f12 = f();
            Rect f13 = f();
            y(gVar.f2162k, f11);
            boolean z10 = false;
            q(view2, false, f12);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i11 = measuredHeight;
            A(view, i10, f11, f13, gVar, measuredWidth, measuredHeight);
            if (!(f13.left == f12.left && f13.top == f12.top)) {
                z10 = true;
            }
            i(gVar, f13, measuredWidth, i11);
            int i12 = f13.left - f12.left;
            int i13 = f13.top - f12.top;
            if (i12 != 0) {
                w1.c1(view2, i12);
            }
            if (i13 != 0) {
                w1.d1(view2, i13);
            }
            if (z10 && (f10 = gVar.f()) != null) {
                f10.i(this, view2, gVar.f2162k);
            }
            T(f11);
            T(f12);
            T(f13);
        }
    }

    public final void M(int i10) {
        boolean z10;
        int i11 = i10;
        int X = w1.X(this);
        int size = this.O.size();
        Rect f10 = f();
        Rect f11 = f();
        Rect f12 = f();
        for (int i12 = 0; i12 < size; i12++) {
            View view = this.O.get(i12);
            g gVar = (g) view.getLayoutParams();
            if (i11 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (gVar.f2163l == this.O.get(i13)) {
                        L(view, X);
                    }
                }
                q(view, true, f11);
                if (gVar.f2158g != 0 && !f11.isEmpty()) {
                    int d10 = j.d(gVar.f2158g, X);
                    int i14 = d10 & 112;
                    if (i14 == 48) {
                        f10.top = Math.max(f10.top, f11.bottom);
                    } else if (i14 == 80) {
                        f10.bottom = Math.max(f10.bottom, getHeight() - f11.top);
                    }
                    int i15 = d10 & 7;
                    if (i15 == 3) {
                        f10.left = Math.max(f10.left, f11.right);
                    } else if (i15 == 5) {
                        f10.right = Math.max(f10.right, getWidth() - f11.left);
                    }
                }
                if (gVar.f2159h != 0 && view.getVisibility() == 0) {
                    K(view, f10, X);
                }
                if (i11 != 2) {
                    C(view, f12);
                    if (!f12.equals(f11)) {
                        S(view, f11);
                    }
                }
                for (int i16 = i12 + 1; i16 < size; i16++) {
                    View view2 = this.O.get(i16);
                    g gVar2 = (g) view2.getLayoutParams();
                    c f13 = gVar2.f();
                    if (f13 != null && f13.f(this, view2, view)) {
                        if (i11 != 0 || !gVar2.g()) {
                            if (i11 != 2) {
                                z10 = f13.i(this, view2, view);
                            } else {
                                f13.j(this, view2, view);
                                z10 = true;
                            }
                            if (i11 == 1) {
                                gVar2.r(z10);
                            }
                        } else {
                            gVar2.l();
                        }
                    }
                }
            }
        }
        T(f10);
        T(f11);
        T(f12);
    }

    public void N(@d.m0 View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        if (!gVar.a()) {
            View view2 = gVar.f2162k;
            if (view2 != null) {
                I(view, view2, i10);
                return;
            }
            int i11 = gVar.f2156e;
            if (i11 >= 0) {
                J(view, i11, i10);
            } else {
                H(view, i10);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public void O(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    public final boolean Q(MotionEvent motionEvent, int i10) {
        MotionEvent motionEvent2 = motionEvent;
        int i11 = i10;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.Q;
        E(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z10 = false;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = list.get(i12);
            g gVar = (g) view.getLayoutParams();
            c f10 = gVar.f();
            if ((!z10 && !z11) || actionMasked == 0) {
                if (!z10 && f10 != null) {
                    if (i11 == 0) {
                        z10 = f10.l(this, view, motionEvent2);
                    } else if (i11 == 1) {
                        z10 = f10.E(this, view, motionEvent2);
                    }
                    if (z10) {
                        this.f2141b0 = view;
                    }
                }
                boolean c10 = gVar.c();
                boolean j10 = gVar.j(this, view);
                z11 = j10 && !c10;
                if (j10 && !z11) {
                    break;
                }
            } else if (f10 != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i11 == 0) {
                    f10.l(this, view, motionEvent3);
                } else if (i11 == 1) {
                    f10.E(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z10;
    }

    public final void R() {
        this.O.clear();
        this.P.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            g D = D(childAt);
            D.d(this, childAt);
            this.P.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (D.b(this, childAt, childAt2)) {
                        if (!this.P.d(childAt2)) {
                            this.P.b(childAt2);
                        }
                        this.P.a(childAt2, childAt);
                    }
                }
            }
        }
        this.O.addAll(this.P.i());
        Collections.reverse(this.O);
    }

    public void S(View view, Rect rect) {
        ((g) view.getLayoutParams()).s(rect);
    }

    public void U() {
        if (this.W && this.f2143d0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2143d0);
        }
        this.f2144e0 = false;
    }

    public final void V(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c f10 = ((g) childAt.getLayoutParams()).f();
            if (f10 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    f10.l(this, childAt, obtain);
                } else {
                    f10.E(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((g) getChildAt(i11).getLayoutParams()).n();
        }
        this.f2141b0 = null;
        this.V = false;
    }

    public final void Z(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int i11 = gVar.f2160i;
        if (i11 != i10) {
            w1.c1(view, i10 - i11);
            gVar.f2160i = i10;
        }
    }

    public final void a0(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int i11 = gVar.f2161j;
        if (i11 != i10) {
            w1.d1(view, i10 - i11);
            gVar.f2161j = i10;
        }
    }

    public final e3 b0(e3 e3Var) {
        if (e1.i.a(this.f2145f0, e3Var)) {
            return e3Var;
        }
        this.f2145f0 = e3Var;
        boolean z10 = true;
        boolean z11 = e3Var != null && e3Var.r() > 0;
        this.f2146g0 = z11;
        if (z11 || getBackground() != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        e3 j10 = j(e3Var);
        requestLayout();
        return j10;
    }

    public final void c0() {
        if (w1.S(this)) {
            if (this.f2149j0 == null) {
                this.f2149j0 = new a();
            }
            w1.Y1(this, this.f2149j0);
            setSystemUiVisibility(1280);
            return;
        }
        w1.Y1(this, (p0) null);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        g gVar = (g) view.getLayoutParams();
        c cVar = gVar.f2152a;
        if (cVar != null) {
            float d10 = cVar.d(this, view);
            if (d10 > 0.0f) {
                if (this.S == null) {
                    this.S = new Paint();
                }
                this.S.setColor(gVar.f2152a.c(this, view));
                this.S.setAlpha(h(Math.round(d10 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.S);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2147h0;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public void e(@d.m0 View view, int i10, int i11, int i12, int i13, int i14, @d.m0 int[] iArr) {
        c f10;
        boolean z10;
        int i15;
        int childCount = getChildCount();
        boolean z11 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(i14) && (f10 = gVar.f()) != null) {
                    int[] iArr2 = this.T;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.u(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.T;
                    i16 = i12 > 0 ? Math.max(i16, iArr3[0]) : Math.min(i16, iArr3[0]);
                    if (i13 > 0) {
                        z10 = true;
                        i15 = Math.max(i17, this.T[1]);
                    } else {
                        z10 = true;
                        i15 = Math.min(i17, this.T[1]);
                    }
                    i17 = i15;
                    z11 = z10;
                }
            }
        }
        iArr[0] = iArr[0] + i16;
        iArr[1] = iArr[1] + i17;
        if (z11) {
            M(1);
        }
    }

    public void g() {
        if (this.W) {
            if (this.f2143d0 == null) {
                this.f2143d0 = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2143d0);
        }
        this.f2144e0 = true;
    }

    @g1
    public final List<View> getDependencySortedChildren() {
        R();
        return Collections.unmodifiableList(this.O);
    }

    @x0({x0.a.Q})
    public final e3 getLastWindowInsets() {
        return this.f2145f0;
    }

    public int getNestedScrollAxes() {
        return this.f2150k0.a();
    }

    @d.o0
    public Drawable getStatusBarBackground() {
        return this.f2147h0;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public final void i(g gVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + gVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - gVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + gVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - gVar.bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    public final e3 j(e3 e3Var) {
        c f10;
        if (e3Var.A()) {
            return e3Var;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (w1.S(childAt) && (f10 = ((g) childAt.getLayoutParams()).f()) != null) {
                e3Var = f10.g(this, childAt, e3Var);
                if (e3Var.A()) {
                    break;
                }
            }
        }
        return e3Var;
    }

    public void k(@d.m0 View view) {
        List g10 = this.P.g(view);
        if (g10 != null && !g10.isEmpty()) {
            for (int i10 = 0; i10 < g10.size(); i10++) {
                View view2 = (View) g10.get(i10);
                c f10 = ((g) view2.getLayoutParams()).f();
                if (f10 != null) {
                    f10.i(this, view2, view);
                }
            }
        }
    }

    public boolean l(@d.m0 View view, @d.m0 View view2) {
        boolean z10 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect f10 = f();
        q(view, view.getParent() != this, f10);
        Rect f11 = f();
        q(view2, view2.getParent() != this, f11);
        try {
            if (f10.left <= f11.right && f10.top <= f11.bottom && f10.right >= f11.left && f10.bottom >= f11.top) {
                z10 = true;
            }
            return z10;
        } finally {
            T(f10);
            T(f11);
        }
    }

    public void m() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (F(getChildAt(i10))) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10 == this.f2144e0) {
            return;
        }
        if (z10) {
            g();
        } else {
            U();
        }
    }

    /* renamed from: n */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    /* renamed from: o */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        V(false);
        if (this.f2144e0) {
            if (this.f2143d0 == null) {
                this.f2143d0 = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2143d0);
        }
        if (this.f2145f0 == null && w1.S(this)) {
            w1.t1(this);
        }
        this.W = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        V(false);
        if (this.f2144e0 && this.f2143d0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2143d0);
        }
        View view = this.f2142c0;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.W = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2146g0 && this.f2147h0 != null) {
            e3 e3Var = this.f2145f0;
            int r10 = e3Var != null ? e3Var.r() : 0;
            if (r10 > 0) {
                this.f2147h0.setBounds(0, 0, getWidth(), r10);
                this.f2147h0.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            V(true);
        }
        boolean Q2 = Q(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            V(true);
        }
        return Q2;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c f10;
        int X = w1.X(this);
        int size = this.O.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.O.get(i14);
            if (view.getVisibility() != 8 && ((f10 = ((g) view.getLayoutParams()).f()) == null || !f10.m(this, view, X))) {
                N(view, X);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.n(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.R()
            r30.m()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = f1.w1.X(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = r2
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            f1.e3 r3 = r7.f2145f0
            if (r3 == 0) goto L_0x004b
            boolean r3 = f1.w1.S(r30)
            if (r3 == 0) goto L_0x004b
            r19 = r2
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.O
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.O
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.g) r1
            int r0 = r1.f2156e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.B(r0)
            int r11 = r1.f2154c
            int r11 = Y(r11)
            int r11 = f1.j.d(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r11 = r0
            r21 = r2
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = r11
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = f1.w1.S(r20)
            if (r0 != 0) goto L_0x00f1
            f1.e3 r0 = r7.f2145f0
            int r0 = r0.p()
            f1.e3 r2 = r7.f2145f0
            int r2 = r2.q()
            int r0 = r0 + r2
            f1.e3 r2 = r7.f2145f0
            int r2 = r2.r()
            f1.e3 r11 = r7.f2145f0
            int r11 = r11.o()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.n(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.O(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c f12;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (f12 = gVar.f()) != null) {
                    z11 |= f12.o(this, childAt, view, f10, f11, z10);
                }
            }
        }
        if (z11) {
            M(1);
        }
        return z11;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        c f12;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (f12 = gVar.f()) != null) {
                    z10 |= f12.p(this, childAt, view, f10, f11);
                }
            }
        }
        return z10;
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        v(view, i10, i11, iArr, 0);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        r(view, i10, i11, i12, i13, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        t(view, view2, i10, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray<Parcelable> sparseArray = savedState.Q;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = D(childAt).f();
            if (!(id2 == -1 || f10 == null || (parcelable2 = sparseArray.get(id2)) == null)) {
                f10.y(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable z10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = ((g) childAt.getLayoutParams()).f();
            if (!(id2 == -1 || f10 == null || (z10 = f10.z(this, childAt)) == null)) {
                sparseArray.append(id2, z10);
            }
        }
        savedState.Q = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return s(view, view2, i10, 0);
    }

    public void onStopNestedScroll(View view) {
        u(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2141b0
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.Q(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.f2141b0
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.g) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f2141b0
            boolean r6 = r6.E(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = r5
        L_0x002c:
            android.view.View r7 = r0.f2141b0
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.V(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public void q(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            y(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public void r(View view, int i10, int i11, int i12, int i13, int i14) {
        e(view, i10, i11, i12, i13, 0, this.U);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c f10 = ((g) view.getLayoutParams()).f();
        if (f10 == null || !f10.x(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.V) {
            V(false);
            this.V = true;
        }
    }

    public boolean s(View view, View view2, int i10, int i11) {
        int i12 = i11;
        int childCount = getChildCount();
        int i13 = 0;
        boolean z10 = false;
        while (true) {
            if (i13 >= childCount) {
                return z10;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                c f10 = gVar.f();
                if (f10 != null) {
                    boolean B = f10.B(this, childAt, view, view2, i10, i11);
                    z10 |= B;
                    gVar.t(i12, B);
                } else {
                    gVar.t(i12, false);
                }
            }
            i13++;
        }
    }

    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        c0();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2148i0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@d.o0 Drawable drawable) {
        Drawable drawable2 = this.f2147h0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2147h0 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2147h0.setState(getDrawableState());
                }
                o0.d.m(this.f2147h0, w1.X(this));
                this.f2147h0.setVisible(getVisibility() == 0, false);
                this.f2147h0.setCallback(this);
            }
            w1.l1(this);
        }
    }

    public void setStatusBarBackgroundColor(@l int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(@u int i10) {
        setStatusBarBackground(i10 != 0 ? i0.d.i(getContext(), i10) : null);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f2147h0;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f2147h0.setVisible(z10, false);
        }
    }

    public void t(View view, View view2, int i10, int i11) {
        c f10;
        this.f2150k0.c(view, view2, i10, i11);
        this.f2142c0 = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.k(i11) && (f10 = gVar.f()) != null) {
                f10.w(this, childAt, view, view2, i10, i11);
            }
        }
    }

    public void u(View view, int i10) {
        this.f2150k0.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.k(i10)) {
                c f10 = gVar.f();
                if (f10 != null) {
                    f10.D(this, childAt, view, i10);
                }
                gVar.m(i10);
                gVar.l();
            }
        }
        this.f2142c0 = null;
    }

    public void v(View view, int i10, int i11, int[] iArr, int i12) {
        c f10;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                int i16 = i12;
            } else {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(i12) && (f10 = gVar.f()) != null) {
                    int[] iArr2 = this.T;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.r(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.T;
                    i13 = i10 > 0 ? Math.max(i13, iArr3[0]) : Math.min(i13, iArr3[0]);
                    int[] iArr4 = this.T;
                    i14 = i11 > 0 ? Math.max(i14, iArr4[1]) : Math.min(i14, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            M(1);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2147h0;
    }

    @d.m0
    public List<View> w(@d.m0 View view) {
        List<View> h10 = this.P.h(view);
        this.R.clear();
        if (h10 != null) {
            this.R.addAll(h10);
        }
        return this.R;
    }

    @d.m0
    public List<View> x(@d.m0 View view) {
        List g10 = this.P.g(view);
        this.R.clear();
        if (g10 != null) {
            this.R.addAll(g10);
        }
        return this.R;
    }

    public void y(View view, Rect rect) {
        d0.b.a(this, view, rect);
    }

    public void z(View view, int i10, Rect rect, Rect rect2) {
        g gVar = (g) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        A(view, i10, rect, rect2, gVar, measuredWidth, measuredHeight);
        i(gVar, rect2, measuredWidth, measuredHeight);
    }
}

package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.v;
import d.a1;
import d.g1;
import d.m0;
import d.o0;
import d.x0;
import f1.e3;
import f1.w1;
import g1.c0;
import g1.z;
import i9.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m1.c;
import z9.j;
import z9.o;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int R = 1;
    public static final int S = 2;
    public static final int T = 3;
    public static final int U = 4;
    public static final int V = 5;
    public static final int W = 6;
    public static final int X = -1;
    public static final int Y = 1;
    public static final int Z = 2;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f16757a0 = 4;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f16758b0 = 8;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f16759c0 = -1;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f16760d0 = 0;

    /* renamed from: e0  reason: collision with root package name */
    public static final String f16761e0 = "BottomSheetBehavior";

    /* renamed from: f0  reason: collision with root package name */
    public static final int f16762f0 = 500;

    /* renamed from: g0  reason: collision with root package name */
    public static final float f16763g0 = 0.5f;

    /* renamed from: h0  reason: collision with root package name */
    public static final float f16764h0 = 0.1f;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f16765i0 = 500;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f16766j0 = a.n.Widget_Design_BottomSheet_Modal;
    @o0
    public m1.c A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    @o0
    public WeakReference<V> H;
    @o0
    public WeakReference<View> I;
    @m0
    public final ArrayList<f> J = new ArrayList<>();
    @o0
    public VelocityTracker K;
    public int L;
    public int M;
    public boolean N;
    @o0
    public Map<View, Integer> O;
    public int P = -1;
    public final c.C0178c Q = new d();

    /* renamed from: a  reason: collision with root package name */
    public int f16767a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16768b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16769c = false;

    /* renamed from: d  reason: collision with root package name */
    public float f16770d;

    /* renamed from: e  reason: collision with root package name */
    public int f16771e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16772f;

    /* renamed from: g  reason: collision with root package name */
    public int f16773g;

    /* renamed from: h  reason: collision with root package name */
    public int f16774h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f16775i;

    /* renamed from: j  reason: collision with root package name */
    public j f16776j;

    /* renamed from: k  reason: collision with root package name */
    public int f16777k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f16778l;

    /* renamed from: m  reason: collision with root package name */
    public o f16779m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f16780n;

    /* renamed from: o  reason: collision with root package name */
    public BottomSheetBehavior<V>.h f16781o = null;
    @o0

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator f16782p;

    /* renamed from: q  reason: collision with root package name */
    public int f16783q;

    /* renamed from: r  reason: collision with root package name */
    public int f16784r;

    /* renamed from: s  reason: collision with root package name */
    public int f16785s;

    /* renamed from: t  reason: collision with root package name */
    public float f16786t = 0.5f;

    /* renamed from: u  reason: collision with root package name */
    public int f16787u;

    /* renamed from: v  reason: collision with root package name */
    public float f16788v = -1.0f;

    /* renamed from: w  reason: collision with root package name */
    public boolean f16789w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f16790x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f16791y = true;

    /* renamed from: z  reason: collision with root package name */
    public int f16792z = 4;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int Q;
        public int R;
        public boolean S;
        public boolean T;
        public boolean U;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @o0
            /* renamed from: a */
            public SavedState createFromParcel(@m0 Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @m0
            /* renamed from: b */
            public SavedState createFromParcel(@m0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @m0
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@m0 Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(@m0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Q = parcel.readInt();
            this.R = parcel.readInt();
            boolean z10 = false;
            this.S = parcel.readInt() == 1;
            this.T = parcel.readInt() == 1;
            this.U = parcel.readInt() == 1 ? true : z10;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i10) {
            super(parcelable);
            this.Q = i10;
        }

        public SavedState(Parcelable parcelable, @m0 BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.Q = bottomSheetBehavior.f16792z;
            this.R = bottomSheetBehavior.f16771e;
            this.S = bottomSheetBehavior.f16768b;
            this.T = bottomSheetBehavior.f16789w;
            this.U = bottomSheetBehavior.f16790x;
        }

        public void writeToParcel(@m0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.Q);
            parcel.writeInt(this.R);
            parcel.writeInt(this.S ? 1 : 0);
            parcel.writeInt(this.T ? 1 : 0);
            parcel.writeInt(this.U ? 1 : 0);
        }
    }

    public class a implements Runnable {
        public final /* synthetic */ View O;
        public final /* synthetic */ int P;

        public a(View view, int i10) {
            this.O = view;
            this.P = i10;
        }

        public void run() {
            BottomSheetBehavior.this.F0(this.O, this.P);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f16776j != null) {
                BottomSheetBehavior.this.f16776j.o0(floatValue);
            }
        }
    }

    public class c implements v.e {
        public c() {
        }

        public e3 a(View view, e3 e3Var, v.f fVar) {
            int unused = BottomSheetBehavior.this.f16777k = e3Var.h().f10725d;
            BottomSheetBehavior.this.M0(false);
            return e3Var;
        }
    }

    public class d extends c.C0178c {
        public d() {
        }

        public int a(@m0 View view, int i10, int i11) {
            return view.getLeft();
        }

        public int b(@m0 View view, int i10, int i11) {
            int a02 = BottomSheetBehavior.this.a0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return v0.a.c(i10, a02, bottomSheetBehavior.f16789w ? bottomSheetBehavior.G : bottomSheetBehavior.f16787u);
        }

        public int e(@m0 View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f16789w ? bottomSheetBehavior.G : bottomSheetBehavior.f16787u;
        }

        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f16791y) {
                BottomSheetBehavior.this.C0(1);
            }
        }

        public void k(@m0 View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.X(i11);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
            if (java.lang.Math.abs(r7.getTop() - r6.f16795a.f16783q) < java.lang.Math.abs(r7.getTop() - r6.f16795a.f16785s)) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
            if (java.lang.Math.abs(r8 - r6.f16795a.f16785s) < java.lang.Math.abs(r8 - r6.f16795a.f16787u)) goto L_0x00b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
            if (java.lang.Math.abs(r8 - r6.f16795a.f16784r) < java.lang.Math.abs(r8 - r6.f16795a.f16787u)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ea, code lost:
            if (r8 < java.lang.Math.abs(r8 - r9.f16787u)) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fc, code lost:
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.f16795a.f16787u)) goto L_0x00b3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void l(@d.m0 android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 4
                r3 = 6
                r4 = 3
                if (r1 >= 0) goto L_0x0027
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.f16768b
                if (r8 == 0) goto L_0x0017
            L_0x0010:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f16784r
            L_0x0014:
                r2 = r4
                goto L_0x00ff
            L_0x0017:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f16785s
                if (r8 <= r0) goto L_0x0024
                r8 = r0
                goto L_0x00b7
            L_0x0024:
                int r8 = r9.f16783q
                goto L_0x0014
            L_0x0027:
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r1.f16789w
                if (r5 == 0) goto L_0x007c
                boolean r1 = r1.H0(r7, r9)
                if (r1 == 0) goto L_0x007c
                float r8 = java.lang.Math.abs(r8)
                float r0 = java.lang.Math.abs(r9)
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x0045
                r8 = 1140457472(0x43fa0000, float:500.0)
                int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
                if (r8 > 0) goto L_0x004b
            L_0x0045:
                boolean r8 = r6.n(r7)
                if (r8 == 0) goto L_0x0052
            L_0x004b:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.G
                r2 = 5
                goto L_0x00ff
            L_0x0052:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.f16768b
                if (r8 == 0) goto L_0x005b
                goto L_0x0010
            L_0x005b:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f16783q
                int r8 = r8 - r9
                int r8 = java.lang.Math.abs(r8)
                int r9 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f16785s
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r8 >= r9) goto L_0x00b3
            L_0x0077:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f16783q
                goto L_0x0014
            L_0x007c:
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00b9
                float r8 = java.lang.Math.abs(r8)
                float r9 = java.lang.Math.abs(r9)
                int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
                if (r8 <= 0) goto L_0x008d
                goto L_0x00b9
            L_0x008d:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.f16768b
                if (r8 == 0) goto L_0x009a
            L_0x0095:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f16787u
                goto L_0x00ff
            L_0x009a:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f16785s
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f16787u
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0095
            L_0x00b3:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f16785s
            L_0x00b7:
                r2 = r3
                goto L_0x00ff
            L_0x00b9:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f16768b
                if (r9 == 0) goto L_0x00dc
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f16784r
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f16787u
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0095
                goto L_0x0010
            L_0x00dc:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f16785s
                if (r8 >= r0) goto L_0x00ed
                int r9 = r9.f16787u
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                if (r8 >= r9) goto L_0x00b3
                goto L_0x0077
            L_0x00ed:
                int r9 = r8 - r0
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f16787u
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0095
                goto L_0x00b3
            L_0x00ff:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r0 = 1
                r9.I0(r7, r2, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        public boolean m(@m0 View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f16792z;
            if (i11 == 1 || bottomSheetBehavior.N) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.L == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.I;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.H;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(@m0 View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.G + bottomSheetBehavior.a0()) / 2;
        }
    }

    public class e implements c0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f16796a;

        public e(int i10) {
            this.f16796a = i10;
        }

        public boolean a(@m0 View view, @o0 c0.a aVar) {
            BottomSheetBehavior.this.B0(this.f16796a);
            return true;
        }
    }

    public static abstract class f {
        public abstract void a(@m0 View view, float f10);

        public abstract void b(@m0 View view, int i10);
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    public class h implements Runnable {
        public final View O;
        public boolean P;
        public int Q;

        public h(View view, int i10) {
            this.O = view;
            this.Q = i10;
        }

        public void run() {
            m1.c cVar = BottomSheetBehavior.this.A;
            if (cVar == null || !cVar.o(true)) {
                BottomSheetBehavior.this.C0(this.Q);
            } else {
                w1.n1(this.O, this);
            }
            this.P = false;
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(@m0 Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f16774h = context.getResources().getDimensionPixelSize(a.f.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.BottomSheetBehavior_Layout);
        this.f16775i = obtainStyledAttributes.hasValue(a.o.BottomSheetBehavior_Layout_shapeAppearance);
        int i11 = a.o.BottomSheetBehavior_Layout_backgroundTint;
        boolean hasValue = obtainStyledAttributes.hasValue(i11);
        if (hasValue) {
            U(context, attributeSet, hasValue, w9.c.a(context, obtainStyledAttributes, i11));
        } else {
            T(context, attributeSet, hasValue);
        }
        V();
        this.f16788v = obtainStyledAttributes.getDimension(a.o.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i12 = a.o.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i12);
        if (peekValue == null || (i10 = peekValue.data) != -1) {
            x0(obtainStyledAttributes.getDimensionPixelSize(i12, -1));
        } else {
            x0(i10);
        }
        w0(obtainStyledAttributes.getBoolean(a.o.BottomSheetBehavior_Layout_behavior_hideable, false));
        u0(obtainStyledAttributes.getBoolean(a.o.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        t0(obtainStyledAttributes.getBoolean(a.o.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        A0(obtainStyledAttributes.getBoolean(a.o.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        r0(obtainStyledAttributes.getBoolean(a.o.BottomSheetBehavior_Layout_behavior_draggable, true));
        z0(obtainStyledAttributes.getInt(a.o.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        v0(obtainStyledAttributes.getFloat(a.o.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i13 = a.o.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i13);
        s0((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(i13, 0) : peekValue2.data);
        obtainStyledAttributes.recycle();
        this.f16770d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @m0
    public static <V extends View> BottomSheetBehavior<V> Z(@m0 V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.g) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.g) layoutParams).f();
            if (f10 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f10;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public void A0(boolean z10) {
        this.f16790x = z10;
    }

    public boolean B(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10, @m0 View view, @m0 View view2, int i10, int i11) {
        this.C = 0;
        this.D = false;
        return (i10 & 2) != 0;
    }

    public void B0(int i10) {
        if (i10 != this.f16792z) {
            if (this.H != null) {
                G0(i10);
            } else if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f16789w && i10 == 5)) {
                this.f16792z = i10;
            }
        }
    }

    public void C0(int i10) {
        View view;
        if (this.f16792z != i10) {
            this.f16792z = i10;
            WeakReference<V> weakReference = this.H;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i10 == 3) {
                    L0(true);
                } else if (i10 == 6 || i10 == 5 || i10 == 4) {
                    L0(false);
                }
                K0(i10);
                for (int i11 = 0; i11 < this.J.size(); i11++) {
                    this.J.get(i11).b(view, i10);
                }
                J0();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (java.lang.Math.abs(r3 - r2.f16784r) < java.lang.Math.abs(r3 - r2.f16787u)) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        if (r3 < java.lang.Math.abs(r3 - r2.f16787u)) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f16787u)) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a6, code lost:
        if (java.lang.Math.abs(r3 - r2.f16785s) < java.lang.Math.abs(r3 - r2.f16787u)) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D(@d.m0 androidx.coordinatorlayout.widget.CoordinatorLayout r3, @d.m0 V r4, @d.m0 android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.a0()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.C0(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.I
            if (r3 == 0) goto L_0x00b1
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x00b1
            boolean r3 = r2.D
            if (r3 != 0) goto L_0x001f
            goto L_0x00b1
        L_0x001f:
            int r3 = r2.C
            r5 = 4
            r6 = 6
            if (r3 <= 0) goto L_0x003c
            boolean r3 = r2.f16768b
            if (r3 == 0) goto L_0x002d
        L_0x0029:
            int r3 = r2.f16784r
            goto L_0x00ab
        L_0x002d:
            int r3 = r4.getTop()
            int r5 = r2.f16785s
            if (r3 <= r5) goto L_0x0038
            r3 = r5
            goto L_0x00aa
        L_0x0038:
            int r3 = r2.f16783q
            goto L_0x00ab
        L_0x003c:
            boolean r3 = r2.f16789w
            if (r3 == 0) goto L_0x004e
            float r3 = r2.h0()
            boolean r3 = r2.H0(r4, r3)
            if (r3 == 0) goto L_0x004e
            int r3 = r2.G
            r0 = 5
            goto L_0x00ab
        L_0x004e:
            int r3 = r2.C
            if (r3 != 0) goto L_0x008b
            int r3 = r4.getTop()
            boolean r1 = r2.f16768b
            if (r1 == 0) goto L_0x006c
            int r6 = r2.f16784r
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            int r1 = r2.f16787u
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r6 >= r3) goto L_0x008f
            goto L_0x0029
        L_0x006c:
            int r1 = r2.f16785s
            if (r3 >= r1) goto L_0x007b
            int r5 = r2.f16787u
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r3 >= r5) goto L_0x00a8
            goto L_0x0038
        L_0x007b:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f16787u
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x008f
            goto L_0x00a8
        L_0x008b:
            boolean r3 = r2.f16768b
            if (r3 == 0) goto L_0x0093
        L_0x008f:
            int r3 = r2.f16787u
            r0 = r5
            goto L_0x00ab
        L_0x0093:
            int r3 = r4.getTop()
            int r0 = r2.f16785s
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f16787u
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x008f
        L_0x00a8:
            int r3 = r2.f16785s
        L_0x00aa:
            r0 = r6
        L_0x00ab:
            r5 = 0
            r2.I0(r4, r0, r3, r5)
            r2.D = r5
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public final void D0(@m0 View view) {
        if (Build.VERSION.SDK_INT >= 29 && !k0() && !this.f16772f) {
            v.d(view, new c());
        }
    }

    public boolean E(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10, @m0 MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f16792z == 1 && actionMasked == 0) {
            return true;
        }
        m1.c cVar = this.A;
        if (cVar != null) {
            cVar.L(motionEvent);
        }
        if (actionMasked == 0) {
            o0();
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        if (this.A != null && actionMasked == 2 && !this.B && Math.abs(((float) this.M) - motionEvent.getY()) > ((float) this.A.D())) {
            this.A.d(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.B;
    }

    public void E0(boolean z10) {
        this.f16769c = z10;
    }

    public void F0(@m0 View view, int i10) {
        int i11;
        int i12;
        if (i10 == 4) {
            i11 = this.f16787u;
        } else if (i10 == 6) {
            int i13 = this.f16785s;
            if (!this.f16768b || i13 > (i12 = this.f16784r)) {
                i11 = i13;
            } else {
                i10 = 3;
                i11 = i12;
            }
        } else if (i10 == 3) {
            i11 = a0();
        } else if (!this.f16789w || i10 != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i10);
        } else {
            i11 = this.G;
        }
        I0(view, i10, i11, false);
    }

    public final void G0(int i10) {
        View view = (View) this.H.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !w1.N0(view)) {
                F0(view, i10);
            } else {
                view.post(new a(view, i10));
            }
        }
    }

    public boolean H0(@m0 View view, float f10) {
        if (this.f16790x) {
            return true;
        }
        if (view.getTop() < this.f16787u) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f10 * 0.1f)) - ((float) this.f16787u)) / ((float) R()) > 0.5f;
    }

    public void I0(View view, int i10, int i11, boolean z10) {
        m1.c cVar = this.A;
        if (cVar != null && (!z10 ? cVar.V(view, view.getLeft(), i11) : cVar.T(view.getLeft(), i11))) {
            C0(2);
            K0(i10);
            if (this.f16781o == null) {
                this.f16781o = new h(view, i10);
            }
            if (!this.f16781o.P) {
                BottomSheetBehavior<V>.h hVar = this.f16781o;
                hVar.Q = i10;
                w1.n1(view, hVar);
                boolean unused = this.f16781o.P = true;
                return;
            }
            this.f16781o.Q = i10;
            return;
        }
        C0(i10);
    }

    public final void J0() {
        View view;
        z.a aVar;
        WeakReference<V> weakReference = this.H;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            w1.p1(view, 524288);
            w1.p1(view, 262144);
            w1.p1(view, 1048576);
            int i10 = this.P;
            if (i10 != -1) {
                w1.p1(view, i10);
            }
            int i11 = 6;
            if (this.f16792z != 6) {
                this.P = N(view, a.m.bottomsheet_action_expand_halfway, 6);
            }
            if (this.f16789w && this.f16792z != 5) {
                n0(view, z.a.f7619z, 5);
            }
            int i12 = this.f16792z;
            if (i12 == 3) {
                if (this.f16768b) {
                    i11 = 4;
                }
                aVar = z.a.f7618y;
            } else if (i12 == 4) {
                if (this.f16768b) {
                    i11 = 3;
                }
                aVar = z.a.f7617x;
            } else if (i12 == 6) {
                n0(view, z.a.f7618y, 4);
                n0(view, z.a.f7617x, 3);
                return;
            } else {
                return;
            }
            n0(view, aVar, i11);
        }
    }

    public final void K0(int i10) {
        ValueAnimator valueAnimator;
        if (i10 != 2) {
            boolean z10 = i10 == 3;
            if (this.f16780n != z10) {
                this.f16780n = z10;
                if (this.f16776j != null && (valueAnimator = this.f16782p) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f16782p.reverse();
                        return;
                    }
                    float f10 = z10 ? 0.0f : 1.0f;
                    this.f16782p.setFloatValues(new float[]{1.0f - f10, f10});
                    this.f16782p.start();
                }
            }
        }
    }

    public final void L0(boolean z10) {
        Map<View, Integer> map;
        int intValue;
        WeakReference<V> weakReference = this.H;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z10) {
                    if (this.O == null) {
                        this.O = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i10 = 0; i10 < childCount; i10++) {
                    V childAt = coordinatorLayout.getChildAt(i10);
                    if (childAt != this.H.get()) {
                        if (z10) {
                            this.O.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f16769c) {
                                intValue = 4;
                            }
                        } else if (this.f16769c && (map = this.O) != null && map.containsKey(childAt)) {
                            intValue = this.O.get(childAt).intValue();
                        }
                        w1.P1(childAt, intValue);
                    }
                }
                if (!z10) {
                    this.O = null;
                } else if (this.f16769c) {
                    ((View) this.H.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    public final void M0(boolean z10) {
        View view;
        if (this.H != null) {
            P();
            if (this.f16792z == 4 && (view = (View) this.H.get()) != null) {
                if (z10) {
                    G0(this.f16792z);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    public final int N(V v10, @a1 int i10, int i11) {
        return w1.b(v10, v10.getResources().getString(i10), S(i11));
    }

    public void O(@m0 f fVar) {
        if (!this.J.contains(fVar)) {
            this.J.add(fVar);
        }
    }

    public final void P() {
        int R2 = R();
        if (this.f16768b) {
            this.f16787u = Math.max(this.G - R2, this.f16784r);
        } else {
            this.f16787u = this.G - R2;
        }
    }

    public final void Q() {
        this.f16785s = (int) (((float) this.G) * (1.0f - this.f16786t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = r3.f16777k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int R() {
        /*
            r3 = this;
            boolean r0 = r3.f16772f
            if (r0 == 0) goto L_0x001a
            int r0 = r3.f16773g
            int r1 = r3.G
            int r2 = r3.F
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.E
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L_0x001a:
            boolean r0 = r3.f16778l
            if (r0 != 0) goto L_0x002c
            int r0 = r3.f16777k
            if (r0 <= 0) goto L_0x002c
            int r1 = r3.f16771e
            int r2 = r3.f16774h
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x002c:
            int r0 = r3.f16771e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.R():int");
    }

    public final c0 S(int i10) {
        return new e(i10);
    }

    public final void T(@m0 Context context, AttributeSet attributeSet, boolean z10) {
        U(context, attributeSet, z10, (ColorStateList) null);
    }

    public final void U(@m0 Context context, AttributeSet attributeSet, boolean z10, @o0 ColorStateList colorStateList) {
        if (this.f16775i) {
            this.f16779m = o.e(context, attributeSet, a.c.bottomSheetStyle, f16766j0).m();
            j jVar = new j(this.f16779m);
            this.f16776j = jVar;
            jVar.Y(context);
            if (!z10 || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f16776j.setTint(typedValue.data);
                return;
            }
            this.f16776j.n0(colorStateList);
        }
    }

    public final void V() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f16782p = ofFloat;
        ofFloat.setDuration(500);
        this.f16782p.addUpdateListener(new b());
    }

    @x0({x0.a.LIBRARY_GROUP})
    @g1
    public void W() {
        this.f16782p = null;
    }

    public void X(int i10) {
        float f10;
        float f11;
        View view = (View) this.H.get();
        if (view != null && !this.J.isEmpty()) {
            int i11 = this.f16787u;
            if (i10 > i11 || i11 == a0()) {
                int i12 = this.f16787u;
                f10 = (float) (i12 - i10);
                f11 = (float) (this.G - i12);
            } else {
                int i13 = this.f16787u;
                f10 = (float) (i13 - i10);
                f11 = (float) (i13 - a0());
            }
            float f12 = f10 / f11;
            for (int i14 = 0; i14 < this.J.size(); i14++) {
                this.J.get(i14).a(view, f12);
            }
        }
    }

    @o0
    @g1
    public View Y(View view) {
        if (w1.V0(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View Y2 = Y(viewGroup.getChildAt(i10));
            if (Y2 != null) {
                return Y2;
            }
        }
        return null;
    }

    public int a0() {
        return this.f16768b ? this.f16784r : this.f16783q;
    }

    @d.v(from = 0.0d, to = 1.0d)
    public float b0() {
        return this.f16786t;
    }

    public int c0() {
        if (this.f16772f) {
            return -1;
        }
        return this.f16771e;
    }

    @g1
    public int d0() {
        return this.f16773g;
    }

    public int e0() {
        return this.f16767a;
    }

    public boolean f0() {
        return this.f16790x;
    }

    public int g0() {
        return this.f16792z;
    }

    public void h(@m0 CoordinatorLayout.g gVar) {
        super.h(gVar);
        this.H = null;
        this.A = null;
    }

    public final float h0() {
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f16770d);
        return this.K.getYVelocity(this.L);
    }

    public boolean i0() {
        return this.f16791y;
    }

    public boolean j0() {
        return this.f16768b;
    }

    public void k() {
        super.k();
        this.H = null;
        this.A = null;
    }

    public boolean k0() {
        return this.f16778l;
    }

    public boolean l(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10, @m0 MotionEvent motionEvent) {
        m1.c cVar;
        if (!v10.isShown() || !this.f16791y) {
            this.B = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            o0();
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.M = (int) motionEvent.getY();
            if (this.f16792z != 2) {
                WeakReference<View> weakReference = this.I;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.G(view2, x10, this.M)) {
                    this.L = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.N = true;
                }
            }
            this.B = this.L == -1 && !coordinatorLayout.G(v10, x10, this.M);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.N = false;
            this.L = -1;
            if (this.B) {
                this.B = false;
                return false;
            }
        }
        if (!this.B && (cVar = this.A) != null && cVar.U(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.I;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.B && this.f16792z != 1 && !coordinatorLayout.G(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.A != null && Math.abs(((float) this.M) - motionEvent.getY()) > ((float) this.A.D());
    }

    public boolean l0() {
        return this.f16789w;
    }

    public boolean m(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10, int i10) {
        int i11;
        j jVar;
        if (w1.S(coordinatorLayout) && !w1.S(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.H == null) {
            this.f16773g = coordinatorLayout.getResources().getDimensionPixelSize(a.f.design_bottom_sheet_peek_height_min);
            D0(v10);
            this.H = new WeakReference<>(v10);
            if (this.f16775i && (jVar = this.f16776j) != null) {
                w1.G1(v10, jVar);
            }
            j jVar2 = this.f16776j;
            if (jVar2 != null) {
                float f10 = this.f16788v;
                if (f10 == -1.0f) {
                    f10 = w1.P(v10);
                }
                jVar2.m0(f10);
                boolean z10 = this.f16792z == 3;
                this.f16780n = z10;
                this.f16776j.o0(z10 ? 0.0f : 1.0f);
            }
            J0();
            if (w1.T(v10) == 0) {
                w1.P1(v10, 1);
            }
        }
        if (this.A == null) {
            this.A = m1.c.q(coordinatorLayout, this.Q);
        }
        int top = v10.getTop();
        coordinatorLayout.N(v10, i10);
        this.F = coordinatorLayout.getWidth();
        this.G = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.E = height;
        this.f16784r = Math.max(0, this.G - height);
        Q();
        P();
        int i12 = this.f16792z;
        if (i12 == 3) {
            i11 = a0();
        } else if (i12 == 6) {
            i11 = this.f16785s;
        } else if (this.f16789w && i12 == 5) {
            i11 = this.G;
        } else if (i12 == 4) {
            i11 = this.f16787u;
        } else {
            if (i12 == 1 || i12 == 2) {
                w1.d1(v10, top - v10.getTop());
            }
            this.I = new WeakReference<>(Y(v10));
            return true;
        }
        w1.d1(v10, i11);
        this.I = new WeakReference<>(Y(v10));
        return true;
    }

    public void m0(@m0 f fVar) {
        this.J.remove(fVar);
    }

    public final void n0(V v10, z.a aVar, int i10) {
        w1.s1(v10, aVar, (CharSequence) null, S(i10));
    }

    public final void o0() {
        this.L = -1;
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K = null;
        }
    }

    public boolean p(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10, @m0 View view, float f10, float f11) {
        WeakReference<View> weakReference = this.I;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.f16792z != 3 || super.p(coordinatorLayout, v10, view, f10, f11);
    }

    public final void p0(@m0 SavedState savedState) {
        int i10 = this.f16767a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f16771e = savedState.R;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f16768b = savedState.S;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.f16789w = savedState.T;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.f16790x = savedState.U;
            }
        }
    }

    @Deprecated
    public void q0(f fVar) {
        this.J.clear();
        if (fVar != null) {
            this.J.add(fVar);
        }
    }

    public void r(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10, @m0 View view, int i10, int i11, @m0 int[] iArr, int i12) {
        int i13;
        if (i12 != 1) {
            WeakReference<View> weakReference = this.I;
            if (view == (weakReference != null ? weakReference.get() : null)) {
                int top = v10.getTop();
                int i14 = top - i11;
                if (i11 <= 0) {
                    if (i11 < 0 && !view.canScrollVertically(-1)) {
                        int i15 = this.f16787u;
                        if (i14 > i15 && !this.f16789w) {
                            int i16 = top - i15;
                            iArr[1] = i16;
                            w1.d1(v10, -i16);
                            i13 = 4;
                        } else if (this.f16791y) {
                            iArr[1] = i11;
                            w1.d1(v10, -i11);
                            C0(1);
                        } else {
                            return;
                        }
                    }
                    X(v10.getTop());
                    this.C = i11;
                    this.D = true;
                } else if (i14 < a0()) {
                    int a02 = top - a0();
                    iArr[1] = a02;
                    w1.d1(v10, -a02);
                    i13 = 3;
                } else if (this.f16791y) {
                    iArr[1] = i11;
                    w1.d1(v10, -i11);
                    C0(1);
                    X(v10.getTop());
                    this.C = i11;
                    this.D = true;
                } else {
                    return;
                }
                C0(i13);
                X(v10.getTop());
                this.C = i11;
                this.D = true;
            }
        }
    }

    public void r0(boolean z10) {
        this.f16791y = z10;
    }

    public void s0(int i10) {
        if (i10 >= 0) {
            this.f16783q = i10;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void t0(boolean z10) {
        if (this.f16768b != z10) {
            this.f16768b = z10;
            if (this.H != null) {
                P();
            }
            C0((!this.f16768b || this.f16792z != 6) ? this.f16792z : 3);
            J0();
        }
    }

    public void u(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10, @m0 View view, int i10, int i11, int i12, int i13, int i14, @m0 int[] iArr) {
    }

    public void u0(boolean z10) {
        this.f16778l = z10;
    }

    public void v0(@d.v(from = 0.0d, to = 1.0d) float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f16786t = f10;
        if (this.H != null) {
            Q();
        }
    }

    public void w0(boolean z10) {
        if (this.f16789w != z10) {
            this.f16789w = z10;
            if (!z10 && this.f16792z == 5) {
                B0(4);
            }
            J0();
        }
    }

    public void x0(int i10) {
        y0(i10, false);
    }

    public void y(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10, @m0 Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.y(coordinatorLayout, v10, savedState.a());
        p0(savedState);
        int i10 = savedState.Q;
        if (i10 == 1 || i10 == 2) {
            i10 = 4;
        }
        this.f16792z = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f16772f
            if (r4 != 0) goto L_0x0015
            r3.f16772f = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f16772f
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f16771e
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r1
            goto L_0x001f
        L_0x0017:
            r3.f16772f = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f16771e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.M0(r5)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.y0(int, boolean):void");
    }

    @m0
    public Parcelable z(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10) {
        return new SavedState(super.z(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    public void z0(int i10) {
        this.f16767a = i10;
    }
}

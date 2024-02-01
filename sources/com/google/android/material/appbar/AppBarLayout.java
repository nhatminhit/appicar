package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import d.b0;
import d.g1;
import d.l;
import d.m0;
import d.o0;
import d.t0;
import d.u;
import d.x0;
import e1.i;
import f1.e3;
import f1.j0;
import f1.p0;
import f1.w1;
import g1.c0;
import g1.z;
import i9.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k9.f;
import z9.j;
import z9.k;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: i0  reason: collision with root package name */
    public static final int f16570i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f16571j0 = 1;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f16572k0 = 2;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f16573l0 = 4;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f16574m0 = 8;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f16575n0 = a.n.Widget_Design_AppBarLayout;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f16576o0 = -1;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public int T;
    @o0
    public e3 U;
    public List<c> V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f16577a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f16578b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f16579c0;
    @b0

    /* renamed from: d0  reason: collision with root package name */
    public int f16580d0;
    @o0

    /* renamed from: e0  reason: collision with root package name */
    public WeakReference<View> f16581e0;
    @o0

    /* renamed from: f0  reason: collision with root package name */
    public ValueAnimator f16582f0;

    /* renamed from: g0  reason: collision with root package name */
    public int[] f16583g0;
    @o0

    /* renamed from: h0  reason: collision with root package name */
    public Drawable f16584h0;

    public static class BaseBehavior<T extends AppBarLayout> extends k9.e<T> {

        /* renamed from: t  reason: collision with root package name */
        public static final int f16585t = 600;

        /* renamed from: u  reason: collision with root package name */
        public static final int f16586u = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f16587l;

        /* renamed from: m  reason: collision with root package name */
        public int f16588m;

        /* renamed from: n  reason: collision with root package name */
        public ValueAnimator f16589n;

        /* renamed from: o  reason: collision with root package name */
        public int f16590o = -1;

        /* renamed from: p  reason: collision with root package name */
        public boolean f16591p;

        /* renamed from: q  reason: collision with root package name */
        public float f16592q;
        @o0

        /* renamed from: r  reason: collision with root package name */
        public WeakReference<View> f16593r;

        /* renamed from: s  reason: collision with root package name */
        public d f16594s;

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();
            public int Q;
            public float R;
            public boolean S;

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

            public SavedState(@m0 Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.Q = parcel.readInt();
                this.R = parcel.readFloat();
                this.S = parcel.readByte() != 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(@m0 Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeInt(this.Q);
                parcel.writeFloat(this.R);
                parcel.writeByte(this.S ? (byte) 1 : 0);
            }
        }

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f16595a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f16596b;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f16595a = coordinatorLayout;
                this.f16596b = appBarLayout;
            }

            public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
                BaseBehavior.this.X(this.f16595a, this.f16596b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public class b implements c0 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f16598a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f16599b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ View f16600c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ int f16601d;

            public b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
                this.f16598a = coordinatorLayout;
                this.f16599b = appBarLayout;
                this.f16600c = view;
                this.f16601d = i10;
            }

            public boolean a(@m0 View view, @o0 c0.a aVar) {
                BaseBehavior.this.r(this.f16598a, this.f16599b, this.f16600c, 0, this.f16601d, new int[]{0, 0}, 1);
                return true;
            }
        }

        public class c implements c0 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f16603a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ boolean f16604b;

            public c(AppBarLayout appBarLayout, boolean z10) {
                this.f16603a = appBarLayout;
                this.f16604b = z10;
            }

            public boolean a(@m0 View view, @o0 c0.a aVar) {
                this.f16603a.setExpanded(this.f16604b);
                return true;
            }
        }

        public static abstract class d<T extends AppBarLayout> {
            public abstract boolean a(@m0 T t10);
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static boolean g0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        @o0
        public static View i0(@m0 AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        public final void A0(CoordinatorLayout coordinatorLayout, @m0 T t10) {
            int U = U();
            int j02 = j0(t10, U);
            if (j02 >= 0) {
                View childAt = t10.getChildAt(j02);
                d dVar = (d) childAt.getLayoutParams();
                int a10 = dVar.a();
                if ((a10 & 17) == 17) {
                    int i10 = -childAt.getTop();
                    int i11 = -childAt.getBottom();
                    if (j02 == t10.getChildCount() - 1) {
                        i11 += t10.getTopInset();
                    }
                    if (g0(a10, 2)) {
                        i11 += w1.c0(childAt);
                    } else if (g0(a10, 5)) {
                        int c02 = w1.c0(childAt) + i11;
                        if (U < c02) {
                            i10 = c02;
                        } else {
                            i11 = c02;
                        }
                    }
                    if (g0(a10, 32)) {
                        i10 += dVar.topMargin;
                        i11 -= dVar.bottomMargin;
                    }
                    if (U < (i11 + i10) / 2) {
                        i10 = i11;
                    }
                    c0(coordinatorLayout, t10, v0.a.c(i10, -t10.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void B0(CoordinatorLayout coordinatorLayout, @m0 T t10) {
            w1.p1(coordinatorLayout, z.a.f7611r.b());
            w1.p1(coordinatorLayout, z.a.f7612s.b());
            View h02 = h0(coordinatorLayout);
            if (h02 != null && t10.getTotalScrollRange() != 0 && (((CoordinatorLayout.g) h02.getLayoutParams()).f() instanceof ScrollingViewBehavior)) {
                a0(coordinatorLayout, t10, h02);
            }
        }

        public final void C0(@m0 CoordinatorLayout coordinatorLayout, @m0 T t10, int i10, int i11, boolean z10) {
            View i02 = i0(t10, i10);
            if (i02 != null) {
                int a10 = ((d) i02.getLayoutParams()).a();
                boolean z11 = false;
                if ((a10 & 1) != 0) {
                    int c02 = w1.c0(i02);
                    if (i11 <= 0 || (a10 & 12) == 0 ? !((a10 & 2) == 0 || (-i10) < (i02.getBottom() - c02) - t10.getTopInset()) : (-i10) >= (i02.getBottom() - c02) - t10.getTopInset()) {
                        z11 = true;
                    }
                }
                if (t10.l()) {
                    z11 = t10.z(h0(coordinatorLayout));
                }
                boolean x10 = t10.x(z11);
                if (z10 || (x10 && z0(coordinatorLayout, t10))) {
                    t10.jumpDrawablesToCurrentState();
                }
            }
        }

        public int U() {
            return H() + this.f16587l;
        }

        public final void a0(CoordinatorLayout coordinatorLayout, @m0 T t10, @m0 View view) {
            if (U() != (-t10.getTotalScrollRange()) && view.canScrollVertically(1)) {
                b0(coordinatorLayout, t10, z.a.f7611r, false);
            }
            if (U() == 0) {
                return;
            }
            if (view.canScrollVertically(-1)) {
                int i10 = -t10.getDownNestedPreScrollRange();
                if (i10 != 0) {
                    w1.s1(coordinatorLayout, z.a.f7612s, (CharSequence) null, new b(coordinatorLayout, t10, view, i10));
                    return;
                }
                return;
            }
            b0(coordinatorLayout, t10, z.a.f7612s, true);
        }

        public final void b0(CoordinatorLayout coordinatorLayout, @m0 T t10, @m0 z.a aVar, boolean z10) {
            w1.s1(coordinatorLayout, aVar, (CharSequence) null, new c(t10, z10));
        }

        public final void c0(CoordinatorLayout coordinatorLayout, @m0 T t10, int i10, float f10) {
            int abs = Math.abs(U() - i10);
            float abs2 = Math.abs(f10);
            d0(coordinatorLayout, t10, i10, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t10.getHeight())) + 1.0f) * 150.0f));
        }

        public final void d0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11) {
            int U = U();
            if (U == i10) {
                ValueAnimator valueAnimator = this.f16589n;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f16589n.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f16589n;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f16589n = valueAnimator3;
                valueAnimator3.setInterpolator(j9.a.f19832e);
                this.f16589n.addUpdateListener(new a(coordinatorLayout, t10));
            } else {
                valueAnimator2.cancel();
            }
            this.f16589n.setDuration((long) Math.min(i11, 600));
            this.f16589n.setIntValues(new int[]{U, i10});
            this.f16589n.start();
        }

        /* renamed from: e0 */
        public boolean P(T t10) {
            d dVar = this.f16594s;
            if (dVar != null) {
                return dVar.a(t10);
            }
            WeakReference<View> weakReference = this.f16593r;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        public final boolean f0(@m0 CoordinatorLayout coordinatorLayout, @m0 T t10, @m0 View view) {
            return t10.j() && coordinatorLayout.getHeight() - view.getHeight() <= t10.getHeight();
        }

        @o0
        public final View h0(@m0 CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof j0) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final int j0(@m0 T t10, int i10) {
            int childCount = t10.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t10.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (g0(dVar.a(), 32)) {
                    top -= dVar.topMargin;
                    bottom += dVar.bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        /* renamed from: k0 */
        public int S(@m0 T t10) {
            return -t10.getDownNestedScrollRange();
        }

        /* renamed from: l0 */
        public int T(@m0 T t10) {
            return t10.getTotalScrollRange();
        }

        public final int m0(@m0 T t10, int i10) {
            int abs = Math.abs(i10);
            int childCount = t10.getChildCount();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = t10.getChildAt(i12);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator b10 = dVar.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i12++;
                } else if (b10 != null) {
                    int a10 = dVar.a();
                    if ((a10 & 1) != 0) {
                        i11 = 0 + childAt.getHeight() + dVar.topMargin + dVar.bottomMargin;
                        if ((a10 & 2) != 0) {
                            i11 -= w1.c0(childAt);
                        }
                    }
                    if (w1.S(childAt)) {
                        i11 -= t10.getTopInset();
                    }
                    if (i11 > 0) {
                        float f10 = (float) i11;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * b10.getInterpolation(((float) (abs - childAt.getTop())) / f10)));
                    }
                }
            }
            return i10;
        }

        @g1
        public boolean n0() {
            ValueAnimator valueAnimator = this.f16589n;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        /* renamed from: o0 */
        public void V(@m0 CoordinatorLayout coordinatorLayout, @m0 T t10) {
            A0(coordinatorLayout, t10);
            if (t10.l()) {
                t10.x(t10.z(h0(coordinatorLayout)));
            }
        }

        /* renamed from: p0 */
        public boolean m(@m0 CoordinatorLayout coordinatorLayout, @m0 T t10, int i10) {
            boolean m10 = super.m(coordinatorLayout, t10, i10);
            int pendingAction = t10.getPendingAction();
            int i11 = this.f16590o;
            if (i11 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t10.getChildAt(i11);
                X(coordinatorLayout, t10, (-childAt.getBottom()) + (this.f16591p ? w1.c0(childAt) + t10.getTopInset() : Math.round(((float) childAt.getHeight()) * this.f16592q)));
            } else if (pendingAction != 0) {
                boolean z10 = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i12 = -t10.getUpNestedPreScrollRange();
                    if (z10) {
                        c0(coordinatorLayout, t10, i12, 0.0f);
                    } else {
                        X(coordinatorLayout, t10, i12);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z10) {
                        c0(coordinatorLayout, t10, 0, 0.0f);
                    } else {
                        X(coordinatorLayout, t10, 0);
                    }
                }
            }
            t10.r();
            this.f16590o = -1;
            N(v0.a.c(H(), -t10.getTotalScrollRange(), 0));
            C0(coordinatorLayout, t10, H(), 0, true);
            t10.n(H());
            B0(coordinatorLayout, t10);
            return m10;
        }

        /* renamed from: q0 */
        public boolean n(@m0 CoordinatorLayout coordinatorLayout, @m0 T t10, int i10, int i11, int i12, int i13) {
            if (((CoordinatorLayout.g) t10.getLayoutParams()).height != -2) {
                return super.n(coordinatorLayout, t10, i10, i11, i12, i13);
            }
            coordinatorLayout.O(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* renamed from: r0 */
        public void r(CoordinatorLayout coordinatorLayout, @m0 T t10, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int i14;
            if (i11 != 0) {
                if (i11 < 0) {
                    i14 = -t10.getTotalScrollRange();
                    i13 = t10.getDownNestedPreScrollRange() + i14;
                } else {
                    i14 = -t10.getUpNestedPreScrollRange();
                    i13 = 0;
                }
                int i15 = i14;
                int i16 = i13;
                if (i15 != i16) {
                    iArr[1] = W(coordinatorLayout, t10, i11, i15, i16);
                }
            }
            if (t10.l()) {
                t10.x(t10.z(view));
            }
        }

        /* renamed from: s0 */
        public void u(CoordinatorLayout coordinatorLayout, @m0 T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = W(coordinatorLayout, t10, i13, -t10.getDownNestedScrollRange(), 0);
            }
            if (i13 == 0) {
                B0(coordinatorLayout, t10);
            }
        }

        /* renamed from: t0 */
        public void y(@m0 CoordinatorLayout coordinatorLayout, @m0 T t10, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.y(coordinatorLayout, t10, savedState.a());
                this.f16590o = savedState.Q;
                this.f16592q = savedState.R;
                this.f16591p = savedState.S;
                return;
            }
            super.y(coordinatorLayout, t10, parcelable);
            this.f16590o = -1;
        }

        /* renamed from: u0 */
        public Parcelable z(@m0 CoordinatorLayout coordinatorLayout, @m0 T t10) {
            Parcelable z10 = super.z(coordinatorLayout, t10);
            int H = H();
            int childCount = t10.getChildCount();
            boolean z11 = false;
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + H;
                if (childAt.getTop() + H > 0 || bottom < 0) {
                    i10++;
                } else {
                    SavedState savedState = new SavedState(z10);
                    savedState.Q = i10;
                    if (bottom == w1.c0(childAt) + t10.getTopInset()) {
                        z11 = true;
                    }
                    savedState.S = z11;
                    savedState.R = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return z10;
        }

        /* renamed from: v0 */
        public boolean B(@m0 CoordinatorLayout coordinatorLayout, @m0 T t10, @m0 View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t10.l() || f0(coordinatorLayout, t10, view));
            if (z10 && (valueAnimator = this.f16589n) != null) {
                valueAnimator.cancel();
            }
            this.f16593r = null;
            this.f16588m = i11;
            return z10;
        }

        /* renamed from: w0 */
        public void D(CoordinatorLayout coordinatorLayout, @m0 T t10, View view, int i10) {
            if (this.f16588m == 0 || i10 == 1) {
                A0(coordinatorLayout, t10);
                if (t10.l()) {
                    t10.x(t10.z(view));
                }
            }
            this.f16593r = new WeakReference<>(view);
        }

        public void x0(@o0 d dVar) {
            this.f16594s = dVar;
        }

        /* renamed from: y0 */
        public int Y(@m0 CoordinatorLayout coordinatorLayout, @m0 T t10, int i10, int i11, int i12) {
            int U = U();
            int i13 = 0;
            if (i11 == 0 || U < i11 || U > i12) {
                this.f16587l = 0;
            } else {
                int c10 = v0.a.c(i10, i11, i12);
                if (U != c10) {
                    int m02 = t10.h() ? m0(t10, c10) : c10;
                    boolean N = N(m02);
                    i13 = U - c10;
                    this.f16587l = c10 - m02;
                    if (!N && t10.h()) {
                        coordinatorLayout.k(t10);
                    }
                    t10.n(H());
                    C0(coordinatorLayout, t10, c10, c10 < U ? -1 : 1, false);
                }
            }
            B0(coordinatorLayout, t10);
            return i13;
        }

        public final boolean z0(@m0 CoordinatorLayout coordinatorLayout, @m0 T t10) {
            List<View> x10 = coordinatorLayout.x(t10);
            int size = x10.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c f10 = ((CoordinatorLayout.g) x10.get(i10).getLayoutParams()).f();
                if (f10 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f10).S() != 0;
                }
            }
            return false;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class a extends BaseBehavior.d<AppBarLayout> {
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public /* bridge */ /* synthetic */ int G() {
            return super.G();
        }

        public /* bridge */ /* synthetic */ int H() {
            return super.H();
        }

        public /* bridge */ /* synthetic */ boolean I() {
            return super.I();
        }

        public /* bridge */ /* synthetic */ boolean J() {
            return super.J();
        }

        public /* bridge */ /* synthetic */ void L(boolean z10) {
            super.L(z10);
        }

        public /* bridge */ /* synthetic */ boolean M(int i10) {
            return super.M(i10);
        }

        public /* bridge */ /* synthetic */ boolean N(int i10) {
            return super.N(i10);
        }

        public /* bridge */ /* synthetic */ void O(boolean z10) {
            super.O(z10);
        }

        public /* bridge */ /* synthetic */ boolean p0(@m0 CoordinatorLayout coordinatorLayout, @m0 AppBarLayout appBarLayout, int i10) {
            return super.m(coordinatorLayout, appBarLayout, i10);
        }

        public /* bridge */ /* synthetic */ boolean q0(@m0 CoordinatorLayout coordinatorLayout, @m0 AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.n(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        public /* bridge */ /* synthetic */ void r0(CoordinatorLayout coordinatorLayout, @m0 AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.r(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        public /* bridge */ /* synthetic */ void s0(CoordinatorLayout coordinatorLayout, @m0 AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.u(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        public /* bridge */ /* synthetic */ void t0(@m0 CoordinatorLayout coordinatorLayout, @m0 AppBarLayout appBarLayout, Parcelable parcelable) {
            super.y(coordinatorLayout, appBarLayout, parcelable);
        }

        public /* bridge */ /* synthetic */ Parcelable u0(@m0 CoordinatorLayout coordinatorLayout, @m0 AppBarLayout appBarLayout) {
            return super.z(coordinatorLayout, appBarLayout);
        }

        public /* bridge */ /* synthetic */ boolean v0(@m0 CoordinatorLayout coordinatorLayout, @m0 AppBarLayout appBarLayout, @m0 View view, View view2, int i10, int i11) {
            return super.B(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        public /* bridge */ /* synthetic */ void w0(CoordinatorLayout coordinatorLayout, @m0 AppBarLayout appBarLayout, View view, int i10) {
            super.D(coordinatorLayout, appBarLayout, view, i10);
        }

        public /* bridge */ /* synthetic */ void x0(@o0 BaseBehavior.d dVar) {
            super.x0(dVar);
        }
    }

    public static class ScrollingViewBehavior extends f {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.ScrollingViewBehavior_Layout);
            W(obtainStyledAttributes.getDimensionPixelSize(a.o.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        public static int Z(@m0 AppBarLayout appBarLayout) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.g) appBarLayout.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                return ((BaseBehavior) f10).U();
            }
            return 0;
        }

        public /* bridge */ /* synthetic */ int G() {
            return super.G();
        }

        public /* bridge */ /* synthetic */ int H() {
            return super.H();
        }

        public /* bridge */ /* synthetic */ boolean I() {
            return super.I();
        }

        public /* bridge */ /* synthetic */ boolean J() {
            return super.J();
        }

        public /* bridge */ /* synthetic */ void L(boolean z10) {
            super.L(z10);
        }

        public /* bridge */ /* synthetic */ boolean M(int i10) {
            return super.M(i10);
        }

        public /* bridge */ /* synthetic */ boolean N(int i10) {
            return super.N(i10);
        }

        public /* bridge */ /* synthetic */ void O(boolean z10) {
            super.O(z10);
        }

        public float R(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int Z = Z(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + Z > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) Z) / ((float) i10)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public int T(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.T(view);
        }

        @o0
        /* renamed from: Y */
        public AppBarLayout P(@m0 List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final void a0(@m0 View view, @m0 View view2) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.g) view2.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                w1.d1(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f10).f16587l) + U()) - Q(view2));
            }
        }

        public final void b0(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l()) {
                    appBarLayout.x(appBarLayout.z(view));
                }
            }
        }

        public boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean i(@m0 CoordinatorLayout coordinatorLayout, @m0 View view, @m0 View view2) {
            a0(view, view2);
            b0(view, view2);
            return false;
        }

        public void j(@m0 CoordinatorLayout coordinatorLayout, @m0 View view, @m0 View view2) {
            if (view2 instanceof AppBarLayout) {
                w1.p1(coordinatorLayout, z.a.f7611r.b());
                w1.p1(coordinatorLayout, z.a.f7612s.b());
            }
        }

        public /* bridge */ /* synthetic */ boolean m(@m0 CoordinatorLayout coordinatorLayout, @m0 View view, int i10) {
            return super.m(coordinatorLayout, view, i10);
        }

        public /* bridge */ /* synthetic */ boolean n(@m0 CoordinatorLayout coordinatorLayout, @m0 View view, int i10, int i11, int i12, int i13) {
            return super.n(coordinatorLayout, view, i10, i11, i12, i13);
        }

        public boolean x(@m0 CoordinatorLayout coordinatorLayout, @m0 View view, @m0 Rect rect, boolean z10) {
            AppBarLayout Y = P(coordinatorLayout.w(view));
            if (Y != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f19988d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Y.s(false, !z10);
                    return true;
                }
            }
            return false;
        }
    }

    public class a implements p0 {
        public a() {
        }

        public e3 a(View view, e3 e3Var) {
            return AppBarLayout.this.o(e3Var);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f16607a;

        public b(j jVar) {
            this.f16607a = jVar;
        }

        public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
            this.f16607a.m0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface c<T extends AppBarLayout> {
        void a(T t10, int i10);
    }

    public static class d extends LinearLayout.LayoutParams {

        /* renamed from: c  reason: collision with root package name */
        public static final int f16609c = 0;

        /* renamed from: d  reason: collision with root package name */
        public static final int f16610d = 1;

        /* renamed from: e  reason: collision with root package name */
        public static final int f16611e = 2;

        /* renamed from: f  reason: collision with root package name */
        public static final int f16612f = 4;

        /* renamed from: g  reason: collision with root package name */
        public static final int f16613g = 8;

        /* renamed from: h  reason: collision with root package name */
        public static final int f16614h = 16;

        /* renamed from: i  reason: collision with root package name */
        public static final int f16615i = 32;

        /* renamed from: j  reason: collision with root package name */
        public static final int f16616j = 5;

        /* renamed from: k  reason: collision with root package name */
        public static final int f16617k = 17;

        /* renamed from: l  reason: collision with root package name */
        public static final int f16618l = 10;

        /* renamed from: a  reason: collision with root package name */
        public int f16619a = 1;

        /* renamed from: b  reason: collision with root package name */
        public Interpolator f16620b;

        @x0({x0.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public d(int i10, int i11) {
            super(i10, i11);
        }

        public d(int i10, int i11, float f10) {
            super(i10, i11, f10);
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.AppBarLayout_Layout);
            this.f16619a = obtainStyledAttributes.getInt(a.o.AppBarLayout_Layout_layout_scrollFlags, 0);
            int i10 = a.o.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i10)) {
                this.f16620b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i10, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @t0(19)
        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        @t0(19)
        public d(@m0 d dVar) {
            super(dVar);
            this.f16619a = dVar.f16619a;
            this.f16620b = dVar.f16620b;
        }

        public int a() {
            return this.f16619a;
        }

        public Interpolator b() {
            return this.f16620b;
        }

        public boolean c() {
            int i10 = this.f16619a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void d(int i10) {
            this.f16619a = i10;
        }

        public void e(Interpolator interpolator) {
            this.f16620b = interpolator;
        }
    }

    public interface e extends c<AppBarLayout> {
        void a(AppBarLayout appBarLayout, int i10);
    }

    public AppBarLayout(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppBarLayout(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.appBarLayoutStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(@d.m0 android.content.Context r10, @d.o0 android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = f16575n0
            android.content.Context r10 = ca.a.c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.P = r10
            r9.Q = r10
            r9.R = r10
            r6 = 0
            r9.T = r6
            android.content.Context r7 = r9.getContext()
            r0 = 1
            r9.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            k9.i.a(r9)
            k9.i.c(r9, r11, r12, r4)
            int[] r2 = i9.a.o.AppBarLayout
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r12 = i9.a.o.AppBarLayout_android_background
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            f1.w1.G1(r9, r12)
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            boolean r12 = r12 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L_0x005b
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            android.graphics.drawable.ColorDrawable r12 = (android.graphics.drawable.ColorDrawable) r12
            z9.j r0 = new z9.j
            r0.<init>()
            int r12 = r12.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r0.n0(r12)
            r0.Y(r7)
            f1.w1.G1(r9, r0)
        L_0x005b:
            int r12 = i9.a.o.AppBarLayout_expanded
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x006a
            boolean r12 = r11.getBoolean(r12, r6)
            r9.t(r12, r6, r6)
        L_0x006a:
            int r12 = i9.a.o.AppBarLayout_elevation
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x007a
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            k9.i.b(r9, r12)
        L_0x007a:
            r12 = 26
            if (r8 < r12) goto L_0x009c
            int r12 = i9.a.o.AppBarLayout_android_keyboardNavigationCluster
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x008d
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setKeyboardNavigationCluster(r12)
        L_0x008d:
            int r12 = i9.a.o.AppBarLayout_android_touchscreenBlocksFocus
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x009c
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        L_0x009c:
            int r12 = i9.a.o.AppBarLayout_liftOnScroll
            boolean r12 = r11.getBoolean(r12, r6)
            r9.f16579c0 = r12
            int r12 = i9.a.o.AppBarLayout_liftOnScrollTargetViewId
            int r10 = r11.getResourceId(r12, r10)
            r9.f16580d0 = r10
            int r10 = i9.a.o.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            f1.w1.Y1(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final boolean A() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return childAt.getVisibility() != 8 && !w1.S(childAt);
    }

    public final void B(@m0 j jVar, boolean z10) {
        float dimension = getResources().getDimension(a.f.design_appbar_elevation);
        float f10 = z10 ? 0.0f : dimension;
        if (!z10) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f16582f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f10, dimension});
        this.f16582f0 = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(a.i.app_bar_elevation_anim_duration));
        this.f16582f0.setInterpolator(j9.a.f19828a);
        this.f16582f0.addUpdateListener(new b(jVar));
        this.f16582f0.start();
    }

    public final void C() {
        setWillNotDraw(!y());
    }

    public void a(@o0 c cVar) {
        if (this.V == null) {
            this.V = new ArrayList();
        }
        if (cVar != null && !this.V.contains(cVar)) {
            this.V.add(cVar);
        }
    }

    public void b(e eVar) {
        a(eVar);
    }

    public final void c() {
        WeakReference<View> weakReference = this.f16581e0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f16581e0 = null;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @o0
    public final View d(@o0 View view) {
        int i10;
        if (this.f16581e0 == null && (i10 = this.f16580d0) != -1) {
            View findViewById = view != null ? view.findViewById(i10) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f16580d0);
            }
            if (findViewById != null) {
                this.f16581e0 = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f16581e0;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void draw(@m0 Canvas canvas) {
        super.draw(canvas);
        if (y()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.O));
            this.f16584h0.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16584h0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* renamed from: e */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    /* renamed from: f */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    /* renamed from: g */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new d((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    @m0
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int i10;
        int c02;
        int i11 = this.Q;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = dVar.f16619a;
            if ((i13 & 5) == 5) {
                int i14 = dVar.topMargin + dVar.bottomMargin;
                if ((i13 & 8) != 0) {
                    c02 = w1.c0(childAt);
                } else if ((i13 & 2) != 0) {
                    c02 = measuredHeight - w1.c0(childAt);
                } else {
                    i10 = i14 + measuredHeight;
                    if (childCount == 0 && w1.S(childAt)) {
                        i10 = Math.min(i10, measuredHeight - getTopInset());
                    }
                    i12 += i10;
                }
                i10 = i14 + c02;
                i10 = Math.min(i10, measuredHeight - getTopInset());
                i12 += i10;
            } else if (i12 > 0) {
                break;
            }
        }
        int max = Math.max(0, i12);
        this.Q = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.R;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + dVar.topMargin + dVar.bottomMargin;
            int i13 = dVar.f16619a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight;
            if ((i13 & 2) != 0) {
                i12 -= w1.c0(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.R = max;
        return max;
    }

    @b0
    public int getLiftOnScrollTargetViewId() {
        return this.f16580d0;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int c02 = w1.c0(this);
        if (c02 == 0) {
            int childCount = getChildCount();
            c02 = childCount >= 1 ? w1.c0(getChildAt(childCount - 1)) : 0;
            if (c02 == 0) {
                return getHeight() / 3;
            }
        }
        return (c02 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.T;
    }

    @o0
    public Drawable getStatusBarForeground() {
        return this.f16584h0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @g1
    public final int getTopInset() {
        e3 e3Var = this.U;
        if (e3Var != null) {
            return e3Var.r();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.P;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = dVar.f16619a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight + dVar.topMargin + dVar.bottomMargin;
            if (i11 == 0 && w1.S(childAt)) {
                i12 -= getTopInset();
            }
            if ((i13 & 2) != 0) {
                i12 -= w1.c0(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.P = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean h() {
        return this.S;
    }

    public final boolean i() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((d) getChildAt(i10).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return getTotalScrollRange() != 0;
    }

    public final void k() {
        this.P = -1;
        this.Q = -1;
        this.R = -1;
    }

    public boolean l() {
        return this.f16579c0;
    }

    public boolean m() {
        return this.f16578b0;
    }

    public void n(int i10) {
        this.O = i10;
        if (!willNotDraw()) {
            w1.l1(this);
        }
        List<c> list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = this.V.get(i11);
                if (cVar != null) {
                    cVar.a(this, i10);
                }
            }
        }
    }

    public e3 o(e3 e3Var) {
        e3 e3Var2 = w1.S(this) ? e3Var : null;
        if (!i.a(this.U, e3Var2)) {
            this.U = e3Var2;
            C();
            requestLayout();
        }
        return e3Var;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    public int[] onCreateDrawableState(int i10) {
        if (this.f16583g0 == null) {
            this.f16583g0 = new int[4];
        }
        int[] iArr = this.f16583g0;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f16577a0;
        int i11 = a.c.state_liftable;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (!z10 || !this.f16578b0) ? -a.c.state_lifted : a.c.state_lifted;
        int i12 = a.c.state_collapsible;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (!z10 || !this.f16578b0) ? -a.c.state_collapsed : a.c.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (w1.S(this) && A()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                w1.d1(getChildAt(childCount), topInset);
            }
        }
        k();
        this.S = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((d) getChildAt(i14).getLayoutParams()).b() != null) {
                this.S = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.f16584h0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.W) {
            if (!this.f16579c0 && !i()) {
                z11 = false;
            }
            v(z11);
        }
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && w1.S(this) && A()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = v0.a.c(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        k();
    }

    public void p(@o0 c cVar) {
        List<c> list = this.V;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    public void q(e eVar) {
        p(eVar);
    }

    public void r() {
        this.T = 0;
    }

    public void s(boolean z10, boolean z11) {
        t(z10, z11, true);
    }

    @t0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        k.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        s(z10, w1.T0(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f16579c0 = z10;
    }

    public void setLiftOnScrollTargetViewId(@b0 int i10) {
        this.f16580d0 = i10;
        c();
    }

    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(@o0 Drawable drawable) {
        Drawable drawable2 = this.f16584h0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f16584h0 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f16584h0.setState(getDrawableState());
                }
                o0.d.m(this.f16584h0, w1.X(this));
                this.f16584h0.setVisible(getVisibility() == 0, false);
                this.f16584h0.setCallback(this);
            }
            C();
            w1.l1(this);
        }
    }

    public void setStatusBarForegroundColor(@l int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(@u int i10) {
        setStatusBarForeground(g.a.d(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        k9.i.b(this, f10);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f16584h0;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    public final void t(boolean z10, boolean z11, boolean z12) {
        int i10 = 0;
        int i11 = (z10 ? 1 : 2) | (z11 ? 4 : 0);
        if (z12) {
            i10 = 8;
        }
        this.T = i11 | i10;
        requestLayout();
    }

    public boolean u(boolean z10) {
        this.W = true;
        return v(z10);
    }

    public final boolean v(boolean z10) {
        if (this.f16577a0 == z10) {
            return false;
        }
        this.f16577a0 = z10;
        refreshDrawableState();
        return true;
    }

    public boolean verifyDrawable(@m0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16584h0;
    }

    public boolean w(boolean z10) {
        return x(z10);
    }

    public boolean x(boolean z10) {
        if (this.f16578b0 == z10) {
            return false;
        }
        this.f16578b0 = z10;
        refreshDrawableState();
        if (!this.f16579c0 || !(getBackground() instanceof j)) {
            return true;
        }
        B((j) getBackground(), z10);
        return true;
    }

    public final boolean y() {
        return this.f16584h0 != null && getTopInset() > 0;
    }

    public boolean z(@o0 View view) {
        View d10 = d(view);
        if (d10 != null) {
            view = d10;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }
}

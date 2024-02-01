package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import d.m0;
import d.o0;
import d.r0;
import d.u;
import f1.e3;
import f1.p0;
import f1.w1;
import g1.z;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    public static final String W0 = "ViewPager";
    public static final boolean X0 = false;
    public static final boolean Y0 = false;
    public static final int Z0 = 1;

    /* renamed from: a1  reason: collision with root package name */
    public static final int f3885a1 = 600;

    /* renamed from: b1  reason: collision with root package name */
    public static final int f3886b1 = 25;

    /* renamed from: c1  reason: collision with root package name */
    public static final int f3887c1 = 16;

    /* renamed from: d1  reason: collision with root package name */
    public static final int f3888d1 = 400;

    /* renamed from: e1  reason: collision with root package name */
    public static final int[] f3889e1 = {16842931};

    /* renamed from: f1  reason: collision with root package name */
    public static final Comparator<f> f3890f1 = new a();

    /* renamed from: g1  reason: collision with root package name */
    public static final Interpolator f3891g1 = new b();

    /* renamed from: h1  reason: collision with root package name */
    public static final int f3892h1 = -1;

    /* renamed from: i1  reason: collision with root package name */
    public static final int f3893i1 = 2;

    /* renamed from: j1  reason: collision with root package name */
    public static final int f3894j1 = 0;

    /* renamed from: k1  reason: collision with root package name */
    public static final int f3895k1 = 1;

    /* renamed from: l1  reason: collision with root package name */
    public static final int f3896l1 = 2;

    /* renamed from: m1  reason: collision with root package name */
    public static final n f3897m1 = new n();

    /* renamed from: n1  reason: collision with root package name */
    public static final int f3898n1 = 0;

    /* renamed from: o1  reason: collision with root package name */
    public static final int f3899o1 = 1;

    /* renamed from: p1  reason: collision with root package name */
    public static final int f3900p1 = 2;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public boolean E0;
    public long F0;
    public EdgeEffect G0;
    public EdgeEffect H0;
    public boolean I0 = true;
    public boolean J0 = false;
    public boolean K0;
    public int L0;
    public List<j> M0;
    public j N0;
    public int O;
    public j O0;
    public final ArrayList<f> P = new ArrayList<>();
    public List<i> P0;
    public final f Q = new f();
    public k Q0;
    public final Rect R = new Rect();
    public int R0;
    public n3.a S;
    public int S0;
    public int T;
    public ArrayList<View> T0;
    public int U = -1;
    public final Runnable U0 = new c();
    public Parcelable V = null;
    public int V0 = 0;
    public ClassLoader W = null;

    /* renamed from: a0  reason: collision with root package name */
    public Scroller f3901a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f3902b0;

    /* renamed from: c0  reason: collision with root package name */
    public l f3903c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f3904d0;

    /* renamed from: e0  reason: collision with root package name */
    public Drawable f3905e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f3906f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f3907g0;

    /* renamed from: h0  reason: collision with root package name */
    public float f3908h0 = -3.4028235E38f;

    /* renamed from: i0  reason: collision with root package name */
    public float f3909i0 = Float.MAX_VALUE;

    /* renamed from: j0  reason: collision with root package name */
    public int f3910j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f3911k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f3912l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f3913m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f3914n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f3915o0 = 1;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f3916p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f3917q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f3918r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f3919s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f3920t0;

    /* renamed from: u0  reason: collision with root package name */
    public float f3921u0;

    /* renamed from: v0  reason: collision with root package name */
    public float f3922v0;

    /* renamed from: w0  reason: collision with root package name */
    public float f3923w0;

    /* renamed from: x0  reason: collision with root package name */
    public float f3924x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f3925y0 = -1;

    /* renamed from: z0  reason: collision with root package name */
    public VelocityTracker f3926z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int Q;
        public Parcelable R;
        public ClassLoader S;

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
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.Q = parcel.readInt();
            this.R = parcel.readParcelable(classLoader);
            this.S = classLoader;
        }

        public SavedState(@m0 Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.Q + p7.a.f11639j;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.Q);
            parcel.writeParcelable(this.R, i10);
        }
    }

    public static class a implements Comparator<f> {
        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.f3930b - fVar2.f3930b;
        }
    }

    public static class b implements Interpolator {
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.J();
        }
    }

    public class d implements p0 {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f3927a = new Rect();

        public d() {
        }

        public e3 a(View view, e3 e3Var) {
            e3 e12 = w1.e1(view, e3Var);
            if (e12.A()) {
                return e12;
            }
            Rect rect = this.f3927a;
            rect.left = e12.p();
            rect.top = e12.r();
            rect.right = e12.q();
            rect.bottom = e12.o();
            int childCount = ViewPager.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                e3 o10 = w1.o(ViewPager.this.getChildAt(i10), e12);
                rect.left = Math.min(o10.p(), rect.left);
                rect.top = Math.min(o10.r(), rect.top);
                rect.right = Math.min(o10.q(), rect.right);
                rect.bottom = Math.min(o10.o(), rect.bottom);
            }
            return e12.D(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public Object f3929a;

        /* renamed from: b  reason: collision with root package name */
        public int f3930b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3931c;

        /* renamed from: d  reason: collision with root package name */
        public float f3932d;

        /* renamed from: e  reason: collision with root package name */
        public float f3933e;
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3934a;

        /* renamed from: b  reason: collision with root package name */
        public int f3935b;

        /* renamed from: c  reason: collision with root package name */
        public float f3936c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3937d;

        /* renamed from: e  reason: collision with root package name */
        public int f3938e;

        /* renamed from: f  reason: collision with root package name */
        public int f3939f;

        public g() {
            super(-1, -1);
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f3889e1);
            this.f3935b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public class h extends f1.a {
        public h() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            n3.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.S) != null) {
                accessibilityEvent.setItemCount(aVar.e());
                accessibilityEvent.setFromIndex(ViewPager.this.T);
                accessibilityEvent.setToIndex(ViewPager.this.T);
            }
        }

        public void g(View view, z zVar) {
            super.g(view, zVar);
            zVar.U0(ViewPager.class.getName());
            zVar.D1(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                zVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                zVar.a(8192);
            }
        }

        public boolean j(View view, int i10, Bundle bundle) {
            ViewPager viewPager;
            int i11;
            if (super.j(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i11 = viewPager.T - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i11 = viewPager.T + 1;
            }
            viewPager.setCurrentItem(i11);
            return true;
        }

        public final boolean n() {
            n3.a aVar = ViewPager.this.S;
            return aVar != null && aVar.e() > 1;
        }
    }

    public interface i {
        void b(@m0 ViewPager viewPager, @o0 n3.a aVar, @o0 n3.a aVar2);
    }

    public interface j {
        void a(int i10, float f10, @r0 int i11);

        void c(int i10);

        void d(int i10);
    }

    public interface k {
        void a(@m0 View view, float f10);
    }

    public class l extends DataSetObserver {
        public l() {
        }

        public void onChanged() {
            ViewPager.this.j();
        }

        public void onInvalidated() {
            ViewPager.this.j();
        }
    }

    public static class m implements j {
        public void a(int i10, float f10, int i11) {
        }

        public void c(int i10) {
        }

        public void d(int i10) {
        }
    }

    public static class n implements Comparator<View> {
        /* renamed from: a */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z10 = gVar.f3934a;
            return z10 != gVar2.f3934a ? z10 ? 1 : -1 : gVar.f3938e - gVar2.f3938e;
        }
    }

    public ViewPager(@m0 Context context) {
        super(context);
        z();
    }

    public ViewPager(@m0 Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        z();
    }

    public static boolean A(@m0 View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f3913m0 != z10) {
            this.f3913m0 = z10;
        }
    }

    public boolean B() {
        return this.E0;
    }

    public final boolean C(float f10, float f11) {
        return (f10 < ((float) this.f3919s0) && f11 > 0.0f) || (f10 > ((float) (getWidth() - this.f3919s0)) && f11 < 0.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    @d.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.L0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.f3934a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f3935b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            r12.l(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.Q0
            if (r13 == 0) goto L_0x009f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r14) goto L_0x009f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.g) r0
            boolean r0 = r0.f3934a
            if (r0 == 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.Q0
            r3.a(r15, r0)
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x009f:
            r12.K0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.D(int, float, int):void");
    }

    public final void E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3925y0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f3921u0 = motionEvent.getX(i10);
            this.f3925y0 = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f3926z0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean F() {
        int i10 = this.T;
        if (i10 <= 0) {
            return false;
        }
        S(i10 - 1, true);
        return true;
    }

    public boolean G() {
        n3.a aVar = this.S;
        if (aVar == null || this.T >= aVar.e() - 1) {
            return false;
        }
        S(this.T + 1, true);
        return true;
    }

    public final boolean H(int i10) {
        if (this.P.size() != 0) {
            f x10 = x();
            int clientWidth = getClientWidth();
            int i11 = this.f3904d0;
            int i12 = clientWidth + i11;
            float f10 = (float) clientWidth;
            int i13 = x10.f3930b;
            float f11 = ((((float) i10) / f10) - x10.f3933e) / (x10.f3932d + (((float) i11) / f10));
            this.K0 = false;
            D(i13, f11, (int) (((float) i12) * f11));
            if (this.K0) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.I0) {
            return false;
        } else {
            this.K0 = false;
            D(0, 0.0f, 0);
            if (this.K0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public final boolean I(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.f3921u0 - f10;
        this.f3921u0 = f10;
        float scrollX = ((float) getScrollX()) + f11;
        float clientWidth = (float) getClientWidth();
        float f12 = this.f3908h0 * clientWidth;
        float f13 = this.f3909i0 * clientWidth;
        boolean z12 = false;
        f fVar = this.P.get(0);
        ArrayList<f> arrayList = this.P;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f3930b != 0) {
            f12 = fVar.f3933e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar2.f3930b != this.S.e() - 1) {
            f13 = fVar2.f3933e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.G0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.H0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.f3921u0 += scrollX - ((float) i10);
        scrollTo(i10, getScrollY());
        H(i10);
        return z12;
    }

    public void J() {
        K(this.T);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ce, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dc, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e7, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013c, code lost:
        if (r4 < r0.P.size()) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0147, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015a, code lost:
        if (r4 < r0.P.size()) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016c, code lost:
        if (r4 < r0.P.size()) goto L_0x013e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void K(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.T
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$f r2 = r0.y(r2)
            r0.T = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            n3.a r1 = r0.S
            if (r1 != 0) goto L_0x0018
            r17.a0()
            return
        L_0x0018:
            boolean r1 = r0.f3914n0
            if (r1 == 0) goto L_0x0020
            r17.a0()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            n3.a r1 = r0.S
            r1.t(r0)
            int r1 = r0.f3915o0
            int r4 = r0.T
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            n3.a r6 = r0.S
            int r6 = r6.e()
            int r7 = r6 + -1
            int r8 = r0.T
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.O
            if (r6 != r7) goto L_0x01ef
            r7 = r5
        L_0x004a:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.P
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.P
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.f) r8
            int r9 = r8.f3930b
            int r10 = r0.T
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.T
            androidx.viewpager.widget.ViewPager$f r8 = r0.a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x017c
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r11 = r0.P
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$f r11 = (androidx.viewpager.widget.ViewPager.f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = r9
            goto L_0x0098
        L_0x008c:
            float r14 = r8.f3932d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.T
            int r3 = r3 + -1
            r15 = r9
        L_0x009d:
            if (r3 < 0) goto L_0x00ed
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00c3
            if (r3 >= r4) goto L_0x00c3
            if (r11 != 0) goto L_0x00a8
            goto L_0x00ed
        L_0x00a8:
            int r5 = r11.f3930b
            if (r3 != r5) goto L_0x00e9
            boolean r5 = r11.f3931c
            if (r5 != 0) goto L_0x00e9
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.P
            r5.remove(r10)
            n3.a r5 = r0.S
            java.lang.Object r11 = r11.f3929a
            r5.b(r0, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00e7
            goto L_0x00de
        L_0x00c3:
            if (r11 == 0) goto L_0x00d1
            int r5 = r11.f3930b
            if (r3 != r5) goto L_0x00d1
            float r5 = r11.f3932d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00e7
            goto L_0x00de
        L_0x00d1:
            int r5 = r10 + 1
            androidx.viewpager.widget.ViewPager$f r5 = r0.a(r3, r5)
            float r5 = r5.f3932d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00e7
        L_0x00de:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.P
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x00e8
        L_0x00e7:
            r5 = 0
        L_0x00e8:
            r11 = r5
        L_0x00e9:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00ed:
            float r3 = r8.f3932d
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0170
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.P
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0106
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.P
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x0107
        L_0x0106:
            r5 = 0
        L_0x0107:
            if (r12 > 0) goto L_0x010b
            r10 = r9
            goto L_0x0113
        L_0x010b:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0113:
            int r11 = r0.T
        L_0x0115:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0170
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0149
            if (r11 <= r1) goto L_0x0149
            if (r5 != 0) goto L_0x0122
            goto L_0x0170
        L_0x0122:
            int r12 = r5.f3930b
            if (r11 != r12) goto L_0x016f
            boolean r12 = r5.f3931c
            if (r12 != 0) goto L_0x016f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r12 = r0.P
            r12.remove(r4)
            n3.a r12 = r0.S
            java.lang.Object r5 = r5.f3929a
            r12.b(r0, r11, r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.P
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0147
        L_0x013e:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.P
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x016f
        L_0x0147:
            r5 = 0
            goto L_0x016f
        L_0x0149:
            if (r5 == 0) goto L_0x015d
            int r12 = r5.f3930b
            if (r11 != r12) goto L_0x015d
            float r5 = r5.f3932d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.P
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0147
            goto L_0x013e
        L_0x015d:
            androidx.viewpager.widget.ViewPager$f r5 = r0.a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f3932d
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.P
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0147
            goto L_0x013e
        L_0x016f:
            goto L_0x0115
        L_0x0170:
            r0.f(r8, r7, r2)
            n3.a r1 = r0.S
            int r2 = r0.T
            java.lang.Object r3 = r8.f3929a
            r1.q(r0, r2, r3)
        L_0x017c:
            n3.a r1 = r0.S
            r1.d(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x0186:
            if (r2 >= r1) goto L_0x01af
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r4 = (androidx.viewpager.widget.ViewPager.g) r4
            r4.f3939f = r2
            boolean r5 = r4.f3934a
            if (r5 != 0) goto L_0x01ac
            float r5 = r4.f3936c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01ac
            androidx.viewpager.widget.ViewPager$f r3 = r0.w(r3)
            if (r3 == 0) goto L_0x01ac
            float r5 = r3.f3932d
            r4.f3936c = r5
            int r3 = r3.f3930b
            r4.f3938e = r3
        L_0x01ac:
            int r2 = r2 + 1
            goto L_0x0186
        L_0x01af:
            r17.a0()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x01ee
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01c3
            androidx.viewpager.widget.ViewPager$f r3 = r0.v(r1)
            goto L_0x01c4
        L_0x01c3:
            r3 = 0
        L_0x01c4:
            if (r3 == 0) goto L_0x01cc
            int r1 = r3.f3930b
            int r2 = r0.T
            if (r1 == r2) goto L_0x01ee
        L_0x01cc:
            r5 = 0
        L_0x01cd:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x01ee
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.ViewPager$f r2 = r0.w(r1)
            if (r2 == 0) goto L_0x01eb
            int r2 = r2.f3930b
            int r3 = r0.T
            if (r2 != r3) goto L_0x01eb
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x01eb
            goto L_0x01ee
        L_0x01eb:
            int r5 = r5 + 1
            goto L_0x01cd
        L_0x01ee:
            return
        L_0x01ef:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x01fc }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x01fc }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x01fc }
            goto L_0x0204
        L_0x01fc:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0204:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.O
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            n3.a r1 = r0.S
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.K(int):void");
    }

    public final void L(int i10, int i11, int i12, int i13) {
        int min;
        if (i11 <= 0 || this.P.isEmpty()) {
            f y10 = y(this.T);
            min = (int) ((y10 != null ? Math.min(y10.f3933e, this.f3909i0) : 0.0f) * ((float) ((i10 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                i(false);
            } else {
                return;
            }
        } else if (!this.f3901a0.isFinished()) {
            this.f3901a0.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((((float) getScrollX()) / ((float) (((i11 - getPaddingLeft()) - getPaddingRight()) + i13))) * ((float) (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)));
        }
        scrollTo(min, getScrollY());
    }

    public final void M() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((g) getChildAt(i10).getLayoutParams()).f3934a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    public void N(@m0 i iVar) {
        List<i> list = this.P0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void O(@m0 j jVar) {
        List<j> list = this.M0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public final void P(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final boolean Q() {
        this.f3925y0 = -1;
        q();
        this.G0.onRelease();
        this.H0.onRelease();
        return this.G0.isFinished() || this.H0.isFinished();
    }

    public final void R(int i10, boolean z10, int i11, boolean z11) {
        f y10 = y(i10);
        int clientWidth = y10 != null ? (int) (((float) getClientWidth()) * Math.max(this.f3908h0, Math.min(y10.f3933e, this.f3909i0))) : 0;
        if (z10) {
            Z(clientWidth, 0, i11);
            if (z11) {
                m(i10);
                return;
            }
            return;
        }
        if (z11) {
            m(i10);
        }
        i(false);
        scrollTo(clientWidth, 0);
        H(clientWidth);
    }

    public void S(int i10, boolean z10) {
        this.f3914n0 = false;
        T(i10, z10, false);
    }

    public void T(int i10, boolean z10, boolean z11) {
        U(i10, z10, z11, 0);
    }

    public void U(int i10, boolean z10, boolean z11, int i11) {
        n3.a aVar = this.S;
        boolean z12 = false;
        if (aVar == null || aVar.e() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z11 || this.T != i10 || this.P.size() == 0) {
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.S.e()) {
                i10 = this.S.e() - 1;
            }
            int i12 = this.f3915o0;
            int i13 = this.T;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.P.size(); i14++) {
                    this.P.get(i14).f3931c = true;
                }
            }
            if (this.T != i10) {
                z12 = true;
            }
            if (this.I0) {
                this.T = i10;
                if (z12) {
                    m(i10);
                }
                requestLayout();
                return;
            }
            K(i10);
            R(i10, z10, i11, z12);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public j V(j jVar) {
        j jVar2 = this.O0;
        this.O0 = jVar;
        return jVar2;
    }

    public void W(boolean z10, @o0 k kVar) {
        X(z10, kVar, 2);
    }

    public void X(boolean z10, @o0 k kVar, int i10) {
        int i11 = 1;
        boolean z11 = kVar != null;
        boolean z12 = z11 != (this.Q0 != null);
        this.Q0 = kVar;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            if (z10) {
                i11 = 2;
            }
            this.S0 = i11;
            this.R0 = i10;
        } else {
            this.S0 = 0;
        }
        if (z12) {
            J();
        }
    }

    public void Y(int i10, int i11) {
        Z(i10, i11, 0);
    }

    public void Z(int i10, int i11, int i12) {
        int i13;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f3901a0;
        if (scroller != null && !scroller.isFinished()) {
            i13 = this.f3902b0 ? this.f3901a0.getCurrX() : this.f3901a0.getStartX();
            this.f3901a0.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i13 = getScrollX();
        }
        int i14 = i13;
        int scrollY = getScrollY();
        int i15 = i10 - i14;
        int i16 = i11 - scrollY;
        if (i15 == 0 && i16 == 0) {
            i(false);
            J();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i17 = clientWidth / 2;
        float f10 = (float) clientWidth;
        float f11 = (float) i17;
        float o10 = f11 + (o(Math.min(1.0f, (((float) Math.abs(i15)) * 1.0f) / f10)) * f11);
        int abs = Math.abs(i12);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(o10 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i15)) / ((f10 * this.S.h(this.T)) + ((float) this.f3904d0))) + 1.0f) * 100.0f), 600);
        this.f3902b0 = false;
        this.f3901a0.startScroll(i14, scrollY, i15, i16, min);
        w1.l1(this);
    }

    public f a(int i10, int i11) {
        f fVar = new f();
        fVar.f3930b = i10;
        fVar.f3929a = this.S.j(this, i10);
        fVar.f3932d = this.S.h(i10);
        if (i11 < 0 || i11 >= this.P.size()) {
            this.P.add(fVar);
        } else {
            this.P.add(i11, fVar);
        }
        return fVar;
    }

    public final void a0() {
        if (this.S0 != 0) {
            ArrayList<View> arrayList = this.T0;
            if (arrayList == null) {
                this.T0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.T0.add(getChildAt(i10));
            }
            Collections.sort(this.T0, f3897m1);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        f w10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (w10 = w(childAt)) != null && w10.f3930b == this.T) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i11 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        f w10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (w10 = w(childAt)) != null && w10.f3930b == this.T) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean A = gVar.f3934a | A(view);
        gVar.f3934a = A;
        if (!this.f3912l0) {
            super.addView(view, i10, layoutParams);
        } else if (!A) {
            gVar.f3937d = true;
            addViewInLayout(view, i10, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void b(@m0 i iVar) {
        if (this.P0 == null) {
            this.P0 = new ArrayList();
        }
        this.P0.add(iVar);
    }

    public void c(@m0 j jVar) {
        if (this.M0 == null) {
            this.M0 = new ArrayList();
        }
        this.M0.add(jVar);
    }

    public boolean canScrollHorizontally(int i10) {
        if (this.S == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f3908h0)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f3909i0));
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f3902b0 = true;
        if (this.f3901a0.isFinished() || !this.f3901a0.computeScrollOffset()) {
            i(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f3901a0.getCurrX();
        int currY = this.f3901a0.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!H(currX)) {
                this.f3901a0.abortAnimation();
                scrollTo(0, currY);
            }
        }
        w1.l1(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000b
        L_0x0009:
            r0 = r3
            goto L_0x0060
        L_0x000b:
            if (r0 == 0) goto L_0x0060
            android.view.ViewParent r4 = r0.getParent()
        L_0x0011:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001e
            if (r4 != r6) goto L_0x0019
            r4 = r1
            goto L_0x001f
        L_0x0019:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0011
        L_0x001e:
            r4 = r2
        L_0x001f:
            if (r4 != 0) goto L_0x0060
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0035:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0035
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            goto L_0x0009
        L_0x0060:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00ac
            if (r3 == r0) goto L_0x00ac
            if (r7 != r5) goto L_0x0091
            android.graphics.Rect r1 = r6.R
            android.graphics.Rect r1 = r6.u(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.R
            android.graphics.Rect r2 = r6.u(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x008b
            if (r1 < r2) goto L_0x008b
            boolean r0 = r6.F()
            goto L_0x008f
        L_0x008b:
            boolean r0 = r3.requestFocus()
        L_0x008f:
            r2 = r0
            goto L_0x00bf
        L_0x0091:
            if (r7 != r4) goto L_0x00bf
            android.graphics.Rect r1 = r6.R
            android.graphics.Rect r1 = r6.u(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.R
            android.graphics.Rect r2 = r6.u(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x008b
            if (r1 > r2) goto L_0x008b
            boolean r0 = r6.G()
            goto L_0x008f
        L_0x00ac:
            if (r7 == r5) goto L_0x00bb
            if (r7 != r1) goto L_0x00b1
            goto L_0x00bb
        L_0x00b1:
            if (r7 == r4) goto L_0x00b6
            r0 = 2
            if (r7 != r0) goto L_0x00bf
        L_0x00b6:
            boolean r2 = r6.G()
            goto L_0x00bf
        L_0x00bb:
            boolean r2 = r6.F()
        L_0x00bf:
            if (r2 == 0) goto L_0x00c8
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00c8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.d(int):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f w10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (w10 = w(childAt)) != null && w10.f3930b == this.T && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        n3.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.S) != null && aVar.e() > 1)) {
            if (!this.G0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f3908h0 * ((float) width));
                this.G0.setSize(height, width);
                z10 = false | this.G0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.H0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f3909i0 + 1.0f)) * ((float) width2));
                this.H0.setSize(height2, width2);
                z10 |= this.H0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.G0.finish();
            this.H0.finish();
        }
        if (z10) {
            w1.l1(this);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3905e0;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public boolean e() {
        if (this.f3916p0) {
            return false;
        }
        this.E0 = true;
        setScrollState(1);
        this.f3921u0 = 0.0f;
        this.f3923w0 = 0.0f;
        VelocityTracker velocityTracker = this.f3926z0;
        if (velocityTracker == null) {
            this.f3926z0 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f3926z0.addMovement(obtain);
        obtain.recycle();
        this.F0 = uptimeMillis;
        return true;
    }

    public final void f(f fVar, int i10, f fVar2) {
        int i11;
        int i12;
        f fVar3;
        f fVar4;
        int e10 = this.S.e();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? ((float) this.f3904d0) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i13 = fVar2.f3930b;
            int i14 = fVar.f3930b;
            if (i13 < i14) {
                float f11 = fVar2.f3933e + fVar2.f3932d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= fVar.f3930b && i16 < this.P.size()) {
                    while (true) {
                        fVar4 = this.P.get(i16);
                        if (i15 > fVar4.f3930b && i16 < this.P.size() - 1) {
                            i16++;
                        }
                    }
                    while (i15 < fVar4.f3930b) {
                        f11 += this.S.h(i15) + f10;
                        i15++;
                    }
                    fVar4.f3933e = f11;
                    f11 += fVar4.f3932d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.P.size() - 1;
                float f12 = fVar2.f3933e;
                while (true) {
                    i13--;
                    if (i13 < fVar.f3930b || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = this.P.get(size);
                        if (i13 < fVar3.f3930b && size > 0) {
                            size--;
                        }
                    }
                    while (i13 > fVar3.f3930b) {
                        f12 -= this.S.h(i13) + f10;
                        i13--;
                    }
                    f12 -= fVar3.f3932d + f10;
                    fVar3.f3933e = f12;
                }
            }
        }
        int size2 = this.P.size();
        float f13 = fVar.f3933e;
        int i17 = fVar.f3930b;
        int i18 = i17 - 1;
        this.f3908h0 = i17 == 0 ? f13 : -3.4028235E38f;
        int i19 = e10 - 1;
        this.f3909i0 = i17 == i19 ? (fVar.f3932d + f13) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            f fVar5 = this.P.get(i20);
            while (true) {
                i12 = fVar5.f3930b;
                if (i18 <= i12) {
                    break;
                }
                f13 -= this.S.h(i18) + f10;
                i18--;
            }
            f13 -= fVar5.f3932d + f10;
            fVar5.f3933e = f13;
            if (i12 == 0) {
                this.f3908h0 = f13;
            }
            i20--;
            i18--;
        }
        float f14 = fVar.f3933e + fVar.f3932d + f10;
        int i21 = fVar.f3930b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            f fVar6 = this.P.get(i22);
            while (true) {
                i11 = fVar6.f3930b;
                if (i21 >= i11) {
                    break;
                }
                f14 += this.S.h(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.f3909i0 = (fVar6.f3932d + f14) - 1.0f;
            }
            fVar6.f3933e = f14;
            f14 += fVar6.f3932d + f10;
            i22++;
            i21++;
        }
        this.J0 = false;
    }

    public boolean g(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom()) {
                    if (g(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @o0
    public n3.a getAdapter() {
        return this.S;
    }

    public int getChildDrawingOrder(int i10, int i11) {
        if (this.S0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((g) this.T0.get(i11).getLayoutParams()).f3939f;
    }

    public int getCurrentItem() {
        return this.T;
    }

    public int getOffscreenPageLimit() {
        return this.f3915o0;
    }

    public int getPageMargin() {
        return this.f3904d0;
    }

    public void h() {
        List<j> list = this.M0;
        if (list != null) {
            list.clear();
        }
    }

    public final void i(boolean z10) {
        boolean z11 = this.V0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f3901a0.isFinished()) {
                this.f3901a0.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f3901a0.getCurrX();
                int currY = this.f3901a0.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        H(currX);
                    }
                }
            }
        }
        this.f3914n0 = false;
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            f fVar = this.P.get(i10);
            if (fVar.f3931c) {
                fVar.f3931c = false;
                z11 = true;
            }
        }
        if (!z11) {
            return;
        }
        if (z10) {
            w1.n1(this, this.U0);
        } else {
            this.U0.run();
        }
    }

    public void j() {
        int e10 = this.S.e();
        this.O = e10;
        boolean z10 = this.P.size() < (this.f3915o0 * 2) + 1 && this.P.size() < e10;
        int i10 = this.T;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < this.P.size()) {
            f fVar = this.P.get(i11);
            int f10 = this.S.f(fVar.f3929a);
            if (f10 != -1) {
                if (f10 == -2) {
                    this.P.remove(i11);
                    i11--;
                    if (!z11) {
                        this.S.t(this);
                        z11 = true;
                    }
                    this.S.b(this, fVar.f3930b, fVar.f3929a);
                    int i12 = this.T;
                    if (i12 == fVar.f3930b) {
                        i10 = Math.max(0, Math.min(i12, e10 - 1));
                    }
                } else {
                    int i13 = fVar.f3930b;
                    if (i13 != f10) {
                        if (i13 == this.T) {
                            i10 = f10;
                        }
                        fVar.f3930b = f10;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        if (z11) {
            this.S.d(this);
        }
        Collections.sort(this.P, f3890f1);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                g gVar = (g) getChildAt(i14).getLayoutParams();
                if (!gVar.f3934a) {
                    gVar.f3936c = 0.0f;
                }
            }
            T(i10, false, true);
            requestLayout();
        }
    }

    public final int k(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.C0 || Math.abs(i11) <= this.A0) {
            i10 += (int) (f10 + (i10 >= this.T ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.P.size() <= 0) {
            return i10;
        }
        ArrayList<f> arrayList = this.P;
        return Math.max(this.P.get(0).f3930b, Math.min(i10, arrayList.get(arrayList.size() - 1).f3930b));
    }

    public final void l(int i10, float f10, int i11) {
        j jVar = this.N0;
        if (jVar != null) {
            jVar.a(i10, f10, i11);
        }
        List<j> list = this.M0;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = this.M0.get(i12);
                if (jVar2 != null) {
                    jVar2.a(i10, f10, i11);
                }
            }
        }
        j jVar3 = this.O0;
        if (jVar3 != null) {
            jVar3.a(i10, f10, i11);
        }
    }

    public final void m(int i10) {
        j jVar = this.N0;
        if (jVar != null) {
            jVar.d(i10);
        }
        List<j> list = this.M0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = this.M0.get(i11);
                if (jVar2 != null) {
                    jVar2.d(i10);
                }
            }
        }
        j jVar3 = this.O0;
        if (jVar3 != null) {
            jVar3.d(i10);
        }
    }

    public final void n(int i10) {
        j jVar = this.N0;
        if (jVar != null) {
            jVar.c(i10);
        }
        List<j> list = this.M0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = this.M0.get(i11);
                if (jVar2 != null) {
                    jVar2.c(i10);
                }
            }
        }
        j jVar3 = this.O0;
        if (jVar3 != null) {
            jVar3.c(i10);
        }
    }

    public float o(float f10) {
        return (float) Math.sin((double) ((f10 - 0.5f) * 0.47123894f));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I0 = true;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.U0);
        Scroller scroller = this.f3901a0;
        if (scroller != null && !scroller.isFinished()) {
            this.f3901a0.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.f3904d0
            if (r1 <= 0) goto L_0x00a8
            android.graphics.drawable.Drawable r1 = r0.f3905e0
            if (r1 == 0) goto L_0x00a8
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r1 = r0.P
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00a8
            n3.a r1 = r0.S
            if (r1 == 0) goto L_0x00a8
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.f3904d0
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.P
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            float r7 = r5.f3933e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.P
            int r8 = r8.size()
            int r9 = r5.f3930b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r10 = r0.P
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$f r10 = (androidx.viewpager.widget.ViewPager.f) r10
            int r10 = r10.f3930b
        L_0x0045:
            if (r9 >= r10) goto L_0x00a8
        L_0x0047:
            int r11 = r5.f3930b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.P
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0064
            float r7 = r5.f3933e
            float r11 = r5.f3932d
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x006f
        L_0x0064:
            n3.a r11 = r0.S
            float r11 = r11.h(r9)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r7 = r7 + r11
        L_0x006f:
            int r11 = r0.f3904d0
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0097
            android.graphics.drawable.Drawable r11 = r0.f3905e0
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.f3906f0
            int r15 = r0.f3904d0
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.f3907g0
            r11.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.f3905e0
            r11 = r18
            r3.draw(r11)
            goto L_0x009b
        L_0x0097:
            r11 = r18
            r16 = r3
        L_0x009b:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a3
            goto L_0x00a8
        L_0x00a3:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            Q();
            return false;
        }
        if (action != 0) {
            if (this.f3916p0) {
                return true;
            }
            if (this.f3917q0) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.f3923w0 = x10;
            this.f3921u0 = x10;
            float y10 = motionEvent.getY();
            this.f3924x0 = y10;
            this.f3922v0 = y10;
            this.f3925y0 = motionEvent2.getPointerId(0);
            this.f3917q0 = false;
            this.f3902b0 = true;
            this.f3901a0.computeScrollOffset();
            if (this.V0 != 2 || Math.abs(this.f3901a0.getFinalX() - this.f3901a0.getCurrX()) <= this.D0) {
                i(false);
                this.f3916p0 = false;
            } else {
                this.f3901a0.abortAnimation();
                this.f3914n0 = false;
                J();
                this.f3916p0 = true;
                P(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.f3925y0;
            if (i10 != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i10);
                float x11 = motionEvent2.getX(findPointerIndex);
                float f10 = x11 - this.f3921u0;
                float abs = Math.abs(f10);
                float y11 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y11 - this.f3924x0);
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i11 != 0 && !C(this.f3921u0, f10)) {
                    if (g(this, false, (int) f10, (int) x11, (int) y11)) {
                        this.f3921u0 = x11;
                        this.f3922v0 = y11;
                        this.f3917q0 = true;
                        return false;
                    }
                }
                int i12 = this.f3920t0;
                if (abs > ((float) i12) && abs * 0.5f > abs2) {
                    this.f3916p0 = true;
                    P(true);
                    setScrollState(1);
                    float f11 = this.f3923w0;
                    float f12 = (float) this.f3920t0;
                    this.f3921u0 = i11 > 0 ? f11 + f12 : f11 - f12;
                    this.f3922v0 = y11;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i12)) {
                    this.f3917q0 = true;
                }
                if (this.f3916p0 && I(x11)) {
                    w1.l1(this);
                }
            }
        } else if (action == 6) {
            E(motionEvent);
        }
        if (this.f3926z0 == null) {
            this.f3926z0 = VelocityTracker.obtain();
        }
        this.f3926z0.addMovement(motionEvent2);
        return this.f3916p0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r12 = (androidx.viewpager.widget.ViewPager.g) r12
            boolean r14 = r12.f3934a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f3935b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0106
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0103
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.f3934a
            if (r10 != 0) goto L_0x0103
            androidx.viewpager.widget.ViewPager$f r10 = r0.w(r8)
            if (r10 == 0) goto L_0x0103
            float r13 = (float) r2
            float r10 = r10.f3933e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f3937d
            if (r14 == 0) goto L_0x00f6
            r14 = 0
            r9.f3937d = r14
            float r9 = r9.f3936c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f6:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0103:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0106:
            r0.f3906f0 = r5
            int r3 = r3 - r7
            r0.f3907g0 = r3
            r0.L0 = r11
            boolean r1 = r0.I0
            if (r1 == 0) goto L_0x0118
            int r1 = r0.T
            r2 = 0
            r0.R(r1, r2, r2, r2)
            goto L_0x0119
        L_0x0118:
            r2 = 0
        L_0x0119:
            r0.I0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i10, int i11) {
        g gVar;
        g gVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f3919s0 = Math.min(measuredWidth / 10, this.f3918r0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (!(childAt.getVisibility() == 8 || (gVar2 = (g) childAt.getLayoutParams()) == null || !gVar2.f3934a)) {
                int i15 = gVar2.f3935b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (!(i16 == 3 || i16 == 5)) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = gVar2.width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = gVar2.height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f3910j0 = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f3911k0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f3912l0 = true;
        J();
        this.f3912l0 = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f3934a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * gVar.f3936c), 1073741824), this.f3911k0);
            }
        }
    }

    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        f w10;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i12 = 0;
            i11 = 1;
        } else {
            i12 = childCount - 1;
            i11 = -1;
        }
        while (i12 != i13) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (w10 = w(childAt)) != null && w10.f3930b == this.T && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i12 += i11;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        n3.a aVar = this.S;
        if (aVar != null) {
            aVar.n(savedState.R, savedState.S);
            T(savedState.Q, false, true);
            return;
        }
        this.U = savedState.Q;
        this.V = savedState.R;
        this.W = savedState.S;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Q = this.T;
        n3.a aVar = this.S;
        if (aVar != null) {
            savedState.R = aVar.o();
        }
        return savedState;
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f3904d0;
            L(i10, i12, i14, i14);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.E0
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r8.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0014
            int r0 = r8.getEdgeFlags()
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            n3.a r0 = r7.S
            if (r0 == 0) goto L_0x0155
            int r0 = r0.e()
            if (r0 != 0) goto L_0x0020
            goto L_0x0155
        L_0x0020:
            android.view.VelocityTracker r0 = r7.f3926z0
            if (r0 != 0) goto L_0x002a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.f3926z0 = r0
        L_0x002a:
            android.view.VelocityTracker r0 = r7.f3926z0
            r0.addMovement(r8)
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x012f
            if (r0 == r1) goto L_0x00e2
            r3 = 2
            if (r0 == r3) goto L_0x0073
            r3 = 3
            if (r0 == r3) goto L_0x0068
            r3 = 5
            if (r0 == r3) goto L_0x0058
            r3 = 6
            if (r0 == r3) goto L_0x0047
            goto L_0x014f
        L_0x0047:
            r7.E(r8)
            int r0 = r7.f3925y0
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            r7.f3921u0 = r8
            goto L_0x014f
        L_0x0058:
            int r0 = r8.getActionIndex()
            float r3 = r8.getX(r0)
            r7.f3921u0 = r3
            int r8 = r8.getPointerId(r0)
            goto L_0x014d
        L_0x0068:
            boolean r8 = r7.f3916p0
            if (r8 == 0) goto L_0x014f
            int r8 = r7.T
            r7.R(r8, r1, r2, r2)
            goto L_0x012a
        L_0x0073:
            boolean r0 = r7.f3916p0
            if (r0 != 0) goto L_0x00ce
            int r0 = r7.f3925y0
            int r0 = r8.findPointerIndex(r0)
            r3 = -1
            if (r0 != r3) goto L_0x0082
            goto L_0x012a
        L_0x0082:
            float r3 = r8.getX(r0)
            float r4 = r7.f3921u0
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            float r0 = r8.getY(r0)
            float r5 = r7.f3922v0
            float r5 = r0 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r7.f3920t0
            float r6 = (float) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ce
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ce
            r7.f3916p0 = r1
            r7.P(r1)
            float r4 = r7.f3923w0
            float r3 = r3 - r4
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b7
            int r3 = r7.f3920t0
            float r3 = (float) r3
            float r4 = r4 + r3
            goto L_0x00bb
        L_0x00b7:
            int r3 = r7.f3920t0
            float r3 = (float) r3
            float r4 = r4 - r3
        L_0x00bb:
            r7.f3921u0 = r4
            r7.f3922v0 = r0
            r7.setScrollState(r1)
            r7.setScrollingCacheEnabled(r1)
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x00ce
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x00ce:
            boolean r0 = r7.f3916p0
            if (r0 == 0) goto L_0x014f
            int r0 = r7.f3925y0
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            boolean r8 = r7.I(r8)
            r2 = r2 | r8
            goto L_0x014f
        L_0x00e2:
            boolean r0 = r7.f3916p0
            if (r0 == 0) goto L_0x014f
            android.view.VelocityTracker r0 = r7.f3926z0
            r2 = 1000(0x3e8, float:1.401E-42)
            int r3 = r7.B0
            float r3 = (float) r3
            r0.computeCurrentVelocity(r2, r3)
            int r2 = r7.f3925y0
            float r0 = r0.getXVelocity(r2)
            int r0 = (int) r0
            r7.f3914n0 = r1
            int r2 = r7.getClientWidth()
            int r3 = r7.getScrollX()
            androidx.viewpager.widget.ViewPager$f r4 = r7.x()
            int r5 = r7.f3904d0
            float r5 = (float) r5
            float r2 = (float) r2
            float r5 = r5 / r2
            int r6 = r4.f3930b
            float r3 = (float) r3
            float r3 = r3 / r2
            float r2 = r4.f3933e
            float r3 = r3 - r2
            float r2 = r4.f3932d
            float r2 = r2 + r5
            float r3 = r3 / r2
            int r2 = r7.f3925y0
            int r2 = r8.findPointerIndex(r2)
            float r8 = r8.getX(r2)
            float r2 = r7.f3923w0
            float r8 = r8 - r2
            int r8 = (int) r8
            int r8 = r7.k(r6, r3, r0, r8)
            r7.U(r8, r1, r1, r0)
        L_0x012a:
            boolean r2 = r7.Q()
            goto L_0x014f
        L_0x012f:
            android.widget.Scroller r0 = r7.f3901a0
            r0.abortAnimation()
            r7.f3914n0 = r2
            r7.J()
            float r0 = r8.getX()
            r7.f3923w0 = r0
            r7.f3921u0 = r0
            float r0 = r8.getY()
            r7.f3924x0 = r0
            r7.f3922v0 = r0
            int r8 = r8.getPointerId(r2)
        L_0x014d:
            r7.f3925y0 = r8
        L_0x014f:
            if (r2 == 0) goto L_0x0154
            f1.w1.l1(r7)
        L_0x0154:
            return r1
        L_0x0155:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.R0 : 0, (Paint) null);
        }
    }

    public final void q() {
        this.f3916p0 = false;
        this.f3917q0 = false;
        VelocityTracker velocityTracker = this.f3926z0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3926z0 = null;
        }
    }

    public void r() {
        if (this.E0) {
            if (this.S != null) {
                VelocityTracker velocityTracker = this.f3926z0;
                velocityTracker.computeCurrentVelocity(1000, (float) this.B0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f3925y0);
                this.f3914n0 = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                f x10 = x();
                U(k(x10.f3930b, ((((float) scrollX) / ((float) clientWidth)) - x10.f3933e) / x10.f3932d, xVelocity, (int) (this.f3921u0 - this.f3923w0)), true, true, xVelocity);
            }
            q();
            this.E0 = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public void removeView(View view) {
        if (this.f3912l0) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public boolean s(@m0 KeyEvent keyEvent) {
        int i10;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return d(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return G();
                } else {
                    i10 = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return F();
            } else {
                i10 = 17;
            }
            return d(i10);
        }
        return false;
    }

    public void setAdapter(@o0 n3.a aVar) {
        n3.a aVar2 = this.S;
        if (aVar2 != null) {
            aVar2.r((DataSetObserver) null);
            this.S.t(this);
            for (int i10 = 0; i10 < this.P.size(); i10++) {
                f fVar = this.P.get(i10);
                this.S.b(this, fVar.f3930b, fVar.f3929a);
            }
            this.S.d(this);
            this.P.clear();
            M();
            this.T = 0;
            scrollTo(0, 0);
        }
        n3.a aVar3 = this.S;
        this.S = aVar;
        this.O = 0;
        if (aVar != null) {
            if (this.f3903c0 == null) {
                this.f3903c0 = new l();
            }
            this.S.r(this.f3903c0);
            this.f3914n0 = false;
            boolean z10 = this.I0;
            this.I0 = true;
            this.O = this.S.e();
            if (this.U >= 0) {
                this.S.n(this.V, this.W);
                T(this.U, false, true);
                this.U = -1;
                this.V = null;
                this.W = null;
            } else if (!z10) {
                J();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.P0;
        if (list != null && !list.isEmpty()) {
            int size = this.P0.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.P0.get(i11).b(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.f3914n0 = false;
        T(i10, !this.I0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Requested offscreen page limit ");
            sb2.append(i10);
            sb2.append(" too small; defaulting to ");
            sb2.append(1);
            i10 = 1;
        }
        if (i10 != this.f3915o0) {
            this.f3915o0 = i10;
            J();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.N0 = jVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f3904d0;
        this.f3904d0 = i10;
        int width = getWidth();
        L(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(@u int i10) {
        setPageMarginDrawable(i0.d.i(getContext(), i10));
    }

    public void setPageMarginDrawable(@o0 Drawable drawable) {
        this.f3905e0 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.V0 != i10) {
            this.V0 = i10;
            if (this.Q0 != null) {
                p(i10 != 0);
            }
            n(i10);
        }
    }

    public void t(float f10) {
        if (!this.E0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.S != null) {
            this.f3921u0 += f10;
            float scrollX = ((float) getScrollX()) - f10;
            float clientWidth = (float) getClientWidth();
            float f11 = this.f3908h0 * clientWidth;
            float f12 = this.f3909i0 * clientWidth;
            f fVar = this.P.get(0);
            ArrayList<f> arrayList = this.P;
            f fVar2 = arrayList.get(arrayList.size() - 1);
            if (fVar.f3930b != 0) {
                f11 = fVar.f3933e * clientWidth;
            }
            if (fVar2.f3930b != this.S.e() - 1) {
                f12 = fVar2.f3933e * clientWidth;
            }
            if (scrollX < f11) {
                scrollX = f11;
            } else if (scrollX > f12) {
                scrollX = f12;
            }
            int i10 = (int) scrollX;
            this.f3921u0 += scrollX - ((float) i10);
            scrollTo(i10, getScrollY());
            H(i10);
            MotionEvent obtain = MotionEvent.obtain(this.F0, SystemClock.uptimeMillis(), 2, this.f3921u0, 0.0f, 0);
            this.f3926z0.addMovement(obtain);
            obtain.recycle();
        }
    }

    public final Rect u(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        int bottom = view.getBottom();
        while (true) {
            rect.bottom = bottom;
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                return rect;
            }
            view = (ViewGroup) parent;
            rect.left += view.getLeft();
            rect.right += view.getRight();
            rect.top += view.getTop();
            bottom = rect.bottom + view.getBottom();
        }
        return rect;
    }

    public f v(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return w(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3905e0;
    }

    public f w(View view) {
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            f fVar = this.P.get(i10);
            if (this.S.k(view, fVar.f3929a)) {
                return fVar;
            }
        }
        return null;
    }

    public final f x() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f11 = clientWidth > 0 ? ((float) this.f3904d0) / ((float) clientWidth) : 0.0f;
        f fVar = null;
        int i11 = 0;
        int i12 = -1;
        boolean z10 = true;
        float f12 = 0.0f;
        while (i11 < this.P.size()) {
            f fVar2 = this.P.get(i11);
            if (!z10 && fVar2.f3930b != (i10 = i12 + 1)) {
                fVar2 = this.Q;
                fVar2.f3933e = f10 + f12 + f11;
                fVar2.f3930b = i10;
                fVar2.f3932d = this.S.h(i10);
                i11--;
            }
            f10 = fVar2.f3933e;
            float f13 = fVar2.f3932d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return fVar;
            }
            if (scrollX < f13 || i11 == this.P.size() - 1) {
                return fVar2;
            }
            i12 = fVar2.f3930b;
            f12 = fVar2.f3932d;
            i11++;
            z10 = false;
            fVar = fVar2;
        }
        return fVar;
    }

    public f y(int i10) {
        for (int i11 = 0; i11 < this.P.size(); i11++) {
            f fVar = this.P.get(i11);
            if (fVar.f3930b == i10) {
                return fVar;
            }
        }
        return null;
    }

    public void z() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f3901a0 = new Scroller(context, f3891g1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f3920t0 = viewConfiguration.getScaledPagingTouchSlop();
        this.A0 = (int) (400.0f * f10);
        this.B0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.G0 = new EdgeEffect(context);
        this.H0 = new EdgeEffect(context);
        this.C0 = (int) (25.0f * f10);
        this.D0 = (int) (2.0f * f10);
        this.f3918r0 = (int) (f10 * 16.0f);
        w1.z1(this, new h());
        if (w1.T(this) == 0) {
            w1.P1(this, 1);
        }
        w1.Y1(this, new d());
    }
}

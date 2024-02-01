package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import d.l;
import d.m0;
import d.o0;
import d.r0;
import d.u;
import f1.w1;
import g1.z;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import m1.c;

public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: o0  reason: collision with root package name */
    public static final String f3803o0 = "SlidingPaneLayout";

    /* renamed from: p0  reason: collision with root package name */
    public static final int f3804p0 = 32;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f3805q0 = -858993460;

    /* renamed from: r0  reason: collision with root package name */
    public static final int f3806r0 = 400;
    public int O;
    public int P;
    public Drawable Q;
    public Drawable R;
    public final int S;
    public boolean T;
    public View U;
    public float V;
    public float W;

    /* renamed from: a0  reason: collision with root package name */
    public int f3807a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f3808b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f3809c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f3810d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f3811e0;

    /* renamed from: f0  reason: collision with root package name */
    public e f3812f0;

    /* renamed from: g0  reason: collision with root package name */
    public final m1.c f3813g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f3814h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f3815i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Rect f3816j0;

    /* renamed from: k0  reason: collision with root package name */
    public final ArrayList<b> f3817k0;

    /* renamed from: l0  reason: collision with root package name */
    public Method f3818l0;

    /* renamed from: m0  reason: collision with root package name */
    public Field f3819m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f3820n0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean Q;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Q = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.Q ? 1 : 0);
        }
    }

    public class a extends f1.a {

        /* renamed from: d  reason: collision with root package name */
        public final Rect f3821d = new Rect();

        public a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        public void g(View view, z zVar) {
            z E0 = z.E0(zVar);
            super.g(view, E0);
            n(zVar, E0);
            E0.H0();
            zVar.U0(SlidingPaneLayout.class.getName());
            zVar.G1(view);
            ViewParent k02 = w1.k0(view);
            if (k02 instanceof View) {
                zVar.x1((View) k02);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i10);
                if (!o(childAt) && childAt.getVisibility() == 0) {
                    w1.P1(childAt, 1);
                    zVar.c(childAt);
                }
            }
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!o(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        public final void n(z zVar, z zVar2) {
            Rect rect = this.f3821d;
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
            zVar.t1(zVar2.K());
        }

        public boolean o(View view) {
            return SlidingPaneLayout.this.j(view);
        }
    }

    public class b implements Runnable {
        public final View O;

        public b(View view) {
            this.O = view;
        }

        public void run() {
            if (this.O.getParent() == SlidingPaneLayout.this) {
                this.O.setLayerType(0, (Paint) null);
                SlidingPaneLayout.this.i(this.O);
            }
            SlidingPaneLayout.this.f3817k0.remove(this);
        }
    }

    public class c extends c.C0178c {
        public c() {
        }

        public int a(View view, int i10, int i11) {
            d dVar = (d) SlidingPaneLayout.this.U.getLayoutParams();
            if (SlidingPaneLayout.this.k()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + dVar.rightMargin) + SlidingPaneLayout.this.U.getWidth());
                return Math.max(Math.min(i10, width), width - SlidingPaneLayout.this.f3807a0);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + dVar.leftMargin;
            return Math.min(Math.max(i10, paddingLeft), SlidingPaneLayout.this.f3807a0 + paddingLeft);
        }

        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        public int d(View view) {
            return SlidingPaneLayout.this.f3807a0;
        }

        public void f(int i10, int i11) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f3813g0.d(slidingPaneLayout.U, i11);
        }

        public void i(View view, int i10) {
            SlidingPaneLayout.this.r();
        }

        public void j(int i10) {
            SlidingPaneLayout slidingPaneLayout;
            boolean z10;
            if (SlidingPaneLayout.this.f3813g0.E() == 0) {
                SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                if (slidingPaneLayout2.V == 0.0f) {
                    slidingPaneLayout2.v(slidingPaneLayout2.U);
                    SlidingPaneLayout slidingPaneLayout3 = SlidingPaneLayout.this;
                    slidingPaneLayout3.f(slidingPaneLayout3.U);
                    slidingPaneLayout = SlidingPaneLayout.this;
                    z10 = false;
                } else {
                    slidingPaneLayout2.g(slidingPaneLayout2.U);
                    slidingPaneLayout = SlidingPaneLayout.this;
                    z10 = true;
                }
                slidingPaneLayout.f3814h0 = z10;
            }
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            SlidingPaneLayout.this.n(i10);
            SlidingPaneLayout.this.invalidate();
        }

        public void l(View view, float f10, float f11) {
            int i10;
            d dVar = (d) view.getLayoutParams();
            if (SlidingPaneLayout.this.k()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + dVar.rightMargin;
                if (f10 < 0.0f || (f10 == 0.0f && SlidingPaneLayout.this.V > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f3807a0;
                }
                i10 = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.U.getWidth();
            } else {
                i10 = dVar.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i11 > 0 || (i11 == 0 && SlidingPaneLayout.this.V > 0.5f)) {
                    i10 += SlidingPaneLayout.this.f3807a0;
                }
            }
            SlidingPaneLayout.this.f3813g0.T(i10, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        public boolean m(View view, int i10) {
            if (SlidingPaneLayout.this.f3808b0) {
                return false;
            }
            return ((d) view.getLayoutParams()).f3826b;
        }
    }

    public static class d extends ViewGroup.MarginLayoutParams {

        /* renamed from: e  reason: collision with root package name */
        public static final int[] f3824e = {16843137};

        /* renamed from: a  reason: collision with root package name */
        public float f3825a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3826b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3827c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f3828d;

        public d() {
            super(-1, -1);
        }

        public d(int i10, int i11) {
            super(i10, i11);
        }

        public d(@m0 Context context, @o0 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3824e);
            this.f3825a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public d(@m0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public d(@m0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public d(@m0 d dVar) {
            super(dVar);
            this.f3825a = dVar.f3825a;
        }
    }

    public interface e {
        void a(@m0 View view, float f10);

        void b(@m0 View view);

        void c(@m0 View view);
    }

    public static class f implements e {
        public void a(View view, float f10) {
        }

        public void b(View view) {
        }

        public void c(View view) {
        }
    }

    public SlidingPaneLayout(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public SlidingPaneLayout(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.O = f3805q0;
        this.f3815i0 = true;
        this.f3816j0 = new Rect();
        this.f3817k0 = new ArrayList<>();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.S = (int) ((32.0f * f10) + 0.5f);
        setWillNotDraw(false);
        w1.z1(this, new a());
        w1.P1(this, 1);
        m1.c p10 = m1.c.p(this, 0.5f, new c());
        this.f3813g0 = p10;
        p10.S(f10 * 400.0f);
    }

    public static boolean w(View view) {
        return view.isOpaque();
    }

    public boolean a(View view, boolean z10, int i10, int i11, int i12) {
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
                    if (a(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (z10) {
            if (view.canScrollHorizontally(k() ? i10 : -i10)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean b() {
        return this.T;
    }

    public boolean c() {
        return d(this.U, 0);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.f3813g0.o(true)) {
            return;
        }
        if (!this.T) {
            this.f3813g0.a();
        } else {
            w1.l1(this);
        }
    }

    public final boolean d(View view, int i10) {
        if (!this.f3815i0 && !u(0.0f, i10)) {
            return false;
        }
        this.f3814h0 = false;
        return true;
    }

    public void draw(Canvas canvas) {
        int i10;
        int i11;
        super.draw(canvas);
        Drawable drawable = k() ? this.R : this.Q;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (k()) {
                i11 = childAt.getRight();
                i10 = intrinsicWidth + i11;
            } else {
                int left = childAt.getLeft();
                int i12 = left - intrinsicWidth;
                i10 = left;
                i11 = i12;
            }
            drawable.setBounds(i11, top, i10, bottom);
            drawable.draw(canvas);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        d dVar = (d) view.getLayoutParams();
        int save = canvas.save();
        if (this.T && !dVar.f3826b && this.U != null) {
            canvas.getClipBounds(this.f3816j0);
            if (k()) {
                Rect rect = this.f3816j0;
                rect.left = Math.max(rect.left, this.U.getRight());
            } else {
                Rect rect2 = this.f3816j0;
                rect2.right = Math.min(rect2.right, this.U.getLeft());
            }
            canvas.clipRect(this.f3816j0);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e(View view, float f10, int i10) {
        d dVar = (d) view.getLayoutParams();
        if (f10 > 0.0f && i10 != 0) {
            int i11 = (((int) (((float) ((-16777216 & i10) >>> 24)) * f10)) << 24) | (i10 & w1.f7299s);
            if (dVar.f3828d == null) {
                dVar.f3828d = new Paint();
            }
            dVar.f3828d.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, dVar.f3828d);
            }
            i(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = dVar.f3828d;
            if (paint != null) {
                paint.setColorFilter((ColorFilter) null);
            }
            b bVar = new b(view);
            this.f3817k0.add(bVar);
            w1.n1(this, bVar);
        }
    }

    public void f(View view) {
        e eVar = this.f3812f0;
        if (eVar != null) {
            eVar.c(view);
        }
        sendAccessibilityEvent(32);
    }

    public void g(View view) {
        e eVar = this.f3812f0;
        if (eVar != null) {
            eVar.b(view);
        }
        sendAccessibilityEvent(32);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    @l
    public int getCoveredFadeColor() {
        return this.P;
    }

    @r0
    public int getParallaxDistance() {
        return this.f3809c0;
    }

    @l
    public int getSliderFadeColor() {
        return this.O;
    }

    public void h(View view) {
        e eVar = this.f3812f0;
        if (eVar != null) {
            eVar.a(view, this.V);
        }
    }

    public void i(View view) {
        w1.T1(view, ((d) view.getLayoutParams()).f3828d);
    }

    public boolean j(View view) {
        if (view == null) {
            return false;
        }
        return this.T && ((d) view.getLayoutParams()).f3827c && this.V > 0.0f;
    }

    public boolean k() {
        return w1.X(this) == 1;
    }

    public boolean l() {
        return !this.T || this.V == 1.0f;
    }

    public boolean m() {
        return this.T;
    }

    public void n(int i10) {
        if (this.U == null) {
            this.V = 0.0f;
            return;
        }
        boolean k10 = k();
        d dVar = (d) this.U.getLayoutParams();
        int width = this.U.getWidth();
        if (k10) {
            i10 = (getWidth() - i10) - width;
        }
        float paddingRight = ((float) (i10 - ((k10 ? getPaddingRight() : getPaddingLeft()) + (k10 ? dVar.rightMargin : dVar.leftMargin)))) / ((float) this.f3807a0);
        this.V = paddingRight;
        if (this.f3809c0 != 0) {
            q(paddingRight);
        }
        if (dVar.f3827c) {
            e(this.U, this.V, this.O);
        }
        h(this.U);
    }

    public boolean o() {
        return p(this.U, 0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3815i0 = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3815i0 = true;
        int size = this.f3817k0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3817k0.get(i10).run();
        }
        this.f3817k0.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.T && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f3814h0 = !this.f3813g0.K(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.T || (this.f3808b0 && actionMasked != 0)) {
            this.f3813g0.c();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f3813g0.c();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f3808b0 = false;
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                this.f3810d0 = x10;
                this.f3811e0 = y10;
                if (this.f3813g0.K(this.U, (int) x10, (int) y10) && j(this.U)) {
                    z10 = true;
                    return this.f3813g0.U(motionEvent) || z10;
                }
            } else if (actionMasked == 2) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                float abs = Math.abs(x11 - this.f3810d0);
                float abs2 = Math.abs(y11 - this.f3811e0);
                if (abs > ((float) this.f3813g0.D()) && abs2 > abs) {
                    this.f3813g0.c();
                    this.f3808b0 = true;
                    return false;
                }
            }
            z10 = false;
            if (this.f3813g0.U(motionEvent)) {
                return true;
            }
        }
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        boolean k10 = k();
        m1.c cVar = this.f3813g0;
        if (k10) {
            cVar.R(2);
        } else {
            cVar.R(1);
        }
        int i18 = i12 - i10;
        int paddingRight = k10 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = k10 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f3815i0) {
            this.V = (!this.T || !this.f3814h0) ? 0.0f : 1.0f;
        }
        int i19 = paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (dVar.f3826b) {
                    int i21 = i18 - paddingLeft;
                    int min = (Math.min(paddingRight, i21 - this.S) - i19) - (dVar.leftMargin + dVar.rightMargin);
                    this.f3807a0 = min;
                    int i22 = k10 ? dVar.rightMargin : dVar.leftMargin;
                    dVar.f3827c = ((i19 + i22) + min) + (measuredWidth / 2) > i21;
                    int i23 = (int) (((float) min) * this.V);
                    i19 += i22 + i23;
                    this.V = ((float) i23) / ((float) min);
                    i14 = 0;
                } else if (!this.T || (i17 = this.f3809c0) == 0) {
                    i19 = paddingRight;
                    i14 = 0;
                } else {
                    i14 = (int) ((1.0f - this.V) * ((float) i17));
                    i19 = paddingRight;
                }
                if (k10) {
                    i15 = (i18 - i19) + i14;
                    i16 = i15 - measuredWidth;
                } else {
                    i16 = i19 - i14;
                    i15 = i16 + measuredWidth;
                }
                childAt.layout(i16, paddingTop, i15, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
            }
        }
        if (this.f3815i0) {
            if (this.T) {
                if (this.f3809c0 != 0) {
                    q(this.V);
                }
                if (((d) this.U.getLayoutParams()).f3827c) {
                    e(this.U, this.V, this.O);
                }
            } else {
                for (int i24 = 0; i24 < childCount; i24++) {
                    e(getChildAt(i24), 0.0f, this.O);
                }
            }
            v(this.U);
        }
        this.f3815i0 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            int r1 = android.view.View.MeasureSpec.getMode(r21)
            int r2 = android.view.View.MeasureSpec.getSize(r21)
            int r3 = android.view.View.MeasureSpec.getMode(r22)
            int r4 = android.view.View.MeasureSpec.getSize(r22)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 == r7) goto L_0x002f
            boolean r8 = r20.isInEditMode()
            if (r8 == 0) goto L_0x0027
            if (r1 != r6) goto L_0x0023
            goto L_0x0044
        L_0x0023:
            if (r1 != 0) goto L_0x0044
            r2 = r5
            goto L_0x0044
        L_0x0027:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Width must have an exact value or MATCH_PARENT"
            r1.<init>(r2)
            throw r1
        L_0x002f:
            if (r3 != 0) goto L_0x0044
            boolean r1 = r20.isInEditMode()
            if (r1 == 0) goto L_0x003c
            if (r3 != 0) goto L_0x0044
            r4 = r5
            r3 = r6
            goto L_0x0044
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Height must not be UNSPECIFIED"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            r1 = 0
            if (r3 == r6) goto L_0x0057
            if (r3 == r7) goto L_0x004c
            r4 = r1
        L_0x004a:
            r5 = r4
            goto L_0x0063
        L_0x004c:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            goto L_0x004a
        L_0x0057:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            r5 = r4
            r4 = r1
        L_0x0063:
            int r8 = r20.getPaddingLeft()
            int r8 = r2 - r8
            int r9 = r20.getPaddingRight()
            int r8 = r8 - r9
            int r9 = r20.getChildCount()
            r10 = 0
            r0.U = r10
            r11 = r1
            r12 = r11
            r14 = r8
            r13 = 0
        L_0x0079:
            r15 = 8
            r16 = 1
            if (r11 >= r9) goto L_0x0118
            android.view.View r6 = r0.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r17 = r6.getLayoutParams()
            r7 = r17
            androidx.slidingpanelayout.widget.SlidingPaneLayout$d r7 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.d) r7
            int r10 = r6.getVisibility()
            if (r10 != r15) goto L_0x0095
            r7.f3827c = r1
            goto L_0x010f
        L_0x0095:
            float r10 = r7.f3825a
            r15 = 0
            int r18 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r18 <= 0) goto L_0x00a3
            float r13 = r13 + r10
            int r10 = r7.width
            if (r10 != 0) goto L_0x00a3
            goto L_0x010f
        L_0x00a3:
            int r10 = r7.leftMargin
            int r15 = r7.rightMargin
            int r10 = r10 + r15
            int r15 = r7.width
            r1 = -2
            if (r15 != r1) goto L_0x00bb
            int r10 = r8 - r10
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
            r22 = r13
            r13 = r15
            r1 = -1
        L_0x00b9:
            r15 = r10
            goto L_0x00d1
        L_0x00bb:
            r22 = r13
            r1 = -1
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 != r1) goto L_0x00cb
            int r10 = r8 - r10
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
            goto L_0x00b9
        L_0x00cb:
            r10 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
        L_0x00d1:
            int r10 = r7.height
            r1 = -2
            if (r10 != r1) goto L_0x00db
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r13)
            goto L_0x00ec
        L_0x00db:
            r1 = -1
            if (r10 != r1) goto L_0x00e5
            r1 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            goto L_0x00eb
        L_0x00e5:
            r1 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r1)
        L_0x00eb:
            r1 = r10
        L_0x00ec:
            r6.measure(r15, r1)
            int r1 = r6.getMeasuredWidth()
            int r10 = r6.getMeasuredHeight()
            if (r3 != r13) goto L_0x00ff
            if (r10 <= r4) goto L_0x00ff
            int r4 = java.lang.Math.min(r10, r5)
        L_0x00ff:
            int r14 = r14 - r1
            if (r14 >= 0) goto L_0x0105
            r1 = r16
            goto L_0x0106
        L_0x0105:
            r1 = 0
        L_0x0106:
            r7.f3826b = r1
            r12 = r12 | r1
            if (r1 == 0) goto L_0x010d
            r0.U = r6
        L_0x010d:
            r13 = r22
        L_0x010f:
            int r11 = r11 + 1
            r1 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x0079
        L_0x0118:
            if (r12 != 0) goto L_0x011f
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0204
        L_0x011f:
            int r1 = r0.S
            int r1 = r8 - r1
            r3 = 0
        L_0x0124:
            if (r3 >= r9) goto L_0x0204
            android.view.View r6 = r0.getChildAt(r3)
            int r7 = r6.getVisibility()
            if (r7 != r15) goto L_0x0137
        L_0x0130:
            r19 = r1
        L_0x0132:
            r1 = 0
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x01fc
        L_0x0137:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$d r7 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.d) r7
            int r10 = r6.getVisibility()
            if (r10 != r15) goto L_0x0144
            goto L_0x0130
        L_0x0144:
            int r10 = r7.width
            if (r10 != 0) goto L_0x0152
            float r10 = r7.f3825a
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0152
            r10 = r16
            goto L_0x0153
        L_0x0152:
            r10 = 0
        L_0x0153:
            if (r10 == 0) goto L_0x0157
            r11 = 0
            goto L_0x015b
        L_0x0157:
            int r11 = r6.getMeasuredWidth()
        L_0x015b:
            if (r12 == 0) goto L_0x019d
            android.view.View r15 = r0.U
            if (r6 == r15) goto L_0x019d
            int r15 = r7.width
            if (r15 >= 0) goto L_0x0130
            if (r11 > r1) goto L_0x016e
            float r11 = r7.f3825a
            r15 = 0
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 <= 0) goto L_0x0130
        L_0x016e:
            if (r10 == 0) goto L_0x018b
            int r7 = r7.height
            r10 = -2
            if (r7 != r10) goto L_0x017e
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0195
        L_0x017e:
            r10 = -1
            if (r7 != r10) goto L_0x0188
            r10 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L_0x0195
        L_0x0188:
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0191
        L_0x018b:
            r10 = 1073741824(0x40000000, float:2.0)
            int r7 = r6.getMeasuredHeight()
        L_0x0191:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10)
        L_0x0195:
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
            r6.measure(r11, r7)
            goto L_0x0130
        L_0x019d:
            float r10 = r7.f3825a
            r15 = 0
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x0130
            int r10 = r7.width
            if (r10 != 0) goto L_0x01c3
            int r10 = r7.height
            r15 = -2
            if (r10 != r15) goto L_0x01b6
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r15)
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x01cd
        L_0x01b6:
            r15 = -1
            if (r10 != r15) goto L_0x01c0
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r15)
            goto L_0x01cd
        L_0x01c0:
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x01c9
        L_0x01c3:
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = r6.getMeasuredHeight()
        L_0x01c9:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
        L_0x01cd:
            if (r12 == 0) goto L_0x01e5
            int r15 = r7.leftMargin
            int r7 = r7.rightMargin
            int r15 = r15 + r7
            int r7 = r8 - r15
            r19 = r1
            r15 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r15)
            if (r11 == r7) goto L_0x0132
            r6.measure(r1, r10)
            goto L_0x0132
        L_0x01e5:
            r19 = r1
            r1 = 0
            int r15 = java.lang.Math.max(r1, r14)
            float r7 = r7.f3825a
            float r15 = (float) r15
            float r7 = r7 * r15
            float r7 = r7 / r13
            int r7 = (int) r7
            int r11 = r11 + r7
            r7 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r7)
            r6.measure(r11, r10)
        L_0x01fc:
            int r3 = r3 + 1
            r1 = r19
            r15 = 8
            goto L_0x0124
        L_0x0204:
            int r1 = r20.getPaddingTop()
            int r4 = r4 + r1
            int r1 = r20.getPaddingBottom()
            int r4 = r4 + r1
            r0.setMeasuredDimension(r2, r4)
            r0.T = r12
            m1.c r1 = r0.f3813g0
            int r1 = r1.E()
            if (r1 == 0) goto L_0x0222
            if (r12 != 0) goto L_0x0222
            m1.c r1 = r0.f3813g0
            r1.a()
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        if (savedState.Q) {
            o();
        } else {
            c();
        }
        this.f3814h0 = savedState.Q;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Q = m() ? l() : this.f3814h0;
        return savedState;
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            this.f3815i0 = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.T) {
            return super.onTouchEvent(motionEvent);
        }
        this.f3813g0.L(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f3810d0 = x10;
            this.f3811e0 = y10;
        } else if (actionMasked == 1 && j(this.U)) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            float f10 = x11 - this.f3810d0;
            float f11 = y11 - this.f3811e0;
            int D = this.f3813g0.D();
            if ((f10 * f10) + (f11 * f11) < ((float) (D * D)) && this.f3813g0.K(this.U, (int) x11, (int) y11)) {
                d(this.U, 0);
            }
        }
        return true;
    }

    public final boolean p(View view, int i10) {
        if (!this.f3815i0 && !u(1.0f, i10)) {
            return false;
        }
        this.f3814h0 = true;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.k()
            android.view.View r1 = r9.U
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$d r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.d) r1
            boolean r2 = r1.f3827c
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x0057
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.U
            if (r4 != r5) goto L_0x002c
            goto L_0x0054
        L_0x002c:
            float r5 = r9.W
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f3809c0
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.W = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0042
            int r5 = -r5
        L_0x0042:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0054
            float r5 = r9.W
            if (r0 == 0) goto L_0x004d
            float r5 = r5 - r6
            goto L_0x004f
        L_0x004d:
            float r5 = r6 - r5
        L_0x004f:
            int r6 = r9.P
            r9.e(r4, r5, r6)
        L_0x0054:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.q(float):void");
    }

    public void r() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.T) {
            this.f3814h0 = view == this.U;
        }
    }

    @Deprecated
    public void s() {
        c();
    }

    public void setCoveredFadeColor(@l int i10) {
        this.P = i10;
    }

    public void setPanelSlideListener(@o0 e eVar) {
        this.f3812f0 = eVar;
    }

    public void setParallaxDistance(@r0 int i10) {
        this.f3809c0 = i10;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@o0 Drawable drawable) {
        this.Q = drawable;
    }

    public void setShadowDrawableRight(@o0 Drawable drawable) {
        this.R = drawable;
    }

    @Deprecated
    public void setShadowResource(@u int i10) {
        setShadowDrawable(getResources().getDrawable(i10));
    }

    public void setShadowResourceLeft(int i10) {
        setShadowDrawableLeft(i0.d.i(getContext(), i10));
    }

    public void setShadowResourceRight(int i10) {
        setShadowDrawableRight(i0.d.i(getContext(), i10));
    }

    public void setSliderFadeColor(@l int i10) {
        this.O = i10;
    }

    @Deprecated
    public void t() {
        o();
    }

    public boolean u(float f10, int i10) {
        int i11;
        if (!this.T) {
            return false;
        }
        boolean k10 = k();
        d dVar = (d) this.U.getLayoutParams();
        if (k10) {
            i11 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + dVar.rightMargin)) + (f10 * ((float) this.f3807a0))) + ((float) this.U.getWidth())));
        } else {
            i11 = (int) (((float) (getPaddingLeft() + dVar.leftMargin)) + (f10 * ((float) this.f3807a0)));
        }
        m1.c cVar = this.f3813g0;
        View view = this.U;
        if (!cVar.V(view, i11, view.getTop())) {
            return false;
        }
        r();
        w1.l1(this);
        return true;
    }

    public void v(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        View childAt;
        boolean z10;
        View view2 = view;
        boolean k10 = k();
        int width = k10 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = k10 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !w(view)) {
            i13 = 0;
            i12 = 0;
            i11 = 0;
            i10 = 0;
        } else {
            i13 = view.getLeft();
            i12 = view.getRight();
            i11 = view.getTop();
            i10 = view.getBottom();
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 < childCount && (childAt = getChildAt(i14)) != view2) {
                if (childAt.getVisibility() == 8) {
                    z10 = k10;
                } else {
                    z10 = k10;
                    childAt.setVisibility((Math.max(k10 ? paddingLeft : width, childAt.getLeft()) < i13 || Math.max(paddingTop, childAt.getTop()) < i11 || Math.min(k10 ? width : paddingLeft, childAt.getRight()) > i12 || Math.min(height, childAt.getBottom()) > i10) ? 0 : 4);
                }
                i14++;
                view2 = view;
                k10 = z10;
            } else {
                return;
            }
        }
    }
}

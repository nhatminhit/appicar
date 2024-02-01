package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.widget.m;
import d.g1;
import d.l;
import d.m0;
import d.n;
import d.r0;
import f1.j0;
import f1.k0;
import f1.n0;
import f1.o0;
import f1.w1;

public class SwipeRefreshLayout extends ViewGroup implements n0, j0 {
    public static final int F0 = 0;
    public static final int G0 = 1;
    public static final int H0 = -1;
    @g1
    public static final int I0 = 40;
    @g1
    public static final int J0 = 56;
    public static final String K0 = SwipeRefreshLayout.class.getSimpleName();
    public static final int L0 = 255;
    public static final int M0 = 76;
    public static final float N0 = 2.0f;
    public static final int O0 = -1;
    public static final float P0 = 0.5f;
    public static final float Q0 = 0.8f;
    public static final int R0 = 150;
    public static final int S0 = 300;
    public static final int T0 = 200;
    public static final int U0 = 200;
    public static final int V0 = -328966;
    public static final int W0 = 64;
    public static final int[] X0 = {16842766};
    public boolean A0;
    public i B0;
    public Animation.AnimationListener C0;
    public final Animation D0;
    public final Animation E0;
    public View O;
    public j P;
    public boolean Q;
    public int R;
    public float S;
    public float T;
    public final o0 U;
    public final k0 V;
    public final int[] W;

    /* renamed from: a0  reason: collision with root package name */
    public final int[] f3829a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f3830b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f3831c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f3832d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f3833e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f3834f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f3835g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f3836h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f3837i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f3838j0;

    /* renamed from: k0  reason: collision with root package name */
    public final DecelerateInterpolator f3839k0;

    /* renamed from: l0  reason: collision with root package name */
    public e3.a f3840l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f3841m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f3842n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f3843o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f3844p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f3845q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f3846r0;

    /* renamed from: s0  reason: collision with root package name */
    public e3.b f3847s0;

    /* renamed from: t0  reason: collision with root package name */
    public Animation f3848t0;

    /* renamed from: u0  reason: collision with root package name */
    public Animation f3849u0;

    /* renamed from: v0  reason: collision with root package name */
    public Animation f3850v0;

    /* renamed from: w0  reason: collision with root package name */
    public Animation f3851w0;

    /* renamed from: x0  reason: collision with root package name */
    public Animation f3852x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f3853y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f3854z0;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.Q) {
                swipeRefreshLayout.f3847s0.setAlpha(255);
                SwipeRefreshLayout.this.f3847s0.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f3853y0 && (jVar = swipeRefreshLayout2.P) != null) {
                    jVar.a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f3832d0 = swipeRefreshLayout3.f3840l0.getTop();
                return;
            }
            swipeRefreshLayout.x();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public class b extends Animation {
        public b() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    public class c extends Animation {
        public c() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    public class d extends Animation {
        public final /* synthetic */ int O;
        public final /* synthetic */ int P;

        public d(int i10, int i11) {
            this.O = i10;
            this.P = i11;
        }

        public void applyTransformation(float f10, Transformation transformation) {
            e3.b bVar = SwipeRefreshLayout.this.f3847s0;
            int i10 = this.O;
            bVar.setAlpha((int) (((float) i10) + (((float) (this.P - i10)) * f10)));
        }
    }

    public class e implements Animation.AnimationListener {
        public e() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f3837i0) {
                swipeRefreshLayout.F((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public class f extends Animation {
        public f() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = !swipeRefreshLayout.A0 ? swipeRefreshLayout.f3845q0 - Math.abs(swipeRefreshLayout.f3844p0) : swipeRefreshLayout.f3845q0;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i10 = swipeRefreshLayout2.f3842n0;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i10 + ((int) (((float) (abs - i10)) * f10))) - swipeRefreshLayout2.f3840l0.getTop());
            SwipeRefreshLayout.this.f3847s0.u(1.0f - f10);
        }
    }

    public class g extends Animation {
        public g() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.q(f10);
        }
    }

    public class h extends Animation {
        public h() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.f3843o0;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.q(f10);
        }
    }

    public interface i {
        boolean a(@m0 SwipeRefreshLayout swipeRefreshLayout, @d.o0 View view);
    }

    public interface j {
        void a();
    }

    public SwipeRefreshLayout(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public SwipeRefreshLayout(@m0 Context context, @d.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = false;
        this.S = -1.0f;
        this.W = new int[2];
        this.f3829a0 = new int[2];
        this.f3836h0 = -1;
        this.f3841m0 = -1;
        this.C0 = new a();
        this.D0 = new f();
        this.E0 = new g();
        this.R = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f3831c0 = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f3839k0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f3854z0 = (int) (displayMetrics.density * 40.0f);
        k();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f3845q0 = i10;
        this.S = (float) i10;
        this.U = new o0(this);
        this.V = new k0(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f3854z0;
        this.f3832d0 = i11;
        this.f3844p0 = i11;
        q(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i10) {
        this.f3840l0.getBackground().setAlpha(i10);
        this.f3847s0.setAlpha(i10);
    }

    public final void A(boolean z10, boolean z11) {
        if (this.Q != z10) {
            this.f3853y0 = z11;
            l();
            this.Q = z10;
            if (z10) {
                h(this.f3832d0, this.C0);
            } else {
                F(this.C0);
            }
        }
    }

    public final Animation B(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300);
        this.f3840l0.b((Animation.AnimationListener) null);
        this.f3840l0.clearAnimation();
        this.f3840l0.startAnimation(dVar);
        return dVar;
    }

    public final void C(float f10) {
        float f11 = this.f3834f0;
        int i10 = this.R;
        if (f10 - f11 > ((float) i10) && !this.f3835g0) {
            this.f3833e0 = f11 + ((float) i10);
            this.f3835g0 = true;
            this.f3847s0.setAlpha(76);
        }
    }

    public final void D() {
        this.f3851w0 = B(this.f3847s0.getAlpha(), 255);
    }

    public final void E() {
        this.f3850v0 = B(this.f3847s0.getAlpha(), 76);
    }

    public void F(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.f3849u0 = cVar;
        cVar.setDuration(150);
        this.f3840l0.b(animationListener);
        this.f3840l0.clearAnimation();
        this.f3840l0.startAnimation(this.f3849u0);
    }

    public final void G(int i10, Animation.AnimationListener animationListener) {
        this.f3842n0 = i10;
        this.f3843o0 = this.f3840l0.getScaleX();
        h hVar = new h();
        this.f3852x0 = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.f3840l0.b(animationListener);
        }
        this.f3840l0.clearAnimation();
        this.f3840l0.startAnimation(this.f3852x0);
    }

    public final void H(Animation.AnimationListener animationListener) {
        this.f3840l0.setVisibility(0);
        this.f3847s0.setAlpha(255);
        b bVar = new b();
        this.f3848t0 = bVar;
        bVar.setDuration((long) this.f3831c0);
        if (animationListener != null) {
            this.f3840l0.b(animationListener);
        }
        this.f3840l0.clearAnimation();
        this.f3840l0.startAnimation(this.f3848t0);
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.V.a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.V.b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.V.c(i10, i11, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.V.f(i10, i11, i12, i13, iArr);
    }

    public int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f3841m0;
        return i12 < 0 ? i11 : i11 == i10 + -1 ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    public int getNestedScrollAxes() {
        return this.U.a();
    }

    public int getProgressCircleDiameter() {
        return this.f3854z0;
    }

    public int getProgressViewEndOffset() {
        return this.f3845q0;
    }

    public int getProgressViewStartOffset() {
        return this.f3844p0;
    }

    public final void h(int i10, Animation.AnimationListener animationListener) {
        this.f3842n0 = i10;
        this.D0.reset();
        this.D0.setDuration(200);
        this.D0.setInterpolator(this.f3839k0);
        if (animationListener != null) {
            this.f3840l0.b(animationListener);
        }
        this.f3840l0.clearAnimation();
        this.f3840l0.startAnimation(this.D0);
    }

    public boolean hasNestedScrollingParent() {
        return this.V.k();
    }

    public final void i(int i10, Animation.AnimationListener animationListener) {
        if (this.f3837i0) {
            G(i10, animationListener);
            return;
        }
        this.f3842n0 = i10;
        this.E0.reset();
        this.E0.setDuration(200);
        this.E0.setInterpolator(this.f3839k0);
        if (animationListener != null) {
            this.f3840l0.b(animationListener);
        }
        this.f3840l0.clearAnimation();
        this.f3840l0.startAnimation(this.E0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.V.m();
    }

    public boolean j() {
        i iVar = this.B0;
        if (iVar != null) {
            return iVar.a(this, this.O);
        }
        View view = this.O;
        return view instanceof ListView ? m.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    public final void k() {
        this.f3840l0 = new e3.a(getContext(), V0);
        e3.b bVar = new e3.b(getContext());
        this.f3847s0 = bVar;
        bVar.E(1);
        this.f3840l0.setImageDrawable(this.f3847s0);
        this.f3840l0.setVisibility(8);
        addView(this.f3840l0);
    }

    public final void l() {
        if (this.O == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f3840l0)) {
                    this.O = childAt;
                    return;
                }
            }
        }
    }

    public final void m(float f10) {
        if (f10 > this.S) {
            A(true, true);
            return;
        }
        this.Q = false;
        this.f3847s0.B(0.0f, 0.0f);
        e eVar = null;
        if (!this.f3837i0) {
            eVar = new e();
        }
        i(this.f3832d0, eVar);
        this.f3847s0.t(false);
    }

    public final boolean n(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    public boolean o() {
        return this.Q;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        l();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3838j0 && actionMasked == 0) {
            this.f3838j0 = false;
        }
        if (!isEnabled() || this.f3838j0 || j() || this.Q || this.f3830b0) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.f3836h0;
                    if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) < 0) {
                        return false;
                    }
                    C(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        w(motionEvent);
                    }
                }
            }
            this.f3835g0 = false;
            this.f3836h0 = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f3844p0 - this.f3840l0.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f3836h0 = pointerId;
            this.f3835g0 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f3834f0 = motionEvent.getY(findPointerIndex2);
        }
        return this.f3835g0;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.O == null) {
                l();
            }
            View view = this.O;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f3840l0.getMeasuredWidth();
                int measuredHeight2 = this.f3840l0.getMeasuredHeight();
                int i14 = measuredWidth / 2;
                int i15 = measuredWidth2 / 2;
                int i16 = this.f3832d0;
                this.f3840l0.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.O == null) {
            l();
        }
        View view = this.O;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f3840l0.measure(View.MeasureSpec.makeMeasureSpec(this.f3854z0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f3854z0, 1073741824));
            this.f3841m0 = -1;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) == this.f3840l0) {
                    this.f3841m0 = i12;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.T;
            if (f10 > 0.0f) {
                float f11 = (float) i11;
                if (f11 > f10) {
                    iArr[1] = i11 - ((int) f10);
                    this.T = 0.0f;
                } else {
                    this.T = f10 - f11;
                    iArr[1] = i11;
                }
                p(this.T);
            }
        }
        if (this.A0 && i11 > 0 && this.T == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f3840l0.setVisibility(8);
        }
        int[] iArr2 = this.W;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        dispatchNestedScroll(i10, i11, i12, i13, this.f3829a0);
        int i14 = i13 + this.f3829a0[1];
        if (i14 < 0 && !j()) {
            float abs = this.T + ((float) Math.abs(i14));
            this.T = abs;
            p(abs);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.U.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.T = 0.0f;
        this.f3830b0 = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return isEnabled() && !this.f3838j0 && !this.Q && (i10 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.U.d(view);
        this.f3830b0 = false;
        float f10 = this.T;
        if (f10 > 0.0f) {
            m(f10);
            this.T = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3838j0 && actionMasked == 0) {
            this.f3838j0 = false;
        }
        if (!isEnabled() || this.f3838j0 || j() || this.Q || this.f3830b0) {
            return false;
        }
        if (actionMasked == 0) {
            this.f3836h0 = motionEvent.getPointerId(0);
            this.f3835g0 = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3836h0);
            if (findPointerIndex < 0) {
                return false;
            }
            if (this.f3835g0) {
                this.f3835g0 = false;
                m((motionEvent.getY(findPointerIndex) - this.f3833e0) * 0.5f);
            }
            this.f3836h0 = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f3836h0);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float y10 = motionEvent.getY(findPointerIndex2);
            C(y10);
            if (this.f3835g0) {
                float f10 = (y10 - this.f3833e0) * 0.5f;
                if (f10 <= 0.0f) {
                    return false;
                }
                p(f10);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    return false;
                }
                this.f3836h0 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                w(motionEvent);
            }
        }
        return true;
    }

    public final void p(float f10) {
        this.f3847s0.t(true);
        float min = Math.min(1.0f, Math.abs(f10 / this.S));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.S;
        int i10 = this.f3846r0;
        if (i10 <= 0) {
            i10 = this.A0 ? this.f3845q0 - this.f3844p0 : this.f3845q0;
        }
        float f11 = (float) i10;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f11 * 2.0f) / f11) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.f3844p0 + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.f3840l0.getVisibility() != 0) {
            this.f3840l0.setVisibility(0);
        }
        if (!this.f3837i0) {
            this.f3840l0.setScaleX(1.0f);
            this.f3840l0.setScaleY(1.0f);
        }
        if (this.f3837i0) {
            setAnimationProgress(Math.min(1.0f, f10 / this.S));
        }
        if (f10 < this.S) {
            if (this.f3847s0.getAlpha() > 76 && !n(this.f3850v0)) {
                E();
            }
        } else if (this.f3847s0.getAlpha() < 255 && !n(this.f3851w0)) {
            D();
        }
        this.f3847s0.B(0.0f, Math.min(0.8f, max * 0.8f));
        this.f3847s0.u(Math.min(1.0f, max));
        this.f3847s0.y((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f3832d0);
    }

    public void q(float f10) {
        int i10 = this.f3842n0;
        setTargetOffsetTopAndBottom((i10 + ((int) (((float) (this.f3844p0 - i10)) * f10))) - this.f3840l0.getTop());
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        View view = this.O;
        if (view == null || w1.V0(view)) {
            super.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setAnimationProgress(float f10) {
        this.f3840l0.setScaleX(f10);
        this.f3840l0.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(@n int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@l int... iArr) {
        l();
        this.f3847s0.x(iArr);
    }

    public void setColorSchemeResources(@n int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = i0.d.f(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.S = (float) i10;
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            x();
        }
    }

    public void setNestedScrollingEnabled(boolean z10) {
        this.V.p(z10);
    }

    public void setOnChildScrollUpCallback(@d.o0 i iVar) {
        this.B0 = iVar;
    }

    public void setOnRefreshListener(@d.o0 j jVar) {
        this.P = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(@l int i10) {
        this.f3840l0.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(@n int i10) {
        setProgressBackgroundColorSchemeColor(i0.d.f(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.Q == z10) {
            A(z10, false);
            return;
        }
        this.Q = z10;
        setTargetOffsetTopAndBottom((!this.A0 ? this.f3845q0 + this.f3844p0 : this.f3845q0) - this.f3832d0);
        this.f3853y0 = false;
        H(this.C0);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            this.f3854z0 = (int) (getResources().getDisplayMetrics().density * (i10 == 0 ? 56.0f : 40.0f));
            this.f3840l0.setImageDrawable((Drawable) null);
            this.f3847s0.E(i10);
            this.f3840l0.setImageDrawable(this.f3847s0);
        }
    }

    public void setSlingshotDistance(@r0 int i10) {
        this.f3846r0 = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        this.f3840l0.bringToFront();
        w1.d1(this.f3840l0, i10);
        this.f3832d0 = this.f3840l0.getTop();
    }

    public boolean startNestedScroll(int i10) {
        return this.V.r(i10);
    }

    public void stopNestedScroll() {
        this.V.t();
    }

    public final void w(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3836h0) {
            this.f3836h0 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    public void x() {
        this.f3840l0.clearAnimation();
        this.f3847s0.stop();
        this.f3840l0.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f3837i0) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f3844p0 - this.f3832d0);
        }
        this.f3832d0 = this.f3840l0.getTop();
    }

    public void y(boolean z10, int i10) {
        this.f3845q0 = i10;
        this.f3837i0 = z10;
        this.f3840l0.invalidate();
    }

    public void z(boolean z10, int i10, int i11) {
        this.f3837i0 = z10;
        this.f3844p0 = i10;
        this.f3845q0 = i11;
        this.A0 = true;
        x();
        this.Q = false;
    }
}

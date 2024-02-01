package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import d.t0;
import d.x0;
import f.a;
import f1.e3;
import f1.l0;
import f1.m0;
import f1.n0;
import f1.o0;
import f1.w1;
import n0.h0;

@x0({x0.a.Q})
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements y, n0, l0, m0 {

    /* renamed from: w0  reason: collision with root package name */
    public static final String f1016w0 = "ActionBarOverlayLayout";

    /* renamed from: x0  reason: collision with root package name */
    public static final int f1017x0 = 600;

    /* renamed from: y0  reason: collision with root package name */
    public static final int[] f1018y0 = {a.c.actionBarSize, 16842841};
    public int O;
    public int P;
    public ContentFrameLayout Q;
    public ActionBarContainer R;
    public z S;
    public Drawable T;
    public boolean U;
    public boolean V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1019a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f1020b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f1021c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f1022d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Rect f1023e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Rect f1024f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Rect f1025g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Rect f1026h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Rect f1027i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Rect f1028j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Rect f1029k0;
    @d.m0

    /* renamed from: l0  reason: collision with root package name */
    public e3 f1030l0;
    @d.m0

    /* renamed from: m0  reason: collision with root package name */
    public e3 f1031m0;
    @d.m0

    /* renamed from: n0  reason: collision with root package name */
    public e3 f1032n0;
    @d.m0

    /* renamed from: o0  reason: collision with root package name */
    public e3 f1033o0;

    /* renamed from: p0  reason: collision with root package name */
    public d f1034p0;

    /* renamed from: q0  reason: collision with root package name */
    public OverScroller f1035q0;

    /* renamed from: r0  reason: collision with root package name */
    public ViewPropertyAnimator f1036r0;

    /* renamed from: s0  reason: collision with root package name */
    public final AnimatorListenerAdapter f1037s0;

    /* renamed from: t0  reason: collision with root package name */
    public final Runnable f1038t0;

    /* renamed from: u0  reason: collision with root package name */
    public final Runnable f1039u0;

    /* renamed from: v0  reason: collision with root package name */
    public final o0 f1040v0;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1036r0 = null;
            actionBarOverlayLayout.f1020b0 = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1036r0 = null;
            actionBarOverlayLayout.f1020b0 = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.y();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1036r0 = actionBarOverlayLayout.R.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1037s0);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.y();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1036r0 = actionBarOverlayLayout.R.animate().translationY((float) (-ActionBarOverlayLayout.this.R.getHeight())).setListener(ActionBarOverlayLayout.this.f1037s0);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void f(int i10);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ActionBarOverlayLayout(@d.m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarOverlayLayout(@d.m0 Context context, @d.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = 0;
        this.f1023e0 = new Rect();
        this.f1024f0 = new Rect();
        this.f1025g0 = new Rect();
        this.f1026h0 = new Rect();
        this.f1027i0 = new Rect();
        this.f1028j0 = new Rect();
        this.f1029k0 = new Rect();
        e3 e3Var = e3.f7070c;
        this.f1030l0 = e3Var;
        this.f1031m0 = e3Var;
        this.f1032n0 = e3Var;
        this.f1033o0 = e3Var;
        this.f1037s0 = new a();
        this.f1038t0 = new b();
        this.f1039u0 = new c();
        z(context);
        this.f1040v0 = new o0(this);
    }

    public boolean A() {
        return this.f1019a0;
    }

    public boolean B() {
        return this.V;
    }

    public final void C() {
        y();
        postDelayed(this.f1039u0, 600);
    }

    public final void D() {
        y();
        postDelayed(this.f1038t0, 600);
    }

    public void E() {
        if (this.Q == null) {
            this.Q = (ContentFrameLayout) findViewById(a.h.action_bar_activity_content);
            this.R = (ActionBarContainer) findViewById(a.h.action_bar_container);
            this.S = x(findViewById(a.h.action_bar));
        }
    }

    public final void F() {
        y();
        this.f1038t0.run();
    }

    public final boolean G(float f10) {
        this.f1035q0.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1035q0.getFinalY() > this.R.getHeight();
    }

    public final void a() {
        y();
        this.f1039u0.run();
    }

    public final boolean b(@d.m0 View view, @d.m0 Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        int i10;
        int i11;
        int i12;
        int i13;
        e eVar = (e) view.getLayoutParams();
        if (!z10 || eVar.leftMargin == (i13 = rect.left)) {
            z14 = false;
        } else {
            eVar.leftMargin = i13;
            z14 = true;
        }
        if (z11 && eVar.topMargin != (i12 = rect.top)) {
            eVar.topMargin = i12;
            z14 = true;
        }
        if (z13 && eVar.rightMargin != (i11 = rect.right)) {
            eVar.rightMargin = i11;
            z14 = true;
        }
        if (!z12 || eVar.bottomMargin == (i10 = rect.bottom)) {
            return z14;
        }
        eVar.bottomMargin = i10;
        return true;
    }

    public void c(Menu menu, j.a aVar) {
        E();
        this.S.c(menu, aVar);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    /* renamed from: d */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.T != null && !this.U) {
            int bottom = this.R.getVisibility() == 0 ? (int) (((float) this.R.getBottom()) + this.R.getTranslationY() + 0.5f) : 0;
            this.T.setBounds(0, bottom, getWidth(), this.T.getIntrinsicHeight() + bottom);
            this.T.draw(canvas);
        }
    }

    public void e(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        r(view, i10, i11, i12, i13, i14);
    }

    public boolean f() {
        E();
        return this.S.f();
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public void g() {
        E();
        this.S.g();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.R;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f1040v0.a();
    }

    public CharSequence getTitle() {
        E();
        return this.S.getTitle();
    }

    public boolean h() {
        E();
        return this.S.h();
    }

    public boolean i() {
        E();
        return this.S.i();
    }

    public boolean j() {
        E();
        return this.S.j();
    }

    public boolean k() {
        E();
        return this.S.k();
    }

    public boolean l() {
        E();
        return this.S.l();
    }

    public boolean m() {
        E();
        return this.S.m();
    }

    public void n(SparseArray<Parcelable> sparseArray) {
        E();
        this.S.y(sparseArray);
    }

    public void o(int i10) {
        E();
        if (i10 == 2) {
            this.S.R();
        } else if (i10 == 5) {
            this.S.T();
        } else if (i10 == 109) {
            setOverlayMode(true);
        }
    }

    @t0(21)
    public WindowInsets onApplyWindowInsets(@d.m0 WindowInsets windowInsets) {
        E();
        e3 L = e3.L(windowInsets, this);
        boolean b10 = b(this.R, new Rect(L.p(), L.r(), L.q(), L.o()), true, true, false, true);
        w1.n(this, L, this.f1023e0);
        Rect rect = this.f1023e0;
        e3 x10 = L.x(rect.left, rect.top, rect.right, rect.bottom);
        this.f1030l0 = x10;
        boolean z10 = true;
        if (!this.f1031m0.equals(x10)) {
            this.f1031m0 = this.f1030l0;
            b10 = true;
        }
        if (!this.f1024f0.equals(this.f1023e0)) {
            this.f1024f0.set(this.f1023e0);
        } else {
            z10 = b10;
        }
        if (z10) {
            requestLayout();
        }
        return L.a().c().b().J();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        z(getContext());
        w1.t1(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = eVar.leftMargin + paddingLeft;
                int i16 = eVar.topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        e3 e3Var;
        E();
        measureChildWithMargins(this.R, i10, 0, i11, 0);
        e eVar = (e) this.R.getLayoutParams();
        int max = Math.max(0, this.R.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.R.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.R.getMeasuredState());
        boolean z10 = (w1.B0(this) & 256) != 0;
        if (z10) {
            i12 = this.O;
            if (this.W && this.R.getTabContainer() != null) {
                i12 += this.O;
            }
        } else {
            i12 = this.R.getVisibility() != 8 ? this.R.getMeasuredHeight() : 0;
        }
        this.f1025g0.set(this.f1023e0);
        e3 e3Var2 = this.f1030l0;
        this.f1032n0 = e3Var2;
        if (this.V || z10) {
            e3Var = new e3.b(this.f1032n0).h(h0.d(e3Var2.p(), this.f1032n0.r() + i12, this.f1032n0.q(), this.f1032n0.o() + 0)).a();
        } else {
            Rect rect = this.f1025g0;
            rect.top += i12;
            rect.bottom += 0;
            e3Var = e3Var2.x(0, i12, 0, 0);
        }
        this.f1032n0 = e3Var;
        b(this.Q, this.f1025g0, true, true, true, true);
        if (!this.f1033o0.equals(this.f1032n0)) {
            e3 e3Var3 = this.f1032n0;
            this.f1033o0 = e3Var3;
            w1.o(this.Q, e3Var3);
        }
        measureChildWithMargins(this.Q, i10, 0, i11, 0);
        e eVar2 = (e) this.Q.getLayoutParams();
        int max3 = Math.max(max, this.Q.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.Q.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.Q.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f1019a0 || !z10) {
            return false;
        }
        if (G(f11)) {
            a();
        } else {
            F();
        }
        this.f1020b0 = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f1021c0 + i11;
        this.f1021c0 = i14;
        setActionBarHideOffset(i14);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f1040v0.b(view, view2, i10);
        this.f1021c0 = getActionBarHideOffset();
        y();
        d dVar = this.f1034p0;
        if (dVar != null) {
            dVar.e();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.R.getVisibility() != 0) {
            return false;
        }
        return this.f1019a0;
    }

    public void onStopNestedScroll(View view) {
        if (this.f1019a0 && !this.f1020b0) {
            if (this.f1021c0 <= this.R.getHeight()) {
                D();
            } else {
                C();
            }
        }
        d dVar = this.f1034p0;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        E();
        int i11 = this.f1022d0 ^ i10;
        this.f1022d0 = i10;
        boolean z10 = false;
        boolean z11 = (i10 & 4) == 0;
        if ((i10 & 256) != 0) {
            z10 = true;
        }
        d dVar = this.f1034p0;
        if (dVar != null) {
            dVar.c(!z10);
            if (z11 || !z10) {
                this.f1034p0.a();
            } else {
                this.f1034p0.d();
            }
        }
        if ((i11 & 256) != 0 && this.f1034p0 != null) {
            w1.t1(this);
        }
    }

    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.P = i10;
        d dVar = this.f1034p0;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    public void p() {
        E();
        this.S.o();
    }

    public void q(SparseArray<Parcelable> sparseArray) {
        E();
        this.S.L(sparseArray);
    }

    public void r(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    public boolean s(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    public void setActionBarHideOffset(int i10) {
        y();
        this.R.setTranslationY((float) (-Math.max(0, Math.min(i10, this.R.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f1034p0 = dVar;
        if (getWindowToken() != null) {
            this.f1034p0.f(this.P);
            int i10 = this.f1022d0;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                w1.t1(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.W = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1019a0) {
            this.f1019a0 = z10;
            if (!z10) {
                y();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        E();
        this.S.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        E();
        this.S.setIcon(drawable);
    }

    public void setLogo(int i10) {
        E();
        this.S.setLogo(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.V = z10;
        this.U = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    public void setWindowCallback(Window.Callback callback) {
        E();
        this.S.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        E();
        this.S.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    public void u(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void v(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    /* renamed from: w */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final z x(View view) {
        if (view instanceof z) {
            return (z) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void y() {
        removeCallbacks(this.f1038t0);
        removeCallbacks(this.f1039u0);
        ViewPropertyAnimator viewPropertyAnimator = this.f1036r0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void z(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1018y0);
        boolean z10 = false;
        this.O = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.T = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z10 = true;
        }
        this.U = z10;
        this.f1035q0 = new OverScroller(context);
    }
}

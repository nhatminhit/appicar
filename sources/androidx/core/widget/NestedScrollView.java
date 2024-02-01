package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import d.x0;
import e0.a;
import f1.i0;
import f1.k0;
import f1.m0;
import f1.o0;
import f1.v0;
import f1.w1;
import g1.b0;
import g1.z;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements m0, i0, v0 {

    /* renamed from: r0  reason: collision with root package name */
    public static final int f2228r0 = 250;

    /* renamed from: s0  reason: collision with root package name */
    public static final float f2229s0 = 0.5f;

    /* renamed from: t0  reason: collision with root package name */
    public static final String f2230t0 = "NestedScrollView";

    /* renamed from: u0  reason: collision with root package name */
    public static final int f2231u0 = 250;

    /* renamed from: v0  reason: collision with root package name */
    public static final int f2232v0 = -1;

    /* renamed from: w0  reason: collision with root package name */
    public static final a f2233w0 = new a();

    /* renamed from: x0  reason: collision with root package name */
    public static final int[] f2234x0 = {16843130};
    public long O;
    public final Rect P;
    public OverScroller Q;
    public EdgeEffect R;
    public EdgeEffect S;
    public int T;
    public boolean U;
    public boolean V;
    public View W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f2235a0;

    /* renamed from: b0  reason: collision with root package name */
    public VelocityTracker f2236b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2237c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f2238d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f2239e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f2240f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f2241g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f2242h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int[] f2243i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int[] f2244j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f2245k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f2246l0;

    /* renamed from: m0  reason: collision with root package name */
    public SavedState f2247m0;

    /* renamed from: n0  reason: collision with root package name */
    public final o0 f2248n0;

    /* renamed from: o0  reason: collision with root package name */
    public final k0 f2249o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f2250p0;

    /* renamed from: q0  reason: collision with root package name */
    public b f2251q0;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int O;

        public class a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.O = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @d.m0
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.O + p7.a.f11639j;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.O);
        }
    }

    public static class a extends f1.a {
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            b0.N(accessibilityEvent, nestedScrollView.getScrollX());
            b0.P(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void g(View view, z zVar) {
            int scrollRange;
            super.g(view, zVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            zVar.U0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                zVar.D1(true);
                if (nestedScrollView.getScrollY() > 0) {
                    zVar.b(z.a.f7612s);
                    zVar.b(z.a.D);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    zVar.b(z.a.f7611r);
                    zVar.b(z.a.F);
                }
            }
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, max, true);
                    return true;
                } else if (i10 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, min, true);
            return true;
        }
    }

    public interface b {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    public NestedScrollView(@d.m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public NestedScrollView(@d.m0 Context context, @d.o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0110a.nestedScrollViewStyle);
    }

    public NestedScrollView(@d.m0 Context context, @d.o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.P = new Rect();
        this.U = true;
        this.V = false;
        this.W = null;
        this.f2235a0 = false;
        this.f2238d0 = true;
        this.f2242h0 = -1;
        this.f2243i0 = new int[2];
        this.f2244j0 = new int[2];
        A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2234x0, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2248n0 = new o0(this);
        this.f2249o0 = new k0(this);
        setNestedScrollingEnabled(true);
        w1.z1(this, f2233w0);
    }

    public static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2250p0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2250p0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2250p0;
    }

    public static int k(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    public final void A() {
        this.Q = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2239e0 = viewConfiguration.getScaledTouchSlop();
        this.f2240f0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2241g0 = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void B() {
        if (this.f2236b0 == null) {
            this.f2236b0 = VelocityTracker.obtain();
        }
    }

    public boolean C() {
        return this.f2237c0;
    }

    public final boolean D(View view) {
        return !G(view, 0, getHeight());
    }

    public boolean E() {
        return this.f2238d0;
    }

    public final boolean G(View view, int i10, int i11) {
        view.getDrawingRect(this.P);
        offsetDescendantRectToMyCoords(view, this.P);
        return this.P.bottom + i10 >= getScrollY() && this.P.top - i10 <= getScrollY() + i11;
    }

    public final void H(int i10, int i11, @d.o0 int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2249o0.e(0, scrollY2, 0, i10 - scrollY2, (int[]) null, i11, iArr);
    }

    public final void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2242h0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.T = (int) motionEvent.getY(i10);
            this.f2242h0 = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f2236b0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean J(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i18 = i12 + i10;
        int i19 = !z15 ? 0 : i16;
        int i20 = i13 + i11;
        int i21 = !z16 ? 0 : i17;
        int i22 = -i19;
        int i23 = i19 + i14;
        int i24 = -i21;
        int i25 = i21 + i15;
        if (i18 > i23) {
            i18 = i23;
            z11 = true;
        } else if (i18 < i22) {
            z11 = true;
            i18 = i22;
        } else {
            z11 = false;
        }
        if (i20 > i25) {
            i20 = i25;
            z12 = true;
        } else if (i20 < i24) {
            z12 = true;
            i20 = i24;
        } else {
            z12 = false;
        }
        if (z12 && !d(1)) {
            this.Q.springBack(i18, i20, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i18, i20, z11, z12);
        return z11 || z12;
    }

    public boolean K(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.P.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.P;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.P.top = getScrollY() - height;
            Rect rect2 = this.P;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.P;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return N(i10, i11, i12);
    }

    public final void L() {
        VelocityTracker velocityTracker = this.f2236b0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2236b0 = null;
        }
    }

    public final void M(boolean z10) {
        if (z10) {
            f(2, 1);
        } else {
            g(1);
        }
        this.f2246l0 = getScrollY();
        w1.l1(this);
    }

    public final boolean N(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View q10 = q(z11, i11, i12);
        if (q10 == null) {
            q10 = this;
        }
        if (i11 < scrollY || i12 > i13) {
            m(z11 ? i11 - scrollY : i12 - i13);
            z10 = true;
        }
        if (q10 != findFocus()) {
            q10.requestFocus(i10);
        }
        return z10;
    }

    public final void O(View view) {
        view.getDrawingRect(this.P);
        offsetDescendantRectToMyCoords(view, this.P);
        int l10 = l(this.P);
        if (l10 != 0) {
            scrollBy(0, l10);
        }
    }

    public final boolean P(Rect rect, boolean z10) {
        int l10 = l(rect);
        boolean z11 = l10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, l10);
            } else {
                Q(0, l10);
            }
        }
        return z11;
    }

    public final void Q(int i10, int i11) {
        S(i10, i11, 250, false);
    }

    public final void R(int i10, int i11, int i12) {
        S(i10, i11, i12, false);
    }

    public final void S(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.O > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.Q;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i12);
                M(z10);
            } else {
                if (!this.Q.isFinished()) {
                    h();
                }
                scrollBy(i10, i11);
            }
            this.O = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void T(int i10, int i11) {
        V(i10, i11, 250, false);
    }

    public final void U(int i10, int i11, int i12) {
        V(i10, i11, i12, false);
    }

    public void V(int i10, int i11, int i12, boolean z10) {
        S(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    public void W(int i10, int i11, boolean z10) {
        V(i10, i11, 250, z10);
    }

    public boolean a(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return this.f2249o0.g(i10, i11, i12, i13, iArr, i14);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f2249o0.d(i10, i11, iArr, iArr2, i12);
    }

    public void c(int i10, int i11, int i12, int i13, @d.o0 int[] iArr, int i14, @d.m0 int[] iArr2) {
        this.f2249o0.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @x0({x0.a.Q})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @x0({x0.a.Q})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @x0({x0.a.Q})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.Q.isFinished()) {
            this.Q.computeScrollOffset();
            int currY = this.Q.getCurrY();
            int i10 = currY - this.f2246l0;
            this.f2246l0 = currY;
            int[] iArr = this.f2244j0;
            boolean z10 = false;
            iArr[1] = 0;
            b(0, i10, iArr, (int[]) null, 1);
            int i11 = i10 - this.f2244j0[1];
            int scrollRange = getScrollRange();
            if (i11 != 0) {
                int scrollY = getScrollY();
                J(0, i11, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i12 = i11 - scrollY2;
                int[] iArr2 = this.f2244j0;
                iArr2[1] = 0;
                c(0, scrollY2, 0, i12, this.f2243i0, 1, iArr2);
                i11 = i12 - this.f2244j0[1];
            }
            if (i11 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z10 = true;
                }
                if (z10) {
                    o();
                    if (i11 < 0) {
                        if (this.R.isFinished()) {
                            edgeEffect = this.R;
                        }
                    } else if (this.S.isFinished()) {
                        edgeEffect = this.S;
                    }
                    edgeEffect.onAbsorb((int) this.Q.getCurrVelocity());
                }
                h();
            }
            if (!this.Q.isFinished()) {
                w1.l1(this);
            } else {
                g(1);
            }
        }
    }

    @x0({x0.a.Q})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @x0({x0.a.Q})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @x0({x0.a.Q})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean d(int i10) {
        return this.f2249o0.l(i10);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || p(keyEvent);
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f2249o0.a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f2249o0.b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return b(i10, i11, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f2249o0.f(i10, i11, i12, i13, iArr);
    }

    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.R != null) {
            int scrollY = getScrollY();
            int i11 = 0;
            if (!this.R.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i10 = getPaddingLeft() + 0;
                } else {
                    i10 = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i10, (float) min);
                this.R.setSize(width, height);
                if (this.R.draw(canvas)) {
                    w1.l1(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.S.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i11 = 0 + getPaddingLeft();
                }
                if (getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i11 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.S.setSize(width2, height2);
                if (this.S.draw(canvas)) {
                    w1.l1(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    public void e(@d.m0 View view, int i10, int i11, int i12, int i13, int i14, @d.m0 int[] iArr) {
        H(i13, i14, iArr);
    }

    public boolean f(int i10, int i11) {
        return this.f2249o0.s(i10, i11);
    }

    public void g(int i10) {
        this.f2249o0.u(i10);
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f2248n0.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final void h() {
        this.Q.abortAnimation();
        g(1);
    }

    public boolean hasNestedScrollingParent() {
        return d(0);
    }

    public boolean i(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !G(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.P);
            offsetDescendantRectToMyCoords(findNextFocus, this.P);
            m(l(this.P));
            findNextFocus.requestFocus(i10);
        }
        if (findFocus == null || !findFocus.isFocused() || !D(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public boolean isNestedScrollingEnabled() {
        return this.f2249o0.m();
    }

    public final boolean j() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public int l(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        } else if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public final void m(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f2238d0) {
            Q(0, i10);
        } else {
            scrollBy(0, i10);
        }
    }

    public void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n() {
        this.f2235a0 = false;
        L();
        g(0);
        EdgeEffect edgeEffect = this.R;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.S.onRelease();
        }
    }

    public final void o() {
        if (getOverScrollMode() == 2) {
            this.R = null;
            this.S = null;
        } else if (this.R == null) {
            Context context = getContext();
            this.R = new EdgeEffect(context);
            this.S = new EdgeEffect(context);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f2235a0) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f2235a0) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.f2242h0;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid pointerId=");
                            sb2.append(i11);
                            sb2.append(" in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.T) > this.f2239e0 && (2 & getNestedScrollAxes()) == 0) {
                                this.f2235a0 = true;
                                this.T = y10;
                                B();
                                this.f2236b0.addMovement(motionEvent);
                                this.f2245k0 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        I(motionEvent);
                    }
                }
            }
            this.f2235a0 = false;
            this.f2242h0 = -1;
            L();
            if (this.Q.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                w1.l1(this);
            }
            g(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (!y((int) motionEvent.getX(), y11)) {
                this.f2235a0 = false;
                L();
            } else {
                this.T = y11;
                this.f2242h0 = motionEvent.getPointerId(0);
                z();
                this.f2236b0.addMovement(motionEvent);
                this.Q.computeScrollOffset();
                this.f2235a0 = !this.Q.isFinished();
                f(2, 0);
            }
        }
        return this.f2235a0;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.U = false;
        View view = this.W;
        if (view != null && F(view, this)) {
            O(this.W);
        }
        this.W = null;
        if (!this.V) {
            if (this.f2247m0 != null) {
                scrollTo(getScrollX(), this.f2247m0.O);
                this.f2247m0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int k10 = k(scrollY, paddingTop, i14);
            if (k10 != scrollY) {
                scrollTo(getScrollX(), k10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.V = true;
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2237c0 && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(@d.m0 View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        w((int) f11);
        return true;
    }

    public boolean onNestedPreFling(@d.m0 View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public void onNestedPreScroll(@d.m0 View view, int i10, int i11, @d.m0 int[] iArr) {
        v(view, i10, i11, iArr, 0);
    }

    public void onNestedScroll(@d.m0 View view, int i10, int i11, int i12, int i13) {
        H(i13, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(@d.m0 View view, @d.m0 View view2, int i10) {
        t(view, view2, i10, 0);
    }

    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i10) : instance.findNextFocusFromRect(this, rect, i10);
        if (findNextFocus != null && !D(findNextFocus)) {
            return findNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2247m0 = savedState;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.O = getScrollY();
        return savedState;
    }

    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        b bVar = this.f2251q0;
        if (bVar != null) {
            bVar.a(this, i10, i11, i12, i13);
        }
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && G(findFocus, 0, i13)) {
            findFocus.getDrawingRect(this.P);
            offsetDescendantRectToMyCoords(findFocus, this.P);
            m(l(this.P));
        }
    }

    public boolean onStartNestedScroll(@d.m0 View view, @d.m0 View view2, int i10) {
        return s(view, view2, i10, 0);
    }

    public void onStopNestedScroll(@d.m0 View view) {
        u(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r10.Q.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0205, code lost:
        if (r10.Q.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.B()
            int r0 = r24.getActionMasked()
            r12 = 0
            if (r0 != 0) goto L_0x0010
            r10.f2245k0 = r12
        L_0x0010:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            int r1 = r10.f2245k0
            float r1 = (float) r1
            r2 = 0
            r13.offsetLocation(r2, r1)
            r1 = 2
            r14 = 1
            if (r0 == 0) goto L_0x0209
            r3 = -1
            if (r0 == r14) goto L_0x01c4
            if (r0 == r1) goto L_0x0082
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x023f
        L_0x002f:
            r23.I(r24)
            int r0 = r10.f2242h0
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.T = r0
            goto L_0x023f
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.T = r1
            int r0 = r11.getPointerId(r0)
            r10.f2242h0 = r0
            goto L_0x023f
        L_0x0054:
            boolean r0 = r10.f2235a0
            if (r0 == 0) goto L_0x007b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x007b
            android.widget.OverScroller r15 = r10.Q
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
        L_0x0078:
            f1.w1.l1(r23)
        L_0x007b:
            r10.f2242h0 = r3
            r23.n()
            goto L_0x023f
        L_0x0082:
            int r0 = r10.f2242h0
            int r15 = r11.findPointerIndex(r0)
            if (r15 != r3) goto L_0x00a0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.f2242h0
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            goto L_0x023f
        L_0x00a0:
            float r0 = r11.getY(r15)
            int r6 = (int) r0
            int r0 = r10.T
            int r0 = r0 - r6
            boolean r1 = r10.f2235a0
            if (r1 != 0) goto L_0x00c6
            int r1 = java.lang.Math.abs(r0)
            int r2 = r10.f2239e0
            if (r1 <= r2) goto L_0x00c6
            android.view.ViewParent r1 = r23.getParent()
            if (r1 == 0) goto L_0x00bd
            r1.requestDisallowInterceptTouchEvent(r14)
        L_0x00bd:
            r10.f2235a0 = r14
            int r1 = r10.f2239e0
            if (r0 <= 0) goto L_0x00c5
            int r0 = r0 - r1
            goto L_0x00c6
        L_0x00c5:
            int r0 = r0 + r1
        L_0x00c6:
            r7 = r0
            boolean r0 = r10.f2235a0
            if (r0 == 0) goto L_0x023f
            r1 = 0
            int[] r3 = r10.f2244j0
            int[] r4 = r10.f2243i0
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.b(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00e8
            int[] r0 = r10.f2244j0
            r0 = r0[r14]
            int r7 = r7 - r0
            int r0 = r10.f2245k0
            int[] r1 = r10.f2243i0
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f2245k0 = r0
        L_0x00e8:
            r16 = r7
            int[] r0 = r10.f2243i0
            r0 = r0[r14]
            int r6 = r6 - r0
            r10.T = r6
            int r17 = r23.getScrollY()
            int r9 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0107
            if (r0 != r14) goto L_0x0104
            if (r9 <= 0) goto L_0x0104
            goto L_0x0107
        L_0x0104:
            r18 = r12
            goto L_0x0109
        L_0x0107:
            r18 = r14
        L_0x0109:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r23
            r2 = r16
            r6 = r9
            r22 = r9
            r9 = r19
            boolean r0 = r0.J(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x012e
            boolean r0 = r10.d(r12)
            if (r0 != 0) goto L_0x012e
            android.view.VelocityTracker r0 = r10.f2236b0
            r0.clear()
        L_0x012e:
            int r0 = r23.getScrollY()
            int r2 = r0 - r17
            int r4 = r16 - r2
            int[] r7 = r10.f2244j0
            r7[r14] = r12
            r1 = 0
            r3 = 0
            int[] r5 = r10.f2243i0
            r6 = 0
            r0 = r23
            r0.c(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r10.T
            int[] r1 = r10.f2243i0
            r1 = r1[r14]
            int r0 = r0 - r1
            r10.T = r0
            int r0 = r10.f2245k0
            int r0 = r0 + r1
            r10.f2245k0 = r0
            if (r18 == 0) goto L_0x023f
            int[] r0 = r10.f2244j0
            r0 = r0[r14]
            int r0 = r16 - r0
            r23.o()
            int r1 = r17 + r0
            if (r1 >= 0) goto L_0x0185
            android.widget.EdgeEffect r1 = r10.R
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.i.e(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.S
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01ad
            android.widget.EdgeEffect r0 = r10.S
        L_0x0181:
            r0.onRelease()
            goto L_0x01ad
        L_0x0185:
            r2 = r22
            if (r1 <= r2) goto L_0x01ad
            android.widget.EdgeEffect r1 = r10.S
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r11.getX(r15)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            androidx.core.widget.i.e(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.R
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01ad
            android.widget.EdgeEffect r0 = r10.R
            goto L_0x0181
        L_0x01ad:
            android.widget.EdgeEffect r0 = r10.R
            if (r0 == 0) goto L_0x023f
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01bf
            android.widget.EdgeEffect r0 = r10.S
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x023f
        L_0x01bf:
            f1.w1.l1(r23)
            goto L_0x023f
        L_0x01c4:
            android.view.VelocityTracker r0 = r10.f2236b0
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r10.f2241g0
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r10.f2242h0
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r10.f2240f0
            if (r1 < r4) goto L_0x01ed
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r10.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x007b
            r10.dispatchNestedFling(r2, r1, r14)
            r10.w(r0)
            goto L_0x007b
        L_0x01ed:
            android.widget.OverScroller r15 = r10.Q
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
            goto L_0x0078
        L_0x0209:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x0210
            return r12
        L_0x0210:
            android.widget.OverScroller r0 = r10.Q
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r14
            r10.f2235a0 = r0
            if (r0 == 0) goto L_0x0224
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x0224
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x0224:
            android.widget.OverScroller r0 = r10.Q
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x022f
            r23.h()
        L_0x022f:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.T = r0
            int r0 = r11.getPointerId(r12)
            r10.f2242h0 = r0
            r10.f(r1, r12)
        L_0x023f:
            android.view.VelocityTracker r0 = r10.f2236b0
            if (r0 == 0) goto L_0x0246
            r0.addMovement(r13)
        L_0x0246:
            r13.recycle()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(@d.m0 KeyEvent keyEvent) {
        this.P.setEmpty();
        int i10 = 130;
        if (!j()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? i(33) : x(33);
            }
            if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? i(130) : x(130);
            }
            if (keyCode != 62) {
                return false;
            }
            if (keyEvent.isShiftPressed()) {
                i10 = 33;
            }
            K(i10);
            return false;
        }
    }

    public final View q(boolean z10, int i10, int i11) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else if (!z13) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    public void r(@d.m0 View view, int i10, int i11, int i12, int i13, int i14) {
        H(i13, i14, (int[]) null);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.U) {
            O(view2);
        } else {
            this.W = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return P(rect, z10);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void requestLayout() {
        this.U = true;
        super.requestLayout();
    }

    public boolean s(@d.m0 View view, @d.m0 View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int k10 = k(i10, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int k11 = k(i11, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (k10 != getScrollX() || k11 != getScrollY()) {
                super.scrollTo(k10, k11);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f2237c0) {
            this.f2237c0 = z10;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z10) {
        this.f2249o0.p(z10);
    }

    public void setOnScrollChangeListener(@d.o0 b bVar) {
        this.f2251q0 = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f2238d0 = z10;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i10) {
        return f(i10, 0);
    }

    public void stopNestedScroll() {
        g(0);
    }

    public void t(@d.m0 View view, @d.m0 View view2, int i10, int i11) {
        this.f2248n0.c(view, view2, i10, i11);
        f(2, i11);
    }

    public void u(@d.m0 View view, int i10) {
        this.f2248n0.e(view, i10);
        g(i10);
    }

    public void v(@d.m0 View view, int i10, int i11, @d.m0 int[] iArr, int i12) {
        b(i10, i11, iArr, (int[]) null, i12);
    }

    public void w(int i10) {
        if (getChildCount() > 0) {
            this.Q.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            M(true);
        }
    }

    public boolean x(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.P;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.P.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.P;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.P;
        return N(i10, rect3.top, rect3.bottom);
    }

    public final boolean y(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
    }

    public final void z() {
        VelocityTracker velocityTracker = this.f2236b0;
        if (velocityTracker == null) {
            this.f2236b0 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }
}

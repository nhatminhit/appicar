package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import d.b1;
import d.e0;
import d.l;
import d.m0;
import d.o0;
import d.t0;
import d.u;
import d.x0;
import e1.i;
import f1.e3;
import f1.p0;
import f1.w1;
import i9.a;
import k9.h;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: o0  reason: collision with root package name */
    public static final int f16621o0 = a.n.Widget_Design_CollapsingToolbar;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f16622p0 = 600;
    public boolean O;
    public int P;
    @o0
    public ViewGroup Q;
    @o0
    public View R;
    public View S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public final Rect f16623a0;
    @m0

    /* renamed from: b0  reason: collision with root package name */
    public final com.google.android.material.internal.a f16624b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f16625c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f16626d0;
    @o0

    /* renamed from: e0  reason: collision with root package name */
    public Drawable f16627e0;
    @o0

    /* renamed from: f0  reason: collision with root package name */
    public Drawable f16628f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f16629g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f16630h0;

    /* renamed from: i0  reason: collision with root package name */
    public ValueAnimator f16631i0;

    /* renamed from: j0  reason: collision with root package name */
    public long f16632j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f16633k0;

    /* renamed from: l0  reason: collision with root package name */
    public AppBarLayout.e f16634l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f16635m0;
    @o0

    /* renamed from: n0  reason: collision with root package name */
    public e3 f16636n0;

    public class a implements p0 {
        public a() {
        }

        public e3 a(View view, @m0 e3 e3Var) {
            return CollapsingToolbarLayout.this.m(e3Var);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static class c extends FrameLayout.LayoutParams {

        /* renamed from: c  reason: collision with root package name */
        public static final float f16639c = 0.5f;

        /* renamed from: d  reason: collision with root package name */
        public static final int f16640d = 0;

        /* renamed from: e  reason: collision with root package name */
        public static final int f16641e = 1;

        /* renamed from: f  reason: collision with root package name */
        public static final int f16642f = 2;

        /* renamed from: a  reason: collision with root package name */
        public int f16643a = 0;

        /* renamed from: b  reason: collision with root package name */
        public float f16644b = 0.5f;

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(int i10, int i11, int i12) {
            super(i10, i11, i12);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.CollapsingToolbarLayout_Layout);
            this.f16643a = obtainStyledAttributes.getInt(a.o.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            d(obtainStyledAttributes.getFloat(a.o.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public c(@m0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(@m0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @t0(19)
        public c(@m0 FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public int a() {
            return this.f16643a;
        }

        public float b() {
            return this.f16644b;
        }

        public void c(int i10) {
            this.f16643a = i10;
        }

        public void d(float f10) {
            this.f16644b = f10;
        }
    }

    public class d implements AppBarLayout.e {
        public d() {
        }

        public void a(AppBarLayout appBarLayout, int i10) {
            int i11;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f16635m0 = i10;
            e3 e3Var = collapsingToolbarLayout.f16636n0;
            int r10 = e3Var != null ? e3Var.r() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i12);
                c cVar = (c) childAt.getLayoutParams();
                h i13 = CollapsingToolbarLayout.i(childAt);
                int i14 = cVar.f16643a;
                if (i14 == 1) {
                    i11 = v0.a.c(-i10, 0, CollapsingToolbarLayout.this.g(childAt));
                } else if (i14 != 2) {
                } else {
                    i11 = Math.round(((float) (-i10)) * cVar.f16644b);
                }
                i13.k(i11);
            }
            CollapsingToolbarLayout.this.s();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f16628f0 != null && r10 > 0) {
                w1.l1(collapsingToolbarLayout2);
            }
            CollapsingToolbarLayout.this.f16624b0.h0(((float) Math.abs(i10)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - w1.c0(CollapsingToolbarLayout.this)) - r10)));
        }
    }

    public CollapsingToolbarLayout(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public CollapsingToolbarLayout(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.collapsingToolbarLayoutStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(@d.m0 android.content.Context r10, @d.o0 android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = f16621o0
            android.content.Context r10 = ca.a.c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = 1
            r9.O = r10
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f16623a0 = r0
            r6 = -1
            r9.f16633k0 = r6
            android.content.Context r0 = r9.getContext()
            com.google.android.material.internal.a r7 = new com.google.android.material.internal.a
            r7.<init>(r9)
            r9.f16624b0 = r7
            android.animation.TimeInterpolator r1 = j9.a.f19832e
            r7.n0(r1)
            int[] r2 = i9.a.o.CollapsingToolbarLayout
            r8 = 0
            int[] r5 = new int[r8]
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r12 = i9.a.o.CollapsingToolbarLayout_expandedTitleGravity
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r12 = r11.getInt(r12, r0)
            r7.d0(r12)
            int r12 = i9.a.o.CollapsingToolbarLayout_collapsedTitleGravity
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r12 = r11.getInt(r12, r0)
            r7.U(r12)
            int r12 = i9.a.o.CollapsingToolbarLayout_expandedTitleMargin
            int r12 = r11.getDimensionPixelSize(r12, r8)
            r9.W = r12
            r9.V = r12
            r9.U = r12
            r9.T = r12
            int r12 = i9.a.o.CollapsingToolbarLayout_expandedTitleMarginStart
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0065
            int r12 = r11.getDimensionPixelSize(r12, r8)
            r9.T = r12
        L_0x0065:
            int r12 = i9.a.o.CollapsingToolbarLayout_expandedTitleMarginEnd
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0073
            int r12 = r11.getDimensionPixelSize(r12, r8)
            r9.V = r12
        L_0x0073:
            int r12 = i9.a.o.CollapsingToolbarLayout_expandedTitleMarginTop
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0081
            int r12 = r11.getDimensionPixelSize(r12, r8)
            r9.U = r12
        L_0x0081:
            int r12 = i9.a.o.CollapsingToolbarLayout_expandedTitleMarginBottom
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x008f
            int r12 = r11.getDimensionPixelSize(r12, r8)
            r9.W = r12
        L_0x008f:
            int r12 = i9.a.o.CollapsingToolbarLayout_titleEnabled
            boolean r12 = r11.getBoolean(r12, r10)
            r9.f16625c0 = r12
            int r12 = i9.a.o.CollapsingToolbarLayout_title
            java.lang.CharSequence r12 = r11.getText(r12)
            r9.setTitle(r12)
            int r12 = i9.a.n.TextAppearance_Design_CollapsingToolbar_Expanded
            r7.a0(r12)
            int r12 = f.a.m.TextAppearance_AppCompat_Widget_ActionBar_Title
            r7.R(r12)
            int r12 = i9.a.o.CollapsingToolbarLayout_expandedTitleTextAppearance
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00b9
            int r12 = r11.getResourceId(r12, r8)
            r7.a0(r12)
        L_0x00b9:
            int r12 = i9.a.o.CollapsingToolbarLayout_collapsedTitleTextAppearance
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00c8
            int r12 = r11.getResourceId(r12, r8)
            r7.R(r12)
        L_0x00c8:
            int r12 = i9.a.o.CollapsingToolbarLayout_scrimVisibleHeightTrigger
            int r12 = r11.getDimensionPixelSize(r12, r6)
            r9.f16633k0 = r12
            int r12 = i9.a.o.CollapsingToolbarLayout_maxLines
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00df
            int r10 = r11.getInt(r12, r10)
            r7.j0(r10)
        L_0x00df:
            int r10 = i9.a.o.CollapsingToolbarLayout_scrimAnimationDuration
            r12 = 600(0x258, float:8.41E-43)
            int r10 = r11.getInt(r10, r12)
            long r0 = (long) r10
            r9.f16632j0 = r0
            int r10 = i9.a.o.CollapsingToolbarLayout_contentScrim
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setContentScrim(r10)
            int r10 = i9.a.o.CollapsingToolbarLayout_statusBarScrim
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarScrim(r10)
            int r10 = i9.a.o.CollapsingToolbarLayout_toolbarId
            int r10 = r11.getResourceId(r10, r6)
            r9.P = r10
            r11.recycle()
            r9.setWillNotDraw(r8)
            com.google.android.material.appbar.CollapsingToolbarLayout$a r10 = new com.google.android.material.appbar.CollapsingToolbarLayout$a
            r10.<init>()
            f1.w1.Y1(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static int f(@m0 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static CharSequence h(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @m0
    public static h i(@m0 View view) {
        int i10 = a.h.view_offset_helper;
        h hVar = (h) view.getTag(i10);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(view);
        view.setTag(i10, hVar2);
        return hVar2;
    }

    public static boolean k(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    public final void a(int i10) {
        b();
        ValueAnimator valueAnimator = this.f16631i0;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f16631i0 = valueAnimator2;
            valueAnimator2.setDuration(this.f16632j0);
            this.f16631i0.setInterpolator(i10 > this.f16629g0 ? j9.a.f19830c : j9.a.f19831d);
            this.f16631i0.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.f16631i0.cancel();
        }
        this.f16631i0.setIntValues(new int[]{this.f16629g0, i10});
        this.f16631i0.start();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r6 = this;
            boolean r0 = r6.O
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.Q = r0
            r6.R = r0
            int r1 = r6.P
            r2 = -1
            if (r1 == r2) goto L_0x001f
            android.view.View r1 = r6.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.Q = r1
            if (r1 == 0) goto L_0x001f
            android.view.View r1 = r6.c(r1)
            r6.R = r1
        L_0x001f:
            android.view.ViewGroup r1 = r6.Q
            r2 = 0
            if (r1 != 0) goto L_0x003e
            int r1 = r6.getChildCount()
            r3 = r2
        L_0x0029:
            if (r3 >= r1) goto L_0x003c
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = k(r4)
            if (r5 == 0) goto L_0x0039
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x003c
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x003c:
            r6.Q = r0
        L_0x003e:
            r6.r()
            r6.O = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.b():void");
    }

    @m0
    public final View c(@m0 View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    /* renamed from: d */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    public void draw(@m0 Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        b();
        if (this.Q == null && (drawable = this.f16627e0) != null && this.f16629g0 > 0) {
            drawable.mutate().setAlpha(this.f16629g0);
            this.f16627e0.draw(canvas);
        }
        if (this.f16625c0 && this.f16626d0) {
            this.f16624b0.j(canvas);
        }
        if (this.f16628f0 != null && this.f16629g0 > 0) {
            e3 e3Var = this.f16636n0;
            int r10 = e3Var != null ? e3Var.r() : 0;
            if (r10 > 0) {
                this.f16628f0.setBounds(0, -this.f16635m0, getWidth(), r10 - this.f16635m0);
                this.f16628f0.mutate().setAlpha(this.f16629g0);
                this.f16628f0.draw(canvas);
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (this.f16627e0 == null || this.f16629g0 <= 0 || !l(view)) {
            z10 = false;
        } else {
            this.f16627e0.mutate().setAlpha(this.f16629g0);
            this.f16627e0.draw(canvas);
            z10 = true;
        }
        return super.drawChild(canvas, view, j10) || z10;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16628f0;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f16627e0;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.a aVar = this.f16624b0;
        if (aVar != null) {
            z10 |= aVar.l0(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    /* renamed from: e */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public final int g(@m0 View view) {
        return ((getHeight() - i(view).c()) - view.getHeight()) - ((c) view.getLayoutParams()).bottomMargin;
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCollapsedTitleGravity() {
        return this.f16624b0.o();
    }

    @m0
    public Typeface getCollapsedTitleTypeface() {
        return this.f16624b0.t();
    }

    @o0
    public Drawable getContentScrim() {
        return this.f16627e0;
    }

    public int getExpandedTitleGravity() {
        return this.f16624b0.y();
    }

    public int getExpandedTitleMarginBottom() {
        return this.W;
    }

    public int getExpandedTitleMarginEnd() {
        return this.V;
    }

    public int getExpandedTitleMarginStart() {
        return this.T;
    }

    public int getExpandedTitleMarginTop() {
        return this.U;
    }

    @m0
    public Typeface getExpandedTitleTypeface() {
        return this.f16624b0.B();
    }

    @x0({x0.a.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.f16624b0.D();
    }

    public int getScrimAlpha() {
        return this.f16629g0;
    }

    public long getScrimAnimationDuration() {
        return this.f16632j0;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10 = this.f16633k0;
        if (i10 >= 0) {
            return i10;
        }
        e3 e3Var = this.f16636n0;
        int r10 = e3Var != null ? e3Var.r() : 0;
        int c02 = w1.c0(this);
        return c02 > 0 ? Math.min((c02 * 2) + r10, getHeight()) : getHeight() / 3;
    }

    @o0
    public Drawable getStatusBarScrim() {
        return this.f16628f0;
    }

    @o0
    public CharSequence getTitle() {
        if (this.f16625c0) {
            return this.f16624b0.E();
        }
        return null;
    }

    public boolean j() {
        return this.f16625c0;
    }

    public final boolean l(View view) {
        View view2 = this.R;
        if (view2 == null || view2 == this) {
            if (view == this.Q) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    public e3 m(@m0 e3 e3Var) {
        e3 e3Var2 = w1.S(this) ? e3Var : null;
        if (!i.a(this.f16636n0, e3Var2)) {
            this.f16636n0 = e3Var2;
            requestLayout();
        }
        return e3Var.c();
    }

    public void n(int i10, int i11, int i12, int i13) {
        this.T = i10;
        this.U = i11;
        this.V = i12;
        this.W = i13;
        requestLayout();
    }

    public void o(boolean z10, boolean z11) {
        if (this.f16630h0 != z10) {
            int i10 = 255;
            if (z11) {
                if (!z10) {
                    i10 = 0;
                }
                a(i10);
            } else {
                if (!z10) {
                    i10 = 0;
                }
                setScrimAlpha(i10);
            }
            this.f16630h0 = z10;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            w1.M1(this, w1.S((View) parent));
            if (this.f16634l0 == null) {
                this.f16634l0 = new d();
            }
            ((AppBarLayout) parent).b(this.f16634l0);
            w1.t1(this);
        }
    }

    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.e eVar = this.f16634l0;
        if (eVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).q(eVar);
        }
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        e3 e3Var = this.f16636n0;
        if (e3Var != null) {
            int r10 = e3Var.r();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (!w1.S(childAt) && childAt.getTop() < r10) {
                    w1.d1(childAt, r10);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            i(getChildAt(i15)).h();
        }
        if (this.f16625c0 && (view = this.S) != null) {
            boolean z11 = true;
            boolean z12 = w1.N0(view) && this.S.getVisibility() == 0;
            this.f16626d0 = z12;
            if (z12) {
                if (w1.X(this) != 1) {
                    z11 = false;
                }
                p(z11);
                this.f16624b0.Y(z11 ? this.V : this.T, this.f16623a0.top + this.U, (i12 - i10) - (z11 ? this.T : this.V), (i13 - i11) - this.W);
                this.f16624b0.N();
            }
        }
        if (this.Q != null && this.f16625c0 && TextUtils.isEmpty(this.f16624b0.E())) {
            setTitle(h(this.Q));
        }
        s();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            i(getChildAt(i16)).a();
        }
    }

    public void onMeasure(int i10, int i11) {
        b();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        e3 e3Var = this.f16636n0;
        int r10 = e3Var != null ? e3Var.r() : 0;
        if (mode == 0 && r10 > 0) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + r10, 1073741824));
        }
        ViewGroup viewGroup = this.Q;
        if (viewGroup != null) {
            View view = this.R;
            setMinimumHeight((view == null || view == this) ? f(viewGroup) : f(view));
        }
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.f16627e0;
        if (drawable != null) {
            drawable.setBounds(0, 0, i10, i11);
        }
    }

    public final void p(boolean z10) {
        int i10;
        int i11;
        int i12;
        View view = this.R;
        if (view == null) {
            view = this.Q;
        }
        int g10 = g(view);
        com.google.android.material.internal.c.a(this, this.S, this.f16623a0);
        ViewGroup viewGroup = this.Q;
        int i13 = 0;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i13 = toolbar.getTitleMarginStart();
            i11 = toolbar.getTitleMarginEnd();
            i10 = toolbar.getTitleMarginTop();
            i12 = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
            i12 = 0;
            i11 = 0;
            i10 = 0;
        } else {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i13 = toolbar2.getTitleMarginStart();
            i11 = toolbar2.getTitleMarginEnd();
            i10 = toolbar2.getTitleMarginTop();
            i12 = toolbar2.getTitleMarginBottom();
        }
        com.google.android.material.internal.a aVar = this.f16624b0;
        Rect rect = this.f16623a0;
        int i14 = rect.left + (z10 ? i11 : i13);
        int i15 = rect.top + g10 + i10;
        int i16 = rect.right;
        if (!z10) {
            i13 = i11;
        }
        aVar.P(i14, i15, i16 - i13, (rect.bottom + g10) - i12);
    }

    public final void q() {
        setContentDescription(getTitle());
    }

    public final void r() {
        View view;
        if (!this.f16625c0 && (view = this.S) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.S);
            }
        }
        if (this.f16625c0 && this.Q != null) {
            if (this.S == null) {
                this.S = new View(getContext());
            }
            if (this.S.getParent() == null) {
                this.Q.addView(this.S, -1, -1);
            }
        }
    }

    public final void s() {
        if (this.f16627e0 != null || this.f16628f0 != null) {
            setScrimsShown(getHeight() + this.f16635m0 < getScrimVisibleHeightTrigger());
        }
    }

    public void setCollapsedTitleGravity(int i10) {
        this.f16624b0.U(i10);
    }

    public void setCollapsedTitleTextAppearance(@b1 int i10) {
        this.f16624b0.R(i10);
    }

    public void setCollapsedTitleTextColor(@l int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedTitleTextColor(@m0 ColorStateList colorStateList) {
        this.f16624b0.T(colorStateList);
    }

    public void setCollapsedTitleTypeface(@o0 Typeface typeface) {
        this.f16624b0.W(typeface);
    }

    public void setContentScrim(@o0 Drawable drawable) {
        Drawable drawable2 = this.f16627e0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f16627e0 = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.f16627e0.setCallback(this);
                this.f16627e0.setAlpha(this.f16629g0);
            }
            w1.l1(this);
        }
    }

    public void setContentScrimColor(@l int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(@u int i10) {
        setContentScrim(i0.d.i(getContext(), i10));
    }

    public void setExpandedTitleColor(@l int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        this.f16624b0.d0(i10);
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.W = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.V = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.T = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.U = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@b1 int i10) {
        this.f16624b0.a0(i10);
    }

    public void setExpandedTitleTextColor(@m0 ColorStateList colorStateList) {
        this.f16624b0.c0(colorStateList);
    }

    public void setExpandedTitleTypeface(@o0 Typeface typeface) {
        this.f16624b0.f0(typeface);
    }

    @x0({x0.a.LIBRARY_GROUP})
    public void setMaxLines(int i10) {
        this.f16624b0.j0(i10);
    }

    public void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.f16629g0) {
            if (!(this.f16627e0 == null || (viewGroup = this.Q) == null)) {
                w1.l1(viewGroup);
            }
            this.f16629g0 = i10;
            w1.l1(this);
        }
    }

    public void setScrimAnimationDuration(@e0(from = 0) long j10) {
        this.f16632j0 = j10;
    }

    public void setScrimVisibleHeightTrigger(@e0(from = 0) int i10) {
        if (this.f16633k0 != i10) {
            this.f16633k0 = i10;
            s();
        }
    }

    public void setScrimsShown(boolean z10) {
        o(z10, w1.T0(this) && !isInEditMode());
    }

    public void setStatusBarScrim(@o0 Drawable drawable) {
        Drawable drawable2 = this.f16628f0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f16628f0 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f16628f0.setState(getDrawableState());
                }
                o0.d.m(this.f16628f0, w1.X(this));
                this.f16628f0.setVisible(getVisibility() == 0, false);
                this.f16628f0.setCallback(this);
                this.f16628f0.setAlpha(this.f16629g0);
            }
            w1.l1(this);
        }
    }

    public void setStatusBarScrimColor(@l int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(@u int i10) {
        setStatusBarScrim(i0.d.i(getContext(), i10));
    }

    public void setTitle(@o0 CharSequence charSequence) {
        this.f16624b0.m0(charSequence);
        q();
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f16625c0) {
            this.f16625c0 = z10;
            q();
            r();
            requestLayout();
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f16628f0;
        if (!(drawable == null || drawable.isVisible() == z10)) {
            this.f16628f0.setVisible(z10, false);
        }
        Drawable drawable2 = this.f16627e0;
        if (drawable2 != null && drawable2.isVisible() != z10) {
            this.f16627e0.setVisible(z10, false);
        }
    }

    public boolean verifyDrawable(@m0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16627e0 || drawable == this.f16628f0;
    }
}

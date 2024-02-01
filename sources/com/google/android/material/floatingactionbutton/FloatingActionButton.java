package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.e0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import d.b0;
import d.g1;
import d.l;
import d.m0;
import d.o0;
import d.p;
import d.r0;
import d.t0;
import d.u;
import d.x0;
import e1.n;
import f1.w0;
import f1.w1;
import i9.a;
import j9.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import z9.o;
import z9.s;

public class FloatingActionButton extends VisibilityAwareImageButton implements w0, e0, s9.a, s, CoordinatorLayout.b {

    /* renamed from: i0  reason: collision with root package name */
    public static final String f17061i0 = "FloatingActionButton";

    /* renamed from: j0  reason: collision with root package name */
    public static final String f17062j0 = "expandableWidgetHelper";

    /* renamed from: k0  reason: collision with root package name */
    public static final int f17063k0 = a.n.Widget_Design_FloatingActionButton;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f17064l0 = 1;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f17065m0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f17066n0 = -1;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f17067o0 = 0;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f17068p0 = 470;
    @o0
    public ColorStateList P;
    @o0
    public PorterDuff.Mode Q;
    @o0
    public ColorStateList R;
    @o0
    public PorterDuff.Mode S;
    @o0
    public ColorStateList T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public int f17069a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f17070b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f17071c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Rect f17072d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Rect f17073e0;
    @m0

    /* renamed from: f0  reason: collision with root package name */
    public final h f17074f0;
    @m0

    /* renamed from: g0  reason: collision with root package name */
    public final s9.c f17075g0;

    /* renamed from: h0  reason: collision with root package name */
    public a f17076h0;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: d  reason: collision with root package name */
        public static final boolean f17077d = true;

        /* renamed from: a  reason: collision with root package name */
        public Rect f17078a;

        /* renamed from: b  reason: collision with root package name */
        public b f17079b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f17080c;

        public BaseBehavior() {
            this.f17080c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.FloatingActionButton_Behavior_Layout);
            this.f17080c = obtainStyledAttributes.getBoolean(a.o.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        public static boolean I(@m0 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                return ((CoordinatorLayout.g) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        public boolean b(@m0 CoordinatorLayout coordinatorLayout, @m0 FloatingActionButton floatingActionButton, @m0 Rect rect) {
            Rect rect2 = floatingActionButton.f17072d0;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public boolean H() {
            return this.f17080c;
        }

        public final void J(@m0 CoordinatorLayout coordinatorLayout, @m0 FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f17072d0;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.g gVar = (CoordinatorLayout.g) floatingActionButton.getLayoutParams();
                int i10 = 0;
                int i11 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - gVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= gVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - gVar.bottomMargin) {
                    i10 = rect.bottom;
                } else if (floatingActionButton.getTop() <= gVar.topMargin) {
                    i10 = -rect.top;
                }
                if (i10 != 0) {
                    w1.d1(floatingActionButton, i10);
                }
                if (i11 != 0) {
                    w1.c1(floatingActionButton, i11);
                }
            }
        }

        /* renamed from: K */
        public boolean i(CoordinatorLayout coordinatorLayout, @m0 FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                P(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!I(view)) {
                return false;
            } else {
                Q(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: L */
        public boolean m(@m0 CoordinatorLayout coordinatorLayout, @m0 FloatingActionButton floatingActionButton, int i10) {
            List<View> w10 = coordinatorLayout.w(floatingActionButton);
            int size = w10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = w10.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (I(view) && Q(view, floatingActionButton)) {
                        break;
                    }
                } else if (P(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.N(floatingActionButton, i10);
            J(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void M(boolean z10) {
            this.f17080c = z10;
        }

        @g1
        public void N(b bVar) {
            this.f17079b = bVar;
        }

        public final boolean O(@m0 View view, @m0 FloatingActionButton floatingActionButton) {
            return this.f17080c && ((CoordinatorLayout.g) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean P(CoordinatorLayout coordinatorLayout, @m0 AppBarLayout appBarLayout, @m0 FloatingActionButton floatingActionButton) {
            if (!O(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f17078a == null) {
                this.f17078a = new Rect();
            }
            Rect rect = this.f17078a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.p(this.f17079b, false);
                return true;
            }
            floatingActionButton.B(this.f17079b, false);
            return true;
        }

        public final boolean Q(@m0 View view, @m0 FloatingActionButton floatingActionButton) {
            if (!O(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.g) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.p(this.f17079b, false);
                return true;
            }
            floatingActionButton.B(this.f17079b, false);
            return true;
        }

        public void h(@m0 CoordinatorLayout.g gVar) {
            if (gVar.f2159h == 0) {
                gVar.f2159h = 80;
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public /* bridge */ /* synthetic */ boolean G(@m0 CoordinatorLayout coordinatorLayout, @m0 FloatingActionButton floatingActionButton, @m0 Rect rect) {
            return super.b(coordinatorLayout, floatingActionButton, rect);
        }

        public /* bridge */ /* synthetic */ boolean H() {
            return super.H();
        }

        public /* bridge */ /* synthetic */ boolean K(CoordinatorLayout coordinatorLayout, @m0 FloatingActionButton floatingActionButton, View view) {
            return super.i(coordinatorLayout, floatingActionButton, view);
        }

        public /* bridge */ /* synthetic */ boolean L(@m0 CoordinatorLayout coordinatorLayout, @m0 FloatingActionButton floatingActionButton, int i10) {
            return super.m(coordinatorLayout, floatingActionButton, i10);
        }

        public /* bridge */ /* synthetic */ void M(boolean z10) {
            super.M(z10);
        }

        @g1
        public /* bridge */ /* synthetic */ void N(b bVar) {
            super.N(bVar);
        }

        public /* bridge */ /* synthetic */ void h(@m0 CoordinatorLayout.g gVar) {
            super.h(gVar);
        }
    }

    public class a implements a.j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17081a;

        public a(b bVar) {
            this.f17081a = bVar;
        }

        public void a() {
            this.f17081a.b(FloatingActionButton.this);
        }

        public void b() {
            this.f17081a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    public class c implements y9.c {
        public c() {
        }

        public void a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f17072d0.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f17069a0, i11 + FloatingActionButton.this.f17069a0, i12 + FloatingActionButton.this.f17069a0, i13 + FloatingActionButton.this.f17069a0);
        }

        public void b(@o0 Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        public boolean c() {
            return FloatingActionButton.this.f17071c0;
        }

        public float h() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public class e<T extends FloatingActionButton> implements a.i {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final k<T> f17084a;

        public e(@m0 k<T> kVar) {
            this.f17084a = kVar;
        }

        public void a() {
            this.f17084a.b(FloatingActionButton.this);
        }

        public void b() {
            this.f17084a.a(FloatingActionButton.this);
        }

        public boolean equals(@o0 Object obj) {
            return (obj instanceof e) && ((e) obj).f17084a.equals(this.f17084a);
        }

        public int hashCode() {
            return this.f17084a.hashCode();
        }
    }

    public FloatingActionButton(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public FloatingActionButton(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.floatingActionButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(@d.m0 android.content.Context r11, @d.o0 android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f17063k0
            android.content.Context r11 = ca.a.c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f17072d0 = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f17073e0 = r11
            android.content.Context r11 = r10.getContext()
            int[] r2 = i9.a.o.FloatingActionButton
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r1 = i9.a.o.FloatingActionButton_backgroundTint
            android.content.res.ColorStateList r1 = w9.c.a(r11, r0, r1)
            r10.P = r1
            int r1 = i9.a.o.FloatingActionButton_backgroundTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.v.k(r1, r3)
            r10.Q = r1
            int r1 = i9.a.o.FloatingActionButton_rippleColor
            android.content.res.ColorStateList r1 = w9.c.a(r11, r0, r1)
            r10.T = r1
            int r1 = i9.a.o.FloatingActionButton_fabSize
            int r1 = r0.getInt(r1, r2)
            r10.V = r1
            int r1 = i9.a.o.FloatingActionButton_fabCustomSize
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.W = r1
            int r1 = i9.a.o.FloatingActionButton_borderWidth
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.U = r1
            int r1 = i9.a.o.FloatingActionButton_elevation
            r2 = 0
            float r1 = r0.getDimension(r1, r2)
            int r3 = i9.a.o.FloatingActionButton_hoveredFocusedTranslationZ
            float r3 = r0.getDimension(r3, r2)
            int r4 = i9.a.o.FloatingActionButton_pressedTranslationZ
            float r2 = r0.getDimension(r4, r2)
            int r4 = i9.a.o.FloatingActionButton_useCompatPadding
            boolean r4 = r0.getBoolean(r4, r7)
            r10.f17071c0 = r4
            android.content.res.Resources r4 = r10.getResources()
            int r5 = i9.a.f.mtrl_fab_min_touch_target
            int r4 = r4.getDimensionPixelSize(r5)
            int r5 = i9.a.o.FloatingActionButton_maxImageSize
            int r5 = r0.getDimensionPixelSize(r5, r7)
            r10.f17070b0 = r5
            int r5 = i9.a.o.FloatingActionButton_showMotionSpec
            j9.h r5 = j9.h.c(r11, r0, r5)
            int r8 = i9.a.o.FloatingActionButton_hideMotionSpec
            j9.h r8 = j9.h.c(r11, r0, r8)
            z9.d r9 = z9.o.f24928m
            z9.o$b r11 = z9.o.g(r11, r12, r13, r6, r9)
            z9.o r11 = r11.m()
            int r6 = i9.a.o.FloatingActionButton_ensureMinTouchTargetSize
            boolean r6 = r0.getBoolean(r6, r7)
            int r7 = i9.a.o.FloatingActionButton_android_enabled
            r9 = 1
            boolean r7 = r0.getBoolean(r7, r9)
            r10.setEnabled(r7)
            r0.recycle()
            androidx.appcompat.widget.h r0 = new androidx.appcompat.widget.h
            r0.<init>(r10)
            r10.f17074f0 = r0
            r0.f(r12, r13)
            s9.c r12 = new s9.c
            r12.<init>(r10)
            r10.f17075g0 = r12
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.a0(r11)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            android.content.res.ColorStateList r12 = r10.P
            android.graphics.PorterDuff$Mode r13 = r10.Q
            android.content.res.ColorStateList r0 = r10.T
            int r7 = r10.U
            r11.x(r12, r13, r0, r7)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.W(r4)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.Q(r1)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.T(r3)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.X(r2)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            int r12 = r10.f17070b0
            r11.V(r12)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.b0(r5)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.S(r8)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.R(r6)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.MATRIX
            r10.setScaleType(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private a getImpl() {
        if (this.f17076h0 == null) {
            this.f17076h0 = j();
        }
        return this.f17076h0;
    }

    public static int x(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i10, size);
        }
        if (mode == 0) {
            return i10;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    public void A(@o0 b bVar) {
        B(bVar, true);
    }

    public void B(@o0 b bVar, boolean z10) {
        getImpl().f0(C(bVar), z10);
    }

    @o0
    public final a.j C(@o0 b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    public boolean a(boolean z10) {
        return this.f17075g0.f(z10);
    }

    public boolean b() {
        return this.f17075g0.c();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().E(getDrawableState());
    }

    public void f(@m0 Animator.AnimatorListener animatorListener) {
        getImpl().d(animatorListener);
    }

    public void g(@m0 Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    @o0
    public ColorStateList getBackgroundTintList() {
        return this.P;
    }

    @o0
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.Q;
    }

    @m0
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().t();
    }

    @o0
    public Drawable getContentBackground() {
        return getImpl().k();
    }

    @r0
    public int getCustomSize() {
        return this.W;
    }

    public int getExpandedComponentIdHint() {
        return this.f17075g0.b();
    }

    @o0
    public j9.h getHideMotionSpec() {
        return getImpl().p();
    }

    @Deprecated
    @l
    public int getRippleColor() {
        ColorStateList colorStateList = this.T;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @o0
    public ColorStateList getRippleColorStateList() {
        return this.T;
    }

    @m0
    public o getShapeAppearanceModel() {
        return (o) n.g(getImpl().u());
    }

    @o0
    public j9.h getShowMotionSpec() {
        return getImpl().v();
    }

    public int getSize() {
        return this.V;
    }

    public int getSizeDimension() {
        return m(this.V);
    }

    @o0
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @o0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @o0
    public ColorStateList getSupportImageTintList() {
        return this.R;
    }

    @o0
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.S;
    }

    public boolean getUseCompatPadding() {
        return this.f17071c0;
    }

    public void h(@m0 k<? extends FloatingActionButton> kVar) {
        getImpl().f(new e(kVar));
    }

    public void i() {
        setCustomSize(0);
    }

    @m0
    public final a j() {
        return new t9.d(this, new c());
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A();
    }

    @Deprecated
    public boolean k(@m0 Rect rect) {
        if (!w1.T0(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        s(rect);
        return true;
    }

    public void l(@m0 Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        s(rect);
    }

    public final int m(int i10) {
        int i11 = this.W;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m(1) : m(0);
        }
        return resources.getDimensionPixelSize(i10 != 1 ? a.f.design_fab_size_normal : a.f.design_fab_size_mini);
    }

    public void n() {
        o((b) null);
    }

    public void o(@o0 b bVar) {
        p(bVar, true);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().B();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().D();
    }

    public void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f17069a0 = (sizeDimension - this.f17070b0) / 2;
        getImpl().i0();
        int min = Math.min(x(sizeDimension, i10), x(sizeDimension, i11));
        Rect rect = this.f17072d0;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.a());
        this.f17075g0.d((Bundle) n.g(extendableSavedState.Q.get(f17062j0)));
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.Q.put(f17062j0, this.f17075g0.e());
        return extendableSavedState;
    }

    public boolean onTouchEvent(@m0 MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !k(this.f17073e0) || this.f17073e0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void p(@o0 b bVar, boolean z10) {
        getImpl().w(C(bVar), z10);
    }

    public boolean q() {
        return getImpl().y();
    }

    public boolean r() {
        return getImpl().z();
    }

    public final void s(@m0 Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f17072d0;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public void setBackgroundColor(int i10) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i10) {
    }

    public void setBackgroundTintList(@o0 ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            getImpl().O(colorStateList);
        }
    }

    public void setBackgroundTintMode(@o0 PorterDuff.Mode mode) {
        if (this.Q != mode) {
            this.Q = mode;
            getImpl().P(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().Q(f10);
    }

    public void setCompatElevationResource(@p int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().T(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(@p int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().X(f10);
    }

    public void setCompatPressedTranslationZResource(@p int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(@r0 int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i10 != this.W) {
            this.W = i10;
            requestLayout();
        }
    }

    @t0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().j0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().o()) {
            getImpl().R(z10);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(@b0 int i10) {
        this.f17075g0.g(i10);
    }

    public void setHideMotionSpec(@o0 j9.h hVar) {
        getImpl().S(hVar);
    }

    public void setHideMotionSpecResource(@d.b int i10) {
        setHideMotionSpec(j9.h.d(getContext(), i10));
    }

    public void setImageDrawable(@o0 Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().h0();
            if (this.R != null) {
                t();
            }
        }
    }

    public void setImageResource(@u int i10) {
        this.f17074f0.g(i10);
        t();
    }

    public void setRippleColor(@l int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setRippleColor(@o0 ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            getImpl().Y(this.T);
        }
    }

    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().I();
    }

    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().I();
    }

    @x0({x0.a.LIBRARY_GROUP})
    @g1
    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().Z(z10);
    }

    public void setShapeAppearanceModel(@m0 o oVar) {
        getImpl().a0(oVar);
    }

    public void setShowMotionSpec(@o0 j9.h hVar) {
        getImpl().b0(hVar);
    }

    public void setShowMotionSpecResource(@d.b int i10) {
        setShowMotionSpec(j9.h.d(getContext(), i10));
    }

    public void setSize(int i10) {
        this.W = 0;
        if (i10 != this.V) {
            this.V = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(@o0 ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(@o0 PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(@o0 ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            t();
        }
    }

    public void setSupportImageTintMode(@o0 PorterDuff.Mode mode) {
        if (this.S != mode) {
            this.S = mode;
            t();
        }
    }

    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().J();
    }

    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().J();
    }

    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f17071c0 != z10) {
            this.f17071c0 = z10;
            getImpl().C();
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public final void t() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.R;
            if (colorStateList == null) {
                o0.d.c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.S;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(f.e(colorForState, mode));
        }
    }

    public void u(@m0 Animator.AnimatorListener animatorListener) {
        getImpl().K(animatorListener);
    }

    public void v(@m0 Animator.AnimatorListener animatorListener) {
        getImpl().L(animatorListener);
    }

    public void w(@m0 k<? extends FloatingActionButton> kVar) {
        getImpl().M(new e(kVar));
    }

    public boolean y() {
        return getImpl().o();
    }

    public void z() {
        A((b) null);
    }
}

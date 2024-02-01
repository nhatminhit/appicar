package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import d.g1;
import d.m0;
import d.o0;
import f1.w1;
import i9.a;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final int E0 = a.n.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    public static final int F0 = 0;
    public static final int G0 = 1;
    public static final int H0 = 2;
    public static final Property<View, Float> I0;
    public static final Property<View, Float> J0;
    public static final Property<View, Float> K0;
    public static final Property<View, Float> L0;
    public boolean A0;
    public boolean B0;
    public boolean C0;
    @m0
    public ColorStateList D0;

    /* renamed from: q0  reason: collision with root package name */
    public int f17032q0;

    /* renamed from: r0  reason: collision with root package name */
    public final t9.a f17033r0;
    @m0

    /* renamed from: s0  reason: collision with root package name */
    public final b f17034s0;
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final b f17035t0;

    /* renamed from: u0  reason: collision with root package name */
    public final b f17036u0;

    /* renamed from: v0  reason: collision with root package name */
    public final b f17037v0;

    /* renamed from: w0  reason: collision with root package name */
    public final int f17038w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f17039x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f17040y0;
    @m0

    /* renamed from: z0  reason: collision with root package name */
    public final CoordinatorLayout.c<ExtendedFloatingActionButton> f17041z0;

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: f  reason: collision with root package name */
        public static final boolean f17042f = false;

        /* renamed from: g  reason: collision with root package name */
        public static final boolean f17043g = true;

        /* renamed from: a  reason: collision with root package name */
        public Rect f17044a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public j f17045b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public j f17046c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f17047d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f17048e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f17047d = false;
            this.f17048e = true;
        }

        public ExtendedFloatingActionButtonBehavior(@m0 Context context, @o0 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.ExtendedFloatingActionButton_Behavior_Layout);
            this.f17047d = obtainStyledAttributes.getBoolean(a.o.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f17048e = obtainStyledAttributes.getBoolean(a.o.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        public static boolean K(@m0 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                return ((CoordinatorLayout.g) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public void G(@m0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10 = this.f17048e;
            extendedFloatingActionButton.K(z10 ? extendedFloatingActionButton.f17035t0 : extendedFloatingActionButton.f17036u0, z10 ? this.f17046c : this.f17045b);
        }

        /* renamed from: H */
        public boolean b(@m0 CoordinatorLayout coordinatorLayout, @m0 ExtendedFloatingActionButton extendedFloatingActionButton, @m0 Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean I() {
            return this.f17047d;
        }

        public boolean J() {
            return this.f17048e;
        }

        /* renamed from: L */
        public boolean i(CoordinatorLayout coordinatorLayout, @m0 ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                T(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!K(view)) {
                return false;
            } else {
                U(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: M */
        public boolean m(@m0 CoordinatorLayout coordinatorLayout, @m0 ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> w10 = coordinatorLayout.w(extendedFloatingActionButton);
            int size = w10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = w10.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (K(view) && U(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (T(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.N(extendedFloatingActionButton, i10);
            return true;
        }

        public void N(boolean z10) {
            this.f17047d = z10;
        }

        public void O(boolean z10) {
            this.f17048e = z10;
        }

        @g1
        public void P(@o0 j jVar) {
            this.f17045b = jVar;
        }

        @g1
        public void Q(@o0 j jVar) {
            this.f17046c = jVar;
        }

        public final boolean R(@m0 View view, @m0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f17047d || this.f17048e) && ((CoordinatorLayout.g) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        public void S(@m0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10 = this.f17048e;
            extendedFloatingActionButton.K(z10 ? extendedFloatingActionButton.f17034s0 : extendedFloatingActionButton.f17037v0, z10 ? this.f17046c : this.f17045b);
        }

        public final boolean T(CoordinatorLayout coordinatorLayout, @m0 AppBarLayout appBarLayout, @m0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!R(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f17044a == null) {
                this.f17044a = new Rect();
            }
            Rect rect = this.f17044a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                S(extendedFloatingActionButton);
                return true;
            }
            G(extendedFloatingActionButton);
            return true;
        }

        public final boolean U(@m0 View view, @m0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!R(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.g) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                S(extendedFloatingActionButton);
                return true;
            }
            G(extendedFloatingActionButton);
            return true;
        }

        public void h(@m0 CoordinatorLayout.g gVar) {
            if (gVar.f2159h == 0) {
                gVar.f2159h = 80;
            }
        }
    }

    public class a implements l {
        public a() {
        }

        public int a() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        public int b() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.f17039x0 + ExtendedFloatingActionButton.this.f17040y0;
        }

        public int c() {
            return ExtendedFloatingActionButton.this.f17040y0;
        }

        public ViewGroup.LayoutParams d() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        public int e() {
            return ExtendedFloatingActionButton.this.f17039x0;
        }
    }

    public class b implements l {
        public b() {
        }

        public int a() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        public int b() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        public int c() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        public ViewGroup.LayoutParams d() {
            return new ViewGroup.LayoutParams(b(), a());
        }

        public int e() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17051a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f17052b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j f17053c;

        public c(b bVar, j jVar) {
            this.f17052b = bVar;
            this.f17053c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f17051a = true;
            this.f17052b.a();
        }

        public void onAnimationEnd(Animator animator) {
            this.f17052b.j();
            if (!this.f17051a) {
                this.f17052b.l(this.f17053c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f17052b.onAnimationStart(animator);
            this.f17051a = false;
        }
    }

    public static class d extends Property<View, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @m0
        /* renamed from: a */
        public Float get(@m0 View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(@m0 View view, @m0 Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    public static class e extends Property<View, Float> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @m0
        /* renamed from: a */
        public Float get(@m0 View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(@m0 View view, @m0 Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    public static class f extends Property<View, Float> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @m0
        /* renamed from: a */
        public Float get(@m0 View view) {
            return Float.valueOf((float) w1.j0(view));
        }

        /* renamed from: b */
        public void set(@m0 View view, @m0 Float f10) {
            w1.b2(view, f10.intValue(), view.getPaddingTop(), w1.i0(view), view.getPaddingBottom());
        }
    }

    public static class g extends Property<View, Float> {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @m0
        /* renamed from: a */
        public Float get(@m0 View view) {
            return Float.valueOf((float) w1.i0(view));
        }

        /* renamed from: b */
        public void set(@m0 View view, @m0 Float f10) {
            w1.b2(view, w1.j0(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
        }
    }

    public class h extends t9.b {

        /* renamed from: g  reason: collision with root package name */
        public final l f17055g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f17056h;

        public h(t9.a aVar, l lVar, boolean z10) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f17055g = lVar;
            this.f17056h = z10;
        }

        public int c() {
            return this.f17056h ? a.b.mtrl_extended_fab_change_size_expand_motion_spec : a.b.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        public void d() {
            boolean unused = ExtendedFloatingActionButton.this.A0 = this.f17056h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f17055g.d().width;
                layoutParams.height = this.f17055g.d().height;
                w1.b2(ExtendedFloatingActionButton.this, this.f17055g.e(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f17055g.c(), ExtendedFloatingActionButton.this.getPaddingBottom());
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        public boolean f() {
            return this.f17056h == ExtendedFloatingActionButton.this.A0 || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        public void j() {
            super.j();
            boolean unused = ExtendedFloatingActionButton.this.B0 = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f17055g.d().width;
                layoutParams.height = this.f17055g.d().height;
            }
        }

        @m0
        public AnimatorSet k() {
            j9.h b10 = b();
            if (b10.j("width")) {
                PropertyValuesHolder[] g10 = b10.g("width");
                g10[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.f17055g.b()});
                b10.l("width", g10);
            }
            if (b10.j("height")) {
                PropertyValuesHolder[] g11 = b10.g("height");
                g11[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.f17055g.a()});
                b10.l("height", g11);
            }
            if (b10.j("paddingStart")) {
                PropertyValuesHolder[] g12 = b10.g("paddingStart");
                g12[0].setFloatValues(new float[]{(float) w1.j0(ExtendedFloatingActionButton.this), (float) this.f17055g.e()});
                b10.l("paddingStart", g12);
            }
            if (b10.j("paddingEnd")) {
                PropertyValuesHolder[] g13 = b10.g("paddingEnd");
                g13[0].setFloatValues(new float[]{(float) w1.i0(ExtendedFloatingActionButton.this), (float) this.f17055g.c()});
                b10.l("paddingEnd", g13);
            }
            if (b10.j("labelOpacity")) {
                PropertyValuesHolder[] g14 = b10.g("labelOpacity");
                boolean z10 = this.f17056h;
                float f10 = 0.0f;
                float f11 = z10 ? 0.0f : 1.0f;
                if (z10) {
                    f10 = 1.0f;
                }
                g14[0].setFloatValues(new float[]{f11, f10});
                b10.l("labelOpacity", g14);
            }
            return super.n(b10);
        }

        public void l(@o0 j jVar) {
            if (jVar != null) {
                if (this.f17056h) {
                    jVar.a(ExtendedFloatingActionButton.this);
                } else {
                    jVar.d(ExtendedFloatingActionButton.this);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            boolean unused = ExtendedFloatingActionButton.this.A0 = this.f17056h;
            boolean unused2 = ExtendedFloatingActionButton.this.B0 = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    public class i extends t9.b {

        /* renamed from: g  reason: collision with root package name */
        public boolean f17058g;

        public i(t9.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        public void a() {
            super.a();
            this.f17058g = true;
        }

        public int c() {
            return a.b.mtrl_extended_fab_hide_motion_spec;
        }

        public void d() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        public boolean f() {
            return ExtendedFloatingActionButton.this.I();
        }

        public void j() {
            super.j();
            int unused = ExtendedFloatingActionButton.this.f17032q0 = 0;
            if (!this.f17058g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        public void l(@o0 j jVar) {
            if (jVar != null) {
                jVar.b(ExtendedFloatingActionButton.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f17058g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f17032q0 = 1;
        }
    }

    public static abstract class j {
        public void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void b(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    public class k extends t9.b {
        public k(t9.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        public int c() {
            return a.b.mtrl_extended_fab_show_motion_spec;
        }

        public void d() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        public boolean f() {
            return ExtendedFloatingActionButton.this.J();
        }

        public void j() {
            super.j();
            int unused = ExtendedFloatingActionButton.this.f17032q0 = 0;
        }

        public void l(@o0 j jVar) {
            if (jVar != null) {
                jVar.c(ExtendedFloatingActionButton.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f17032q0 = 2;
        }
    }

    public interface l {
        int a();

        int b();

        int c();

        ViewGroup.LayoutParams d();

        int e();
    }

    static {
        Class<Float> cls = Float.class;
        I0 = new d(cls, "width");
        J0 = new e(cls, "height");
        K0 = new f(cls, "paddingStart");
        L0 = new g(cls, "paddingEnd");
    }

    public ExtendedFloatingActionButton(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public ExtendedFloatingActionButton(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.extendedFloatingActionButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedFloatingActionButton(@d.m0 android.content.Context r17, @d.o0 android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = E0
            r1 = r17
            android.content.Context r1 = ca.a.c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f17032q0 = r10
            t9.a r1 = new t9.a
            r1.<init>()
            r0.f17033r0 = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k
            r11.<init>(r1)
            r0.f17036u0 = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i
            r12.<init>(r1)
            r0.f17037v0 = r12
            r13 = 1
            r0.A0 = r13
            r0.B0 = r10
            r0.C0 = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.f17041z0 = r1
            int[] r3 = i9.a.o.ExtendedFloatingActionButton
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.n.j(r1, r2, r3, r4, r5, r6)
            int r2 = i9.a.o.ExtendedFloatingActionButton_showMotionSpec
            j9.h r2 = j9.h.c(r14, r1, r2)
            int r3 = i9.a.o.ExtendedFloatingActionButton_hideMotionSpec
            j9.h r3 = j9.h.c(r14, r1, r3)
            int r4 = i9.a.o.ExtendedFloatingActionButton_extendMotionSpec
            j9.h r4 = j9.h.c(r14, r1, r4)
            int r5 = i9.a.o.ExtendedFloatingActionButton_shrinkMotionSpec
            j9.h r5 = j9.h.c(r14, r1, r5)
            int r6 = i9.a.o.ExtendedFloatingActionButton_collapsedSize
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.f17038w0 = r6
            int r6 = f1.w1.j0(r16)
            r0.f17039x0 = r6
            int r6 = f1.w1.i0(r16)
            r0.f17040y0 = r6
            t9.a r6 = new t9.a
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.f17035t0 = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.f17034s0 = r10
            r11.i(r2)
            r12.i(r3)
            r15.i(r4)
            r10.i(r5)
            r1.recycle()
            z9.d r1 = z9.o.f24928m
            r2 = r18
            z9.o$b r1 = z9.o.g(r14, r2, r8, r9, r1)
            z9.o r1 = r1.m()
            r0.setShapeAppearanceModel(r1)
            r16.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void A(@m0 Animator.AnimatorListener animatorListener) {
        this.f17037v0.h(animatorListener);
    }

    public void B(@m0 Animator.AnimatorListener animatorListener) {
        this.f17036u0.h(animatorListener);
    }

    public void C(@m0 Animator.AnimatorListener animatorListener) {
        this.f17034s0.h(animatorListener);
    }

    public void D() {
        K(this.f17035t0, (j) null);
    }

    public void E(@m0 j jVar) {
        K(this.f17035t0, jVar);
    }

    public void F() {
        K(this.f17037v0, (j) null);
    }

    public void G(@m0 j jVar) {
        K(this.f17037v0, jVar);
    }

    public final boolean H() {
        return this.A0;
    }

    public final boolean I() {
        return getVisibility() == 0 ? this.f17032q0 == 1 : this.f17032q0 != 2;
    }

    public final boolean J() {
        return getVisibility() != 0 ? this.f17032q0 == 2 : this.f17032q0 != 1;
    }

    public final void K(@m0 b bVar, @o0 j jVar) {
        if (!bVar.f()) {
            if (!Q()) {
                bVar.d();
                bVar.l(jVar);
                return;
            }
            measure(0, 0);
            AnimatorSet k10 = bVar.k();
            k10.addListener(new c(bVar, jVar));
            for (Animator.AnimatorListener addListener : bVar.getListeners()) {
                k10.addListener(addListener);
            }
            k10.start();
        }
    }

    public void L(@m0 Animator.AnimatorListener animatorListener) {
        this.f17035t0.g(animatorListener);
    }

    public void M(@m0 Animator.AnimatorListener animatorListener) {
        this.f17037v0.g(animatorListener);
    }

    public void N(@m0 Animator.AnimatorListener animatorListener) {
        this.f17036u0.g(animatorListener);
    }

    public void O(@m0 Animator.AnimatorListener animatorListener) {
        this.f17034s0.g(animatorListener);
    }

    public final void P() {
        this.D0 = getTextColors();
    }

    public final boolean Q() {
        return (w1.T0(this) || (!J() && this.C0)) && !isInEditMode();
    }

    public void R() {
        K(this.f17036u0, (j) null);
    }

    public void S(@m0 j jVar) {
        K(this.f17036u0, jVar);
    }

    public void T() {
        K(this.f17034s0, (j) null);
    }

    public void U(@m0 j jVar) {
        K(this.f17034s0, jVar);
    }

    public void V(@m0 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @m0
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.f17041z0;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @g1
    public int getCollapsedSize() {
        int i10 = this.f17038w0;
        return i10 < 0 ? (Math.min(w1.j0(this), w1.i0(this)) * 2) + getIconSize() : i10;
    }

    @o0
    public j9.h getExtendMotionSpec() {
        return this.f17035t0.e();
    }

    @o0
    public j9.h getHideMotionSpec() {
        return this.f17037v0.e();
    }

    @o0
    public j9.h getShowMotionSpec() {
        return this.f17036u0.e();
    }

    @o0
    public j9.h getShrinkMotionSpec() {
        return this.f17034s0.e();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.A0 = false;
            this.f17034s0.d();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.C0 = z10;
    }

    public void setExtendMotionSpec(@o0 j9.h hVar) {
        this.f17035t0.i(hVar);
    }

    public void setExtendMotionSpecResource(@d.b int i10) {
        setExtendMotionSpec(j9.h.d(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.A0 != z10) {
            b bVar = z10 ? this.f17035t0 : this.f17034s0;
            if (!bVar.f()) {
                bVar.d();
            }
        }
    }

    public void setHideMotionSpec(@o0 j9.h hVar) {
        this.f17037v0.i(hVar);
    }

    public void setHideMotionSpecResource(@d.b int i10) {
        setHideMotionSpec(j9.h.d(getContext(), i10));
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (this.A0 && !this.B0) {
            this.f17039x0 = w1.j0(this);
            this.f17040y0 = w1.i0(this);
        }
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (this.A0 && !this.B0) {
            this.f17039x0 = i10;
            this.f17040y0 = i12;
        }
    }

    public void setShowMotionSpec(@o0 j9.h hVar) {
        this.f17036u0.i(hVar);
    }

    public void setShowMotionSpecResource(@d.b int i10) {
        setShowMotionSpec(j9.h.d(getContext(), i10));
    }

    public void setShrinkMotionSpec(@o0 j9.h hVar) {
        this.f17034s0.i(hVar);
    }

    public void setShrinkMotionSpecResource(@d.b int i10) {
        setShrinkMotionSpec(j9.h.d(getContext(), i10));
    }

    public void setTextColor(int i10) {
        super.setTextColor(i10);
        P();
    }

    public void setTextColor(@m0 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        P();
    }

    public void z(@m0 Animator.AnimatorListener animatorListener) {
        this.f17035t0.h(animatorListener);
    }
}

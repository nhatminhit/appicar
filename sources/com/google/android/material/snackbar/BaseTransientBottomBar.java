package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.a;
import d.b0;
import d.e0;
import d.h0;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import f1.e3;
import f1.p0;
import f1.w1;
import g1.z;
import i9.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final int A = 180;
    public static final int B = 150;
    public static final int C = 75;
    public static final float D = 0.8f;
    @m0
    public static final Handler E = new Handler(Looper.getMainLooper(), new j());
    public static final int F = 0;
    public static final int G = 1;
    public static final boolean H = false;
    public static final int[] I = {a.c.snackbarStyle};
    public static final String J = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: u  reason: collision with root package name */
    public static final int f17354u = 0;

    /* renamed from: v  reason: collision with root package name */
    public static final int f17355v = 1;

    /* renamed from: w  reason: collision with root package name */
    public static final int f17356w = -2;

    /* renamed from: x  reason: collision with root package name */
    public static final int f17357x = -1;

    /* renamed from: y  reason: collision with root package name */
    public static final int f17358y = 0;

    /* renamed from: z  reason: collision with root package name */
    public static final int f17359z = 250;
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f17360a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f17361b;
    @m0

    /* renamed from: c  reason: collision with root package name */
    public final SnackbarBaseLayout f17362c;
    @m0

    /* renamed from: d  reason: collision with root package name */
    public final aa.a f17363d;

    /* renamed from: e  reason: collision with root package name */
    public int f17364e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17365f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public View f17366g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17367h;

    /* renamed from: i  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f17368i;
    @t0(29)

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f17369j;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public Rect f17370k;

    /* renamed from: l  reason: collision with root package name */
    public int f17371l;

    /* renamed from: m  reason: collision with root package name */
    public int f17372m;

    /* renamed from: n  reason: collision with root package name */
    public int f17373n;

    /* renamed from: o  reason: collision with root package name */
    public int f17374o;

    /* renamed from: p  reason: collision with root package name */
    public int f17375p;

    /* renamed from: q  reason: collision with root package name */
    public List<t<B>> f17376q;

    /* renamed from: r  reason: collision with root package name */
    public Behavior f17377r;
    @o0

    /* renamed from: s  reason: collision with root package name */
    public final AccessibilityManager f17378s;
    @m0

    /* renamed from: t  reason: collision with root package name */
    public a.b f17379t;

    public static class Behavior extends SwipeDismissBehavior<View> {
        @m0

        /* renamed from: t  reason: collision with root package name */
        public final u f17380t = new u(this);

        public boolean G(View view) {
            return this.f17380t.a(view);
        }

        public final void V(@m0 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f17380t.c(baseTransientBottomBar);
        }

        public boolean l(@m0 CoordinatorLayout coordinatorLayout, @m0 View view, @m0 MotionEvent motionEvent) {
            this.f17380t.b(coordinatorLayout, view, motionEvent);
            return super.l(coordinatorLayout, view, motionEvent);
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    public static class SnackbarBaseLayout extends FrameLayout {
        public static final View.OnTouchListener V = new a();
        public y O;
        public x P;
        public int Q;
        public final float R;
        public final float S;
        public ColorStateList T;
        public PorterDuff.Mode U;

        public static class a implements View.OnTouchListener {
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(@m0 Context context) {
            this(context, (AttributeSet) null);
        }

        public SnackbarBaseLayout(@m0 Context context, AttributeSet attributeSet) {
            super(ca.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a.o.SnackbarLayout);
            int i10 = a.o.SnackbarLayout_elevation;
            if (obtainStyledAttributes.hasValue(i10)) {
                w1.L1(this, (float) obtainStyledAttributes.getDimensionPixelSize(i10, 0));
            }
            this.Q = obtainStyledAttributes.getInt(a.o.SnackbarLayout_animationMode, 0);
            this.R = obtainStyledAttributes.getFloat(a.o.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(w9.c.a(context2, obtainStyledAttributes, a.o.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(com.google.android.material.internal.v.k(obtainStyledAttributes.getInt(a.o.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.S = obtainStyledAttributes.getFloat(a.o.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(V);
            setFocusable(true);
            if (getBackground() == null) {
                w1.G1(this, a());
            }
        }

        @m0
        public final Drawable a() {
            float dimension = getResources().getDimension(a.f.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(o9.a.i(this, a.c.colorSurface, a.c.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.T == null) {
                return o0.d.r(gradientDrawable);
            }
            Drawable r10 = o0.d.r(gradientDrawable);
            o0.d.o(r10, this.T);
            return r10;
        }

        public float getActionTextColorAlpha() {
            return this.S;
        }

        public int getAnimationMode() {
            return this.Q;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.R;
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            x xVar = this.P;
            if (xVar != null) {
                xVar.onViewAttachedToWindow(this);
            }
            w1.t1(this);
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            x xVar = this.P;
            if (xVar != null) {
                xVar.onViewDetachedFromWindow(this);
            }
        }

        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            y yVar = this.O;
            if (yVar != null) {
                yVar.a(this, i10, i11, i12, i13);
            }
        }

        public void setAnimationMode(int i10) {
            this.Q = i10;
        }

        public void setBackground(@o0 Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(@o0 Drawable drawable) {
            if (!(drawable == null || this.T == null)) {
                drawable = o0.d.r(drawable.mutate());
                o0.d.o(drawable, this.T);
                o0.d.p(drawable, this.U);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(@o0 ColorStateList colorStateList) {
            this.T = colorStateList;
            if (getBackground() != null) {
                Drawable r10 = o0.d.r(getBackground().mutate());
                o0.d.o(r10, colorStateList);
                o0.d.p(r10, this.U);
                if (r10 != getBackground()) {
                    super.setBackgroundDrawable(r10);
                }
            }
        }

        public void setBackgroundTintMode(@o0 PorterDuff.Mode mode) {
            this.U = mode;
            if (getBackground() != null) {
                Drawable r10 = o0.d.r(getBackground().mutate());
                o0.d.p(r10, mode);
                if (r10 != getBackground()) {
                    super.setBackgroundDrawable(r10);
                }
            }
        }

        public void setOnAttachStateChangeListener(x xVar) {
            this.P = xVar;
        }

        public void setOnClickListener(@o0 View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : V);
            super.setOnClickListener(onClickListener);
        }

        public void setOnLayoutChangeListener(y yVar) {
            this.O = yVar;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.f17362c;
            if (snackbarBaseLayout != null) {
                if (snackbarBaseLayout.getParent() != null) {
                    BaseTransientBottomBar.this.f17362c.setVisibility(0);
                }
                if (BaseTransientBottomBar.this.f17362c.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.i0();
                } else {
                    BaseTransientBottomBar.this.k0();
                }
            }
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.T();
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17382a;

        public c(int i10) {
            this.f17382a = i10;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S(this.f17382a);
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f17362c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f17362c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f17362c.setScaleY(floatValue);
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.T();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f17363d.a(70, 180);
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public int f17387a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f17388b;

        public g(int i10) {
            this.f17388b = i10;
            this.f17387a = i10;
        }

        public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.H) {
                w1.d1(BaseTransientBottomBar.this.f17362c, intValue - this.f17387a);
            } else {
                BaseTransientBottomBar.this.f17362c.setTranslationY((float) intValue);
            }
            this.f17387a = intValue;
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17390a;

        public h(int i10) {
            this.f17390a = i10;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S(this.f17390a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f17363d.b(0, 180);
        }
    }

    public class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public int f17392a = 0;

        public i() {
        }

        public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.H) {
                w1.d1(BaseTransientBottomBar.this.f17362c, intValue - this.f17392a);
            } else {
                BaseTransientBottomBar.this.f17362c.setTranslationY((float) intValue);
            }
            this.f17392a = intValue;
        }
    }

    public static class j implements Handler.Callback {
        public boolean handleMessage(@m0 Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).g0();
                return true;
            } else if (i10 != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).M(message.arg1);
                return true;
            }
        }
    }

    public class k implements ViewTreeObserver.OnGlobalLayoutListener {
        public k() {
        }

        public void onGlobalLayout() {
            if (BaseTransientBottomBar.this.f17367h) {
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                int unused = baseTransientBottomBar.f17375p = baseTransientBottomBar.v();
                BaseTransientBottomBar.this.m0();
            }
        }
    }

    public class l implements Runnable {
        public l() {
        }

        public void run() {
            int m10;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f17362c != null && baseTransientBottomBar.f17361b != null && (m10 = (BaseTransientBottomBar.this.G() - BaseTransientBottomBar.this.K()) + ((int) BaseTransientBottomBar.this.f17362c.getTranslationY())) < BaseTransientBottomBar.this.f17374o) {
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f17362c.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    String unused = BaseTransientBottomBar.J;
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f17374o - m10;
                BaseTransientBottomBar.this.f17362c.requestLayout();
            }
        }
    }

    public class m implements p0 {
        public m() {
        }

        @m0
        public e3 a(View view, @m0 e3 e3Var) {
            int unused = BaseTransientBottomBar.this.f17371l = e3Var.o();
            int unused2 = BaseTransientBottomBar.this.f17372m = e3Var.p();
            int unused3 = BaseTransientBottomBar.this.f17373n = e3Var.q();
            BaseTransientBottomBar.this.m0();
            return e3Var;
        }
    }

    public class n extends f1.a {
        public n() {
        }

        public void g(View view, @m0 z zVar) {
            super.g(view, zVar);
            zVar.a(1048576);
            zVar.b1(true);
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.j(view, i10, bundle);
            }
            BaseTransientBottomBar.this.w();
            return true;
        }
    }

    public class o implements a.b {
        public o() {
        }

        public void a() {
            Handler handler = BaseTransientBottomBar.E;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        public void b(int i10) {
            Handler handler = BaseTransientBottomBar.E;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }
    }

    public class p implements x {

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                BaseTransientBottomBar.this.S(3);
            }
        }

        public p() {
        }

        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.f17362c.getRootWindowInsets()) != null) {
                int unused = BaseTransientBottomBar.this.f17374o = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                BaseTransientBottomBar.this.m0();
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.Q()) {
                BaseTransientBottomBar.E.post(new a());
            }
        }
    }

    public class q implements y {
        public q() {
        }

        public void a(View view, int i10, int i11, int i12, int i13) {
            BaseTransientBottomBar.this.f17362c.setOnLayoutChangeListener((y) null);
            BaseTransientBottomBar.this.h0();
        }
    }

    public class r implements SwipeDismissBehavior.c {
        public r() {
        }

        public void a(@m0 View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.x(0);
        }

        public void b(int i10) {
            if (i10 == 0) {
                a.c().l(BaseTransientBottomBar.this.f17379t);
            } else if (i10 == 1 || i10 == 2) {
                a.c().k(BaseTransientBottomBar.this.f17379t);
            }
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface s {
    }

    public static abstract class t<B> {

        /* renamed from: a  reason: collision with root package name */
        public static final int f17400a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final int f17401b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static final int f17402c = 2;

        /* renamed from: d  reason: collision with root package name */
        public static final int f17403d = 3;

        /* renamed from: e  reason: collision with root package name */
        public static final int f17404e = 4;

        @x0({x0.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public void a(B b10, int i10) {
        }

        public void b(B b10) {
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    public static class u {

        /* renamed from: a  reason: collision with root package name */
        public a.b f17405a;

        public u(@m0 SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.R(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.S(0);
        }

        public boolean a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        public void b(@m0 CoordinatorLayout coordinatorLayout, @m0 View view, @m0 MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    a.c().l(this.f17405a);
                }
            } else if (coordinatorLayout.G(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                a.c().k(this.f17405a);
            }
        }

        public void c(@m0 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f17405a = baseTransientBottomBar.f17379t;
        }
    }

    @Deprecated
    public interface v extends aa.a {
    }

    @e0(from = 1)
    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface w {
    }

    @x0({x0.a.LIBRARY_GROUP})
    public interface x {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    @x0({x0.a.LIBRARY_GROUP})
    public interface y {
        void a(View view, int i10, int i11, int i12, int i13);
    }

    public BaseTransientBottomBar(@m0 Context context, @m0 ViewGroup viewGroup, @m0 View view, @m0 aa.a aVar) {
        this.f17367h = false;
        this.f17368i = new k();
        this.f17369j = new l();
        this.f17379t = new o();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f17360a = viewGroup;
            this.f17363d = aVar;
            this.f17361b = context;
            com.google.android.material.internal.n.a(context);
            SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(H(), viewGroup, false);
            this.f17362c = snackbarBaseLayout;
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).c(snackbarBaseLayout.getActionTextColorAlpha());
            }
            snackbarBaseLayout.addView(view);
            ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f17370k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            w1.B1(snackbarBaseLayout, 1);
            w1.P1(snackbarBaseLayout, 1);
            w1.M1(snackbarBaseLayout, true);
            w1.Y1(snackbarBaseLayout, new m());
            w1.z1(snackbarBaseLayout, new n());
            this.f17378s = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public BaseTransientBottomBar(@m0 ViewGroup viewGroup, @m0 View view, @m0 aa.a aVar) {
        this(viewGroup.getContext(), viewGroup, view, aVar);
    }

    public int A() {
        return this.f17362c.getAnimationMode();
    }

    public Behavior B() {
        return this.f17377r;
    }

    @m0
    public Context C() {
        return this.f17361b;
    }

    public int D() {
        return this.f17364e;
    }

    @m0
    public SwipeDismissBehavior<? extends View> E() {
        return new Behavior();
    }

    public final ValueAnimator F(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(j9.a.f19831d);
        ofFloat.addUpdateListener(new e());
        return ofFloat;
    }

    @t0(17)
    public final int G() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f17361b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    @h0
    public int H() {
        return L() ? a.k.mtrl_layout_snackbar : a.k.design_layout_snackbar;
    }

    public final int I() {
        int height = this.f17362c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f17362c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    @m0
    public View J() {
        return this.f17362c;
    }

    public final int K() {
        int[] iArr = new int[2];
        this.f17362c.getLocationOnScreen(iArr);
        return iArr[1] + this.f17362c.getHeight();
    }

    public boolean L() {
        TypedArray obtainStyledAttributes = this.f17361b.obtainStyledAttributes(I);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public final void M(int i10) {
        if (!d0() || this.f17362c.getVisibility() != 0) {
            S(i10);
        } else {
            u(i10);
        }
    }

    public boolean N() {
        return this.f17367h;
    }

    public boolean O() {
        return this.f17365f;
    }

    public boolean P() {
        return a.c().e(this.f17379t);
    }

    public boolean Q() {
        return a.c().f(this.f17379t);
    }

    public final boolean R() {
        ViewGroup.LayoutParams layoutParams = this.f17362c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.g) && (((CoordinatorLayout.g) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    public void S(int i10) {
        a.c().i(this.f17379t);
        List<t<B>> list = this.f17376q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f17376q.get(size).a(this, i10);
            }
        }
        ViewParent parent = this.f17362c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f17362c);
        }
    }

    public void T() {
        a.c().j(this.f17379t);
        List<t<B>> list = this.f17376q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f17376q.get(size).b(this);
            }
        }
    }

    @m0
    public B U(@o0 t<B> tVar) {
        List<t<B>> list;
        if (tVar == null || (list = this.f17376q) == null) {
            return this;
        }
        list.remove(tVar);
        return this;
    }

    @m0
    public B V(@b0 int i10) {
        View findViewById = this.f17360a.findViewById(i10);
        if (findViewById != null) {
            return W(findViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i10);
    }

    @m0
    public B W(@o0 View view) {
        com.google.android.material.internal.v.l(this.f17366g, this.f17368i);
        this.f17366g = view;
        com.google.android.material.internal.v.a(view, this.f17368i);
        return this;
    }

    public void X(boolean z10) {
        this.f17367h = z10;
    }

    @m0
    public B Y(int i10) {
        this.f17362c.setAnimationMode(i10);
        return this;
    }

    @m0
    public B Z(Behavior behavior) {
        this.f17377r = behavior;
        return this;
    }

    @m0
    public B a0(int i10) {
        this.f17364e = i10;
        return this;
    }

    @m0
    public B b0(boolean z10) {
        this.f17365f = z10;
        return this;
    }

    public final void c0(CoordinatorLayout.g gVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f17377r;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = E();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).V(this);
        }
        swipeDismissBehavior.P(new r());
        gVar.q(swipeDismissBehavior);
        if (this.f17366g == null) {
            gVar.f2158g = 80;
        }
    }

    public boolean d0() {
        AccessibilityManager accessibilityManager = this.f17378s;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final boolean e0() {
        return this.f17374o > 0 && !this.f17365f && R();
    }

    public void f0() {
        a.c().n(D(), this.f17379t);
    }

    public final void g0() {
        this.f17362c.setOnAttachStateChangeListener(new p());
        if (this.f17362c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f17362c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                c0((CoordinatorLayout.g) layoutParams);
            }
            this.f17375p = v();
            m0();
            this.f17362c.setVisibility(4);
            this.f17360a.addView(this.f17362c);
        }
        if (w1.T0(this.f17362c)) {
            h0();
        } else {
            this.f17362c.setOnLayoutChangeListener(new q());
        }
    }

    public final void h0() {
        if (d0()) {
            t();
            return;
        }
        if (this.f17362c.getParent() != null) {
            this.f17362c.setVisibility(0);
        }
        T();
    }

    public final void i0() {
        ValueAnimator y10 = y(0.0f, 1.0f);
        ValueAnimator F2 = F(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{y10, F2});
        animatorSet.setDuration(150);
        animatorSet.addListener(new b());
        animatorSet.start();
    }

    public final void j0(int i10) {
        ValueAnimator y10 = y(1.0f, 0.0f);
        y10.setDuration(75);
        y10.addListener(new c(i10));
        y10.start();
    }

    public final void k0() {
        int I2 = I();
        if (H) {
            w1.d1(this.f17362c, I2);
        } else {
            this.f17362c.setTranslationY((float) I2);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{I2, 0});
        valueAnimator.setInterpolator(j9.a.f19829b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new f());
        valueAnimator.addUpdateListener(new g(I2));
        valueAnimator.start();
    }

    public final void l0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, I()});
        valueAnimator.setInterpolator(j9.a.f19829b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new h(i10));
        valueAnimator.addUpdateListener(new i());
        valueAnimator.start();
    }

    public final void m0() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.f17362c.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (rect = this.f17370k) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = rect.bottom + (this.f17366g != null ? this.f17375p : this.f17371l);
            marginLayoutParams.leftMargin = rect.left + this.f17372m;
            marginLayoutParams.rightMargin = rect.right + this.f17373n;
            this.f17362c.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && e0()) {
                this.f17362c.removeCallbacks(this.f17369j);
                this.f17362c.post(this.f17369j);
            }
        }
    }

    @m0
    public B s(@o0 t<B> tVar) {
        if (tVar == null) {
            return this;
        }
        if (this.f17376q == null) {
            this.f17376q = new ArrayList();
        }
        this.f17376q.add(tVar);
        return this;
    }

    public void t() {
        this.f17362c.post(new a());
    }

    public final void u(int i10) {
        if (this.f17362c.getAnimationMode() == 1) {
            j0(i10);
        } else {
            l0(i10);
        }
    }

    public final int v() {
        View view = this.f17366g;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f17360a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f17360a.getHeight()) - i10;
    }

    public void w() {
        x(3);
    }

    public void x(int i10) {
        a.c().b(this.f17379t, i10);
    }

    public final ValueAnimator y(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(j9.a.f19828a);
        ofFloat.addUpdateListener(new d());
        return ofFloat;
    }

    @o0
    public View z() {
        return this.f17366g;
    }
}

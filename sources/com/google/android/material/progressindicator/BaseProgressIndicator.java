package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.google.android.material.internal.n;
import d.b1;
import d.g1;
import d.l;
import d.m0;
import d.o0;
import d.r0;
import d.x0;
import f1.w1;
import i9.a;
import j3.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import v9.b;
import v9.g;
import v9.h;
import v9.j;

public abstract class BaseProgressIndicator<S extends v9.b> extends ProgressBar {

    /* renamed from: f0  reason: collision with root package name */
    public static final int f17280f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f17281g0 = 1;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f17282h0 = 2;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f17283i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f17284j0 = 1;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f17285k0 = 2;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f17286l0 = a.n.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: m0  reason: collision with root package name */
    public static final float f17287m0 = 0.2f;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f17288n0 = 255;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f17289o0 = 1000;
    public S O;
    public int P;
    public boolean Q;
    public boolean R;
    public final int S;
    public final int T;
    public long U = -1;
    public v9.a V;
    public boolean W = false;

    /* renamed from: a0  reason: collision with root package name */
    public int f17290a0 = 4;

    /* renamed from: b0  reason: collision with root package name */
    public final Runnable f17291b0 = new a();

    /* renamed from: c0  reason: collision with root package name */
    public final Runnable f17292c0 = new b();

    /* renamed from: d0  reason: collision with root package name */
    public final b.a f17293d0 = new c();

    /* renamed from: e0  reason: collision with root package name */
    public final b.a f17294e0 = new d();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            BaseProgressIndicator.this.l();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            BaseProgressIndicator.this.k();
            long unused = BaseProgressIndicator.this.U = -1;
        }
    }

    public class c extends b.a {
        public c() {
        }

        public void b(Drawable drawable) {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator.this.p(0, false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.p(baseProgressIndicator.P, BaseProgressIndicator.this.Q);
        }
    }

    public class d extends b.a {
        public d() {
        }

        public void b(Drawable drawable) {
            super.b(drawable);
            if (!BaseProgressIndicator.this.W) {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setVisibility(baseProgressIndicator.f17290a0);
            }
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    public BaseProgressIndicator(@m0 Context context, @o0 AttributeSet attributeSet, @d.f int i10, @b1 int i11) {
        super(ca.a.c(context, attributeSet, i10, f17286l0), attributeSet, i10);
        Context context2 = getContext();
        this.O = i(context2, attributeSet);
        TypedArray j10 = n.j(context2, attributeSet, a.o.BaseProgressIndicator, i10, i11, new int[0]);
        this.S = j10.getInt(a.o.BaseProgressIndicator_showDelay, -1);
        this.T = Math.min(j10.getInt(a.o.BaseProgressIndicator_minHideDelay, -1), 1000);
        j10.recycle();
        this.V = new v9.a();
        this.R = true;
    }

    @o0
    private h<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().z();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().A();
        }
    }

    @o0
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.O.f23433f;
    }

    @o0
    public j<S> getIndeterminateDrawable() {
        return (j) super.getIndeterminateDrawable();
    }

    @m0
    public int[] getIndicatorColor() {
        return this.O.f23430c;
    }

    @o0
    public v9.f<S> getProgressDrawable() {
        return (v9.f) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.O.f23432e;
    }

    @l
    public int getTrackColor() {
        return this.O.f23431d;
    }

    @r0
    public int getTrackCornerRadius() {
        return this.O.f23429b;
    }

    @r0
    public int getTrackThickness() {
        return this.O.f23428a;
    }

    public void h(boolean z10) {
        if (this.R) {
            ((g) getCurrentDrawable()).u(s(), false, z10);
        }
    }

    public abstract S i(@m0 Context context, @m0 AttributeSet attributeSet);

    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public void j() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f17291b0);
            return;
        }
        removeCallbacks(this.f17292c0);
        long uptimeMillis = SystemClock.uptimeMillis() - this.U;
        int i10 = this.T;
        if (uptimeMillis >= ((long) i10)) {
            this.f17292c0.run();
        } else {
            postDelayed(this.f17292c0, ((long) i10) - uptimeMillis);
        }
    }

    public final void k() {
        ((g) getCurrentDrawable()).u(false, false, true);
        if (n()) {
            setVisibility(4);
        }
    }

    public final void l() {
        if (this.T > 0) {
            this.U = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public boolean m() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public final boolean n() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    public final void o() {
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().y().d(this.f17293d0);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().b(this.f17294e0);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b(this.f17294e0);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o();
        if (s()) {
            l();
        }
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f17292c0);
        removeCallbacks(this.f17291b0);
        ((g) getCurrentDrawable()).k();
        r();
        super.onDetachedFromWindow();
    }

    public synchronized void onDraw(@m0 Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    public synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        h currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            int e10 = currentDrawingDelegate.e();
            int d10 = currentDrawingDelegate.d();
            setMeasuredDimension(e10 < 0 ? getMeasuredWidth() : e10 + getPaddingLeft() + getPaddingRight(), d10 < 0 ? getMeasuredHeight() : d10 + getPaddingTop() + getPaddingBottom());
        }
    }

    public void onVisibilityChanged(@m0 View view, int i10) {
        super.onVisibilityChanged(view, i10);
        h(i10 == 0);
    }

    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        h(false);
    }

    public void p(int i10, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() != null && !z10) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.P = i10;
            this.Q = z10;
            this.W = true;
            if (!getIndeterminateDrawable().isVisible() || this.V.a(getContext().getContentResolver()) == 0.0f) {
                this.f17293d0.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().y().f();
            }
        }
    }

    public void q() {
        if (this.S > 0) {
            removeCallbacks(this.f17291b0);
            postDelayed(this.f17291b0, (long) this.S);
            return;
        }
        this.f17291b0.run();
    }

    public final void r() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c(this.f17294e0);
            getIndeterminateDrawable().y().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().c(this.f17294e0);
        }
    }

    public boolean s() {
        return w1.N0(this) && getWindowVisibility() == 0 && m();
    }

    @x0({x0.a.LIBRARY_GROUP})
    @g1
    public void setAnimatorDurationScaleProvider(@m0 v9.a aVar) {
        this.V = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().Q = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().Q = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.O.f23433f = i10;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z10) {
        if (z10 != isIndeterminate()) {
            if (s()) {
                if (z10) {
                    throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
                }
            }
            g gVar = (g) getCurrentDrawable();
            if (gVar != null) {
                gVar.k();
            }
            super.setIndeterminate(z10);
            g gVar2 = (g) getCurrentDrawable();
            if (gVar2 != null) {
                gVar2.u(s(), false, false);
            }
            this.W = false;
        }
    }

    public void setIndeterminateDrawable(@o0 Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof j) {
            ((g) drawable).k();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(@l int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{o9.a.b(getContext(), a.c.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.O.f23430c = iArr;
            getIndeterminateDrawable().y().c();
            invalidate();
        }
    }

    public synchronized void setProgress(int i10) {
        if (!isIndeterminate()) {
            p(i10, false);
        }
    }

    public void setProgressDrawable(@o0 Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof v9.f) {
            v9.f fVar = (v9.f) drawable;
            fVar.k();
            super.setProgressDrawable(fVar);
            fVar.E(((float) getProgress()) / ((float) getMax()));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.O.f23432e = i10;
        invalidate();
    }

    public void setTrackColor(@l int i10) {
        S s10 = this.O;
        if (s10.f23431d != i10) {
            s10.f23431d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@r0 int i10) {
        S s10 = this.O;
        if (s10.f23429b != i10) {
            s10.f23429b = Math.min(i10, s10.f23428a / 2);
        }
    }

    public void setTrackThickness(@r0 int i10) {
        S s10 = this.O;
        if (s10.f23428a != i10) {
            s10.f23428a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 == 0 || i10 == 4 || i10 == 8) {
            this.f17290a0 = i10;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }
}

package v9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import d.g1;
import d.m0;
import d.o0;
import d.v;
import j3.b;
import java.util.ArrayList;
import java.util.List;

public abstract class g extends Drawable implements j3.b {

    /* renamed from: c0  reason: collision with root package name */
    public static final boolean f23473c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f23474d0 = 500;

    /* renamed from: e0  reason: collision with root package name */
    public static final Property<g, Float> f23475e0 = new c(Float.class, "growFraction");
    public final Context O;
    public final b P;
    public a Q;
    public ValueAnimator R;
    public ValueAnimator S;
    public boolean T;
    public boolean U;
    public float V;
    public List<b.a> W;
    public b.a X;
    public boolean Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Paint f23476a0 = new Paint();

    /* renamed from: b0  reason: collision with root package name */
    public int f23477b0;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            g.this.g();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            boolean unused = g.super.setVisible(false, false);
            g.this.f();
        }
    }

    public static class c extends Property<g, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(g gVar) {
            return Float.valueOf(gVar.i());
        }

        /* renamed from: b */
        public void set(g gVar, Float f10) {
            gVar.o(f10.floatValue());
        }
    }

    public g(@m0 Context context, @m0 b bVar) {
        this.O = context;
        this.P = bVar;
        this.Q = new a();
        setAlpha(255);
    }

    public void b(@m0 b.a aVar) {
        if (this.W == null) {
            this.W = new ArrayList();
        }
        if (!this.W.contains(aVar)) {
            this.W.add(aVar);
        }
    }

    public boolean c(@m0 b.a aVar) {
        List<b.a> list = this.W;
        if (list == null || !list.contains(aVar)) {
            return false;
        }
        this.W.remove(aVar);
        if (!this.W.isEmpty()) {
            return true;
        }
        this.W = null;
        return true;
    }

    public void clearAnimationCallbacks() {
        this.W.clear();
        this.W = null;
    }

    public final void f() {
        b.a aVar = this.X;
        if (aVar != null) {
            aVar.b(this);
        }
        List<b.a> list = this.W;
        if (list != null && !this.Y) {
            for (b.a b10 : list) {
                b10.b(this);
            }
        }
    }

    public final void g() {
        b.a aVar = this.X;
        if (aVar != null) {
            aVar.c(this);
        }
        List<b.a> list = this.W;
        if (list != null && !this.Y) {
            for (b.a c10 : list) {
                c10.c(this);
            }
        }
    }

    public int getAlpha() {
        return this.f23477b0;
    }

    public int getOpacity() {
        return -3;
    }

    public final void h(@m0 ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.Y;
        this.Y = true;
        for (ValueAnimator end : valueAnimatorArr) {
            end.end();
        }
        this.Y = z10;
    }

    public float i() {
        if (this.P.b() || this.P.a()) {
            return (this.U || this.T) ? this.V : this.Z;
        }
        return 1.0f;
    }

    public boolean isRunning() {
        return m() || l();
    }

    @m0
    public ValueAnimator j() {
        return this.S;
    }

    public boolean k() {
        return u(false, false, false);
    }

    public boolean l() {
        ValueAnimator valueAnimator = this.S;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.U;
    }

    public boolean m() {
        ValueAnimator valueAnimator = this.R;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.T;
    }

    public final void n() {
        if (this.R == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f23475e0, new float[]{0.0f, 1.0f});
            this.R = ofFloat;
            ofFloat.setDuration(500);
            this.R.setInterpolator(j9.a.f19829b);
            t(this.R);
        }
        if (this.S == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f23475e0, new float[]{1.0f, 0.0f});
            this.S = ofFloat2;
            ofFloat2.setDuration(500);
            this.S.setInterpolator(j9.a.f19829b);
            p(this.S);
        }
    }

    public void o(@v(from = 0.0d, to = 1.0d) float f10) {
        if (this.Z != f10) {
            this.Z = f10;
            invalidateSelf();
        }
    }

    public final void p(@m0 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.S;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.S = valueAnimator;
            valueAnimator.addListener(new b());
            return;
        }
        throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
    }

    public void q(@m0 b.a aVar) {
        this.X = aVar;
    }

    @g1
    public void r(boolean z10, @v(from = 0.0d, to = 1.0d) float f10) {
        this.U = z10;
        this.V = f10;
    }

    @g1
    public void s(boolean z10, @v(from = 0.0d, to = 1.0d) float f10) {
        this.T = z10;
        this.V = f10;
    }

    public void setAlpha(int i10) {
        this.f23477b0 = i10;
        invalidateSelf();
    }

    public void setColorFilter(@o0 ColorFilter colorFilter) {
        this.f23476a0.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public boolean setVisible(boolean z10, boolean z11) {
        return u(z10, z11, true);
    }

    public void start() {
        v(true, true, false);
    }

    public void stop() {
        v(false, true, false);
    }

    public final void t(@m0 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.R;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.R = valueAnimator;
            valueAnimator.addListener(new a());
            return;
        }
        throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
    }

    public boolean u(boolean z10, boolean z11, boolean z12) {
        return v(z10, z11, z12 && this.Q.a(this.O.getContentResolver()) > 0.0f);
    }

    public boolean v(boolean z10, boolean z11, boolean z12) {
        n();
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator = z10 ? this.R : this.S;
        if (!z12) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                h(valueAnimator);
            }
            return super.setVisible(z10, false);
        } else if (z12 && valueAnimator.isRunning()) {
            return false;
        } else {
            boolean z13 = !z10 || super.setVisible(z10, false);
            if (!(z10 ? this.P.b() : this.P.a())) {
                h(valueAnimator);
                return z13;
            }
            if (z11 || !valueAnimator.isPaused()) {
                valueAnimator.start();
            } else {
                valueAnimator.resume();
            }
            return z13;
        }
    }
}

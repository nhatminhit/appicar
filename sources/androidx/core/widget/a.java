package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import d.m0;
import f1.w1;

public abstract class a implements View.OnTouchListener {

    /* renamed from: f0  reason: collision with root package name */
    public static final float f2252f0 = 0.0f;

    /* renamed from: g0  reason: collision with root package name */
    public static final float f2253g0 = Float.MAX_VALUE;

    /* renamed from: h0  reason: collision with root package name */
    public static final float f2254h0 = 0.0f;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f2255i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f2256j0 = 1;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f2257k0 = 2;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f2258l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f2259m0 = 1;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f2260n0 = 1;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f2261o0 = 315;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f2262p0 = 1575;

    /* renamed from: q0  reason: collision with root package name */
    public static final float f2263q0 = Float.MAX_VALUE;

    /* renamed from: r0  reason: collision with root package name */
    public static final float f2264r0 = 0.2f;

    /* renamed from: s0  reason: collision with root package name */
    public static final float f2265s0 = 1.0f;

    /* renamed from: t0  reason: collision with root package name */
    public static final int f2266t0 = ViewConfiguration.getTapTimeout();

    /* renamed from: u0  reason: collision with root package name */
    public static final int f2267u0 = 500;

    /* renamed from: v0  reason: collision with root package name */
    public static final int f2268v0 = 500;
    public final C0032a O = new C0032a();
    public final Interpolator P = new AccelerateInterpolator();
    public final View Q;
    public Runnable R;
    public float[] S = {0.0f, 0.0f};
    public float[] T = {Float.MAX_VALUE, Float.MAX_VALUE};
    public int U;
    public int V;
    public float[] W = {0.0f, 0.0f};
    public float[] X = {0.0f, 0.0f};
    public float[] Y = {Float.MAX_VALUE, Float.MAX_VALUE};
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f2269a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f2270b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2271c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f2272d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f2273e0;

    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    public static class C0032a {

        /* renamed from: a  reason: collision with root package name */
        public int f2274a;

        /* renamed from: b  reason: collision with root package name */
        public int f2275b;

        /* renamed from: c  reason: collision with root package name */
        public float f2276c;

        /* renamed from: d  reason: collision with root package name */
        public float f2277d;

        /* renamed from: e  reason: collision with root package name */
        public long f2278e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f2279f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f2280g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f2281h = 0;

        /* renamed from: i  reason: collision with root package name */
        public long f2282i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f2283j;

        /* renamed from: k  reason: collision with root package name */
        public int f2284k;

        public void a() {
            if (this.f2279f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g10 = g(e(currentAnimationTimeMillis));
                this.f2279f = currentAnimationTimeMillis;
                float f10 = ((float) (currentAnimationTimeMillis - this.f2279f)) * g10;
                this.f2280g = (int) (this.f2276c * f10);
                this.f2281h = (int) (f10 * this.f2277d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f2280g;
        }

        public int c() {
            return this.f2281h;
        }

        public int d() {
            float f10 = this.f2276c;
            return (int) (f10 / Math.abs(f10));
        }

        public final float e(long j10) {
            long j11 = this.f2278e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f2282i;
            if (j12 < 0 || j10 < j12) {
                return a.e(((float) (j10 - j11)) / ((float) this.f2274a), 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f2283j;
            return (1.0f - f10) + (f10 * a.e(((float) (j10 - j12)) / ((float) this.f2284k), 0.0f, 1.0f));
        }

        public int f() {
            float f10 = this.f2277d;
            return (int) (f10 / Math.abs(f10));
        }

        public final float g(float f10) {
            return (-4.0f * f10 * f10) + (f10 * 4.0f);
        }

        public boolean h() {
            return this.f2282i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2282i + ((long) this.f2284k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2284k = a.f((int) (currentAnimationTimeMillis - this.f2278e), 0, this.f2275b);
            this.f2283j = e(currentAnimationTimeMillis);
            this.f2282i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f2275b = i10;
        }

        public void k(int i10) {
            this.f2274a = i10;
        }

        public void l(float f10, float f11) {
            this.f2276c = f10;
            this.f2277d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2278e = currentAnimationTimeMillis;
            this.f2282i = -1;
            this.f2279f = currentAnimationTimeMillis;
            this.f2283j = 0.5f;
            this.f2280g = 0;
            this.f2281h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.f2271c0) {
                if (aVar.f2269a0) {
                    aVar.f2269a0 = false;
                    aVar.O.m();
                }
                C0032a aVar2 = a.this.O;
                if (aVar2.h() || !a.this.x()) {
                    a.this.f2271c0 = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.f2270b0) {
                    aVar3.f2270b0 = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.l(aVar2.b(), aVar2.c());
                w1.n1(a.this.Q, this);
            }
        }
    }

    public a(@m0 View view) {
        this.Q = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (float) ((int) ((1575.0f * f10) + 0.5f));
        r(f11, f11);
        float f12 = (float) ((int) ((f10 * 315.0f) + 0.5f));
        s(f12, f12);
        n(1);
        q(Float.MAX_VALUE, Float.MAX_VALUE);
        v(0.2f, 0.2f);
        w(1.0f, 1.0f);
        m(f2266t0);
        u(500);
        t(500);
    }

    public static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    public static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.Q.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.S[i10], f11, this.T[i10], f10);
        int i11 = (h10 > 0.0f ? 1 : (h10 == 0.0f ? 0 : -1));
        if (i11 == 0) {
            return 0.0f;
        }
        float f13 = this.W[i10];
        float f14 = this.X[i10];
        float f15 = this.Y[i10];
        float f16 = f13 * f12;
        return i11 > 0 ? e(h10 * f16, f14, f15) : -e((-h10) * f16, f14, f15);
    }

    public final float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.U;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                return f10 >= 0.0f ? 1.0f - (f10 / f11) : (!this.f2271c0 || i10 != 1) ? 0.0f : 1.0f;
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
    }

    public final float h(float f10, float f11, float f12, float f13) {
        float f14;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            f14 = -this.P.getInterpolation(-g10);
        } else if (g10 <= 0.0f) {
            return 0.0f;
        } else {
            f14 = this.P.getInterpolation(g10);
        }
        return e(f14, -1.0f, 1.0f);
    }

    public boolean i() {
        return this.f2272d0;
    }

    public boolean j() {
        return this.f2273e0;
    }

    public final void k() {
        if (this.f2269a0) {
            this.f2271c0 = false;
        } else {
            this.O.i();
        }
    }

    public abstract void l(int i10, int i11);

    @m0
    public a m(int i10) {
        this.V = i10;
        return this;
    }

    @m0
    public a n(int i10) {
        this.U = i10;
        return this;
    }

    public a o(boolean z10) {
        if (this.f2272d0 && !z10) {
            k();
        }
        this.f2272d0 = z10;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2272d0
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.k()
            goto L_0x0058
        L_0x001a:
            r5.f2270b0 = r2
            r5.Z = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.Q
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.Q
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.O
            r7.l(r0, r6)
            boolean r6 = r5.f2271c0
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.x()
            if (r6 == 0) goto L_0x0058
            r5.y()
        L_0x0058:
            boolean r6 = r5.f2273e0
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f2271c0
            if (r6 == 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(boolean z10) {
        this.f2273e0 = z10;
        return this;
    }

    @m0
    public a q(float f10, float f11) {
        float[] fArr = this.T;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    @m0
    public a r(float f10, float f11) {
        float[] fArr = this.Y;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    @m0
    public a s(float f10, float f11) {
        float[] fArr = this.X;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    @m0
    public a t(int i10) {
        this.O.j(i10);
        return this;
    }

    @m0
    public a u(int i10) {
        this.O.k(i10);
        return this;
    }

    @m0
    public a v(float f10, float f11) {
        float[] fArr = this.S;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    @m0
    public a w(float f10, float f11) {
        float[] fArr = this.W;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public boolean x() {
        C0032a aVar = this.O;
        int f10 = aVar.f();
        int d10 = aVar.d();
        return (f10 != 0 && b(f10)) || (d10 != 0 && a(d10));
    }

    public final void y() {
        int i10;
        if (this.R == null) {
            this.R = new b();
        }
        this.f2271c0 = true;
        this.f2269a0 = true;
        if (this.Z || (i10 = this.V) <= 0) {
            this.R.run();
        } else {
            w1.o1(this.Q, this.R, (long) i10);
        }
        this.Z = true;
    }
}

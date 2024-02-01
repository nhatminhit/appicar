package v9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import d.g1;
import d.m0;
import j3.b;

public final class d extends i<ObjectAnimator> {

    /* renamed from: l  reason: collision with root package name */
    public static final int f23438l = 4;

    /* renamed from: m  reason: collision with root package name */
    public static final int f23439m = 5400;

    /* renamed from: n  reason: collision with root package name */
    public static final int f23440n = 667;

    /* renamed from: o  reason: collision with root package name */
    public static final int f23441o = 667;

    /* renamed from: p  reason: collision with root package name */
    public static final int f23442p = 333;

    /* renamed from: q  reason: collision with root package name */
    public static final int f23443q = 333;

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f23444r = {0, 1350, 2700, 4050};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f23445s = {667, 2017, 3367, 4717};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f23446t = {1000, 2350, 3700, 5050};

    /* renamed from: u  reason: collision with root package name */
    public static final int f23447u = -20;

    /* renamed from: v  reason: collision with root package name */
    public static final int f23448v = 250;

    /* renamed from: w  reason: collision with root package name */
    public static final int f23449w = 1520;

    /* renamed from: x  reason: collision with root package name */
    public static final Property<d, Float> f23450x;

    /* renamed from: y  reason: collision with root package name */
    public static final Property<d, Float> f23451y;

    /* renamed from: d  reason: collision with root package name */
    public ObjectAnimator f23452d;

    /* renamed from: e  reason: collision with root package name */
    public ObjectAnimator f23453e;

    /* renamed from: f  reason: collision with root package name */
    public final z1.b f23454f;

    /* renamed from: g  reason: collision with root package name */
    public final b f23455g;

    /* renamed from: h  reason: collision with root package name */
    public int f23456h = 0;

    /* renamed from: i  reason: collision with root package name */
    public float f23457i;

    /* renamed from: j  reason: collision with root package name */
    public float f23458j;

    /* renamed from: k  reason: collision with root package name */
    public b.a f23459k = null;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            d dVar = d.this;
            int unused = dVar.f23456h = (dVar.f23456h + 4) % d.this.f23455g.f23430c.length;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            d.this.a();
            d dVar = d.this;
            dVar.f23459k.b(dVar.f23482a);
        }
    }

    public static class c extends Property<d, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(d dVar) {
            return Float.valueOf(dVar.o());
        }

        /* renamed from: b */
        public void set(d dVar, Float f10) {
            dVar.t(f10.floatValue());
        }
    }

    /* renamed from: v9.d$d  reason: collision with other inner class name */
    public static class C0453d extends Property<d, Float> {
        public C0453d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(d dVar) {
            return Float.valueOf(dVar.p());
        }

        /* renamed from: b */
        public void set(d dVar, Float f10) {
            dVar.u(f10.floatValue());
        }
    }

    static {
        Class<Float> cls = Float.class;
        f23450x = new c(cls, "animationFraction");
        f23451y = new C0453d(cls, "completeEndFraction");
    }

    public d(@m0 e eVar) {
        super(1);
        this.f23455g = eVar;
        this.f23454f = new z1.b();
    }

    public void a() {
        ObjectAnimator objectAnimator = this.f23452d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void c() {
        s();
    }

    public void d(@m0 b.a aVar) {
        this.f23459k = aVar;
    }

    public void f() {
        if (!this.f23453e.isRunning()) {
            if (this.f23482a.isVisible()) {
                this.f23453e.start();
            } else {
                a();
            }
        }
    }

    public void g() {
        q();
        s();
        this.f23452d.start();
    }

    public void h() {
        this.f23459k = null;
    }

    public final float o() {
        return this.f23457i;
    }

    public final float p() {
        return this.f23458j;
    }

    public final void q() {
        if (this.f23452d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f23450x, new float[]{0.0f, 1.0f});
            this.f23452d = ofFloat;
            ofFloat.setDuration(5400);
            this.f23452d.setInterpolator((TimeInterpolator) null);
            this.f23452d.setRepeatCount(-1);
            this.f23452d.addListener(new a());
        }
        if (this.f23453e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f23451y, new float[]{0.0f, 1.0f});
            this.f23453e = ofFloat2;
            ofFloat2.setDuration(333);
            this.f23453e.setInterpolator(this.f23454f);
            this.f23453e.addListener(new b());
        }
    }

    public final void r(int i10) {
        int i11 = 0;
        while (i11 < 4) {
            float b10 = b(i10, f23446t[i11], 333);
            if (b10 < 0.0f || b10 > 1.0f) {
                i11++;
            } else {
                int i12 = i11 + this.f23456h;
                int[] iArr = this.f23455g.f23430c;
                int length = i12 % iArr.length;
                this.f23484c[0] = j9.c.b().evaluate(this.f23454f.getInterpolation(b10), Integer.valueOf(o9.a.a(iArr[length], this.f23482a.getAlpha())), Integer.valueOf(o9.a.a(this.f23455g.f23430c[(length + 1) % iArr.length], this.f23482a.getAlpha()))).intValue();
                return;
            }
        }
    }

    @g1
    public void s() {
        this.f23456h = 0;
        this.f23484c[0] = o9.a.a(this.f23455g.f23430c[0], this.f23482a.getAlpha());
        this.f23458j = 0.0f;
    }

    @g1
    public void t(float f10) {
        this.f23457i = f10;
        int i10 = (int) (f10 * 5400.0f);
        v(i10);
        r(i10);
        this.f23482a.invalidateSelf();
    }

    public final void u(float f10) {
        this.f23458j = f10;
    }

    public final void v(int i10) {
        float[] fArr = this.f23483b;
        float f10 = this.f23457i;
        fArr[0] = (f10 * 1520.0f) - 0.21875f;
        fArr[1] = f10 * 1520.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float b10 = b(i10, f23444r[i11], 667);
            float[] fArr2 = this.f23483b;
            fArr2[1] = fArr2[1] + (this.f23454f.getInterpolation(b10) * 250.0f);
            float b11 = b(i10, f23445s[i11], 667);
            float[] fArr3 = this.f23483b;
            fArr3[0] = fArr3[0] + (this.f23454f.getInterpolation(b11) * 250.0f);
        }
        float[] fArr4 = this.f23483b;
        float f11 = fArr4[0];
        float f12 = fArr4[1];
        float f13 = f11 + ((f12 - f11) * this.f23458j);
        fArr4[0] = f13;
        fArr4[0] = f13 / 360.0f;
        fArr4[1] = f12 / 360.0f;
    }
}

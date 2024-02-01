package u1;

import d.v;
import d.x0;
import u1.b;

public final class h implements f {

    /* renamed from: k  reason: collision with root package name */
    public static final float f13458k = 10000.0f;

    /* renamed from: l  reason: collision with root package name */
    public static final float f13459l = 1500.0f;

    /* renamed from: m  reason: collision with root package name */
    public static final float f13460m = 200.0f;

    /* renamed from: n  reason: collision with root package name */
    public static final float f13461n = 50.0f;

    /* renamed from: o  reason: collision with root package name */
    public static final float f13462o = 0.2f;

    /* renamed from: p  reason: collision with root package name */
    public static final float f13463p = 0.5f;

    /* renamed from: q  reason: collision with root package name */
    public static final float f13464q = 0.75f;

    /* renamed from: r  reason: collision with root package name */
    public static final float f13465r = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    public static final double f13466s = 62.5d;

    /* renamed from: t  reason: collision with root package name */
    public static final double f13467t = Double.MAX_VALUE;

    /* renamed from: a  reason: collision with root package name */
    public double f13468a = Math.sqrt(1500.0d);

    /* renamed from: b  reason: collision with root package name */
    public double f13469b = 0.5d;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13470c = false;

    /* renamed from: d  reason: collision with root package name */
    public double f13471d;

    /* renamed from: e  reason: collision with root package name */
    public double f13472e;

    /* renamed from: f  reason: collision with root package name */
    public double f13473f;

    /* renamed from: g  reason: collision with root package name */
    public double f13474g;

    /* renamed from: h  reason: collision with root package name */
    public double f13475h;

    /* renamed from: i  reason: collision with root package name */
    public double f13476i = Double.MAX_VALUE;

    /* renamed from: j  reason: collision with root package name */
    public final b.p f13477j = new b.p();

    public h() {
    }

    public h(float f10) {
        this.f13476i = (double) f10;
    }

    @x0({x0.a.LIBRARY})
    public boolean a(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f13472e && ((double) Math.abs(f10 - d())) < this.f13471d;
    }

    @x0({x0.a.LIBRARY})
    public float b(float f10, float f11) {
        float d10 = f10 - d();
        double d11 = this.f13468a;
        return (float) (((-(d11 * d11)) * ((double) d10)) - (((d11 * 2.0d) * this.f13469b) * ((double) f11)));
    }

    public float c() {
        return (float) this.f13469b;
    }

    public float d() {
        return (float) this.f13476i;
    }

    public float e() {
        double d10 = this.f13468a;
        return (float) (d10 * d10);
    }

    public final void f() {
        if (!this.f13470c) {
            if (this.f13476i != Double.MAX_VALUE) {
                double d10 = this.f13469b;
                if (d10 > 1.0d) {
                    double d11 = this.f13468a;
                    this.f13473f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
                    double d12 = this.f13469b;
                    double d13 = this.f13468a;
                    this.f13474g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
                } else if (d10 >= 0.0d && d10 < 1.0d) {
                    this.f13475h = this.f13468a * Math.sqrt(1.0d - (d10 * d10));
                }
                this.f13470c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    public h g(@v(from = 0.0d) float f10) {
        if (f10 >= 0.0f) {
            this.f13469b = (double) f10;
            this.f13470c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public h h(float f10) {
        this.f13476i = (double) f10;
        return this;
    }

    public h i(@v(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 > 0.0f) {
            this.f13468a = Math.sqrt((double) f10);
            this.f13470c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public void j(double d10) {
        double abs = Math.abs(d10);
        this.f13471d = abs;
        this.f13472e = abs * 62.5d;
    }

    public b.p k(double d10, double d11, long j10) {
        double d12;
        double d13;
        f();
        double d14 = ((double) j10) / 1000.0d;
        double d15 = d10 - this.f13476i;
        double d16 = this.f13469b;
        if (d16 > 1.0d) {
            double d17 = this.f13474g;
            double d18 = this.f13473f;
            double d19 = d15 - (((d17 * d15) - d11) / (d17 - d18));
            double d20 = ((d15 * d17) - d11) / (d17 - d18);
            d13 = (Math.pow(2.718281828459045d, d17 * d14) * d19) + (Math.pow(2.718281828459045d, this.f13473f * d14) * d20);
            double d21 = this.f13474g;
            double pow = d19 * d21 * Math.pow(2.718281828459045d, d21 * d14);
            double d22 = this.f13473f;
            d12 = pow + (d20 * d22 * Math.pow(2.718281828459045d, d22 * d14));
        } else if (d16 == 1.0d) {
            double d23 = this.f13468a;
            double d24 = d11 + (d23 * d15);
            double d25 = d15 + (d24 * d14);
            d13 = Math.pow(2.718281828459045d, (-d23) * d14) * d25;
            double pow2 = d25 * Math.pow(2.718281828459045d, (-this.f13468a) * d14);
            double d26 = this.f13468a;
            d12 = (d24 * Math.pow(2.718281828459045d, (-d26) * d14)) + (pow2 * (-d26));
        } else {
            double d27 = 1.0d / this.f13475h;
            double d28 = this.f13468a;
            double d29 = d27 * ((d16 * d28 * d15) + d11);
            double pow3 = Math.pow(2.718281828459045d, (-d16) * d28 * d14) * ((Math.cos(this.f13475h * d14) * d15) + (Math.sin(this.f13475h * d14) * d29));
            double d30 = this.f13468a;
            double d31 = this.f13469b;
            double pow4 = Math.pow(2.718281828459045d, (-d31) * d30 * d14);
            double d32 = this.f13475h;
            double d33 = pow3;
            double sin = (-d32) * d15 * Math.sin(d32 * d14);
            double d34 = this.f13475h;
            d12 = ((-d30) * pow3 * d31) + (pow4 * (sin + (d29 * d34 * Math.cos(d34 * d14))));
            d13 = d33;
        }
        b.p pVar = this.f13477j;
        pVar.f13448a = (float) (d13 + this.f13476i);
        pVar.f13449b = (float) d12;
        return pVar;
    }
}

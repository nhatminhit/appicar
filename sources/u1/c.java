package u1;

import d.v;
import u1.b;

public final class c extends b<c> {
    public final a G;

    public static final class a implements f {

        /* renamed from: d  reason: collision with root package name */
        public static final float f13450d = -4.2f;

        /* renamed from: e  reason: collision with root package name */
        public static final float f13451e = 62.5f;

        /* renamed from: a  reason: collision with root package name */
        public float f13452a = -4.2f;

        /* renamed from: b  reason: collision with root package name */
        public float f13453b;

        /* renamed from: c  reason: collision with root package name */
        public final b.p f13454c = new b.p();

        public boolean a(float f10, float f11) {
            return Math.abs(f11) < this.f13453b;
        }

        public float b(float f10, float f11) {
            return f11 * this.f13452a;
        }

        public float c() {
            return this.f13452a / -4.2f;
        }

        public void d(float f10) {
            this.f13452a = f10 * -4.2f;
        }

        public void e(float f10) {
            this.f13453b = f10 * 62.5f;
        }

        public b.p f(float f10, float f11, long j10) {
            float f12 = (float) j10;
            this.f13454c.f13449b = (float) (((double) f11) * Math.exp((double) ((f12 / 1000.0f) * this.f13452a)));
            b.p pVar = this.f13454c;
            float f13 = this.f13452a;
            pVar.f13448a = (float) (((double) (f10 - (f11 / f13))) + (((double) (f11 / f13)) * Math.exp((double) ((f13 * f12) / 1000.0f))));
            b.p pVar2 = this.f13454c;
            if (a(pVar2.f13448a, pVar2.f13449b)) {
                this.f13454c.f13449b = 0.0f;
            }
            return this.f13454c;
        }
    }

    public <K> c(K k10, d<K> dVar) {
        super(k10, dVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }

    public c(e eVar) {
        super(eVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }

    public c A(@v(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 > 0.0f) {
            this.G.d(f10);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    /* renamed from: B */
    public c p(float f10) {
        super.p(f10);
        return this;
    }

    /* renamed from: C */
    public c q(float f10) {
        super.q(f10);
        return this;
    }

    /* renamed from: D */
    public c u(float f10) {
        super.u(f10);
        return this;
    }

    public float f(float f10, float f11) {
        return this.G.b(f10, f11);
    }

    public boolean j(float f10, float f11) {
        return f10 >= this.f13440g || f10 <= this.f13441h || this.G.a(f10, f11);
    }

    public void v(float f10) {
        this.G.e(f10);
    }

    public boolean y(long j10) {
        b.p f10 = this.G.f(this.f13435b, this.f13434a, j10);
        float f11 = f10.f13448a;
        this.f13435b = f11;
        float f12 = f10.f13449b;
        this.f13434a = f12;
        float f13 = this.f13441h;
        if (f11 < f13) {
            this.f13435b = f13;
            return true;
        }
        float f14 = this.f13440g;
        if (f11 <= f14) {
            return j(f11, f12);
        }
        this.f13435b = f14;
        return true;
    }

    public float z() {
        return this.G.c();
    }
}

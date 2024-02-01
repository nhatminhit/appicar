package u1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import u1.b;

public final class g extends b<g> {
    public static final float J = Float.MAX_VALUE;
    public h G = null;
    public float H = Float.MAX_VALUE;
    public boolean I = false;

    public <K> g(K k10, d<K> dVar) {
        super(k10, dVar);
    }

    public <K> g(K k10, d<K> dVar, float f10) {
        super(k10, dVar);
        this.G = new h(f10);
    }

    public g(e eVar) {
        super(eVar);
    }

    public boolean A() {
        return this.G.f13469b > 0.0d;
    }

    public h B() {
        return this.G;
    }

    public final void C() {
        h hVar = this.G;
        if (hVar != null) {
            double d10 = (double) hVar.d();
            if (d10 > ((double) this.f13440g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (d10 < ((double) this.f13441h)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    public g D(h hVar) {
        this.G = hVar;
        return this;
    }

    public void E() {
        if (!A()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (this.f13439f) {
            this.I = true;
        }
    }

    public float f(float f10, float f11) {
        return this.G.b(f10, f11);
    }

    public boolean j(float f10, float f11) {
        return this.G.a(f10, f11);
    }

    public void v(float f10) {
    }

    public void w() {
        C();
        this.G.j((double) i());
        super.w();
    }

    public boolean y(long j10) {
        long j11;
        double d10;
        double d11;
        h hVar;
        if (this.I) {
            float f10 = this.H;
            if (f10 != Float.MAX_VALUE) {
                this.G.h(f10);
                this.H = Float.MAX_VALUE;
            }
            this.f13435b = this.G.d();
            this.f13434a = 0.0f;
            this.I = false;
            return true;
        }
        if (this.H != Float.MAX_VALUE) {
            this.G.d();
            j11 = j10 / 2;
            b.p k10 = this.G.k((double) this.f13435b, (double) this.f13434a, j11);
            this.G.h(this.H);
            this.H = Float.MAX_VALUE;
            hVar = this.G;
            d11 = (double) k10.f13448a;
            d10 = (double) k10.f13449b;
        } else {
            hVar = this.G;
            d11 = (double) this.f13435b;
            d10 = (double) this.f13434a;
            j11 = j10;
        }
        b.p k11 = hVar.k(d11, d10, j11);
        this.f13435b = k11.f13448a;
        this.f13434a = k11.f13449b;
        float max = Math.max(this.f13435b, this.f13441h);
        this.f13435b = max;
        float min = Math.min(max, this.f13440g);
        this.f13435b = min;
        if (!j(min, this.f13434a)) {
            return false;
        }
        this.f13435b = this.G.d();
        this.f13434a = 0.0f;
        return true;
    }

    public void z(float f10) {
        if (k()) {
            this.H = f10;
            return;
        }
        if (this.G == null) {
            this.G = new h(f10);
        }
        this.G.h(f10);
        w();
    }
}

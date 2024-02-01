package y3;

import d.m0;
import t4.k;
import v3.f;

public class p<Z> implements v<Z> {
    public final boolean O;
    public final boolean P;
    public final v<Z> Q;
    public final a R;
    public final f S;
    public int T;
    public boolean U;

    public interface a {
        void c(f fVar, p<?> pVar);
    }

    public p(v<Z> vVar, boolean z10, boolean z11, f fVar, a aVar) {
        this.Q = (v) k.d(vVar);
        this.O = z10;
        this.P = z11;
        this.S = fVar;
        this.R = (a) k.d(aVar);
    }

    public synchronized void a() {
        if (this.T > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.U) {
            this.U = true;
            if (this.P) {
                this.Q.a();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public synchronized void b() {
        if (!this.U) {
            this.T++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public int c() {
        return this.Q.c();
    }

    @m0
    public Class<Z> d() {
        return this.Q.d();
    }

    public v<Z> e() {
        return this.Q;
    }

    public boolean f() {
        return this.O;
    }

    public void g() {
        boolean z10;
        synchronized (this) {
            int i10 = this.T;
            if (i10 > 0) {
                z10 = true;
                int i11 = i10 - 1;
                this.T = i11;
                if (i11 != 0) {
                    z10 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z10) {
            this.R.c(this.S, this);
        }
    }

    @m0
    public Z get() {
        return this.Q.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.O + ", listener=" + this.R + ", key=" + this.S + ", acquired=" + this.T + ", isRecycled=" + this.U + ", resource=" + this.Q + '}';
    }
}

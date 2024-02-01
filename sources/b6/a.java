package b6;

import b6.n0;
import b6.x0;
import d.o0;
import w7.q0;

public abstract class a implements n0 {

    /* renamed from: p  reason: collision with root package name */
    public final x0.c f4149p = new x0.c();

    /* renamed from: b6.a$a  reason: collision with other inner class name */
    public static final class C0066a {

        /* renamed from: a  reason: collision with root package name */
        public final n0.d f4150a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4151b;

        public C0066a(n0.d dVar) {
            this.f4150a = dVar;
        }

        public void a(b bVar) {
            if (!this.f4151b) {
                bVar.a(this.f4150a);
            }
        }

        public void b() {
            this.f4151b = true;
        }

        public boolean equals(@o0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0066a.class != obj.getClass()) {
                return false;
            }
            return this.f4150a.equals(((C0066a) obj).f4150a);
        }

        public int hashCode() {
            return this.f4150a.hashCode();
        }
    }

    public interface b {
        void a(n0.d dVar);
    }

    public final long A() {
        x0 t02 = t0();
        return t02.r() ? c.f4201b : t02.n(Q(), this.f4149p).c();
    }

    public final boolean C() {
        x0 t02 = t0();
        return !t02.r() && t02.n(Q(), this.f4149p).f4501d;
    }

    public final void E() {
        X(Q());
    }

    public final int H0() {
        int k10 = k();
        if (k10 == 1) {
            return 0;
        }
        return k10;
    }

    public final boolean I() {
        x0 t02 = t0();
        return !t02.r() && t02.n(Q(), this.f4149p).f4502e;
    }

    @o0
    public final Object M() {
        int Q = Q();
        x0 t02 = t0();
        if (Q >= t02.q()) {
            return null;
        }
        return t02.o(Q, this.f4149p, true).f4498a;
    }

    public final void X(int i10) {
        p(i10, c.f4201b);
    }

    public final int c0() {
        x0 t02 = t0();
        if (t02.r()) {
            return -1;
        }
        return t02.l(Q(), H0(), z0());
    }

    public final boolean hasNext() {
        return n0() != -1;
    }

    public final boolean hasPrevious() {
        return c0() != -1;
    }

    public final int n0() {
        x0 t02 = t0();
        if (t02.r()) {
            return -1;
        }
        return t02.e(Q(), H0(), z0());
    }

    public final void next() {
        int n02 = n0();
        if (n02 != -1) {
            X(n02);
        }
    }

    public final void previous() {
        int c02 = c0();
        if (c02 != -1) {
            X(c02);
        }
    }

    public final void stop() {
        t(false);
    }

    public final int v() {
        long e02 = e0();
        long duration = getDuration();
        if (e02 == c.f4201b || duration == c.f4201b) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return q0.u((int) ((e02 * 100) / duration), 0, 100);
    }

    public final void x(long j10) {
        p(Q(), j10);
    }
}

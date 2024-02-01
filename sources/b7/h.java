package b7;

import android.os.Handler;
import b6.x0;
import b7.i0;
import b7.y;
import d.i;
import d.o0;
import java.io.IOException;
import java.util.HashMap;
import t7.r0;
import w7.q0;

public abstract class h<T> extends c {
    public final HashMap<T, b> T = new HashMap<>();
    @o0
    public Handler U;
    @o0
    public r0 V;

    public final class a implements i0 {
        public final T O;
        public i0.a P;

        public a(T t10) {
            this.P = h.this.m((y.a) null);
            this.O = t10;
        }

        public void E(int i10, @o0 y.a aVar, i0.b bVar, i0.c cVar) {
            if (a(i10, aVar)) {
                this.P.F(bVar, b(cVar));
            }
        }

        public void M(int i10, y.a aVar) {
            if (a(i10, aVar)) {
                this.P.I();
            }
        }

        public void P(int i10, @o0 y.a aVar, i0.c cVar) {
            if (a(i10, aVar)) {
                this.P.O(b(cVar));
            }
        }

        public final boolean a(int i10, @o0 y.a aVar) {
            y.a aVar2;
            if (aVar != null) {
                aVar2 = h.this.s(this.O, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int u10 = h.this.u(this.O, i10);
            i0.a aVar3 = this.P;
            if (aVar3.f4527a == u10 && q0.e(aVar3.f4528b, aVar2)) {
                return true;
            }
            this.P = h.this.l(u10, aVar2, 0);
            return true;
        }

        public final i0.c b(i0.c cVar) {
            long t10 = h.this.t(this.O, cVar.f4544f);
            long t11 = h.this.t(this.O, cVar.f4545g);
            return (t10 == cVar.f4544f && t11 == cVar.f4545g) ? cVar : new i0.c(cVar.f4539a, cVar.f4540b, cVar.f4541c, cVar.f4542d, cVar.f4543e, t10, t11);
        }

        public void f(int i10, @o0 y.a aVar, i0.b bVar, i0.c cVar) {
            if (a(i10, aVar)) {
                this.P.z(bVar, b(cVar));
            }
        }

        public void h(int i10, y.a aVar) {
            if (a(i10, aVar)) {
                this.P.J();
            }
        }

        public void j(int i10, @o0 y.a aVar, i0.b bVar, i0.c cVar) {
            if (a(i10, aVar)) {
                this.P.w(bVar, b(cVar));
            }
        }

        public void o(int i10, y.a aVar) {
            if (a(i10, aVar)) {
                this.P.L();
            }
        }

        public void v(int i10, @o0 y.a aVar, i0.c cVar) {
            if (a(i10, aVar)) {
                this.P.m(b(cVar));
            }
        }

        public void w(int i10, @o0 y.a aVar, i0.b bVar, i0.c cVar, IOException iOException, boolean z10) {
            if (a(i10, aVar)) {
                this.P.C(bVar, b(cVar), iOException, z10);
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final y f4524a;

        /* renamed from: b  reason: collision with root package name */
        public final y.b f4525b;

        /* renamed from: c  reason: collision with root package name */
        public final i0 f4526c;

        public b(y yVar, y.b bVar, i0 i0Var) {
            this.f4524a = yVar;
            this.f4525b = bVar;
            this.f4526c = i0Var;
        }
    }

    @i
    public void h() throws IOException {
        for (b bVar : this.T.values()) {
            bVar.f4524a.h();
        }
    }

    @i
    public void o(@o0 r0 r0Var) {
        this.V = r0Var;
        this.U = new Handler();
    }

    @i
    public void q() {
        for (b next : this.T.values()) {
            next.f4524a.b(next.f4525b);
            next.f4524a.k(next.f4526c);
        }
        this.T.clear();
    }

    @o0
    public y.a s(T t10, y.a aVar) {
        return aVar;
    }

    public long t(@o0 T t10, long j10) {
        return j10;
    }

    public int u(T t10, int i10) {
        return i10;
    }

    /* renamed from: w */
    public abstract void v(T t10, y yVar, x0 x0Var, @o0 Object obj);

    public final void x(T t10, y yVar) {
        w7.a.a(!this.T.containsKey(t10));
        g gVar = new g(this, t10);
        a aVar = new a(t10);
        this.T.put(t10, new b(yVar, gVar, aVar));
        yVar.f((Handler) w7.a.g(this.U), aVar);
        yVar.e(gVar, this.V);
    }

    public final void y(T t10) {
        b bVar = (b) w7.a.g(this.T.remove(t10));
        bVar.f4524a.b(bVar.f4525b);
        bVar.f4524a.k(bVar.f4526c);
    }
}

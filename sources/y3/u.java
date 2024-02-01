package y3;

import d.m0;
import e1.m;
import t4.k;
import u4.a;
import u4.c;

public final class u<Z> implements v<Z>, a.f {
    public static final m.a<u<?>> S = u4.a.e(20, new a());
    public final c O = c.a();
    public v<Z> P;
    public boolean Q;
    public boolean R;

    public class a implements a.d<u<?>> {
        /* renamed from: b */
        public u<?> a() {
            return new u<>();
        }
    }

    @m0
    public static <Z> u<Z> e(v<Z> vVar) {
        u<Z> uVar = (u) k.d(S.b());
        uVar.b(vVar);
        return uVar;
    }

    public synchronized void a() {
        this.O.c();
        this.R = true;
        if (!this.Q) {
            this.P.a();
            f();
        }
    }

    public final void b(v<Z> vVar) {
        this.R = false;
        this.Q = true;
        this.P = vVar;
    }

    public int c() {
        return this.P.c();
    }

    @m0
    public Class<Z> d() {
        return this.P.d();
    }

    public final void f() {
        this.P = null;
        S.a(this);
    }

    public synchronized void g() {
        this.O.c();
        if (this.Q) {
            this.Q = false;
            if (this.R) {
                a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @m0
    public Z get() {
        return this.P.get();
    }

    @m0
    public c i() {
        return this.O;
    }
}

package r5;

import d5.e;
import d5.g;
import i5.u;
import k5.h;
import k5.l;
import w4.b0;
import w4.f;

public class a extends u {

    /* renamed from: e0  reason: collision with root package name */
    public static final long f12117e0 = 1;

    /* renamed from: r5.a$a  reason: collision with other inner class name */
    public static class C0207a extends h<a, C0207a> {
        public C0207a(a aVar) {
            super(aVar);
        }

        public C0207a s0(e eVar, boolean z10) {
            if (z10) {
                ((a) this.f10014a).V0(eVar.i());
            } else {
                ((a) this.f10014a).N0(eVar.i());
            }
            return this;
        }

        public C0207a t0(g gVar, boolean z10) {
            if (z10) {
                ((a) this.f10014a).U0(gVar.i());
            } else {
                ((a) this.f10014a).M0(gVar.i());
            }
            return this;
        }

        public C0207a u0(e... eVarArr) {
            for (e i10 : eVarArr) {
                ((a) this.f10014a).N0(i10.i());
            }
            return this;
        }

        public C0207a v0(g... gVarArr) {
            for (g i10 : gVarArr) {
                ((a) this.f10014a).M0(i10.i());
            }
            return this;
        }

        public C0207a w0(e... eVarArr) {
            for (e i10 : eVarArr) {
                ((a) this.f10014a).V0(i10.i());
            }
            return this;
        }

        public C0207a x0(g... gVarArr) {
            for (g i10 : gVarArr) {
                ((a) this.f10014a).U0(i10.i());
            }
            return this;
        }
    }

    public a() {
        this(new f());
    }

    public a(a aVar) {
        super((u) aVar);
    }

    public a(f fVar) {
        super(fVar);
    }

    public static C0207a Z3() {
        return new C0207a(new a());
    }

    public static C0207a a4(f fVar) {
        return new C0207a(new a(fVar));
    }

    /* renamed from: b4 */
    public a l0() {
        s(a.class);
        return new a(this);
    }

    public boolean c4(e eVar) {
        return z1(eVar.i());
    }

    public boolean d4(g gVar) {
        return y1(gVar.i());
    }

    public C0207a e4() {
        return new C0207a(l0());
    }

    public f h() {
        return this.O;
    }

    public b0 version() {
        return l.O;
    }
}

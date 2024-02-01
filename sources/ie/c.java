package ie;

import fh.g;
import fh.h;
import ie.g;
import java.io.Serializable;
import we.p;
import xe.k1;
import xe.l0;
import xe.n0;
import xe.w;
import zd.h1;
import zd.u2;

@h1(version = "1.3")
public final class c implements g, Serializable {
    @g
    public final g O;
    @g
    public final g.b P;

    public static final class a implements Serializable {
        @fh.g
        public static final C0325a P = new C0325a((w) null);
        public static final long Q = 0;
        @fh.g
        public final g[] O;

        /* renamed from: ie.c$a$a  reason: collision with other inner class name */
        public static final class C0325a {
            public C0325a() {
            }

            public /* synthetic */ C0325a(w wVar) {
                this();
            }
        }

        public a(@fh.g g[] gVarArr) {
            l0.p(gVarArr, "elements");
            this.O = gVarArr;
        }

        @fh.g
        public final g[] a() {
            return this.O;
        }

        public final Object b() {
            g[] gVarArr = this.O;
            g gVar = i.O;
            for (g m12 : gVarArr) {
                gVar = gVar.m1(m12);
            }
            return gVar;
        }
    }

    public static final class b extends n0 implements p<String, g.b, String> {
        public static final b P = new b();

        public b() {
            super(2);
        }

        @fh.g
        /* renamed from: c */
        public final String g0(@fh.g String str, @fh.g g.b bVar) {
            l0.p(str, "acc");
            l0.p(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    /* renamed from: ie.c$c  reason: collision with other inner class name */
    public static final class C0326c extends n0 implements p<u2, g.b, u2> {
        public final /* synthetic */ g[] P;
        public final /* synthetic */ k1.f Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0326c(g[] gVarArr, k1.f fVar) {
            super(2);
            this.P = gVarArr;
            this.Q = fVar;
        }

        public final void c(@fh.g u2 u2Var, @fh.g g.b bVar) {
            l0.p(u2Var, "<anonymous parameter 0>");
            l0.p(bVar, "element");
            g[] gVarArr = this.P;
            k1.f fVar = this.Q;
            int i10 = fVar.O;
            fVar.O = i10 + 1;
            gVarArr[i10] = bVar;
        }

        public /* bridge */ /* synthetic */ Object g0(Object obj, Object obj2) {
            c((u2) obj, (g.b) obj2);
            return u2.f25116a;
        }
    }

    public c(@fh.g g gVar, @fh.g g.b bVar) {
        l0.p(gVar, n7.b.U);
        l0.p(bVar, "element");
        this.O = gVar;
        this.P = bVar;
    }

    public final boolean a(g.b bVar) {
        return l0.g(g(bVar.getKey()), bVar);
    }

    public final boolean b(c cVar) {
        while (a(cVar.P)) {
            g gVar = cVar.O;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                l0.n(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return a((g.b) gVar);
            }
        }
        return false;
    }

    public final int d() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.O;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    public final Object e() {
        int d10 = d();
        g[] gVarArr = new g[d10];
        k1.f fVar = new k1.f();
        o(u2.f25116a, new C0326c(gVarArr, fVar));
        if (fVar.O == d10) {
            return new a(gVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(@h Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.d() != d() || !cVar.b(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @h
    public <E extends g.b> E g(@fh.g g.c<E> cVar) {
        l0.p(cVar, "key");
        c cVar2 = this;
        while (true) {
            E g10 = cVar2.P.g(cVar);
            if (g10 != null) {
                return g10;
            }
            g gVar = cVar2.O;
            if (!(gVar instanceof c)) {
                return gVar.g(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    public int hashCode() {
        return this.O.hashCode() + this.P.hashCode();
    }

    @fh.g
    public g i(@fh.g g.c<?> cVar) {
        l0.p(cVar, "key");
        if (this.P.g(cVar) != null) {
            return this.O;
        }
        g i10 = this.O.i(cVar);
        return i10 == this.O ? this : i10 == i.O ? this.P : new c(i10, this.P);
    }

    @fh.g
    public g m1(@fh.g g gVar) {
        return g.a.a(this, gVar);
    }

    public <R> R o(R r10, @fh.g p<? super R, ? super g.b, ? extends R> pVar) {
        l0.p(pVar, "operation");
        return pVar.g0(this.O.o(r10, pVar), this.P);
    }

    @fh.g
    public String toString() {
        return '[' + ((String) o("", b.P)) + ']';
    }
}

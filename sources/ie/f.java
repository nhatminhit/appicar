package ie;

import fh.g;
import ke.c;
import ke.d;
import le.h;
import we.l;
import we.p;
import xe.i0;
import xe.l0;
import zd.d1;
import zd.e1;
import zd.h1;
import zd.k0;
import zd.u2;

public final class f {

    public static final class a implements d<T> {
        public final /* synthetic */ g O;
        public final /* synthetic */ l<d1<? extends T>, u2> P;

        public a(g gVar, l<? super d1<? extends T>, u2> lVar) {
            this.O = gVar;
            this.P = lVar;
        }

        @g
        public g e() {
            return this.O;
        }

        public void x(@g Object obj) {
            this.P.A(d1.a(obj));
        }
    }

    @h1(version = "1.3")
    @oe.f
    public static final <T> d<T> a(g gVar, l<? super d1<? extends T>, u2> lVar) {
        l0.p(gVar, "context");
        l0.p(lVar, "resumeWith");
        return new a(gVar, lVar);
    }

    @g
    @h1(version = "1.3")
    public static final <T> d<u2> b(@g l<? super d<? super T>, ? extends Object> lVar, @g d<? super T> dVar) {
        l0.p(lVar, "<this>");
        l0.p(dVar, "completion");
        return new k(c.d(c.b(lVar, dVar)), d.h());
    }

    @g
    @h1(version = "1.3")
    public static final <R, T> d<u2> c(@g p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, @g d<? super T> dVar) {
        l0.p(pVar, "<this>");
        l0.p(dVar, "completion");
        return new k(c.d(c.c(pVar, r10, dVar)), d.h());
    }

    public static final g d() {
        throw new k0("Implemented as intrinsic");
    }

    @h1(version = "1.3")
    @oe.f
    public static /* synthetic */ void e() {
    }

    @h1(version = "1.3")
    @oe.f
    public static final <T> void f(d<? super T> dVar, T t10) {
        l0.p(dVar, "<this>");
        d1.a aVar = d1.P;
        dVar.x(d1.b(t10));
    }

    @h1(version = "1.3")
    @oe.f
    public static final <T> void g(d<? super T> dVar, Throwable th2) {
        l0.p(dVar, "<this>");
        l0.p(th2, "exception");
        d1.a aVar = d1.P;
        dVar.x(d1.b(e1.a(th2)));
    }

    @h1(version = "1.3")
    public static final <T> void h(@g l<? super d<? super T>, ? extends Object> lVar, @g d<? super T> dVar) {
        l0.p(lVar, "<this>");
        l0.p(dVar, "completion");
        d<u2> d10 = c.d(c.b(lVar, dVar));
        d1.a aVar = d1.P;
        d10.x(d1.b(u2.f25116a));
    }

    @h1(version = "1.3")
    public static final <R, T> void i(@g p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, @g d<? super T> dVar) {
        l0.p(pVar, "<this>");
        l0.p(dVar, "completion");
        d<u2> d10 = c.d(c.c(pVar, r10, dVar));
        d1.a aVar = d1.P;
        d10.x(d1.b(u2.f25116a));
    }

    @h1(version = "1.3")
    @oe.f
    public static final <T> Object j(l<? super d<? super T>, u2> lVar, d<? super T> dVar) {
        i0.e(0);
        k kVar = new k(c.d(dVar));
        lVar.A(kVar);
        Object a10 = kVar.a();
        if (a10 == d.h()) {
            h.c(dVar);
        }
        i0.e(1);
        return a10;
    }
}

package nf;

import fh.g;
import nf.s;
import we.a;
import xe.l0;
import xe.w;
import zd.h1;
import zd.u2;

public final class n {
    @h1(version = "1.7")
    @l
    public static final long a(@g s.b bVar, @g a<u2> aVar) {
        l0.p(bVar, "<this>");
        l0.p(aVar, "block");
        long b10 = bVar.b();
        aVar.n();
        return s.b.a.l(b10);
    }

    @h1(version = "1.3")
    @l
    public static final long b(@g s sVar, @g a<u2> aVar) {
        l0.p(sVar, "<this>");
        l0.p(aVar, "block");
        r a10 = sVar.a();
        aVar.n();
        return a10.b();
    }

    @h1(version = "1.3")
    @l
    public static final long c(@g a<u2> aVar) {
        l0.p(aVar, "block");
        long b10 = s.b.f21257b.b();
        aVar.n();
        return s.b.a.l(b10);
    }

    @h1(version = "1.7")
    @g
    @l
    public static final <T> t<T> d(@g s.b bVar, @g a<? extends T> aVar) {
        l0.p(bVar, "<this>");
        l0.p(aVar, "block");
        return new t<>(aVar.n(), s.b.a.l(bVar.b()), (w) null);
    }

    @h1(version = "1.3")
    @g
    @l
    public static final <T> t<T> e(@g s sVar, @g a<? extends T> aVar) {
        l0.p(sVar, "<this>");
        l0.p(aVar, "block");
        return new t<>(aVar.n(), sVar.a().b(), (w) null);
    }

    @h1(version = "1.3")
    @g
    @l
    public static final <T> t<T> f(@g a<? extends T> aVar) {
        l0.p(aVar, "block");
        return new t<>(aVar.n(), s.b.a.l(s.b.f21257b.b()), (w) null);
    }
}

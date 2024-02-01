package zd;

import fh.g;
import oe.f;
import we.a;
import we.l;
import xe.l0;
import zd.d1;

public final class e1 {
    @g
    @h1(version = "1.3")
    @a1
    public static final Object a(@g Throwable th2) {
        l0.p(th2, "exception");
        return new d1.b(th2);
    }

    @h1(version = "1.3")
    @f
    public static final <R, T> R b(Object obj, l<? super T, ? extends R> lVar, l<? super Throwable, ? extends R> lVar2) {
        l0.p(lVar, "onSuccess");
        l0.p(lVar2, "onFailure");
        Throwable e10 = d1.e(obj);
        return e10 == null ? lVar.A(obj) : lVar2.A(e10);
    }

    @h1(version = "1.3")
    @f
    public static final <R, T extends R> R c(Object obj, R r10) {
        return d1.i(obj) ? r10 : obj;
    }

    @h1(version = "1.3")
    @f
    public static final <R, T extends R> R d(Object obj, l<? super Throwable, ? extends R> lVar) {
        l0.p(lVar, "onFailure");
        Throwable e10 = d1.e(obj);
        return e10 == null ? obj : lVar.A(e10);
    }

    @h1(version = "1.3")
    @f
    public static final <T> T e(Object obj) {
        n(obj);
        return obj;
    }

    @h1(version = "1.3")
    @f
    public static final <R, T> Object f(Object obj, l<? super T, ? extends R> lVar) {
        l0.p(lVar, "transform");
        if (d1.j(obj)) {
            d1.a aVar = d1.P;
            obj = lVar.A(obj);
        }
        return d1.b(obj);
    }

    @h1(version = "1.3")
    @f
    public static final <R, T> Object g(Object obj, l<? super T, ? extends R> lVar) {
        l0.p(lVar, "transform");
        if (d1.j(obj)) {
            try {
                d1.a aVar = d1.P;
                return d1.b(lVar.A(obj));
            } catch (Throwable th2) {
                d1.a aVar2 = d1.P;
                obj = a(th2);
            }
        }
        return d1.b(obj);
    }

    @h1(version = "1.3")
    @f
    public static final <T> Object h(Object obj, l<? super Throwable, u2> lVar) {
        l0.p(lVar, "action");
        Throwable e10 = d1.e(obj);
        if (e10 != null) {
            lVar.A(e10);
        }
        return obj;
    }

    @h1(version = "1.3")
    @f
    public static final <T> Object i(Object obj, l<? super T, u2> lVar) {
        l0.p(lVar, "action");
        if (d1.j(obj)) {
            lVar.A(obj);
        }
        return obj;
    }

    @h1(version = "1.3")
    @f
    public static final <R, T extends R> Object j(Object obj, l<? super Throwable, ? extends R> lVar) {
        l0.p(lVar, "transform");
        Throwable e10 = d1.e(obj);
        if (e10 == null) {
            return obj;
        }
        d1.a aVar = d1.P;
        return d1.b(lVar.A(e10));
    }

    @h1(version = "1.3")
    @f
    public static final <R, T extends R> Object k(Object obj, l<? super Throwable, ? extends R> lVar) {
        l0.p(lVar, "transform");
        Throwable e10 = d1.e(obj);
        if (e10 == null) {
            return obj;
        }
        try {
            d1.a aVar = d1.P;
            return d1.b(lVar.A(e10));
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            return d1.b(a(th2));
        }
    }

    @h1(version = "1.3")
    @f
    public static final <T, R> Object l(T t10, l<? super T, ? extends R> lVar) {
        l0.p(lVar, "block");
        try {
            d1.a aVar = d1.P;
            return d1.b(lVar.A(t10));
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            return d1.b(a(th2));
        }
    }

    @h1(version = "1.3")
    @f
    public static final <R> Object m(a<? extends R> aVar) {
        l0.p(aVar, "block");
        try {
            d1.a aVar2 = d1.P;
            return d1.b(aVar.n());
        } catch (Throwable th2) {
            d1.a aVar3 = d1.P;
            return d1.b(a(th2));
        }
    }

    @h1(version = "1.3")
    @a1
    public static final void n(@g Object obj) {
        if (obj instanceof d1.b) {
            throw ((d1.b) obj).O;
        }
    }
}

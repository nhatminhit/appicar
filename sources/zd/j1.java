package zd;

import oe.f;
import we.a;
import we.l;
import xe.l0;
import xe.w;

public class j1 {
    @f
    public static final Void a() {
        throw new k0((String) null, 1, (w) null);
    }

    @f
    public static final Void b(String str) {
        l0.p(str, "reason");
        throw new k0("An operation is not implemented: " + str);
    }

    @h1(version = "1.1")
    @f
    public static final <T> T c(T t10, l<? super T, u2> lVar) {
        l0.p(lVar, "block");
        lVar.A(t10);
        return t10;
    }

    @f
    public static final <T> T d(T t10, l<? super T, u2> lVar) {
        l0.p(lVar, "block");
        lVar.A(t10);
        return t10;
    }

    @f
    public static final <T, R> R e(T t10, l<? super T, ? extends R> lVar) {
        l0.p(lVar, "block");
        return lVar.A(t10);
    }

    @f
    public static final void f(int i10, l<? super Integer, u2> lVar) {
        l0.p(lVar, "action");
        for (int i11 = 0; i11 < i10; i11++) {
            lVar.A(Integer.valueOf(i11));
        }
    }

    @f
    public static final <T, R> R g(T t10, l<? super T, ? extends R> lVar) {
        l0.p(lVar, "block");
        return lVar.A(t10);
    }

    @f
    public static final <R> R h(a<? extends R> aVar) {
        l0.p(aVar, "block");
        return aVar.n();
    }

    @h1(version = "1.1")
    @f
    public static final <T> T i(T t10, l<? super T, Boolean> lVar) {
        l0.p(lVar, "predicate");
        if (lVar.A(t10).booleanValue()) {
            return t10;
        }
        return null;
    }

    @h1(version = "1.1")
    @f
    public static final <T> T j(T t10, l<? super T, Boolean> lVar) {
        l0.p(lVar, "predicate");
        if (!lVar.A(t10).booleanValue()) {
            return t10;
        }
        return null;
    }

    @f
    public static final <T, R> R k(T t10, l<? super T, ? extends R> lVar) {
        l0.p(lVar, "block");
        return lVar.A(t10);
    }
}

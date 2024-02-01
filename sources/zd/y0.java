package zd;

import oe.f;
import we.a;
import xe.l0;

public class y0 extends x0 {
    @f
    public static final void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @f
    public static final void d(boolean z10, a<? extends Object> aVar) {
        l0.p(aVar, "lazyMessage");
        if (!z10) {
            throw new IllegalStateException(aVar.n().toString());
        }
    }

    @f
    public static final <T> T e(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @f
    public static final <T> T f(T t10, a<? extends Object> aVar) {
        l0.p(aVar, "lazyMessage");
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(aVar.n().toString());
    }

    @f
    public static final Void g(Object obj) {
        l0.p(obj, "message");
        throw new IllegalStateException(obj.toString());
    }

    @f
    public static final void h(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @f
    public static final void i(boolean z10, a<? extends Object> aVar) {
        l0.p(aVar, "lazyMessage");
        if (!z10) {
            throw new IllegalArgumentException(aVar.n().toString());
        }
    }

    @f
    public static final <T> T j(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @f
    public static final <T> T k(T t10, a<? extends Object> aVar) {
        l0.p(aVar, "lazyMessage");
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException(aVar.n().toString());
    }
}

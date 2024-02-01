package f8;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import d.m0;
import e8.a;
import g8.k;
import j8.s;

public final class p {
    @m0
    public static o<Status> a() {
        g8.p pVar = new g8.p(Looper.getMainLooper());
        pVar.f();
        return pVar;
    }

    @m0
    public static <R extends u> o<R> b(@m0 R r10) {
        s.m(r10, "Result must not be null");
        s.b(r10.g().f1() == 16, "Status code must be CommonStatusCodes.CANCELED");
        f0 f0Var = new f0(r10);
        f0Var.f();
        return f0Var;
    }

    @a
    @m0
    public static <R extends u> o<R> c(@m0 R r10, @m0 k kVar) {
        s.m(r10, "Result must not be null");
        s.b(!r10.g().r1(), "Status code must not be SUCCESS");
        g0 g0Var = new g0(kVar, r10);
        g0Var.o(r10);
        return g0Var;
    }

    @m0
    public static <R extends u> n<R> d(@m0 R r10) {
        s.m(r10, "Result must not be null");
        h0 h0Var = new h0((k) null);
        h0Var.o(r10);
        return new k(h0Var);
    }

    @a
    @m0
    public static <R extends u> n<R> e(@m0 R r10, @m0 k kVar) {
        s.m(r10, "Result must not be null");
        h0 h0Var = new h0(kVar);
        h0Var.o(r10);
        return new k(h0Var);
    }

    @m0
    public static o<Status> f(@m0 Status status) {
        s.m(status, "Result must not be null");
        g8.p pVar = new g8.p(Looper.getMainLooper());
        pVar.o(status);
        return pVar;
    }

    @a
    @m0
    public static o<Status> g(@m0 Status status, @m0 k kVar) {
        s.m(status, "Result must not be null");
        g8.p pVar = new g8.p(kVar);
        pVar.o(status);
        return pVar;
    }
}

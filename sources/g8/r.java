package g8;

import com.google.android.gms.common.api.Status;
import d.m0;
import d.o0;
import e8.a;
import h9.m;
import h9.n;
import j8.b;

@a
public class r {
    @a
    public static void a(@m0 Status status, @m0 n<Void> nVar) {
        b(status, (Object) null, nVar);
    }

    @a
    public static <ResultT> void b(@m0 Status status, @o0 ResultT resultt, @m0 n<ResultT> nVar) {
        if (status.r1()) {
            nVar.c(resultt);
        } else {
            nVar.b(b.a(status));
        }
    }

    @a
    @m0
    @Deprecated
    public static m<Void> c(@m0 m<Boolean> mVar) {
        return mVar.m(new c2());
    }

    @a
    public static <ResultT> boolean d(@m0 Status status, @o0 ResultT resultt, @m0 n<ResultT> nVar) {
        return status.r1() ? nVar.e(resultt) : nVar.d(b.a(status));
    }
}

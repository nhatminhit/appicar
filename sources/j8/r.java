package j8;

import d.m0;
import d.o0;
import f8.o;
import f8.t;
import f8.u;
import h9.m;
import h9.n;

@e8.a
public class r {

    /* renamed from: a  reason: collision with root package name */
    public static final x0 f9794a = new t0();

    @e8.a
    public interface a<R extends u, T> {
        @e8.a
        @o0
        T a(@m0 R r10);
    }

    @e8.a
    @m0
    public static <R extends u, T extends t<R>> m<T> a(@m0 o<R> oVar, @m0 T t10) {
        return b(oVar, new v0(t10));
    }

    @e8.a
    @m0
    public static <R extends u, T> m<T> b(@m0 o<R> oVar, @m0 a<R, T> aVar) {
        x0 x0Var = f9794a;
        n nVar = new n();
        oVar.c(new u0(oVar, nVar, aVar, x0Var));
        return nVar.a();
    }

    @e8.a
    @m0
    public static <R extends u> m<Void> c(@m0 o<R> oVar) {
        return b(oVar, new w0());
    }
}

package pi;

import ha.f;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import og.g0;
import og.h0;
import rh.v;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static v f22096a;

    public static v a(String str) {
        g0.b bVar = new g0.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        v f10 = new v.b().c(str).j(bVar.C(10000, timeUnit).I(10000, timeUnit).i(10000, timeUnit).E(true).y(Arrays.asList(new h0[]{h0.HTTP_1_1})).d()).b(sh.a.g(new f().v().d())).f();
        f22096a = f10;
        return f10;
    }
}

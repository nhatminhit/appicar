package jc;

import android.annotation.SuppressLint;
import android.content.Context;
import ha.f;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import og.g0;
import og.h0;
import rh.v;

public class a {
    @SuppressLint({"StaticFieldLeak"})
    public static v a(Context context, String str) {
        g0.b bVar = new g0.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return new v.b().c(str).j(bVar.C(10000, timeUnit).I(10000, timeUnit).i(10000, timeUnit).E(true).y(Collections.singletonList(h0.HTTP_1_1)).a(new e()).a(new c(context, str)).d()).b(sh.a.g(new f().v().d())).f();
    }

    @SuppressLint({"StaticFieldLeak"})
    public static v b(Context context, String str, String str2, String str3) {
        g0.b bVar = new g0.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return new v.b().c(str).j(bVar.C(10000, timeUnit).I(10000, timeUnit).i(10000, timeUnit).E(true).y(Collections.singletonList(h0.HTTP_1_1)).a(new e()).a(new c(context, str, str2, str3, false)).d()).b(sh.a.g(new f().v().d())).f();
    }
}

package jc;

import lc.e;
import lc.g;
import lc.h;
import og.f0;
import rh.b;
import th.a;
import th.f;
import th.i;
import th.l;
import th.o;
import th.q;

public interface d {
    @f("/auth/logout")
    b<lc.b> a();

    @o("/auth/lost-password/create-new-password")
    b<lc.b> b(@a h hVar);

    @o("/auth/lost-password/verify-otp")
    b<kc.a<Object>> c(@a g gVar);

    @o("/auth/register/verify-otp")
    b<kc.a<Object>> d(@a g gVar);

    @l
    @o("/data/upload")
    b<Object> e(@i("account") String str, @i("appId") String str2, @i("appName") String str3, @q f0.b bVar);

    @o("/auth/logout-app-id-then-login")
    b<lc.b> f(@a lc.d dVar);

    @o("/auth/register/create-customer")
    b<lc.b> g(@a h hVar);

    @o("/auth/refresh-token")
    b<lc.b> h(@a e eVar);

    @o("/auth/login")
    b<lc.b> i(@a lc.a aVar);

    @o("/auth/change-password")
    b<lc.b> j(@a h hVar);

    @o("/auth/register/send-otp")
    b<kc.a<Object>> k(@a lc.f fVar);

    @o("/auth/lost-password/send-otp")
    b<kc.a<Object>> l(@a lc.f fVar);
}

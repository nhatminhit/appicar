package zh;

import ci.d;
import ei.c;
import rh.b;
import th.f;
import th.o;

public interface a {
    @f("auth/logout")
    b<d> a();

    @o("auth/lost-password/create-new-password")
    b<ci.a> b(@th.a ii.a aVar);

    @o("auth/login")
    b<ai.b> c(@th.a ai.a aVar);

    @o("auth/lost-password/send-otp")
    b<ci.a> d(@th.a ii.b bVar);

    @o("auth/trial")
    b<ai.b> e(@th.a ai.a aVar);

    @o("auth/register/send-otp")
    b<ci.a> f(@th.a ei.a aVar);

    @o("auth/register/create-customer")
    b<ci.a> g(@th.a ei.b bVar);

    @o("auth/register/verify-otp")
    b<ci.a> h(@th.a c cVar);

    @o("auth/logout-app-id-then-login")
    b<ai.b> i(@th.a bi.a aVar);

    @o("auth/refresh-token")
    b<d> j(@th.a fi.a aVar);

    @o("auth/lost-password/verify-otp")
    b<ci.a> k(@th.a ii.c cVar);
}

package pi;

import rh.b;
import ri.d;
import ri.i;
import th.a;
import th.f;
import th.o;
import th.t;

public interface c {
    @f("/clients/check-license")
    b<d> a();

    @o("/embeds/get-video")
    b<yi.b> b(@a yi.a aVar);

    @o("/broadcasts/get-tv")
    b<vi.c> c(@a vi.a aVar);

    @o("/embeds/get-channel")
    b<xi.a> d(@a vi.a aVar);

    @o("/broadcasts/mark-error")
    b<vi.c> e(@a vi.b bVar);

    @f("/api/get-app.php")
    b<i> f(@t("app_packageName") String str);

    @o("/embeds/youtube-search")
    b<yi.b> g(@a wi.b bVar);

    @o("/embeds/youtube-suggest")
    b<yi.b> h(@a wi.c cVar);

    @f("/auth/logout")
    b<qi.a> i();

    @o("/auth/migrate")
    b<qi.a> j(@a ri.a aVar, @th.i("accept-language") String str);

    @o("/embeds/mark-error-video")
    b<yi.b> k(@a wi.a aVar);

    @o("/broadcasts/get-radio")
    b<vi.c> l(@a vi.a aVar);

    @f("/settings/get")
    b<qi.a> m();
}

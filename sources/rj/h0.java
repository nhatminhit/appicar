package rj;

import java.util.List;
import u2.c1;
import u2.j1;
import u2.l0;

@l0
public interface h0 {
    @j1("DELETE From  VideoOffline")
    void a();

    @j1("DELETE From  VideoOffline WHERE nameFodder=:nameFodder and source=:source")
    void b(String str, String str2);

    @c1
    void c(g0 g0Var);

    @j1("SELECT * FROM VideoOffline")
    List<g0> d();
}

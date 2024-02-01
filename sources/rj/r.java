package rj;

import java.util.List;
import u2.c1;
import u2.j1;
import u2.l0;

@l0
public interface r {
    @j1("DELETE From  News")
    void a();

    @j1("DELETE From  News WHERE IdNews=:idNew")
    void b(String str);

    @j1("SELECT IdNews FROM News")
    List<String> c();

    @c1
    void d(q qVar);
}

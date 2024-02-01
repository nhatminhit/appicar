package rj;

import java.util.List;
import u2.c1;
import u2.j1;
import u2.l0;

@l0
public interface f {
    @j1("DELETE From  History")
    void a();

    @j1("DELETE From  History WHERE IdHistory=:idHistory")
    void b(String str);

    @j1("SELECT IdHistory FROM History")
    List<String> c();

    @c1
    void d(e eVar);
}

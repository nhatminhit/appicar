package rj;

import java.util.List;
import u2.c1;
import u2.j1;
import u2.l0;

@l0
public interface j {
    @j1("DELETE From  Kid")
    void a();

    @j1("DELETE From  Kid WHERE IdKid=:idKid")
    void b(String str);

    @j1("SELECT IdKid FROM Kid")
    List<String> c();

    @c1
    void d(i iVar);
}

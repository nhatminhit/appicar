package rj;

import java.util.List;
import u2.c1;
import u2.j1;
import u2.l0;

@l0
public interface v {
    @j1("DELETE From  PriorityChannel")
    void a();

    @j1("DELETE From  PriorityChannel WHERE IdPriorityChannel=:idPriorityChannel")
    void b(String str);

    @c1
    void c(u uVar);

    @j1("SELECT IdPriorityChannel FROM PriorityChannel")
    List<String> d();
}

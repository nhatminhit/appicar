package rj;

import java.util.List;
import u2.c1;
import u2.j1;
import u2.l0;

@l0
public interface d0 {
    @j1("DELETE  From  Story")
    void a();

    @j1("DELETE From  Story WHERE IdStory=:idStory")
    void b(String str);

    @j1("SELECT IdStory FROM Story")
    List<String> c();

    @c1
    void d(c0 c0Var);
}

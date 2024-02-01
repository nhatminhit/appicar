package rj;

import java.util.List;
import u2.c1;
import u2.j1;
import u2.l0;

@l0
public interface z {
    @j1("DELETE From  Review")
    void a();

    @j1("DELETE From  Review WHERE IdReview=:idReview")
    void b(String str);

    @j1("SELECT IdReview FROM Review")
    List<String> c();

    @c1
    void d(y yVar);
}

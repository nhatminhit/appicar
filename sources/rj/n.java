package rj;

import java.util.List;
import u2.c1;
import u2.j1;
import u2.l0;

@l0
public interface n {
    @j1("DELETE From  MusicOffline")
    void a();

    @j1("DELETE From  MusicOffline WHERE nameFodder=:nameFodder and source=:source")
    void b(String str, String str2);

    @j1("SELECT * FROM MusicOffline")
    List<m> c();

    @c1
    void d(m mVar);
}

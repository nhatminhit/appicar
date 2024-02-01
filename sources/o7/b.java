package o7;

import h7.e;
import java.util.Collections;
import java.util.List;
import w7.a;

public final class b implements e {
    public static final b P = new b();
    public final List<h7.b> O;

    public b() {
        this.O = Collections.emptyList();
    }

    public b(h7.b bVar) {
        this.O = Collections.singletonList(bVar);
    }

    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public long b(int i10) {
        a.a(i10 == 0);
        return 0;
    }

    public List<h7.b> d(long j10) {
        return j10 >= 0 ? this.O : Collections.emptyList();
    }

    public int e() {
        return 1;
    }
}

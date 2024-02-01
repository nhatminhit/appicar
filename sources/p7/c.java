package p7;

import h7.b;
import h7.e;
import java.util.Collections;
import java.util.List;
import w7.a;

public final class c implements e {
    public final List<b> O;

    public c(List<b> list) {
        this.O = Collections.unmodifiableList(list);
    }

    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public long b(int i10) {
        a.a(i10 == 0);
        return 0;
    }

    public List<b> d(long j10) {
        return j10 >= 0 ? this.O : Collections.emptyList();
    }

    public int e() {
        return 1;
    }
}

package n7;

import d.g1;
import h7.b;
import h7.e;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import w7.q0;

public final class f implements e {
    public final b O;
    public final long[] P;
    public final Map<String, e> Q;
    public final Map<String, c> R;
    public final Map<String, String> S;

    public f(b bVar, Map<String, e> map, Map<String, c> map2, Map<String, String> map3) {
        this.O = bVar;
        this.R = map2;
        this.S = map3;
        this.Q = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.P = bVar.j();
    }

    public int a(long j10) {
        int h10 = q0.h(this.P, j10, false, false);
        if (h10 < this.P.length) {
            return h10;
        }
        return -1;
    }

    public long b(int i10) {
        return this.P[i10];
    }

    @g1
    public Map<String, e> c() {
        return this.Q;
    }

    public List<b> d(long j10) {
        return this.O.h(j10, this.Q, this.R, this.S);
    }

    public int e() {
        return this.P.length;
    }

    @g1
    public b f() {
        return this.O;
    }
}

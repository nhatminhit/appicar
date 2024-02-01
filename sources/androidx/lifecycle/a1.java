package androidx.lifecycle;

import d.x0;
import fh.g;
import fh.h;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import xe.l0;

public class a1 {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, v0> f2777a = new LinkedHashMap();

    public final void a() {
        for (v0 b10 : this.f2777a.values()) {
            b10.b();
        }
        this.f2777a.clear();
    }

    @x0({x0.a.P})
    @h
    public final v0 b(@g String str) {
        l0.p(str, "key");
        return this.f2777a.get(str);
    }

    @x0({x0.a.P})
    @g
    public final Set<String> c() {
        return new HashSet(this.f2777a.keySet());
    }

    @x0({x0.a.P})
    public final void d(@g String str, @g v0 v0Var) {
        l0.p(str, "key");
        l0.p(v0Var, "viewModel");
        v0 put = this.f2777a.put(str, v0Var);
        if (put != null) {
            put.e();
        }
    }
}

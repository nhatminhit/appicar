package tg;

import java.util.LinkedHashSet;
import java.util.Set;
import og.n0;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Set<n0> f23270a = new LinkedHashSet();

    public synchronized void a(n0 n0Var) {
        this.f23270a.remove(n0Var);
    }

    public synchronized void b(n0 n0Var) {
        this.f23270a.add(n0Var);
    }

    public synchronized boolean c(n0 n0Var) {
        return this.f23270a.contains(n0Var);
    }
}

package h9;

import d.m0;
import java.util.concurrent.Executor;

public final class z implements m0 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f8964a;

    /* renamed from: b  reason: collision with root package name */
    public final c f8965b;

    /* renamed from: c  reason: collision with root package name */
    public final s0 f8966c;

    public z(@m0 Executor executor, @m0 c cVar, @m0 s0 s0Var) {
        this.f8964a = executor;
        this.f8965b = cVar;
        this.f8966c = s0Var;
    }

    public final void o() {
        throw new UnsupportedOperationException();
    }

    public final void p(@m0 m mVar) {
        this.f8964a.execute(new y(this, mVar));
    }
}

package h9;

import d.m0;
import java.util.concurrent.Executor;

public final class b0<TResult, TContinuationResult> implements h<TContinuationResult>, g, e, m0 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f8917a;

    /* renamed from: b  reason: collision with root package name */
    public final c f8918b;

    /* renamed from: c  reason: collision with root package name */
    public final s0 f8919c;

    public b0(@m0 Executor executor, @m0 c cVar, @m0 s0 s0Var) {
        this.f8917a = executor;
        this.f8918b = cVar;
        this.f8919c = s0Var;
    }

    public final void a(TContinuationResult tcontinuationresult) {
        this.f8919c.z(tcontinuationresult);
    }

    public final void b() {
        this.f8919c.A();
    }

    public final void c(@m0 Exception exc) {
        this.f8919c.y(exc);
    }

    public final void o() {
        throw new UnsupportedOperationException();
    }

    public final void p(@m0 m mVar) {
        this.f8917a.execute(new a0(this, mVar));
    }
}

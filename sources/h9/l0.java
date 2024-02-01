package h9;

import d.m0;
import java.util.concurrent.Executor;

public final class l0<TResult, TContinuationResult> implements h<TContinuationResult>, g, e, m0 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f8932a;

    /* renamed from: b  reason: collision with root package name */
    public final l f8933b;

    /* renamed from: c  reason: collision with root package name */
    public final s0 f8934c;

    public l0(@m0 Executor executor, @m0 l lVar, @m0 s0 s0Var) {
        this.f8932a = executor;
        this.f8933b = lVar;
        this.f8934c = s0Var;
    }

    public final void a(TContinuationResult tcontinuationresult) {
        this.f8934c.z(tcontinuationresult);
    }

    public final void b() {
        this.f8934c.A();
    }

    public final void c(@m0 Exception exc) {
        this.f8934c.y(exc);
    }

    public final void o() {
        throw new UnsupportedOperationException();
    }

    public final void p(@m0 m mVar) {
        this.f8932a.execute(new k0(this, mVar));
    }
}

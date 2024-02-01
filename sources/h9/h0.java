package h9;

import d.m0;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class h0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f8926a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8927b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public g f8928c;

    public h0(@m0 Executor executor, @m0 g gVar) {
        this.f8926a = executor;
        this.f8928c = gVar;
    }

    public final void o() {
        synchronized (this.f8927b) {
            this.f8928c = null;
        }
    }

    public final void p(@m0 m mVar) {
        if (!mVar.v() && !mVar.t()) {
            synchronized (this.f8927b) {
                if (this.f8928c != null) {
                    this.f8926a.execute(new g0(this, mVar));
                }
            }
        }
    }
}

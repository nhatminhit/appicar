package h9;

import d.m0;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class f0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f8923a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8924b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public f f8925c;

    public f0(@m0 Executor executor, @m0 f fVar) {
        this.f8923a = executor;
        this.f8925c = fVar;
    }

    public final void o() {
        synchronized (this.f8924b) {
            this.f8925c = null;
        }
    }

    public final void p(@m0 m mVar) {
        synchronized (this.f8924b) {
            if (this.f8925c != null) {
                this.f8923a.execute(new e0(this, mVar));
            }
        }
    }
}

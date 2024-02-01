package h9;

import d.m0;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class j0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f8929a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8930b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public h f8931c;

    public j0(@m0 Executor executor, @m0 h hVar) {
        this.f8929a = executor;
        this.f8931c = hVar;
    }

    public final void o() {
        synchronized (this.f8930b) {
            this.f8931c = null;
        }
    }

    public final void p(@m0 m mVar) {
        if (mVar.v()) {
            synchronized (this.f8930b) {
                if (this.f8931c != null) {
                    this.f8929a.execute(new i0(this, mVar));
                }
            }
        }
    }
}

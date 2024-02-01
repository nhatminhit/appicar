package h9;

import d.m0;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class d0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f8920a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8921b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public e f8922c;

    public d0(@m0 Executor executor, @m0 e eVar) {
        this.f8920a = executor;
        this.f8922c = eVar;
    }

    public final void o() {
        synchronized (this.f8921b) {
            this.f8922c = null;
        }
    }

    public final void p(@m0 m mVar) {
        if (mVar.t()) {
            synchronized (this.f8921b) {
                if (this.f8922c != null) {
                    this.f8920a.execute(new c0(this));
                }
            }
        }
    }
}

package g8;

import com.google.android.gms.common.api.internal.o;
import d.h1;

public abstract class l0 implements Runnable {
    public final /* synthetic */ o O;

    public /* synthetic */ l0(o oVar, k0 k0Var) {
        this.O = oVar;
    }

    @h1
    public abstract void a();

    @h1
    public final void run() {
        this.O.f5689b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
            }
        } catch (RuntimeException e10) {
            this.O.f5688a.t(e10);
        } catch (Throwable th2) {
            this.O.f5689b.unlock();
            throw th2;
        }
        this.O.f5689b.unlock();
    }
}

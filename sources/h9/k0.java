package h9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class k0 implements Runnable {
    public final /* synthetic */ m O;
    public final /* synthetic */ l0 P;

    public k0(l0 l0Var, m mVar) {
        this.P = l0Var;
        this.O = mVar;
    }

    public final void run() {
        try {
            m a10 = this.P.f8933b.a(this.O.r());
            if (a10 == null) {
                this.P.c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = o.f8940b;
            a10.l(executor, this.P);
            a10.i(executor, this.P);
            a10.c(executor, this.P);
        } catch (k e10) {
            if (e10.getCause() instanceof Exception) {
                this.P.c((Exception) e10.getCause());
            } else {
                this.P.c(e10);
            }
        } catch (CancellationException unused) {
            this.P.b();
        } catch (Exception e11) {
            this.P.c(e11);
        }
    }
}

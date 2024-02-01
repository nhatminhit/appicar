package h9;

import java.util.concurrent.Executor;

public final class a0 implements Runnable {
    public final /* synthetic */ m O;
    public final /* synthetic */ b0 P;

    public a0(b0 b0Var, m mVar) {
        this.P = b0Var;
        this.O = mVar;
    }

    public final void run() {
        try {
            m mVar = (m) this.P.f8918b.a(this.O);
            if (mVar == null) {
                this.P.c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = o.f8940b;
            mVar.l(executor, this.P);
            mVar.i(executor, this.P);
            mVar.c(executor, this.P);
        } catch (k e10) {
            if (e10.getCause() instanceof Exception) {
                this.P.f8919c.y((Exception) e10.getCause());
            } else {
                this.P.f8919c.y(e10);
            }
        } catch (Exception e11) {
            this.P.f8919c.y(e11);
        }
    }
}

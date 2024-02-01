package h9;

import java.util.concurrent.Callable;

public final class v0 implements Runnable {
    public final /* synthetic */ s0 O;
    public final /* synthetic */ Callable P;

    public v0(s0 s0Var, Callable callable) {
        this.O = s0Var;
        this.P = callable;
    }

    public final void run() {
        try {
            this.O.z(this.P.call());
        } catch (Exception e10) {
            this.O.y(e10);
        } catch (Throwable th2) {
            this.O.y(new RuntimeException(th2));
        }
    }
}

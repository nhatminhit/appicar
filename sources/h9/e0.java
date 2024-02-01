package h9;

public final class e0 implements Runnable {
    public final /* synthetic */ m O;
    public final /* synthetic */ f0 P;

    public e0(f0 f0Var, m mVar) {
        this.P = f0Var;
        this.O = mVar;
    }

    public final void run() {
        synchronized (this.P.f8924b) {
            f0 f0Var = this.P;
            if (f0Var.f8925c != null) {
                f0Var.f8925c.a(this.O);
            }
        }
    }
}

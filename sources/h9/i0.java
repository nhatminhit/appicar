package h9;

public final class i0 implements Runnable {
    public final /* synthetic */ m O;
    public final /* synthetic */ j0 P;

    public i0(j0 j0Var, m mVar) {
        this.P = j0Var;
        this.O = mVar;
    }

    public final void run() {
        synchronized (this.P.f8930b) {
            j0 j0Var = this.P;
            if (j0Var.f8931c != null) {
                j0Var.f8931c.a(this.O.r());
            }
        }
    }
}

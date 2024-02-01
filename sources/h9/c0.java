package h9;

public final class c0 implements Runnable {
    public final /* synthetic */ d0 O;

    public c0(d0 d0Var) {
        this.O = d0Var;
    }

    public final void run() {
        synchronized (this.O.f8921b) {
            d0 d0Var = this.O;
            if (d0Var.f8922c != null) {
                d0Var.f8922c.b();
            }
        }
    }
}

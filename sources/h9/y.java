package h9;

public final class y implements Runnable {
    public final /* synthetic */ m O;
    public final /* synthetic */ z P;

    public y(z zVar, m mVar) {
        this.P = zVar;
        this.O = mVar;
    }

    public final void run() {
        if (this.O.t()) {
            this.P.f8966c.A();
            return;
        }
        try {
            this.P.f8966c.z(this.P.f8965b.a(this.O));
        } catch (k e10) {
            if (e10.getCause() instanceof Exception) {
                this.P.f8966c.y((Exception) e10.getCause());
            } else {
                this.P.f8966c.y(e10);
            }
        } catch (Exception e11) {
            this.P.f8966c.y(e11);
        }
    }
}

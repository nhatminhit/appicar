package androidx.lifecycle;

public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ j O;
    public final /* synthetic */ Runnable P;

    public /* synthetic */ i(j jVar, Runnable runnable) {
        this.O = jVar;
        this.P = runnable;
    }

    public final void run() {
        j.d(this.O, this.P);
    }
}

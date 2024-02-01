package r2;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ androidx.profileinstaller.a O;
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ a(androidx.profileinstaller.a aVar, int i10, Object obj) {
        this.O = aVar;
        this.P = i10;
        this.Q = obj;
    }

    public final void run() {
        this.O.e(this.P, this.Q);
    }
}

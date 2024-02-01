package r2;

import androidx.profileinstaller.b;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ b.d O;
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ f(b.d dVar, int i10, Object obj) {
        this.O = dVar;
        this.P = i10;
        this.Q = obj;
    }

    public final void run() {
        this.O.b(this.P, this.Q);
    }
}

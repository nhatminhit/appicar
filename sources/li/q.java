package li;

import li.p;

public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ p.b O;
    public final /* synthetic */ Object[] P;

    public /* synthetic */ q(p.b bVar, Object[] objArr) {
        this.O = bVar;
        this.P = objArr;
    }

    public final void run() {
        this.O.b(this.P);
    }
}

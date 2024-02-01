package vj;

import vj.d;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ d.c O;
    public final /* synthetic */ String P;

    public /* synthetic */ f(d.c cVar, String str) {
        this.O = cVar;
        this.P = str;
    }

    public final void run() {
        this.O.e(this.P);
    }
}

package g8;

import com.google.android.gms.common.ConnectionResult;

public final class v1 implements Runnable {
    public final /* synthetic */ y1 O;

    public v1(y1 y1Var) {
        this.O = y1Var;
    }

    public final void run() {
        this.O.U.b(new ConnectionResult(4));
    }
}

package g8;

import android.os.IBinder;

public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ i O;
    public final /* synthetic */ IBinder P;

    public /* synthetic */ n1(i iVar, IBinder iBinder) {
        this.O = iVar;
        this.P = iBinder;
    }

    public final void run() {
        this.O.z(this.P);
    }
}

package j8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import w8.d0;

@d0
public final class q1 implements ServiceConnection {
    public final int O;
    public final /* synthetic */ d P;

    public q1(d dVar, int i10) {
        this.P = dVar;
        this.O = i10;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d dVar = this.P;
        if (iBinder == null) {
            d.l0(dVar, 16);
            return;
        }
        synchronized (dVar.f9710b0) {
            d dVar2 = this.P;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            dVar2.f9711c0 = (queryLocalInterface == null || !(queryLocalInterface instanceof n)) ? new f1(iBinder) : (n) queryLocalInterface;
        }
        this.P.m0(0, (Bundle) null, this.O);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.P.f9710b0) {
            this.P.f9711c0 = null;
        }
        Handler handler = this.P.Z;
        handler.sendMessage(handler.obtainMessage(6, this.O, 1));
    }
}

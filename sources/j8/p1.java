package j8;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.zzj;
import d.g;
import d.m0;
import d.o0;
import w8.d0;

@d0
public final class p1 extends e1 {
    @o0
    public d O;
    public final int P;

    public p1(@m0 d dVar, int i10) {
        this.O = dVar;
        this.P = i10;
    }

    @g
    public final void R0(int i10, @m0 IBinder iBinder, @o0 Bundle bundle) {
        s.m(this.O, "onPostInitComplete can be called only once per call to getRemoteService");
        this.O.W(i10, iBinder, bundle, this.P);
        this.O = null;
    }

    @g
    public final void a1(int i10, @m0 IBinder iBinder, @m0 zzj zzj) {
        d dVar = this.O;
        s.m(dVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        s.l(zzj);
        d.k0(dVar, zzj);
        R0(i10, iBinder, zzj.O);
    }

    @g
    public final void v0(int i10, @o0 Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}

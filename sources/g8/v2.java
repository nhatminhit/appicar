package g8;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import d.m0;
import d.o0;
import f8.a;
import f8.k;
import j8.s;

public final class v2 implements k.b, k.c {
    public final a O;
    public final boolean P;
    @o0
    public w2 Q;

    public v2(a aVar, boolean z10) {
        this.O = aVar;
        this.P = z10;
    }

    public final void D(int i10) {
        b().D(i10);
    }

    public final void H(@m0 ConnectionResult connectionResult) {
        b().b0(connectionResult, this.O, this.P);
    }

    public final void J(@o0 Bundle bundle) {
        b().J(bundle);
    }

    public final void a(w2 w2Var) {
        this.Q = w2Var;
    }

    public final w2 b() {
        s.m(this.Q, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.Q;
    }
}

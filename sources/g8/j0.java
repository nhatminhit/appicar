package g8;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.o;
import d.m0;
import d.o0;
import f8.k;
import f9.f;
import j8.e;
import j8.s;

public final class j0 implements k.b, k.c {
    public final /* synthetic */ o O;

    public /* synthetic */ j0(o oVar, i0 i0Var) {
        this.O = oVar;
    }

    public final void D(int i10) {
    }

    public final void H(@m0 ConnectionResult connectionResult) {
        this.O.f5689b.lock();
        try {
            if (this.O.q(connectionResult)) {
                this.O.i();
                this.O.n();
            } else {
                this.O.l(connectionResult);
            }
        } finally {
            this.O.f5689b.unlock();
        }
    }

    public final void J(@o0 Bundle bundle) {
        e eVar = (e) s.l(this.O.f5705r);
        ((f) s.l(this.O.f5698k)).x(new h0(this.O));
    }
}

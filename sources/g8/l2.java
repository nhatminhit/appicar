package g8;

import com.google.android.gms.common.ConnectionResult;
import d.m0;
import d.o0;
import f8.k;

public final class l2 implements k.c {
    public final int O;
    public final k P;
    @o0
    public final k.c Q;
    public final /* synthetic */ m2 R;

    public l2(m2 m2Var, int i10, @o0 k kVar, k.c cVar) {
        this.R = m2Var;
        this.O = i10;
        this.P = kVar;
        this.Q = cVar;
    }

    public final void H(@m0 ConnectionResult connectionResult) {
        "beginFailureResolution for ".concat(String.valueOf(connectionResult));
        this.R.t(connectionResult, this.O);
    }
}

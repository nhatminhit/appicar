package p8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import d.o0;
import g8.r;
import h9.n;

public final class y extends a {
    public final /* synthetic */ n O;

    public y(a0 a0Var, n nVar) {
        this.O = nVar;
    }

    public final void s0(Status status, @o0 ModuleInstallIntentResponse moduleInstallIntentResponse) {
        r.d(status, moduleInstallIntentResponse, this.O);
    }
}

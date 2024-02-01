package p8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import d.o0;
import g8.r;
import h9.n;
import java.util.concurrent.atomic.AtomicReference;
import o8.a;

public final class w extends a {
    public final /* synthetic */ AtomicReference O;
    public final /* synthetic */ n P;
    public final /* synthetic */ a Q;
    public final /* synthetic */ a0 R;

    public w(a0 a0Var, AtomicReference atomicReference, n nVar, a aVar) {
        this.R = a0Var;
        this.O = atomicReference;
        this.P = nVar;
        this.Q = aVar;
    }

    public final void W0(Status status, @o0 ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.O.set(moduleInstallResponse);
        }
        r.d(status, null, this.P);
        if (!status.r1() || (moduleInstallResponse != null && moduleInstallResponse.f1())) {
            this.R.S(g.c(this.Q, a.class.getSimpleName()), 27306);
        }
    }
}

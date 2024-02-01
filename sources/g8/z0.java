package g8;

import com.google.android.gms.common.api.internal.u;

public final class z0 implements Runnable {
    public final /* synthetic */ a1 O;

    public z0(a1 a1Var) {
        this.O = a1Var;
    }

    public final void run() {
        u uVar = this.O.f8183a;
        uVar.P.j(uVar.P.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}

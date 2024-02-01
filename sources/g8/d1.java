package g8;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.internal.b;

public final class d1 implements Runnable {
    public final /* synthetic */ ConnectionResult O;
    public final /* synthetic */ e1 P;

    public d1(e1 e1Var, ConnectionResult connectionResult) {
        this.P = e1Var;
        this.O = connectionResult;
    }

    public final void run() {
        e1 e1Var = this.P;
        u uVar = (u) e1Var.f8203f.Z.get(e1Var.f8199b);
        if (uVar != null) {
            if (this.O.h1()) {
                this.P.f8202e = true;
                if (this.P.f8198a.v()) {
                    this.P.h();
                    return;
                }
                try {
                    e1 e1Var2 = this.P;
                    e1Var2.f8198a.i((b) null, e1Var2.f8198a.h());
                } catch (SecurityException unused) {
                    this.P.f8198a.j("Failed to get service from broker.");
                    uVar.F(new ConnectionResult(10), (Exception) null);
                }
            } else {
                uVar.F(this.O, (Exception) null);
            }
        }
    }
}

package g8;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import d.j0;
import j8.s;

public final class q2 implements Runnable {
    public final o2 O;
    public final /* synthetic */ r2 P;

    public q2(r2 r2Var, o2 o2Var) {
        this.P = r2Var;
        this.O = o2Var;
    }

    @j0
    public final void run() {
        if (this.P.P) {
            ConnectionResult b10 = this.O.b();
            if (b10.g1()) {
                r2 r2Var = this.P;
                r2Var.O.startActivityForResult(GoogleApiActivity.a(r2Var.b(), (PendingIntent) s.l(b10.f1()), this.O.a(), false), 1);
                return;
            }
            r2 r2Var2 = this.P;
            if (r2Var2.S.e(r2Var2.b(), b10.X0(), (String) null) != null) {
                r2 r2Var3 = this.P;
                r2Var3.S.K(r2Var3.b(), this.P.O, b10.X0(), 2, this.P);
            } else if (b10.X0() == 18) {
                r2 r2Var4 = this.P;
                Dialog F = r2Var4.S.F(r2Var4.b(), this.P);
                r2 r2Var5 = this.P;
                r2Var5.S.G(r2Var5.b().getApplicationContext(), new p2(this, F));
            } else {
                this.P.m(b10, this.O.a());
            }
        }
    }
}

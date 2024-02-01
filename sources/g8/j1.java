package g8;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import d.m0;
import d8.e;
import f8.b;
import h9.m;
import h9.n;
import java.util.concurrent.CancellationException;

public final class j1 extends r2 {
    public n T = new n();

    public j1(h hVar) {
        super(hVar, e.x());
        this.O.i("GmsAvailabilityHelper", this);
    }

    public static j1 u(@m0 Activity activity) {
        h c10 = LifecycleCallback.c(activity);
        j1 j1Var = (j1) c10.o("GmsAvailabilityHelper", j1.class);
        if (j1Var == null) {
            return new j1(c10);
        }
        if (j1Var.T.a().u()) {
            j1Var.T = new n();
        }
        return j1Var;
    }

    public final void h() {
        super.h();
        this.T.d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public final void n(ConnectionResult connectionResult, int i10) {
        String Z0 = connectionResult.Z0();
        if (Z0 == null) {
            Z0 = "Error connecting to Google Play services";
        }
        this.T.b(new b(new Status(connectionResult, Z0, connectionResult.X0())));
    }

    public final void o() {
        Activity p10 = this.O.p();
        if (p10 == null) {
            this.T.d(new b(new Status(8)));
            return;
        }
        int j10 = this.S.j(p10);
        if (j10 == 0) {
            this.T.e(null);
        } else if (!this.T.a().u()) {
            t(new ConnectionResult(j10, (PendingIntent) null), 0);
        }
    }

    public final m v() {
        return this.T.a();
    }
}

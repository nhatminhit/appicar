package g8;

import android.app.Activity;
import androidx.collection.b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.d;
import d.j0;
import d8.e;
import j8.s;
import w8.d0;

public final class w extends r2 {
    public final b T = new b();
    public final d U;

    @d0
    public w(h hVar, d dVar, e eVar) {
        super(hVar, eVar);
        this.U = dVar;
        this.O.i("ConnectionlessLifecycleHelper", this);
    }

    @j0
    public static void v(Activity activity, d dVar, c cVar) {
        h c10 = LifecycleCallback.c(activity);
        w wVar = (w) c10.o("ConnectionlessLifecycleHelper", w.class);
        if (wVar == null) {
            wVar = new w(c10, dVar, e.x());
        }
        s.m(cVar, "ApiKey cannot be null");
        wVar.T.add(cVar);
        dVar.d(wVar);
    }

    public final void i() {
        super.i();
        w();
    }

    public final void k() {
        super.k();
        w();
    }

    public final void l() {
        super.l();
        this.U.e(this);
    }

    public final void n(ConnectionResult connectionResult, int i10) {
        this.U.M(connectionResult, i10);
    }

    public final void o() {
        this.U.b();
    }

    public final b u() {
        return this.T;
    }

    public final void w() {
        if (!this.T.isEmpty()) {
            this.U.d(this);
        }
    }
}

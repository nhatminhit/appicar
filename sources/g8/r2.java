package g8;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.v;
import b9.u;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import d.o0;
import d8.e;
import java.util.concurrent.atomic.AtomicReference;
import w8.d0;

public abstract class r2 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean P;
    public final AtomicReference Q = new AtomicReference((Object) null);
    public final Handler R = new u(Looper.getMainLooper());
    public final e S;

    @d0
    public r2(h hVar, e eVar) {
        super(hVar);
        this.S = eVar;
    }

    public static final int q(@o0 o2 o2Var) {
        if (o2Var == null) {
            return -1;
        }
        return o2Var.a();
    }

    public final void f(int i10, int i11, Intent intent) {
        o2 o2Var = (o2) this.Q.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int j10 = this.S.j(b());
                if (j10 == 0) {
                    p();
                    return;
                } else if (o2Var != null) {
                    if (o2Var.b().X0() == 18 && j10 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i11 == -1) {
            p();
            return;
        } else if (i11 == 0) {
            if (o2Var != null) {
                int i12 = 13;
                if (intent != null) {
                    i12 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                m(new ConnectionResult(i12, (PendingIntent) null, o2Var.b().toString()), q(o2Var));
                return;
            }
            return;
        }
        if (o2Var != null) {
            m(o2Var.b(), o2Var.a());
        }
    }

    public final void g(@o0 Bundle bundle) {
        super.g(bundle);
        if (bundle != null) {
            this.Q.set(bundle.getBoolean("resolving_error", false) ? new o2(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void j(Bundle bundle) {
        super.j(bundle);
        o2 o2Var = (o2) this.Q.get();
        if (o2Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", o2Var.a());
            bundle.putInt("failed_status", o2Var.b().X0());
            bundle.putParcelable("failed_resolution", o2Var.b().f1());
        }
    }

    public void k() {
        super.k();
        this.P = true;
    }

    public void l() {
        super.l();
        this.P = false;
    }

    public final void m(ConnectionResult connectionResult, int i10) {
        this.Q.set((Object) null);
        n(connectionResult, i10);
    }

    public abstract void n(ConnectionResult connectionResult, int i10);

    public abstract void o();

    public final void onCancel(DialogInterface dialogInterface) {
        m(new ConnectionResult(13, (PendingIntent) null), q((o2) this.Q.get()));
    }

    public final void p() {
        this.Q.set((Object) null);
        o();
    }

    public final void t(ConnectionResult connectionResult, int i10) {
        o2 o2Var = new o2(connectionResult, i10);
        AtomicReference atomicReference = this.Q;
        while (!v.a(atomicReference, (Object) null, o2Var)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.R.post(new q2(this, o2Var));
    }
}

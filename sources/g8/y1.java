package g8;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import d.g;
import d.h1;
import d.m0;
import d.o0;
import f8.a;
import f8.k;
import f9.e;
import f9.f;
import g9.c;
import j8.s;
import java.util.Set;

public final class y1 extends c implements k.b, k.c {
    public static final a.C0126a V = e.f7500c;
    public final Context O;
    public final Handler P;
    public final a.C0126a Q;
    public final Set R;
    public final j8.e S;
    public f T;
    public x1 U;

    @h1
    public y1(Context context, Handler handler, @m0 j8.e eVar) {
        a.C0126a aVar = V;
        this.O = context;
        this.P = handler;
        this.S = (j8.e) s.m(eVar, "ClientSettings must not be null");
        this.R = eVar.i();
        this.Q = aVar;
    }

    public static /* bridge */ /* synthetic */ void a2(y1 y1Var, zak zak) {
        ConnectionResult X0 = zak.X0();
        if (X0.h1()) {
            zav zav = (zav) s.l(zak.Z0());
            X0 = zav.X0();
            if (!X0.h1()) {
                String valueOf = String.valueOf(X0);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            } else {
                y1Var.U.c(zav.Z0(), y1Var.R);
                y1Var.T.d();
            }
        }
        y1Var.U.b(X0);
        y1Var.T.d();
    }

    @h1
    public final void D(int i10) {
        this.T.d();
    }

    @h1
    public final void H(@m0 ConnectionResult connectionResult) {
        this.U.b(connectionResult);
    }

    @h1
    public final void J(@o0 Bundle bundle) {
        this.T.x(this);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [f9.f, f8.a$f] */
    @h1
    public final void b2(x1 x1Var) {
        f fVar = this.T;
        if (fVar != null) {
            fVar.d();
        }
        this.S.o(Integer.valueOf(System.identityHashCode(this)));
        a.C0126a aVar = this.Q;
        Context context = this.O;
        Looper looper = this.P.getLooper();
        j8.e eVar = this.S;
        this.T = aVar.c(context, looper, eVar, eVar.k(), this, this);
        this.U = x1Var;
        Set set = this.R;
        if (set == null || set.isEmpty()) {
            this.P.post(new v1(this));
        } else {
            this.T.f();
        }
    }

    public final void c2() {
        f fVar = this.T;
        if (fVar != null) {
            fVar.d();
        }
    }

    @g
    public final void h0(zak zak) {
        this.P.post(new w1(this, zak));
    }
}

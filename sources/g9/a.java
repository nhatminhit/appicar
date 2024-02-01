package g9;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import d.m0;
import d.o0;
import d8.j;
import f8.k;
import f9.f;
import j8.d;
import j8.e;
import j8.h;
import j8.s;

@e8.a
public class a extends h<f> implements f {
    public static final /* synthetic */ int G0 = 0;
    public final boolean C0 = true;
    public final e D0;
    public final Bundle E0;
    @o0
    public final Integer F0;

    public a(@m0 Context context, @m0 Looper looper, boolean z10, @m0 e eVar, @m0 Bundle bundle, @m0 k.b bVar, @m0 k.c cVar) {
        super(context, looper, 44, eVar, bVar, cVar);
        this.D0 = eVar;
        this.E0 = bundle;
        this.F0 = eVar.l();
    }

    @e8.a
    @m0
    public static Bundle u0(@m0 e eVar) {
        eVar.k();
        Integer l10 = eVar.l();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.b());
        if (l10 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", l10.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @m0
    public final /* synthetic */ IInterface A(@m0 IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @m0
    public final Bundle I() {
        if (!G().getPackageName().equals(this.D0.h())) {
            this.E0.putString("com.google.android.gms.signin.internal.realClientPackageName", this.D0.h());
        }
        return this.E0;
    }

    @m0
    public final String N() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @m0
    public final String O() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void c() {
        try {
            ((f) M()).Y1(((Integer) s.l(this.F0)).intValue());
        } catch (RemoteException unused) {
        }
    }

    public final void f() {
        e(new d.C0164d());
    }

    public final int p() {
        return j.f6608a;
    }

    public final void s(@m0 b bVar, boolean z10) {
        try {
            ((f) M()).Z1(bVar, ((Integer) s.l(this.F0)).intValue(), z10);
        } catch (RemoteException unused) {
        }
    }

    public final boolean v() {
        return this.C0;
    }

    public final void x(e eVar) {
        s.m(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account d10 = this.D0.d();
            ((f) M()).a2(new zai(1, new zat(d10, ((Integer) s.l(this.F0)).intValue(), "<<default account>>".equals(d10.name) ? b8.b.b(G()).c() : null)), eVar);
        } catch (RemoteException e10) {
            try {
                eVar.h0(new zak(1, new ConnectionResult(8, (PendingIntent) null), (zav) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }
}

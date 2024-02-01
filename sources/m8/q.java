package m8;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b9.f;
import com.google.android.gms.common.Feature;
import d.m0;
import d.o0;
import g8.d;
import g8.j;
import j8.a0;
import j8.e;
import j8.h;

public final class q extends h {
    public final a0 C0;

    public q(Context context, Looper looper, e eVar, a0 a0Var, d dVar, j jVar) {
        super(context, looper, 270, eVar, dVar, jVar);
        this.C0 = a0Var;
    }

    @o0
    public final /* synthetic */ IInterface A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof j ? (j) queryLocalInterface : new j(iBinder);
    }

    public final Feature[] D() {
        return f.f4746b;
    }

    public final Bundle I() {
        return this.C0.b();
    }

    @m0
    public final String N() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @m0
    public final String O() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean R() {
        return true;
    }

    public final int p() {
        return 203400000;
    }
}

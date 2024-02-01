package p8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b9.v;
import com.google.android.gms.common.Feature;
import d.m0;
import d.o0;
import g8.d;
import g8.j;
import j8.e;
import j8.h;

public final class b0 extends h {
    public b0(Context context, Looper looper, e eVar, d dVar, j jVar) {
        super(context, looper, 308, eVar, dVar, jVar);
    }

    @o0
    public final /* synthetic */ IInterface A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return queryLocalInterface instanceof h ? (h) queryLocalInterface : new h(iBinder);
    }

    public final Feature[] D() {
        return v.f4758b;
    }

    @m0
    public final String N() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @m0
    public final String O() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    public final boolean R() {
        return true;
    }

    public final boolean a0() {
        return true;
    }

    public final int p() {
        return 17895000;
    }
}

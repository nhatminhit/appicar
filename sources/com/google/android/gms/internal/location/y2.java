package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import d9.p0;
import g8.d;
import g8.j;
import j8.e;
import j8.h;
import j8.s;

public final class y2 extends h {
    public y2(Context context, Looper looper, e eVar, d dVar, j jVar) {
        super(context, looper, 23, eVar, dVar, jVar);
    }

    public final /* synthetic */ IInterface A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof g3 ? (g3) queryLocalInterface : new f3(iBinder);
    }

    public final Feature[] D() {
        return p0.f6717l;
    }

    public final Bundle I() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", "activity_recognition");
        return bundle;
    }

    public final String N() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String O() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final boolean a0() {
        return true;
    }

    public final int p() {
        return 11717000;
    }

    public final void u0(PendingIntent pendingIntent) throws RemoteException {
        s.l(pendingIntent);
        ((g3) M()).U0(pendingIntent);
    }
}

package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import d9.t0;

public final class z1 extends t0 {
    public final v1 O;

    public z1(v1 v1Var) {
        this.O = v1Var;
    }

    public final void S0(LocationResult locationResult) throws RemoteException {
        this.O.b().d(new w1(this, locationResult));
    }

    public final void Y1() {
        this.O.b().a();
    }

    public final z1 b0(f fVar) {
        this.O.a(fVar);
        return this;
    }

    public final void n1(LocationAvailability locationAvailability) throws RemoteException {
        this.O.b().d(new x1(this, locationAvailability));
    }

    public final void w() {
        this.O.b().d(new y1(this));
    }
}

package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class h3 extends b0 implements i3 {
    public h3() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        c1.b(parcel);
        a0((Status) c1.a(parcel, Status.CREATOR), (Location) c1.a(parcel, Location.CREATOR));
        return true;
    }
}

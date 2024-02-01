package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

public abstract class j3 extends b0 implements k3 {
    public j3() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        c1.b(parcel);
        j0((LocationSettingsResult) c1.a(parcel, LocationSettingsResult.CREATOR));
        return true;
    }
}

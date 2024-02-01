package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class b3 extends b0 implements c3 {
    public b3() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            c1.b(parcel);
            J1((zzg) c1.a(parcel, zzg.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            h();
        }
        return true;
    }
}

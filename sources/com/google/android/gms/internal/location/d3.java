package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class d3 extends b0 implements e3 {
    public d3() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            c1.b(parcel);
            V1(readInt, createStringArray);
        } else if (i10 == 2) {
            int readInt2 = parcel.readInt();
            String[] createStringArray2 = parcel.createStringArray();
            c1.b(parcel);
            n0(readInt2, createStringArray2);
        } else if (i10 != 3) {
            return false;
        } else {
            c1.b(parcel);
            p1(parcel.readInt(), (PendingIntent) c1.a(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}

package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import l8.a;

public final class e2 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        int i10 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            switch (a.O(X)) {
                case 1:
                    i10 = a.Z(parcel, X);
                    break;
                case 2:
                    iBinder = a.Y(parcel, X);
                    break;
                case 3:
                    iBinder2 = a.Y(parcel, X);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) a.C(parcel, X, PendingIntent.CREATOR);
                    break;
                case 5:
                    str = a.G(parcel, X);
                    break;
                case 6:
                    str2 = a.G(parcel, X);
                    break;
                default:
                    a.h0(parcel, X);
                    break;
            }
        }
        a.N(parcel, i02);
        return new zzdb(i10, iBinder, iBinder2, pendingIntent, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdb[i10];
    }
}

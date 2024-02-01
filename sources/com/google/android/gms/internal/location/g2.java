package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import l8.a;

public final class g2 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        zzdd zzdd = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        String str = null;
        int i10 = 1;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            switch (a.O(X)) {
                case 1:
                    i10 = a.Z(parcel, X);
                    break;
                case 2:
                    zzdd = (zzdd) a.C(parcel, X, zzdd.CREATOR);
                    break;
                case 3:
                    iBinder = a.Y(parcel, X);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) a.C(parcel, X, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = a.Y(parcel, X);
                    break;
                case 6:
                    iBinder3 = a.Y(parcel, X);
                    break;
                case 8:
                    str = a.G(parcel, X);
                    break;
                default:
                    a.h0(parcel, X);
                    break;
            }
        }
        a.N(parcel, i02);
        return new zzdf(i10, zzdd, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdf[i10];
    }
}

package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import l8.a;

public final class z2 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        Status status = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            if (a.O(X) != 1) {
                a.h0(parcel, X);
            } else {
                status = (Status) a.C(parcel, X, Status.CREATOR);
            }
        }
        a.N(parcel, i02);
        return new zzg(status);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzg[i10];
    }
}

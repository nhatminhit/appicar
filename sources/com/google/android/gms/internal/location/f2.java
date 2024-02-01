package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import l8.a;

public final class f2 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i02 = a.i0(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        LocationRequest locationRequest = null;
        ArrayList<ClientIdentity> arrayList = null;
        String str = null;
        String str2 = null;
        long j10 = Long.MAX_VALUE;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                locationRequest = (LocationRequest) a.C(parcel2, X, LocationRequest.CREATOR);
            } else if (O != 5) {
                switch (O) {
                    case 8:
                        z10 = a.P(parcel2, X);
                        break;
                    case 9:
                        z11 = a.P(parcel2, X);
                        break;
                    case 10:
                        str = a.G(parcel2, X);
                        break;
                    case 11:
                        z12 = a.P(parcel2, X);
                        break;
                    case 12:
                        z13 = a.P(parcel2, X);
                        break;
                    case 13:
                        str2 = a.G(parcel2, X);
                        break;
                    case 14:
                        j10 = a.c0(parcel2, X);
                        break;
                    default:
                        a.h0(parcel2, X);
                        break;
                }
            } else {
                arrayList = a.L(parcel2, X, ClientIdentity.CREATOR);
            }
        }
        a.N(parcel2, i02);
        return new zzdd(locationRequest, arrayList, z10, z11, str, z12, z13, str2, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdd[i10];
    }
}

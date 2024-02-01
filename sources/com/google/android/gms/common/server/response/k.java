package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;
import l8.a;

public final class k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        String str = null;
        String str2 = null;
        zaa zaa = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            switch (a.O(X)) {
                case 1:
                    i10 = a.Z(parcel, X);
                    break;
                case 2:
                    i11 = a.Z(parcel, X);
                    break;
                case 3:
                    z10 = a.P(parcel, X);
                    break;
                case 4:
                    i12 = a.Z(parcel, X);
                    break;
                case 5:
                    z11 = a.P(parcel, X);
                    break;
                case 6:
                    str = a.G(parcel, X);
                    break;
                case 7:
                    i13 = a.Z(parcel, X);
                    break;
                case 8:
                    str2 = a.G(parcel, X);
                    break;
                case 9:
                    zaa = (zaa) a.C(parcel, X, zaa.CREATOR);
                    break;
                default:
                    a.h0(parcel, X);
                    break;
            }
        }
        a.N(parcel, i02);
        return new FastJsonResponse.Field(i10, i11, z10, i12, z11, str, i13, str2, zaa);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new FastJsonResponse.Field[i10];
    }
}

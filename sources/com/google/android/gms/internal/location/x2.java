package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import java.util.List;
import l8.a;

public final class x2 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        List o10 = r2.o();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        zzd zzd = null;
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
                    str = a.G(parcel, X);
                    break;
                case 4:
                    str2 = a.G(parcel, X);
                    break;
                case 5:
                    i12 = a.Z(parcel, X);
                    break;
                case 6:
                    str3 = a.G(parcel, X);
                    break;
                case 7:
                    zzd = (zzd) a.C(parcel, X, zzd.CREATOR);
                    break;
                case 8:
                    o10 = a.L(parcel, X, Feature.CREATOR);
                    break;
                default:
                    a.h0(parcel, X);
                    break;
            }
        }
        a.N(parcel, i02);
        return new zzd(i10, i11, str, str2, str3, i12, o10, zzd);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzd[i10];
    }
}

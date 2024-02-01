package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import l8.a;

public final class h2 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i02 = a.i0(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i10 = 0;
        short s10 = 0;
        int i11 = 0;
        String str = null;
        float f10 = 0.0f;
        long j10 = 0;
        int i12 = -1;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            switch (a.O(X)) {
                case 1:
                    str = a.G(parcel2, X);
                    break;
                case 2:
                    j10 = a.c0(parcel2, X);
                    break;
                case 3:
                    s10 = a.f0(parcel2, X);
                    break;
                case 4:
                    d10 = a.T(parcel2, X);
                    break;
                case 5:
                    d11 = a.T(parcel2, X);
                    break;
                case 6:
                    f10 = a.V(parcel2, X);
                    break;
                case 7:
                    i10 = a.Z(parcel2, X);
                    break;
                case 8:
                    i11 = a.Z(parcel2, X);
                    break;
                case 9:
                    i12 = a.Z(parcel2, X);
                    break;
                default:
                    a.h0(parcel2, X);
                    break;
            }
        }
        a.N(parcel2, i02);
        return new zzdh(str, i10, s10, d10, d11, f10, j10, i11, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdh[i10];
    }
}

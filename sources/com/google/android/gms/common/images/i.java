package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import l8.a;

public final class i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        int i10 = 0;
        int i11 = 0;
        Uri uri = null;
        int i12 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i10 = a.Z(parcel, X);
            } else if (O == 2) {
                uri = (Uri) a.C(parcel, X, Uri.CREATOR);
            } else if (O == 3) {
                i12 = a.Z(parcel, X);
            } else if (O != 4) {
                a.h0(parcel, X);
            } else {
                i11 = a.Z(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new WebImage(i10, uri, i12, i11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new WebImage[i10];
    }
}

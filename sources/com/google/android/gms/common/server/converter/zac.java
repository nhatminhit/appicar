package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import l8.b;
import s8.c;

@SafeParcelable.a(creator = "StringToIntConverterEntryCreator")
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new c();
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(id = 2)
    public final String P;
    @SafeParcelable.c(id = 3)
    public final int Q;

    @SafeParcelable.b
    public zac(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) int i11) {
        this.O = i10;
        this.P = str;
        this.Q = i11;
    }

    public zac(String str, int i10) {
        this.O = 1;
        this.P = str;
        this.Q = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.Y(parcel, 2, this.P, false);
        b.F(parcel, 3, this.Q);
        b.b(parcel, a10);
    }
}

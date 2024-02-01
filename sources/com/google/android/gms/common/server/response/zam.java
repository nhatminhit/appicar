package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import j8.w;
import l8.b;

@SafeParcelable.a(creator = "FieldMapPairCreator")
@w
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new l();
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(id = 2)
    public final String P;
    @SafeParcelable.c(id = 3)
    public final FastJsonResponse.Field Q;

    @SafeParcelable.b
    public zam(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) FastJsonResponse.Field field) {
        this.O = i10;
        this.P = str;
        this.Q = field;
    }

    public zam(String str, FastJsonResponse.Field field) {
        this.O = 1;
        this.P = str;
        this.Q = field;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.Y(parcel, 2, this.P, false);
        b.S(parcel, 3, this.Q, i10, false);
        b.b(parcel, a10);
    }
}

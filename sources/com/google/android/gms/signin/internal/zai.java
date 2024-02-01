package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;
import g9.h;
import l8.b;

@SafeParcelable.a(creator = "SignInRequestCreator")
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new h();
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getResolveAccountRequest", id = 2)
    public final zat P;

    @SafeParcelable.b
    public zai(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) zat zat) {
        this.O = i10;
        this.P = zat;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.S(parcel, 2, this.P, i10, false);
        b.b(parcel, a10);
    }
}

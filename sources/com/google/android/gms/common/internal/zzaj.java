package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j8.m1;
import l8.b;

@SafeParcelable.a(creator = "ValidateAccountRequestCreator")
@Deprecated
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new m1();
    @SafeParcelable.h(id = 1)
    public final int O;

    @SafeParcelable.b
    public zzaj(@SafeParcelable.e(id = 1) int i10) {
        this.O = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.b(parcel, a10);
    }
}

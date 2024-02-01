package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import f8.u;
import l8.b;

@SafeParcelable.a(creator = "FusedLocationProviderResultCreator")
@SafeParcelable.g({1000})
public final class zzg extends AbstractSafeParcelable implements u {
    public static final Parcelable.Creator<zzg> CREATOR = new z2();
    public static final zzg P = new zzg(Status.U);
    @SafeParcelable.c(getter = "getStatus", id = 1)
    public final Status O;

    @SafeParcelable.b
    public zzg(@SafeParcelable.e(id = 1) Status status) {
        this.O = status;
    }

    public final Status g() {
        return this.O;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.S(parcel, 1, this.O, i10, false);
        b.b(parcel, a10);
    }
}

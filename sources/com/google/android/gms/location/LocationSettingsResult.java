package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import d9.w;
import f8.u;
import l8.b;

@SafeParcelable.a(creator = "LocationSettingsResultCreator")
@SafeParcelable.g({1000})
public final class LocationSettingsResult extends AbstractSafeParcelable implements u {
    @m0
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new w();
    @SafeParcelable.c(getter = "getStatus", id = 1)
    public final Status O;
    @o0
    @SafeParcelable.c(getter = "getLocationSettingsStates", id = 2)
    public final LocationSettingsStates P;

    @SafeParcelable.b
    public LocationSettingsResult(@SafeParcelable.e(id = 1) @m0 Status status, @SafeParcelable.e(id = 2) @o0 LocationSettingsStates locationSettingsStates) {
        this.O = status;
        this.P = locationSettingsStates;
    }

    @o0
    public LocationSettingsStates X0() {
        return this.P;
    }

    @m0
    public Status g() {
        return this.O;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.S(parcel, 1, g(), i10, false);
        b.S(parcel, 2, X0(), i10, false);
        b.b(parcel, a10);
    }
}

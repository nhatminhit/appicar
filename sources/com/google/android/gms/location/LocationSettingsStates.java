package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import d9.x;
import l8.b;
import l8.c;

@SafeParcelable.a(creator = "LocationSettingsStatesCreator")
@SafeParcelable.g({1000})
public final class LocationSettingsStates extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new x();
    @SafeParcelable.c(getter = "isGpsUsable", id = 1)
    public final boolean O;
    @SafeParcelable.c(getter = "isNetworkLocationUsable", id = 2)
    public final boolean P;
    @SafeParcelable.c(getter = "isBleUsable", id = 3)
    public final boolean Q;
    @SafeParcelable.c(getter = "isGpsPresent", id = 4)
    public final boolean R;
    @SafeParcelable.c(getter = "isNetworkLocationPresent", id = 5)
    public final boolean S;
    @SafeParcelable.c(getter = "isBlePresent", id = 6)
    public final boolean T;

    @SafeParcelable.b
    public LocationSettingsStates(@SafeParcelable.e(id = 1) boolean z10, @SafeParcelable.e(id = 2) boolean z11, @SafeParcelable.e(id = 3) boolean z12, @SafeParcelable.e(id = 4) boolean z13, @SafeParcelable.e(id = 5) boolean z14, @SafeParcelable.e(id = 6) boolean z15) {
        this.O = z10;
        this.P = z11;
        this.Q = z12;
        this.R = z13;
        this.S = z14;
        this.T = z15;
    }

    @o0
    public static LocationSettingsStates X0(@m0 Intent intent) {
        return (LocationSettingsStates) c.b(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public boolean A1() {
        return this.P;
    }

    public boolean Z0() {
        return this.T;
    }

    public boolean f1() {
        return this.Q;
    }

    public boolean g1() {
        return this.R;
    }

    public boolean h1() {
        return this.O;
    }

    public boolean m1() {
        return this.R || this.S;
    }

    public boolean p1() {
        return this.O || this.P;
    }

    public boolean r1() {
        return this.S;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.g(parcel, 1, h1());
        b.g(parcel, 2, A1());
        b.g(parcel, 3, f1());
        b.g(parcel, 4, g1());
        b.g(parcel, 5, r1());
        b.g(parcel, 6, Z0());
        b.b(parcel, a10);
    }
}

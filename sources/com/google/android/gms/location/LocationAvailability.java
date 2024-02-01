package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import d9.z0;
import j8.q;
import java.util.Arrays;
import l8.b;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

@SafeParcelable.a(creator = "LocationAvailabilityCreator")
@SafeParcelable.g({1000})
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    @m0
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new z0();
    @m0
    public static final LocationAvailability T = new LocationAvailability(0, 1, 1, 0, (zzac[]) null, true);
    @m0
    public static final LocationAvailability U = new LocationAvailability(1000, 1, 1, 0, (zzac[]) null, false);
    @SafeParcelable.c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", getter = "getCellStatus", id = 1)
    public final int O;
    @SafeParcelable.c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", getter = "getWifiStatus", id = 2)
    public final int P;
    @SafeParcelable.c(defaultValueUnchecked = "0", getter = "getElapsedRealtimeNs", id = 3)
    public final long Q;
    @SafeParcelable.c(defaultValueUnchecked = "LocationAvailability.STATUS_UNSUCCESSFUL", id = 4)
    public int R;
    @SafeParcelable.c(getter = "getBatchedStatus", id = 5)
    public final zzac[] S;

    @SafeParcelable.b
    public LocationAvailability(@SafeParcelable.e(id = 4) int i10, @SafeParcelable.e(id = 1) int i11, @SafeParcelable.e(id = 2) int i12, @SafeParcelable.e(id = 3) long j10, @SafeParcelable.e(id = 5) zzac[] zzacArr, @SafeParcelable.e(id = 6) boolean z10) {
        this.R = i10 < 1000 ? 0 : 1000;
        this.O = i11;
        this.P = i12;
        this.Q = j10;
        this.S = zzacArr;
    }

    @o0
    public static LocationAvailability X0(@m0 Intent intent) {
        if (!Z0(intent)) {
            return null;
        }
        try {
            return (LocationAvailability) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public static boolean Z0(@o0 Intent intent) {
        return intent != null && intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public boolean equals(@o0 Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.O == locationAvailability.O && this.P == locationAvailability.P && this.Q == locationAvailability.Q && this.R == locationAvailability.R && Arrays.equals(this.S, locationAvailability.S);
        }
    }

    public boolean f1() {
        return this.R < 1000;
    }

    public int hashCode() {
        return q.c(Integer.valueOf(this.R));
    }

    @m0
    public String toString() {
        boolean f12 = f1();
        return "LocationAvailability[" + f12 + "]";
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.F(parcel, 2, this.P);
        b.K(parcel, 3, this.Q);
        b.F(parcel, 4, this.R);
        b.c0(parcel, 5, this.S, i10, false);
        b.g(parcel, 6, f1());
        b.b(parcel, a10);
    }
}

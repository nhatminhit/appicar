package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.o0;
import j8.v1;
import l8.b;

@SafeParcelable.a(creator = "ConnectionInfoCreator")
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new v1();
    @SafeParcelable.c(id = 1)
    public Bundle O;
    @SafeParcelable.c(id = 2)
    public Feature[] P;
    @SafeParcelable.c(defaultValue = "0", id = 3)
    public int Q;
    @o0
    @SafeParcelable.c(id = 4)
    public ConnectionTelemetryConfiguration R;

    public zzj() {
    }

    @SafeParcelable.b
    public zzj(@SafeParcelable.e(id = 1) Bundle bundle, @SafeParcelable.e(id = 2) Feature[] featureArr, @SafeParcelable.e(id = 3) int i10, @SafeParcelable.e(id = 4) @o0 ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.O = bundle;
        this.P = featureArr;
        this.Q = i10;
        this.R = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.k(parcel, 1, this.O, false);
        b.c0(parcel, 2, this.P, i10, false);
        b.F(parcel, 3, this.Q);
        b.S(parcel, 4, this.R, i10, false);
        b.b(parcel, a10);
    }
}

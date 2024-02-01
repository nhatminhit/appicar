package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import e8.a;
import j8.l1;
import l8.b;

@a
@SafeParcelable.a(creator = "RootTelemetryConfigurationCreator")
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    @a
    @m0
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new l1();
    @SafeParcelable.c(getter = "getVersion", id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    public final boolean P;
    @SafeParcelable.c(getter = "getMethodTimingTelemetryEnabled", id = 3)
    public final boolean Q;
    @SafeParcelable.c(getter = "getBatchPeriodMillis", id = 4)
    public final int R;
    @SafeParcelable.c(getter = "getMaxMethodInvocationsInBatch", id = 5)
    public final int S;

    @SafeParcelable.b
    public RootTelemetryConfiguration(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) boolean z11, @SafeParcelable.e(id = 4) int i11, @SafeParcelable.e(id = 5) int i12) {
        this.O = i10;
        this.P = z10;
        this.Q = z11;
        this.R = i11;
        this.S = i12;
    }

    @a
    public int C1() {
        return this.O;
    }

    @a
    public int X0() {
        return this.R;
    }

    @a
    public int Z0() {
        return this.S;
    }

    @a
    public boolean f1() {
        return this.P;
    }

    @a
    public boolean g1() {
        return this.Q;
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, C1());
        b.g(parcel, 2, f1());
        b.g(parcel, 3, g1());
        b.F(parcel, 4, X0());
        b.F(parcel, 5, Z0());
        b.b(parcel, a10);
    }
}

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import e8.a;
import j8.w1;
import l8.b;

@a
@SafeParcelable.a(creator = "ConnectionTelemetryConfigurationCreator")
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    @a
    @m0
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new w1();
    @SafeParcelable.c(getter = "getRootTelemetryConfiguration", id = 1)
    public final RootTelemetryConfiguration O;
    @SafeParcelable.c(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    public final boolean P;
    @SafeParcelable.c(getter = "getMethodTimingTelemetryEnabled", id = 3)
    public final boolean Q;
    @o0
    @SafeParcelable.c(getter = "getMethodInvocationMethodKeyAllowlist", id = 4)
    public final int[] R;
    @SafeParcelable.c(getter = "getMaxMethodInvocationsLogged", id = 5)
    public final int S;
    @o0
    @SafeParcelable.c(getter = "getMethodInvocationMethodKeyDisallowlist", id = 6)
    public final int[] T;

    @SafeParcelable.b
    public ConnectionTelemetryConfiguration(@SafeParcelable.e(id = 1) @m0 RootTelemetryConfiguration rootTelemetryConfiguration, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) boolean z11, @SafeParcelable.e(id = 4) @o0 int[] iArr, @SafeParcelable.e(id = 5) int i10, @SafeParcelable.e(id = 6) @o0 int[] iArr2) {
        this.O = rootTelemetryConfiguration;
        this.P = z10;
        this.Q = z11;
        this.R = iArr;
        this.S = i10;
        this.T = iArr2;
    }

    @a
    public int X0() {
        return this.S;
    }

    @a
    @o0
    public int[] Z0() {
        return this.R;
    }

    @a
    @o0
    public int[] f1() {
        return this.T;
    }

    @a
    public boolean g1() {
        return this.P;
    }

    @a
    public boolean h1() {
        return this.Q;
    }

    @m0
    public final RootTelemetryConfiguration m1() {
        return this.O;
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.S(parcel, 1, this.O, i10, false);
        b.g(parcel, 2, g1());
        b.g(parcel, 3, h1());
        b.G(parcel, 4, Z0(), false);
        b.F(parcel, 5, X0());
        b.G(parcel, 6, f1(), false);
        b.b(parcel, a10);
    }
}

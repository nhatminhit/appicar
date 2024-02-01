package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import e8.a;
import j8.s0;
import l8.b;

@a
@SafeParcelable.a(creator = "MethodInvocationCreator")
public class MethodInvocation extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new s0();
    @SafeParcelable.c(getter = "getMethodKey", id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getResultStatusCode", id = 2)
    public final int P;
    @SafeParcelable.c(getter = "getConnectionResultStatusCode", id = 3)
    public final int Q;
    @SafeParcelable.c(getter = "getStartTimeMillis", id = 4)
    public final long R;
    @SafeParcelable.c(getter = "getEndTimeMillis", id = 5)
    public final long S;
    @o0
    @SafeParcelable.c(getter = "getCallingModuleId", id = 6)
    public final String T;
    @o0
    @SafeParcelable.c(getter = "getCallingEntryPoint", id = 7)
    public final String U;
    @SafeParcelable.c(defaultValue = "0", getter = "getServiceId", id = 8)
    public final int V;
    @SafeParcelable.c(defaultValue = "-1", getter = "getLatencyMillis", id = 9)
    public final int W;

    @a
    @Deprecated
    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, @o0 String str, @o0 String str2, int i13) {
        this(i10, i11, i12, j10, j11, str, str2, i13, -1);
    }

    @SafeParcelable.b
    public MethodInvocation(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) int i12, @SafeParcelable.e(id = 4) long j10, @SafeParcelable.e(id = 5) long j11, @SafeParcelable.e(id = 6) @o0 String str, @SafeParcelable.e(id = 7) @o0 String str2, @SafeParcelable.e(id = 8) int i13, @SafeParcelable.e(id = 9) int i14) {
        this.O = i10;
        this.P = i11;
        this.Q = i12;
        this.R = j10;
        this.S = j11;
        this.T = str;
        this.U = str2;
        this.V = i13;
        this.W = i14;
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.F(parcel, 2, this.P);
        b.F(parcel, 3, this.Q);
        b.K(parcel, 4, this.R);
        b.K(parcel, 5, this.S);
        b.Y(parcel, 6, this.T, false);
        b.Y(parcel, 7, this.U, false);
        b.F(parcel, 8, this.V);
        b.F(parcel, 9, this.W);
        b.b(parcel, a10);
    }
}

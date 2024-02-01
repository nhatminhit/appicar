package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.o0;
import d9.f0;
import j8.s;
import j8.w;
import l8.b;

@SafeParcelable.a(creator = "ActivityRecognitionRequestCreator")
@w
@SafeParcelable.g({1000})
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new f0();
    @SafeParcelable.c(getter = "getIntervalMillis", id = 1)
    public final long O;
    @SafeParcelable.c(getter = "getTriggerUpdate", id = 2)
    public final boolean P;
    @o0
    @SafeParcelable.c(getter = "getWorkSource", id = 3)
    public final WorkSource Q;
    @o0
    @SafeParcelable.c(getter = "getTag", id = 4)
    public final String R;
    @o0
    @SafeParcelable.c(getter = "getNondefaultActivities", id = 5)
    public final int[] S;
    @SafeParcelable.c(getter = "getRequestSensorData", id = 6)
    public final boolean T;
    @o0
    @SafeParcelable.c(getter = "getAccountName", id = 7)
    public final String U;
    @SafeParcelable.c(defaultValueUnchecked = "ActivityRecognitionRequest.DEFAULT_MAX_REPORT_LATENCY_MILLIS", getter = "getMaxReportLatencyMillis", id = 8)
    public final long V;
    @o0
    @SafeParcelable.c(getter = "getContextAttributionTag", id = 9)
    public String W;

    @SafeParcelable.b
    public zzb(@SafeParcelable.e(id = 1) long j10, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) @o0 WorkSource workSource, @SafeParcelable.e(id = 4) @o0 String str, @SafeParcelable.e(id = 5) @o0 int[] iArr, @SafeParcelable.e(id = 6) boolean z11, @SafeParcelable.e(id = 7) @o0 String str2, @SafeParcelable.e(id = 8) long j11, @SafeParcelable.e(id = 9) @o0 String str3) {
        this.O = j10;
        this.P = z10;
        this.Q = workSource;
        this.R = str;
        this.S = iArr;
        this.T = z11;
        this.U = str2;
        this.V = j11;
        this.W = str3;
    }

    public final zzb X0(@o0 String str) {
        this.W = str;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        s.l(parcel);
        int a10 = b.a(parcel);
        b.K(parcel, 1, this.O);
        b.g(parcel, 2, this.P);
        b.S(parcel, 3, this.Q, i10, false);
        b.Y(parcel, 4, this.R, false);
        b.G(parcel, 5, this.S, false);
        b.g(parcel, 6, this.T);
        b.Y(parcel, 7, this.U, false);
        b.K(parcel, 8, this.V);
        b.Y(parcel, 9, this.W, false);
        b.b(parcel, a10);
    }
}

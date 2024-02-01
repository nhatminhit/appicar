package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import e8.a;
import java.util.List;
import javax.annotation.Nullable;
import l8.b;
import v8.f;

@a
@SafeParcelable.a(creator = "WakeLockEventCreator")
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    @m0
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new f();
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getTimeMillis", id = 2)
    public final long P;
    @SafeParcelable.c(getter = "getEventType", id = 11)
    public int Q;
    @SafeParcelable.c(getter = "getWakeLockName", id = 4)
    public final String R;
    @SafeParcelable.c(getter = "getSecondaryWakeLockName", id = 10)
    public final String S;
    @SafeParcelable.c(getter = "getCodePackage", id = 17)
    public final String T;
    @SafeParcelable.c(getter = "getWakeLockType", id = 5)
    public final int U;
    @Nullable
    @SafeParcelable.c(getter = "getCallingPackages", id = 6)
    public final List V;
    @SafeParcelable.c(getter = "getEventKey", id = 12)
    public final String W;
    @SafeParcelable.c(getter = "getElapsedRealtime", id = 8)
    public final long X;
    @SafeParcelable.c(getter = "getDeviceState", id = 14)
    public int Y;
    @SafeParcelable.c(getter = "getHostPackage", id = 13)
    public final String Z;
    @SafeParcelable.c(getter = "getBeginPowerPercentage", id = 15)

    /* renamed from: a0  reason: collision with root package name */
    public final float f5803a0;
    @SafeParcelable.c(getter = "getTimeout", id = 16)

    /* renamed from: b0  reason: collision with root package name */
    public final long f5804b0;
    @SafeParcelable.c(getter = "getAcquiredWithTimeout", id = 18)

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f5805c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f5806d0 = -1;

    @SafeParcelable.b
    public WakeLockEvent(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) long j10, @SafeParcelable.e(id = 11) int i11, @SafeParcelable.e(id = 4) String str, @SafeParcelable.e(id = 5) int i12, @SafeParcelable.e(id = 6) @Nullable List list, @SafeParcelable.e(id = 12) String str2, @SafeParcelable.e(id = 8) long j11, @SafeParcelable.e(id = 14) int i13, @SafeParcelable.e(id = 10) String str3, @SafeParcelable.e(id = 13) String str4, @SafeParcelable.e(id = 15) float f10, @SafeParcelable.e(id = 16) long j12, @SafeParcelable.e(id = 17) String str5, @SafeParcelable.e(id = 18) boolean z10) {
        this.O = i10;
        this.P = j10;
        this.Q = i11;
        this.R = str;
        this.S = str3;
        this.T = str5;
        this.U = i12;
        this.V = list;
        this.W = str2;
        this.X = j11;
        this.Y = i13;
        this.Z = str4;
        this.f5803a0 = f10;
        this.f5804b0 = j12;
        this.f5805c0 = z10;
    }

    public final int X0() {
        return this.Q;
    }

    public final long Z0() {
        return this.f5806d0;
    }

    public final long f1() {
        return this.P;
    }

    @m0
    public final String g1() {
        List list = this.V;
        String str = this.R;
        int i10 = this.U;
        String str2 = "";
        String join = list == null ? str2 : TextUtils.join(",", list);
        int i11 = this.Y;
        String str3 = this.S;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.Z;
        if (str4 == null) {
            str4 = str2;
        }
        float f10 = this.f5803a0;
        String str5 = this.T;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z10 = this.f5805c0;
        return "\t" + str + "\t" + i10 + "\t" + join + "\t" + i11 + "\t" + str3 + "\t" + str4 + "\t" + f10 + "\t" + str2 + "\t" + z10;
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.K(parcel, 2, this.P);
        b.Y(parcel, 4, this.R, false);
        b.F(parcel, 5, this.U);
        b.a0(parcel, 6, this.V, false);
        b.K(parcel, 8, this.X);
        b.Y(parcel, 10, this.S, false);
        b.F(parcel, 11, this.Q);
        b.Y(parcel, 12, this.W, false);
        b.Y(parcel, 13, this.Z, false);
        b.F(parcel, 14, this.Y);
        b.w(parcel, 15, this.f5803a0);
        b.K(parcel, 16, this.f5804b0);
        b.Y(parcel, 17, this.T, false);
        b.g(parcel, 18, this.f5805c0);
        b.b(parcel, a10);
    }
}

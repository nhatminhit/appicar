package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.i2;
import com.google.android.gms.internal.location.zzd;
import d.m0;
import d.o0;
import d9.d0;
import d9.r0;
import d9.z;
import j8.q;
import j8.s;
import l8.b;
import org.checkerframework.dataflow.qual.Pure;
import w8.e0;

@SafeParcelable.a(creator = "CurrentLocationRequestCreator")
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new d9.m0();
    @SafeParcelable.c(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    public final long O;
    @SafeParcelable.c(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    public final int P;
    @SafeParcelable.c(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 3)
    public final int Q;
    @SafeParcelable.c(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 4)
    public final long R;
    @SafeParcelable.c(defaultValue = "false", getter = "isBypass", id = 5)
    public final boolean S;
    @SafeParcelable.c(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 7)
    public final int T;
    @o0
    @SafeParcelable.c(getter = "getModuleId", id = 8)
    public final String U;
    @SafeParcelable.c(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 6)
    public final WorkSource V;
    @o0
    @SafeParcelable.c(getter = "getImpersonation", id = 9)
    public final zzd W;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f5936a;

        /* renamed from: b  reason: collision with root package name */
        public int f5937b;

        /* renamed from: c  reason: collision with root package name */
        public int f5938c;

        /* renamed from: d  reason: collision with root package name */
        public long f5939d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5940e;

        /* renamed from: f  reason: collision with root package name */
        public int f5941f;
        @o0

        /* renamed from: g  reason: collision with root package name */
        public String f5942g;
        @o0

        /* renamed from: h  reason: collision with root package name */
        public WorkSource f5943h;
        @o0

        /* renamed from: i  reason: collision with root package name */
        public zzd f5944i;

        public a() {
            this.f5936a = 60000;
            this.f5937b = 0;
            this.f5938c = 102;
            this.f5939d = Long.MAX_VALUE;
            this.f5940e = false;
            this.f5941f = 0;
            this.f5942g = null;
            this.f5943h = null;
            this.f5944i = null;
        }

        public a(@m0 CurrentLocationRequest currentLocationRequest) {
            this.f5936a = currentLocationRequest.f1();
            this.f5937b = currentLocationRequest.Z0();
            this.f5938c = currentLocationRequest.g1();
            this.f5939d = currentLocationRequest.X0();
            this.f5940e = currentLocationRequest.A1();
            this.f5941f = currentLocationRequest.h1();
            this.f5942g = currentLocationRequest.r1();
            this.f5943h = new WorkSource(currentLocationRequest.m1());
            this.f5944i = currentLocationRequest.p1();
        }

        @m0
        public CurrentLocationRequest a() {
            return new CurrentLocationRequest(this.f5936a, this.f5937b, this.f5938c, this.f5939d, this.f5940e, this.f5941f, this.f5942g, new WorkSource(this.f5943h), this.f5944i);
        }

        @m0
        public a b(long j10) {
            s.b(j10 > 0, "durationMillis must be greater than 0");
            this.f5939d = j10;
            return this;
        }

        @m0
        public a c(int i10) {
            r0.a(i10);
            this.f5937b = i10;
            return this;
        }

        @m0
        public a d(long j10) {
            s.b(j10 >= 0, "maxUpdateAgeMillis must be greater than or equal to 0");
            this.f5936a = j10;
            return this;
        }

        @m0
        public a e(int i10) {
            z.a(i10);
            this.f5938c = i10;
            return this;
        }
    }

    @SafeParcelable.b
    public CurrentLocationRequest(@SafeParcelable.e(id = 1) long j10, @SafeParcelable.e(id = 2) int i10, @SafeParcelable.e(id = 3) int i11, @SafeParcelable.e(id = 4) long j11, @SafeParcelable.e(id = 5) boolean z10, @SafeParcelable.e(id = 7) int i12, @SafeParcelable.e(id = 8) @o0 String str, @SafeParcelable.e(id = 6) WorkSource workSource, @SafeParcelable.e(id = 9) @o0 zzd zzd) {
        boolean z11 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z11 = false;
        }
        s.a(z11);
        this.O = j10;
        this.P = i10;
        this.Q = i11;
        this.R = j11;
        this.S = z10;
        this.T = i12;
        this.U = str;
        this.V = workSource;
        this.W = zzd;
    }

    @Pure
    public final boolean A1() {
        return this.S;
    }

    @Pure
    public long X0() {
        return this.R;
    }

    @Pure
    public int Z0() {
        return this.P;
    }

    public boolean equals(@o0 Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.O == currentLocationRequest.O && this.P == currentLocationRequest.P && this.Q == currentLocationRequest.Q && this.R == currentLocationRequest.R && this.S == currentLocationRequest.S && this.T == currentLocationRequest.T && q.b(this.U, currentLocationRequest.U) && q.b(this.V, currentLocationRequest.V) && q.b(this.W, currentLocationRequest.W);
    }

    @Pure
    public long f1() {
        return this.O;
    }

    @Pure
    public int g1() {
        return this.Q;
    }

    @Pure
    public final int h1() {
        return this.T;
    }

    public int hashCode() {
        return q.c(Long.valueOf(this.O), Integer.valueOf(this.P), Integer.valueOf(this.Q), Long.valueOf(this.R));
    }

    @m0
    @Pure
    public final WorkSource m1() {
        return this.V;
    }

    @o0
    @Pure
    public final zzd p1() {
        return this.W;
    }

    @o0
    @Deprecated
    @Pure
    public final String r1() {
        return this.U;
    }

    @m0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CurrentLocationRequest[");
        sb2.append(z.b(this.Q));
        if (this.O != Long.MAX_VALUE) {
            sb2.append(", maxAge=");
            i2.b(this.O, sb2);
        }
        if (this.R != Long.MAX_VALUE) {
            sb2.append(", duration=");
            sb2.append(this.R);
            sb2.append("ms");
        }
        if (this.P != 0) {
            sb2.append(", ");
            sb2.append(r0.b(this.P));
        }
        if (this.S) {
            sb2.append(", bypass");
        }
        if (this.T != 0) {
            sb2.append(", ");
            sb2.append(d0.a(this.T));
        }
        if (this.U != null) {
            sb2.append(", moduleId=");
            sb2.append(this.U);
        }
        if (!e0.h(this.V)) {
            sb2.append(", workSource=");
            sb2.append(this.V);
        }
        if (this.W != null) {
            sb2.append(", impersonation=");
            sb2.append(this.W);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.K(parcel, 1, f1());
        b.F(parcel, 2, Z0());
        b.F(parcel, 3, g1());
        b.K(parcel, 4, X0());
        b.g(parcel, 5, this.S);
        b.S(parcel, 6, this.V, i10, false);
        b.F(parcel, 7, this.T);
        b.Y(parcel, 8, this.U, false);
        b.S(parcel, 9, this.W, i10, false);
        b.b(parcel, a10);
    }
}

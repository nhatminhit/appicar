package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.i2;
import com.google.android.gms.internal.location.zzd;
import d.m0;
import d.o0;
import d9.r0;
import d9.y0;
import j8.q;
import j8.s;
import l8.b;
import org.checkerframework.dataflow.qual.Pure;

@SafeParcelable.a(creator = "LastLocationRequestCreator")
public final class LastLocationRequest extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new y0();
    @SafeParcelable.c(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    public final long O;
    @SafeParcelable.c(defaultValueUnchecked = "com.google.android.gms.location.Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    public final int P;
    @SafeParcelable.c(defaultValue = "false", getter = "isBypass", id = 3)
    public final boolean Q;
    @o0
    @SafeParcelable.c(getter = "getModuleId", id = 4)
    public final String R;
    @o0
    @SafeParcelable.c(getter = "getImpersonation", id = 5)
    public final zzd S;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f5948a;

        /* renamed from: b  reason: collision with root package name */
        public int f5949b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5950c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public String f5951d;
        @o0

        /* renamed from: e  reason: collision with root package name */
        public zzd f5952e;

        public a() {
            this.f5948a = Long.MAX_VALUE;
            this.f5949b = 0;
            this.f5950c = false;
            this.f5951d = null;
            this.f5952e = null;
        }

        public a(@m0 LastLocationRequest lastLocationRequest) {
            this.f5948a = lastLocationRequest.Z0();
            this.f5949b = lastLocationRequest.X0();
            this.f5950c = lastLocationRequest.h1();
            this.f5951d = lastLocationRequest.g1();
            this.f5952e = lastLocationRequest.f1();
        }

        @m0
        public LastLocationRequest a() {
            return new LastLocationRequest(this.f5948a, this.f5949b, this.f5950c, this.f5951d, this.f5952e);
        }

        @m0
        public a b(int i10) {
            r0.a(i10);
            this.f5949b = i10;
            return this;
        }

        @m0
        public a c(long j10) {
            s.b(j10 > 0, "maxUpdateAgeMillis must be greater than 0");
            this.f5948a = j10;
            return this;
        }
    }

    @SafeParcelable.b
    public LastLocationRequest(@SafeParcelable.e(id = 1) long j10, @SafeParcelable.e(id = 2) int i10, @SafeParcelable.e(id = 3) boolean z10, @SafeParcelable.e(id = 4) @o0 String str, @SafeParcelable.e(id = 5) @o0 zzd zzd) {
        this.O = j10;
        this.P = i10;
        this.Q = z10;
        this.R = str;
        this.S = zzd;
    }

    @Pure
    public int X0() {
        return this.P;
    }

    @Pure
    public long Z0() {
        return this.O;
    }

    public boolean equals(@o0 Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.O == lastLocationRequest.O && this.P == lastLocationRequest.P && this.Q == lastLocationRequest.Q && q.b(this.R, lastLocationRequest.R) && q.b(this.S, lastLocationRequest.S);
    }

    @o0
    @Pure
    public final zzd f1() {
        return this.S;
    }

    @o0
    @Deprecated
    @Pure
    public final String g1() {
        return this.R;
    }

    @Pure
    public final boolean h1() {
        return this.Q;
    }

    public int hashCode() {
        return q.c(Long.valueOf(this.O), Integer.valueOf(this.P), Boolean.valueOf(this.Q));
    }

    @m0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LastLocationRequest[");
        if (this.O != Long.MAX_VALUE) {
            sb2.append("maxAge=");
            i2.b(this.O, sb2);
        }
        if (this.P != 0) {
            sb2.append(", ");
            sb2.append(r0.b(this.P));
        }
        if (this.Q) {
            sb2.append(", bypass");
        }
        if (this.R != null) {
            sb2.append(", moduleId=");
            sb2.append(this.R);
        }
        if (this.S != null) {
            sb2.append(", impersonation=");
            sb2.append(this.S);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.K(parcel, 1, Z0());
        b.F(parcel, 2, X0());
        b.g(parcel, 3, this.Q);
        b.Y(parcel, 4, this.R, false);
        b.S(parcel, 5, this.S, i10, false);
        b.b(parcel, a10);
    }
}

package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.i2;
import com.google.android.gms.internal.location.zzd;
import d.m0;
import d.o0;
import d.w0;
import d9.a1;
import d9.d0;
import d9.r0;
import d9.z;
import j8.q;
import j8.s;
import l8.b;
import org.checkerframework.dataflow.qual.Pure;
import w8.e0;

@SafeParcelable.a(creator = "LocationRequestCreator")
@SafeParcelable.g({4, 5, 1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @m0
    public static final Parcelable.Creator<LocationRequest> CREATOR = new a1();
    @Deprecated

    /* renamed from: d0  reason: collision with root package name */
    public static final int f5953d0 = 100;
    @Deprecated

    /* renamed from: e0  reason: collision with root package name */
    public static final int f5954e0 = 102;
    @Deprecated

    /* renamed from: f0  reason: collision with root package name */
    public static final int f5955f0 = 104;
    @Deprecated

    /* renamed from: g0  reason: collision with root package name */
    public static final int f5956g0 = 105;
    @SafeParcelable.c(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 1)
    public int O;
    @SafeParcelable.c(defaultValue = "3600000", getter = "getIntervalMillis", id = 2)
    public long P;
    @SafeParcelable.c(defaultValue = "600000", getter = "getMinUpdateIntervalMillis", id = 3)
    public long Q;
    @SafeParcelable.c(defaultValue = "0", getter = "getMaxUpdateDelayMillis", id = 8)
    public long R;
    @SafeParcelable.c(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 10)
    public long S;
    @SafeParcelable.c(defaultValueUnchecked = "Integer.MAX_VALUE", getter = "getMaxUpdates", id = 6)
    public int T;
    @SafeParcelable.c(defaultValue = "0", getter = "getMinUpdateDistanceMeters", id = 7)
    public float U;
    @SafeParcelable.c(defaultValue = "false", getter = "isWaitForAccurateLocation", id = 9)
    public boolean V;
    @SafeParcelable.c(defaultValueUnchecked = "-1", getter = "getMaxUpdateAgeMillis", id = 11)
    public long W;
    @SafeParcelable.c(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 12)
    public final int X;
    @SafeParcelable.c(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 13)
    public final int Y;
    @o0
    @SafeParcelable.c(getter = "getModuleId", id = 14)
    public final String Z;
    @SafeParcelable.c(defaultValue = "false", getter = "isBypass", id = 15)

    /* renamed from: a0  reason: collision with root package name */
    public final boolean f5957a0;
    @SafeParcelable.c(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 16)

    /* renamed from: b0  reason: collision with root package name */
    public final WorkSource f5958b0;
    @o0
    @SafeParcelable.c(getter = "getImpersonation", id = 17)

    /* renamed from: c0  reason: collision with root package name */
    public final zzd f5959c0;

    public static final class a {

        /* renamed from: p  reason: collision with root package name */
        public static final long f5960p = -1;

        /* renamed from: q  reason: collision with root package name */
        public static final long f5961q = -1;

        /* renamed from: a  reason: collision with root package name */
        public int f5962a;

        /* renamed from: b  reason: collision with root package name */
        public long f5963b;

        /* renamed from: c  reason: collision with root package name */
        public long f5964c;

        /* renamed from: d  reason: collision with root package name */
        public long f5965d;

        /* renamed from: e  reason: collision with root package name */
        public long f5966e;

        /* renamed from: f  reason: collision with root package name */
        public int f5967f;

        /* renamed from: g  reason: collision with root package name */
        public float f5968g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5969h;

        /* renamed from: i  reason: collision with root package name */
        public long f5970i;

        /* renamed from: j  reason: collision with root package name */
        public int f5971j;

        /* renamed from: k  reason: collision with root package name */
        public int f5972k;
        @o0

        /* renamed from: l  reason: collision with root package name */
        public String f5973l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f5974m;
        @o0

        /* renamed from: n  reason: collision with root package name */
        public WorkSource f5975n;
        @o0

        /* renamed from: o  reason: collision with root package name */
        public zzd f5976o;

        public a(int i10, long j10) {
            s.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            z.a(i10);
            this.f5962a = i10;
            this.f5963b = j10;
            this.f5964c = -1;
            this.f5965d = 0;
            this.f5966e = Long.MAX_VALUE;
            this.f5967f = Integer.MAX_VALUE;
            this.f5968g = 0.0f;
            this.f5969h = true;
            this.f5970i = -1;
            this.f5971j = 0;
            this.f5972k = 0;
            this.f5973l = null;
            this.f5974m = false;
            this.f5975n = null;
            this.f5976o = null;
        }

        public a(long j10) {
            s.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f5963b = j10;
            this.f5962a = 102;
            this.f5964c = -1;
            this.f5965d = 0;
            this.f5966e = Long.MAX_VALUE;
            this.f5967f = Integer.MAX_VALUE;
            this.f5968g = 0.0f;
            this.f5969h = true;
            this.f5970i = -1;
            this.f5971j = 0;
            this.f5972k = 0;
            this.f5973l = null;
            this.f5974m = false;
            this.f5975n = null;
            this.f5976o = null;
        }

        public a(@m0 LocationRequest locationRequest) {
            this.f5962a = locationRequest.P1();
            this.f5963b = locationRequest.m1();
            this.f5964c = locationRequest.N1();
            this.f5965d = locationRequest.r1();
            this.f5966e = locationRequest.Z0();
            this.f5967f = locationRequest.A1();
            this.f5968g = locationRequest.L1();
            this.f5969h = locationRequest.U1();
            this.f5970i = locationRequest.p1();
            this.f5971j = locationRequest.g1();
            this.f5972k = locationRequest.e2();
            this.f5973l = locationRequest.h2();
            this.f5974m = locationRequest.i2();
            this.f5975n = locationRequest.f2();
            this.f5976o = locationRequest.g2();
        }

        @m0
        public LocationRequest a() {
            int i10 = this.f5962a;
            long j10 = this.f5963b;
            long j11 = this.f5964c;
            if (j11 == -1) {
                j11 = j10;
            } else if (i10 != 105) {
                j11 = Math.min(j11, j10);
            }
            long max = Math.max(this.f5965d, this.f5963b);
            long j12 = this.f5966e;
            int i11 = this.f5967f;
            float f10 = this.f5968g;
            boolean z10 = this.f5969h;
            long j13 = this.f5970i;
            long j14 = j13 == -1 ? this.f5963b : j13;
            int i12 = this.f5971j;
            int i13 = this.f5972k;
            String str = this.f5973l;
            boolean z11 = this.f5974m;
            WorkSource workSource = r7;
            WorkSource workSource2 = new WorkSource(this.f5975n);
            return new LocationRequest(i10, j10, j11, max, Long.MAX_VALUE, j12, i11, f10, z10, j14, i12, i13, str, z11, workSource, this.f5976o);
        }

        @m0
        public a b(long j10) {
            s.b(j10 > 0, "durationMillis must be greater than 0");
            this.f5966e = j10;
            return this;
        }

        @m0
        public a c(int i10) {
            r0.a(i10);
            this.f5971j = i10;
            return this;
        }

        @m0
        public a d(long j10) {
            s.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f5963b = j10;
            return this;
        }

        @m0
        public a e(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            s.b(z10, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f5970i = j10;
            return this;
        }

        @m0
        public a f(long j10) {
            s.b(j10 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.f5965d = j10;
            return this;
        }

        @m0
        public a g(int i10) {
            s.b(i10 > 0, "maxUpdates must be greater than 0");
            this.f5967f = i10;
            return this;
        }

        @m0
        public a h(float f10) {
            s.b(f10 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.f5968g = f10;
            return this;
        }

        @m0
        public a i(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            s.b(z10, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f5964c = j10;
            return this;
        }

        @m0
        public a j(int i10) {
            z.a(i10);
            this.f5962a = i10;
            return this;
        }

        @m0
        public a k(boolean z10) {
            this.f5969h = z10;
            return this;
        }

        @w0(anyOf = {"android.permission.WRITE_SECURE_SETTINGS", "android.permission.LOCATION_BYPASS"})
        @m0
        public final a l(boolean z10) {
            this.f5974m = z10;
            return this;
        }

        @Deprecated
        @m0
        public final a m(@o0 String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.f5973l = str;
            }
            return this;
        }

        @m0
        public final a n(int i10) {
            boolean z10;
            int i11 = 2;
            if (i10 == 0 || i10 == 1) {
                i11 = i10;
            } else if (i10 == 2) {
                i10 = 2;
            } else {
                i11 = i10;
                z10 = false;
                s.c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
                this.f5972k = i11;
                return this;
            }
            z10 = true;
            s.c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
            this.f5972k = i11;
            return this;
        }

        @w0("android.permission.UPDATE_DEVICE_STATS")
        @m0
        public final a o(@o0 WorkSource workSource) {
            this.f5975n = workSource;
            return this;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocationRequest() {
        /*
            r23 = this;
            r0 = r23
            android.os.WorkSource r1 = new android.os.WorkSource
            r21 = r1
            r1.<init>()
            r1 = 102(0x66, float:1.43E-43)
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            r4 = 600000(0x927c0, double:2.964394E-318)
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            r14 = 1
            r15 = 3600000(0x36ee80, double:1.7786363E-317)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r0.<init>(r1, r2, r4, r6, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.<init>():void");
    }

    @SafeParcelable.b
    public LocationRequest(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) long j10, @SafeParcelable.e(id = 3) long j11, @SafeParcelable.e(id = 8) long j12, @SafeParcelable.f(defaultValueUnchecked = "Long.MAX_VALUE", id = 5) long j13, @SafeParcelable.e(id = 10) long j14, @SafeParcelable.e(id = 6) int i11, @SafeParcelable.e(id = 7) float f10, @SafeParcelable.e(id = 9) boolean z10, @SafeParcelable.e(id = 11) long j15, @SafeParcelable.e(id = 12) int i12, @SafeParcelable.e(id = 13) int i13, @SafeParcelable.e(id = 14) @o0 String str, @SafeParcelable.e(id = 15) boolean z11, @SafeParcelable.e(id = 16) WorkSource workSource, @SafeParcelable.e(id = 17) @o0 zzd zzd) {
        this.O = i10;
        long j16 = j10;
        this.P = j16;
        this.Q = j11;
        this.R = j12;
        this.S = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1, j13 - SystemClock.elapsedRealtime()), j14);
        this.T = i11;
        this.U = f10;
        this.V = z10;
        this.W = j15 != -1 ? j15 : j16;
        this.X = i12;
        this.Y = i13;
        this.Z = str;
        this.f5957a0 = z11;
        this.f5958b0 = workSource;
        this.f5959c0 = zzd;
    }

    @Deprecated
    @m0
    public static LocationRequest X0() {
        WorkSource workSource = r1;
        WorkSource workSource2 = new WorkSource();
        return new LocationRequest(102, 3600000, 600000, 0, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000, 0, 0, (String) null, false, workSource, (zzd) null);
    }

    public static String j2(long j10) {
        return j10 == Long.MAX_VALUE ? "∞" : i2.a(j10);
    }

    @Pure
    public int A1() {
        return this.T;
    }

    @Deprecated
    @Pure
    public long F1() {
        return Math.max(this.R, this.P);
    }

    @Pure
    public float L1() {
        return this.U;
    }

    @Pure
    public long N1() {
        return this.Q;
    }

    @Deprecated
    @Pure
    public int O1() {
        return A1();
    }

    @Pure
    public int P1() {
        return this.O;
    }

    @Deprecated
    @Pure
    public float Q1() {
        return L1();
    }

    @Pure
    public boolean R1() {
        long j10 = this.R;
        return j10 > 0 && (j10 >> 1) >= this.P;
    }

    @Deprecated
    @Pure
    public boolean S1() {
        return true;
    }

    @Pure
    public boolean T1() {
        return this.O == 105;
    }

    public boolean U1() {
        return this.V;
    }

    @Deprecated
    @m0
    public LocationRequest V1(long j10) {
        s.b(j10 > 0, "durationMillis must be greater than 0");
        this.S = j10;
        return this;
    }

    @Deprecated
    @m0
    public LocationRequest W1(long j10) {
        this.S = Math.max(1, j10 - SystemClock.elapsedRealtime());
        return this;
    }

    @Deprecated
    @m0
    public LocationRequest X1(long j10) {
        s.c(j10 >= 0, "illegal fastest interval: %d", Long.valueOf(j10));
        this.Q = j10;
        return this;
    }

    @Deprecated
    @m0
    public LocationRequest Y1(long j10) {
        s.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
        long j11 = this.Q;
        long j12 = this.P;
        if (j11 == j12 / 6) {
            this.Q = j10 / 6;
        }
        if (this.W == j12) {
            this.W = j10;
        }
        this.P = j10;
        return this;
    }

    @Pure
    public long Z0() {
        return this.S;
    }

    @Deprecated
    @m0
    public LocationRequest Z1(long j10) {
        s.c(j10 >= 0, "illegal max wait time: %d", Long.valueOf(j10));
        this.R = j10;
        return this;
    }

    @Deprecated
    @m0
    public LocationRequest a2(int i10) {
        if (i10 > 0) {
            this.T = i10;
            return this;
        }
        throw new IllegalArgumentException("invalid numUpdates: " + i10);
    }

    @Deprecated
    @m0
    public LocationRequest b2(int i10) {
        z.a(i10);
        this.O = i10;
        return this;
    }

    @Deprecated
    @m0
    public LocationRequest c2(float f10) {
        if (f10 >= 0.0f) {
            this.U = f10;
            return this;
        }
        throw new IllegalArgumentException("invalid displacement: " + f10);
    }

    @Deprecated
    @m0
    public LocationRequest d2(boolean z10) {
        this.V = z10;
        return this;
    }

    @Deprecated
    @Pure
    public long e0() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.S;
        long j11 = elapsedRealtime + j10;
        if (((elapsedRealtime ^ j11) & (j10 ^ j11)) < 0) {
            return Long.MAX_VALUE;
        }
        return j11;
    }

    @Pure
    public final int e2() {
        return this.Y;
    }

    public boolean equals(@o0 Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            return this.O == locationRequest.O && (T1() || this.P == locationRequest.P) && this.Q == locationRequest.Q && R1() == locationRequest.R1() && ((!R1() || this.R == locationRequest.R) && this.S == locationRequest.S && this.T == locationRequest.T && this.U == locationRequest.U && this.V == locationRequest.V && this.X == locationRequest.X && this.Y == locationRequest.Y && this.f5957a0 == locationRequest.f5957a0 && this.f5958b0.equals(locationRequest.f5958b0) && q.b(this.Z, locationRequest.Z) && q.b(this.f5959c0, locationRequest.f5959c0));
        }
    }

    @Deprecated
    @Pure
    public long f1() {
        return N1();
    }

    @m0
    @Pure
    public final WorkSource f2() {
        return this.f5958b0;
    }

    @Pure
    public int g1() {
        return this.X;
    }

    @o0
    @Pure
    public final zzd g2() {
        return this.f5959c0;
    }

    @Deprecated
    @Pure
    public long h1() {
        return m1();
    }

    @o0
    @Deprecated
    @Pure
    public final String h2() {
        return this.Z;
    }

    public int hashCode() {
        return q.c(Integer.valueOf(this.O), Long.valueOf(this.P), Long.valueOf(this.Q), this.f5958b0);
    }

    @Pure
    public final boolean i2() {
        return this.f5957a0;
    }

    @Pure
    public long m1() {
        return this.P;
    }

    @Pure
    public long p1() {
        return this.W;
    }

    @Pure
    public long r1() {
        return this.R;
    }

    @m0
    public String toString() {
        long j10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (!T1()) {
            sb2.append("@");
            if (R1()) {
                i2.b(this.P, sb2);
                sb2.append("/");
                j10 = this.R;
            } else {
                j10 = this.P;
            }
            i2.b(j10, sb2);
            sb2.append(" ");
        }
        sb2.append(z.b(this.O));
        if (T1() || this.Q != this.P) {
            sb2.append(", minUpdateInterval=");
            sb2.append(j2(this.Q));
        }
        if (((double) this.U) > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.U);
        }
        boolean T1 = T1();
        long j11 = this.W;
        if (!T1 ? j11 != this.P : j11 != Long.MAX_VALUE) {
            sb2.append(", maxUpdateAge=");
            sb2.append(j2(this.W));
        }
        if (this.S != Long.MAX_VALUE) {
            sb2.append(", duration=");
            i2.b(this.S, sb2);
        }
        if (this.T != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.T);
        }
        if (this.Y != 0) {
            sb2.append(", ");
            sb2.append(d0.a(this.Y));
        }
        if (this.X != 0) {
            sb2.append(", ");
            sb2.append(r0.b(this.X));
        }
        if (this.V) {
            sb2.append(", waitForAccurateLocation");
        }
        if (this.f5957a0) {
            sb2.append(", bypass");
        }
        if (this.Z != null) {
            sb2.append(", moduleId=");
            sb2.append(this.Z);
        }
        if (!e0.h(this.f5958b0)) {
            sb2.append(", ");
            sb2.append(this.f5958b0);
        }
        if (this.f5959c0 != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f5959c0);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, P1());
        b.K(parcel, 2, m1());
        b.K(parcel, 3, N1());
        b.F(parcel, 6, A1());
        b.w(parcel, 7, L1());
        b.K(parcel, 8, r1());
        b.g(parcel, 9, U1());
        b.K(parcel, 10, Z0());
        b.K(parcel, 11, p1());
        b.F(parcel, 12, g1());
        b.F(parcel, 13, this.Y);
        b.Y(parcel, 14, this.Z, false);
        b.g(parcel, 15, this.f5957a0);
        b.S(parcel, 16, this.f5958b0, i10, false);
        b.S(parcel, 17, this.f5959c0, i10, false);
        b.b(parcel, a10);
    }
}

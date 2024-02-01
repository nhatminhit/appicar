package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import j8.s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o8.j;

@SafeParcelable.a(creator = "ModuleInstallStatusUpdateCreator")
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new j();
    @SafeParcelable.c(getter = "getSessionId", id = 1)
    public final int O;
    @a
    @SafeParcelable.c(getter = "getInstallState", id = 2)
    public final int P;
    @o0
    @SafeParcelable.c(getter = "getBytesDownloaded", id = 3)
    public final Long Q;
    @o0
    @SafeParcelable.c(getter = "getTotalBytesToDownload", id = 4)
    public final Long R;
    @SafeParcelable.c(getter = "getErrorCode", id = 5)
    public final int S;
    @o0
    public final b T;

    @Retention(RetentionPolicy.CLASS)
    public @interface a {

        /* renamed from: d  reason: collision with root package name */
        public static final int f5771d = 0;

        /* renamed from: e  reason: collision with root package name */
        public static final int f5772e = 1;

        /* renamed from: f  reason: collision with root package name */
        public static final int f5773f = 2;

        /* renamed from: g  reason: collision with root package name */
        public static final int f5774g = 3;

        /* renamed from: h  reason: collision with root package name */
        public static final int f5775h = 4;

        /* renamed from: i  reason: collision with root package name */
        public static final int f5776i = 5;

        /* renamed from: j  reason: collision with root package name */
        public static final int f5777j = 6;

        /* renamed from: k  reason: collision with root package name */
        public static final int f5778k = 7;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final long f5779a;

        /* renamed from: b  reason: collision with root package name */
        public final long f5780b;

        public b(long j10, long j11) {
            s.p(j11);
            this.f5779a = j10;
            this.f5780b = j11;
        }

        public long a() {
            return this.f5779a;
        }

        public long b() {
            return this.f5780b;
        }
    }

    @e8.a
    @SafeParcelable.b
    public ModuleInstallStatusUpdate(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @a int i11, @SafeParcelable.e(id = 3) @o0 Long l10, @SafeParcelable.e(id = 4) @o0 Long l11, @SafeParcelable.e(id = 5) int i12) {
        this.O = i10;
        this.P = i11;
        this.Q = l10;
        this.R = l11;
        this.S = i12;
        this.T = (l10 == null || l11 == null || l11.longValue() == 0) ? null : new b(l10.longValue(), l11.longValue());
    }

    public int X0() {
        return this.S;
    }

    @a
    public int Z0() {
        return this.P;
    }

    @o0
    public b f1() {
        return this.T;
    }

    public int g1() {
        return this.O;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = l8.b.a(parcel);
        l8.b.F(parcel, 1, g1());
        l8.b.F(parcel, 2, Z0());
        l8.b.N(parcel, 3, this.Q, false);
        l8.b.N(parcel, 4, this.R, false);
        l8.b.F(parcel, 5, X0());
        l8.b.b(parcel, a10);
    }
}

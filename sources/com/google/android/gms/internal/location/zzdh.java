package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d9.f;
import java.util.Locale;
import l8.b;
import w8.d0;

@SafeParcelable.a(creator = "ParcelableGeofenceCreator")
@d0
@SafeParcelable.g({1000})
public final class zzdh extends AbstractSafeParcelable implements f {
    public static final Parcelable.Creator<zzdh> CREATOR = new h2();
    @SafeParcelable.c(getter = "getRequestId", id = 1)
    public final String O;
    @SafeParcelable.c(getter = "getExpirationTime", id = 2)
    public final long P;
    @SafeParcelable.c(getter = "getType", id = 3)
    public final short Q;
    @SafeParcelable.c(getter = "getLatitude", id = 4)
    public final double R;
    @SafeParcelable.c(getter = "getLongitude", id = 5)
    public final double S;
    @SafeParcelable.c(getter = "getRadius", id = 6)
    public final float T;
    @SafeParcelable.c(getter = "getTransitionTypes", id = 7)
    public final int U;
    @SafeParcelable.c(defaultValue = "0", getter = "getNotificationResponsiveness", id = 8)
    public final int V;
    @SafeParcelable.c(defaultValue = "-1", getter = "getLoiteringDelay", id = 9)
    public final int W;

    @SafeParcelable.b
    public zzdh(@SafeParcelable.e(id = 1) String str, @SafeParcelable.e(id = 7) int i10, @SafeParcelable.e(id = 3) short s10, @SafeParcelable.e(id = 4) double d10, @SafeParcelable.e(id = 5) double d11, @SafeParcelable.e(id = 6) float f10, @SafeParcelable.e(id = 2) long j10, @SafeParcelable.e(id = 8) int i11, @SafeParcelable.e(id = 9) int i12) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
        } else if (f10 <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f10);
        } else if (d10 > 90.0d || d10 < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d10);
        } else if (d11 > 180.0d || d11 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d11);
        } else {
            int i13 = i10 & 7;
            if (i13 != 0) {
                this.Q = s10;
                this.O = str;
                this.R = d10;
                this.S = d11;
                this.T = f10;
                this.P = j10;
                this.U = i13;
                this.V = i11;
                this.W = i12;
                return;
            }
            throw new IllegalArgumentException("No supported transition specified: " + i10);
        }
    }

    public final String A() {
        return this.O;
    }

    public final double a0() {
        return this.R;
    }

    public final long e0() {
        return this.P;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdh) {
            zzdh zzdh = (zzdh) obj;
            return this.T == zzdh.T && this.R == zzdh.R && this.S == zzdh.S && this.Q == zzdh.Q;
        }
    }

    public final float h() {
        return this.T;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.R);
        long doubleToLongBits2 = Double.doubleToLongBits(this.S);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.T)) * 31) + this.Q) * 31) + this.U;
    }

    public final int l() {
        return this.V;
    }

    public final double q() {
        return this.S;
    }

    public final int t() {
        return this.W;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        short s10 = this.Q;
        objArr[0] = s10 != -1 ? s10 != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID";
        objArr[1] = this.O.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.U);
        objArr[3] = Double.valueOf(this.R);
        objArr[4] = Double.valueOf(this.S);
        objArr[5] = Float.valueOf(this.T);
        objArr[6] = Integer.valueOf(this.V / 1000);
        objArr[7] = Integer.valueOf(this.W);
        objArr[8] = Long.valueOf(this.P);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.Y(parcel, 1, this.O, false);
        b.K(parcel, 2, this.P);
        b.U(parcel, 3, this.Q);
        b.r(parcel, 4, this.R);
        b.r(parcel, 5, this.S);
        b.w(parcel, 6, this.T);
        b.F(parcel, 7, this.U);
        b.F(parcel, 8, this.V);
        b.F(parcel, 9, this.W);
        b.b(parcel, a10);
    }

    public final int z0() {
        return this.U;
    }
}

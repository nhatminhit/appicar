package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d9.n0;
import d9.o0;
import j8.q;
import j8.s;
import j8.w;
import java.util.Comparator;
import l8.b;
import tf.g;

@SafeParcelable.a(creator = "DetectedActivityCreator")
@SafeParcelable.g({1000})
public class DetectedActivity extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new o0();
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static final int T = 3;
    public static final int U = 4;
    public static final int V = 5;
    public static final int W = 7;
    public static final int X = 8;
    @m0
    public static final Comparator Y = new n0();
    @SafeParcelable.c(id = 1)
    public int O;
    @SafeParcelable.c(id = 2)
    public int P;

    @SafeParcelable.b
    public DetectedActivity(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11) {
        this.O = i10;
        this.P = i11;
    }

    public int X0() {
        return this.P;
    }

    public int Z0() {
        int i10 = this.O;
        if (i10 > 22 || i10 < 0) {
            return 4;
        }
        return i10;
    }

    @w
    public final boolean equals(@d.o0 Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            return this.O == detectedActivity.O && this.P == detectedActivity.P;
        }
    }

    @w
    public final int hashCode() {
        return q.c(Integer.valueOf(this.O), Integer.valueOf(this.P));
    }

    @m0
    public String toString() {
        int Z0 = Z0();
        String num = Z0 != 0 ? Z0 != 1 ? Z0 != 2 ? Z0 != 3 ? Z0 != 4 ? Z0 != 5 ? Z0 != 7 ? Z0 != 8 ? Z0 != 16 ? Z0 != 17 ? Integer.toString(Z0) : "IN_RAIL_VEHICLE" : "IN_ROAD_VEHICLE" : g.f23205b : "WALKING" : "TILTING" : "UNKNOWN" : "STILL" : "ON_FOOT" : "ON_BICYCLE" : "IN_VEHICLE";
        int i10 = this.P;
        return "DetectedActivity [type=" + num + ", confidence=" + i10 + "]";
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        s.l(parcel);
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.F(parcel, 2, this.P);
        b.b(parcel, a10);
    }
}

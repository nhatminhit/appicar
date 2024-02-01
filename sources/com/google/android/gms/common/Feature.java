package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import d8.d0;
import e8.a;
import f6.e;
import j8.q;
import l8.b;

@a
@SafeParcelable.a(creator = "FeatureCreator")
public class Feature extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<Feature> CREATOR = new d0();
    @SafeParcelable.c(getter = "getName", id = 1)
    public final String O;
    @Deprecated
    @SafeParcelable.c(getter = "getOldVersion", id = 2)
    public final int P;
    @SafeParcelable.c(defaultValue = "-1", getter = "getVersion", id = 3)
    public final long Q;

    @SafeParcelable.b
    public Feature(@SafeParcelable.e(id = 1) @m0 String str, @SafeParcelable.e(id = 2) int i10, @SafeParcelable.e(id = 3) long j10) {
        this.O = str;
        this.P = i10;
        this.Q = j10;
    }

    @a
    public Feature(@m0 String str, long j10) {
        this.O = str;
        this.Q = j10;
        this.P = -1;
    }

    @a
    @m0
    public String X0() {
        return this.O;
    }

    @a
    public long Z0() {
        long j10 = this.Q;
        return j10 == -1 ? (long) this.P : j10;
    }

    public final boolean equals(@o0 Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            return ((X0() != null && X0().equals(feature.X0())) || (X0() == null && feature.X0() == null)) && Z0() == feature.Z0();
        }
    }

    public final int hashCode() {
        return q.c(X0(), Long.valueOf(Z0()));
    }

    @m0
    public final String toString() {
        q.a d10 = q.d(this);
        d10.a("name", X0());
        d10.a(e.f7416h, Long.valueOf(Z0()));
        return d10.toString();
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.Y(parcel, 1, X0(), false);
        b.F(parcel, 2, this.P);
        b.K(parcel, 3, Z0());
        b.b(parcel, a10);
    }
}

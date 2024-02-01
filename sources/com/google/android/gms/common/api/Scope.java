package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import e8.a;
import f8.i0;
import j8.s;
import l8.b;

@SafeParcelable.a(creator = "ScopeCreator")
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    @m0
    public static final Parcelable.Creator<Scope> CREATOR = new i0();
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getScopeUri", id = 2)
    public final String P;

    @SafeParcelable.b
    public Scope(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str) {
        s.i(str, "scopeUri must not be null or empty");
        this.O = i10;
        this.P = str;
    }

    public Scope(@m0 String str) {
        this(1, str);
    }

    @a
    @m0
    public String X0() {
        return this.P;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.P.equals(((Scope) obj).P);
    }

    public int hashCode() {
        return this.P.hashCode();
    }

    @m0
    public String toString() {
        return this.P;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.Y(parcel, 2, X0(), false);
        b.b(parcel, a10);
    }
}

package com.google.android.gms.auth.api.signin.internal;

import a8.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b8.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import l8.b;

@SafeParcelable.a(creator = "GoogleSignInOptionsExtensionCreator")
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new c();
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getType", id = 2)
    public int P;
    @SafeParcelable.c(getter = "getBundle", id = 3)
    public Bundle Q;

    @SafeParcelable.b
    public GoogleSignInOptionsExtensionParcelable(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) Bundle bundle) {
        this.O = i10;
        this.P = i11;
        this.Q = bundle;
    }

    public GoogleSignInOptionsExtensionParcelable(@m0 a aVar) {
        this(1, aVar.b(), aVar.a());
    }

    @e8.a
    public int X0() {
        return this.P;
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.F(parcel, 2, X0());
        b.k(parcel, 3, this.Q, false);
        b.b(parcel, a10);
    }
}

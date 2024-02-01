package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;
import d.o0;
import g9.i;
import l8.b;

@SafeParcelable.a(creator = "SignInResponseCreator")
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new i();
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getConnectionResult", id = 2)
    public final ConnectionResult P;
    @o0
    @SafeParcelable.c(getter = "getResolveAccountResponse", id = 3)
    public final zav Q;

    @SafeParcelable.b
    public zak(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) ConnectionResult connectionResult, @SafeParcelable.e(id = 3) @o0 zav zav) {
        this.O = i10;
        this.P = connectionResult;
        this.Q = zav;
    }

    public final ConnectionResult X0() {
        return this.P;
    }

    @o0
    public final zav Z0() {
        return this.Q;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.S(parcel, 2, this.P, i10, false);
        b.S(parcel, 3, this.Q, i10, false);
        b.b(parcel, a10);
    }
}

package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.o0;
import f8.u;
import g9.b;

@SafeParcelable.a(creator = "AuthAccountResultCreator")
public final class zaa extends AbstractSafeParcelable implements u {
    public static final Parcelable.Creator<zaa> CREATOR = new b();
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getConnectionResultCode", id = 2)
    public int P;
    @o0
    @SafeParcelable.c(getter = "getRawAuthResolutionIntent", id = 3)
    public Intent Q;

    public zaa() {
        this(2, 0, (Intent) null);
    }

    @SafeParcelable.b
    public zaa(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) @o0 Intent intent) {
        this.O = i10;
        this.P = i11;
        this.Q = intent;
    }

    public final Status g() {
        return this.P == 0 ? Status.U : Status.Y;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = l8.b.a(parcel);
        l8.b.F(parcel, 1, this.O);
        l8.b.F(parcel, 2, this.P);
        l8.b.S(parcel, 3, this.Q, i10, false);
        l8.b.b(parcel, a10);
    }
}

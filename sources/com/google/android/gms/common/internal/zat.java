package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.o0;
import j8.y0;
import l8.b;

@SafeParcelable.a(creator = "ResolveAccountRequestCreator")
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new y0();
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getAccount", id = 2)
    public final Account P;
    @SafeParcelable.c(getter = "getSessionId", id = 3)
    public final int Q;
    @o0
    @SafeParcelable.c(getter = "getSignInAccountHint", id = 4)
    public final GoogleSignInAccount R;

    @SafeParcelable.b
    public zat(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) Account account, @SafeParcelable.e(id = 3) int i11, @SafeParcelable.e(id = 4) @o0 GoogleSignInAccount googleSignInAccount) {
        this.O = i10;
        this.P = account;
        this.Q = i11;
        this.R = googleSignInAccount;
    }

    public zat(Account account, int i10, @o0 GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.S(parcel, 2, this.P, i10, false);
        b.F(parcel, 3, this.Q);
        b.S(parcel, 4, this.R, i10, false);
        b.b(parcel, a10);
    }
}

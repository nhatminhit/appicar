package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d8.e0;
import d8.q0;
import d8.w0;
import javax.annotation.Nullable;
import l8.b;

@SafeParcelable.a(creator = "GoogleCertificatesLookupResponseCreator")
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new q0();
    @SafeParcelable.c(getter = "getResult", id = 1)
    public final boolean O;
    @Nullable
    @SafeParcelable.c(getter = "getErrorMessage", id = 2)
    public final String P;
    @SafeParcelable.c(getter = "getStatusValue", id = 3)
    public final int Q;
    @SafeParcelable.c(getter = "getFirstPartyStatusValue", id = 4)
    public final int R;

    @SafeParcelable.b
    public zzq(@SafeParcelable.e(id = 1) boolean z10, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) int i10, @SafeParcelable.e(id = 4) int i11) {
        this.O = z10;
        this.P = str;
        this.Q = w0.a(i10) - 1;
        this.R = e0.a(i11) - 1;
    }

    @Nullable
    public final String X0() {
        return this.P;
    }

    public final boolean Z0() {
        return this.O;
    }

    public final int f1() {
        return e0.a(this.R);
    }

    public final int g1() {
        return w0.a(this.Q);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.g(parcel, 1, this.O);
        b.Y(parcel, 2, this.P, false);
        b.F(parcel, 3, this.Q);
        b.F(parcel, 4, this.R);
        b.b(parcel, a10);
    }
}

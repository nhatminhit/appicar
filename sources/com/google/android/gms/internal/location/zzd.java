package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.o0;
import java.util.Arrays;
import java.util.List;
import l8.b;

@SafeParcelable.a(creator = "ClientIdentityCreator")
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new x2();
    @SafeParcelable.c(getter = "getUid", id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getPid", id = 2)
    public final int P;
    @SafeParcelable.c(getter = "getPackageName", id = 3)
    public final String Q;
    @o0
    @SafeParcelable.c(getter = "getAttributionTag", id = 4)
    public final String R;
    @SafeParcelable.c(getter = "getClientSdkVersion", id = 5)
    public final int S;
    @o0
    @SafeParcelable.c(getter = "getListenerId", id = 6)
    public final String T;
    @o0
    @SafeParcelable.c(getter = "getImpersonator", id = 7)
    public final zzd U;
    @SafeParcelable.c(defaultValueUnchecked = "com.google.common.collect.ImmutableList.of()", getter = "getClientFeatures", id = 8)
    public final List V;

    static {
        Process.myUid();
        Process.myPid();
    }

    @SafeParcelable.b
    public zzd(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) String str, @SafeParcelable.e(id = 4) @o0 String str2, @SafeParcelable.e(id = 6) @o0 String str3, @SafeParcelable.e(id = 5) int i12, @SafeParcelable.e(id = 8) List list, @SafeParcelable.e(id = 7) @o0 zzd zzd) {
        this.O = i10;
        this.P = i11;
        this.Q = str;
        this.R = str2;
        this.T = str3;
        this.S = i12;
        this.V = r2.n(list);
        this.U = zzd;
    }

    public final boolean equals(@o0 Object obj) {
        if (obj instanceof zzd) {
            zzd zzd = (zzd) obj;
            return this.O == zzd.O && this.P == zzd.P && this.S == zzd.S && this.Q.equals(zzd.Q) && k2.a(this.R, zzd.R) && k2.a(this.T, zzd.T) && k2.a(this.U, zzd.U) && this.V.equals(zzd.V);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.O), this.Q, this.R, this.T});
    }

    public final String toString() {
        int length = this.Q.length() + 18;
        String str = this.R;
        if (str != null) {
            length += str.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.O);
        sb2.append("/");
        sb2.append(this.Q);
        if (this.R != null) {
            sb2.append("[");
            if (this.R.startsWith(this.Q)) {
                sb2.append(this.R, this.Q.length(), this.R.length());
            } else {
                sb2.append(this.R);
            }
            sb2.append("]");
        }
        if (this.T != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(this.T.hashCode()));
        }
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.F(parcel, 2, this.P);
        b.Y(parcel, 3, this.Q, false);
        b.Y(parcel, 4, this.R, false);
        b.F(parcel, 5, this.S);
        b.Y(parcel, 6, this.T, false);
        b.S(parcel, 7, this.U, i10, false);
        b.d0(parcel, 8, this.V, false);
        b.b(parcel, a10);
    }
}

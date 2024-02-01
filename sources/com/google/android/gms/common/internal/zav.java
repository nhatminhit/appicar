package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.o0;
import j8.q;
import j8.z0;

@SafeParcelable.a(creator = "ResolveAccountResponseCreator")
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new z0();
    @SafeParcelable.h(id = 1)
    public final int O;
    @o0
    @SafeParcelable.c(id = 2)
    public final IBinder P;
    @SafeParcelable.c(getter = "getConnectionResult", id = 3)
    public final ConnectionResult Q;
    @SafeParcelable.c(getter = "getSaveDefaultAccount", id = 4)
    public final boolean R;
    @SafeParcelable.c(getter = "isFromCrossClientAuth", id = 5)
    public final boolean S;

    @SafeParcelable.b
    public zav(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @o0 IBinder iBinder, @SafeParcelable.e(id = 3) ConnectionResult connectionResult, @SafeParcelable.e(id = 4) boolean z10, @SafeParcelable.e(id = 5) boolean z11) {
        this.O = i10;
        this.P = iBinder;
        this.Q = connectionResult;
        this.R = z10;
        this.S = z11;
    }

    public final ConnectionResult X0() {
        return this.Q;
    }

    @o0
    public final b Z0() {
        IBinder iBinder = this.P;
        if (iBinder == null) {
            return null;
        }
        return b.a.H(iBinder);
    }

    public final boolean equals(@o0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zav = (zav) obj;
        return this.Q.equals(zav.Q) && q.b(Z0(), zav.Z0());
    }

    public final boolean f1() {
        return this.R;
    }

    public final boolean g1() {
        return this.S;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = l8.b.a(parcel);
        l8.b.F(parcel, 1, this.O);
        l8.b.B(parcel, 2, this.P, false);
        l8.b.S(parcel, 3, this.Q, i10, false);
        l8.b.g(parcel, 4, this.R);
        l8.b.g(parcel, 5, this.S);
        l8.b.b(parcel, a10);
    }
}

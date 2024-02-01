package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import e8.a;
import j8.c0;
import j8.q;
import l8.b;

@a
@SafeParcelable.a(creator = "ClientIdentityCreator")
@SafeParcelable.g({1000})
public class ClientIdentity extends AbstractSafeParcelable {
    @a
    @m0
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new c0();
    @a
    @SafeParcelable.c(defaultValueUnchecked = "0", id = 1)
    public final int O;
    @a
    @o0
    @SafeParcelable.c(defaultValueUnchecked = "null", id = 2)
    public final String P;

    @SafeParcelable.b
    public ClientIdentity(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @o0 String str) {
        this.O = i10;
        this.P = str;
    }

    public final boolean equals(@o0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.O == this.O && q.b(clientIdentity.P, this.P);
    }

    public final int hashCode() {
        return this.O;
    }

    @m0
    public final String toString() {
        int i10 = this.O;
        String str = this.P;
        return i10 + ":" + str;
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.Y(parcel, 2, this.P, false);
        b.b(parcel, a10);
    }
}

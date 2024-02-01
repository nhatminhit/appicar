package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.o0;
import f8.u;
import g9.g;
import java.util.List;
import l8.b;

@SafeParcelable.a(creator = "RecordConsentByConsentResultResponseCreator")
public final class zag extends AbstractSafeParcelable implements u {
    public static final Parcelable.Creator<zag> CREATOR = new g();
    @SafeParcelable.c(getter = "getGrantedScopes", id = 1)
    public final List O;
    @o0
    @SafeParcelable.c(getter = "getToken", id = 2)
    public final String P;

    @SafeParcelable.b
    public zag(@SafeParcelable.e(id = 1) List list, @SafeParcelable.e(id = 2) @o0 String str) {
        this.O = list;
        this.P = str;
    }

    public final Status g() {
        return this.P != null ? Status.U : Status.Y;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.a0(parcel, 1, this.O, false);
        b.Y(parcel, 2, this.P, false);
        b.b(parcel, a10);
    }
}

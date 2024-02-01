package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d8.p0;
import l8.b;
import z8.d;
import z8.f;

@SafeParcelable.a(creator = "GoogleCertificatesLookupQueryCreator")
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new p0();
    @SafeParcelable.c(getter = "getCallingPackage", id = 1)
    public final String O;
    @SafeParcelable.c(getter = "getAllowTestKeys", id = 2)
    public final boolean P;
    @SafeParcelable.c(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 3)
    public final boolean Q;
    @SafeParcelable.c(getter = "getCallingContextBinder", id = 4, type = "android.os.IBinder")
    public final Context R;
    @SafeParcelable.c(getter = "getIsChimeraPackage", id = 5)
    public final boolean S;

    @SafeParcelable.b
    public zzo(@SafeParcelable.e(id = 1) String str, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) boolean z11, @SafeParcelable.e(id = 4) IBinder iBinder, @SafeParcelable.e(id = 5) boolean z12) {
        this.O = str;
        this.P = z10;
        this.Q = z11;
        this.R = (Context) f.J(d.a.H(iBinder));
        this.S = z12;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [z8.d, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.Y(parcel, 1, this.O, false);
        b.g(parcel, 2, this.P);
        b.g(parcel, 3, this.Q);
        b.B(parcel, 4, f.b0(this.R), false);
        b.g(parcel, 5, this.S);
        b.b(parcel, a10);
    }
}

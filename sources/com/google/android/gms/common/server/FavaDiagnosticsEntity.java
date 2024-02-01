package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import e8.a;
import l8.b;

@a
@SafeParcelable.a(creator = "FavaDiagnosticsEntityCreator")
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    @a
    @m0
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new r8.a();
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(id = 2)
    @m0
    public final String P;
    @SafeParcelable.c(id = 3)
    public final int Q;

    @SafeParcelable.b
    public FavaDiagnosticsEntity(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @m0 String str, @SafeParcelable.e(id = 3) int i11) {
        this.O = i10;
        this.P = str;
        this.Q = i11;
    }

    @a
    public FavaDiagnosticsEntity(@m0 String str, int i10) {
        this.O = 1;
        this.P = str;
        this.Q = i10;
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.Y(parcel, 2, this.P, false);
        b.F(parcel, 3, this.Q);
        b.b(parcel, a10);
    }
}

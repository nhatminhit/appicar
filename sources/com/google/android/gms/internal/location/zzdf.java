package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.o0;
import d9.t0;
import d9.u0;
import d9.w0;
import d9.x0;
import l8.b;

@SafeParcelable.a(creator = "LocationRequestUpdateDataCreator")
@Deprecated
@SafeParcelable.g({1000})
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new g2();
    @SafeParcelable.c(defaultValueUnchecked = "LocationRequestUpdateData.OPERATION_ADD", getter = "getOperation", id = 1)
    public final int O;
    @o0
    @SafeParcelable.c(defaultValueUnchecked = "null", getter = "getLocationRequest", id = 2)
    public final zzdd P;
    @o0
    @SafeParcelable.c(defaultValueUnchecked = "null", getter = "getLocationListenerAsBinder", id = 3, type = "android.os.IBinder")
    public final x0 Q;
    @o0
    @SafeParcelable.c(defaultValueUnchecked = "null", getter = "getLocationCallbackAsBinder", id = 5, type = "android.os.IBinder")
    public final u0 R;
    @o0
    @SafeParcelable.c(defaultValueUnchecked = "null", getter = "getPendingIntent", id = 4)
    public final PendingIntent S;
    @o0
    @SafeParcelable.c(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackAsBinder", id = 6, type = "android.os.IBinder")
    public final c3 T;
    @o0
    @SafeParcelable.c(defaultValueUnchecked = "null", getter = "getListenerId", id = 8)
    public final String U;

    @SafeParcelable.b
    public zzdf(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @o0 zzdd zzdd, @SafeParcelable.e(id = 3) @o0 IBinder iBinder, @SafeParcelable.e(id = 5) @o0 IBinder iBinder2, @SafeParcelable.e(id = 4) @o0 PendingIntent pendingIntent, @SafeParcelable.e(id = 6) @o0 IBinder iBinder3, @SafeParcelable.e(id = 8) @o0 String str) {
        this.O = i10;
        this.P = zzdd;
        c3 c3Var = null;
        this.Q = iBinder != null ? w0.H(iBinder) : null;
        this.S = pendingIntent;
        this.R = iBinder2 != null ? t0.H(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            c3Var = queryLocalInterface instanceof c3 ? (c3) queryLocalInterface : new a3(iBinder3);
        }
        this.T = c3Var;
        this.U = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.S(parcel, 2, this.P, i10, false);
        x0 x0Var = this.Q;
        IBinder iBinder = null;
        b.B(parcel, 3, x0Var == null ? null : x0Var.asBinder(), false);
        b.S(parcel, 4, this.S, i10, false);
        u0 u0Var = this.R;
        b.B(parcel, 5, u0Var == null ? null : u0Var.asBinder(), false);
        c3 c3Var = this.T;
        if (c3Var != null) {
            iBinder = c3Var.asBinder();
        }
        b.B(parcel, 6, iBinder, false);
        b.Y(parcel, 8, this.U, false);
        b.b(parcel, a10);
    }
}

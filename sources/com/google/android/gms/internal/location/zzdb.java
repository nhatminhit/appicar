package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.o0;
import l8.b;

@SafeParcelable.a(creator = "LocationReceiverCreator")
public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR = new e2();
    @SafeParcelable.c(getter = "getType", id = 1)
    public final int O;
    @o0
    @SafeParcelable.c(getter = "getOldBinderReceiver", id = 2)
    public final IBinder P;
    @o0
    @SafeParcelable.c(getter = "getBinderReceiver", id = 3)
    public final IBinder Q;
    @o0
    @SafeParcelable.c(getter = "getPendingIntentReceiver", id = 4)
    public final PendingIntent R;
    @o0
    @SafeParcelable.c(getter = "getModuleId", id = 5)
    public final String S;
    @o0
    @SafeParcelable.c(getter = "getListenerId", id = 6)
    public final String T;

    @SafeParcelable.b
    public zzdb(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @o0 IBinder iBinder, @SafeParcelable.e(id = 3) @o0 IBinder iBinder2, @SafeParcelable.e(id = 4) @o0 PendingIntent pendingIntent, @SafeParcelable.e(id = 5) @o0 String str, @SafeParcelable.e(id = 6) @o0 String str2) {
        this.O = i10;
        this.P = iBinder;
        this.Q = iBinder2;
        this.R = pendingIntent;
        this.S = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.T = str2;
    }

    public static zzdb X0(PendingIntent pendingIntent, @o0 String str, @o0 String str2) {
        return new zzdb(3, (IBinder) null, (IBinder) null, pendingIntent, (String) null, (String) null);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzdb Z0(@d.o0 android.os.IInterface r7, d9.u0 r8, @d.o0 java.lang.String r9, @d.o0 java.lang.String r10) {
        /*
            com.google.android.gms.internal.location.zzdb r9 = new com.google.android.gms.internal.location.zzdb
            if (r7 != 0) goto L_0x0005
            r7 = 0
        L_0x0005:
            r2 = r7
            r1 = 2
            r4 = 0
            r5 = 0
            r0 = r9
            r3 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzdb.Z0(android.os.IInterface, d9.u0, java.lang.String, java.lang.String):com.google.android.gms.internal.location.zzdb");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzdb f1(@d.o0 android.os.IInterface r7, d9.x0 r8, @d.o0 java.lang.String r9, @d.o0 java.lang.String r10) {
        /*
            com.google.android.gms.internal.location.zzdb r9 = new com.google.android.gms.internal.location.zzdb
            if (r7 != 0) goto L_0x0005
            r7 = 0
        L_0x0005:
            r2 = r7
            r1 = 1
            r4 = 0
            r5 = 0
            r0 = r9
            r3 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzdb.f1(android.os.IInterface, d9.x0, java.lang.String, java.lang.String):com.google.android.gms.internal.location.zzdb");
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.B(parcel, 2, this.P, false);
        b.B(parcel, 3, this.Q, false);
        b.S(parcel, 4, this.R, i10, false);
        b.Y(parcel, 5, this.S, false);
        b.Y(parcel, 6, this.T, false);
        b.b(parcel, a10);
    }
}

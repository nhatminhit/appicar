package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d8.k0;
import d8.l0;
import d8.r0;
import j8.j2;
import javax.annotation.Nullable;
import l8.b;
import z8.d;
import z8.f;

@SafeParcelable.a(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new r0();
    @SafeParcelable.c(getter = "getCallingPackage", id = 1)
    public final String O;
    @Nullable
    @SafeParcelable.c(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    public final k0 P;
    @SafeParcelable.c(getter = "getAllowTestKeys", id = 3)
    public final boolean Q;
    @SafeParcelable.c(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 4)
    public final boolean R;

    @SafeParcelable.b
    public zzs(@SafeParcelable.e(id = 1) String str, @SafeParcelable.e(id = 2) @Nullable IBinder iBinder, @SafeParcelable.e(id = 3) boolean z10, @SafeParcelable.e(id = 4) boolean z11) {
        this.O = str;
        l0 l0Var = null;
        if (iBinder != null) {
            try {
                d c10 = j2.H(iBinder).c();
                byte[] bArr = c10 == null ? null : (byte[]) f.J(c10);
                if (bArr != null) {
                    l0Var = new l0(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.P = l0Var;
        this.Q = z10;
        this.R = z11;
    }

    public zzs(String str, @Nullable k0 k0Var, boolean z10, boolean z11) {
        this.O = str;
        this.P = k0Var;
        this.Q = z10;
        this.R = z11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.Y(parcel, 1, this.O, false);
        k0 k0Var = this.P;
        if (k0Var == null) {
            k0Var = null;
        }
        b.B(parcel, 2, k0Var, false);
        b.g(parcel, 3, this.Q);
        b.g(parcel, 4, this.R);
        b.b(parcel, a10);
    }
}

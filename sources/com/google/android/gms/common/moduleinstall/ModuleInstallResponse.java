package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import e8.a;
import l8.b;
import o8.i;

@SafeParcelable.a(creator = "ModuleInstallResponseCreator")
public class ModuleInstallResponse extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new i();
    @SafeParcelable.c(getter = "getSessionId", id = 1)
    public final int O;
    @SafeParcelable.c(defaultValue = "false", getter = "getShouldUnregisterListener", id = 2)
    public final boolean P;

    @a
    public ModuleInstallResponse(int i10) {
        this(i10, false);
    }

    @SafeParcelable.b
    public ModuleInstallResponse(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) boolean z10) {
        this.O = i10;
        this.P = z10;
    }

    public boolean X0() {
        return this.O == 0;
    }

    public int Z0() {
        return this.O;
    }

    public final boolean f1() {
        return this.P;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, Z0());
        b.g(parcel, 2, this.P);
        b.b(parcel, a10);
    }
}

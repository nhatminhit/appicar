package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import e8.a;
import l8.b;
import o8.g;

@SafeParcelable.a(creator = "ModuleInstallIntentResponseCreator")
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new g();
    @o0
    @SafeParcelable.c(getter = "getPendingIntent", id = 1)
    public final PendingIntent O;

    @a
    @SafeParcelable.b
    public ModuleInstallIntentResponse(@SafeParcelable.e(id = 1) @o0 PendingIntent pendingIntent) {
        this.O = pendingIntent;
    }

    @o0
    public PendingIntent X0() {
        return this.O;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.S(parcel, 1, X0(), i10, false);
        b.b(parcel, a10);
    }
}

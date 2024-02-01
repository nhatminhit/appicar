package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import e8.a;
import j8.d0;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import l8.b;

@a
@SafeParcelable.a(creator = "TelemetryDataCreator")
public class TelemetryData extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<TelemetryData> CREATOR = new d0();
    @SafeParcelable.c(getter = "getTelemetryConfigVersion", id = 1)
    public final int O;
    @Nullable
    @SafeParcelable.c(getter = "getMethodInvocations", id = 2)
    public List P;

    @SafeParcelable.b
    public TelemetryData(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @Nullable List list) {
        this.O = i10;
        this.P = list;
    }

    @o0
    public final List X0() {
        return this.P;
    }

    public final void Z0(@m0 MethodInvocation methodInvocation) {
        if (this.P == null) {
            this.P = new ArrayList();
        }
        this.P.add(methodInvocation);
    }

    public final int c() {
        return this.O;
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.d0(parcel, 2, this.P, false);
        b.b(parcel, a10);
    }
}

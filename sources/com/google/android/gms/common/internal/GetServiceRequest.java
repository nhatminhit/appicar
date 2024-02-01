package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import e8.a;
import j8.x1;

@a
@SafeParcelable.a(creator = "GetServiceRequestCreator")
@SafeParcelable.g({9})
public class GetServiceRequest extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new x1();

    /* renamed from: c0  reason: collision with root package name */
    public static final Scope[] f5764c0 = new Scope[0];

    /* renamed from: d0  reason: collision with root package name */
    public static final Feature[] f5765d0 = new Feature[0];
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(id = 2)
    public final int P;
    @SafeParcelable.c(id = 3)
    public int Q;
    @SafeParcelable.c(id = 4)
    public String R;
    @o0
    @SafeParcelable.c(id = 5)
    public IBinder S;
    @SafeParcelable.c(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", id = 6)
    public Scope[] T;
    @SafeParcelable.c(defaultValueUnchecked = "new android.os.Bundle()", id = 7)
    public Bundle U;
    @o0
    @SafeParcelable.c(id = 8)
    public Account V;
    @SafeParcelable.c(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 10)
    public Feature[] W;
    @SafeParcelable.c(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 11)
    public Feature[] X;
    @SafeParcelable.c(id = 12)
    public boolean Y;
    @SafeParcelable.c(defaultValue = "0", id = 13)
    public int Z;
    @SafeParcelable.c(getter = "isRequestingTelemetryConfiguration", id = 14)

    /* renamed from: a0  reason: collision with root package name */
    public boolean f5766a0;
    @o0
    @SafeParcelable.c(getter = "getAttributionTag", id = 15)

    /* renamed from: b0  reason: collision with root package name */
    public String f5767b0;

    @SafeParcelable.b
    public GetServiceRequest(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) int i12, @SafeParcelable.e(id = 4) String str, @SafeParcelable.e(id = 5) @o0 IBinder iBinder, @SafeParcelable.e(id = 6) Scope[] scopeArr, @SafeParcelable.e(id = 7) Bundle bundle, @SafeParcelable.e(id = 8) @o0 Account account, @SafeParcelable.e(id = 10) Feature[] featureArr, @SafeParcelable.e(id = 11) Feature[] featureArr2, @SafeParcelable.e(id = 12) boolean z10, @SafeParcelable.e(id = 13) int i13, @SafeParcelable.e(id = 14) boolean z11, @SafeParcelable.e(id = 15) @o0 String str2) {
        scopeArr = scopeArr == null ? f5764c0 : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f5765d0 : featureArr;
        featureArr2 = featureArr2 == null ? f5765d0 : featureArr2;
        this.O = i10;
        this.P = i11;
        this.Q = i12;
        if ("com.google.android.gms".equals(str)) {
            this.R = "com.google.android.gms";
        } else {
            this.R = str;
        }
        if (i10 < 2) {
            this.V = iBinder != null ? a.J(b.a.H(iBinder)) : null;
        } else {
            this.S = iBinder;
            this.V = account;
        }
        this.T = scopeArr;
        this.U = bundle;
        this.W = featureArr;
        this.X = featureArr2;
        this.Y = z10;
        this.Z = i13;
        this.f5766a0 = z11;
        this.f5767b0 = str2;
    }

    @a
    @m0
    public Bundle X0() {
        return this.U;
    }

    @o0
    public final String Z0() {
        return this.f5767b0;
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        x1.a(this, parcel, i10);
    }
}

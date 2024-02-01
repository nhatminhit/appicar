package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.o0;
import j8.a1;
import l8.b;

@SafeParcelable.a(creator = "SignInButtonConfigCreator")
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new a1();
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getButtonSize", id = 2)
    public final int P;
    @SafeParcelable.c(getter = "getColorScheme", id = 3)
    public final int Q;
    @o0
    @Deprecated
    @SafeParcelable.c(getter = "getScopes", id = 4)
    public final Scope[] R;

    @SafeParcelable.b
    public zax(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) int i12, @SafeParcelable.e(id = 4) @o0 Scope[] scopeArr) {
        this.O = i10;
        this.P = i11;
        this.Q = i12;
        this.R = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.F(parcel, 2, this.P);
        b.F(parcel, 3, this.Q);
        b.c0(parcel, 4, this.R, i10, false);
        b.b(parcel, a10);
    }
}

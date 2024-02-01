package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import d.m0;
import e8.a;
import j8.t1;
import j8.u1;

@KeepName
@a
public final class BinderWrapper implements Parcelable {
    @m0
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new t1();
    public IBinder O;

    @a
    public BinderWrapper(@m0 IBinder iBinder) {
        this.O = iBinder;
    }

    public /* synthetic */ BinderWrapper(Parcel parcel, u1 u1Var) {
        this.O = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        parcel.writeStrongBinder(this.O);
    }
}

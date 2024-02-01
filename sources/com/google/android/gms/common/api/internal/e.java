package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import b9.b;
import b9.c;
import com.google.android.gms.common.api.Status;
import d.m0;

public interface e extends IInterface {

    public static abstract class a extends b implements e {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @m0
        public static e Z1(@m0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return queryLocalInterface instanceof e ? (e) queryLocalInterface : new w(iBinder);
        }

        public final boolean Y1(int i10, @m0 Parcel parcel, @m0 Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                return false;
            }
            c.b(parcel);
            r0((Status) c.a(parcel, Status.CREATOR));
            return true;
        }
    }

    void r0(@m0 Status status) throws RemoteException;
}

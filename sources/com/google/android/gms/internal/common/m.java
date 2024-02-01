package com.google.android.gms.internal.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class m extends Binder implements IInterface {
    public m(String str) {
        attachInterface(this, str);
    }

    public boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        return false;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return D(i10, parcel, parcel2, i11);
    }
}

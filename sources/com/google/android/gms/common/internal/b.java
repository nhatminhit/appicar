package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.m;
import com.google.android.gms.internal.common.n;
import d.m0;

public interface b extends IInterface {

    public static abstract class a extends m implements b {
        public a() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @m0
        public static b H(@m0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof b ? (b) queryLocalInterface : new c(iBinder);
        }

        public final boolean D(int i10, @m0 Parcel parcel, @m0 Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 2) {
                return false;
            }
            Account l10 = l();
            parcel2.writeNoException();
            n.e(parcel2, l10);
            return true;
        }
    }

    @m0
    Account l() throws RemoteException;
}

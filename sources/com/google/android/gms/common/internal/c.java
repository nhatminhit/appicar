package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.a;
import com.google.android.gms.internal.common.n;

public final class c extends a implements b {
    public c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account l() throws RemoteException {
        Parcel D = D(2, b0());
        Account account = (Account) n.a(D, Account.CREATOR);
        D.recycle();
        return account;
    }
}

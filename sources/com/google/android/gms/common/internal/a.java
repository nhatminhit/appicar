package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.b;
import d.m0;
import d.o0;

public class a extends b.a {
    @e8.a
    @o0
    public static Account J(@m0 b bVar) {
        Account account = null;
        if (bVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = bVar.l();
            } catch (RemoteException unused) {
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th2;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }

    public final boolean equals(@o0 Object obj) {
        throw null;
    }

    @m0
    public final Account l() {
        throw null;
    }
}

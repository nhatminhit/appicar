package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;

public interface e3 extends IInterface {
    void V1(int i10, String[] strArr) throws RemoteException;

    void n0(int i10, String[] strArr) throws RemoteException;

    void p1(int i10, PendingIntent pendingIntent) throws RemoteException;
}

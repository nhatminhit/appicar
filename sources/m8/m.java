package m8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import b9.a;
import b9.c;

public final class m extends a implements IInterface {
    public m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void Y1(l lVar) throws RemoteException {
        Parcel D = D();
        c.e(D, lVar);
        b0(1, D);
    }
}

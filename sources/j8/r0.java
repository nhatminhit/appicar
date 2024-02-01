package j8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import b9.a;
import b9.c;
import com.google.android.gms.common.internal.zax;
import z8.d;

public final class r0 extends a implements IInterface {
    public r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final d Y1(d dVar, zax zax) throws RemoteException {
        Parcel D = D();
        c.e(D, dVar);
        c.d(D, zax);
        Parcel H = H(2, D);
        d H2 = d.a.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }
}

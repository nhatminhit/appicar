package g9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import b9.a;
import b9.c;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.signin.internal.zai;

public final class f extends a implements IInterface {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void Y1(int i10) throws RemoteException {
        Parcel D = D();
        D.writeInt(i10);
        J(7, D);
    }

    public final void Z1(b bVar, int i10, boolean z10) throws RemoteException {
        Parcel D = D();
        c.e(D, bVar);
        D.writeInt(i10);
        c.c(D, z10);
        J(9, D);
    }

    public final void a2(zai zai, e eVar) throws RemoteException {
        Parcel D = D();
        c.d(D, zai);
        c.e(D, eVar);
        J(12, D);
    }
}

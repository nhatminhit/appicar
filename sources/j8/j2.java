package j8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.m;
import com.google.android.gms.internal.common.n;
import z8.d;

public abstract class j2 extends m implements k2 {
    public j2() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static k2 H(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof k2 ? (k2) queryLocalInterface : new i2(iBinder);
    }

    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            d c10 = c();
            parcel2.writeNoException();
            n.f(parcel2, c10);
        } else if (i10 != 2) {
            return false;
        } else {
            int o10 = o();
            parcel2.writeNoException();
            parcel2.writeInt(o10);
        }
        return true;
    }
}

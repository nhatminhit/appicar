package m8;

import android.os.Parcel;
import android.os.RemoteException;
import b9.b;
import b9.c;

public abstract class k extends b implements l {
    public k() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    public final boolean Y1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        c.b(parcel);
        K0(readInt);
        return true;
    }
}

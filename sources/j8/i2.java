package j8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.a;
import z8.d;

public final class i2 extends a implements k2 {
    public i2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final d c() throws RemoteException {
        Parcel D = D(1, b0());
        d H = d.a.H(D.readStrongBinder());
        D.recycle();
        return H;
    }

    public final int o() throws RemoteException {
        Parcel D = D(2, b0());
        int readInt = D.readInt();
        D.recycle();
        return readInt;
    }
}

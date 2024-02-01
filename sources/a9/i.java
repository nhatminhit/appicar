package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.a;
import com.google.android.gms.internal.common.n;
import z8.d;

public final class i extends a implements IInterface {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final d Y1(d dVar, String str, int i10, d dVar2) throws RemoteException {
        Parcel b02 = b0();
        n.f(b02, dVar);
        b02.writeString(str);
        b02.writeInt(i10);
        n.f(b02, dVar2);
        Parcel D = D(2, b02);
        d H = d.a.H(D.readStrongBinder());
        D.recycle();
        return H;
    }

    public final d Z1(d dVar, String str, int i10, d dVar2) throws RemoteException {
        Parcel b02 = b0();
        n.f(b02, dVar);
        b02.writeString(str);
        b02.writeInt(i10);
        n.f(b02, dVar2);
        Parcel D = D(3, b02);
        d H = d.a.H(D.readStrongBinder());
        D.recycle();
        return H;
    }
}

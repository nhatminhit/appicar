package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.a;
import com.google.android.gms.internal.common.n;
import z8.d;

public final class h extends a implements IInterface {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int Y1() throws RemoteException {
        Parcel D = D(6, b0());
        int readInt = D.readInt();
        D.recycle();
        return readInt;
    }

    public final int Z1(d dVar, String str, boolean z10) throws RemoteException {
        Parcel b02 = b0();
        n.f(b02, dVar);
        b02.writeString(str);
        n.c(b02, z10);
        Parcel D = D(3, b02);
        int readInt = D.readInt();
        D.recycle();
        return readInt;
    }

    public final int a2(d dVar, String str, boolean z10) throws RemoteException {
        Parcel b02 = b0();
        n.f(b02, dVar);
        b02.writeString(str);
        n.c(b02, z10);
        Parcel D = D(5, b02);
        int readInt = D.readInt();
        D.recycle();
        return readInt;
    }

    public final d b2(d dVar, String str, int i10) throws RemoteException {
        Parcel b02 = b0();
        n.f(b02, dVar);
        b02.writeString(str);
        b02.writeInt(i10);
        Parcel D = D(2, b02);
        d H = d.a.H(D.readStrongBinder());
        D.recycle();
        return H;
    }

    public final d c2(d dVar, String str, int i10, d dVar2) throws RemoteException {
        Parcel b02 = b0();
        n.f(b02, dVar);
        b02.writeString(str);
        b02.writeInt(i10);
        n.f(b02, dVar2);
        Parcel D = D(8, b02);
        d H = d.a.H(D.readStrongBinder());
        D.recycle();
        return H;
    }

    public final d d2(d dVar, String str, int i10) throws RemoteException {
        Parcel b02 = b0();
        n.f(b02, dVar);
        b02.writeString(str);
        b02.writeInt(i10);
        Parcel D = D(4, b02);
        d H = d.a.H(D.readStrongBinder());
        D.recycle();
        return H;
    }

    public final d e2(d dVar, String str, boolean z10, long j10) throws RemoteException {
        Parcel b02 = b0();
        n.f(b02, dVar);
        b02.writeString(str);
        n.c(b02, z10);
        b02.writeLong(j10);
        Parcel D = D(7, b02);
        d H = d.a.H(D.readStrongBinder());
        D.recycle();
        return H;
    }
}

package b9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class a implements IInterface {
    public final IBinder O;
    public final String P;

    public a(IBinder iBinder, String str) {
        this.O = iBinder;
        this.P = str;
    }

    public final Parcel D() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.P);
        return obtain;
    }

    public final Parcel H(int i10, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.O.transact(2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final void J(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.O.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.O;
    }

    public final void b0(int i10, Parcel parcel) throws RemoteException {
        try {
            this.O.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

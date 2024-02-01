package ni;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface d extends IInterface {

    public static class a implements d {
        public void D0(boolean z10) throws RemoteException {
        }

        public void J0(int i10, int i11) throws RemoteException {
        }

        public void a() throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        public void i1(int i10, int i11) throws RemoteException {
        }

        public void k1(String str, String str2, int i10) throws RemoteException {
        }

        public void r1(int i10) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements d {
        public static final String O = "vn.icar.entertaiment.IIECallback";
        public static final int P = 1;
        public static final int Q = 2;
        public static final int R = 3;
        public static final int S = 4;
        public static final int T = 5;
        public static final int U = 6;

        public static class a implements d {
            public static d P;
            public IBinder O;

            public a(IBinder iBinder) {
                this.O = iBinder;
            }

            public String D() {
                return b.O;
            }

            public void D0(boolean z10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    obtain.writeInt(z10 ? 1 : 0);
                    if (this.O.transact(2, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().D0(z10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void J0(int i10, int i11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    obtain.writeInt(i10);
                    obtain.writeInt(i11);
                    if (this.O.transact(5, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().J0(i10, i11);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    if (this.O.transact(6, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().a();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.O;
            }

            public void i1(int i10, int i11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    obtain.writeInt(i10);
                    obtain.writeInt(i11);
                    if (this.O.transact(3, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().i1(i10, i11);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void k1(String str, String str2, int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i10);
                    if (this.O.transact(1, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().k1(str, str2, i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void r1(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(4, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().r1(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, O);
        }

        public static d D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(O);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof d)) ? new a(iBinder) : (d) queryLocalInterface;
        }

        public static d H() {
            return a.P;
        }

        public static boolean J(d dVar) {
            if (a.P != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (dVar == null) {
                return false;
            } else {
                a.P = dVar;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1598968902) {
                switch (i10) {
                    case 1:
                        parcel.enforceInterface(O);
                        k1(parcel.readString(), parcel.readString(), parcel.readInt());
                        break;
                    case 2:
                        parcel.enforceInterface(O);
                        D0(parcel.readInt() != 0);
                        break;
                    case 3:
                        parcel.enforceInterface(O);
                        i1(parcel.readInt(), parcel.readInt());
                        break;
                    case 4:
                        parcel.enforceInterface(O);
                        r1(parcel.readInt());
                        break;
                    case 5:
                        parcel.enforceInterface(O);
                        J0(parcel.readInt(), parcel.readInt());
                        break;
                    case 6:
                        parcel.enforceInterface(O);
                        a();
                        break;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeNoException();
                return true;
            }
            parcel2.writeString(O);
            return true;
        }
    }

    void D0(boolean z10) throws RemoteException;

    void J0(int i10, int i11) throws RemoteException;

    void a() throws RemoteException;

    void i1(int i10, int i11) throws RemoteException;

    void k1(String str, String str2, int i10) throws RemoteException;

    void r1(int i10) throws RemoteException;
}

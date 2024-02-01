package ni;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ni.d;

public interface e extends IInterface {

    public static class a implements e {
        public void C0(int i10) throws RemoteException {
        }

        public void D1() throws RemoteException {
        }

        public void P0() throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        public void b(int i10) throws RemoteException {
        }

        public void f() throws RemoteException {
        }

        public void m() throws RemoteException {
        }

        public void m0(String str) throws RemoteException {
        }

        public void next() throws RemoteException {
        }

        public void pause() throws RemoteException {
        }

        public void seekTo(int i10) throws RemoteException {
        }

        public void y1(String str, d dVar) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements e {
        public static final String O = "vn.icar.entertaiment.IIECommand";
        public static final int P = 1;
        public static final int Q = 2;
        public static final int R = 3;
        public static final int S = 4;
        public static final int T = 5;
        public static final int U = 6;
        public static final int V = 7;
        public static final int W = 8;
        public static final int X = 9;
        public static final int Y = 10;
        public static final int Z = 11;

        public static class a implements e {
            public static e P;
            public IBinder O;

            public a(IBinder iBinder) {
                this.O = iBinder;
            }

            public void C0(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(10, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().C0(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String D() {
                return b.O;
            }

            public void D1() throws RemoteException {
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
                    b.H().D1();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void P0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    if (this.O.transact(11, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().P0();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.O;
            }

            public void b(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(8, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().b(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    if (this.O.transact(3, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().f();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    if (this.O.transact(7, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().m();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void m0(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    obtain.writeString(str);
                    if (this.O.transact(2, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().m0(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void next() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    if (this.O.transact(5, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().next();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void pause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    if (this.O.transact(4, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().pause();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void seekTo(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(9, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().seekTo(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void y1(String str, d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (this.O.transact(1, obtain, obtain2, 0) || b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    b.H().y1(str, dVar);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, O);
        }

        public static e D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(O);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof e)) ? new a(iBinder) : (e) queryLocalInterface;
        }

        public static e H() {
            return a.P;
        }

        public static boolean J(e eVar) {
            if (a.P != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (eVar == null) {
                return false;
            } else {
                a.P = eVar;
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
                        y1(parcel.readString(), d.b.D(parcel.readStrongBinder()));
                        break;
                    case 2:
                        parcel.enforceInterface(O);
                        m0(parcel.readString());
                        break;
                    case 3:
                        parcel.enforceInterface(O);
                        f();
                        break;
                    case 4:
                        parcel.enforceInterface(O);
                        pause();
                        break;
                    case 5:
                        parcel.enforceInterface(O);
                        next();
                        break;
                    case 6:
                        parcel.enforceInterface(O);
                        D1();
                        break;
                    case 7:
                        parcel.enforceInterface(O);
                        m();
                        break;
                    case 8:
                        parcel.enforceInterface(O);
                        b(parcel.readInt());
                        break;
                    case 9:
                        parcel.enforceInterface(O);
                        seekTo(parcel.readInt());
                        break;
                    case 10:
                        parcel.enforceInterface(O);
                        C0(parcel.readInt());
                        break;
                    case 11:
                        parcel.enforceInterface(O);
                        P0();
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

    void C0(int i10) throws RemoteException;

    void D1() throws RemoteException;

    void P0() throws RemoteException;

    void b(int i10) throws RemoteException;

    void f() throws RemoteException;

    void m() throws RemoteException;

    void m0(String str) throws RemoteException;

    void next() throws RemoteException;

    void pause() throws RemoteException;

    void seekTo(int i10) throws RemoteException;

    void y1(String str, d dVar) throws RemoteException;
}

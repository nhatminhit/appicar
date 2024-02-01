package vn.tw.service.xt.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IBTCallBack extends IInterface {

    public static class Default implements IBTCallBack {
        public IBinder asBinder() {
            return null;
        }

        public void btAccept() throws RemoteException {
        }

        public void btCall(String str) throws RemoteException {
        }

        public void btGetConnectedStatus() throws RemoteException {
        }

        public void btGetPhoneStatus() throws RemoteException {
        }

        public void btHangUP() throws RemoteException {
        }

        public void btNext() throws RemoteException {
        }

        public void btOpenMusic() throws RemoteException {
        }

        public void btPlayMusic() throws RemoteException {
        }

        public void btPre() throws RemoteException {
        }

        public void extendedInterface(Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IBTCallBack {
        public static final String O = "com.tw.service.xt.aidl.IBTCallBack";
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

        public static class a implements IBTCallBack {
            public static IBTCallBack P;
            public IBinder O;

            public a(IBinder iBinder) {
                this.O = iBinder;
            }

            public String D() {
                return Stub.O;
            }

            public IBinder asBinder() {
                return this.O;
            }

            public void btAccept() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btAccept();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btCall(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeString(str);
                    if (this.O.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btCall(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btGetConnectedStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(9, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btGetConnectedStatus();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btGetPhoneStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(8, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btGetPhoneStatus();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btHangUP() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btHangUP();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btNext() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(7, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btNext();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btOpenMusic() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btOpenMusic();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btPlayMusic() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btPlayMusic();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btPre() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btPre();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void extendedInterface(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.O.transact(10, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().extendedInterface(bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, O);
        }

        public static IBTCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(O);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBTCallBack)) ? new a(iBinder) : (IBTCallBack) queryLocalInterface;
        }

        public static IBTCallBack getDefaultImpl() {
            return a.P;
        }

        public static boolean setDefaultImpl(IBTCallBack iBTCallBack) {
            if (a.P != null || iBTCallBack == null) {
                return false;
            }
            a.P = iBTCallBack;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1598968902) {
                switch (i10) {
                    case 1:
                        parcel.enforceInterface(O);
                        btCall(parcel.readString());
                        break;
                    case 2:
                        parcel.enforceInterface(O);
                        btAccept();
                        break;
                    case 3:
                        parcel.enforceInterface(O);
                        btHangUP();
                        break;
                    case 4:
                        parcel.enforceInterface(O);
                        btOpenMusic();
                        break;
                    case 5:
                        parcel.enforceInterface(O);
                        btPlayMusic();
                        break;
                    case 6:
                        parcel.enforceInterface(O);
                        btPre();
                        break;
                    case 7:
                        parcel.enforceInterface(O);
                        btNext();
                        break;
                    case 8:
                        parcel.enforceInterface(O);
                        btGetPhoneStatus();
                        break;
                    case 9:
                        parcel.enforceInterface(O);
                        btGetConnectedStatus();
                        break;
                    case 10:
                        parcel.enforceInterface(O);
                        extendedInterface(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
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

    void btAccept() throws RemoteException;

    void btCall(String str) throws RemoteException;

    void btGetConnectedStatus() throws RemoteException;

    void btGetPhoneStatus() throws RemoteException;

    void btHangUP() throws RemoteException;

    void btNext() throws RemoteException;

    void btOpenMusic() throws RemoteException;

    void btPlayMusic() throws RemoteException;

    void btPre() throws RemoteException;

    void extendedInterface(Bundle bundle) throws RemoteException;
}

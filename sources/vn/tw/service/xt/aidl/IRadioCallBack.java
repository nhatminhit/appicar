package vn.tw.service.xt.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IRadioCallBack extends IInterface {

    public static class Default implements IRadioCallBack {
        public IBinder asBinder() {
            return null;
        }

        public void extendedInterface(Bundle bundle) throws RemoteException {
        }

        public void radioBand(int i10) throws RemoteException {
        }

        public void radioBandChange() throws RemoteException {
        }

        public void radioNext() throws RemoteException {
        }

        public void radioPre() throws RemoteException {
        }

        public void radioSearchNext() throws RemoteException {
        }

        public void radioSearchPre() throws RemoteException {
        }

        public void radioSetChannel(String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IRadioCallBack {
        public static final String O = "com.tw.service.xt.aidl.IRadioCallBack";
        public static final int P = 1;
        public static final int Q = 2;
        public static final int R = 3;
        public static final int S = 4;
        public static final int T = 5;
        public static final int U = 6;
        public static final int V = 7;
        public static final int W = 8;

        public static class a implements IRadioCallBack {
            public static IRadioCallBack P;
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
                    if (this.O.transact(8, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
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

            public void radioBand(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().radioBand(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void radioBandChange() throws RemoteException {
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
                    Stub.getDefaultImpl().radioBandChange();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void radioNext() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().radioNext();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void radioPre() throws RemoteException {
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
                    Stub.getDefaultImpl().radioPre();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void radioSearchNext() throws RemoteException {
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
                    Stub.getDefaultImpl().radioSearchNext();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void radioSearchPre() throws RemoteException {
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
                    Stub.getDefaultImpl().radioSearchPre();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void radioSetChannel(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeString(str);
                    if (this.O.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().radioSetChannel(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, O);
        }

        public static IRadioCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(O);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IRadioCallBack)) ? new a(iBinder) : (IRadioCallBack) queryLocalInterface;
        }

        public static IRadioCallBack getDefaultImpl() {
            return a.P;
        }

        public static boolean setDefaultImpl(IRadioCallBack iRadioCallBack) {
            if (a.P != null || iRadioCallBack == null) {
                return false;
            }
            a.P = iRadioCallBack;
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
                        radioNext();
                        break;
                    case 2:
                        parcel.enforceInterface(O);
                        radioPre();
                        break;
                    case 3:
                        parcel.enforceInterface(O);
                        radioSearchNext();
                        break;
                    case 4:
                        parcel.enforceInterface(O);
                        radioSearchPre();
                        break;
                    case 5:
                        parcel.enforceInterface(O);
                        radioSetChannel(parcel.readString());
                        break;
                    case 6:
                        parcel.enforceInterface(O);
                        radioBand(parcel.readInt());
                        break;
                    case 7:
                        parcel.enforceInterface(O);
                        radioBandChange();
                        break;
                    case 8:
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

    void extendedInterface(Bundle bundle) throws RemoteException;

    void radioBand(int i10) throws RemoteException;

    void radioBandChange() throws RemoteException;

    void radioNext() throws RemoteException;

    void radioPre() throws RemoteException;

    void radioSearchNext() throws RemoteException;

    void radioSearchPre() throws RemoteException;

    void radioSetChannel(String str) throws RemoteException;
}

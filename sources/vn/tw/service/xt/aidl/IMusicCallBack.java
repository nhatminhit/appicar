package vn.tw.service.xt.aidl;

import ad.d;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IMusicCallBack extends IInterface {

    public static class Default implements IMusicCallBack {
        public IBinder asBinder() {
            return null;
        }

        public void extendedInterface(Bundle bundle) throws RemoteException {
        }

        public void musicMode(int i10) throws RemoteException {
        }

        public void musicNext() throws RemoteException {
        }

        public void musicPause() throws RemoteException {
        }

        public void musicPlay() throws RemoteException {
        }

        public void musicPre() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMusicCallBack {
        public static final String O = "com.tw.service.xt.aidl.IMusicCallBack";
        public static final int P = 1;
        public static final int Q = 2;
        public static final int R = 3;
        public static final int S = 4;
        public static final int T = 5;
        public static final int U = 6;

        public static class a implements IMusicCallBack {
            public static IMusicCallBack P;
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
                    if (this.O.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
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

            public void musicMode(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().musicMode(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void musicNext() throws RemoteException {
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
                    Stub.getDefaultImpl().musicNext();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void musicPause() throws RemoteException {
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
                    Stub.getDefaultImpl().musicPause();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void musicPlay() throws RemoteException {
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
                    Stub.getDefaultImpl().musicPlay();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void musicPre() throws RemoteException {
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
                    Stub.getDefaultImpl().musicPre();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, O);
        }

        public static IMusicCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(O);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMusicCallBack)) ? new a(iBinder) : (IMusicCallBack) queryLocalInterface;
        }

        public static IMusicCallBack getDefaultImpl() {
            return a.P;
        }

        public static boolean setDefaultImpl(IMusicCallBack iMusicCallBack) {
            if (a.P != null || iMusicCallBack == null) {
                return false;
            }
            a.P = iMusicCallBack;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1598968902) {
                switch (i10) {
                    case 1:
                        d.c("music ", "1 " + parcel + "/" + parcel2 + "/" + i11);
                        parcel.enforceInterface(O);
                        musicNext();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        d.c("music ", "2 " + parcel + "/" + parcel2 + "/" + i11);
                        parcel.enforceInterface(O);
                        musicPre();
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        d.c("music ", "3 " + parcel + "/" + parcel2 + "/" + i11);
                        parcel.enforceInterface(O);
                        musicPlay();
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        d.c("music ", "4 " + parcel + "/" + parcel2 + "/" + i11);
                        parcel.enforceInterface(O);
                        musicPause();
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        d.c("music ", "5 " + parcel + "/" + parcel2 + "/" + i11);
                        parcel.enforceInterface(O);
                        musicMode(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        d.c("music ", "6 " + parcel + "/" + parcel2 + "/" + i11);
                        parcel.enforceInterface(O);
                        extendedInterface(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    default:
                        d.c("music ", "default " + parcel);
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            } else {
                d.c("music ", "1598968902 " + parcel + "/" + parcel2 + "/" + i11);
                parcel2.writeString(O);
                return true;
            }
        }
    }

    void extendedInterface(Bundle bundle) throws RemoteException;

    void musicMode(int i10) throws RemoteException;

    void musicNext() throws RemoteException;

    void musicPause() throws RemoteException;

    void musicPlay() throws RemoteException;

    void musicPre() throws RemoteException;
}

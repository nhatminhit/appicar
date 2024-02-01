package vn.tw.service.xt.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IVideoCallBack extends IInterface {

    public static class Default implements IVideoCallBack {
        public IBinder asBinder() {
            return null;
        }

        public void extendedInterface(Bundle bundle) throws RemoteException {
        }

        public void videoNext() throws RemoteException {
        }

        public void videoPause() throws RemoteException {
        }

        public void videoPlay() throws RemoteException {
        }

        public void videoPre() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IVideoCallBack {
        public static final String O = "com.tw.service.xt.aidl.IVideoCallBack";
        public static final int P = 1;
        public static final int Q = 2;
        public static final int R = 3;
        public static final int S = 4;
        public static final int T = 5;

        public static class a implements IVideoCallBack {
            public static IVideoCallBack P;
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
                    if (this.O.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
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

            public void videoNext() throws RemoteException {
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
                    Stub.getDefaultImpl().videoNext();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void videoPause() throws RemoteException {
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
                    Stub.getDefaultImpl().videoPause();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void videoPlay() throws RemoteException {
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
                    Stub.getDefaultImpl().videoPlay();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void videoPre() throws RemoteException {
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
                    Stub.getDefaultImpl().videoPre();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, O);
        }

        public static IVideoCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(O);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IVideoCallBack)) ? new a(iBinder) : (IVideoCallBack) queryLocalInterface;
        }

        public static IVideoCallBack getDefaultImpl() {
            return a.P;
        }

        public static boolean setDefaultImpl(IVideoCallBack iVideoCallBack) {
            if (a.P != null || iVideoCallBack == null) {
                return false;
            }
            a.P = iVideoCallBack;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(O);
                videoNext();
            } else if (i10 == 2) {
                parcel.enforceInterface(O);
                videoPre();
            } else if (i10 == 3) {
                parcel.enforceInterface(O);
                videoPlay();
            } else if (i10 == 4) {
                parcel.enforceInterface(O);
                videoPause();
            } else if (i10 == 5) {
                parcel.enforceInterface(O);
                extendedInterface(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString(O);
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void extendedInterface(Bundle bundle) throws RemoteException;

    void videoNext() throws RemoteException;

    void videoPause() throws RemoteException;

    void videoPlay() throws RemoteException;

    void videoPre() throws RemoteException;
}

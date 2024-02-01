package vn.tw.service.xt.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ITWCommandCallbackAidl extends IInterface {

    public static class Default implements ITWCommandCallbackAidl {
        public IBinder asBinder() {
            return null;
        }

        public void onBtCallStatus(int i10, String str, String str2) throws RemoteException {
        }

        public void onBtConnectedStatus(int i10) throws RemoteException {
        }

        public void onBtPhoneStatus(int i10) throws RemoteException {
        }

        public void onExtendedInterface(Bundle bundle) throws RemoteException {
        }

        public void onReverseStatus(int i10) throws RemoteException {
        }

        public void onSleepStatus(int i10) throws RemoteException {
        }

        public void onSystemVolume(int i10) throws RemoteException {
        }

        public void onVolumeStatus(int i10) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ITWCommandCallbackAidl {
        public static final String O = "com.tw.service.xt.aidl.ITWCommandCallbackAidl";
        public static final int P = 1;
        public static final int Q = 2;
        public static final int R = 3;
        public static final int S = 4;
        public static final int T = 5;
        public static final int U = 6;
        public static final int V = 7;
        public static final int W = 8;

        public static class a implements ITWCommandCallbackAidl {
            public static ITWCommandCallbackAidl P;
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

            public void onBtCallStatus(int i10, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(i10);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.O.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onBtCallStatus(i10, str, str2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onBtConnectedStatus(int i10) throws RemoteException {
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
                    Stub.getDefaultImpl().onBtConnectedStatus(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onBtPhoneStatus(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onBtPhoneStatus(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onExtendedInterface(Bundle bundle) throws RemoteException {
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
                    Stub.getDefaultImpl().onExtendedInterface(bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onReverseStatus(int i10) throws RemoteException {
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
                    Stub.getDefaultImpl().onReverseStatus(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onSleepStatus(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(7, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onSleepStatus(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onSystemVolume(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onSystemVolume(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onVolumeStatus(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onVolumeStatus(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, O);
        }

        public static ITWCommandCallbackAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(O);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITWCommandCallbackAidl)) ? new a(iBinder) : (ITWCommandCallbackAidl) queryLocalInterface;
        }

        public static ITWCommandCallbackAidl getDefaultImpl() {
            return a.P;
        }

        public static boolean setDefaultImpl(ITWCommandCallbackAidl iTWCommandCallbackAidl) {
            if (a.P != null || iTWCommandCallbackAidl == null) {
                return false;
            }
            a.P = iTWCommandCallbackAidl;
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
                        onSystemVolume(parcel.readInt());
                        break;
                    case 2:
                        parcel.enforceInterface(O);
                        onVolumeStatus(parcel.readInt());
                        break;
                    case 3:
                        parcel.enforceInterface(O);
                        onBtPhoneStatus(parcel.readInt());
                        break;
                    case 4:
                        parcel.enforceInterface(O);
                        onBtCallStatus(parcel.readInt(), parcel.readString(), parcel.readString());
                        break;
                    case 5:
                        parcel.enforceInterface(O);
                        onBtConnectedStatus(parcel.readInt());
                        break;
                    case 6:
                        parcel.enforceInterface(O);
                        onReverseStatus(parcel.readInt());
                        break;
                    case 7:
                        parcel.enforceInterface(O);
                        onSleepStatus(parcel.readInt());
                        break;
                    case 8:
                        parcel.enforceInterface(O);
                        onExtendedInterface(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
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

    void onBtCallStatus(int i10, String str, String str2) throws RemoteException;

    void onBtConnectedStatus(int i10) throws RemoteException;

    void onBtPhoneStatus(int i10) throws RemoteException;

    void onExtendedInterface(Bundle bundle) throws RemoteException;

    void onReverseStatus(int i10) throws RemoteException;

    void onSleepStatus(int i10) throws RemoteException;

    void onSystemVolume(int i10) throws RemoteException;

    void onVolumeStatus(int i10) throws RemoteException;
}

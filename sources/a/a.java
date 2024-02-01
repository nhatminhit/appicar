package a;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface a extends IInterface {

    /* renamed from: a.a$a  reason: collision with other inner class name */
    public static class C0000a implements a {
        public void O1(String str, int i10, String str2, Notification notification) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        public void f1(String str, int i10, String str2) throws RemoteException {
        }

        public void p0(String str) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements a {
        public static final String O = "android.support.v4.app.INotificationSideChannel";
        public static final int P = 1;
        public static final int Q = 2;
        public static final int R = 3;

        /* renamed from: a.a$b$a  reason: collision with other inner class name */
        public static class C0001a implements a {
            public static a P;
            public IBinder O;

            public C0001a(IBinder iBinder) {
                this.O = iBinder;
            }

            public String D() {
                return b.O;
            }

            public void O1(String str, int i10, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.O.transact(1, obtain, (Parcel) null, 1) || b.H() == null) {
                        obtain.recycle();
                    } else {
                        b.H().O1(str, i10, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.O;
            }

            public void f1(String str, int i10, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    if (this.O.transact(2, obtain, (Parcel) null, 1) || b.H() == null) {
                        obtain.recycle();
                    } else {
                        b.H().f1(str, i10, str2);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void p0(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    obtain.writeString(str);
                    if (this.O.transact(3, obtain, (Parcel) null, 1) || b.H() == null) {
                        obtain.recycle();
                    } else {
                        b.H().p0(str);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, O);
        }

        public static a D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(O);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0001a(iBinder) : (a) queryLocalInterface;
        }

        public static a H() {
            return C0001a.P;
        }

        public static boolean J(a aVar) {
            if (C0001a.P != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (aVar == null) {
                return false;
            } else {
                C0001a.P = aVar;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(O);
                O1(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i10 == 2) {
                parcel.enforceInterface(O);
                f1(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            } else if (i10 == 3) {
                parcel.enforceInterface(O);
                p0(parcel.readString());
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString(O);
                return true;
            }
        }
    }

    void O1(String str, int i10, String str2, Notification notification) throws RemoteException;

    void f1(String str, int i10, String str2) throws RemoteException;

    void p0(String str) throws RemoteException;
}

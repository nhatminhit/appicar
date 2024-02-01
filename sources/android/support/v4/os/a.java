package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface a extends IInterface {

    /* renamed from: android.support.v4.os.a$a  reason: collision with other inner class name */
    public static class C0015a implements a {
        public void U1(int i10, Bundle bundle) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class b extends Binder implements a {
        public static final String O = "android.support.v4.os.IResultReceiver";
        public static final int P = 1;

        /* renamed from: android.support.v4.os.a$b$a  reason: collision with other inner class name */
        public static class C0016a implements a {
            public static a P;
            public IBinder O;

            public C0016a(IBinder iBinder) {
                this.O = iBinder;
            }

            public String D() {
                return b.O;
            }

            public void U1(int i10, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    obtain.writeInt(i10);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.O.transact(1, obtain, (Parcel) null, 1) || b.H() == null) {
                        obtain.recycle();
                    } else {
                        b.H().U1(i10, bundle);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.O;
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
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0016a(iBinder) : (a) queryLocalInterface;
        }

        public static a H() {
            return C0016a.P;
        }

        public static boolean J(a aVar) {
            if (C0016a.P != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (aVar == null) {
                return false;
            } else {
                C0016a.P = aVar;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(O);
                U1(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString(O);
                return true;
            }
        }
    }

    void U1(int i10, Bundle bundle) throws RemoteException;
}

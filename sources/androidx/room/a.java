package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface a extends IInterface {

    /* renamed from: androidx.room.a$a  reason: collision with other inner class name */
    public static class C0050a implements a {
        public IBinder asBinder() {
            return null;
        }

        public void d0(String[] strArr) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements a {
        public static final String O = "androidx.room.IMultiInstanceInvalidationCallback";
        public static final int P = 1;

        /* renamed from: androidx.room.a$b$a  reason: collision with other inner class name */
        public static class C0051a implements a {
            public static a P;
            public IBinder O;

            public C0051a(IBinder iBinder) {
                this.O = iBinder;
            }

            public String D() {
                return b.O;
            }

            public IBinder asBinder() {
                return this.O;
            }

            public void d0(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.O);
                    obtain.writeStringArray(strArr);
                    if (this.O.transact(1, obtain, (Parcel) null, 1) || b.H() == null) {
                        obtain.recycle();
                    } else {
                        b.H().d0(strArr);
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
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0051a(iBinder) : (a) queryLocalInterface;
        }

        public static a H() {
            return C0051a.P;
        }

        public static boolean J(a aVar) {
            if (C0051a.P != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (aVar == null) {
                return false;
            } else {
                C0051a.P = aVar;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(O);
                d0(parcel.createStringArray());
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString(O);
                return true;
            }
        }
    }

    void d0(String[] strArr) throws RemoteException;
}

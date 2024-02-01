package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.a;

public interface b extends IInterface {

    public static class a implements b {
        public void M1(int i10, String[] strArr) throws RemoteException {
        }

        public void Q1(a aVar, int i10) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        public int q0(a aVar, String str) throws RemoteException {
            return 0;
        }
    }

    /* renamed from: androidx.room.b$b  reason: collision with other inner class name */
    public static abstract class C0052b extends Binder implements b {
        public static final String O = "androidx.room.IMultiInstanceInvalidationService";
        public static final int P = 1;
        public static final int Q = 2;
        public static final int R = 3;

        /* renamed from: androidx.room.b$b$a */
        public static class a implements b {
            public static b P;
            public IBinder O;

            public a(IBinder iBinder) {
                this.O = iBinder;
            }

            public String D() {
                return C0052b.O;
            }

            public void M1(int i10, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0052b.O);
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    if (this.O.transact(3, obtain, (Parcel) null, 1) || C0052b.H() == null) {
                        obtain.recycle();
                    } else {
                        C0052b.H().M1(i10, strArr);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void Q1(a aVar, int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0052b.O);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    obtain.writeInt(i10);
                    if (this.O.transact(2, obtain, obtain2, 0) || C0052b.H() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0052b.H().Q1(aVar, i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.O;
            }

            public int q0(a aVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0052b.O);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    obtain.writeString(str);
                    if (!this.O.transact(1, obtain, obtain2, 0) && C0052b.H() != null) {
                        return C0052b.H().q0(aVar, str);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0052b() {
            attachInterface(this, O);
        }

        public static b D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(O);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new a(iBinder) : (b) queryLocalInterface;
        }

        public static b H() {
            return a.P;
        }

        public static boolean J(b bVar) {
            if (a.P != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (bVar == null) {
                return false;
            } else {
                a.P = bVar;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(O);
                int q02 = q0(a.b.D(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(q02);
                return true;
            } else if (i10 == 2) {
                parcel.enforceInterface(O);
                Q1(a.b.D(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i10 == 3) {
                parcel.enforceInterface(O);
                M1(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString(O);
                return true;
            }
        }
    }

    void M1(int i10, String[] strArr) throws RemoteException;

    void Q1(a aVar, int i10) throws RemoteException;

    int q0(a aVar, String str) throws RemoteException;
}

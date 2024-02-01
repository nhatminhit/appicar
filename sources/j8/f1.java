package j8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GetServiceRequest;
import d.o0;

public final class f1 implements n {
    public final IBinder O;

    public f1(IBinder iBinder) {
        this.O = iBinder;
    }

    public final void O(m mVar, @o0 GetServiceRequest getServiceRequest) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                x1.a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.O.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.O;
    }
}

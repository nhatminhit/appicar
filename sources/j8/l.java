package j8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.m;
import d.m0;

public interface l extends IInterface {

    public static abstract class a extends m implements l {
        public a() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        @m0
        public static l H(@m0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return queryLocalInterface instanceof l ? (l) queryLocalInterface : new h2(iBinder);
        }

        public final boolean D(int i10, @m0 Parcel parcel, @m0 Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 2) {
                return false;
            }
            cancel();
            return true;
        }
    }

    void cancel() throws RemoteException;
}

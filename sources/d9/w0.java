package d9;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.b0;
import com.google.android.gms.internal.location.c1;

public abstract class w0 extends b0 implements x0 {
    public w0() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static x0 H(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof x0 ? (x0) queryLocalInterface : new v0(iBinder);
    }

    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            c1.b(parcel);
            P((Location) c1.a(parcel, Location.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            h();
        }
        return true;
    }
}

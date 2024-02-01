package d9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.b0;
import com.google.android.gms.internal.location.c1;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public abstract class t0 extends b0 implements u0 {
    public t0() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static u0 H(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof u0 ? (u0) queryLocalInterface : new s0(iBinder);
    }

    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            c1.b(parcel);
            S0((LocationResult) c1.a(parcel, LocationResult.CREATOR));
        } else if (i10 == 2) {
            c1.b(parcel);
            n1((LocationAvailability) c1.a(parcel, LocationAvailability.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            w();
        }
        return true;
    }
}

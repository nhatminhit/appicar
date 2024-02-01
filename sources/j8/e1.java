package j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.internal.common.m;
import com.google.android.gms.internal.common.n;

public abstract class e1 extends m implements m {
    public e1() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            n.b(parcel);
            R0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) n.a(parcel, Bundle.CREATOR));
        } else if (i10 == 2) {
            n.b(parcel);
            v0(parcel.readInt(), (Bundle) n.a(parcel, Bundle.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            n.b(parcel);
            a1(parcel.readInt(), parcel.readStrongBinder(), (zzj) n.a(parcel, zzj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}

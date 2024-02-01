package j8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.internal.common.a;
import com.google.android.gms.internal.common.n;

public final class d1 extends a implements m {
    public d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final void R0(int i10, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel b02 = b0();
        b02.writeInt(i10);
        b02.writeStrongBinder(iBinder);
        n.d(b02, bundle);
        H(1, b02);
    }

    public final void a1(int i10, IBinder iBinder, zzj zzj) throws RemoteException {
        throw null;
    }

    public final void v0(int i10, Bundle bundle) throws RemoteException {
        throw null;
    }
}

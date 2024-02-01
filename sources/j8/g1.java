package j8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.internal.common.a;
import com.google.android.gms.internal.common.n;
import z8.d;

public final class g1 extends a implements i1 {
    public g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean M0(zzs zzs, d dVar) throws RemoteException {
        Parcel b02 = b0();
        n.d(b02, zzs);
        n.f(b02, dVar);
        Parcel D = D(5, b02);
        boolean g10 = n.g(D);
        D.recycle();
        return g10;
    }

    public final zzq O0(zzo zzo) throws RemoteException {
        Parcel b02 = b0();
        n.d(b02, zzo);
        Parcel D = D(6, b02);
        zzq zzq = (zzq) n.a(D, zzq.CREATOR);
        D.recycle();
        return zzq;
    }

    public final zzq Z0(zzo zzo) throws RemoteException {
        Parcel b02 = b0();
        n.d(b02, zzo);
        Parcel D = D(8, b02);
        zzq zzq = (zzq) n.a(D, zzq.CREATOR);
        D.recycle();
        return zzq;
    }

    public final boolean t() throws RemoteException {
        Parcel D = D(7, b0());
        boolean g10 = n.g(D);
        D.recycle();
        return g10;
    }

    public final boolean y() throws RemoteException {
        Parcel D = D(9, b0());
        boolean g10 = n.g(D);
        D.recycle();
        return g10;
    }
}

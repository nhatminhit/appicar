package j8;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.m;

public abstract class h1 extends m implements i1 {
    public static i1 H(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof i1 ? (i1) queryLocalInterface : new g1(iBinder);
    }
}

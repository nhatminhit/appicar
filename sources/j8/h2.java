package j8;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.common.a;

public final class h2 extends a implements l {
    public h2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    public final void cancel() throws RemoteException {
        J(2, b0());
    }
}

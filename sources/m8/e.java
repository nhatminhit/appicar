package m8;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;

public final class e extends b {
    public final b.C0094b O;

    public e(b.C0094b bVar) {
        this.O = bVar;
    }

    public final void K0(int i10) throws RemoteException {
        this.O.b(new Status(i10));
    }
}

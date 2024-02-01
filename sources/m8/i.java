package m8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import f8.k;
import j8.e;
import j8.h;

public final class i extends h<m> {
    public i(Context context, Looper looper, e eVar, k.b bVar, k.c cVar) {
        super(context, looper, 39, eVar, bVar, cVar);
    }

    public final /* synthetic */ IInterface A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        return queryLocalInterface instanceof m ? (m) queryLocalInterface : new m(iBinder);
    }

    public final String N() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    public final String O() {
        return "com.google.android.gms.common.service.START";
    }
}

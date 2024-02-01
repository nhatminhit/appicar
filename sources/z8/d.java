package z8;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.m;
import d.m0;

public interface d extends IInterface {

    public static abstract class a extends m implements d {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @m0
        public static d H(@m0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof d ? (d) queryLocalInterface : new s(iBinder);
        }
    }
}

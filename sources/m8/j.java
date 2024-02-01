package m8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import b9.a;
import b9.c;
import com.google.android.gms.common.internal.TelemetryData;

public final class j extends a implements IInterface {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void Y1(TelemetryData telemetryData) throws RemoteException {
        Parcel D = D();
        c.d(D, telemetryData);
        b0(1, D);
    }
}

package p8;

import android.os.Parcel;
import android.os.RemoteException;
import b9.b;
import b9.c;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

public abstract class i extends b implements j {
    public i() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    public final boolean Y1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        c.b(parcel);
        z1((ModuleInstallStatusUpdate) c.a(parcel, ModuleInstallStatusUpdate.CREATOR));
        return true;
    }
}

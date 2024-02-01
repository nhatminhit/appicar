package p8;

import android.os.Parcel;
import android.os.RemoteException;
import b9.b;
import b9.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

public abstract class f extends b implements g {
    public f() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    public final boolean Y1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            c.b(parcel);
            X0((Status) c.a(parcel, Status.CREATOR), (ModuleAvailabilityResponse) c.a(parcel, ModuleAvailabilityResponse.CREATOR));
        } else if (i10 == 2) {
            c.b(parcel);
            W0((Status) c.a(parcel, Status.CREATOR), (ModuleInstallResponse) c.a(parcel, ModuleInstallResponse.CREATOR));
        } else if (i10 == 3) {
            c.b(parcel);
            s0((Status) c.a(parcel, Status.CREATOR), (ModuleInstallIntentResponse) c.a(parcel, ModuleInstallIntentResponse.CREATOR));
        } else if (i10 != 4) {
            return false;
        } else {
            c.b(parcel);
            C1((Status) c.a(parcel, Status.CREATOR));
        }
        return true;
    }
}

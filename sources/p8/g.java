package p8;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import d.o0;

public interface g extends IInterface {
    void C1(Status status) throws RemoteException;

    void W0(Status status, @o0 ModuleInstallResponse moduleInstallResponse) throws RemoteException;

    void X0(Status status, @o0 ModuleAvailabilityResponse moduleAvailabilityResponse) throws RemoteException;

    void s0(Status status, @o0 ModuleInstallIntentResponse moduleInstallIntentResponse) throws RemoteException;
}

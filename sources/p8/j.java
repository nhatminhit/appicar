package p8;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

public interface j extends IInterface {
    void z1(ModuleInstallStatusUpdate moduleInstallStatusUpdate) throws RemoteException;
}

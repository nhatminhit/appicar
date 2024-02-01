package d9;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public interface u0 extends IInterface {
    void S0(LocationResult locationResult) throws RemoteException;

    void n1(LocationAvailability locationAvailability) throws RemoteException;

    void w() throws RemoteException;
}

package p8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import b9.a;
import b9.c;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;

public final class h extends a implements IInterface {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void Y1(g gVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel D = D();
        c.e(D, gVar);
        c.d(D, apiFeatureRequest);
        J(1, D);
    }

    public final void Z1(g gVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel D = D();
        c.e(D, gVar);
        c.d(D, apiFeatureRequest);
        J(3, D);
    }

    public final void a2(g gVar, ApiFeatureRequest apiFeatureRequest, j jVar) throws RemoteException {
        Parcel D = D();
        c.e(D, gVar);
        c.d(D, apiFeatureRequest);
        c.e(D, jVar);
        J(2, D);
    }

    public final void b2(e eVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel D = D();
        c.e(D, eVar);
        c.d(D, apiFeatureRequest);
        J(4, D);
    }

    public final void c2(e eVar, j jVar) throws RemoteException {
        Parcel D = D();
        c.e(D, eVar);
        c.e(D, jVar);
        J(6, D);
    }
}

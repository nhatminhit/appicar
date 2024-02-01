package g8;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import d.m0;

public abstract class k2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f8237a;

    public k2(int i10) {
        this.f8237a = i10;
    }

    public static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(@m0 Status status);

    public abstract void b(@m0 Exception exc);

    public abstract void c(u uVar) throws DeadObjectException;

    public abstract void d(@m0 v vVar, boolean z10);
}

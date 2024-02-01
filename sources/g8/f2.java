package g8;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import d.m0;
import f8.b;
import h9.n;

public abstract class f2 extends h1 {

    /* renamed from: b  reason: collision with root package name */
    public final n f8211b;

    public f2(int i10, n nVar) {
        super(i10);
        this.f8211b = nVar;
    }

    public final void a(@m0 Status status) {
        this.f8211b.d(new b(status));
    }

    public final void b(@m0 Exception exc) {
        this.f8211b.d(exc);
    }

    public final void c(u uVar) throws DeadObjectException {
        try {
            h(uVar);
        } catch (DeadObjectException e10) {
            a(k2.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(k2.e(e11));
        } catch (RuntimeException e12) {
            this.f8211b.d(e12);
        }
    }

    public void d(@m0 v vVar, boolean z10) {
    }

    public abstract void h(u uVar) throws RemoteException;
}

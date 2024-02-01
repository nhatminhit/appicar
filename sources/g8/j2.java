package g8;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import d.m0;
import d.o0;
import h9.n;

public final class j2 extends h1 {

    /* renamed from: b  reason: collision with root package name */
    public final q f8228b;

    /* renamed from: c  reason: collision with root package name */
    public final n f8229c;

    /* renamed from: d  reason: collision with root package name */
    public final o f8230d;

    public j2(int i10, q qVar, n nVar, o oVar) {
        super(i10);
        this.f8229c = nVar;
        this.f8228b = qVar;
        this.f8230d = oVar;
        if (i10 == 2 && qVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(@m0 Status status) {
        this.f8229c.d(this.f8230d.a(status));
    }

    public final void b(@m0 Exception exc) {
        this.f8229c.d(exc);
    }

    public final void c(u uVar) throws DeadObjectException {
        try {
            this.f8228b.b(uVar.s(), this.f8229c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(k2.e(e11));
        } catch (RuntimeException e12) {
            this.f8229c.d(e12);
        }
    }

    public final void d(@m0 v vVar, boolean z10) {
        vVar.d(this.f8229c, z10);
    }

    public final boolean f(u uVar) {
        return this.f8228b.c();
    }

    @o0
    public final Feature[] g(u uVar) {
        return this.f8228b.e();
    }
}

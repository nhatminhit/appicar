package g8;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import d.o0;
import d8.e;
import f8.k;
import j8.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import y3.q;

public final class m2 extends r2 {
    public final SparseArray T = new SparseArray();

    public m2(h hVar) {
        super(hVar, e.x());
        this.O.i("AutoManageHelper", this);
    }

    public static m2 u(g gVar) {
        h e10 = LifecycleCallback.e(gVar);
        m2 m2Var = (m2) e10.o("AutoManageHelper", m2.class);
        return m2Var != null ? m2Var : new m2(e10);
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            l2 x10 = x(i10);
            if (x10 != null) {
                printWriter.append(str).append("GoogleApiClient #").print(x10.O);
                printWriter.println(":");
                x10.P.j(String.valueOf(str).concat(q.a.R), fileDescriptor, printWriter, strArr);
            }
        }
    }

    public final void k() {
        super.k();
        boolean z10 = this.P;
        String valueOf = String.valueOf(this.T);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onStart ");
        sb2.append(z10);
        sb2.append(" ");
        sb2.append(valueOf);
        if (this.Q.get() == null) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                l2 x10 = x(i10);
                if (x10 != null) {
                    x10.P.g();
                }
            }
        }
    }

    public final void l() {
        super.l();
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            l2 x10 = x(i10);
            if (x10 != null) {
                x10.P.i();
            }
        }
    }

    public final void n(ConnectionResult connectionResult, int i10) {
        if (i10 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        l2 l2Var = (l2) this.T.get(i10);
        if (l2Var != null) {
            w(i10);
            k.c cVar = l2Var.Q;
            if (cVar != null) {
                cVar.H(connectionResult);
            }
        }
    }

    public final void o() {
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            l2 x10 = x(i10);
            if (x10 != null) {
                x10.P.g();
            }
        }
    }

    public final void v(int i10, k kVar, @o0 k.c cVar) {
        s.m(kVar, "GoogleApiClient instance cannot be null");
        boolean z10 = this.T.indexOfKey(i10) < 0;
        s.s(z10, "Already managing a GoogleApiClient with id " + i10);
        o2 o2Var = (o2) this.Q.get();
        boolean z11 = this.P;
        String valueOf = String.valueOf(o2Var);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("starting AutoManage for client ");
        sb2.append(i10);
        sb2.append(" ");
        sb2.append(z11);
        sb2.append(" ");
        sb2.append(valueOf);
        l2 l2Var = new l2(this, i10, kVar, cVar);
        kVar.C(l2Var);
        this.T.put(i10, l2Var);
        if (this.P && o2Var == null) {
            "connecting ".concat(kVar.toString());
            kVar.g();
        }
    }

    public final void w(int i10) {
        l2 l2Var = (l2) this.T.get(i10);
        this.T.remove(i10);
        if (l2Var != null) {
            l2Var.P.G(l2Var);
            l2Var.P.i();
        }
    }

    @o0
    public final l2 x(int i10) {
        if (this.T.size() <= i10) {
            return null;
        }
        SparseArray sparseArray = this.T;
        return (l2) sparseArray.get(sparseArray.keyAt(i10));
    }
}

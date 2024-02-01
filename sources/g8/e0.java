package g8;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.o;
import d.h1;
import f8.a;
import j8.d;
import j8.q0;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

public final class e0 extends l0 {
    public final Map P;
    public final /* synthetic */ o Q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(o oVar, Map map) {
        super(oVar, (k0) null);
        this.Q = oVar;
        this.P = map;
    }

    @GuardedBy("mLock")
    @h1
    public final void a() {
        q0 q0Var = new q0(this.Q.f5691d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a.f fVar : this.P.keySet()) {
            if (!fVar.o() || ((b0) this.P.get(fVar)).f8187c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i10 = -1;
        int i11 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i11 < size) {
                i10 = q0Var.b(this.Q.f5690c, (a.f) arrayList.get(i11));
                i11++;
                if (i10 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i11 < size2) {
                i10 = q0Var.b(this.Q.f5690c, (a.f) arrayList2.get(i11));
                i11++;
                if (i10 == 0) {
                    break;
                }
            }
        }
        if (i10 != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i10, (PendingIntent) null);
            o oVar = this.Q;
            oVar.f5688a.s(new c0(this, oVar, connectionResult));
            return;
        }
        o oVar2 = this.Q;
        if (oVar2.f5700m && oVar2.f5698k != null) {
            oVar2.f5698k.f();
        }
        for (a.f fVar2 : this.P.keySet()) {
            d.c cVar = (d.c) this.P.get(fVar2);
            if (!fVar2.o() || q0Var.b(this.Q.f5690c, fVar2) == 0) {
                fVar2.e(cVar);
            } else {
                o oVar3 = this.Q;
                oVar3.f5688a.s(new d0(this, oVar3, cVar));
            }
        }
    }
}

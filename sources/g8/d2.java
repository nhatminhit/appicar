package g8;

import com.google.android.gms.common.api.internal.BasePendingResult;
import d.h1;
import f8.k;
import f8.o;
import f8.u;
import f8.x;
import j8.s;

public final class d2 implements Runnable {
    public final /* synthetic */ u O;
    public final /* synthetic */ g2 P;

    public d2(g2 g2Var, u uVar) {
        this.P = g2Var;
        this.O = uVar;
    }

    @h1
    public final void run() {
        k kVar;
        try {
            ThreadLocal threadLocal = BasePendingResult.f5630p;
            threadLocal.set(Boolean.TRUE);
            o c10 = ((x) s.l(this.P.f8215a)).c(this.O);
            g2 g2Var = this.P;
            g2Var.f8222h.sendMessage(g2Var.f8222h.obtainMessage(0, c10));
            threadLocal.set(Boolean.FALSE);
            g2.q(this.O);
            kVar = (k) this.P.f8221g.get();
            if (kVar == null) {
                return;
            }
        } catch (RuntimeException e10) {
            g2 g2Var2 = this.P;
            g2Var2.f8222h.sendMessage(g2Var2.f8222h.obtainMessage(1, e10));
            BasePendingResult.f5630p.set(Boolean.FALSE);
            g2.q(this.O);
            kVar = (k) this.P.f8221g.get();
            if (kVar == null) {
                return;
            }
        } catch (Throwable th2) {
            BasePendingResult.f5630p.set(Boolean.FALSE);
            g2.q(this.O);
            k kVar2 = (k) this.P.f8221g.get();
            if (kVar2 != null) {
                kVar2.I(this.P);
            }
            throw th2;
        }
        kVar.I(this.P);
    }
}

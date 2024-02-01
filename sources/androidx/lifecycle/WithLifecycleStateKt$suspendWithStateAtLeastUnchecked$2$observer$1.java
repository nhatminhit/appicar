package androidx.lifecycle;

import androidx.lifecycle.p;
import fh.g;
import h0.u0;
import pf.q;
import we.a;
import xe.l0;
import zd.d1;
import zd.e1;

public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements u {
    public final /* synthetic */ p.b O;
    public final /* synthetic */ p P;
    public final /* synthetic */ q<R> Q;
    public final /* synthetic */ a<R> R;

    public WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1(p.b bVar, p pVar, q<? super R> qVar, a<? extends R> aVar) {
        this.O = bVar;
        this.P = pVar;
        this.Q = qVar;
        this.R = aVar;
    }

    public void d(@g y yVar, @g p.a aVar) {
        Object obj;
        q<R> qVar;
        t th2;
        l0.p(yVar, b4.a.P);
        l0.p(aVar, u0.f8532r0);
        if (aVar == p.a.Companion.d(this.O)) {
            this.P.d(this);
            qVar = this.Q;
            a<R> aVar2 = this.R;
            try {
                d1.a aVar3 = d1.P;
                obj = d1.b(aVar2.n());
            } catch (Throwable th3) {
                th2 = th3;
                d1.a aVar4 = d1.P;
            }
        } else if (aVar == p.a.ON_DESTROY) {
            this.P.d(this);
            qVar = this.Q;
            d1.a aVar5 = d1.P;
            th2 = new t();
            obj = d1.b(e1.a(th2));
        } else {
            return;
        }
        qVar.x(obj);
    }
}

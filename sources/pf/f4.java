package pf;

import fh.g;
import fh.h;
import ie.d;
import ke.c;
import kotlin.Metadata;
import wf.l;
import wf.m;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"Lzd/u2;", "a", "(Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class f4 {
    @h
    public static final Object a(@g d<? super u2> dVar) {
        Object obj;
        ie.g e10 = dVar.e();
        r2.z(e10);
        d<? super u2> d10 = c.d(dVar);
        l lVar = d10 instanceof l ? (l) d10 : null;
        if (lVar == null) {
            obj = u2.f25116a;
        } else {
            if (lVar.R.P1(e10)) {
                lVar.n(e10, u2.f25116a);
            } else {
                e4 e4Var = new e4();
                ie.g m12 = e10.m1(e4Var);
                u2 u2Var = u2.f25116a;
                lVar.n(m12, u2Var);
                if (e4Var.P && !m.h(lVar)) {
                    obj = u2Var;
                }
            }
            obj = ke.d.h();
        }
        if (obj == ke.d.h()) {
            le.h.c(dVar);
        }
        return obj == ke.d.h() ? obj : u2.f25116a;
    }
}

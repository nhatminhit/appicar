package pf;

import fh.g;
import ie.d;
import ie.e;
import ie.i;
import kotlin.Metadata;
import we.p;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aV\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"T", "Lie/g;", "context", "Lkotlin/Function2;", "Lpf/u0;", "Lie/d;", "", "Lzd/u;", "block", "a", "(Lie/g;Lwe/p;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/BuildersKt")
public final /* synthetic */ class k {
    public static final <T> T a(@g ie.g gVar, @g p<? super u0, ? super d<? super T>, ? extends Object> pVar) throws InterruptedException {
        t1 t1Var;
        e2 e2Var;
        Thread currentThread = Thread.currentThread();
        e eVar = (e) gVar.g(e.B);
        if (eVar == null) {
            t1Var = u3.f22027a.b();
            e2Var = e2.O;
            gVar = gVar.m1(t1Var);
        } else {
            t1 t1Var2 = null;
            t1 t1Var3 = eVar instanceof t1 ? (t1) eVar : null;
            if (t1Var3 != null) {
                if (t1Var3.e2()) {
                    t1Var2 = t1Var3;
                }
                if (t1Var2 != null) {
                    t1Var = t1Var2;
                    e2Var = e2.O;
                }
            }
            t1Var = u3.f22027a.a();
            e2Var = e2.O;
        }
        h hVar = new h(n0.e(e2Var, gVar), currentThread, t1Var);
        hVar.I1(w0.DEFAULT, hVar, pVar);
        return hVar.J1();
    }

    public static /* synthetic */ Object b(ie.g gVar, p pVar, int i10, Object obj) throws InterruptedException {
        if ((i10 & 1) != 0) {
            gVar = i.O;
        }
        return j.f(gVar, pVar);
    }
}

package rf;

import fh.g;
import fh.h;
import ie.d;
import ie.i;
import kotlin.Metadata;
import pf.e3;
import pf.n0;
import pf.u0;
import pf.w0;
import we.l;
import we.p;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062-\b\u0002\u0010\u000f\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bj\u0004\u0018\u0001`\u000e2-\u0010\u0015\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"E", "Lpf/u0;", "Lie/g;", "context", "", "capacity", "Lpf/w0;", "start", "Lkotlin/Function1;", "", "Lzd/v0;", "name", "cause", "Lzd/u2;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lrf/f;", "Lie/d;", "", "Lzd/u;", "block", "Lrf/m0;", "a", "(Lpf/u0;Lie/g;ILpf/w0;Lwe/l;Lwe/p;)Lrf/m0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class e {
    @g
    @e3
    public static final <E> m0<E> a(@g u0 u0Var, @g ie.g gVar, int i10, @g w0 w0Var, @h l<? super Throwable, u2> lVar, @g p<? super f<E>, ? super d<? super u2>, ? extends Object> pVar) {
        ie.g e10 = n0.e(u0Var, gVar);
        n d10 = q.d(i10, (m) null, (l) null, 6, (Object) null);
        o b0Var = w0Var.e() ? new b0(e10, d10, pVar) : new d(e10, d10, true);
        if (lVar != null) {
            b0Var.A(lVar);
        }
        b0Var.I1(w0Var, b0Var, pVar);
        return b0Var;
    }

    public static /* synthetic */ m0 b(u0 u0Var, ie.g gVar, int i10, w0 w0Var, l lVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = i.O;
        }
        ie.g gVar2 = gVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            w0Var = w0.DEFAULT;
        }
        w0 w0Var2 = w0Var;
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        return a(u0Var, gVar2, i12, w0Var2, lVar, pVar);
    }
}

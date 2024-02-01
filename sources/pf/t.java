package pf;

import fh.g;
import fh.h;
import ie.d;
import ke.c;
import kotlin.Metadata;
import wf.l;
import wf.y;
import xe.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001HHø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001HHø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Lkotlin/Function1;", "Lpf/q;", "Lzd/u2;", "block", "d", "(Lwe/l;Lie/d;)Ljava/lang/Object;", "f", "Lie/d;", "delegate", "Lpf/r;", "b", "Lwf/y;", "node", "c", "Lpf/p1;", "handle", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class t {
    @i2
    public static final void a(@g q<?> qVar, @g p1 p1Var) {
        qVar.T(new q1(p1Var));
    }

    @g
    public static final <T> r<T> b(@g d<? super T> dVar) {
        if (!(dVar instanceof l)) {
            return new r<>(dVar, 1);
        }
        r<T> l10 = ((l) dVar).l();
        if (l10 != null) {
            if (!l10.K()) {
                l10 = null;
            }
            if (l10 != null) {
                return l10;
            }
        }
        return new r<>(dVar, 2);
    }

    public static final void c(@g q<?> qVar, @g y yVar) {
        qVar.T(new g3(yVar));
    }

    @h
    public static final <T> Object d(@g we.l<? super q<? super T>, u2> lVar, @g d<? super T> dVar) {
        r rVar = new r(c.d(dVar), 1);
        rVar.Z();
        lVar.A(rVar);
        Object z10 = rVar.z();
        if (z10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return z10;
    }

    public static final <T> Object e(we.l<? super q<? super T>, u2> lVar, d<? super T> dVar) {
        i0.e(0);
        r rVar = new r(c.d(dVar), 1);
        rVar.Z();
        lVar.A(rVar);
        Object z10 = rVar.z();
        if (z10 == ke.d.h()) {
            le.h.c(dVar);
        }
        i0.e(1);
        return z10;
    }

    @h
    public static final <T> Object f(@g we.l<? super q<? super T>, u2> lVar, @g d<? super T> dVar) {
        r<? super T> b10 = b(c.d(dVar));
        lVar.A(b10);
        Object z10 = b10.z();
        if (z10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return z10;
    }

    public static final <T> Object g(we.l<? super q<? super T>, u2> lVar, d<? super T> dVar) {
        i0.e(0);
        r<? super T> b10 = b(c.d(dVar));
        lVar.A(b10);
        Object z10 = b10.z();
        if (z10 == ke.d.h()) {
            le.h.c(dVar);
        }
        i0.e(1);
        return z10;
    }
}

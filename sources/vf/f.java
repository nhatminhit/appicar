package vf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import rf.m;
import uf.i;
import uf.j;
import we.p;
import wf.w0;
import xe.u1;
import xe.w;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a]\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\rH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Luf/i;", "Lvf/e;", "b", "Luf/j;", "Lie/g;", "emitContext", "e", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lie/d;", "block", "c", "(Lie/g;Ljava/lang/Object;Ljava/lang/Object;Lwe/p;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class f {
    @g
    public static final <T> e<T> b(@g i<? extends T> iVar) {
        e<T> eVar = iVar instanceof e ? (e) iVar : null;
        return eVar == null ? new i(iVar, (ie.g) null, 0, (m) null, 14, (w) null) : eVar;
    }

    /* JADX INFO: finally extract failed */
    @h
    public static final <T, V> Object c(@g ie.g gVar, V v10, @g Object obj, @g p<? super V, ? super d<? super T>, ? extends Object> pVar, @g d<? super T> dVar) {
        Object c10 = w0.c(gVar, obj);
        try {
            Object g02 = ((p) u1.q(pVar, 2)).g0(v10, new z(dVar, gVar));
            w0.a(gVar, c10);
            if (g02 == ke.d.h()) {
                le.h.c(dVar);
            }
            return g02;
        } catch (Throwable th2) {
            w0.a(gVar, c10);
            throw th2;
        }
    }

    public static /* synthetic */ Object d(ie.g gVar, Object obj, Object obj2, p pVar, d dVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = w0.b(gVar);
        }
        return c(gVar, obj, obj2, pVar, dVar);
    }

    public static final <T> j<T> e(j<? super T> jVar, ie.g gVar) {
        return jVar instanceof y ? true : jVar instanceof t ? jVar : new b0(jVar, gVar);
    }
}

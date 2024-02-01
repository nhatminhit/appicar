package uf;

import fh.g;
import kotlin.Metadata;
import pf.n2;
import rf.m;
import vf.i;
import vf.r;
import xe.l0;
import xe.w;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Luf/i;", "", "capacity", "Lrf/m;", "onBufferOverflow", "b", "a", "g", "Lie/g;", "context", "h", "e", "Lzd/u2;", "f", "(Lie/g;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class p {
    @g
    public static final <T> i<T> b(@g i<? extends T> iVar, int i10, @g m mVar) {
        m mVar2;
        int i11;
        boolean z10 = true;
        if (i10 >= 0 || i10 == -2 || i10 == -1) {
            if (i10 == -1 && mVar != m.SUSPEND) {
                z10 = false;
            }
            if (z10) {
                if (i10 == -1) {
                    mVar2 = m.DROP_OLDEST;
                    i11 = 0;
                } else {
                    i11 = i10;
                    mVar2 = mVar;
                }
                return iVar instanceof r ? r.a.a((r) iVar, (ie.g) null, i11, mVar2, 1, (Object) null) : new i(iVar, (ie.g) null, i11, mVar2, 2, (w) null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
    }

    public static /* synthetic */ i c(i iVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        return d(iVar, i10, (m) null, 2, (Object) null);
    }

    public static /* synthetic */ i d(i iVar, int i10, m mVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            mVar = m.SUSPEND;
        }
        return k.o(iVar, i10, mVar);
    }

    @g
    public static final <T> i<T> e(@g i<? extends T> iVar) {
        return iVar instanceof c ? iVar : new d(iVar);
    }

    public static final void f(ie.g gVar) {
        if (!(gVar.g(n2.D) == null)) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + gVar).toString());
        }
    }

    @g
    public static final <T> i<T> g(@g i<? extends T> iVar) {
        return d(iVar, -1, (m) null, 2, (Object) null);
    }

    @g
    public static final <T> i<T> h(@g i<? extends T> iVar, @g ie.g gVar) {
        f(gVar);
        return l0.g(gVar, ie.i.O) ? iVar : iVar instanceof r ? r.a.a((r) iVar, gVar, 0, (m) null, 6, (Object) null) : new i(iVar, gVar, 0, (m) null, 12, (w) null);
    }
}

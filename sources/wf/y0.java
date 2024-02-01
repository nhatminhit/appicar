package wf;

import fh.h;
import ie.g;
import kotlin.Metadata;
import xe.l0;
import zd.a1;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003J\r\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0003HÂ\u0003R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lwf/y0;", "Lie/g$c;", "Lwf/x0;", "Ljava/lang/ThreadLocal;", "threadLocal", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "O", "Ljava/lang/ThreadLocal;", "<init>", "(Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@a1
public final class y0 implements g.c<x0<?>> {
    @fh.g
    public final ThreadLocal<?> O;

    public y0(@fh.g ThreadLocal<?> threadLocal) {
        this.O = threadLocal;
    }

    public static /* synthetic */ y0 c(y0 y0Var, ThreadLocal<?> threadLocal, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            threadLocal = y0Var.O;
        }
        return y0Var.b(threadLocal);
    }

    public final ThreadLocal<?> a() {
        return this.O;
    }

    @fh.g
    public final y0 b(@fh.g ThreadLocal<?> threadLocal) {
        return new y0(threadLocal);
    }

    public boolean equals(@h Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && l0.g(this.O, ((y0) obj).O);
    }

    public int hashCode() {
        return this.O.hashCode();
    }

    @fh.g
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.O + ')';
    }
}

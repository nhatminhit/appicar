package wf;

import fh.g;
import fh.h;
import ie.d;
import ke.c;
import kotlin.Metadata;
import le.e;
import pf.a;
import pf.k0;
import pf.n2;
import pf.w;
import we.l;

@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0013\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148DX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188@X\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lwf/n0;", "T", "Lpf/a;", "Lle/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "R", "", "state", "Lzd/u2;", "f0", "E1", "Lie/d;", "Q", "Lie/d;", "uCont", "u", "()Lle/e;", "callerFrame", "", "P0", "()Z", "isScopedCoroutine", "Lpf/n2;", "J1", "()Lpf/n2;", "parent", "Lie/g;", "context", "<init>", "(Lie/g;Lie/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class n0<T> extends a<T> implements e {
    @g
    @ve.e
    public final d<T> Q;

    public n0(@g ie.g gVar, @g d<? super T> dVar) {
        super(gVar, true, true);
        this.Q = dVar;
    }

    public void E1(@h Object obj) {
        d<T> dVar = this.Q;
        dVar.x(k0.a(obj, dVar));
    }

    @h
    public final n2 J1() {
        w I0 = I0();
        if (I0 != null) {
            return I0.getParent();
        }
        return null;
    }

    public final boolean P0() {
        return true;
    }

    @h
    public final StackTraceElement R() {
        return null;
    }

    public void f0(@h Object obj) {
        m.g(c.d(this.Q), k0.a(obj, this.Q), (l) null, 2, (Object) null);
    }

    @h
    public final e u() {
        d<T> dVar = this.Q;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }
}

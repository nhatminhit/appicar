package pf;

import fh.g;
import fh.h;
import ie.d;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import we.p;
import wf.j;
import wf.n0;
import xe.i0;
import xf.b;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001aO\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tH@ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u001a\u001e\u0010\u0016\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015\u001a\n\u0010\u0017\u001a\u00020\u0011*\u00020\u0000\u001a\u0013\u0010\u0018\u001a\u00020\u0001HHø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u001b\u0010\u001f\u001a\u00020\u001a*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lpf/u0;", "Lie/g;", "context", "m", "b", "R", "Lkotlin/Function2;", "Lie/d;", "", "Lzd/u;", "block", "g", "(Lwe/p;Lie/d;)Ljava/lang/Object;", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lzd/u2;", "d", "", "message", "", "c", "j", "h", "(Lie/d;)Ljava/lang/Object;", "", "k", "(Lpf/u0;)Z", "isActive$annotations", "(Lpf/u0;)V", "isActive", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class v0 {
    @g
    public static final u0 a(@g ie.g gVar) {
        if (gVar.g(n2.D) == null) {
            gVar = gVar.m1(t2.c((n2) null, 1, (Object) null));
        }
        return new j(gVar);
    }

    @g
    public static final u0 b() {
        return new j(r3.c((n2) null, 1, (Object) null).m1(m1.e()));
    }

    public static final void c(@g u0 u0Var, @g String str, @h Throwable th2) {
        d(u0Var, y1.a(str, th2));
    }

    public static final void d(@g u0 u0Var, @h CancellationException cancellationException) {
        n2 n2Var = (n2) u0Var.H().g(n2.D);
        if (n2Var != null) {
            n2Var.h(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + u0Var).toString());
    }

    public static /* synthetic */ void e(u0 u0Var, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        c(u0Var, str, th2);
    }

    public static /* synthetic */ void f(u0 u0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        d(u0Var, cancellationException);
    }

    @h
    public static final <R> Object g(@g p<? super u0, ? super d<? super R>, ? extends Object> pVar, @g d<? super R> dVar) {
        n0 n0Var = new n0(dVar.e(), dVar);
        Object f10 = b.f(n0Var, n0Var, pVar);
        if (f10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return f10;
    }

    @h
    public static final Object h(@g d<? super ie.g> dVar) {
        return dVar.e();
    }

    public static final Object i(d<? super ie.g> dVar) {
        i0.e(3);
        throw null;
    }

    public static final void j(@g u0 u0Var) {
        r2.z(u0Var.H());
    }

    public static final boolean k(@g u0 u0Var) {
        n2 n2Var = (n2) u0Var.H().g(n2.D);
        if (n2Var != null) {
            return n2Var.c();
        }
        return true;
    }

    public static /* synthetic */ void l(u0 u0Var) {
    }

    @g
    public static final u0 m(@g u0 u0Var, @g ie.g gVar) {
        return new j(u0Var.H().m1(gVar));
    }
}

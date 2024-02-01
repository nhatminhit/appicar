package pf;

import fh.g;
import fh.h;
import ie.d;
import ie.g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import pf.n2;
import zd.k;
import zd.m;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0017\u0010\n\u001a\u00020\t*\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u0010\u001a\u00020\t*\u00020\u0000H\u0007\u001a\u0018\u0010\u0012\u001a\u00020\t*\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001c\u0010\u0014\u001a\u00020\t*\u00020\u00132\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u0015\u001a\u00020\t*\u00020\u0013H\u0007\u001a\n\u0010\u0016\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\u0017\u001a\u00020\t*\u00020\u0013\u001a\u001e\u0010\u001a\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011\u001a\u0018\u0010\u001c\u001a\u00020\u001b*\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001c\u0010\u001d\u001a\u00020\t*\u00020\u00132\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u001e\u001a\u00020\t*\u00020\u0013H\u0007\u001a\u0018\u0010\u001f\u001a\u00020\t*\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001d\u0010!\u001a\u00020\u0011*\u0004\u0018\u00010\u00112\u0006\u0010 \u001a\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"\"\u0015\u0010%\u001a\u00020\u001b*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010 \u001a\u00020\u0000*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b&\u0010'\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lpf/n2;", "parent", "Lpf/c0;", "a", "b", "(Lpf/n2;)Lpf/n2;", "Lpf/p1;", "handle", "w", "Lzd/u2;", "l", "(Lpf/n2;Lie/d;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "r", "p", "", "q", "Lie/g;", "f", "e", "y", "x", "", "message", "g", "", "h", "o", "m", "n", "job", "B", "(Ljava/lang/Throwable;Lpf/n2;)Ljava/lang/Throwable;", "A", "(Lie/g;)Z", "isActive", "z", "(Lie/g;)Lpf/n2;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/JobKt")
public final /* synthetic */ class t2 {
    public static final boolean A(@g ie.g gVar) {
        n2 n2Var = (n2) gVar.g(n2.D);
        return n2Var != null && n2Var.c();
    }

    public static final Throwable B(Throwable th2, n2 n2Var) {
        return th2 == null ? new o2("Job was cancelled", (Throwable) null, n2Var) : th2;
    }

    @g
    public static final c0 a(@h n2 n2Var) {
        return new q2(n2Var);
    }

    public static /* synthetic */ c0 c(n2 n2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n2Var = null;
        }
        return r2.a(n2Var);
    }

    public static /* synthetic */ n2 d(n2 n2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n2Var = null;
        }
        return r2.a(n2Var);
    }

    public static final void f(@g ie.g gVar, @h CancellationException cancellationException) {
        n2 n2Var = (n2) gVar.g(n2.D);
        if (n2Var != null) {
            n2Var.h(cancellationException);
        }
    }

    public static final void g(@g n2 n2Var, @g String str, @h Throwable th2) {
        n2Var.h(y1.a(str, th2));
    }

    @k(level = m.Q, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(ie.g gVar, Throwable th2) {
        g.b g10 = gVar.g(n2.D);
        v2 v2Var = g10 instanceof v2 ? (v2) g10 : null;
        if (v2Var == null) {
            return false;
        }
        v2Var.l0(B(th2, v2Var));
        return true;
    }

    public static /* synthetic */ void i(ie.g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        r2.f(gVar, cancellationException);
    }

    public static /* synthetic */ void j(n2 n2Var, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        r2.g(n2Var, str, th2);
    }

    public static /* synthetic */ boolean k(ie.g gVar, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        return h(gVar, th2);
    }

    @h
    public static final Object l(@fh.g n2 n2Var, @fh.g d<? super u2> dVar) {
        n2.a.b(n2Var, (CancellationException) null, 1, (Object) null);
        Object L1 = n2Var.L1(dVar);
        return L1 == ke.d.h() ? L1 : u2.f25116a;
    }

    @k(level = m.Q, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(ie.g gVar, Throwable th2) {
        n2 n2Var = (n2) gVar.g(n2.D);
        if (n2Var != null) {
            for (n2 next : n2Var.P()) {
                v2 v2Var = next instanceof v2 ? (v2) next : null;
                if (v2Var != null) {
                    v2Var.l0(B(th2, n2Var));
                }
            }
        }
    }

    public static final void o(@fh.g ie.g gVar, @h CancellationException cancellationException) {
        p000if.m<n2> P;
        n2 n2Var = (n2) gVar.g(n2.D);
        if (n2Var != null && (P = n2Var.P()) != null) {
            for (n2 h10 : P) {
                h10.h(cancellationException);
            }
        }
    }

    @k(level = m.Q, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(n2 n2Var, Throwable th2) {
        for (n2 next : n2Var.P()) {
            v2 v2Var = next instanceof v2 ? (v2) next : null;
            if (v2Var != null) {
                v2Var.l0(B(th2, n2Var));
            }
        }
    }

    public static final void r(@fh.g n2 n2Var, @h CancellationException cancellationException) {
        for (n2 h10 : n2Var.P()) {
            h10.h(cancellationException);
        }
    }

    public static /* synthetic */ void s(ie.g gVar, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        n(gVar, th2);
    }

    public static /* synthetic */ void t(ie.g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        r2.o(gVar, cancellationException);
    }

    public static /* synthetic */ void u(n2 n2Var, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        q(n2Var, th2);
    }

    public static /* synthetic */ void v(n2 n2Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        r2.r(n2Var, cancellationException);
    }

    @fh.g
    public static final p1 w(@fh.g n2 n2Var, @fh.g p1 p1Var) {
        return n2Var.A(new r1(p1Var));
    }

    public static final void x(@fh.g ie.g gVar) {
        n2 n2Var = (n2) gVar.g(n2.D);
        if (n2Var != null) {
            r2.A(n2Var);
        }
    }

    public static final void y(@fh.g n2 n2Var) {
        if (!n2Var.c()) {
            throw n2Var.k0();
        }
    }

    @fh.g
    public static final n2 z(@fh.g ie.g gVar) {
        n2 n2Var = (n2) gVar.g(n2.D);
        if (n2Var != null) {
            return n2Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }
}

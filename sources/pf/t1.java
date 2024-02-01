package pf;

import fh.g;
import fh.h;
import h.a;
import kotlin.Metadata;
import wf.a;
import wf.t;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0010\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048TX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00028TX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b#\u0010\u001eR\u0011\u0010&\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b%\u0010\u001eR\u0011\u0010(\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b'\u0010\u001e¨\u0006+"}, d2 = {"Lpf/t1;", "Lpf/o0;", "", "c2", "", "d2", "e2", "Lpf/j1;", "task", "Lzd/u2;", "V1", "unconfined", "X1", "S1", "", "parallelism", "Q1", "shutdown", "U1", "Q", "J", "useCount", "R", "Z", "shared", "Lwf/a;", "S", "Lwf/a;", "unconfinedQueue", "Z1", "()Z", "isEmpty", "W1", "()J", "nextTime", "c", "isActive", "a2", "isUnconfinedLoopActive", "b2", "isUnconfinedQueueEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class t1 extends o0 {
    public long Q;
    public boolean R;
    @h
    public a<j1<?>> S;

    public static /* synthetic */ void T1(t1 t1Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            t1Var.S1(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    public static /* synthetic */ void Y1(t1 t1Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            t1Var.X1(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    @g
    public final o0 Q1(int i10) {
        t.a(i10);
        return this;
    }

    public final void S1(boolean z10) {
        long U1 = this.Q - U1(z10);
        this.Q = U1;
        if (U1 <= 0 && this.R) {
            shutdown();
        }
    }

    public final long U1(boolean z10) {
        if (z10) {
            return a.c.M;
        }
        return 1;
    }

    public final void V1(@g j1<?> j1Var) {
        wf.a<j1<?>> aVar = this.S;
        if (aVar == null) {
            aVar = new wf.a<>();
            this.S = aVar;
        }
        aVar.a(j1Var);
    }

    public long W1() {
        wf.a<j1<?>> aVar = this.S;
        return (aVar != null && !aVar.d()) ? 0 : Long.MAX_VALUE;
    }

    public final void X1(boolean z10) {
        this.Q += U1(z10);
        if (!z10) {
            this.R = true;
        }
    }

    public boolean Z1() {
        return b2();
    }

    public final boolean a2() {
        return this.Q >= U1(true);
    }

    public final boolean b2() {
        wf.a<j1<?>> aVar = this.S;
        if (aVar != null) {
            return aVar.d();
        }
        return true;
    }

    public final boolean c() {
        return this.Q > 0;
    }

    public long c2() {
        return !d2() ? Long.MAX_VALUE : 0;
    }

    public final boolean d2() {
        j1 e10;
        wf.a<j1<?>> aVar = this.S;
        if (aVar == null || (e10 = aVar.e()) == null) {
            return false;
        }
        e10.run();
        return true;
    }

    public boolean e2() {
        return false;
    }

    public void shutdown() {
    }
}

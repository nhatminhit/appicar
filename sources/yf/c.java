package yf;

import fh.g;
import gf.v;
import ie.i;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import pf.c2;
import pf.i2;
import pf.n1;
import pf.o0;
import pf.z1;
import wf.t0;
import wf.v0;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0017J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lyf/c;", "Lpf/z1;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lzd/u2;", "execute", "", "parallelism", "Lpf/o0;", "Q1", "Lie/g;", "context", "Lkotlinx/coroutines/Runnable;", "block", "N1", "O1", "close", "", "toString", "S", "Lpf/o0;", "default", "S1", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class c extends z1 implements Executor {
    @g
    public static final c R = new c();
    @g
    public static final o0 S = p.Q.Q1(v0.d(n1.f22019a, v.u(64, t0.a()), 0, 0, 12, (Object) null));

    public void N1(@g ie.g gVar, @g Runnable runnable) {
        S.N1(gVar, runnable);
    }

    @i2
    public void O1(@g ie.g gVar, @g Runnable runnable) {
        S.O1(gVar, runnable);
    }

    @g
    @c2
    public o0 Q1(int i10) {
        return p.Q.Q1(i10);
    }

    @g
    public Executor S1() {
        return this;
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(@g Runnable runnable) {
        N1(i.O, runnable);
    }

    @g
    public String toString() {
        return "Dispatchers.IO";
    }
}

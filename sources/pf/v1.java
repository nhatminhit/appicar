package pf;

import fh.g;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import pf.u1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\f\u001a\u00020\t8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lpf/v1;", "Lpf/t1;", "Lzd/u2;", "h2", "", "now", "Lpf/u1$c;", "delayedTask", "g2", "Ljava/lang/Thread;", "f2", "()Ljava/lang/Thread;", "thread", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class v1 extends t1 {
    @g
    public abstract Thread f2();

    public void g2(long j10, @g u1.c cVar) {
        a1.V.p2(j10, cVar);
    }

    public final void h2() {
        u2 u2Var;
        Thread f22 = f2();
        if (Thread.currentThread() != f22) {
            b b10 = c.b();
            if (b10 != null) {
                b10.g(f22);
                u2Var = u2.f25116a;
            } else {
                u2Var = null;
            }
            if (u2Var == null) {
                LockSupport.unpark(f22);
            }
        }
    }
}

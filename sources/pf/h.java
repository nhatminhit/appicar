package pf;

import fh.g;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lpf/h;", "T", "Lpf/a;", "", "state", "Lzd/u2;", "f0", "J1", "()Ljava/lang/Object;", "Ljava/lang/Thread;", "Q", "Ljava/lang/Thread;", "blockedThread", "Lpf/t1;", "R", "Lpf/t1;", "eventLoop", "", "P0", "()Z", "isScopedCoroutine", "Lie/g;", "parentContext", "<init>", "(Lie/g;Ljava/lang/Thread;Lpf/t1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class h<T> extends a<T> {
    @g
    public final Thread Q;
    @fh.h
    public final t1 R;

    public h(@g ie.g gVar, @g Thread thread, @fh.h t1 t1Var) {
        super(gVar, true, true);
        this.Q = thread;
        this.R = t1Var;
    }

    public final T J1() {
        u2 u2Var;
        b b10 = c.b();
        if (b10 != null) {
            b10.d();
        }
        try {
            t1 t1Var = this.R;
            e0 e0Var = null;
            if (t1Var != null) {
                t1.Y1(t1Var, false, 1, (Object) null);
            }
            while (!Thread.interrupted()) {
                t1 t1Var2 = this.R;
                long c22 = t1Var2 != null ? t1Var2.c2() : Long.MAX_VALUE;
                if (!m()) {
                    b b11 = c.b();
                    if (b11 != null) {
                        b11.c(this, c22);
                        u2Var = u2.f25116a;
                    } else {
                        u2Var = null;
                    }
                    if (u2Var == null) {
                        LockSupport.parkNanos(this, c22);
                    }
                } else {
                    t1 t1Var3 = this.R;
                    if (t1Var3 != null) {
                        t1.T1(t1Var3, false, 1, (Object) null);
                    }
                    b b12 = c.b();
                    if (b12 != null) {
                        b12.h();
                    }
                    T o10 = w2.o(J0());
                    if (o10 instanceof e0) {
                        e0Var = (e0) o10;
                    }
                    if (e0Var == null) {
                        return o10;
                    }
                    throw e0Var.f21998a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            i0(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            b b13 = c.b();
            if (b13 != null) {
                b13.h();
            }
            throw th2;
        }
    }

    public boolean P0() {
        return true;
    }

    public void f0(@fh.h Object obj) {
        u2 u2Var;
        if (!l0.g(Thread.currentThread(), this.Q)) {
            Thread thread = this.Q;
            b b10 = c.b();
            if (b10 != null) {
                b10.g(thread);
                u2Var = u2.f25116a;
            } else {
                u2Var = null;
            }
            if (u2Var == null) {
                LockSupport.unpark(thread);
            }
        }
    }
}

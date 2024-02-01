package pf;

import fh.g;
import fh.h;
import gf.v;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import pf.u1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0018\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\bA\u0010\u0015J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014J\b\u0010\f\u001a\u00020\u0005H\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00072\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u000f\u0010\u0014\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0007J\b\u0010\u0018\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002R\u0014\u0010!\u001a\u00020\u001e8\u0006XT¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001e\u0010'\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u0015R\u0014\u0010-\u001a\u00020*8\u0002XT¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020*8\u0002XT¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00101\u001a\u00020*8\u0002XT¢\u0006\u0006\n\u0004\b0\u0010,R\u0014\u00103\u001a\u00020*8\u0002XT¢\u0006\u0006\n\u0004\b2\u0010,R\u0014\u00105\u001a\u00020*8\u0002XT¢\u0006\u0006\n\u0004\b4\u0010,R\u0016\u00106\u001a\u00020*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u0010,R\u0014\u00109\u001a\u00020\u00198TX\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\u001b8@X\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u001b8BX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010@\u001a\u00020\u001b8BX\u0004¢\u0006\u0006\u001a\u0004\b?\u0010;¨\u0006B"}, d2 = {"Lpf/a1;", "Lpf/u1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "Lzd/u2;", "l2", "", "now", "Lpf/u1$c;", "delayedTask", "g2", "shutdown", "timeMillis", "block", "Lie/g;", "context", "Lpf/p1;", "W0", "run", "w2", "()V", "timeout", "D2", "C2", "Ljava/lang/Thread;", "v2", "", "B2", "u2", "", "W", "Ljava/lang/String;", "THREAD_NAME", "X", "J", "DEFAULT_KEEP_ALIVE_MS", "Y", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "Z", "I", "FRESH", "a0", "ACTIVE", "b0", "SHUTDOWN_REQ", "c0", "SHUTDOWN_ACK", "d0", "SHUTDOWN", "debugStatus", "f2", "()Ljava/lang/Thread;", "thread", "A2", "()Z", "isThreadPresent", "y2", "isShutDown", "z2", "isShutdownRequested", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class a1 extends u1 implements Runnable {
    @g
    public static final a1 V;
    @g
    public static final String W = "kotlinx.coroutines.DefaultExecutor";
    public static final long X = 1000;
    public static final long Y;
    public static final int Z = 0;
    @h
    private static volatile Thread _thread = null;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f21983a0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f21984b0 = 2;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f21985c0 = 3;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f21986d0 = 4;
    private static volatile int debugStatus;

    static {
        Long l10;
        a1 a1Var = new a1();
        V = a1Var;
        t1.Y1(a1Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        Y = timeUnit.toNanos(l10.longValue());
    }

    public static /* synthetic */ void x2() {
    }

    public final boolean A2() {
        return _thread != null;
    }

    public final synchronized boolean B2() {
        if (z2()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    public final void C2() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void D2(long j10) {
        u2 u2Var;
        long currentTimeMillis = System.currentTimeMillis() + j10;
        if (!z2()) {
            debugStatus = 2;
        }
        while (debugStatus != 3 && _thread != null) {
            Thread thread = _thread;
            if (thread != null) {
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
            if (currentTimeMillis - System.currentTimeMillis() <= 0) {
                break;
            }
            wait(j10);
        }
        debugStatus = 0;
    }

    @g
    public p1 W0(long j10, @g Runnable runnable, @g ie.g gVar) {
        return r2(j10, runnable);
    }

    @g
    public Thread f2() {
        Thread thread = _thread;
        return thread == null ? v2() : thread;
    }

    public void g2(long j10, @g u1.c cVar) {
        C2();
    }

    public void l2(@g Runnable runnable) {
        if (y2()) {
            C2();
        }
        super.l2(runnable);
    }

    public void run() {
        u2 u2Var;
        u3.f22027a.d(this);
        b b10 = c.b();
        if (b10 != null) {
            b10.d();
        }
        try {
            if (B2()) {
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long c22 = c2();
                    if (c22 == Long.MAX_VALUE) {
                        b b11 = c.b();
                        long b12 = b11 != null ? b11.b() : System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = Y + b12;
                        }
                        long j11 = j10 - b12;
                        if (j11 <= 0) {
                            _thread = null;
                            u2();
                            b b13 = c.b();
                            if (b13 != null) {
                                b13.h();
                            }
                            if (!Z1()) {
                                f2();
                                return;
                            }
                            return;
                        }
                        c22 = v.C(c22, j11);
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (c22 > 0) {
                        if (z2()) {
                            _thread = null;
                            u2();
                            b b14 = c.b();
                            if (b14 != null) {
                                b14.h();
                            }
                            if (!Z1()) {
                                f2();
                                return;
                            }
                            return;
                        }
                        b b15 = c.b();
                        if (b15 != null) {
                            b15.c(this, c22);
                            u2Var = u2.f25116a;
                        } else {
                            u2Var = null;
                        }
                        if (u2Var == null) {
                            LockSupport.parkNanos(this, c22);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            u2();
            b b16 = c.b();
            if (b16 != null) {
                b16.h();
            }
            if (!Z1()) {
                f2();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void u2() {
        if (z2()) {
            debugStatus = 3;
            o2();
            notifyAll();
        }
    }

    public final synchronized Thread v2() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, W);
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final synchronized void w2() {
        debugStatus = 0;
        v2();
        while (debugStatus == 0) {
            wait();
        }
    }

    public final boolean y2() {
        return debugStatus == 4;
    }

    public final boolean z2() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }
}

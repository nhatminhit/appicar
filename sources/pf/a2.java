package pf;

import fh.g;
import fh.h;
import ie.d;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import pf.e1;
import wf.f;
import zd.k;
import zd.m;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J.\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b*\u00020\u001a2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u001a\u0010%\u001a\u00020 8\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lpf/a2;", "Lpf/z1;", "Lpf/e1;", "Lie/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lzd/u2;", "N1", "", "timeMillis", "Lpf/q;", "continuation", "p1", "Lpf/p1;", "W0", "close", "", "toString", "", "other", "", "equals", "", "hashCode", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "U1", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "T1", "Ljava/util/concurrent/Executor;", "R", "Ljava/util/concurrent/Executor;", "S1", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class a2 extends z1 implements e1 {
    @g
    public final Executor R;

    public a2(@g Executor executor) {
        this.R = executor;
        f.c(S1());
    }

    @h
    @k(level = m.P, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object F1(long j10, @g d<? super u2> dVar) {
        return e1.a.a(this, j10, dVar);
    }

    public void N1(@g ie.g gVar, @g Runnable runnable) {
        Runnable runnable2;
        try {
            Executor S1 = S1();
            b b10 = c.b();
            if (b10 == null || (runnable2 = b10.i(runnable)) == null) {
                runnable2 = runnable;
            }
            S1.execute(runnable2);
        } catch (RejectedExecutionException e10) {
            b b11 = c.b();
            if (b11 != null) {
                b11.f();
            }
            T1(gVar, e10);
            m1.c().N1(gVar, runnable);
        }
    }

    @g
    public Executor S1() {
        return this.R;
    }

    public final void T1(ie.g gVar, RejectedExecutionException rejectedExecutionException) {
        r2.f(gVar, y1.a("The task was rejected", rejectedExecutionException));
    }

    public final ScheduledFuture<?> U1(ScheduledExecutorService scheduledExecutorService, Runnable runnable, ie.g gVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            T1(gVar, e10);
            return null;
        }
    }

    @g
    public p1 W0(long j10, @g Runnable runnable, @g ie.g gVar) {
        Executor S1 = S1();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = S1 instanceof ScheduledExecutorService ? (ScheduledExecutorService) S1 : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = U1(scheduledExecutorService, runnable, gVar, j10);
        }
        return scheduledFuture != null ? new o1(scheduledFuture) : a1.V.W0(j10, runnable, gVar);
    }

    public void close() {
        Executor S1 = S1();
        ExecutorService executorService = S1 instanceof ExecutorService ? (ExecutorService) S1 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(@h Object obj) {
        return (obj instanceof a2) && ((a2) obj).S1() == S1();
    }

    public int hashCode() {
        return System.identityHashCode(S1());
    }

    public void p1(long j10, @g q<? super u2> qVar) {
        Executor S1 = S1();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = S1 instanceof ScheduledExecutorService ? (ScheduledExecutorService) S1 : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = U1(scheduledExecutorService, new j3(this, qVar), qVar.e(), j10);
        }
        if (scheduledFuture != null) {
            r2.w(qVar, scheduledFuture);
        } else {
            a1.V.p1(j10, qVar);
        }
    }

    @g
    public String toString() {
        return S1().toString();
    }
}

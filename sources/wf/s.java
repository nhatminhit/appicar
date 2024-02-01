package wf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import pf.b1;
import pf.c2;
import pf.e1;
import pf.i2;
import pf.o0;
import pf.p1;
import pf.q;
import we.a;
import zd.k;
import zd.m;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010!\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b.\u0010/J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005HAø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\r\u001a\u00020\fH\u0001J\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0001J\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u001c\u0010\u0017\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u001c\u0010\u0018\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0017J#\u0010\u001b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\bJ\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u0014\u0010\u001e\u001a\u00020\u001c2\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0002R\u0014\u0010!\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u001e\u0010(\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010-\u001a\u00060)j\u0002`*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lwf/s;", "Lpf/o0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lpf/e1;", "", "time", "Lzd/u2;", "F1", "(JLie/d;)Ljava/lang/Object;", "timeMillis", "block", "Lie/g;", "context", "Lpf/p1;", "W0", "Lpf/q;", "continuation", "p1", "", "parallelism", "Q1", "run", "N1", "O1", "Lkotlin/Function0;", "dispatch", "T1", "", "U1", "S1", "Q", "Lpf/o0;", "dispatcher", "R", "I", "runningWorkers", "Lwf/a0;", "T", "Lwf/a0;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "U", "Ljava/lang/Object;", "workerAllocationLock", "<init>", "(Lpf/o0;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class s extends o0 implements Runnable, e1 {
    @g
    public final o0 Q;
    public final int R;
    public final /* synthetic */ e1 S;
    @g
    public final a0<Runnable> T;
    @g
    public final Object U;
    private volatile int runningWorkers;

    public s(@g o0 o0Var, int i10) {
        this.Q = o0Var;
        this.R = i10;
        e1 e1Var = o0Var instanceof e1 ? (e1) o0Var : null;
        this.S = e1Var == null ? b1.a() : e1Var;
        this.T = new a0<>(false);
        this.U = new Object();
    }

    @h
    @k(level = m.P, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object F1(long j10, @g d<? super u2> dVar) {
        return this.S.F1(j10, dVar);
    }

    public void N1(@g ie.g gVar, @g Runnable runnable) {
        if (!S1(runnable) && U1()) {
            this.Q.N1(this, this);
        }
    }

    @i2
    public void O1(@g ie.g gVar, @g Runnable runnable) {
        if (!S1(runnable) && U1()) {
            this.Q.O1(this, this);
        }
    }

    @g
    @c2
    public o0 Q1(int i10) {
        t.a(i10);
        return i10 >= this.R ? this : super.Q1(i10);
    }

    public final boolean S1(Runnable runnable) {
        this.T.a(runnable);
        return this.runningWorkers >= this.R;
    }

    public final void T1(Runnable runnable, a<u2> aVar) {
        if (!S1(runnable) && U1()) {
            aVar.n();
        }
    }

    public final boolean U1() {
        synchronized (this.U) {
            if (this.runningWorkers >= this.R) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @g
    public p1 W0(long j10, @g Runnable runnable, @g ie.g gVar) {
        return this.S.W0(j10, runnable, gVar);
    }

    public void p1(long j10, @g q<? super u2> qVar) {
        this.S.p1(j10, qVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.T.c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
        r2 = zd.u2.f25116a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            wf.a0<java.lang.Runnable> r2 = r4.T
            java.lang.Object r2 = r2.g()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            ie.i r3 = ie.i.O
            pf.r0.b(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            pf.o0 r2 = r4.Q
            boolean r2 = r2.P1(r4)
            if (r2 == 0) goto L_0x0002
            pf.o0 r0 = r4.Q
            r0.N1(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.U
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            wf.a0<java.lang.Runnable> r2 = r4.T     // Catch:{ all -> 0x0047 }
            int r2 = r2.c()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            zd.u2 r2 = zd.u2.f25116a     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.s.run():void");
    }
}

package pf;

import fh.g;
import fh.h;
import gf.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import pf.e1;
import ve.e;
import wf.a1;
import wf.b0;
import wf.b1;
import xe.l0;
import zd.f1;
import zd.k;
import zd.m;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b \u0018\u00002\u00020\u00012\u00020\u0002:\u000489:;B\u0007¢\u0006\u0004\b7\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00032\n\u0010\u0018\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0004¢\u0006\u0004\b \u0010\u0005J\u001b\u0010\"\u001a\u00020!2\n\u0010\u0018\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010\u0005J\u0017\u0010'\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010\u0005R$\u00102\u001a\u00020!2\u0006\u0010-\u001a\u00020!8B@BX\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020!8TX\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0013¨\u0006<"}, d2 = {"Lpf/u1;", "Lpf/v1;", "Lpf/e1;", "Lzd/u2;", "shutdown", "()V", "", "timeMillis", "Lpf/q;", "continuation", "p1", "(JLpf/q;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lpf/p1;", "r2", "(JLjava/lang/Runnable;)Lpf/p1;", "c2", "()J", "Lie/g;", "context", "N1", "(Lie/g;Ljava/lang/Runnable;)V", "task", "l2", "(Ljava/lang/Runnable;)V", "now", "Lpf/u1$c;", "delayedTask", "p2", "(JLpf/u1$c;)V", "o2", "", "m2", "(Ljava/lang/Runnable;)Z", "k2", "()Ljava/lang/Runnable;", "j2", "t2", "(Lpf/u1$c;)Z", "", "q2", "(JLpf/u1$c;)I", "n2", "value", "m", "()Z", "s2", "(Z)V", "isCompleted", "Z1", "isEmpty", "W1", "nextTime", "<init>", "a", "b", "c", "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class u1 extends v1 implements e1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater T;
    public static final /* synthetic */ AtomicReferenceFieldUpdater U;
    @g
    private volatile /* synthetic */ Object _delayed = null;
    @g
    private volatile /* synthetic */ int _isCompleted = 0;
    @g
    private volatile /* synthetic */ Object _queue = null;

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lpf/u1$a;", "Lpf/u1$c;", "Lzd/u2;", "run", "", "toString", "Lpf/q;", "Q", "Lpf/q;", "cont", "", "nanoTime", "<init>", "(Lpf/u1;JLpf/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class a extends c {
        @g
        public final q<u2> Q;

        public a(long j10, @g q<? super u2> qVar) {
            super(j10);
            this.Q = qVar;
        }

        public void run() {
            this.Q.W(u1.this, u2.f25116a);
        }

        @g
        public String toString() {
            return super.toString() + this.Q;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lpf/u1$b;", "Lpf/u1$c;", "Lzd/u2;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Q", "Ljava/lang/Runnable;", "block", "", "nanoTime", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b extends c {
        @g
        public final Runnable Q;

        public b(long j10, @g Runnable runnable) {
            super(j10);
            this.Q = runnable;
        }

        public void run() {
            this.Q.run();
        }

        @g
        public String toString() {
            return super.toString() + this.Q;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010!\u001a\u00020\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"2\f\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"8V@VX\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lpf/u1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lpf/p1;", "Lwf/b1;", "other", "", "d", "", "now", "", "i", "Lpf/u1$d;", "delayed", "Lpf/u1;", "eventLoop", "e", "Lzd/u2;", "P", "", "toString", "O", "J", "nanoTime", "", "_heap", "Ljava/lang/Object;", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Lwf/a1;", "value", "b", "()Lwf/a1;", "a", "(Lwf/a1;)V", "heap", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static abstract class c implements Runnable, Comparable<c>, p1, b1 {
        @e
        public long O;
        public int P = -1;
        @h
        private volatile Object _heap;

        public c(long j10) {
            this.O = j10;
        }

        public final synchronized void P() {
            Object obj = this._heap;
            if (obj != x1.f22045a) {
                d dVar = obj instanceof d ? (d) obj : null;
                if (dVar != null) {
                    dVar.k(this);
                }
                this._heap = x1.f22045a;
            }
        }

        public void a(@h a1<?> a1Var) {
            if (this._heap != x1.f22045a) {
                this._heap = a1Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @h
        public a1<?> b() {
            Object obj = this._heap;
            if (obj instanceof a1) {
                return (a1) obj;
            }
            return null;
        }

        /* renamed from: d */
        public int compareTo(@g c cVar) {
            int i10 = ((this.O - cVar.O) > 0 ? 1 : ((this.O - cVar.O) == 0 ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            return i10 < 0 ? -1 : 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0046, code lost:
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
            return r8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0040  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized int e(long r8, @fh.g pf.u1.d r10, @fh.g pf.u1 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch:{ all -> 0x004b }
                wf.r0 r1 = pf.x1.f22045a     // Catch:{ all -> 0x004b }
                if (r0 != r1) goto L_0x000c
                r8 = 2
            L_0x000a:
                monitor-exit(r7)
                return r8
            L_0x000c:
                monitor-enter(r10)     // Catch:{ all -> 0x004b }
                wf.b1 r0 = r10.f()     // Catch:{ all -> 0x0048 }
                pf.u1$c r0 = (pf.u1.c) r0     // Catch:{ all -> 0x0048 }
                boolean r11 = r11.m()     // Catch:{ all -> 0x0048 }
                if (r11 == 0) goto L_0x001d
                r8 = 1
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                monitor-exit(r7)
                return r8
            L_0x001d:
                r1 = 0
                if (r0 != 0) goto L_0x0024
            L_0x0021:
                r10.f22026b = r8     // Catch:{ all -> 0x0048 }
                goto L_0x0037
            L_0x0024:
                long r3 = r0.O     // Catch:{ all -> 0x0048 }
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r8 = r3
            L_0x002e:
                long r3 = r10.f22026b     // Catch:{ all -> 0x0048 }
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L_0x0037
                goto L_0x0021
            L_0x0037:
                long r8 = r7.O     // Catch:{ all -> 0x0048 }
                long r3 = r10.f22026b     // Catch:{ all -> 0x0048 }
                long r8 = r8 - r3
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 >= 0) goto L_0x0042
                r7.O = r3     // Catch:{ all -> 0x0048 }
            L_0x0042:
                r10.a(r7)     // Catch:{ all -> 0x0048 }
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                r8 = 0
                goto L_0x000a
            L_0x0048:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                throw r8     // Catch:{ all -> 0x004b }
            L_0x004b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: pf.u1.c.e(long, pf.u1$d, pf.u1):int");
        }

        public int getIndex() {
            return this.P;
        }

        public final boolean i(long j10) {
            return j10 - this.O >= 0;
        }

        public void setIndex(int i10) {
            this.P = i10;
        }

        @g
        public String toString() {
            return "Delayed[nanos=" + this.O + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lpf/u1$d;", "Lwf/a1;", "Lpf/u1$c;", "", "b", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d extends a1<c> {
        @e

        /* renamed from: b  reason: collision with root package name */
        public long f22026b;

        public d(long j10) {
            this.f22026b = j10;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<u1> cls2 = u1.class;
        T = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        U = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    /* access modifiers changed from: private */
    public final boolean m() {
        return this._isCompleted;
    }

    @h
    @k(level = m.P, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object F1(long j10, @g ie.d<? super u2> dVar) {
        return e1.a.a(this, j10, dVar);
    }

    public final void N1(@g ie.g gVar, @g Runnable runnable) {
        l2(runnable);
    }

    @g
    public p1 W0(long j10, @g Runnable runnable, @g ie.g gVar) {
        return e1.a.b(this, j10, runnable, gVar);
    }

    public long W1() {
        c cVar;
        if (super.W1() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof b0)) {
                return obj == x1.f22052h ? Long.MAX_VALUE : 0;
            }
            if (!((b0) obj).h()) {
                return 0;
            }
        }
        d dVar = (d) this._delayed;
        if (dVar == null || (cVar = (c) dVar.i()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.O;
        b b10 = c.b();
        return v.v(j10 - (b10 != null ? b10.b() : System.nanoTime()), 0);
    }

    public boolean Z1() {
        if (!b2()) {
            return false;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.h()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof b0) {
                return ((b0) obj).h();
            }
            if (obj != x1.f22052h) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long c2() {
        /*
            r9 = this;
            boolean r0 = r9.d2()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            pf.u1$d r0 = (pf.u1.d) r0
            if (r0 == 0) goto L_0x004d
            boolean r3 = r0.h()
            if (r3 != 0) goto L_0x004d
            pf.b r3 = pf.c.b()
            if (r3 == 0) goto L_0x0020
            long r3 = r3.b()
            goto L_0x0024
        L_0x0020:
            long r3 = java.lang.System.nanoTime()
        L_0x0024:
            monitor-enter(r0)
            wf.b1 r5 = r0.f()     // Catch:{ all -> 0x004a }
            r6 = 0
            if (r5 != 0) goto L_0x002e
        L_0x002c:
            monitor-exit(r0)
            goto L_0x0045
        L_0x002e:
            pf.u1$c r5 = (pf.u1.c) r5     // Catch:{ all -> 0x004a }
            boolean r7 = r5.i(r3)     // Catch:{ all -> 0x004a }
            r8 = 0
            if (r7 == 0) goto L_0x003c
            boolean r5 = r9.m2(r5)     // Catch:{ all -> 0x004a }
            goto L_0x003d
        L_0x003c:
            r5 = r8
        L_0x003d:
            if (r5 == 0) goto L_0x002c
            wf.b1 r5 = r0.l(r8)     // Catch:{ all -> 0x004a }
            r6 = r5
            goto L_0x002c
        L_0x0045:
            pf.u1$c r6 = (pf.u1.c) r6
            if (r6 != 0) goto L_0x0024
            goto L_0x004d
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004d:
            java.lang.Runnable r0 = r9.k2()
            if (r0 == 0) goto L_0x0057
            r0.run()
            return r1
        L_0x0057:
            long r0 = r9.W1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.u1.c2():long");
    }

    public final void j2() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (f1.a(T, this, (Object) null, x1.f22052h)) {
                    return;
                }
            } else if (obj instanceof b0) {
                ((b0) obj).d();
                return;
            } else if (obj != x1.f22052h) {
                b0 b0Var = new b0(8, true);
                b0Var.a((Runnable) obj);
                if (f1.a(T, this, obj, b0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final Runnable k2() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                Object l10 = b0Var.l();
                if (l10 != b0.f24073t) {
                    return (Runnable) l10;
                }
                f1.a(T, this, obj, b0Var.k());
            } else if (obj == x1.f22052h) {
                return null;
            } else {
                if (f1.a(T, this, obj, (Object) null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    public void l2(@g Runnable runnable) {
        if (m2(runnable)) {
            h2();
        } else {
            a1.V.l2(runnable);
        }
    }

    public final boolean m2(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (m()) {
                return false;
            }
            if (obj == null) {
                if (f1.a(T, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                int a10 = b0Var.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    f1.a(T, this, obj, b0Var.k());
                } else if (a10 == 2) {
                    return false;
                }
            } else if (obj == x1.f22052h) {
                return false;
            } else {
                b0 b0Var2 = new b0(8, true);
                b0Var2.a((Runnable) obj);
                b0Var2.a(runnable);
                if (f1.a(T, this, obj, b0Var2)) {
                    return true;
                }
            }
        }
    }

    public final void n2() {
        c cVar;
        b b10 = c.b();
        long b11 = b10 != null ? b10.b() : System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar != null && (cVar = (c) dVar.n()) != null) {
                g2(b11, cVar);
            } else {
                return;
            }
        }
    }

    public final void o2() {
        this._queue = null;
        this._delayed = null;
    }

    public void p1(long j10, @g q<? super u2> qVar) {
        long d10 = x1.d(j10);
        if (d10 < 4611686018427387903L) {
            b b10 = c.b();
            long b11 = b10 != null ? b10.b() : System.nanoTime();
            a aVar = new a(d10 + b11, qVar);
            p2(b11, aVar);
            t.a(qVar, aVar);
        }
    }

    public final void p2(long j10, @g c cVar) {
        int q22 = q2(j10, cVar);
        if (q22 != 0) {
            if (q22 == 1) {
                g2(j10, cVar);
            } else if (q22 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (t2(cVar)) {
            h2();
        }
    }

    public final int q2(long j10, c cVar) {
        if (m()) {
            return 1;
        }
        d dVar = (d) this._delayed;
        if (dVar == null) {
            f1.a(U, this, (Object) null, new d(j10));
            Object obj = this._delayed;
            l0.m(obj);
            dVar = (d) obj;
        }
        return cVar.e(j10, dVar, this);
    }

    @g
    public final p1 r2(long j10, @g Runnable runnable) {
        long d10 = x1.d(j10);
        if (d10 >= 4611686018427387903L) {
            return c3.O;
        }
        b b10 = c.b();
        long b11 = b10 != null ? b10.b() : System.nanoTime();
        b bVar = new b(d10 + b11, runnable);
        p2(b11, bVar);
        return bVar;
    }

    public final void s2(boolean z10) {
        this._isCompleted = z10 ? 1 : 0;
    }

    public void shutdown() {
        u3.f22027a.c();
        s2(true);
        j2();
        do {
        } while (c2() <= 0);
        n2();
    }

    public final boolean t2(c cVar) {
        d dVar = (d) this._delayed;
        return (dVar != null ? (c) dVar.i() : null) == cVar;
    }
}

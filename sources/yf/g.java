package yf;

import fh.h;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import pf.z1;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010(\u001a\u00020\u001e¢\u0006\u0004\b0\u00101J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ#\u0010\u0018\u001a\u00020\u00072\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001e\u0010,\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lyf/g;", "Lpf/z1;", "Lyf/l;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "Lzd/u2;", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "Lie/g;", "context", "block", "N1", "(Lie/g;Ljava/lang/Runnable;)V", "O1", "", "toString", "()Ljava/lang/String;", "c0", "", "tailDispatch", "T1", "(Ljava/lang/Runnable;Z)V", "Lyf/e;", "R", "Lyf/e;", "dispatcher", "", "S", "I", "parallelism", "T", "Ljava/lang/String;", "name", "U", "H0", "()I", "taskMode", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "V", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "queue", "S1", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Lyf/e;ILjava/lang/String;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class g extends z1 implements l, Executor {
    public static final /* synthetic */ AtomicIntegerFieldUpdater W = AtomicIntegerFieldUpdater.newUpdater(g.class, "inFlightTasks");
    @fh.g
    public final e R;
    public final int S;
    @h
    public final String T;
    public final int U;
    @fh.g
    public final ConcurrentLinkedQueue<Runnable> V = new ConcurrentLinkedQueue<>();
    @fh.g
    private volatile /* synthetic */ int inFlightTasks = 0;

    public g(@fh.g e eVar, int i10, @h String str, int i11) {
        this.R = eVar;
        this.S = i10;
        this.T = str;
        this.U = i11;
    }

    public int H0() {
        return this.U;
    }

    public void N1(@fh.g ie.g gVar, @fh.g Runnable runnable) {
        T1(runnable, false);
    }

    public void O1(@fh.g ie.g gVar, @fh.g Runnable runnable) {
        T1(runnable, true);
    }

    @fh.g
    public Executor S1() {
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Runnable) = (r4v0 java.lang.Runnable), (r4v5 java.lang.Runnable) binds: [B:0:0x0000, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T1(java.lang.Runnable r4, boolean r5) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = W
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.S
            if (r1 > r2) goto L_0x0010
            yf.e r0 = r3.R
            r0.W1(r4, r3, r5)
            return
        L_0x0010:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.V
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.S
            if (r4 < r0) goto L_0x001e
            return
        L_0x001e:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.V
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.g.T1(java.lang.Runnable, boolean):void");
    }

    public void c0() {
        Runnable poll = this.V.poll();
        if (poll != null) {
            this.R.W1(poll, this, true);
            return;
        }
        W.decrementAndGet(this);
        Runnable poll2 = this.V.poll();
        if (poll2 != null) {
            T1(poll2, true);
        }
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(@fh.g Runnable runnable) {
        T1(runnable, false);
    }

    @fh.g
    public String toString() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.R + ']';
    }
}

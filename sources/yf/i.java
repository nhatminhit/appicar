package yf;

import fh.g;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import pf.z1;
import xe.w;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010!\u001a\u00020\u0012\u0012\b\b\u0002\u0010%\u001a\u00020\"¢\u0006\u0004\b-\u0010.J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J+\u0010\r\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0007H\u0016J\u000f\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0011J\b\u0010\u0018\u001a\u00020\u0017H\u0002R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010!\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lyf/i;", "Lpf/z1;", "Lie/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lzd/u2;", "N1", "O1", "Lyf/l;", "", "tailDispatch", "U1", "(Ljava/lang/Runnable;Lyf/l;Z)V", "close", "X1", "()V", "", "timeout", "W1", "(J)V", "V1", "Lyf/a;", "T1", "", "R", "I", "corePoolSize", "S", "maxPoolSize", "T", "J", "idleWorkerKeepAliveNs", "", "U", "Ljava/lang/String;", "schedulerName", "V", "Lyf/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "S1", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class i extends z1 {
    public final int R;
    public final int S;
    public final long T;
    @g
    public final String U;
    @g
    public a V;

    public i() {
        this(0, 0, 0, (String) null, 15, (w) null);
    }

    public i(int i10, int i11, long j10, @g String str) {
        this.R = i10;
        this.S = i11;
        this.T = j10;
        this.U = str;
        this.V = T1();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ i(int r4, int r5, long r6, java.lang.String r8, int r9, xe.w r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            int r4 = yf.o.f24787c
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            int r5 = yf.o.f24788d
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            long r6 = yf.o.f24789e
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            java.lang.String r8 = "CoroutineScheduler"
        L_0x001a:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.i.<init>(int, int, long, java.lang.String, int, xe.w):void");
    }

    public void N1(@g ie.g gVar, @g Runnable runnable) {
        a.t(this.V, runnable, (l) null, false, 6, (Object) null);
    }

    public void O1(@g ie.g gVar, @g Runnable runnable) {
        a.t(this.V, runnable, (l) null, true, 2, (Object) null);
    }

    @g
    public Executor S1() {
        return this.V;
    }

    public final a T1() {
        return new a(this.R, this.S, this.T, this.U);
    }

    public final void U1(@g Runnable runnable, @g l lVar, boolean z10) {
        this.V.q(runnable, lVar, z10);
    }

    public final void V1() {
        X1();
    }

    public final synchronized void W1(long j10) {
        this.V.m0(j10);
    }

    public final synchronized void X1() {
        this.V.m0(1000);
        this.V = T1();
    }

    public void close() {
        this.V.close();
    }
}

package yf;

import fh.g;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import pf.o0;
import pf.z1;
import xe.w;
import zd.a1;
import zd.k;
import zd.m;

@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0011\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010$\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-B'\b\u0016\u0012\b\b\u0002\u0010\u001b\u001a\u00020\r\u0012\b\b\u0002\u0010\u001d\u001a\u00020\r\u0012\b\b\u0002\u0010$\u001a\u00020\u000b¢\u0006\u0004\b,\u0010.B\u001d\b\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\r\u0012\b\b\u0002\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b,\u0010/J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rJ+\u0010\u0015\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0002R\u0014\u0010\u001b\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00060"}, d2 = {"Lyf/e;", "Lpf/z1;", "Lie/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lzd/u2;", "N1", "O1", "close", "", "toString", "", "parallelism", "Lpf/o0;", "T1", "X1", "Lyf/l;", "", "tailDispatch", "W1", "(Ljava/lang/Runnable;Lyf/l;Z)V", "Lyf/a;", "V1", "R", "I", "corePoolSize", "S", "maxPoolSize", "", "T", "J", "idleWorkerKeepAliveNs", "U", "Ljava/lang/String;", "schedulerName", "V", "Lyf/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "S1", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(IIJLjava/lang/String;)V", "(IILjava/lang/String;)V", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@a1
public class e extends z1 {
    public final int R;
    public final int S;
    public final long T;
    @g
    public final String U;
    @g
    public a V;

    @k(level = m.Q, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ e(int i10, int i11) {
        this(i10, i11, o.f24789e, (String) null, 8, (w) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11, int i12, w wVar) {
        this((i12 & 1) != 0 ? o.f24787c : i10, (i12 & 2) != 0 ? o.f24788d : i11);
    }

    public e(int i10, int i11, long j10, @g String str) {
        this.R = i10;
        this.S = i11;
        this.T = j10;
        this.U = str;
        this.V = V1();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11, long j10, String str, int i12, w wVar) {
        this(i10, i11, j10, (i12 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public e(int i10, int i11, @g String str) {
        this(i10, i11, o.f24789e, str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11, String str, int i12, w wVar) {
        this((i12 & 1) != 0 ? o.f24787c : i10, (i12 & 2) != 0 ? o.f24788d : i11, (i12 & 4) != 0 ? o.f24785a : str);
    }

    public static /* synthetic */ o0 U1(e eVar, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = 16;
            }
            return eVar.T1(i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
    }

    public void N1(@g ie.g gVar, @g Runnable runnable) {
        try {
            a.t(this.V, runnable, (l) null, false, 6, (Object) null);
        } catch (RejectedExecutionException unused) {
            pf.a1.V.N1(gVar, runnable);
        }
    }

    public void O1(@g ie.g gVar, @g Runnable runnable) {
        try {
            a.t(this.V, runnable, (l) null, true, 2, (Object) null);
        } catch (RejectedExecutionException unused) {
            pf.a1.V.O1(gVar, runnable);
        }
    }

    @g
    public Executor S1() {
        return this.V;
    }

    @g
    public final o0 T1(int i10) {
        if (i10 > 0) {
            return new g(this, i10, (String) null, 1);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i10).toString());
    }

    public final a V1() {
        return new a(this.R, this.S, this.T, this.U);
    }

    public final void W1(@g Runnable runnable, @g l lVar, boolean z10) {
        try {
            this.V.q(runnable, lVar, z10);
        } catch (RejectedExecutionException unused) {
            pf.a1.V.l2(this.V.i(runnable, lVar));
        }
    }

    @g
    public final o0 X1(int i10) {
        boolean z10 = true;
        if (i10 > 0) {
            if (i10 > this.R) {
                z10 = false;
            }
            if (z10) {
                return new g(this, i10, (String) null, 0);
            }
            throw new IllegalArgumentException(("Expected parallelism level lesser than core pool size (" + this.R + "), but have " + i10).toString());
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i10).toString());
    }

    public void close() {
        this.V.close();
    }

    @g
    public String toString() {
        return super.toString() + "[scheduler = " + this.V + ']';
    }
}

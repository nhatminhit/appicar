package yf;

import fh.g;
import gf.v;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ve.e;
import wf.t0;
import wf.v0;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000XT¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u0013\u001a\u00020\u00108\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u0014\u0010\n\"\u0014\u0010\u0017\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u0016\u0010\n\"\u0014\u0010\u001b\u001a\u00020\u00188\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00188\u0000X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0019\u0010!\u001a\u00020\u001f*\u00020\u001e8À\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010 ¨\u0006\""}, d2 = {"", "a", "Ljava/lang/String;", "DEFAULT_SCHEDULER_NAME", "", "b", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "c", "I", "CORE_POOL_SIZE", "d", "MAX_POOL_SIZE", "e", "IDLE_WORKER_KEEP_ALIVE_NS", "Lyf/j;", "f", "Lyf/j;", "schedulerTimeSource", "g", "TASK_NON_BLOCKING", "h", "TASK_PROBABLY_BLOCKING", "Lyf/l;", "i", "Lyf/l;", "NonBlockingContext", "j", "BlockingContext", "Lyf/k;", "", "(Lyf/k;)Z", "isBlocking", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class o {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final String f24785a = "DefaultDispatcher";
    @e

    /* renamed from: b  reason: collision with root package name */
    public static final long f24786b = v0.e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);
    @e

    /* renamed from: c  reason: collision with root package name */
    public static final int f24787c = v0.d("kotlinx.coroutines.scheduler.core.pool.size", v.u(t0.a(), 2), 1, 0, 8, (Object) null);
    @e

    /* renamed from: d  reason: collision with root package name */
    public static final int f24788d = v0.d("kotlinx.coroutines.scheduler.max.pool.size", a.f24779j0, 0, a.f24779j0, 4, (Object) null);
    @e

    /* renamed from: e  reason: collision with root package name */
    public static final long f24789e = TimeUnit.SECONDS.toNanos(v0.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));
    @g
    @e

    /* renamed from: f  reason: collision with root package name */
    public static j f24790f = h.f24784a;

    /* renamed from: g  reason: collision with root package name */
    public static final int f24791g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final int f24792h = 1;
    @g
    @e

    /* renamed from: i  reason: collision with root package name */
    public static final l f24793i = new m(0);
    @g
    @e

    /* renamed from: j  reason: collision with root package name */
    public static final l f24794j = new m(1);

    public static final boolean a(@g k kVar) {
        return kVar.P.H0() == 1;
    }
}

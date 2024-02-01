package yf;

import ef.f;
import fh.g;
import fh.h;
import gf.v;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import pf.z0;
import ve.e;
import wf.m0;
import wf.r0;
import xe.l0;
import xe.w;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0003b\u0006cB+\u0012\u0006\u0010I\u001a\u00020\f\u0012\u0006\u0010J\u001a\u00020\f\u0012\b\b\u0002\u0010L\u001a\u00020\u000f\u0012\b\b\u0002\u0010O\u001a\u00020B¢\u0006\u0004\b_\u0010`J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\b¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\fH\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH\b¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u000fH\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005H\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\b¢\u0006\u0004\b\u001e\u0010\u0018J\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u0015J+\u0010'\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b)\u0010\nJ)\u0010,\u001a\u00020\u00192\n\u0010\u000b\u001a\u00060\bR\u00020\u00002\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\bR\u00020\u0000¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\b¢\u0006\u0004\b0\u0010\u0012J\u001b\u00104\u001a\u00020\u00192\n\u00103\u001a\u000601j\u0002`2H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0019H\u0016¢\u0006\u0004\b6\u0010\u001bJ\u0015\u00108\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u000f¢\u0006\u0004\b8\u00109J-\u0010=\u001a\u00020\u00192\n\u0010:\u001a\u000601j\u0002`22\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010&\u001a\u00020\u0005¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u00020\u00032\n\u0010:\u001a\u000601j\u0002`22\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0019¢\u0006\u0004\bA\u0010\u001bJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\f8\u0006X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010HR\u0014\u0010L\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010KR\u0014\u0010O\u001a\u00020B8\u0006X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0006X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020P8\u0006X\u0004¢\u0006\u0006\n\u0004\bT\u0010RR\u001e\u0010Y\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000V8\u0006X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0015\u0010[\u001a\u00020\f8Â\u0002X\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u0015R\u0015\u0010]\u001a\u00020\f8Â\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u0015R\u0011\u0010^\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b^\u0010\u001d¨\u0006d"}, d2 = {"Lyf/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lyf/k;", "task", "", "c", "(Lyf/k;)Z", "Lyf/a$c;", "Y", "()Lyf/a$c;", "worker", "", "Q", "(Lyf/a$c;)I", "", "state", "k", "(J)I", "g", "P", "()I", "o", "N", "()J", "Lzd/u2;", "m", "()V", "W0", "()Z", "e0", "skipUnpark", "z0", "(Z)V", "X0", "(J)Z", "f1", "h", "tailDispatch", "T0", "(Lyf/a$c;Lyf/k;Z)Lyf/k;", "l", "oldIndex", "newIndex", "c0", "(Lyf/a$c;II)V", "a0", "(Lyf/a$c;)Z", "f", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "timeout", "m0", "(J)V", "block", "Lyf/l;", "taskContext", "q", "(Ljava/lang/Runnable;Lyf/l;Z)V", "i", "(Ljava/lang/Runnable;Lyf/l;)Lyf/k;", "H0", "", "toString", "()Ljava/lang/String;", "k0", "(Lyf/k;)V", "O", "I", "corePoolSize", "maxPoolSize", "J", "idleWorkerKeepAliveNs", "R", "Ljava/lang/String;", "schedulerName", "Lyf/f;", "S", "Lyf/f;", "globalCpuQueue", "T", "globalBlockingQueue", "Lwf/m0;", "U", "Lwf/m0;", "workers", "A", "createdWorkers", "w", "availableCpuPermits", "isTerminated", "<init>", "(IIJLjava/lang/String;)V", "V", "a", "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class a implements Executor, Closeable {
    @g
    public static final C0492a V = new C0492a((w) null);
    public static final /* synthetic */ AtomicLongFieldUpdater W = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
    public static final /* synthetic */ AtomicLongFieldUpdater X = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
    @g
    @e
    public static final r0 Z = new r0("NOT_IN_STACK");

    /* renamed from: a0  reason: collision with root package name */
    public static final int f24770a0 = -1;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f24771b0 = 0;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f24772c0 = 1;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f24773d0 = 21;

    /* renamed from: e0  reason: collision with root package name */
    public static final long f24774e0 = 2097151;

    /* renamed from: f0  reason: collision with root package name */
    public static final long f24775f0 = 4398044413952L;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f24776g0 = 42;

    /* renamed from: h0  reason: collision with root package name */
    public static final long f24777h0 = 9223367638808264704L;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f24778i0 = 1;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f24779j0 = 2097150;

    /* renamed from: k0  reason: collision with root package name */
    public static final long f24780k0 = 2097151;

    /* renamed from: l0  reason: collision with root package name */
    public static final long f24781l0 = -2097152;

    /* renamed from: m0  reason: collision with root package name */
    public static final long f24782m0 = 2097152;
    @e
    public final int O;
    @e
    public final int P;
    @e
    public final long Q;
    @g
    @e
    public final String R;
    @g
    @e
    public final f S;
    @g
    @e
    public final f T;
    @g
    @e
    public final m0<c> U;
    @g
    private volatile /* synthetic */ int _isTerminated;
    @g
    public volatile /* synthetic */ long controlState;
    @g
    private volatile /* synthetic */ long parkedWorkersStack;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, d2 = {"Lyf/a$a;", "", "", "BLOCKING_MASK", "J", "", "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lwf/r0;", "NOT_IN_STACK", "Lwf/r0;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: yf.a$a  reason: collision with other inner class name */
    public static final class C0492a {
        public C0492a() {
        }

        public /* synthetic */ C0492a(w wVar) {
            this();
        }
    }

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24783a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f24783a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bJ\u0010KB\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\n¢\u0006\u0004\bJ\u0010LJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\tJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u001cJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0011J\u0011\u0010#\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\u0011R*\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u001cR\u0014\u00100\u001a\u00020-8\u0006X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0016\u0010@\u001a\u0002048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u00106R\u0016\u0010B\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010)R\u0016\u0010E\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0012\u0010I\u001a\u00020F8Æ\u0002¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006M"}, d2 = {"Lyf/a$c;", "Ljava/lang/Thread;", "Lyf/a$d;", "newState", "", "t", "(Lyf/a$d;)Z", "Lzd/u2;", "run", "()V", "", "upperBound", "l", "(I)I", "scanLocalQueue", "Lyf/k;", "f", "(Z)Lyf/k;", "r", "()Z", "o", "s", "k", "task", "d", "(Lyf/k;)V", "taskMode", "c", "(I)V", "b", "m", "v", "mode", "j", "e", "n", "()Lyf/k;", "blockingOnly", "u", "index", "indexInArray", "I", "g", "()I", "p", "Lyf/q;", "O", "Lyf/q;", "localQueue", "P", "Lyf/a$d;", "state", "", "Q", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "q", "(Ljava/lang/Object;)V", "R", "minDelayUntilStealableTaskNs", "S", "rngState", "T", "Z", "mayHaveLocalTasks", "Lyf/a;", "i", "()Lyf/a;", "scheduler", "<init>", "(Lyf/a;)V", "(Lyf/a;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class c extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater V = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        @g
        @e
        public final q O;
        @g
        @e
        public d P;
        public long Q;
        public long R;
        public int S;
        @e
        public boolean T;
        private volatile int indexInArray;
        @h
        private volatile Object nextParkedWorker;
        @g
        public volatile /* synthetic */ int workerCtl;

        public c() {
            setDaemon(true);
            this.O = new q();
            this.P = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.Z;
            this.S = f.O.l();
        }

        public c(a aVar, int i10) {
            this();
            p(i10);
        }

        public final void b(int i10) {
            if (i10 != 0) {
                a.X.addAndGet(a.this, a.f24781l0);
                if (this.P != d.TERMINATED) {
                    this.P = d.DORMANT;
                }
            }
        }

        public final void c(int i10) {
            if (i10 != 0 && t(d.BLOCKING)) {
                a.this.H0();
            }
        }

        public final void d(k kVar) {
            int H0 = kVar.P.H0();
            j(H0);
            c(H0);
            a.this.k0(kVar);
            b(H0);
        }

        public final k e(boolean z10) {
            k n10;
            k n11;
            if (z10) {
                boolean z11 = l(a.this.O * 2) == 0;
                if (z11 && (n11 = n()) != null) {
                    return n11;
                }
                k h10 = this.O.h();
                if (h10 != null) {
                    return h10;
                }
                if (!z11 && (n10 = n()) != null) {
                    return n10;
                }
            } else {
                k n12 = n();
                if (n12 != null) {
                    return n12;
                }
            }
            return u(false);
        }

        @h
        public final k f(boolean z10) {
            k kVar;
            if (r()) {
                return e(z10);
            }
            if (!z10 || (kVar = this.O.h()) == null) {
                kVar = (k) a.this.T.g();
            }
            return kVar == null ? u(true) : kVar;
        }

        public final int g() {
            return this.indexInArray;
        }

        @h
        public final Object h() {
            return this.nextParkedWorker;
        }

        @g
        public final a i() {
            return a.this;
        }

        public final void j(int i10) {
            this.Q = 0;
            if (this.P == d.PARKING) {
                this.P = d.BLOCKING;
            }
        }

        public final boolean k() {
            return this.nextParkedWorker != a.Z;
        }

        public final int l(int i10) {
            int i11 = this.S;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.S = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void m() {
            if (this.Q == 0) {
                this.Q = System.nanoTime() + a.this.Q;
            }
            LockSupport.parkNanos(a.this.Q);
            if (System.nanoTime() - this.Q >= 0) {
                this.Q = 0;
                v();
            }
        }

        public final k n() {
            f fVar;
            if (l(2) == 0) {
                k kVar = (k) a.this.S.g();
                if (kVar != null) {
                    return kVar;
                }
                fVar = a.this.T;
            } else {
                k kVar2 = (k) a.this.T.g();
                if (kVar2 != null) {
                    return kVar2;
                }
                fVar = a.this.S;
            }
            return (k) fVar.g();
        }

        public final void o() {
            loop0:
            while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.P != d.TERMINATED) {
                    k f10 = f(this.T);
                    if (f10 != null) {
                        this.R = 0;
                        d(f10);
                    } else {
                        this.T = false;
                        if (this.R == 0) {
                            s();
                        } else if (!z10) {
                            z10 = true;
                        } else {
                            t(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.R);
                            this.R = 0;
                        }
                    }
                }
            }
            t(d.TERMINATED);
        }

        public final void p(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.R);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void q(@h Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r() {
            boolean z10;
            if (this.P != d.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j10 = aVar.controlState;
                    if (((int) ((a.f24777h0 & j10) >> 42)) != 0) {
                        if (a.X.compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    return false;
                }
                this.P = d.CPU_ACQUIRED;
            }
            return true;
        }

        public void run() {
            o();
        }

        public final void s() {
            if (!k()) {
                a.this.a0(this);
                return;
            }
            this.workerCtl = -1;
            while (k() && this.workerCtl == -1 && !a.this.isTerminated() && this.P != d.TERMINATED) {
                t(d.PARKING);
                Thread.interrupted();
                m();
            }
        }

        public final boolean t(@g d dVar) {
            d dVar2 = this.P;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.X.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.P = dVar;
            }
            return z10;
        }

        public final k u(boolean z10) {
            int i10 = (int) (a.this.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int l10 = l(i10);
            a aVar = a.this;
            long j10 = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                l10++;
                if (l10 > i10) {
                    l10 = 1;
                }
                c b10 = aVar.U.b(l10);
                if (!(b10 == null || b10 == this)) {
                    q qVar = this.O;
                    q qVar2 = b10.O;
                    long k10 = z10 ? qVar.k(qVar2) : qVar.l(qVar2);
                    if (k10 == -1) {
                        return this.O.h();
                    }
                    if (k10 > 0) {
                        j10 = Math.min(j10, k10);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.R = j10;
            return null;
        }

        public final void v() {
            a aVar = a.this;
            synchronized (aVar.U) {
                if (!aVar.isTerminated()) {
                    if (((int) (aVar.controlState & 2097151)) > aVar.O) {
                        if (V.compareAndSet(this, -1, 1)) {
                            int i10 = this.indexInArray;
                            p(0);
                            aVar.c0(this, i10, 0);
                            int andDecrement = (int) (a.X.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != i10) {
                                c b10 = aVar.U.b(andDecrement);
                                l0.m(b10);
                                c cVar = b10;
                                aVar.U.c(i10, cVar);
                                cVar.p(i10);
                                aVar.c0(cVar, andDecrement, i10);
                            }
                            aVar.U.c(andDecrement, null);
                            u2 u2Var = u2.f25116a;
                            this.P = d.TERMINATED;
                        }
                    }
                }
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lyf/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i10, int i11, long j10, @g String str) {
        this.O = i10;
        this.P = i11;
        this.Q = j10;
        this.R = str;
        boolean z10 = true;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j10 <= 0 ? false : z10) {
                        this.S = new f();
                        this.T = new f();
                        this.parkedWorkersStack = 0;
                        this.U = new m0<>(i10 + 1);
                        this.controlState = ((long) i10) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11, long j10, String str, int i12, w wVar) {
        this(i10, i11, (i12 & 4) != 0 ? o.f24789e : j10, (i12 & 8) != 0 ? o.f24785a : str);
    }

    public static /* synthetic */ boolean Z0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = aVar.controlState;
        }
        return aVar.X0(j10);
    }

    public static /* synthetic */ void t(a aVar, Runnable runnable, l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = o.f24793i;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.q(runnable, lVar, z10);
    }

    public final int A() {
        return (int) (this.controlState & 2097151);
    }

    public final void H0() {
        if (!f1() && !Z0(this, 0, 1, (Object) null)) {
            f1();
        }
    }

    public final long N() {
        return X.addAndGet(this, 2097152);
    }

    public final int P() {
        return (int) (X.incrementAndGet(this) & 2097151);
    }

    public final int Q(c cVar) {
        int g10;
        do {
            Object h10 = cVar.h();
            if (h10 == Z) {
                return -1;
            }
            if (h10 == null) {
                return 0;
            }
            cVar = (c) h10;
            g10 = cVar.g();
        } while (g10 == 0);
        return g10;
    }

    public final k T0(c cVar, k kVar, boolean z10) {
        if (cVar == null || cVar.P == d.TERMINATED) {
            return kVar;
        }
        if (kVar.P.H0() == 0 && cVar.P == d.BLOCKING) {
            return kVar;
        }
        cVar.T = true;
        return cVar.O.a(kVar, z10);
    }

    public final boolean W0() {
        long j10;
        do {
            j10 = this.controlState;
            if (((int) ((f24777h0 & j10) >> 42)) == 0) {
                return false;
            }
        } while (!X.compareAndSet(this, j10, j10 - 4398046511104L));
        return true;
    }

    public final boolean X0(long j10) {
        if (v.u(((int) (2097151 & j10)) - ((int) ((j10 & f24775f0) >> 21)), 0) < this.O) {
            int h10 = h();
            if (h10 == 1 && this.O > 1) {
                h();
            }
            if (h10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final c Y() {
        while (true) {
            long j10 = this.parkedWorkersStack;
            c b10 = this.U.b((int) (2097151 & j10));
            if (b10 == null) {
                return null;
            }
            long j11 = (2097152 + j10) & f24781l0;
            int Q2 = Q(b10);
            if (Q2 >= 0) {
                if (W.compareAndSet(this, j10, ((long) Q2) | j11)) {
                    b10.q(Z);
                    return b10;
                }
            }
        }
    }

    public final boolean a0(@g c cVar) {
        long j10;
        long j11;
        int g10;
        if (cVar.h() != Z) {
            return false;
        }
        do {
            j10 = this.parkedWorkersStack;
            j11 = (2097152 + j10) & f24781l0;
            g10 = cVar.g();
            cVar.q(this.U.b((int) (2097151 & j10)));
        } while (!W.compareAndSet(this, j10, j11 | ((long) g10)));
        return true;
    }

    public final boolean c(k kVar) {
        boolean z10 = true;
        if (kVar.P.H0() != 1) {
            z10 = false;
        }
        return (z10 ? this.T : this.S).a(kVar);
    }

    public final void c0(@g c cVar, int i10, int i11) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & f24781l0;
            if (i12 == i10) {
                i12 = i11 == 0 ? Q(cVar) : i11;
            }
            if (i12 >= 0) {
                if (W.compareAndSet(this, j10, j11 | ((long) i12))) {
                    return;
                }
            }
        }
    }

    public void close() {
        m0(10000);
    }

    public final long e0() {
        return X.addAndGet(this, 4398046511104L);
    }

    public void execute(@g Runnable runnable) {
        t(this, runnable, (l) null, false, 6, (Object) null);
    }

    public final int f(long j10) {
        return (int) ((j10 & f24777h0) >> 42);
    }

    public final boolean f1() {
        c Y2;
        do {
            Y2 = Y();
            if (Y2 == null) {
                return false;
            }
        } while (!c.V.compareAndSet(Y2, -1, 0));
        LockSupport.unpark(Y2);
        return true;
    }

    public final int g(long j10) {
        return (int) ((j10 & f24775f0) >> 21);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int h() {
        /*
            r10 = this;
            wf.m0<yf.a$c> r0 = r10.U
            monitor-enter(r0)
            boolean r1 = r10.isTerminated()     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x000c
            r1 = -1
        L_0x000a:
            monitor-exit(r0)
            return r1
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x007a }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x007a }
            r6 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r6
            r6 = 21
            long r1 = r1 >> r6
            int r1 = (int) r1     // Catch:{ all -> 0x007a }
            int r1 = r5 - r1
            r2 = 0
            int r1 = gf.v.u(r1, r2)     // Catch:{ all -> 0x007a }
            int r6 = r10.O     // Catch:{ all -> 0x007a }
            if (r1 < r6) goto L_0x002b
            monitor-exit(r0)
            return r2
        L_0x002b:
            int r6 = r10.P     // Catch:{ all -> 0x007a }
            if (r5 < r6) goto L_0x0031
            monitor-exit(r0)
            return r2
        L_0x0031:
            long r5 = r10.controlState     // Catch:{ all -> 0x007a }
            long r5 = r5 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x007a }
            r6 = 1
            int r5 = r5 + r6
            if (r5 <= 0) goto L_0x0043
            wf.m0<yf.a$c> r7 = r10.U     // Catch:{ all -> 0x007a }
            java.lang.Object r7 = r7.b(r5)     // Catch:{ all -> 0x007a }
            if (r7 != 0) goto L_0x0043
            r7 = r6
            goto L_0x0044
        L_0x0043:
            r7 = r2
        L_0x0044:
            if (r7 == 0) goto L_0x006e
            yf.a$c r7 = new yf.a$c     // Catch:{ all -> 0x007a }
            r7.<init>(r10, r5)     // Catch:{ all -> 0x007a }
            wf.m0<yf.a$c> r8 = r10.U     // Catch:{ all -> 0x007a }
            r8.c(r5, r7)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = X     // Catch:{ all -> 0x007a }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x007a }
            long r3 = r3 & r8
            int r3 = (int) r3     // Catch:{ all -> 0x007a }
            if (r5 != r3) goto L_0x005b
            r2 = r6
        L_0x005b:
            if (r2 == 0) goto L_0x0062
            r7.start()     // Catch:{ all -> 0x007a }
            int r1 = r1 + r6
            goto L_0x000a
        L_0x0062:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x006e:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x007a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.a.h():int");
    }

    @g
    public final k i(@g Runnable runnable, @g l lVar) {
        long a10 = o.f24790f.a();
        if (!(runnable instanceof k)) {
            return new n(runnable, a10, lVar);
        }
        k kVar = (k) runnable;
        kVar.O = a10;
        kVar.P = lVar;
        return kVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final int k(long j10) {
        return (int) (j10 & 2097151);
    }

    public final void k0(@g k kVar) {
        pf.b b10;
        try {
            kVar.run();
            b10 = pf.c.b();
            if (b10 == null) {
                return;
            }
        } catch (Throwable th2) {
            pf.b b11 = pf.c.b();
            if (b11 != null) {
                b11.f();
            }
            throw th2;
        }
        b10.f();
    }

    public final c l() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !l0.g(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void m() {
        X.addAndGet(this, f24781l0);
    }

    public final void m0(long j10) {
        int i10;
        k kVar;
        if (Y.compareAndSet(this, 0, 1)) {
            c l10 = l();
            synchronized (this.U) {
                i10 = (int) (this.controlState & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c b10 = this.U.b(i11);
                    l0.m(b10);
                    c cVar = b10;
                    if (cVar != l10) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.O.g(this.T);
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            this.T.b();
            this.S.b();
            while (true) {
                if (l10 != null) {
                    kVar = l10.f(true);
                    if (kVar != null) {
                        continue;
                        k0(kVar);
                    }
                }
                kVar = (k) this.S.g();
                if (kVar == null && (kVar = (k) this.T.g()) == null) {
                    break;
                }
                k0(kVar);
            }
            if (l10 != null) {
                l10.t(d.TERMINATED);
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    public final int o() {
        return (int) (X.getAndDecrement(this) & 2097151);
    }

    public final void q(@g Runnable runnable, @g l lVar, boolean z10) {
        pf.b b10 = pf.c.b();
        if (b10 != null) {
            b10.e();
        }
        k i10 = i(runnable, lVar);
        c l10 = l();
        k T0 = T0(l10, i10, z10);
        if (T0 == null || c(T0)) {
            boolean z11 = z10 && l10 != null;
            if (i10.P.H0() != 0) {
                z0(z11);
            } else if (!z11) {
                H0();
            }
        } else {
            throw new RejectedExecutionException(this.R + " was terminated");
        }
    }

    @g
    public String toString() {
        char c10;
        StringBuilder sb2;
        ArrayList arrayList = new ArrayList();
        int a10 = this.U.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c b10 = this.U.b(i15);
            if (b10 != null) {
                int f10 = b10.O.f();
                int i16 = b.f24783a[b10.P.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        i11++;
                        sb2 = new StringBuilder();
                        sb2.append(f10);
                        c10 = 'b';
                    } else if (i16 == 3) {
                        i10++;
                        sb2 = new StringBuilder();
                        sb2.append(f10);
                        c10 = 'c';
                    } else if (i16 == 4) {
                        i13++;
                        if (f10 > 0) {
                            sb2 = new StringBuilder();
                            sb2.append(f10);
                            c10 = 'd';
                        }
                    } else if (i16 == 5) {
                        i14++;
                    }
                    sb2.append(c10);
                    arrayList.add(sb2.toString());
                } else {
                    i12++;
                }
            }
        }
        long j10 = this.controlState;
        return this.R + '@' + z0.b(this) + "[Pool Size {core = " + this.O + ", max = " + this.P + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.S.c() + ", global blocking queue size = " + this.T.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((f24775f0 & j10) >> 21)) + ", CPUs acquired = " + (this.O - ((int) ((f24777h0 & j10) >> 42))) + "}]";
    }

    public final int w() {
        return (int) ((this.controlState & f24777h0) >> 42);
    }

    public final void z0(boolean z10) {
        long addAndGet = X.addAndGet(this, 2097152);
        if (!z10 && !f1() && !X0(addAndGet)) {
            f1();
        }
    }
}

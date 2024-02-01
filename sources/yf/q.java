package yf;

import fh.g;
import fh.h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import tf.b;
import zd.f1;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u0015\u0010\u001d\u001a\u00020\u0011*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010%\u001a\u00020\"8@X\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8@X\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, d2 = {"Lyf/q;", "", "Lyf/k;", "h", "()Lyf/k;", "task", "", "fair", "a", "(Lyf/k;Z)Lyf/k;", "victim", "", "l", "(Lyf/q;)J", "k", "Lyf/f;", "globalQueue", "Lzd/u2;", "g", "(Lyf/f;)V", "c", "(Lyf/k;)Lyf/k;", "blockingOnly", "m", "(Lyf/q;Z)J", "queue", "j", "(Lyf/f;)Z", "i", "d", "(Lyf/k;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "", "e", "()I", "bufferSize", "f", "size", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class q {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24795b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24796c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24797d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24798e;
    @g

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<k> f24799a = new AtomicReferenceArray<>(128);
    @g
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    @g
    private volatile /* synthetic */ int consumerIndex = 0;
    @g
    private volatile /* synthetic */ Object lastScheduledTask = null;
    @g
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<q> cls = q.class;
        f24795b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f24796c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f24797d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f24798e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public static /* synthetic */ k b(q qVar, k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return qVar.a(kVar, z10);
    }

    @h
    public final k a(@g k kVar, boolean z10) {
        if (z10) {
            return c(kVar);
        }
        k kVar2 = (k) f24795b.getAndSet(this, kVar);
        if (kVar2 == null) {
            return null;
        }
        return c(kVar2);
    }

    public final k c(k kVar) {
        boolean z10 = true;
        if (kVar.P.H0() != 1) {
            z10 = false;
        }
        if (z10) {
            f24798e.incrementAndGet(this);
        }
        if (e() == 127) {
            return kVar;
        }
        int i10 = this.producerIndex & 127;
        while (this.f24799a.get(i10) != null) {
            Thread.yield();
        }
        this.f24799a.lazySet(i10, kVar);
        f24796c.incrementAndGet(this);
        return null;
    }

    public final void d(k kVar) {
        if (kVar != null) {
            boolean z10 = true;
            if (kVar.P.H0() != 1) {
                z10 = false;
            }
            if (z10) {
                f24798e.decrementAndGet(this);
            }
        }
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(@g f fVar) {
        k kVar = (k) f24795b.getAndSet(this, (Object) null);
        if (kVar != null) {
            fVar.a(kVar);
        }
        do {
        } while (j(fVar));
    }

    @h
    public final k h() {
        k kVar = (k) f24795b.getAndSet(this, (Object) null);
        return kVar == null ? i() : kVar;
    }

    public final k i() {
        k andSet;
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f24797d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f24799a.getAndSet(i11, (Object) null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    public final boolean j(f fVar) {
        k i10 = i();
        if (i10 == null) {
            return false;
        }
        fVar.a(i10);
        return true;
    }

    public final long k(@g q qVar) {
        int i10 = qVar.consumerIndex;
        int i11 = qVar.producerIndex;
        AtomicReferenceArray<k> atomicReferenceArray = qVar.f24799a;
        while (true) {
            boolean z10 = true;
            if (i10 == i11) {
                break;
            }
            int i12 = i10 & 127;
            if (qVar.blockingTasksInBuffer == 0) {
                break;
            }
            k kVar = atomicReferenceArray.get(i12);
            if (kVar != null) {
                if (kVar.P.H0() != 1) {
                    z10 = false;
                }
                if (z10 && b.a(atomicReferenceArray, i12, kVar, (Object) null)) {
                    f24798e.decrementAndGet(qVar);
                    b(this, kVar, false, 2, (Object) null);
                    return -1;
                }
            }
            i10++;
        }
        return m(qVar, true);
    }

    public final long l(@g q qVar) {
        k i10 = qVar.i();
        if (i10 == null) {
            return m(qVar, false);
        }
        b(this, i10, false, 2, (Object) null);
        return -1;
    }

    public final long m(q qVar, boolean z10) {
        k kVar;
        do {
            kVar = (k) qVar.lastScheduledTask;
            if (kVar == null) {
                return -2;
            }
            if (z10) {
                boolean z11 = true;
                if (kVar.P.H0() != 1) {
                    z11 = false;
                }
                if (!z11) {
                    return -2;
                }
            }
            long a10 = o.f24790f.a() - kVar.O;
            long j10 = o.f24786b;
            if (a10 < j10) {
                return j10 - a10;
            }
        } while (!f1.a(f24795b, qVar, kVar, (Object) null));
        b(this, kVar, false, 2, (Object) null);
        return -1;
    }
}

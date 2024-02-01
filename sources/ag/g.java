package ag;

import fh.h;
import ie.d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ke.c;
import kotlin.Metadata;
import n7.b;
import pf.q;
import pf.r;
import pf.t;
import we.l;
import wf.o0;
import wf.p0;
import xe.n0;
import zd.f1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007J\u001d\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lag/g;", "Lag/f;", "", "d", "()Z", "Lzd/u2;", "c", "(Lie/d;)Ljava/lang/Object;", "a", "()V", "h", "Lpf/q;", "cont", "i", "(Lpf/q;)Z", "k", "j", "", "I", "permits", "Lkotlin/Function1;", "", "b", "Lwe/l;", "onCancellationRelease", "()I", "availablePermits", "acquiredPermits", "<init>", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class g implements f {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16096c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16097d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16098e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16099f;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16100g;
    @fh.g
    public volatile /* synthetic */ int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    public final int f16101a;
    @fh.g

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, u2> f16102b;
    @fh.g
    private volatile /* synthetic */ long deqIdx = 0;
    @fh.g
    private volatile /* synthetic */ long enqIdx = 0;
    @fh.g
    private volatile /* synthetic */ Object head;
    @fh.g
    private volatile /* synthetic */ Object tail;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lzd/u2;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends n0 implements l<Throwable, u2> {
        public final /* synthetic */ g P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar) {
            super(1);
            this.P = gVar;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Throwable) obj);
            return u2.f25116a;
        }

        public final void c(@fh.g Throwable th2) {
            this.P.a();
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<g> cls2 = g.class;
        f16096c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, b.f10946n);
        f16097d = AtomicLongFieldUpdater.newUpdater(cls2, "deqIdx");
        f16098e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "tail");
        f16099f = AtomicLongFieldUpdater.newUpdater(cls2, "enqIdx");
        f16100g = AtomicIntegerFieldUpdater.newUpdater(cls2, "_availablePermits");
    }

    public g(int i10, int i11) {
        this.f16101a = i10;
        boolean z10 = true;
        if (i10 > 0) {
            if ((i11 < 0 || i11 > i10) ? false : z10) {
                i iVar = new i(0, (i) null, 2);
                this.head = iVar;
                this.tail = iVar;
                this._availablePermits = i10 - i11;
                this.f16102b = new a(this);
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
    }

    public void a() {
        while (true) {
            int i10 = this._availablePermits;
            if (i10 < this.f16101a) {
                if (f16100g.compareAndSet(this, i10, i10 + 1) && (i10 >= 0 || k())) {
                    return;
                }
            } else {
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f16101a).toString());
            }
        }
    }

    public int b() {
        return Math.max(this._availablePermits, 0);
    }

    @h
    public Object c(@fh.g d<? super u2> dVar) {
        if (f16100g.getAndDecrement(this) > 0) {
            return u2.f25116a;
        }
        Object h10 = h(dVar);
        return h10 == ke.d.h() ? h10 : u2.f25116a;
    }

    public boolean d() {
        int i10;
        do {
            i10 = this._availablePermits;
            if (i10 <= 0) {
                return false;
            }
        } while (!f16100g.compareAndSet(this, i10, i10 - 1));
        return true;
    }

    public final Object h(d<? super u2> dVar) {
        r<? super u2> b10 = t.b(c.d(dVar));
        while (true) {
            if (!i(b10)) {
                if (f16100g.getAndDecrement(this) > 0) {
                    b10.B(u2.f25116a, this.f16102b);
                    break;
                }
            } else {
                break;
            }
        }
        Object z10 = b10.z();
        if (z10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return z10 == ke.d.h() ? z10 : u2.f25116a;
    }

    public final boolean i(q<? super u2> qVar) {
        o0 o0Var;
        Object b10;
        boolean z10;
        o0 o0Var2;
        o0 o0Var3 = (i) this.tail;
        long andIncrement = f16099f.getAndIncrement(this);
        long h10 = andIncrement / ((long) h.f16108f);
        do {
            o0 o0Var4 = o0Var3;
            while (true) {
                if (o0Var4.o() >= h10 && !o0Var4.g()) {
                    o0Var = o0Var4;
                    break;
                }
                Object a10 = o0Var4.e();
                if (a10 == wf.g.f24101b) {
                    o0Var = wf.g.f24101b;
                    break;
                }
                o0 o0Var5 = (o0) ((wf.h) a10);
                if (o0Var5 == null) {
                    o0Var5 = h.j(o0Var4.o() + 1, (i) o0Var4);
                    if (!o0Var4.m(o0Var5)) {
                        o0Var2 = o0Var4;
                        o0Var4 = o0Var2;
                    } else if (o0Var4.g()) {
                        o0Var4.l();
                    }
                }
                o0Var2 = o0Var5;
                o0Var4 = o0Var2;
            }
            b10 = p0.b(o0Var);
            if (p0.h(b10)) {
                break;
            }
            o0 f10 = p0.f(b10);
            while (true) {
                o0 o0Var6 = (o0) this.tail;
                if (o0Var6.o() >= f10.o()) {
                    break;
                } else if (!f10.r()) {
                    z10 = false;
                    continue;
                    break;
                } else if (f1.a(f16098e, this, o0Var6, f10)) {
                    if (o0Var6.n()) {
                        o0Var6.l();
                    }
                } else if (f10.n()) {
                    f10.l();
                }
            }
            z10 = true;
            continue;
        } while (!z10);
        i iVar = (i) p0.f(b10);
        int h11 = (int) (andIncrement % ((long) h.f16108f));
        if (tf.b.a(iVar.f16109e, h11, (Object) null, qVar)) {
            qVar.T(new a(iVar, h11));
            return true;
        }
        if (!tf.b.a(iVar.f16109e, h11, h.f16104b, h.f16105c)) {
            return false;
        }
        qVar.B(u2.f25116a, this.f16102b);
        return true;
    }

    public final boolean j(q<? super u2> qVar) {
        Object p10 = qVar.p(u2.f25116a, (Object) null, this.f16102b);
        if (p10 == null) {
            return false;
        }
        qVar.t0(p10);
        return true;
    }

    public final boolean k() {
        o0 o0Var;
        Object b10;
        int i10;
        boolean z10;
        o0 o0Var2;
        o0 o0Var3 = (i) this.head;
        long andIncrement = f16097d.getAndIncrement(this);
        long h10 = andIncrement / ((long) h.f16108f);
        do {
            o0 o0Var4 = o0Var3;
            while (true) {
                if (o0Var4.o() >= h10 && !o0Var4.g()) {
                    o0Var = o0Var4;
                    break;
                }
                Object a10 = o0Var4.e();
                if (a10 == wf.g.f24101b) {
                    o0Var = wf.g.f24101b;
                    break;
                }
                o0 o0Var5 = (o0) ((wf.h) a10);
                if (o0Var5 == null) {
                    o0Var5 = h.j(o0Var4.o() + 1, (i) o0Var4);
                    if (!o0Var4.m(o0Var5)) {
                        o0Var2 = o0Var4;
                        o0Var4 = o0Var2;
                    } else if (o0Var4.g()) {
                        o0Var4.l();
                    }
                }
                o0Var2 = o0Var5;
                o0Var4 = o0Var2;
            }
            b10 = p0.b(o0Var);
            if (p0.h(b10)) {
                break;
            }
            o0 f10 = p0.f(b10);
            while (true) {
                o0 o0Var6 = (o0) this.head;
                if (o0Var6.o() >= f10.o()) {
                    break;
                } else if (!f10.r()) {
                    z10 = false;
                    continue;
                    break;
                } else if (f1.a(f16096c, this, o0Var6, f10)) {
                    if (o0Var6.n()) {
                        o0Var6.l();
                    }
                } else if (f10.n()) {
                    f10.l();
                }
            }
            z10 = true;
            continue;
        } while (!z10);
        i iVar = (i) p0.f(b10);
        iVar.b();
        if (iVar.o() > h10) {
            return false;
        }
        int h11 = (int) (andIncrement % ((long) h.f16108f));
        Object andSet = iVar.f16109e.getAndSet(h11, h.f16104b);
        if (andSet == null) {
            int f11 = h.f16103a;
            for (i10 = 0; i10 < f11; i10++) {
                if (iVar.f16109e.get(h11) == h.f16105c) {
                    return true;
                }
            }
            return !tf.b.a(iVar.f16109e, h11, h.f16104b, h.f16106d);
        } else if (andSet == h.f16107e) {
            return false;
        } else {
            return j((q) andSet);
        }
    }
}

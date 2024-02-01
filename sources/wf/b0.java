package wf;

import fh.g;
import fh.h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import ve.e;
import we.l;
import we.p;
import xe.w;
import zd.f1;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0013\b\u0000\u0018\u0000 \u0017*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\b#B\u0017\u0012\u0006\u0010%\u001a\u00020\u0007\u0012\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b.\u0010/J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0001\u0010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0005J3\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00162\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00162\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00162\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00162\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010'\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0011\u0010*\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b)\u0010\u0005R\u0011\u0010-\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lwf/b0;", "", "E", "", "d", "()Z", "element", "", "a", "(Ljava/lang/Object;)I", "l", "()Ljava/lang/Object;", "k", "()Lwf/b0;", "R", "Lkotlin/Function1;", "transform", "", "i", "(Lwe/l;)Ljava/util/List;", "g", "index", "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Lwf/b0;", "oldHead", "newHead", "m", "(II)Lwf/b0;", "", "j", "()J", "state", "c", "(J)Lwf/b0;", "b", "I", "capacity", "Z", "singleConsumer", "mask", "h", "isEmpty", "f", "()I", "size", "<init>", "(IZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class b0<E> {
    @g

    /* renamed from: e  reason: collision with root package name */
    public static final a f24058e = new a((w) null);

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24059f;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f24060g;

    /* renamed from: h  reason: collision with root package name */
    public static final int f24061h = 8;

    /* renamed from: i  reason: collision with root package name */
    public static final int f24062i = 30;

    /* renamed from: j  reason: collision with root package name */
    public static final int f24063j = 1073741823;

    /* renamed from: k  reason: collision with root package name */
    public static final int f24064k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final long f24065l = 1073741823;

    /* renamed from: m  reason: collision with root package name */
    public static final int f24066m = 30;

    /* renamed from: n  reason: collision with root package name */
    public static final long f24067n = 1152921503533105152L;

    /* renamed from: o  reason: collision with root package name */
    public static final int f24068o = 60;

    /* renamed from: p  reason: collision with root package name */
    public static final long f24069p = 1152921504606846976L;

    /* renamed from: q  reason: collision with root package name */
    public static final int f24070q = 61;

    /* renamed from: r  reason: collision with root package name */
    public static final long f24071r = 2305843009213693952L;

    /* renamed from: s  reason: collision with root package name */
    public static final int f24072s = 1024;
    @g
    @e

    /* renamed from: t  reason: collision with root package name */
    public static final r0 f24073t = new r0("REMOVE_FROZEN");

    /* renamed from: u  reason: collision with root package name */
    public static final int f24074u = 0;

    /* renamed from: v  reason: collision with root package name */
    public static final int f24075v = 1;

    /* renamed from: w  reason: collision with root package name */
    public static final int f24076w = 2;
    @g
    private volatile /* synthetic */ Object _next = null;
    @g
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f24077a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f24078b;

    /* renamed from: c  reason: collision with root package name */
    public final int f24079c;
    @g

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f24080d;

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0004J\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005JR\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0001\u0010\n*\u00020\u000226\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00010\u000bH\b¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0002R\u0014\u0010\u0014\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010$\u001a\u00020#8\u0006X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b'\u0010\u0015¨\u0006*"}, d2 = {"Lwf/b0$a;", "", "", "other", "e", "", "newHead", "b", "newTail", "c", "T", "Lkotlin/Function2;", "Lzd/v0;", "name", "head", "tail", "block", "d", "(JLwe/p;)Ljava/lang/Object;", "a", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lwf/r0;", "REMOVE_FROZEN", "Lwf/r0;", "TAIL_MASK", "TAIL_SHIFT", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        public final int a(long j10) {
            return (j10 & b0.f24071r) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return e(j10, b0.f24065l) | (((long) i10) << 0);
        }

        public final long c(long j10, int i10) {
            return e(j10, b0.f24067n) | (((long) i10) << 30);
        }

        public final <T> T d(long j10, @g p<? super Integer, ? super Integer, ? extends T> pVar) {
            return pVar.g0(Integer.valueOf((int) ((b0.f24065l & j10) >> 0)), Integer.valueOf((int) ((j10 & b0.f24067n) >> 30)));
        }

        public final long e(long j10, long j11) {
            return j10 & (~j11);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lwf/b0$b;", "", "", "a", "I", "index", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b {
        @e

        /* renamed from: a  reason: collision with root package name */
        public final int f24081a;

        public b(int i10) {
            this.f24081a = i10;
        }
    }

    static {
        Class<b0> cls = b0.class;
        f24059f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f24060g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public b0(int i10, boolean z10) {
        this.f24077a = i10;
        this.f24078b = z10;
        int i11 = i10 - 1;
        this.f24079c = i11;
        this.f24080d = new AtomicReferenceArray(i10);
        boolean z11 = false;
        if (i11 <= 1073741823) {
            if (!((i10 & i11) == 0 ? true : z11)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068 A[LOOP:1: B:19:0x0068->B:22:0x0079, LOOP_START, PHI: r0 
      PHI: (r0v13 wf.b0) = (r0v12 wf.b0), (r0v15 wf.b0) binds: [B:18:0x0060, B:22:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(@fh.g E r13) {
        /*
            r12 = this;
        L_0x0000:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            wf.b0$a r13 = f24058e
            int r13 = r13.a(r2)
            return r13
        L_0x0012:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r8 = 0
            long r0 = r0 >> r8
            int r0 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r1 = 30
            long r4 = r4 >> r1
            int r9 = (int) r4
            int r10 = r12.f24079c
            int r1 = r9 + 2
            r1 = r1 & r10
            r4 = r0 & r10
            r5 = 1
            if (r1 != r4) goto L_0x002e
            return r5
        L_0x002e:
            boolean r1 = r12.f24078b
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r12.f24080d
            r11 = r9 & r10
            java.lang.Object r1 = r1.get(r11)
            if (r1 == 0) goto L_0x004d
            int r1 = r12.f24077a
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 < r2) goto L_0x004c
            int r9 = r9 - r0
            r0 = r9 & r4
            int r1 = r1 >> 1
            if (r0 <= r1) goto L_0x0000
        L_0x004c:
            return r5
        L_0x004d:
            int r0 = r9 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f24060g
            wf.b0$a r4 = f24058e
            long r4 = r4.c(r2, r0)
            r0 = r1
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f24080d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L_0x0068:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x007b
            wf.b0 r0 = r0.k()
            wf.b0 r0 = r0.e(r9, r13)
            if (r0 != 0) goto L_0x0068
        L_0x007b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.b0.a(java.lang.Object):int");
    }

    public final b0<E> b(long j10) {
        b0<E> b0Var = new b0<>(this.f24077a * 2, this.f24078b);
        int i10 = (int) ((f24065l & j10) >> 0);
        int i11 = (int) ((f24067n & j10) >> 30);
        while (true) {
            int i12 = this.f24079c;
            if ((i10 & i12) != (i11 & i12)) {
                Object obj = this.f24080d.get(i12 & i10);
                if (obj == null) {
                    obj = new b(i10);
                }
                b0Var.f24080d.set(b0Var.f24079c & i10, obj);
                i10++;
            } else {
                b0Var._state = f24058e.e(j10, f24069p);
                return b0Var;
            }
        }
    }

    public final b0<E> c(long j10) {
        while (true) {
            b0<E> b0Var = (b0) this._next;
            if (b0Var != null) {
                return b0Var;
            }
            f1.a(f24059f, this, (Object) null, b(j10));
        }
    }

    public final boolean d() {
        long j10;
        do {
            j10 = this._state;
            if ((j10 & f24071r) != 0) {
                return true;
            }
            if ((f24069p & j10) != 0) {
                return false;
            }
        } while (!f24060g.compareAndSet(this, j10, j10 | f24071r));
        return true;
    }

    public final b0<E> e(int i10, E e10) {
        Object obj = this.f24080d.get(this.f24079c & i10);
        if (!(obj instanceof b) || ((b) obj).f24081a != i10) {
            return null;
        }
        this.f24080d.set(i10 & this.f24079c, e10);
        return this;
    }

    public final int f() {
        long j10 = this._state;
        return (((int) ((j10 & f24067n) >> 30)) - ((int) ((f24065l & j10) >> 0))) & f24063j;
    }

    public final boolean g() {
        return (this._state & f24071r) != 0;
    }

    public final boolean h() {
        long j10 = this._state;
        return ((int) ((f24065l & j10) >> 0)) == ((int) ((j10 & f24067n) >> 30));
    }

    @g
    public final <R> List<R> i(@g l<? super E, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(this.f24077a);
        long j10 = this._state;
        int i10 = (int) ((f24065l & j10) >> 0);
        int i11 = (int) ((j10 & f24067n) >> 30);
        while (true) {
            int i12 = this.f24079c;
            if ((i10 & i12) == (i11 & i12)) {
                return arrayList;
            }
            Object obj = this.f24080d.get(i12 & i10);
            if (obj != null && !(obj instanceof b)) {
                arrayList.add(lVar.A(obj));
            }
            i10++;
        }
    }

    public final long j() {
        long j10;
        long j11;
        do {
            j10 = this._state;
            if ((j10 & f24069p) != 0) {
                return j10;
            }
            j11 = j10 | f24069p;
        } while (!f24060g.compareAndSet(this, j10, j11));
        return j11;
    }

    @g
    public final b0<E> k() {
        return c(j());
    }

    @h
    public final Object l() {
        while (true) {
            long j10 = this._state;
            if ((f24069p & j10) != 0) {
                return f24073t;
            }
            int i10 = (int) ((f24065l & j10) >> 0);
            int i11 = this.f24079c;
            if ((((int) ((f24067n & j10) >> 30)) & i11) == (i10 & i11)) {
                return null;
            }
            Object obj = this.f24080d.get(i11 & i10);
            if (obj == null) {
                if (this.f24078b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i12 = (i10 + 1) & f24063j;
                if (f24060g.compareAndSet(this, j10, f24058e.b(j10, i12))) {
                    this.f24080d.set(this.f24079c & i10, (Object) null);
                    return obj;
                } else if (this.f24078b) {
                    b0 b0Var = this;
                    do {
                        b0Var = b0Var.m(i10, i12);
                    } while (b0Var != null);
                    return obj;
                }
            }
        }
    }

    public final b0<E> m(int i10, int i11) {
        long j10;
        int i12;
        do {
            j10 = this._state;
            i12 = (int) ((f24065l & j10) >> 0);
            if ((f24069p & j10) != 0) {
                return k();
            }
        } while (!f24060g.compareAndSet(this, j10, f24058e.b(j10, i11)));
        this.f24080d.set(i12 & this.f24079c, (Object) null);
        return null;
    }
}

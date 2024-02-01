package rf;

import be.o;
import fh.g;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import rf.c;
import we.l;
import wf.d1;
import wf.r0;
import wf.y;
import xe.l0;
import zd.i0;
import zd.j0;
import zd.u2;
import zf.f;

@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010'\u001a\u00020\u001c\u0012\u0006\u0010+\u001a\u00020(\u0012 \u0010I\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0019\u0018\u00010Gj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`H¢\u0006\u0004\bJ\u0010KJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u00100\u001a\u00060,j\u0002`-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u0010&R\u0014\u00109\u001a\u00020\u00158DX\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00158DX\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010=\u001a\u00020\u00158DX\u0004¢\u0006\u0006\u001a\u0004\b<\u00108R\u0014\u0010?\u001a\u00020\u00158DX\u0004¢\u0006\u0006\u001a\u0004\b>\u00108R\u0014\u0010@\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b@\u00108R\u0014\u0010B\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\bA\u00108R\u0014\u0010F\u001a\u00020C8TX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006L"}, d2 = {"Lrf/h;", "E", "Lrf/a;", "element", "", "N", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lzf/f;", "select", "O", "(Ljava/lang/Object;Lzf/f;)Ljava/lang/Object;", "Lrf/l0;", "send", "o", "(Lrf/l0;)Ljava/lang/Object;", "m0", "()Ljava/lang/Object;", "n0", "(Lzf/f;)Ljava/lang/Object;", "Lrf/h0;", "receive", "", "c0", "(Lrf/h0;)Z", "wasClosed", "Lzd/u2;", "i0", "(Z)V", "", "currentSize", "Lwf/r0;", "u0", "(I)Lwf/r0;", "s0", "(ILjava/lang/Object;)V", "t0", "(I)V", "R", "I", "capacity", "Lrf/m;", "S", "Lrf/m;", "onBufferOverflow", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "T", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "U", "[Ljava/lang/Object;", "buffer", "V", "head", "f0", "()Z", "isBufferAlwaysEmpty", "g0", "isBufferEmpty", "F", "isBufferAlwaysFull", "H", "isBufferFull", "isEmpty", "b", "isClosedForReceive", "", "p", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILrf/m;Lwe/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class h<E> extends a<E> {
    public final int R;
    @g
    public final m S;
    @g
    public final ReentrantLock T;
    @g
    public Object[] U;
    public int V;
    @g
    private volatile /* synthetic */ int size;

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22530a;

        static {
            int[] iArr = new int[m.values().length];
            iArr[m.SUSPEND.ordinal()] = 1;
            iArr[m.DROP_LATEST.ordinal()] = 2;
            iArr[m.DROP_OLDEST.ordinal()] = 3;
            f22530a = iArr;
        }
    }

    public h(int i10, @g m mVar, @fh.h l<? super E, u2> lVar) {
        super(lVar);
        this.R = i10;
        this.S = mVar;
        if (i10 < 1 ? false : true) {
            this.T = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i10, 8)];
            o.w2(objArr, b.f22522c, 0, 0, 6, (Object) null);
            this.U = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    public final boolean F() {
        return false;
    }

    public final boolean H() {
        return this.size == this.R && this.S == m.SUSPEND;
    }

    /* JADX INFO: finally extract failed */
    @g
    public Object N(E e10) {
        j0 T2;
        ReentrantLock reentrantLock = this.T;
        reentrantLock.lock();
        int i10 = this.size;
        w<?> r10 = r();
        if (r10 != null) {
            reentrantLock.unlock();
            return r10;
        }
        r0 u02 = u0(i10);
        if (u02 != null) {
            reentrantLock.unlock();
            return u02;
        }
        if (i10 == 0) {
            do {
                try {
                    T2 = T();
                    if (T2 != null) {
                        if (T2 instanceof w) {
                            this.size = i10;
                            reentrantLock.unlock();
                            return T2;
                        }
                        l0.m(T2);
                    }
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            } while (T2.k(e10, (y.d) null) == null);
            this.size = i10;
            u2 u2Var = u2.f25116a;
            reentrantLock.unlock();
            T2.f0(e10);
            return T2.w();
        }
        s0(i10, e10);
        r0 r0Var = b.f22523d;
        reentrantLock.unlock();
        return r0Var;
    }

    @g
    public Object O(E e10, @g f<?> fVar) {
        Object q02;
        ReentrantLock reentrantLock = this.T;
        reentrantLock.lock();
        int i10 = this.size;
        w<?> r10 = r();
        if (r10 != null) {
            reentrantLock.unlock();
            return r10;
        }
        r0 u02 = u0(i10);
        if (u02 != null) {
            reentrantLock.unlock();
            return u02;
        }
        if (i10 == 0) {
            do {
                try {
                    c.d m10 = m(e10);
                    q02 = fVar.q0(m10);
                    if (q02 == null) {
                        this.size = i10;
                        Object o10 = m10.o();
                        u2 u2Var = u2.f25116a;
                        reentrantLock.unlock();
                        l0.m(o10);
                        j0 j0Var = (j0) o10;
                        j0Var.f0(e10);
                        return j0Var.w();
                    } else if (q02 != b.f22524e) {
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } while (q02 == wf.c.f24083b);
            if (q02 != zf.g.d()) {
                if (!(q02 instanceof w)) {
                    throw new IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + q02).toString());
                }
            }
            this.size = i10;
            return q02;
        }
        if (!fVar.F()) {
            this.size = i10;
            Object d10 = zf.g.d();
            reentrantLock.unlock();
            return d10;
        }
        s0(i10, e10);
        r0 r0Var = b.f22523d;
        reentrantLock.unlock();
        return r0Var;
    }

    public boolean b() {
        ReentrantLock reentrantLock = this.T;
        reentrantLock.lock();
        try {
            return super.b();
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean c0(@g h0<? super E> h0Var) {
        ReentrantLock reentrantLock = this.T;
        reentrantLock.lock();
        try {
            return super.c0(h0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean f0() {
        return false;
    }

    public final boolean g0() {
        return this.size == 0;
    }

    /* JADX INFO: finally extract failed */
    public void i0(boolean z10) {
        l<E, u2> lVar = this.O;
        ReentrantLock reentrantLock = this.T;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            d1 d1Var = null;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = this.U[this.V];
                if (!(lVar == null || obj == b.f22522c)) {
                    d1Var = wf.i0.c(lVar, obj, d1Var);
                }
                Object[] objArr = this.U;
                int i12 = this.V;
                objArr[i12] = b.f22522c;
                this.V = (i12 + 1) % objArr.length;
            }
            this.size = 0;
            u2 u2Var = u2.f25116a;
            reentrantLock.unlock();
            super.i0(z10);
            if (d1Var != null) {
                throw d1Var;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.T;
        reentrantLock.lock();
        try {
            return h0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @fh.h
    public Object m0() {
        ReentrantLock reentrantLock = this.T;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            if (i10 == 0) {
                Object r10 = r();
                if (r10 == null) {
                    r10 = b.f22525f;
                }
                return r10;
            }
            Object[] objArr = this.U;
            int i11 = this.V;
            Object obj = objArr[i11];
            l0 l0Var = null;
            objArr[i11] = null;
            this.size = i10 - 1;
            Object obj2 = b.f22525f;
            boolean z10 = false;
            if (i10 == this.R) {
                l0 l0Var2 = null;
                while (true) {
                    l0 U2 = U();
                    if (U2 == null) {
                        l0Var = l0Var2;
                        break;
                    }
                    l0.m(U2);
                    if (U2.a1((y.d) null) != null) {
                        obj2 = U2.Y0();
                        z10 = true;
                        l0Var = U2;
                        break;
                    }
                    U2.b1();
                    l0Var2 = U2;
                }
            }
            if (obj2 != b.f22525f && !(obj2 instanceof w)) {
                this.size = i10;
                Object[] objArr2 = this.U;
                objArr2[(this.V + i10) % objArr2.length] = obj2;
            }
            this.V = (this.V + 1) % this.U.length;
            u2 u2Var = u2.f25116a;
            reentrantLock.unlock();
            if (z10) {
                l0.m(l0Var);
                l0Var.X0();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r7 != zf.g.d()) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r8.size = r1;
        r8.U[r8.V] = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        r0.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        if ((r7 instanceof rf.w) == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        r3 = true;
        r2 = r7;
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        throw new java.lang.IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + r7).toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0089 A[Catch:{ all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095 A[Catch:{ all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object n0(@fh.g zf.f<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.T
            r0.lock()
            int r1 = r8.size     // Catch:{ all -> 0x00c4 }
            if (r1 != 0) goto L_0x0015
            rf.w r9 = r8.r()     // Catch:{ all -> 0x00c4 }
            if (r9 != 0) goto L_0x0011
            wf.r0 r9 = rf.b.f22525f     // Catch:{ all -> 0x00c4 }
        L_0x0011:
            r0.unlock()
            return r9
        L_0x0015:
            java.lang.Object[] r2 = r8.U     // Catch:{ all -> 0x00c4 }
            int r3 = r8.V     // Catch:{ all -> 0x00c4 }
            r4 = r2[r3]     // Catch:{ all -> 0x00c4 }
            r5 = 0
            r2[r3] = r5     // Catch:{ all -> 0x00c4 }
            int r2 = r1 + -1
            r8.size = r2     // Catch:{ all -> 0x00c4 }
            wf.r0 r2 = rf.b.f22525f     // Catch:{ all -> 0x00c4 }
            int r3 = r8.R     // Catch:{ all -> 0x00c4 }
            r6 = 1
            if (r1 != r3) goto L_0x0080
        L_0x0029:
            rf.a$g r3 = r8.a0()     // Catch:{ all -> 0x00c4 }
            java.lang.Object r7 = r9.q0(r3)     // Catch:{ all -> 0x00c4 }
            if (r7 != 0) goto L_0x0043
            java.lang.Object r5 = r3.o()     // Catch:{ all -> 0x00c4 }
            xe.l0.m(r5)     // Catch:{ all -> 0x00c4 }
            r2 = r5
            rf.l0 r2 = (rf.l0) r2     // Catch:{ all -> 0x00c4 }
            java.lang.Object r2 = r2.Y0()     // Catch:{ all -> 0x00c4 }
            r3 = r6
            goto L_0x0081
        L_0x0043:
            wf.r0 r3 = rf.b.f22525f     // Catch:{ all -> 0x00c4 }
            if (r7 == r3) goto L_0x0080
            java.lang.Object r3 = wf.c.f24083b     // Catch:{ all -> 0x00c4 }
            if (r7 == r3) goto L_0x0029
            java.lang.Object r2 = zf.g.d()     // Catch:{ all -> 0x00c4 }
            if (r7 != r2) goto L_0x005d
            r8.size = r1     // Catch:{ all -> 0x00c4 }
            java.lang.Object[] r9 = r8.U     // Catch:{ all -> 0x00c4 }
            int r1 = r8.V     // Catch:{ all -> 0x00c4 }
            r9[r1] = r4     // Catch:{ all -> 0x00c4 }
            r0.unlock()
            return r7
        L_0x005d:
            boolean r2 = r7 instanceof rf.w     // Catch:{ all -> 0x00c4 }
            if (r2 == 0) goto L_0x0065
            r3 = r6
            r2 = r7
            r5 = r2
            goto L_0x0081
        L_0x0065:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r1.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = "performAtomicTrySelect(describeTryOffer) returned "
            r1.append(r2)     // Catch:{ all -> 0x00c4 }
            r1.append(r7)     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00c4 }
            r9.<init>(r1)     // Catch:{ all -> 0x00c4 }
            throw r9     // Catch:{ all -> 0x00c4 }
        L_0x0080:
            r3 = 0
        L_0x0081:
            wf.r0 r7 = rf.b.f22525f     // Catch:{ all -> 0x00c4 }
            if (r2 == r7) goto L_0x0095
            boolean r7 = r2 instanceof rf.w     // Catch:{ all -> 0x00c4 }
            if (r7 != 0) goto L_0x0095
            r8.size = r1     // Catch:{ all -> 0x00c4 }
            java.lang.Object[] r9 = r8.U     // Catch:{ all -> 0x00c4 }
            int r7 = r8.V     // Catch:{ all -> 0x00c4 }
            int r7 = r7 + r1
            int r1 = r9.length     // Catch:{ all -> 0x00c4 }
            int r7 = r7 % r1
            r9[r7] = r2     // Catch:{ all -> 0x00c4 }
            goto L_0x00ab
        L_0x0095:
            boolean r9 = r9.F()     // Catch:{ all -> 0x00c4 }
            if (r9 != 0) goto L_0x00ab
            r8.size = r1     // Catch:{ all -> 0x00c4 }
            java.lang.Object[] r9 = r8.U     // Catch:{ all -> 0x00c4 }
            int r1 = r8.V     // Catch:{ all -> 0x00c4 }
            r9[r1] = r4     // Catch:{ all -> 0x00c4 }
            java.lang.Object r9 = zf.g.d()     // Catch:{ all -> 0x00c4 }
            r0.unlock()
            return r9
        L_0x00ab:
            int r9 = r8.V     // Catch:{ all -> 0x00c4 }
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.U     // Catch:{ all -> 0x00c4 }
            int r1 = r1.length     // Catch:{ all -> 0x00c4 }
            int r9 = r9 % r1
            r8.V = r9     // Catch:{ all -> 0x00c4 }
            zd.u2 r9 = zd.u2.f25116a     // Catch:{ all -> 0x00c4 }
            r0.unlock()
            if (r3 == 0) goto L_0x00c3
            xe.l0.m(r5)
            rf.l0 r5 = (rf.l0) r5
            r5.X0()
        L_0x00c3:
            return r4
        L_0x00c4:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.h.n0(zf.f):java.lang.Object");
    }

    @fh.h
    public Object o(@g l0 l0Var) {
        ReentrantLock reentrantLock = this.T;
        reentrantLock.lock();
        try {
            return super.o(l0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @g
    public String p() {
        return "(buffer:capacity=" + this.R + ",size=" + this.size + ')';
    }

    public final void s0(int i10, E e10) {
        if (i10 < this.R) {
            t0(i10);
            Object[] objArr = this.U;
            objArr[(this.V + i10) % objArr.length] = e10;
            return;
        }
        Object[] objArr2 = this.U;
        int i11 = this.V;
        objArr2[i11 % objArr2.length] = null;
        objArr2[(i10 + i11) % objArr2.length] = e10;
        this.V = (i11 + 1) % objArr2.length;
    }

    public final void t0(int i10) {
        Object[] objArr = this.U;
        if (i10 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.R);
            Object[] objArr2 = new Object[min];
            for (int i11 = 0; i11 < i10; i11++) {
                Object[] objArr3 = this.U;
                objArr2[i11] = objArr3[(this.V + i11) % objArr3.length];
            }
            o.n2(objArr2, b.f22522c, i10, min);
            this.U = objArr2;
            this.V = 0;
        }
    }

    public final r0 u0(int i10) {
        if (i10 < this.R) {
            this.size = i10 + 1;
            return null;
        }
        int i11 = a.f22530a[this.S.ordinal()];
        if (i11 == 1) {
            return b.f22524e;
        }
        if (i11 == 2) {
            return b.f22523d;
        }
        if (i11 == 3) {
            return null;
        }
        throw new j0();
    }
}

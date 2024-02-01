package vf;

import be.p0;
import fh.g;
import fh.h;
import ie.d;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import le.f;
import le.o;
import pf.c0;
import pf.u0;
import pf.v0;
import rf.g0;
import rf.m0;
import rf.n;
import uf.i;
import uf.j;
import we.l;
import we.p;
import we.q;
import xe.n0;
import zd.a1;
import zd.e1;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0001\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000629\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ap\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015*\u001c\b\u0002\u0010\u0017\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00162\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"R", "T", "Luf/j;", "", "Luf/i;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lie/d;", "Lzd/u2;", "", "Lzd/u;", "transform", "a", "(Luf/j;[Luf/i;Lwe/a;Lwe/q;Lie/d;)Ljava/lang/Object;", "T1", "T2", "flow", "flow2", "b", "(Luf/i;Luf/i;Lwe/q;)Luf/i;", "Lbe/p0;", "Update", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class m {

    @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {57, 79, 82}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, d2 = {"R", "T", "Lpf/u0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a extends o implements p<u0, d<? super u2>, Object> {
        public Object S;
        public Object T;
        public int U;
        public int V;
        public int W;
        public /* synthetic */ Object X;
        public final /* synthetic */ i<T>[] Y;
        public final /* synthetic */ we.a<T[]> Z;

        /* renamed from: a0  reason: collision with root package name */
        public final /* synthetic */ q<j<? super R>, T[], d<? super u2>, Object> f23628a0;

        /* renamed from: b0  reason: collision with root package name */
        public final /* synthetic */ j<R> f23629b0;

        @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, d2 = {"R", "T", "Lpf/u0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: vf.m$a$a  reason: collision with other inner class name */
        public static final class C0459a extends o implements p<u0, d<? super u2>, Object> {
            public int S;
            public final /* synthetic */ i<T>[] T;
            public final /* synthetic */ int U;
            public final /* synthetic */ AtomicInteger V;
            public final /* synthetic */ n<p0<Object>> W;

            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "T", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
            /* renamed from: vf.m$a$a$a  reason: collision with other inner class name */
            public static final class C0460a<T> implements j {
                public final /* synthetic */ n<p0<Object>> O;
                public final /* synthetic */ int P;

                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {35, 36}, m = "emit", n = {}, s = {})
                @i0(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: vf.m$a$a$a$a  reason: collision with other inner class name */
                public static final class C0461a extends le.d {
                    public /* synthetic */ Object R;
                    public final /* synthetic */ C0460a<T> S;
                    public int T;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0461a(C0460a<? super T> aVar, d<? super C0461a> dVar) {
                        super(dVar);
                        this.S = aVar;
                    }

                    @h
                    public final Object K(@g Object obj) {
                        this.R = obj;
                        this.T |= Integer.MIN_VALUE;
                        return this.S.d(null, this);
                    }
                }

                public C0460a(n<p0<Object>> nVar, int i10) {
                    this.O = nVar;
                    this.P = i10;
                }

                /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                @fh.h
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object d(T r7, @fh.g ie.d<? super zd.u2> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof vf.m.a.C0459a.C0460a.C0461a
                        if (r0 == 0) goto L_0x0013
                        r0 = r8
                        vf.m$a$a$a$a r0 = (vf.m.a.C0459a.C0460a.C0461a) r0
                        int r1 = r0.T
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.T = r1
                        goto L_0x0018
                    L_0x0013:
                        vf.m$a$a$a$a r0 = new vf.m$a$a$a$a
                        r0.<init>(r6, r8)
                    L_0x0018:
                        java.lang.Object r8 = r0.R
                        java.lang.Object r1 = ke.d.h()
                        int r2 = r0.T
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L_0x0038
                        if (r2 == r4) goto L_0x0034
                        if (r2 != r3) goto L_0x002c
                        zd.e1.n(r8)
                        goto L_0x0056
                    L_0x002c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L_0x0034:
                        zd.e1.n(r8)
                        goto L_0x004d
                    L_0x0038:
                        zd.e1.n(r8)
                        rf.n<be.p0<java.lang.Object>> r8 = r6.O
                        be.p0 r2 = new be.p0
                        int r5 = r6.P
                        r2.<init>(r5, r7)
                        r0.T = r4
                        java.lang.Object r7 = r8.C(r2, r0)
                        if (r7 != r1) goto L_0x004d
                        return r1
                    L_0x004d:
                        r0.T = r3
                        java.lang.Object r7 = pf.f4.a(r0)
                        if (r7 != r1) goto L_0x0056
                        return r1
                    L_0x0056:
                        zd.u2 r7 = zd.u2.f25116a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: vf.m.a.C0459a.C0460a.d(java.lang.Object, ie.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0459a(i<? extends T>[] iVarArr, int i10, AtomicInteger atomicInteger, n<p0<Object>> nVar, d<? super C0459a> dVar) {
                super(2, dVar);
                this.T = iVarArr;
                this.U = i10;
                this.V = atomicInteger;
                this.W = nVar;
            }

            @g
            public final d<u2> H(@h Object obj, @g d<?> dVar) {
                return new C0459a(this.T, this.U, this.V, this.W, dVar);
            }

            @h
            public final Object K(@g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    i<T>[] iVarArr = this.T;
                    int i11 = this.U;
                    i<T> iVar = iVarArr[i11];
                    C0460a aVar = new C0460a(this.W, i11);
                    this.S = 1;
                    if (iVar.a(aVar, this) == h10) {
                        return h10;
                    }
                } else if (i10 == 1) {
                    try {
                        e1.n(obj);
                    } catch (Throwable th2) {
                        if (this.V.decrementAndGet() == 0) {
                            m0.a.a(this.W, (Throwable) null, 1, (Object) null);
                        }
                        throw th2;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (this.V.decrementAndGet() == 0) {
                    m0.a.a(this.W, (Throwable) null, 1, (Object) null);
                }
                return u2.f25116a;
            }

            @h
            /* renamed from: P */
            public final Object g0(@g u0 u0Var, @h d<? super u2> dVar) {
                return ((C0459a) H(u0Var, dVar)).K(u2.f25116a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i<? extends T>[] iVarArr, we.a<T[]> aVar, q<? super j<? super R>, ? super T[], ? super d<? super u2>, ? extends Object> qVar, j<? super R> jVar, d<? super a> dVar) {
            super(2, dVar);
            this.Y = iVarArr;
            this.Z = aVar;
            this.f23628a0 = qVar;
            this.f23629b0 = jVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            a aVar = new a(this.Y, this.Z, this.f23628a0, this.f23629b0, dVar);
            aVar.X = obj;
            return aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ec A[LOOP:1: B:26:0x00ec->B:32:0x010f, LOOP_START, PHI: r3 r10 
          PHI: (r3v3 int) = (r3v2 int), (r3v4 int) binds: [B:23:0x00e7, B:32:0x010f] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v3 be.p0) = (r10v2 be.p0), (r10v16 be.p0) binds: [B:23:0x00e7, B:32:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r24) {
            /*
                r23 = this;
                r0 = r23
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.W
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L_0x0076
                if (r2 == r6) goto L_0x0052
                if (r2 == r5) goto L_0x0037
                if (r2 != r4) goto L_0x002f
                int r2 = r0.V
                int r3 = r0.U
                java.lang.Object r7 = r0.T
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.S
                rf.n r8 = (rf.n) r8
                java.lang.Object r9 = r0.X
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                zd.e1.n(r24)
                r13 = r3
                r14 = r9
                r3 = r2
                r2 = r7
                r7 = r8
                r8 = r0
                goto L_0x0165
            L_0x002f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0037:
                int r2 = r0.V
                int r3 = r0.U
                java.lang.Object r7 = r0.T
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.S
                rf.n r8 = (rf.n) r8
                java.lang.Object r9 = r0.X
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                zd.e1.n(r24)
                r13 = r3
                r14 = r9
                r3 = r2
                r2 = r7
                r7 = r8
                r8 = r0
                goto L_0x00c7
            L_0x0052:
                int r2 = r0.V
                int r3 = r0.U
                java.lang.Object r7 = r0.T
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.S
                rf.n r8 = (rf.n) r8
                java.lang.Object r9 = r0.X
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                zd.e1.n(r24)
                r10 = r24
                rf.r r10 = (rf.r) r10
                java.lang.Object r10 = r10.o()
                r15 = r9
                r9 = r0
                r22 = r7
                r7 = r2
                r2 = r22
                goto L_0x00e1
            L_0x0076:
                zd.e1.n(r24)
                java.lang.Object r2 = r0.X
                pf.u0 r2 = (pf.u0) r2
                uf.i<T>[] r7 = r0.Y
                int r13 = r7.length
                if (r13 != 0) goto L_0x0085
                zd.u2 r1 = zd.u2.f25116a
                return r1
            L_0x0085:
                java.lang.Object[] r14 = new java.lang.Object[r13]
                wf.r0 r8 = vf.u.f23631b
                r9 = 0
                r10 = 0
                r11 = 6
                r12 = 0
                r7 = r14
                be.o.w2(r7, r8, r9, r10, r11, r12)
                r7 = 6
                r8 = 0
                rf.n r21 = rf.q.d(r13, r8, r8, r7, r8)
                java.util.concurrent.atomic.AtomicInteger r12 = new java.util.concurrent.atomic.AtomicInteger
                r12.<init>(r13)
                r11 = r3
            L_0x009d:
                if (r11 >= r13) goto L_0x00c2
                r8 = 0
                r9 = 0
                vf.m$a$a r10 = new vf.m$a$a
                uf.i<T>[] r7 = r0.Y
                r20 = 0
                r15 = r10
                r16 = r7
                r17 = r11
                r18 = r12
                r19 = r21
                r15.<init>(r16, r17, r18, r19, r20)
                r15 = 3
                r16 = 0
                r7 = r2
                r11 = r15
                r15 = r12
                r12 = r16
                pf.n2 unused = pf.l.f(r7, r8, r9, r10, r11, r12)
                int r11 = r17 + 1
                r12 = r15
                goto L_0x009d
            L_0x00c2:
                byte[] r2 = new byte[r13]
                r8 = r0
                r7 = r21
            L_0x00c7:
                int r3 = r3 + r6
                byte r3 = (byte) r3
                r8.X = r14
                r8.S = r7
                r8.T = r2
                r8.U = r13
                r8.V = r3
                r8.W = r6
                java.lang.Object r10 = r7.v(r8)
                if (r10 != r1) goto L_0x00dc
                return r1
            L_0x00dc:
                r9 = r8
                r15 = r14
                r8 = r7
                r7 = r3
                r3 = r13
            L_0x00e1:
                java.lang.Object r10 = rf.r.h(r10)
                be.p0 r10 = (be.p0) r10
                if (r10 != 0) goto L_0x00ec
                zd.u2 r1 = zd.u2.f25116a
                return r1
            L_0x00ec:
                int r11 = r10.e()
                r12 = r15[r11]
                java.lang.Object r10 = r10.f()
                r15[r11] = r10
                wf.r0 r10 = vf.u.f23631b
                if (r12 != r10) goto L_0x00fe
                int r3 = r3 + -1
            L_0x00fe:
                byte r10 = r2[r11]
                if (r10 == r7) goto L_0x0111
                byte r10 = (byte) r7
                r2[r11] = r10
                java.lang.Object r10 = r8.z()
                java.lang.Object r10 = rf.r.h(r10)
                be.p0 r10 = (be.p0) r10
                if (r10 != 0) goto L_0x00ec
            L_0x0111:
                if (r3 != 0) goto L_0x0168
                we.a<T[]> r10 = r9.Z
                java.lang.Object r10 = r10.n()
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                if (r10 != 0) goto L_0x013a
                we.q<uf.j<? super R>, T[], ie.d<? super zd.u2>, java.lang.Object> r10 = r9.f23628a0
                uf.j<R> r11 = r9.f23629b0
                r9.X = r15
                r9.S = r8
                r9.T = r2
                r9.U = r3
                r9.V = r7
                r9.W = r5
                java.lang.Object r10 = r10.y(r11, r15, r9)
                if (r10 != r1) goto L_0x0134
                return r1
            L_0x0134:
                r13 = r3
                r3 = r7
                r7 = r8
                r8 = r9
                r14 = r15
                goto L_0x00c7
            L_0x013a:
                r13 = 0
                r14 = 0
                r16 = 0
                r17 = 14
                r18 = 0
                r11 = r15
                r12 = r10
                r5 = r15
                r15 = r16
                r16 = r17
                r17 = r18
                be.o.l1(r11, r12, r13, r14, r15, r16, r17)
                we.q<uf.j<? super R>, T[], ie.d<? super zd.u2>, java.lang.Object> r11 = r9.f23628a0
                uf.j<R> r12 = r9.f23629b0
                r9.X = r5
                r9.S = r8
                r9.T = r2
                r9.U = r3
                r9.V = r7
                r9.W = r4
                java.lang.Object r10 = r11.y(r12, r10, r9)
                if (r10 != r1) goto L_0x0169
                return r1
            L_0x0165:
                r5 = 2
                goto L_0x00c7
            L_0x0168:
                r5 = r15
            L_0x0169:
                r13 = r3
                r14 = r5
                r3 = r7
                r7 = r8
                r8 = r9
                goto L_0x0165
            */
            throw new UnsupportedOperationException("Method not decompiled: vf.m.a.K(java.lang.Object):java.lang.Object");
        }

        @h
        /* renamed from: P */
        public final Object g0(@g u0 u0Var, @h d<? super u2> dVar) {
            return ((a) H(u0Var, dVar)).K(u2.f25116a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b implements i<R> {
        public final /* synthetic */ i O;
        public final /* synthetic */ i P;
        public final /* synthetic */ q Q;

        public b(i iVar, i iVar2, q qVar) {
            this.O = iVar;
            this.P = iVar2;
            this.Q = qVar;
        }

        @h
        public Object a(@g j<? super R> jVar, @g d<? super u2> dVar) {
            Object g10 = v0.g(new c(jVar, this.O, this.P, this.Q, (d<? super c>) null), dVar);
            return g10 == ke.d.h() ? g10 : u2.f25116a;
        }
    }

    @f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {129}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H@"}, d2 = {"T1", "T2", "R", "Lpf/u0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class c extends o implements p<u0, d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ j<R> U;
        public final /* synthetic */ i<T2> V;
        public final /* synthetic */ i<T1> W;
        public final /* synthetic */ q<T1, T2, d<? super R>, Object> X;

        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T1", "T2", "R", "", "it", "Lzd/u2;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
        public static final class a extends n0 implements l<Throwable, u2> {
            public final /* synthetic */ c0 P;
            public final /* synthetic */ j<R> Q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(c0 c0Var, j<? super R> jVar) {
                super(1);
                this.P = c0Var;
                this.Q = jVar;
            }

            public /* bridge */ /* synthetic */ Object A(Object obj) {
                c((Throwable) obj);
                return u2.f25116a;
            }

            public final void c(@h Throwable th2) {
                if (this.P.c()) {
                    this.P.h(new a(this.Q));
                }
            }
        }

        @f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H@"}, d2 = {"T1", "T2", "R", "Lzd/u2;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class b extends o implements p<u2, d<? super u2>, Object> {
            public int S;
            public final /* synthetic */ i<T1> T;
            public final /* synthetic */ ie.g U;
            public final /* synthetic */ Object V;
            public final /* synthetic */ rf.i0<Object> W;
            public final /* synthetic */ j<R> X;
            public final /* synthetic */ q<T1, T2, d<? super R>, Object> Y;

            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
            public static final class a<T> implements j {
                public final /* synthetic */ ie.g O;
                public final /* synthetic */ Object P;
                public final /* synthetic */ rf.i0<Object> Q;
                public final /* synthetic */ j<R> R;
                public final /* synthetic */ q<T1, T2, d<? super R>, Object> S;

                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {132, 135, 135}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H@"}, d2 = {"T1", "T2", "R", "Lzd/u2;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
                /* renamed from: vf.m$c$b$a$a  reason: collision with other inner class name */
                public static final class C0462a extends o implements p<u2, d<? super u2>, Object> {
                    public Object S;
                    public int T;
                    public final /* synthetic */ rf.i0<Object> U;
                    public final /* synthetic */ j<R> V;
                    public final /* synthetic */ q<T1, T2, d<? super R>, Object> W;
                    public final /* synthetic */ T1 X;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0462a(rf.i0<? extends Object> i0Var, j<? super R> jVar, q<? super T1, ? super T2, ? super d<? super R>, ? extends Object> qVar, T1 t12, d<? super C0462a> dVar) {
                        super(2, dVar);
                        this.U = i0Var;
                        this.V = jVar;
                        this.W = qVar;
                        this.X = t12;
                    }

                    @g
                    public final d<u2> H(@h Object obj, @g d<?> dVar) {
                        return new C0462a(this.U, this.V, this.W, this.X, dVar);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e A[RETURN] */
                    @fh.h
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object K(@fh.g java.lang.Object r9) {
                        /*
                            r8 = this;
                            java.lang.Object r0 = ke.d.h()
                            int r1 = r8.T
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L_0x0030
                            if (r1 == r5) goto L_0x0026
                            if (r1 == r4) goto L_0x001e
                            if (r1 != r3) goto L_0x0016
                            zd.e1.n(r9)
                            goto L_0x006f
                        L_0x0016:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L_0x001e:
                            java.lang.Object r1 = r8.S
                            uf.j r1 = (uf.j) r1
                            zd.e1.n(r9)
                            goto L_0x0064
                        L_0x0026:
                            zd.e1.n(r9)
                            rf.r r9 = (rf.r) r9
                            java.lang.Object r9 = r9.o()
                            goto L_0x003e
                        L_0x0030:
                            zd.e1.n(r9)
                            rf.i0<java.lang.Object> r9 = r8.U
                            r8.T = r5
                            java.lang.Object r9 = r9.v(r8)
                            if (r9 != r0) goto L_0x003e
                            return r0
                        L_0x003e:
                            uf.j<R> r1 = r8.V
                            boolean r5 = r9 instanceof rf.r.c
                            if (r5 == 0) goto L_0x0050
                            java.lang.Throwable r9 = rf.r.f(r9)
                            if (r9 != 0) goto L_0x004f
                            vf.a r9 = new vf.a
                            r9.<init>(r1)
                        L_0x004f:
                            throw r9
                        L_0x0050:
                            we.q<T1, T2, ie.d<? super R>, java.lang.Object> r5 = r8.W
                            T1 r6 = r8.X
                            wf.r0 r7 = vf.u.f23630a
                            if (r9 != r7) goto L_0x0059
                            r9 = r2
                        L_0x0059:
                            r8.S = r1
                            r8.T = r4
                            java.lang.Object r9 = r5.y(r6, r9, r8)
                            if (r9 != r0) goto L_0x0064
                            return r0
                        L_0x0064:
                            r8.S = r2
                            r8.T = r3
                            java.lang.Object r9 = r1.d(r9, r8)
                            if (r9 != r0) goto L_0x006f
                            return r0
                        L_0x006f:
                            zd.u2 r9 = zd.u2.f25116a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: vf.m.c.b.a.C0462a.K(java.lang.Object):java.lang.Object");
                    }

                    @h
                    /* renamed from: P */
                    public final Object g0(@g u2 u2Var, @h d<? super u2> dVar) {
                        return ((C0462a) H(u2Var, dVar)).K(u2.f25116a);
                    }
                }

                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {131}, m = "emit", n = {}, s = {})
                @i0(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: vf.m$c$b$a$b  reason: collision with other inner class name */
                public static final class C0463b extends le.d {
                    public /* synthetic */ Object R;
                    public final /* synthetic */ a<T> S;
                    public int T;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0463b(a<? super T> aVar, d<? super C0463b> dVar) {
                        super(dVar);
                        this.S = aVar;
                    }

                    @h
                    public final Object K(@g Object obj) {
                        this.R = obj;
                        this.T |= Integer.MIN_VALUE;
                        return this.S.d(null, this);
                    }
                }

                public a(ie.g gVar, Object obj, rf.i0<? extends Object> i0Var, j<? super R> jVar, q<? super T1, ? super T2, ? super d<? super R>, ? extends Object> qVar) {
                    this.O = gVar;
                    this.P = obj;
                    this.Q = i0Var;
                    this.R = jVar;
                    this.S = qVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                @fh.h
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object d(T1 r13, @fh.g ie.d<? super zd.u2> r14) {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof vf.m.c.b.a.C0463b
                        if (r0 == 0) goto L_0x0013
                        r0 = r14
                        vf.m$c$b$a$b r0 = (vf.m.c.b.a.C0463b) r0
                        int r1 = r0.T
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.T = r1
                        goto L_0x0018
                    L_0x0013:
                        vf.m$c$b$a$b r0 = new vf.m$c$b$a$b
                        r0.<init>(r12, r14)
                    L_0x0018:
                        java.lang.Object r14 = r0.R
                        java.lang.Object r1 = ke.d.h()
                        int r2 = r0.T
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        zd.e1.n(r14)
                        goto L_0x0051
                    L_0x0029:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        throw r13
                    L_0x0031:
                        zd.e1.n(r14)
                        ie.g r14 = r12.O
                        zd.u2 r2 = zd.u2.f25116a
                        java.lang.Object r4 = r12.P
                        vf.m$c$b$a$a r11 = new vf.m$c$b$a$a
                        rf.i0<java.lang.Object> r6 = r12.Q
                        uf.j<R> r7 = r12.R
                        we.q<T1, T2, ie.d<? super R>, java.lang.Object> r8 = r12.S
                        r10 = 0
                        r5 = r11
                        r9 = r13
                        r5.<init>(r6, r7, r8, r9, r10)
                        r0.T = r3
                        java.lang.Object r13 = vf.f.c(r14, r2, r4, r11, r0)
                        if (r13 != r1) goto L_0x0051
                        return r1
                    L_0x0051:
                        zd.u2 r13 = zd.u2.f25116a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: vf.m.c.b.a.d(java.lang.Object, ie.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(i<? extends T1> iVar, ie.g gVar, Object obj, rf.i0<? extends Object> i0Var, j<? super R> jVar, q<? super T1, ? super T2, ? super d<? super R>, ? extends Object> qVar, d<? super b> dVar) {
                super(2, dVar);
                this.T = iVar;
                this.U = gVar;
                this.V = obj;
                this.W = i0Var;
                this.X = jVar;
                this.Y = qVar;
            }

            @g
            public final d<u2> H(@h Object obj, @g d<?> dVar) {
                return new b(this.T, this.U, this.V, this.W, this.X, this.Y, dVar);
            }

            @h
            public final Object K(@g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    i<T1> iVar = this.T;
                    a aVar = new a(this.U, this.V, this.W, this.X, this.Y);
                    this.S = 1;
                    if (iVar.a(aVar, this) == h10) {
                        return h10;
                    }
                } else if (i10 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return u2.f25116a;
            }

            @h
            /* renamed from: P */
            public final Object g0(@g u2 u2Var, @h d<? super u2> dVar) {
                return ((b) H(u2Var, dVar)).K(u2.f25116a);
            }
        }

        @f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"T1", "T2", "R", "Lrf/g0;", "", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: vf.m$c$c  reason: collision with other inner class name */
        public static final class C0464c extends o implements p<g0<? super Object>, d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public final /* synthetic */ i<T2> U;

            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
            /* renamed from: vf.m$c$c$a */
            public static final class a<T> implements j {
                public final /* synthetic */ g0<Object> O;

                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {93}, m = "emit", n = {}, s = {})
                @i0(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: vf.m$c$c$a$a  reason: collision with other inner class name */
                public static final class C0465a extends le.d {
                    public /* synthetic */ Object R;
                    public final /* synthetic */ a<T> S;
                    public int T;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0465a(a<? super T> aVar, d<? super C0465a> dVar) {
                        super(dVar);
                        this.S = aVar;
                    }

                    @h
                    public final Object K(@g Object obj) {
                        this.R = obj;
                        this.T |= Integer.MIN_VALUE;
                        return this.S.d(null, this);
                    }
                }

                public a(g0<Object> g0Var) {
                    this.O = g0Var;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                @fh.h
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object d(T2 r5, @fh.g ie.d<? super zd.u2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof vf.m.c.C0464c.a.C0465a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        vf.m$c$c$a$a r0 = (vf.m.c.C0464c.a.C0465a) r0
                        int r1 = r0.T
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.T = r1
                        goto L_0x0018
                    L_0x0013:
                        vf.m$c$c$a$a r0 = new vf.m$c$c$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.R
                        java.lang.Object r1 = ke.d.h()
                        int r2 = r0.T
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        zd.e1.n(r6)
                        goto L_0x0047
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        zd.e1.n(r6)
                        rf.g0<java.lang.Object> r6 = r4.O
                        rf.m0 r6 = r6.a()
                        if (r5 != 0) goto L_0x003e
                        wf.r0 r5 = vf.u.f23630a
                    L_0x003e:
                        r0.T = r3
                        java.lang.Object r5 = r6.C(r5, r0)
                        if (r5 != r1) goto L_0x0047
                        return r1
                    L_0x0047:
                        zd.u2 r5 = zd.u2.f25116a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: vf.m.c.C0464c.a.d(java.lang.Object, ie.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0464c(i<? extends T2> iVar, d<? super C0464c> dVar) {
                super(2, dVar);
                this.U = iVar;
            }

            @g
            public final d<u2> H(@h Object obj, @g d<?> dVar) {
                C0464c cVar = new C0464c(this.U, dVar);
                cVar.T = obj;
                return cVar;
            }

            @h
            public final Object K(@g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    i<T2> iVar = this.U;
                    a aVar = new a((g0) this.T);
                    this.S = 1;
                    if (iVar.a(aVar, this) == h10) {
                        return h10;
                    }
                } else if (i10 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return u2.f25116a;
            }

            @h
            /* renamed from: P */
            public final Object g0(@g g0<Object> g0Var, @h d<? super u2> dVar) {
                return ((C0464c) H(g0Var, dVar)).K(u2.f25116a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(j<? super R> jVar, i<? extends T2> iVar, i<? extends T1> iVar2, q<? super T1, ? super T2, ? super d<? super R>, ? extends Object> qVar, d<? super c> dVar) {
            super(2, dVar);
            this.U = jVar;
            this.V = iVar;
            this.W = iVar2;
            this.X = qVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            c cVar = new c(this.U, this.V, this.W, this.X, dVar);
            cVar.T = obj;
            return cVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: rf.i0} */
        /* JADX WARNING: Multi-variable type inference failed */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r20) {
            /*
                r19 = this;
                r8 = r19
                java.lang.Object r0 = ke.d.h()
                int r1 = r8.S
                r9 = 1
                r10 = 0
                if (r1 == 0) goto L_0x0026
                if (r1 != r9) goto L_0x001e
                java.lang.Object r0 = r8.T
                r1 = r0
                rf.i0 r1 = (rf.i0) r1
                zd.e1.n(r20)     // Catch:{ a -> 0x001b }
                goto L_0x0086
            L_0x0018:
                r0 = move-exception
                goto L_0x009e
            L_0x001b:
                r0 = move-exception
                goto L_0x0095
            L_0x001e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0026:
                zd.e1.n(r20)
                java.lang.Object r1 = r8.T
                pf.u0 r1 = (pf.u0) r1
                r3 = 0
                r4 = 0
                vf.m$c$c r5 = new vf.m$c$c
                uf.i<T2> r2 = r8.V
                r5.<init>(r2, r10)
                r6 = 3
                r7 = 0
                r2 = r1
                rf.i0 r7 = rf.e0.h(r2, r3, r4, r5, r6, r7)
                pf.c0 r2 = pf.t2.c(r10, r9, r10)
                r3 = r7
                rf.m0 r3 = (rf.m0) r3
                vf.m$c$a r4 = new vf.m$c$a
                uf.j<R> r5 = r8.U
                r4.<init>(r2, r5)
                r3.n(r4)
                ie.g r13 = r1.H()     // Catch:{ a -> 0x0092, all -> 0x008e }
                java.lang.Object r14 = wf.w0.b(r13)     // Catch:{ a -> 0x0092, all -> 0x008e }
                ie.g r1 = r1.H()     // Catch:{ a -> 0x0092, all -> 0x008e }
                ie.g r1 = r1.m1(r2)     // Catch:{ a -> 0x0092, all -> 0x008e }
                zd.u2 r2 = zd.u2.f25116a     // Catch:{ a -> 0x0092, all -> 0x008e }
                r3 = 0
                vf.m$c$b r4 = new vf.m$c$b     // Catch:{ a -> 0x0092, all -> 0x008e }
                uf.i<T1> r12 = r8.W     // Catch:{ a -> 0x0092, all -> 0x008e }
                uf.j<R> r5 = r8.U     // Catch:{ a -> 0x0092, all -> 0x008e }
                we.q<T1, T2, ie.d<? super R>, java.lang.Object> r6 = r8.X     // Catch:{ a -> 0x0092, all -> 0x008e }
                r18 = 0
                r11 = r4
                r15 = r7
                r16 = r5
                r17 = r6
                r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ a -> 0x0092, all -> 0x008e }
                r6 = 4
                r11 = 0
                r8.T = r7     // Catch:{ a -> 0x0092, all -> 0x008e }
                r8.S = r9     // Catch:{ a -> 0x0092, all -> 0x008e }
                r5 = r19
                r12 = r7
                r7 = r11
                java.lang.Object r1 = vf.f.d(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ a -> 0x008c, all -> 0x008a }
                if (r1 != r0) goto L_0x0085
                return r0
            L_0x0085:
                r1 = r12
            L_0x0086:
                rf.i0.a.b(r1, r10, r9, r10)
                goto L_0x009b
            L_0x008a:
                r0 = move-exception
                goto L_0x0090
            L_0x008c:
                r0 = move-exception
                goto L_0x0094
            L_0x008e:
                r0 = move-exception
                r12 = r7
            L_0x0090:
                r1 = r12
                goto L_0x009e
            L_0x0092:
                r0 = move-exception
                r12 = r7
            L_0x0094:
                r1 = r12
            L_0x0095:
                uf.j<R> r2 = r8.U     // Catch:{ all -> 0x0018 }
                vf.q.b(r0, r2)     // Catch:{ all -> 0x0018 }
                goto L_0x0086
            L_0x009b:
                zd.u2 r0 = zd.u2.f25116a
                return r0
            L_0x009e:
                rf.i0.a.b(r1, r10, r9, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: vf.m.c.K(java.lang.Object):java.lang.Object");
        }

        @h
        /* renamed from: P */
        public final Object g0(@g u0 u0Var, @h d<? super u2> dVar) {
            return ((c) H(u0Var, dVar)).K(u2.f25116a);
        }
    }

    @a1
    @h
    public static final <R, T> Object a(@g j<? super R> jVar, @g i<? extends T>[] iVarArr, @g we.a<T[]> aVar, @g q<? super j<? super R>, ? super T[], ? super d<? super u2>, ? extends Object> qVar, @g d<? super u2> dVar) {
        Object a10 = p.a(new a(iVarArr, aVar, qVar, jVar, (d<? super a>) null), dVar);
        return a10 == ke.d.h() ? a10 : u2.f25116a;
    }

    @g
    public static final <T1, T2, R> i<R> b(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g q<? super T1, ? super T2, ? super d<? super R>, ? extends Object> qVar) {
        return new b(iVar2, iVar, qVar);
    }
}

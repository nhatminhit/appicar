package uf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import le.f;
import le.o;
import pf.d2;
import pf.f1;
import pf.u0;
import rf.e0;
import rf.g0;
import rf.r;
import vf.u;
import we.l;
import we.p;
import we.q;
import xe.k1;
import xe.n0;
import zd.e1;
import zd.i0;
import zd.t0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a2\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0007\u001a3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000f\u001a\u00020\u0002H\u0007\u001a$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002H\u0000\u001a3\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\n\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"T", "Luf/i;", "", "timeoutMillis", "a", "Lkotlin/Function1;", "b", "Lnf/e;", "timeout", "c", "(Luf/i;J)Luf/i;", "d", "(Luf/i;Lwe/l;)Luf/i;", "timeoutMillisSelector", "e", "periodMillis", "h", "Lpf/u0;", "delayMillis", "initialDelayMillis", "Lrf/i0;", "Lzd/u2;", "f", "period", "i", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class r {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "c", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0})
    public static final class a extends n0 implements l<T, Long> {
        public final /* synthetic */ long P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(long j10) {
            super(1);
            this.P = j10;
        }

        @g
        /* renamed from: c */
        public final Long A(T t10) {
            return Long.valueOf(this.P);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "emittedItem", "", "c", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends n0 implements l<T, Long> {
        public final /* synthetic */ l<T, nf.e> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(l<? super T, nf.e> lVar) {
            super(1);
            this.P = lVar;
        }

        @g
        /* renamed from: c */
        public final Long A(T t10) {
            return Long.valueOf(f1.e(this.P.A(t10).y0()));
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {222, 355}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue", "timeoutMillis"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@"}, d2 = {"T", "Lpf/u0;", "Luf/j;", "downstream", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class c extends o implements q<u0, j<? super T>, ie.d<? super u2>, Object> {
        public Object S;
        public Object T;
        public int U;
        public /* synthetic */ Object V;
        public /* synthetic */ Object W;
        public final /* synthetic */ l<T, Long> X;
        public final /* synthetic */ i<T> Y;

        @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H@"}, d2 = {"T", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a extends o implements l<ie.d<? super u2>, Object> {
            public int S;
            public final /* synthetic */ j<T> T;
            public final /* synthetic */ k1.h<Object> U;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(j<? super T> jVar, k1.h<Object> hVar, ie.d<? super a> dVar) {
                super(1, dVar);
                this.T = jVar;
                this.U = hVar;
            }

            @g
            public final ie.d<u2> G(@g ie.d<?> dVar) {
                return new a(this.T, this.U, dVar);
            }

            @h
            public final Object K(@g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    j<T> jVar = this.T;
                    T t10 = u.f23630a;
                    T t11 = this.U.O;
                    if (t11 == t10) {
                        t11 = null;
                    }
                    this.S = 1;
                    if (jVar.d(t11, this) == h10) {
                        return h10;
                    }
                } else if (i10 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.U.O = null;
                return u2.f25116a;
            }

            @h
            /* renamed from: P */
            public final Object A(@h ie.d<? super u2> dVar) {
                return ((a) G(dVar)).K(u2.f25116a);
            }
        }

        @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {243}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H@"}, d2 = {"T", "Lrf/r;", "", "value", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class b extends o implements p<rf.r<? extends Object>, ie.d<? super u2>, Object> {
            public Object S;
            public int T;
            public /* synthetic */ Object U;
            public final /* synthetic */ k1.h<Object> V;
            public final /* synthetic */ j<T> W;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(k1.h<Object> hVar, j<? super T> jVar, ie.d<? super b> dVar) {
                super(2, dVar);
                this.V = hVar;
                this.W = jVar;
            }

            @g
            public final ie.d<u2> H(@h Object obj, @g ie.d<?> dVar) {
                b bVar = new b(this.V, this.W, dVar);
                bVar.U = obj;
                return bVar;
            }

            @h
            public final Object K(@g Object obj) {
                k1.h<Object> hVar;
                k1.h<Object> hVar2;
                Object h10 = ke.d.h();
                int i10 = this.T;
                if (i10 == 0) {
                    e1.n(obj);
                    T o10 = ((rf.r) this.U).o();
                    hVar = this.V;
                    boolean z10 = o10 instanceof r.c;
                    if (!z10) {
                        hVar.O = o10;
                    }
                    j<T> jVar = this.W;
                    if (z10) {
                        Throwable f10 = rf.r.f(o10);
                        if (f10 == null) {
                            T t10 = hVar.O;
                            if (t10 != null) {
                                if (t10 == u.f23630a) {
                                    t10 = null;
                                }
                                this.U = o10;
                                this.S = hVar;
                                this.T = 1;
                                if (jVar.d(t10, this) == h10) {
                                    return h10;
                                }
                                hVar2 = hVar;
                            }
                            hVar.O = u.f23632c;
                        } else {
                            throw f10;
                        }
                    }
                    return u2.f25116a;
                } else if (i10 == 1) {
                    hVar2 = (k1.h) this.S;
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = hVar2;
                hVar.O = u.f23632c;
                return u2.f25116a;
            }

            @h
            public final Object P(@g Object obj, @h ie.d<? super u2> dVar) {
                return ((b) H(rf.r.b(obj), dVar)).K(u2.f25116a);
            }

            public /* bridge */ /* synthetic */ Object g0(Object obj, Object obj2) {
                return P(((rf.r) obj).o(), (ie.d) obj2);
            }
        }

        @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H@"}, d2 = {"T", "Lrf/g0;", "", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: uf.r$c$c  reason: collision with other inner class name */
        public static final class C0440c extends o implements p<g0<? super Object>, ie.d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public final /* synthetic */ i<T> U;

            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
            /* renamed from: uf.r$c$c$a */
            public static final class a<T> implements j {
                public final /* synthetic */ g0<Object> O;

                @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {211}, m = "emit", n = {}, s = {})
                @i0(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: uf.r$c$c$a$a  reason: collision with other inner class name */
                public static final class C0441a extends le.d {
                    public /* synthetic */ Object R;
                    public final /* synthetic */ a<T> S;
                    public int T;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0441a(a<? super T> aVar, ie.d<? super C0441a> dVar) {
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
                public final java.lang.Object d(T r5, @fh.g ie.d<? super zd.u2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof uf.r.c.C0440c.a.C0441a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        uf.r$c$c$a$a r0 = (uf.r.c.C0440c.a.C0441a) r0
                        int r1 = r0.T
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.T = r1
                        goto L_0x0018
                    L_0x0013:
                        uf.r$c$c$a$a r0 = new uf.r$c$c$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.R
                        java.lang.Object r1 = ke.d.h()
                        int r2 = r0.T
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        zd.e1.n(r6)
                        goto L_0x0043
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        zd.e1.n(r6)
                        rf.g0<java.lang.Object> r6 = r4.O
                        if (r5 != 0) goto L_0x003a
                        wf.r0 r5 = vf.u.f23630a
                    L_0x003a:
                        r0.T = r3
                        java.lang.Object r5 = r6.C(r5, r0)
                        if (r5 != r1) goto L_0x0043
                        return r1
                    L_0x0043:
                        zd.u2 r5 = zd.u2.f25116a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: uf.r.c.C0440c.a.d(java.lang.Object, ie.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0440c(i<? extends T> iVar, ie.d<? super C0440c> dVar) {
                super(2, dVar);
                this.U = iVar;
            }

            @g
            public final ie.d<u2> H(@h Object obj, @g ie.d<?> dVar) {
                C0440c cVar = new C0440c(this.U, dVar);
                cVar.T = obj;
                return cVar;
            }

            @h
            public final Object K(@g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    i<T> iVar = this.U;
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
            public final Object g0(@g g0<Object> g0Var, @h ie.d<? super u2> dVar) {
                return ((C0440c) H(g0Var, dVar)).K(u2.f25116a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(l<? super T, Long> lVar, i<? extends T> iVar, ie.d<? super c> dVar) {
            super(3, dVar);
            this.X = lVar;
            this.Y = iVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(12:7|29|30|33|34|35|(1:37)|38|41|(1:43)|(1:45)(1:46)|45) */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f7, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f8, code lost:
            r10.g1(r0);
         */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00e0 A[Catch:{ all -> 0x00f7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0105  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x010b  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                java.lang.Object r0 = ke.d.h()
                int r2 = r1.U
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0048
                if (r2 == r4) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                java.lang.Object r2 = r1.T
                xe.k1$g r2 = (xe.k1.g) r2
                java.lang.Object r2 = r1.S
                xe.k1$h r2 = (xe.k1.h) r2
                java.lang.Object r6 = r1.W
                rf.i0 r6 = (rf.i0) r6
                java.lang.Object r7 = r1.V
                uf.j r7 = (uf.j) r7
                zd.e1.n(r18)
                r8 = r7
                r7 = r6
                r6 = r2
                r2 = r1
                goto L_0x006f
            L_0x0029:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0031:
                java.lang.Object r2 = r1.T
                xe.k1$g r2 = (xe.k1.g) r2
                java.lang.Object r6 = r1.S
                xe.k1$h r6 = (xe.k1.h) r6
                java.lang.Object r7 = r1.W
                rf.i0 r7 = (rf.i0) r7
                java.lang.Object r8 = r1.V
                uf.j r8 = (uf.j) r8
                zd.e1.n(r18)
                r9 = r2
                r2 = r1
                goto L_0x00b6
            L_0x0048:
                zd.e1.n(r18)
                java.lang.Object r2 = r1.V
                r6 = r2
                pf.u0 r6 = (pf.u0) r6
                java.lang.Object r2 = r1.W
                uf.j r2 = (uf.j) r2
                r7 = 0
                r8 = 0
                uf.r$c$c r9 = new uf.r$c$c
                uf.i<T> r10 = r1.Y
                r9.<init>(r10, r5)
                r10 = 3
                r11 = 0
                rf.i0 r6 = rf.e0.h(r6, r7, r8, r9, r10, r11)
                xe.k1$h r7 = new xe.k1$h
                r7.<init>()
                r8 = r2
                r2 = r1
                r16 = r7
                r7 = r6
                r6 = r16
            L_0x006f:
                T r9 = r6.O
                wf.r0 r10 = vf.u.f23632c
                if (r9 == r10) goto L_0x0111
                xe.k1$g r9 = new xe.k1$g
                r9.<init>()
                T r10 = r6.O
                if (r10 == 0) goto L_0x00b8
                we.l<T, java.lang.Long> r11 = r2.X
                wf.r0 r12 = vf.u.f23630a
                if (r10 != r12) goto L_0x0085
                r10 = r5
            L_0x0085:
                java.lang.Object r10 = r11.A(r10)
                java.lang.Number r10 = (java.lang.Number) r10
                long r10 = r10.longValue()
                r9.O = r10
                r13 = 0
                int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
                if (r15 < 0) goto L_0x0099
                r15 = r4
                goto L_0x009a
            L_0x0099:
                r15 = 0
            L_0x009a:
                if (r15 == 0) goto L_0x00c1
                int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
                if (r10 != 0) goto L_0x00b8
                T r10 = r6.O
                if (r10 != r12) goto L_0x00a5
                r10 = r5
            L_0x00a5:
                r2.V = r8
                r2.W = r7
                r2.S = r6
                r2.T = r9
                r2.U = r4
                java.lang.Object r10 = r8.d(r10, r2)
                if (r10 != r0) goto L_0x00b6
                return r0
            L_0x00b6:
                r6.O = r5
            L_0x00b8:
                r16 = r2
                r2 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                r7 = r16
                goto L_0x00cd
            L_0x00c1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Debounce timeout should not be negative"
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x00cd:
                r7.V = r9
                r7.W = r8
                r7.S = r6
                r7.T = r0
                r7.U = r3
                zf.b r10 = new zf.b
                r10.<init>(r7)
                T r11 = r6.O     // Catch:{ all -> 0x00f7 }
                if (r11 == 0) goto L_0x00ea
                long r11 = r0.O     // Catch:{ all -> 0x00f7 }
                uf.r$c$a r0 = new uf.r$c$a     // Catch:{ all -> 0x00f7 }
                r0.<init>(r9, r6, r5)     // Catch:{ all -> 0x00f7 }
                r10.L(r11, r0)     // Catch:{ all -> 0x00f7 }
            L_0x00ea:
                zf.d r0 = r8.j()     // Catch:{ all -> 0x00f7 }
                uf.r$c$b r11 = new uf.r$c$b     // Catch:{ all -> 0x00f7 }
                r11.<init>(r6, r9, r5)     // Catch:{ all -> 0x00f7 }
                r10.c0(r0, r11)     // Catch:{ all -> 0x00f7 }
                goto L_0x00fb
            L_0x00f7:
                r0 = move-exception
                r10.g1(r0)
            L_0x00fb:
                java.lang.Object r0 = r10.f1()
                java.lang.Object r10 = ke.d.h()
                if (r0 != r10) goto L_0x0108
                le.h.c(r7)
            L_0x0108:
                if (r0 != r2) goto L_0x010b
                return r2
            L_0x010b:
                r0 = r2
                r2 = r7
                r7 = r8
                r8 = r9
                goto L_0x006f
            L_0x0111:
                zd.u2 r0 = zd.u2.f25116a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.r.c.K(java.lang.Object):java.lang.Object");
        }

        @h
        /* renamed from: P */
        public final Object y(@g u0 u0Var, @g j<? super T> jVar, @h ie.d<? super u2> dVar) {
            c cVar = new c(this.X, this.Y, dVar);
            cVar.V = u0Var;
            cVar.W = jVar;
            return cVar.K(u2.f25116a);
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", f = "Delay.kt", i = {0, 1, 2}, l = {314, 316, 317}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, d2 = {"Lrf/g0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class d extends o implements p<g0<? super u2>, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ long U;
        public final /* synthetic */ long V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(long j10, long j11, ie.d<? super d> dVar) {
            super(2, dVar);
            this.U = j10;
            this.V = j11;
        }

        @g
        public final ie.d<u2> H(@h Object obj, @g ie.d<?> dVar) {
            d dVar2 = new d(this.U, this.V, dVar);
            dVar2.T = obj;
            return dVar2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: rf.g0} */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x005d A[RETURN] */
        @fh.h
        public final java.lang.Object K(@fh.g java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r7.S
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r4) goto L_0x0011
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
            L_0x0011:
                java.lang.Object r1 = r7.T
                rf.g0 r1 = (rf.g0) r1
                zd.e1.n(r8)
                goto L_0x003f
            L_0x0019:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0021:
                java.lang.Object r1 = r7.T
                rf.g0 r1 = (rf.g0) r1
                zd.e1.n(r8)
                r8 = r7
                goto L_0x0051
            L_0x002a:
                zd.e1.n(r8)
                java.lang.Object r8 = r7.T
                r1 = r8
                rf.g0 r1 = (rf.g0) r1
                long r5 = r7.U
                r7.T = r1
                r7.S = r4
                java.lang.Object r8 = pf.f1.b(r5, r7)
                if (r8 != r0) goto L_0x003f
                return r0
            L_0x003f:
                r8 = r7
            L_0x0040:
                rf.m0 r4 = r1.a()
                zd.u2 r5 = zd.u2.f25116a
                r8.T = r1
                r8.S = r3
                java.lang.Object r4 = r4.C(r5, r8)
                if (r4 != r0) goto L_0x0051
                return r0
            L_0x0051:
                long r4 = r8.V
                r8.T = r1
                r8.S = r2
                java.lang.Object r4 = pf.f1.b(r4, r8)
                if (r4 != r0) goto L_0x0040
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.r.d.K(java.lang.Object):java.lang.Object");
        }

        @h
        /* renamed from: P */
        public final Object g0(@g g0<? super u2> g0Var, @h ie.d<? super u2> dVar) {
            return ((d) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {352}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@"}, d2 = {"T", "Lpf/u0;", "Luf/j;", "downstream", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class e extends o implements q<u0, j<? super T>, ie.d<? super u2>, Object> {
        public Object S;
        public Object T;
        public int U;
        public /* synthetic */ Object V;
        public /* synthetic */ Object W;
        public final /* synthetic */ long X;
        public final /* synthetic */ i<T> Y;

        @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H@"}, d2 = {"T", "Lrf/r;", "", "result", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a extends o implements p<rf.r<? extends Object>, ie.d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public final /* synthetic */ k1.h<Object> U;
            public final /* synthetic */ rf.i0<u2> V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(k1.h<Object> hVar, rf.i0<u2> i0Var, ie.d<? super a> dVar) {
                super(2, dVar);
                this.U = hVar;
                this.V = i0Var;
            }

            @g
            public final ie.d<u2> H(@h Object obj, @g ie.d<?> dVar) {
                a aVar = new a(this.U, this.V, dVar);
                aVar.T = obj;
                return aVar;
            }

            @h
            public final Object K(@g Object obj) {
                ke.d.h();
                if (this.S == 0) {
                    e1.n(obj);
                    T o10 = ((rf.r) this.T).o();
                    k1.h<Object> hVar = this.U;
                    boolean z10 = o10 instanceof r.c;
                    if (!z10) {
                        hVar.O = o10;
                    }
                    rf.i0<u2> i0Var = this.V;
                    if (z10) {
                        Throwable f10 = rf.r.f(o10);
                        if (f10 == null) {
                            i0Var.h(new vf.l());
                            hVar.O = u.f23632c;
                        } else {
                            throw f10;
                        }
                    }
                    return u2.f25116a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @h
            public final Object P(@g Object obj, @h ie.d<? super u2> dVar) {
                return ((a) H(rf.r.b(obj), dVar)).K(u2.f25116a);
            }

            public /* bridge */ /* synthetic */ Object g0(Object obj, Object obj2) {
                return P(((rf.r) obj).o(), (ie.d) obj2);
            }
        }

        @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {300}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@"}, d2 = {"T", "Lzd/u2;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class b extends o implements p<u2, ie.d<? super u2>, Object> {
            public int S;
            public final /* synthetic */ k1.h<Object> T;
            public final /* synthetic */ j<T> U;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(k1.h<Object> hVar, j<? super T> jVar, ie.d<? super b> dVar) {
                super(2, dVar);
                this.T = hVar;
                this.U = jVar;
            }

            @g
            public final ie.d<u2> H(@h Object obj, @g ie.d<?> dVar) {
                return new b(this.T, this.U, dVar);
            }

            @h
            public final Object K(@g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    k1.h<Object> hVar = this.T;
                    T t10 = hVar.O;
                    if (t10 == null) {
                        return u2.f25116a;
                    }
                    hVar.O = null;
                    j<T> jVar = this.U;
                    if (t10 == u.f23630a) {
                        t10 = null;
                    }
                    this.S = 1;
                    if (jVar.d(t10, this) == h10) {
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
            public final Object g0(@g u2 u2Var, @h ie.d<? super u2> dVar) {
                return ((b) H(u2Var, dVar)).K(u2.f25116a);
            }
        }

        @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {280}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H@"}, d2 = {"T", "Lrf/g0;", "", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class c extends o implements p<g0<? super Object>, ie.d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public final /* synthetic */ i<T> U;

            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
            public static final class a<T> implements j {
                public final /* synthetic */ g0<Object> O;

                @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", i = {}, l = {280}, m = "emit", n = {}, s = {})
                @i0(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: uf.r$e$c$a$a  reason: collision with other inner class name */
                public static final class C0442a extends le.d {
                    public /* synthetic */ Object R;
                    public final /* synthetic */ a<T> S;
                    public int T;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0442a(a<? super T> aVar, ie.d<? super C0442a> dVar) {
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
                public final java.lang.Object d(T r5, @fh.g ie.d<? super zd.u2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof uf.r.e.c.a.C0442a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        uf.r$e$c$a$a r0 = (uf.r.e.c.a.C0442a) r0
                        int r1 = r0.T
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.T = r1
                        goto L_0x0018
                    L_0x0013:
                        uf.r$e$c$a$a r0 = new uf.r$e$c$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.R
                        java.lang.Object r1 = ke.d.h()
                        int r2 = r0.T
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        zd.e1.n(r6)
                        goto L_0x0043
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        zd.e1.n(r6)
                        rf.g0<java.lang.Object> r6 = r4.O
                        if (r5 != 0) goto L_0x003a
                        wf.r0 r5 = vf.u.f23630a
                    L_0x003a:
                        r0.T = r3
                        java.lang.Object r5 = r6.C(r5, r0)
                        if (r5 != r1) goto L_0x0043
                        return r1
                    L_0x0043:
                        zd.u2 r5 = zd.u2.f25116a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: uf.r.e.c.a.d(java.lang.Object, ie.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(i<? extends T> iVar, ie.d<? super c> dVar) {
                super(2, dVar);
                this.U = iVar;
            }

            @g
            public final ie.d<u2> H(@h Object obj, @g ie.d<?> dVar) {
                c cVar = new c(this.U, dVar);
                cVar.T = obj;
                return cVar;
            }

            @h
            public final Object K(@g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    i<T> iVar = this.U;
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
            public final Object g0(@g g0<Object> g0Var, @h ie.d<? super u2> dVar) {
                return ((c) H(g0Var, dVar)).K(u2.f25116a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(long j10, i<? extends T> iVar, ie.d<? super e> dVar) {
            super(3, dVar);
            this.X = j10;
            this.Y = iVar;
        }

        @h
        public final Object K(@g Object obj) {
            j jVar;
            rf.i0 i0Var;
            k1.h hVar;
            rf.i0 i0Var2;
            Object h10 = ke.d.h();
            int i10 = this.U;
            if (i10 == 0) {
                e1.n(obj);
                c cVar = new c(this.Y, (ie.d<? super c>) null);
                u0 u0Var = (u0) this.V;
                rf.i0 h11 = e0.h(u0Var, (ie.g) null, -1, cVar, 1, (Object) null);
                k1.h hVar2 = new k1.h();
                rf.i0 y02 = r.g(u0Var, this.X, 0, 2, (Object) null);
                jVar = (j) this.W;
                i0Var = h11;
                hVar = hVar2;
                i0Var2 = y02;
            } else if (i10 == 1) {
                i0Var2 = (rf.i0) this.T;
                hVar = (k1.h) this.S;
                i0Var = (rf.i0) this.W;
                jVar = (j) this.V;
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (hVar.O != u.f23632c) {
                this.V = jVar;
                this.W = i0Var;
                this.S = hVar;
                this.T = i0Var2;
                this.U = 1;
                zf.b bVar = new zf.b(this);
                try {
                    bVar.c0(i0Var.j(), new a(hVar, i0Var2, (ie.d<? super a>) null));
                    bVar.c0(i0Var2.d(), new b(hVar, jVar, (ie.d<? super b>) null));
                } catch (Throwable th2) {
                    bVar.g1(th2);
                }
                Object f12 = bVar.f1();
                if (f12 == ke.d.h()) {
                    le.h.c(this);
                    continue;
                }
                if (f12 == h10) {
                    return h10;
                }
            }
            return u2.f25116a;
        }

        @h
        /* renamed from: P */
        public final Object y(@g u0 u0Var, @g j<? super T> jVar, @h ie.d<? super u2> dVar) {
            e eVar = new e(this.X, this.Y, dVar);
            eVar.V = u0Var;
            eVar.W = jVar;
            return eVar.K(u2.f25116a);
        }
    }

    @g
    @d2
    public static final <T> i<T> a(@g i<? extends T> iVar, long j10) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? iVar : e(iVar, new a(j10));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    @g
    @t0
    @d2
    public static final <T> i<T> b(@g i<? extends T> iVar, @g l<? super T, Long> lVar) {
        return e(iVar, lVar);
    }

    @g
    @d2
    public static final <T> i<T> c(@g i<? extends T> iVar, long j10) {
        return k.a0(iVar, f1.e(j10));
    }

    @g
    @t0
    @ve.h(name = "debounceDuration")
    @d2
    public static final <T> i<T> d(@g i<? extends T> iVar, @g l<? super T, nf.e> lVar) {
        return e(iVar, new b(lVar));
    }

    public static final <T> i<T> e(i<? extends T> iVar, l<? super T, Long> lVar) {
        return vf.p.b(new c(lVar, iVar, (ie.d<? super c>) null));
    }

    @g
    public static final rf.i0<u2> f(@g u0 u0Var, long j10, long j11) {
        boolean z10 = true;
        if (j10 >= 0) {
            if (j11 < 0) {
                z10 = false;
            }
            if (z10) {
                return e0.h(u0Var, (ie.g) null, 0, new d(j11, j10, (ie.d<? super d>) null), 1, (Object) null);
            }
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j11 + " ms").toString());
        }
        throw new IllegalArgumentException(("Expected non-negative delay, but has " + j10 + " ms").toString());
    }

    public static /* synthetic */ rf.i0 g(u0 u0Var, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = j10;
        }
        return k.x0(u0Var, j10, j11);
    }

    @g
    @d2
    public static final <T> i<T> h(@g i<? extends T> iVar, long j10) {
        if (j10 > 0) {
            return vf.p.b(new e(j10, iVar, (ie.d<? super e>) null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    @g
    @d2
    public static final <T> i<T> i(@g i<? extends T> iVar, long j10) {
        return k.A1(iVar, f1.e(j10));
    }
}

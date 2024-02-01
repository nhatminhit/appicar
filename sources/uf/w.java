package uf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import le.o;
import pf.c2;
import pf.d2;
import rf.m;
import vf.j;
import vf.k;
import we.p;
import we.q;
import wf.t0;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\u001ag\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000227\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aq\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\r\u001a\u00020\f27\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002H\u0007\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0011\u001a9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0014\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0013\"\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0007\u001at\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0001\u0010\t\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0018¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aj\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000229\b\u0005\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u000b\u001ac\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000223\b\u0001\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u000b\" \u0010%\u001a\u00020\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"\"\u001a\u0010'\u001a\u00020&8\u0006XT¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010$\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"T", "R", "Luf/i;", "Lkotlin/Function2;", "Lzd/v0;", "name", "value", "Lie/d;", "", "transform", "a", "(Luf/i;Lwe/p;)Luf/i;", "", "concurrency", "c", "(Luf/i;ILwe/p;)Luf/i;", "e", "", "l", "", "flows", "m", "([Luf/i;)Luf/i;", "f", "Lkotlin/Function3;", "Luf/j;", "Lzd/u2;", "Lzd/u;", "n", "(Luf/i;Lwe/q;)Luf/i;", "b", "k", "I", "h", "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "", "DEFAULT_CONCURRENCY_PROPERTY_NAME", "Ljava/lang/String;", "getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class w {

    /* renamed from: a  reason: collision with root package name */
    public static final int f23368a = t0.b(k.f23350a, 16, 1, Integer.MAX_VALUE);

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "uf/a0$e"}, k = 1, mv = {1, 6, 0})
    public static final class a implements i<i<? extends R>> {
        public final /* synthetic */ i O;
        public final /* synthetic */ p P;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "uf/a0$e$b"}, k = 3, mv = {1, 6, 0})
        /* renamed from: uf.w$a$a  reason: collision with other inner class name */
        public static final class C0448a<T> implements j {
            public final /* synthetic */ j O;
            public final /* synthetic */ p P;

            @le.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            @i0(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: uf.w$a$a$a  reason: collision with other inner class name */
            public static final class C0449a extends le.d {
                public /* synthetic */ Object R;
                public int S;
                public Object T;
                public final /* synthetic */ C0448a U;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0449a(C0448a aVar, ie.d dVar) {
                    super(dVar);
                    this.U = aVar;
                }

                @h
                public final Object K(@g Object obj) {
                    this.R = obj;
                    this.S |= Integer.MIN_VALUE;
                    return this.U.d((Object) null, this);
                }
            }

            public C0448a(j jVar, p pVar) {
                this.O = jVar;
                this.P = pVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object d(java.lang.Object r7, @fh.g ie.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof uf.w.a.C0448a.C0449a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    uf.w$a$a$a r0 = (uf.w.a.C0448a.C0449a) r0
                    int r1 = r0.S
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.S = r1
                    goto L_0x0018
                L_0x0013:
                    uf.w$a$a$a r0 = new uf.w$a$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.R
                    java.lang.Object r1 = ke.d.h()
                    int r2 = r0.S
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    zd.e1.n(r8)
                    goto L_0x005d
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.T
                    uf.j r7 = (uf.j) r7
                    zd.e1.n(r8)
                    goto L_0x0051
                L_0x003c:
                    zd.e1.n(r8)
                    uf.j r8 = r6.O
                    we.p r2 = r6.P
                    r0.T = r8
                    r0.S = r4
                    java.lang.Object r7 = r2.g0(r7, r0)
                    if (r7 != r1) goto L_0x004e
                    return r1
                L_0x004e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L_0x0051:
                    r2 = 0
                    r0.T = r2
                    r0.S = r3
                    java.lang.Object r7 = r7.d(r8, r0)
                    if (r7 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    zd.u2 r7 = zd.u2.f25116a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.w.a.C0448a.d(java.lang.Object, ie.d):java.lang.Object");
            }
        }

        public a(i iVar, p pVar) {
            this.O = iVar;
            this.P = pVar;
        }

        @h
        public Object a(@g j jVar, @g ie.d dVar) {
            Object a10 = this.O.a(new C0448a(jVar, this.P), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {190, 190}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@"}, d2 = {"T", "R", "Luf/j;", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class b extends o implements q<j<? super R>, T, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public /* synthetic */ Object U;
        public final /* synthetic */ p<T, ie.d<? super i<? extends R>>, Object> V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p<? super T, ? super ie.d<? super i<? extends R>>, ? extends Object> pVar, ie.d<? super b> dVar) {
            super(3, dVar);
            this.V = pVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: uf.j} */
        /* JADX WARNING: Multi-variable type inference failed */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r5.S
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                zd.e1.n(r6)
                goto L_0x0047
            L_0x0012:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001a:
                java.lang.Object r1 = r5.T
                uf.j r1 = (uf.j) r1
                zd.e1.n(r6)
                goto L_0x0039
            L_0x0022:
                zd.e1.n(r6)
                java.lang.Object r6 = r5.T
                r1 = r6
                uf.j r1 = (uf.j) r1
                java.lang.Object r6 = r5.U
                we.p<T, ie.d<? super uf.i<? extends R>>, java.lang.Object> r4 = r5.V
                r5.T = r1
                r5.S = r3
                java.lang.Object r6 = r4.g0(r6, r5)
                if (r6 != r0) goto L_0x0039
                return r0
            L_0x0039:
                uf.i r6 = (uf.i) r6
                r3 = 0
                r5.T = r3
                r5.S = r2
                java.lang.Object r6 = uf.k.m0(r1, r6, r5)
                if (r6 != r0) goto L_0x0047
                return r0
            L_0x0047:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.w.b.K(java.lang.Object):java.lang.Object");
        }

        @h
        /* renamed from: P */
        public final Object y(@g j<? super R> jVar, T t10, @h ie.d<? super u2> dVar) {
            b bVar = new b(this.V, dVar);
            bVar.T = jVar;
            bVar.U = t10;
            return bVar.K(u2.f25116a);
        }

        @h
        public final Object Q(@g Object obj) {
            Object obj2 = this.U;
            xe.i0.e(0);
            k.m0((j) this.T, (i) this.V.g0(obj2, this), this);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "uf/a0$e"}, k = 1, mv = {1, 6, 0})
    public static final class c implements i<i<? extends R>> {
        public final /* synthetic */ i O;
        public final /* synthetic */ p P;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "uf/a0$e$b"}, k = 3, mv = {1, 6, 0})
        public static final class a<T> implements j {
            public final /* synthetic */ j O;
            public final /* synthetic */ p P;

            @le.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            @i0(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: uf.w$c$a$a  reason: collision with other inner class name */
            public static final class C0450a extends le.d {
                public /* synthetic */ Object R;
                public int S;
                public Object T;
                public final /* synthetic */ a U;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0450a(a aVar, ie.d dVar) {
                    super(dVar);
                    this.U = aVar;
                }

                @h
                public final Object K(@g Object obj) {
                    this.R = obj;
                    this.S |= Integer.MIN_VALUE;
                    return this.U.d((Object) null, this);
                }
            }

            public a(j jVar, p pVar) {
                this.O = jVar;
                this.P = pVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object d(java.lang.Object r7, @fh.g ie.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof uf.w.c.a.C0450a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    uf.w$c$a$a r0 = (uf.w.c.a.C0450a) r0
                    int r1 = r0.S
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.S = r1
                    goto L_0x0018
                L_0x0013:
                    uf.w$c$a$a r0 = new uf.w$c$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.R
                    java.lang.Object r1 = ke.d.h()
                    int r2 = r0.S
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    zd.e1.n(r8)
                    goto L_0x005d
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.T
                    uf.j r7 = (uf.j) r7
                    zd.e1.n(r8)
                    goto L_0x0051
                L_0x003c:
                    zd.e1.n(r8)
                    uf.j r8 = r6.O
                    we.p r2 = r6.P
                    r0.T = r8
                    r0.S = r4
                    java.lang.Object r7 = r2.g0(r7, r0)
                    if (r7 != r1) goto L_0x004e
                    return r1
                L_0x004e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L_0x0051:
                    r2 = 0
                    r0.T = r2
                    r0.S = r3
                    java.lang.Object r7 = r7.d(r8, r0)
                    if (r7 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    zd.u2 r7 = zd.u2.f25116a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.w.c.a.d(java.lang.Object, ie.d):java.lang.Object");
            }
        }

        public c(i iVar, p pVar) {
            this.O = iVar;
            this.P = pVar;
        }

        @h
        public Object a(@g j jVar, @g ie.d dVar) {
            Object a10 = this.O.a(new a(jVar, this.P), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d implements i<T> {
        public final /* synthetic */ i O;

        public d(i iVar) {
            this.O = iVar;
        }

        @h
        public Object a(@g j<? super T> jVar, @g ie.d<? super u2> dVar) {
            Object a10 = this.O.a(new e(jVar), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Luf/i;", "value", "Lzd/u2;", "a", "(Luf/i;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class e<T> implements j {
        public final /* synthetic */ j<T> O;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {80}, m = "emit", n = {}, s = {})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public final /* synthetic */ e<T> S;
            public int T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(e<? super T> eVar, ie.d<? super a> dVar) {
                super(dVar);
                this.S = eVar;
            }

            @h
            public final Object K(@g Object obj) {
                this.R = obj;
                this.T |= Integer.MIN_VALUE;
                return this.S.d((i) null, this);
            }
        }

        public e(j<? super T> jVar) {
            this.O = jVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(@fh.g uf.i<? extends T> r5, @fh.g ie.d<? super zd.u2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof uf.w.e.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                uf.w$e$a r0 = (uf.w.e.a) r0
                int r1 = r0.T
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.T = r1
                goto L_0x0018
            L_0x0013:
                uf.w$e$a r0 = new uf.w$e$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.T
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                zd.e1.n(r6)
                goto L_0x003f
            L_0x0029:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0031:
                zd.e1.n(r6)
                uf.j<T> r6 = r4.O
                r0.T = r3
                java.lang.Object r5 = uf.k.m0(r6, r5, r0)
                if (r5 != r1) goto L_0x003f
                return r1
            L_0x003f:
                zd.u2 r5 = zd.u2.f25116a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.w.e.d(uf.i, ie.d):java.lang.Object");
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {214, 214}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@"}, d2 = {"T", "R", "Luf/j;", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class f extends o implements q<j<? super R>, T, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public /* synthetic */ Object U;
        public final /* synthetic */ p<T, ie.d<? super R>, Object> V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(p<? super T, ? super ie.d<? super R>, ? extends Object> pVar, ie.d<? super f> dVar) {
            super(3, dVar);
            this.V = pVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: uf.j} */
        /* JADX WARNING: Multi-variable type inference failed */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r5.S
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                zd.e1.n(r6)
                goto L_0x0045
            L_0x0012:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001a:
                java.lang.Object r1 = r5.T
                uf.j r1 = (uf.j) r1
                zd.e1.n(r6)
                goto L_0x0039
            L_0x0022:
                zd.e1.n(r6)
                java.lang.Object r6 = r5.T
                r1 = r6
                uf.j r1 = (uf.j) r1
                java.lang.Object r6 = r5.U
                we.p<T, ie.d<? super R>, java.lang.Object> r4 = r5.V
                r5.T = r1
                r5.S = r3
                java.lang.Object r6 = r4.g0(r6, r5)
                if (r6 != r0) goto L_0x0039
                return r0
            L_0x0039:
                r3 = 0
                r5.T = r3
                r5.S = r2
                java.lang.Object r6 = r1.d(r6, r5)
                if (r6 != r0) goto L_0x0045
                return r0
            L_0x0045:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.w.f.K(java.lang.Object):java.lang.Object");
        }

        @h
        /* renamed from: P */
        public final Object y(@g j<? super R> jVar, T t10, @h ie.d<? super u2> dVar) {
            f fVar = new f(this.V, dVar);
            fVar.T = jVar;
            fVar.U = t10;
            return fVar.K(u2.f25116a);
        }
    }

    @g
    @d2
    public static final <T, R> i<R> a(@g i<? extends T> iVar, @g p<? super T, ? super ie.d<? super i<? extends R>>, ? extends Object> pVar) {
        return k.F0(new a(iVar, pVar));
    }

    @g
    @c2
    public static final <T, R> i<R> b(@g i<? extends T> iVar, @g @zd.b p<? super T, ? super ie.d<? super i<? extends R>>, ? extends Object> pVar) {
        return k.b2(iVar, new b(pVar, (ie.d<? super b>) null));
    }

    @g
    @d2
    public static final <T, R> i<R> c(@g i<? extends T> iVar, int i10, @g p<? super T, ? super ie.d<? super i<? extends R>>, ? extends Object> pVar) {
        return k.G0(new c(iVar, pVar), i10);
    }

    public static /* synthetic */ i d(i iVar, int i10, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = f23368a;
        }
        return k.C0(iVar, i10, pVar);
    }

    @g
    @d2
    public static final <T> i<T> e(@g i<? extends i<? extends T>> iVar) {
        return new d(iVar);
    }

    @g
    @d2
    public static final <T> i<T> f(@g i<? extends i<? extends T>> iVar, int i10) {
        if (i10 > 0) {
            return i10 == 1 ? k.F0(iVar) : new vf.g(iVar, i10, (ie.g) null, 0, (m) null, 28, (xe.w) null);
        }
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i10).toString());
    }

    public static /* synthetic */ i g(i iVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = f23368a;
        }
        return k.G0(iVar, i10);
    }

    public static final int h() {
        return f23368a;
    }

    @d2
    public static /* synthetic */ void i() {
    }

    @d2
    public static /* synthetic */ void j() {
    }

    @g
    @c2
    public static final <T, R> i<R> k(@g i<? extends T> iVar, @g @zd.b p<? super T, ? super ie.d<? super R>, ? extends Object> pVar) {
        return k.b2(iVar, new f(pVar, (ie.d<? super f>) null));
    }

    @g
    public static final <T> i<T> l(@g Iterable<? extends i<? extends T>> iterable) {
        return new k(iterable, (ie.g) null, 0, (m) null, 14, (xe.w) null);
    }

    @g
    public static final <T> i<T> m(@g i<? extends T>... iVarArr) {
        return k.Y0(be.p.c6(iVarArr));
    }

    @g
    @c2
    public static final <T, R> i<R> n(@g i<? extends T> iVar, @g @zd.b q<? super j<? super R>, ? super T, ? super ie.d<? super u2>, ? extends Object> qVar) {
        return new j(qVar, iVar, (ie.g) null, 0, (m) null, 28, (xe.w) null);
    }
}

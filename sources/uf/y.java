package uf;

import kotlin.Metadata;
import vf.u;
import xe.k1;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001au\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022F\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a{\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u00012H\b\u0004\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003HHø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a#\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013\u001aG\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013\u001aI\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001a\u001a#\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013\u001a%\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"S", "T", "Luf/i;", "Lkotlin/Function3;", "Lzd/v0;", "name", "accumulator", "value", "Lie/d;", "", "operation", "i", "(Luf/i;Lwe/q;Lie/d;)Ljava/lang/Object;", "R", "initial", "acc", "e", "(Luf/i;Ljava/lang/Object;Lwe/q;Lie/d;)Ljava/lang/Object;", "j", "(Luf/i;Lie/d;)Ljava/lang/Object;", "k", "a", "Lkotlin/Function2;", "", "predicate", "b", "(Luf/i;Lwe/p;Lie/d;)Ljava/lang/Object;", "c", "d", "g", "h", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class y {

    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"uf/v$b", "Luf/j;", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a implements j<T> {
        public final /* synthetic */ k1.h O;

        public a(k1.h hVar) {
            this.O = hVar;
        }

        @fh.h
        public Object d(T t10, @fh.g ie.d<? super u2> dVar) {
            this.O.O = t10;
            throw new vf.a(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"uf/v$b", "Luf/j;", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b implements j<T> {
        public final /* synthetic */ we.p O;
        public final /* synthetic */ k1.h P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {142}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public Object R;
            public /* synthetic */ Object S;
            public int T;
            public final /* synthetic */ b U;
            public Object V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, ie.d dVar) {
                super(dVar);
                this.U = bVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.S = obj;
                this.T |= Integer.MIN_VALUE;
                return this.U.d(null, this);
            }
        }

        public b(we.p pVar, k1.h hVar) {
            this.O = pVar;
            this.P = hVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object d(T r5, @fh.g ie.d<? super zd.u2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof uf.y.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                uf.y$b$a r0 = (uf.y.b.a) r0
                int r1 = r0.T
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.T = r1
                goto L_0x0018
            L_0x0013:
                uf.y$b$a r0 = new uf.y$b$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.S
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.T
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r5 = r0.V
                java.lang.Object r0 = r0.R
                uf.y$b r0 = (uf.y.b) r0
                zd.e1.n(r6)
                goto L_0x0052
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0037:
                zd.e1.n(r6)
                we.p r6 = r4.O
                r0.R = r4
                r0.V = r5
                r0.T = r3
                r2 = 6
                xe.i0.e(r2)
                java.lang.Object r6 = r6.g0(r5, r0)
                r0 = 7
                xe.i0.e(r0)
                if (r6 != r1) goto L_0x0051
                return r1
            L_0x0051:
                r0 = r4
            L_0x0052:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L_0x005f
                xe.k1$h r6 = r0.P
                r6.O = r5
                r3 = 0
            L_0x005f:
                if (r3 == 0) goto L_0x0064
                zd.u2 r5 = zd.u2.f25116a
                return r5
            L_0x0064:
                vf.a r5 = new vf.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.y.b.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class c<T> extends le.d {
        public Object R;
        public Object S;
        public /* synthetic */ Object T;
        public int U;

        public c(ie.d<? super c> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.T = obj;
            this.U |= Integer.MIN_VALUE;
            return k.t0((i) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {183}, m = "first", n = {"predicate", "result", "collector$iv"}, s = {"L$0", "L$1", "L$2"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class d<T> extends le.d {
        public Object R;
        public Object S;
        public Object T;
        public /* synthetic */ Object U;
        public int V;

        public d(ie.d<? super d> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.U = obj;
            this.V |= Integer.MIN_VALUE;
            return k.u0((i) null, (we.p) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"uf/v$b", "Luf/j;", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e implements j<T> {
        public final /* synthetic */ k1.h O;

        public e(k1.h hVar) {
            this.O = hVar;
        }

        @fh.h
        public Object d(T t10, @fh.g ie.d<? super u2> dVar) {
            this.O.O = t10;
            throw new vf.a(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"uf/v$b", "Luf/j;", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class f implements j<T> {
        public final /* synthetic */ we.p O;
        public final /* synthetic */ k1.h P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {142}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public Object R;
            public /* synthetic */ Object S;
            public int T;
            public final /* synthetic */ f U;
            public Object V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(f fVar, ie.d dVar) {
                super(dVar);
                this.U = fVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.S = obj;
                this.T |= Integer.MIN_VALUE;
                return this.U.d(null, this);
            }
        }

        public f(we.p pVar, k1.h hVar) {
            this.O = pVar;
            this.P = hVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object d(T r5, @fh.g ie.d<? super zd.u2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof uf.y.f.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                uf.y$f$a r0 = (uf.y.f.a) r0
                int r1 = r0.T
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.T = r1
                goto L_0x0018
            L_0x0013:
                uf.y$f$a r0 = new uf.y$f$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.S
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.T
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r5 = r0.V
                java.lang.Object r0 = r0.R
                uf.y$f r0 = (uf.y.f) r0
                zd.e1.n(r6)
                goto L_0x0052
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0037:
                zd.e1.n(r6)
                we.p r6 = r4.O
                r0.R = r4
                r0.V = r5
                r0.T = r3
                r2 = 6
                xe.i0.e(r2)
                java.lang.Object r6 = r6.g0(r5, r0)
                r0 = 7
                xe.i0.e(r0)
                if (r6 != r1) goto L_0x0051
                return r1
            L_0x0051:
                r0 = r4
            L_0x0052:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L_0x005f
                xe.k1$h r6 = r0.P
                r6.O = r5
                r3 = 0
            L_0x005f:
                if (r3 == 0) goto L_0x0064
                zd.u2 r5 = zd.u2.f25116a
                return r5
            L_0x0064:
                vf.a r5 = new vf.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.y.f.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class g<T> extends le.d {
        public Object R;
        public Object S;
        public /* synthetic */ Object T;
        public int U;

        public g(ie.d<? super g> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.T = obj;
            this.U |= Integer.MIN_VALUE;
            return k.v0((i) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class h<T> extends le.d {
        public Object R;
        public Object S;
        public /* synthetic */ Object T;
        public int U;

        public h(ie.d<? super h> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.T = obj;
            this.U |= Integer.MIN_VALUE;
            return k.w0((i) null, (we.p) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {44}, m = "fold", n = {"accumulator"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class i<T, R> extends le.d {
        public Object R;
        public /* synthetic */ Object S;
        public int T;

        public i(ie.d<? super i> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.S = obj;
            this.T |= Integer.MIN_VALUE;
            return y.e((i) null, null, (we.q) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class j<T> implements j {
        public final /* synthetic */ k1.h<R> O;
        public final /* synthetic */ we.q<R, T, ie.d<? super R>, Object> P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", f = "Reduce.kt", i = {}, l = {45}, m = "emit", n = {}, s = {})
        @i0(k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class a extends le.d {
            public Object R;
            public /* synthetic */ Object S;
            public final /* synthetic */ j<T> T;
            public int U;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(j<? super T> jVar, ie.d<? super a> dVar) {
                super(dVar);
                this.T = jVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.S = obj;
                this.U |= Integer.MIN_VALUE;
                return this.T.d(null, this);
            }
        }

        public j(k1.h<R> hVar, we.q<? super R, ? super T, ? super ie.d<? super R>, ? extends Object> qVar) {
            this.O = hVar;
            this.P = qVar;
        }

        @fh.h
        public final Object a(T t10, @fh.g ie.d<? super u2> dVar) {
            xe.i0.e(4);
            new a(this, dVar);
            xe.i0.e(5);
            k1.h<R> hVar = this.O;
            hVar.O = this.P.y(hVar.O, t10, dVar);
            return u2.f25116a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(T r7, @fh.g ie.d<? super zd.u2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof uf.y.j.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                uf.y$j$a r0 = (uf.y.j.a) r0
                int r1 = r0.U
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.U = r1
                goto L_0x0018
            L_0x0013:
                uf.y$j$a r0 = new uf.y$j$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.S
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.U
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r7 = r0.R
                xe.k1$h r7 = (xe.k1.h) r7
                zd.e1.n(r8)
                goto L_0x004c
            L_0x002d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0035:
                zd.e1.n(r8)
                xe.k1$h<R> r8 = r6.O
                we.q<R, T, ie.d<? super R>, java.lang.Object> r2 = r6.P
                T r4 = r8.O
                r0.R = r8
                r0.U = r3
                java.lang.Object r7 = r2.y(r4, r7, r0)
                if (r7 != r1) goto L_0x0049
                return r1
            L_0x0049:
                r5 = r8
                r8 = r7
                r7 = r5
            L_0x004c:
                r7.O = r8
                zd.u2 r7 = zd.u2.f25116a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.y.j.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {155}, m = "last", n = {"result"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class k<T> extends le.d {
        public Object R;
        public /* synthetic */ Object S;
        public int T;

        public k(ie.d<? super k> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.S = obj;
            this.T |= Integer.MIN_VALUE;
            return k.S0((i) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class l<T> implements j {
        public final /* synthetic */ k1.h<Object> O;

        public l(k1.h<Object> hVar) {
            this.O = hVar;
        }

        @fh.h
        public final Object d(T t10, @fh.g ie.d<? super u2> dVar) {
            this.O.O = t10;
            return u2.f25116a;
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {167}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class m<T> extends le.d {
        public Object R;
        public /* synthetic */ Object S;
        public int T;

        public m(ie.d<? super m> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.S = obj;
            this.T |= Integer.MIN_VALUE;
            return k.T0((i) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class n<T> implements j {
        public final /* synthetic */ k1.h<T> O;

        public n(k1.h<T> hVar) {
            this.O = hVar;
        }

        @fh.h
        public final Object d(T t10, @fh.g ie.d<? super u2> dVar) {
            this.O.O = t10;
            return u2.f25116a;
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {22}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class o<S, T extends S> extends le.d {
        public Object R;
        public /* synthetic */ Object S;
        public int T;

        public o(ie.d<? super o> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.S = obj;
            this.T |= Integer.MIN_VALUE;
            return k.s1((i) null, (we.q) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "T", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class p<T> implements j {
        public final /* synthetic */ k1.h<Object> O;
        public final /* synthetic */ we.q<S, T, ie.d<? super S>, Object> P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public Object R;
            public /* synthetic */ Object S;
            public final /* synthetic */ p<T> T;
            public int U;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(p<? super T> pVar, ie.d<? super a> dVar) {
                super(dVar);
                this.T = pVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.S = obj;
                this.U |= Integer.MIN_VALUE;
                return this.T.d(null, this);
            }
        }

        public p(k1.h<Object> hVar, we.q<? super S, ? super T, ? super ie.d<? super S>, ? extends Object> qVar) {
            this.O = hVar;
            this.P = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(T r7, @fh.g ie.d<? super zd.u2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof uf.y.p.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                uf.y$p$a r0 = (uf.y.p.a) r0
                int r1 = r0.U
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.U = r1
                goto L_0x0018
            L_0x0013:
                uf.y$p$a r0 = new uf.y$p$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.S
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.U
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r7 = r0.R
                xe.k1$h r7 = (xe.k1.h) r7
                zd.e1.n(r8)
                goto L_0x0050
            L_0x002d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0035:
                zd.e1.n(r8)
                xe.k1$h<java.lang.Object> r8 = r6.O
                T r2 = r8.O
                wf.r0 r4 = vf.u.f23630a
                if (r2 == r4) goto L_0x0053
                we.q<S, T, ie.d<? super S>, java.lang.Object> r4 = r6.P
                r0.R = r8
                r0.U = r3
                java.lang.Object r7 = r4.y(r2, r7, r0)
                if (r7 != r1) goto L_0x004d
                return r1
            L_0x004d:
                r5 = r8
                r8 = r7
                r7 = r5
            L_0x0050:
                r5 = r8
                r8 = r7
                r7 = r5
            L_0x0053:
                r8.O = r7
                zd.u2 r7 = zd.u2.f25116a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.y.p.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {57}, m = "single", n = {"result"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class q<T> extends le.d {
        public Object R;
        public /* synthetic */ Object S;
        public int T;

        public q(ie.d<? super q> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.S = obj;
            this.T |= Integer.MIN_VALUE;
            return k.H1((i) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class r<T> implements j {
        public final /* synthetic */ k1.h<Object> O;

        public r(k1.h<Object> hVar) {
            this.O = hVar;
        }

        @fh.h
        public final Object d(T t10, @fh.g ie.d<? super u2> dVar) {
            k1.h<Object> hVar = this.O;
            if (hVar.O == u.f23630a) {
                hVar.O = t10;
                return u2.f25116a;
            }
            throw new IllegalArgumentException("Flow has more than one element".toString());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"uf/v$b", "Luf/j;", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class s implements j<T> {
        public final /* synthetic */ k1.h O;

        public s(k1.h hVar) {
            this.O = hVar;
        }

        @fh.h
        public Object d(T t10, @fh.g ie.d<? super u2> dVar) {
            boolean z10;
            k1.h hVar = this.O;
            T t11 = hVar.O;
            T t12 = u.f23630a;
            if (t11 == t12) {
                hVar.O = t10;
                z10 = true;
            } else {
                hVar.O = t12;
                z10 = false;
            }
            if (z10) {
                return u2.f25116a;
            }
            throw new vf.a(this);
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class t<T> extends le.d {
        public Object R;
        public Object S;
        public /* synthetic */ Object T;
        public int U;

        public t(ie.d<? super t> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.T = obj;
            this.U |= Integer.MIN_VALUE;
            return k.I1((i) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object a(@fh.g uf.i<? extends T> r4, @fh.g ie.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof uf.y.c
            if (r0 == 0) goto L_0x0013
            r0 = r5
            uf.y$c r0 = (uf.y.c) r0
            int r1 = r0.U
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.U = r1
            goto L_0x0018
        L_0x0013:
            uf.y$c r0 = new uf.y$c
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.T
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.U
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.S
            uf.y$a r4 = (uf.y.a) r4
            java.lang.Object r0 = r0.R
            xe.k1$h r0 = (xe.k1.h) r0
            zd.e1.n(r5)     // Catch:{ a -> 0x0031 }
            goto L_0x0062
        L_0x0031:
            r5 = move-exception
            goto L_0x005f
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            zd.e1.n(r5)
            xe.k1$h r5 = new xe.k1$h
            r5.<init>()
            wf.r0 r2 = vf.u.f23630a
            r5.O = r2
            uf.y$a r2 = new uf.y$a
            r2.<init>(r5)
            r0.R = r5     // Catch:{ a -> 0x005b }
            r0.S = r2     // Catch:{ a -> 0x005b }
            r0.U = r3     // Catch:{ a -> 0x005b }
            java.lang.Object r4 = r4.a(r2, r0)     // Catch:{ a -> 0x005b }
            if (r4 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r5
            goto L_0x0062
        L_0x005b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x005f:
            vf.q.b(r5, r4)
        L_0x0062:
            T r4 = r0.O
            wf.r0 r5 = vf.u.f23630a
            if (r4 == r5) goto L_0x0069
            return r4
        L_0x0069:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.y.a(uf.i, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object b(@fh.g uf.i<? extends T> r4, @fh.g we.p<? super T, ? super ie.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @fh.g ie.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof uf.y.d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            uf.y$d r0 = (uf.y.d) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.V = r1
            goto L_0x0018
        L_0x0013:
            uf.y$d r0 = new uf.y$d
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.U
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.V
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r4 = r0.T
            uf.y$b r4 = (uf.y.b) r4
            java.lang.Object r5 = r0.S
            xe.k1$h r5 = (xe.k1.h) r5
            java.lang.Object r0 = r0.R
            we.p r0 = (we.p) r0
            zd.e1.n(r6)     // Catch:{ a -> 0x0035 }
            goto L_0x006a
        L_0x0035:
            r6 = move-exception
            goto L_0x0067
        L_0x0037:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003f:
            zd.e1.n(r6)
            xe.k1$h r6 = new xe.k1$h
            r6.<init>()
            wf.r0 r2 = vf.u.f23630a
            r6.O = r2
            uf.y$b r2 = new uf.y$b
            r2.<init>(r5, r6)
            r0.R = r5     // Catch:{ a -> 0x0062 }
            r0.S = r6     // Catch:{ a -> 0x0062 }
            r0.T = r2     // Catch:{ a -> 0x0062 }
            r0.V = r3     // Catch:{ a -> 0x0062 }
            java.lang.Object r4 = r4.a(r2, r0)     // Catch:{ a -> 0x0062 }
            if (r4 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r0 = r5
            r5 = r6
            goto L_0x006a
        L_0x0062:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L_0x0067:
            vf.q.b(r6, r4)
        L_0x006a:
            T r4 = r5.O
            wf.r0 r5 = vf.u.f23630a
            if (r4 == r5) goto L_0x0071
            return r4
        L_0x0071:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.y.b(uf.i, we.p, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object c(@fh.g uf.i<? extends T> r4, @fh.g ie.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof uf.y.g
            if (r0 == 0) goto L_0x0013
            r0 = r5
            uf.y$g r0 = (uf.y.g) r0
            int r1 = r0.U
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.U = r1
            goto L_0x0018
        L_0x0013:
            uf.y$g r0 = new uf.y$g
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.T
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.U
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.S
            uf.y$e r4 = (uf.y.e) r4
            java.lang.Object r0 = r0.R
            xe.k1$h r0 = (xe.k1.h) r0
            zd.e1.n(r5)     // Catch:{ a -> 0x0031 }
            goto L_0x005e
        L_0x0031:
            r5 = move-exception
            goto L_0x005b
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            zd.e1.n(r5)
            xe.k1$h r5 = new xe.k1$h
            r5.<init>()
            uf.y$e r2 = new uf.y$e
            r2.<init>(r5)
            r0.R = r5     // Catch:{ a -> 0x0057 }
            r0.S = r2     // Catch:{ a -> 0x0057 }
            r0.U = r3     // Catch:{ a -> 0x0057 }
            java.lang.Object r4 = r4.a(r2, r0)     // Catch:{ a -> 0x0057 }
            if (r4 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r0 = r5
            goto L_0x005e
        L_0x0057:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x005b:
            vf.q.b(r5, r4)
        L_0x005e:
            T r4 = r0.O
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.y.c(uf.i, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object d(@fh.g uf.i<? extends T> r4, @fh.g we.p<? super T, ? super ie.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @fh.g ie.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof uf.y.h
            if (r0 == 0) goto L_0x0013
            r0 = r6
            uf.y$h r0 = (uf.y.h) r0
            int r1 = r0.U
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.U = r1
            goto L_0x0018
        L_0x0013:
            uf.y$h r0 = new uf.y$h
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.T
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.U
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.S
            uf.y$f r4 = (uf.y.f) r4
            java.lang.Object r5 = r0.R
            xe.k1$h r5 = (xe.k1.h) r5
            zd.e1.n(r6)     // Catch:{ a -> 0x0031 }
            goto L_0x005e
        L_0x0031:
            r6 = move-exception
            goto L_0x005b
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            zd.e1.n(r6)
            xe.k1$h r6 = new xe.k1$h
            r6.<init>()
            uf.y$f r2 = new uf.y$f
            r2.<init>(r5, r6)
            r0.R = r6     // Catch:{ a -> 0x0057 }
            r0.S = r2     // Catch:{ a -> 0x0057 }
            r0.U = r3     // Catch:{ a -> 0x0057 }
            java.lang.Object r4 = r4.a(r2, r0)     // Catch:{ a -> 0x0057 }
            if (r4 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r5 = r6
            goto L_0x005e
        L_0x0057:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L_0x005b:
            vf.q.b(r6, r4)
        L_0x005e:
            T r4 = r5.O
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.y.d(uf.i, we.p, ie.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [R, T] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> java.lang.Object e(@fh.g uf.i<? extends T> r4, R r5, @fh.g we.q<? super R, ? super T, ? super ie.d<? super R>, ? extends java.lang.Object> r6, @fh.g ie.d<? super R> r7) {
        /*
            boolean r0 = r7 instanceof uf.y.i
            if (r0 == 0) goto L_0x0013
            r0 = r7
            uf.y$i r0 = (uf.y.i) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            uf.y$i r0 = new uf.y$i
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.R
            xe.k1$h r4 = (xe.k1.h) r4
            zd.e1.n(r7)
            goto L_0x0050
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            zd.e1.n(r7)
            xe.k1$h r7 = new xe.k1$h
            r7.<init>()
            r7.O = r5
            uf.y$j r5 = new uf.y$j
            r5.<init>(r7, r6)
            r0.R = r7
            r0.T = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = r7
        L_0x0050:
            T r4 = r4.O
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.y.e(uf.i, java.lang.Object, we.q, ie.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [R, T] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> java.lang.Object f(uf.i<? extends T> r1, R r2, we.q<? super R, ? super T, ? super ie.d<? super R>, ? extends java.lang.Object> r3, ie.d<? super R> r4) {
        /*
            xe.k1$h r0 = new xe.k1$h
            r0.<init>()
            r0.O = r2
            uf.y$j r2 = new uf.y$j
            r2.<init>(r0, r3)
            r3 = 0
            xe.i0.e(r3)
            r1.a(r2, r4)
            r1 = 1
            xe.i0.e(r1)
            T r1 = r0.O
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.y.f(uf.i, java.lang.Object, we.q, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object g(@fh.g uf.i<? extends T> r4, @fh.g ie.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof uf.y.k
            if (r0 == 0) goto L_0x0013
            r0 = r5
            uf.y$k r0 = (uf.y.k) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            uf.y$k r0 = new uf.y$k
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.R
            xe.k1$h r4 = (xe.k1.h) r4
            zd.e1.n(r5)
            goto L_0x0052
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            zd.e1.n(r5)
            xe.k1$h r5 = new xe.k1$h
            r5.<init>()
            wf.r0 r2 = vf.u.f23630a
            r5.O = r2
            uf.y$l r2 = new uf.y$l
            r2.<init>(r5)
            r0.R = r5
            r0.T = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r4 = r5
        L_0x0052:
            T r4 = r4.O
            wf.r0 r5 = vf.u.f23630a
            if (r4 == r5) goto L_0x0059
            return r4
        L_0x0059:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.y.g(uf.i, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object h(@fh.g uf.i<? extends T> r4, @fh.g ie.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof uf.y.m
            if (r0 == 0) goto L_0x0013
            r0 = r5
            uf.y$m r0 = (uf.y.m) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            uf.y$m r0 = new uf.y$m
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.R
            xe.k1$h r4 = (xe.k1.h) r4
            zd.e1.n(r5)
            goto L_0x004e
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            zd.e1.n(r5)
            xe.k1$h r5 = new xe.k1$h
            r5.<init>()
            uf.y$n r2 = new uf.y$n
            r2.<init>(r5)
            r0.R = r5
            r0.T = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r4 = r5
        L_0x004e:
            T r4 = r4.O
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.y.h(uf.i, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> java.lang.Object i(@fh.g uf.i<? extends T> r4, @fh.g we.q<? super S, ? super T, ? super ie.d<? super S>, ? extends java.lang.Object> r5, @fh.g ie.d<? super S> r6) {
        /*
            boolean r0 = r6 instanceof uf.y.o
            if (r0 == 0) goto L_0x0013
            r0 = r6
            uf.y$o r0 = (uf.y.o) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            uf.y$o r0 = new uf.y$o
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.R
            xe.k1$h r4 = (xe.k1.h) r4
            zd.e1.n(r6)
            goto L_0x0052
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            zd.e1.n(r6)
            xe.k1$h r6 = new xe.k1$h
            r6.<init>()
            wf.r0 r2 = vf.u.f23630a
            r6.O = r2
            uf.y$p r2 = new uf.y$p
            r2.<init>(r6, r5)
            r0.R = r6
            r0.T = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r4 = r6
        L_0x0052:
            T r4 = r4.O
            wf.r0 r5 = vf.u.f23630a
            if (r4 == r5) goto L_0x0059
            return r4
        L_0x0059:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Empty flow can't be reduced"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.y.i(uf.i, we.q, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object j(@fh.g uf.i<? extends T> r4, @fh.g ie.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof uf.y.q
            if (r0 == 0) goto L_0x0013
            r0 = r5
            uf.y$q r0 = (uf.y.q) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            uf.y$q r0 = new uf.y$q
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.R
            xe.k1$h r4 = (xe.k1.h) r4
            zd.e1.n(r5)
            goto L_0x0052
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            zd.e1.n(r5)
            xe.k1$h r5 = new xe.k1$h
            r5.<init>()
            wf.r0 r2 = vf.u.f23630a
            r5.O = r2
            uf.y$r r2 = new uf.y$r
            r2.<init>(r5)
            r0.R = r5
            r0.T = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r4 = r5
        L_0x0052:
            T r4 = r4.O
            wf.r0 r5 = vf.u.f23630a
            if (r4 == r5) goto L_0x0059
            return r4
        L_0x0059:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.y.j(uf.i, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object k(@fh.g uf.i<? extends T> r4, @fh.g ie.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof uf.y.t
            if (r0 == 0) goto L_0x0013
            r0 = r5
            uf.y$t r0 = (uf.y.t) r0
            int r1 = r0.U
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.U = r1
            goto L_0x0018
        L_0x0013:
            uf.y$t r0 = new uf.y$t
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.T
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.U
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.S
            uf.y$s r4 = (uf.y.s) r4
            java.lang.Object r0 = r0.R
            xe.k1$h r0 = (xe.k1.h) r0
            zd.e1.n(r5)     // Catch:{ a -> 0x0031 }
            goto L_0x0062
        L_0x0031:
            r5 = move-exception
            goto L_0x005f
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            zd.e1.n(r5)
            xe.k1$h r5 = new xe.k1$h
            r5.<init>()
            wf.r0 r2 = vf.u.f23630a
            r5.O = r2
            uf.y$s r2 = new uf.y$s
            r2.<init>(r5)
            r0.R = r5     // Catch:{ a -> 0x005b }
            r0.S = r2     // Catch:{ a -> 0x005b }
            r0.U = r3     // Catch:{ a -> 0x005b }
            java.lang.Object r4 = r4.a(r2, r0)     // Catch:{ a -> 0x005b }
            if (r4 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r5
            goto L_0x0062
        L_0x005b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x005f:
            vf.q.b(r5, r4)
        L_0x0062:
            T r4 = r0.O
            wf.r0 r5 = vf.u.f23630a
            if (r4 != r5) goto L_0x0069
            r4 = 0
        L_0x0069:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.y.k(uf.i, ie.d):java.lang.Object");
    }
}

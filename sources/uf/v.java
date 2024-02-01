package uf;

import kotlin.Metadata;
import le.o;
import we.p;
import we.q;
import xe.k1;
import zd.e1;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a+\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aJ\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000b\u001ar\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00012D\b\u0001\u0010\u0018\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0014¢\u0006\u0002\b\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aX\u0010\u001b\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005HHø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"T", "Luf/i;", "", "count", "d", "Lkotlin/Function2;", "Lie/d;", "", "", "predicate", "e", "(Luf/i;Lwe/p;)Luf/i;", "g", "Luf/j;", "value", "Lzd/u2;", "f", "(Luf/j;Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "h", "R", "Lkotlin/Function3;", "Lzd/v0;", "name", "Lzd/u;", "transform", "i", "(Luf/i;Lwe/q;)Luf/i;", "b", "(Luf/i;Lwe/p;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class v {

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {136}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class a<T> extends le.d {
        public Object R;
        public /* synthetic */ Object S;
        public int T;

        public a(ie.d<? super a> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.S = obj;
            this.T |= Integer.MIN_VALUE;
            return v.b((i) null, (p) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"uf/v$b", "Luf/j;", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b implements j<T> {
        public final /* synthetic */ p<T, ie.d<? super Boolean>, Object> O;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {130}, m = "emit", n = {"this"}, s = {"L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class a extends le.d {
            public Object R;
            public /* synthetic */ Object S;
            public final /* synthetic */ b T;
            public int U;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, ie.d<? super a> dVar) {
                super(dVar);
                this.T = bVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.S = obj;
                this.U |= Integer.MIN_VALUE;
                return this.T.d(null, this);
            }
        }

        public b(p<? super T, ? super ie.d<? super Boolean>, ? extends Object> pVar) {
            this.O = pVar;
        }

        @fh.h
        public Object a(T t10, @fh.g ie.d<? super u2> dVar) {
            xe.i0.e(4);
            new a(this, dVar);
            xe.i0.e(5);
            if (((Boolean) this.O.g0(t10, dVar)).booleanValue()) {
                return u2.f25116a;
            }
            throw new vf.a(this);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object d(T r5, @fh.g ie.d<? super zd.u2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof uf.v.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                uf.v$b$a r0 = (uf.v.b.a) r0
                int r1 = r0.U
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.U = r1
                goto L_0x0018
            L_0x0013:
                uf.v$b$a r0 = new uf.v$b$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.S
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.U
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r5 = r0.R
                uf.v$b r5 = (uf.v.b) r5
                zd.e1.n(r6)
                goto L_0x0046
            L_0x002d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0035:
                zd.e1.n(r6)
                we.p<T, ie.d<? super java.lang.Boolean>, java.lang.Object> r6 = r4.O
                r0.R = r4
                r0.U = r3
                java.lang.Object r6 = r6.g0(r5, r0)
                if (r6 != r1) goto L_0x0045
                return r1
            L_0x0045:
                r5 = r4
            L_0x0046:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L_0x0051
                zd.u2 r5 = zd.u2.f25116a
                return r5
            L_0x0051:
                vf.a r6 = new vf.a
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.v.b.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c implements i<T> {
        public final /* synthetic */ i O;
        public final /* synthetic */ int P;

        public c(i iVar, int i10) {
            this.O = iVar;
            this.P = i10;
        }

        @fh.h
        public Object a(@fh.g j<? super T> jVar, @fh.g ie.d<? super u2> dVar) {
            Object a10 = this.O.a(new d(new k1.f(), this.P, jVar), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class d<T> implements j {
        public final /* synthetic */ k1.f O;
        public final /* synthetic */ int P;
        public final /* synthetic */ j<T> Q;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public final /* synthetic */ d<T> S;
            public int T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(d<? super T> dVar, ie.d<? super a> dVar2) {
                super(dVar2);
                this.S = dVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.T |= Integer.MIN_VALUE;
                return this.S.d(null, this);
            }
        }

        public d(k1.f fVar, int i10, j<? super T> jVar) {
            this.O = fVar;
            this.P = i10;
            this.Q = jVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(T r6, @fh.g ie.d<? super zd.u2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof uf.v.d.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                uf.v$d$a r0 = (uf.v.d.a) r0
                int r1 = r0.T
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.T = r1
                goto L_0x0018
            L_0x0013:
                uf.v$d$a r0 = new uf.v$d$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.T
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                zd.e1.n(r7)
                goto L_0x0047
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                zd.e1.n(r7)
                xe.k1$f r7 = r5.O
                int r2 = r7.O
                int r4 = r5.P
                if (r2 < r4) goto L_0x004a
                uf.j<T> r7 = r5.Q
                r0.T = r3
                java.lang.Object r6 = r7.d(r6, r0)
                if (r6 != r1) goto L_0x0047
                return r1
            L_0x0047:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            L_0x004a:
                int r2 = r2 + r3
                r7.O = r2
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.v.d.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e implements i<T> {
        public final /* synthetic */ i O;
        public final /* synthetic */ p P;

        public e(i iVar, p pVar) {
            this.O = iVar;
            this.P = pVar;
        }

        @fh.h
        public Object a(@fh.g j<? super T> jVar, @fh.g ie.d<? super u2> dVar) {
            Object a10 = this.O.a(new f(new k1.a(), jVar, this.P), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class f<T> implements j {
        public final /* synthetic */ k1.a O;
        public final /* synthetic */ j<T> P;
        public final /* synthetic */ p<T, ie.d<? super Boolean>, Object> Q;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {37, 38, 40}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public Object R;
            public Object S;
            public /* synthetic */ Object T;
            public final /* synthetic */ f<T> U;
            public int V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(f<? super T> fVar, ie.d<? super a> dVar) {
                super(dVar);
                this.U = fVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.T = obj;
                this.V |= Integer.MIN_VALUE;
                return this.U.d(null, this);
            }
        }

        public f(k1.a aVar, j<? super T> jVar, p<? super T, ? super ie.d<? super Boolean>, ? extends Object> pVar) {
            this.O = aVar;
            this.P = jVar;
            this.Q = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(T r7, @fh.g ie.d<? super zd.u2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof uf.v.f.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                uf.v$f$a r0 = (uf.v.f.a) r0
                int r1 = r0.V
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.V = r1
                goto L_0x0018
            L_0x0013:
                uf.v$f$a r0 = new uf.v$f$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.T
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.V
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0045
                if (r2 == r5) goto L_0x0041
                if (r2 == r4) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                zd.e1.n(r8)
                goto L_0x0088
            L_0x002f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0037:
                java.lang.Object r7 = r0.S
                java.lang.Object r2 = r0.R
                uf.v$f r2 = (uf.v.f) r2
                zd.e1.n(r8)
                goto L_0x006c
            L_0x0041:
                zd.e1.n(r8)
                goto L_0x0059
            L_0x0045:
                zd.e1.n(r8)
                xe.k1$a r8 = r6.O
                boolean r8 = r8.O
                if (r8 == 0) goto L_0x005c
                uf.j<T> r8 = r6.P
                r0.V = r5
                java.lang.Object r7 = r8.d(r7, r0)
                if (r7 != r1) goto L_0x0059
                return r1
            L_0x0059:
                zd.u2 r7 = zd.u2.f25116a
                return r7
            L_0x005c:
                we.p<T, ie.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.Q
                r0.R = r6
                r0.S = r7
                r0.V = r4
                java.lang.Object r8 = r8.g0(r7, r0)
                if (r8 != r1) goto L_0x006b
                return r1
            L_0x006b:
                r2 = r6
            L_0x006c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L_0x008b
                xe.k1$a r8 = r2.O
                r8.O = r5
                uf.j<T> r8 = r2.P
                r2 = 0
                r0.R = r2
                r0.S = r2
                r0.V = r3
                java.lang.Object r7 = r8.d(r7, r0)
                if (r7 != r1) goto L_0x0088
                return r1
            L_0x0088:
                zd.u2 r7 = zd.u2.f25116a
                return r7
            L_0x008b:
                zd.u2 r7 = zd.u2.f25116a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.v.f.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {73}, m = "emitAbort$FlowKt__LimitKt", n = {"$this$emitAbort"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class g<T> extends le.d {
        public Object R;
        public /* synthetic */ Object S;
        public int T;

        public g(ie.d<? super g> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.S = obj;
            this.T |= Integer.MIN_VALUE;
            return v.f((j) null, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class h implements i<T> {
        public final /* synthetic */ i O;
        public final /* synthetic */ int P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {115}, m = "collect", n = {"$this$take_u24lambda_u2d4"}, s = {"L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ h T;
            public Object U;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(h hVar, ie.d dVar) {
                super(dVar);
                this.T = hVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        public h(i iVar, int i10) {
            this.O = iVar;
            this.P = i10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super T> r7, @fh.g ie.d<? super zd.u2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof uf.v.h.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                uf.v$h$a r0 = (uf.v.h.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.v$h$a r0 = new uf.v$h$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r7 = r0.U
                uf.j r7 = (uf.j) r7
                zd.e1.n(r8)     // Catch:{ a -> 0x0051 }
                goto L_0x0055
            L_0x002d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0035:
                zd.e1.n(r8)
                xe.k1$f r8 = new xe.k1$f
                r8.<init>()
                uf.i r2 = r6.O     // Catch:{ a -> 0x0051 }
                uf.v$i r4 = new uf.v$i     // Catch:{ a -> 0x0051 }
                int r5 = r6.P     // Catch:{ a -> 0x0051 }
                r4.<init>(r8, r5, r7)     // Catch:{ a -> 0x0051 }
                r0.U = r7     // Catch:{ a -> 0x0051 }
                r0.S = r3     // Catch:{ a -> 0x0051 }
                java.lang.Object r7 = r2.a(r4, r0)     // Catch:{ a -> 0x0051 }
                if (r7 != r1) goto L_0x0055
                return r1
            L_0x0051:
                r8 = move-exception
                vf.q.b(r8, r7)
            L_0x0055:
                zd.u2 r7 = zd.u2.f25116a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.v.h.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class i<T> implements j {
        public final /* synthetic */ k1.f O;
        public final /* synthetic */ int P;
        public final /* synthetic */ j<T> Q;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {61, 63}, m = "emit", n = {}, s = {})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public final /* synthetic */ i<T> S;
            public int T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(i<? super T> iVar, ie.d<? super a> dVar) {
                super(dVar);
                this.S = iVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.T |= Integer.MIN_VALUE;
                return this.S.d(null, this);
            }
        }

        public i(k1.f fVar, int i10, j<? super T> jVar) {
            this.O = fVar;
            this.P = i10;
            this.Q = jVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(T r6, @fh.g ie.d<? super zd.u2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof uf.v.i.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                uf.v$i$a r0 = (uf.v.i.a) r0
                int r1 = r0.T
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.T = r1
                goto L_0x0018
            L_0x0013:
                uf.v$i$a r0 = new uf.v$i$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.T
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                zd.e1.n(r7)
                goto L_0x005f
            L_0x002c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0034:
                zd.e1.n(r7)
                goto L_0x0051
            L_0x0038:
                zd.e1.n(r7)
                xe.k1$f r7 = r5.O
                int r2 = r7.O
                int r2 = r2 + r4
                r7.O = r2
                int r7 = r5.P
                if (r2 >= r7) goto L_0x0054
                uf.j<T> r7 = r5.Q
                r0.T = r4
                java.lang.Object r6 = r7.d(r6, r0)
                if (r6 != r1) goto L_0x0051
                return r1
            L_0x0051:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            L_0x0054:
                uf.j<T> r7 = r5.Q
                r0.T = r3
                java.lang.Object r6 = uf.v.f(r7, r6, r0)
                if (r6 != r1) goto L_0x005f
                return r1
            L_0x005f:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.v.i.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class j implements i<T> {
        public final /* synthetic */ i O;
        public final /* synthetic */ p P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {124}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ j T;
            public Object U;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(j jVar, ie.d dVar) {
                super(dVar);
                this.T = jVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        public j(i iVar, p pVar) {
            this.O = iVar;
            this.P = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super T> r6, @fh.g ie.d<? super zd.u2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof uf.v.j.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                uf.v$j$a r0 = (uf.v.j.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.v$j$a r0 = new uf.v$j$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r6 = r0.U
                uf.v$k r6 = (uf.v.k) r6
                zd.e1.n(r7)     // Catch:{ a -> 0x002d }
                goto L_0x0053
            L_0x002d:
                r7 = move-exception
                goto L_0x0050
            L_0x002f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0037:
                zd.e1.n(r7)
                uf.i r7 = r5.O
                uf.v$k r2 = new uf.v$k
                we.p r4 = r5.P
                r2.<init>(r4, r6)
                r0.U = r2     // Catch:{ a -> 0x004e }
                r0.S = r3     // Catch:{ a -> 0x004e }
                java.lang.Object r6 = r7.a(r2, r0)     // Catch:{ a -> 0x004e }
                if (r6 != r1) goto L_0x0053
                return r1
            L_0x004e:
                r7 = move-exception
                r6 = r2
            L_0x0050:
                vf.q.b(r7, r6)
            L_0x0053:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.v.j.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"uf/v$b", "Luf/j;", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class k implements j<T> {
        public final /* synthetic */ p O;
        public final /* synthetic */ j P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {142, 143}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public Object R;
            public /* synthetic */ Object S;
            public int T;
            public final /* synthetic */ k U;
            public Object V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(k kVar, ie.d dVar) {
                super(dVar);
                this.U = kVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.S = obj;
                this.T |= Integer.MIN_VALUE;
                return this.U.d(null, this);
            }
        }

        public k(p pVar, j jVar) {
            this.O = pVar;
            this.P = jVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object d(T r8, @fh.g ie.d<? super zd.u2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof uf.v.k.a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                uf.v$k$a r0 = (uf.v.k.a) r0
                int r1 = r0.T
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.T = r1
                goto L_0x0018
            L_0x0013:
                uf.v$k$a r0 = new uf.v$k$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.S
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.T
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r8 = r0.R
                uf.v$k r8 = (uf.v.k) r8
                zd.e1.n(r9)
                goto L_0x007c
            L_0x0030:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0038:
                java.lang.Object r8 = r0.V
                java.lang.Object r2 = r0.R
                uf.v$k r2 = (uf.v.k) r2
                zd.e1.n(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L_0x0063
            L_0x0046:
                zd.e1.n(r9)
                we.p r9 = r7.O
                r0.R = r7
                r0.V = r8
                r0.T = r4
                r2 = 6
                xe.i0.e(r2)
                java.lang.Object r9 = r9.g0(r8, r0)
                r2 = 7
                xe.i0.e(r2)
                if (r9 != r1) goto L_0x0060
                return r1
            L_0x0060:
                r2 = r9
                r9 = r8
                r8 = r7
            L_0x0063:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x007b
                uf.j r2 = r8.P
                r0.R = r8
                r5 = 0
                r0.V = r5
                r0.T = r3
                java.lang.Object r9 = r2.d(r9, r0)
                if (r9 != r1) goto L_0x007c
                return r1
            L_0x007b:
                r4 = 0
            L_0x007c:
                if (r4 == 0) goto L_0x0081
                zd.u2 r8 = zd.u2.f25116a
                return r8
            L_0x0081:
                vf.a r9 = new vf.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.v.k.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, d2 = {"T", "R", "Luf/j;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class l extends o implements p<j<? super R>, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ i<T> U;
        public final /* synthetic */ q<j<? super R>, T, ie.d<? super Boolean>, Object> V;

        @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"uf/v$b", "Luf/j;", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        public static final class a implements j<T> {
            public final /* synthetic */ q O;
            public final /* synthetic */ j P;

            @le.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", i = {0}, l = {142}, m = "emit", n = {"this"}, s = {"L$0"})
            @i0(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: uf.v$l$a$a  reason: collision with other inner class name */
            public static final class C0447a extends le.d {
                public Object R;
                public /* synthetic */ Object S;
                public int T;
                public final /* synthetic */ a U;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0447a(a aVar, ie.d dVar) {
                    super(dVar);
                    this.U = aVar;
                }

                @fh.h
                public final Object K(@fh.g Object obj) {
                    this.S = obj;
                    this.T |= Integer.MIN_VALUE;
                    return this.U.d(null, this);
                }
            }

            public a(q qVar, j jVar) {
                this.O = qVar;
                this.P = jVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object d(T r5, @fh.g ie.d<? super zd.u2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof uf.v.l.a.C0447a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    uf.v$l$a$a r0 = (uf.v.l.a.C0447a) r0
                    int r1 = r0.T
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.T = r1
                    goto L_0x0018
                L_0x0013:
                    uf.v$l$a$a r0 = new uf.v$l$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.S
                    java.lang.Object r1 = ke.d.h()
                    int r2 = r0.T
                    r3 = 1
                    if (r2 == 0) goto L_0x0035
                    if (r2 != r3) goto L_0x002d
                    java.lang.Object r5 = r0.R
                    uf.v$l$a r5 = (uf.v.l.a) r5
                    zd.e1.n(r6)
                    goto L_0x0050
                L_0x002d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0035:
                    zd.e1.n(r6)
                    we.q r6 = r4.O
                    uf.j r2 = r4.P
                    r0.R = r4
                    r0.T = r3
                    r3 = 6
                    xe.i0.e(r3)
                    java.lang.Object r6 = r6.y(r2, r5, r0)
                    r5 = 7
                    xe.i0.e(r5)
                    if (r6 != r1) goto L_0x004f
                    return r1
                L_0x004f:
                    r5 = r4
                L_0x0050:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L_0x005b
                    zd.u2 r5 = zd.u2.f25116a
                    return r5
                L_0x005b:
                    vf.a r6 = new vf.a
                    r6.<init>(r5)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.v.l.a.d(java.lang.Object, ie.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(i<? extends T> iVar, q<? super j<? super R>, ? super T, ? super ie.d<? super Boolean>, ? extends Object> qVar, ie.d<? super l> dVar) {
            super(2, dVar);
            this.U = iVar;
            this.V = qVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            l lVar = new l(this.U, this.V, dVar);
            lVar.T = obj;
            return lVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            a aVar;
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                i<T> iVar = this.U;
                a aVar2 = new a(this.V, (j) this.T);
                try {
                    this.T = aVar2;
                    this.S = 1;
                    if (iVar.a(aVar2, this) == h10) {
                        return h10;
                    }
                } catch (vf.a e10) {
                    e = e10;
                    aVar = aVar2;
                    vf.q.b(e, aVar);
                    return u2.f25116a;
                }
            } else if (i10 == 1) {
                aVar = (a) this.T;
                try {
                    e1.n(obj);
                } catch (vf.a e11) {
                    e = e11;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g j<? super R> jVar, @fh.h ie.d<? super u2> dVar) {
            return ((l) H(jVar, dVar)).K(u2.f25116a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object b(@fh.g uf.i<? extends T> r4, @fh.g we.p<? super T, ? super ie.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @fh.g ie.d<? super zd.u2> r6) {
        /*
            boolean r0 = r6 instanceof uf.v.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            uf.v$a r0 = (uf.v.a) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            uf.v$a r0 = new uf.v$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r4 = r0.R
            uf.v$b r4 = (uf.v.b) r4
            zd.e1.n(r6)     // Catch:{ a -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r5 = move-exception
            goto L_0x004c
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            zd.e1.n(r6)
            uf.v$b r6 = new uf.v$b
            r6.<init>(r5)
            r0.R = r6     // Catch:{ a -> 0x004a }
            r0.T = r3     // Catch:{ a -> 0x004a }
            java.lang.Object r4 = r4.a(r6, r0)     // Catch:{ a -> 0x004a }
            if (r4 != r1) goto L_0x004f
            return r1
        L_0x004a:
            r5 = move-exception
            r4 = r6
        L_0x004c:
            vf.q.b(r5, r4)
        L_0x004f:
            zd.u2 r4 = zd.u2.f25116a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.v.b(uf.i, we.p, ie.d):java.lang.Object");
    }

    public static final <T> Object c(i<? extends T> iVar, p<? super T, ? super ie.d<? super Boolean>, ? extends Object> pVar, ie.d<? super u2> dVar) {
        b bVar = new b(pVar);
        try {
            xe.i0.e(0);
            iVar.a(bVar, dVar);
            xe.i0.e(1);
        } catch (vf.a e10) {
            vf.q.b(e10, bVar);
        }
        return u2.f25116a;
    }

    @fh.g
    public static final <T> i<T> d(@fh.g i<? extends T> iVar, int i10) {
        if (i10 >= 0) {
            return new c(iVar, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    @fh.g
    public static final <T> i<T> e(@fh.g i<? extends T> iVar, @fh.g p<? super T, ? super ie.d<? super Boolean>, ? extends Object> pVar) {
        return new e(iVar, pVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object f(uf.j<? super T> r4, T r5, ie.d<? super zd.u2> r6) {
        /*
            boolean r0 = r6 instanceof uf.v.g
            if (r0 == 0) goto L_0x0013
            r0 = r6
            uf.v$g r0 = (uf.v.g) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            uf.v$g r0 = new uf.v$g
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            java.lang.Object r4 = r0.R
            uf.j r4 = (uf.j) r4
            zd.e1.n(r6)
            goto L_0x0043
        L_0x0035:
            zd.e1.n(r6)
            r0.R = r4
            r0.T = r3
            java.lang.Object r5 = r4.d(r5, r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            vf.a r5 = new vf.a
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.v.f(uf.j, java.lang.Object, ie.d):java.lang.Object");
    }

    @fh.g
    public static final <T> i<T> g(@fh.g i<? extends T> iVar, int i10) {
        if (i10 > 0) {
            return new h(iVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    @fh.g
    public static final <T> i<T> h(@fh.g i<? extends T> iVar, @fh.g p<? super T, ? super ie.d<? super Boolean>, ? extends Object> pVar) {
        return new j(iVar, pVar);
    }

    @fh.g
    public static final <T, R> i<R> i(@fh.g i<? extends T> iVar, @fh.g @zd.b q<? super j<? super R>, ? super T, ? super ie.d<? super Boolean>, ? extends Object> qVar) {
        return k.I0(new l(iVar, qVar, (ie.d<? super l>) null));
    }
}

package uf;

import kotlin.Metadata;
import le.o;
import we.p;
import we.q;
import xe.k1;
import zd.a1;
import zd.e1;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\u001au\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001au\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001aU\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001al\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000e\u001aU\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u0010\u0010\u0018\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0004H\u0000\u001as\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"T", "R", "Luf/i;", "Lkotlin/Function3;", "Luf/j;", "Lzd/v0;", "name", "value", "Lie/d;", "Lzd/u2;", "", "Lzd/u;", "transform", "g", "(Luf/i;Lwe/q;)Luf/i;", "h", "Lkotlin/Function2;", "action", "f", "(Luf/i;Lwe/p;)Luf/i;", "", "cause", "d", "e", "b", "c", "(Luf/j;Lwe/q;Ljava/lang/Throwable;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class t {

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {216}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
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
            return t.c((j) null, (q) null, (Throwable) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b implements i<T> {
        public final /* synthetic */ i O;
        public final /* synthetic */ q P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {114, 121, 128}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u2d2", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ b T;
            public Object U;
            public Object V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, ie.d dVar) {
                super(dVar);
                this.T = bVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        public b(i iVar, q qVar) {
            this.O = iVar;
            this.P = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super T> r9, @fh.g ie.d<? super zd.u2> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof uf.t.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r10
                uf.t$b$a r0 = (uf.t.b.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.t$b$a r0 = new uf.t$b$a
                r0.<init>(r8, r10)
            L_0x0018:
                java.lang.Object r10 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0054
                if (r2 == r5) goto L_0x0046
                if (r2 == r4) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r9 = r0.U
                vf.v r9 = (vf.v) r9
                zd.e1.n(r10)     // Catch:{ all -> 0x0034 }
                goto L_0x0088
            L_0x0034:
                r10 = move-exception
                goto L_0x0092
            L_0x0036:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L_0x003e:
                java.lang.Object r9 = r0.U
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                zd.e1.n(r10)
                goto L_0x00ac
            L_0x0046:
                java.lang.Object r9 = r0.V
                uf.j r9 = (uf.j) r9
                java.lang.Object r2 = r0.U
                uf.t$b r2 = (uf.t.b) r2
                zd.e1.n(r10)     // Catch:{ all -> 0x0052 }
                goto L_0x0067
            L_0x0052:
                r9 = move-exception
                goto L_0x0098
            L_0x0054:
                zd.e1.n(r10)
                uf.i r10 = r8.O     // Catch:{ all -> 0x0096 }
                r0.U = r8     // Catch:{ all -> 0x0096 }
                r0.V = r9     // Catch:{ all -> 0x0096 }
                r0.S = r5     // Catch:{ all -> 0x0096 }
                java.lang.Object r10 = r10.a(r9, r0)     // Catch:{ all -> 0x0096 }
                if (r10 != r1) goto L_0x0066
                return r1
            L_0x0066:
                r2 = r8
            L_0x0067:
                vf.v r10 = new vf.v
                ie.g r4 = r0.e()
                r10.<init>(r9, r4)
                we.q r9 = r2.P     // Catch:{ all -> 0x008e }
                r0.U = r10     // Catch:{ all -> 0x008e }
                r0.V = r6     // Catch:{ all -> 0x008e }
                r0.S = r3     // Catch:{ all -> 0x008e }
                r2 = 6
                xe.i0.e(r2)     // Catch:{ all -> 0x008e }
                java.lang.Object r9 = r9.y(r10, r6, r0)     // Catch:{ all -> 0x008e }
                r0 = 7
                xe.i0.e(r0)     // Catch:{ all -> 0x008e }
                if (r9 != r1) goto L_0x0087
                return r1
            L_0x0087:
                r9 = r10
            L_0x0088:
                r9.L()
                zd.u2 r9 = zd.u2.f25116a
                return r9
            L_0x008e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L_0x0092:
                r9.L()
                throw r10
            L_0x0096:
                r9 = move-exception
                r2 = r8
            L_0x0098:
                uf.z0 r10 = new uf.z0
                r10.<init>(r9)
                we.q r2 = r2.P
                r0.U = r9
                r0.V = r6
                r0.S = r4
                java.lang.Object r10 = uf.t.c(r10, r2, r9, r0)
                if (r10 != r1) goto L_0x00ac
                return r1
            L_0x00ac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.t.b.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c implements i<T> {
        public final /* synthetic */ i O;
        public final /* synthetic */ p P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {114, 122}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u2d3", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ c T;
            public Object U;
            public Object V;
            public Object W;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(c cVar, ie.d dVar) {
                super(dVar);
                this.T = cVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        public c(i iVar, p pVar) {
            this.O = iVar;
            this.P = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super T> r7, @fh.g ie.d<? super zd.u2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof uf.t.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                uf.t$c$a r0 = (uf.t.c.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.t$c$a r0 = new uf.t$c$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x004a
                if (r2 == r4) goto L_0x003a
                if (r2 != r3) goto L_0x0032
                java.lang.Object r7 = r0.U
                vf.v r7 = (vf.v) r7
                zd.e1.n(r8)     // Catch:{ all -> 0x0030 }
                goto L_0x0094
            L_0x0030:
                r8 = move-exception
                goto L_0x0098
            L_0x0032:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x003a:
                java.lang.Object r7 = r0.W
                xe.k1$a r7 = (xe.k1.a) r7
                java.lang.Object r2 = r0.V
                uf.j r2 = (uf.j) r2
                java.lang.Object r4 = r0.U
                uf.t$c r4 = (uf.t.c) r4
                zd.e1.n(r8)
                goto L_0x006d
            L_0x004a:
                zd.e1.n(r8)
                xe.k1$a r8 = new xe.k1$a
                r8.<init>()
                r8.O = r4
                uf.i r2 = r6.O
                uf.t$d r5 = new uf.t$d
                r5.<init>(r8, r7)
                r0.U = r6
                r0.V = r7
                r0.W = r8
                r0.S = r4
                java.lang.Object r2 = r2.a(r5, r0)
                if (r2 != r1) goto L_0x006a
                return r1
            L_0x006a:
                r4 = r6
                r2 = r7
                r7 = r8
            L_0x006d:
                boolean r7 = r7.O
                if (r7 == 0) goto L_0x009c
                vf.v r7 = new vf.v
                ie.g r8 = r0.e()
                r7.<init>(r2, r8)
                we.p r8 = r4.P     // Catch:{ all -> 0x0030 }
                r0.U = r7     // Catch:{ all -> 0x0030 }
                r2 = 0
                r0.V = r2     // Catch:{ all -> 0x0030 }
                r0.W = r2     // Catch:{ all -> 0x0030 }
                r0.S = r3     // Catch:{ all -> 0x0030 }
                r2 = 6
                xe.i0.e(r2)     // Catch:{ all -> 0x0030 }
                java.lang.Object r8 = r8.g0(r7, r0)     // Catch:{ all -> 0x0030 }
                r0 = 7
                xe.i0.e(r0)     // Catch:{ all -> 0x0030 }
                if (r8 != r1) goto L_0x0094
                return r1
            L_0x0094:
                r7.L()
                goto L_0x009c
            L_0x0098:
                r7.L()
                throw r8
            L_0x009c:
                zd.u2 r7 = zd.u2.f25116a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.t.c.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class d<T> implements j {
        public final /* synthetic */ k1.a O;
        public final /* synthetic */ j<T> P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", i = {}, l = {185}, m = "emit", n = {}, s = {})
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

        public d(k1.a aVar, j<? super T> jVar) {
            this.O = aVar;
            this.P = jVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(T r5, @fh.g ie.d<? super zd.u2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof uf.t.d.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                uf.t$d$a r0 = (uf.t.d.a) r0
                int r1 = r0.T
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.T = r1
                goto L_0x0018
            L_0x0013:
                uf.t$d$a r0 = new uf.t$d$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.T
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                zd.e1.n(r6)
                goto L_0x0044
            L_0x0029:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0031:
                zd.e1.n(r6)
                xe.k1$a r6 = r4.O
                r2 = 0
                r6.O = r2
                uf.j<T> r6 = r4.P
                r0.T = r3
                java.lang.Object r5 = r6.d(r5, r0)
                if (r5 != r1) goto L_0x0044
                return r1
            L_0x0044:
                zd.u2 r5 = zd.u2.f25116a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.t.d.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e implements i<T> {
        public final /* synthetic */ p O;
        public final /* synthetic */ i P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {116, 120}, m = "collect", n = {"this", "$this$onStart_u24lambda_u2d1", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ e T;
            public Object U;
            public Object V;
            public Object W;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(e eVar, ie.d dVar) {
                super(dVar);
                this.T = eVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        public e(p pVar, i iVar) {
            this.O = pVar;
            this.P = iVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0082 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super T> r7, @fh.g ie.d<? super zd.u2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof uf.t.e.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                uf.t$e$a r0 = (uf.t.e.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.t$e$a r0 = new uf.t$e$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                zd.e1.n(r8)
                goto L_0x0083
            L_0x002c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0034:
                java.lang.Object r7 = r0.W
                vf.v r7 = (vf.v) r7
                java.lang.Object r2 = r0.V
                uf.j r2 = (uf.j) r2
                java.lang.Object r4 = r0.U
                uf.t$e r4 = (uf.t.e) r4
                zd.e1.n(r8)     // Catch:{ all -> 0x0044 }
                goto L_0x006e
            L_0x0044:
                r8 = move-exception
                goto L_0x008a
            L_0x0046:
                zd.e1.n(r8)
                vf.v r8 = new vf.v
                ie.g r2 = r0.e()
                r8.<init>(r7, r2)
                we.p r2 = r6.O     // Catch:{ all -> 0x0086 }
                r0.U = r6     // Catch:{ all -> 0x0086 }
                r0.V = r7     // Catch:{ all -> 0x0086 }
                r0.W = r8     // Catch:{ all -> 0x0086 }
                r0.S = r4     // Catch:{ all -> 0x0086 }
                r4 = 6
                xe.i0.e(r4)     // Catch:{ all -> 0x0086 }
                java.lang.Object r2 = r2.g0(r8, r0)     // Catch:{ all -> 0x0086 }
                r4 = 7
                xe.i0.e(r4)     // Catch:{ all -> 0x0086 }
                if (r2 != r1) goto L_0x006b
                return r1
            L_0x006b:
                r4 = r6
                r2 = r7
                r7 = r8
            L_0x006e:
                r7.L()
                uf.i r7 = r4.P
                r8 = 0
                r0.U = r8
                r0.V = r8
                r0.W = r8
                r0.S = r3
                java.lang.Object r7 = r7.a(r2, r0)
                if (r7 != r1) goto L_0x0083
                return r1
            L_0x0083:
                zd.u2 r7 = zd.u2.f25116a
                return r7
            L_0x0086:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L_0x008a:
                r7.L()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.t.e.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, d2 = {"T", "R", "Luf/j;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class f extends o implements p<j<? super R>, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ i<T> U;
        public final /* synthetic */ q<j<? super R>, T, ie.d<? super u2>, Object> V;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        public static final class a<T> implements j {
            public final /* synthetic */ q<j<? super R>, T, ie.d<? super u2>, Object> O;
            public final /* synthetic */ j<R> P;

            @le.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", f = "Emitters.kt", i = {}, l = {42}, m = "emit", n = {}, s = {})
            @i0(k = 3, mv = {1, 6, 0}, xi = 176)
            /* renamed from: uf.t$f$a$a  reason: collision with other inner class name */
            public static final class C0445a extends le.d {
                public /* synthetic */ Object R;
                public final /* synthetic */ a<T> S;
                public int T;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0445a(a<? super T> aVar, ie.d<? super C0445a> dVar) {
                    super(dVar);
                    this.S = aVar;
                }

                @fh.h
                public final Object K(@fh.g Object obj) {
                    this.R = obj;
                    this.T |= Integer.MIN_VALUE;
                    return this.S.d(null, this);
                }
            }

            public a(q<? super j<? super R>, ? super T, ? super ie.d<? super u2>, ? extends Object> qVar, j<? super R> jVar) {
                this.O = qVar;
                this.P = jVar;
            }

            @fh.h
            public final Object a(T t10, @fh.g ie.d<? super u2> dVar) {
                xe.i0.e(4);
                new C0445a(this, dVar);
                xe.i0.e(5);
                this.O.y(this.P, t10, dVar);
                return u2.f25116a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object d(T r5, @fh.g ie.d<? super zd.u2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof uf.t.f.a.C0445a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    uf.t$f$a$a r0 = (uf.t.f.a.C0445a) r0
                    int r1 = r0.T
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.T = r1
                    goto L_0x0018
                L_0x0013:
                    uf.t$f$a$a r0 = new uf.t$f$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.R
                    java.lang.Object r1 = ke.d.h()
                    int r2 = r0.T
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    zd.e1.n(r6)
                    goto L_0x0041
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    zd.e1.n(r6)
                    we.q<uf.j<? super R>, T, ie.d<? super zd.u2>, java.lang.Object> r6 = r4.O
                    uf.j<R> r2 = r4.P
                    r0.T = r3
                    java.lang.Object r5 = r6.y(r2, r5, r0)
                    if (r5 != r1) goto L_0x0041
                    return r1
                L_0x0041:
                    zd.u2 r5 = zd.u2.f25116a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.t.f.a.d(java.lang.Object, ie.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(i<? extends T> iVar, q<? super j<? super R>, ? super T, ? super ie.d<? super u2>, ? extends Object> qVar, ie.d<? super f> dVar) {
            super(2, dVar);
            this.U = iVar;
            this.V = qVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            f fVar = new f(this.U, this.V, dVar);
            fVar.T = obj;
            return fVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                i<T> iVar = this.U;
                a aVar = new a(this.V, (j) this.T);
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

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g j<? super R> jVar, @fh.h ie.d<? super u2> dVar) {
            return ((f) H(jVar, dVar)).K(u2.f25116a);
        }

        @fh.h
        public final Object Q(@fh.g Object obj) {
            i<T> iVar = this.U;
            a aVar = new a(this.V, (j) this.T);
            xe.i0.e(0);
            iVar.a(aVar, this);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class g implements i<R> {
        public final /* synthetic */ i O;
        public final /* synthetic */ q P;

        @i0(k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ g T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(g gVar, ie.d dVar) {
                super(dVar);
                this.T = gVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        public g(i iVar, q qVar) {
            this.O = iVar;
            this.P = qVar;
        }

        @fh.h
        public Object a(@fh.g j<? super R> jVar, @fh.g ie.d<? super u2> dVar) {
            Object a10 = this.O.a(new h(this.P, jVar), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }

        @fh.h
        public Object e(@fh.g j jVar, @fh.g ie.d dVar) {
            xe.i0.e(4);
            new a(this, dVar);
            xe.i0.e(5);
            i iVar = this.O;
            h hVar = new h(this.P, jVar);
            xe.i0.e(0);
            iVar.a(hVar, dVar);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class h<T> implements j {
        public final /* synthetic */ q<j<? super R>, T, ie.d<? super u2>, Object> O;
        public final /* synthetic */ j<R> P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", f = "Emitters.kt", i = {}, l = {53}, m = "emit", n = {}, s = {})
        @i0(k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public final /* synthetic */ h<T> S;
            public int T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(h<? super T> hVar, ie.d<? super a> dVar) {
                super(dVar);
                this.S = hVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.T |= Integer.MIN_VALUE;
                return this.S.d(null, this);
            }
        }

        public h(q<? super j<? super R>, ? super T, ? super ie.d<? super u2>, ? extends Object> qVar, j<? super R> jVar) {
            this.O = qVar;
            this.P = jVar;
        }

        @fh.h
        public final Object a(T t10, @fh.g ie.d<? super u2> dVar) {
            xe.i0.e(4);
            new a(this, dVar);
            xe.i0.e(5);
            this.O.y(this.P, t10, dVar);
            return u2.f25116a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(T r5, @fh.g ie.d<? super zd.u2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof uf.t.h.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                uf.t$h$a r0 = (uf.t.h.a) r0
                int r1 = r0.T
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.T = r1
                goto L_0x0018
            L_0x0013:
                uf.t$h$a r0 = new uf.t$h$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.T
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                zd.e1.n(r6)
                goto L_0x0041
            L_0x0029:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0031:
                zd.e1.n(r6)
                we.q<uf.j<? super R>, T, ie.d<? super zd.u2>, java.lang.Object> r6 = r4.O
                uf.j<R> r2 = r4.P
                r0.T = r3
                java.lang.Object r5 = r6.y(r2, r5, r0)
                if (r5 != r1) goto L_0x0041
                return r1
            L_0x0041:
                zd.u2 r5 = zd.u2.f25116a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.t.h.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    public static final void b(@fh.g j<?> jVar) {
        if (jVar instanceof z0) {
            throw ((z0) jVar).O;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object c(uf.j<? super T> r4, we.q<? super uf.j<? super T>, ? super java.lang.Throwable, ? super ie.d<? super zd.u2>, ? extends java.lang.Object> r5, java.lang.Throwable r6, ie.d<? super zd.u2> r7) {
        /*
            boolean r0 = r7 instanceof uf.t.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            uf.t$a r0 = (uf.t.a) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            uf.t$a r0 = new uf.t$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.R
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            zd.e1.n(r7)     // Catch:{ all -> 0x0047 }
            goto L_0x0044
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            zd.e1.n(r7)
            r0.R = r6     // Catch:{ all -> 0x0047 }
            r0.T = r3     // Catch:{ all -> 0x0047 }
            java.lang.Object r4 = r5.y(r4, r6, r0)     // Catch:{ all -> 0x0047 }
            if (r4 != r1) goto L_0x0044
            return r1
        L_0x0044:
            zd.u2 r4 = zd.u2.f25116a
            return r4
        L_0x0047:
            r4 = move-exception
            if (r6 == 0) goto L_0x004f
            if (r6 == r4) goto L_0x004f
            zd.p.a(r4, r6)
        L_0x004f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.t.c(uf.j, we.q, java.lang.Throwable, ie.d):java.lang.Object");
    }

    @fh.g
    public static final <T> i<T> d(@fh.g i<? extends T> iVar, @fh.g q<? super j<? super T>, ? super Throwable, ? super ie.d<? super u2>, ? extends Object> qVar) {
        return new b(iVar, qVar);
    }

    @fh.g
    public static final <T> i<T> e(@fh.g i<? extends T> iVar, @fh.g p<? super j<? super T>, ? super ie.d<? super u2>, ? extends Object> pVar) {
        return new c(iVar, pVar);
    }

    @fh.g
    public static final <T> i<T> f(@fh.g i<? extends T> iVar, @fh.g p<? super j<? super T>, ? super ie.d<? super u2>, ? extends Object> pVar) {
        return new e(pVar, iVar);
    }

    @fh.g
    public static final <T, R> i<R> g(@fh.g i<? extends T> iVar, @fh.g @zd.b q<? super j<? super R>, ? super T, ? super ie.d<? super u2>, ? extends Object> qVar) {
        return k.I0(new f(iVar, qVar, (ie.d<? super f>) null));
    }

    @fh.g
    @a1
    public static final <T, R> i<R> h(@fh.g i<? extends T> iVar, @fh.g @zd.b q<? super j<? super R>, ? super T, ? super ie.d<? super u2>, ? extends Object> qVar) {
        return new g(iVar, qVar);
    }
}

package uf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import le.o;
import pf.n2;
import we.p;
import we.q;
import we.r;
import xe.k1;
import xe.l0;
import zd.e1;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aj\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012B\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ae\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f23\b\u0002\u0010\u0013\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012W\u0010\u0013\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0016¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001f\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010\"\u001a\u00020\u0012*\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"T", "Luf/i;", "Lkotlin/Function3;", "Luf/j;", "", "Lzd/v0;", "name", "cause", "Lie/d;", "Lzd/u2;", "", "Lzd/u;", "action", "a", "(Luf/i;Lwe/q;)Luf/i;", "", "retries", "Lkotlin/Function2;", "", "predicate", "e", "(Luf/i;JLwe/p;)Luf/i;", "Lkotlin/Function4;", "attempt", "g", "(Luf/i;Lwe/r;)Luf/i;", "collector", "b", "(Luf/i;Luf/j;Lie/d;)Ljava/lang/Object;", "Lie/g;", "coroutineContext", "c", "(Ljava/lang/Throwable;Lie/g;)Z", "other", "d", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class u {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a implements i<T> {
        public final /* synthetic */ i O;
        public final /* synthetic */ q P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {113, 114}, m = "collect", n = {"this", "$this$catch_u24lambda_u2d0"}, s = {"L$0", "L$1"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: uf.u$a$a  reason: collision with other inner class name */
        public static final class C0446a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ a T;
            public Object U;
            public Object V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0446a(a aVar, ie.d dVar) {
                super(dVar);
                this.T = aVar;
            }

            @h
            public final Object K(@g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        public a(i iVar, q qVar) {
            this.O = iVar;
            this.P = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super T> r6, @fh.g ie.d<? super zd.u2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof uf.u.a.C0446a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                uf.u$a$a r0 = (uf.u.a.C0446a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.u$a$a r0 = new uf.u$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0040
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                zd.e1.n(r7)
                goto L_0x006f
            L_0x002c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0034:
                java.lang.Object r6 = r0.V
                uf.j r6 = (uf.j) r6
                java.lang.Object r2 = r0.U
                uf.u$a r2 = (uf.u.a) r2
                zd.e1.n(r7)
                goto L_0x0053
            L_0x0040:
                zd.e1.n(r7)
                uf.i r7 = r5.O
                r0.U = r5
                r0.V = r6
                r0.S = r4
                java.lang.Object r7 = uf.k.v(r7, r6, r0)
                if (r7 != r1) goto L_0x0052
                return r1
            L_0x0052:
                r2 = r5
            L_0x0053:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L_0x006f
                we.q r2 = r2.P
                r4 = 0
                r0.U = r4
                r0.V = r4
                r0.S = r3
                r3 = 6
                xe.i0.e(r3)
                java.lang.Object r6 = r2.y(r6, r7, r0)
                r7 = 7
                xe.i0.e(r7)
                if (r6 != r1) goto L_0x006f
                return r1
            L_0x006f:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.u.a.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {156}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class b<T> extends le.d {
        public Object R;
        public /* synthetic */ Object S;
        public int T;

        public b(ie.d<? super b> dVar) {
            super(dVar);
        }

        @h
        public final Object K(@g Object obj) {
            this.S = obj;
            this.T |= Integer.MIN_VALUE;
            return k.v((i) null, (j) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class c<T> implements j {
        public final /* synthetic */ j<T> O;
        public final /* synthetic */ k1.h<Throwable> P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {158}, m = "emit", n = {"this"}, s = {"L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public Object R;
            public /* synthetic */ Object S;
            public final /* synthetic */ c<T> T;
            public int U;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(c<? super T> cVar, ie.d<? super a> dVar) {
                super(dVar);
                this.T = cVar;
            }

            @h
            public final Object K(@g Object obj) {
                this.S = obj;
                this.U |= Integer.MIN_VALUE;
                return this.T.d(null, this);
            }
        }

        public c(j<? super T> jVar, k1.h<Throwable> hVar) {
            this.O = jVar;
            this.P = hVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(T r5, @fh.g ie.d<? super zd.u2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof uf.u.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                uf.u$c$a r0 = (uf.u.c.a) r0
                int r1 = r0.U
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.U = r1
                goto L_0x0018
            L_0x0013:
                uf.u$c$a r0 = new uf.u$c$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.S
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.U
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r5 = r0.R
                uf.u$c r5 = (uf.u.c) r5
                zd.e1.n(r6)     // Catch:{ all -> 0x002d }
                goto L_0x0047
            L_0x002d:
                r6 = move-exception
                goto L_0x004c
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0037:
                zd.e1.n(r6)
                uf.j<T> r6 = r4.O     // Catch:{ all -> 0x004a }
                r0.R = r4     // Catch:{ all -> 0x004a }
                r0.U = r3     // Catch:{ all -> 0x004a }
                java.lang.Object r5 = r6.d(r5, r0)     // Catch:{ all -> 0x004a }
                if (r5 != r1) goto L_0x0047
                return r1
            L_0x0047:
                zd.u2 r5 = zd.u2.f25116a
                return r5
            L_0x004a:
                r6 = move-exception
                r5 = r4
            L_0x004c:
                xe.k1$h<java.lang.Throwable> r5 = r5.P
                r5.O = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.u.c.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class d extends o implements p<Throwable, ie.d<? super Boolean>, Object> {
        public int S;

        public d(ie.d<? super d> dVar) {
            super(2, dVar);
        }

        @g
        public final ie.d<u2> H(@h Object obj, @g ie.d<?> dVar) {
            return new d(dVar);
        }

        @h
        public final Object K(@g Object obj) {
            ke.d.h();
            if (this.S == 0) {
                e1.n(obj);
                return le.b.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @h
        /* renamed from: P */
        public final Object g0(@g Throwable th2, @h ie.d<? super Boolean> dVar) {
            return ((d) H(th2, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H@"}, d2 = {"T", "Luf/j;", "", "cause", "", "attempt", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class e extends o implements r<j<? super T>, Throwable, Long, ie.d<? super Boolean>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public /* synthetic */ long U;
        public final /* synthetic */ long V;
        public final /* synthetic */ p<Throwable, ie.d<? super Boolean>, Object> W;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(long j10, p<? super Throwable, ? super ie.d<? super Boolean>, ? extends Object> pVar, ie.d<? super e> dVar) {
            super(4, dVar);
            this.V = j10;
            this.W = pVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
            if (((java.lang.Boolean) r8).booleanValue() != false) goto L_0x003b;
         */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r7.S
                r2 = 1
                if (r1 == 0) goto L_0x0017
                if (r1 != r2) goto L_0x000f
                zd.e1.n(r8)
                goto L_0x0031
            L_0x000f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0017:
                zd.e1.n(r8)
                java.lang.Object r8 = r7.T
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                long r3 = r7.U
                long r5 = r7.V
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x003a
                we.p<java.lang.Throwable, ie.d<? super java.lang.Boolean>, java.lang.Object> r1 = r7.W
                r7.S = r2
                java.lang.Object r8 = r1.g0(r8, r7)
                if (r8 != r0) goto L_0x0031
                return r0
            L_0x0031:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L_0x003a
                goto L_0x003b
            L_0x003a:
                r2 = 0
            L_0x003b:
                java.lang.Boolean r8 = le.b.a(r2)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.u.e.K(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object M(Object obj, Object obj2, Object obj3, Object obj4) {
            return P((j) obj, (Throwable) obj2, ((Number) obj3).longValue(), (ie.d) obj4);
        }

        @h
        public final Object P(@g j<? super T> jVar, @g Throwable th2, long j10, @h ie.d<? super Boolean> dVar) {
            e eVar = new e(this.V, this.W, dVar);
            eVar.T = th2;
            eVar.U = j10;
            return eVar.K(u2.f25116a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class f implements i<T> {
        public final /* synthetic */ i O;
        public final /* synthetic */ r P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {117, 119}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u2d2", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u2d2", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ f T;
            public Object U;
            public Object V;
            public Object W;
            public long X;
            public int Y;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(f fVar, ie.d dVar) {
                super(dVar);
                this.T = fVar;
            }

            @h
            public final Object K(@g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        public f(i iVar, r rVar) {
            this.O = iVar;
            this.P = rVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super T> r13, @fh.g ie.d<? super zd.u2> r14) {
            /*
                r12 = this;
                boolean r0 = r14 instanceof uf.u.f.a
                if (r0 == 0) goto L_0x0013
                r0 = r14
                uf.u$f$a r0 = (uf.u.f.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.u$f$a r0 = new uf.u$f$a
                r0.<init>(r12, r14)
            L_0x0018:
                java.lang.Object r14 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0052
                if (r2 == r4) goto L_0x0042
                if (r2 != r3) goto L_0x003a
                long r5 = r0.X
                java.lang.Object r13 = r0.W
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                java.lang.Object r2 = r0.V
                uf.j r2 = (uf.j) r2
                java.lang.Object r7 = r0.U
                uf.u$f r7 = (uf.u.f) r7
                zd.e1.n(r14)
                goto L_0x009b
            L_0x003a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L_0x0042:
                int r13 = r0.Y
                long r5 = r0.X
                java.lang.Object r2 = r0.V
                uf.j r2 = (uf.j) r2
                java.lang.Object r7 = r0.U
                uf.u$f r7 = (uf.u.f) r7
                zd.e1.n(r14)
                goto L_0x0075
            L_0x0052:
                zd.e1.n(r14)
                r5 = 0
                r14 = r12
            L_0x0058:
                r2 = 0
                uf.i r7 = r14.O
                r0.U = r14
                r0.V = r13
                r8 = 0
                r0.W = r8
                r0.X = r5
                r0.Y = r2
                r0.S = r4
                java.lang.Object r7 = uf.k.v(r7, r13, r0)
                if (r7 != r1) goto L_0x006f
                return r1
            L_0x006f:
                r10 = r2
                r2 = r13
                r13 = r10
                r11 = r7
                r7 = r14
                r14 = r11
            L_0x0075:
                java.lang.Throwable r14 = (java.lang.Throwable) r14
                if (r14 == 0) goto L_0x00a9
                we.r r13 = r7.P
                java.lang.Long r8 = le.b.g(r5)
                r0.U = r7
                r0.V = r2
                r0.W = r14
                r0.X = r5
                r0.S = r3
                r9 = 6
                xe.i0.e(r9)
                java.lang.Object r13 = r13.M(r2, r14, r8, r0)
                r8 = 7
                xe.i0.e(r8)
                if (r13 != r1) goto L_0x0098
                return r1
            L_0x0098:
                r10 = r14
                r14 = r13
                r13 = r10
            L_0x009b:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto L_0x00a8
                r13 = 1
                long r5 = r5 + r13
                r13 = r4
                goto L_0x00a9
            L_0x00a8:
                throw r13
            L_0x00a9:
                r14 = r7
                if (r13 != 0) goto L_0x00af
                zd.u2 r13 = zd.u2.f25116a
                return r13
            L_0x00af:
                r13 = r2
                goto L_0x0058
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.u.f.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @g
    public static final <T> i<T> a(@g i<? extends T> iVar, @g q<? super j<? super T>, ? super Throwable, ? super ie.d<? super u2>, ? extends Object> qVar) {
        return new a(iVar, qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object b(@fh.g uf.i<? extends T> r4, @fh.g uf.j<? super T> r5, @fh.g ie.d<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof uf.u.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            uf.u$b r0 = (uf.u.b) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            uf.u$b r0 = new uf.u$b
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r4 = r0.R
            xe.k1$h r4 = (xe.k1.h) r4
            zd.e1.n(r6)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r5 = move-exception
            goto L_0x0053
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            zd.e1.n(r6)
            xe.k1$h r6 = new xe.k1$h
            r6.<init>()
            uf.u$c r2 = new uf.u$c     // Catch:{ all -> 0x0051 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x0051 }
            r0.R = r6     // Catch:{ all -> 0x0051 }
            r0.T = r3     // Catch:{ all -> 0x0051 }
            java.lang.Object r4 = r4.a(r2, r0)     // Catch:{ all -> 0x0051 }
            if (r4 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = 0
            return r4
        L_0x0051:
            r5 = move-exception
            r4 = r6
        L_0x0053:
            T r4 = r4.O
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L_0x0076
            ie.g r6 = r0.e()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L_0x0076
            if (r4 != 0) goto L_0x006a
            return r5
        L_0x006a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L_0x0072
            zd.p.a(r4, r5)
            throw r4
        L_0x0072:
            zd.p.a(r5, r4)
            throw r5
        L_0x0076:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.u.b(uf.i, uf.j, ie.d):java.lang.Object");
    }

    public static final boolean c(Throwable th2, ie.g gVar) {
        n2 n2Var = (n2) gVar.g(n2.D);
        if (n2Var == null || !n2Var.isCancelled()) {
            return false;
        }
        return d(th2, n2Var.k0());
    }

    public static final boolean d(Throwable th2, Throwable th3) {
        return th3 != null && l0.g(th3, th2);
    }

    @g
    public static final <T> i<T> e(@g i<? extends T> iVar, long j10, @g p<? super Throwable, ? super ie.d<? super Boolean>, ? extends Object> pVar) {
        if (j10 > 0) {
            return k.x1(iVar, new e(j10, pVar, (ie.d<? super e>) null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j10).toString());
    }

    public static /* synthetic */ i f(i iVar, long j10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        if ((i10 & 2) != 0) {
            pVar = new d((ie.d<? super d>) null);
        }
        return k.v1(iVar, j10, pVar);
    }

    @g
    public static final <T> i<T> g(@g i<? extends T> iVar, @g r<? super j<? super T>, ? super Throwable, ? super Long, ? super ie.d<? super Boolean>, ? extends Object> rVar) {
        return new f(iVar, rVar);
    }
}

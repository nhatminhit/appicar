package uf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import le.f;
import we.p;
import xe.k1;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"T", "Luf/i;", "", "a", "(Luf/i;Lie/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lie/d;", "", "", "predicate", "b", "(Luf/i;Lwe/p;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class q {

    @f(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {18}, m = "count", n = {"i"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a<T> extends le.d {
        public Object R;
        public /* synthetic */ Object S;
        public int T;

        public a(ie.d<? super a> dVar) {
            super(dVar);
        }

        @h
        public final Object K(@g Object obj) {
            this.S = obj;
            this.T |= Integer.MIN_VALUE;
            return k.Y((i) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class b<T> implements j {
        public final /* synthetic */ k1.f O;

        public b(k1.f fVar) {
            this.O = fVar;
        }

        @h
        public final Object d(T t10, @g ie.d<? super u2> dVar) {
            this.O.O++;
            return u2.f25116a;
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {30}, m = "count", n = {"i"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class c<T> extends le.d {
        public Object R;
        public /* synthetic */ Object S;
        public int T;

        public c(ie.d<? super c> dVar) {
            super(dVar);
        }

        @h
        public final Object K(@g Object obj) {
            this.S = obj;
            this.T |= Integer.MIN_VALUE;
            return k.Z((i) null, (p) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class d<T> implements j {
        public final /* synthetic */ p<T, ie.d<? super Boolean>, Object> O;
        public final /* synthetic */ k1.f P;

        @f(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", i = {0}, l = {31}, m = "emit", n = {"this"}, s = {"L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public Object R;
            public /* synthetic */ Object S;
            public final /* synthetic */ d<T> T;
            public int U;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(d<? super T> dVar, ie.d<? super a> dVar2) {
                super(dVar2);
                this.T = dVar;
            }

            @h
            public final Object K(@g Object obj) {
                this.S = obj;
                this.U |= Integer.MIN_VALUE;
                return this.T.d(null, this);
            }
        }

        public d(p<? super T, ? super ie.d<? super Boolean>, ? extends Object> pVar, k1.f fVar) {
            this.O = pVar;
            this.P = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(T r5, @fh.g ie.d<? super zd.u2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof uf.q.d.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                uf.q$d$a r0 = (uf.q.d.a) r0
                int r1 = r0.U
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.U = r1
                goto L_0x0018
            L_0x0013:
                uf.q$d$a r0 = new uf.q$d$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.S
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.U
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r5 = r0.R
                uf.q$d r5 = (uf.q.d) r5
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
                if (r6 == 0) goto L_0x0055
                xe.k1$f r5 = r5.P
                int r6 = r5.O
                int r6 = r6 + r3
                r5.O = r6
            L_0x0055:
                zd.u2 r5 = zd.u2.f25116a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.q.d.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object a(@fh.g uf.i<? extends T> r4, @fh.g ie.d<? super java.lang.Integer> r5) {
        /*
            boolean r0 = r5 instanceof uf.q.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            uf.q$a r0 = (uf.q.a) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            uf.q$a r0 = new uf.q$a
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.R
            xe.k1$f r4 = (xe.k1.f) r4
            zd.e1.n(r5)
            goto L_0x004e
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            zd.e1.n(r5)
            xe.k1$f r5 = new xe.k1$f
            r5.<init>()
            uf.q$b r2 = new uf.q$b
            r2.<init>(r5)
            r0.R = r5
            r0.T = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r4 = r5
        L_0x004e:
            int r4 = r4.O
            java.lang.Integer r4 = le.b.f(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.q.a(uf.i, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object b(@fh.g uf.i<? extends T> r4, @fh.g we.p<? super T, ? super ie.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @fh.g ie.d<? super java.lang.Integer> r6) {
        /*
            boolean r0 = r6 instanceof uf.q.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            uf.q$c r0 = (uf.q.c) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            uf.q$c r0 = new uf.q$c
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.R
            xe.k1$f r4 = (xe.k1.f) r4
            zd.e1.n(r6)
            goto L_0x004e
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            zd.e1.n(r6)
            xe.k1$f r6 = new xe.k1$f
            r6.<init>()
            uf.q$d r2 = new uf.q$d
            r2.<init>(r5, r6)
            r0.R = r6
            r0.T = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r4 = r6
        L_0x004e:
            int r4 = r4.O
            java.lang.Integer r4 = le.b.f(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.q.b(uf.i, we.p, ie.d):java.lang.Object");
    }
}

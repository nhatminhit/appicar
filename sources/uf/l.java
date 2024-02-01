package uf;

import gf.p;
import java.util.Iterator;
import kotlin.Metadata;
import p000if.m;
import pf.d2;
import rf.g0;
import xe.w;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0007\u001a8\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0012\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0014\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0016\"\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0012\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000\u001a#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020\u001f\u001a\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020\"\u001a\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020%\u001a\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020'\u001aM\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b*\u0010\n\u001aM\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b+\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"T", "Lkotlin/Function2;", "Luf/j;", "Lie/d;", "Lzd/u2;", "", "Lzd/u;", "block", "Luf/i;", "n", "(Lwe/p;)Luf/i;", "Lkotlin/Function0;", "f", "Lkotlin/Function1;", "g", "(Lwe/l;)Luf/i;", "", "d", "", "e", "Lif/m;", "c", "", "elements", "p", "([Ljava/lang/Object;)Luf/i;", "value", "o", "(Ljava/lang/Object;)Luf/i;", "m", "j", "", "", "h", "", "", "i", "Lgf/m;", "a", "Lgf/p;", "b", "Lrf/g0;", "l", "k", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class l {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a implements i<Long> {
        public final /* synthetic */ p O;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d19"}, s = {"L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: uf.l$a$a  reason: collision with other inner class name */
        public static final class C0437a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ a T;
            public Object U;
            public Object V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0437a(a aVar, ie.d dVar) {
                super(dVar);
                this.T = aVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j<? super Long>) null, this);
            }
        }

        public a(p pVar) {
            this.O = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super java.lang.Long> r8, @fh.g ie.d<? super zd.u2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof uf.l.a.C0437a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                uf.l$a$a r0 = (uf.l.a.C0437a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.l$a$a r0 = new uf.l$a$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 != r3) goto L_0x0032
                java.lang.Object r8 = r0.V
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r2 = r0.U
                uf.j r2 = (uf.j) r2
                zd.e1.n(r9)
                r9 = r2
                goto L_0x0046
            L_0x0032:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x003a:
                zd.e1.n(r9)
                gf.p r9 = r7.O
                java.util.Iterator r9 = r9.iterator()
                r6 = r9
                r9 = r8
                r8 = r6
            L_0x0046:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L_0x0064
                r2 = r8
                be.t0 r2 = (be.t0) r2
                long r4 = r2.nextLong()
                java.lang.Long r2 = le.b.g(r4)
                r0.U = r9
                r0.V = r8
                r0.S = r3
                java.lang.Object r2 = r9.d(r2, r0)
                if (r2 != r1) goto L_0x0046
                return r1
            L_0x0064:
                zd.u2 r8 = zd.u2.f25116a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.l.a.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b implements i<T> {
        public final /* synthetic */ we.a O;

        public b(we.a aVar) {
            this.O = aVar;
        }

        @fh.h
        public Object a(@fh.g j<? super T> jVar, @fh.g ie.d<? super u2> dVar) {
            Object d10 = jVar.d(this.O.n(), dVar);
            return d10 == ke.d.h() ? d10 : u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c implements i<T> {
        public final /* synthetic */ we.l O;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", f = "Builders.kt", i = {}, l = {113, 113}, m = "collect", n = {}, s = {})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ c T;
            public Object U;

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

        public c(we.l lVar) {
            this.O = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x005f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super T> r6, @fh.g ie.d<? super zd.u2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof uf.l.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                uf.l$c$a r0 = (uf.l.c.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.l$c$a r0 = new uf.l$c$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x003c
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                zd.e1.n(r7)
                goto L_0x0060
            L_0x002c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0034:
                java.lang.Object r6 = r0.U
                uf.j r6 = (uf.j) r6
                zd.e1.n(r7)
                goto L_0x0054
            L_0x003c:
                zd.e1.n(r7)
                we.l r7 = r5.O
                r0.U = r6
                r0.S = r4
                r2 = 6
                xe.i0.e(r2)
                java.lang.Object r7 = r7.A(r0)
                r2 = 7
                xe.i0.e(r2)
                if (r7 != r1) goto L_0x0054
                return r1
            L_0x0054:
                r2 = 0
                r0.U = r2
                r0.S = r3
                java.lang.Object r6 = r6.d(r7, r0)
                if (r6 != r1) goto L_0x0060
                return r1
            L_0x0060:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.l.c.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d implements i<T> {
        public final /* synthetic */ Iterable O;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d3"}, s = {"L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ d T;
            public Object U;
            public Object V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(d dVar, ie.d dVar2) {
                super(dVar2);
                this.T = dVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        public d(Iterable iterable) {
            this.O = iterable;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super T> r6, @fh.g ie.d<? super zd.u2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof uf.l.d.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                uf.l$d$a r0 = (uf.l.d.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.l$d$a r0 = new uf.l$d$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 != r3) goto L_0x0032
                java.lang.Object r6 = r0.V
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.U
                uf.j r2 = (uf.j) r2
                zd.e1.n(r7)
                r7 = r2
                goto L_0x0046
            L_0x0032:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003a:
                zd.e1.n(r7)
                java.lang.Iterable r7 = r5.O
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L_0x0046:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L_0x005d
                java.lang.Object r2 = r6.next()
                r0.U = r7
                r0.V = r6
                r0.S = r3
                java.lang.Object r2 = r7.d(r2, r0)
                if (r2 != r1) goto L_0x0046
                return r1
            L_0x005d:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.l.d.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e implements i<T> {
        public final /* synthetic */ Iterator O;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d5"}, s = {"L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ e T;
            public Object U;
            public Object V;

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

        public e(Iterator it) {
            this.O = it;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super T> r6, @fh.g ie.d<? super zd.u2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof uf.l.e.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                uf.l$e$a r0 = (uf.l.e.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.l$e$a r0 = new uf.l$e$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 != r3) goto L_0x0032
                java.lang.Object r6 = r0.V
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.U
                uf.j r2 = (uf.j) r2
                zd.e1.n(r7)
                r7 = r2
                goto L_0x0042
            L_0x0032:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003a:
                zd.e1.n(r7)
                java.util.Iterator r7 = r5.O
                r4 = r7
                r7 = r6
                r6 = r4
            L_0x0042:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L_0x0059
                java.lang.Object r2 = r6.next()
                r0.U = r7
                r0.V = r6
                r0.S = r3
                java.lang.Object r2 = r7.d(r2, r0)
                if (r2 != r1) goto L_0x0042
                return r1
            L_0x0059:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.l.e.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class f implements i<T> {
        public final /* synthetic */ m O;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d7"}, s = {"L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ f T;
            public Object U;
            public Object V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(f fVar, ie.d dVar) {
                super(dVar);
                this.T = fVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        public f(m mVar) {
            this.O = mVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super T> r6, @fh.g ie.d<? super zd.u2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof uf.l.f.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                uf.l$f$a r0 = (uf.l.f.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.l$f$a r0 = new uf.l$f$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 != r3) goto L_0x0032
                java.lang.Object r6 = r0.V
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.U
                uf.j r2 = (uf.j) r2
                zd.e1.n(r7)
                r7 = r2
                goto L_0x0046
            L_0x0032:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003a:
                zd.e1.n(r7)
                if.m r7 = r5.O
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L_0x0046:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L_0x005d
                java.lang.Object r2 = r6.next()
                r0.U = r7
                r0.V = r6
                r0.S = r3
                java.lang.Object r2 = r7.d(r2, r0)
                if (r2 != r1) goto L_0x0046
                return r1
            L_0x005d:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.l.f.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class g implements i<T> {
        public final /* synthetic */ Object[] O;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d11", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ g T;
            public Object U;
            public Object V;
            public int W;
            public int X;

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

        public g(Object[] objArr) {
            this.O = objArr;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super T> r8, @fh.g ie.d<? super zd.u2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof uf.l.g.a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                uf.l$g$a r0 = (uf.l.g.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.l$g$a r0 = new uf.l$g$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 1
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                int r8 = r0.X
                int r2 = r0.W
                java.lang.Object r4 = r0.V
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                java.lang.Object r5 = r0.U
                uf.j r5 = (uf.j) r5
                zd.e1.n(r9)
                r9 = r5
                goto L_0x005e
            L_0x0036:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x003e:
                zd.e1.n(r9)
                java.lang.Object[] r9 = r7.O
                r2 = 0
                int r4 = r9.length
                r6 = r9
                r9 = r8
                r8 = r4
                r4 = r6
            L_0x0049:
                if (r2 >= r8) goto L_0x0060
                r5 = r4[r2]
                r0.U = r9
                r0.V = r4
                r0.W = r2
                r0.X = r8
                r0.S = r3
                java.lang.Object r5 = r9.d(r5, r0)
                if (r5 != r1) goto L_0x005e
                return r1
            L_0x005e:
                int r2 = r2 + r3
                goto L_0x0049
            L_0x0060:
                zd.u2 r8 = zd.u2.f25116a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.l.g.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class h implements i<Integer> {
        public final /* synthetic */ int[] O;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d13", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ h T;
            public Object U;
            public Object V;
            public int W;
            public int X;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(h hVar, ie.d dVar) {
                super(dVar);
                this.T = hVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j<? super Integer>) null, this);
            }
        }

        public h(int[] iArr) {
            this.O = iArr;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super java.lang.Integer> r8, @fh.g ie.d<? super zd.u2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof uf.l.h.a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                uf.l$h$a r0 = (uf.l.h.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.l$h$a r0 = new uf.l$h$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 1
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                int r8 = r0.X
                int r2 = r0.W
                java.lang.Object r4 = r0.V
                int[] r4 = (int[]) r4
                java.lang.Object r5 = r0.U
                uf.j r5 = (uf.j) r5
                zd.e1.n(r9)
                r9 = r5
                goto L_0x0062
            L_0x0036:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x003e:
                zd.e1.n(r9)
                int[] r9 = r7.O
                r2 = 0
                int r4 = r9.length
                r6 = r9
                r9 = r8
                r8 = r4
                r4 = r6
            L_0x0049:
                if (r2 >= r8) goto L_0x0064
                r5 = r4[r2]
                java.lang.Integer r5 = le.b.f(r5)
                r0.U = r9
                r0.V = r4
                r0.W = r2
                r0.X = r8
                r0.S = r3
                java.lang.Object r5 = r9.d(r5, r0)
                if (r5 != r1) goto L_0x0062
                return r1
            L_0x0062:
                int r2 = r2 + r3
                goto L_0x0049
            L_0x0064:
                zd.u2 r8 = zd.u2.f25116a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.l.h.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class i implements i<Long> {
        public final /* synthetic */ long[] O;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d15", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ i T;
            public Object U;
            public Object V;
            public int W;
            public int X;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(i iVar, ie.d dVar) {
                super(dVar);
                this.T = iVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j<? super Long>) null, this);
            }
        }

        public i(long[] jArr) {
            this.O = jArr;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super java.lang.Long> r9, @fh.g ie.d<? super zd.u2> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof uf.l.i.a
                if (r0 == 0) goto L_0x0013
                r0 = r10
                uf.l$i$a r0 = (uf.l.i.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.l$i$a r0 = new uf.l$i$a
                r0.<init>(r8, r10)
            L_0x0018:
                java.lang.Object r10 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 1
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                int r9 = r0.X
                int r2 = r0.W
                java.lang.Object r4 = r0.V
                long[] r4 = (long[]) r4
                java.lang.Object r5 = r0.U
                uf.j r5 = (uf.j) r5
                zd.e1.n(r10)
                r10 = r5
                goto L_0x0062
            L_0x0036:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L_0x003e:
                zd.e1.n(r10)
                long[] r10 = r8.O
                r2 = 0
                int r4 = r10.length
                r7 = r10
                r10 = r9
                r9 = r4
                r4 = r7
            L_0x0049:
                if (r2 >= r9) goto L_0x0064
                r5 = r4[r2]
                java.lang.Long r5 = le.b.g(r5)
                r0.U = r10
                r0.V = r4
                r0.W = r2
                r0.X = r9
                r0.S = r3
                java.lang.Object r5 = r10.d(r5, r0)
                if (r5 != r1) goto L_0x0062
                return r1
            L_0x0062:
                int r2 = r2 + r3
                goto L_0x0049
            L_0x0064:
                zd.u2 r9 = zd.u2.f25116a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.l.i.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class j implements i<Integer> {
        public final /* synthetic */ gf.m O;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d17"}, s = {"L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ j T;
            public Object U;
            public Object V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(j jVar, ie.d dVar) {
                super(dVar);
                this.T = jVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j<? super Integer>) null, this);
            }
        }

        public j(gf.m mVar) {
            this.O = mVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super java.lang.Integer> r6, @fh.g ie.d<? super zd.u2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof uf.l.j.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                uf.l$j$a r0 = (uf.l.j.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.l$j$a r0 = new uf.l$j$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 != r3) goto L_0x0032
                java.lang.Object r6 = r0.V
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.U
                uf.j r2 = (uf.j) r2
                zd.e1.n(r7)
                r7 = r2
                goto L_0x0046
            L_0x0032:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003a:
                zd.e1.n(r7)
                gf.m r7 = r5.O
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L_0x0046:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L_0x0064
                r2 = r6
                be.s0 r2 = (be.s0) r2
                int r2 = r2.nextInt()
                java.lang.Integer r2 = le.b.f(r2)
                r0.U = r7
                r0.V = r6
                r0.S = r3
                java.lang.Object r2 = r7.d(r2, r0)
                if (r2 != r1) goto L_0x0046
                return r1
            L_0x0064:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.l.j.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class k implements i<T> {
        public final /* synthetic */ Object[] O;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {114}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u2d8"}, s = {"L$0", "L$1"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ k T;
            public Object U;
            public Object V;
            public int W;
            public int X;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(k kVar, ie.d dVar) {
                super(dVar);
                this.T = kVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        public k(Object[] objArr) {
            this.O = objArr;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super T> r8, @fh.g ie.d<? super zd.u2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof uf.l.k.a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                uf.l$k$a r0 = (uf.l.k.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.l$k$a r0 = new uf.l$k$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 1
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                int r8 = r0.X
                int r2 = r0.W
                java.lang.Object r4 = r0.V
                uf.j r4 = (uf.j) r4
                java.lang.Object r5 = r0.U
                uf.l$k r5 = (uf.l.k) r5
                zd.e1.n(r9)
                r9 = r4
                goto L_0x0061
            L_0x0036:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x003e:
                zd.e1.n(r9)
                r9 = 0
                java.lang.Object[] r2 = r7.O
                int r2 = r2.length
                r5 = r7
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
            L_0x004a:
                if (r2 >= r8) goto L_0x0063
                java.lang.Object[] r4 = r5.O
                r4 = r4[r2]
                r0.U = r5
                r0.V = r9
                r0.W = r2
                r0.X = r8
                r0.S = r3
                java.lang.Object r4 = r9.d(r4, r0)
                if (r4 != r1) goto L_0x0061
                return r1
            L_0x0061:
                int r2 = r2 + r3
                goto L_0x004a
            L_0x0063:
                zd.u2 r8 = zd.u2.f25116a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.l.k.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: uf.l$l  reason: collision with other inner class name */
    public static final class C0438l implements i<T> {
        public final /* synthetic */ Object O;

        public C0438l(Object obj) {
            this.O = obj;
        }

        @fh.h
        public Object a(@fh.g j<? super T> jVar, @fh.g ie.d<? super u2> dVar) {
            Object d10 = jVar.d(this.O, dVar);
            return d10 == ke.d.h() ? d10 : u2.f25116a;
        }
    }

    @fh.g
    public static final i<Integer> a(@fh.g gf.m mVar) {
        return new j(mVar);
    }

    @fh.g
    public static final i<Long> b(@fh.g p pVar) {
        return new a(pVar);
    }

    @fh.g
    public static final <T> i<T> c(@fh.g m<? extends T> mVar) {
        return new f(mVar);
    }

    @fh.g
    public static final <T> i<T> d(@fh.g Iterable<? extends T> iterable) {
        return new d(iterable);
    }

    @fh.g
    public static final <T> i<T> e(@fh.g Iterator<? extends T> it) {
        return new e(it);
    }

    @fh.g
    @d2
    public static final <T> i<T> f(@fh.g we.a<? extends T> aVar) {
        return new b(aVar);
    }

    @fh.g
    @d2
    public static final <T> i<T> g(@fh.g we.l<? super ie.d<? super T>, ? extends Object> lVar) {
        return new c(lVar);
    }

    @fh.g
    public static final i<Integer> h(@fh.g int[] iArr) {
        return new h(iArr);
    }

    @fh.g
    public static final i<Long> i(@fh.g long[] jArr) {
        return new i(jArr);
    }

    @fh.g
    public static final <T> i<T> j(@fh.g T[] tArr) {
        return new g(tArr);
    }

    @fh.g
    public static final <T> i<T> k(@fh.g @zd.b we.p<? super g0<? super T>, ? super ie.d<? super u2>, ? extends Object> pVar) {
        return new b(pVar, (ie.g) null, 0, (rf.m) null, 14, (w) null);
    }

    @fh.g
    public static final <T> i<T> l(@fh.g @zd.b we.p<? super g0<? super T>, ? super ie.d<? super u2>, ? extends Object> pVar) {
        return new f(pVar, (ie.g) null, 0, (rf.m) null, 14, (w) null);
    }

    @fh.g
    public static final <T> i<T> m() {
        return h.O;
    }

    @fh.g
    public static final <T> i<T> n(@fh.g @zd.b we.p<? super j<? super T>, ? super ie.d<? super u2>, ? extends Object> pVar) {
        return new h0(pVar);
    }

    @fh.g
    public static final <T> i<T> o(T t10) {
        return new C0438l(t10);
    }

    @fh.g
    public static final <T> i<T> p(@fh.g T... tArr) {
        return new k(tArr);
    }
}

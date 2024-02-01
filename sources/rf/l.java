package rf;

import fh.g;
import fh.h;
import ie.d;
import ie.i;
import kotlin.Metadata;
import le.f;
import le.o;
import pf.e2;
import pf.e3;
import pf.m1;
import pf.p0;
import pf.u0;
import pf.v0;
import pf.w0;
import we.p;
import xe.n0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u001a \u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042-\b\u0002\u0010\u0012\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112/\b\u0001\u0010\u0018\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"E", "Lrf/i0;", "", "capacity", "Lpf/w0;", "start", "Lrf/i;", "b", "Lpf/u0;", "Lie/g;", "context", "Lkotlin/Function1;", "", "Lzd/v0;", "name", "cause", "Lzd/u2;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lrf/g0;", "Lie/d;", "", "Lzd/u;", "block", "a", "(Lpf/u0;Lie/g;ILpf/w0;Lwe/l;Lwe/p;)Lrf/i;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class l {

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"pf/r0$a", "Lie/a;", "Lpf/p0;", "Lie/g;", "context", "", "exception", "Lzd/u2;", "T0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a extends ie.a implements p0 {
        public a(p0.b bVar) {
            super(bVar);
        }

        public void T0(@g ie.g gVar, @g Throwable th2) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "it", "Lzd/u2;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    public static final class b extends n0 implements we.l<Throwable, u2> {
        public final /* synthetic */ i0<E> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(i0<? extends E> i0Var) {
            super(1);
            this.P = i0Var;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Throwable) obj);
            return u2.f25116a;
        }

        public final void c(@h Throwable th2) {
            s.b(this.P, th2);
        }
    }

    @f(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {53, 54}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, d2 = {"E", "Lrf/g0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class c extends o implements p<g0<? super E>, d<? super u2>, Object> {
        public Object S;
        public int T;
        public /* synthetic */ Object U;
        public final /* synthetic */ i0<E> V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(i0<? extends E> i0Var, d<? super c> dVar) {
            super(2, dVar);
            this.V = i0Var;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            c cVar = new c(this.V, dVar);
            cVar.U = obj;
            return cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r7.T
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0030
                if (r1 == r3) goto L_0x0023
                if (r1 != r2) goto L_0x001b
                java.lang.Object r1 = r7.S
                rf.p r1 = (rf.p) r1
                java.lang.Object r4 = r7.U
                rf.g0 r4 = (rf.g0) r4
                zd.e1.n(r8)
                r8 = r4
                goto L_0x003d
            L_0x001b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0023:
                java.lang.Object r1 = r7.S
                rf.p r1 = (rf.p) r1
                java.lang.Object r4 = r7.U
                rf.g0 r4 = (rf.g0) r4
                zd.e1.n(r8)
                r5 = r7
                goto L_0x004f
            L_0x0030:
                zd.e1.n(r8)
                java.lang.Object r8 = r7.U
                rf.g0 r8 = (rf.g0) r8
                rf.i0<E> r1 = r7.V
                rf.p r1 = r1.iterator()
            L_0x003d:
                r4 = r7
            L_0x003e:
                r4.U = r8
                r4.S = r1
                r4.T = r3
                java.lang.Object r5 = r1.b(r4)
                if (r5 != r0) goto L_0x004b
                return r0
            L_0x004b:
                r6 = r4
                r4 = r8
                r8 = r5
                r5 = r6
            L_0x004f:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L_0x006b
                java.lang.Object r8 = r1.next()
                r5.U = r4
                r5.S = r1
                r5.T = r2
                java.lang.Object r8 = r4.C(r8, r5)
                if (r8 != r0) goto L_0x0068
                return r0
            L_0x0068:
                r8 = r4
                r4 = r5
                goto L_0x003e
            L_0x006b:
                zd.u2 r8 = zd.u2.f25116a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: rf.l.c.K(java.lang.Object):java.lang.Object");
        }

        @h
        /* renamed from: P */
        public final Object g0(@g g0<? super E> g0Var, @h d<? super u2> dVar) {
            return ((c) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    @g
    @e3
    public static final <E> i<E> a(@g u0 u0Var, @g ie.g gVar, int i10, @g w0 w0Var, @h we.l<? super Throwable, u2> lVar, @g @zd.b p<? super g0<? super E>, ? super d<? super u2>, ? extends Object> pVar) {
        ie.g e10 = pf.n0.e(u0Var, gVar);
        i a10 = j.a(i10);
        k c0Var = w0Var.e() ? new c0(e10, a10, pVar) : new k(e10, a10, true);
        if (lVar != null) {
            c0Var.A(lVar);
        }
        c0Var.I1(w0Var, c0Var, pVar);
        return c0Var;
    }

    @g
    @e3
    public static final <E> i<E> b(@g i0<? extends E> i0Var, int i10, @g w0 w0Var) {
        return c(v0.m(v0.m(e2.O, m1.g()), new a(p0.C)), (ie.g) null, i10, w0Var, new b(i0Var), new c(i0Var, (d<? super c>) null), 1, (Object) null);
    }

    public static /* synthetic */ i c(u0 u0Var, ie.g gVar, int i10, w0 w0Var, we.l lVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = i.O;
        }
        ie.g gVar2 = gVar;
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            w0Var = w0.LAZY;
        }
        w0 w0Var2 = w0Var;
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        return a(u0Var, gVar2, i12, w0Var2, lVar, pVar);
    }

    public static /* synthetic */ i d(i0 i0Var, int i10, w0 w0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        if ((i11 & 2) != 0) {
            w0Var = w0.LAZY;
        }
        return b(i0Var, i10, w0Var);
    }
}

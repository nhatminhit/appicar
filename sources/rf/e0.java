package rf;

import fh.g;
import fh.h;
import ie.i;
import kotlin.Metadata;
import le.d;
import le.f;
import pf.c2;
import pf.i2;
import pf.q;
import pf.u0;
import pf.w0;
import we.l;
import we.p;
import xe.n0;
import zd.d1;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001ag\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a \u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aª\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lrf/g0;", "Lkotlin/Function0;", "Lzd/u2;", "block", "a", "(Lrf/g0;Lwe/a;Lie/d;)Ljava/lang/Object;", "E", "Lpf/u0;", "Lie/g;", "context", "", "capacity", "Lkotlin/Function2;", "Lie/d;", "", "Lzd/u;", "Lrf/i0;", "e", "(Lpf/u0;Lie/g;ILwe/p;)Lrf/i0;", "Lpf/w0;", "start", "Lkotlin/Function1;", "", "Lzd/v0;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "c", "(Lpf/u0;Lie/g;ILpf/w0;Lwe/l;Lwe/p;)Lrf/i0;", "Lrf/m;", "onBufferOverflow", "d", "(Lpf/u0;Lie/g;ILrf/m;Lpf/w0;Lwe/l;Lwe/p;)Lrf/i0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class e0 {

    @f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {153}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a extends d {
        public Object R;
        public Object S;
        public /* synthetic */ Object T;
        public int U;

        public a(ie.d<? super a> dVar) {
            super(dVar);
        }

        @h
        public final Object K(@g Object obj) {
            this.T = obj;
            this.U |= Integer.MIN_VALUE;
            return e0.a((g0<?>) null, (we.a<u2>) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzd/u2;", "c", "()V"}, k = 3, mv = {1, 6, 0})
    public static final class b extends n0 implements we.a<u2> {
        public static final b P = new b();

        public b() {
            super(0);
        }

        public final void c() {
        }

        public /* bridge */ /* synthetic */ Object n() {
            c();
            return u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzd/u2;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    public static final class c extends n0 implements l<Throwable, u2> {
        public final /* synthetic */ q<u2> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(q<? super u2> qVar) {
            super(1);
            this.P = qVar;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Throwable) obj);
            return u2.f25116a;
        }

        public final void c(@h Throwable th2) {
            q<u2> qVar = this.P;
            d1.a aVar = d1.P;
            qVar.x(d1.b(u2.f25116a));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: we.a<zd.u2>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(@fh.g rf.g0<?> r4, @fh.g we.a<zd.u2> r5, @fh.g ie.d<? super zd.u2> r6) {
        /*
            boolean r0 = r6 instanceof rf.e0.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            rf.e0$a r0 = (rf.e0.a) r0
            int r1 = r0.U
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.U = r1
            goto L_0x0018
        L_0x0013:
            rf.e0$a r0 = new rf.e0$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.T
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.U
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.S
            r5 = r4
            we.a r5 = (we.a) r5
            java.lang.Object r4 = r0.R
            rf.g0 r4 = (rf.g0) r4
            zd.e1.n(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x007a
        L_0x0032:
            r4 = move-exception
            goto L_0x0080
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            zd.e1.n(r6)
            ie.g r6 = r0.e()
            pf.n2$b r2 = pf.n2.D
            ie.g$b r6 = r6.g(r2)
            if (r6 != r4) goto L_0x004d
            r6 = r3
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            if (r6 == 0) goto L_0x0084
            r0.R = r4     // Catch:{ all -> 0x0032 }
            r0.S = r5     // Catch:{ all -> 0x0032 }
            r0.U = r3     // Catch:{ all -> 0x0032 }
            pf.r r6 = new pf.r     // Catch:{ all -> 0x0032 }
            ie.d r2 = ke.c.d(r0)     // Catch:{ all -> 0x0032 }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x0032 }
            r6.Z()     // Catch:{ all -> 0x0032 }
            rf.e0$c r2 = new rf.e0$c     // Catch:{ all -> 0x0032 }
            r2.<init>(r6)     // Catch:{ all -> 0x0032 }
            r4.n(r2)     // Catch:{ all -> 0x0032 }
            java.lang.Object r4 = r6.z()     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = ke.d.h()     // Catch:{ all -> 0x0032 }
            if (r4 != r6) goto L_0x0077
            le.h.c(r0)     // Catch:{ all -> 0x0032 }
        L_0x0077:
            if (r4 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r5.n()
            zd.u2 r4 = zd.u2.f25116a
            return r4
        L_0x0080:
            r5.n()
            throw r4
        L_0x0084:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.e0.a(rf.g0, we.a, ie.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(g0 g0Var, we.a aVar, ie.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = b.P;
        }
        return a(g0Var, aVar, dVar);
    }

    @g
    @i2
    public static final <E> i0<E> c(@g u0 u0Var, @g ie.g gVar, int i10, @g w0 w0Var, @h l<? super Throwable, u2> lVar, @g @zd.b p<? super g0<? super E>, ? super ie.d<? super u2>, ? extends Object> pVar) {
        return d(u0Var, gVar, i10, m.SUSPEND, w0Var, lVar, pVar);
    }

    @g
    public static final <E> i0<E> d(@g u0 u0Var, @g ie.g gVar, int i10, @g m mVar, @g w0 w0Var, @h l<? super Throwable, u2> lVar, @g @zd.b p<? super g0<? super E>, ? super ie.d<? super u2>, ? extends Object> pVar) {
        f0 f0Var = new f0(pf.n0.e(u0Var, gVar), q.d(i10, mVar, (l) null, 4, (Object) null));
        if (lVar != null) {
            f0Var.A(lVar);
        }
        f0Var.I1(w0Var, f0Var, pVar);
        return f0Var;
    }

    @g
    @c2
    public static final <E> i0<E> e(@g u0 u0Var, @g ie.g gVar, int i10, @g @zd.b p<? super g0<? super E>, ? super ie.d<? super u2>, ? extends Object> pVar) {
        return d(u0Var, gVar, i10, m.SUSPEND, w0.DEFAULT, (l<? super Throwable, u2>) null, pVar);
    }

    public static /* synthetic */ i0 f(u0 u0Var, ie.g gVar, int i10, w0 w0Var, l lVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = i.O;
        }
        ie.g gVar2 = gVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            w0Var = w0.DEFAULT;
        }
        w0 w0Var2 = w0Var;
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        return c(u0Var, gVar2, i12, w0Var2, lVar, pVar);
    }

    public static /* synthetic */ i0 g(u0 u0Var, ie.g gVar, int i10, m mVar, w0 w0Var, l lVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = i.O;
        }
        ie.g gVar2 = gVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            mVar = m.SUSPEND;
        }
        m mVar2 = mVar;
        if ((i11 & 8) != 0) {
            w0Var = w0.DEFAULT;
        }
        w0 w0Var2 = w0Var;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        return d(u0Var, gVar2, i12, mVar2, w0Var2, lVar, pVar);
    }

    public static /* synthetic */ i0 h(u0 u0Var, ie.g gVar, int i10, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = i.O;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return e(u0Var, gVar, i10, pVar);
    }
}

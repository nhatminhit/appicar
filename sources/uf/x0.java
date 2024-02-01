package uf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import le.f;
import we.p;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR>\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000f8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Luf/x0;", "T", "Luf/j;", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "a", "(Lie/d;)Ljava/lang/Object;", "O", "Luf/j;", "collector", "Lkotlin/Function2;", "Lie/d;", "", "Lzd/u;", "P", "Lwe/p;", "action", "<init>", "(Luf/j;Lwe/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class x0<T> implements j<T> {
    @g
    public final j<T> O;
    @g
    public final p<j<? super T>, d<? super u2>, Object> P;

    @f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {419, 423}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a extends le.d {
        public Object R;
        public Object S;
        public /* synthetic */ Object T;
        public final /* synthetic */ x0<T> U;
        public int V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(x0<T> x0Var, d<? super a> dVar) {
            super(dVar);
            this.U = x0Var;
        }

        @h
        public final Object K(@g Object obj) {
            this.T = obj;
            this.V |= Integer.MIN_VALUE;
            return this.U.a(this);
        }
    }

    public x0(@g j<? super T> jVar, @g p<? super j<? super T>, ? super d<? super u2>, ? extends Object> pVar) {
        this.O = jVar;
        this.P = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(@fh.g ie.d<? super zd.u2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof uf.x0.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            uf.x0$a r0 = (uf.x0.a) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.V = r1
            goto L_0x0018
        L_0x0013:
            uf.x0$a r0 = new uf.x0$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.T
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.V
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            zd.e1.n(r7)
            goto L_0x0077
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.S
            vf.v r2 = (vf.v) r2
            java.lang.Object r4 = r0.R
            uf.x0 r4 = (uf.x0) r4
            zd.e1.n(r7)     // Catch:{ all -> 0x007d }
            goto L_0x005e
        L_0x0040:
            zd.e1.n(r7)
            vf.v r2 = new vf.v
            uf.j<T> r7 = r6.O
            ie.g r5 = r0.e()
            r2.<init>(r7, r5)
            we.p<uf.j<? super T>, ie.d<? super zd.u2>, java.lang.Object> r7 = r6.P     // Catch:{ all -> 0x007d }
            r0.R = r6     // Catch:{ all -> 0x007d }
            r0.S = r2     // Catch:{ all -> 0x007d }
            r0.V = r4     // Catch:{ all -> 0x007d }
            java.lang.Object r7 = r7.g0(r2, r0)     // Catch:{ all -> 0x007d }
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r4 = r6
        L_0x005e:
            r2.L()
            uf.j<T> r7 = r4.O
            boolean r2 = r7 instanceof uf.x0
            if (r2 == 0) goto L_0x007a
            uf.x0 r7 = (uf.x0) r7
            r2 = 0
            r0.R = r2
            r0.S = r2
            r0.V = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L_0x0077
            return r1
        L_0x0077:
            zd.u2 r7 = zd.u2.f25116a
            return r7
        L_0x007a:
            zd.u2 r7 = zd.u2.f25116a
            return r7
        L_0x007d:
            r7 = move-exception
            r2.L()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.x0.a(ie.d):java.lang.Object");
    }

    @h
    public Object d(T t10, @g d<? super u2> dVar) {
        return this.O.d(t10, dVar);
    }
}

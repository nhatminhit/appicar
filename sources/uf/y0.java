package uf;

import fh.g;
import fh.h;
import ie.d;
import java.util.List;
import kotlin.Metadata;
import le.f;
import we.p;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000fø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR>\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000f8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Luf/y0;", "T", "Luf/i0;", "Luf/j;", "collector", "", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "O", "Luf/i0;", "sharedFlow", "Lkotlin/Function2;", "Lie/d;", "Lzd/u2;", "", "Lzd/u;", "P", "Lwe/p;", "action", "", "b", "()Ljava/util/List;", "replayCache", "<init>", "(Luf/i0;Lwe/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class y0<T> implements i0<T> {
    @g
    public final i0<T> O;
    @g
    public final p<j<? super T>, d<? super u2>, Object> P;

    @f(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {409}, m = "collect", n = {}, s = {})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a extends le.d {
        public /* synthetic */ Object R;
        public final /* synthetic */ y0<T> S;
        public int T;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(y0<T> y0Var, d<? super a> dVar) {
            super(dVar);
            this.S = y0Var;
        }

        @h
        public final Object K(@g Object obj) {
            this.R = obj;
            this.T |= Integer.MIN_VALUE;
            return this.S.a((j) null, this);
        }
    }

    public y0(@g i0<? extends T> i0Var, @g p<? super j<? super T>, ? super d<? super u2>, ? extends Object> pVar) {
        this.O = i0Var;
        this.P = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(@fh.g uf.j<? super T> r6, @fh.g ie.d<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof uf.y0.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            uf.y0$a r0 = (uf.y0.a) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            uf.y0$a r0 = new uf.y0$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.R
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002d:
            zd.e1.n(r7)
            goto L_0x0046
        L_0x0031:
            zd.e1.n(r7)
            uf.i0<T> r7 = r5.O
            uf.x0 r2 = new uf.x0
            we.p<uf.j<? super T>, ie.d<? super zd.u2>, java.lang.Object> r4 = r5.P
            r2.<init>(r6, r4)
            r0.T = r3
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            zd.y r6 = new zd.y
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.y0.a(uf.j, ie.d):java.lang.Object");
    }

    @g
    public List<T> b() {
        return this.O.b();
    }
}

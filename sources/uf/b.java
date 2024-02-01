package uf;

import fh.g;
import fh.h;
import ie.d;
import ie.i;
import kotlin.Metadata;
import le.f;
import rf.g0;
import rf.m;
import vf.e;
import we.p;
import xe.w;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\u0016\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0002\b\u0013\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014R>\u0010\u0016\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0002\b\u00138\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Luf/b;", "T", "Luf/f;", "Lrf/g0;", "scope", "Lzd/u2;", "g", "(Lrf/g0;Lie/d;)Ljava/lang/Object;", "Lie/g;", "context", "", "capacity", "Lrf/m;", "onBufferOverflow", "Lvf/e;", "i", "Lkotlin/Function2;", "Lie/d;", "", "Lzd/u;", "S", "Lwe/p;", "block", "<init>", "(Lwe/p;Lie/g;ILrf/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class b<T> extends f<T> {
    @g
    public final p<g0<? super T>, d<? super u2>, Object> S;

    @f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {336}, m = "collectTo", n = {"scope"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a extends le.d {
        public Object R;
        public /* synthetic */ Object S;
        public final /* synthetic */ b<T> T;
        public int U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, d<? super a> dVar) {
            super(dVar);
            this.T = bVar;
        }

        @h
        public final Object K(@g Object obj) {
            this.S = obj;
            this.U |= Integer.MIN_VALUE;
            return this.T.g((g0) null, this);
        }
    }

    public b(@g p<? super g0<? super T>, ? super d<? super u2>, ? extends Object> pVar, @g ie.g gVar, int i10, @g m mVar) {
        super(pVar, gVar, i10, mVar);
        this.S = pVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(p pVar, ie.g gVar, int i10, m mVar, int i11, w wVar) {
        this(pVar, (i11 & 2) != 0 ? i.O : gVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? m.SUSPEND : mVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(@fh.g rf.g0<? super T> r5, @fh.g ie.d<? super zd.u2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof uf.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            uf.b$a r0 = (uf.b.a) r0
            int r1 = r0.U
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.U = r1
            goto L_0x0018
        L_0x0013:
            uf.b$a r0 = new uf.b$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.U
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.R
            rf.g0 r5 = (rf.g0) r5
            zd.e1.n(r6)
            goto L_0x0043
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            zd.e1.n(r6)
            r0.R = r5
            r0.U = r3
            java.lang.Object r6 = super.g(r5, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            boolean r5 = r5.L()
            if (r5 == 0) goto L_0x004c
            zd.u2 r5 = zd.u2.f25116a
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.b.g(rf.g0, ie.d):java.lang.Object");
    }

    @g
    public e<T> i(@g ie.g gVar, int i10, @g m mVar) {
        return new b(this.S, gVar, i10, mVar);
    }
}

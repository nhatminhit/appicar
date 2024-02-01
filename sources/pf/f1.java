package pf;

import fh.g;
import fh.h;
import gf.v;
import ie.e;
import ie.g;
import ke.c;
import kotlin.Metadata;
import le.d;
import le.f;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"", "a", "(Lie/d;)Ljava/lang/Object;", "", "timeMillis", "Lzd/u2;", "b", "(JLie/d;)Ljava/lang/Object;", "Lnf/e;", "duration", "c", "e", "(J)J", "Lie/g;", "Lpf/e1;", "d", "(Lie/g;)Lpf/e1;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class f1 {

    @f(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {148}, m = "awaitCancellation", n = {}, s = {})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a extends d {
        public /* synthetic */ Object R;
        public int S;

        public a(ie.d<? super a> dVar) {
            super(dVar);
        }

        @h
        public final Object K(@g Object obj) {
            this.R = obj;
            this.S |= Integer.MIN_VALUE;
            return f1.a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(@fh.g ie.d<?> r4) {
        /*
            boolean r0 = r4 instanceof pf.f1.a
            if (r0 == 0) goto L_0x0013
            r0 = r4
            pf.f1$a r0 = (pf.f1.a) r0
            int r1 = r0.S
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.S = r1
            goto L_0x0018
        L_0x0013:
            pf.f1$a r0 = new pf.f1$a
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.R
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.S
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x002d:
            zd.e1.n(r4)
            goto L_0x0052
        L_0x0031:
            zd.e1.n(r4)
            r0.S = r3
            pf.r r4 = new pf.r
            ie.d r2 = ke.c.d(r0)
            r4.<init>(r2, r3)
            r4.Z()
            java.lang.Object r4 = r4.z()
            java.lang.Object r2 = ke.d.h()
            if (r4 != r2) goto L_0x004f
            le.h.c(r0)
        L_0x004f:
            if (r4 != r1) goto L_0x0052
            return r1
        L_0x0052:
            zd.y r4 = new zd.y
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.f1.a(ie.d):java.lang.Object");
    }

    @h
    public static final Object b(long j10, @g ie.d<? super u2> dVar) {
        if (j10 <= 0) {
            return u2.f25116a;
        }
        r rVar = new r(c.d(dVar), 1);
        rVar.Z();
        if (j10 < Long.MAX_VALUE) {
            d(rVar.e()).p1(j10, rVar);
        }
        Object z10 = rVar.z();
        if (z10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return z10 == ke.d.h() ? z10 : u2.f25116a;
    }

    @h
    public static final Object c(long j10, @g ie.d<? super u2> dVar) {
        Object b10 = b(e(j10), dVar);
        return b10 == ke.d.h() ? b10 : u2.f25116a;
    }

    @g
    public static final e1 d(@g ie.g gVar) {
        g.b g10 = gVar.g(e.B);
        e1 e1Var = g10 instanceof e1 ? (e1) g10 : null;
        return e1Var == null ? b1.a() : e1Var;
    }

    public static final long e(long j10) {
        if (nf.e.l(j10, nf.e.P.W()) > 0) {
            return v.v(nf.e.M(j10), 1);
        }
        return 0;
    }
}

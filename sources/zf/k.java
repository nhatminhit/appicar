package zf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import le.d;
import le.f;
import pf.c2;
import we.l;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u00020\u00032\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0002\b\u0004HHø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lzf/a;", "", "Lzd/u2;", "Lzd/u;", "builder", "a", "(Lwe/l;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class k {

    @f(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {37}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class a extends d {
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
            return k.a((l<? super a<? super Boolean>, u2>) null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    @pf.c2
    @fh.h
    public static final java.lang.Object a(@fh.g we.l<? super zf.a<? super java.lang.Boolean>, zd.u2> r4, @fh.g ie.d<? super zd.u2> r5) {
        /*
            boolean r0 = r5 instanceof zf.k.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            zf.k$a r0 = (zf.k.a) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            zf.k$a r0 = new zf.k$a
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.R
            we.l r4 = (we.l) r4
            zd.e1.n(r5)
            goto L_0x0059
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            zd.e1.n(r5)
        L_0x0038:
            r0.R = r4
            r0.T = r3
            zf.b r5 = new zf.b
            r5.<init>(r0)
            r4.A(r5)     // Catch:{ all -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r2 = move-exception
            r5.g1(r2)
        L_0x0049:
            java.lang.Object r5 = r5.f1()
            java.lang.Object r2 = ke.d.h()
            if (r5 != r2) goto L_0x0056
            le.h.c(r0)
        L_0x0056:
            if (r5 != r1) goto L_0x0059
            return r1
        L_0x0059:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0038
            zd.u2 r4 = zd.u2.f25116a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.k.a(we.l, ie.d):java.lang.Object");
    }

    @c2
    public static final Object b(l<? super a<? super Boolean>, u2> lVar, ie.d<? super u2> dVar) {
        Object f12;
        do {
            xe.i0.e(0);
            b bVar = new b(dVar);
            try {
                lVar.A(bVar);
            } catch (Throwable th2) {
                bVar.g1(th2);
            }
            f12 = bVar.f1();
            if (f12 == ke.d.h()) {
                le.h.c(dVar);
            }
            xe.i0.e(1);
        } while (((Boolean) f12).booleanValue());
        return u2.f25116a;
    }
}

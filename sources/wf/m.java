package wf;

import fh.g;
import ie.d;
import kotlin.Metadata;
import pf.t1;
import pf.u3;
import ve.e;
import we.a;
import we.l;
import xe.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aW\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0012\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\t0\rH\u0000\u001a;\u0010\u0017\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\b\"\u001a\u0010\u001d\u001a\u00020\u00188\u0002X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001f\u001a\u00020\u00188\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u0012\u0004\b\u001e\u0010\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"T", "Lie/d;", "Lzd/d1;", "result", "Lkotlin/Function1;", "", "Lzd/v0;", "name", "cause", "Lzd/u2;", "onCancellation", "f", "(Lie/d;Ljava/lang/Object;Lwe/l;)V", "Lwf/l;", "", "h", "", "contState", "", "mode", "doYield", "Lkotlin/Function0;", "block", "b", "Lwf/r0;", "a", "Lwf/r0;", "getUNDEFINED$annotations", "()V", "UNDEFINED", "getREUSABLE_CLAIMED$annotations", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class m {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f24106a = new r0("UNDEFINED");
    @g
    @e

    /* renamed from: b  reason: collision with root package name */
    public static final r0 f24107b = new r0("REUSABLE_CLAIMED");

    public static final boolean b(l<?> lVar, Object obj, int i10, boolean z10, a<u2> aVar) {
        t1 b10 = u3.f22027a.b();
        if (z10 && b10.b2()) {
            return false;
        }
        if (b10.a2()) {
            lVar.T = obj;
            lVar.Q = i10;
            b10.V1(lVar);
            return true;
        }
        b10.X1(true);
        try {
            aVar.n();
            do {
            } while (b10.d2());
        } catch (Throwable th2) {
            i0.d(1);
            b10.S1(true);
            i0.c(1);
            throw th2;
        }
        i0.d(1);
        b10.S1(true);
        i0.c(1);
        return false;
    }

    public static /* synthetic */ boolean c(l lVar, Object obj, int i10, boolean z10, a aVar, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        t1 b10 = u3.f22027a.b();
        if (z10 && b10.b2()) {
            return false;
        }
        if (b10.a2()) {
            lVar.T = obj;
            lVar.Q = i10;
            b10.V1(lVar);
            return true;
        }
        b10.X1(true);
        try {
            aVar.n();
            do {
            } while (b10.d2());
        } catch (Throwable th2) {
            i0.d(1);
            b10.S1(true);
            i0.c(1);
            throw th2;
        }
        i0.d(1);
        b10.S1(true);
        i0.c(1);
        return false;
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r8.K1() != false) goto L_0x0091;
     */
    @pf.i2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void f(@fh.g ie.d<? super T> r6, @fh.g java.lang.Object r7, @fh.h we.l<? super java.lang.Throwable, zd.u2> r8) {
        /*
            boolean r0 = r6 instanceof wf.l
            if (r0 == 0) goto L_0x00b6
            wf.l r6 = (wf.l) r6
            java.lang.Object r8 = pf.k0.c(r7, r8)
            pf.o0 r0 = r6.R
            ie.g r1 = r6.e()
            boolean r0 = r0.P1(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.T = r8
            r6.Q = r1
            pf.o0 r7 = r6.R
            ie.g r8 = r6.e()
            r7.N1(r8, r6)
            goto L_0x00b9
        L_0x0026:
            pf.u3 r0 = pf.u3.f22027a
            pf.t1 r0 = r0.b()
            boolean r2 = r0.a2()
            if (r2 == 0) goto L_0x003b
            r6.T = r8
            r6.Q = r1
            r0.V1(r6)
            goto L_0x00b9
        L_0x003b:
            r0.X1(r1)
            r2 = 0
            ie.g r3 = r6.e()     // Catch:{ all -> 0x00a9 }
            pf.n2$b r4 = pf.n2.D     // Catch:{ all -> 0x00a9 }
            ie.g$b r3 = r3.g(r4)     // Catch:{ all -> 0x00a9 }
            pf.n2 r3 = (pf.n2) r3     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0069
            boolean r4 = r3.c()     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x0069
            java.util.concurrent.CancellationException r3 = r3.k0()     // Catch:{ all -> 0x00a9 }
            r6.b(r8, r3)     // Catch:{ all -> 0x00a9 }
            zd.d1$a r8 = zd.d1.P     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = zd.e1.a(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = zd.d1.b(r8)     // Catch:{ all -> 0x00a9 }
            r6.x(r8)     // Catch:{ all -> 0x00a9 }
            r8 = r1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            if (r8 != 0) goto L_0x00a2
            ie.d<T> r8 = r6.S     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = r6.U     // Catch:{ all -> 0x00a9 }
            ie.g r4 = r8.e()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = wf.w0.c(r4, r3)     // Catch:{ all -> 0x00a9 }
            wf.r0 r5 = wf.w0.f24123a     // Catch:{ all -> 0x00a9 }
            if (r3 == r5) goto L_0x0081
            pf.c4 r8 = pf.n0.g(r8, r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x0082
        L_0x0081:
            r8 = r2
        L_0x0082:
            ie.d<T> r5 = r6.S     // Catch:{ all -> 0x0095 }
            r5.x(r7)     // Catch:{ all -> 0x0095 }
            zd.u2 r7 = zd.u2.f25116a     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0091
            boolean r7 = r8.K1()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x00a2
        L_0x0091:
            wf.w0.a(r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a2
        L_0x0095:
            r7 = move-exception
            if (r8 == 0) goto L_0x009e
            boolean r8 = r8.K1()     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
        L_0x009e:
            wf.w0.a(r4, r3)     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            boolean r7 = r0.d2()     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a9:
            r7 = move-exception
            r6.i(r7, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r0.S1(r1)
            goto L_0x00b9
        L_0x00b1:
            r6 = move-exception
            r0.S1(r1)
            throw r6
        L_0x00b6:
            r6.x(r7)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.m.f(ie.d, java.lang.Object, we.l):void");
    }

    public static /* synthetic */ void g(d dVar, Object obj, l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        f(dVar, obj, lVar);
    }

    public static final boolean h(@g l<? super u2> lVar) {
        u2 u2Var = u2.f25116a;
        t1 b10 = u3.f22027a.b();
        if (b10.b2()) {
            return false;
        }
        if (b10.a2()) {
            lVar.T = u2Var;
            lVar.Q = 1;
            b10.V1(lVar);
            return true;
        }
        b10.X1(true);
        try {
            lVar.run();
            do {
            } while (b10.d2());
        } catch (Throwable th2) {
            b10.S1(true);
            throw th2;
        }
        b10.S1(true);
        return false;
    }
}

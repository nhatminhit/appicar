package pf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import ve.e;
import xe.l0;
import yf.k;
import zd.p;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lpf/j1;", "T", "Lyf/k;", "Lkotlinx/coroutines/SchedulerTask;", "", "j", "()Ljava/lang/Object;", "takenState", "", "cause", "Lzd/u2;", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "g", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "i", "", "Q", "I", "resumeMode", "Lie/d;", "d", "()Lie/d;", "delegate", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class j1<T> extends k {
    @e
    public int Q;

    public j1(int i10) {
        this.Q = i10;
    }

    public void b(@h Object obj, @g Throwable th2) {
    }

    @g
    public abstract d<T> d();

    @h
    public Throwable g(@h Object obj) {
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        if (e0Var != null) {
            return e0Var.f21998a;
        }
        return null;
    }

    public <T> T h(@h Object obj) {
        return obj;
    }

    public final void i(@h Throwable th2, @h Throwable th3) {
        if (th2 != null || th3 != null) {
            if (!(th2 == null || th3 == null)) {
                p.a(th2, th3);
            }
            if (th2 == null) {
                th2 = th3;
            }
            l0.m(th2);
            r0.b(d().e(), new x0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
        }
    }

    @h
    public abstract Object j();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r4.K1() != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        if (r4.K1() != false) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            yf.l r0 = r10.P
            ie.d r1 = r10.d()     // Catch:{ all -> 0x00ab }
            wf.l r1 = (wf.l) r1     // Catch:{ all -> 0x00ab }
            ie.d<T> r2 = r1.S     // Catch:{ all -> 0x00ab }
            java.lang.Object r1 = r1.U     // Catch:{ all -> 0x00ab }
            ie.g r3 = r2.e()     // Catch:{ all -> 0x00ab }
            java.lang.Object r1 = wf.w0.c(r3, r1)     // Catch:{ all -> 0x00ab }
            wf.r0 r4 = wf.w0.f24123a     // Catch:{ all -> 0x00ab }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            pf.c4 r4 = pf.n0.g(r2, r3, r1)     // Catch:{ all -> 0x00ab }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            ie.g r6 = r2.e()     // Catch:{ all -> 0x009e }
            java.lang.Object r7 = r10.j()     // Catch:{ all -> 0x009e }
            java.lang.Throwable r8 = r10.g(r7)     // Catch:{ all -> 0x009e }
            if (r8 != 0) goto L_0x003e
            int r9 = r10.Q     // Catch:{ all -> 0x009e }
            boolean r9 = pf.k1.c(r9)     // Catch:{ all -> 0x009e }
            if (r9 == 0) goto L_0x003e
            pf.n2$b r9 = pf.n2.D     // Catch:{ all -> 0x009e }
            ie.g$b r6 = r6.g(r9)     // Catch:{ all -> 0x009e }
            pf.n2 r6 = (pf.n2) r6     // Catch:{ all -> 0x009e }
            goto L_0x003f
        L_0x003e:
            r6 = r5
        L_0x003f:
            if (r6 == 0) goto L_0x005c
            boolean r9 = r6.c()     // Catch:{ all -> 0x009e }
            if (r9 != 0) goto L_0x005c
            java.util.concurrent.CancellationException r6 = r6.k0()     // Catch:{ all -> 0x009e }
            r10.b(r7, r6)     // Catch:{ all -> 0x009e }
            zd.d1$a r7 = zd.d1.P     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = zd.e1.a(r6)     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = zd.d1.b(r6)     // Catch:{ all -> 0x009e }
        L_0x0058:
            r2.x(r6)     // Catch:{ all -> 0x009e }
            goto L_0x0074
        L_0x005c:
            if (r8 == 0) goto L_0x0069
            zd.d1$a r6 = zd.d1.P     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = zd.e1.a(r8)     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = zd.d1.b(r6)     // Catch:{ all -> 0x009e }
            goto L_0x0058
        L_0x0069:
            zd.d1$a r6 = zd.d1.P     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = r10.h(r7)     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = zd.d1.b(r6)     // Catch:{ all -> 0x009e }
            goto L_0x0058
        L_0x0074:
            zd.u2 r2 = zd.u2.f25116a     // Catch:{ all -> 0x009e }
            if (r4 == 0) goto L_0x007e
            boolean r4 = r4.K1()     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x0081
        L_0x007e:
            wf.w0.a(r3, r1)     // Catch:{ all -> 0x00ab }
        L_0x0081:
            zd.d1$a r1 = zd.d1.P     // Catch:{ all -> 0x008b }
            r0.c0()     // Catch:{ all -> 0x008b }
            java.lang.Object r0 = zd.d1.b(r2)     // Catch:{ all -> 0x008b }
            goto L_0x0096
        L_0x008b:
            r0 = move-exception
            zd.d1$a r1 = zd.d1.P
            java.lang.Object r0 = zd.e1.a(r0)
            java.lang.Object r0 = zd.d1.b(r0)
        L_0x0096:
            java.lang.Throwable r0 = zd.d1.e(r0)
            r10.i(r5, r0)
            goto L_0x00ca
        L_0x009e:
            r2 = move-exception
            if (r4 == 0) goto L_0x00a7
            boolean r4 = r4.K1()     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x00aa
        L_0x00a7:
            wf.w0.a(r3, r1)     // Catch:{ all -> 0x00ab }
        L_0x00aa:
            throw r2     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r1 = move-exception
            zd.d1$a r2 = zd.d1.P     // Catch:{ all -> 0x00b8 }
            r0.c0()     // Catch:{ all -> 0x00b8 }
            zd.u2 r0 = zd.u2.f25116a     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = zd.d1.b(r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x00c3
        L_0x00b8:
            r0 = move-exception
            zd.d1$a r2 = zd.d1.P
            java.lang.Object r0 = zd.e1.a(r0)
            java.lang.Object r0 = zd.d1.b(r0)
        L_0x00c3:
            java.lang.Throwable r0 = zd.d1.e(r0)
            r10.i(r1, r0)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.j1.run():void");
    }
}

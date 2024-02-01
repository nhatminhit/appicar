package pf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import wf.n0;
import wf.w0;
import zd.r1;
import zd.u0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014R*\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e0\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lpf/c4;", "T", "Lwf/n0;", "Lie/g;", "context", "", "oldValue", "Lzd/u2;", "M1", "", "K1", "state", "E1", "Ljava/lang/ThreadLocal;", "Lzd/u0;", "R", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "Lie/d;", "uCont", "<init>", "(Lie/g;Lie/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class c4<T> extends n0<T> {
    @g
    public ThreadLocal<u0<ie.g, Object>> R;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c4(@fh.g ie.g r3, @fh.g ie.d<? super T> r4) {
        /*
            r2 = this;
            pf.d4 r0 = pf.d4.O
            ie.g$b r1 = r3.g(r0)
            if (r1 != 0) goto L_0x000d
            ie.g r0 = r3.m1(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.R = r0
            ie.g r4 = r4.e()
            ie.e$b r0 = ie.e.B
            ie.g$b r4 = r4.g(r0)
            boolean r4 = r4 instanceof pf.o0
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = wf.w0.c(r3, r4)
            wf.w0.a(r3, r4)
            r2.M1(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.c4.<init>(ie.g, ie.d):void");
    }

    public void E1(@h Object obj) {
        u0 u0Var = this.R.get();
        c4<?> c4Var = null;
        if (u0Var != null) {
            w0.a((ie.g) u0Var.a(), u0Var.b());
            this.R.set(c4Var);
        }
        Object a10 = k0.a(obj, this.Q);
        d<T> dVar = this.Q;
        ie.g e10 = dVar.e();
        Object c10 = w0.c(e10, c4Var);
        if (c10 != w0.f24123a) {
            c4Var = n0.g(dVar, e10, c10);
        }
        try {
            this.Q.x(a10);
            u2 u2Var = u2.f25116a;
        } finally {
            if (c4Var == null || c4Var.K1()) {
                w0.a(e10, c10);
            }
        }
    }

    public final boolean K1() {
        if (this.R.get() == null) {
            return false;
        }
        this.R.set((Object) null);
        return true;
    }

    public final void M1(@g ie.g gVar, @h Object obj) {
        this.R.set(r1.a(gVar, obj));
    }
}

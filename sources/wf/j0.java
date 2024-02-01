package wf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import pf.z0;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000R\u001a\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lwf/j0;", "", "affected", "c", "", "toString", "that", "", "b", "Lwf/d;", "a", "()Lwf/d;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class j0 {
    @h
    public abstract d<?> a();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r7 = r7.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(@fh.g wf.j0 r7) {
        /*
            r6 = this;
            wf.d r0 = r6.a()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            wf.d r7 = r7.a()
            if (r7 != 0) goto L_0x000f
            return r1
        L_0x000f:
            long r2 = r0.g()
            long r4 = r7.g()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x001c
            r1 = 1
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.j0.b(wf.j0):boolean");
    }

    @h
    public abstract Object c(@h Object obj);

    @g
    public String toString() {
        return z0.a(this) + '@' + z0.b(this);
    }
}

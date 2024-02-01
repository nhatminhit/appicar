package m7;

import h7.e;
import w7.a;
import w7.q0;

public final class b implements e {
    public final h7.b[] O;
    public final long[] P;

    public b(h7.b[] bVarArr, long[] jArr) {
        this.O = bVarArr;
        this.P = jArr;
    }

    public int a(long j10) {
        int h10 = q0.h(this.P, j10, false, false);
        if (h10 < this.P.length) {
            return h10;
        }
        return -1;
    }

    public long b(int i10) {
        boolean z10 = true;
        a.a(i10 >= 0);
        if (i10 >= this.P.length) {
            z10 = false;
        }
        a.a(z10);
        return this.P[i10];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r4 = r3.O[r4];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<h7.b> d(long r4) {
        /*
            r3 = this;
            long[] r0 = r3.P
            r1 = 1
            r2 = 0
            int r4 = w7.q0.k(r0, r4, r1, r2)
            r5 = -1
            if (r4 == r5) goto L_0x0019
            h7.b[] r5 = r3.O
            r4 = r5[r4]
            h7.b r5 = h7.b.f8883c0
            if (r4 != r5) goto L_0x0014
            goto L_0x0019
        L_0x0014:
            java.util.List r4 = java.util.Collections.singletonList(r4)
            return r4
        L_0x0019:
            java.util.List r4 = java.util.Collections.emptyList()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.b.d(long):java.util.List");
    }

    public int e() {
        return this.P.length;
    }
}

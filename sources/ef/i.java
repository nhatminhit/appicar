package ef;

import fh.g;
import java.io.Serializable;
import xe.w;

public final class i extends f implements Serializable {
    @g
    public static final a W = new a((w) null);
    @Deprecated
    public static final long X = 0;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(int r8, int r9) {
        /*
            r7 = this;
            int r5 = ~r8
            int r0 = r8 << 10
            int r1 = r9 >>> 4
            r6 = r0 ^ r1
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.i.<init>(int, int):void");
    }

    public i(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.Q = i10;
        this.R = i11;
        this.S = i12;
        this.T = i13;
        this.U = i14;
        this.V = i15;
        int i16 = i10 | i11 | i12 | i13 | i14;
        if (i16 != 0) {
            for (int i17 = 0; i17 < 64; i17++) {
                l();
            }
            return;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
    }

    public int b(int i10) {
        return g.j(l(), i10);
    }

    public int l() {
        int i10 = this.Q;
        int i11 = i10 ^ (i10 >>> 2);
        this.Q = this.R;
        this.R = this.S;
        this.S = this.T;
        int i12 = this.U;
        this.T = i12;
        int i13 = ((i11 ^ (i11 << 1)) ^ i12) ^ (i12 << 4);
        this.U = i13;
        int i14 = this.V + 362437;
        this.V = i14;
        return i13 + i14;
    }
}

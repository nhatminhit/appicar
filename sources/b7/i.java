package b7;

public class i implements s0 {
    public final s0[] O;

    public i(s0[] s0VarArr) {
        this.O = s0VarArr;
    }

    public final long b() {
        long j10 = Long.MAX_VALUE;
        for (s0 b10 : this.O) {
            long b11 = b10.b();
            if (b11 != Long.MIN_VALUE) {
                j10 = Math.min(j10, b11);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public boolean d(long j10) {
        long j11 = j10;
        boolean z10 = false;
        while (true) {
            long b10 = b();
            if (b10 != Long.MIN_VALUE) {
                boolean z11 = false;
                for (s0 s0Var : this.O) {
                    long b11 = s0Var.b();
                    boolean z12 = b11 != Long.MIN_VALUE && b11 <= j11;
                    if (b11 == b10 || z12) {
                        z11 |= s0Var.d(j11);
                    }
                }
                z10 |= z11;
                if (!z11) {
                    break;
                }
            } else {
                break;
            }
        }
        return z10;
    }

    public final long e() {
        long j10 = Long.MAX_VALUE;
        for (s0 e10 : this.O) {
            long e11 = e10.e();
            if (e11 != Long.MIN_VALUE) {
                j10 = Math.min(j10, e11);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public final void f(long j10) {
        for (s0 f10 : this.O) {
            f10.f(j10);
        }
    }
}

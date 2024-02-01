package gf;

import be.t0;
import java.util.NoSuchElementException;

public final class o extends t0 {
    public final long O;
    public final long P;
    public boolean Q;
    public long R;

    public o(long j10, long j11, long j12) {
        this.O = j12;
        this.P = j11;
        boolean z10 = true;
        if (j12 <= 0 ? j10 < j11 : j10 > j11) {
            z10 = false;
        }
        this.Q = z10;
        this.R = !z10 ? j11 : j10;
    }

    public final long a() {
        return this.O;
    }

    public boolean hasNext() {
        return this.Q;
    }

    public long nextLong() {
        long j10 = this.R;
        if (j10 != this.P) {
            this.R = this.O + j10;
        } else if (this.Q) {
            this.Q = false;
        } else {
            throw new NoSuchElementException();
        }
        return j10;
    }
}

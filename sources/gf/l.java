package gf;

import be.s0;
import java.util.NoSuchElementException;

public final class l extends s0 {
    public final int O;
    public final int P;
    public boolean Q;
    public int R;

    public l(int i10, int i11, int i12) {
        this.O = i12;
        this.P = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.Q = z10;
        this.R = !z10 ? i11 : i10;
    }

    public final int a() {
        return this.O;
    }

    public boolean hasNext() {
        return this.Q;
    }

    public int nextInt() {
        int i10 = this.R;
        if (i10 != this.P) {
            this.R = this.O + i10;
        } else if (this.Q) {
            this.Q = false;
        } else {
            throw new NoSuchElementException();
        }
        return i10;
    }
}

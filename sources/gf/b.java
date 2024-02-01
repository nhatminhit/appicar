package gf;

import be.t;
import java.util.NoSuchElementException;
import xe.l0;

public final class b extends t {
    public final int O;
    public final int P;
    public boolean Q;
    public int R;

    public b(char c10, char c11, int i10) {
        this.O = i10;
        this.P = c11;
        boolean z10 = true;
        if (i10 <= 0 ? l0.t(c10, c11) < 0 : l0.t(c10, c11) > 0) {
            z10 = false;
        }
        this.Q = z10;
        this.R = !z10 ? c11 : c10;
    }

    public char b() {
        int i10 = this.R;
        if (i10 != this.P) {
            this.R = this.O + i10;
        } else if (this.Q) {
            this.Q = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i10;
    }

    public final int c() {
        return this.O;
    }

    public boolean hasNext() {
        return this.Q;
    }
}

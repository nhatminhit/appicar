package xe;

import be.t;
import fh.g;
import java.util.NoSuchElementException;

public final class d extends t {
    @g
    public final char[] O;
    public int P;

    public d(@g char[] cArr) {
        l0.p(cArr, "array");
        this.O = cArr;
    }

    public char b() {
        try {
            char[] cArr = this.O;
            int i10 = this.P;
            this.P = i10 + 1;
            return cArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.P--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public boolean hasNext() {
        return this.P < this.O.length;
    }
}

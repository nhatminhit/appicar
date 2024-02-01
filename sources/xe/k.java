package xe;

import be.t0;
import fh.g;
import java.util.NoSuchElementException;

public final class k extends t0 {
    @g
    public final long[] O;
    public int P;

    public k(@g long[] jArr) {
        l0.p(jArr, "array");
        this.O = jArr;
    }

    public boolean hasNext() {
        return this.P < this.O.length;
    }

    public long nextLong() {
        try {
            long[] jArr = this.O;
            int i10 = this.P;
            this.P = i10 + 1;
            return jArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.P--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}

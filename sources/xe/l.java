package xe;

import be.n1;
import fh.g;
import java.util.NoSuchElementException;

public final class l extends n1 {
    @g
    public final short[] O;
    public int P;

    public l(@g short[] sArr) {
        l0.p(sArr, "array");
        this.O = sArr;
    }

    public short b() {
        try {
            short[] sArr = this.O;
            int i10 = this.P;
            this.P = i10 + 1;
            return sArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.P--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public boolean hasNext() {
        return this.P < this.O.length;
    }
}

package xe;

import be.s0;
import java.util.NoSuchElementException;

public final class g extends s0 {
    @fh.g
    public final int[] O;
    public int P;

    public g(@fh.g int[] iArr) {
        l0.p(iArr, "array");
        this.O = iArr;
    }

    public boolean hasNext() {
        return this.P < this.O.length;
    }

    public int nextInt() {
        try {
            int[] iArr = this.O;
            int i10 = this.P;
            this.P = i10 + 1;
            return iArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.P--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}

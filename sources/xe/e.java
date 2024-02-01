package xe;

import be.f0;
import fh.g;
import java.util.NoSuchElementException;

public final class e extends f0 {
    @g
    public final double[] O;
    public int P;

    public e(@g double[] dArr) {
        l0.p(dArr, "array");
        this.O = dArr;
    }

    public boolean hasNext() {
        return this.P < this.O.length;
    }

    public double nextDouble() {
        try {
            double[] dArr = this.O;
            int i10 = this.P;
            this.P = i10 + 1;
            return dArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.P--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}

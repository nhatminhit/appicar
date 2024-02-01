package xe;

import be.k0;
import fh.g;
import java.util.NoSuchElementException;

public final class f extends k0 {
    @g
    public final float[] O;
    public int P;

    public f(@g float[] fArr) {
        l0.p(fArr, "array");
        this.O = fArr;
    }

    public float b() {
        try {
            float[] fArr = this.O;
            int i10 = this.P;
            this.P = i10 + 1;
            return fArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.P--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public boolean hasNext() {
        return this.P < this.O.length;
    }
}

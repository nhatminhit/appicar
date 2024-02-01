package xe;

import be.r;
import fh.g;
import java.util.NoSuchElementException;

public final class b extends r {
    @g
    public final boolean[] O;
    public int P;

    public b(@g boolean[] zArr) {
        l0.p(zArr, "array");
        this.O = zArr;
    }

    public boolean b() {
        try {
            boolean[] zArr = this.O;
            int i10 = this.P;
            this.P = i10 + 1;
            return zArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.P--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public boolean hasNext() {
        return this.P < this.O.length;
    }
}

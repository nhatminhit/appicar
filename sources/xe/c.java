package xe;

import be.s;
import fh.g;
import java.util.NoSuchElementException;

public final class c extends s {
    @g
    public final byte[] O;
    public int P;

    public c(@g byte[] bArr) {
        l0.p(bArr, "array");
        this.O = bArr;
    }

    public byte b() {
        try {
            byte[] bArr = this.O;
            int i10 = this.P;
            this.P = i10 + 1;
            return bArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.P--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public boolean hasNext() {
        return this.P < this.O.length;
    }
}

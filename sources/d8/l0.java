package d8;

import java.util.Arrays;

public final class l0 extends k0 {
    public final byte[] P;

    public l0(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.P = bArr;
    }

    public final byte[] b0() {
        return this.P;
    }
}

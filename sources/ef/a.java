package ef;

import fh.g;
import java.util.Random;
import xe.l0;

public abstract class a extends f {
    public int b(int i10) {
        return g.j(r().nextInt(), i10);
    }

    public boolean c() {
        return r().nextBoolean();
    }

    @g
    public byte[] e(@g byte[] bArr) {
        l0.p(bArr, "array");
        r().nextBytes(bArr);
        return bArr;
    }

    public double h() {
        return r().nextDouble();
    }

    public float k() {
        return r().nextFloat();
    }

    public int l() {
        return r().nextInt();
    }

    public int m(int i10) {
        return r().nextInt(i10);
    }

    public long o() {
        return r().nextLong();
    }

    @g
    public abstract Random r();
}

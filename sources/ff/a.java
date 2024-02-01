package ff;

import fh.g;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import xe.l0;

public final class a extends ef.a {
    public double i(double d10) {
        return ThreadLocalRandom.current().nextDouble(d10);
    }

    public int n(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    public long p(long j10) {
        return ThreadLocalRandom.current().nextLong(j10);
    }

    public long q(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    @g
    public Random r() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        l0.o(current, "current()");
        return current;
    }
}

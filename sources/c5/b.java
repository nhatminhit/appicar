package c5;

import java.io.Serializable;
import java.util.Arrays;
import w4.u;

public abstract class b implements Serializable {
    public static final int O = 0;
    public static final int P = -1;
    public static final int Q = -2;

    public static int[] c() {
        int[] f10 = a.f();
        return Arrays.copyOf(f10, f10.length);
    }

    public abstract int[] a();

    public abstract u b(int i10);
}

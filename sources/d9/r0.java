package d9;

import j8.s;

public final class r0 {
    public static int a(int i10) {
        boolean z10;
        if (!(i10 == 0 || i10 == 1)) {
            if (i10 == 2) {
                i10 = 2;
            } else {
                z10 = false;
                s.c(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
                return i10;
            }
        }
        z10 = true;
        s.c(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
        return i10;
    }

    public static String b(int i10) {
        if (i10 == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i10 == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i10 == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}

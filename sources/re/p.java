package re;

import fh.g;
import java.io.File;
import xe.l0;

public class p extends o {
    @g
    public static final k J(@g File file, @g l lVar) {
        l0.p(file, "<this>");
        l0.p(lVar, "direction");
        return new k(file, lVar);
    }

    public static /* synthetic */ k K(File file, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = l.TOP_DOWN;
        }
        return J(file, lVar);
    }

    @g
    public static final k L(@g File file) {
        l0.p(file, "<this>");
        return J(file, l.BOTTOM_UP);
    }

    @g
    public static final k M(@g File file) {
        l0.p(file, "<this>");
        return J(file, l.TOP_DOWN);
    }
}

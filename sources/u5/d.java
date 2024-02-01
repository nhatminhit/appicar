package u5;

import i5.j;
import i5.l;
import java.io.Serializable;
import k5.i;

public abstract class d implements Serializable {
    public static final long O = 1;

    public static abstract class a extends d implements Serializable {
        public static final long P = 1;

        public b a(i<?> iVar, j jVar) {
            return b.INDETERMINATE;
        }

        public b b(i<?> iVar, j jVar, String str) throws l {
            return b.INDETERMINATE;
        }

        public b c(i<?> iVar, j jVar, j jVar2) throws l {
            return b.INDETERMINATE;
        }
    }

    public enum b {
        ALLOWED,
        DENIED,
        INDETERMINATE
    }

    public abstract b a(i<?> iVar, j jVar);

    public abstract b b(i<?> iVar, j jVar, String str) throws l;

    public abstract b c(i<?> iVar, j jVar, j jVar2) throws l;
}

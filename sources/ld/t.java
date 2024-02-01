package ld;

import fh.g;

public enum t {
    LE_1M(1, 1),
    LE_2M(2, 2),
    LE_CODED(3, 4),
    UNKNOWN_PHY_TYPE(-1, -1);
    
    public final int O;
    public final int P;

    /* access modifiers changed from: public */
    t(int i10, int i11) {
        this.O = i10;
        this.P = i11;
    }

    @g
    public static t a(int i10) {
        for (t tVar : values()) {
            if (tVar.O == i10) {
                return tVar;
            }
        }
        return UNKNOWN_PHY_TYPE;
    }
}

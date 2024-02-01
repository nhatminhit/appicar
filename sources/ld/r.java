package ld;

import fh.g;

public enum r {
    UNKNOWN(0),
    CLASSIC(1),
    LE(2),
    DUAL(3);
    
    public final int O;

    /* access modifiers changed from: public */
    r(int i10) {
        this.O = i10;
    }

    @g
    public static r a(int i10) {
        for (r rVar : values()) {
            if (rVar.O == i10) {
                return rVar;
            }
        }
        return UNKNOWN;
    }
}

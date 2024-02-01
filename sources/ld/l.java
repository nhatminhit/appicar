package ld;

import fh.g;

public enum l {
    P(10),
    BONDING(11),
    BONDED(12);
    
    public final int O;

    /* access modifiers changed from: public */
    l(int i10) {
        this.O = i10;
    }

    @g
    public static l a(int i10) {
        for (l lVar : values()) {
            if (lVar.O == i10) {
                return lVar;
            }
        }
        return P;
    }
}

package ld;

import fh.g;

public enum o {
    DISCONNECTED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3);
    
    public final int O;

    /* access modifiers changed from: public */
    o(int i10) {
        this.O = i10;
    }

    @g
    public static o a(int i10) {
        for (o oVar : values()) {
            if (oVar.O == i10) {
                return oVar;
            }
        }
        return DISCONNECTED;
    }
}

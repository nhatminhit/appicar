package ld;

import fh.g;

public enum a {
    DATA_TOO_LARGE(1),
    TOO_MANY_ADVERTISERS(2),
    ALREADY_STARTED(3),
    INTERNAL_ERROR(4),
    FEATURE_UNSUPPORTED(5),
    UNKNOWN_ERROR(-1);
    
    public final int O;

    /* access modifiers changed from: public */
    a(int i10) {
        this.O = i10;
    }

    @g
    public static a a(int i10) {
        for (a aVar : values()) {
            if (aVar.O == i10) {
                return aVar;
            }
        }
        return UNKNOWN_ERROR;
    }
}

package ld;

import fh.g;

public enum v {
    ALREADY_STARTED(1),
    APPLICATION_REGISTRATION_FAILED(2),
    INTERNAL_ERROR(3),
    FEATURE_UNSUPPORTED(4),
    OUT_OF_HARDWARE_RESOURCES(5),
    SCANNING_TOO_FREQUENTLY(6),
    UNKNOWN(-1);
    
    public final int O;

    /* access modifiers changed from: public */
    v(int i10) {
        this.O = i10;
    }

    @g
    public static v a(int i10) {
        for (v vVar : values()) {
            if (vVar.O == i10) {
                return vVar;
            }
        }
        return UNKNOWN;
    }
}

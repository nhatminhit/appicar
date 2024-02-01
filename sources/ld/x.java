package ld;

public enum x {
    WITH_RESPONSE(2, 8),
    WITHOUT_RESPONSE(1, 4),
    SIGNED(4, 64);
    
    public final int O;
    public final int P;

    /* access modifiers changed from: public */
    x(int i10, int i11) {
        this.O = i10;
        this.P = i11;
    }
}

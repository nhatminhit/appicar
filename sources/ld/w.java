package ld;

public enum w {
    OPPORTUNISTIC(-1),
    BALANCED(1),
    LOW_LATENCY(2),
    LOW_POWER(0);
    
    public final int O;

    /* access modifiers changed from: public */
    w(int i10) {
        this.O = i10;
    }
}

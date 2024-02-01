package r2;

public enum d {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    
    public final long O;

    /* access modifiers changed from: public */
    d(long j10) {
        this.O = j10;
    }

    public static d a(long j10) {
        d[] values = values();
        for (int i10 = 0; i10 < values.length; i10++) {
            if (values[i10].b() == j10) {
                return values[i10];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j10);
    }

    public long b() {
        return this.O;
    }
}

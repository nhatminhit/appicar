package gc;

public enum r {
    NO_CACHE(1),
    NO_STORE(2);
    
    public final int O;

    /* access modifiers changed from: public */
    r(int i10) {
        this.O = i10;
    }

    public static boolean a(int i10) {
        return (i10 & NO_CACHE.O) == 0;
    }

    public static boolean b(int i10) {
        return (i10 & NO_STORE.O) == 0;
    }
}

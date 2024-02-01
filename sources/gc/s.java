package gc;

public enum s {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    public final int O;

    /* access modifiers changed from: public */
    s(int i10) {
        this.O = i10;
    }

    public static boolean a(int i10) {
        return (i10 & OFFLINE.O) != 0;
    }

    public static boolean b(int i10) {
        return (i10 & NO_CACHE.O) == 0;
    }

    public static boolean d(int i10) {
        return (i10 & NO_STORE.O) == 0;
    }
}

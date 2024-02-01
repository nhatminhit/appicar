package h5;

import java.util.concurrent.ConcurrentHashMap;

public final class g extends ConcurrentHashMap<String, String> {
    public static final long P = 1;
    public static final int Q = 180;
    public static final g R = new g();
    public final Object O = new Object();

    public g() {
        super(180, 0.8f, 4);
    }

    public String b(String str) {
        String str2 = (String) get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.O) {
                if (size() >= 180) {
                    clear();
                }
            }
        }
        String intern = str.intern();
        put(intern, intern);
        return intern;
    }
}

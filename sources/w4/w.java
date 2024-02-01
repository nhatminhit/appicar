package w4;

import w4.i;

public enum w {
    AUTO_CLOSE_TARGET(i.b.AUTO_CLOSE_TARGET),
    AUTO_CLOSE_CONTENT(i.b.AUTO_CLOSE_JSON_CONTENT),
    FLUSH_PASSED_TO_STREAM(i.b.FLUSH_PASSED_TO_STREAM),
    WRITE_BIGDECIMAL_AS_PLAIN(i.b.WRITE_BIGDECIMAL_AS_PLAIN),
    STRICT_DUPLICATE_DETECTION(i.b.STRICT_DUPLICATE_DETECTION),
    IGNORE_UNKNOWN(i.b.IGNORE_UNKNOWN);
    
    public final boolean O;
    public final int P;
    public final i.b Q;

    /* access modifiers changed from: public */
    w(i.b bVar) {
        this.Q = bVar;
        this.P = bVar.e();
        this.O = bVar.b();
    }

    public static int a() {
        int i10 = 0;
        for (w wVar : values()) {
            if (wVar.b()) {
                i10 |= wVar.e();
            }
        }
        return i10;
    }

    public boolean b() {
        return this.O;
    }

    public boolean d(int i10) {
        return (i10 & this.P) != 0;
    }

    public int e() {
        return this.P;
    }

    public i.b i() {
        return this.Q;
    }
}

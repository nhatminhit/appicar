package w4;

import w4.l;

public enum v {
    AUTO_CLOSE_SOURCE(l.a.AUTO_CLOSE_SOURCE),
    STRICT_DUPLICATE_DETECTION(l.a.STRICT_DUPLICATE_DETECTION),
    IGNORE_UNDEFINED(l.a.IGNORE_UNDEFINED),
    INCLUDE_SOURCE_IN_LOCATION(l.a.INCLUDE_SOURCE_IN_LOCATION);
    
    public final boolean O;
    public final int P;
    public final l.a Q;

    /* access modifiers changed from: public */
    v(l.a aVar) {
        this.Q = aVar;
        this.P = aVar.e();
        this.O = aVar.b();
    }

    public static int a() {
        int i10 = 0;
        for (v vVar : values()) {
            if (vVar.b()) {
                i10 |= vVar.e();
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

    public l.a i() {
        return this.Q;
    }
}

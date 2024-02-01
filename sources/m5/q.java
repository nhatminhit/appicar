package m5;

import a6.a;
import i5.g;
import java.io.Serializable;
import l5.s;

public class q implements s, Serializable {
    public static final long Q = 1;
    public static final q R = new q((Object) null);
    public static final q S = new q((Object) null);
    public final Object O;
    public final a P;

    public q(Object obj) {
        this.O = obj;
        this.P = obj == null ? a.ALWAYS_NULL : a.CONSTANT;
    }

    public static q a(Object obj) {
        return obj == null ? S : new q(obj);
    }

    public static boolean b(s sVar) {
        return sVar == S;
    }

    public static boolean e(s sVar) {
        return sVar == R;
    }

    public static q f() {
        return S;
    }

    public static q g() {
        return R;
    }

    public a c() {
        return this.P;
    }

    public Object d(g gVar) {
        return this.O;
    }
}

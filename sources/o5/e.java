package o5;

import i5.j;
import w4.l;

public class e extends f {
    public static final long X = 1;
    public final j V;
    public final String W;

    public e(l lVar, String str, j jVar, String str2) {
        super(lVar, str);
        this.V = jVar;
        this.W = str2;
    }

    public static e E(l lVar, String str, j jVar, String str2) {
        return new e(lVar, str, jVar, str2);
    }

    public j F() {
        return this.V;
    }

    public String G() {
        return this.W;
    }
}

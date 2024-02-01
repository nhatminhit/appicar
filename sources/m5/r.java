package m5;

import a6.a;
import i5.d;
import i5.g;
import i5.j;
import i5.l;
import i5.y;
import java.io.Serializable;
import l5.s;

public class r implements s, Serializable {
    public static final long Q = 1;
    public final y O;
    public final j P;

    public r(y yVar, j jVar) {
        this.O = yVar;
        this.P = jVar;
    }

    public static r a(d dVar) {
        return b(dVar, dVar.e());
    }

    public static r b(d dVar, j jVar) {
        return new r(dVar.a(), jVar);
    }

    public static r e(j jVar) {
        return new r((y) null, jVar);
    }

    public a c() {
        return a.DYNAMIC;
    }

    public Object d(g gVar) throws l {
        throw o5.d.E(gVar, this.O, this.P);
    }
}

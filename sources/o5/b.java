package o5;

import i5.c;
import i5.j;
import i5.l;
import java.io.Closeable;
import q5.s;
import w4.i;

public class b extends l {
    public final j U;
    public transient c V;
    public transient s W;

    public b(i iVar, String str, c cVar, s sVar) {
        super((Closeable) iVar, str);
        this.U = cVar == null ? null : cVar.E();
        this.V = cVar;
        this.W = sVar;
    }

    public b(i iVar, String str, j jVar) {
        super((Closeable) iVar, str);
        this.U = jVar;
        this.V = null;
        this.W = null;
    }

    public b(w4.l lVar, String str, c cVar, s sVar) {
        super((Closeable) lVar, str);
        this.U = cVar == null ? null : cVar.E();
        this.V = cVar;
        this.W = sVar;
    }

    public b(w4.l lVar, String str, j jVar) {
        super((Closeable) lVar, str);
        this.U = jVar;
        this.V = null;
        this.W = null;
    }

    public static b A(i iVar, String str, j jVar) {
        return new b(iVar, str, jVar);
    }

    public static b B(w4.l lVar, String str, c cVar, s sVar) {
        return new b(lVar, str, cVar, sVar);
    }

    public static b C(w4.l lVar, String str, j jVar) {
        return new b(lVar, str, jVar);
    }

    public static b z(i iVar, String str, c cVar, s sVar) {
        return new b(iVar, str, cVar, sVar);
    }

    public c D() {
        return this.V;
    }

    public s E() {
        return this.W;
    }

    public j F() {
        return this.U;
    }
}

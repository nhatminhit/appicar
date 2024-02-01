package m5;

import a6.b;
import i5.d;
import i5.g;
import i5.j;
import i5.l;
import i5.x;
import i5.y;
import java.io.IOException;
import q5.h;

public class d0 extends d.b {
    public static final long V = 1;
    public final Object U;

    @Deprecated
    public d0(y yVar, j jVar, b bVar, h hVar, Object obj) {
        this(yVar, jVar, hVar, obj);
    }

    public d0(y yVar, j jVar, h hVar, Object obj) {
        super(yVar, jVar, (y) null, hVar, x.X);
        this.U = obj;
    }

    public Object f(g gVar, Object obj) throws l {
        return gVar.M(this.U, this, obj);
    }

    public void g(g gVar, Object obj) throws IOException {
        this.S.s(obj, f(gVar, obj));
    }
}

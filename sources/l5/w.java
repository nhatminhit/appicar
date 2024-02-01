package l5;

import i5.l;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.z;
import w4.j;

public class w extends l {
    public static final long W = 1;
    public z U;
    public List<x> V;

    @Deprecated
    public w(String str) {
        super(str);
        this.V = new ArrayList();
    }

    @Deprecated
    public w(String str, j jVar, z zVar) {
        super(str, jVar);
        this.U = zVar;
    }

    public w(w4.l lVar, String str) {
        super((Closeable) lVar, str);
        this.V = new ArrayList();
    }

    public w(w4.l lVar, String str, j jVar, z zVar) {
        super((Closeable) lVar, str, jVar);
        this.U = zVar;
    }

    public z A() {
        return this.U;
    }

    public Object B() {
        return this.U.c().Q;
    }

    public List<x> C() {
        return this.V;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (this.V == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(message);
        Iterator<x> it = this.V.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append('.');
        return sb2.toString();
    }

    public void z(Object obj, Class<?> cls, j jVar) {
        this.V.add(new x(obj, cls, jVar));
    }
}

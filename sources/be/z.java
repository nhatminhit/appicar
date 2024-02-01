package be;

import fh.g;
import java.util.Iterator;
import oe.f;
import we.l;
import xe.l0;
import zd.u2;

public class z extends y {
    public static final <T> void d0(@g Iterator<? extends T> it, @g l<? super T, u2> lVar) {
        l0.p(it, "<this>");
        l0.p(lVar, "operation");
        while (it.hasNext()) {
            lVar.A(it.next());
        }
    }

    @f
    public static final <T> Iterator<T> e0(Iterator<? extends T> it) {
        l0.p(it, "<this>");
        return it;
    }

    @g
    public static final <T> Iterator<p0<T>> f0(@g Iterator<? extends T> it) {
        l0.p(it, "<this>");
        return new r0(it);
    }
}

package be;

import fh.g;
import gf.m;
import java.util.List;
import ve.h;
import xe.l0;

public class c0 extends b0 {
    @g
    public static final <T> List<T> W0(@g List<? extends T> list) {
        l0.p(list, "<this>");
        return new h1(list);
    }

    @g
    @h(name = "asReversedMutable")
    public static final <T> List<T> X0(@g List<T> list) {
        l0.p(list, "<this>");
        return new g1(list);
    }

    public static final int Y0(List<?> list, int i10) {
        if (new m(0, w.G(list)).q(i10)) {
            return w.G(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new m(0, w.G(list)) + "].");
    }

    public static final int Z0(List<?> list, int i10) {
        if (new m(0, list.size()).q(i10)) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new m(0, list.size()) + "].");
    }
}

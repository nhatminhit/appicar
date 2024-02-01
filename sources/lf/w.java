package lf;

import java.util.Set;
import oe.f;
import xe.l0;

public class w extends v {
    @f
    public static final o t(String str) {
        l0.p(str, "<this>");
        return new o(str);
    }

    @f
    public static final o u(String str, Set<? extends q> set) {
        l0.p(str, "<this>");
        l0.p(set, "options");
        return new o(str, set);
    }

    @f
    public static final o v(String str, q qVar) {
        l0.p(str, "<this>");
        l0.p(qVar, "option");
        return new o(str, qVar);
    }
}

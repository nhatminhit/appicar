package zd;

import be.w;
import fh.g;
import java.util.List;
import ve.h;
import xe.l0;

@h(name = "TuplesKt")
public final class r1 {
    @g
    public static final <A, B> u0<A, B> a(A a10, B b10) {
        return new u0<>(a10, b10);
    }

    @g
    public static final <T> List<T> b(@g u0<? extends T, ? extends T> u0Var) {
        l0.p(u0Var, "<this>");
        return w.L(u0Var.e(), u0Var.f());
    }

    @g
    public static final <T> List<T> c(@g q1<? extends T, ? extends T, ? extends T> q1Var) {
        l0.p(q1Var, "<this>");
        return w.L(q1Var.f(), q1Var.g(), q1Var.h());
    }
}

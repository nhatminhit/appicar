package gf;

import fh.g;
import oe.f;
import xe.l0;
import zd.h1;
import zd.r;

public class u {
    public static final void a(boolean z10, @g Number number) {
        l0.p(number, "step");
        if (!z10) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }

    @h1(version = "1.3")
    @f
    public static final <T, R extends h<T> & Iterable<? extends T>> boolean b(R r10, T t10) {
        l0.p(r10, "<this>");
        return t10 != null && r10.b((Comparable) t10);
    }

    @h1(version = "1.7")
    @f
    @r
    public static final <T, R extends s<T> & Iterable<? extends T>> boolean c(R r10, T t10) {
        l0.p(r10, "<this>");
        return t10 != null && r10.b((Comparable) t10);
    }

    @g
    @h1(version = "1.1")
    public static final g<Double> d(double d10, double d11) {
        return new e(d10, d11);
    }

    @g
    @h1(version = "1.1")
    public static final g<Float> e(float f10, float f11) {
        return new f(f10, f11);
    }

    @g
    public static final <T extends Comparable<? super T>> h<T> f(@g T t10, @g T t11) {
        l0.p(t10, "<this>");
        l0.p(t11, "that");
        return new j(t10, t11);
    }

    @h1(version = "1.7")
    @g
    @r
    public static final s<Double> g(double d10, double d11) {
        return new q(d10, d11);
    }

    @h1(version = "1.7")
    @g
    @r
    public static final s<Float> h(float f10, float f11) {
        return new r(f10, f11);
    }

    @h1(version = "1.7")
    @g
    @r
    public static final <T extends Comparable<? super T>> s<T> i(@g T t10, @g T t11) {
        l0.p(t10, "<this>");
        l0.p(t11, "that");
        return new i(t10, t11);
    }
}

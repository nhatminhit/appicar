package be;

import ce.j;
import fh.g;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import oe.f;
import we.l;
import xe.l0;
import zd.a1;
import zd.h1;
import zd.u2;

public class k1 {
    @h1(version = "1.3")
    @a1
    @g
    public static final <E> Set<E> a(@g Set<E> set) {
        l0.p(set, "builder");
        return ((j) set).c();
    }

    @h1(version = "1.3")
    @a1
    @f
    public static final <E> Set<E> b(int i10, l<? super Set<E>, u2> lVar) {
        l0.p(lVar, "builderAction");
        Set e10 = e(i10);
        lVar.A(e10);
        return a(e10);
    }

    @h1(version = "1.3")
    @a1
    @f
    public static final <E> Set<E> c(l<? super Set<E>, u2> lVar) {
        l0.p(lVar, "builderAction");
        Set d10 = d();
        lVar.A(d10);
        return a(d10);
    }

    @h1(version = "1.3")
    @a1
    @g
    public static final <E> Set<E> d() {
        return new j();
    }

    @h1(version = "1.3")
    @a1
    @g
    public static final <E> Set<E> e(int i10) {
        return new j(i10);
    }

    @g
    public static final <T> Set<T> f(T t10) {
        Set<T> singleton = Collections.singleton(t10);
        l0.o(singleton, "singleton(element)");
        return singleton;
    }

    @g
    public static final <T> TreeSet<T> g(@g Comparator<? super T> comparator, @g T... tArr) {
        l0.p(comparator, "comparator");
        l0.p(tArr, "elements");
        return (TreeSet) p.Py(tArr, new TreeSet(comparator));
    }

    @g
    public static final <T> TreeSet<T> h(@g T... tArr) {
        l0.p(tArr, "elements");
        return (TreeSet) p.Py(tArr, new TreeSet());
    }
}

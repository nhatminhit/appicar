package be;

import fh.g;
import fh.h;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import oe.f;
import we.l;
import xe.l0;
import zd.b;
import zd.h1;
import zd.r;
import zd.u2;
import zd.y2;

public class l1 extends k1 {
    @h1(version = "1.6")
    @y2(markerClass = {r.class})
    @f
    public static final <E> Set<E> i(int i10, @b l<? super Set<E>, u2> lVar) {
        l0.p(lVar, "builderAction");
        Set e10 = k1.e(i10);
        lVar.A(e10);
        return k1.a(e10);
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class})
    @f
    public static final <E> Set<E> j(@b l<? super Set<E>, u2> lVar) {
        l0.p(lVar, "builderAction");
        Set d10 = k1.d();
        lVar.A(d10);
        return k1.a(d10);
    }

    @g
    public static final <T> Set<T> k() {
        return j0.O;
    }

    @h1(version = "1.1")
    @f
    public static final <T> HashSet<T> l() {
        return new HashSet<>();
    }

    @g
    public static final <T> HashSet<T> m(@g T... tArr) {
        l0.p(tArr, "elements");
        return (HashSet) p.Py(tArr, new HashSet(z0.j(tArr.length)));
    }

    @h1(version = "1.1")
    @f
    public static final <T> LinkedHashSet<T> n() {
        return new LinkedHashSet<>();
    }

    @g
    public static final <T> LinkedHashSet<T> o(@g T... tArr) {
        l0.p(tArr, "elements");
        return (LinkedHashSet) p.Py(tArr, new LinkedHashSet(z0.j(tArr.length)));
    }

    @h1(version = "1.1")
    @f
    public static final <T> Set<T> p() {
        return new LinkedHashSet();
    }

    @g
    public static final <T> Set<T> q(@g T... tArr) {
        l0.p(tArr, "elements");
        return (Set) p.Py(tArr, new LinkedHashSet(z0.j(tArr.length)));
    }

    @g
    public static final <T> Set<T> r(@g Set<? extends T> set) {
        l0.p(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : k1.f(set.iterator().next()) : k();
    }

    @f
    public static final <T> Set<T> s(Set<? extends T> set) {
        return set == null ? k() : set;
    }

    @f
    public static final <T> Set<T> t() {
        return k();
    }

    @g
    public static final <T> Set<T> u(@g T... tArr) {
        l0.p(tArr, "elements");
        return tArr.length > 0 ? p.Mz(tArr) : k();
    }

    @g
    @h1(version = "1.4")
    public static final <T> Set<T> v(@h T t10) {
        return t10 != null ? k1.f(t10) : k();
    }

    @g
    @h1(version = "1.4")
    public static final <T> Set<T> w(@g T... tArr) {
        l0.p(tArr, "elements");
        return (Set) p.vb(tArr, new LinkedHashSet());
    }
}

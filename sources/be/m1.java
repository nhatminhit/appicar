package be;

import fh.g;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import oe.f;
import p000if.m;
import xe.l0;

public class m1 extends l1 {
    @g
    public static final <T> Set<T> A(@g Set<? extends T> set, @g T[] tArr) {
        l0.p(set, "<this>");
        l0.p(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        b0.H0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @f
    public static final <T> Set<T> B(Set<? extends T> set, T t10) {
        l0.p(set, "<this>");
        return z(set, t10);
    }

    @g
    public static final <T> Set<T> C(@g Set<? extends T> set, @g m<? extends T> mVar) {
        l0.p(set, "<this>");
        l0.p(mVar, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(z0.j(set.size() * 2));
        linkedHashSet.addAll(set);
        b0.n0(linkedHashSet, mVar);
        return linkedHashSet;
    }

    @g
    public static final <T> Set<T> D(@g Set<? extends T> set, @g Iterable<? extends T> iterable) {
        int i10;
        l0.p(set, "<this>");
        l0.p(iterable, "elements");
        Integer Z = x.Z(iterable);
        if (Z != null) {
            i10 = set.size() + Z.intValue();
        } else {
            i10 = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(z0.j(i10));
        linkedHashSet.addAll(set);
        b0.o0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    @g
    public static final <T> Set<T> E(@g Set<? extends T> set, T t10) {
        l0.p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(z0.j(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t10);
        return linkedHashSet;
    }

    @g
    public static final <T> Set<T> F(@g Set<? extends T> set, @g T[] tArr) {
        l0.p(set, "<this>");
        l0.p(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(z0.j(set.size() + tArr.length));
        linkedHashSet.addAll(set);
        b0.p0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @f
    public static final <T> Set<T> G(Set<? extends T> set, T t10) {
        l0.p(set, "<this>");
        return E(set, t10);
    }

    @g
    public static final <T> Set<T> x(@g Set<? extends T> set, @g m<? extends T> mVar) {
        l0.p(set, "<this>");
        l0.p(mVar, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        b0.E0(linkedHashSet, mVar);
        return linkedHashSet;
    }

    @g
    public static final <T> Set<T> y(@g Set<? extends T> set, @g Iterable<? extends T> iterable) {
        l0.p(set, "<this>");
        l0.p(iterable, "elements");
        Collection<? extends T> q02 = b0.q0(iterable);
        if (q02.isEmpty()) {
            return e0.V5(set);
        }
        if (q02 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T next : set) {
                if (!q02.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(q02);
        return linkedHashSet2;
    }

    @g
    public static final <T> Set<T> z(@g Set<? extends T> set, T t10) {
        l0.p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(z0.j(set.size()));
        boolean z10 = false;
        for (T next : set) {
            boolean z11 = true;
            if (!z10 && l0.g(next, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }
}

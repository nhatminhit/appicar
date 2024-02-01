package be;

import fh.g;
import fh.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import oe.f;
import p000if.u;
import we.l;
import xe.l0;
import xe.u1;
import zd.b1;
import zd.h1;
import zd.k;
import zd.m;
import zd.r;
import zd.y2;

public class b0 extends a0 {
    @f
    public static final <T> void A0(Collection<? super T> collection, T[] tArr) {
        l0.p(collection, "<this>");
        l0.p(tArr, "elements");
        p0(collection, tArr);
    }

    @f
    @k(level = m.P, message = "Use removeAt(index) instead.", replaceWith = @b1(expression = "removeAt(index)", imports = {}))
    public static final <T> T B0(List<T> list, int i10) {
        l0.p(list, "<this>");
        return list.remove(i10);
    }

    @f
    public static final <T> boolean C0(Collection<? extends T> collection, T t10) {
        l0.p(collection, "<this>");
        return u1.a(collection).remove(t10);
    }

    public static final <T> boolean D0(@g Iterable<? extends T> iterable, @g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        return r0(iterable, lVar, true);
    }

    public static final <T> boolean E0(@g Collection<? super T> collection, @g p000if.m<? extends T> mVar) {
        l0.p(collection, "<this>");
        l0.p(mVar, "elements");
        List<? extends T> c32 = u.c3(mVar);
        return (c32.isEmpty() ^ true) && collection.removeAll(c32);
    }

    public static final <T> boolean F0(@g Collection<? super T> collection, @g Iterable<? extends T> iterable) {
        l0.p(collection, "<this>");
        l0.p(iterable, "elements");
        return collection.removeAll(q0(iterable));
    }

    @f
    public static final <T> boolean G0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        l0.p(collection, "<this>");
        l0.p(collection2, "elements");
        return u1.a(collection).removeAll(collection2);
    }

    public static final <T> boolean H0(@g Collection<? super T> collection, @g T[] tArr) {
        l0.p(collection, "<this>");
        l0.p(tArr, "elements");
        return ((tArr.length == 0) ^ true) && collection.removeAll(o.t(tArr));
    }

    public static final <T> boolean I0(@g List<T> list, @g l<? super T, Boolean> lVar) {
        l0.p(list, "<this>");
        l0.p(lVar, "predicate");
        return s0(list, lVar, true);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    public static final <T> T J0(@g List<T> list) {
        l0.p(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @h
    public static final <T> T K0(@g List<T> list) {
        l0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    public static final <T> T L0(@g List<T> list) {
        l0.p(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(w.G(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @h
    public static final <T> T M0(@g List<T> list) {
        l0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(w.G(list));
    }

    public static final <T> boolean N0(@g Iterable<? extends T> iterable, @g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        return r0(iterable, lVar, false);
    }

    public static final <T> boolean O0(@g Collection<? super T> collection, @g p000if.m<? extends T> mVar) {
        l0.p(collection, "<this>");
        l0.p(mVar, "elements");
        List<? extends T> c32 = u.c3(mVar);
        return c32.isEmpty() ^ true ? collection.retainAll(c32) : T0(collection);
    }

    public static final <T> boolean P0(@g Collection<? super T> collection, @g Iterable<? extends T> iterable) {
        l0.p(collection, "<this>");
        l0.p(iterable, "elements");
        return collection.retainAll(q0(iterable));
    }

    @f
    public static final <T> boolean Q0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        l0.p(collection, "<this>");
        l0.p(collection2, "elements");
        return u1.a(collection).retainAll(collection2);
    }

    public static final <T> boolean R0(@g Collection<? super T> collection, @g T[] tArr) {
        l0.p(collection, "<this>");
        l0.p(tArr, "elements");
        return (tArr.length == 0) ^ true ? collection.retainAll(o.t(tArr)) : T0(collection);
    }

    public static final <T> boolean S0(@g List<T> list, @g l<? super T, Boolean> lVar) {
        l0.p(list, "<this>");
        l0.p(lVar, "predicate");
        return s0(list, lVar, false);
    }

    public static final boolean T0(Collection<?> collection) {
        boolean z10 = !collection.isEmpty();
        collection.clear();
        return z10;
    }

    public static final <T> boolean n0(@g Collection<? super T> collection, @g p000if.m<? extends T> mVar) {
        l0.p(collection, "<this>");
        l0.p(mVar, "elements");
        boolean z10 = false;
        for (Object add : mVar) {
            if (collection.add(add)) {
                z10 = true;
            }
        }
        return z10;
    }

    public static final <T> boolean o0(@g Collection<? super T> collection, @g Iterable<? extends T> iterable) {
        l0.p(collection, "<this>");
        l0.p(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z10 = true;
            }
        }
        return z10;
    }

    public static final <T> boolean p0(@g Collection<? super T> collection, @g T[] tArr) {
        l0.p(collection, "<this>");
        l0.p(tArr, "elements");
        return collection.addAll(o.t(tArr));
    }

    @g
    public static final <T> Collection<T> q0(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : e0.Q5(iterable);
    }

    public static final <T> boolean r0(Iterable<? extends T> iterable, l<? super T, Boolean> lVar, boolean z10) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (lVar.A(it.next()).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static final <T> boolean s0(List<T> list, l<? super T, Boolean> lVar, boolean z10) {
        if (!(list instanceof RandomAccess)) {
            l0.n(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return r0(u1.c(list), lVar, z10);
        }
        s0 o10 = new gf.m(0, w.G(list)).iterator();
        int i10 = 0;
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            T t10 = list.get(nextInt);
            if (lVar.A(t10).booleanValue() != z10) {
                if (i10 != nextInt) {
                    list.set(i10, t10);
                }
                i10++;
            }
        }
        if (i10 >= list.size()) {
            return false;
        }
        int G = w.G(list);
        if (i10 > G) {
            return true;
        }
        while (true) {
            list.remove(G);
            if (G == i10) {
                return true;
            }
            G--;
        }
    }

    @f
    public static final <T> void t0(Collection<? super T> collection, p000if.m<? extends T> mVar) {
        l0.p(collection, "<this>");
        l0.p(mVar, "elements");
        E0(collection, mVar);
    }

    @f
    public static final <T> void u0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        l0.p(collection, "<this>");
        l0.p(iterable, "elements");
        F0(collection, iterable);
    }

    @f
    public static final <T> void v0(Collection<? super T> collection, T t10) {
        l0.p(collection, "<this>");
        collection.remove(t10);
    }

    @f
    public static final <T> void w0(Collection<? super T> collection, T[] tArr) {
        l0.p(collection, "<this>");
        l0.p(tArr, "elements");
        H0(collection, tArr);
    }

    @f
    public static final <T> void x0(Collection<? super T> collection, p000if.m<? extends T> mVar) {
        l0.p(collection, "<this>");
        l0.p(mVar, "elements");
        n0(collection, mVar);
    }

    @f
    public static final <T> void y0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        l0.p(collection, "<this>");
        l0.p(iterable, "elements");
        o0(collection, iterable);
    }

    @f
    public static final <T> void z0(Collection<? super T> collection, T t10) {
        l0.p(collection, "<this>");
        collection.add(t10);
    }
}

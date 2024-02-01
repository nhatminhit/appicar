package be;

import fh.g;
import fh.h;
import gf.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import oe.f;
import we.l;
import xe.l0;
import xe.n0;
import zd.a1;
import zd.b;
import zd.h1;
import zd.r;
import zd.u2;
import zd.y2;

public class w extends v {

    public static final class a extends n0 implements l<T, Integer> {
        public final /* synthetic */ l<T, K> P;
        public final /* synthetic */ K Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(l<? super T, ? extends K> lVar, K k10) {
            super(1);
            this.P = lVar;
            this.Q = k10;
        }

        @g
        /* renamed from: c */
        public final Integer A(T t10) {
            return Integer.valueOf(fe.g.l((Comparable) this.P.A(t10), this.Q));
        }
    }

    public static /* synthetic */ int A(List list, Comparable comparable, int i10, int i11, l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return t(list, i10, i11, new a(lVar, comparable));
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class})
    @f
    public static final <E> List<E> B(int i10, @b l<? super List<E>, u2> lVar) {
        l0.p(lVar, "builderAction");
        List j10 = v.j(i10);
        lVar.A(j10);
        return v.a(j10);
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class})
    @f
    public static final <E> List<E> C(@b l<? super List<E>, u2> lVar) {
        l0.p(lVar, "builderAction");
        List i10 = v.i();
        lVar.A(i10);
        return v.a(i10);
    }

    @f
    public static final <T> boolean D(Collection<? extends T> collection, Collection<? extends T> collection2) {
        l0.p(collection, "<this>");
        l0.p(collection2, "elements");
        return collection.containsAll(collection2);
    }

    @g
    public static final <T> List<T> E() {
        return h0.O;
    }

    @g
    public static final m F(@g Collection<?> collection) {
        l0.p(collection, "<this>");
        return new m(0, collection.size() - 1);
    }

    public static final <T> int G(@g List<? extends T> list) {
        l0.p(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, C, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <C extends java.util.Collection<?> & R, R> R H(C r1, we.a<? extends R> r2) {
        /*
            java.lang.String r0 = "defaultValue"
            xe.l0.p(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x000f
            java.lang.Object r1 = r2.n()
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: be.w.H(java.util.Collection, we.a):java.lang.Object");
    }

    @f
    public static final <T> boolean I(Collection<? extends T> collection) {
        l0.p(collection, "<this>");
        return !collection.isEmpty();
    }

    @h1(version = "1.3")
    @f
    public static final <T> boolean J(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @f
    public static final <T> List<T> K() {
        return E();
    }

    @g
    public static final <T> List<T> L(@g T... tArr) {
        l0.p(tArr, "elements");
        return tArr.length > 0 ? o.t(tArr) : E();
    }

    @g
    public static final <T> List<T> M(@h T t10) {
        return t10 != null ? v.k(t10) : E();
    }

    @g
    public static final <T> List<T> N(@g T... tArr) {
        l0.p(tArr, "elements");
        return p.ub(tArr);
    }

    @h1(version = "1.1")
    @f
    public static final <T> List<T> O() {
        return new ArrayList();
    }

    @g
    public static final <T> List<T> P(@g T... tArr) {
        l0.p(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new j(tArr, true));
    }

    @g
    public static final <T> List<T> Q(@g List<? extends T> list) {
        l0.p(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : v.k(list.get(0)) : E();
    }

    @f
    public static final <T> Collection<T> R(Collection<? extends T> collection) {
        return collection == null ? E() : collection;
    }

    @f
    public static final <T> List<T> S(List<? extends T> list) {
        return list == null ? E() : list;
    }

    public static final void T(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        } else if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        } else if (i12 > i10) {
            throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
        }
    }

    @g
    @h1(version = "1.3")
    public static final <T> List<T> U(@g Iterable<? extends T> iterable, @g ef.f fVar) {
        l0.p(iterable, "<this>");
        l0.p(fVar, "random");
        List<T> S5 = e0.S5(iterable);
        e0.Z4(S5, fVar);
        return S5;
    }

    @h1(version = "1.3")
    @a1
    public static final void V() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @h1(version = "1.3")
    @a1
    public static final void W() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @h1(version = "1.1")
    @f
    public static final <T> List<T> o(int i10, l<? super Integer, ? extends T> lVar) {
        l0.p(lVar, "init");
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(lVar.A(Integer.valueOf(i11)));
        }
        return arrayList;
    }

    @h1(version = "1.1")
    @f
    public static final <T> List<T> p(int i10, l<? super Integer, ? extends T> lVar) {
        l0.p(lVar, "init");
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(lVar.A(Integer.valueOf(i11)));
        }
        return arrayList;
    }

    @h1(version = "1.1")
    @f
    public static final <T> ArrayList<T> q() {
        return new ArrayList<>();
    }

    @g
    public static final <T> ArrayList<T> r(@g T... tArr) {
        l0.p(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new j(tArr, true));
    }

    @g
    public static final <T> Collection<T> s(@g T[] tArr) {
        l0.p(tArr, "<this>");
        return new j(tArr, false);
    }

    public static final <T> int t(@g List<? extends T> list, int i10, int i11, @g l<? super T, Integer> lVar) {
        l0.p(list, "<this>");
        l0.p(lVar, "comparison");
        T(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int intValue = lVar.A(list.get(i13)).intValue();
            if (intValue < 0) {
                i10 = i13 + 1;
            } else if (intValue <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final <T extends Comparable<? super T>> int u(@g List<? extends T> list, @h T t10, int i10, int i11) {
        l0.p(list, "<this>");
        T(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int l10 = fe.g.l((Comparable) list.get(i13), t10);
            if (l10 < 0) {
                i10 = i13 + 1;
            } else if (l10 <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final <T> int v(@g List<? extends T> list, T t10, @g Comparator<? super T> comparator, int i10, int i11) {
        l0.p(list, "<this>");
        l0.p(comparator, "comparator");
        T(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int compare = comparator.compare(list.get(i13), t10);
            if (compare < 0) {
                i10 = i13 + 1;
            } else if (compare <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int w(List list, int i10, int i11, l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = list.size();
        }
        return t(list, i10, i11, lVar);
    }

    public static /* synthetic */ int x(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return u(list, comparable, i10, i11);
    }

    public static /* synthetic */ int y(List list, Object obj, Comparator comparator, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = list.size();
        }
        return v(list, obj, comparator, i10, i11);
    }

    public static final <T, K extends Comparable<? super K>> int z(@g List<? extends T> list, @h K k10, int i10, int i11, @g l<? super T, ? extends K> lVar) {
        l0.p(list, "<this>");
        l0.p(lVar, "selector");
        return t(list, i10, i11, new a(lVar, k10));
    }
}

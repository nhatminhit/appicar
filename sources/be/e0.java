package be;

import fe.g;
import fh.g;
import fh.h;
import gf.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import oe.e;
import oe.f;
import p000if.m;
import p000if.u;
import we.l;
import we.p;
import xe.l0;
import xe.n0;
import zd.b1;
import zd.e2;
import zd.h1;
import zd.j2;
import zd.k;
import zd.r;
import zd.r1;
import zd.t;
import zd.t0;
import zd.u0;
import zd.u2;
import zd.y2;

public class e0 extends d0 {

    public static final class a implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterable f16211a;

        public a(Iterable iterable) {
            this.f16211a = iterable;
        }

        @g
        public Iterator<T> iterator() {
            return this.f16211a.iterator();
        }
    }

    public static final class b extends n0 implements l<Integer, T> {
        public final /* synthetic */ int P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(1);
            this.P = i10;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            return c(((Number) obj).intValue());
        }

        public final T c(int i10) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.P + '.');
        }
    }

    public static final class c implements l0<T, K> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterable<T> f16212a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<T, K> f16213b;

        public c(Iterable<? extends T> iterable, l<? super T, ? extends K> lVar) {
            this.f16212a = iterable;
            this.f16213b = lVar;
        }

        public K a(T t10) {
            return this.f16213b.A(t10);
        }

        @g
        public Iterator<T> b() {
            return this.f16212a.iterator();
        }
    }

    public static final class d extends n0 implements we.a<Iterator<? extends T>> {
        public final /* synthetic */ Iterable<T> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Iterable<? extends T> iterable) {
            super(0);
            this.P = iterable;
        }

        @g
        /* renamed from: c */
        public final Iterator<T> n() {
            return this.P.iterator();
        }
    }

    @g
    public static final <T, K, V, M extends Map<? super K, ? super V>> M A1(@g Iterable<? extends T> iterable, @g M m10, @g l<? super T, ? extends K> lVar, @g l<? super T, ? extends V> lVar2) {
        l0.p(iterable, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (Object next : iterable) {
            m10.put(lVar.A(next), lVar2.A(next));
        }
        return m10;
    }

    @h
    public static final <T> T A2(@g Iterable<? extends T> iterable, @g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        for (T next : iterable) {
            if (lVar.A(next).booleanValue()) {
                return next;
            }
        }
        return null;
    }

    @h1(version = "1.4")
    @h
    public static final <T, R extends Comparable<? super R>> T A3(@g Iterable<? extends T> iterable, @g l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) lVar.A(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) lVar.A(next2);
            if (comparable.compareTo(comparable2) < 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    @g
    public static final <T> List<T> A4(@g Collection<? extends T> collection, T t10) {
        l0.p(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    @h1(version = "1.4")
    @f
    @t0
    @ve.h(name = "sumOfLong")
    public static final <T> long A5(Iterable<? extends T> iterable, l<? super T, Long> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        long j10 = 0;
        for (Object A : iterable) {
            j10 += lVar.A(A).longValue();
        }
        return j10;
    }

    @g
    public static final <T, K, V, M extends Map<? super K, ? super V>> M B1(@g Iterable<? extends T> iterable, @g M m10, @g l<? super T, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(iterable, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "transform");
        for (Object A : iterable) {
            u0 u0Var = (u0) lVar.A(A);
            m10.put(u0Var.e(), u0Var.f());
        }
        return m10;
    }

    @h
    public static final <T> T B2(@g List<? extends T> list) {
        l0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @h1(version = "1.7")
    @ve.h(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T B3(@g Iterable<? extends T> iterable, @g l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            Comparable comparable = (Comparable) lVar.A(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) lVar.A(next2);
                if (comparable.compareTo(comparable2) < 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException();
    }

    @g
    public static final <T> List<T> B4(@g Collection<? extends T> collection, @g T[] tArr) {
        l0.p(collection, "<this>");
        l0.p(tArr, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + tArr.length);
        arrayList.addAll(collection);
        b0.p0(arrayList, tArr);
        return arrayList;
    }

    @ve.h(name = "sumOfShort")
    public static final int B5(@g Iterable<Short> iterable) {
        l0.p(iterable, "<this>");
        int i10 = 0;
        for (Short shortValue : iterable) {
            i10 += shortValue.shortValue();
        }
        return i10;
    }

    @g
    @h1(version = "1.3")
    public static final <K, V> Map<K, V> C1(@g Iterable<? extends K> iterable, @g l<? super K, ? extends V> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.u(z0.j(x.Y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(next, lVar.A(next));
        }
        return linkedHashMap;
    }

    @g
    public static final <T, R> List<R> C2(@g Iterable<? extends T> iterable, @g l<? super T, ? extends Iterable<? extends R>> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Object A : iterable) {
            b0.o0(arrayList, (Iterable) lVar.A(A));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T> double C3(Iterable<? extends T> iterable, l<? super T, Double> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.A(it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @f
    public static final <T> List<T> C4(Iterable<? extends T> iterable, T t10) {
        l0.p(iterable, "<this>");
        return w4(iterable, t10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @f
    @t0
    @ve.h(name = "sumOfUInt")
    public static final <T> int C5(Iterable<? extends T> iterable, l<? super T, e2> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        for (Object A : iterable) {
            l10 = e2.l(l10 + lVar.A(A).l0());
        }
        return l10;
    }

    @g
    @h1(version = "1.3")
    public static final <K, V, M extends Map<? super K, ? super V>> M D1(@g Iterable<? extends K> iterable, @g M m10, @g l<? super K, ? extends V> lVar) {
        l0.p(iterable, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        for (Object next : iterable) {
            m10.put(next, lVar.A(next));
        }
        return m10;
    }

    @h1(version = "1.4")
    @f
    @t0
    @ve.h(name = "flatMapIndexedIterable")
    public static final <T, R> List<R> D2(Iterable<? extends T> iterable, p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        l0.p(iterable, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            b0.o0(arrayList, (Iterable) pVar.g0(Integer.valueOf(i10), next));
            i10 = i11;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T> float D3(Iterable<? extends T> iterable, l<? super T, Float> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = lVar.A(it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @f
    public static final <T> List<T> D4(Collection<? extends T> collection, T t10) {
        l0.p(collection, "<this>");
        return A4(collection, t10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @f
    @t0
    @ve.h(name = "sumOfULong")
    public static final <T> long D5(Iterable<? extends T> iterable, l<? super T, j2> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        for (Object A : iterable) {
            l10 = j2.l(l10 + lVar.A(A).l0());
        }
        return l10;
    }

    @ve.h(name = "averageOfByte")
    public static final double E1(@g Iterable<Byte> iterable) {
        l0.p(iterable, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Byte byteValue : iterable) {
            d10 += (double) byteValue.byteValue();
            i10++;
            if (i10 < 0) {
                w.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @h1(version = "1.4")
    @f
    @t0
    @ve.h(name = "flatMapIndexedIterableTo")
    public static final <T, R, C extends Collection<? super R>> C E2(Iterable<? extends T> iterable, C c10, p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        l0.p(iterable, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i10), next));
            i10 = i11;
        }
        return c10;
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T, R extends Comparable<? super R>> R E3(Iterable<? extends T> iterable, l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R r10 = (Comparable) lVar.A(it.next());
            while (it.hasNext()) {
                R r11 = (Comparable) lVar.A(it.next());
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @f
    public static final <T> T E4(Collection<? extends T> collection) {
        l0.p(collection, "<this>");
        return F4(collection, ef.f.O);
    }

    @g
    public static final <T> List<T> E5(@g Iterable<? extends T> iterable, int i10) {
        l0.p(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    return Q5(iterable);
                }
                if (i10 == 1) {
                    return v.k(u2(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            for (Object add : iterable) {
                arrayList.add(add);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return w.Q(arrayList);
        }
    }

    @ve.h(name = "averageOfDouble")
    public static final double F1(@g Iterable<Double> iterable) {
        l0.p(iterable, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Double doubleValue : iterable) {
            d10 += doubleValue.doubleValue();
            i10++;
            if (i10 < 0) {
                w.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @h1(version = "1.4")
    @f
    @t0
    @ve.h(name = "flatMapIndexedSequence")
    public static final <T, R> List<R> F2(Iterable<? extends T> iterable, p<? super Integer, ? super T, ? extends m<? extends R>> pVar) {
        l0.p(iterable, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            b0.n0(arrayList, (m) pVar.g0(Integer.valueOf(i10), next));
            i10 = i11;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T, R extends Comparable<? super R>> R F3(Iterable<? extends T> iterable, l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R r10 = (Comparable) lVar.A(it.next());
        while (it.hasNext()) {
            R r11 = (Comparable) lVar.A(it.next());
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.3")
    public static final <T> T F4(@g Collection<? extends T> collection, @g ef.f fVar) {
        l0.p(collection, "<this>");
        l0.p(fVar, "random");
        if (!collection.isEmpty()) {
            return b2(collection, fVar.m(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @g
    public static final <T> List<T> F5(@g List<? extends T> list, int i10) {
        l0.p(list, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            int size = list.size();
            if (i10 >= size) {
                return Q5(list);
            }
            if (i10 == 1) {
                return v.k(k3(list));
            }
            ArrayList arrayList = new ArrayList(i10);
            if (list instanceof RandomAccess) {
                for (int i11 = size - i10; i11 < size; i11++) {
                    arrayList.add(list.get(i11));
                }
            } else {
                ListIterator<? extends T> listIterator = list.listIterator(size - i10);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    @ve.h(name = "averageOfFloat")
    public static final double G1(@g Iterable<Float> iterable) {
        l0.p(iterable, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Float floatValue : iterable) {
            d10 += (double) floatValue.floatValue();
            i10++;
            if (i10 < 0) {
                w.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @h1(version = "1.4")
    @f
    @t0
    @ve.h(name = "flatMapIndexedSequenceTo")
    public static final <T, R, C extends Collection<? super R>> C G2(Iterable<? extends T> iterable, C c10, p<? super Integer, ? super T, ? extends m<? extends R>> pVar) {
        l0.p(iterable, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            b0.n0(c10, (m) pVar.g0(Integer.valueOf(i10), next));
            i10 = i11;
        }
        return c10;
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T> Double G3(Iterable<? extends T> iterable, l<? super T, Double> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = lVar.A(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final <T> T G4(Collection<? extends T> collection) {
        l0.p(collection, "<this>");
        return H4(collection, ef.f.O);
    }

    @g
    public static final <T> List<T> G5(@g List<? extends T> list, @g l<? super T, Boolean> lVar) {
        l0.p(list, "<this>");
        l0.p(lVar, "predicate");
        if (list.isEmpty()) {
            return w.E();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!lVar.A(listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return w.E();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return Q5(list);
    }

    @ve.h(name = "averageOfInt")
    public static final double H1(@g Iterable<Integer> iterable) {
        l0.p(iterable, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Integer intValue : iterable) {
            d10 += (double) intValue.intValue();
            i10++;
            if (i10 < 0) {
                w.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @h1(version = "1.4")
    @g
    @t0
    @ve.h(name = "flatMapSequence")
    public static final <T, R> List<R> H2(@g Iterable<? extends T> iterable, @g l<? super T, ? extends m<? extends R>> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Object A : iterable) {
            b0.n0(arrayList, (m) lVar.A(A));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T> Float H3(Iterable<? extends T> iterable, l<? super T, Float> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = lVar.A(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @h
    public static final <T> T H4(@g Collection<? extends T> collection, @g ef.f fVar) {
        l0.p(collection, "<this>");
        l0.p(fVar, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return b2(collection, fVar.m(collection.size()));
    }

    @g
    public static final <T> List<T> H5(@g Iterable<? extends T> iterable, @g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!lVar.A(next).booleanValue()) {
                break;
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    @ve.h(name = "averageOfLong")
    public static final double I1(@g Iterable<Long> iterable) {
        l0.p(iterable, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Long longValue : iterable) {
            d10 += (double) longValue.longValue();
            i10++;
            if (i10 < 0) {
                w.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @h1(version = "1.4")
    @g
    @t0
    @ve.h(name = "flatMapSequenceTo")
    public static final <T, R, C extends Collection<? super R>> C I2(@g Iterable<? extends T> iterable, @g C c10, @g l<? super T, ? extends m<? extends R>> lVar) {
        l0.p(iterable, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (Object A : iterable) {
            b0.n0(c10, (m) lVar.A(A));
        }
        return c10;
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T, R> R I3(Iterable<? extends T> iterable, Comparator<? super R> comparator, l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R A = lVar.A(it.next());
            while (it.hasNext()) {
                R A2 = lVar.A(it.next());
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [we.p, we.p<? super S, ? super T, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S I4(@fh.g java.lang.Iterable<? extends T> r2, @fh.g we.p<? super S, ? super T, ? extends S> r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r2.next()
        L_0x0018:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r3.g0(r0, r1)
            goto L_0x0018
        L_0x0027:
            return r0
        L_0x0028:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Empty collection can't be reduced."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.I4(java.lang.Iterable, we.p):java.lang.Object");
    }

    @g
    public static final boolean[] I5(@g Collection<Boolean> collection) {
        l0.p(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        int i10 = 0;
        for (Boolean booleanValue : collection) {
            zArr[i10] = booleanValue.booleanValue();
            i10++;
        }
        return zArr;
    }

    @ve.h(name = "averageOfShort")
    public static final double J1(@g Iterable<Short> iterable) {
        l0.p(iterable, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Short shortValue : iterable) {
            d10 += (double) shortValue.shortValue();
            i10++;
            if (i10 < 0) {
                w.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @g
    public static final <T, R, C extends Collection<? super R>> C J2(@g Iterable<? extends T> iterable, @g C c10, @g l<? super T, ? extends Iterable<? extends R>> lVar) {
        l0.p(iterable, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (Object A : iterable) {
            b0.o0(c10, (Iterable) lVar.A(A));
        }
        return c10;
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T, R> R J3(Iterable<? extends T> iterable, Comparator<? super R> comparator, l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R A = lVar.A(it.next());
        while (it.hasNext()) {
            R A2 = lVar.A(it.next());
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super S, ? super T, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S J4(@fh.g java.lang.Iterable<? extends T> r4, @fh.g we.q<? super java.lang.Integer, ? super S, ? super T, ? extends S> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r4.next()
            r1 = 1
        L_0x0019:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0034
            int r2 = r1 + 1
            if (r1 >= 0) goto L_0x0026
            be.w.W()
        L_0x0026:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r4.next()
            java.lang.Object r0 = r5.y(r1, r0, r3)
            r1 = r2
            goto L_0x0019
        L_0x0034:
            return r0
        L_0x0035:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "Empty collection can't be reduced."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.J4(java.lang.Iterable, we.q):java.lang.Object");
    }

    @g
    public static final byte[] J5(@g Collection<Byte> collection) {
        l0.p(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        int i10 = 0;
        for (Byte byteValue : collection) {
            bArr[i10] = byteValue.byteValue();
            i10++;
        }
        return bArr;
    }

    @g
    @h1(version = "1.2")
    public static final <T> List<List<T>> K1(@g Iterable<? extends T> iterable, int i10) {
        l0.p(iterable, "<this>");
        return Y5(iterable, i10, i10, true);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [we.p, we.p<? super R, ? super T, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R K2(@fh.g java.lang.Iterable<? extends T> r1, R r2, @fh.g we.p<? super R, ? super T, ? extends R> r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r1, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r3, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r1.next()
            java.lang.Object r2 = r3.g0(r2, r0)
            goto L_0x000e
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.K2(java.lang.Iterable, java.lang.Object, we.p):java.lang.Object");
    }

    @h1(version = "1.4")
    @h
    public static final <T extends Comparable<? super T>> T K3(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t10 = (Comparable) it.next();
        while (it.hasNext()) {
            T t11 = (Comparable) it.next();
            if (t10.compareTo(t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super S, ? super T, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S K4(@fh.g java.lang.Iterable<? extends T> r4, @fh.g we.q<? super java.lang.Integer, ? super S, ? super T, ? extends S> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L_0x0016
            r4 = 0
            return r4
        L_0x0016:
            java.lang.Object r0 = r4.next()
            r1 = 1
        L_0x001b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0036
            int r2 = r1 + 1
            if (r1 >= 0) goto L_0x0028
            be.w.W()
        L_0x0028:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r4.next()
            java.lang.Object r0 = r5.y(r1, r0, r3)
            r1 = r2
            goto L_0x001b
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.K4(java.lang.Iterable, we.q):java.lang.Object");
    }

    @g
    public static final char[] K5(@g Collection<Character> collection) {
        l0.p(collection, "<this>");
        char[] cArr = new char[collection.size()];
        int i10 = 0;
        for (Character charValue : collection) {
            cArr[i10] = charValue.charValue();
            i10++;
        }
        return cArr;
    }

    @g
    @h1(version = "1.2")
    public static final <T, R> List<R> L1(@g Iterable<? extends T> iterable, int i10, @g l<? super List<? extends T>, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "transform");
        return Z5(iterable, i10, i10, true, lVar);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super T, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R L2(@fh.g java.lang.Iterable<? extends T> r3, R r4, @fh.g we.q<? super java.lang.Integer, ? super R, ? super T, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L_0x000f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x002a
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L_0x0020
            be.w.W()
        L_0x0020:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r4 = r5.y(r0, r4, r1)
            r0 = r2
            goto L_0x000f
        L_0x002a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.L2(java.lang.Iterable, java.lang.Object, we.q):java.lang.Object");
    }

    @h1(version = "1.4")
    @h
    public static final Double L3(@g Iterable<Double> iterable) {
        l0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [we.p, we.p<? super S, ? super T, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S L4(@fh.g java.lang.Iterable<? extends T> r2, @fh.g we.p<? super S, ? super T, ? extends S> r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L_0x0016
            r2 = 0
            return r2
        L_0x0016:
            java.lang.Object r0 = r2.next()
        L_0x001a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r3.g0(r0, r1)
            goto L_0x001a
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.L4(java.lang.Iterable, we.p):java.lang.Object");
    }

    @g
    public static final <T, C extends Collection<? super T>> C L5(@g Iterable<? extends T> iterable, @g C c10) {
        l0.p(iterable, "<this>");
        l0.p(c10, "destination");
        for (Object add : iterable) {
            c10.add(add);
        }
        return c10;
    }

    @f
    public static final <T> T M1(List<? extends T> list) {
        l0.p(list, "<this>");
        return list.get(0);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [we.p, we.p<? super T, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R M2(@fh.g java.util.List<? extends T> r1, R r2, @fh.g we.p<? super T, ? super R, ? extends R> r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r1, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r3, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0027
            int r0 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r0)
        L_0x0018:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r1.previous()
            java.lang.Object r2 = r3.g0(r0, r2)
            goto L_0x0018
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.M2(java.util.List, java.lang.Object, we.p):java.lang.Object");
    }

    @h1(version = "1.4")
    @h
    public static final Float M3(@g Iterable<Float> iterable) {
        l0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [we.p, we.p<? super T, ? super S, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S M4(@fh.g java.util.List<? extends T> r2, @fh.g we.p<? super T, ? super S, ? extends S> r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r3, r0)
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r2.previous()
        L_0x001c:
            boolean r1 = r2.hasPrevious()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r2.previous()
            java.lang.Object r0 = r3.g0(r1, r0)
            goto L_0x001c
        L_0x002b:
            return r0
        L_0x002c:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Empty list can't be reduced."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.M4(java.util.List, we.p):java.lang.Object");
    }

    @g
    public static final double[] M5(@g Collection<Double> collection) {
        l0.p(collection, "<this>");
        double[] dArr = new double[collection.size()];
        int i10 = 0;
        for (Double doubleValue : collection) {
            dArr[i10] = doubleValue.doubleValue();
            i10++;
        }
        return dArr;
    }

    @f
    public static final <T> T N1(List<? extends T> list) {
        l0.p(list, "<this>");
        return list.get(1);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.q, we.q<? super java.lang.Integer, ? super T, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R N2(@fh.g java.util.List<? extends T> r2, R r3, @fh.g we.q<? super java.lang.Integer, ? super T, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x002f
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
        L_0x0018:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L_0x002f
            int r0 = r2.previousIndex()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r2.previous()
            java.lang.Object r3 = r4.y(r0, r1, r3)
            goto L_0x0018
        L_0x002f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.N2(java.util.List, java.lang.Object, we.q):java.lang.Object");
    }

    @h1(version = "1.7")
    @ve.h(name = "maxOrThrow")
    public static final double N3(@g Iterable<Double> iterable) {
        l0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.q, we.q<? super java.lang.Integer, ? super T, ? super S, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S N4(@fh.g java.util.List<? extends T> r3, @fh.g we.q<? super java.lang.Integer, ? super T, ? super S, ? extends S> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            int r0 = r3.size()
            java.util.ListIterator r3 = r3.listIterator(r0)
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r3.previous()
        L_0x001c:
            boolean r1 = r3.hasPrevious()
            if (r1 == 0) goto L_0x0033
            int r1 = r3.previousIndex()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r3.previous()
            java.lang.Object r0 = r4.y(r1, r2, r0)
            goto L_0x001c
        L_0x0033:
            return r0
        L_0x0034:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "Empty list can't be reduced."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.N4(java.util.List, we.q):java.lang.Object");
    }

    @g
    public static final float[] N5(@g Collection<Float> collection) {
        l0.p(collection, "<this>");
        float[] fArr = new float[collection.size()];
        int i10 = 0;
        for (Float floatValue : collection) {
            fArr[i10] = floatValue.floatValue();
            i10++;
        }
        return fArr;
    }

    @f
    public static final <T> T O1(List<? extends T> list) {
        l0.p(list, "<this>");
        return list.get(2);
    }

    @e
    public static final <T> void O2(@g Iterable<? extends T> iterable, @g l<? super T, u2> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "action");
        for (Object A : iterable) {
            lVar.A(A);
        }
    }

    @h1(version = "1.7")
    @ve.h(name = "maxOrThrow")
    public static final float O3(@g Iterable<Float> iterable) {
        l0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.q, we.q<? super java.lang.Integer, ? super T, ? super S, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S O4(@fh.g java.util.List<? extends T> r3, @fh.g we.q<? super java.lang.Integer, ? super T, ? super S, ? extends S> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            int r0 = r3.size()
            java.util.ListIterator r3 = r3.listIterator(r0)
            boolean r0 = r3.hasPrevious()
            if (r0 != 0) goto L_0x001a
            r3 = 0
            return r3
        L_0x001a:
            java.lang.Object r0 = r3.previous()
        L_0x001e:
            boolean r1 = r3.hasPrevious()
            if (r1 == 0) goto L_0x0035
            int r1 = r3.previousIndex()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r3.previous()
            java.lang.Object r0 = r4.y(r1, r2, r0)
            goto L_0x001e
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.O4(java.util.List, we.q):java.lang.Object");
    }

    @g
    public static final <T> HashSet<T> O5(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        return (HashSet) L5(iterable, new HashSet(z0.j(x.Y(iterable, 12))));
    }

    @f
    public static final <T> T P1(List<? extends T> list) {
        l0.p(list, "<this>");
        return list.get(3);
    }

    public static final <T> void P2(@g Iterable<? extends T> iterable, @g p<? super Integer, ? super T, u2> pVar) {
        l0.p(iterable, "<this>");
        l0.p(pVar, "action");
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            pVar.g0(Integer.valueOf(i10), next);
            i10 = i11;
        }
    }

    @h1(version = "1.7")
    @g
    @ve.h(name = "maxOrThrow")
    public static final <T extends Comparable<? super T>> T P3(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T t10 = (Comparable) it.next();
            while (it.hasNext()) {
                T t11 = (Comparable) it.next();
                if (t10.compareTo(t11) < 0) {
                    t10 = t11;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [we.p, we.p<? super T, ? super S, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S P4(@fh.g java.util.List<? extends T> r2, @fh.g we.p<? super T, ? super S, ? extends S> r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r3, r0)
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
            boolean r0 = r2.hasPrevious()
            if (r0 != 0) goto L_0x001a
            r2 = 0
            return r2
        L_0x001a:
            java.lang.Object r0 = r2.previous()
        L_0x001e:
            boolean r1 = r2.hasPrevious()
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r2.previous()
            java.lang.Object r0 = r3.g0(r1, r0)
            goto L_0x001e
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.P4(java.util.List, we.p):java.lang.Object");
    }

    @g
    public static final int[] P5(@g Collection<Integer> collection) {
        l0.p(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i10 = 0;
        for (Integer intValue : collection) {
            iArr[i10] = intValue.intValue();
            i10++;
        }
        return iArr;
    }

    @f
    public static final <T> T Q1(List<? extends T> list) {
        l0.p(list, "<this>");
        return list.get(4);
    }

    @f
    public static final <T> T Q2(List<? extends T> list, int i10, l<? super Integer, ? extends T> lVar) {
        l0.p(list, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > w.G(list)) ? lVar.A(Integer.valueOf(i10)) : list.get(i10);
    }

    @h1(version = "1.4")
    @h
    public static final <T> T Q3(@g Iterable<? extends T> iterable, @g Comparator<? super T> comparator) {
        l0.p(iterable, "<this>");
        l0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @g
    public static final <T> Iterable<T> Q4(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        for (Object obj : iterable) {
            if (obj == null) {
                throw new IllegalArgumentException("null element found in " + iterable + '.');
            }
        }
        return iterable;
    }

    @g
    public static final <T> List<T> Q5(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return w.Q(S5(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return w.E();
        }
        if (size != 1) {
            return T5(collection);
        }
        return v.k(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> boolean R1(@g Iterable<? extends T> iterable, T t10) {
        l0.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t10) : X2(iterable, t10) >= 0;
    }

    @h
    public static final <T> T R2(@g List<? extends T> list, int i10) {
        l0.p(list, "<this>");
        if (i10 < 0 || i10 > w.G(list)) {
            return null;
        }
        return list.get(i10);
    }

    @h1(version = "1.7")
    @ve.h(name = "maxWithOrThrow")
    public static final <T> T R3(@g Iterable<? extends T> iterable, @g Comparator<? super T> comparator) {
        l0.p(iterable, "<this>");
        l0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (comparator.compare(next, next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @g
    public static final <T> List<T> R4(@g List<? extends T> list) {
        l0.p(list, "<this>");
        for (Object obj : list) {
            if (obj == null) {
                throw new IllegalArgumentException("null element found in " + list + '.');
            }
        }
        return list;
    }

    @g
    public static final long[] R5(@g Collection<Long> collection) {
        l0.p(collection, "<this>");
        long[] jArr = new long[collection.size()];
        int i10 = 0;
        for (Long longValue : collection) {
            jArr[i10] = longValue.longValue();
            i10++;
        }
        return jArr;
    }

    public static final <T> int S1(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        int i10 = 0;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                w.V();
            }
        }
        return i10;
    }

    @g
    public static final <T, K> Map<K, List<T>> S2(@g Iterable<? extends T> iterable, @g l<? super T, ? extends K> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : iterable) {
            Object A = lVar.A(next);
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(next);
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @h
    public static final <T, R extends Comparable<? super R>> T S3(@g Iterable<? extends T> iterable, @g l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) lVar.A(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) lVar.A(next2);
            if (comparable.compareTo(comparable2) > 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    @g
    public static final <T> List<T> S4(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return Q5(iterable);
        }
        List<T> S5 = S5(iterable);
        d0.m1(S5);
        return S5;
    }

    @g
    public static final <T> List<T> S5(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        return iterable instanceof Collection ? T5((Collection) iterable) : (List) L5(iterable, new ArrayList());
    }

    public static final <T> int T1(@g Iterable<? extends T> iterable, @g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        for (Object A : iterable) {
            if (lVar.A(A).booleanValue() && (i10 = i10 + 1) < 0) {
                w.V();
            }
        }
        return i10;
    }

    @g
    public static final <T, K, V> Map<K, List<V>> T2(@g Iterable<? extends T> iterable, @g l<? super T, ? extends K> lVar, @g l<? super T, ? extends V> lVar2) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : iterable) {
            Object A = lVar.A(next);
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(next));
        }
        return linkedHashMap;
    }

    @h1(version = "1.7")
    @ve.h(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T T3(@g Iterable<? extends T> iterable, @g l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            Comparable comparable = (Comparable) lVar.A(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) lVar.A(next2);
                if (comparable.compareTo(comparable2) > 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.p, we.p<? super R, ? super T, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @fh.g
    @zd.h1(version = "1.4")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> java.util.List<R> T4(@fh.g java.lang.Iterable<? extends T> r2, R r3, @fh.g we.p<? super R, ? super T, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            r0 = 9
            int r0 = be.x.Y(r2, r0)
            if (r0 != 0) goto L_0x0017
            java.util.List r2 = be.v.k(r3)
            return r2
        L_0x0017:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0 + 1
            r1.<init>(r0)
            r1.add(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0025:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r2.next()
            java.lang.Object r3 = r4.g0(r3, r0)
            r1.add(r3)
            goto L_0x0025
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.T4(java.lang.Iterable, java.lang.Object, we.p):java.util.List");
    }

    @g
    public static final <T> List<T> T5(@g Collection<? extends T> collection) {
        l0.p(collection, "<this>");
        return new ArrayList(collection);
    }

    @f
    public static final <T> int U1(Collection<? extends T> collection) {
        l0.p(collection, "<this>");
        return collection.size();
    }

    @g
    public static final <T, K, M extends Map<? super K, List<T>>> M U2(@g Iterable<? extends T> iterable, @g M m10, @g l<? super T, ? extends K> lVar) {
        l0.p(iterable, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (Object next : iterable) {
            Object A = lVar.A(next);
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(next);
        }
        return m10;
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T> double U3(Iterable<? extends T> iterable, l<? super T, Double> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.A(it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super T, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @fh.g
    @zd.h1(version = "1.4")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> java.util.List<R> U4(@fh.g java.lang.Iterable<? extends T> r4, R r5, @fh.g we.q<? super java.lang.Integer, ? super R, ? super T, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            r0 = 9
            int r0 = be.x.Y(r4, r0)
            if (r0 != 0) goto L_0x0017
            java.util.List r4 = be.v.k(r5)
            return r4
        L_0x0017:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0 + 1
            r1.<init>(r0)
            r1.add(r5)
            r0 = 0
            java.util.Iterator r4 = r4.iterator()
        L_0x0026:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r4.next()
            int r3 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r6.y(r0, r5, r2)
            r1.add(r5)
            r0 = r3
            goto L_0x0026
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.U4(java.lang.Iterable, java.lang.Object, we.q):java.util.List");
    }

    @g
    public static final <T> Set<T> U5(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) L5(iterable, new LinkedHashSet());
    }

    @g
    public static final <T> List<T> V1(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        return Q5(U5(iterable));
    }

    @g
    public static final <T, K, V, M extends Map<? super K, List<V>>> M V2(@g Iterable<? extends T> iterable, @g M m10, @g l<? super T, ? extends K> lVar, @g l<? super T, ? extends V> lVar2) {
        l0.p(iterable, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (Object next : iterable) {
            Object A = lVar.A(next);
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(next));
        }
        return m10;
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T> float V3(Iterable<? extends T> iterable, l<? super T, Float> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = lVar.A(it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.p, we.p<? super S, ? super T, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> java.util.List<S> V4(@fh.g java.lang.Iterable<? extends T> r4, @fh.g we.p<? super S, ? super T, ? extends S> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            java.util.Iterator r0 = r4.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x0019
            java.util.List r4 = be.w.E()
            return r4
        L_0x0019:
            java.lang.Object r1 = r0.next()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = be.x.Y(r4, r3)
            r2.<init>(r4)
        L_0x0028:
            r2.add(r1)
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r0.next()
            java.lang.Object r1 = r5.g0(r1, r4)
            goto L_0x0028
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.V4(java.lang.Iterable, we.p):java.util.List");
    }

    @g
    public static final <T> Set<T> V5(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return l1.r((Set) L5(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return l1.k();
        }
        if (size != 1) {
            return (Set) L5(iterable, new LinkedHashSet(z0.j(collection.size())));
        }
        return k1.f(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    @g
    public static final <T, K> List<T> W1(@g Iterable<? extends T> iterable, @g l<? super T, ? extends K> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (hashSet.add(lVar.A(next))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @g
    @h1(version = "1.1")
    public static final <T, K> l0<T, K> W2(@g Iterable<? extends T> iterable, @g l<? super T, ? extends K> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "keySelector");
        return new c(iterable, lVar);
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T, R extends Comparable<? super R>> R W3(Iterable<? extends T> iterable, l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R r10 = (Comparable) lVar.A(it.next());
            while (it.hasNext()) {
                R r11 = (Comparable) lVar.A(it.next());
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.q, we.q<? super java.lang.Integer, ? super S, ? super T, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @fh.g
    @zd.h1(version = "1.4")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> java.util.List<S> W4(@fh.g java.lang.Iterable<? extends T> r5, @fh.g we.q<? super java.lang.Integer, ? super S, ? super T, ? extends S> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            java.util.Iterator r0 = r5.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x0019
            java.util.List r5 = be.w.E()
            return r5
        L_0x0019:
            java.lang.Object r1 = r0.next()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r5 = be.x.Y(r5, r3)
            r2.<init>(r5)
            r2.add(r1)
            r5 = 1
        L_0x002c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0045
            int r3 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r0.next()
            java.lang.Object r1 = r6.y(r5, r1, r4)
            r2.add(r1)
            r5 = r3
            goto L_0x002c
        L_0x0045:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.W4(java.lang.Iterable, we.q):java.util.List");
    }

    @g
    public static final short[] W5(@g Collection<Short> collection) {
        l0.p(collection, "<this>");
        short[] sArr = new short[collection.size()];
        int i10 = 0;
        for (Short shortValue : collection) {
            sArr[i10] = shortValue.shortValue();
            i10++;
        }
        return sArr;
    }

    @g
    public static final <T> List<T> X1(@g Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        l0.p(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return Q5(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i10;
                if (size <= 0) {
                    return w.E();
                }
                if (size == 1) {
                    return v.k(i3(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i10 < size2) {
                            arrayList.add(((List) iterable).get(i10));
                            i10++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i10);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object next : iterable) {
                if (i11 >= i10) {
                    arrayList.add(next);
                } else {
                    i11++;
                }
            }
            return w.Q(arrayList);
        }
    }

    public static final <T> int X2(@g Iterable<? extends T> iterable, T t10) {
        l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 < 0) {
                w.W();
            }
            if (l0.g(t10, next)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T, R extends Comparable<? super R>> R X3(Iterable<? extends T> iterable, l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R r10 = (Comparable) lVar.A(it.next());
        while (it.hasNext()) {
            R r11 = (Comparable) lVar.A(it.next());
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.p, we.p<? super R, ? super T, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> java.util.List<R> X4(@fh.g java.lang.Iterable<? extends T> r2, R r3, @fh.g we.p<? super R, ? super T, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            r0 = 9
            int r0 = be.x.Y(r2, r0)
            if (r0 != 0) goto L_0x0017
            java.util.List r2 = be.v.k(r3)
            goto L_0x0038
        L_0x0017:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0 + 1
            r1.<init>(r0)
            r1.add(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0025:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r2.next()
            java.lang.Object r3 = r4.g0(r3, r0)
            r1.add(r3)
            goto L_0x0025
        L_0x0037:
            r2 = r1
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.X4(java.lang.Iterable, java.lang.Object, we.p):java.util.List");
    }

    @g
    public static final <T> Set<T> X5(@g Iterable<? extends T> iterable, @g Iterable<? extends T> iterable2) {
        l0.p(iterable, "<this>");
        l0.p(iterable2, "other");
        Set<T> U5 = U5(iterable);
        b0.o0(U5, iterable2);
        return U5;
    }

    @g
    public static final <T> List<T> Y1(@g List<? extends T> list, int i10) {
        l0.p(list, "<this>");
        if (i10 >= 0) {
            return E5(list, v.u(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T> int Y2(@g List<? extends T> list, T t10) {
        l0.p(list, "<this>");
        return list.indexOf(t10);
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T> Double Y3(Iterable<? extends T> iterable, l<? super T, Double> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = lVar.A(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super T, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> java.util.List<R> Y4(@fh.g java.lang.Iterable<? extends T> r4, R r5, @fh.g we.q<? super java.lang.Integer, ? super R, ? super T, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            r0 = 9
            int r0 = be.x.Y(r4, r0)
            if (r0 != 0) goto L_0x0017
            java.util.List r4 = be.v.k(r5)
            goto L_0x0040
        L_0x0017:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0 + 1
            r1.<init>(r0)
            r1.add(r5)
            r0 = 0
            java.util.Iterator r4 = r4.iterator()
        L_0x0026:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r4.next()
            int r3 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r6.y(r0, r5, r2)
            r1.add(r5)
            r0 = r3
            goto L_0x0026
        L_0x003f:
            r4 = r1
        L_0x0040:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e0.Y4(java.lang.Iterable, java.lang.Object, we.q):java.util.List");
    }

    @g
    @h1(version = "1.2")
    public static final <T> List<List<T>> Y5(@g Iterable<? extends T> iterable, int i10, int i11, boolean z10) {
        int B;
        l0.p(iterable, "<this>");
        o1.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator<List<T>> b10 = o1.b(iterable.iterator(), i10, i11, z10, false);
            while (b10.hasNext()) {
                arrayList.add(b10.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (true) {
            if (!(i12 >= 0 && i12 < size) || ((B = v.B(i10, size - i12)) < i10 && !z10)) {
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(B);
            for (int i13 = 0; i13 < B; i13++) {
                arrayList3.add(list.get(i13 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    @g
    public static final <T> List<T> Z1(@g List<? extends T> list, @g l<? super T, Boolean> lVar) {
        l0.p(list, "<this>");
        l0.p(lVar, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!lVar.A(listIterator.previous()).booleanValue()) {
                    return E5(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return w.E();
    }

    public static final <T> int Z2(@g Iterable<? extends T> iterable, @g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 < 0) {
                w.W();
            }
            if (lVar.A(next).booleanValue()) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T> Float Z3(Iterable<? extends T> iterable, l<? super T, Float> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = lVar.A(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.3")
    public static final <T> void Z4(@g List<T> list, @g ef.f fVar) {
        l0.p(list, "<this>");
        l0.p(fVar, "random");
        for (int G = w.G(list); G > 0; G--) {
            int m10 = fVar.m(G + 1);
            list.set(m10, list.set(G, list.get(m10)));
        }
    }

    @g
    @h1(version = "1.2")
    public static final <T, R> List<R> Z5(@g Iterable<? extends T> iterable, int i10, int i11, boolean z10, @g l<? super List<? extends T>, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "transform");
        o1.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator<List<T>> b10 = o1.b(iterable.iterator(), i10, i11, z10, true);
            while (b10.hasNext()) {
                arrayList.add(lVar.A(b10.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        d1 d1Var = new d1(list);
        int i12 = 0;
        while (true) {
            if (!(i12 >= 0 && i12 < size)) {
                break;
            }
            int B = v.B(i10, size - i12);
            if (!z10 && B < i10) {
                break;
            }
            d1Var.c(i12, B + i12);
            arrayList2.add(lVar.A(d1Var));
            i12 += i11;
        }
        return arrayList2;
    }

    @g
    public static final <T> List<T> a2(@g Iterable<? extends T> iterable, @g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (Object next : iterable) {
            if (z10) {
                arrayList.add(next);
            } else if (!lVar.A(next).booleanValue()) {
                arrayList.add(next);
                z10 = true;
            }
        }
        return arrayList;
    }

    public static final <T> int a3(@g List<? extends T> list, @g l<? super T, Boolean> lVar) {
        l0.p(list, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        for (Object A : list) {
            if (lVar.A(A).booleanValue()) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T, R> R a4(Iterable<? extends T> iterable, Comparator<? super R> comparator, l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R A = lVar.A(it.next());
            while (it.hasNext()) {
                R A2 = lVar.A(it.next());
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    public static final <T> T a5(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return c5((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static /* synthetic */ List a6(Iterable iterable, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return Y5(iterable, i10, i11, z10);
    }

    public static final <T> T b2(@g Iterable<? extends T> iterable, int i10) {
        l0.p(iterable, "<this>");
        return iterable instanceof List ? ((List) iterable).get(i10) : d2(iterable, i10, new b(i10));
    }

    public static final <T> int b3(@g Iterable<? extends T> iterable, @g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        int i10 = -1;
        int i11 = 0;
        for (Object next : iterable) {
            if (i11 < 0) {
                w.W();
            }
            if (lVar.A(next).booleanValue()) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <T, R> R b4(Iterable<? extends T> iterable, Comparator<? super R> comparator, l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R A = lVar.A(it.next());
        while (it.hasNext()) {
            R A2 = lVar.A(it.next());
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    public static final <T> T b5(@g Iterable<? extends T> iterable, @g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T next : iterable) {
            if (lVar.A(next).booleanValue()) {
                if (!z10) {
                    z10 = true;
                    t10 = next;
                } else {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static /* synthetic */ List b6(Iterable iterable, int i10, int i11, boolean z10, l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return Z5(iterable, i10, i11, z10, lVar);
    }

    @f
    public static final <T> T c2(List<? extends T> list, int i10) {
        l0.p(list, "<this>");
        return list.get(i10);
    }

    public static final <T> int c3(@g List<? extends T> list, @g l<? super T, Boolean> lVar) {
        l0.p(list, "<this>");
        l0.p(lVar, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (lVar.A(listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @h1(version = "1.4")
    @h
    public static final <T extends Comparable<? super T>> T c4(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t10 = (Comparable) it.next();
        while (it.hasNext()) {
            T t11 = (Comparable) it.next();
            if (t10.compareTo(t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    public static final <T> T c5(@g List<? extends T> list) {
        l0.p(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    @g
    public static final <T> Iterable<p0<T>> c6(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        return new q0(new d(iterable));
    }

    public static final <T> T d2(@g Iterable<? extends T> iterable, int i10, @g l<? super Integer, ? extends T> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i10 < 0 || i10 > w.G(list)) ? lVar.A(Integer.valueOf(i10)) : list.get(i10);
        }
        if (i10 >= 0) {
            int i11 = 0;
            for (T next : iterable) {
                int i12 = i11 + 1;
                if (i10 == i11) {
                    return next;
                }
                i11 = i12;
            }
        }
        return lVar.A(Integer.valueOf(i10));
    }

    @g
    public static final <T> Set<T> d3(@g Iterable<? extends T> iterable, @g Iterable<? extends T> iterable2) {
        l0.p(iterable, "<this>");
        l0.p(iterable2, "other");
        Set<T> U5 = U5(iterable);
        b0.P0(U5, iterable2);
        return U5;
    }

    @h1(version = "1.4")
    @h
    public static final Double d4(@g Iterable<Double> iterable) {
        l0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h
    public static final <T> T d5(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @g
    public static final <T, R> List<u0<T, R>> d6(@g Iterable<? extends T> iterable, @g Iterable<? extends R> iterable2) {
        l0.p(iterable, "<this>");
        l0.p(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), x.Y(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(r1.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    @f
    public static final <T> T e2(List<? extends T> list, int i10, l<? super Integer, ? extends T> lVar) {
        l0.p(list, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > w.G(list)) ? lVar.A(Integer.valueOf(i10)) : list.get(i10);
    }

    @g
    public static final <T, A extends Appendable> A e3(@g Iterable<? extends T> iterable, @g A a10, @g CharSequence charSequence, @g CharSequence charSequence2, @g CharSequence charSequence3, int i10, @g CharSequence charSequence4, @h l<? super T, ? extends CharSequence> lVar) {
        l0.p(iterable, "<this>");
        l0.p(a10, "buffer");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (Object next : iterable) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            lf.t.b(a10, next, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    @h1(version = "1.4")
    @h
    public static final Float e4(@g Iterable<Float> iterable) {
        l0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h
    public static final <T> T e5(@g Iterable<? extends T> iterable, @g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        boolean z10 = false;
        T t10 = null;
        for (T next : iterable) {
            if (lVar.A(next).booleanValue()) {
                if (z10) {
                    return null;
                }
                z10 = true;
                t10 = next;
            }
        }
        if (!z10) {
            return null;
        }
        return t10;
    }

    @g
    public static final <T, R, V> List<V> e6(@g Iterable<? extends T> iterable, @g Iterable<? extends R> iterable2, @g p<? super T, ? super R, ? extends V> pVar) {
        l0.p(iterable, "<this>");
        l0.p(iterable2, "other");
        l0.p(pVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), x.Y(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(pVar.g0(it.next(), it2.next()));
        }
        return arrayList;
    }

    @h
    public static final <T> T f2(@g Iterable<? extends T> iterable, int i10) {
        l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return R2((List) iterable, i10);
        }
        if (i10 < 0) {
            return null;
        }
        int i11 = 0;
        for (T next : iterable) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return next;
            }
            i11 = i12;
        }
        return null;
    }

    public static /* synthetic */ Appendable f3(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return e3(iterable, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    @h1(version = "1.7")
    @ve.h(name = "minOrThrow")
    public static final double f4(@g Iterable<Double> iterable) {
        l0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h
    public static final <T> T f5(@g List<? extends T> list) {
        l0.p(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @g
    public static final <T, R> List<u0<T, R>> f6(@g Iterable<? extends T> iterable, @g R[] rArr) {
        l0.p(iterable, "<this>");
        l0.p(rArr, "other");
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(r1.a(next, rArr[i10]));
            i10++;
        }
        return arrayList;
    }

    @f
    public static final <T> T g2(List<? extends T> list, int i10) {
        l0.p(list, "<this>");
        return R2(list, i10);
    }

    @g
    public static final <T> String g3(@g Iterable<? extends T> iterable, @g CharSequence charSequence, @g CharSequence charSequence2, @g CharSequence charSequence3, int i10, @g CharSequence charSequence4, @h l<? super T, ? extends CharSequence> lVar) {
        l0.p(iterable, "<this>");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        String sb2 = ((StringBuilder) e3(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        l0.o(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    @h1(version = "1.7")
    @ve.h(name = "minOrThrow")
    public static final float g4(@g Iterable<Float> iterable) {
        l0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @g
    public static final <T> List<T> g5(@g List<? extends T> list, @g gf.m mVar) {
        l0.p(list, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? w.E() : Q5(list.subList(mVar.c().intValue(), mVar.h().intValue() + 1));
    }

    @g
    public static final <T, R, V> List<V> g6(@g Iterable<? extends T> iterable, @g R[] rArr, @g p<? super T, ? super R, ? extends V> pVar) {
        l0.p(iterable, "<this>");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(pVar.g0(next, rArr[i10]));
            i10++;
        }
        return arrayList;
    }

    @g
    public static final <T> List<T> h2(@g Iterable<? extends T> iterable, @g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (lVar.A(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ String h3(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return g3(iterable, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    @h1(version = "1.7")
    @g
    @ve.h(name = "minOrThrow")
    public static final <T extends Comparable<? super T>> T h4(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T t10 = (Comparable) it.next();
            while (it.hasNext()) {
                T t11 = (Comparable) it.next();
                if (t10.compareTo(t11) > 0) {
                    t10 = t11;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    @g
    public static final <T> List<T> h5(@g List<? extends T> list, @g Iterable<Integer> iterable) {
        l0.p(list, "<this>");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(list.get(intValue.intValue()));
        }
        return arrayList;
    }

    @g
    @h1(version = "1.2")
    public static final <T> List<u0<T, T>> h6(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList();
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            arrayList.add(r1.a(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @g
    public static final <T> List<T> i2(@g Iterable<? extends T> iterable, @g p<? super Integer, ? super T, Boolean> pVar) {
        l0.p(iterable, "<this>");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            if (pVar.g0(Integer.valueOf(i10), next).booleanValue()) {
                arrayList.add(next);
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static final <T> T i3(@g Iterable<? extends T> iterable) {
        T next;
        l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return k3((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @h1(version = "1.4")
    @h
    public static final <T> T i4(@g Iterable<? extends T> iterable, @g Comparator<? super T> comparator) {
        l0.p(iterable, "<this>");
        l0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T, R extends Comparable<? super R>> void i5(@g List<T> list, @g l<? super T, ? extends R> lVar) {
        l0.p(list, "<this>");
        l0.p(lVar, "selector");
        if (list.size() > 1) {
            a0.m0(list, new g.a(lVar));
        }
    }

    @fh.g
    @h1(version = "1.2")
    public static final <T, R> List<R> i6(@fh.g Iterable<? extends T> iterable, @fh.g p<? super T, ? super T, ? extends R> pVar) {
        l0.p(iterable, "<this>");
        l0.p(pVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList();
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            arrayList.add(pVar.g0(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @fh.g
    public static final <T, C extends Collection<? super T>> C j2(@fh.g Iterable<? extends T> iterable, @fh.g C c10, @fh.g p<? super Integer, ? super T, Boolean> pVar) {
        l0.p(iterable, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            if (pVar.g0(Integer.valueOf(i10), next).booleanValue()) {
                c10.add(next);
            }
            i10 = i11;
        }
        return c10;
    }

    public static final <T> T j3(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T next : iterable) {
            if (lVar.A(next).booleanValue()) {
                z10 = true;
                t10 = next;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @h1(version = "1.7")
    @ve.h(name = "minWithOrThrow")
    public static final <T> T j4(@fh.g Iterable<? extends T> iterable, @fh.g Comparator<? super T> comparator) {
        l0.p(iterable, "<this>");
        l0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (comparator.compare(next, next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    public static final <T, R extends Comparable<? super R>> void j5(@fh.g List<T> list, @fh.g l<? super T, ? extends R> lVar) {
        l0.p(list, "<this>");
        l0.p(lVar, "selector");
        if (list.size() > 1) {
            a0.m0(list, new g.c(lVar));
        }
    }

    public static final /* synthetic */ <R> List<R> k2(Iterable<?> iterable) {
        l0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            l0.y(3, "R");
            if (next instanceof Object) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final <T> T k3(@fh.g List<? extends T> list) {
        l0.p(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(w.G(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    @fh.g
    public static final <T> List<T> k4(@fh.g Iterable<? extends T> iterable, @fh.g m<? extends T> mVar) {
        l0.p(iterable, "<this>");
        l0.p(mVar, "elements");
        List<? extends T> c32 = u.c3(mVar);
        if (c32.isEmpty()) {
            return Q5(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!c32.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final <T extends Comparable<? super T>> void k5(@fh.g List<T> list) {
        l0.p(list, "<this>");
        a0.m0(list, fe.g.x());
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C l2(Iterable<?> iterable, C c10) {
        l0.p(iterable, "<this>");
        l0.p(c10, "destination");
        for (Object next : iterable) {
            l0.y(3, "R");
            if (next instanceof Object) {
                c10.add(next);
            }
        }
        return c10;
    }

    public static final <T> T l3(@fh.g List<? extends T> list, @fh.g l<? super T, Boolean> lVar) {
        l0.p(list, "<this>");
        l0.p(lVar, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (lVar.A(previous).booleanValue()) {
                return previous;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @fh.g
    public static final <T> List<T> l4(@fh.g Iterable<? extends T> iterable, @fh.g Iterable<? extends T> iterable2) {
        l0.p(iterable, "<this>");
        l0.p(iterable2, "elements");
        Collection<? extends T> q02 = b0.q0(iterable2);
        if (q02.isEmpty()) {
            return Q5(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!q02.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <T extends Comparable<? super T>> List<T> l5(@fh.g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return Q5(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            o.v4((Comparable[]) array);
            return o.t(array);
        }
        List<T> S5 = S5(iterable);
        a0.j0(S5);
        return S5;
    }

    @fh.g
    public static final <T> List<T> m2(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!lVar.A(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final <T> int m3(@fh.g Iterable<? extends T> iterable, T t10) {
        l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t10);
        }
        int i10 = -1;
        int i11 = 0;
        for (Object next : iterable) {
            if (i11 < 0) {
                w.W();
            }
            if (l0.g(t10, next)) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    @fh.g
    public static final <T> List<T> m4(@fh.g Iterable<? extends T> iterable, T t10) {
        l0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList(x.Y(iterable, 10));
        boolean z10 = false;
        for (Object next : iterable) {
            boolean z11 = true;
            if (!z10 && l0.g(next, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <T, R extends Comparable<? super R>> List<T> m5(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        return p5(iterable, new g.a(lVar));
    }

    @fh.g
    public static final <T> List<T> n2(@fh.g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        return (List) o2(iterable, new ArrayList());
    }

    public static final <T> int n3(@fh.g List<? extends T> list, T t10) {
        l0.p(list, "<this>");
        return list.lastIndexOf(t10);
    }

    @fh.g
    public static final <T> List<T> n4(@fh.g Iterable<? extends T> iterable, @fh.g T[] tArr) {
        l0.p(iterable, "<this>");
        l0.p(tArr, "elements");
        if (tArr.length == 0) {
            return Q5(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!p.T8(tArr, next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <T, R extends Comparable<? super R>> List<T> n5(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        return p5(iterable, new g.c(lVar));
    }

    @fh.g
    public static final <C extends Collection<? super T>, T> C o2(@fh.g Iterable<? extends T> iterable, @fh.g C c10) {
        l0.p(iterable, "<this>");
        l0.p(c10, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c10.add(next);
            }
        }
        return c10;
    }

    @h
    public static final <T> T o3(@fh.g Iterable<? extends T> iterable) {
        T next;
        l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @f
    public static final <T> List<T> o4(Iterable<? extends T> iterable, T t10) {
        l0.p(iterable, "<this>");
        return m4(iterable, t10);
    }

    @fh.g
    public static final <T extends Comparable<? super T>> List<T> o5(@fh.g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        return p5(iterable, fe.g.x());
    }

    @fh.g
    public static final <T, C extends Collection<? super T>> C p2(@fh.g Iterable<? extends T> iterable, @fh.g C c10, @fh.g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (Object next : iterable) {
            if (!lVar.A(next).booleanValue()) {
                c10.add(next);
            }
        }
        return c10;
    }

    @h
    public static final <T> T p3(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        T t10 = null;
        for (T next : iterable) {
            if (lVar.A(next).booleanValue()) {
                t10 = next;
            }
        }
        return t10;
    }

    public static final <T> boolean p4(@fh.g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    @fh.g
    public static final <T> List<T> p5(@fh.g Iterable<? extends T> iterable, @fh.g Comparator<? super T> comparator) {
        l0.p(iterable, "<this>");
        l0.p(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return Q5(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            o.I4(array, comparator);
            return o.t(array);
        }
        List<T> S5 = S5(iterable);
        a0.m0(S5, comparator);
        return S5;
    }

    @fh.g
    public static final <T, C extends Collection<? super T>> C q2(@fh.g Iterable<? extends T> iterable, @fh.g C c10, @fh.g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (Object next : iterable) {
            if (lVar.A(next).booleanValue()) {
                c10.add(next);
            }
        }
        return c10;
    }

    @h
    public static final <T> T q3(@fh.g List<? extends T> list) {
        l0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T> boolean q4(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object A : iterable) {
            if (lVar.A(A).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @fh.g
    public static final <T> Set<T> q5(@fh.g Iterable<? extends T> iterable, @fh.g Iterable<? extends T> iterable2) {
        l0.p(iterable, "<this>");
        l0.p(iterable2, "other");
        Set<T> U5 = U5(iterable);
        b0.F0(U5, iterable2);
        return U5;
    }

    public static final <T> boolean r1(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object A : iterable) {
            if (!lVar.A(A).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @f
    public static final <T> T r2(Iterable<? extends T> iterable, l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        for (T next : iterable) {
            if (lVar.A(next).booleanValue()) {
                return next;
            }
        }
        return null;
    }

    @h
    public static final <T> T r3(@fh.g List<? extends T> list, @fh.g l<? super T, Boolean> lVar) {
        l0.p(list, "<this>");
        l0.p(lVar, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (lVar.A(previous).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    @fh.g
    @h1(version = "1.1")
    public static final <T, C extends Iterable<? extends T>> C r4(@fh.g C c10, @fh.g l<? super T, u2> lVar) {
        l0.p(c10, "<this>");
        l0.p(lVar, "action");
        for (Object A : c10) {
            lVar.A(A);
        }
        return c10;
    }

    @zd.l(warningSince = "1.5")
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> int r5(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, Integer> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (Object A : iterable) {
            i10 += lVar.A(A).intValue();
        }
        return i10;
    }

    public static final <T> boolean s1(@fh.g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    @f
    public static final <T> T s2(Iterable<? extends T> iterable, l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        T t10 = null;
        for (T next : iterable) {
            if (lVar.A(next).booleanValue()) {
                t10 = next;
            }
        }
        return t10;
    }

    @fh.g
    public static final <T, R> List<R> s3(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(x.Y(iterable, 10));
        for (Object A : iterable) {
            arrayList.add(lVar.A(A));
        }
        return arrayList;
    }

    @fh.g
    @h1(version = "1.4")
    public static final <T, C extends Iterable<? extends T>> C s4(@fh.g C c10, @fh.g p<? super Integer, ? super T, u2> pVar) {
        l0.p(c10, "<this>");
        l0.p(pVar, "action");
        int i10 = 0;
        for (Object next : c10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            pVar.g0(Integer.valueOf(i10), next);
            i10 = i11;
        }
        return c10;
    }

    @zd.l(warningSince = "1.5")
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> double s5(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, Double> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (Object A : iterable) {
            d10 += lVar.A(A).doubleValue();
        }
        return d10;
    }

    public static final <T> boolean t1(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (Object A : iterable) {
            if (lVar.A(A).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @f
    public static final <T> T t2(List<? extends T> list, l<? super T, Boolean> lVar) {
        l0.p(list, "<this>");
        l0.p(lVar, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (lVar.A(previous).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    @fh.g
    public static final <T, R> List<R> t3(@fh.g Iterable<? extends T> iterable, @fh.g p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(iterable, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(x.Y(iterable, 10));
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            arrayList.add(pVar.g0(Integer.valueOf(i10), next));
            i10 = i11;
        }
        return arrayList;
    }

    @fh.g
    public static final <T> u0<List<T>, List<T>> t4(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : iterable) {
            if (lVar.A(next).booleanValue()) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        return new u0<>(arrayList, arrayList2);
    }

    @ve.h(name = "sumOfByte")
    public static final int t5(@fh.g Iterable<Byte> iterable) {
        l0.p(iterable, "<this>");
        int i10 = 0;
        for (Byte byteValue : iterable) {
            i10 += byteValue.byteValue();
        }
        return i10;
    }

    @f
    public static final <T> Iterable<T> u1(Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        return iterable;
    }

    public static final <T> T u2(@fh.g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return w2((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @fh.g
    public static final <T, R> List<R> u3(@fh.g Iterable<? extends T> iterable, @fh.g p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(iterable, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            Object g02 = pVar.g0(Integer.valueOf(i10), next);
            if (g02 != null) {
                arrayList.add(g02);
            }
            i10 = i11;
        }
        return arrayList;
    }

    @fh.g
    public static final <T> List<T> u4(@fh.g Iterable<? extends T> iterable, @fh.g m<? extends T> mVar) {
        l0.p(iterable, "<this>");
        l0.p(mVar, "elements");
        ArrayList arrayList = new ArrayList();
        b0.o0(arrayList, iterable);
        b0.n0(arrayList, mVar);
        return arrayList;
    }

    @ve.h(name = "sumOfDouble")
    public static final double u5(@fh.g Iterable<Double> iterable) {
        l0.p(iterable, "<this>");
        double d10 = 0.0d;
        for (Double doubleValue : iterable) {
            d10 += doubleValue.doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final <T> m<T> v1(@fh.g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        return new a(iterable);
    }

    public static final <T> T v2(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, Boolean> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "predicate");
        for (T next : iterable) {
            if (lVar.A(next).booleanValue()) {
                return next;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @fh.g
    public static final <T, R, C extends Collection<? super R>> C v3(@fh.g Iterable<? extends T> iterable, @fh.g C c10, @fh.g p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(iterable, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            Object g02 = pVar.g0(Integer.valueOf(i10), next);
            if (g02 != null) {
                c10.add(g02);
            }
            i10 = i11;
        }
        return c10;
    }

    @fh.g
    public static final <T> List<T> v4(@fh.g Iterable<? extends T> iterable, @fh.g Iterable<? extends T> iterable2) {
        l0.p(iterable, "<this>");
        l0.p(iterable2, "elements");
        if (iterable instanceof Collection) {
            return z4((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        b0.o0(arrayList, iterable);
        b0.o0(arrayList, iterable2);
        return arrayList;
    }

    @h1(version = "1.4")
    @f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final <T> double v5(Iterable<? extends T> iterable, l<? super T, Double> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (Object A : iterable) {
            d10 += lVar.A(A).doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final <T, K, V> Map<K, V> w1(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.u(z0.j(x.Y(iterable, 10)), 16));
        for (Object A : iterable) {
            u0 u0Var = (u0) lVar.A(A);
            linkedHashMap.put(u0Var.e(), u0Var.f());
        }
        return linkedHashMap;
    }

    public static final <T> T w2(@fh.g List<? extends T> list) {
        l0.p(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @fh.g
    public static final <T, R, C extends Collection<? super R>> C w3(@fh.g Iterable<? extends T> iterable, @fh.g C c10, @fh.g p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(iterable, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            c10.add(pVar.g0(Integer.valueOf(i10), next));
            i10 = i11;
        }
        return c10;
    }

    @fh.g
    public static final <T> List<T> w4(@fh.g Iterable<? extends T> iterable, T t10) {
        l0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return A4((Collection) iterable, t10);
        }
        ArrayList arrayList = new ArrayList();
        b0.o0(arrayList, iterable);
        arrayList.add(t10);
        return arrayList;
    }

    @ve.h(name = "sumOfFloat")
    public static final float w5(@fh.g Iterable<Float> iterable) {
        l0.p(iterable, "<this>");
        float f10 = 0.0f;
        for (Float floatValue : iterable) {
            f10 += floatValue.floatValue();
        }
        return f10;
    }

    @fh.g
    public static final <T, K> Map<K, T> x1(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, ? extends K> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.u(z0.j(x.Y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(lVar.A(next), next);
        }
        return linkedHashMap;
    }

    @h1(version = "1.5")
    @f
    public static final <T, R> R x2(Iterable<? extends T> iterable, l<? super T, ? extends R> lVar) {
        R r10;
        l0.p(iterable, "<this>");
        l0.p(lVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                r10 = null;
                break;
            }
            r10 = lVar.A(it.next());
            if (r10 != null) {
                break;
            }
        }
        if (r10 != null) {
            return r10;
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    @fh.g
    public static final <T, R> List<R> x3(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Object A : iterable) {
            Object A2 = lVar.A(A);
            if (A2 != null) {
                arrayList.add(A2);
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <T> List<T> x4(@fh.g Iterable<? extends T> iterable, @fh.g T[] tArr) {
        l0.p(iterable, "<this>");
        l0.p(tArr, "elements");
        if (iterable instanceof Collection) {
            return B4((Collection) iterable, tArr);
        }
        ArrayList arrayList = new ArrayList();
        b0.o0(arrayList, iterable);
        b0.p0(arrayList, tArr);
        return arrayList;
    }

    @ve.h(name = "sumOfInt")
    public static final int x5(@fh.g Iterable<Integer> iterable) {
        l0.p(iterable, "<this>");
        int i10 = 0;
        for (Integer intValue : iterable) {
            i10 += intValue.intValue();
        }
        return i10;
    }

    @fh.g
    public static final <T, K, V> Map<K, V> y1(@fh.g Iterable<? extends T> iterable, @fh.g l<? super T, ? extends K> lVar, @fh.g l<? super T, ? extends V> lVar2) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.u(z0.j(x.Y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(lVar.A(next), lVar2.A(next));
        }
        return linkedHashMap;
    }

    @h1(version = "1.5")
    @f
    public static final <T, R> R y2(Iterable<? extends T> iterable, l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "transform");
        for (Object A : iterable) {
            R A2 = lVar.A(A);
            if (A2 != null) {
                return A2;
            }
        }
        return null;
    }

    @fh.g
    public static final <T, R, C extends Collection<? super R>> C y3(@fh.g Iterable<? extends T> iterable, @fh.g C c10, @fh.g l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (Object A : iterable) {
            Object A2 = lVar.A(A);
            if (A2 != null) {
                c10.add(A2);
            }
        }
        return c10;
    }

    @fh.g
    public static final <T> List<T> y4(@fh.g Collection<? extends T> collection, @fh.g m<? extends T> mVar) {
        l0.p(collection, "<this>");
        l0.p(mVar, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        b0.n0(arrayList, mVar);
        return arrayList;
    }

    @h1(version = "1.4")
    @f
    @t0
    @ve.h(name = "sumOfInt")
    public static final <T> int y5(Iterable<? extends T> iterable, l<? super T, Integer> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (Object A : iterable) {
            i10 += lVar.A(A).intValue();
        }
        return i10;
    }

    @fh.g
    public static final <T, K, M extends Map<? super K, ? super T>> M z1(@fh.g Iterable<? extends T> iterable, @fh.g M m10, @fh.g l<? super T, ? extends K> lVar) {
        l0.p(iterable, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (Object next : iterable) {
            m10.put(lVar.A(next), next);
        }
        return m10;
    }

    @h
    public static final <T> T z2(@fh.g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    @fh.g
    public static final <T, R, C extends Collection<? super R>> C z3(@fh.g Iterable<? extends T> iterable, @fh.g C c10, @fh.g l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (Object A : iterable) {
            c10.add(lVar.A(A));
        }
        return c10;
    }

    @fh.g
    public static final <T> List<T> z4(@fh.g Collection<? extends T> collection, @fh.g Iterable<? extends T> iterable) {
        l0.p(collection, "<this>");
        l0.p(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        b0.o0(arrayList2, iterable);
        return arrayList2;
    }

    @ve.h(name = "sumOfLong")
    public static final long z5(@fh.g Iterable<Long> iterable) {
        l0.p(iterable, "<this>");
        long j10 = 0;
        for (Long longValue : iterable) {
            j10 += longValue.longValue();
        }
        return j10;
    }
}

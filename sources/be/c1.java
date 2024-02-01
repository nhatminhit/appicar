package be;

import fh.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import oe.e;
import oe.f;
import p000if.m;
import ve.h;
import we.l;
import we.p;
import xe.l0;
import zd.h1;
import zd.t0;
import zd.u0;
import zd.u2;

public class c1 extends b1 {
    @h1(version = "1.4")
    @f
    @t0
    public static final <K, V> Float A1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = lVar.A(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <K, V, R> R B1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
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

    @h1(version = "1.4")
    @f
    @t0
    public static final <K, V, R> R C1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
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

    @h1(version = "1.4")
    @f
    public static final <K, V> Map.Entry<K, V> D1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        l0.p(map, "<this>");
        l0.p(comparator, "comparator");
        return (Map.Entry) e0.i4(map.entrySet(), comparator);
    }

    @h1(version = "1.7")
    @f
    @h(name = "minWithOrThrow")
    public static final <K, V> Map.Entry<K, V> E1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        l0.p(map, "<this>");
        l0.p(comparator, "comparator");
        return (Map.Entry) e0.j4(map.entrySet(), comparator);
    }

    public static final <K, V> boolean F1(@g Map<? extends K, ? extends V> map) {
        l0.p(map, "<this>");
        return map.isEmpty();
    }

    public static final <K, V> boolean G1(@g Map<? extends K, ? extends V> map, @g l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry<? extends K, ? extends V> A : map.entrySet()) {
            if (lVar.A(A).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @g
    @h1(version = "1.1")
    public static final <K, V, M extends Map<? extends K, ? extends V>> M H1(@g M m10, @g l<? super Map.Entry<? extends K, ? extends V>, u2> lVar) {
        l0.p(m10, "<this>");
        l0.p(lVar, "action");
        for (Map.Entry A : m10.entrySet()) {
            lVar.A(A);
        }
        return m10;
    }

    @g
    @h1(version = "1.4")
    public static final <K, V, M extends Map<? extends K, ? extends V>> M I1(@g M m10, @g p<? super Integer, ? super Map.Entry<? extends K, ? extends V>, u2> pVar) {
        l0.p(m10, "<this>");
        l0.p(pVar, "action");
        int i10 = 0;
        for (Object next : m10.entrySet()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            pVar.g0(Integer.valueOf(i10), next);
            i10 = i11;
        }
        return m10;
    }

    @g
    public static final <K, V> List<u0<K, V>> J1(@g Map<? extends K, ? extends V> map) {
        l0.p(map, "<this>");
        if (map.size() == 0) {
            return w.E();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return w.E();
        }
        Map.Entry next = it.next();
        if (!it.hasNext()) {
            return v.k(new u0(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new u0(next.getKey(), next.getValue()));
        do {
            Map.Entry next2 = it.next();
            arrayList.add(new u0(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static final <K, V> boolean P0(@g Map<? extends K, ? extends V> map, @g l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry<? extends K, ? extends V> A : map.entrySet()) {
            if (!lVar.A(A).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> boolean Q0(@g Map<? extends K, ? extends V> map) {
        l0.p(map, "<this>");
        return !map.isEmpty();
    }

    public static final <K, V> boolean R0(@g Map<? extends K, ? extends V> map, @g l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry<? extends K, ? extends V> A : map.entrySet()) {
            if (lVar.A(A).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @f
    public static final <K, V> Iterable<Map.Entry<K, V>> S0(Map<? extends K, ? extends V> map) {
        l0.p(map, "<this>");
        return map.entrySet();
    }

    @g
    public static final <K, V> m<Map.Entry<K, V>> T0(@g Map<? extends K, ? extends V> map) {
        l0.p(map, "<this>");
        return e0.v1(map.entrySet());
    }

    @f
    public static final <K, V> int U0(Map<? extends K, ? extends V> map) {
        l0.p(map, "<this>");
        return map.size();
    }

    public static final <K, V> int V0(@g Map<? extends K, ? extends V> map, @g l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        if (map.isEmpty()) {
            return 0;
        }
        for (Map.Entry<? extends K, ? extends V> A : map.entrySet()) {
            if (lVar.A(A).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @h1(version = "1.5")
    @f
    public static final <K, V, R> R W0(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        R r10;
        l0.p(map, "<this>");
        l0.p(lVar, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
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
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    @h1(version = "1.5")
    @f
    public static final <K, V, R> R X0(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "transform");
        for (Map.Entry<? extends K, ? extends V> A : map.entrySet()) {
            R A2 = lVar.A(A);
            if (A2 != null) {
                return A2;
            }
        }
        return null;
    }

    @g
    public static final <K, V, R> List<R> Y0(@g Map<? extends K, ? extends V> map, @g l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> A : map.entrySet()) {
            b0.o0(arrayList, (Iterable) lVar.A(A));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @g
    @t0
    @h(name = "flatMapSequence")
    public static final <K, V, R> List<R> Z0(@g Map<? extends K, ? extends V> map, @g l<? super Map.Entry<? extends K, ? extends V>, ? extends m<? extends R>> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> A : map.entrySet()) {
            b0.n0(arrayList, (m) lVar.A(A));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @g
    @t0
    @h(name = "flatMapSequenceTo")
    public static final <K, V, R, C extends Collection<? super R>> C a1(@g Map<? extends K, ? extends V> map, @g C c10, @g l<? super Map.Entry<? extends K, ? extends V>, ? extends m<? extends R>> lVar) {
        l0.p(map, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (Map.Entry<? extends K, ? extends V> A : map.entrySet()) {
            b0.n0(c10, (m) lVar.A(A));
        }
        return c10;
    }

    @g
    public static final <K, V, R, C extends Collection<? super R>> C b1(@g Map<? extends K, ? extends V> map, @g C c10, @g l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> lVar) {
        l0.p(map, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (Map.Entry<? extends K, ? extends V> A : map.entrySet()) {
            b0.o0(c10, (Iterable) lVar.A(A));
        }
        return c10;
    }

    @e
    public static final <K, V> void c1(@g Map<? extends K, ? extends V> map, @g l<? super Map.Entry<? extends K, ? extends V>, u2> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "action");
        for (Map.Entry<? extends K, ? extends V> A : map.entrySet()) {
            lVar.A(A);
        }
    }

    @g
    public static final <K, V, R> List<R> d1(@g Map<? extends K, ? extends V> map, @g l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<? extends K, ? extends V> A : map.entrySet()) {
            arrayList.add(lVar.A(A));
        }
        return arrayList;
    }

    @g
    public static final <K, V, R> List<R> e1(@g Map<? extends K, ? extends V> map, @g l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> A : map.entrySet()) {
            Object A2 = lVar.A(A);
            if (A2 != null) {
                arrayList.add(A2);
            }
        }
        return arrayList;
    }

    @g
    public static final <K, V, R, C extends Collection<? super R>> C f1(@g Map<? extends K, ? extends V> map, @g C c10, @g l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (Map.Entry<? extends K, ? extends V> A : map.entrySet()) {
            Object A2 = lVar.A(A);
            if (A2 != null) {
                c10.add(A2);
            }
        }
        return c10;
    }

    @g
    public static final <K, V, R, C extends Collection<? super R>> C g1(@g Map<? extends K, ? extends V> map, @g C c10, @g l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (Map.Entry<? extends K, ? extends V> A : map.entrySet()) {
            c10.add(lVar.A(A));
        }
        return c10;
    }

    @h1(version = "1.4")
    @f
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> h1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        T t10;
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            t10 = null;
        } else {
            T next = it.next();
            if (!it.hasNext()) {
                t10 = next;
            } else {
                Comparable comparable = (Comparable) lVar.A(next);
                do {
                    T next2 = it.next();
                    Comparable comparable2 = (Comparable) lVar.A(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
            t10 = next;
        }
        return (Map.Entry) t10;
    }

    @h1(version = "1.7")
    @f
    @h(name = "maxByOrThrow")
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> i1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) lVar.A(next);
                do {
                    T next2 = it.next();
                    Comparable comparable2 = (Comparable) lVar.A(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
            return (Map.Entry) next;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <K, V> double j1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.A(it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <K, V> float k1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = lVar.A(it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <K, V, R extends Comparable<? super R>> R l1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
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

    @h1(version = "1.4")
    @f
    @t0
    public static final <K, V, R extends Comparable<? super R>> R m1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
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

    @h1(version = "1.4")
    @f
    @t0
    public static final <K, V> Double n1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
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
    @f
    @t0
    public static final <K, V> Float o1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
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
    @f
    @t0
    public static final <K, V, R> R p1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
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

    @h1(version = "1.4")
    @f
    @t0
    public static final <K, V, R> R q1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
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

    @h1(version = "1.4")
    @f
    public static final <K, V> Map.Entry<K, V> r1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        l0.p(map, "<this>");
        l0.p(comparator, "comparator");
        return (Map.Entry) e0.Q3(map.entrySet(), comparator);
    }

    @h1(version = "1.7")
    @f
    @h(name = "maxWithOrThrow")
    public static final <K, V> Map.Entry<K, V> s1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        l0.p(map, "<this>");
        l0.p(comparator, "comparator");
        return (Map.Entry) e0.R3(map.entrySet(), comparator);
    }

    @h1(version = "1.4")
    @f
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> t1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        T t10;
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            t10 = null;
        } else {
            T next = it.next();
            if (!it.hasNext()) {
                t10 = next;
            } else {
                Comparable comparable = (Comparable) lVar.A(next);
                do {
                    T next2 = it.next();
                    Comparable comparable2 = (Comparable) lVar.A(next2);
                    if (comparable.compareTo(comparable2) > 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
            t10 = next;
        }
        return (Map.Entry) t10;
    }

    @h1(version = "1.7")
    @f
    @h(name = "minByOrThrow")
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> u1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) lVar.A(next);
                do {
                    T next2 = it.next();
                    Comparable comparable2 = (Comparable) lVar.A(next2);
                    if (comparable.compareTo(comparable2) > 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
            return (Map.Entry) next;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <K, V> double v1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.A(it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <K, V> float w1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = lVar.A(it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @f
    @t0
    public static final <K, V, R extends Comparable<? super R>> R x1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
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

    @h1(version = "1.4")
    @f
    @t0
    public static final <K, V, R extends Comparable<? super R>> R y1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
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

    @h1(version = "1.4")
    @f
    @t0
    public static final <K, V> Double z1(Map<? extends K, ? extends V> map, l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = lVar.A(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }
}

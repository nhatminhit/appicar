package be;

import fh.g;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import oe.f;
import ve.h;
import xe.l0;
import zd.b1;
import zd.h1;
import zd.k;
import zd.l;
import zd.t0;

public class d0 extends c0 {
    @g
    public static final <R> List<R> a1(@g Iterable<?> iterable, @g Class<R> cls) {
        l0.p(iterable, "<this>");
        l0.p(cls, "klass");
        return (List) b1(iterable, new ArrayList(), cls);
    }

    @g
    public static final <C extends Collection<? super R>, R> C b1(@g Iterable<?> iterable, @g C c10, @g Class<R> cls) {
        l0.p(iterable, "<this>");
        l0.p(c10, "destination");
        l0.p(cls, "klass");
        for (Object next : iterable) {
            if (cls.isInstance(next)) {
                c10.add(next);
            }
        }
        return c10;
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T f1(Iterable<? extends T> iterable, we.l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
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
        return next;
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object g1(Iterable iterable, Comparator comparator) {
        l0.p(iterable, "<this>");
        l0.p(comparator, "comparator");
        return e0.Q3(iterable, comparator);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T k1(Iterable<? extends T> iterable, we.l<? super T, ? extends R> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
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
        return next;
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object l1(Iterable iterable, Comparator comparator) {
        l0.p(iterable, "<this>");
        l0.p(comparator, "comparator");
        return e0.i4(iterable, comparator);
    }

    public static final <T> void m1(@g List<T> list) {
        l0.p(list, "<this>");
        Collections.reverse(list);
    }

    @h1(version = "1.4")
    @f
    @t0
    @h(name = "sumOfBigDecimal")
    public static final <T> BigDecimal n1(Iterable<? extends T> iterable, we.l<? super T, ? extends BigDecimal> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (Object A : iterable) {
            valueOf = valueOf.add((BigDecimal) lVar.A(A));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.4")
    @f
    @t0
    @h(name = "sumOfBigInteger")
    public static final <T> BigInteger o1(Iterable<? extends T> iterable, we.l<? super T, ? extends BigInteger> lVar) {
        l0.p(iterable, "<this>");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (Object A : iterable) {
            valueOf = valueOf.add((BigInteger) lVar.A(A));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @g
    public static final <T extends Comparable<? super T>> SortedSet<T> p1(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        return (SortedSet) e0.L5(iterable, new TreeSet());
    }

    @g
    public static final <T> SortedSet<T> q1(@g Iterable<? extends T> iterable, @g Comparator<? super T> comparator) {
        l0.p(iterable, "<this>");
        l0.p(comparator, "comparator");
        return (SortedSet) e0.L5(iterable, new TreeSet(comparator));
    }
}

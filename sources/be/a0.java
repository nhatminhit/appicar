package be;

import fh.g;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import oe.f;
import we.p;
import xe.l0;
import xe.w;
import zd.b1;
import zd.h1;
import zd.k;
import zd.k0;
import zd.m;

public class a0 extends z {
    @h1(version = "1.2")
    @f
    public static final <T> void g0(List<T> list, T t10) {
        l0.p(list, "<this>");
        Collections.fill(list, t10);
    }

    @h1(version = "1.2")
    @f
    public static final <T> void h0(List<T> list) {
        l0.p(list, "<this>");
        Collections.shuffle(list);
    }

    @h1(version = "1.2")
    @f
    public static final <T> void i0(List<T> list, Random random) {
        l0.p(list, "<this>");
        l0.p(random, "random");
        Collections.shuffle(list, random);
    }

    public static final <T extends Comparable<? super T>> void j0(@g List<T> list) {
        l0.p(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @f
    @k(level = m.P, message = "Use sortWith(comparator) instead.", replaceWith = @b1(expression = "this.sortWith(comparator)", imports = {}))
    public static final <T> void k0(List<T> list, Comparator<? super T> comparator) {
        l0.p(list, "<this>");
        l0.p(comparator, "comparator");
        throw new k0((String) null, 1, (w) null);
    }

    @f
    @k(level = m.P, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @b1(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    public static final <T> void l0(List<T> list, p<? super T, ? super T, Integer> pVar) {
        l0.p(list, "<this>");
        l0.p(pVar, "comparison");
        throw new k0((String) null, 1, (w) null);
    }

    public static final <T> void m0(@g List<T> list, @g Comparator<? super T> comparator) {
        l0.p(list, "<this>");
        l0.p(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

package be;

import ce.b;
import fh.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import oe.f;
import oe.m;
import we.l;
import xe.l0;
import zd.a1;
import zd.h1;
import zd.u2;

public class v {
    @h1(version = "1.3")
    @a1
    @g
    public static final <E> List<E> a(@g List<E> list) {
        l0.p(list, "builder");
        return ((b) list).n();
    }

    @h1(version = "1.3")
    @a1
    @f
    public static final <E> List<E> b(int i10, l<? super List<E>, u2> lVar) {
        l0.p(lVar, "builderAction");
        List j10 = j(i10);
        lVar.A(j10);
        return a(j10);
    }

    @h1(version = "1.3")
    @a1
    @f
    public static final <E> List<E> c(l<? super List<E>, u2> lVar) {
        l0.p(lVar, "builderAction");
        List i10 = i();
        lVar.A(i10);
        return a(i10);
    }

    @h1(version = "1.3")
    @f
    @a1
    public static final int d(int i10) {
        if (i10 < 0) {
            if (m.a(1, 3, 0)) {
                w.V();
            } else {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i10;
    }

    @h1(version = "1.3")
    @f
    @a1
    public static final int e(int i10) {
        if (i10 < 0) {
            if (m.a(1, 3, 0)) {
                w.W();
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        return i10;
    }

    @f
    public static final Object[] f(Collection<?> collection) {
        l0.p(collection, "collection");
        return xe.v.a(collection);
    }

    @f
    public static final <T> T[] g(Collection<?> collection, T[] tArr) {
        l0.p(collection, "collection");
        l0.p(tArr, "array");
        return xe.v.b(collection, tArr);
    }

    @g
    public static final <T> Object[] h(@g T[] tArr, boolean z10) {
        Class<Object[]> cls = Object[].class;
        l0.p(tArr, "<this>");
        if (z10 && l0.g(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        l0.o(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    @h1(version = "1.3")
    @a1
    @g
    public static final <E> List<E> i() {
        return new b();
    }

    @h1(version = "1.3")
    @a1
    @g
    public static final <E> List<E> j(int i10) {
        return new b(i10);
    }

    @g
    public static final <T> List<T> k(T t10) {
        List<T> singletonList = Collections.singletonList(t10);
        l0.o(singletonList, "singletonList(element)");
        return singletonList;
    }

    @g
    @h1(version = "1.2")
    public static final <T> List<T> l(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        List<T> S5 = e0.S5(iterable);
        Collections.shuffle(S5);
        return S5;
    }

    @g
    @h1(version = "1.2")
    public static final <T> List<T> m(@g Iterable<? extends T> iterable, @g Random random) {
        l0.p(iterable, "<this>");
        l0.p(random, "random");
        List<T> S5 = e0.S5(iterable);
        Collections.shuffle(S5, random);
        return S5;
    }

    @f
    public static final <T> List<T> n(Enumeration<T> enumeration) {
        l0.p(enumeration, "<this>");
        ArrayList<T> list = Collections.list(enumeration);
        l0.o(list, "list(this)");
        return list;
    }
}

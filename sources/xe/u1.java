package xe;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import we.a;
import we.b;
import we.c;
import we.d;
import we.e;
import we.f;
import we.g;
import we.h;
import we.i;
import we.j;
import we.k;
import we.l;
import we.m;
import we.n;
import we.o;
import we.p;
import we.q;
import we.r;
import we.s;
import we.t;
import we.u;
import we.v;
import we.w;
import ye.g;

public class u1 {
    public static int A(Object obj) {
        if (obj instanceof e0) {
            return ((e0) obj).g();
        }
        if (obj instanceof a) {
            return 0;
        }
        if (obj instanceof l) {
            return 1;
        }
        if (obj instanceof p) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        if (obj instanceof s) {
            return 5;
        }
        if (obj instanceof t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof b) {
            return 10;
        }
        if (obj instanceof c) {
            return 11;
        }
        if (obj instanceof d) {
            return 12;
        }
        if (obj instanceof e) {
            return 13;
        }
        if (obj instanceof f) {
            return 14;
        }
        if (obj instanceof g) {
            return 15;
        }
        if (obj instanceof h) {
            return 16;
        }
        if (obj instanceof i) {
            return 17;
        }
        if (obj instanceof j) {
            return 18;
        }
        if (obj instanceof k) {
            return 19;
        }
        if (obj instanceof m) {
            return 20;
        }
        if (obj instanceof n) {
            return 21;
        }
        return obj instanceof o ? 22 : -1;
    }

    public static boolean B(Object obj, int i10) {
        return (obj instanceof zd.v) && A(obj) == i10;
    }

    public static boolean C(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof ye.a) || (obj instanceof ye.b));
    }

    public static boolean D(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof ye.a) || (obj instanceof ye.c));
    }

    public static boolean E(Object obj) {
        return (obj instanceof Iterator) && (!(obj instanceof ye.a) || (obj instanceof ye.d));
    }

    public static boolean F(Object obj) {
        return (obj instanceof List) && (!(obj instanceof ye.a) || (obj instanceof ye.e));
    }

    public static boolean G(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof ye.a) || (obj instanceof ye.f));
    }

    public static boolean H(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof ye.a) || (obj instanceof ye.g));
    }

    public static boolean I(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof ye.a) || (obj instanceof g.a));
    }

    public static boolean J(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof ye.a) || (obj instanceof ye.h));
    }

    public static <T extends Throwable> T K(T t10) {
        return l0.B(t10, u1.class.getName());
    }

    public static ClassCastException L(ClassCastException classCastException) {
        throw ((ClassCastException) K(classCastException));
    }

    public static void M(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        N(name + " cannot be cast to " + str);
    }

    public static void N(String str) {
        throw L(new ClassCastException(str));
    }

    public static Collection a(Object obj) {
        if ((obj instanceof ye.a) && !(obj instanceof ye.b)) {
            M(obj, "kotlin.collections.MutableCollection");
        }
        return s(obj);
    }

    public static Collection b(Object obj, String str) {
        if ((obj instanceof ye.a) && !(obj instanceof ye.b)) {
            N(str);
        }
        return s(obj);
    }

    public static Iterable c(Object obj) {
        if ((obj instanceof ye.a) && !(obj instanceof ye.c)) {
            M(obj, "kotlin.collections.MutableIterable");
        }
        return t(obj);
    }

    public static Iterable d(Object obj, String str) {
        if ((obj instanceof ye.a) && !(obj instanceof ye.c)) {
            N(str);
        }
        return t(obj);
    }

    public static Iterator e(Object obj) {
        if ((obj instanceof ye.a) && !(obj instanceof ye.d)) {
            M(obj, "kotlin.collections.MutableIterator");
        }
        return u(obj);
    }

    public static Iterator f(Object obj, String str) {
        if ((obj instanceof ye.a) && !(obj instanceof ye.d)) {
            N(str);
        }
        return u(obj);
    }

    public static List g(Object obj) {
        if ((obj instanceof ye.a) && !(obj instanceof ye.e)) {
            M(obj, "kotlin.collections.MutableList");
        }
        return v(obj);
    }

    public static List h(Object obj, String str) {
        if ((obj instanceof ye.a) && !(obj instanceof ye.e)) {
            N(str);
        }
        return v(obj);
    }

    public static ListIterator i(Object obj) {
        if ((obj instanceof ye.a) && !(obj instanceof ye.f)) {
            M(obj, "kotlin.collections.MutableListIterator");
        }
        return w(obj);
    }

    public static ListIterator j(Object obj, String str) {
        if ((obj instanceof ye.a) && !(obj instanceof ye.f)) {
            N(str);
        }
        return w(obj);
    }

    public static Map k(Object obj) {
        if ((obj instanceof ye.a) && !(obj instanceof ye.g)) {
            M(obj, "kotlin.collections.MutableMap");
        }
        return x(obj);
    }

    public static Map l(Object obj, String str) {
        if ((obj instanceof ye.a) && !(obj instanceof ye.g)) {
            N(str);
        }
        return x(obj);
    }

    public static Map.Entry m(Object obj) {
        if ((obj instanceof ye.a) && !(obj instanceof g.a)) {
            M(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return y(obj);
    }

    public static Map.Entry n(Object obj, String str) {
        if ((obj instanceof ye.a) && !(obj instanceof g.a)) {
            N(str);
        }
        return y(obj);
    }

    public static Set o(Object obj) {
        if ((obj instanceof ye.a) && !(obj instanceof ye.h)) {
            M(obj, "kotlin.collections.MutableSet");
        }
        return z(obj);
    }

    public static Set p(Object obj, String str) {
        if ((obj instanceof ye.a) && !(obj instanceof ye.h)) {
            N(str);
        }
        return z(obj);
    }

    public static Object q(Object obj, int i10) {
        if (obj != null && !B(obj, i10)) {
            M(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Object r(Object obj, int i10, String str) {
        if (obj != null && !B(obj, i10)) {
            N(str);
        }
        return obj;
    }

    public static Collection s(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }

    public static Iterable t(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }

    public static Iterator u(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }

    public static List v(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }

    public static ListIterator w(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }

    public static Map x(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }

    public static Map.Entry y(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }

    public static Set z(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }
}

package zd;

import fh.g;
import fh.h;
import java.io.Serializable;
import ve.e;
import ve.f;
import xe.l0;
import xe.w;

@f
@h1(version = "1.3")
public final class d1<T> implements Serializable {
    @g
    public static final a P = new a((w) null);
    @h
    public final Object O;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @oe.f
        @ve.h(name = "failure")
        public final <T> Object a(Throwable th2) {
            l0.p(th2, "exception");
            return d1.b(e1.a(th2));
        }

        @oe.f
        @ve.h(name = "success")
        public final <T> Object b(T t10) {
            return d1.b(t10);
        }
    }

    public static final class b implements Serializable {
        @g
        @e
        public final Throwable O;

        public b(@g Throwable th2) {
            l0.p(th2, "exception");
            this.O = th2;
        }

        public boolean equals(@h Object obj) {
            return (obj instanceof b) && l0.g(this.O, ((b) obj).O);
        }

        public int hashCode() {
            return this.O.hashCode();
        }

        @g
        public String toString() {
            return "Failure(" + this.O + ')';
        }
    }

    @a1
    public /* synthetic */ d1(Object obj) {
        this.O = obj;
    }

    public static final /* synthetic */ d1 a(Object obj) {
        return new d1(obj);
    }

    @g
    @a1
    public static <T> Object b(@h Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof d1) && l0.g(obj, ((d1) obj2).l());
    }

    public static final boolean d(Object obj, Object obj2) {
        return l0.g(obj, obj2);
    }

    @h
    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).O;
        }
        return null;
    }

    @oe.f
    public static final T f(Object obj) {
        if (i(obj)) {
            return null;
        }
        return obj;
    }

    @a1
    public static /* synthetic */ void g() {
    }

    public static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean i(Object obj) {
        return obj instanceof b;
    }

    public static final boolean j(Object obj) {
        return !(obj instanceof b);
    }

    @g
    public static String k(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.O, obj);
    }

    public int hashCode() {
        return h(this.O);
    }

    public final /* synthetic */ Object l() {
        return this.O;
    }

    @g
    public String toString() {
        return k(this.O);
    }
}

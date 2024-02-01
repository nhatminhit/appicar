package i5;

import a6.h;
import a6.j;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;
import k5.g;
import k5.i;
import q5.a;
import q5.z;
import u5.d;
import v4.l0;
import v4.n;
import v4.n0;

public abstract class e {
    public static final int O = 500;

    public <T> T A(Class<?> cls, String str) throws l {
        return z(l(cls), str);
    }

    public j B(j jVar, String str, d dVar) throws l {
        Object g10;
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            return e(jVar, str, dVar, indexOf);
        }
        i<?> q10 = q();
        d.b b10 = dVar.b(q10, jVar, str);
        if (b10 == d.b.DENIED) {
            g10 = h(jVar, str, dVar);
        } else {
            try {
                Class<?> d02 = u().d0(str);
                if (!jVar.Z(d02)) {
                    g10 = f(jVar, str);
                } else {
                    j V = q10.M().V(jVar, d02);
                    if (b10 != d.b.INDETERMINATE || dVar.c(q10, jVar, V) == d.b.ALLOWED) {
                        return V;
                    }
                    g10 = g(jVar, str, dVar);
                }
            } catch (ClassNotFoundException unused) {
                return null;
            } catch (Exception e10) {
                throw v(jVar, str, String.format("problem: (%s) %s", new Object[]{e10.getClass().getName(), h.o(e10)}));
            }
        }
        return (j) g10;
    }

    public j C(j jVar, String str) throws l {
        if (str.indexOf(60) > 0) {
            j E = u().E(str);
            if (E.Y(jVar.g())) {
                return E;
            }
        } else {
            try {
                Class<?> d02 = u().d0(str);
                if (jVar.Z(d02)) {
                    return u().V(jVar, d02);
                }
            } catch (ClassNotFoundException unused) {
                return null;
            } catch (Exception e10) {
                throw v(jVar, str, String.format("problem: (%s) %s", new Object[]{e10.getClass().getName(), h.o(e10)}));
            }
        }
        throw v(jVar, str, "Not a subtype");
    }

    public abstract e D(Object obj, Object obj2);

    public String a(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + ": " + str2;
    }

    public String b(String str) {
        return str == null ? "[N/A]" : i(str);
    }

    public final String c(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    public String d(String str) {
        if (str == null) {
            return "[N/A]";
        }
        return String.format("\"%s\"", new Object[]{i(str)});
    }

    public final j e(j jVar, String str, d dVar, int i10) throws l {
        Object g10;
        i<?> q10 = q();
        d.b b10 = dVar.b(q10, jVar, str.substring(0, i10));
        if (b10 == d.b.DENIED) {
            g10 = h(jVar, str, dVar);
        } else {
            j E = u().E(str);
            if (!E.Y(jVar.g())) {
                g10 = f(jVar, str);
            } else {
                d.b bVar = d.b.ALLOWED;
                if (b10 == bVar || dVar.c(q10, jVar, E) == bVar) {
                    return E;
                }
                g10 = g(jVar, str, dVar);
            }
        }
        return (j) g10;
    }

    public <T> T f(j jVar, String str) throws l {
        throw v(jVar, str, "Not a subtype");
    }

    public <T> T g(j jVar, String str, d dVar) throws l {
        throw v(jVar, str, "Configured `PolymorphicTypeValidator` (of type " + h.h(dVar) + ") denied resolution");
    }

    public <T> T h(j jVar, String str, d dVar) throws l {
        throw v(jVar, str, "Configured `PolymorphicTypeValidator` (of type " + h.h(dVar) + ") denied resolution");
    }

    public final String i(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 500) {
            return str;
        }
        return str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
    }

    public abstract boolean j();

    public abstract j k(j jVar, Class<?> cls);

    public j l(Type type) {
        if (type == null) {
            return null;
        }
        return u().Y(type);
    }

    public j<Object, Object> m(a aVar, Object obj) throws l {
        j<?, ?> jVar = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj instanceof Class) {
            Class<j.a> cls = (Class) obj;
            if (cls == j.a.class || h.R(cls)) {
                return null;
            }
            if (j.class.isAssignableFrom(cls)) {
                i<?> q10 = q();
                g G = q10.G();
                if (G != null) {
                    jVar = G.a(q10, aVar, cls);
                }
                return jVar == null ? (j) h.l(cls, q10.c()) : jVar;
            }
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
        }
        throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
    }

    public abstract Class<?> n();

    public abstract b o();

    public abstract Object p(Object obj);

    public abstract i<?> q();

    public abstract n.d r(Class<?> cls);

    public abstract Locale s();

    public abstract TimeZone t();

    public abstract z5.n u();

    public abstract l v(j jVar, String str, String str2);

    public abstract boolean w(q qVar);

    public l0<?> x(a aVar, z zVar) throws l {
        Class<? extends l0<?>> c10 = zVar.c();
        i<?> q10 = q();
        g G = q10.G();
        l0<?> f10 = G == null ? null : G.f(q10, aVar, c10);
        if (f10 == null) {
            f10 = (l0) h.l(c10, q10.c());
        }
        return f10.b(zVar.f());
    }

    public n0 y(a aVar, z zVar) {
        Class<? extends n0> e10 = zVar.e();
        i<?> q10 = q();
        g G = q10.G();
        n0 g10 = G == null ? null : G.g(q10, aVar, e10);
        return g10 == null ? (n0) h.l(e10, q10.c()) : g10;
    }

    public abstract <T> T z(j jVar, String str) throws l;
}

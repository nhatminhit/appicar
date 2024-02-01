package v5;

import a6.h;
import i5.e;
import i5.g;
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;
import k5.i;
import u5.d;
import v4.f0;
import z5.l;
import z5.n;

public class j extends q {

    /* renamed from: d  reason: collision with root package name */
    public static final String f14179d = "java.util.";

    /* renamed from: c  reason: collision with root package name */
    public final d f14180c;

    @Deprecated
    public j(i5.j jVar, n nVar) {
        this(jVar, nVar, k.R);
    }

    public j(i5.j jVar, n nVar, d dVar) {
        super(jVar, nVar);
        this.f14180c = dVar;
    }

    public static j j(i5.j jVar, i<?> iVar, d dVar) {
        return new j(jVar, iVar.M(), dVar);
    }

    public String a(Object obj) {
        return h(obj, obj.getClass(), this.f14190a);
    }

    public String b() {
        return "class name used as type id";
    }

    public String c(Object obj, Class<?> cls) {
        return h(obj, cls, this.f14190a);
    }

    public f0.b f() {
        return f0.b.CLASS;
    }

    public i5.j g(e eVar, String str) throws IOException {
        return i(str, eVar);
    }

    public String h(Object obj, Class<?> cls, n nVar) {
        l J;
        boolean V = h.V(cls);
        Class<? super Object> cls2 = cls;
        if (V) {
            boolean isEnum = cls.isEnum();
            cls2 = cls;
            if (!isEnum) {
                cls2 = cls.getSuperclass();
            }
        }
        String name = cls2.getName();
        if (!name.startsWith(f14179d)) {
            return (name.indexOf(36) < 0 || h.K(cls2) == null || h.K(this.f14191b.g()) != null) ? name : this.f14191b.g().getName();
        }
        if (obj instanceof EnumSet) {
            J = nVar.D(EnumSet.class, h.u((EnumSet) obj));
        } else if (!(obj instanceof EnumMap)) {
            return name;
        } else {
            J = nVar.J(EnumMap.class, h.t((EnumMap) obj), Object.class);
        }
        return J.x();
    }

    public i5.j i(String str, e eVar) throws IOException {
        i5.j B = eVar.B(this.f14191b, str, this.f14180c);
        return (B != null || !(eVar instanceof g)) ? B : ((g) eVar).l0(this.f14191b, str, this, "no such class found");
    }

    public void k(Class<?> cls, String str) {
    }
}

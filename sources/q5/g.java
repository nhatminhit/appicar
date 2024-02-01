package q5;

import a6.h;
import i5.b;
import i5.j;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q5.d0;
import q5.t;
import z5.n;

public class g extends u {

    /* renamed from: d  reason: collision with root package name */
    public final n f11963d;

    /* renamed from: e  reason: collision with root package name */
    public final t.a f11964e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11965f;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final d0 f11966a;

        /* renamed from: b  reason: collision with root package name */
        public final Field f11967b;

        /* renamed from: c  reason: collision with root package name */
        public n f11968c = n.e();

        public a(d0 d0Var, Field field) {
            this.f11966a = d0Var;
            this.f11967b = field;
        }

        public f a() {
            return new f(this.f11966a, this.f11967b, this.f11968c.b());
        }
    }

    public g(b bVar, n nVar, t.a aVar, boolean z10) {
        super(bVar);
        this.f11963d = nVar;
        this.f11964e = bVar == null ? null : aVar;
        this.f11965f = z10;
    }

    public static List<f> m(b bVar, d0 d0Var, t.a aVar, n nVar, j jVar, boolean z10) {
        return new g(bVar, nVar, aVar, z10).l(d0Var, jVar);
    }

    public final void i(Class<?> cls, Class<?> cls2, Map<String, a> map) {
        a aVar;
        for (Class<?> declaredFields : h.x(cls, cls2, true)) {
            for (Field field : declaredFields.getDeclaredFields()) {
                if (k(field) && (aVar = map.get(field.getName())) != null) {
                    aVar.f11968c = d(aVar.f11968c, field.getDeclaredAnnotations());
                }
            }
        }
    }

    public final Map<String, a> j(d0 d0Var, j jVar, Map<String, a> map) {
        Class<?> b10;
        j Q = jVar.Q();
        if (Q == null) {
            return map;
        }
        Class<?> g10 = jVar.g();
        Map<String, a> j10 = j(new d0.a(this.f11963d, Q.F()), Q, map);
        for (Field field : g10.getDeclaredFields()) {
            if (k(field)) {
                if (j10 == null) {
                    j10 = new LinkedHashMap<>();
                }
                a aVar = new a(d0Var, field);
                if (this.f11965f) {
                    aVar.f11968c = d(aVar.f11968c, field.getDeclaredAnnotations());
                }
                j10.put(field.getName(), aVar);
            }
        }
        t.a aVar2 = this.f11964e;
        if (!(aVar2 == null || (b10 = aVar2.b(g10)) == null)) {
            i(b10, g10, j10);
        }
        return j10;
    }

    public final boolean k(Field field) {
        return !field.isSynthetic() && !Modifier.isStatic(field.getModifiers());
    }

    public List<f> l(d0 d0Var, j jVar) {
        Map<String, a> j10 = j(d0Var, jVar, (Map<String, a>) null);
        if (j10 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(j10.size());
        for (a a10 : j10.values()) {
            arrayList.add(a10.a());
        }
        return arrayList;
    }
}

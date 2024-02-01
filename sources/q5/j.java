package q5;

import a6.h;
import i5.b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q5.d0;
import q5.t;
import z5.n;

public class j extends u {

    /* renamed from: d  reason: collision with root package name */
    public final t.a f11969d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11970e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public d0 f11971a;

        /* renamed from: b  reason: collision with root package name */
        public Method f11972b;

        /* renamed from: c  reason: collision with root package name */
        public n f11973c;

        public a(d0 d0Var, Method method, n nVar) {
            this.f11971a = d0Var;
            this.f11972b = method;
            this.f11973c = nVar;
        }

        public i a() {
            Method method = this.f11972b;
            if (method == null) {
                return null;
            }
            return new i(this.f11971a, method, this.f11973c.b(), (p[]) null);
        }
    }

    public j(b bVar, t.a aVar, boolean z10) {
        super(bVar);
        this.f11969d = bVar == null ? null : aVar;
        this.f11970e = z10;
    }

    public static k m(b bVar, d0 d0Var, t.a aVar, n nVar, i5.j jVar, List<i5.j> list, Class<?> cls, boolean z10) {
        return new j(bVar, aVar, z10).l(nVar, d0Var, jVar, list, cls);
    }

    public final void i(d0 d0Var, Class<?> cls, Map<x, a> map, Class<?> cls2) {
        if (cls2 != null) {
            j(d0Var, cls, map, cls2);
        }
        if (cls != null) {
            for (Method method : h.C(cls)) {
                if (k(method)) {
                    x xVar = new x(method);
                    a aVar = map.get(xVar);
                    if (aVar == null) {
                        map.put(xVar, new a(d0Var, method, this.f11991a == null ? n.e() : e(method.getDeclaredAnnotations())));
                    } else {
                        if (this.f11970e) {
                            aVar.f11973c = f(aVar.f11973c, method.getDeclaredAnnotations());
                        }
                        Method method2 = aVar.f11972b;
                        if (method2 == null) {
                            aVar.f11972b = method;
                        } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                            aVar.f11972b = method;
                            aVar.f11971a = d0Var;
                        }
                    }
                }
            }
        }
    }

    public void j(d0 d0Var, Class<?> cls, Map<x, a> map, Class<?> cls2) {
        if (this.f11991a != null) {
            for (Class<?> declaredMethods : h.w(cls2, cls, true)) {
                for (Method method : declaredMethods.getDeclaredMethods()) {
                    if (k(method)) {
                        x xVar = new x(method);
                        a aVar = map.get(xVar);
                        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                        if (aVar == null) {
                            map.put(xVar, new a(d0Var, (Method) null, e(declaredAnnotations)));
                        } else {
                            aVar.f11973c = f(aVar.f11973c, declaredAnnotations);
                        }
                    }
                }
            }
        }
    }

    public final boolean k(Method method) {
        return !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic() && !method.isBridge() && method.getParameterTypes().length <= 2;
    }

    public k l(n nVar, d0 d0Var, i5.j jVar, List<i5.j> list, Class<?> cls) {
        boolean z10;
        Class<?> b10;
        Class<Object> cls2 = Object.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i(d0Var, jVar.g(), linkedHashMap, cls);
        for (i5.j next : list) {
            t.a aVar = this.f11969d;
            i(new d0.a(nVar, next.F()), next.g(), linkedHashMap, aVar == null ? null : aVar.b(next.g()));
        }
        t.a aVar2 = this.f11969d;
        if (aVar2 == null || (b10 = aVar2.b(cls2)) == null) {
            z10 = false;
        } else {
            j(d0Var, jVar.g(), linkedHashMap, b10);
            z10 = true;
        }
        if (z10 && this.f11991a != null && !linkedHashMap.isEmpty()) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                x xVar = (x) entry.getKey();
                if ("hashCode".equals(xVar.b()) && xVar.a() == 0) {
                    try {
                        Method declaredMethod = cls2.getDeclaredMethod(xVar.b(), new Class[0]);
                        if (declaredMethod != null) {
                            a aVar3 = (a) entry.getValue();
                            aVar3.f11973c = f(aVar3.f11973c, declaredMethod.getDeclaredAnnotations());
                            aVar3.f11972b = declaredMethod;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new k();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            i a10 = ((a) entry2.getValue()).a();
            if (a10 != null) {
                linkedHashMap2.put(entry2.getKey(), a10);
            }
        }
        return new k(linkedHashMap2);
    }
}

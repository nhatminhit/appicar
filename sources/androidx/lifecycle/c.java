package androidx.lifecycle;

import androidx.lifecycle.p;
import d.o0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static c f2779c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final int f2780d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f2781e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f2782f = 2;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, a> f2783a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Boolean> f2784b = new HashMap();

    @Deprecated
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<p.a, List<b>> f2785a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, p.a> f2786b;

        public a(Map<b, p.a> map) {
            this.f2786b = map;
            for (Map.Entry next : map.entrySet()) {
                p.a aVar = (p.a) next.getValue();
                List list = this.f2785a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2785a.put(aVar, list);
                }
                list.add((b) next.getKey());
            }
        }

        public static void b(List<b> list, y yVar, p.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(yVar, aVar, obj);
                }
            }
        }

        public void a(y yVar, p.a aVar, Object obj) {
            b(this.f2785a.get(aVar), yVar, aVar, obj);
            b(this.f2785a.get(p.a.ON_ANY), yVar, aVar, obj);
        }
    }

    @Deprecated
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f2787a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f2788b;

        public b(int i10, Method method) {
            this.f2787a = i10;
            this.f2788b = method;
            method.setAccessible(true);
        }

        public void a(y yVar, p.a aVar, Object obj) {
            try {
                int i10 = this.f2787a;
                if (i10 == 0) {
                    this.f2788b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f2788b.invoke(obj, new Object[]{yVar});
                } else if (i10 == 2) {
                    this.f2788b.invoke(obj, new Object[]{yVar, aVar});
                }
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to call observer method", e10.getCause());
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2787a == bVar.f2787a && this.f2788b.getName().equals(bVar.f2788b.getName());
        }

        public int hashCode() {
            return (this.f2787a * 31) + this.f2788b.getName().hashCode();
        }
    }

    public final a a(Class<?> cls, @o0 Method[] methodArr) {
        int i10;
        a c10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c10 = c(superclass)) == null)) {
            hashMap.putAll(c10.f2786b);
        }
        for (Class c11 : cls.getInterfaces()) {
            for (Map.Entry next : c(c11).f2786b.entrySet()) {
                e(hashMap, (b) next.getKey(), (p.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            i0 i0Var = (i0) method.getAnnotation(i0.class);
            if (i0Var != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (y.class.isAssignableFrom(parameterTypes[0])) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                p.a value = i0Var.value();
                if (parameterTypes.length > 1) {
                    if (!p.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == p.a.ON_ANY) {
                        i10 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f2783a.put(cls, aVar);
        this.f2784b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    public a c(Class<?> cls) {
        a aVar = this.f2783a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }

    public boolean d(Class<?> cls) {
        Boolean bool = this.f2784b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method annotation : b10) {
            if (((i0) annotation.getAnnotation(i0.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f2784b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map<b, p.a> map, b bVar, p.a aVar, Class<?> cls) {
        p.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f2788b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }
}

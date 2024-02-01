package androidx.lifecycle;

import be.v;
import d.x0;
import fh.g;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lf.b0;
import ve.m;
import xe.l0;

@x0({x0.a.Q})
public final class d0 {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f2789a = new d0();

    /* renamed from: b  reason: collision with root package name */
    public static final int f2790b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f2791c = 2;
    @g

    /* renamed from: d  reason: collision with root package name */
    public static final Map<Class<?>, Integer> f2792d = new HashMap();
    @g

    /* renamed from: e  reason: collision with root package name */
    public static final Map<Class<?>, List<Constructor<? extends l>>> f2793e = new HashMap();

    @g
    @m
    public static final String c(@g String str) {
        l0.p(str, "className");
        return b0.l2(str, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    @g
    @m
    public static final u f(@g Object obj) {
        l0.p(obj, "object");
        boolean z10 = obj instanceof u;
        boolean z11 = obj instanceof h;
        if (z10 && z11) {
            return new DefaultLifecycleObserverAdapter((h) obj, (u) obj);
        }
        if (z11) {
            return new DefaultLifecycleObserverAdapter((h) obj, (u) null);
        }
        if (z10) {
            return (u) obj;
        }
        Class<?> cls = obj.getClass();
        d0 d0Var = f2789a;
        if (d0Var.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends l>> list = f2793e.get(cls);
        l0.m(list);
        List list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(d0Var.a((Constructor) list2.get(0), obj));
        }
        int size = list2.size();
        l[] lVarArr = new l[size];
        for (int i10 = 0; i10 < size; i10++) {
            lVarArr[i10] = f2789a.a((Constructor) list2.get(i10), obj);
        }
        return new CompositeGeneratedAdaptersObserver(lVarArr);
    }

    public final l a(Constructor<? extends l> constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            l0.o(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (l) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public final Constructor<? extends l> b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            l0.o(name, "fullPackage");
            if (!(name.length() == 0)) {
                l0.o(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                l0.o(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            l0.o(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c10 = c(canonicalName);
            if (!(name.length() == 0)) {
                c10 = name + '.' + c10;
            }
            Class<?> cls2 = Class.forName(c10);
            l0.n(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f2792d;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g10 = g(cls);
        map.put(cls, Integer.valueOf(g10));
        return g10;
    }

    public final boolean e(Class<?> cls) {
        return cls != null && x.class.isAssignableFrom(cls);
    }

    public final int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends l> b10 = b(cls);
        if (b10 != null) {
            f2793e.put(cls, v.k(b10));
            return 2;
        } else if (c.f2779c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (e(superclass)) {
                l0.o(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends l>> list = f2793e.get(superclass);
                l0.m(list);
                arrayList = new ArrayList(list);
            }
            Class[] interfaces = cls.getInterfaces();
            l0.o(interfaces, "klass.interfaces");
            for (Class cls2 : interfaces) {
                if (e(cls2)) {
                    l0.o(cls2, "intrface");
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends l>> list2 = f2793e.get(cls2);
                    l0.m(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f2793e.put(cls, arrayList);
            return 2;
        }
    }
}

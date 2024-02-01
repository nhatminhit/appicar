package le;

import fh.g;
import fh.h;
import java.lang.reflect.Method;
import ve.e;
import xe.l0;

public final class i {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final i f20748a = new i();
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final a f20749b = new a((Method) null, (Method) null, (Method) null);
    @h

    /* renamed from: c  reason: collision with root package name */
    public static a f20750c;

    public static final class a {
        @e
        @h

        /* renamed from: a  reason: collision with root package name */
        public final Method f20751a;
        @e
        @h

        /* renamed from: b  reason: collision with root package name */
        public final Method f20752b;
        @e
        @h

        /* renamed from: c  reason: collision with root package name */
        public final Method f20753c;

        public a(@h Method method, @h Method method2, @h Method method3) {
            this.f20751a = method;
            this.f20752b = method2;
            this.f20753c = method3;
        }
    }

    public final a a(a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f20750c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f20749b;
            f20750c = aVar3;
            return aVar3;
        }
    }

    @h
    public final String b(@g a aVar) {
        l0.p(aVar, "continuation");
        a aVar2 = f20750c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 == f20749b) {
            return null;
        }
        Method method = aVar2.f20751a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f20752b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f20753c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}

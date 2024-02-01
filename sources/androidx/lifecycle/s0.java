package androidx.lifecycle;

import android.app.Application;
import be.p;
import be.v;
import be.w;
import d.x0;
import fh.g;
import fh.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import xe.l0;

@x0({x0.a.O})
public final class s0 {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final List<Class<?>> f2845a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final List<Class<?>> f2846b;

    static {
        Class<n0> cls = n0.class;
        f2845a = w.L(Application.class, cls);
        f2846b = v.k(cls);
    }

    @h
    public static final <T> Constructor<T> c(@g Class<T> cls, @g List<? extends Class<?>> list) {
        l0.p(cls, "modelClass");
        l0.p(list, "signature");
        Constructor<T>[] constructors = cls.getConstructors();
        l0.o(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i10 = 0;
        while (i10 < length) {
            Constructor<T> constructor = constructors[i10];
            Class[] parameterTypes = constructor.getParameterTypes();
            l0.o(parameterTypes, "constructor.parameterTypes");
            List kz = p.kz(parameterTypes);
            if (l0.g(list, kz)) {
                l0.n(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            } else if (list.size() != kz.size() || !kz.containsAll(list)) {
                i10++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends v0> T d(@g Class<T> cls, @g Constructor<T> constructor, @g Object... objArr) {
        l0.p(cls, "modelClass");
        l0.p(constructor, "constructor");
        l0.p(objArr, "params");
        try {
            return (v0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}

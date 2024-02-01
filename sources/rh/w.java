package rh;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public abstract class w<T> {
    public static <T> w<T> b(v vVar, Method method) {
        t b10 = t.b(vVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (z.j(genericReturnType)) {
            throw z.m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return k.f(vVar, method, b10);
        } else {
            throw z.m(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    @Nullable
    public abstract T a(Object[] objArr);
}

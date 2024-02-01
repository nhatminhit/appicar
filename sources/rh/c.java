package rh;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public interface c<R, T> {

    public static abstract class a {
        public static Type b(int i10, ParameterizedType parameterizedType) {
            return z.g(i10, parameterizedType);
        }

        public static Class<?> c(Type type) {
            return z.h(type);
        }

        @Nullable
        public abstract c<?, ?> a(Type type, Annotation[] annotationArr, v vVar);
    }

    Type a();

    T b(b<R> bVar);
}

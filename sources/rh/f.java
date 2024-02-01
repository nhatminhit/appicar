package rh;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import og.k0;
import og.m0;

public interface f<F, T> {

    public static abstract class a {
        public static Type a(int i10, ParameterizedType parameterizedType) {
            return z.g(i10, parameterizedType);
        }

        public static Class<?> b(Type type) {
            return z.h(type);
        }

        @Nullable
        public f<?, k0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, v vVar) {
            return null;
        }

        @Nullable
        public f<m0, ?> d(Type type, Annotation[] annotationArr, v vVar) {
            return null;
        }

        @Nullable
        public f<?, String> e(Type type, Annotation[] annotationArr, v vVar) {
            return null;
        }
    }

    @Nullable
    T a(F f10) throws IOException;
}

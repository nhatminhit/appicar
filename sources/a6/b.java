package a6;

import java.lang.annotation.Annotation;

public interface b {
    <A extends Annotation> A a(Class<A> cls);

    boolean b(Class<?> cls);

    boolean c(Class<? extends Annotation>[] clsArr);

    int size();
}

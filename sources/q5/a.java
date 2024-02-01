package q5;

import i5.j;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Modifier;

public abstract class a {
    @Deprecated
    public abstract Iterable<Annotation> b();

    public abstract AnnotatedElement c();

    public abstract <A extends Annotation> A d(Class<A> cls);

    public abstract int e();

    public abstract boolean equals(Object obj);

    public abstract String f();

    public abstract Class<?> g();

    public abstract j h();

    public abstract int hashCode();

    public abstract boolean i(Class<?> cls);

    public abstract boolean j(Class<? extends Annotation>[] clsArr);

    public boolean k() {
        return Modifier.isPublic(e());
    }

    public abstract String toString();
}

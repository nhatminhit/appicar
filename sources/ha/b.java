package ha;

import ja.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Field f19462a;

    public b(Field field) {
        a.b(field);
        this.f19462a = field;
    }

    public Object a(Object obj) throws IllegalAccessException {
        return this.f19462a.get(obj);
    }

    public <T extends Annotation> T b(Class<T> cls) {
        return this.f19462a.getAnnotation(cls);
    }

    public Collection<Annotation> c() {
        return Arrays.asList(this.f19462a.getAnnotations());
    }

    public Class<?> d() {
        return this.f19462a.getType();
    }

    public Type e() {
        return this.f19462a.getGenericType();
    }

    public Class<?> f() {
        return this.f19462a.getDeclaringClass();
    }

    public String g() {
        return this.f19462a.getName();
    }

    public boolean h(int i10) {
        return (i10 & this.f19462a.getModifiers()) != 0;
    }

    public boolean i() {
        return this.f19462a.isSynthetic();
    }
}

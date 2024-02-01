package rh;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Method f22624a;

    /* renamed from: b  reason: collision with root package name */
    public final List<?> f22625b;

    public l(Method method, List<?> list) {
        this.f22624a = method;
        this.f22625b = Collections.unmodifiableList(list);
    }

    public static l c(Method method, List<?> list) {
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new l(method, new ArrayList(list));
    }

    public List<?> a() {
        return this.f22625b;
    }

    public Method b() {
        return this.f22624a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f22624a.getDeclaringClass().getName(), this.f22624a.getName(), this.f22625b});
    }
}

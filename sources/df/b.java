package df;

import fh.g;
import fh.h;
import hf.o;
import xe.l0;

public final class b<T> implements f<Object, T> {
    @h

    /* renamed from: a  reason: collision with root package name */
    public T f17829a;

    @g
    public T a(@h Object obj, @g o<?> oVar) {
        l0.p(oVar, "property");
        T t10 = this.f17829a;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Property " + oVar.getName() + " should be initialized before get.");
    }

    public void b(@h Object obj, @g o<?> oVar, @g T t10) {
        l0.p(oVar, "property");
        l0.p(t10, "value");
        this.f17829a = t10;
    }
}

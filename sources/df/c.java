package df;

import fh.g;
import fh.h;
import hf.o;
import xe.l0;

public abstract class c<V> implements f<Object, V> {

    /* renamed from: a  reason: collision with root package name */
    public V f17830a;

    public c(V v10) {
        this.f17830a = v10;
    }

    public V a(@h Object obj, @g o<?> oVar) {
        l0.p(oVar, "property");
        return this.f17830a;
    }

    public void b(@h Object obj, @g o<?> oVar, V v10) {
        l0.p(oVar, "property");
        V v11 = this.f17830a;
        if (d(oVar, v11, v10)) {
            this.f17830a = v10;
            c(oVar, v11, v10);
        }
    }

    public void c(@g o<?> oVar, V v10, V v11) {
        l0.p(oVar, "property");
    }

    public boolean d(@g o<?> oVar, V v10, V v11) {
        l0.p(oVar, "property");
        return true;
    }
}

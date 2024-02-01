package i2;

import androidx.lifecycle.v0;
import fh.g;
import we.l;
import xe.l0;

public final class h<T extends v0> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final Class<T> f9020a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final l<a, T> f9021b;

    public h(@g Class<T> cls, @g l<? super a, ? extends T> lVar) {
        l0.p(cls, "clazz");
        l0.p(lVar, "initializer");
        this.f9020a = cls;
        this.f9021b = lVar;
    }

    @g
    public final Class<T> a() {
        return this.f9020a;
    }

    @g
    public final l<a, T> b() {
        return this.f9021b;
    }
}

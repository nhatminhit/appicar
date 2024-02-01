package androidx.lifecycle;

import androidx.lifecycle.c;
import androidx.lifecycle.p;
import d.m0;

@Deprecated
class ReflectiveGenericLifecycleObserver implements u {
    public final Object O;
    public final c.a P;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.O = obj;
        this.P = c.f2779c.c(obj.getClass());
    }

    public void d(@m0 y yVar, @m0 p.a aVar) {
        this.P.a(yVar, aVar, this.O);
    }
}

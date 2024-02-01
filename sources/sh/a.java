package sh;

import ha.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import og.k0;
import og.m0;
import rh.f;
import rh.v;

public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public final e f23019a;

    public a(e eVar) {
        this.f23019a = eVar;
    }

    public static a f() {
        return g(new e());
    }

    public static a g(e eVar) {
        if (eVar != null) {
            return new a(eVar);
        }
        throw new NullPointerException("gson == null");
    }

    public f<?, k0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, v vVar) {
        return new b(this.f23019a, this.f23019a.q(oa.a.c(type)));
    }

    public f<m0, ?> d(Type type, Annotation[] annotationArr, v vVar) {
        return new c(this.f23019a, this.f23019a.q(oa.a.c(type)));
    }
}

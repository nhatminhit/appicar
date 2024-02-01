package m5;

import a6.h;
import i5.g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import l5.v;
import q5.d;
import q5.d0;
import q5.p;
import u5.f;
import w4.l;

public final class j extends v.a {

    /* renamed from: g0  reason: collision with root package name */
    public static final long f10411g0 = 1;

    /* renamed from: e0  reason: collision with root package name */
    public final transient Constructor<?> f10412e0;

    /* renamed from: f0  reason: collision with root package name */
    public d f10413f0;

    public j(v vVar, Constructor<?> constructor) {
        super(vVar);
        this.f10412e0 = constructor;
    }

    public j(v vVar, d dVar) {
        super(vVar);
        this.f10413f0 = dVar;
        Constructor<?> G = dVar == null ? null : dVar.c();
        this.f10412e0 = G;
        if (G == null) {
            throw new IllegalArgumentException("Missing constructor (broken JDK (de)serialization?)");
        }
    }

    public v Y(v vVar) {
        return vVar == this.f10194d0 ? this : new j(vVar, this.f10412e0);
    }

    public Object Z() {
        return new j((v) this, this.f10413f0);
    }

    public Object a0() {
        return this.f10413f0 == null ? new j((v) this, new d((d0) null, this.f10412e0, (p) null, (p[]) null)) : this;
    }

    public void t(l lVar, g gVar, Object obj) throws IOException {
        Object obj2;
        Object obj3;
        if (lVar.P() == w4.p.VALUE_NULL) {
            obj2 = this.V.d(gVar);
        } else {
            f fVar = this.W;
            if (fVar != null) {
                obj2 = this.V.h(lVar, gVar, fVar);
            } else {
                try {
                    obj3 = this.f10412e0.newInstance(new Object[]{obj});
                } catch (Exception e10) {
                    h.t0(e10, String.format("Failed to instantiate class %s, problem: %s", new Object[]{this.f10412e0.getDeclaringClass().getName(), e10.getMessage()}));
                    obj3 = null;
                }
                this.V.g(lVar, gVar, obj3);
                obj2 = obj3;
            }
        }
        M(obj, obj2);
    }

    public Object u(l lVar, g gVar, Object obj) throws IOException {
        return N(obj, s(lVar, gVar));
    }
}

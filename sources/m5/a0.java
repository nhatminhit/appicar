package m5;

import a6.b;
import i5.g;
import i5.j;
import i5.k;
import i5.q;
import i5.y;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import l5.s;
import l5.v;
import q5.h;
import q5.i;
import u5.f;
import w4.l;
import w4.p;

public final class a0 extends v {

    /* renamed from: f0  reason: collision with root package name */
    public static final long f10362f0 = 1;

    /* renamed from: d0  reason: collision with root package name */
    public final i f10363d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Method f10364e0;

    public a0(a0 a0Var, k<?> kVar, s sVar) {
        super(a0Var, kVar, sVar);
        this.f10363d0 = a0Var.f10363d0;
        this.f10364e0 = a0Var.f10364e0;
    }

    public a0(a0 a0Var, y yVar) {
        super(a0Var, yVar);
        this.f10363d0 = a0Var.f10363d0;
        this.f10364e0 = a0Var.f10364e0;
    }

    public a0(q5.s sVar, j jVar, f fVar, b bVar, i iVar) {
        super(sVar, jVar, fVar, bVar);
        this.f10363d0 = iVar;
        this.f10364e0 = iVar.c();
    }

    public final void M(Object obj, Object obj2) throws IOException {
        throw new UnsupportedOperationException("Should never call `set()` on setterless property ('" + getName() + "')");
    }

    public Object N(Object obj, Object obj2) throws IOException {
        M(obj, obj2);
        return obj;
    }

    public v S(y yVar) {
        return new a0(this, yVar);
    }

    public v T(s sVar) {
        return new a0(this, this.V, sVar);
    }

    public v V(k<?> kVar) {
        k<Object> kVar2 = this.V;
        if (kVar2 == kVar) {
            return this;
        }
        s sVar = this.X;
        if (kVar2 == sVar) {
            sVar = kVar;
        }
        return new a0(this, kVar, sVar);
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this.f10363d0.d(cls);
    }

    public h i() {
        return this.f10363d0;
    }

    public final void t(l lVar, g gVar, Object obj) throws IOException {
        if (!lVar.q2(p.VALUE_NULL)) {
            if (this.W != null) {
                gVar.z(e(), String.format("Problem deserializing 'setterless' property (\"%s\"): no way to handle typed deser with setterless yet", new Object[]{getName()}));
            }
            try {
                Object invoke = this.f10364e0.invoke(obj, (Object[]) null);
                if (invoke == null) {
                    gVar.z(e(), String.format("Problem deserializing 'setterless' property '%s': get method returned null", new Object[]{getName()}));
                }
                this.V.g(lVar, gVar, invoke);
            } catch (Exception e10) {
                f(lVar, e10);
            }
        }
    }

    public Object u(l lVar, g gVar, Object obj) throws IOException {
        t(lVar, gVar, obj);
        return obj;
    }

    public void w(i5.f fVar) {
        this.f10363d0.l(fVar.T(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }
}

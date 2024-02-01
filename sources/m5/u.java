package m5;

import i5.g;
import i5.k;
import i5.x;
import i5.y;
import java.io.IOException;
import java.lang.annotation.Annotation;
import l5.s;
import l5.v;
import q5.h;
import w4.l;
import w4.p;

public final class u extends v {

    /* renamed from: e0  reason: collision with root package name */
    public static final long f10445e0 = 1;

    /* renamed from: d0  reason: collision with root package name */
    public final s f10446d0;

    public u(s sVar, x xVar) {
        super(sVar.P, sVar.c(), xVar, sVar.b());
        this.f10446d0 = sVar;
    }

    public u(u uVar, k<?> kVar, s sVar) {
        super(uVar, kVar, sVar);
        this.f10446d0 = uVar.f10446d0;
    }

    public u(u uVar, y yVar) {
        super(uVar, yVar);
        this.f10446d0 = uVar.f10446d0;
    }

    public void M(Object obj, Object obj2) throws IOException {
        N(obj, obj2);
    }

    public Object N(Object obj, Object obj2) throws IOException {
        v vVar = this.f10446d0.T;
        if (vVar != null) {
            return vVar.N(obj, obj2);
        }
        throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
    }

    public v S(y yVar) {
        return new u(this, yVar);
    }

    public v T(s sVar) {
        return new u(this, this.V, sVar);
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
        return new u(this, kVar, sVar);
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return null;
    }

    public h i() {
        return null;
    }

    public void t(l lVar, g gVar, Object obj) throws IOException {
        u(lVar, gVar, obj);
    }

    public Object u(l lVar, g gVar, Object obj) throws IOException {
        if (lVar.q2(p.VALUE_NULL)) {
            return null;
        }
        Object f10 = this.V.f(lVar, gVar);
        s sVar = this.f10446d0;
        gVar.P(f10, sVar.Q, sVar.R).b(obj);
        v vVar = this.f10446d0.T;
        return vVar != null ? vVar.N(obj, f10) : obj;
    }
}

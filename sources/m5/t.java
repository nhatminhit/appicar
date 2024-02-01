package m5;

import i5.f;
import i5.g;
import i5.k;
import i5.y;
import java.io.IOException;
import java.lang.annotation.Annotation;
import l5.s;
import l5.v;
import l5.w;
import m5.z;
import q5.h;
import w4.l;

public class t extends v {

    /* renamed from: e0  reason: collision with root package name */
    public static final long f10441e0 = 1;

    /* renamed from: d0  reason: collision with root package name */
    public final v f10442d0;

    public static final class a extends z.a {

        /* renamed from: c  reason: collision with root package name */
        public final t f10443c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f10444d;

        public a(t tVar, w wVar, Class<?> cls, Object obj) {
            super(wVar, cls);
            this.f10443c = tVar;
            this.f10444d = obj;
        }

        public void c(Object obj, Object obj2) throws IOException {
            if (d(obj)) {
                this.f10443c.M(this.f10444d, obj2);
                return;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public t(v vVar, q5.z zVar) {
        super(vVar);
        this.f10442d0 = vVar;
        this.Z = zVar;
    }

    public t(t tVar, k<?> kVar, s sVar) {
        super(tVar, kVar, sVar);
        this.f10442d0 = tVar.f10442d0;
        this.Z = tVar.Z;
    }

    public t(t tVar, y yVar) {
        super(tVar, yVar);
        this.f10442d0 = tVar.f10442d0;
        this.Z = tVar.Z;
    }

    public void M(Object obj, Object obj2) throws IOException {
        this.f10442d0.M(obj, obj2);
    }

    public Object N(Object obj, Object obj2) throws IOException {
        return this.f10442d0.N(obj, obj2);
    }

    public v S(y yVar) {
        return new t(this, yVar);
    }

    public v T(s sVar) {
        return new t(this, this.V, sVar);
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
        return new t(this, kVar, sVar);
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this.f10442d0.getAnnotation(cls);
    }

    public h i() {
        return this.f10442d0.i();
    }

    public void t(l lVar, g gVar, Object obj) throws IOException {
        u(lVar, gVar, obj);
    }

    public Object u(l lVar, g gVar, Object obj) throws IOException {
        try {
            return N(obj, s(lVar, gVar));
        } catch (w e10) {
            if ((this.Z == null && this.V.q() == null) ? false : true) {
                e10.A().a(new a(this, e10, this.S.g(), obj));
                return null;
            }
            throw i5.l.o(lVar, "Unresolved forward reference but no identity info", e10);
        }
    }

    public void w(f fVar) {
        v vVar = this.f10442d0;
        if (vVar != null) {
            vVar.w(fVar);
        }
    }

    public int x() {
        return this.f10442d0.x();
    }
}

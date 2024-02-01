package m5;

import a6.b;
import i5.g;
import i5.j;
import i5.k;
import i5.q;
import i5.y;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import l5.s;
import l5.v;
import q5.f;
import q5.h;
import w4.l;
import w4.p;

public final class i extends v {

    /* renamed from: g0  reason: collision with root package name */
    public static final long f10407g0 = 1;

    /* renamed from: d0  reason: collision with root package name */
    public final f f10408d0;

    /* renamed from: e0  reason: collision with root package name */
    public final transient Field f10409e0;

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f10410f0;

    public i(i iVar) {
        super(iVar);
        f fVar = iVar.f10408d0;
        this.f10408d0 = fVar;
        Field u10 = fVar.c();
        if (u10 != null) {
            this.f10409e0 = u10;
            this.f10410f0 = iVar.f10410f0;
            return;
        }
        throw new IllegalArgumentException("Missing field (broken JDK (de)serialization?)");
    }

    public i(i iVar, k<?> kVar, s sVar) {
        super(iVar, kVar, sVar);
        this.f10408d0 = iVar.f10408d0;
        this.f10409e0 = iVar.f10409e0;
        this.f10410f0 = q.e(sVar);
    }

    public i(i iVar, y yVar) {
        super(iVar, yVar);
        this.f10408d0 = iVar.f10408d0;
        this.f10409e0 = iVar.f10409e0;
        this.f10410f0 = iVar.f10410f0;
    }

    public i(q5.s sVar, j jVar, u5.f fVar, b bVar, f fVar2) {
        super(sVar, jVar, fVar, bVar);
        this.f10408d0 = fVar2;
        this.f10409e0 = fVar2.c();
        this.f10410f0 = q.e(this.X);
    }

    public void M(Object obj, Object obj2) throws IOException {
        try {
            this.f10409e0.set(obj, obj2);
        } catch (Exception e10) {
            g(e10, obj2);
        }
    }

    public Object N(Object obj, Object obj2) throws IOException {
        try {
            this.f10409e0.set(obj, obj2);
        } catch (Exception e10) {
            g(e10, obj2);
        }
        return obj;
    }

    public v S(y yVar) {
        return new i(this, yVar);
    }

    public v T(s sVar) {
        return new i(this, this.V, sVar);
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
        return new i(this, kVar, sVar);
    }

    public Object W() {
        return new i(this);
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        f fVar = this.f10408d0;
        if (fVar == null) {
            return null;
        }
        return fVar.d(cls);
    }

    public h i() {
        return this.f10408d0;
    }

    public void t(l lVar, g gVar, Object obj) throws IOException {
        Object obj2;
        if (!lVar.q2(p.VALUE_NULL)) {
            u5.f fVar = this.W;
            if (fVar == null) {
                Object f10 = this.V.f(lVar, gVar);
                if (f10 != null) {
                    obj2 = f10;
                } else if (this.f10410f0) {
                    return;
                }
            } else {
                obj2 = this.V.h(lVar, gVar, fVar);
            }
            this.f10409e0.set(obj, obj2);
        } else if (this.f10410f0) {
            return;
        }
        obj2 = this.X.d(gVar);
        try {
            this.f10409e0.set(obj, obj2);
        } catch (Exception e10) {
            h(lVar, e10, obj2);
        }
    }

    public Object u(l lVar, g gVar, Object obj) throws IOException {
        Object obj2;
        if (!lVar.q2(p.VALUE_NULL)) {
            u5.f fVar = this.W;
            if (fVar == null) {
                Object f10 = this.V.f(lVar, gVar);
                if (f10 != null) {
                    obj2 = f10;
                } else if (this.f10410f0) {
                    return obj;
                }
            } else {
                obj2 = this.V.h(lVar, gVar, fVar);
            }
            this.f10409e0.set(obj, obj2);
            return obj;
        } else if (this.f10410f0) {
            return obj;
        }
        obj2 = this.X.d(gVar);
        try {
            this.f10409e0.set(obj, obj2);
        } catch (Exception e10) {
            h(lVar, e10, obj2);
        }
        return obj;
    }

    public void w(i5.f fVar) {
        a6.h.g(this.f10409e0, fVar.T(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }
}

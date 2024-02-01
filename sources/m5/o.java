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

public final class o extends v {

    /* renamed from: g0  reason: collision with root package name */
    public static final long f10437g0 = 1;

    /* renamed from: d0  reason: collision with root package name */
    public final i f10438d0;

    /* renamed from: e0  reason: collision with root package name */
    public final transient Method f10439e0;

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f10440f0;

    public o(o oVar, k<?> kVar, s sVar) {
        super(oVar, kVar, sVar);
        this.f10438d0 = oVar.f10438d0;
        this.f10439e0 = oVar.f10439e0;
        this.f10440f0 = q.e(sVar);
    }

    public o(o oVar, y yVar) {
        super(oVar, yVar);
        this.f10438d0 = oVar.f10438d0;
        this.f10439e0 = oVar.f10439e0;
        this.f10440f0 = oVar.f10440f0;
    }

    public o(o oVar, Method method) {
        super(oVar);
        this.f10438d0 = oVar.f10438d0;
        this.f10439e0 = method;
        this.f10440f0 = oVar.f10440f0;
    }

    public o(q5.s sVar, j jVar, f fVar, b bVar, i iVar) {
        super(sVar, jVar, fVar, bVar);
        this.f10438d0 = iVar;
        this.f10439e0 = iVar.c();
        this.f10440f0 = q.e(this.X);
    }

    public final void M(Object obj, Object obj2) throws IOException {
        try {
            this.f10439e0.invoke(obj, new Object[]{obj2});
        } catch (Exception e10) {
            g(e10, obj2);
        }
    }

    public Object N(Object obj, Object obj2) throws IOException {
        try {
            Object invoke = this.f10439e0.invoke(obj, new Object[]{obj2});
            return invoke == null ? obj : invoke;
        } catch (Exception e10) {
            g(e10, obj2);
            return null;
        }
    }

    public v S(y yVar) {
        return new o(this, yVar);
    }

    public v T(s sVar) {
        return new o(this, this.V, sVar);
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
        return new o(this, kVar, sVar);
    }

    public Object W() {
        return new o(this, this.f10438d0.c());
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        i iVar = this.f10438d0;
        if (iVar == null) {
            return null;
        }
        return iVar.d(cls);
    }

    public h i() {
        return this.f10438d0;
    }

    public void t(l lVar, g gVar, Object obj) throws IOException {
        Object obj2;
        if (!lVar.q2(p.VALUE_NULL)) {
            f fVar = this.W;
            if (fVar == null) {
                Object f10 = this.V.f(lVar, gVar);
                if (f10 != null) {
                    obj2 = f10;
                } else if (this.f10440f0) {
                    return;
                }
            } else {
                obj2 = this.V.h(lVar, gVar, fVar);
            }
            this.f10439e0.invoke(obj, new Object[]{obj2});
        } else if (this.f10440f0) {
            return;
        }
        obj2 = this.X.d(gVar);
        try {
            this.f10439e0.invoke(obj, new Object[]{obj2});
        } catch (Exception e10) {
            h(lVar, e10, obj2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object u(w4.l r4, i5.g r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r3 = this;
            w4.p r0 = w4.p.VALUE_NULL
            boolean r0 = r4.q2(r0)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3.f10440f0
            if (r0 == 0) goto L_0x000d
            return r6
        L_0x000d:
            l5.s r0 = r3.X
            java.lang.Object r5 = r0.d(r5)
            goto L_0x002d
        L_0x0014:
            u5.f r0 = r3.W
            if (r0 != 0) goto L_0x0027
            i5.k<java.lang.Object> r0 = r3.V
            java.lang.Object r0 = r0.f(r4, r5)
            if (r0 != 0) goto L_0x0025
            boolean r0 = r3.f10440f0
            if (r0 == 0) goto L_0x000d
            return r6
        L_0x0025:
            r5 = r0
            goto L_0x002d
        L_0x0027:
            i5.k<java.lang.Object> r1 = r3.V
            java.lang.Object r5 = r1.h(r4, r5, r0)
        L_0x002d:
            java.lang.reflect.Method r0 = r3.f10439e0     // Catch:{ Exception -> 0x003e }
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x003e }
            r2 = 0
            r1[r2] = r5     // Catch:{ Exception -> 0x003e }
            java.lang.Object r4 = r0.invoke(r6, r1)     // Catch:{ Exception -> 0x003e }
            if (r4 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r6 = r4
        L_0x003d:
            return r6
        L_0x003e:
            r6 = move-exception
            r3.h(r4, r6, r5)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.o.u(w4.l, i5.g, java.lang.Object):java.lang.Object");
    }

    public void w(i5.f fVar) {
        this.f10438d0.l(fVar.T(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }
}

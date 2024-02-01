package com.fasterxml.jackson.databind.ser;

import a6.b;
import c5.m;
import i5.c0;
import i5.d0;
import i5.e0;
import i5.j;
import i5.o;
import i5.q;
import i5.x;
import i5.y;
import j5.a;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import q5.f;
import q5.h;
import q5.s;
import s5.l;
import t5.c;
import u5.i;
import v4.u;
import x5.k;

@a
public class d extends o implements Serializable {

    /* renamed from: j0  reason: collision with root package name */
    public static final long f5029j0 = 1;

    /* renamed from: k0  reason: collision with root package name */
    public static final Object f5030k0 = u.a.NON_EMPTY;
    public final m S;
    public final y T;
    public final j U;
    public final j V;
    public j W;
    public final transient b X;
    public final h Y;
    public transient Method Z;

    /* renamed from: a0  reason: collision with root package name */
    public transient Field f5031a0;

    /* renamed from: b0  reason: collision with root package name */
    public o<Object> f5032b0;

    /* renamed from: c0  reason: collision with root package name */
    public o<Object> f5033c0;

    /* renamed from: d0  reason: collision with root package name */
    public i f5034d0;

    /* renamed from: e0  reason: collision with root package name */
    public transient k f5035e0;

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f5036f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Object f5037g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Class<?>[] f5038h0;

    /* renamed from: i0  reason: collision with root package name */
    public transient HashMap<Object, Object> f5039i0;

    public d() {
        super(x.Y);
        this.Y = null;
        this.X = null;
        this.S = null;
        this.T = null;
        this.f5038h0 = null;
        this.U = null;
        this.f5032b0 = null;
        this.f5035e0 = null;
        this.f5034d0 = null;
        this.V = null;
        this.Z = null;
        this.f5031a0 = null;
        this.f5036f0 = false;
        this.f5037g0 = null;
        this.f5033c0 = null;
    }

    public d(d dVar) {
        this(dVar, dVar.S);
    }

    public d(d dVar, m mVar) {
        super((o) dVar);
        this.S = mVar;
        this.T = dVar.T;
        this.Y = dVar.Y;
        this.X = dVar.X;
        this.U = dVar.U;
        this.Z = dVar.Z;
        this.f5031a0 = dVar.f5031a0;
        this.f5032b0 = dVar.f5032b0;
        this.f5033c0 = dVar.f5033c0;
        if (dVar.f5039i0 != null) {
            this.f5039i0 = new HashMap<>(dVar.f5039i0);
        }
        this.V = dVar.V;
        this.f5035e0 = dVar.f5035e0;
        this.f5036f0 = dVar.f5036f0;
        this.f5037g0 = dVar.f5037g0;
        this.f5038h0 = dVar.f5038h0;
        this.f5034d0 = dVar.f5034d0;
        this.W = dVar.W;
    }

    public d(d dVar, y yVar) {
        super((o) dVar);
        this.S = new m(yVar.d());
        this.T = dVar.T;
        this.X = dVar.X;
        this.U = dVar.U;
        this.Y = dVar.Y;
        this.Z = dVar.Z;
        this.f5031a0 = dVar.f5031a0;
        this.f5032b0 = dVar.f5032b0;
        this.f5033c0 = dVar.f5033c0;
        if (dVar.f5039i0 != null) {
            this.f5039i0 = new HashMap<>(dVar.f5039i0);
        }
        this.V = dVar.V;
        this.f5035e0 = dVar.f5035e0;
        this.f5036f0 = dVar.f5036f0;
        this.f5037g0 = dVar.f5037g0;
        this.f5038h0 = dVar.f5038h0;
        this.f5034d0 = dVar.f5034d0;
        this.W = dVar.W;
    }

    @Deprecated
    public d(s sVar, h hVar, b bVar, j jVar, o<?> oVar, i iVar, j jVar2, boolean z10, Object obj) {
        this(sVar, hVar, bVar, jVar, oVar, iVar, jVar2, z10, obj, (Class<?>[]) null);
    }

    public d(s sVar, h hVar, b bVar, j jVar, o<?> oVar, i iVar, j jVar2, boolean z10, Object obj, Class<?>[] clsArr) {
        super(sVar);
        this.Y = hVar;
        this.X = bVar;
        this.S = new m(sVar.getName());
        this.T = sVar.o();
        this.U = jVar;
        this.f5032b0 = oVar;
        this.f5035e0 = oVar == null ? k.c() : null;
        this.f5034d0 = iVar;
        this.V = jVar2;
        if (hVar instanceof f) {
            this.Z = null;
            this.f5031a0 = (Field) hVar.p();
        } else {
            if (hVar instanceof q5.i) {
                this.Z = (Method) hVar.p();
            } else {
                this.Z = null;
            }
            this.f5031a0 = null;
        }
        this.f5036f0 = z10;
        this.f5037g0 = obj;
        this.f5033c0 = null;
        this.f5038h0 = clsArr;
    }

    public void A(c0 c0Var) {
        this.Y.l(c0Var.T(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public final Object B(Object obj) throws Exception {
        Method method = this.Z;
        return method == null ? this.f5031a0.get(obj) : method.invoke(obj, (Object[]) null);
    }

    @Deprecated
    public Type C() {
        Method method = this.Z;
        if (method != null) {
            return method.getGenericReturnType();
        }
        Field field = this.f5031a0;
        if (field != null) {
            return field.getGenericType();
        }
        return null;
    }

    public Object D(Object obj) {
        HashMap<Object, Object> hashMap = this.f5039i0;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(obj);
    }

    @Deprecated
    public Class<?> E() {
        Method method = this.Z;
        if (method != null) {
            return method.getReturnType();
        }
        Field field = this.f5031a0;
        if (field != null) {
            return field.getType();
        }
        return null;
    }

    @Deprecated
    public Class<?> F() {
        j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        return jVar.g();
    }

    public j G() {
        return this.V;
    }

    public w4.u H() {
        return this.S;
    }

    public o<Object> I() {
        return this.f5032b0;
    }

    public i J() {
        return this.f5034d0;
    }

    public Class<?>[] K() {
        return this.f5038h0;
    }

    public boolean L() {
        return this.f5033c0 != null;
    }

    public boolean M() {
        return this.f5032b0 != null;
    }

    public boolean N() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public Object O() {
        h hVar = this.Y;
        if (hVar instanceof f) {
            this.Z = null;
            this.f5031a0 = (Field) hVar.p();
        } else if (hVar instanceof q5.i) {
            this.Z = (Method) hVar.p();
            this.f5031a0 = null;
        }
        if (this.f5032b0 == null) {
            this.f5035e0 = k.c();
        }
        return this;
    }

    public Object P(Object obj) {
        HashMap<Object, Object> hashMap = this.f5039i0;
        if (hashMap == null) {
            return null;
        }
        Object remove = hashMap.remove(obj);
        if (this.f5039i0.size() == 0) {
            this.f5039i0 = null;
        }
        return remove;
    }

    public d Q(a6.s sVar) {
        String d10 = sVar.d(this.S.getValue());
        return d10.equals(this.S.toString()) ? this : w(y.a(d10));
    }

    public Object R(Object obj, Object obj2) {
        if (this.f5039i0 == null) {
            this.f5039i0 = new HashMap<>();
        }
        return this.f5039i0.put(obj, obj2);
    }

    public void S(j jVar) {
        this.W = jVar;
    }

    public d T(a6.s sVar) {
        return new x5.s(this, sVar);
    }

    public boolean U() {
        return this.f5036f0;
    }

    public boolean V(y yVar) {
        y yVar2 = this.T;
        return yVar2 != null ? yVar2.equals(yVar) : yVar.g(this.S.getValue()) && !yVar.e();
    }

    public y a() {
        return new y(this.S.getValue());
    }

    public void b(l lVar, e0 e0Var) throws i5.l {
        if (lVar == null) {
            return;
        }
        if (m()) {
            lVar.p(this);
        } else {
            lVar.o(this);
        }
    }

    @Deprecated
    public void c(com.fasterxml.jackson.databind.node.u uVar, e0 e0Var) throws i5.l {
        j G = G();
        Type e10 = G == null ? e() : G.g();
        o<Object> I = I();
        if (I == null) {
            I = e0Var.g0(e(), this);
        }
        t(uVar, I instanceof c ? ((c) I).c(e0Var, e10, !m()) : t5.a.a());
    }

    public j e() {
        return this.U;
    }

    public void g(Object obj, w4.i iVar, e0 e0Var) throws Exception {
        Method method = this.Z;
        Object invoke = method == null ? this.f5031a0.get(obj) : method.invoke(obj, (Object[]) null);
        if (invoke == null) {
            o<Object> oVar = this.f5033c0;
            if (oVar != null) {
                oVar.m(null, iVar, e0Var);
            } else {
                iVar.k2();
            }
        } else {
            o<Object> oVar2 = this.f5032b0;
            if (oVar2 == null) {
                Class<?> cls = invoke.getClass();
                k kVar = this.f5035e0;
                o<Object> n10 = kVar.n(cls);
                oVar2 = n10 == null ? u(kVar, cls, e0Var) : n10;
            }
            Object obj2 = this.f5037g0;
            if (obj2 != null) {
                if (f5030k0 == obj2) {
                    if (oVar2.h(e0Var, invoke)) {
                        s(obj, iVar, e0Var);
                        return;
                    }
                } else if (obj2.equals(invoke)) {
                    s(obj, iVar, e0Var);
                    return;
                }
            }
            if (invoke != obj || !v(obj, iVar, e0Var, oVar2)) {
                i iVar2 = this.f5034d0;
                if (iVar2 == null) {
                    oVar2.m(invoke, iVar, e0Var);
                } else {
                    oVar2.n(invoke, iVar, e0Var, iVar2);
                }
            }
        }
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        h hVar = this.Y;
        if (hVar == null) {
            return null;
        }
        return hVar.d(cls);
    }

    public String getName() {
        return this.S.getValue();
    }

    public void h(Object obj, w4.i iVar, e0 e0Var) throws Exception {
        Method method = this.Z;
        Object invoke = method == null ? this.f5031a0.get(obj) : method.invoke(obj, (Object[]) null);
        if (invoke != null) {
            o<Object> oVar = this.f5032b0;
            if (oVar == null) {
                Class<?> cls = invoke.getClass();
                k kVar = this.f5035e0;
                o<Object> n10 = kVar.n(cls);
                oVar = n10 == null ? u(kVar, cls, e0Var) : n10;
            }
            Object obj2 = this.f5037g0;
            if (obj2 != null) {
                if (f5030k0 == obj2) {
                    if (oVar.h(e0Var, invoke)) {
                        return;
                    }
                } else if (obj2.equals(invoke)) {
                    return;
                }
            }
            if (invoke != obj || !v(obj, iVar, e0Var, oVar)) {
                iVar.j2(this.S);
                i iVar2 = this.f5034d0;
                if (iVar2 == null) {
                    oVar.m(invoke, iVar, e0Var);
                } else {
                    oVar.n(invoke, iVar, e0Var, iVar2);
                }
            }
        } else if (this.f5033c0 != null) {
            iVar.j2(this.S);
            this.f5033c0.m(null, iVar, e0Var);
        }
    }

    public h i() {
        return this.Y;
    }

    public <A extends Annotation> A l(Class<A> cls) {
        b bVar = this.X;
        if (bVar == null) {
            return null;
        }
        return bVar.a(cls);
    }

    public y o() {
        return this.T;
    }

    public void r(Object obj, w4.i iVar, e0 e0Var) throws Exception {
        if (!iVar.l()) {
            iVar.G2(this.S.getValue());
        }
    }

    public void s(Object obj, w4.i iVar, e0 e0Var) throws Exception {
        o<Object> oVar = this.f5033c0;
        if (oVar != null) {
            oVar.m(null, iVar, e0Var);
        } else {
            iVar.k2();
        }
    }

    public void t(com.fasterxml.jackson.databind.node.u uVar, i5.m mVar) {
        uVar.n2(getName(), mVar);
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("property '");
        sb2.append(getName());
        sb2.append("' (");
        if (this.Z != null) {
            sb2.append("via method ");
            sb2.append(this.Z.getDeclaringClass().getName());
            sb2.append("#");
            str = this.Z.getName();
        } else if (this.f5031a0 != null) {
            sb2.append("field \"");
            sb2.append(this.f5031a0.getDeclaringClass().getName());
            sb2.append("#");
            str = this.f5031a0.getName();
        } else {
            str = "virtual";
        }
        sb2.append(str);
        if (this.f5032b0 == null) {
            str2 = ", no static serializer";
        } else {
            str2 = ", static serializer of type " + this.f5032b0.getClass().getName();
        }
        sb2.append(str2);
        sb2.append(')');
        return sb2.toString();
    }

    public o<Object> u(k kVar, Class<?> cls, e0 e0Var) throws i5.l {
        j jVar = this.W;
        k.d g10 = jVar != null ? kVar.g(e0Var.k(jVar, cls), e0Var, this) : kVar.h(cls, e0Var, this);
        k kVar2 = g10.f15105b;
        if (kVar != kVar2) {
            this.f5035e0 = kVar2;
        }
        return g10.f15104a;
    }

    public boolean v(Object obj, w4.i iVar, e0 e0Var, o<?> oVar) throws IOException {
        if (oVar.p()) {
            return false;
        }
        if (e0Var.w0(d0.FAIL_ON_SELF_REFERENCES)) {
            if (!(oVar instanceof y5.d)) {
                return false;
            }
            e0Var.z(e(), "Direct self-reference leading to cycle");
            return false;
        } else if (!e0Var.w0(d0.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        } else {
            if (this.f5033c0 == null) {
                return true;
            }
            if (!iVar.T0().k()) {
                iVar.j2(this.S);
            }
            this.f5033c0.m(null, iVar, e0Var);
            return true;
        }
    }

    public d w(y yVar) {
        return new d(this, yVar);
    }

    public void x(o<Object> oVar) {
        o<Object> oVar2 = this.f5033c0;
        if (oVar2 == null || oVar2 == oVar) {
            this.f5033c0 = oVar;
        } else {
            throw new IllegalStateException(String.format("Cannot override _nullSerializer: had a %s, trying to set to %s", new Object[]{a6.h.h(this.f5033c0), a6.h.h(oVar)}));
        }
    }

    public void y(o<Object> oVar) {
        o<Object> oVar2 = this.f5032b0;
        if (oVar2 == null || oVar2 == oVar) {
            this.f5032b0 = oVar;
        } else {
            throw new IllegalStateException(String.format("Cannot override _serializer: had a %s, trying to set to %s", new Object[]{a6.h.h(this.f5032b0), a6.h.h(oVar)}));
        }
    }

    public void z(i iVar) {
        this.f5034d0 = iVar;
    }
}

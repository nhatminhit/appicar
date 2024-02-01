package m5;

import a6.s;
import i5.f;
import i5.g;
import i5.h;
import i5.j;
import i5.k;
import java.io.IOException;
import java.util.Set;
import l5.d;
import l5.v;
import q5.i;
import w4.l;
import w4.p;

public class a extends d {

    /* renamed from: s0  reason: collision with root package name */
    public static final long f10357s0 = 1;

    /* renamed from: o0  reason: collision with root package name */
    public final d f10358o0;

    /* renamed from: p0  reason: collision with root package name */
    public final v[] f10359p0;

    /* renamed from: q0  reason: collision with root package name */
    public final i f10360q0;

    /* renamed from: r0  reason: collision with root package name */
    public final j f10361r0;

    public a(d dVar, j jVar, v[] vVarArr, i iVar) {
        super(dVar);
        this.f10358o0 = dVar;
        this.f10361r0 = jVar;
        this.f10359p0 = vVarArr;
        this.f10360q0 = iVar;
    }

    public final Object A1(g gVar, Object obj) throws IOException {
        try {
            return this.f10360q0.p().invoke(obj, (Object[]) null);
        } catch (Exception e10) {
            return x1(e10, gVar);
        }
    }

    public final Object G0(l lVar, g gVar) throws IOException {
        v vVar = this.Y;
        y h10 = vVar.h(lVar, gVar, this.f10148l0);
        v[] vVarArr = this.f10359p0;
        int length = vVarArr.length;
        Class<?> n10 = this.f10143g0 ? gVar.n() : null;
        Object obj = null;
        int i10 = 0;
        while (lVar.D2() != p.END_ARRAY) {
            v vVar2 = i10 < length ? vVarArr[i10] : null;
            if (vVar2 == null || (n10 != null && !vVar2.R(n10))) {
                lVar.Z2();
            } else if (obj != null) {
                try {
                    obj = vVar2.u(lVar, gVar, obj);
                } catch (Exception e10) {
                    w1(e10, obj, vVar2.getName(), gVar);
                }
            } else {
                String name = vVar2.getName();
                v f10 = vVar.f(name);
                if (f10 != null) {
                    if (h10.b(f10, f10.s(lVar, gVar))) {
                        try {
                            obj = vVar.a(gVar, h10);
                            if (obj.getClass() != this.T.g()) {
                                j jVar = this.T;
                                return gVar.z(jVar, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", new Object[]{jVar.g().getName(), obj.getClass().getName()}));
                            }
                        } catch (Exception e11) {
                            w1(e11, this.T.g(), name, gVar);
                        }
                    } else {
                        continue;
                    }
                } else if (!h10.l(name)) {
                    h10.e(vVar2, vVar2.s(lVar, gVar));
                }
            }
            i10++;
        }
        if (obj != null) {
            return obj;
        }
        try {
            return vVar.a(gVar, h10);
        } catch (Exception e12) {
            return x1(e12, gVar);
        }
    }

    public d Q0() {
        return this;
    }

    public Object X0(l lVar, g gVar) throws IOException {
        return y1(lVar, gVar);
    }

    public Object f(l lVar, g gVar) throws IOException {
        Object z12;
        if (!lVar.u2()) {
            z12 = y1(lVar, gVar);
        } else if (!this.f10137a0) {
            z12 = z1(lVar, gVar);
        } else {
            Object t10 = this.V.t(gVar);
            v[] vVarArr = this.f10359p0;
            int length = vVarArr.length;
            int i10 = 0;
            while (lVar.D2() != p.END_ARRAY) {
                if (i10 == length) {
                    if (!this.f10142f0 && gVar.v0(h.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        gVar.P0(r(), "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                    }
                    while (lVar.D2() != p.END_ARRAY) {
                        lVar.Z2();
                    }
                    return A1(gVar, t10);
                }
                v vVar = vVarArr[i10];
                if (vVar != null) {
                    try {
                        t10 = vVar.u(lVar, gVar, t10);
                    } catch (Exception e10) {
                        w1(e10, t10, vVar.getName(), gVar);
                    }
                } else {
                    lVar.Z2();
                }
                i10++;
            }
            return A1(gVar, t10);
        }
        return A1(gVar, z12);
    }

    public Object g(l lVar, g gVar, Object obj) throws IOException {
        return this.f10358o0.g(lVar, gVar, obj);
    }

    public d s1(c cVar) {
        return new a(this.f10358o0.s1(cVar), this.f10361r0, this.f10359p0, this.f10360q0);
    }

    public d t1(Set<String> set) {
        return new a(this.f10358o0.t1(set), this.f10361r0, this.f10359p0, this.f10360q0);
    }

    public Boolean u(f fVar) {
        return Boolean.FALSE;
    }

    public d u1(boolean z10) {
        return new a(this.f10358o0.u1(z10), this.f10361r0, this.f10359p0, this.f10360q0);
    }

    public k<Object> v(s sVar) {
        return this.f10358o0.v(sVar);
    }

    public d v1(s sVar) {
        return new a(this.f10358o0.v1(sVar), this.f10361r0, this.f10359p0, this.f10360q0);
    }

    public Object y1(l lVar, g gVar) throws IOException {
        return gVar.h0(y0(gVar), lVar.Z0(), lVar, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this.T.g().getName(), lVar.Z0());
    }

    public Object z1(l lVar, g gVar) throws IOException {
        if (this.Z) {
            return Z0(lVar, gVar);
        }
        Object t10 = this.V.t(gVar);
        if (this.f10139c0 != null) {
            o1(gVar, t10);
        }
        Class<?> n10 = this.f10143g0 ? gVar.n() : null;
        v[] vVarArr = this.f10359p0;
        int length = vVarArr.length;
        int i10 = 0;
        while (true) {
            p D2 = lVar.D2();
            p pVar = p.END_ARRAY;
            if (D2 == pVar) {
                return t10;
            }
            if (i10 == length) {
                if (!this.f10142f0 && gVar.v0(h.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    gVar.Y0(this, pVar, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                while (lVar.D2() != p.END_ARRAY) {
                    lVar.Z2();
                }
                return t10;
            }
            v vVar = vVarArr[i10];
            i10++;
            if (vVar == null || (n10 != null && !vVar.R(n10))) {
                lVar.Z2();
            } else {
                try {
                    vVar.u(lVar, gVar, t10);
                } catch (Exception e10) {
                    w1(e10, t10, vVar.getName(), gVar);
                }
            }
        }
    }
}

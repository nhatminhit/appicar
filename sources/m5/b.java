package m5;

import a6.s;
import i5.g;
import i5.h;
import i5.j;
import i5.k;
import java.io.IOException;
import java.util.Set;
import l5.d;
import l5.v;
import w4.l;
import w4.p;

public class b extends d {

    /* renamed from: q0  reason: collision with root package name */
    public static final long f10365q0 = 1;

    /* renamed from: o0  reason: collision with root package name */
    public final d f10366o0;

    /* renamed from: p0  reason: collision with root package name */
    public final v[] f10367p0;

    public b(d dVar, v[] vVarArr) {
        super(dVar);
        this.f10366o0 = dVar;
        this.f10367p0 = vVarArr;
    }

    public final Object G0(l lVar, g gVar) throws IOException {
        v vVar = this.Y;
        y h10 = vVar.h(lVar, gVar, this.f10148l0);
        v[] vVarArr = this.f10367p0;
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
                    vVar2.t(lVar, gVar, obj);
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
                            lVar.T2(obj);
                            if (obj.getClass() != this.T.g()) {
                                j jVar = this.T;
                                gVar.z(jVar, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", new Object[]{jVar.g().getName(), obj.getClass().getName()}));
                            }
                        } catch (Exception e11) {
                            w1(e11, this.T.g(), name, gVar);
                        }
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
        if (!lVar.u2()) {
            return y1(lVar, gVar);
        }
        if (!this.f10137a0) {
            return z1(lVar, gVar);
        }
        Object t10 = this.V.t(gVar);
        lVar.T2(t10);
        v[] vVarArr = this.f10367p0;
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
                    gVar.Y0(this, pVar, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    lVar.Z2();
                } while (lVar.D2() != p.END_ARRAY);
                return t10;
            }
            v vVar = vVarArr[i10];
            if (vVar != null) {
                try {
                    vVar.t(lVar, gVar, t10);
                } catch (Exception e10) {
                    w1(e10, t10, vVar.getName(), gVar);
                }
            } else {
                lVar.Z2();
            }
            i10++;
        }
    }

    public Object g(l lVar, g gVar, Object obj) throws IOException {
        lVar.T2(obj);
        if (!lVar.u2()) {
            return y1(lVar, gVar);
        }
        if (this.f10139c0 != null) {
            o1(gVar, obj);
        }
        v[] vVarArr = this.f10367p0;
        int length = vVarArr.length;
        int i10 = 0;
        while (true) {
            p D2 = lVar.D2();
            p pVar = p.END_ARRAY;
            if (D2 == pVar) {
                return obj;
            }
            if (i10 == length) {
                if (!this.f10142f0 && gVar.v0(h.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    gVar.Y0(this, pVar, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    lVar.Z2();
                } while (lVar.D2() != p.END_ARRAY);
                return obj;
            }
            v vVar = vVarArr[i10];
            if (vVar != null) {
                try {
                    vVar.t(lVar, gVar, obj);
                } catch (Exception e10) {
                    w1(e10, obj, vVar.getName(), gVar);
                }
            } else {
                lVar.Z2();
            }
            i10++;
        }
    }

    public d s1(c cVar) {
        return new b(this.f10366o0.s1(cVar), this.f10367p0);
    }

    public d t1(Set<String> set) {
        return new b(this.f10366o0.t1(set), this.f10367p0);
    }

    public d u1(boolean z10) {
        return new b(this.f10366o0.u1(z10), this.f10367p0);
    }

    public k<Object> v(s sVar) {
        return this.f10366o0.v(sVar);
    }

    public d v1(s sVar) {
        return new b(this.f10366o0.v1(sVar), this.f10367p0);
    }

    public Object y1(l lVar, g gVar) throws IOException {
        return gVar.h0(y0(gVar), lVar.Z0(), lVar, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this.T.g().getName(), lVar.Z0());
    }

    public Object z1(l lVar, g gVar) throws IOException {
        if (this.Z) {
            return Z0(lVar, gVar);
        }
        Object t10 = this.V.t(gVar);
        lVar.T2(t10);
        if (this.f10139c0 != null) {
            o1(gVar, t10);
        }
        Class<?> n10 = this.f10143g0 ? gVar.n() : null;
        v[] vVarArr = this.f10367p0;
        int length = vVarArr.length;
        int i10 = 0;
        while (true) {
            p D2 = lVar.D2();
            p pVar = p.END_ARRAY;
            if (D2 == pVar) {
                return t10;
            }
            if (i10 == length) {
                if (!this.f10142f0) {
                    gVar.Y0(this, pVar, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    lVar.Z2();
                } while (lVar.D2() != p.END_ARRAY);
                return t10;
            }
            v vVar = vVarArr[i10];
            i10++;
            if (vVar == null || (n10 != null && !vVar.R(n10))) {
                lVar.Z2();
            } else {
                try {
                    vVar.t(lVar, gVar, t10);
                } catch (Exception e10) {
                    w1(e10, t10, vVar.getName(), gVar);
                }
            }
        }
    }
}

package n5;

import a6.s;
import i5.g;
import i5.k;
import java.io.IOException;
import java.util.Set;
import l5.c;
import l5.d;
import l5.u;
import l5.v;
import l5.y;
import w4.l;
import w4.p;

public class j0 extends c {

    /* renamed from: r0  reason: collision with root package name */
    public static final long f10841r0 = 1;

    /* renamed from: s0  reason: collision with root package name */
    public static final String f10842s0 = "message";

    public j0(c cVar) {
        super(cVar);
        this.f10137a0 = false;
    }

    public j0(c cVar, s sVar) {
        super((d) cVar, sVar);
    }

    public Object X0(l lVar, g gVar) throws IOException {
        if (this.Y != null) {
            return G0(lVar, gVar);
        }
        k<Object> kVar = this.W;
        if (kVar != null) {
            return this.V.u(gVar, kVar.f(lVar, gVar));
        }
        if (this.T.k()) {
            return gVar.c0(r(), e(), lVar, "abstract type (need to add/enable type information?)", new Object[0]);
        }
        boolean g10 = this.V.g();
        boolean i10 = this.V.i();
        if (g10 || i10) {
            int i11 = 0;
            Object obj = null;
            Object[] objArr = null;
            while (!lVar.q2(p.END_OBJECT)) {
                String X0 = lVar.X0();
                v s10 = this.f10138b0.s(X0);
                lVar.D2();
                if (s10 != null) {
                    if (obj != null) {
                        s10.t(lVar, gVar, obj);
                    } else {
                        if (objArr == null) {
                            int size = this.f10138b0.size();
                            objArr = new Object[(size + size)];
                        }
                        int i12 = i11 + 1;
                        objArr[i11] = s10;
                        i11 = i12 + 1;
                        objArr[i12] = s10.s(lVar, gVar);
                    }
                } else if (!"message".equals(X0) || !g10) {
                    Set<String> set = this.f10141e0;
                    if (set == null || !set.contains(X0)) {
                        u uVar = this.f10140d0;
                        if (uVar != null) {
                            uVar.c(lVar, gVar, obj, X0);
                        } else {
                            A0(lVar, gVar, obj, X0);
                        }
                    } else {
                        lVar.Z2();
                    }
                } else {
                    obj = this.V.r(gVar, lVar.m2());
                    if (objArr != null) {
                        for (int i13 = 0; i13 < i11; i13 += 2) {
                            ((v) objArr[i13]).M(obj, objArr[i13 + 1]);
                        }
                        objArr = null;
                    }
                }
                lVar.D2();
            }
            if (obj == null) {
                y yVar = this.V;
                obj = g10 ? yVar.r(gVar, (String) null) : yVar.t(gVar);
                if (objArr != null) {
                    for (int i14 = 0; i14 < i11; i14 += 2) {
                        ((v) objArr[i14]).M(obj, objArr[i14 + 1]);
                    }
                }
            }
            return obj;
        }
        return gVar.c0(r(), e(), lVar, "Throwable needs a default constructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
    }

    public k<Object> v(s sVar) {
        return getClass() != j0.class ? this : new j0(this, sVar);
    }
}

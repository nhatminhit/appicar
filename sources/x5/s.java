package x5;

import c5.m;
import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.ser.d;
import i5.e0;
import i5.j;
import i5.o;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import s5.g;
import s5.l;
import w4.i;

public class s extends d implements Serializable {

    /* renamed from: m0  reason: collision with root package name */
    public static final long f15118m0 = 1;

    /* renamed from: l0  reason: collision with root package name */
    public final a6.s f15119l0;

    public class a extends g.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l f15120b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var, l lVar) {
            super(e0Var);
            this.f15120b = lVar;
        }

        public l k(j jVar) throws i5.l {
            return this.f15120b;
        }
    }

    public s(d dVar, a6.s sVar) {
        super(dVar);
        this.f15119l0 = sVar;
    }

    public s(s sVar, a6.s sVar2, m mVar) {
        super((d) sVar, mVar);
        this.f15119l0 = sVar2;
    }

    public boolean N() {
        return true;
    }

    public s W(a6.s sVar, m mVar) {
        return new s(this, sVar, mVar);
    }

    /* renamed from: X */
    public s Q(a6.s sVar) {
        return W(a6.s.a(sVar, this.f15119l0), new m(sVar.d(this.S.getValue())));
    }

    public void b(l lVar, e0 e0Var) throws i5.l {
        o<Object> o10 = e0Var.g0(e(), this).o(this.f15119l0);
        if (o10.j()) {
            o10.e(new a(e0Var, lVar), e());
        } else {
            super.b(lVar, e0Var);
        }
    }

    public void h(Object obj, i iVar, e0 e0Var) throws Exception {
        Object B = B(obj);
        if (B != null) {
            o<Object> oVar = this.f5032b0;
            if (oVar == null) {
                Class<?> cls = B.getClass();
                k kVar = this.f5035e0;
                o<Object> n10 = kVar.n(cls);
                oVar = n10 == null ? u(kVar, cls, e0Var) : n10;
            }
            Object obj2 = this.f5037g0;
            if (obj2 != null) {
                if (d.f5030k0 == obj2) {
                    if (oVar.h(e0Var, B)) {
                        return;
                    }
                } else if (obj2.equals(B)) {
                    return;
                }
            }
            if (B != obj || !v(obj, iVar, e0Var, oVar)) {
                if (!oVar.j()) {
                    iVar.j2(this.S);
                }
                u5.i iVar2 = this.f5034d0;
                if (iVar2 == null) {
                    oVar.m(B, iVar, e0Var);
                } else {
                    oVar.n(B, iVar, e0Var, iVar2);
                }
            }
        }
    }

    public void t(u uVar, i5.m mVar) {
        i5.m G0 = mVar.g("properties");
        if (G0 != null) {
            Iterator<Map.Entry<String, i5.m>> u02 = G0.u0();
            while (u02.hasNext()) {
                Map.Entry next = u02.next();
                String str = (String) next.getKey();
                a6.s sVar = this.f15119l0;
                if (sVar != null) {
                    str = sVar.d(str);
                }
                uVar.n2(str, (i5.m) next.getValue());
            }
        }
    }

    public o<Object> u(k kVar, Class<?> cls, e0 e0Var) throws i5.l {
        j jVar = this.W;
        o<Object> g02 = jVar != null ? e0Var.g0(e0Var.k(jVar, cls), this) : e0Var.i0(cls, this);
        a6.s sVar = this.f15119l0;
        if (g02.j() && (g02 instanceof t)) {
            sVar = a6.s.a(sVar, ((t) g02).f15123b0);
        }
        o<Object> o10 = g02.o(sVar);
        this.f5035e0 = this.f5035e0.m(cls, o10);
        return o10;
    }

    public void y(o<Object> oVar) {
        if (oVar != null) {
            a6.s sVar = this.f15119l0;
            if (oVar.j() && (oVar instanceof t)) {
                sVar = a6.s.a(sVar, ((t) oVar).f15123b0);
            }
            oVar = oVar.o(sVar);
        }
        super.y(oVar);
    }
}

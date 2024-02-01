package m5;

import i5.g;
import i5.h;
import java.io.IOException;
import java.util.BitSet;
import l5.u;
import l5.v;
import m5.x;
import w4.l;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public final l f10457a;

    /* renamed from: b  reason: collision with root package name */
    public final g f10458b;

    /* renamed from: c  reason: collision with root package name */
    public final s f10459c;

    /* renamed from: d  reason: collision with root package name */
    public final Object[] f10460d;

    /* renamed from: e  reason: collision with root package name */
    public int f10461e;

    /* renamed from: f  reason: collision with root package name */
    public int f10462f;

    /* renamed from: g  reason: collision with root package name */
    public final BitSet f10463g;

    /* renamed from: h  reason: collision with root package name */
    public x f10464h;

    /* renamed from: i  reason: collision with root package name */
    public Object f10465i;

    public y(l lVar, g gVar, int i10, s sVar) {
        this.f10457a = lVar;
        this.f10458b = gVar;
        this.f10461e = i10;
        this.f10459c = sVar;
        this.f10460d = new Object[i10];
        this.f10463g = i10 < 32 ? null : new BitSet();
    }

    public Object a(v vVar) throws i5.l {
        if (vVar.z() != null) {
            return this.f10458b.M(vVar.z(), vVar, (Object) null);
        }
        if (vVar.m()) {
            this.f10458b.M0(vVar, "Missing required creator property '%s' (index %d)", vVar.getName(), Integer.valueOf(vVar.x()));
        }
        if (this.f10458b.v0(h.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            this.f10458b.M0(vVar, "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", vVar.getName(), Integer.valueOf(vVar.x()));
        }
        try {
            Object d10 = vVar.B().d(this.f10458b);
            return d10 != null ? d10 : vVar.E().d(this.f10458b);
        } catch (i5.l e10) {
            q5.h i10 = vVar.i();
            if (i10 != null) {
                e10.v(i10.n(), vVar.getName());
            }
            throw e10;
        }
    }

    public boolean b(v vVar, Object obj) {
        int x10 = vVar.x();
        this.f10460d[x10] = obj;
        BitSet bitSet = this.f10463g;
        if (bitSet == null) {
            int i10 = this.f10462f;
            int i11 = (1 << x10) | i10;
            if (i10 != i11) {
                this.f10462f = i11;
                int i12 = this.f10461e - 1;
                this.f10461e = i12;
                if (i12 <= 0) {
                    return this.f10459c == null || this.f10465i != null;
                }
            }
        } else if (!bitSet.get(x10)) {
            this.f10463g.set(x10);
            this.f10461e--;
        }
        return false;
    }

    public void c(u uVar, String str, Object obj) {
        this.f10464h = new x.a(this.f10464h, obj, uVar, str);
    }

    public void d(Object obj, Object obj2) {
        this.f10464h = new x.b(this.f10464h, obj2, obj);
    }

    public void e(v vVar, Object obj) {
        this.f10464h = new x.c(this.f10464h, obj, vVar);
    }

    public x f() {
        return this.f10464h;
    }

    public Object g(v vVar) throws i5.l {
        Object obj;
        if (j(vVar)) {
            obj = this.f10460d[vVar.x()];
        } else {
            Object[] objArr = this.f10460d;
            int x10 = vVar.x();
            Object a10 = a(vVar);
            objArr[x10] = a10;
            obj = a10;
        }
        if (obj != null || !this.f10458b.v0(h.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            return obj;
        }
        return this.f10458b.M0(vVar, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_FOR_CREATOR_PARAMETERS` enabled", vVar.getName(), Integer.valueOf(vVar.x()));
    }

    public Object[] h(v[] vVarArr) throws i5.l {
        if (this.f10461e > 0) {
            if (this.f10463g != null) {
                int length = this.f10460d.length;
                int i10 = 0;
                while (true) {
                    int nextClearBit = this.f10463g.nextClearBit(i10);
                    if (nextClearBit >= length) {
                        break;
                    }
                    this.f10460d[nextClearBit] = a(vVarArr[nextClearBit]);
                    i10 = nextClearBit + 1;
                }
            } else {
                int i11 = this.f10462f;
                int length2 = this.f10460d.length;
                int i12 = 0;
                while (i12 < length2) {
                    if ((i11 & 1) == 0) {
                        this.f10460d[i12] = a(vVarArr[i12]);
                    }
                    i12++;
                    i11 >>= 1;
                }
            }
        }
        if (this.f10458b.v0(h.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            for (int i13 = 0; i13 < vVarArr.length; i13++) {
                if (this.f10460d[i13] == null) {
                    v vVar = vVarArr[i13];
                    this.f10458b.M0(vVar, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_FOR_CREATOR_PARAMETERS` enabled", vVar.getName(), Integer.valueOf(vVarArr[i13].x()));
                }
            }
        }
        return this.f10460d;
    }

    public Object i(g gVar, Object obj) throws IOException {
        s sVar = this.f10459c;
        if (sVar != null) {
            Object obj2 = this.f10465i;
            if (obj2 != null) {
                gVar.P(obj2, sVar.Q, sVar.R).b(obj);
                v vVar = this.f10459c.T;
                if (vVar != null) {
                    return vVar.N(obj, this.f10465i);
                }
            } else {
                gVar.W0(sVar, obj);
            }
        }
        return obj;
    }

    public final boolean j(v vVar) {
        BitSet bitSet = this.f10463g;
        return bitSet == null ? ((this.f10462f >> vVar.x()) & 1) == 1 : bitSet.get(vVar.x());
    }

    public boolean k() {
        return this.f10461e <= 0;
    }

    public boolean l(String str) throws IOException {
        s sVar = this.f10459c;
        if (sVar == null || !str.equals(sVar.P.d())) {
            return false;
        }
        this.f10465i = this.f10459c.f(this.f10457a, this.f10458b);
        return true;
    }
}

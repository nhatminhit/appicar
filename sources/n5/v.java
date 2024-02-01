package n5;

import a6.u;
import i5.d;
import i5.g;
import i5.h;
import i5.j;
import i5.k;
import j5.a;
import java.io.IOException;
import java.lang.reflect.Array;
import l5.i;
import l5.s;
import u5.f;
import v4.n;
import w4.l;
import w4.p;

@a
public class v extends g<Object[]> implements i {

    /* renamed from: b0  reason: collision with root package name */
    public static final long f10885b0 = 1;

    /* renamed from: c0  reason: collision with root package name */
    public static final Object[] f10886c0 = new Object[0];
    public final boolean X;
    public final Class<?> Y;
    public k<Object> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final f f10887a0;

    public v(j jVar, k<Object> kVar, f fVar) {
        super(jVar, (s) null, (Boolean) null);
        Class<?> g10 = jVar.d().g();
        this.Y = g10;
        this.X = g10 == Object.class;
        this.Z = kVar;
        this.f10887a0 = fVar;
    }

    public v(v vVar, k<Object> kVar, f fVar, s sVar, Boolean bool) {
        super((g<?>) vVar, sVar, bool);
        this.Y = vVar.Y;
        this.X = vVar.X;
        this.Z = kVar;
        this.f10887a0 = fVar;
    }

    public k<Object> E0() {
        return this.Z;
    }

    /* renamed from: H0 */
    public Object[] f(l lVar, g gVar) throws IOException {
        Object obj;
        if (!lVar.u2()) {
            return L0(lVar, gVar);
        }
        u x02 = gVar.x0();
        Object[] i10 = x02.i();
        f fVar = this.f10887a0;
        int i11 = 0;
        while (true) {
            try {
                p D2 = lVar.D2();
                if (D2 == p.END_ARRAY) {
                    break;
                }
                if (D2 != p.VALUE_NULL) {
                    obj = fVar == null ? this.Z.f(lVar, gVar) : this.Z.h(lVar, gVar, fVar);
                } else if (!this.V) {
                    obj = this.U.d(gVar);
                }
                if (i11 >= i10.length) {
                    i10 = x02.c(i10);
                    i11 = 0;
                }
                int i12 = i11 + 1;
                try {
                    i10[i11] = obj;
                    i11 = i12;
                } catch (Exception e10) {
                    e = e10;
                    i11 = i12;
                    throw i5.l.x(e, i10, x02.d() + i11);
                }
            } catch (Exception e11) {
                e = e11;
                throw i5.l.x(e, i10, x02.d() + i11);
            }
        }
        Object[] f10 = this.X ? x02.f(i10, i11) : x02.g(i10, i11, this.Y);
        gVar.b1(x02);
        return f10;
    }

    /* renamed from: I0 */
    public Object[] g(l lVar, g gVar, Object[] objArr) throws IOException {
        Object obj;
        if (!lVar.u2()) {
            Object[] L0 = L0(lVar, gVar);
            if (L0 == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArr2 = new Object[(L0.length + length)];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            System.arraycopy(L0, 0, objArr2, length, L0.length);
            return objArr2;
        }
        u x02 = gVar.x0();
        int length2 = objArr.length;
        Object[] j10 = x02.j(objArr, length2);
        f fVar = this.f10887a0;
        while (true) {
            try {
                p D2 = lVar.D2();
                if (D2 == p.END_ARRAY) {
                    break;
                }
                if (D2 != p.VALUE_NULL) {
                    obj = fVar == null ? this.Z.f(lVar, gVar) : this.Z.h(lVar, gVar, fVar);
                } else if (!this.V) {
                    obj = this.U.d(gVar);
                }
                if (length2 >= j10.length) {
                    j10 = x02.c(j10);
                    length2 = 0;
                }
                int i10 = length2 + 1;
                try {
                    j10[length2] = obj;
                    length2 = i10;
                } catch (Exception e10) {
                    e = e10;
                    length2 = i10;
                    throw i5.l.x(e, j10, x02.d() + length2);
                }
            } catch (Exception e11) {
                e = e11;
                throw i5.l.x(e, j10, x02.d() + length2);
            }
        }
        Object[] f10 = this.X ? x02.f(j10, length2) : x02.g(j10, length2, this.Y);
        gVar.b1(x02);
        return f10;
    }

    public Byte[] J0(l lVar, g gVar) throws IOException {
        byte[] m02 = lVar.m0(gVar.S());
        Byte[] bArr = new Byte[m02.length];
        int length = m02.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = Byte.valueOf(m02[i10]);
        }
        return bArr;
    }

    /* renamed from: K0 */
    public Object[] h(l lVar, g gVar, f fVar) throws IOException {
        return (Object[]) fVar.d(lVar, gVar);
    }

    public Object[] L0(l lVar, g gVar) throws IOException {
        Object obj;
        p pVar = p.VALUE_STRING;
        if (lVar.q2(pVar) && gVar.v0(h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && lVar.Y1().length() == 0) {
            return null;
        }
        Boolean bool = this.W;
        if (!(bool == Boolean.TRUE || (bool == null && gVar.v0(h.ACCEPT_SINGLE_VALUE_AS_ARRAY)))) {
            return (!lVar.q2(pVar) || this.Y != Byte.class) ? (Object[]) gVar.i0(this.T.g(), lVar) : J0(lVar, gVar);
        }
        if (!lVar.q2(p.VALUE_NULL)) {
            f fVar = this.f10887a0;
            obj = fVar == null ? this.Z.f(lVar, gVar) : this.Z.h(lVar, gVar, fVar);
        } else if (this.V) {
            return f10886c0;
        } else {
            obj = this.U.d(gVar);
        }
        Object[] objArr = this.X ? new Object[1] : (Object[]) Array.newInstance(this.Y, 1);
        objArr[0] = obj;
        return objArr;
    }

    public v M0(f fVar, k<?> kVar) {
        return N0(fVar, kVar, this.U, this.W);
    }

    public v N0(f fVar, k<?> kVar, s sVar, Boolean bool) {
        return (bool == this.W && sVar == this.U && kVar == this.Z && fVar == this.f10887a0) ? this : new v(this, kVar, fVar, sVar, bool);
    }

    public k<?> a(g gVar, d dVar) throws i5.l {
        k kVar = this.Z;
        Boolean t02 = t0(gVar, dVar, this.T.g(), n.a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        k r02 = r0(gVar, dVar, kVar);
        j G = this.T.d();
        k L = r02 == null ? gVar.L(G, dVar) : gVar.f0(r02, dVar, G);
        f fVar = this.f10887a0;
        if (fVar != null) {
            fVar = fVar.g(dVar);
        }
        return N0(fVar, L, p0(gVar, dVar, L), t02);
    }

    public a6.a l() {
        return a6.a.CONSTANT;
    }

    public Object n(g gVar) throws i5.l {
        return f10886c0;
    }

    public boolean s() {
        return this.Z == null && this.f10887a0 == null;
    }
}

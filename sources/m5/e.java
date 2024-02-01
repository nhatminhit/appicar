package m5;

import bc.p;
import i5.b;
import i5.c;
import i5.f;
import i5.g;
import i5.j;
import i5.l;
import i5.q;
import java.lang.reflect.Member;
import java.util.HashMap;
import k5.i;
import l5.v;
import l5.y;
import n5.f0;
import q5.h;
import q5.m;

public class e {

    /* renamed from: j  reason: collision with root package name */
    public static final int f10376j = 0;

    /* renamed from: k  reason: collision with root package name */
    public static final int f10377k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f10378l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static final int f10379m = 3;

    /* renamed from: n  reason: collision with root package name */
    public static final int f10380n = 4;

    /* renamed from: o  reason: collision with root package name */
    public static final int f10381o = 5;

    /* renamed from: p  reason: collision with root package name */
    public static final int f10382p = 6;

    /* renamed from: q  reason: collision with root package name */
    public static final int f10383q = 7;

    /* renamed from: r  reason: collision with root package name */
    public static final int f10384r = 8;

    /* renamed from: s  reason: collision with root package name */
    public static final String[] f10385s = {p.f16197p, "from-String", "from-int", "from-long", "from-double", "from-boolean", "delegate", "property-based"};

    /* renamed from: a  reason: collision with root package name */
    public final c f10386a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10387b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10388c;

    /* renamed from: d  reason: collision with root package name */
    public final m[] f10389d = new m[9];

    /* renamed from: e  reason: collision with root package name */
    public int f10390e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10391f = false;

    /* renamed from: g  reason: collision with root package name */
    public v[] f10392g;

    /* renamed from: h  reason: collision with root package name */
    public v[] f10393h;

    /* renamed from: i  reason: collision with root package name */
    public v[] f10394i;

    public e(c cVar, i<?> iVar) {
        this.f10386a = cVar;
        this.f10387b = iVar.c();
        this.f10388c = iVar.T(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    public final j a(g gVar, m mVar, v[] vVarArr) throws l {
        if (!this.f10391f || mVar == null) {
            return null;
        }
        int i10 = 0;
        if (vVarArr != null) {
            int length = vVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (vVarArr[i11] == null) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        }
        f T = gVar.q();
        j D = mVar.D(i10);
        b m10 = T.m();
        if (m10 == null) {
            return D;
        }
        q5.l A = mVar.A(i10);
        Object s10 = m10.s(A);
        return s10 != null ? D.i0(gVar.I(A, s10)) : m10.I0(T, A, D);
    }

    public final <T extends h> T b(T t10) {
        if (t10 != null && this.f10387b) {
            a6.h.g((Member) t10.c(), this.f10388c);
        }
        return t10;
    }

    public boolean c(m mVar) {
        return a6.h.V(mVar.n()) && "valueOf".equals(mVar.f());
    }

    public void d(m mVar, boolean z10) {
        p(mVar, 5, z10);
    }

    public void e(m mVar, boolean z10, v[] vVarArr, int i10) {
        if (mVar.D(i10).m()) {
            if (p(mVar, 8, z10)) {
                this.f10393h = vVarArr;
            }
        } else if (p(mVar, 6, z10)) {
            this.f10392g = vVarArr;
        }
    }

    public void f(m mVar, boolean z10) {
        p(mVar, 4, z10);
    }

    public void g(m mVar, boolean z10) {
        p(mVar, 2, z10);
    }

    public void h(m mVar, boolean z10) {
        p(mVar, 3, z10);
    }

    public void i(m mVar, boolean z10, v[] vVarArr) {
        Integer num;
        if (p(mVar, 7, z10)) {
            if (vVarArr.length > 1) {
                HashMap hashMap = new HashMap();
                int length = vVarArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String name = vVarArr[i10].getName();
                    if ((!name.isEmpty() || vVarArr[i10].z() == null) && (num = (Integer) hashMap.put(name, Integer.valueOf(i10))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", new Object[]{name, num, Integer.valueOf(i10), a6.h.e0(this.f10386a.x())}));
                    }
                }
            }
            this.f10394i = vVarArr;
        }
    }

    public void j(m mVar, boolean z10) {
        p(mVar, 1, z10);
    }

    public y k(g gVar) throws l {
        f T = gVar.q();
        j a10 = a(gVar, this.f10389d[6], this.f10392g);
        j a11 = a(gVar, this.f10389d[8], this.f10393h);
        f0 f0Var = new f0(T, this.f10386a.E());
        m[] mVarArr = this.f10389d;
        f0Var.L(mVarArr[0], mVarArr[6], a10, this.f10392g, mVarArr[7], this.f10394i);
        f0Var.G(this.f10389d[8], a11, this.f10393h);
        f0Var.M(this.f10389d[1]);
        f0Var.J(this.f10389d[2]);
        f0Var.K(this.f10389d[3]);
        f0Var.I(this.f10389d[4]);
        f0Var.H(this.f10389d[5]);
        return f0Var;
    }

    public boolean l() {
        return this.f10389d[0] != null;
    }

    public boolean m() {
        return this.f10389d[6] != null;
    }

    public boolean n() {
        return this.f10389d[7] != null;
    }

    public void o(m mVar) {
        this.f10389d[0] = (m) b(mVar);
    }

    public boolean p(m mVar, int i10, boolean z10) {
        boolean z11;
        int i11 = 1 << i10;
        this.f10391f = true;
        m mVar2 = this.f10389d[i10];
        if (mVar2 != null) {
            if ((this.f10390e & i11) == 0) {
                z11 = !z10;
            } else if (!z10) {
                return false;
            } else {
                z11 = true;
            }
            if (z11 && mVar2.getClass() == mVar.getClass()) {
                Class<?> E = mVar2.E(0);
                Class<?> E2 = mVar.E(0);
                if (E == E2) {
                    if (c(mVar)) {
                        return false;
                    }
                    if (!c(mVar2)) {
                        Object[] objArr = new Object[4];
                        objArr[0] = f10385s[i10];
                        objArr[1] = z10 ? "explicitly marked" : "implicitly discovered";
                        objArr[2] = mVar2;
                        objArr[3] = mVar;
                        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", objArr));
                    }
                } else if (E2.isAssignableFrom(E)) {
                    return false;
                }
            }
        }
        if (z10) {
            this.f10390e |= i11;
        }
        this.f10389d[i10] = (m) b(mVar);
        return true;
    }
}

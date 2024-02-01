package eb;

import dg.a;
import qa.f;

public class k {

    /* renamed from: i  reason: collision with root package name */
    public static final k[] f18575i;

    /* renamed from: j  reason: collision with root package name */
    public static k[] f18576j;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f18577a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18578b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18579c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18580d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18581e;

    /* renamed from: f  reason: collision with root package name */
    public final int f18582f;

    /* renamed from: g  reason: collision with root package name */
    public final int f18583g;

    /* renamed from: h  reason: collision with root package name */
    public final int f18584h;

    static {
        k[] kVarArr = {new k(false, 3, 5, 8, 8, 1), new k(false, 5, 7, 10, 10, 1), new k(true, 5, 7, 16, 6, 1), new k(false, 8, 10, 12, 12, 1), new k(true, 10, 11, 14, 6, 2), new k(false, 12, 12, 14, 14, 1), new k(true, 16, 14, 24, 10, 1), new k(false, 18, 14, 16, 16, 1), new k(false, 22, 18, 18, 18, 1), new k(true, 22, 18, 16, 10, 2), new k(false, 30, 20, 20, 20, 1), new k(true, 32, 24, 16, 14, 2), new k(false, 36, 24, 22, 22, 1), new k(false, 44, 28, 24, 24, 1), new k(true, 49, 28, 22, 14, 2), new k(false, 62, 36, 14, 14, 4), new k(false, 86, 42, 16, 16, 4), new k(false, 114, 48, 18, 18, 4), new k(false, 144, 56, 20, 20, 4), new k(false, 174, 68, 22, 22, 4), new k(false, a.Ye, 84, 24, 24, 4, 102, 42), new k(false, a.Fj, 112, 14, 14, 16, 140, 56), new k(false, a.Nr, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, 114, 48), new k(false, p3.a.f11391i1, 224, 20, 20, 16, 144, 56), new k(false, 696, a.Ti, 22, 22, 16, 174, 68), new k(false, 816, a.np, 24, 24, 16, 136, 56), new k(false, 1050, a.Sx, 18, 18, 36, 175, 68), new k(false, 1304, 496, 20, 20, 36, 163, 62), new d()};
        f18575i = kVarArr;
        f18576j = kVarArr;
    }

    public k(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(z10, i10, i11, i12, i13, i14, i10, i11);
    }

    public k(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f18577a = z10;
        this.f18578b = i10;
        this.f18579c = i11;
        this.f18580d = i12;
        this.f18581e = i13;
        this.f18582f = i14;
        this.f18583g = i15;
        this.f18584h = i16;
    }

    public static k m(int i10) {
        return p(i10, l.FORCE_NONE, true);
    }

    public static k n(int i10, l lVar) {
        return p(i10, lVar, true);
    }

    public static k o(int i10, l lVar, f fVar, f fVar2, boolean z10) {
        for (k kVar : f18576j) {
            if ((lVar != l.FORCE_SQUARE || !kVar.f18577a) && ((lVar != l.FORCE_RECTANGLE || kVar.f18577a) && ((fVar == null || (kVar.k() >= fVar.b() && kVar.j() >= fVar.a())) && ((fVar2 == null || (kVar.k() <= fVar2.b() && kVar.j() <= fVar2.a())) && i10 <= kVar.f18578b)))) {
                return kVar;
            }
        }
        if (!z10) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i10)));
    }

    public static k p(int i10, l lVar, boolean z10) {
        return o(i10, lVar, (f) null, (f) null, z10);
    }

    public static k q(int i10, boolean z10, boolean z11) {
        return p(i10, z10 ? l.FORCE_NONE : l.FORCE_SQUARE, z11);
    }

    public static void r(k[] kVarArr) {
        f18576j = kVarArr;
    }

    public int a() {
        return this.f18578b + this.f18579c;
    }

    public final int b() {
        return this.f18578b;
    }

    public int c(int i10) {
        return this.f18583g;
    }

    public final int d() {
        return this.f18579c;
    }

    public final int e(int i10) {
        return this.f18584h;
    }

    public final int f() {
        int i10 = this.f18582f;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (!(i10 == 2 || i10 == 4)) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i11;
    }

    public int g() {
        return this.f18578b / this.f18583g;
    }

    public final int h() {
        return l() * this.f18581e;
    }

    public final int i() {
        return f() * this.f18580d;
    }

    public final int j() {
        return h() + (l() << 1);
    }

    public final int k() {
        return i() + (f() << 1);
    }

    public final int l() {
        int i10 = this.f18582f;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18577a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        sb2.append(this.f18580d);
        sb2.append('x');
        sb2.append(this.f18581e);
        sb2.append(", symbol size ");
        sb2.append(k());
        sb2.append('x');
        sb2.append(j());
        sb2.append(", symbol data size ");
        sb2.append(i());
        sb2.append('x');
        sb2.append(h());
        sb2.append(", codewords ");
        sb2.append(this.f18578b);
        sb2.append('+');
        sb2.append(this.f18579c);
        return sb2.toString();
    }
}

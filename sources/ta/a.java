package ta;

import ab.c;
import ab.e;
import p7.f;
import qa.m;
import qa.t;
import ya.b;
import ya.i;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f23120g = {3808, 476, 2107, 1799};

    /* renamed from: a  reason: collision with root package name */
    public final b f23121a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f23122b;

    /* renamed from: c  reason: collision with root package name */
    public int f23123c;

    /* renamed from: d  reason: collision with root package name */
    public int f23124d;

    /* renamed from: e  reason: collision with root package name */
    public int f23125e;

    /* renamed from: f  reason: collision with root package name */
    public int f23126f;

    /* renamed from: ta.a$a  reason: collision with other inner class name */
    public static final class C0424a {

        /* renamed from: a  reason: collision with root package name */
        public final int f23127a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23128b;

        public C0424a(int i10, int i11) {
            this.f23127a = i10;
            this.f23128b = i11;
        }

        public int a() {
            return this.f23127a;
        }

        public int b() {
            return this.f23128b;
        }

        public t c() {
            return new t((float) this.f23127a, (float) this.f23128b);
        }

        public String toString() {
            return "<" + this.f23127a + f.f11698i + this.f23128b + '>';
        }
    }

    public a(b bVar) {
        this.f23121a = bVar;
    }

    public static float c(t tVar, t tVar2) {
        return za.a.a(tVar.c(), tVar.d(), tVar2.c(), tVar2.d());
    }

    public static float d(C0424a aVar, C0424a aVar2) {
        return za.a.b(aVar.a(), aVar.b(), aVar2.a(), aVar2.b());
    }

    public static t[] e(t[] tVarArr, int i10, int i11) {
        float f10 = ((float) i11) / (((float) i10) * 2.0f);
        float c10 = tVarArr[0].c() - tVarArr[2].c();
        float d10 = tVarArr[0].d() - tVarArr[2].d();
        float c11 = (tVarArr[0].c() + tVarArr[2].c()) / 2.0f;
        float d11 = (tVarArr[0].d() + tVarArr[2].d()) / 2.0f;
        float f11 = c10 * f10;
        float f12 = d10 * f10;
        t tVar = new t(c11 + f11, d11 + f12);
        t tVar2 = new t(c11 - f11, d11 - f12);
        float c12 = tVarArr[1].c() - tVarArr[3].c();
        float d12 = tVarArr[1].d() - tVarArr[3].d();
        float c13 = (tVarArr[1].c() + tVarArr[3].c()) / 2.0f;
        float d13 = (tVarArr[1].d() + tVarArr[3].d()) / 2.0f;
        float f13 = c12 * f10;
        float f14 = f10 * d12;
        return new t[]{tVar, new t(c13 + f13, d13 + f14), tVar2, new t(c13 - f13, d13 - f14)};
    }

    public static int i(long j10, boolean z10) throws m {
        int i10;
        int i11;
        if (z10) {
            i10 = 7;
            i11 = 2;
        } else {
            i10 = 10;
            i11 = 4;
        }
        int i12 = i10 - i11;
        int[] iArr = new int[i10];
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iArr[i13] = ((int) j10) & 15;
            j10 >>= 4;
        }
        try {
            new c(ab.a.f16032k).a(iArr, i12);
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 = (i14 << 4) + iArr[i15];
            }
            return i14;
        } catch (e unused) {
            throw m.a();
        }
    }

    public static int n(int[] iArr, int i10) throws m {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 = (i11 << 3) + ((i12 >> (i10 - 2)) << 1) + (i12 & 1);
        }
        int i13 = ((i11 & 1) << 11) + (i11 >> 1);
        for (int i14 = 0; i14 < 4; i14++) {
            if (Integer.bitCount(f23120g[i14] ^ i13) <= 2) {
                return i14;
            }
        }
        throw m.a();
    }

    public ra.a a() throws m {
        return b(false);
    }

    public ra.a b(boolean z10) throws m {
        t[] g10 = g(l());
        if (z10) {
            t tVar = g10[0];
            g10[0] = g10[2];
            g10[2] = tVar;
        }
        f(g10);
        b bVar = this.f23121a;
        int i10 = this.f23126f;
        return new ra.a(r(bVar, g10[i10 % 4], g10[(i10 + 1) % 4], g10[(i10 + 2) % 4], g10[(i10 + 3) % 4]), m(g10), this.f23122b, this.f23124d, this.f23123c);
    }

    public final void f(t[] tVarArr) throws m {
        int i10;
        long j10;
        long j11;
        if (!p(tVarArr[0]) || !p(tVarArr[1]) || !p(tVarArr[2]) || !p(tVarArr[3])) {
            throw m.a();
        }
        int i11 = this.f23125e * 2;
        int[] iArr = {s(tVarArr[0], tVarArr[1], i11), s(tVarArr[1], tVarArr[2], i11), s(tVarArr[2], tVarArr[3], i11), s(tVarArr[3], tVarArr[0], i11)};
        this.f23126f = n(iArr, i11);
        long j12 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = iArr[(this.f23126f + i12) % 4];
            if (this.f23122b) {
                j11 = j12 << 7;
                j10 = (long) ((i13 >> 1) & 127);
            } else {
                j11 = j12 << 10;
                j10 = (long) (((i13 >> 2) & 992) + ((i13 >> 1) & 31));
            }
            j12 = j11 + j10;
        }
        int i14 = i(j12, this.f23122b);
        if (this.f23122b) {
            this.f23123c = (i14 >> 6) + 1;
            i10 = i14 & 63;
        } else {
            this.f23123c = (i14 >> 11) + 1;
            i10 = i14 & 2047;
        }
        this.f23124d = i10 + 1;
    }

    public final t[] g(C0424a aVar) throws m {
        this.f23125e = 1;
        C0424a aVar2 = aVar;
        C0424a aVar3 = aVar2;
        C0424a aVar4 = aVar3;
        boolean z10 = true;
        while (this.f23125e < 9) {
            C0424a k10 = k(aVar, z10, 1, -1);
            C0424a k11 = k(aVar2, z10, 1, 1);
            C0424a k12 = k(aVar3, z10, -1, 1);
            C0424a k13 = k(aVar4, z10, -1, -1);
            if (this.f23125e > 2) {
                double d10 = (double) ((d(k13, k10) * ((float) this.f23125e)) / (d(aVar4, aVar) * ((float) (this.f23125e + 2))));
                if (d10 < 0.75d || d10 > 1.25d || !q(k10, k11, k12, k13)) {
                    break;
                }
            }
            z10 = !z10;
            this.f23125e++;
            aVar4 = k13;
            aVar = k10;
            aVar2 = k11;
            aVar3 = k12;
        }
        int i10 = this.f23125e;
        if (i10 == 5 || i10 == 7) {
            this.f23122b = i10 == 5;
            t[] tVarArr = {new t(((float) aVar.a()) + 0.5f, ((float) aVar.b()) - 0.5f), new t(((float) aVar2.a()) + 0.5f, ((float) aVar2.b()) + 0.5f), new t(((float) aVar3.a()) - 0.5f, ((float) aVar3.b()) + 0.5f), new t(((float) aVar4.a()) - 0.5f, ((float) aVar4.b()) - 0.5f)};
            int i11 = this.f23125e;
            return e(tVarArr, (i11 * 2) - 3, i11 * 2);
        }
        throw m.a();
    }

    public final int h(C0424a aVar, C0424a aVar2) {
        float d10 = d(aVar, aVar2);
        float a10 = ((float) (aVar2.a() - aVar.a())) / d10;
        float b10 = ((float) (aVar2.b() - aVar.b())) / d10;
        float a11 = (float) aVar.a();
        float b11 = (float) aVar.b();
        boolean j10 = this.f23121a.j(aVar.a(), aVar.b());
        int ceil = (int) Math.ceil((double) d10);
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < ceil; i11++) {
            a11 += a10;
            b11 += b10;
            if (this.f23121a.j(za.a.c(a11), za.a.c(b11)) != j10) {
                i10++;
            }
        }
        float f10 = ((float) i10) / d10;
        if (f10 > 0.1f && f10 < 0.9f) {
            return 0;
        }
        if (f10 <= 0.1f) {
            z10 = true;
        }
        return z10 == j10 ? 1 : -1;
    }

    public final int j() {
        if (this.f23122b) {
            return (this.f23123c * 4) + 11;
        }
        int i10 = this.f23123c;
        return i10 <= 4 ? (i10 * 4) + 15 : (i10 * 4) + ((((i10 - 4) / 8) + 1) * 2) + 15;
    }

    public final C0424a k(C0424a aVar, boolean z10, int i10, int i11) {
        int a10 = aVar.a() + i10;
        int b10 = aVar.b();
        while (true) {
            b10 += i11;
            if (!o(a10, b10) || this.f23121a.j(a10, b10) != z10) {
                int i12 = a10 - i10;
                int i13 = b10 - i11;
            } else {
                a10 += i10;
            }
        }
        int i122 = a10 - i10;
        int i132 = b10 - i11;
        while (o(i122, i132) && this.f23121a.j(i122, i132) == z10) {
            i122 += i10;
        }
        int i14 = i122 - i10;
        while (o(i14, i132) && this.f23121a.j(i14, i132) == z10) {
            i132 += i11;
        }
        return new C0424a(i14, i132 - i11);
    }

    public final C0424a l() {
        t tVar;
        t tVar2;
        t tVar3;
        t tVar4;
        t tVar5;
        t tVar6;
        t tVar7;
        t tVar8;
        try {
            t[] c10 = new za.c(this.f23121a).c();
            tVar3 = c10[0];
            tVar2 = c10[1];
            tVar = c10[2];
            tVar4 = c10[3];
        } catch (m unused) {
            int s10 = this.f23121a.s() / 2;
            int n10 = this.f23121a.n() / 2;
            int i10 = s10 + 7;
            int i11 = n10 - 7;
            t c11 = k(new C0424a(i10, i11), false, 1, -1).c();
            int i12 = n10 + 7;
            t c12 = k(new C0424a(i10, i12), false, 1, 1).c();
            int i13 = s10 - 7;
            t c13 = k(new C0424a(i13, i12), false, -1, 1).c();
            tVar4 = k(new C0424a(i13, i11), false, -1, -1).c();
            t tVar9 = c12;
            tVar = c13;
            tVar3 = c11;
            tVar2 = tVar9;
        }
        int c14 = za.a.c((((tVar3.c() + tVar4.c()) + tVar2.c()) + tVar.c()) / 4.0f);
        int c15 = za.a.c((((tVar3.d() + tVar4.d()) + tVar2.d()) + tVar.d()) / 4.0f);
        try {
            t[] c16 = new za.c(this.f23121a, 15, c14, c15).c();
            tVar6 = c16[0];
            tVar5 = c16[1];
            tVar7 = c16[2];
            tVar8 = c16[3];
        } catch (m unused2) {
            int i14 = c14 + 7;
            int i15 = c15 - 7;
            tVar6 = k(new C0424a(i14, i15), false, 1, -1).c();
            int i16 = c15 + 7;
            tVar5 = k(new C0424a(i14, i16), false, 1, 1).c();
            int i17 = c14 - 7;
            tVar7 = k(new C0424a(i17, i16), false, -1, 1).c();
            tVar8 = k(new C0424a(i17, i15), false, -1, -1).c();
        }
        return new C0424a(za.a.c((((tVar6.c() + tVar8.c()) + tVar5.c()) + tVar7.c()) / 4.0f), za.a.c((((tVar6.d() + tVar8.d()) + tVar5.d()) + tVar7.d()) / 4.0f));
    }

    public final t[] m(t[] tVarArr) {
        return e(tVarArr, this.f23125e * 2, j());
    }

    public final boolean o(int i10, int i11) {
        return i10 >= 0 && i10 < this.f23121a.s() && i11 > 0 && i11 < this.f23121a.n();
    }

    public final boolean p(t tVar) {
        return o(za.a.c(tVar.c()), za.a.c(tVar.d()));
    }

    public final boolean q(C0424a aVar, C0424a aVar2, C0424a aVar3, C0424a aVar4) {
        C0424a aVar5 = new C0424a(aVar.a() - 3, aVar.b() + 3);
        C0424a aVar6 = new C0424a(aVar2.a() - 3, aVar2.b() - 3);
        C0424a aVar7 = new C0424a(aVar3.a() + 3, aVar3.b() - 3);
        C0424a aVar8 = new C0424a(aVar4.a() + 3, aVar4.b() + 3);
        int h10 = h(aVar8, aVar5);
        return h10 != 0 && h(aVar5, aVar6) == h10 && h(aVar6, aVar7) == h10 && h(aVar7, aVar8) == h10;
    }

    public final b r(b bVar, t tVar, t tVar2, t tVar3, t tVar4) throws m {
        i b10 = i.b();
        int j10 = j();
        int i10 = j10;
        int i11 = j10;
        float f10 = ((float) j10) / 2.0f;
        int i12 = this.f23125e;
        float f11 = f10 - ((float) i12);
        float f12 = f10 + ((float) i12);
        return b10.c(bVar, i11, i10, f11, f11, f12, f11, f12, f12, f11, f12, tVar.c(), tVar.d(), tVar2.c(), tVar2.d(), tVar3.c(), tVar3.d(), tVar4.c(), tVar4.d());
    }

    public final int s(t tVar, t tVar2, int i10) {
        float c10 = c(tVar, tVar2);
        float f10 = c10 / ((float) i10);
        float c11 = tVar.c();
        float d10 = tVar.d();
        float c12 = ((tVar2.c() - tVar.c()) * f10) / c10;
        float d11 = (f10 * (tVar2.d() - tVar.d())) / c10;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f11 = (float) i12;
            if (this.f23121a.j(za.a.c((f11 * c12) + c11), za.a.c((f11 * d11) + d10))) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }
}

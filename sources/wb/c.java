package wb;

import java.util.Map;
import qa.e;
import qa.h;
import qa.m;
import qa.t;
import qa.u;
import vb.j;
import ya.b;
import ya.g;
import ya.i;
import ya.k;
import za.a;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f24010a;

    /* renamed from: b  reason: collision with root package name */
    public u f24011b;

    public c(b bVar) {
        this.f24010a = bVar;
    }

    public static int c(t tVar, t tVar2, t tVar3, float f10) throws m {
        int c10 = ((a.c(t.b(tVar, tVar2) / f10) + a.c(t.b(tVar, tVar3) / f10)) / 2) + 7;
        int i10 = c10 & 3;
        if (i10 == 0) {
            return c10 + 1;
        }
        if (i10 == 2) {
            return c10 - 1;
        }
        if (i10 != 3) {
            return c10;
        }
        throw m.a();
    }

    public static k d(t tVar, t tVar2, t tVar3, t tVar4, int i10) {
        float f10;
        float f11;
        float f12;
        float f13 = ((float) i10) - 3.5f;
        if (tVar4 != null) {
            f11 = tVar4.c();
            f10 = tVar4.d();
            f12 = f13 - 3.0f;
        } else {
            f11 = (tVar2.c() - tVar.c()) + tVar3.c();
            f10 = (tVar2.d() - tVar.d()) + tVar3.d();
            f12 = f13;
        }
        return k.b(3.5f, 3.5f, f13, 3.5f, f12, f12, 3.5f, f13, tVar.c(), tVar.d(), tVar2.c(), tVar2.d(), f11, f10, tVar3.c(), tVar3.d());
    }

    public static b k(b bVar, k kVar, int i10) throws m {
        return i.b().d(bVar, i10, i10, kVar);
    }

    public final float a(t tVar, t tVar2, t tVar3) {
        return (b(tVar, tVar2) + b(tVar, tVar3)) / 2.0f;
    }

    public final float b(t tVar, t tVar2) {
        float m10 = m((int) tVar.c(), (int) tVar.d(), (int) tVar2.c(), (int) tVar2.d());
        float m11 = m((int) tVar2.c(), (int) tVar2.d(), (int) tVar.c(), (int) tVar.d());
        return Float.isNaN(m10) ? m11 / 7.0f : Float.isNaN(m11) ? m10 / 7.0f : (m10 + m11) / 14.0f;
    }

    public g e() throws m, h {
        return f((Map<e, ?>) null);
    }

    public final g f(Map<e, ?> map) throws m, h {
        this.f24011b = map == null ? null : (u) map.get(e.NEED_RESULT_POINT_CALLBACK);
        return j(new f(this.f24010a, this.f24011b).h(map));
    }

    public final a g(float f10, int i10, int i11, float f11) throws m {
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i12);
        int min = Math.min(this.f24010a.s() - 1, i10 + i12) - max;
        float f12 = 3.0f * f10;
        if (((float) min) >= f12) {
            int max2 = Math.max(0, i11 - i12);
            int min2 = Math.min(this.f24010a.n() - 1, i11 + i12) - max2;
            if (((float) min2) >= f12) {
                return new b(this.f24010a, max, max2, min, min2, f10, this.f24011b).c();
            }
            throw m.a();
        }
        throw m.a();
    }

    public final b h() {
        return this.f24010a;
    }

    public final u i() {
        return this.f24011b;
    }

    public final g j(g gVar) throws m, h {
        t[] tVarArr;
        d b10 = gVar.b();
        d c10 = gVar.c();
        d a10 = gVar.a();
        float a11 = a(b10, c10, a10);
        if (a11 >= 1.0f) {
            int c11 = c(b10, c10, a10, a11);
            j g10 = j.g(c11);
            int e10 = g10.e() - 7;
            a aVar = null;
            if (g10.d().length > 0) {
                float c12 = (c10.c() - b10.c()) + a10.c();
                float d10 = (c10.d() - b10.d()) + a10.d();
                float f10 = 1.0f - (3.0f / ((float) e10));
                int c13 = (int) (b10.c() + ((c12 - b10.c()) * f10));
                int d11 = (int) (b10.d() + (f10 * (d10 - b10.d())));
                int i10 = 4;
                while (true) {
                    if (i10 > 16) {
                        break;
                    }
                    try {
                        aVar = g(a11, c13, d11, (float) i10);
                        break;
                    } catch (m unused) {
                        i10 <<= 1;
                    }
                }
            }
            b k10 = k(this.f24010a, d(b10, c10, a10, aVar, c11), c11);
            if (aVar == null) {
                tVarArr = new t[]{a10, b10, c10};
            } else {
                tVarArr = new t[]{a10, b10, c10, aVar};
            }
            return new g(k10, tVarArr);
        }
        throw m.a();
    }

    public final float l(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        c cVar;
        boolean z11;
        boolean z12 = true;
        boolean z13 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z13) {
            i16 = i10;
            i17 = i11;
            i14 = i12;
            i15 = i13;
        } else {
            i17 = i10;
            i16 = i11;
            i15 = i12;
            i14 = i13;
        }
        int abs = Math.abs(i15 - i17);
        int abs2 = Math.abs(i14 - i16);
        int i20 = 2;
        int i21 = (-abs) / 2;
        int i22 = -1;
        int i23 = i17 < i15 ? 1 : -1;
        if (i16 < i14) {
            i22 = 1;
        }
        int i24 = i15 + i23;
        int i25 = i17;
        int i26 = i16;
        int i27 = 0;
        while (true) {
            if (i25 == i24) {
                i18 = i24;
                i19 = i20;
                break;
            }
            int i28 = z13 ? i26 : i25;
            int i29 = z13 ? i25 : i26;
            if (i27 == z12) {
                z10 = z13;
                z11 = z12;
                i18 = i24;
                cVar = this;
            } else {
                cVar = this;
                z10 = z13;
                i18 = i24;
                z11 = false;
            }
            if (z11 == cVar.f24010a.j(i28, i29)) {
                if (i27 == 2) {
                    return a.b(i25, i26, i17, i16);
                }
                i27++;
            }
            i21 += abs2;
            if (i21 > 0) {
                if (i26 == i14) {
                    i19 = 2;
                    break;
                }
                i26 += i22;
                i21 -= abs;
            }
            i25 += i23;
            i24 = i18;
            z13 = z10;
            z12 = true;
            i20 = 2;
        }
        if (i27 == i19) {
            return a.b(i18, i14, i17, i16);
        }
        return Float.NaN;
    }

    public final float m(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float l10 = l(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f10 = ((float) i10) / ((float) (i10 - i14));
            i14 = 0;
        } else if (i14 >= this.f24010a.s()) {
            f10 = ((float) ((this.f24010a.s() - 1) - i10)) / ((float) (i14 - i10));
            i14 = this.f24010a.s() - 1;
        } else {
            f10 = 1.0f;
        }
        float f12 = (float) i11;
        int i16 = (int) (f12 - (((float) (i13 - i11)) * f10));
        if (i16 < 0) {
            f11 = f12 / ((float) (i11 - i16));
        } else if (i16 >= this.f24010a.n()) {
            f11 = ((float) ((this.f24010a.n() - 1) - i11)) / ((float) (i16 - i11));
            i15 = this.f24010a.n() - 1;
        } else {
            i15 = i16;
            f11 = 1.0f;
        }
        return (l10 + l(i10, i11, (int) (((float) i10) + (((float) (i14 - i10)) * f11)), i15)) - 1.0f;
    }
}

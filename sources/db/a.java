package db;

import qa.m;
import qa.t;
import ya.b;
import ya.g;
import ya.i;
import za.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f17804a;

    /* renamed from: b  reason: collision with root package name */
    public final c f17805b;

    public a(b bVar) throws m {
        this.f17804a = bVar;
        this.f17805b = new c(bVar);
    }

    public static t f(t tVar, float f10, float f11) {
        float c10 = tVar.c();
        float d10 = tVar.d();
        return new t(c10 < f10 ? c10 - 1.0f : c10 + 1.0f, d10 < f11 ? d10 - 1.0f : d10 + 1.0f);
    }

    public static b g(b bVar, t tVar, t tVar2, t tVar3, t tVar4, int i10, int i11) throws m {
        float f10 = ((float) i10) - 0.5f;
        float f11 = ((float) i11) - 0.5f;
        return i.b().c(bVar, i10, i11, 0.5f, 0.5f, f10, 0.5f, f10, f11, 0.5f, f11, tVar.c(), tVar.d(), tVar4.c(), tVar4.d(), tVar3.c(), tVar3.d(), tVar2.c(), tVar2.d());
    }

    public static t h(t tVar, t tVar2, int i10) {
        float f10 = (float) (i10 + 1);
        return new t(tVar.c() + ((tVar2.c() - tVar.c()) / f10), tVar.d() + ((tVar2.d() - tVar.d()) / f10));
    }

    public final t a(t[] tVarArr) {
        t tVar = tVarArr[0];
        t tVar2 = tVarArr[1];
        t tVar3 = tVarArr[2];
        t tVar4 = tVarArr[3];
        int j10 = j(tVar, tVar4);
        t h10 = h(tVar, tVar2, (j(tVar2, tVar4) + 1) << 2);
        t h11 = h(tVar3, tVar2, (j10 + 1) << 2);
        int j11 = j(h10, tVar4);
        int j12 = j(h11, tVar4);
        float f10 = (float) (j11 + 1);
        t tVar5 = new t(tVar4.c() + ((tVar3.c() - tVar2.c()) / f10), tVar4.d() + ((tVar3.d() - tVar2.d()) / f10));
        float f11 = (float) (j12 + 1);
        t tVar6 = new t(tVar4.c() + ((tVar.c() - tVar2.c()) / f11), tVar4.d() + ((tVar.d() - tVar2.d()) / f11));
        if (e(tVar5)) {
            return (e(tVar6) && j(h10, tVar5) + j(h11, tVar5) <= j(h10, tVar6) + j(h11, tVar6)) ? tVar6 : tVar5;
        }
        if (e(tVar6)) {
            return tVar6;
        }
        return null;
    }

    public g b() throws m {
        int i10;
        int i11;
        t[] d10 = d(c(this.f17805b.c()));
        t a10 = a(d10);
        d10[3] = a10;
        if (a10 != null) {
            t[] i12 = i(d10);
            t tVar = i12[0];
            t tVar2 = i12[1];
            t tVar3 = i12[2];
            t tVar4 = i12[3];
            int j10 = j(tVar, tVar4) + 1;
            int j11 = j(tVar3, tVar4) + 1;
            if ((j10 & 1) == 1) {
                j10++;
            }
            if ((j11 & 1) == 1) {
                j11++;
            }
            if (j10 * 4 >= j11 * 7 || j11 * 4 >= j10 * 7) {
                i11 = j10;
                i10 = j11;
            } else {
                i11 = Math.max(j10, j11);
                i10 = i11;
            }
            return new g(g(this.f17804a, tVar, tVar2, tVar3, tVar4, i11, i10), new t[]{tVar, tVar2, tVar3, tVar4});
        }
        throw m.a();
    }

    public final t[] c(t[] tVarArr) {
        t tVar = tVarArr[0];
        t tVar2 = tVarArr[1];
        t tVar3 = tVarArr[3];
        t tVar4 = tVarArr[2];
        int j10 = j(tVar, tVar2);
        int j11 = j(tVar2, tVar3);
        int j12 = j(tVar3, tVar4);
        int j13 = j(tVar4, tVar);
        t[] tVarArr2 = {tVar4, tVar, tVar2, tVar3};
        if (j10 > j11) {
            tVarArr2[0] = tVar;
            tVarArr2[1] = tVar2;
            tVarArr2[2] = tVar3;
            tVarArr2[3] = tVar4;
            j10 = j11;
        }
        if (j10 > j12) {
            tVarArr2[0] = tVar2;
            tVarArr2[1] = tVar3;
            tVarArr2[2] = tVar4;
            tVarArr2[3] = tVar;
        } else {
            j12 = j10;
        }
        if (j12 > j13) {
            tVarArr2[0] = tVar3;
            tVarArr2[1] = tVar4;
            tVarArr2[2] = tVar;
            tVarArr2[3] = tVar2;
        }
        return tVarArr2;
    }

    public final t[] d(t[] tVarArr) {
        t tVar = tVarArr[0];
        t tVar2 = tVarArr[1];
        t tVar3 = tVarArr[2];
        t tVar4 = tVarArr[3];
        int j10 = (j(tVar, tVar4) + 1) << 2;
        if (j(h(tVar2, tVar3, j10), tVar) < j(h(tVar3, tVar2, j10), tVar4)) {
            tVarArr[0] = tVar;
            tVarArr[1] = tVar2;
            tVarArr[2] = tVar3;
            tVarArr[3] = tVar4;
        } else {
            tVarArr[0] = tVar2;
            tVarArr[1] = tVar3;
            tVarArr[2] = tVar4;
            tVarArr[3] = tVar;
        }
        return tVarArr;
    }

    public final boolean e(t tVar) {
        return tVar.c() >= 0.0f && tVar.c() < ((float) this.f17804a.s()) && tVar.d() > 0.0f && tVar.d() < ((float) this.f17804a.n());
    }

    public final t[] i(t[] tVarArr) {
        t tVar = tVarArr[0];
        t tVar2 = tVarArr[1];
        t tVar3 = tVarArr[2];
        t tVar4 = tVarArr[3];
        t h10 = h(tVar, tVar2, (j(tVar3, tVar4) + 1) << 2);
        t h11 = h(tVar3, tVar2, (j(tVar, tVar4) + 1) << 2);
        int j10 = j(h10, tVar4) + 1;
        int j11 = j(h11, tVar4) + 1;
        if ((j10 & 1) == 1) {
            j10++;
        }
        if ((j11 & 1) == 1) {
            j11++;
        }
        float c10 = (((tVar.c() + tVar2.c()) + tVar3.c()) + tVar4.c()) / 4.0f;
        float d10 = (((tVar.d() + tVar2.d()) + tVar3.d()) + tVar4.d()) / 4.0f;
        t f10 = f(tVar, c10, d10);
        t f11 = f(tVar2, c10, d10);
        t f12 = f(tVar3, c10, d10);
        t f13 = f(tVar4, c10, d10);
        int i10 = j11 << 2;
        int i11 = j10 << 2;
        return new t[]{h(h(f10, f11, i10), f13, i11), h(h(f11, f10, i10), f12, i11), h(h(f12, f13, i10), f11, i11), h(h(f13, f12, i10), f10, i11)};
    }

    public final int j(t tVar, t tVar2) {
        int c10 = (int) tVar.c();
        int d10 = (int) tVar.d();
        int c11 = (int) tVar2.c();
        int d11 = (int) tVar2.d();
        int i10 = 0;
        int i11 = 1;
        boolean z10 = Math.abs(d11 - d10) > Math.abs(c11 - c10);
        if (z10) {
            int i12 = d10;
            d10 = c10;
            c10 = i12;
            int i13 = d11;
            d11 = c11;
            c11 = i13;
        }
        int abs = Math.abs(c11 - c10);
        int abs2 = Math.abs(d11 - d10);
        int i14 = (-abs) / 2;
        int i15 = d10 < d11 ? 1 : -1;
        if (c10 >= c11) {
            i11 = -1;
        }
        boolean j10 = this.f17804a.j(z10 ? d10 : c10, z10 ? c10 : d10);
        while (c10 != c11) {
            boolean j11 = this.f17804a.j(z10 ? d10 : c10, z10 ? c10 : d10);
            if (j11 != j10) {
                i10++;
                j10 = j11;
            }
            i14 += abs2;
            if (i14 > 0) {
                if (d10 == d11) {
                    break;
                }
                d10 += i15;
                i14 -= abs;
            }
            c10 += i11;
        }
        return i10;
    }
}

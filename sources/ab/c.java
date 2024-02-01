package ab;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f16046a;

    public c(a aVar) {
        this.f16046a = aVar;
    }

    public void a(int[] iArr, int i10) throws e {
        b bVar = new b(this.f16046a, iArr);
        int[] iArr2 = new int[i10];
        int i11 = 0;
        boolean z10 = true;
        for (int i12 = 0; i12 < i10; i12++) {
            a aVar = this.f16046a;
            int c10 = bVar.c(aVar.c(aVar.d() + i12));
            iArr2[(i10 - 1) - i12] = c10;
            if (c10 != 0) {
                z10 = false;
            }
        }
        if (!z10) {
            b[] d10 = d(this.f16046a.b(i10, 1), new b(this.f16046a, iArr2), i10);
            b bVar2 = d10[0];
            b bVar3 = d10[1];
            int[] b10 = b(bVar2);
            int[] c11 = c(bVar3, b10);
            while (i11 < b10.length) {
                int length = (iArr.length - 1) - this.f16046a.i(b10[i11]);
                if (length >= 0) {
                    iArr[length] = a.a(iArr[length], c11[i11]);
                    i11++;
                } else {
                    throw new e("Bad error location");
                }
            }
        }
    }

    public final int[] b(b bVar) throws e {
        int f10 = bVar.f();
        int i10 = 0;
        if (f10 == 1) {
            return new int[]{bVar.d(1)};
        }
        int[] iArr = new int[f10];
        for (int i11 = 1; i11 < this.f16046a.f() && i10 < f10; i11++) {
            if (bVar.c(i11) == 0) {
                iArr[i10] = this.f16046a.h(i11);
                i10++;
            }
        }
        if (i10 == f10) {
            return iArr;
        }
        throw new e("Error locator degree does not match number of roots");
    }

    public final int[] c(b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            int h10 = this.f16046a.h(iArr[i10]);
            int i11 = 1;
            for (int i12 = 0; i12 < length; i12++) {
                if (i10 != i12) {
                    int j10 = this.f16046a.j(iArr[i12], h10);
                    i11 = this.f16046a.j(i11, (j10 & 1) == 0 ? j10 | 1 : j10 & -2);
                }
            }
            iArr2[i10] = this.f16046a.j(bVar.c(h10), this.f16046a.h(i11));
            if (this.f16046a.d() != 0) {
                iArr2[i10] = this.f16046a.j(iArr2[i10], h10);
            }
        }
        return iArr2;
    }

    public final b[] d(b bVar, b bVar2, int i10) throws e {
        if (bVar.f() < bVar2.f()) {
            b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
        }
        b g10 = this.f16046a.g();
        b e10 = this.f16046a.e();
        do {
            b bVar4 = r11;
            r11 = bVar;
            bVar = bVar4;
            b bVar5 = e10;
            b bVar6 = g10;
            g10 = bVar5;
            if (bVar.f() < i10 / 2) {
                int d10 = g10.d(0);
                if (d10 != 0) {
                    int h10 = this.f16046a.h(d10);
                    return new b[]{g10.h(h10), bVar.h(h10)};
                }
                throw new e("sigmaTilde(0) was zero");
            } else if (!bVar.g()) {
                b g11 = this.f16046a.g();
                int h11 = this.f16046a.h(bVar.d(bVar.f()));
                while (r11.f() >= bVar.f() && !r11.g()) {
                    int f10 = r11.f() - bVar.f();
                    int j10 = this.f16046a.j(r11.d(r11.f()), h11);
                    g11 = g11.a(this.f16046a.b(f10, j10));
                    r11 = r11.a(bVar.j(f10, j10));
                }
                e10 = g11.i(g10).a(bVar6);
            } else {
                throw new e("r_{i-1} was zero");
            }
        } while (r11.f() < bVar.f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }
}

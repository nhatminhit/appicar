package rb;

import qa.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f22415a = b.f22416f;

    public int a(int[] iArr, int i10, int[] iArr2) throws d {
        c cVar = new c(this.f22415a, iArr);
        int[] iArr3 = new int[i10];
        int i11 = 0;
        boolean z10 = false;
        for (int i12 = i10; i12 > 0; i12--) {
            int b10 = cVar.b(this.f22415a.c(i12));
            iArr3[i10 - i12] = b10;
            if (b10 != 0) {
                z10 = true;
            }
        }
        if (!z10) {
            return 0;
        }
        c d10 = this.f22415a.d();
        if (iArr2 != null) {
            for (int length : iArr2) {
                int c10 = this.f22415a.c((iArr.length - 1) - length);
                b bVar = this.f22415a;
                d10 = d10.h(new c(bVar, new int[]{bVar.j(0, c10), 1}));
            }
        }
        c[] d11 = d(this.f22415a.b(i10, 1), new c(this.f22415a, iArr3), i10);
        c cVar2 = d11[0];
        c cVar3 = d11[1];
        int[] b11 = b(cVar2);
        int[] c11 = c(cVar3, cVar2, b11);
        while (i11 < b11.length) {
            int length2 = (iArr.length - 1) - this.f22415a.h(b11[i11]);
            if (length2 >= 0) {
                iArr[length2] = this.f22415a.j(iArr[length2], c11[i11]);
                i11++;
            } else {
                throw d.a();
            }
        }
        return b11.length;
    }

    public final int[] b(c cVar) throws d {
        int e10 = cVar.e();
        int[] iArr = new int[e10];
        int i10 = 0;
        for (int i11 = 1; i11 < this.f22415a.e() && i10 < e10; i11++) {
            if (cVar.b(i11) == 0) {
                iArr[i10] = this.f22415a.g(i11);
                i10++;
            }
        }
        if (i10 == e10) {
            return iArr;
        }
        throw d.a();
    }

    public final int[] c(c cVar, c cVar2, int[] iArr) {
        int e10 = cVar2.e();
        int[] iArr2 = new int[e10];
        for (int i10 = 1; i10 <= e10; i10++) {
            iArr2[e10 - i10] = this.f22415a.i(i10, cVar2.c(i10));
        }
        c cVar3 = new c(this.f22415a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            int g10 = this.f22415a.g(iArr[i11]);
            iArr3[i11] = this.f22415a.i(this.f22415a.j(0, cVar.b(g10)), this.f22415a.g(cVar3.b(g10)));
        }
        return iArr3;
    }

    public final c[] d(c cVar, c cVar2, int i10) throws d {
        if (cVar.e() < cVar2.e()) {
            c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        c f10 = this.f22415a.f();
        c d10 = this.f22415a.d();
        while (true) {
            c cVar4 = r11;
            r11 = cVar;
            cVar = cVar4;
            c cVar5 = d10;
            c cVar6 = f10;
            f10 = cVar5;
            if (cVar.e() < i10 / 2) {
                int c10 = f10.c(0);
                if (c10 != 0) {
                    int g10 = this.f22415a.g(c10);
                    return new c[]{f10.g(g10), cVar.g(g10)};
                }
                throw d.a();
            } else if (!cVar.f()) {
                c f11 = this.f22415a.f();
                int g11 = this.f22415a.g(cVar.c(cVar.e()));
                while (r11.e() >= cVar.e() && !r11.f()) {
                    int e10 = r11.e() - cVar.e();
                    int i11 = this.f22415a.i(r11.c(r11.e()), g11);
                    f11 = f11.a(this.f22415a.b(e10, i11));
                    r11 = r11.k(cVar.i(e10, i11));
                }
                d10 = f11.h(f10).k(cVar6).j();
            } else {
                throw d.a();
            }
        }
    }
}

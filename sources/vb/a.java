package vb;

import qa.h;
import ya.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f23578a;

    /* renamed from: b  reason: collision with root package name */
    public j f23579b;

    /* renamed from: c  reason: collision with root package name */
    public g f23580c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f23581d;

    public a(b bVar) throws h {
        int n10 = bVar.n();
        if (n10 < 21 || (n10 & 3) != 1) {
            throw h.a();
        }
        this.f23578a = bVar;
    }

    public final int a(int i10, int i11, int i12) {
        return this.f23581d ? this.f23578a.j(i11, i10) : this.f23578a.j(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    public void b() {
        int i10 = 0;
        while (i10 < this.f23578a.s()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f23578a.n(); i12++) {
                if (this.f23578a.j(i10, i12) != this.f23578a.j(i12, i10)) {
                    this.f23578a.i(i12, i10);
                    this.f23578a.i(i10, i12);
                }
            }
            i10 = i11;
        }
    }

    public byte[] c() throws h {
        g d10 = d();
        j e10 = e();
        c cVar = c.values()[d10.c()];
        int n10 = this.f23578a.n();
        cVar.b(this.f23578a, n10);
        b a10 = e10.a();
        byte[] bArr = new byte[e10.h()];
        int i10 = n10 - 1;
        boolean z10 = true;
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            if (i11 == 6) {
                i11--;
            }
            for (int i15 = 0; i15 < n10; i15++) {
                int i16 = z10 ? i10 - i15 : i15;
                for (int i17 = 0; i17 < 2; i17++) {
                    int i18 = i11 - i17;
                    if (!a10.j(i18, i16)) {
                        i13++;
                        i14 <<= 1;
                        if (this.f23578a.j(i18, i16)) {
                            i14 |= 1;
                        }
                        if (i13 == 8) {
                            bArr[i12] = (byte) i14;
                            i12++;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i11 -= 2;
        }
        if (i12 == e10.h()) {
            return bArr;
        }
        throw h.a();
    }

    public g d() throws h {
        g gVar = this.f23580c;
        if (gVar != null) {
            return gVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = a(i12, 8, i11);
        }
        int a10 = a(8, 7, a(8, 8, a(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            a10 = a(8, i13, a10);
        }
        int n10 = this.f23578a.n();
        int i14 = n10 - 7;
        for (int i15 = n10 - 1; i15 >= i14; i15--) {
            i10 = a(8, i15, i10);
        }
        for (int i16 = n10 - 8; i16 < n10; i16++) {
            i10 = a(i16, 8, i10);
        }
        g a11 = g.a(a10, i10);
        this.f23580c = a11;
        if (a11 != null) {
            return a11;
        }
        throw h.a();
    }

    public j e() throws h {
        j jVar = this.f23579b;
        if (jVar != null) {
            return jVar;
        }
        int n10 = this.f23578a.n();
        int i10 = (n10 - 17) / 4;
        if (i10 <= 6) {
            return j.i(i10);
        }
        int i11 = n10 - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = n10 - 9; i15 >= i11; i15--) {
                i13 = a(i15, i14, i13);
            }
        }
        j c10 = j.c(i13);
        if (c10 == null || c10.e() != n10) {
            for (int i16 = 5; i16 >= 0; i16--) {
                for (int i17 = n10 - 9; i17 >= i11; i17--) {
                    i12 = a(i16, i17, i12);
                }
            }
            j c11 = j.c(i12);
            if (c11 == null || c11.e() != n10) {
                throw h.a();
            }
            this.f23579b = c11;
            return c11;
        }
        this.f23579b = c10;
        return c10;
    }

    public void f() {
        if (this.f23580c != null) {
            c.values()[this.f23580c.c()].b(this.f23578a, this.f23578a.n());
        }
    }

    public void g(boolean z10) {
        this.f23579b = null;
        this.f23580c = null;
        this.f23581d = z10;
    }
}

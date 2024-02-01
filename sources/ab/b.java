package ab;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f16044a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f16045b;

    public b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f16044a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f16045b = iArr;
                return;
            }
            int i10 = 1;
            while (i10 < length && iArr[i10] == 0) {
                i10++;
            }
            if (i10 == length) {
                this.f16045b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i10)];
            this.f16045b = iArr2;
            System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    public b a(b bVar) {
        if (!this.f16044a.equals(bVar.f16044a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (g()) {
            return bVar;
        } else {
            if (bVar.g()) {
                return this;
            }
            int[] iArr = this.f16045b;
            int[] iArr2 = bVar.f16045b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr4[i10] = a.a(iArr2[i10 - length], iArr[i10]);
            }
            return new b(this.f16044a, iArr4);
        }
    }

    public b[] b(b bVar) {
        if (!this.f16044a.equals(bVar.f16044a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.g()) {
            b g10 = this.f16044a.g();
            int h10 = this.f16044a.h(bVar.d(bVar.f()));
            b bVar2 = this;
            while (bVar2.f() >= bVar.f() && !bVar2.g()) {
                int f10 = bVar2.f() - bVar.f();
                int j10 = this.f16044a.j(bVar2.d(bVar2.f()), h10);
                b j11 = bVar.j(f10, j10);
                g10 = g10.a(this.f16044a.b(f10, j10));
                bVar2 = bVar2.a(j11);
            }
            return new b[]{g10, bVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    public int c(int i10) {
        if (i10 == 0) {
            return d(0);
        }
        if (i10 == 1) {
            int i11 = 0;
            for (int a10 : this.f16045b) {
                i11 = a.a(i11, a10);
            }
            return i11;
        }
        int[] iArr = this.f16045b;
        int i12 = iArr[0];
        int length = iArr.length;
        for (int i13 = 1; i13 < length; i13++) {
            i12 = a.a(this.f16044a.j(i10, i12), this.f16045b[i13]);
        }
        return i12;
    }

    public int d(int i10) {
        int[] iArr = this.f16045b;
        return iArr[(iArr.length - 1) - i10];
    }

    public int[] e() {
        return this.f16045b;
    }

    public int f() {
        return this.f16045b.length - 1;
    }

    public boolean g() {
        return this.f16045b[0] == 0;
    }

    public b h(int i10) {
        if (i10 == 0) {
            return this.f16044a.g();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f16045b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f16044a.j(this.f16045b[i11], i10);
        }
        return new b(this.f16044a, iArr);
    }

    public b i(b bVar) {
        if (!this.f16044a.equals(bVar.f16044a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (g() || bVar.g()) {
            return this.f16044a.g();
        } else {
            int[] iArr = this.f16045b;
            int length = iArr.length;
            int[] iArr2 = bVar.f16045b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArr[i10];
                for (int i12 = 0; i12 < length2; i12++) {
                    int i13 = i10 + i12;
                    iArr3[i13] = a.a(iArr3[i13], this.f16044a.j(i11, iArr2[i12]));
                }
            }
            return new b(this.f16044a, iArr3);
        }
    }

    public b j(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f16044a.g();
        } else {
            int length = this.f16045b.length;
            int[] iArr = new int[(i10 + length)];
            for (int i12 = 0; i12 < length; i12++) {
                iArr[i12] = this.f16044a.j(this.f16045b[i12], i11);
            }
            return new b(this.f16044a, iArr);
        }
    }

    public String toString() {
        char c10;
        if (g()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(f() * 8);
        int f10 = f();
        while (f10 >= 0) {
            int d10 = d(f10);
            if (d10 != 0) {
                if (d10 < 0) {
                    sb2.append(f10 == f() ? "-" : " - ");
                    d10 = -d10;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (f10 == 0 || d10 != 1) {
                    int i10 = this.f16044a.i(d10);
                    if (i10 == 0) {
                        c10 = '1';
                    } else if (i10 == 1) {
                        c10 = 'a';
                    } else {
                        sb2.append("a^");
                        sb2.append(i10);
                    }
                    sb2.append(c10);
                }
                if (f10 != 0) {
                    if (f10 == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(f10);
                    }
                }
            }
            f10--;
        }
        return sb2.toString();
    }
}

package rb;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f22422a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f22423b;

    public c(b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f22422a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f22423b = iArr;
                return;
            }
            int i10 = 1;
            while (i10 < length && iArr[i10] == 0) {
                i10++;
            }
            if (i10 == length) {
                this.f22423b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i10)];
            this.f22423b = iArr2;
            System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    public c a(c cVar) {
        if (!this.f22422a.equals(cVar.f22422a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (f()) {
            return cVar;
        } else {
            if (cVar.f()) {
                return this;
            }
            int[] iArr = this.f22423b;
            int[] iArr2 = cVar.f22423b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr4[i10] = this.f22422a.a(iArr2[i10 - length], iArr[i10]);
            }
            return new c(this.f22422a, iArr4);
        }
    }

    public int b(int i10) {
        if (i10 == 0) {
            return c(0);
        }
        if (i10 == 1) {
            int i11 = 0;
            for (int a10 : this.f22423b) {
                i11 = this.f22422a.a(i11, a10);
            }
            return i11;
        }
        int[] iArr = this.f22423b;
        int i12 = iArr[0];
        int length = iArr.length;
        for (int i13 = 1; i13 < length; i13++) {
            b bVar = this.f22422a;
            i12 = bVar.a(bVar.i(i10, i12), this.f22423b[i13]);
        }
        return i12;
    }

    public int c(int i10) {
        int[] iArr = this.f22423b;
        return iArr[(iArr.length - 1) - i10];
    }

    public int[] d() {
        return this.f22423b;
    }

    public int e() {
        return this.f22423b.length - 1;
    }

    public boolean f() {
        return this.f22423b[0] == 0;
    }

    public c g(int i10) {
        if (i10 == 0) {
            return this.f22422a.f();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f22423b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f22422a.i(this.f22423b[i11], i10);
        }
        return new c(this.f22422a, iArr);
    }

    public c h(c cVar) {
        if (!this.f22422a.equals(cVar.f22422a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (f() || cVar.f()) {
            return this.f22422a.f();
        } else {
            int[] iArr = this.f22423b;
            int length = iArr.length;
            int[] iArr2 = cVar.f22423b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArr[i10];
                for (int i12 = 0; i12 < length2; i12++) {
                    int i13 = i10 + i12;
                    b bVar = this.f22422a;
                    iArr3[i13] = bVar.a(iArr3[i13], bVar.i(i11, iArr2[i12]));
                }
            }
            return new c(this.f22422a, iArr3);
        }
    }

    public c i(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f22422a.f();
        } else {
            int length = this.f22423b.length;
            int[] iArr = new int[(i10 + length)];
            for (int i12 = 0; i12 < length; i12++) {
                iArr[i12] = this.f22422a.i(this.f22423b[i12], i11);
            }
            return new c(this.f22422a, iArr);
        }
    }

    public c j() {
        int length = this.f22423b.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = this.f22422a.j(0, this.f22423b[i10]);
        }
        return new c(this.f22422a, iArr);
    }

    public c k(c cVar) {
        if (this.f22422a.equals(cVar.f22422a)) {
            return cVar.f() ? this : a(cVar.j());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(e() * 8);
        for (int e10 = e(); e10 >= 0; e10--) {
            int c10 = c(e10);
            if (c10 != 0) {
                if (c10 < 0) {
                    sb2.append(" - ");
                    c10 = -c10;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (e10 == 0 || c10 != 1) {
                    sb2.append(c10);
                }
                if (e10 != 0) {
                    if (e10 == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(e10);
                    }
                }
            }
        }
        return sb2.toString();
    }
}

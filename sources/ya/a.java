package ya;

import bh.c;
import java.util.Arrays;
import p7.f;

public final class a implements Cloneable {
    public int[] O;
    public int P;

    public a() {
        this.P = 0;
        this.O = new int[1];
    }

    public a(int i10) {
        this.P = i10;
        this.O = v(i10);
    }

    public a(int[] iArr, int i10) {
        this.O = iArr;
        this.P = i10;
    }

    public static int[] v(int i10) {
        return new int[((i10 + 31) / 32)];
    }

    public void A(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (n(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    public void B(a aVar) {
        if (this.P == aVar.P) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.O;
                if (i10 < iArr.length) {
                    iArr[i10] = iArr[i10] ^ aVar.O[i10];
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public void a(boolean z10) {
        k(this.P + 1);
        if (z10) {
            int[] iArr = this.O;
            int i10 = this.P;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.P++;
    }

    public void d(a aVar) {
        int i10 = aVar.P;
        k(this.P + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            a(aVar.n(i11));
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.P == aVar.P && Arrays.equals(this.O, aVar.O);
    }

    public void g(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        k(this.P + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            a(z10);
            i11--;
        }
    }

    public int hashCode() {
        return (this.P * 31) + Arrays.hashCode(this.O);
    }

    public void i() {
        int length = this.O.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.O[i10] = 0;
        }
    }

    /* renamed from: j */
    public a clone() {
        return new a((int[]) this.O.clone(), this.P);
    }

    public final void k(int i10) {
        if (i10 > (this.O.length << 5)) {
            int[] v10 = v(i10);
            int[] iArr = this.O;
            System.arraycopy(iArr, 0, v10, 0, iArr.length);
            this.O = v10;
        }
    }

    public void m(int i10) {
        int[] iArr = this.O;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) ^ iArr[i11];
    }

    public boolean n(int i10) {
        return ((1 << (i10 & 31)) & this.O[i10 / 32]) != 0;
    }

    public int[] p() {
        return this.O;
    }

    public int q(int i10) {
        int i11 = this.P;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & this.O[i12];
        while (i13 == 0) {
            i12++;
            int[] iArr = this.O;
            if (i12 == iArr.length) {
                return this.P;
            }
            i13 = iArr[i12];
        }
        return Math.min((i12 << 5) + Integer.numberOfTrailingZeros(i13), this.P);
    }

    public int r(int i10) {
        int i11 = this.P;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & (~this.O[i12]);
        while (i13 == 0) {
            i12++;
            int[] iArr = this.O;
            if (i12 == iArr.length) {
                return this.P;
            }
            i13 = ~iArr[i12];
        }
        return Math.min((i12 << 5) + Integer.numberOfTrailingZeros(i13), this.P);
    }

    public int s() {
        return this.P;
    }

    public int t() {
        return (this.P + 7) / 8;
    }

    public String toString() {
        int i10 = this.P;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.P; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(f.f11698i);
            }
            sb2.append(n(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public boolean u(int i10, int i11, boolean z10) {
        if (i11 < i10 || i10 < 0 || i11 > this.P) {
            throw new IllegalArgumentException();
        } else if (i11 == i10) {
            return true;
        } else {
            int i12 = i11 - 1;
            int i13 = i10 / 32;
            int i14 = i12 / 32;
            int i15 = i13;
            while (i15 <= i14) {
                int i16 = 31;
                int i17 = i15 > i13 ? 0 : i10 & 31;
                if (i15 >= i14) {
                    i16 = 31 & i12;
                }
                int i18 = (2 << i16) - (1 << i17);
                int i19 = this.O[i15] & i18;
                if (!z10) {
                    i18 = 0;
                }
                if (i19 != i18) {
                    return false;
                }
                i15++;
            }
            return true;
        }
    }

    public void w() {
        int[] iArr = new int[this.O.length];
        int i10 = (this.P - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = (long) this.O[i12];
            long j11 = ((j10 & 1431655765) << 1) | ((j10 >> 1) & 1431655765);
            long j12 = ((j11 & 858993459) << 2) | ((j11 >> 2) & 858993459);
            long j13 = ((j12 & 252645135) << 4) | ((j12 >> 4) & 252645135);
            long j14 = ((j13 & 16711935) << 8) | ((j13 >> 8) & 16711935);
            iArr[i10 - i12] = (int) (((j14 & c.f16306s) << 16) | ((j14 >> 16) & c.f16306s));
        }
        int i13 = this.P;
        int i14 = i11 << 5;
        if (i13 != i14) {
            int i15 = i14 - i13;
            int i16 = iArr[0] >>> i15;
            for (int i17 = 1; i17 < i11; i17++) {
                int i18 = iArr[i17];
                iArr[i17 - 1] = i16 | (i18 << (32 - i15));
                i16 = i18 >>> i15;
            }
            iArr[i11 - 1] = i16;
        }
        this.O = iArr;
    }

    public void x(int i10) {
        int[] iArr = this.O;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    public void y(int i10, int i11) {
        this.O[i10 / 32] = i11;
    }

    public void z(int i10, int i11) {
        if (i11 < i10 || i10 < 0 || i11 > this.P) {
            throw new IllegalArgumentException();
        } else if (i11 != i10) {
            int i12 = i11 - 1;
            int i13 = i10 / 32;
            int i14 = i12 / 32;
            int i15 = i13;
            while (i15 <= i14) {
                int i16 = 31;
                int i17 = i15 > i13 ? 0 : i10 & 31;
                if (i15 >= i14) {
                    i16 = 31 & i12;
                }
                int i18 = (2 << i16) - (1 << i17);
                int[] iArr = this.O;
                iArr[i15] = i18 | iArr[i15];
                i15++;
            }
        }
    }
}

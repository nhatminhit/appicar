package ya;

import java.util.Arrays;
import y3.q;

public final class b implements Cloneable {
    public final int O;
    public final int P;
    public final int Q;
    public final int[] R;

    public b(int i10) {
        this(i10, i10);
    }

    public b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.O = i10;
        this.P = i11;
        int i12 = (i10 + 31) / 32;
        this.Q = i12;
        this.R = new int[(i12 * i11)];
    }

    public b(int i10, int i11, int i12, int[] iArr) {
        this.O = i10;
        this.P = i11;
        this.Q = i12;
        this.R = iArr;
    }

    public static b t(String str, String str2, String str3) {
        if (str != null) {
            boolean[] zArr = new boolean[str.length()];
            int i10 = -1;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i11 < str.length()) {
                if (str.charAt(i11) == 10 || str.charAt(i11) == 13) {
                    if (i12 > i13) {
                        if (i10 == -1) {
                            i10 = i12 - i13;
                        } else if (i12 - i13 != i10) {
                            throw new IllegalArgumentException("row lengths do not match");
                        }
                        i14++;
                        i13 = i12;
                    }
                    i11++;
                } else {
                    if (str.startsWith(str2, i11)) {
                        i11 += str2.length();
                        zArr[i12] = true;
                    } else if (str.startsWith(str3, i11)) {
                        i11 += str3.length();
                        zArr[i12] = false;
                    } else {
                        throw new IllegalArgumentException("illegal character encountered: " + str.substring(i11));
                    }
                    i12++;
                }
            }
            if (i12 > i13) {
                int i15 = i12 - i13;
                if (i10 == -1) {
                    i10 = i15;
                } else if (i15 != i10) {
                    throw new IllegalArgumentException("row lengths do not match");
                }
                i14++;
            }
            b bVar = new b(i10, i14);
            for (int i16 = 0; i16 < i12; i16++) {
                if (zArr[i16]) {
                    bVar.w(i16 % i10, i16 / i10);
                }
            }
            return bVar;
        }
        throw new IllegalArgumentException();
    }

    public static b u(boolean[][] zArr) {
        int length = zArr.length;
        int length2 = zArr[0].length;
        b bVar = new b(length2, length);
        for (int i10 = 0; i10 < length; i10++) {
            boolean[] zArr2 = zArr[i10];
            for (int i11 = 0; i11 < length2; i11++) {
                if (zArr2[i11]) {
                    bVar.w(i11, i10);
                }
            }
        }
        return bVar;
    }

    @Deprecated
    public String A(String str, String str2, String str3) {
        return a(str, str2, str3);
    }

    public void B(int i10, int i11) {
        int i12 = (i11 * this.Q) + (i10 / 32);
        int[] iArr = this.R;
        iArr[i12] = (~(1 << (i10 & 31))) & iArr[i12];
    }

    public void C(b bVar) {
        int i10 = this.O;
        if (i10 == bVar.O && this.P == bVar.P && this.Q == bVar.Q) {
            a aVar = new a(i10);
            for (int i11 = 0; i11 < this.P; i11++) {
                int i12 = this.Q * i11;
                int[] p10 = bVar.p(i11, aVar).p();
                for (int i13 = 0; i13 < this.Q; i13++) {
                    int[] iArr = this.R;
                    int i14 = i12 + i13;
                    iArr[i14] = iArr[i14] ^ p10[i13];
                }
            }
            return;
        }
        throw new IllegalArgumentException("input matrix dimensions do not match");
    }

    public final String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.P * (this.O + 1));
        for (int i10 = 0; i10 < this.P; i10++) {
            for (int i11 = 0; i11 < this.O; i11++) {
                sb2.append(j(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public void d() {
        int length = this.R.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.R[i10] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.O == bVar.O && this.P == bVar.P && this.Q == bVar.Q && Arrays.equals(this.R, bVar.R);
    }

    /* renamed from: g */
    public b clone() {
        return new b(this.O, this.P, this.Q, (int[]) this.R.clone());
    }

    public int hashCode() {
        int i10 = this.O;
        return (((((((i10 * 31) + i10) * 31) + this.P) * 31) + this.Q) * 31) + Arrays.hashCode(this.R);
    }

    public void i(int i10, int i11) {
        int i12 = (i11 * this.Q) + (i10 / 32);
        int[] iArr = this.R;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public boolean j(int i10, int i11) {
        return ((this.R[(i11 * this.Q) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public int[] k() {
        int length = this.R.length - 1;
        while (length >= 0 && this.R[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.Q;
        int i11 = length / i10;
        int i12 = (length % i10) << 5;
        int i13 = 31;
        while ((this.R[length] >>> i13) == 0) {
            i13--;
        }
        return new int[]{i12 + i13, i11};
    }

    public int[] m() {
        int i10 = this.O;
        int i11 = this.P;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < this.P; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = this.Q;
                if (i15 >= i16) {
                    break;
                }
                int i17 = this.R[(i16 * i14) + i15];
                if (i17 != 0) {
                    if (i14 < i11) {
                        i11 = i14;
                    }
                    if (i14 > i13) {
                        i13 = i14;
                    }
                    int i18 = i15 << 5;
                    if (i18 < i10) {
                        int i19 = 0;
                        while ((i17 << (31 - i19)) == 0) {
                            i19++;
                        }
                        int i20 = i19 + i18;
                        if (i20 < i10) {
                            i10 = i20;
                        }
                    }
                    if (i18 + 31 > i12) {
                        int i21 = 31;
                        while ((i17 >>> i21) == 0) {
                            i21--;
                        }
                        int i22 = i18 + i21;
                        if (i22 > i12) {
                            i12 = i22;
                        }
                    }
                }
                i15++;
            }
        }
        if (i12 < i10 || i13 < i11) {
            return null;
        }
        return new int[]{i10, i11, (i12 - i10) + 1, (i13 - i11) + 1};
    }

    public int n() {
        return this.P;
    }

    public a p(int i10, a aVar) {
        if (aVar == null || aVar.s() < this.O) {
            aVar = new a(this.O);
        } else {
            aVar.i();
        }
        int i11 = i10 * this.Q;
        for (int i12 = 0; i12 < this.Q; i12++) {
            aVar.y(i12 << 5, this.R[i11 + i12]);
        }
        return aVar;
    }

    public int q() {
        return this.Q;
    }

    public int[] r() {
        int[] iArr;
        int i10 = 0;
        while (true) {
            iArr = this.R;
            if (i10 < iArr.length && iArr[i10] == 0) {
                i10++;
            }
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.Q;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) << 5;
        int i14 = iArr[i10];
        int i15 = 0;
        while ((i14 << (31 - i15)) == 0) {
            i15++;
        }
        return new int[]{i13 + i15, i12};
    }

    public int s() {
        return this.O;
    }

    public String toString() {
        return z("X ", q.a.R);
    }

    public void v() {
        a aVar = new a(this.O);
        a aVar2 = new a(this.O);
        int i10 = (this.P + 1) / 2;
        for (int i11 = 0; i11 < i10; i11++) {
            aVar = p(i11, aVar);
            int i12 = (this.P - 1) - i11;
            aVar2 = p(i12, aVar2);
            aVar.w();
            aVar2.w();
            y(i11, aVar2);
            y(i12, aVar);
        }
    }

    public void w(int i10, int i11) {
        int i12 = (i11 * this.Q) + (i10 / 32);
        int[] iArr = this.R;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void x(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i14 = i12 + i10;
            int i15 = i13 + i11;
            if (i15 > this.P || i14 > this.O) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i11 < i15) {
                int i16 = this.Q * i11;
                for (int i17 = i10; i17 < i14; i17++) {
                    int[] iArr = this.R;
                    int i18 = (i17 / 32) + i16;
                    iArr[i18] = iArr[i18] | (1 << (i17 & 31));
                }
                i11++;
            }
        }
    }

    public void y(int i10, a aVar) {
        int[] p10 = aVar.p();
        int[] iArr = this.R;
        int i11 = this.Q;
        System.arraycopy(p10, 0, iArr, i10 * i11, i11);
    }

    public String z(String str, String str2) {
        return a(str, str2, "\n");
    }
}

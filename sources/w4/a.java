package w4;

import h5.c;
import java.io.Serializable;
import java.util.Arrays;
import kh.j;

public final class a implements Serializable {
    public static final int V = 32;
    public static final long W = 1;
    public static final char X = '\u0000';
    public static final int Y = -1;
    public static final int Z = -2;
    public final transient int[] O;
    public final transient char[] P;
    public final transient byte[] Q;
    public final String R;
    public final transient boolean S;
    public final transient char T;
    public final transient int U;

    public a(String str, String str2, boolean z10, char c10, int i10) {
        int[] iArr = new int[128];
        this.O = iArr;
        char[] cArr = new char[64];
        this.P = cArr;
        this.Q = new byte[64];
        this.R = str;
        this.S = z10;
        this.T = c10;
        this.U = i10;
        int length = str2.length();
        if (length == 64) {
            str2.getChars(0, length, cArr, 0);
            Arrays.fill(iArr, -1);
            for (int i11 = 0; i11 < length; i11++) {
                char c11 = this.P[i11];
                this.Q[i11] = (byte) c11;
                this.O[c11] = i11;
            }
            if (z10) {
                this.O[c10] = -2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
    }

    public a(a aVar, String str, int i10) {
        this(aVar, str, aVar.S, aVar.T, i10);
    }

    public a(a aVar, String str, boolean z10, char c10, int i10) {
        int[] iArr = new int[128];
        this.O = iArr;
        char[] cArr = new char[64];
        this.P = cArr;
        byte[] bArr = new byte[64];
        this.Q = bArr;
        this.R = str;
        byte[] bArr2 = aVar.Q;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = aVar.P;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = aVar.O;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.S = z10;
        this.T = c10;
        this.U = i10;
    }

    public boolean A(int i10) {
        return i10 == this.T;
    }

    public void a() throws IllegalArgumentException {
        throw new IllegalArgumentException(w());
    }

    public void b(char c10, int i10, String str) throws IllegalArgumentException {
        String str2;
        StringBuilder sb2;
        String str3;
        if (c10 <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c10) + ") as character #" + (i10 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (z(c10)) {
            str2 = "Unexpected padding character ('" + v() + "') as character #" + (i10 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else {
            if (!Character.isDefined(c10) || Character.isISOControl(c10)) {
                sb2 = new StringBuilder();
                str3 = "Illegal character (code 0x";
            } else {
                sb2 = new StringBuilder();
                sb2.append("Illegal character '");
                sb2.append(c10);
                str3 = "' (code 0x";
            }
            sb2.append(str3);
            sb2.append(Integer.toHexString(c10));
            sb2.append(") in base64 content");
            str2 = sb2.toString();
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    public void c(String str, c cVar) throws IllegalArgumentException {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt > ' ') {
                int f10 = f(charAt);
                if (f10 < 0) {
                    b(charAt, 0, (String) null);
                }
                if (i11 >= length) {
                    a();
                }
                int i12 = i11 + 1;
                char charAt2 = str.charAt(i11);
                int f11 = f(charAt2);
                if (f11 < 0) {
                    b(charAt2, 1, (String) null);
                }
                int i13 = (f10 << 6) | f11;
                if (i12 >= length) {
                    if (!y()) {
                        cVar.f(i13 >> 4);
                        return;
                    }
                    a();
                }
                int i14 = i12 + 1;
                char charAt3 = str.charAt(i12);
                int f12 = f(charAt3);
                if (f12 < 0) {
                    if (f12 != -2) {
                        b(charAt3, 2, (String) null);
                    }
                    if (i14 >= length) {
                        a();
                    }
                    i10 = i14 + 1;
                    char charAt4 = str.charAt(i14);
                    if (!z(charAt4)) {
                        b(charAt4, 3, "expected padding character '" + v() + "'");
                    }
                    cVar.f(i13 >> 4);
                } else {
                    int i15 = (i13 << 6) | f12;
                    if (i14 >= length) {
                        if (!y()) {
                            cVar.i(i15 >> 2);
                            return;
                        }
                        a();
                    }
                    i11 = i14 + 1;
                    char charAt5 = str.charAt(i14);
                    int f13 = f(charAt5);
                    if (f13 < 0) {
                        if (f13 != -2) {
                            b(charAt5, 3, (String) null);
                        }
                        cVar.i(i15 >> 2);
                    } else {
                        cVar.h((i15 << 6) | f13);
                    }
                }
            }
            i10 = i11;
        }
    }

    public byte[] d(String str) throws IllegalArgumentException {
        c cVar = new c();
        c(str, cVar);
        return cVar.P();
    }

    public int e(byte b10) {
        if (b10 < 0) {
            return -1;
        }
        return this.O[b10];
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int f(char c10) {
        if (c10 <= 127) {
            return this.O[c10];
        }
        return -1;
    }

    public int g(int i10) {
        if (i10 <= 127) {
            return this.O[i10];
        }
        return -1;
    }

    public String h(byte[] bArr) {
        return i(bArr, false);
    }

    public int hashCode() {
        return this.R.hashCode();
    }

    public String i(byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z10) {
            sb2.append('\"');
        }
        int s10 = s() >> 2;
        int i10 = 0;
        int i11 = length - 3;
        while (i10 <= i11) {
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = i13 + 1;
            o(sb2, (((bArr[i10] << 8) | (bArr[i12] & 255)) << 8) | (bArr[i13] & 255));
            s10--;
            if (s10 <= 0) {
                sb2.append(j.f20323c);
                sb2.append('n');
                s10 = s() >> 2;
            }
            i10 = i14;
        }
        int i15 = length - i10;
        if (i15 > 0) {
            int i16 = i10 + 1;
            int i17 = bArr[i10] << 16;
            if (i15 == 2) {
                i17 |= (bArr[i16] & 255) << 8;
            }
            r(sb2, i17, i15);
        }
        if (z10) {
            sb2.append('\"');
        }
        return sb2.toString();
    }

    public String j(byte[] bArr, boolean z10, String str) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z10) {
            sb2.append('\"');
        }
        int s10 = s() >> 2;
        int i10 = 0;
        int i11 = length - 3;
        while (i10 <= i11) {
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = i13 + 1;
            o(sb2, (((bArr[i10] << 8) | (bArr[i12] & 255)) << 8) | (bArr[i13] & 255));
            s10--;
            if (s10 <= 0) {
                sb2.append(str);
                s10 = s() >> 2;
            }
            i10 = i14;
        }
        int i15 = length - i10;
        if (i15 > 0) {
            int i16 = i10 + 1;
            int i17 = bArr[i10] << 16;
            if (i15 == 2) {
                i17 |= (bArr[i16] & 255) << 8;
            }
            r(sb2, i17, i15);
        }
        if (z10) {
            sb2.append('\"');
        }
        return sb2.toString();
    }

    public byte k(int i10) {
        return this.Q[i10];
    }

    public char l(int i10) {
        return this.P[i10];
    }

    public int m(int i10, byte[] bArr, int i11) {
        int i12 = i11 + 1;
        byte[] bArr2 = this.Q;
        bArr[i11] = bArr2[(i10 >> 18) & 63];
        int i13 = i12 + 1;
        bArr[i12] = bArr2[(i10 >> 12) & 63];
        int i14 = i13 + 1;
        bArr[i13] = bArr2[(i10 >> 6) & 63];
        int i15 = i14 + 1;
        bArr[i14] = bArr2[i10 & 63];
        return i15;
    }

    public int n(int i10, char[] cArr, int i11) {
        int i12 = i11 + 1;
        char[] cArr2 = this.P;
        cArr[i11] = cArr2[(i10 >> 18) & 63];
        int i13 = i12 + 1;
        cArr[i12] = cArr2[(i10 >> 12) & 63];
        int i14 = i13 + 1;
        cArr[i13] = cArr2[(i10 >> 6) & 63];
        int i15 = i14 + 1;
        cArr[i14] = cArr2[i10 & 63];
        return i15;
    }

    public void o(StringBuilder sb2, int i10) {
        sb2.append(this.P[(i10 >> 18) & 63]);
        sb2.append(this.P[(i10 >> 12) & 63]);
        sb2.append(this.P[(i10 >> 6) & 63]);
        sb2.append(this.P[i10 & 63]);
    }

    public int p(int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12 + 1;
        byte[] bArr2 = this.Q;
        bArr[i12] = bArr2[(i10 >> 18) & 63];
        int i14 = i13 + 1;
        bArr[i13] = bArr2[(i10 >> 12) & 63];
        if (this.S) {
            byte b10 = (byte) this.T;
            int i15 = i14 + 1;
            bArr[i14] = i11 == 2 ? bArr2[(i10 >> 6) & 63] : b10;
            int i16 = i15 + 1;
            bArr[i15] = b10;
            return i16;
        } else if (i11 != 2) {
            return i14;
        } else {
            bArr[i14] = bArr2[(i10 >> 6) & 63];
            return i14 + 1;
        }
    }

    public int q(int i10, int i11, char[] cArr, int i12) {
        int i13 = i12 + 1;
        char[] cArr2 = this.P;
        cArr[i12] = cArr2[(i10 >> 18) & 63];
        int i14 = i13 + 1;
        cArr[i13] = cArr2[(i10 >> 12) & 63];
        if (this.S) {
            int i15 = i14 + 1;
            cArr[i14] = i11 == 2 ? cArr2[(i10 >> 6) & 63] : this.T;
            int i16 = i15 + 1;
            cArr[i15] = this.T;
            return i16;
        } else if (i11 != 2) {
            return i14;
        } else {
            cArr[i14] = cArr2[(i10 >> 6) & 63];
            return i14 + 1;
        }
    }

    public void r(StringBuilder sb2, int i10, int i11) {
        char c10;
        sb2.append(this.P[(i10 >> 18) & 63]);
        sb2.append(this.P[(i10 >> 12) & 63]);
        if (this.S) {
            sb2.append(i11 == 2 ? this.P[(i10 >> 6) & 63] : this.T);
            c10 = this.T;
        } else if (i11 == 2) {
            c10 = this.P[(i10 >> 6) & 63];
        } else {
            return;
        }
        sb2.append(c10);
    }

    public int s() {
        return this.U;
    }

    public String t() {
        return this.R;
    }

    public String toString() {
        return this.R;
    }

    public byte u() {
        return (byte) this.T;
    }

    public char v() {
        return this.T;
    }

    public String w() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end", new Object[]{t(), Character.valueOf(v())});
    }

    public Object x() {
        return b.b(this.R);
    }

    public boolean y() {
        return this.S;
    }

    public boolean z(char c10) {
        return c10 == this.T;
    }
}

package c5;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public final class o extends Writer {
    public static final int U = 55296;
    public static final int V = 56319;
    public static final int W = 56320;
    public static final int X = 57343;
    public final d O;
    public OutputStream P;
    public byte[] Q;
    public final int R;
    public int S = 0;
    public int T;

    public o(d dVar, OutputStream outputStream) {
        this.O = dVar;
        this.P = outputStream;
        byte[] l10 = dVar.l();
        this.Q = l10;
        this.R = l10.length - 4;
    }

    public static void f(int i10) throws IOException {
        throw new IOException(g(i10));
    }

    public static String g(int i10) {
        if (i10 > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i10) + ") to output; max is 0x10FFFF as per RFC 4627";
        } else if (i10 < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i10) + ") to output";
        } else if (i10 <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i10) + ")";
        } else {
            return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i10) + ")";
        }
    }

    public Writer append(char c10) throws IOException {
        write((int) c10);
        return this;
    }

    public int c(int i10) throws IOException {
        int i11 = this.T;
        this.T = 0;
        if (i10 >= 56320 && i10 <= 57343) {
            return ((i11 - 55296) << 10) + 65536 + (i10 - 56320);
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i11) + ", second 0x" + Integer.toHexString(i10) + "; illegal combination");
    }

    public void close() throws IOException {
        OutputStream outputStream = this.P;
        if (outputStream != null) {
            int i10 = this.S;
            if (i10 > 0) {
                outputStream.write(this.Q, 0, i10);
                this.S = 0;
            }
            OutputStream outputStream2 = this.P;
            this.P = null;
            byte[] bArr = this.Q;
            if (bArr != null) {
                this.Q = null;
                this.O.w(bArr);
            }
            outputStream2.close();
            int i11 = this.T;
            this.T = 0;
            if (i11 > 0) {
                f(i11);
            }
        }
    }

    public void flush() throws IOException {
        OutputStream outputStream = this.P;
        if (outputStream != null) {
            int i10 = this.S;
            if (i10 > 0) {
                outputStream.write(this.Q, 0, i10);
                this.S = 0;
            }
            this.P.flush();
        }
    }

    public void write(int i10) throws IOException {
        int i11;
        if (this.T > 0) {
            i10 = c(i10);
        } else if (i10 >= 55296 && i10 <= 57343) {
            if (i10 > 56319) {
                f(i10);
            }
            this.T = i10;
            return;
        }
        int i12 = this.S;
        if (i12 >= this.R) {
            this.P.write(this.Q, 0, i12);
            this.S = 0;
        }
        if (i10 < 128) {
            byte[] bArr = this.Q;
            int i13 = this.S;
            this.S = i13 + 1;
            bArr[i13] = (byte) i10;
            return;
        }
        int i14 = this.S;
        if (i10 < 2048) {
            byte[] bArr2 = this.Q;
            int i15 = i14 + 1;
            bArr2[i14] = (byte) ((i10 >> 6) | 192);
            i11 = i15 + 1;
            bArr2[i15] = (byte) ((i10 & 63) | 128);
        } else if (i10 <= 65535) {
            byte[] bArr3 = this.Q;
            int i16 = i14 + 1;
            bArr3[i14] = (byte) ((i10 >> 12) | 224);
            int i17 = i16 + 1;
            bArr3[i16] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i17] = (byte) ((i10 & 63) | 128);
            i11 = i17 + 1;
        } else {
            if (i10 > 1114111) {
                f(i10);
            }
            byte[] bArr4 = this.Q;
            int i18 = i14 + 1;
            bArr4[i14] = (byte) ((i10 >> 18) | 240);
            int i19 = i18 + 1;
            bArr4[i18] = (byte) (((i10 >> 12) & 63) | 128);
            int i20 = i19 + 1;
            bArr4[i19] = (byte) (((i10 >> 6) & 63) | 128);
            i11 = i20 + 1;
            bArr4[i20] = (byte) ((i10 & 63) | 128);
        }
        this.S = i11;
    }

    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    public void write(String str, int i10, int i11) throws IOException {
        if (i11 >= 2) {
            if (this.T > 0) {
                i11--;
                write(c(str.charAt(i10)));
                i10++;
            }
            int i12 = this.S;
            byte[] bArr = this.Q;
            int i13 = this.R;
            int i14 = i11 + r9;
            while (r9 < i14) {
                if (i12 >= i13) {
                    this.P.write(bArr, 0, i12);
                    i12 = 0;
                }
                int i15 = r9 + 1;
                char charAt = str.charAt(r9);
                if (charAt < 128) {
                    int i16 = i12 + 1;
                    bArr[i12] = (byte) charAt;
                    int i17 = i14 - i15;
                    int i18 = i13 - i16;
                    if (i17 > i18) {
                        i17 = i18;
                    }
                    int i19 = i17 + i15;
                    while (true) {
                        r9 = i15;
                        i12 = i16;
                        if (r9 >= i19) {
                            continue;
                            break;
                        }
                        i15 = r9 + 1;
                        charAt = str.charAt(r9);
                        if (charAt >= 128) {
                            break;
                        }
                        i16 = i12 + 1;
                        bArr[i12] = (byte) charAt;
                    }
                }
                if (charAt < 2048) {
                    int i20 = i12 + 1;
                    bArr[i12] = (byte) ((charAt >> 6) | 192);
                    i12 = i20 + 1;
                    bArr[i20] = (byte) ((charAt & '?') | 128);
                    r9 = i15;
                } else if (charAt < 55296 || charAt > 57343) {
                    int i21 = i12 + 1;
                    bArr[i12] = (byte) ((charAt >> 12) | 224);
                    int i22 = i21 + 1;
                    bArr[i21] = (byte) (((charAt >> 6) & 63) | 128);
                    bArr[i22] = (byte) ((charAt & '?') | 128);
                    r9 = i15;
                    i12 = i22 + 1;
                } else {
                    if (charAt > 56319) {
                        this.S = i12;
                        f(charAt);
                    }
                    this.T = charAt;
                    if (i15 >= i14) {
                        break;
                    }
                    r9 = i15 + 1;
                    int c10 = c(str.charAt(i15));
                    if (c10 > 1114111) {
                        this.S = i12;
                        f(c10);
                    }
                    int i23 = i12 + 1;
                    bArr[i12] = (byte) ((c10 >> 18) | 240);
                    int i24 = i23 + 1;
                    bArr[i23] = (byte) (((c10 >> 12) & 63) | 128);
                    int i25 = i24 + 1;
                    bArr[i24] = (byte) (((c10 >> 6) & 63) | 128);
                    i12 = i25 + 1;
                    bArr[i25] = (byte) ((c10 & 63) | 128);
                }
            }
            this.S = i12;
        } else if (i11 == 1) {
            write((int) str.charAt(i10));
        }
    }

    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    public void write(char[] cArr, int i10, int i11) throws IOException {
        if (i11 >= 2) {
            if (this.T > 0) {
                i11--;
                write(c(cArr[i10]));
                i10++;
            }
            int i12 = this.S;
            byte[] bArr = this.Q;
            int i13 = this.R;
            int i14 = i11 + r9;
            while (r9 < i14) {
                if (i12 >= i13) {
                    this.P.write(bArr, 0, i12);
                    i12 = 0;
                }
                int i15 = r9 + 1;
                char c10 = cArr[r9];
                if (c10 < 128) {
                    int i16 = i12 + 1;
                    bArr[i12] = (byte) c10;
                    int i17 = i14 - i15;
                    int i18 = i13 - i16;
                    if (i17 > i18) {
                        i17 = i18;
                    }
                    int i19 = i17 + i15;
                    while (true) {
                        r9 = i15;
                        i12 = i16;
                        if (r9 >= i19) {
                            continue;
                            break;
                        }
                        i15 = r9 + 1;
                        c10 = cArr[r9];
                        if (c10 >= 128) {
                            break;
                        }
                        i16 = i12 + 1;
                        bArr[i12] = (byte) c10;
                    }
                }
                if (c10 < 2048) {
                    int i20 = i12 + 1;
                    bArr[i12] = (byte) ((c10 >> 6) | 192);
                    i12 = i20 + 1;
                    bArr[i20] = (byte) ((c10 & '?') | 128);
                    r9 = i15;
                } else if (c10 < 55296 || c10 > 57343) {
                    int i21 = i12 + 1;
                    bArr[i12] = (byte) ((c10 >> 12) | 224);
                    int i22 = i21 + 1;
                    bArr[i21] = (byte) (((c10 >> 6) & 63) | 128);
                    bArr[i22] = (byte) ((c10 & '?') | 128);
                    r9 = i15;
                    i12 = i22 + 1;
                } else {
                    if (c10 > 56319) {
                        this.S = i12;
                        f(c10);
                    }
                    this.T = c10;
                    if (i15 >= i14) {
                        break;
                    }
                    r9 = i15 + 1;
                    int c11 = c(cArr[i15]);
                    if (c11 > 1114111) {
                        this.S = i12;
                        f(c11);
                    }
                    int i23 = i12 + 1;
                    bArr[i12] = (byte) ((c11 >> 18) | 240);
                    int i24 = i23 + 1;
                    bArr[i23] = (byte) (((c11 >> 12) & 63) | 128);
                    int i25 = i24 + 1;
                    bArr[i24] = (byte) (((c11 >> 6) & 63) | 128);
                    i12 = i25 + 1;
                    bArr[i25] = (byte) ((c11 & 63) | 128);
                }
            }
            this.S = i12;
        } else if (i11 == 1) {
            write((int) cArr[i10]);
        }
    }
}

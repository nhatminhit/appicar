package ld;

import fh.g;
import fh.h;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class b {

    /* renamed from: d  reason: collision with root package name */
    public static final int f20570d = 17;

    /* renamed from: e  reason: collision with root package name */
    public static final int f20571e = 18;

    /* renamed from: f  reason: collision with root package name */
    public static final int f20572f = 20;

    /* renamed from: g  reason: collision with root package name */
    public static final int f20573g = 33;

    /* renamed from: h  reason: collision with root package name */
    public static final int f20574h = 34;

    /* renamed from: i  reason: collision with root package name */
    public static final int f20575i = 36;

    /* renamed from: j  reason: collision with root package name */
    public static final int f20576j = 50;

    /* renamed from: k  reason: collision with root package name */
    public static final int f20577k = 52;

    /* renamed from: a  reason: collision with root package name */
    public int f20578a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f20579b;

    /* renamed from: c  reason: collision with root package name */
    public final ByteOrder f20580c;

    public b() {
        this((byte[]) null, ByteOrder.LITTLE_ENDIAN);
    }

    public b(ByteOrder byteOrder) {
        this((byte[]) null, byteOrder);
    }

    public b(byte[] bArr) {
        this(bArr, 0, ByteOrder.LITTLE_ENDIAN);
    }

    public b(byte[] bArr, int i10) {
        this(bArr, i10, ByteOrder.LITTLE_ENDIAN);
    }

    public b(byte[] bArr, int i10, ByteOrder byteOrder) {
        this.f20579b = bArr;
        this.f20578a = i10;
        this.f20580c = byteOrder;
    }

    public b(byte[] bArr, ByteOrder byteOrder) {
        this(bArr, 0, byteOrder);
    }

    @g
    public static byte[] K(@h String str) {
        if (str == null) {
            return new byte[0];
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) Integer.parseInt(str.substring(i11, i11 + 2), 16);
        }
        return bArr;
    }

    @g
    public static String a(@h byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(String.format("%02x", new Object[]{Integer.valueOf(bArr[i10] & 255)}));
        }
        return sb2.toString();
    }

    public static byte[] w(byte[]... bArr) {
        int i10 = 0;
        for (byte[] length : bArr) {
            i10 += length.length;
        }
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        for (byte[] bArr3 : bArr) {
            System.arraycopy(bArr3, 0, bArr2, i11, bArr3.length);
            i11 += bArr3.length;
        }
        return bArr2;
    }

    public boolean A(float f10, int i10) {
        return B((int) ((float) (((double) f10) * Math.pow(10.0d, (double) i10))), -i10, 52, this.f20578a);
    }

    public boolean B(int i10, int i11, int i12, int i13) {
        x(t(i12) + i13);
        if (i12 == 50) {
            int v10 = v(i10, 12);
            int v11 = v(i11, 4);
            if (this.f20580c == ByteOrder.LITTLE_ENDIAN) {
                byte[] bArr = this.f20579b;
                int i14 = i13 + 1;
                bArr[i13] = (byte) (v10 & 255);
                byte b10 = (byte) ((v10 >> 8) & 15);
                bArr[i14] = b10;
                bArr[i14] = (byte) (b10 + ((byte) ((v11 & 15) << 4)));
                return true;
            }
            byte[] bArr2 = this.f20579b;
            byte b11 = (byte) ((v10 >> 8) & 15);
            bArr2[i13] = b11;
            bArr2[i13] = (byte) (b11 + ((byte) ((v11 & 15) << 4)));
            bArr2[i13 + 1] = (byte) (v10 & 255);
            return true;
        } else if (i12 != 52) {
            return false;
        } else {
            int v12 = v(i10, 24);
            int v13 = v(i11, 8);
            if (this.f20580c == ByteOrder.LITTLE_ENDIAN) {
                byte[] bArr3 = this.f20579b;
                int i15 = i13 + 1;
                bArr3[i13] = (byte) (v12 & 255);
                int i16 = i15 + 1;
                bArr3[i15] = (byte) ((v12 >> 8) & 255);
                int i17 = i16 + 1;
                bArr3[i16] = (byte) ((v12 >> 16) & 255);
                bArr3[i17] = (byte) (bArr3[i17] + ((byte) (v13 & 255)));
                return true;
            }
            byte[] bArr4 = this.f20579b;
            int i18 = i13 + 1;
            bArr4[i13] = (byte) (bArr4[i13] + ((byte) (v13 & 255)));
            int i19 = i18 + 1;
            bArr4[i18] = (byte) ((v12 >> 16) & 255);
            bArr4[i19] = (byte) ((v12 >> 8) & 255);
            bArr4[i19 + 1] = (byte) (v12 & 255);
            return true;
        }
    }

    public boolean C(int i10, int i11) {
        boolean D = D(i10, i11, this.f20578a);
        if (D) {
            this.f20578a += t(i11);
        }
        return D;
    }

    public boolean D(int i10, int i11, int i12) {
        x(t(i11) + i12);
        if (i11 != 17) {
            if (i11 != 18) {
                if (i11 != 20) {
                    if (i11 == 36) {
                        i10 = v(i10, 32);
                    } else if (i11 == 33) {
                        i10 = v(i10, 8);
                    } else if (i11 != 34) {
                        return false;
                    } else {
                        i10 = v(i10, 16);
                    }
                }
                if (this.f20580c == ByteOrder.LITTLE_ENDIAN) {
                    byte[] bArr = this.f20579b;
                    int i13 = i12 + 1;
                    bArr[i12] = (byte) (i10 & 255);
                    int i14 = i13 + 1;
                    bArr[i13] = (byte) ((i10 >> 8) & 255);
                    bArr[i14] = (byte) ((i10 >> 16) & 255);
                    bArr[i14 + 1] = (byte) ((i10 >> 24) & 255);
                    return true;
                }
                byte[] bArr2 = this.f20579b;
                int i15 = i12 + 1;
                bArr2[i12] = (byte) ((i10 >> 24) & 255);
                int i16 = i15 + 1;
                bArr2[i15] = (byte) ((i10 >> 16) & 255);
                bArr2[i16] = (byte) ((i10 >> 8) & 255);
                bArr2[i16 + 1] = (byte) (i10 & 255);
                return true;
            }
            if (this.f20580c == ByteOrder.LITTLE_ENDIAN) {
                byte[] bArr3 = this.f20579b;
                bArr3[i12] = (byte) (i10 & 255);
                bArr3[i12 + 1] = (byte) ((i10 >> 8) & 255);
                return true;
            }
            byte[] bArr4 = this.f20579b;
            bArr4[i12] = (byte) ((i10 >> 8) & 255);
            bArr4[i12 + 1] = (byte) (i10 & 255);
            return true;
        }
        this.f20579b[i12] = (byte) (i10 & 255);
        return true;
    }

    public boolean E(long j10) {
        return F(j10, this.f20578a);
    }

    public boolean F(long j10, int i10) {
        x(i10 + 8);
        if (this.f20580c == ByteOrder.BIG_ENDIAN) {
            for (int i11 = 7; i11 >= 0; i11--) {
                this.f20579b[i11 + i10] = (byte) ((int) (j10 & 255));
                j10 >>= 8;
            }
            return true;
        }
        for (int i12 = 0; i12 < 8; i12++) {
            this.f20579b[i12 + i10] = (byte) ((int) (j10 & 255));
            j10 >>= 8;
        }
        return true;
    }

    public void G(int i10) {
        this.f20578a = i10;
    }

    public boolean H(String str) {
        if (str == null) {
            return false;
        }
        I(str, this.f20578a);
        this.f20578a += str.getBytes().length;
        return true;
    }

    public boolean I(String str, int i10) {
        if (str == null) {
            return false;
        }
        x(str.length() + i10);
        byte[] bytes = str.getBytes();
        System.arraycopy(bytes, 0, this.f20579b, i10, bytes.length);
        return true;
    }

    public void J(byte[] bArr) {
        this.f20579b = bArr;
    }

    public final int L(byte b10) {
        return b10 & 255;
    }

    public final int M(byte b10, byte b11) {
        return L(b10) + (L(b11) << 8);
    }

    public final int N(byte b10, byte b11, byte b12, byte b13) {
        return L(b10) + (L(b11) << 8) + (L(b12) << 16) + (L(b13) << 24);
    }

    public final int O(int i10, int i11) {
        int i12 = 1 << (i11 - 1);
        return (i10 & i12) != 0 ? (i12 - (i10 & (i12 - 1))) * -1 : i10;
    }

    public final float b(byte b10, byte b11) {
        return (float) (((double) O(L(b10) + ((L(b11) & 15) << 8), 12)) * Math.pow(10.0d, (double) O(L(b11) >> 4, 4)));
    }

    public final float c(byte b10, byte b11, byte b12, byte b13) {
        return (float) (((double) O(L(b10) + (L(b11) << 8) + (L(b12) << 16), 24)) * Math.pow(10.0d, (double) b13));
    }

    public byte[] d(int i10) {
        byte[] bArr = this.f20579b;
        int i11 = this.f20578a;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i11, i11 + i10);
        this.f20578a += i10;
        return copyOfRange;
    }

    public ByteOrder e() {
        return this.f20580c;
    }

    public Date f() {
        Date g10 = g(this.f20578a);
        this.f20578a += 7;
        return g10;
    }

    public Date g(int i10) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        int intValue = l(18, i10, byteOrder).intValue();
        int t10 = i10 + t(18);
        int intValue2 = l(17, t10, byteOrder).intValue();
        int t11 = t10 + t(17);
        int intValue3 = l(17, t11, byteOrder).intValue();
        int t12 = t11 + t(17);
        int intValue4 = l(17, t12, byteOrder).intValue();
        int t13 = t12 + t(17);
        return new GregorianCalendar(intValue, intValue2 - 1, intValue3, intValue4, l(17, t13, byteOrder).intValue(), l(17, t13 + t(17), byteOrder).intValue()).getTime();
    }

    public Float h(int i10) {
        Float i11 = i(i10, this.f20578a, this.f20580c);
        this.f20578a += t(i10);
        return i11;
    }

    public Float i(int i10, int i11, ByteOrder byteOrder) {
        byte b10;
        byte b11;
        float b12;
        byte b13;
        byte b14;
        byte b15;
        byte b16;
        int t10 = t(i10) + i11;
        byte[] bArr = this.f20579b;
        if (t10 > bArr.length) {
            return null;
        }
        if (i10 == 50) {
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                b10 = bArr[i11];
                b11 = bArr[i11 + 1];
            } else {
                b10 = bArr[i11 + 1];
                b11 = bArr[i11];
            }
            b12 = b(b10, b11);
        } else if (i10 != 52) {
            return null;
        } else {
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                b13 = bArr[i11];
                b14 = bArr[i11 + 1];
                b15 = bArr[i11 + 2];
                b16 = bArr[i11 + 3];
            } else {
                b13 = bArr[i11 + 3];
                b14 = bArr[i11 + 2];
                b15 = bArr[i11 + 1];
                b16 = bArr[i11];
            }
            b12 = c(b13, b14, b15, b16);
        }
        return Float.valueOf(b12);
    }

    public Float j(int i10, ByteOrder byteOrder) {
        Float i11 = i(i10, this.f20578a, byteOrder);
        this.f20578a += t(i10);
        return i11;
    }

    public Integer k(int i10) {
        Integer l10 = l(i10, this.f20578a, this.f20580c);
        this.f20578a += t(i10);
        return l10;
    }

    public Integer l(int i10, int i11, ByteOrder byteOrder) {
        int L;
        byte b10;
        byte b11;
        byte b12;
        byte b13;
        byte b14;
        byte b15;
        int i12;
        byte b16;
        byte b17;
        byte b18;
        byte b19;
        int N;
        byte b20;
        byte b21;
        int t10 = t(i10) + i11;
        byte[] bArr = this.f20579b;
        if (t10 > bArr.length) {
            return null;
        }
        if (i10 == 17) {
            L = L(bArr[i11]);
        } else if (i10 == 18) {
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                b10 = bArr[i11];
                b11 = bArr[i11 + 1];
            } else {
                b10 = bArr[i11 + 1];
                b11 = bArr[i11];
            }
            L = M(b10, b11);
        } else if (i10 != 20) {
            if (i10 == 36) {
                i12 = 32;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    b16 = bArr[i11];
                    b17 = bArr[i11 + 1];
                    b18 = bArr[i11 + 2];
                    b19 = bArr[i11 + 3];
                } else {
                    b16 = bArr[i11 + 3];
                    b17 = bArr[i11 + 2];
                    b18 = bArr[i11 + 1];
                    b19 = bArr[i11];
                }
                N = N(b16, b17, b18, b19);
            } else if (i10 == 33) {
                L = O(L(bArr[i11]), 8);
            } else if (i10 != 34) {
                return null;
            } else {
                i12 = 16;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    b20 = bArr[i11];
                    b21 = bArr[i11 + 1];
                } else {
                    b20 = bArr[i11 + 1];
                    b21 = bArr[i11];
                }
                N = M(b20, b21);
            }
            L = O(N, i12);
        } else {
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                b12 = bArr[i11];
                b13 = bArr[i11 + 1];
                b14 = bArr[i11 + 2];
                b15 = bArr[i11 + 3];
            } else {
                b12 = bArr[i11 + 3];
                b13 = bArr[i11 + 2];
                b14 = bArr[i11 + 1];
                b15 = bArr[i11];
            }
            L = N(b12, b13, b14, b15);
        }
        return Integer.valueOf(L);
    }

    public Integer m(int i10, ByteOrder byteOrder) {
        Integer l10 = l(i10, this.f20578a, byteOrder);
        this.f20578a += t(i10);
        return l10;
    }

    public long n() {
        return p(this.f20580c);
    }

    public long o(int i10, ByteOrder byteOrder) {
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            long j10 = (long) (this.f20579b[i10 + 7] & 255);
            for (int i11 = 6; i11 >= 0; i11--) {
                j10 = (j10 << 8) + ((long) (this.f20579b[i11 + i10] & 255));
            }
            return j10;
        }
        long j11 = (long) (this.f20579b[i10] & 255);
        for (int i12 = 1; i12 < 8; i12++) {
            j11 = (j11 << 8) + ((long) (this.f20579b[i12 + i10] & 255));
        }
        return j11;
    }

    public long p(ByteOrder byteOrder) {
        long o10 = o(this.f20578a, byteOrder);
        this.f20578a += 8;
        return o10;
    }

    public int q() {
        return this.f20578a;
    }

    public String r() {
        return s(this.f20578a);
    }

    public String s(int i10) {
        byte[] bArr = this.f20579b;
        if (bArr == null || i10 > bArr.length) {
            return null;
        }
        int length = bArr.length - i10;
        byte[] bArr2 = new byte[length];
        int i11 = 0;
        while (true) {
            byte[] bArr3 = this.f20579b;
            if (i11 == bArr3.length - i10) {
                break;
            }
            bArr2[i11] = bArr3[i10 + i11];
            i11++;
        }
        while (length > 0) {
            byte b10 = bArr2[length - 1];
            if (b10 != 0 && b10 != 32) {
                break;
            }
            length--;
        }
        return new String(bArr2, 0, length, StandardCharsets.ISO_8859_1);
    }

    public final int t(int i10) {
        return i10 & 15;
    }

    public String toString() {
        return a(this.f20579b);
    }

    public byte[] u() {
        return this.f20579b;
    }

    public final int v(int i10, int i11) {
        if (i10 >= 0) {
            return i10;
        }
        int i12 = 1 << (i11 - 1);
        return (i10 & (i12 - 1)) + i12;
    }

    public final void x(int i10) {
        if (this.f20579b == null) {
            this.f20579b = new byte[i10];
        }
        byte[] bArr = this.f20579b;
        if (i10 > bArr.length) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f20579b = bArr2;
        }
    }

    public boolean y(Calendar calendar) {
        if (calendar == null) {
            return false;
        }
        byte[] bArr = new byte[10];
        this.f20579b = bArr;
        bArr[0] = (byte) calendar.get(1);
        this.f20579b[1] = (byte) (calendar.get(1) >> 8);
        this.f20579b[2] = (byte) (calendar.get(2) + 1);
        this.f20579b[3] = (byte) calendar.get(5);
        this.f20579b[4] = (byte) calendar.get(11);
        this.f20579b[5] = (byte) calendar.get(12);
        this.f20579b[6] = (byte) calendar.get(13);
        this.f20579b[7] = (byte) (((calendar.get(7) + 5) % 7) + 1);
        this.f20579b[8] = (byte) ((calendar.get(14) * 256) / 1000);
        this.f20579b[9] = 1;
        return true;
    }

    public boolean z(Calendar calendar) {
        if (calendar == null) {
            return false;
        }
        byte[] bArr = new byte[7];
        this.f20579b = bArr;
        bArr[0] = (byte) calendar.get(1);
        this.f20579b[1] = (byte) (calendar.get(1) >> 8);
        this.f20579b[2] = (byte) (calendar.get(2) + 1);
        this.f20579b[3] = (byte) calendar.get(5);
        this.f20579b[4] = (byte) calendar.get(11);
        this.f20579b[5] = (byte) calendar.get(12);
        this.f20579b[6] = (byte) calendar.get(13);
        return true;
    }
}

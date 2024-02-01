package w7;

import d.o0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import w1.a;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f14880a;

    /* renamed from: b  reason: collision with root package name */
    public int f14881b;

    /* renamed from: c  reason: collision with root package name */
    public int f14882c;

    public w() {
        this.f14880a = q0.f14791f;
    }

    public w(int i10) {
        this.f14880a = new byte[i10];
        this.f14882c = i10;
    }

    public w(byte[] bArr) {
        this.f14880a = bArr;
        this.f14882c = bArr.length;
    }

    public w(byte[] bArr, int i10) {
        this.f14880a = bArr;
        this.f14882c = i10;
    }

    public String A(int i10) {
        return B(i10, Charset.forName("UTF-8"));
    }

    public String B(int i10, Charset charset) {
        String str = new String(this.f14880a, this.f14881b, i10, charset);
        this.f14881b += i10;
        return str;
    }

    public int C() {
        return (D() << 21) | (D() << 14) | (D() << 7) | D();
    }

    public int D() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        this.f14881b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int E() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        int i11 = i10 + 1;
        byte b10 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f14881b = i11 + 1 + 2;
        return b10;
    }

    public long F() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        this.f14881b = i13 + 1;
        return ((((long) bArr[i10]) & 255) << 24) | ((((long) bArr[i11]) & 255) << 16) | ((((long) bArr[i12]) & 255) << 8) | (((long) bArr[i13]) & 255);
    }

    public int G() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        byte b10 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f14881b = i12 + 1;
        return (bArr[i12] & 255) | b10;
    }

    public int H() {
        int l10 = l();
        if (l10 >= 0) {
            return l10;
        }
        throw new IllegalStateException("Top bit not zero: " + l10);
    }

    public long I() {
        long w10 = w();
        if (w10 >= 0) {
            return w10;
        }
        throw new IllegalStateException("Top bit not zero: " + w10);
    }

    public int J() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        int i11 = i10 + 1;
        this.f14881b = i11 + 1;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public long K() {
        int i10;
        int i11;
        long j10 = (long) this.f14880a[this.f14881b];
        int i12 = 7;
        while (true) {
            i10 = 1;
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((((long) i13) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= (long) (i13 - 1);
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            while (i10 < i11) {
                byte b10 = this.f14880a[this.f14881b + i10];
                if ((b10 & a.K6) == 128) {
                    j10 = (j10 << 6) | ((long) (b10 & 63));
                    i10++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
                }
            }
            this.f14881b += i11;
            return j10;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
    }

    public void L() {
        this.f14881b = 0;
        this.f14882c = 0;
    }

    public void M(int i10) {
        O(b() < i10 ? new byte[i10] : this.f14880a, i10);
    }

    public void N(byte[] bArr) {
        O(bArr, bArr.length);
    }

    public void O(byte[] bArr, int i10) {
        this.f14880a = bArr;
        this.f14882c = i10;
        this.f14881b = 0;
    }

    public void P(int i10) {
        a.a(i10 >= 0 && i10 <= this.f14880a.length);
        this.f14882c = i10;
    }

    public void Q(int i10) {
        a.a(i10 >= 0 && i10 <= this.f14882c);
        this.f14881b = i10;
    }

    public void R(int i10) {
        Q(this.f14881b + i10);
    }

    public int a() {
        return this.f14882c - this.f14881b;
    }

    public int b() {
        return this.f14880a.length;
    }

    public int c() {
        return this.f14881b;
    }

    public int d() {
        return this.f14882c;
    }

    public char e() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public int f() {
        return this.f14880a[this.f14881b] & 255;
    }

    public void g(ByteBuffer byteBuffer, int i10) {
        byteBuffer.put(this.f14880a, this.f14881b, i10);
        this.f14881b += i10;
    }

    public void h(v vVar, int i10) {
        i(vVar.f14876a, 0, i10);
        vVar.n(0);
    }

    public void i(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f14880a, this.f14881b, bArr, i10, i11);
        this.f14881b += i11;
    }

    public double j() {
        return Double.longBitsToDouble(w());
    }

    public float k() {
        return Float.intBitsToFloat(l());
    }

    public int l() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        byte b10 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i13 = i12 + 1;
        byte b11 = b10 | ((bArr[i12] & 255) << 8);
        this.f14881b = i13 + 1;
        return (bArr[i13] & 255) | b11;
    }

    public int m() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        byte b10 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        this.f14881b = i12 + 1;
        return (bArr[i12] & 255) | b10;
    }

    @o0
    public String n() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f14881b;
        while (i10 < this.f14882c && !q0.t0(this.f14880a[i10])) {
            i10++;
        }
        int i11 = this.f14881b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f14880a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f14881b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f14880a;
        int i12 = this.f14881b;
        String G = q0.G(bArr2, i12, i10 - i12);
        this.f14881b = i10;
        int i13 = this.f14882c;
        if (i10 == i13) {
            return G;
        }
        byte[] bArr3 = this.f14880a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f14881b = i14;
            if (i14 == i13) {
                return G;
            }
        }
        int i15 = this.f14881b;
        if (bArr3[i15] == 10) {
            this.f14881b = i15 + 1;
        }
        return G;
    }

    public int o() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        byte b10 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i13 = i12 + 1;
        byte b11 = b10 | ((bArr[i12] & 255) << 16);
        this.f14881b = i13 + 1;
        return ((bArr[i13] & 255) << 24) | b11;
    }

    public int p() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        byte b10 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        this.f14881b = i12 + 1;
        return ((bArr[i12] & 255) << 16) | b10;
    }

    public long q() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = i13 + 1;
        int i15 = i14 + 1;
        int i16 = i15 + 1;
        int i17 = i16 + 1;
        this.f14881b = i17 + 1;
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16) | ((((long) bArr[i13]) & 255) << 24) | ((((long) bArr[i14]) & 255) << 32) | ((((long) bArr[i15]) & 255) << 40) | ((((long) bArr[i16]) & 255) << 48) | ((((long) bArr[i17]) & 255) << 56);
    }

    public short r() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        int i11 = i10 + 1;
        this.f14881b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public long s() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        this.f14881b = i13 + 1;
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16) | ((((long) bArr[i13]) & 255) << 24);
    }

    public int t() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        byte b10 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        this.f14881b = i12 + 1;
        return ((bArr[i12] & 255) << 16) | b10;
    }

    public int u() {
        int o10 = o();
        if (o10 >= 0) {
            return o10;
        }
        throw new IllegalStateException("Top bit not zero: " + o10);
    }

    public int v() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        int i11 = i10 + 1;
        this.f14881b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public long w() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = i13 + 1;
        int i15 = i14 + 1;
        int i16 = i15 + 1;
        int i17 = i16 + 1;
        this.f14881b = i17 + 1;
        return ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i11]) & 255) << 48) | ((((long) bArr[i12]) & 255) << 40) | ((((long) bArr[i13]) & 255) << 32) | ((((long) bArr[i14]) & 255) << 24) | ((((long) bArr[i15]) & 255) << 16) | ((((long) bArr[i16]) & 255) << 8) | (((long) bArr[i17]) & 255);
    }

    @o0
    public String x() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f14881b;
        while (i10 < this.f14882c && this.f14880a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f14880a;
        int i11 = this.f14881b;
        String G = q0.G(bArr, i11, i10 - i11);
        this.f14881b = i10;
        if (i10 < this.f14882c) {
            this.f14881b = i10 + 1;
        }
        return G;
    }

    public String y(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f14881b;
        int i12 = (i11 + i10) - 1;
        String G = q0.G(this.f14880a, i11, (i12 >= this.f14882c || this.f14880a[i12] != 0) ? i10 : i10 - 1);
        this.f14881b += i10;
        return G;
    }

    public short z() {
        byte[] bArr = this.f14880a;
        int i10 = this.f14881b;
        int i11 = i10 + 1;
        this.f14881b = i11 + 1;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }
}

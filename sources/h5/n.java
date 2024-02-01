package h5;

import c5.i;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

public final class n {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f8837l = new char[0];

    /* renamed from: m  reason: collision with root package name */
    public static final int f8838m = 500;

    /* renamed from: n  reason: collision with root package name */
    public static final int f8839n = 65536;

    /* renamed from: a  reason: collision with root package name */
    public final a f8840a;

    /* renamed from: b  reason: collision with root package name */
    public char[] f8841b;

    /* renamed from: c  reason: collision with root package name */
    public int f8842c;

    /* renamed from: d  reason: collision with root package name */
    public int f8843d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<char[]> f8844e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8845f;

    /* renamed from: g  reason: collision with root package name */
    public int f8846g;

    /* renamed from: h  reason: collision with root package name */
    public char[] f8847h;

    /* renamed from: i  reason: collision with root package name */
    public int f8848i;

    /* renamed from: j  reason: collision with root package name */
    public String f8849j;

    /* renamed from: k  reason: collision with root package name */
    public char[] f8850k;

    public n(a aVar) {
        this.f8840a = aVar;
    }

    public n(a aVar, char[] cArr) {
        this.f8840a = aVar;
        this.f8847h = cArr;
        this.f8848i = cArr.length;
        this.f8842c = -1;
    }

    public static n t(char[] cArr) {
        return new n((a) null, cArr);
    }

    public void A() {
        char[] cArr;
        this.f8842c = -1;
        this.f8848i = 0;
        this.f8843d = 0;
        this.f8841b = null;
        this.f8850k = null;
        if (this.f8845f) {
            f();
        }
        a aVar = this.f8840a;
        if (aVar != null && (cArr = this.f8847h) != null) {
            this.f8847h = null;
            aVar.j(2, cArr);
        }
    }

    public void B(char c10) {
        this.f8842c = -1;
        this.f8843d = 0;
        this.f8849j = null;
        this.f8850k = null;
        if (this.f8845f) {
            f();
        } else if (this.f8847h == null) {
            this.f8847h = d(1);
        }
        this.f8847h[0] = c10;
        this.f8846g = 1;
        this.f8848i = 1;
    }

    public void C(String str, int i10, int i11) {
        this.f8841b = null;
        this.f8842c = -1;
        this.f8843d = 0;
        this.f8849j = null;
        this.f8850k = null;
        if (this.f8845f) {
            f();
        } else if (this.f8847h == null) {
            this.f8847h = d(i11);
        }
        this.f8846g = 0;
        this.f8848i = 0;
        b(str, i10, i11);
    }

    public void D(char[] cArr, int i10, int i11) {
        this.f8841b = null;
        this.f8842c = -1;
        this.f8843d = 0;
        this.f8849j = null;
        this.f8850k = null;
        if (this.f8845f) {
            f();
        } else if (this.f8847h == null) {
            this.f8847h = d(i11);
        }
        this.f8846g = 0;
        this.f8848i = 0;
        c(cArr, i10, i11);
    }

    public void E() {
        this.f8842c = -1;
        this.f8848i = 0;
        this.f8843d = 0;
        this.f8841b = null;
        this.f8849j = null;
        this.f8850k = null;
        if (this.f8845f) {
            f();
        }
    }

    public void F(char[] cArr, int i10, int i11) {
        this.f8849j = null;
        this.f8850k = null;
        this.f8841b = cArr;
        this.f8842c = i10;
        this.f8843d = i11;
        if (this.f8845f) {
            f();
        }
    }

    public void G(String str) {
        this.f8841b = null;
        this.f8842c = -1;
        this.f8843d = 0;
        this.f8849j = str;
        this.f8850k = null;
        if (this.f8845f) {
            f();
        }
        this.f8848i = 0;
    }

    public final char[] H() {
        int i10;
        String str = this.f8849j;
        if (str != null) {
            return str.toCharArray();
        }
        int i11 = this.f8842c;
        if (i11 >= 0) {
            int i12 = this.f8843d;
            return i12 < 1 ? f8837l : i11 == 0 ? Arrays.copyOf(this.f8841b, i12) : Arrays.copyOfRange(this.f8841b, i11, i12 + i11);
        }
        int K = K();
        if (K < 1) {
            return f8837l;
        }
        char[] e10 = e(K);
        ArrayList<char[]> arrayList = this.f8844e;
        if (arrayList != null) {
            int size = arrayList.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                char[] cArr = this.f8844e.get(i13);
                int length = cArr.length;
                System.arraycopy(cArr, 0, e10, i10, length);
                i10 += length;
            }
        } else {
            i10 = 0;
        }
        System.arraycopy(this.f8847h, 0, e10, i10, this.f8848i);
        return e10;
    }

    public String I(int i10) {
        this.f8848i = i10;
        if (this.f8846g > 0) {
            return l();
        }
        String str = i10 == 0 ? "" : new String(this.f8847h, 0, i10);
        this.f8849j = str;
        return str;
    }

    public void J(int i10) {
        this.f8848i = i10;
    }

    public int K() {
        if (this.f8842c >= 0) {
            return this.f8843d;
        }
        char[] cArr = this.f8850k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f8849j;
        return str != null ? str.length() : this.f8846g + this.f8848i;
    }

    public final void L(int i10) {
        int i11 = this.f8843d;
        this.f8843d = 0;
        char[] cArr = this.f8841b;
        this.f8841b = null;
        int i12 = this.f8842c;
        this.f8842c = -1;
        int i13 = i10 + i11;
        char[] cArr2 = this.f8847h;
        if (cArr2 == null || i13 > cArr2.length) {
            this.f8847h = d(i13);
        }
        if (i11 > 0) {
            System.arraycopy(cArr, i12, this.f8847h, 0, i11);
        }
        this.f8846g = 0;
        this.f8848i = i11;
    }

    public void a(char c10) {
        if (this.f8842c >= 0) {
            L(16);
        }
        this.f8849j = null;
        this.f8850k = null;
        char[] cArr = this.f8847h;
        if (this.f8848i >= cArr.length) {
            p(1);
            cArr = this.f8847h;
        }
        int i10 = this.f8848i;
        this.f8848i = i10 + 1;
        cArr[i10] = c10;
    }

    public void b(String str, int i10, int i11) {
        if (this.f8842c >= 0) {
            L(i11);
        }
        this.f8849j = null;
        this.f8850k = null;
        char[] cArr = this.f8847h;
        int length = cArr.length;
        int i12 = this.f8848i;
        int i13 = length - i12;
        if (i13 >= i11) {
            str.getChars(i10, i10 + i11, cArr, i12);
            this.f8848i += i11;
            return;
        }
        if (i13 > 0) {
            int i14 = i10 + i13;
            str.getChars(i10, i14, cArr, i12);
            i11 -= i13;
            i10 = i14;
        }
        while (true) {
            p(i11);
            int min = Math.min(this.f8847h.length, i11);
            int i15 = i10 + min;
            str.getChars(i10, i15, this.f8847h, 0);
            this.f8848i += min;
            i11 -= min;
            if (i11 > 0) {
                i10 = i15;
            } else {
                return;
            }
        }
    }

    public void c(char[] cArr, int i10, int i11) {
        if (this.f8842c >= 0) {
            L(i11);
        }
        this.f8849j = null;
        this.f8850k = null;
        char[] cArr2 = this.f8847h;
        int length = cArr2.length;
        int i12 = this.f8848i;
        int i13 = length - i12;
        if (i13 >= i11) {
            System.arraycopy(cArr, i10, cArr2, i12, i11);
            this.f8848i += i11;
            return;
        }
        if (i13 > 0) {
            System.arraycopy(cArr, i10, cArr2, i12, i13);
            i10 += i13;
            i11 -= i13;
        }
        do {
            p(i11);
            int min = Math.min(this.f8847h.length, i11);
            System.arraycopy(cArr, i10, this.f8847h, 0, min);
            this.f8848i += min;
            i10 += min;
            i11 -= min;
        } while (i11 > 0);
    }

    public final char[] d(int i10) {
        a aVar = this.f8840a;
        return aVar != null ? aVar.d(2, i10) : new char[Math.max(i10, 500)];
    }

    public final char[] e(int i10) {
        return new char[i10];
    }

    public final void f() {
        this.f8845f = false;
        this.f8844e.clear();
        this.f8846g = 0;
        this.f8848i = 0;
    }

    public char[] g() {
        char[] cArr = this.f8850k;
        if (cArr != null) {
            return cArr;
        }
        char[] H = H();
        this.f8850k = H;
        return H;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r0 = r3.f8847h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.math.BigDecimal h() throws java.lang.NumberFormatException {
        /*
            r3 = this;
            char[] r0 = r3.f8850k
            if (r0 == 0) goto L_0x0009
            java.math.BigDecimal r0 = c5.i.h(r0)
            return r0
        L_0x0009:
            int r0 = r3.f8842c
            if (r0 < 0) goto L_0x0018
            char[] r1 = r3.f8841b
            if (r1 == 0) goto L_0x0018
            int r2 = r3.f8843d
            java.math.BigDecimal r0 = c5.i.i(r1, r0, r2)
            return r0
        L_0x0018:
            int r0 = r3.f8846g
            if (r0 != 0) goto L_0x0028
            char[] r0 = r3.f8847h
            if (r0 == 0) goto L_0x0028
            r1 = 0
            int r2 = r3.f8848i
            java.math.BigDecimal r0 = c5.i.i(r0, r1, r2)
            return r0
        L_0x0028:
            char[] r0 = r3.g()
            java.math.BigDecimal r0 = c5.i.h(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.n.h():java.math.BigDecimal");
    }

    public double i() throws NumberFormatException {
        return i.j(l());
    }

    public int j(boolean z10) {
        char[] cArr;
        int i10 = this.f8842c;
        return (i10 < 0 || (cArr = this.f8841b) == null) ? z10 ? -i.l(this.f8847h, 1, this.f8848i - 1) : i.l(this.f8847h, 0, this.f8848i) : z10 ? -i.l(cArr, i10 + 1, this.f8843d - 1) : i.l(cArr, i10, this.f8843d);
    }

    public long k(boolean z10) {
        char[] cArr;
        int i10 = this.f8842c;
        return (i10 < 0 || (cArr = this.f8841b) == null) ? z10 ? -i.n(this.f8847h, 1, this.f8848i - 1) : i.n(this.f8847h, 0, this.f8848i) : z10 ? -i.n(cArr, i10 + 1, this.f8843d - 1) : i.n(cArr, i10, this.f8843d);
    }

    public String l() {
        String str;
        if (this.f8849j == null) {
            char[] cArr = this.f8850k;
            if (cArr != null) {
                str = new String(cArr);
            } else {
                int i10 = this.f8842c;
                str = "";
                if (i10 >= 0) {
                    int i11 = this.f8843d;
                    if (i11 < 1) {
                        this.f8849j = str;
                        return str;
                    }
                    str = new String(this.f8841b, i10, i11);
                } else {
                    int i12 = this.f8846g;
                    int i13 = this.f8848i;
                    if (i12 != 0) {
                        StringBuilder sb2 = new StringBuilder(i12 + i13);
                        ArrayList<char[]> arrayList = this.f8844e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                char[] cArr2 = this.f8844e.get(i14);
                                sb2.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb2.append(this.f8847h, 0, this.f8848i);
                        this.f8849j = sb2.toString();
                    } else if (i13 != 0) {
                        str = new String(this.f8847h, 0, i13);
                    }
                }
            }
            this.f8849j = str;
        }
        return this.f8849j;
    }

    public int m(Writer writer) throws IOException {
        int i10;
        char[] cArr = this.f8850k;
        if (cArr != null) {
            writer.write(cArr);
            return this.f8850k.length;
        }
        String str = this.f8849j;
        if (str != null) {
            writer.write(str);
            return this.f8849j.length();
        }
        int i11 = this.f8842c;
        if (i11 >= 0) {
            int i12 = this.f8843d;
            if (i12 > 0) {
                writer.write(this.f8841b, i11, i12);
            }
            return i12;
        }
        ArrayList<char[]> arrayList = this.f8844e;
        if (arrayList != null) {
            int size = arrayList.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                char[] cArr2 = this.f8844e.get(i13);
                int length = cArr2.length;
                writer.write(cArr2, 0, length);
                i10 += length;
            }
        } else {
            i10 = 0;
        }
        int i14 = this.f8848i;
        if (i14 <= 0) {
            return i10;
        }
        writer.write(this.f8847h, 0, i14);
        return i10 + i14;
    }

    public char[] n() {
        this.f8842c = -1;
        this.f8848i = 0;
        this.f8843d = 0;
        this.f8841b = null;
        this.f8849j = null;
        this.f8850k = null;
        if (this.f8845f) {
            f();
        }
        char[] cArr = this.f8847h;
        if (cArr != null) {
            return cArr;
        }
        char[] d10 = d(0);
        this.f8847h = d10;
        return d10;
    }

    public void o() {
        if (this.f8842c >= 0) {
            L(16);
        }
    }

    public final void p(int i10) {
        if (this.f8844e == null) {
            this.f8844e = new ArrayList<>();
        }
        char[] cArr = this.f8847h;
        this.f8845f = true;
        this.f8844e.add(cArr);
        this.f8846g += cArr.length;
        this.f8848i = 0;
        int length = cArr.length;
        int i11 = length + (length >> 1);
        if (i11 < 500) {
            i11 = 500;
        } else if (i11 > 65536) {
            i11 = 65536;
        }
        this.f8847h = e(i11);
    }

    public char[] q() {
        char[] cArr = this.f8847h;
        int length = cArr.length;
        int i10 = (length >> 1) + length;
        if (i10 > 65536) {
            i10 = (length >> 2) + length;
        }
        char[] copyOf = Arrays.copyOf(cArr, i10);
        this.f8847h = copyOf;
        return copyOf;
    }

    public char[] r(int i10) {
        char[] cArr = this.f8847h;
        if (cArr.length >= i10) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, i10);
        this.f8847h = copyOf;
        return copyOf;
    }

    public char[] s() {
        if (this.f8844e == null) {
            this.f8844e = new ArrayList<>();
        }
        this.f8845f = true;
        this.f8844e.add(this.f8847h);
        int length = this.f8847h.length;
        this.f8846g += length;
        this.f8848i = 0;
        int i10 = length + (length >> 1);
        if (i10 < 500) {
            i10 = 500;
        } else if (i10 > 65536) {
            i10 = 65536;
        }
        char[] e10 = e(i10);
        this.f8847h = e10;
        return e10;
    }

    public String toString() {
        return l();
    }

    public char[] u() {
        return this.f8847h;
    }

    public char[] v() {
        if (this.f8842c >= 0) {
            L(1);
        } else {
            char[] cArr = this.f8847h;
            if (cArr == null) {
                this.f8847h = d(0);
            } else if (this.f8848i >= cArr.length) {
                p(1);
            }
        }
        return this.f8847h;
    }

    public int w() {
        return this.f8848i;
    }

    public char[] x() {
        if (this.f8842c >= 0) {
            return this.f8841b;
        }
        char[] cArr = this.f8850k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f8849j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f8850k = charArray;
            return charArray;
        } else if (this.f8845f) {
            return g();
        } else {
            char[] cArr2 = this.f8847h;
            return cArr2 == null ? f8837l : cArr2;
        }
    }

    public int y() {
        int i10 = this.f8842c;
        if (i10 >= 0) {
            return i10;
        }
        return 0;
    }

    public boolean z() {
        return this.f8842c >= 0 || this.f8850k != null || this.f8849j == null;
    }
}

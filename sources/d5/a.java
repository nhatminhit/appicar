package d5;

import b5.c;
import c5.d;
import c5.h;
import c5.n;
import f5.b;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import w4.e;
import w4.f;
import w4.l;
import w4.s;

public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final byte f6089i = -17;

    /* renamed from: j  reason: collision with root package name */
    public static final byte f6090j = -69;

    /* renamed from: k  reason: collision with root package name */
    public static final byte f6091k = -65;

    /* renamed from: a  reason: collision with root package name */
    public final d f6092a;

    /* renamed from: b  reason: collision with root package name */
    public final InputStream f6093b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f6094c;

    /* renamed from: d  reason: collision with root package name */
    public int f6095d;

    /* renamed from: e  reason: collision with root package name */
    public int f6096e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6097f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6098g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f6099h;

    public a(d dVar, InputStream inputStream) {
        this.f6092a = dVar;
        this.f6093b = inputStream;
        this.f6094c = dVar.h();
        this.f6095d = 0;
        this.f6096e = 0;
        this.f6097f = true;
    }

    public a(d dVar, byte[] bArr, int i10, int i11) {
        this.f6092a = dVar;
        this.f6093b = null;
        this.f6094c = bArr;
        this.f6095d = i10;
        this.f6096e = i10 + i11;
        this.f6097f = false;
    }

    public static b5.d h(c cVar) throws IOException {
        String str;
        if (!cVar.b()) {
            return b5.d.INCONCLUSIVE;
        }
        byte a10 = cVar.a();
        if (a10 == -17) {
            if (!cVar.b()) {
                return b5.d.INCONCLUSIVE;
            }
            if (cVar.a() != -69) {
                return b5.d.NO_MATCH;
            }
            if (!cVar.b()) {
                return b5.d.INCONCLUSIVE;
            }
            if (cVar.a() != -65) {
                return b5.d.NO_MATCH;
            }
            if (!cVar.b()) {
                return b5.d.INCONCLUSIVE;
            }
            a10 = cVar.a();
        }
        int k10 = k(cVar, a10);
        if (k10 < 0) {
            return b5.d.INCONCLUSIVE;
        }
        if (k10 == 123) {
            int j10 = j(cVar);
            return j10 < 0 ? b5.d.INCONCLUSIVE : (j10 == 34 || j10 == 125) ? b5.d.SOLID_MATCH : b5.d.NO_MATCH;
        } else if (k10 == 91) {
            int j11 = j(cVar);
            return j11 < 0 ? b5.d.INCONCLUSIVE : (j11 == 93 || j11 == 91) ? b5.d.SOLID_MATCH : b5.d.SOLID_MATCH;
        } else {
            b5.d dVar = b5.d.WEAK_MATCH;
            if (k10 == 34) {
                return dVar;
            }
            if (k10 <= 57 && k10 >= 48) {
                return dVar;
            }
            if (k10 == 45) {
                int j12 = j(cVar);
                return j12 < 0 ? b5.d.INCONCLUSIVE : (j12 > 57 || j12 < 48) ? b5.d.NO_MATCH : dVar;
            }
            if (k10 == 110) {
                str = "ull";
            } else if (k10 == 116) {
                str = "rue";
            } else if (k10 != 102) {
                return b5.d.NO_MATCH;
            } else {
                str = "alse";
            }
            return m(cVar, str, dVar);
        }
    }

    public static int j(c cVar) throws IOException {
        if (!cVar.b()) {
            return -1;
        }
        return k(cVar, cVar.a());
    }

    public static int k(c cVar, byte b10) throws IOException {
        while (true) {
            byte b11 = b10 & 255;
            if (b11 != 32 && b11 != 13 && b11 != 10 && b11 != 9) {
                return b11;
            }
            if (!cVar.b()) {
                return -1;
            }
            b10 = cVar.a();
        }
    }

    public static int l(DataInput dataInput) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte != 239) {
            return readUnsignedByte;
        }
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        if (readUnsignedByte2 == 187) {
            int readUnsignedByte3 = dataInput.readUnsignedByte();
            if (readUnsignedByte3 == 191) {
                return dataInput.readUnsignedByte();
            }
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(readUnsignedByte3) + " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
        }
        throw new IOException("Unexpected byte 0x" + Integer.toHexString(readUnsignedByte2) + " following 0xEF; should get 0xBB as part of UTF-8 BOM");
    }

    public static b5.d m(c cVar, String str, b5.d dVar) throws IOException {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!cVar.b()) {
                return b5.d.INCONCLUSIVE;
            }
            if (cVar.a() != str.charAt(i10)) {
                return b5.d.NO_MATCH;
            }
        }
        return dVar;
    }

    public final boolean a(int i10) {
        if ((65280 & i10) == 0) {
            this.f6098g = true;
        } else if ((i10 & 255) != 0) {
            return false;
        } else {
            this.f6098g = false;
        }
        this.f6099h = 2;
        return true;
    }

    public final boolean b(int i10) throws IOException {
        String str;
        if ((i10 >> 8) == 0) {
            this.f6098g = true;
        } else if ((16777215 & i10) == 0) {
            this.f6098g = false;
        } else {
            if ((-16711681 & i10) == 0) {
                str = "3412";
            } else if ((i10 & -65281) != 0) {
                return false;
            } else {
                str = "2143";
            }
            i(str);
        }
        this.f6099h = 4;
        return true;
    }

    public l c(int i10, s sVar, f5.a aVar, b bVar, int i11) throws IOException {
        int i12 = i11;
        int i13 = this.f6095d;
        e e10 = e();
        int i14 = this.f6095d - i13;
        if (e10 != e.UTF8 || !f.a.CANONICALIZE_FIELD_NAMES.d(i12)) {
            return new i(this.f6092a, i10, d(), sVar, bVar.s(i11));
        }
        return new l(this.f6092a, i10, this.f6093b, sVar, aVar.M(i12), this.f6094c, this.f6095d, this.f6096e, i14, this.f6097f);
    }

    public Reader d() throws IOException {
        e o10 = this.f6092a.o();
        int a10 = o10.a();
        if (a10 == 8 || a10 == 16) {
            InputStream inputStream = this.f6093b;
            if (inputStream == null) {
                inputStream = new ByteArrayInputStream(this.f6094c, this.f6095d, this.f6096e);
            } else if (this.f6095d < this.f6096e) {
                inputStream = new h(this.f6092a, inputStream, this.f6094c, this.f6095d, this.f6096e);
            }
            return new InputStreamReader(inputStream, o10.b());
        } else if (a10 == 32) {
            d dVar = this.f6092a;
            return new n(dVar, this.f6093b, this.f6094c, this.f6095d, this.f6096e, dVar.o().d());
        } else {
            throw new RuntimeException("Internal error");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        if (a((r1[r5 + 1] & 255) | ((r1[r5] & 255) << 8)) != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        if (a(r1 >>> 16) != false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w4.e e() throws java.io.IOException {
        /*
            r8 = this;
            r0 = 4
            boolean r1 = r8.f(r0)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0042
            byte[] r1 = r8.f6094c
            int r5 = r8.f6095d
            byte r6 = r1[r5]
            int r6 = r6 << 24
            int r7 = r5 + 1
            byte r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            r6 = r6 | r7
            int r7 = r5 + 2
            byte r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r6 = r6 | r7
            int r5 = r5 + 3
            byte r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r5 = r8.g(r1)
            if (r5 == 0) goto L_0x0032
            goto L_0x005e
        L_0x0032:
            boolean r5 = r8.b(r1)
            if (r5 == 0) goto L_0x0039
            goto L_0x005e
        L_0x0039:
            int r1 = r1 >>> 16
            boolean r1 = r8.a(r1)
            if (r1 == 0) goto L_0x005f
            goto L_0x005e
        L_0x0042:
            boolean r1 = r8.f(r2)
            if (r1 == 0) goto L_0x005f
            byte[] r1 = r8.f6094c
            int r5 = r8.f6095d
            byte r6 = r1[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            int r5 = r5 + r3
            byte r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r1 = r8.a(r1)
            if (r1 == 0) goto L_0x005f
        L_0x005e:
            r4 = r3
        L_0x005f:
            if (r4 != 0) goto L_0x0064
        L_0x0061:
            w4.e r0 = w4.e.UTF8
            goto L_0x0087
        L_0x0064:
            int r1 = r8.f6099h
            if (r1 == r3) goto L_0x0061
            if (r1 == r2) goto L_0x007e
            if (r1 != r0) goto L_0x0076
            boolean r0 = r8.f6098g
            if (r0 == 0) goto L_0x0073
            w4.e r0 = w4.e.UTF32_BE
            goto L_0x0087
        L_0x0073:
            w4.e r0 = w4.e.UTF32_LE
            goto L_0x0087
        L_0x0076:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Internal error"
            r0.<init>(r1)
            throw r0
        L_0x007e:
            boolean r0 = r8.f6098g
            if (r0 == 0) goto L_0x0085
            w4.e r0 = w4.e.UTF16_BE
            goto L_0x0087
        L_0x0085:
            w4.e r0 = w4.e.UTF16_LE
        L_0x0087:
            c5.d r1 = r8.f6092a
            r1.x(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.a.e():w4.e");
    }

    public boolean f(int i10) throws IOException {
        int i11;
        int i12 = this.f6096e - this.f6095d;
        while (i12 < i10) {
            InputStream inputStream = this.f6093b;
            if (inputStream == null) {
                i11 = -1;
            } else {
                byte[] bArr = this.f6094c;
                int i13 = this.f6096e;
                i11 = inputStream.read(bArr, i13, bArr.length - i13);
            }
            if (i11 < 1) {
                return false;
            }
            this.f6096e += i11;
            i12 += i11;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(int r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = -16842752(0xfffffffffeff0000, float:-1.6947657E38)
            r1 = 65534(0xfffe, float:9.1833E-41)
            r2 = 65279(0xfeff, float:9.1475E-41)
            r3 = 0
            r4 = 1
            if (r7 == r0) goto L_0x002d
            r0 = -131072(0xfffffffffffe0000, float:NaN)
            r5 = 4
            if (r7 == r0) goto L_0x0023
            if (r7 == r2) goto L_0x0019
            if (r7 == r1) goto L_0x0016
            goto L_0x0032
        L_0x0016:
            java.lang.String r0 = "2143"
            goto L_0x002f
        L_0x0019:
            r6.f6098g = r4
            int r7 = r6.f6095d
            int r7 = r7 + r5
            r6.f6095d = r7
            r6.f6099h = r5
            return r4
        L_0x0023:
            int r7 = r6.f6095d
            int r7 = r7 + r5
            r6.f6095d = r7
            r6.f6099h = r5
            r6.f6098g = r3
            return r4
        L_0x002d:
            java.lang.String r0 = "3412"
        L_0x002f:
            r6.i(r0)
        L_0x0032:
            int r0 = r7 >>> 16
            r5 = 2
            if (r0 != r2) goto L_0x0041
            int r7 = r6.f6095d
            int r7 = r7 + r5
            r6.f6095d = r7
            r6.f6099h = r5
            r6.f6098g = r4
            return r4
        L_0x0041:
            if (r0 != r1) goto L_0x004d
            int r7 = r6.f6095d
            int r7 = r7 + r5
            r6.f6095d = r7
            r6.f6099h = r5
            r6.f6098g = r3
            return r4
        L_0x004d:
            int r7 = r7 >>> 8
            r0 = 15711167(0xefbbbf, float:2.2016034E-38)
            if (r7 != r0) goto L_0x005f
            int r7 = r6.f6095d
            int r7 = r7 + 3
            r6.f6095d = r7
            r6.f6099h = r4
            r6.f6098g = r4
            return r4
        L_0x005f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.a.g(int):boolean");
    }

    public final void i(String str) throws IOException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }
}

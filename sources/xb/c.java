package xb;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
import qa.g;
import qa.w;
import vb.f;
import vb.h;
import vb.j;
import ya.d;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f24489a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: b  reason: collision with root package name */
    public static final String f24490b = "ISO-8859-1";

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24491a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                vb.h[] r0 = vb.h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24491a = r0
                vb.h r1 = vb.h.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24491a     // Catch:{ NoSuchFieldError -> 0x001d }
                vb.h r1 = vb.h.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24491a     // Catch:{ NoSuchFieldError -> 0x0028 }
                vb.h r1 = vb.h.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f24491a     // Catch:{ NoSuchFieldError -> 0x0033 }
                vb.h r1 = vb.h.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xb.c.a.<clinit>():void");
        }
    }

    public static void a(String str, ya.a aVar, String str2) throws w {
        try {
            for (byte g10 : str.getBytes(str2)) {
                aVar.g(g10, 8);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new w((Throwable) e10);
        }
    }

    public static void b(CharSequence charSequence, ya.a aVar) throws w {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int r10 = r(charSequence.charAt(i10));
            if (r10 != -1) {
                int i11 = i10 + 1;
                if (i11 < length) {
                    int r11 = r(charSequence.charAt(i11));
                    if (r11 != -1) {
                        aVar.g((r10 * 45) + r11, 11);
                        i10 += 2;
                    } else {
                        throw new w();
                    }
                } else {
                    aVar.g(r10, 6);
                    i10 = i11;
                }
            } else {
                throw new w();
            }
        }
    }

    public static void c(String str, h hVar, ya.a aVar, String str2) throws w {
        int i10 = a.f24491a[hVar.ordinal()];
        if (i10 == 1) {
            h(str, aVar);
        } else if (i10 == 2) {
            b(str, aVar);
        } else if (i10 == 3) {
            a(str, aVar, str2);
        } else if (i10 == 4) {
            e(str, aVar);
        } else {
            throw new w("Invalid mode: ".concat(String.valueOf(hVar)));
        }
    }

    public static void d(d dVar, ya.a aVar) {
        aVar.g(h.ECI.b(), 4);
        aVar.g(dVar.d(), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c A[LOOP:0: B:6:0x000f->B:19:0x003c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(java.lang.String r6, ya.a r7) throws qa.w {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x005c }
            int r0 = r6.length
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0054
            int r0 = r6.length
            int r0 = r0 + -1
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0053
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x002b
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x002b
        L_0x0029:
            int r2 = r2 - r3
            goto L_0x003a
        L_0x002b:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0039
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0039
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0029
        L_0x0039:
            r2 = r4
        L_0x003a:
            if (r2 == r4) goto L_0x004b
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.g(r3, r2)
            int r1 = r1 + 2
            goto L_0x000f
        L_0x004b:
            qa.w r6 = new qa.w
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x0053:
            return
        L_0x0054:
            qa.w r6 = new qa.w
            java.lang.String r7 = "Kanji byte size not even"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x005c:
            r6 = move-exception
            qa.w r7 = new qa.w
            r7.<init>((java.lang.Throwable) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.c.e(java.lang.String, ya.a):void");
    }

    public static void f(int i10, j jVar, h hVar, ya.a aVar) throws w {
        int d10 = hVar.d(jVar);
        int i11 = 1 << d10;
        if (i10 < i11) {
            aVar.g(i10, d10);
            return;
        }
        throw new w(i10 + " is bigger than " + (i11 - 1));
    }

    public static void g(h hVar, ya.a aVar) {
        aVar.g(hVar.b(), 4);
    }

    public static void h(CharSequence charSequence, ya.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int charAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.g((charAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.g((charAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.g(charAt, 4);
                }
            }
        }
    }

    public static int i(h hVar, ya.a aVar, ya.a aVar2, j jVar) {
        return aVar.s() + hVar.d(jVar) + aVar2.s();
    }

    public static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    public static int k(ya.a aVar, f fVar, j jVar, b bVar) throws w {
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            e.a(aVar, fVar, jVar, i12, bVar);
            int j10 = j(bVar);
            if (j10 < i10) {
                i11 = i12;
                i10 = j10;
            }
        }
        return i11;
    }

    public static h l(String str) {
        return m(str, (String) null);
    }

    public static h m(String str, String str2) {
        if ("Shift_JIS".equals(str2) && u(str)) {
            return h.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '0' && charAt <= '9') {
                z11 = true;
            } else if (r(charAt) == -1) {
                return h.BYTE;
            } else {
                z10 = true;
            }
        }
        return z10 ? h.ALPHANUMERIC : z11 ? h.NUMERIC : h.BYTE;
    }

    public static j n(int i10, f fVar) throws w {
        for (int i11 = 1; i11 <= 40; i11++) {
            j i12 = j.i(i11);
            if (x(i10, i12, fVar)) {
                return i12;
            }
        }
        throw new w("Data too big");
    }

    public static f o(String str, f fVar) throws w {
        return p(str, fVar, (Map<g, ?>) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fc, code lost:
        if (xb.f.f(r9) != false) goto L_0x0100;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xb.f p(java.lang.String r7, vb.f r8, java.util.Map<qa.g, ?> r9) throws qa.w {
        /*
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L_0x000e
            qa.g r2 = qa.g.CHARACTER_SET
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x000e
            r2 = r0
            goto L_0x000f
        L_0x000e:
            r2 = r1
        L_0x000f:
            if (r2 == 0) goto L_0x001c
            qa.g r3 = qa.g.CHARACTER_SET
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = r3.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r3 = "ISO-8859-1"
        L_0x001e:
            vb.h r4 = m(r7, r3)
            ya.a r5 = new ya.a
            r5.<init>()
            vb.h r6 = vb.h.BYTE
            if (r4 != r6) goto L_0x0036
            if (r2 == 0) goto L_0x0036
            ya.d r2 = ya.d.a(r3)
            if (r2 == 0) goto L_0x0036
            d(r2, r5)
        L_0x0036:
            if (r9 == 0) goto L_0x0041
            qa.g r2 = qa.g.GS1_FORMAT
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r0 = r1
        L_0x0042:
            if (r0 == 0) goto L_0x0059
            qa.g r0 = qa.g.GS1_FORMAT
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L_0x0059
            vb.h r0 = vb.h.FNC1_FIRST_POSITION
            g(r0, r5)
        L_0x0059:
            g(r4, r5)
            ya.a r0 = new ya.a
            r0.<init>()
            c(r7, r4, r0, r3)
            if (r9 == 0) goto L_0x0091
            qa.g r1 = qa.g.QR_VERSION
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L_0x0091
            java.lang.Object r1 = r9.get(r1)
            java.lang.String r1 = r1.toString()
            int r1 = java.lang.Integer.parseInt(r1)
            vb.j r1 = vb.j.i(r1)
            int r2 = i(r4, r5, r0, r1)
            boolean r2 = x(r2, r1, r8)
            if (r2 == 0) goto L_0x0089
            goto L_0x0095
        L_0x0089:
            qa.w r7 = new qa.w
            java.lang.String r8 = "Data too big for requested version"
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x0091:
            vb.j r1 = v(r8, r4, r5, r0)
        L_0x0095:
            ya.a r2 = new ya.a
            r2.<init>()
            r2.d(r5)
            if (r4 != r6) goto L_0x00a4
            int r7 = r0.t()
            goto L_0x00a8
        L_0x00a4:
            int r7 = r7.length()
        L_0x00a8:
            f(r7, r1, r4, r2)
            r2.d(r0)
            vb.j$b r7 = r1.f(r8)
            int r0 = r1.h()
            int r3 = r7.d()
            int r0 = r0 - r3
            w(r0, r2)
            int r3 = r1.h()
            int r7 = r7.c()
            ya.a r7 = t(r2, r3, r0, r7)
            xb.f r0 = new xb.f
            r0.<init>()
            r0.g(r8)
            r0.j(r4)
            r0.k(r1)
            int r2 = r1.e()
            xb.b r3 = new xb.b
            r3.<init>(r2, r2)
            r2 = -1
            if (r9 == 0) goto L_0x00ff
            qa.g r4 = qa.g.QR_MASK_PATTERN
            boolean r5 = r9.containsKey(r4)
            if (r5 == 0) goto L_0x00ff
            java.lang.Object r9 = r9.get(r4)
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
            boolean r4 = xb.f.f(r9)
            if (r4 == 0) goto L_0x00ff
            goto L_0x0100
        L_0x00ff:
            r9 = r2
        L_0x0100:
            if (r9 != r2) goto L_0x0106
            int r9 = k(r7, r8, r1, r3)
        L_0x0106:
            r0.h(r9)
            xb.e.a(r7, r8, r1, r9, r3)
            r0.i(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.c.p(java.lang.String, vb.f, java.util.Map):xb.f");
    }

    public static byte[] q(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[(length + i10)];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new ab.d(ab.a.f16033l).b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    public static int r(int i10) {
        int[] iArr = f24489a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public static void s(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) throws w {
        if (i13 < i12) {
            int i14 = i10 % i12;
            int i15 = i12 - i14;
            int i16 = i10 / i12;
            int i17 = i16 + 1;
            int i18 = i11 / i12;
            int i19 = i18 + 1;
            int i20 = i16 - i18;
            int i21 = i17 - i19;
            if (i20 != i21) {
                throw new w("EC bytes mismatch");
            } else if (i12 != i15 + i14) {
                throw new w("RS blocks mismatch");
            } else if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
                throw new w("Total bytes mismatch");
            } else if (i13 < i15) {
                iArr[0] = i18;
                iArr2[0] = i20;
            } else {
                iArr[0] = i19;
                iArr2[0] = i21;
            }
        } else {
            throw new w("Block ID too large");
        }
    }

    public static ya.a t(ya.a aVar, int i10, int i11, int i12) throws w {
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        if (aVar.t() == i14) {
            ArrayList<a> arrayList = new ArrayList<>(i15);
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                s(i10, i11, i12, i19, iArr, iArr2);
                int i20 = iArr[0];
                byte[] bArr = new byte[i20];
                aVar.A(i16 << 3, bArr, 0, i20);
                byte[] q10 = q(bArr, iArr2[0]);
                arrayList.add(new a(bArr, q10));
                i17 = Math.max(i17, i20);
                i18 = Math.max(i18, q10.length);
                i16 += iArr[0];
            }
            if (i14 == i16) {
                ya.a aVar2 = new ya.a();
                for (int i21 = 0; i21 < i17; i21++) {
                    for (a a10 : arrayList) {
                        byte[] a11 = a10.a();
                        if (i21 < a11.length) {
                            aVar2.g(a11[i21], 8);
                        }
                    }
                }
                for (int i22 = 0; i22 < i18; i22++) {
                    for (a b10 : arrayList) {
                        byte[] b11 = b10.b();
                        if (i22 < b11.length) {
                            aVar2.g(b11[i22], 8);
                        }
                    }
                }
                if (i13 == aVar2.t()) {
                    return aVar2;
                }
                throw new w("Interleaving error: " + i13 + " and " + aVar2.t() + " differ.");
            }
            throw new w("Data bytes does not match offset");
        }
        throw new w("Number of bits and data bytes does not match");
    }

    public static boolean u(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i10 = 0; i10 < length; i10 += 2) {
                byte b10 = bytes[i10] & 255;
                if ((b10 < 129 || b10 > 159) && (b10 < 224 || b10 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public static j v(f fVar, h hVar, ya.a aVar, ya.a aVar2) throws w {
        return n(i(hVar, aVar, aVar2, n(i(hVar, aVar, aVar2, j.i(1)), fVar)), fVar);
    }

    public static void w(int i10, ya.a aVar) throws w {
        int i11 = i10 << 3;
        if (aVar.s() <= i11) {
            for (int i12 = 0; i12 < 4 && aVar.s() < i11; i12++) {
                aVar.a(false);
            }
            int s10 = aVar.s() & 7;
            if (s10 > 0) {
                while (s10 < 8) {
                    aVar.a(false);
                    s10++;
                }
            }
            int t10 = i10 - aVar.t();
            for (int i13 = 0; i13 < t10; i13++) {
                aVar.g((i13 & 1) == 0 ? dg.a.f18015ig : 17, 8);
            }
            if (aVar.s() != i11) {
                throw new w("Bits size does not equal capacity");
            }
            return;
        }
        throw new w("data bits cannot fit in the QR Code" + aVar.s() + " > " + i11);
    }

    public static boolean x(int i10, j jVar, f fVar) {
        return jVar.h() - jVar.f(fVar).d() >= (i10 + 7) / 8;
    }
}

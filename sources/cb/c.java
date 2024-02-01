package cb;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import kh.j;
import p7.f;
import qa.h;
import ya.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f16352a = {'*', '*', '*', f.f11698i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f16353b;

    /* renamed from: c  reason: collision with root package name */
    public static final char[] f16354c = {'*', '*', '*', f.f11698i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f16355d;

    /* renamed from: e  reason: collision with root package name */
    public static final char[] f16356e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16357a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cb.c$b[] r0 = cb.c.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16357a = r0
                cb.c$b r1 = cb.c.b.C40_ENCODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16357a     // Catch:{ NoSuchFieldError -> 0x001d }
                cb.c$b r1 = cb.c.b.TEXT_ENCODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16357a     // Catch:{ NoSuchFieldError -> 0x0028 }
                cb.c$b r1 = cb.c.b.ANSIX12_ENCODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16357a     // Catch:{ NoSuchFieldError -> 0x0033 }
                cb.c$b r1 = cb.c.b.EDIFACT_ENCODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16357a     // Catch:{ NoSuchFieldError -> 0x003e }
                cb.c$b r1 = cb.c.b.BASE256_ENCODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cb.c.a.<clinit>():void");
        }
    }

    public enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', f.f11697h, '<', '=', '>', '?', '@', '[', j.f20323c, ']', '^', '_'};
        f16353b = cArr;
        f16355d = cArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ya.e a(byte[] r8) throws qa.h {
        /*
            ya.c r0 = new ya.c
            r0.<init>(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 0
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 1
            r3.<init>(r4)
            cb.c$b r5 = cb.c.b.ASCII_ENCODE
        L_0x001a:
            cb.c$b r6 = cb.c.b.ASCII_ENCODE
            if (r5 != r6) goto L_0x0023
            cb.c$b r5 = c(r0, r1, r2)
            goto L_0x0052
        L_0x0023:
            int[] r7 = cb.c.a.f16357a
            int r5 = r5.ordinal()
            r5 = r7[r5]
            if (r5 == r4) goto L_0x004e
            r7 = 2
            if (r5 == r7) goto L_0x004a
            r7 = 3
            if (r5 == r7) goto L_0x0046
            r7 = 4
            if (r5 == r7) goto L_0x0042
            r7 = 5
            if (r5 != r7) goto L_0x003d
            d(r0, r1, r3)
            goto L_0x0051
        L_0x003d:
            qa.h r8 = qa.h.a()
            throw r8
        L_0x0042:
            f(r0, r1)
            goto L_0x0051
        L_0x0046:
            b(r0, r1)
            goto L_0x0051
        L_0x004a:
            g(r0, r1)
            goto L_0x0051
        L_0x004e:
            e(r0, r1)
        L_0x0051:
            r5 = r6
        L_0x0052:
            cb.c$b r6 = cb.c.b.PAD_ENCODE
            if (r5 == r6) goto L_0x005c
            int r6 = r0.a()
            if (r6 > 0) goto L_0x001a
        L_0x005c:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0065
            r1.append(r2)
        L_0x0065:
            ya.e r0 = new ya.e
            java.lang.String r1 = r1.toString()
            boolean r2 = r3.isEmpty()
            r4 = 0
            if (r2 == 0) goto L_0x0073
            r3 = r4
        L_0x0073:
            r0.<init>(r8, r1, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.c.a(byte[]):ya.e");
    }

    public static void b(ya.c cVar, StringBuilder sb2) throws h {
        int d10;
        char c10;
        int i10;
        int[] iArr = new int[3];
        while (cVar.a() != 8 && (d10 = cVar.d(8)) != 254) {
            h(d10, cVar.d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i12 == 0) {
                    c10 = 13;
                } else if (i12 == 1) {
                    c10 = '*';
                } else if (i12 == 2) {
                    c10 = '>';
                } else if (i12 != 3) {
                    if (i12 < 14) {
                        i10 = i12 + 44;
                    } else if (i12 < 40) {
                        i10 = i12 + 51;
                    } else {
                        throw h.a();
                    }
                    c10 = (char) i10;
                } else {
                    c10 = f.f11698i;
                }
                sb2.append(c10);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    public static b c(ya.c cVar, StringBuilder sb2, StringBuilder sb3) throws h {
        String str;
        boolean z10 = false;
        do {
            int d10 = cVar.d(8);
            if (d10 == 0) {
                throw h.a();
            } else if (d10 <= 128) {
                if (z10) {
                    d10 += 128;
                }
                sb2.append((char) (d10 - 1));
                return b.ASCII_ENCODE;
            } else if (d10 == 129) {
                return b.PAD_ENCODE;
            } else {
                if (d10 <= 229) {
                    int i10 = d10 - 130;
                    if (i10 < 10) {
                        sb2.append('0');
                    }
                    sb2.append(i10);
                } else {
                    switch (d10) {
                        case dg.a.Xf /*230*/:
                            return b.C40_ENCODE;
                        case 231:
                            return b.BASE256_ENCODE;
                        case dg.a.f17848ag /*232*/:
                            sb2.append(hb.b.f19529o);
                            break;
                        case dg.a.f17890cg /*233*/:
                        case dg.a.f17974gg /*234*/:
                        case 241:
                            break;
                        case dg.a.f17995hg /*235*/:
                            z10 = true;
                            break;
                        case dg.a.f18015ig /*236*/:
                            str = eb.j.f18566l;
                            break;
                        case dg.a.f18036jg /*237*/:
                            str = eb.j.f18567m;
                            break;
                        case dg.a.f18141og /*238*/:
                            return b.ANSIX12_ENCODE;
                        case dg.a.f18162pg /*239*/:
                            return b.TEXT_ENCODE;
                        case 240:
                            return b.EDIFACT_ENCODE;
                        default:
                            if (!(d10 == 254 && cVar.a() == 0)) {
                                throw h.a();
                            }
                    }
                    sb2.append(str);
                    sb3.insert(0, eb.j.f18568n);
                }
            }
        } while (cVar.a() > 0);
        return b.ASCII_ENCODE;
    }

    public static void d(ya.c cVar, StringBuilder sb2, Collection<byte[]> collection) throws h {
        int c10 = cVar.c() + 1;
        int i10 = c10 + 1;
        int i11 = i(cVar.d(8), c10);
        if (i11 == 0) {
            i11 = cVar.a() / 8;
        } else if (i11 >= 250) {
            i11 = ((i11 - 249) * 250) + i(cVar.d(8), i10);
            i10++;
        }
        if (i11 >= 0) {
            byte[] bArr = new byte[i11];
            int i12 = 0;
            while (i12 < i11) {
                if (cVar.a() >= 8) {
                    bArr[i12] = (byte) i(cVar.d(8), i10);
                    i12++;
                    i10++;
                } else {
                    throw h.a();
                }
            }
            collection.add(bArr);
            try {
                sb2.append(new String(bArr, l.f24695f));
            } catch (UnsupportedEncodingException e10) {
                throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e10)));
            }
        } else {
            throw h.a();
        }
    }

    public static void e(ya.c cVar, StringBuilder sb2) throws h {
        int d10;
        char c10;
        char c11;
        int i10;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i11 = 0;
        while (cVar.a() != 8 && (d10 = cVar.d(8)) != 254) {
            h(d10, cVar.d(8), iArr);
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr[i12];
                if (i11 != 0) {
                    if (i11 == 1) {
                        if (z10) {
                            i10 = i13 + 128;
                        }
                        c10 = (char) i13;
                        sb2.append(c10);
                        i11 = 0;
                    } else if (i11 == 2) {
                        char[] cArr = f16353b;
                        if (i13 < cArr.length) {
                            c10 = cArr[i13];
                            if (z10) {
                                c11 = (char) (c10 + 128);
                                sb2.append(c11);
                                z10 = false;
                                i11 = 0;
                            }
                        } else if (i13 == 27) {
                            c10 = hb.b.f19529o;
                        } else if (i13 == 30) {
                            z10 = true;
                            i11 = 0;
                        } else {
                            throw h.a();
                        }
                        sb2.append(c10);
                        i11 = 0;
                    } else if (i11 != 3) {
                        throw h.a();
                    } else if (z10) {
                        i10 = i13 + 224;
                    } else {
                        i13 += 96;
                        c10 = (char) i13;
                        sb2.append(c10);
                        i11 = 0;
                    }
                    c11 = (char) i10;
                    sb2.append(c11);
                    z10 = false;
                    i11 = 0;
                } else if (i13 < 3) {
                    i11 = i13 + 1;
                } else {
                    char[] cArr2 = f16352a;
                    if (i13 < cArr2.length) {
                        char c12 = cArr2[i13];
                        if (z10) {
                            sb2.append((char) (c12 + 128));
                            z10 = false;
                        } else {
                            sb2.append(c12);
                        }
                    } else {
                        throw h.a();
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    public static void f(ya.c cVar, StringBuilder sb2) {
        while (cVar.a() > 16) {
            for (int i10 = 0; i10 < 4; i10++) {
                int d10 = cVar.d(6);
                if (d10 == 31) {
                    int b10 = 8 - cVar.b();
                    if (b10 != 8) {
                        cVar.d(b10);
                        return;
                    }
                    return;
                }
                if ((d10 & 32) == 0) {
                    d10 |= 64;
                }
                sb2.append((char) d10);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r3 != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        if (r3 != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(ya.c r9, java.lang.StringBuilder r10) throws qa.h {
        /*
            r0 = 3
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0006:
            int r5 = r9.a()
            r6 = 8
            if (r5 != r6) goto L_0x000f
            return
        L_0x000f:
            int r5 = r9.d(r6)
            r7 = 254(0xfe, float:3.56E-43)
            if (r5 != r7) goto L_0x0018
            return
        L_0x0018:
            int r6 = r9.d(r6)
            h(r5, r6, r1)
            r5 = r2
        L_0x0020:
            if (r5 >= r0) goto L_0x0093
            r6 = r1[r5]
            if (r4 == 0) goto L_0x0071
            r7 = 1
            if (r4 == r7) goto L_0x0061
            r8 = 2
            if (r4 == r8) goto L_0x0045
            if (r4 != r0) goto L_0x0040
            char[] r4 = f16356e
            int r7 = r4.length
            if (r6 >= r7) goto L_0x003b
            char r4 = r4[r6]
            if (r3 == 0) goto L_0x006c
        L_0x0037:
            int r4 = r4 + 128
            char r3 = (char) r4
            goto L_0x0066
        L_0x003b:
            qa.h r9 = qa.h.a()
            throw r9
        L_0x0040:
            qa.h r9 = qa.h.a()
            throw r9
        L_0x0045:
            char[] r4 = f16355d
            int r8 = r4.length
            if (r6 >= r8) goto L_0x004f
            char r4 = r4[r6]
            if (r3 == 0) goto L_0x006c
            goto L_0x0037
        L_0x004f:
            r4 = 27
            if (r6 == r4) goto L_0x005e
            r3 = 30
            if (r6 != r3) goto L_0x0059
            r3 = r7
            goto L_0x006f
        L_0x0059:
            qa.h r9 = qa.h.a()
            throw r9
        L_0x005e:
            r4 = 29
            goto L_0x006c
        L_0x0061:
            if (r3 == 0) goto L_0x006b
            int r6 = r6 + 128
            char r3 = (char) r6
        L_0x0066:
            r10.append(r3)
            r3 = r2
            goto L_0x006f
        L_0x006b:
            char r4 = (char) r6
        L_0x006c:
            r10.append(r4)
        L_0x006f:
            r4 = r2
            goto L_0x008b
        L_0x0071:
            if (r6 >= r0) goto L_0x0077
            int r6 = r6 + 1
            r4 = r6
            goto L_0x008b
        L_0x0077:
            char[] r7 = f16354c
            int r8 = r7.length
            if (r6 >= r8) goto L_0x008e
            char r6 = r7[r6]
            if (r3 == 0) goto L_0x0088
            int r6 = r6 + 128
            char r3 = (char) r6
            r10.append(r3)
            r3 = r2
            goto L_0x008b
        L_0x0088:
            r10.append(r6)
        L_0x008b:
            int r5 = r5 + 1
            goto L_0x0020
        L_0x008e:
            qa.h r9 = qa.h.a()
            throw r9
        L_0x0093:
            int r5 = r9.a()
            if (r5 > 0) goto L_0x0006
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.c.g(ya.c, java.lang.StringBuilder):void");
    }

    public static void h(int i10, int i11, int[] iArr) {
        int i12 = ((i10 << 8) + i11) - 1;
        int i13 = i12 / 1600;
        iArr[0] = i13;
        int i14 = i12 - (i13 * 1600);
        int i15 = i14 / 40;
        iArr[1] = i15;
        iArr[2] = i14 - (i15 * 40);
    }

    public static int i(int i10, int i11) {
        int i12 = i10 - (((i11 * dg.a.Yb) % 255) + 1);
        return i12 >= 0 ? i12 : i12 + 256;
    }
}

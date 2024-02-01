package vb;

import hb.b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import qa.h;
import ya.c;
import ya.e;
import ya.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f23584a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public static final int f23585b = 1;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23586a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                vb.h[] r0 = vb.h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23586a = r0
                vb.h r1 = vb.h.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23586a     // Catch:{ NoSuchFieldError -> 0x001d }
                vb.h r1 = vb.h.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23586a     // Catch:{ NoSuchFieldError -> 0x0028 }
                vb.h r1 = vb.h.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23586a     // Catch:{ NoSuchFieldError -> 0x0033 }
                vb.h r1 = vb.h.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23586a     // Catch:{ NoSuchFieldError -> 0x003e }
                vb.h r1 = vb.h.TERMINATOR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f23586a     // Catch:{ NoSuchFieldError -> 0x0049 }
                vb.h r1 = vb.h.FNC1_FIRST_POSITION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f23586a     // Catch:{ NoSuchFieldError -> 0x0054 }
                vb.h r1 = vb.h.FNC1_SECOND_POSITION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f23586a     // Catch:{ NoSuchFieldError -> 0x0060 }
                vb.h r1 = vb.h.STRUCTURED_APPEND     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f23586a     // Catch:{ NoSuchFieldError -> 0x006c }
                vb.h r1 = vb.h.ECI     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f23586a     // Catch:{ NoSuchFieldError -> 0x0078 }
                vb.h r1 = vb.h.HANZI     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vb.d.a.<clinit>():void");
        }
    }

    public static e a(byte[] bArr, j jVar, f fVar, Map<qa.e, ?> map) throws h {
        h hVar;
        j jVar2 = jVar;
        c cVar = new c(bArr);
        StringBuilder sb2 = new StringBuilder(50);
        boolean z10 = true;
        ArrayList arrayList = new ArrayList(1);
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        ya.d dVar = null;
        while (true) {
            try {
                h a10 = cVar.a() < 4 ? h.TERMINATOR : h.a(cVar.d(4));
                int[] iArr = a.f23586a;
                switch (iArr[a10.ordinal()]) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                        z11 = z10;
                        break;
                    case 8:
                        if (cVar.a() >= 16) {
                            int d10 = cVar.d(8);
                            i11 = cVar.d(8);
                            i10 = d10;
                            break;
                        } else {
                            throw h.a();
                        }
                    case 9:
                        dVar = ya.d.b(g(cVar));
                        if (dVar != null) {
                            break;
                        } else {
                            throw h.a();
                        }
                    case 10:
                        int d11 = cVar.d(4);
                        int d12 = cVar.d(a10.d(jVar2));
                        if (d11 == z10) {
                            d(cVar, sb2, d12);
                            break;
                        }
                        break;
                    default:
                        int d13 = cVar.d(a10.d(jVar2));
                        int i12 = iArr[a10.ordinal()];
                        if (i12 != z10) {
                            if (i12 != 2) {
                                if (i12 == 3) {
                                    hVar = a10;
                                    c(cVar, sb2, d13, dVar, arrayList, map);
                                    break;
                                } else if (i12 == 4) {
                                    e(cVar, sb2, d13);
                                    break;
                                } else {
                                    throw h.a();
                                }
                            } else {
                                hVar = a10;
                                b(cVar, sb2, d13, z11);
                                break;
                            }
                        } else {
                            hVar = a10;
                            f(cVar, sb2, d13);
                            break;
                        }
                }
                hVar = a10;
                if (hVar == h.TERMINATOR) {
                    return new e(bArr, sb2.toString(), arrayList.isEmpty() ? null : arrayList, fVar == null ? null : fVar.toString(), i10, i11);
                }
                z10 = true;
            } catch (IllegalArgumentException unused) {
                throw h.a();
            }
        }
    }

    public static void b(c cVar, StringBuilder sb2, int i10, boolean z10) throws h {
        while (i10 > 1) {
            if (cVar.a() >= 11) {
                int d10 = cVar.d(11);
                sb2.append(h(d10 / 45));
                sb2.append(h(d10 % 45));
                i10 -= 2;
            } else {
                throw h.a();
            }
        }
        if (i10 == 1) {
            if (cVar.a() >= 6) {
                sb2.append(h(cVar.d(6)));
            } else {
                throw h.a();
            }
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
                        }
                    }
                    sb2.setCharAt(length, b.f19529o);
                }
            }
        }
    }

    public static void c(c cVar, StringBuilder sb2, int i10, ya.d dVar, Collection<byte[]> collection, Map<qa.e, ?> map) throws h {
        if ((i10 << 3) <= cVar.a()) {
            byte[] bArr = new byte[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                bArr[i11] = (byte) cVar.d(8);
            }
            try {
                sb2.append(new String(bArr, dVar == null ? l.a(bArr, map) : dVar.name()));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw h.a();
            }
        } else {
            throw h.a();
        }
    }

    public static void d(c cVar, StringBuilder sb2, int i10) throws h {
        if (i10 * 13 <= cVar.a()) {
            byte[] bArr = new byte[(i10 * 2)];
            int i11 = 0;
            while (i10 > 0) {
                int d10 = cVar.d(13);
                int i12 = (d10 % 96) | ((d10 / 96) << 8);
                int i13 = i12 + (i12 < 2560 ? 41377 : 42657);
                bArr[i11] = (byte) (i13 >> 8);
                bArr[i11 + 1] = (byte) i13;
                i11 += 2;
                i10--;
            }
            try {
                sb2.append(new String(bArr, l.f24692c));
            } catch (UnsupportedEncodingException unused) {
                throw h.a();
            }
        } else {
            throw h.a();
        }
    }

    public static void e(c cVar, StringBuilder sb2, int i10) throws h {
        if (i10 * 13 <= cVar.a()) {
            byte[] bArr = new byte[(i10 * 2)];
            int i11 = 0;
            while (i10 > 0) {
                int d10 = cVar.d(13);
                int i12 = (d10 % 192) | ((d10 / 192) << 8);
                int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
                bArr[i11] = (byte) (i13 >> 8);
                bArr[i11 + 1] = (byte) i13;
                i11 += 2;
                i10--;
            }
            try {
                sb2.append(new String(bArr, l.f24691b));
            } catch (UnsupportedEncodingException unused) {
                throw h.a();
            }
        } else {
            throw h.a();
        }
    }

    public static void f(c cVar, StringBuilder sb2, int i10) throws h {
        while (i10 >= 3) {
            if (cVar.a() >= 10) {
                int d10 = cVar.d(10);
                if (d10 < 1000) {
                    sb2.append(h(d10 / 100));
                    sb2.append(h((d10 / 10) % 10));
                    sb2.append(h(d10 % 10));
                    i10 -= 3;
                } else {
                    throw h.a();
                }
            } else {
                throw h.a();
            }
        }
        if (i10 == 2) {
            if (cVar.a() >= 7) {
                int d11 = cVar.d(7);
                if (d11 < 100) {
                    sb2.append(h(d11 / 10));
                    sb2.append(h(d11 % 10));
                    return;
                }
                throw h.a();
            }
            throw h.a();
        } else if (i10 != 1) {
        } else {
            if (cVar.a() >= 4) {
                int d12 = cVar.d(4);
                if (d12 < 10) {
                    sb2.append(h(d12));
                    return;
                }
                throw h.a();
            }
            throw h.a();
        }
    }

    public static int g(c cVar) throws h {
        int d10 = cVar.d(8);
        if ((d10 & 128) == 0) {
            return d10 & 127;
        }
        if ((d10 & 192) == 128) {
            return cVar.d(8) | ((d10 & 63) << 8);
        }
        if ((d10 & 224) == 192) {
            return cVar.d(16) | ((d10 & 31) << 16);
        }
        throw h.a();
    }

    public static char h(int i10) throws h {
        char[] cArr = f23584a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw h.a();
    }
}

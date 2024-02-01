package sa;

import ab.c;
import bc.p;
import com.google.android.material.badge.BadgeDrawable;
import java.util.Arrays;
import java.util.List;
import p7.f;
import qa.h;
import va.e;
import w7.l;
import zb.o;
import zb.q;
import zb.r;
import zb.t;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f22869b = {"CTRL_PS", " ", w1.a.Q4, "B", "C", "D", w1.a.M4, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", w1.a.L4, w1.a.X4, "U", w1.a.R4, w1.a.N4, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f22870c = {"CTRL_PS", " ", "a", f.f11703n, f.f11706q, d8.f.f6598d, e.f23523d, u3.f.A, "g", "h", "i", "j", "k", "l", "m", "n", o.f25089e, "p", q.f25095b, r.f25096b, "s", t.f25097a, f.f11705p, f.f11707r, "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f22871d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f22872e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", BadgeDrawable.f16655n0, ",", "-", ".", "/", ":", ";", "<", l.f14755k, ">", "?", "[", "]", p7.a.f11638i, p7.a.f11639j, "CTRL_UL"};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f22873f = {"CTRL_PS", " ", "0", "1", "2", w1.a.T4, "4", p.f16204w, "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a  reason: collision with root package name */
    public ra.a f22874a;

    /* renamed from: sa.a$a  reason: collision with other inner class name */
    public static /* synthetic */ class C0420a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22875a;

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
                sa.a$b[] r0 = sa.a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22875a = r0
                sa.a$b r1 = sa.a.b.UPPER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22875a     // Catch:{ NoSuchFieldError -> 0x001d }
                sa.a$b r1 = sa.a.b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22875a     // Catch:{ NoSuchFieldError -> 0x0028 }
                sa.a$b r1 = sa.a.b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22875a     // Catch:{ NoSuchFieldError -> 0x0033 }
                sa.a$b r1 = sa.a.b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22875a     // Catch:{ NoSuchFieldError -> 0x003e }
                sa.a$b r1 = sa.a.b.DIGIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sa.a.C0420a.<clinit>():void");
        }
    }

    public enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = i(zArr, i10 << 3);
        }
        return bArr;
    }

    public static String e(b bVar, int i10) {
        int i11 = C0420a.f22875a[bVar.ordinal()];
        if (i11 == 1) {
            return f22869b[i10];
        }
        if (i11 == 2) {
            return f22870c[i10];
        }
        if (i11 == 3) {
            return f22871d[i10];
        }
        if (i11 == 4) {
            return f22872e[i10];
        }
        if (i11 == 5) {
            return f22873f[i10];
        }
        throw new IllegalStateException("Bad table");
    }

    public static String f(boolean[] zArr) {
        int length = zArr.length;
        b bVar = b.UPPER;
        StringBuilder sb2 = new StringBuilder(20);
        b bVar2 = bVar;
        int i10 = 0;
        while (i10 < length) {
            if (bVar == b.BINARY) {
                if (length - i10 < 5) {
                    break;
                }
                int j10 = j(zArr, i10, 5);
                i10 += 5;
                if (j10 == 0) {
                    if (length - i10 < 11) {
                        break;
                    }
                    j10 = j(zArr, i10, 11) + 31;
                    i10 += 11;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= j10) {
                        break;
                    } else if (length - i10 < 8) {
                        i10 = length;
                        break;
                    } else {
                        sb2.append((char) j(zArr, i10, 8));
                        i10 += 8;
                        i11++;
                    }
                }
            } else {
                int i12 = bVar == b.DIGIT ? 4 : 5;
                if (length - i10 < i12) {
                    break;
                }
                int j11 = j(zArr, i10, i12);
                i10 += i12;
                String e10 = e(bVar, j11);
                if (e10.startsWith("CTRL_")) {
                    bVar2 = g(e10.charAt(5));
                    if (e10.charAt(6) != 'L') {
                        b bVar3 = bVar2;
                        bVar2 = bVar;
                        bVar = bVar3;
                    }
                } else {
                    sb2.append(e10);
                }
            }
            bVar = bVar2;
        }
        return sb2.toString();
    }

    public static b g(char c10) {
        return c10 != 'B' ? c10 != 'D' ? c10 != 'P' ? c10 != 'L' ? c10 != 'M' ? b.UPPER : b.MIXED : b.LOWER : b.PUNCT : b.DIGIT : b.BINARY;
    }

    public static String h(boolean[] zArr) {
        return f(zArr);
    }

    public static byte i(boolean[] zArr, int i10) {
        int length = zArr.length - i10;
        return (byte) (length >= 8 ? j(zArr, i10, 8) : j(zArr, i10, length) << (8 - length));
    }

    public static int j(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    public static int k(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 << 4)) * i10;
    }

    public final boolean[] b(boolean[] zArr) throws h {
        ab.a aVar;
        int i10 = 8;
        if (this.f22874a.d() <= 2) {
            i10 = 6;
            aVar = ab.a.f16031j;
        } else if (this.f22874a.d() <= 8) {
            aVar = ab.a.f16035n;
        } else if (this.f22874a.d() <= 22) {
            i10 = 10;
            aVar = ab.a.f16030i;
        } else {
            i10 = 12;
            aVar = ab.a.f16029h;
        }
        int c10 = this.f22874a.c();
        int length = zArr.length / i10;
        if (length >= c10) {
            int length2 = zArr.length % i10;
            int[] iArr = new int[length];
            int i11 = 0;
            while (i11 < length) {
                iArr[i11] = j(zArr, length2, i10);
                i11++;
                length2 += i10;
            }
            try {
                new c(aVar).a(iArr, length - c10);
                int i12 = (1 << i10) - 1;
                int i13 = 0;
                for (int i14 = 0; i14 < c10; i14++) {
                    int i15 = iArr[i14];
                    if (i15 == 0 || i15 == i12) {
                        throw h.a();
                    }
                    if (i15 == 1 || i15 == i12 - 1) {
                        i13++;
                    }
                }
                boolean[] zArr2 = new boolean[((c10 * i10) - i13)];
                int i16 = 0;
                for (int i17 = 0; i17 < c10; i17++) {
                    int i18 = iArr[i17];
                    if (i18 == 1 || i18 == i12 - 1) {
                        Arrays.fill(zArr2, i16, (i16 + i10) - 1, i18 > 1);
                        i16 += i10 - 1;
                    } else {
                        int i19 = i10 - 1;
                        while (i19 >= 0) {
                            int i20 = i16 + 1;
                            zArr2[i16] = ((1 << i19) & i18) != 0;
                            i19--;
                            i16 = i20;
                        }
                    }
                }
                return zArr2;
            } catch (ab.e e10) {
                throw h.b(e10);
            }
        } else {
            throw h.a();
        }
    }

    public ya.e c(ra.a aVar) throws h {
        this.f22874a = aVar;
        boolean[] b10 = b(d(aVar.a()));
        ya.e eVar = new ya.e(a(b10), f(b10), (List<byte[]>) null, (String) null);
        eVar.n(b10.length);
        return eVar;
    }

    public final boolean[] d(ya.b bVar) {
        ya.b bVar2 = bVar;
        boolean e10 = this.f22874a.e();
        int d10 = this.f22874a.d();
        int i10 = (e10 ? 11 : 14) + (d10 << 2);
        int[] iArr = new int[i10];
        boolean[] zArr = new boolean[k(d10, e10)];
        int i11 = 2;
        if (e10) {
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = i12;
            }
        } else {
            int i13 = i10 / 2;
            int i14 = ((i10 + 1) + (((i13 - 1) / 15) * 2)) / 2;
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = (i15 / 15) + i15;
                iArr[(i13 - i15) - 1] = (i14 - i16) - 1;
                iArr[i13 + i15] = i16 + i14 + 1;
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < d10) {
            int i19 = ((d10 - i17) << i11) + (e10 ? 9 : 12);
            int i20 = i17 << 1;
            int i21 = (i10 - 1) - i20;
            int i22 = 0;
            while (i22 < i19) {
                int i23 = i22 << 1;
                int i24 = 0;
                while (i24 < i11) {
                    int i25 = i20 + i24;
                    int i26 = i20 + i22;
                    zArr[i18 + i23 + i24] = bVar2.j(iArr[i25], iArr[i26]);
                    int i27 = iArr[i26];
                    int i28 = i21 - i24;
                    zArr[(i19 * 2) + i18 + i23 + i24] = bVar2.j(i27, iArr[i28]);
                    int i29 = i21 - i22;
                    zArr[(i19 * 4) + i18 + i23 + i24] = bVar2.j(iArr[i28], iArr[i29]);
                    zArr[(i19 * 6) + i18 + i23 + i24] = bVar2.j(iArr[i29], iArr[i25]);
                    i24++;
                    d10 = d10;
                    e10 = e10;
                    i11 = 2;
                }
                boolean z10 = e10;
                int i30 = d10;
                i22++;
                i11 = 2;
            }
            boolean z11 = e10;
            int i31 = d10;
            i18 += i19 << 3;
            i17++;
            i11 = 2;
        }
        return zArr;
    }
}

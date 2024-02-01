package ya;

import java.nio.charset.Charset;
import java.util.Map;
import qa.e;
import xe.o;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f24690a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f24691b = "SJIS";

    /* renamed from: c  reason: collision with root package name */
    public static final String f24692c = "GB2312";

    /* renamed from: d  reason: collision with root package name */
    public static final String f24693d = "EUC_JP";

    /* renamed from: e  reason: collision with root package name */
    public static final String f24694e = "UTF8";

    /* renamed from: f  reason: collision with root package name */
    public static final String f24695f = "ISO8859_1";

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f24696g;

    static {
        String name = Charset.defaultCharset().name();
        f24690a = name;
        f24696g = f24691b.equalsIgnoreCase(name) || f24693d.equalsIgnoreCase(name);
    }

    public static String a(byte[] bArr, Map<e, ?> map) {
        byte[] bArr2 = bArr;
        Map<e, ?> map2 = map;
        if (map2 != null) {
            e eVar = e.CHARACTER_SET;
            if (map2.containsKey(eVar)) {
                return map2.get(eVar).toString();
            }
        }
        int length = bArr2.length;
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        boolean z12 = true;
        boolean z13 = true;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i12 < length && (z10 || z12 || z13)) {
            byte b10 = bArr2[i12] & 255;
            if (z13) {
                byte b11 = b10 & o.f24535b;
                if (i13 > 0) {
                    if (b11 != 0) {
                        i13--;
                    }
                } else if (b11 != 0) {
                    if ((b10 & 64) != 0) {
                        i13++;
                        if ((b10 & 32) == 0) {
                            i15++;
                        } else {
                            i13++;
                            if ((b10 & 16) == 0) {
                                i16++;
                            } else {
                                i13++;
                                if ((b10 & 8) == 0) {
                                    i17++;
                                }
                            }
                        }
                    }
                }
                z13 = false;
            }
            if (z10) {
                if (b10 > Byte.MAX_VALUE && b10 < 160) {
                    z10 = false;
                } else if (b10 > 159 && (b10 < 192 || b10 == 215 || b10 == 247)) {
                    i19++;
                }
            }
            if (z12) {
                if (i14 > 0) {
                    if (b10 >= 64 && b10 != Byte.MAX_VALUE && b10 <= 252) {
                        i14--;
                    }
                } else if (!(b10 == 128 || b10 == 160 || b10 > 239)) {
                    if (b10 <= 160 || b10 >= 224) {
                        if (b10 > Byte.MAX_VALUE) {
                            i14++;
                            int i22 = i20 + 1;
                            if (i22 > i10) {
                                i10 = i22;
                                i20 = i10;
                            } else {
                                i20 = i22;
                            }
                        } else {
                            i20 = 0;
                        }
                        i21 = 0;
                    } else {
                        i11++;
                        int i23 = i21 + 1;
                        if (i23 > i18) {
                            i18 = i23;
                            i21 = i18;
                        } else {
                            i21 = i23;
                        }
                        i20 = 0;
                    }
                }
                z12 = false;
            }
            i12++;
            bArr2 = bArr;
        }
        if (z13 && i13 > 0) {
            z13 = false;
        }
        if (z12 && i14 > 0) {
            z12 = false;
        }
        return (!z13 || (!z11 && (i15 + i16) + i17 <= 0)) ? (!z12 || (!f24696g && i18 < 3 && i10 < 3)) ? (!z10 || !z12) ? z10 ? f24695f : z12 ? f24691b : z13 ? f24694e : f24690a : (!(i18 == 2 && i11 == 2) && i19 * 10 < length) ? f24695f : f24691b : f24691b : f24694e;
    }
}

package lb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class d extends s {

    /* renamed from: b  reason: collision with root package name */
    public static final int f20437b = 103;

    /* renamed from: c  reason: collision with root package name */
    public static final int f20438c = 104;

    /* renamed from: d  reason: collision with root package name */
    public static final int f20439d = 105;

    /* renamed from: e  reason: collision with root package name */
    public static final int f20440e = 101;

    /* renamed from: f  reason: collision with root package name */
    public static final int f20441f = 100;

    /* renamed from: g  reason: collision with root package name */
    public static final int f20442g = 99;

    /* renamed from: h  reason: collision with root package name */
    public static final int f20443h = 106;

    /* renamed from: i  reason: collision with root package name */
    public static final char f20444i = 'ñ';

    /* renamed from: j  reason: collision with root package name */
    public static final char f20445j = 'ò';

    /* renamed from: k  reason: collision with root package name */
    public static final char f20446k = 'ó';

    /* renamed from: l  reason: collision with root package name */
    public static final char f20447l = 'ô';

    /* renamed from: m  reason: collision with root package name */
    public static final int f20448m = 102;

    /* renamed from: n  reason: collision with root package name */
    public static final int f20449n = 97;

    /* renamed from: o  reason: collision with root package name */
    public static final int f20450o = 96;

    /* renamed from: p  reason: collision with root package name */
    public static final int f20451p = 101;

    /* renamed from: q  reason: collision with root package name */
    public static final int f20452q = 100;

    public enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    public static int i(CharSequence charSequence, int i10, int i11) {
        a j10;
        a j11;
        char charAt;
        a j12 = j(charSequence, i10);
        a aVar = a.ONE_DIGIT;
        if (j12 == aVar) {
            return i11 == 101 ? 101 : 100;
        }
        a aVar2 = a.UNCODABLE;
        if (j12 == aVar2) {
            return (i10 >= charSequence.length() || ((charAt = charSequence.charAt(i10)) >= ' ' && (i11 != 101 || (charAt >= '`' && (charAt < 241 || charAt > 244))))) ? 100 : 101;
        }
        if (i11 == 101 && j12 == a.FNC_1) {
            return 101;
        }
        if (i11 == 99) {
            return 99;
        }
        if (i11 == 100) {
            a aVar3 = a.FNC_1;
            if (j12 == aVar3 || (j10 = j(charSequence, i10 + 2)) == aVar2 || j10 == aVar) {
                return 100;
            }
            if (j10 == aVar3) {
                return j(charSequence, i10 + 3) == a.TWO_DIGITS ? 99 : 100;
            }
            int i12 = i10 + 4;
            while (true) {
                j11 = j(charSequence, i12);
                if (j11 != a.TWO_DIGITS) {
                    break;
                }
                i12 += 2;
            }
            return j11 == a.ONE_DIGIT ? 100 : 99;
        }
        if (j12 == a.FNC_1) {
            j12 = j(charSequence, i10 + 1);
        }
        return j12 == a.TWO_DIGITS ? 99 : 100;
    }

    public static a j(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        if (i10 >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i10);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return a.UNCODABLE;
        }
        int i11 = i10 + 1;
        if (i11 >= length) {
            return a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i11);
        return (charAt2 < '0' || charAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    public boolean[] e(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            switch (charAt) {
                case 241:
                case dg.a.f18226sg:
                case dg.a.f18247tg:
                case dg.a.f18289vg:
                    break;
                default:
                    if (charAt <= 127) {
                        break;
                    } else {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1;
        while (true) {
            int i16 = 103;
            if (i12 < length) {
                int i17 = i(str, i12, i14);
                int i18 = 100;
                if (i17 == i14) {
                    switch (str.charAt(i12)) {
                        case 241:
                            i18 = 102;
                            break;
                        case dg.a.f18226sg:
                            i18 = 97;
                            break;
                        case dg.a.f18247tg:
                            i18 = 96;
                            break;
                        case dg.a.f18289vg:
                            if (i14 == 101) {
                                i18 = 101;
                                break;
                            }
                            break;
                        default:
                            if (i14 != 100) {
                                if (i14 == 101) {
                                    i18 = str.charAt(i12) - ' ';
                                    if (i18 < 0) {
                                        i18 += 96;
                                        break;
                                    }
                                } else {
                                    i18 = Integer.parseInt(str.substring(i12, i12 + 2));
                                    i12++;
                                    break;
                                }
                            } else {
                                i18 = str.charAt(i12) - ' ';
                                break;
                            }
                            break;
                    }
                    i12++;
                } else {
                    if (i14 != 0) {
                        i16 = i17;
                    } else if (i17 == 100) {
                        i16 = 104;
                    } else if (i17 != 101) {
                        i16 = 105;
                    }
                    i18 = i16;
                    i14 = i17;
                }
                arrayList.add(c.f20421a[i18]);
                i13 += i18 * i15;
                if (i12 != 0) {
                    i15++;
                }
            } else {
                int[][] iArr = c.f20421a;
                arrayList.add(iArr[i13 % 103]);
                arrayList.add(iArr[106]);
                int i19 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i20 : (int[]) r13.next()) {
                        i19 += i20;
                    }
                }
                boolean[] zArr = new boolean[i19];
                for (int[] c10 : arrayList) {
                    i10 += s.c(zArr, i10, c10, true);
                }
                return zArr;
            }
        }
    }

    public Collection<qa.a> g() {
        return Collections.singleton(qa.a.CODE_128);
    }
}

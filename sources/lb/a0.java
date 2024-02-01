package lb;

import qa.h;
import qa.m;
import ya.a;

public final class a0 extends y {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f20413l = {1, 1, 1, 1, 1, 1};

    /* renamed from: m  reason: collision with root package name */
    public static final int[][] f20414m = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: k  reason: collision with root package name */
    public final int[] f20415k = new int[4];

    public static String s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c10 = cArr[5];
        switch (c10) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c10);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c10);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    public static void t(StringBuilder sb2, int i10) throws m {
        for (int i11 = 0; i11 <= 1; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (i10 == f20414m[i11][i12]) {
                    sb2.insert(0, (char) (i11 + 48));
                    sb2.append((char) (i12 + 48));
                    return;
                }
            }
        }
        throw m.a();
    }

    public boolean h(String str) throws h {
        return super.h(s(str));
    }

    public int[] k(a aVar, int i10) throws m {
        return y.n(aVar, i10, true, f20413l);
    }

    public int l(a aVar, int[] iArr, StringBuilder sb2) throws m {
        int[] iArr2 = this.f20415k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int s10 = aVar.s();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < s10; i12++) {
            int j10 = y.j(aVar, iArr2, i10, y.f20509j);
            sb2.append((char) ((j10 % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (j10 >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        t(sb2, i11);
        return i10;
    }

    public qa.a q() {
        return qa.a.UPC_E;
    }
}

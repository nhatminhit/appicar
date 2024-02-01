package ch;

import b6.c;
import d5.k;
import java.io.UnsupportedEncodingException;
import k7.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f16505a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, k.f6147x0, 118, 119, a.f10047w, 121, 122, k.f6148y0, 49, 50, 51, 52, 53, 54, 55, 56, 57, i7.a.Z, i7.a.f9188d0};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f16506b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, k.f6147x0, 118, 119, a.f10047w, 121, 122, k.f6148y0, 49, 50, 51, 52, 53, 54, 55, 56, 57, i7.a.f9186b0, 95};

    public static byte[] a(String str) {
        int i10;
        int length = str.length();
        while (length > 0 && ((r5 = str.charAt(length - 1)) == '=' || r5 == 10 || r5 == 13 || r5 == ' ' || r5 == 9)) {
            length--;
        }
        int i11 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i11];
        int i12 = 0;
        byte b10 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char charAt = str.charAt(i14);
            if (charAt >= 'A' && charAt <= 'Z') {
                i10 = charAt - 'A';
            } else if (charAt >= 'a' && charAt <= 'z') {
                i10 = charAt - 'G';
            } else if (charAt >= '0' && charAt <= '9') {
                i10 = charAt + 4;
            } else if (charAt == '+' || charAt == '-') {
                i10 = 62;
            } else if (charAt == '/' || charAt == '_') {
                i10 = 63;
            } else {
                if (!(charAt == 10 || charAt == 13 || charAt == ' ' || charAt == 9)) {
                    return null;
                }
            }
            b10 = (b10 << 6) | ((byte) i10);
            i12++;
            if (i12 % 4 == 0) {
                int i15 = i13 + 1;
                bArr[i13] = (byte) (b10 >> 16);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (b10 >> 8);
                bArr[i16] = (byte) b10;
                i13 = i16 + 1;
            }
        }
        int i17 = i12 % 4;
        if (i17 == 1) {
            return null;
        }
        if (i17 == 2) {
            bArr[i13] = (byte) ((b10 << 12) >> 16);
            i13++;
        } else if (i17 == 3) {
            int i18 = b10 << 6;
            int i19 = i13 + 1;
            bArr[i13] = (byte) (i18 >> 16);
            i13 = i19 + 1;
            bArr[i19] = (byte) (i18 >> 8);
        }
        if (i13 == i11) {
            return bArr;
        }
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, 0, bArr2, 0, i13);
        return bArr2;
    }

    public static String b(byte[] bArr) {
        return c(bArr, f16505a);
    }

    public static String c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int i12 = i10 + 1;
            bArr3[i10] = bArr2[(bArr[i11] & 255) >> 2];
            int i13 = i12 + 1;
            int i14 = i11 + 1;
            bArr3[i12] = bArr2[((bArr[i11] & 3) << 4) | ((bArr[i14] & 255) >> 4)];
            int i15 = i13 + 1;
            int i16 = i11 + 2;
            bArr3[i13] = bArr2[((bArr[i14] & 15) << 2) | ((bArr[i16] & 255) >> 6)];
            i10 = i15 + 1;
            bArr3[i15] = bArr2[bArr[i16] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i17 = i10 + 1;
            bArr3[i10] = bArr2[(bArr[length] & 255) >> 2];
            int i18 = i17 + 1;
            bArr3[i17] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i18] = 61;
            bArr3[i18 + 1] = 61;
        } else if (length2 == 2) {
            int i19 = i10 + 1;
            bArr3[i10] = bArr2[(bArr[length] & 255) >> 2];
            int i20 = i19 + 1;
            int i21 = length + 1;
            bArr3[i19] = bArr2[((bArr[i21] & 255) >> 4) | ((bArr[length] & 3) << 4)];
            bArr3[i20] = bArr2[(bArr[i21] & 15) << 2];
            bArr3[i20 + 1] = 61;
        }
        try {
            return new String(bArr3, c.f4237k);
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public static String d(byte[] bArr) {
        return c(bArr, f16506b);
    }
}

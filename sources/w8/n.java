package w8;

import d.m0;
import e8.a;
import j8.w;

@a
@w
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f14926a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f14927b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @a
    @m0
    public static String a(@m0 byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i10 = 0;
        for (byte b10 : bArr) {
            byte b11 = b10 & 255;
            int i11 = i10 + 1;
            char[] cArr2 = f14927b;
            cArr[i10] = cArr2[b11 >>> 4];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    @a
    @m0
    public static String b(@m0 byte[] bArr) {
        return c(bArr, false);
    }

    @a
    @m0
    public static String c(@m0 byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        int i10 = 0;
        while (i10 < length && (!z10 || i10 != length - 1 || (bArr[i10] & 255) != 0)) {
            char[] cArr = f14926a;
            sb2.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb2.append(cArr[bArr[i10] & 15]);
            i10++;
        }
        return sb2.toString();
    }

    @a
    @m0
    public static byte[] d(@m0 String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length / 2)];
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 2;
                bArr[i10 / 2] = (byte) Integer.parseInt(str.substring(i10, i11), 16);
                i10 = i11;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }
}

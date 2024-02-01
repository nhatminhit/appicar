package tc;

import java.io.ByteArrayOutputStream;
import java.util.List;
import p7.f;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f23175a = "0123456789ABCDEF".toCharArray();

    public static String a(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        for (char hexString : charArray) {
            sb2.append(Integer.toHexString(hexString));
        }
        return sb2.toString();
    }

    public static String b(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            byte b10 = bArr[i10] & 255;
            int i11 = i10 * 2;
            char[] cArr2 = f23175a;
            cArr[i11] = cArr2[b10 >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static String c(byte[] bArr, int i10) {
        char[] cArr = new char[(i10 * 2)];
        for (int i11 = 0; i11 < i10; i11++) {
            byte b10 = bArr[i11] & 255;
            int i12 = i11 * 2;
            char[] cArr2 = f23175a;
            cArr[i12] = cArr2[b10 >>> 4];
            cArr[i12 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static boolean d(String str) {
        try {
            int m10 = m(str.substring(6, 8));
            int i10 = 0;
            for (int i11 = 1; i11 <= m10 + 2; i11++) {
                int i12 = i11 * 3;
                i10 += m(str.substring(i12, i12 + 2));
            }
            int i13 = (m10 + 3) * 3;
            return ((i10 ^ 255) & 255) == m(str.substring(i13, i13 + 2));
        } catch (Exception unused) {
        }
    }

    public static byte[] e(String str) {
        if (str.equals("")) {
            return new byte[0];
        }
        int length = (str.length() + 1) / 3;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 3;
            bArr[i10] = (byte) (Integer.parseInt(str.substring(i11, i11 + 2), 16) & 255);
        }
        return bArr;
    }

    public static byte[] f(CharSequence charSequence) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        byte b10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (i10 == 2) {
                byteArrayOutputStream.write(b10);
                i10 = 0;
                b10 = 0;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt >= '0' && charAt <= '9') {
                i10++;
                b10 = (byte) (((byte) (b10 * 16)) + (charAt - '0'));
            }
            if (charAt >= 'A' && charAt <= 'F') {
                i10++;
                b10 = (byte) (((byte) (b10 * 16)) + (charAt - 'A') + 10);
            }
            if (charAt >= 'a' && charAt <= 'f') {
                i10++;
                b10 = (byte) (((byte) (b10 * 16)) + (charAt - 'a') + 10);
            }
        }
        if (i10 > 0) {
            byteArrayOutputStream.write(b10);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String g(String str) {
        try {
            int length = str.length();
            int i10 = 0;
            int i11 = 0;
            while (i10 < length - 1) {
                int i12 = i10 + 2;
                i11 ^= m(str.substring(i10, i12));
                i10 = i12;
            }
            return ed.a.b(Integer.toHexString(i11), 2).toUpperCase();
        } catch (Exception unused) {
            return "";
        }
    }

    public static int h(String str) {
        int i10 = 0;
        try {
            int m10 = m(str.substring(6, 8));
            for (int i11 = 1; i11 <= m10 + 2; i11++) {
                int i12 = i11 * 3;
                i10 += m(str.substring(i12, i12 + 2));
            }
            return (i10 ^ 255) & 255;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int i(List<Integer> list) {
        int i10 = 1;
        int i11 = 0;
        while (i10 <= list.get(2).intValue() + 2) {
            try {
                i11 += list.get(i10).intValue();
                i10++;
            } catch (Exception unused) {
                return 0;
            }
        }
        return (i11 ^ 255) & 255;
    }

    public static byte[] j(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
        }
        return bArr;
    }

    public static String k(String str) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = 0;
        while (i10 < str.length()) {
            int i11 = i10 + 2;
            sb2.append((char) Integer.parseInt(str.substring(i10, i11), 16));
            i10 = i11;
        }
        return sb2.toString();
    }

    public static byte[] l(int i10) {
        byte[] bArr = new byte[4];
        bArr[3] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >> 8) & 255);
        bArr[1] = (byte) ((i10 >> 16) & 255);
        bArr[0] = (byte) ((i10 >> 24) & 255);
        return bArr;
    }

    public static int m(String str) {
        int i10;
        if (str == null || str.length() < 1) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char charAt = str.charAt((str.length() - 1) - i12);
            if ((charAt >= 'a' && charAt <= 'f') || (charAt >= 'A' && charAt <= 'F')) {
                i10 = Character.toUpperCase(charAt) - '7';
            } else if (charAt < '0' || charAt > '9') {
                throw new RuntimeException("�ַ������Ϸ�");
            } else {
                i10 = charAt - '0';
            }
            i11 += (1 << (i12 * 4)) * i10;
        }
        return i11;
    }

    public static byte[] n(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            q(sb2, f(str));
            return f(sb2.toString());
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static String o(byte[] bArr) {
        return p(bArr, 0, bArr.length);
    }

    public static String p(byte[] bArr, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder((i11 - i10) * 3);
        r(sb2, bArr, i10, i11);
        return sb2.toString();
    }

    public static void q(StringBuilder sb2, byte[] bArr) {
        r(sb2, bArr, 0, bArr.length);
    }

    public static void r(StringBuilder sb2, byte[] bArr, int i10, int i11) {
        while (i10 < i11) {
            if (sb2.length() > 0) {
                sb2.append(f.f11698i);
            }
            int i12 = (bArr[i10] & 255) / 16;
            sb2.append((char) (i12 >= 10 ? i12 + 55 : i12 + 48));
            int i13 = (bArr[i10] & 255) % 16;
            sb2.append((char) (i13 >= 10 ? i13 + 55 : i13 + 48));
            i10++;
        }
    }
}

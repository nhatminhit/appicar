package c5;

import java.util.Arrays;
import kh.j;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f4826a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f4827b;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f4828c;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4829d;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f4830e;

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f4831f;

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f4832g;

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f4833h;

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f4834i;

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f4835j;

    /* renamed from: c5.a$a  reason: collision with other inner class name */
    public static class C0076a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0076a f4836b = new C0076a();

        /* renamed from: a  reason: collision with root package name */
        public int[][] f4837a = new int[128][];

        public int[] a(int i10) {
            int[] iArr = this.f4837a[i10];
            if (iArr == null) {
                iArr = Arrays.copyOf(a.f4834i, 128);
                if (iArr[i10] == 0) {
                    iArr[i10] = -1;
                }
                this.f4837a[i10] = iArr;
            }
            return iArr;
        }
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f4826a = charArray;
        int length = charArray.length;
        f4827b = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            f4827b[i10] = (byte) f4826a[i10];
        }
        int[] iArr = new int[256];
        for (int i11 = 0; i11 < 32; i11++) {
            iArr[i11] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f4828c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i12 = 128; i12 < 256; i12++) {
            iArr2[i12] = (i12 & 224) == 192 ? 2 : (i12 & 240) == 224 ? 3 : (i12 & dg.a.f17849ah) == 240 ? 4 : -1;
        }
        f4829d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i13 = 33; i13 < 256; i13++) {
            if (Character.isJavaIdentifierPart((char) i13)) {
                iArr3[i13] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f4830e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f4831f = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f4829d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f4832g = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        f4833h = iArr7;
        int[] iArr8 = new int[128];
        for (int i14 = 0; i14 < 32; i14++) {
            iArr8[i14] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f4834i = iArr8;
        int[] iArr9 = new int[256];
        f4835j = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i15 = 0; i15 < 10; i15++) {
            f4835j[i15 + 48] = i15;
        }
        for (int i16 = 0; i16 < 6; i16++) {
            int[] iArr10 = f4835j;
            int i17 = i16 + 10;
            iArr10[i16 + 97] = i17;
            iArr10[i16 + 65] = i17;
        }
    }

    public static void b(StringBuilder sb2, String str) {
        int[] iArr = f4834i;
        int length = iArr.length;
        int length2 = str.length();
        for (int i10 = 0; i10 < length2; i10++) {
            char charAt = str.charAt(i10);
            if (charAt < length && iArr[charAt] != 0) {
                sb2.append(j.f20323c);
                int i11 = iArr[charAt];
                if (i11 < 0) {
                    sb2.append('u');
                    sb2.append('0');
                    sb2.append('0');
                    char[] cArr = f4826a;
                    sb2.append(cArr[charAt >> 4]);
                    charAt = cArr[charAt & 15];
                } else {
                    charAt = (char) i11;
                }
            }
            sb2.append(charAt);
        }
    }

    public static int c(int i10) {
        return f4835j[i10 & 255];
    }

    public static byte[] d() {
        return (byte[]) f4827b.clone();
    }

    public static char[] e() {
        return (char[]) f4826a.clone();
    }

    public static int[] f() {
        return f4834i;
    }

    public static int[] g(int i10) {
        return i10 == 34 ? f4834i : C0076a.f4836b.a(i10);
    }

    public static int[] h() {
        return f4832g;
    }

    public static int[] i() {
        return f4828c;
    }

    public static int[] j() {
        return f4830e;
    }

    public static int[] k() {
        return f4829d;
    }

    public static int[] l() {
        return f4831f;
    }

    public static int[] m() {
        return f4833h;
    }
}

package hb;

import d5.k;
import d6.b0;
import i7.a;
import java.text.DecimalFormat;
import java.util.List;
import t3.c;
import ya.e;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final char f19515a = '￰';

    /* renamed from: b  reason: collision with root package name */
    public static final char f19516b = '￱';

    /* renamed from: c  reason: collision with root package name */
    public static final char f19517c = '￲';

    /* renamed from: d  reason: collision with root package name */
    public static final char f19518d = '￳';

    /* renamed from: e  reason: collision with root package name */
    public static final char f19519e = '￴';

    /* renamed from: f  reason: collision with root package name */
    public static final char f19520f = '￵';

    /* renamed from: g  reason: collision with root package name */
    public static final char f19521g = '￶';

    /* renamed from: h  reason: collision with root package name */
    public static final char f19522h = '￷';

    /* renamed from: i  reason: collision with root package name */
    public static final char f19523i = '￸';

    /* renamed from: j  reason: collision with root package name */
    public static final char f19524j = '￹';

    /* renamed from: k  reason: collision with root package name */
    public static final char f19525k = '￺';

    /* renamed from: l  reason: collision with root package name */
    public static final char f19526l = '￻';

    /* renamed from: m  reason: collision with root package name */
    public static final char f19527m = '￼';

    /* renamed from: n  reason: collision with root package name */
    public static final char f19528n = '\u001c';

    /* renamed from: o  reason: collision with root package name */
    public static final char f19529o = '\u001d';

    /* renamed from: p  reason: collision with root package name */
    public static final char f19530p = '\u001e';

    /* renamed from: q  reason: collision with root package name */
    public static final String[] f19531q = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ￺\u001c\u001d\u001e￻ ￼\"#$%&'()*+,-./0123456789:￱￲￳￴￸", "`abcdefghijklmnopqrstuvwxyz￺\u001c\u001d\u001e￻{￼}~;<=>?[\\]^_ ,./:@!|￼￵￶￼￰￲￳￴￷", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ￺\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾￷ ￹￳￴￸", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú￺\u001c\u001d\u001e￻ûüýþÿ¡¨«¯°´·¸»¿￷ ￲￹￴￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a￺￼￼\u001b￻\u001c\u001d\u001e\u001f ¢£¤¥¦§©­®¶￷ ￲￳￹￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    public static e a(byte[] bArr, int i10) {
        String str;
        StringBuilder sb2;
        int i11;
        StringBuilder sb3 = new StringBuilder(144);
        if (i10 == 2 || i10 == 3) {
            int i12 = 0;
            if (i10 == 2) {
                str = new DecimalFormat("0000000000".substring(0, g(bArr))).format((long) f(bArr));
            } else {
                str = h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format((long) c(bArr));
            String format2 = decimalFormat.format((long) i(bArr));
            sb3.append(e(bArr, 10, 84));
            if (sb3.toString().startsWith("[)>\u001e01\u001d")) {
                i12 = 9;
                sb2 = new StringBuilder();
            } else {
                sb2 = new StringBuilder();
            }
            sb2.append(str);
            sb2.append(f19529o);
            sb2.append(format);
            sb2.append(f19529o);
            sb2.append(format2);
            sb2.append(f19529o);
            sb3.insert(i12, sb2.toString());
        } else {
            if (i10 == 4) {
                i11 = 93;
            } else if (i10 == 5) {
                i11 = 77;
            }
            sb3.append(e(bArr, 1, i11));
        }
        return new e(bArr, sb3.toString(), (List<byte[]>) null, String.valueOf(i10));
    }

    public static int b(int i10, byte[] bArr) {
        int i11 = i10 - 1;
        return ((1 << (5 - (i11 % 6))) & bArr[i11 / 6]) == 0 ? 0 : 1;
    }

    public static int c(byte[] bArr) {
        return d(bArr, new byte[]{53, 54, a.Z, 44, a.f9186b0, a.f9187c0, a.f9188d0, k.f6148y0, a.U, a.V});
    }

    public static int d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < bArr2.length; i11++) {
                i10 += b(bArr2[i11], bArr) << ((bArr2.length - i11) - 1);
            }
            return i10;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        r6 = r4;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        r7 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        if (r5 != 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        r3 = r3 + 1;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0051, code lost:
        r5 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e(byte[] r12, int r13, int r14) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = -1
            r3 = r13
            r4 = r1
            r6 = r4
            r5 = r2
        L_0x000b:
            int r7 = r13 + r14
            r8 = 1
            if (r3 >= r7) goto L_0x0068
            java.lang.String[] r7 = f19531q
            r7 = r7[r4]
            byte r9 = r12[r3]
            char r7 = r7.charAt(r9)
            switch(r7) {
                case 65520: goto L_0x0059;
                case 65521: goto L_0x0059;
                case 65522: goto L_0x0059;
                case 65523: goto L_0x0059;
                case 65524: goto L_0x0059;
                case 65525: goto L_0x0055;
                case 65526: goto L_0x0053;
                case 65527: goto L_0x0050;
                case 65528: goto L_0x004d;
                case 65529: goto L_0x0051;
                case 65530: goto L_0x001d;
                case 65531: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0.append(r7)
            goto L_0x0060
        L_0x0021:
            int r3 = r3 + 1
            byte r7 = r12[r3]
            int r7 = r7 << 24
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 18
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 12
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 6
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r7 = r7 + r9
            java.text.DecimalFormat r9 = new java.text.DecimalFormat
            java.lang.String r10 = "000000000"
            r9.<init>(r10)
            long r10 = (long) r7
            java.lang.String r7 = r9.format(r10)
            r0.append(r7)
            goto L_0x0060
        L_0x004d:
            r5 = r2
            r4 = r8
            goto L_0x0060
        L_0x0050:
            r4 = r1
        L_0x0051:
            r5 = r2
            goto L_0x0060
        L_0x0053:
            r5 = 3
            goto L_0x0056
        L_0x0055:
            r5 = 2
        L_0x0056:
            r6 = r4
            r4 = r1
            goto L_0x0060
        L_0x0059:
            r5 = 65520(0xfff0, float:9.1813E-41)
            int r7 = r7 - r5
            r6 = r4
            r4 = r7
            r5 = r8
        L_0x0060:
            int r7 = r5 + -1
            if (r5 != 0) goto L_0x0065
            r4 = r6
        L_0x0065:
            int r3 = r3 + r8
            r5 = r7
            goto L_0x000b
        L_0x0068:
            int r12 = r0.length()
            if (r12 <= 0) goto L_0x0085
            int r12 = r0.length()
            int r12 = r12 - r8
            char r12 = r0.charAt(r12)
            r13 = 65532(0xfffc, float:9.183E-41)
            if (r12 != r13) goto L_0x0085
            int r12 = r0.length()
            int r12 = r12 - r8
            r0.setLength(r12)
            goto L_0x0068
        L_0x0085:
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.b.e(byte[], int, int):java.lang.String");
    }

    public static int f(byte[] bArr) {
        return d(bArr, new byte[]{33, 34, 35, a.T, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, c.T, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    public static int g(byte[] bArr) {
        return d(bArr, new byte[]{a.W, 40, a.X, 42, b0.f6265f, 32});
    }

    public static String h(byte[] bArr) {
        String[] strArr = f19531q;
        return String.valueOf(new char[]{strArr[0].charAt(d(bArr, new byte[]{a.W, 40, a.X, 42, b0.f6265f, 32})), strArr[0].charAt(d(bArr, new byte[]{33, 34, 35, a.T, 25, 26})), strArr[0].charAt(d(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(d(bArr, new byte[]{21, 22, 23, 24, c.T, 14})), strArr[0].charAt(d(bArr, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(d(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    public static int i(byte[] bArr) {
        return d(bArr, new byte[]{55, 56, 57, k.F0, 59, 60, 49, 50, 51, 52});
    }
}

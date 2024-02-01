package bh;

import ch.c;
import ch.f;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f16288a = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    /* renamed from: b  reason: collision with root package name */
    public static final int f16289b = 128;

    /* renamed from: c  reason: collision with root package name */
    public static final int f16290c = 64;

    /* renamed from: d  reason: collision with root package name */
    public static final int f16291d = 32;

    /* renamed from: e  reason: collision with root package name */
    public static final int f16292e = 16;

    /* renamed from: f  reason: collision with root package name */
    public static final int f16293f = 15;

    /* renamed from: g  reason: collision with root package name */
    public static final int f16294g = 8;

    /* renamed from: h  reason: collision with root package name */
    public static final int f16295h = 128;

    /* renamed from: i  reason: collision with root package name */
    public static final int f16296i = 127;

    /* renamed from: j  reason: collision with root package name */
    public static final int f16297j = 0;

    /* renamed from: k  reason: collision with root package name */
    public static final int f16298k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f16299l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static final int f16300m = 8;

    /* renamed from: n  reason: collision with root package name */
    public static final int f16301n = 9;

    /* renamed from: o  reason: collision with root package name */
    public static final int f16302o = 10;

    /* renamed from: p  reason: collision with root package name */
    public static final long f16303p = 125;

    /* renamed from: q  reason: collision with root package name */
    public static final long f16304q = 123;

    /* renamed from: r  reason: collision with root package name */
    public static final int f16305r = 126;

    /* renamed from: s  reason: collision with root package name */
    public static final long f16306s = 65535;

    /* renamed from: t  reason: collision with root package name */
    public static final int f16307t = 127;

    /* renamed from: u  reason: collision with root package name */
    public static final int f16308u = 1001;

    /* renamed from: v  reason: collision with root package name */
    public static final int f16309v = 1005;

    public c() {
        throw new AssertionError("No instances.");
    }

    public static String a(String str) {
        return f.o(str + f16288a).O().b();
    }

    public static String b(int i10) {
        StringBuilder sb2;
        if (i10 < 1000 || i10 >= 5000) {
            sb2 = new StringBuilder();
            sb2.append("Code must be in range [1000,5000): ");
            sb2.append(i10);
        } else if ((i10 < 1004 || i10 > 1006) && (i10 < 1012 || i10 > 2999)) {
            return null;
        } else {
            sb2 = new StringBuilder();
            sb2.append("Code ");
            sb2.append(i10);
            sb2.append(" is reserved and may not be used.");
        }
        return sb2.toString();
    }

    public static void c(c.C0271c cVar, byte[] bArr) {
        int length = bArr.length;
        int i10 = 0;
        do {
            byte[] bArr2 = cVar.S;
            int i11 = cVar.T;
            int i12 = cVar.U;
            while (i11 < i12) {
                int i13 = i10 % length;
                bArr2[i11] = (byte) (bArr2[i11] ^ bArr[i13]);
                i11++;
                i10 = i13 + 1;
            }
        } while (cVar.f() != -1);
    }

    public static void d(int i10) {
        String b10 = b(i10);
        if (b10 != null) {
            throw new IllegalArgumentException(b10);
        }
    }
}

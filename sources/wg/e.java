package wg;

import ch.f;
import java.io.IOException;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final f f24186a = f.o("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final int f24187b = 16384;

    /* renamed from: c  reason: collision with root package name */
    public static final byte f24188c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final byte f24189d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final byte f24190e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final byte f24191f = 3;

    /* renamed from: g  reason: collision with root package name */
    public static final byte f24192g = 4;

    /* renamed from: h  reason: collision with root package name */
    public static final byte f24193h = 5;

    /* renamed from: i  reason: collision with root package name */
    public static final byte f24194i = 6;

    /* renamed from: j  reason: collision with root package name */
    public static final byte f24195j = 7;

    /* renamed from: k  reason: collision with root package name */
    public static final byte f24196k = 8;

    /* renamed from: l  reason: collision with root package name */
    public static final byte f24197l = 9;

    /* renamed from: m  reason: collision with root package name */
    public static final byte f24198m = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final byte f24199n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final byte f24200o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final byte f24201p = 4;

    /* renamed from: q  reason: collision with root package name */
    public static final byte f24202q = 4;

    /* renamed from: r  reason: collision with root package name */
    public static final byte f24203r = 8;

    /* renamed from: s  reason: collision with root package name */
    public static final byte f24204s = 32;

    /* renamed from: t  reason: collision with root package name */
    public static final byte f24205t = 32;

    /* renamed from: u  reason: collision with root package name */
    public static final String[] f24206u = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: v  reason: collision with root package name */
    public static final String[] f24207v = new String[64];

    /* renamed from: w  reason: collision with root package name */
    public static final String[] f24208w = new String[256];

    static {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = f24208w;
            if (i11 >= strArr.length) {
                break;
            }
            strArr[i11] = pg.e.r("%8s", Integer.toBinaryString(i11)).replace(p7.f.f11698i, '0');
            i11++;
        }
        String[] strArr2 = f24207v;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i12 = 0; i12 < 1; i12++) {
            int i13 = iArr[i12];
            String[] strArr3 = f24207v;
            strArr3[i13 | 8] = strArr3[i13] + "|PADDED";
        }
        String[] strArr4 = f24207v;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i14 = 0; i14 < 3; i14++) {
            int i15 = iArr2[i14];
            for (int i16 = 0; i16 < 1; i16++) {
                int i17 = iArr[i16];
                String[] strArr5 = f24207v;
                int i18 = i17 | i15;
                strArr5[i18] = strArr5[i17] + '|' + strArr5[i15];
                strArr5[i18 | 8] = strArr5[i17] + '|' + strArr5[i15] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr6 = f24207v;
            if (i10 < strArr6.length) {
                if (strArr6[i10] == null) {
                    strArr6[i10] = f24208w[i10];
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public static String a(byte b10, byte b11) {
        if (b11 == 0) {
            return "";
        }
        if (!(b10 == 2 || b10 == 3)) {
            if (b10 == 4 || b10 == 6) {
                return b11 == 1 ? "ACK" : f24208w[b11];
            }
            if (!(b10 == 7 || b10 == 8)) {
                String[] strArr = f24207v;
                String str = b11 < strArr.length ? strArr[b11] : f24208w[b11];
                return (b10 != 5 || (b11 & 4) == 0) ? (b10 != 0 || (b11 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f24208w[b11];
    }

    public static String b(boolean z10, int i10, int i11, byte b10, byte b11) {
        String[] strArr = f24206u;
        String r10 = b10 < strArr.length ? strArr[b10] : pg.e.r("0x%02x", Byte.valueOf(b10));
        String a10 = a(b10, b11);
        Object[] objArr = new Object[5];
        objArr[0] = z10 ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = Integer.valueOf(i11);
        objArr[3] = r10;
        objArr[4] = a10;
        return pg.e.r("%s 0x%08x %5d %-13s %s", objArr);
    }

    public static IllegalArgumentException c(String str, Object... objArr) {
        throw new IllegalArgumentException(pg.e.r(str, objArr));
    }

    public static IOException d(String str, Object... objArr) throws IOException {
        throw new IOException(pg.e.r(str, objArr));
    }
}

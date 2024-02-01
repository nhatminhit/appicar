package d6;

import b7.u0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import dg.a;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import k6.b;
import p6.h;
import r6.i;
import w7.s;
import w7.v;
import y7.e;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f6260a = 2147385345;

    /* renamed from: b  reason: collision with root package name */
    public static final int f6261b = 536864768;

    /* renamed from: c  reason: collision with root package name */
    public static final int f6262c = -25230976;

    /* renamed from: d  reason: collision with root package name */
    public static final int f6263d = -14745368;

    /* renamed from: e  reason: collision with root package name */
    public static final byte f6264e = Byte.MAX_VALUE;

    /* renamed from: f  reason: collision with root package name */
    public static final byte f6265f = 31;

    /* renamed from: g  reason: collision with root package name */
    public static final byte f6266g = -2;

    /* renamed from: h  reason: collision with root package name */
    public static final byte f6267h = -1;

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f6268i = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f6269j = {-1, 8000, b.A, e.f15575h, -1, -1, 11025, 22050, u0.U, -1, -1, f5.b.f7371q, 24000, h.f11572t, -1, -1};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f6270k = {64, 112, 128, 192, 224, 256, 384, a.RI, 512, 640, i.G, 896, 1024, 1152, 1280, a.f6181d, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(byte[] r7) {
        /*
            r0 = 0
            byte r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L_0x004a
            r2 = -1
            if (r1 == r2) goto L_0x0032
            r2 = 31
            if (r1 == r2) goto L_0x0021
            r1 = 5
            byte r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r4]
            goto L_0x0058
        L_0x0021:
            byte r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            byte r7 = r7[r1]
            goto L_0x0042
        L_0x0032:
            byte r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            byte r7 = r7[r1]
        L_0x0042:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L_0x005d
        L_0x004a:
            byte r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r3]
        L_0x0058:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L_0x005d:
            if (r0 == 0) goto L_0x0063
            int r7 = r7 * 16
            int r7 = r7 / 14
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.b0.a(byte[]):int");
    }

    public static v b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new v(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (c(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b10 = copyOf[i10];
                int i11 = i10 + 1;
                copyOf[i10] = copyOf[i11];
                copyOf[i11] = b10;
            }
        }
        v vVar = new v(copyOf);
        if (copyOf[0] == 31) {
            v vVar2 = new v(copyOf);
            while (vVar2.b() >= 16) {
                vVar2.p(2);
                vVar.f(vVar2.h(14), 14);
            }
        }
        vVar.l(copyOf);
        return vVar;
    }

    public static boolean c(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1;
    }

    public static boolean d(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    public static int e(ByteBuffer byteBuffer) {
        byte b10;
        int i10;
        int i11;
        int i12;
        int i13;
        int position = byteBuffer.position();
        byte b11 = byteBuffer.get(position);
        if (b11 != -2) {
            if (b11 == -1) {
                i10 = (byteBuffer.get(position + 4) & 7) << 4;
                i13 = position + 7;
            } else if (b11 != 31) {
                i12 = (byteBuffer.get(position + 4) & 1) << 6;
                i11 = position + 5;
            } else {
                i10 = (byteBuffer.get(position + 5) & 7) << 4;
                i13 = position + 6;
            }
            b10 = byteBuffer.get(i13) & 60;
            return (((b10 >> 2) | i10) + 1) * 32;
        }
        i12 = (byteBuffer.get(position + 5) & 1) << 6;
        i11 = position + 4;
        b10 = byteBuffer.get(i11) & i7.a.Q;
        return (((b10 >> 2) | i10) + 1) * 32;
    }

    public static int f(byte[] bArr) {
        byte b10;
        int i10;
        byte b11;
        int i11;
        byte b12;
        byte b13 = bArr[0];
        if (b13 != -2) {
            if (b13 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b12 = bArr[7];
            } else if (b13 != 31) {
                i11 = (bArr[4] & 1) << 6;
                b11 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b12 = bArr[6];
            }
            b10 = b12 & 60;
            return (((b10 >> 2) | i10) + 1) * 32;
        }
        i11 = (bArr[5] & 1) << 6;
        b11 = bArr[4];
        b10 = b11 & i7.a.Q;
        return (((b10 >> 2) | i10) + 1) * 32;
    }

    public static Format g(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        v b10 = b(bArr);
        b10.p(60);
        int i10 = f6268i[b10.h(6)];
        int i11 = f6269j[b10.h(4)];
        int h10 = b10.h(5);
        int[] iArr = f6270k;
        int i12 = h10 >= iArr.length ? -1 : (iArr[h10] * 1000) / 2;
        b10.p(10);
        return Format.r(str, s.H, (String) null, i12, -1, i10 + (b10.h(2) > 0 ? 1 : 0), i11, (List<byte[]>) null, drmInitData, 0, str2);
    }
}

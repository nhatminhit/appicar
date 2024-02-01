package d6;

import b7.u0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.List;
import p6.h;
import w7.s;
import w7.v;
import w7.w;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f6250a = 44096;

    /* renamed from: b  reason: collision with root package name */
    public static final int f6251b = 44097;

    /* renamed from: c  reason: collision with root package name */
    public static final int f6252c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f6253d = 16;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f6254e = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: d6.b$b  reason: collision with other inner class name */
    public static final class C0106b {

        /* renamed from: a  reason: collision with root package name */
        public final int f6255a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6256b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6257c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6258d;

        /* renamed from: e  reason: collision with root package name */
        public final int f6259e;

        public C0106b(int i10, int i11, int i12, int i13, int i14) {
            this.f6255a = i10;
            this.f6257c = i11;
            this.f6256b = i12;
            this.f6258d = i13;
            this.f6259e = i14;
        }
    }

    public static void a(int i10, w wVar) {
        wVar.M(7);
        byte[] bArr = wVar.f14880a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    public static Format b(w wVar, String str, String str2, DrmInitData drmInitData) {
        wVar.R(1);
        return Format.r(str, s.F, (String) null, -1, -1, 2, ((wVar.D() & 32) >> 5) == 1 ? h.f11572t : u0.U, (List<byte[]>) null, drmInitData, 0, str2);
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return d(new v(bArr)).f6259e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0082, code lost:
        if (r10 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0087, code lost:
        if (r10 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008c, code lost:
        if (r10 != 8) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static d6.b.C0106b d(w7.v r10) {
        /*
            r0 = 16
            int r1 = r10.h(r0)
            int r0 = r10.h(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L_0x0018
            r0 = 24
            int r0 = r10.h(r0)
            r3 = 7
            goto L_0x0019
        L_0x0018:
            r3 = r2
        L_0x0019:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r7 = r0
            r0 = 2
            int r1 = r10.h(r0)
            r3 = 3
            if (r1 != r3) goto L_0x002f
            int r4 = f(r10, r0)
            int r1 = r1 + r4
        L_0x002f:
            r4 = r1
            r1 = 10
            int r1 = r10.h(r1)
            boolean r5 = r10.g()
            if (r5 == 0) goto L_0x0045
            int r5 = r10.h(r3)
            if (r5 <= 0) goto L_0x0045
            r10.p(r0)
        L_0x0045:
            boolean r5 = r10.g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L_0x0053
            r9 = r6
            goto L_0x0054
        L_0x0053:
            r9 = r8
        L_0x0054:
            int r10 = r10.h(r2)
            r5 = 0
            if (r9 != r8) goto L_0x0065
            r8 = 13
            if (r10 != r8) goto L_0x0065
            int[] r0 = f6254e
            r10 = r0[r10]
            r8 = r10
            goto L_0x0091
        L_0x0065:
            if (r9 != r6) goto L_0x0090
            int[] r6 = f6254e
            int r8 = r6.length
            if (r10 >= r8) goto L_0x0090
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 8
            r8 = 1
            if (r1 == r8) goto L_0x008a
            r8 = 11
            if (r1 == r0) goto L_0x0085
            if (r1 == r3) goto L_0x008a
            if (r1 == r2) goto L_0x007e
            goto L_0x0090
        L_0x007e:
            if (r10 == r3) goto L_0x008e
            if (r10 == r6) goto L_0x008e
            if (r10 != r8) goto L_0x0090
            goto L_0x0089
        L_0x0085:
            if (r10 == r6) goto L_0x008e
            if (r10 != r8) goto L_0x0090
        L_0x0089:
            goto L_0x008e
        L_0x008a:
            if (r10 == r3) goto L_0x008e
            if (r10 != r6) goto L_0x0090
        L_0x008e:
            int r5 = r5 + 1
        L_0x0090:
            r8 = r5
        L_0x0091:
            d6.b$b r10 = new d6.b$b
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.b.d(w7.v):d6.b$b");
    }

    public static int e(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        byte b10 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (b10 == 65535) {
            b10 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return b10 + i11;
    }

    public static int f(v vVar, int i10) {
        int i11 = 0;
        while (true) {
            int h10 = i11 + vVar.h(i10);
            if (!vVar.g()) {
                return h10;
            }
            i11 = (h10 + 1) << i10;
        }
    }
}

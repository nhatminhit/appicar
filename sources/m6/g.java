package m6;

import j6.j;
import java.io.IOException;

public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final int f10633d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f10634e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final long[] f10635f = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f10636a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public int f10637b;

    /* renamed from: c  reason: collision with root package name */
    public int f10638c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f10635f[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11;
        int i12 = 0;
        do {
            long[] jArr = f10635f;
            if (i12 >= jArr.length) {
                return -1;
            }
            i11 = ((jArr[i12] & ((long) i10)) > 0 ? 1 : ((jArr[i12] & ((long) i10)) == 0 ? 0 : -1));
            i12++;
        } while (i11 == 0);
        return i12;
    }

    public int b() {
        return this.f10638c;
    }

    public long d(j jVar, boolean z10, boolean z11, int i10) throws IOException, InterruptedException {
        if (this.f10637b == 0) {
            if (!jVar.a(this.f10636a, 0, 1, z10)) {
                return -1;
            }
            int c10 = c(this.f10636a[0] & 255);
            this.f10638c = c10;
            if (c10 != -1) {
                this.f10637b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.f10638c;
        if (i11 > i10) {
            this.f10637b = 0;
            return -2;
        }
        if (i11 != 1) {
            jVar.readFully(this.f10636a, 1, i11 - 1);
        }
        this.f10637b = 0;
        return a(this.f10636a, this.f10638c, z11);
    }

    public void e() {
        this.f10637b = 0;
        this.f10638c = 0;
    }
}

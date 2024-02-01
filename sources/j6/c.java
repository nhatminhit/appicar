package j6;

import j6.q;
import java.util.Arrays;
import w7.q0;

public final class c implements q {

    /* renamed from: d  reason: collision with root package name */
    public final int f9554d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f9555e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f9556f;

    /* renamed from: g  reason: collision with root package name */
    public final long[] f9557g;

    /* renamed from: h  reason: collision with root package name */
    public final long[] f9558h;

    /* renamed from: i  reason: collision with root package name */
    public final long f9559i;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f9555e = iArr;
        this.f9556f = jArr;
        this.f9557g = jArr2;
        this.f9558h = jArr3;
        int length = iArr.length;
        this.f9554d = length;
        if (length > 0) {
            this.f9559i = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f9559i = 0;
        }
    }

    public int a(long j10) {
        return q0.k(this.f9558h, j10, true, true);
    }

    public boolean d() {
        return true;
    }

    public q.a i(long j10) {
        int a10 = a(j10);
        r rVar = new r(this.f9558h[a10], this.f9556f[a10]);
        if (rVar.f9616a >= j10 || a10 == this.f9554d - 1) {
            return new q.a(rVar);
        }
        int i10 = a10 + 1;
        return new q.a(rVar, new r(this.f9558h[i10], this.f9556f[i10]));
    }

    public long j() {
        return this.f9559i;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f9554d + ", sizes=" + Arrays.toString(this.f9555e) + ", offsets=" + Arrays.toString(this.f9556f) + ", timeUs=" + Arrays.toString(this.f9558h) + ", durationsUs=" + Arrays.toString(this.f9557g) + ")";
    }
}

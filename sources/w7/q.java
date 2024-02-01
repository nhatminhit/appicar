package w7;

import java.util.Arrays;

public final class q {

    /* renamed from: c  reason: collision with root package name */
    public static final int f14783c = 32;

    /* renamed from: a  reason: collision with root package name */
    public int f14784a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f14785b;

    public q() {
        this(32);
    }

    public q(int i10) {
        this.f14785b = new long[i10];
    }

    public void a(long j10) {
        int i10 = this.f14784a;
        long[] jArr = this.f14785b;
        if (i10 == jArr.length) {
            this.f14785b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f14785b;
        int i11 = this.f14784a;
        this.f14784a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f14784a) {
            return this.f14785b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f14784a);
    }

    public int c() {
        return this.f14784a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f14785b, this.f14784a);
    }
}

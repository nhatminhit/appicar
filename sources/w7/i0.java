package w7;

import d.o0;
import java.util.Arrays;

public final class i0<V> {

    /* renamed from: e  reason: collision with root package name */
    public static final int f14736e = 10;

    /* renamed from: a  reason: collision with root package name */
    public long[] f14737a;

    /* renamed from: b  reason: collision with root package name */
    public V[] f14738b;

    /* renamed from: c  reason: collision with root package name */
    public int f14739c;

    /* renamed from: d  reason: collision with root package name */
    public int f14740d;

    public i0() {
        this(10);
    }

    public i0(int i10) {
        this.f14737a = new long[i10];
        this.f14738b = f(i10);
    }

    public static <V> V[] f(int i10) {
        return new Object[i10];
    }

    public synchronized void a(long j10, V v10) {
        d(j10);
        e();
        b(j10, v10);
    }

    public final void b(long j10, V v10) {
        int i10 = this.f14739c;
        int i11 = this.f14740d;
        V[] vArr = this.f14738b;
        int length = (i10 + i11) % vArr.length;
        this.f14737a[length] = j10;
        vArr[length] = v10;
        this.f14740d = i11 + 1;
    }

    public synchronized void c() {
        this.f14739c = 0;
        this.f14740d = 0;
        Arrays.fill(this.f14738b, (Object) null);
    }

    public final void d(long j10) {
        int i10 = this.f14740d;
        if (i10 > 0) {
            if (j10 <= this.f14737a[((this.f14739c + i10) - 1) % this.f14738b.length]) {
                c();
            }
        }
    }

    public final void e() {
        int length = this.f14738b.length;
        if (this.f14740d >= length) {
            int i10 = length * 2;
            long[] jArr = new long[i10];
            V[] f10 = f(i10);
            int i11 = this.f14739c;
            int i12 = length - i11;
            System.arraycopy(this.f14737a, i11, jArr, 0, i12);
            System.arraycopy(this.f14738b, this.f14739c, f10, 0, i12);
            int i13 = this.f14739c;
            if (i13 > 0) {
                System.arraycopy(this.f14737a, 0, jArr, i12, i13);
                System.arraycopy(this.f14738b, 0, f10, i12, this.f14739c);
            }
            this.f14737a = jArr;
            this.f14738b = f10;
            this.f14739c = 0;
        }
    }

    @o0
    public synchronized V g(long j10) {
        return h(j10, false);
    }

    @o0
    public final V h(long j10, boolean z10) {
        long j11 = Long.MAX_VALUE;
        V v10 = null;
        while (true) {
            int i10 = this.f14740d;
            if (i10 <= 0) {
                break;
            }
            long[] jArr = this.f14737a;
            int i11 = this.f14739c;
            long j12 = j10 - jArr[i11];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            V[] vArr = this.f14738b;
            v10 = vArr[i11];
            vArr[i11] = null;
            this.f14739c = (i11 + 1) % vArr.length;
            this.f14740d = i10 - 1;
            j11 = j12;
        }
        return v10;
    }

    @o0
    public synchronized V i(long j10) {
        return h(j10, true);
    }

    public synchronized int j() {
        return this.f14740d;
    }
}

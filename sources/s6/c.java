package s6;

import j6.q;
import j6.r;
import w7.q0;

public final class c implements q {

    /* renamed from: d  reason: collision with root package name */
    public final int f12645d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12646e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12647f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12648g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12649h;

    /* renamed from: i  reason: collision with root package name */
    public final int f12650i;

    /* renamed from: j  reason: collision with root package name */
    public int f12651j = -1;

    /* renamed from: k  reason: collision with root package name */
    public long f12652k = -1;

    public c(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f12645d = i10;
        this.f12646e = i11;
        this.f12647f = i12;
        this.f12648g = i13;
        this.f12649h = i14;
        this.f12650i = i15;
    }

    public int a() {
        return this.f12646e * this.f12649h * this.f12645d;
    }

    public long b() {
        return this.f12652k;
    }

    public int c() {
        return this.f12648g;
    }

    public boolean d() {
        return true;
    }

    public long e(long j10) {
        return (Math.max(0, j10 - ((long) this.f12651j)) * 1000000) / ((long) this.f12647f);
    }

    public int f() {
        return this.f12651j;
    }

    public int g() {
        return this.f12650i;
    }

    public int h() {
        return this.f12645d;
    }

    public q.a i(long j10) {
        long j11 = this.f12652k - ((long) this.f12651j);
        int i10 = this.f12648g;
        long v10 = q0.v((((((long) this.f12647f) * j10) / 1000000) / ((long) i10)) * ((long) i10), 0, j11 - ((long) i10));
        long j12 = ((long) this.f12651j) + v10;
        long e10 = e(j12);
        r rVar = new r(e10, j12);
        if (e10 < j10) {
            int i11 = this.f12648g;
            if (v10 != j11 - ((long) i11)) {
                long j13 = j12 + ((long) i11);
                return new q.a(rVar, new r(e(j13), j13));
            }
        }
        return new q.a(rVar);
    }

    public long j() {
        return (((this.f12652k - ((long) this.f12651j)) / ((long) this.f12648g)) * 1000000) / ((long) this.f12646e);
    }

    public int k() {
        return this.f12646e;
    }

    public boolean l() {
        return this.f12651j != -1;
    }

    public void m(int i10, long j10) {
        this.f12651j = i10;
        this.f12652k = j10;
    }
}

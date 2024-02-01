package j6;

import b6.c;
import j6.q;
import w7.q0;

public class d implements q {

    /* renamed from: d  reason: collision with root package name */
    public final long f9560d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9561e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9562f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9563g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9564h;

    /* renamed from: i  reason: collision with root package name */
    public final long f9565i;

    public d(long j10, long j11, int i10, int i11) {
        long j12;
        this.f9560d = j10;
        this.f9561e = j11;
        this.f9562f = i11 == -1 ? 1 : i11;
        this.f9564h = i10;
        if (j10 == -1) {
            this.f9563g = -1;
            j12 = c.f4201b;
        } else {
            this.f9563g = j10 - j11;
            j12 = f(j10, j11, i10);
        }
        this.f9565i = j12;
    }

    public static long f(long j10, long j11, int i10) {
        return ((Math.max(0, j10 - j11) * 8) * 1000000) / ((long) i10);
    }

    public final long a(long j10) {
        int i10 = this.f9562f;
        return this.f9561e + q0.v((((j10 * ((long) this.f9564h)) / 8000000) / ((long) i10)) * ((long) i10), 0, this.f9563g - ((long) i10));
    }

    public long c(long j10) {
        return f(j10, this.f9561e, this.f9564h);
    }

    public boolean d() {
        return this.f9563g != -1;
    }

    public q.a i(long j10) {
        if (this.f9563g == -1) {
            return new q.a(new r(0, this.f9561e));
        }
        long a10 = a(j10);
        long c10 = c(a10);
        r rVar = new r(c10, a10);
        if (c10 < j10) {
            int i10 = this.f9562f;
            if (((long) i10) + a10 < this.f9560d) {
                long j11 = a10 + ((long) i10);
                return new q.a(rVar, new r(c(j11), j11));
            }
        }
        return new q.a(rVar);
    }

    public long j() {
        return this.f9565i;
    }
}

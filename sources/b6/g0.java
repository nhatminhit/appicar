package b6;

import b7.y;
import d.o0;
import w7.q0;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final y.a f4350a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4351b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4352c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4353d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4354e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4355f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4356g;

    public g0(y.a aVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.f4350a = aVar;
        this.f4351b = j10;
        this.f4352c = j11;
        this.f4353d = j12;
        this.f4354e = j13;
        this.f4355f = z10;
        this.f4356g = z11;
    }

    public g0 a(long j10) {
        if (j10 == this.f4352c) {
            return this;
        }
        return new g0(this.f4350a, this.f4351b, j10, this.f4353d, this.f4354e, this.f4355f, this.f4356g);
    }

    public g0 b(long j10) {
        if (j10 == this.f4351b) {
            return this;
        }
        return new g0(this.f4350a, j10, this.f4352c, this.f4353d, this.f4354e, this.f4355f, this.f4356g);
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f4351b == g0Var.f4351b && this.f4352c == g0Var.f4352c && this.f4353d == g0Var.f4353d && this.f4354e == g0Var.f4354e && this.f4355f == g0Var.f4355f && this.f4356g == g0Var.f4356g && q0.e(this.f4350a, g0Var.f4350a);
    }

    public int hashCode() {
        return ((((((((((((527 + this.f4350a.hashCode()) * 31) + ((int) this.f4351b)) * 31) + ((int) this.f4352c)) * 31) + ((int) this.f4353d)) * 31) + ((int) this.f4354e)) * 31) + (this.f4355f ? 1 : 0)) * 31) + (this.f4356g ? 1 : 0);
    }
}

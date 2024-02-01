package ch;

import java.util.concurrent.TimeUnit;

public final class t extends b0 {

    /* renamed from: e  reason: collision with root package name */
    public b0 f16523e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16524f;

    /* renamed from: g  reason: collision with root package name */
    public long f16525g;

    /* renamed from: h  reason: collision with root package name */
    public long f16526h;

    public void l() {
        this.f16523e.i(this.f16526h, TimeUnit.NANOSECONDS);
        if (this.f16524f) {
            this.f16523e.e(this.f16525g);
        } else {
            this.f16523e.a();
        }
    }

    public void m(b0 b0Var) {
        long j10;
        this.f16523e = b0Var;
        boolean f10 = b0Var.f();
        this.f16524f = f10;
        this.f16525g = f10 ? b0Var.d() : -1;
        long j11 = b0Var.j();
        this.f16526h = j11;
        b0Var.i(b0.g(j11, j()), TimeUnit.NANOSECONDS);
        if (this.f16524f && f()) {
            j10 = Math.min(d(), this.f16525g);
        } else if (f()) {
            j10 = d();
        } else {
            return;
        }
        b0Var.e(j10);
    }
}

package ch;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class j extends b0 {

    /* renamed from: e  reason: collision with root package name */
    public b0 f16512e;

    public j(b0 b0Var) {
        if (b0Var != null) {
            this.f16512e = b0Var;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public b0 a() {
        return this.f16512e.a();
    }

    public b0 b() {
        return this.f16512e.b();
    }

    public long d() {
        return this.f16512e.d();
    }

    public b0 e(long j10) {
        return this.f16512e.e(j10);
    }

    public boolean f() {
        return this.f16512e.f();
    }

    public void h() throws IOException {
        this.f16512e.h();
    }

    public b0 i(long j10, TimeUnit timeUnit) {
        return this.f16512e.i(j10, timeUnit);
    }

    public long j() {
        return this.f16512e.j();
    }

    public final b0 l() {
        return this.f16512e;
    }

    public final j m(b0 b0Var) {
        if (b0Var != null) {
            this.f16512e = b0Var;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}

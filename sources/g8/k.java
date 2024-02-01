package g8;

import com.google.android.gms.common.api.internal.BasePendingResult;
import d.m0;
import e8.a;
import f8.n;
import f8.o;
import f8.u;
import f8.v;
import f8.x;
import f8.y;
import java.util.concurrent.TimeUnit;

@a
public final class k<R extends u> extends n<R> {

    /* renamed from: a  reason: collision with root package name */
    public final BasePendingResult f8231a;

    public k(@m0 o oVar) {
        this.f8231a = (BasePendingResult) oVar;
    }

    public final void c(@m0 o.a aVar) {
        this.f8231a.c(aVar);
    }

    @m0
    public final R d() {
        return this.f8231a.d();
    }

    @m0
    public final R e(long j10, @m0 TimeUnit timeUnit) {
        return this.f8231a.e(j10, timeUnit);
    }

    public final void f() {
        this.f8231a.f();
    }

    public final boolean g() {
        return this.f8231a.g();
    }

    public final void h(@m0 v<? super R> vVar) {
        this.f8231a.h(vVar);
    }

    public final void i(@m0 v<? super R> vVar, long j10, @m0 TimeUnit timeUnit) {
        this.f8231a.i(vVar, j10, timeUnit);
    }

    @m0
    public final <S extends u> y<S> j(@m0 x<? super R, ? extends S> xVar) {
        return this.f8231a.j(xVar);
    }

    @m0
    public final R k() {
        if (this.f8231a.m()) {
            return this.f8231a.e(0, TimeUnit.MILLISECONDS);
        }
        throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
    }

    public final boolean l() {
        return this.f8231a.m();
    }
}

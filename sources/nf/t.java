package nf;

import fh.g;
import fh.h;
import xe.l0;
import xe.w;
import zd.h1;

@h1(version = "1.3")
@l
public final class t<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f21258a;

    /* renamed from: b  reason: collision with root package name */
    public final long f21259b;

    public t(T t10, long j10) {
        this.f21258a = t10;
        this.f21259b = j10;
    }

    public /* synthetic */ t(Object obj, long j10, w wVar) {
        this(obj, j10);
    }

    public static /* synthetic */ t d(t tVar, T t10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            t10 = tVar.f21258a;
        }
        if ((i10 & 2) != 0) {
            j10 = tVar.f21259b;
        }
        return tVar.c(t10, j10);
    }

    public final T a() {
        return this.f21258a;
    }

    public final long b() {
        return this.f21259b;
    }

    @g
    public final t<T> c(T t10, long j10) {
        return new t<>(t10, j10, (w) null);
    }

    public final long e() {
        return this.f21259b;
    }

    public boolean equals(@h Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return l0.g(this.f21258a, tVar.f21258a) && e.r(this.f21259b, tVar.f21259b);
    }

    public final T f() {
        return this.f21258a;
    }

    public int hashCode() {
        T t10 = this.f21258a;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + e.Z(this.f21259b);
    }

    @g
    public String toString() {
        return "TimedValue(value=" + this.f21258a + ", duration=" + e.u0(this.f21259b) + ')';
    }
}

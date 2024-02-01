package be;

import fh.g;
import fh.h;
import xe.l0;

public final class p0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f16230a;

    /* renamed from: b  reason: collision with root package name */
    public final T f16231b;

    public p0(int i10, T t10) {
        this.f16230a = i10;
        this.f16231b = t10;
    }

    public static /* synthetic */ p0 d(p0 p0Var, int i10, T t10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = p0Var.f16230a;
        }
        if ((i11 & 2) != 0) {
            t10 = p0Var.f16231b;
        }
        return p0Var.c(i10, t10);
    }

    public final int a() {
        return this.f16230a;
    }

    public final T b() {
        return this.f16231b;
    }

    @g
    public final p0<T> c(int i10, T t10) {
        return new p0<>(i10, t10);
    }

    public final int e() {
        return this.f16230a;
    }

    public boolean equals(@h Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f16230a == p0Var.f16230a && l0.g(this.f16231b, p0Var.f16231b);
    }

    public final T f() {
        return this.f16231b;
    }

    public int hashCode() {
        int i10 = this.f16230a * 31;
        T t10 = this.f16231b;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    @g
    public String toString() {
        return "IndexedValue(index=" + this.f16230a + ", value=" + this.f16231b + ')';
    }
}

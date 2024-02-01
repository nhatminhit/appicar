package rh;

import java.util.Objects;
import javax.annotation.Nullable;
import og.b0;
import og.h0;
import og.j0;
import og.l0;
import og.m0;
import rh.n;

public final class u<T> {

    /* renamed from: a  reason: collision with root package name */
    public final l0 f22734a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final T f22735b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final m0 f22736c;

    public u(l0 l0Var, @Nullable T t10, @Nullable m0 m0Var) {
        this.f22734a = l0Var;
        this.f22735b = t10;
        this.f22736c = m0Var;
    }

    public static <T> u<T> c(int i10, m0 m0Var) {
        Objects.requireNonNull(m0Var, "body == null");
        if (i10 >= 400) {
            return d(m0Var, new l0.a().b(new n.c(m0Var.l(), m0Var.k())).g(i10).l("Response.error()").o(h0.HTTP_1_1).r(new j0.a().q("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 400: " + i10);
    }

    public static <T> u<T> d(m0 m0Var, l0 l0Var) {
        Objects.requireNonNull(m0Var, "body == null");
        Objects.requireNonNull(l0Var, "rawResponse == null");
        if (!l0Var.w()) {
            return new u<>(l0Var, (Object) null, m0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> u<T> j(int i10, @Nullable T t10) {
        if (i10 >= 200 && i10 < 300) {
            return m(t10, new l0.a().g(i10).l("Response.success()").o(h0.HTTP_1_1).r(new j0.a().q("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i10);
    }

    public static <T> u<T> k(@Nullable T t10) {
        return m(t10, new l0.a().g(200).l("OK").o(h0.HTTP_1_1).r(new j0.a().q("http://localhost/").b()).c());
    }

    public static <T> u<T> l(@Nullable T t10, b0 b0Var) {
        Objects.requireNonNull(b0Var, "headers == null");
        return m(t10, new l0.a().g(200).l("OK").o(h0.HTTP_1_1).j(b0Var).r(new j0.a().q("http://localhost/").b()).c());
    }

    public static <T> u<T> m(@Nullable T t10, l0 l0Var) {
        Objects.requireNonNull(l0Var, "rawResponse == null");
        if (l0Var.w()) {
            return new u<>(l0Var, t10, (m0) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    public T a() {
        return this.f22735b;
    }

    public int b() {
        return this.f22734a.i();
    }

    @Nullable
    public m0 e() {
        return this.f22736c;
    }

    public b0 f() {
        return this.f22734a.q();
    }

    public boolean g() {
        return this.f22734a.w();
    }

    public String h() {
        return this.f22734a.A();
    }

    public l0 i() {
        return this.f22734a;
    }

    public String toString() {
        return this.f22734a.toString();
    }
}

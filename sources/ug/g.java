package ug;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import og.d0;
import og.j0;
import og.l0;
import og.m;
import pg.e;
import tg.c;
import tg.k;

public final class g implements d0.a {

    /* renamed from: a  reason: collision with root package name */
    public final List<d0> f23380a;

    /* renamed from: b  reason: collision with root package name */
    public final k f23381b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final c f23382c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23383d;

    /* renamed from: e  reason: collision with root package name */
    public final j0 f23384e;

    /* renamed from: f  reason: collision with root package name */
    public final og.g f23385f;

    /* renamed from: g  reason: collision with root package name */
    public final int f23386g;

    /* renamed from: h  reason: collision with root package name */
    public final int f23387h;

    /* renamed from: i  reason: collision with root package name */
    public final int f23388i;

    /* renamed from: j  reason: collision with root package name */
    public int f23389j;

    public g(List<d0> list, k kVar, @Nullable c cVar, int i10, j0 j0Var, og.g gVar, int i11, int i12, int i13) {
        this.f23380a = list;
        this.f23381b = kVar;
        this.f23382c = cVar;
        this.f23383d = i10;
        this.f23384e = j0Var;
        this.f23385f = gVar;
        this.f23386g = i11;
        this.f23387h = i12;
        this.f23388i = i13;
    }

    @Nullable
    public m a() {
        c cVar = this.f23382c;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public d0.a b(int i10, TimeUnit timeUnit) {
        return new g(this.f23380a, this.f23381b, this.f23382c, this.f23383d, this.f23384e, this.f23385f, this.f23386g, this.f23387h, e.e("timeout", (long) i10, timeUnit));
    }

    public j0 c() {
        return this.f23384e;
    }

    public og.g call() {
        return this.f23385f;
    }

    public int d() {
        return this.f23387h;
    }

    public int e() {
        return this.f23388i;
    }

    public d0.a f(int i10, TimeUnit timeUnit) {
        return new g(this.f23380a, this.f23381b, this.f23382c, this.f23383d, this.f23384e, this.f23385f, e.e("timeout", (long) i10, timeUnit), this.f23387h, this.f23388i);
    }

    public d0.a g(int i10, TimeUnit timeUnit) {
        return new g(this.f23380a, this.f23381b, this.f23382c, this.f23383d, this.f23384e, this.f23385f, this.f23386g, e.e("timeout", (long) i10, timeUnit), this.f23388i);
    }

    public l0 h(j0 j0Var) throws IOException {
        return k(j0Var, this.f23381b, this.f23382c);
    }

    public int i() {
        return this.f23386g;
    }

    public c j() {
        c cVar = this.f23382c;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    public l0 k(j0 j0Var, k kVar, @Nullable c cVar) throws IOException {
        if (this.f23383d < this.f23380a.size()) {
            this.f23389j++;
            c cVar2 = this.f23382c;
            if (cVar2 != null && !cVar2.c().w(j0Var.k())) {
                throw new IllegalStateException("network interceptor " + this.f23380a.get(this.f23383d - 1) + " must retain the same host and port");
            } else if (this.f23382c == null || this.f23389j <= 1) {
                g gVar = new g(this.f23380a, kVar, cVar, this.f23383d + 1, j0Var, this.f23385f, this.f23386g, this.f23387h, this.f23388i);
                d0 d0Var = this.f23380a.get(this.f23383d);
                l0 a10 = d0Var.a(gVar);
                if (cVar != null && this.f23383d + 1 < this.f23380a.size() && gVar.f23389j != 1) {
                    throw new IllegalStateException("network interceptor " + d0Var + " must call proceed() exactly once");
                } else if (a10 == null) {
                    throw new NullPointerException("interceptor " + d0Var + " returned null");
                } else if (a10.c() != null) {
                    return a10;
                } else {
                    throw new IllegalStateException("interceptor " + d0Var + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.f23380a.get(this.f23383d - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    public k l() {
        return this.f23381b;
    }
}

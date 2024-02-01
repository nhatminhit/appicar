package t7;

import android.net.Uri;
import d.o0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import t7.h0;
import w7.q0;

public final class j0<T> implements h0.e {

    /* renamed from: a  reason: collision with root package name */
    public final o f13100a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13101b;

    /* renamed from: c  reason: collision with root package name */
    public final p0 f13102c;

    /* renamed from: d  reason: collision with root package name */
    public final a<? extends T> f13103d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public volatile T f13104e;

    public interface a<T> {
        T a(Uri uri, InputStream inputStream) throws IOException;
    }

    public j0(l lVar, Uri uri, int i10, a<? extends T> aVar) {
        this(lVar, new o(uri, 1), i10, aVar);
    }

    public j0(l lVar, o oVar, int i10, a<? extends T> aVar) {
        this.f13102c = new p0(lVar);
        this.f13100a = oVar;
        this.f13101b = i10;
        this.f13103d = aVar;
    }

    public static <T> T g(l lVar, a<? extends T> aVar, Uri uri, int i10) throws IOException {
        j0 j0Var = new j0(lVar, uri, i10, aVar);
        j0Var.b();
        return w7.a.g(j0Var.e());
    }

    public static <T> T h(l lVar, a<? extends T> aVar, o oVar, int i10) throws IOException {
        j0 j0Var = new j0(lVar, oVar, i10, aVar);
        j0Var.b();
        return w7.a.g(j0Var.e());
    }

    public long a() {
        return this.f13102c.h();
    }

    public final void b() throws IOException {
        this.f13102c.k();
        n nVar = new n(this.f13102c, this.f13100a);
        try {
            nVar.g();
            this.f13104e = this.f13103d.a((Uri) w7.a.g(this.f13102c.g()), nVar);
        } finally {
            q0.q(nVar);
        }
    }

    public final void c() {
    }

    public Map<String, List<String>> d() {
        return this.f13102c.j();
    }

    @o0
    public final T e() {
        return this.f13104e;
    }

    public Uri f() {
        return this.f13102c.i();
    }
}

package e4;

import d.m0;
import d4.g;
import d4.n;
import d4.o;
import d4.r;
import java.io.InputStream;
import java.net.URL;

public class i implements n<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final n<g, InputStream> f6825a;

    public static class a implements o<URL, InputStream> {
        @m0
        public n<URL, InputStream> a(r rVar) {
            return new i(rVar.d(g.class, InputStream.class));
        }

        public void b() {
        }
    }

    public i(n<g, InputStream> nVar) {
        this.f6825a = nVar;
    }

    /* renamed from: c */
    public n.a<InputStream> b(@m0 URL url, int i10, int i11, @m0 v3.i iVar) {
        return this.f6825a.b(new g(url), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean a(@m0 URL url) {
        return true;
    }
}

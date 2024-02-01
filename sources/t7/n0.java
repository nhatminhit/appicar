package t7;

import android.net.Uri;
import d.o0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import t7.l;

public final class n0 implements l {

    /* renamed from: b  reason: collision with root package name */
    public final l f13118b;

    /* renamed from: c  reason: collision with root package name */
    public final b f13119c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13120d;

    public static final class a implements l.a {

        /* renamed from: a  reason: collision with root package name */
        public final l.a f13121a;

        /* renamed from: b  reason: collision with root package name */
        public final b f13122b;

        public a(l.a aVar, b bVar) {
            this.f13121a = aVar;
            this.f13122b = bVar;
        }

        public l a() {
            return new n0(this.f13121a.a(), this.f13122b);
        }
    }

    public interface b {
        Uri a(Uri uri);

        o b(o oVar) throws IOException;
    }

    public n0(l lVar, b bVar) {
        this.f13118b = lVar;
        this.f13119c = bVar;
    }

    public long a(o oVar) throws IOException {
        o b10 = this.f13119c.b(oVar);
        this.f13120d = true;
        return this.f13118b.a(b10);
    }

    public Map<String, List<String>> b() {
        return this.f13118b.b();
    }

    public void close() throws IOException {
        if (this.f13120d) {
            this.f13120d = false;
            this.f13118b.close();
        }
    }

    public void d(r0 r0Var) {
        this.f13118b.d(r0Var);
    }

    @o0
    public Uri g() {
        Uri g10 = this.f13118b.g();
        if (g10 == null) {
            return null;
        }
        return this.f13119c.a(g10);
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f13118b.read(bArr, i10, i11);
    }
}

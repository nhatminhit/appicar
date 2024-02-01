package t7;

import android.net.Uri;
import d.o0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import w7.a;
import w7.z;

public final class k0 implements l {

    /* renamed from: b  reason: collision with root package name */
    public final l f13105b;

    /* renamed from: c  reason: collision with root package name */
    public final z f13106c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13107d;

    public k0(l lVar, z zVar, int i10) {
        this.f13105b = (l) a.g(lVar);
        this.f13106c = (z) a.g(zVar);
        this.f13107d = i10;
    }

    public long a(o oVar) throws IOException {
        this.f13106c.d(this.f13107d);
        return this.f13105b.a(oVar);
    }

    public Map<String, List<String>> b() {
        return this.f13105b.b();
    }

    public void close() throws IOException {
        this.f13105b.close();
    }

    public void d(r0 r0Var) {
        this.f13105b.d(r0Var);
    }

    @o0
    public Uri g() {
        return this.f13105b.g();
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f13106c.d(this.f13107d);
        return this.f13105b.read(bArr, i10, i11);
    }
}

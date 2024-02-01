package t7;

import android.net.Uri;
import d.o0;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import w7.a;

public final class p0 implements l {

    /* renamed from: b  reason: collision with root package name */
    public final l f13148b;

    /* renamed from: c  reason: collision with root package name */
    public long f13149c;

    /* renamed from: d  reason: collision with root package name */
    public Uri f13150d = Uri.EMPTY;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, List<String>> f13151e = Collections.emptyMap();

    public p0(l lVar) {
        this.f13148b = (l) a.g(lVar);
    }

    public long a(o oVar) throws IOException {
        this.f13150d = oVar.f13130a;
        this.f13151e = Collections.emptyMap();
        long a10 = this.f13148b.a(oVar);
        this.f13150d = (Uri) a.g(g());
        this.f13151e = b();
        return a10;
    }

    public Map<String, List<String>> b() {
        return this.f13148b.b();
    }

    public void close() throws IOException {
        this.f13148b.close();
    }

    public void d(r0 r0Var) {
        this.f13148b.d(r0Var);
    }

    @o0
    public Uri g() {
        return this.f13148b.g();
    }

    public long h() {
        return this.f13149c;
    }

    public Uri i() {
        return this.f13150d;
    }

    public Map<String, List<String>> j() {
        return this.f13151e;
    }

    public void k() {
        this.f13149c = 0;
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.f13148b.read(bArr, i10, i11);
        if (read != -1) {
            this.f13149c += (long) read;
        }
        return read;
    }
}

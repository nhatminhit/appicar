package t7;

import android.net.Uri;
import d.o0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import w7.a;

public final class q0 implements l {

    /* renamed from: b  reason: collision with root package name */
    public final l f13155b;

    /* renamed from: c  reason: collision with root package name */
    public final j f13156c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13157d;

    /* renamed from: e  reason: collision with root package name */
    public long f13158e;

    public q0(l lVar, j jVar) {
        this.f13155b = (l) a.g(lVar);
        this.f13156c = (j) a.g(jVar);
    }

    public long a(o oVar) throws IOException {
        long a10 = this.f13155b.a(oVar);
        this.f13158e = a10;
        if (a10 == 0) {
            return 0;
        }
        if (oVar.f13136g == -1 && a10 != -1) {
            oVar = oVar.e(0, a10);
        }
        this.f13157d = true;
        this.f13156c.a(oVar);
        return this.f13158e;
    }

    public Map<String, List<String>> b() {
        return this.f13155b.b();
    }

    public void close() throws IOException {
        try {
            this.f13155b.close();
        } finally {
            if (this.f13157d) {
                this.f13157d = false;
                this.f13156c.close();
            }
        }
    }

    public void d(r0 r0Var) {
        this.f13155b.d(r0Var);
    }

    @o0
    public Uri g() {
        return this.f13155b.g();
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f13158e == 0) {
            return -1;
        }
        int read = this.f13155b.read(bArr, i10, i11);
        if (read > 0) {
            this.f13156c.write(bArr, i10, read);
            long j10 = this.f13158e;
            if (j10 != -1) {
                this.f13158e = j10 - ((long) read);
            }
        }
        return read;
    }
}

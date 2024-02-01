package v7;

import android.net.Uri;
import d.o0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import t7.l;
import t7.o;
import t7.r0;

public final class b implements l {

    /* renamed from: b  reason: collision with root package name */
    public final l f14205b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f14206c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public c f14207d;

    public b(byte[] bArr, l lVar) {
        this.f14205b = lVar;
        this.f14206c = bArr;
    }

    public long a(o oVar) throws IOException {
        long a10 = this.f14205b.a(oVar);
        this.f14207d = new c(2, this.f14206c, d.a(oVar.f13137h), oVar.f13134e);
        return a10;
    }

    public Map<String, List<String>> b() {
        return this.f14205b.b();
    }

    public void close() throws IOException {
        this.f14207d = null;
        this.f14205b.close();
    }

    public void d(r0 r0Var) {
        this.f14205b.d(r0Var);
    }

    @o0
    public Uri g() {
        return this.f14205b.g();
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        int read = this.f14205b.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f14207d.d(bArr, i10, read);
        return read;
    }
}

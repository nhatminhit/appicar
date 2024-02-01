package b7;

import android.net.Uri;
import d.o0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import t7.l;
import t7.o;
import t7.r0;
import w7.w;

public final class t implements l {

    /* renamed from: b  reason: collision with root package name */
    public final l f4695b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4696c;

    /* renamed from: d  reason: collision with root package name */
    public final a f4697d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f4698e;

    /* renamed from: f  reason: collision with root package name */
    public int f4699f;

    public interface a {
        void a(w wVar);
    }

    public t(l lVar, int i10, a aVar) {
        w7.a.a(i10 > 0);
        this.f4695b = lVar;
        this.f4696c = i10;
        this.f4697d = aVar;
        this.f4698e = new byte[1];
        this.f4699f = i10;
    }

    public long a(o oVar) throws IOException {
        throw new UnsupportedOperationException();
    }

    public Map<String, List<String>> b() {
        return this.f4695b.b();
    }

    public void close() throws IOException {
        throw new UnsupportedOperationException();
    }

    public void d(r0 r0Var) {
        this.f4695b.d(r0Var);
    }

    @o0
    public Uri g() {
        return this.f4695b.g();
    }

    public final boolean h() throws IOException {
        if (this.f4695b.read(this.f4698e, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f4698e[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int read = this.f4695b.read(bArr, i12, i11);
            if (read == -1) {
                return false;
            }
            i12 += read;
            i11 -= read;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f4697d.a(new w(bArr, i10));
        }
        return true;
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f4699f == 0) {
            if (!h()) {
                return -1;
            }
            this.f4699f = this.f4696c;
        }
        int read = this.f4695b.read(bArr, i10, Math.min(this.f4699f, i11));
        if (read != -1) {
            this.f4699f -= read;
        }
        return read;
    }
}

package b5;

import c5.d;
import c5.h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import w4.f;
import w4.l;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f4138a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f4139b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4140c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4141d;

    /* renamed from: e  reason: collision with root package name */
    public final f f4142e;

    /* renamed from: f  reason: collision with root package name */
    public final d f4143f;

    public b(InputStream inputStream, byte[] bArr, int i10, int i11, f fVar, d dVar) {
        this.f4138a = inputStream;
        this.f4139b = bArr;
        this.f4140c = i10;
        this.f4141d = i11;
        this.f4142e = fVar;
        this.f4143f = dVar;
        if ((i10 | i11) < 0 || i10 + i11 > bArr.length) {
            throw new IllegalArgumentException(String.format("Illegal start/length (%d/%d) wrt input array of %d bytes", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr.length)}));
        }
    }

    public l a() throws IOException {
        f fVar = this.f4142e;
        if (fVar == null) {
            return null;
        }
        return this.f4138a == null ? fVar.t(this.f4139b, this.f4140c, this.f4141d) : fVar.o(b());
    }

    public InputStream b() {
        return this.f4138a == null ? new ByteArrayInputStream(this.f4139b, this.f4140c, this.f4141d) : new h((d) null, this.f4138a, this.f4139b, this.f4140c, this.f4141d);
    }

    public f c() {
        return this.f4142e;
    }

    public d d() {
        d dVar = this.f4143f;
        return dVar == null ? d.INCONCLUSIVE : dVar;
    }

    public String e() {
        if (f()) {
            return c().x();
        }
        return null;
    }

    public boolean f() {
        return this.f4142e != null;
    }
}

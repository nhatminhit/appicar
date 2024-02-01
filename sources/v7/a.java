package v7;

import java.io.IOException;
import t7.j;
import t7.o;

public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public final j f14201a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f14202b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f14203c;

    /* renamed from: d  reason: collision with root package name */
    public c f14204d;

    public a(byte[] bArr, j jVar) {
        this(bArr, jVar, (byte[]) null);
    }

    public a(byte[] bArr, j jVar, byte[] bArr2) {
        this.f14201a = jVar;
        this.f14202b = bArr;
        this.f14203c = bArr2;
    }

    public void a(o oVar) throws IOException {
        this.f14201a.a(oVar);
        this.f14204d = new c(1, this.f14202b, d.a(oVar.f13137h), oVar.f13134e);
    }

    public void close() throws IOException {
        this.f14204d = null;
        this.f14201a.close();
    }

    public void write(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f14203c == null) {
            this.f14204d.d(bArr, i10, i11);
            this.f14201a.write(bArr, i10, i11);
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            int min = Math.min(i11 - i12, this.f14203c.length);
            this.f14204d.c(bArr, i10 + i12, min, this.f14203c, 0);
            this.f14201a.write(this.f14203c, 0, min);
            i12 += min;
        }
    }
}

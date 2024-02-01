package t7;

import android.net.Uri;
import d.o0;
import java.io.IOException;
import w7.a;

public final class g extends e {

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f13067f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public Uri f13068g;

    /* renamed from: h  reason: collision with root package name */
    public int f13069h;

    /* renamed from: i  reason: collision with root package name */
    public int f13070i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13071j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(byte[] bArr) {
        super(false);
        boolean z10 = false;
        a.g(bArr);
        a.a(bArr.length > 0 ? true : z10);
        this.f13067f = bArr;
    }

    public long a(o oVar) throws IOException {
        this.f13068g = oVar.f13130a;
        j(oVar);
        long j10 = oVar.f13135f;
        int i10 = (int) j10;
        this.f13069h = i10;
        long j11 = oVar.f13136g;
        if (j11 == -1) {
            j11 = ((long) this.f13067f.length) - j10;
        }
        int i11 = (int) j11;
        this.f13070i = i11;
        if (i11 <= 0 || i10 + i11 > this.f13067f.length) {
            throw new IOException("Unsatisfiable range: [" + this.f13069h + ", " + oVar.f13136g + "], length: " + this.f13067f.length);
        }
        this.f13071j = true;
        k(oVar);
        return (long) this.f13070i;
    }

    public void close() throws IOException {
        if (this.f13071j) {
            this.f13071j = false;
            i();
        }
        this.f13068g = null;
    }

    @o0
    public Uri g() {
        return this.f13068g;
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f13070i;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(this.f13067f, this.f13069h, bArr, i10, min);
        this.f13069h += min;
        this.f13070i -= min;
        h(min);
        return min;
    }
}

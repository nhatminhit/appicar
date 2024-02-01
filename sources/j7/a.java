package j7;

import h7.c;
import java.util.List;
import w7.w;

public final class a extends c {

    /* renamed from: o  reason: collision with root package name */
    public final b f9622o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        w wVar = new w(list.get(0));
        this.f9622o = new b(wVar.J(), wVar.J());
    }

    /* renamed from: C */
    public c z(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f9622o.r();
        }
        return new c(this.f9622o.b(bArr, i10));
    }
}

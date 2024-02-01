package g4;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import d.m0;
import d.o0;
import d.t0;
import java.io.IOException;
import java.io.InputStream;
import t4.a;
import v3.i;
import v3.k;
import y3.v;

@t0(api = 28)
public final class y implements k<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final f f8038a = new f();

    @o0
    /* renamed from: c */
    public v<Bitmap> a(@m0 InputStream inputStream, int i10, int i11, @m0 i iVar) throws IOException {
        return this.f8038a.a(ImageDecoder.createSource(a.b(inputStream)), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean b(@m0 InputStream inputStream, @m0 i iVar) throws IOException {
        return true;
    }
}

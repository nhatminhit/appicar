package g4;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import d.m0;
import d.o0;
import d.t0;
import java.io.IOException;
import java.nio.ByteBuffer;
import v3.i;
import y3.v;

@t0(api = 28)
public final class k implements v3.k<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final f f7937a = new f();

    @o0
    /* renamed from: c */
    public v<Bitmap> a(@m0 ByteBuffer byteBuffer, int i10, int i11, @m0 i iVar) throws IOException {
        return this.f7937a.a(ImageDecoder.createSource(byteBuffer), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean b(@m0 ByteBuffer byteBuffer, @m0 i iVar) throws IOException {
        return true;
    }
}

package g4;

import android.graphics.Bitmap;
import d.m0;
import java.io.IOException;
import java.nio.ByteBuffer;
import t4.a;
import v3.i;
import v3.k;
import y3.v;

public class j implements k<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final q f7936a;

    public j(q qVar) {
        this.f7936a = qVar;
    }

    /* renamed from: c */
    public v<Bitmap> a(@m0 ByteBuffer byteBuffer, int i10, int i11, @m0 i iVar) throws IOException {
        return this.f7936a.f(a.f(byteBuffer), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean b(@m0 ByteBuffer byteBuffer, @m0 i iVar) {
        return this.f7936a.q(byteBuffer);
    }
}

package l4;

import android.graphics.Bitmap;
import d.m0;
import d.o0;
import h4.b;
import java.io.ByteArrayOutputStream;
import v3.i;
import y3.v;

public class a implements e<Bitmap, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap.CompressFormat f10114a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10115b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public a(@m0 Bitmap.CompressFormat compressFormat, int i10) {
        this.f10114a = compressFormat;
        this.f10115b = i10;
    }

    @o0
    public v<byte[]> a(@m0 v<Bitmap> vVar, @m0 i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.f10114a, this.f10115b, byteArrayOutputStream);
        vVar.a();
        return new b(byteArrayOutputStream.toByteArray());
    }
}

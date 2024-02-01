package g4;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import d.t0;
import f4.a;
import java.io.IOException;
import y3.v;
import z3.e;

@t0(api = 28)
public final class f extends a<Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final String f7917d = "BitmapImageDecoder";

    /* renamed from: c  reason: collision with root package name */
    public final e f7918c = new z3.f();

    public v<Bitmap> c(ImageDecoder.Source source, int i10, int i11, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable(f7917d, 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Decoded [");
            sb2.append(decodeBitmap.getWidth());
            sb2.append("x");
            sb2.append(decodeBitmap.getHeight());
            sb2.append("] for [");
            sb2.append(i10);
            sb2.append("x");
            sb2.append(i11);
            sb2.append("]");
        }
        return new g(decodeBitmap, this.f7918c);
    }
}

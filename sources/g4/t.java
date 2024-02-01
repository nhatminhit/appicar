package g4;

import com.bumptech.glide.load.ImageHeaderParser;
import d.m0;
import d.t0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import t4.a;
import z3.b;

@t0(27)
public final class t implements ImageHeaderParser {
    @m0
    public ImageHeaderParser.ImageType a(@m0 ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @m0
    public ImageHeaderParser.ImageType b(@m0 InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public int c(@m0 ByteBuffer byteBuffer, @m0 b bVar) throws IOException {
        return d(a.f(byteBuffer), bVar);
    }

    public int d(@m0 InputStream inputStream, @m0 b bVar) throws IOException {
        int l10 = new w1.a(inputStream).l(w1.a.f14555y, 1);
        if (l10 == 0) {
            return -1;
        }
        return l10;
    }
}

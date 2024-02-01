package n5;

import i5.g;
import java.io.IOException;
import java.nio.ByteBuffer;
import w4.l;

public class e extends e0<ByteBuffer> {
    public static final long U = 1;

    public e() {
        super((Class<?>) ByteBuffer.class);
    }

    /* renamed from: E0 */
    public ByteBuffer f(l lVar, g gVar) throws IOException {
        return ByteBuffer.wrap(lVar.k0());
    }

    /* renamed from: F0 */
    public ByteBuffer g(l lVar, g gVar, ByteBuffer byteBuffer) throws IOException {
        a6.g gVar2 = new a6.g(byteBuffer);
        lVar.J2(gVar.S(), gVar2);
        gVar2.close();
        return byteBuffer;
    }
}

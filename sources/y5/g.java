package y5;

import a6.f;
import i5.e0;
import i5.j;
import i5.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import s5.b;
import s5.d;
import w4.i;

public class g extends l0<ByteBuffer> {
    public g() {
        super(ByteBuffer.class);
    }

    /* renamed from: M */
    public void m(ByteBuffer byteBuffer, i iVar, e0 e0Var) throws IOException {
        if (byteBuffer.hasArray()) {
            int position = byteBuffer.position();
            iVar.a2(byteBuffer.array(), byteBuffer.arrayOffset() + position, byteBuffer.limit() - position);
            return;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (asReadOnlyBuffer.position() > 0) {
            asReadOnlyBuffer.rewind();
        }
        f fVar = new f(asReadOnlyBuffer);
        iVar.W1(fVar, asReadOnlyBuffer.remaining());
        fVar.close();
    }

    public void e(s5.g gVar, j jVar) throws l {
        b m10 = gVar.m(jVar);
        if (m10 != null) {
            m10.i(d.INTEGER);
        }
    }
}

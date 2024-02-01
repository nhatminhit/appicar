package qh;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import qh.c;

public class b extends c.a {
    public b(f fVar, c.b bVar, long j10, int i10) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(bVar.f22383a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = j10 + ((long) (i10 * 16));
        this.f22378a = fVar.l(allocate, j11);
        this.f22379b = fVar.l(allocate, j11 + 8);
    }
}

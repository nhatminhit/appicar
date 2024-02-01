package qh;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import qh.c;

public class a extends c.a {
    public a(f fVar, c.b bVar, long j10, int i10) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(bVar.f22383a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = j10 + ((long) (i10 * 8));
        this.f22378a = fVar.o(allocate, j11);
        this.f22379b = fVar.o(allocate, j11 + 4);
    }
}

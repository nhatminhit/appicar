package qh;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import qh.c;

public class h extends c.C0394c {
    public h(f fVar, c.b bVar, long j10) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(bVar.f22383a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = bVar.f22385c + (j10 * ((long) bVar.f22387e));
        this.f22394a = fVar.o(allocate, j11);
        this.f22395b = fVar.l(allocate, 8 + j11);
        this.f22396c = fVar.l(allocate, 16 + j11);
        this.f22397d = fVar.l(allocate, j11 + 40);
    }
}

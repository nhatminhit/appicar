package qh;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import qh.c;

public class j extends c.d {
    public j(f fVar, c.b bVar, int i10) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(bVar.f22383a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f22398a = fVar.o(allocate, bVar.f22386d + ((long) (i10 * bVar.f22389g)) + 44);
    }
}

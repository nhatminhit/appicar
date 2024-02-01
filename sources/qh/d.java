package qh;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import qh.c;

public class d extends c.b {

    /* renamed from: m  reason: collision with root package name */
    public final f f22399m;

    public d(boolean z10, f fVar) throws IOException {
        this.f22383a = z10;
        this.f22399m = fVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f22384b = fVar.k(allocate, 16);
        this.f22385c = fVar.o(allocate, 28);
        this.f22386d = fVar.o(allocate, 32);
        this.f22387e = fVar.k(allocate, 42);
        this.f22388f = fVar.k(allocate, 44);
        this.f22389g = fVar.k(allocate, 46);
        this.f22390h = fVar.k(allocate, 48);
        this.f22391i = fVar.k(allocate, 50);
    }

    public c.a a(long j10, int i10) throws IOException {
        return new a(this.f22399m, this, j10, i10);
    }

    public c.C0394c b(long j10) throws IOException {
        return new g(this.f22399m, this, j10);
    }

    public c.d c(int i10) throws IOException {
        return new i(this.f22399m, this, i10);
    }
}

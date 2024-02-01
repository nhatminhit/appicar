package qh;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import qh.c;

public class e extends c.b {

    /* renamed from: m  reason: collision with root package name */
    public final f f22400m;

    public e(boolean z10, f fVar) throws IOException {
        this.f22383a = z10;
        this.f22400m = fVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f22384b = fVar.k(allocate, 16);
        this.f22385c = fVar.l(allocate, 32);
        this.f22386d = fVar.l(allocate, 40);
        this.f22387e = fVar.k(allocate, 54);
        this.f22388f = fVar.k(allocate, 56);
        this.f22389g = fVar.k(allocate, 58);
        this.f22390h = fVar.k(allocate, 60);
        this.f22391i = fVar.k(allocate, 62);
    }

    public c.a a(long j10, int i10) throws IOException {
        return new b(this.f22400m, this, j10, i10);
    }

    public c.C0394c b(long j10) throws IOException {
        return new h(this.f22400m, this, j10);
    }

    public c.d c(int i10) throws IOException {
        return new j(this.f22400m, this, i10);
    }
}

package u2;

import a3.c;
import a3.d;
import d.m0;
import d.o0;
import d.t0;
import java.util.concurrent.Executor;
import u2.n2;

public final class x1 implements d, p0 {
    public final d O;
    public final n2.f P;
    public final Executor Q;

    public x1(@m0 d dVar, @m0 n2.f fVar, @m0 Executor executor) {
        this.O = dVar;
        this.P = fVar;
        this.Q = executor;
    }

    public void close() {
        this.O.close();
    }

    @o0
    public String getDatabaseName() {
        return this.O.getDatabaseName();
    }

    public c getReadableDatabase() {
        return new w1(this.O.getReadableDatabase(), this.P, this.Q);
    }

    public c getWritableDatabase() {
        return new w1(this.O.getWritableDatabase(), this.P, this.Q);
    }

    @m0
    public d i() {
        return this.O;
    }

    @t0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.O.setWriteAheadLoggingEnabled(z10);
    }
}

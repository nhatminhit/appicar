package ch;

import java.io.IOException;

public final class r implements a0 {
    public final e O;
    public final c P;
    public w Q;
    public int R;
    public boolean S;
    public long T;

    public r(e eVar) {
        this.O = eVar;
        c j10 = eVar.j();
        this.P = j10;
        w wVar = j10.O;
        this.Q = wVar;
        this.R = wVar != null ? wVar.f16530b : -1;
    }

    public long C0(c cVar, long j10) throws IOException {
        w wVar;
        w wVar2;
        if (!this.S) {
            w wVar3 = this.Q;
            if (wVar3 == null || (wVar3 == (wVar2 = this.P.O) && this.R == wVar2.f16530b)) {
                this.O.U0(this.T + j10);
                if (this.Q == null && (wVar = this.P.O) != null) {
                    this.Q = wVar;
                    this.R = wVar.f16530b;
                }
                long min = Math.min(j10, this.P.P - this.T);
                if (min <= 0) {
                    return -1;
                }
                this.P.m(cVar, this.T, min);
                this.T += min;
                return min;
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        throw new IllegalStateException("closed");
    }

    public b0 b() {
        return this.O.b();
    }

    public void close() throws IOException {
        this.S = true;
    }
}

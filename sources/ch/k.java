package ch;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

public final class k implements z {
    public final d O;
    public final Deflater P;
    public final g Q;
    public boolean R;
    public final CRC32 S = new CRC32();

    public k(z zVar) {
        if (zVar != null) {
            Deflater deflater = new Deflater(-1, true);
            this.P = deflater;
            d c10 = p.c(zVar);
            this.O = c10;
            this.Q = new g(c10, deflater);
            h();
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public b0 b() {
        return this.O.b();
    }

    public final Deflater c() {
        return this.P;
    }

    public void close() throws IOException {
        if (!this.R) {
            Throwable th2 = null;
            try {
                this.Q.f();
                g();
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                this.P.end();
            } catch (Throwable th4) {
                if (th2 == null) {
                    th2 = th4;
                }
            }
            try {
                this.O.close();
            } catch (Throwable th5) {
                if (th2 == null) {
                    th2 = th5;
                }
            }
            this.R = true;
            if (th2 != null) {
                d0.f(th2);
            }
        }
    }

    public void d1(c cVar, long j10) throws IOException {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        } else if (i10 != 0) {
            f(cVar, j10);
            this.Q.d1(cVar, j10);
        }
    }

    public final void f(c cVar, long j10) {
        w wVar = cVar.O;
        while (j10 > 0) {
            int min = (int) Math.min(j10, (long) (wVar.f16531c - wVar.f16530b));
            this.S.update(wVar.f16529a, wVar.f16530b, min);
            j10 -= (long) min;
            wVar = wVar.f16534f;
        }
    }

    public void flush() throws IOException {
        this.Q.flush();
    }

    public final void g() throws IOException {
        this.O.W((int) this.S.getValue());
        this.O.W((int) this.P.getBytesRead());
    }

    public final void h() {
        c j10 = this.O.j();
        j10.writeShort(8075);
        j10.writeByte(8);
        j10.writeByte(0);
        j10.writeInt(0);
        j10.writeByte(0);
        j10.writeByte(0);
    }
}

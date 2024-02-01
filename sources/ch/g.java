package ch;

import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public final class g implements z {
    public final d O;
    public final Deflater P;
    public boolean Q;

    public g(d dVar, Deflater deflater) {
        if (dVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater != null) {
            this.O = dVar;
            this.P = deflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public g(z zVar, Deflater deflater) {
        this(p.c(zVar), deflater);
    }

    public b0 b() {
        return this.O.b();
    }

    @IgnoreJRERequirement
    public final void c(boolean z10) throws IOException {
        w F1;
        c j10 = this.O.j();
        while (true) {
            F1 = j10.F1(1);
            Deflater deflater = this.P;
            byte[] bArr = F1.f16529a;
            int i10 = F1.f16531c;
            int i11 = 8192 - i10;
            int deflate = z10 ? deflater.deflate(bArr, i10, i11, 2) : deflater.deflate(bArr, i10, i11);
            if (deflate > 0) {
                F1.f16531c += deflate;
                j10.P += (long) deflate;
                this.O.i0();
            } else if (this.P.needsInput()) {
                break;
            }
        }
        if (F1.f16530b == F1.f16531c) {
            j10.O = F1.b();
            x.a(F1);
        }
    }

    public void close() throws IOException {
        if (!this.Q) {
            Throwable th2 = null;
            try {
                f();
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
            this.Q = true;
            if (th2 != null) {
                d0.f(th2);
            }
        }
    }

    public void d1(c cVar, long j10) throws IOException {
        d0.b(cVar.P, 0, j10);
        while (j10 > 0) {
            w wVar = cVar.O;
            int min = (int) Math.min(j10, (long) (wVar.f16531c - wVar.f16530b));
            this.P.setInput(wVar.f16529a, wVar.f16530b, min);
            c(false);
            long j11 = (long) min;
            cVar.P -= j11;
            int i10 = wVar.f16530b + min;
            wVar.f16530b = i10;
            if (i10 == wVar.f16531c) {
                cVar.O = wVar.b();
                x.a(wVar);
            }
            j10 -= j11;
        }
    }

    public void f() throws IOException {
        this.P.finish();
        c(false);
    }

    public void flush() throws IOException {
        c(true);
        this.O.flush();
    }

    public String toString() {
        return "DeflaterSink(" + this.O + ")";
    }
}

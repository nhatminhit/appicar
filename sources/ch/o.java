package ch;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class o implements a0 {
    public final e O;
    public final Inflater P;
    public int Q;
    public boolean R;

    public o(a0 a0Var, Inflater inflater) {
        this(p.d(a0Var), inflater);
    }

    public o(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.O = eVar;
            this.P = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public long C0(c cVar, long j10) throws IOException {
        w F1;
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        } else if (this.R) {
            throw new IllegalStateException("closed");
        } else if (i10 == 0) {
            return 0;
        } else {
            while (true) {
                boolean c10 = c();
                try {
                    F1 = cVar.F1(1);
                    int inflate = this.P.inflate(F1.f16529a, F1.f16531c, (int) Math.min(j10, (long) (8192 - F1.f16531c)));
                    if (inflate > 0) {
                        F1.f16531c += inflate;
                        long j11 = (long) inflate;
                        cVar.P += j11;
                        return j11;
                    } else if (this.P.finished()) {
                        break;
                    } else if (this.P.needsDictionary()) {
                        break;
                    } else if (c10) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            }
            f();
            if (F1.f16530b != F1.f16531c) {
                return -1;
            }
            cVar.O = F1.b();
            x.a(F1);
            return -1;
        }
    }

    public b0 b() {
        return this.O.b();
    }

    public final boolean c() throws IOException {
        if (!this.P.needsInput()) {
            return false;
        }
        f();
        if (this.P.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.O.X()) {
            return true;
        } else {
            w wVar = this.O.j().O;
            int i10 = wVar.f16531c;
            int i11 = wVar.f16530b;
            int i12 = i10 - i11;
            this.Q = i12;
            this.P.setInput(wVar.f16529a, i11, i12);
            return false;
        }
    }

    public void close() throws IOException {
        if (!this.R) {
            this.P.end();
            this.R = true;
            this.O.close();
        }
    }

    public final void f() throws IOException {
        int i10 = this.Q;
        if (i10 != 0) {
            int remaining = i10 - this.P.getRemaining();
            this.Q -= remaining;
            this.O.skip((long) remaining);
        }
    }
}

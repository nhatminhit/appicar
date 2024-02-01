package ch;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class l implements a0 {
    public static final byte T = 1;
    public static final byte U = 2;
    public static final byte V = 3;
    public static final byte W = 4;
    public static final byte X = 0;
    public static final byte Y = 1;
    public static final byte Z = 2;

    /* renamed from: a0  reason: collision with root package name */
    public static final byte f16513a0 = 3;
    public int O = 0;
    public final e P;
    public final Inflater Q;
    public final o R;
    public final CRC32 S = new CRC32();

    public l(a0 a0Var) {
        if (a0Var != null) {
            Inflater inflater = new Inflater(true);
            this.Q = inflater;
            e d10 = p.d(a0Var);
            this.P = d10;
            this.R = new o(d10, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public long C0(c cVar, long j10) throws IOException {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        } else if (i10 == 0) {
            return 0;
        } else {
            if (this.O == 0) {
                f();
                this.O = 1;
            }
            if (this.O == 1) {
                long j11 = cVar.P;
                long C0 = this.R.C0(cVar, j10);
                if (C0 != -1) {
                    h(cVar, j11, C0);
                    return C0;
                }
                this.O = 2;
            }
            if (this.O == 2) {
                g();
                this.O = 3;
                if (!this.P.X()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public b0 b() {
        return this.P.b();
    }

    public final void c(String str, int i10, int i11) throws IOException {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}));
        }
    }

    public void close() throws IOException {
        this.R.close();
    }

    public final void f() throws IOException {
        this.P.E1(10);
        byte N = this.P.j().N(3);
        boolean z10 = ((N >> 1) & 1) == 1;
        if (z10) {
            h(this.P.j(), 0, 10);
        }
        c("ID1ID2", 8075, this.P.readShort());
        this.P.skip(8);
        if (((N >> 2) & 1) == 1) {
            this.P.E1(2);
            if (z10) {
                h(this.P.j(), 0, 2);
            }
            long t12 = (long) this.P.j().t1();
            this.P.E1(t12);
            if (z10) {
                h(this.P.j(), 0, t12);
            }
            this.P.skip(t12);
        }
        if (((N >> 3) & 1) == 1) {
            long K1 = this.P.K1((byte) 0);
            if (K1 != -1) {
                if (z10) {
                    h(this.P.j(), 0, K1 + 1);
                }
                this.P.skip(K1 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((N >> 4) & 1) == 1) {
            long K12 = this.P.K1((byte) 0);
            if (K12 != -1) {
                if (z10) {
                    h(this.P.j(), 0, K12 + 1);
                }
                this.P.skip(K12 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z10) {
            c("FHCRC", this.P.t1(), (short) ((int) this.S.getValue()));
            this.S.reset();
        }
    }

    public final void g() throws IOException {
        c("CRC", this.P.e1(), (int) this.S.getValue());
        c("ISIZE", this.P.e1(), (int) this.Q.getBytesWritten());
    }

    public final void h(c cVar, long j10, long j11) {
        w wVar = cVar.O;
        while (true) {
            int i10 = wVar.f16531c;
            int i11 = wVar.f16530b;
            if (j10 < ((long) (i10 - i11))) {
                break;
            }
            j10 -= (long) (i10 - i11);
            wVar = wVar.f16534f;
        }
        while (j11 > 0) {
            int i12 = (int) (((long) wVar.f16530b) + j10);
            int min = (int) Math.min((long) (wVar.f16531c - i12), j11);
            this.S.update(wVar.f16529a, i12, min);
            j11 -= (long) min;
            wVar = wVar.f16534f;
            j10 = 0;
        }
    }
}

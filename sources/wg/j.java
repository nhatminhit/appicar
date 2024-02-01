package wg;

import ch.c;
import ch.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pg.e;
import wg.d;

public final class j implements Closeable {
    public static final Logger U = Logger.getLogger(e.class.getName());
    public final d O;
    public final boolean P;
    public final c Q;
    public int R = 16384;
    public boolean S;
    public final d.b T;

    public j(ch.d dVar, boolean z10) {
        this.O = dVar;
        this.P = z10;
        c cVar = new c();
        this.Q = cVar;
        this.T = new d.b(cVar);
    }

    public static void P(ch.d dVar, int i10) throws IOException {
        dVar.writeByte((i10 >>> 16) & 255);
        dVar.writeByte((i10 >>> 8) & 255);
        dVar.writeByte(i10 & 255);
    }

    public synchronized void A(int i10, long j10) throws IOException {
        if (this.S) {
            throw new IOException("closed");
        } else if (j10 == 0 || j10 > y4.c.M0) {
            throw e.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
        } else {
            i(i10, 4, (byte) 8, (byte) 0);
            this.O.writeInt((int) j10);
            this.O.flush();
        }
    }

    public final void N(int i10, long j10) throws IOException {
        while (j10 > 0) {
            int min = (int) Math.min((long) this.R, j10);
            long j11 = (long) min;
            j10 -= j11;
            i(i10, min, (byte) 9, j10 == 0 ? (byte) 4 : 0);
            this.O.d1(this.Q, j11);
        }
    }

    public synchronized void c(m mVar) throws IOException {
        if (!this.S) {
            this.R = mVar.g(this.R);
            if (mVar.d() != -1) {
                this.T.e(mVar.d());
            }
            i(0, 0, (byte) 4, (byte) 1);
            this.O.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() throws IOException {
        this.S = true;
        this.O.close();
    }

    public synchronized void f() throws IOException {
        if (this.S) {
            throw new IOException("closed");
        } else if (this.P) {
            Logger logger = U;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.r(">> CONNECTION %s", e.f24186a.s()));
            }
            this.O.write(e.f24186a.Z());
            this.O.flush();
        }
    }

    public synchronized void flush() throws IOException {
        if (!this.S) {
            this.O.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void g(boolean z10, int i10, c cVar, int i11) throws IOException {
        if (!this.S) {
            byte b10 = 0;
            if (z10) {
                b10 = (byte) 1;
            }
            h(i10, b10, cVar, i11);
        } else {
            throw new IOException("closed");
        }
    }

    public void h(int i10, byte b10, c cVar, int i11) throws IOException {
        i(i10, i11, (byte) 0, b10);
        if (i11 > 0) {
            this.O.d1(cVar, (long) i11);
        }
    }

    public void i(int i10, int i11, byte b10, byte b11) throws IOException {
        Logger logger = U;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.b(false, i10, i11, b10, b11));
        }
        int i12 = this.R;
        if (i11 > i12) {
            throw e.c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
        } else if ((Integer.MIN_VALUE & i10) == 0) {
            P(this.O, i11);
            this.O.writeByte(b10 & 255);
            this.O.writeByte(b11 & 255);
            this.O.writeInt(i10 & Integer.MAX_VALUE);
        } else {
            throw e.c("reserved bit set: %s", Integer.valueOf(i10));
        }
    }

    public synchronized void k(int i10, b bVar, byte[] bArr) throws IOException {
        if (this.S) {
            throw new IOException("closed");
        } else if (bVar.O != -1) {
            i(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.O.writeInt(i10);
            this.O.writeInt(bVar.O);
            if (bArr.length > 0) {
                this.O.write(bArr);
            }
            this.O.flush();
        } else {
            throw e.c("errorCode.httpCode == -1", new Object[0]);
        }
    }

    public synchronized void l(boolean z10, int i10, List<c> list) throws IOException {
        if (!this.S) {
            this.T.g(list);
            long size = this.Q.size();
            int min = (int) Math.min((long) this.R, size);
            long j10 = (long) min;
            int i11 = (size > j10 ? 1 : (size == j10 ? 0 : -1));
            byte b10 = i11 == 0 ? (byte) 4 : 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            i(i10, min, (byte) 1, b10);
            this.O.d1(this.Q, j10);
            if (i11 > 0) {
                N(i10, size - j10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public int m() {
        return this.R;
    }

    public synchronized void o(boolean z10, int i10, int i11) throws IOException {
        if (!this.S) {
            i(0, 8, (byte) 6, z10 ? (byte) 1 : 0);
            this.O.writeInt(i10);
            this.O.writeInt(i11);
            this.O.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void q(int i10, int i11, List<c> list) throws IOException {
        if (!this.S) {
            this.T.g(list);
            long size = this.Q.size();
            int min = (int) Math.min((long) (this.R - 4), size);
            long j10 = (long) min;
            int i12 = (size > j10 ? 1 : (size == j10 ? 0 : -1));
            i(i10, min + 4, (byte) 5, i12 == 0 ? (byte) 4 : 0);
            this.O.writeInt(i11 & Integer.MAX_VALUE);
            this.O.d1(this.Q, j10);
            if (i12 > 0) {
                N(i10, size - j10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void t(int i10, b bVar) throws IOException {
        if (this.S) {
            throw new IOException("closed");
        } else if (bVar.O != -1) {
            i(i10, 4, (byte) 3, (byte) 0);
            this.O.writeInt(bVar.O);
            this.O.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void w(m mVar) throws IOException {
        if (!this.S) {
            int i10 = 0;
            i(0, mVar.l() * 6, (byte) 4, (byte) 0);
            while (i10 < 10) {
                if (mVar.i(i10)) {
                    this.O.writeShort(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                    this.O.writeInt(mVar.b(i10));
                }
                i10++;
            }
            this.O.flush();
        } else {
            throw new IOException("closed");
        }
    }
}

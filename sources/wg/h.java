package wg;

import ch.a0;
import ch.b0;
import ch.c;
import ch.e;
import ch.f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import wg.d;
import zd.p2;

public final class h implements Closeable {
    public static final Logger S = Logger.getLogger(e.class.getName());
    public final e O;
    public final a P;
    public final boolean Q;
    public final d.a R;

    public static final class a implements a0 {
        public final e O;
        public int P;
        public byte Q;
        public int R;
        public int S;
        public short T;

        public a(e eVar) {
            this.O = eVar;
        }

        public long C0(c cVar, long j10) throws IOException {
            while (true) {
                int i10 = this.S;
                if (i10 == 0) {
                    this.O.skip((long) this.T);
                    this.T = 0;
                    if ((this.Q & 4) != 0) {
                        return -1;
                    }
                    c();
                } else {
                    long C0 = this.O.C0(cVar, Math.min(j10, (long) i10));
                    if (C0 == -1) {
                        return -1;
                    }
                    this.S = (int) (((long) this.S) - C0);
                    return C0;
                }
            }
        }

        public b0 b() {
            return this.O.b();
        }

        public final void c() throws IOException {
            int i10 = this.R;
            int m10 = h.m(this.O);
            this.S = m10;
            this.P = m10;
            byte readByte = (byte) (this.O.readByte() & 255);
            this.Q = (byte) (this.O.readByte() & 255);
            Logger logger = h.S;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.b(true, this.R, this.P, readByte, this.Q));
            }
            int readInt = this.O.readInt() & Integer.MAX_VALUE;
            this.R = readInt;
            if (readByte != 9) {
                throw e.d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (readInt != i10) {
                throw e.d("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        public void close() throws IOException {
        }
    }

    public interface b {
        void a();

        void b(boolean z10, int i10, e eVar, int i11) throws IOException;

        void c(boolean z10, int i10, int i11, List<c> list);

        void d(int i10, long j10);

        void e(int i10, String str, f fVar, String str2, int i11, long j10);

        void f(boolean z10, m mVar);

        void g(int i10, b bVar);

        void h(boolean z10, int i10, int i11);

        void i(int i10, int i11, int i12, boolean z10);

        void j(int i10, b bVar, f fVar);

        void k(int i10, int i11, List<c> list) throws IOException;
    }

    public h(e eVar, boolean z10) {
        this.O = eVar;
        this.Q = z10;
        a aVar = new a(eVar);
        this.P = aVar;
        this.R = new d.a(4096, aVar);
    }

    public static int c(int i10, byte b10, short s10) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        throw e.d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
    }

    public static int m(e eVar) throws IOException {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    public final void A(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 4) {
            throw e.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
        } else if (i11 != 0) {
            int readInt = this.O.readInt();
            b a10 = b.a(readInt);
            if (a10 != null) {
                bVar.g(i11, a10);
            } else {
                throw e.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
        } else {
            throw e.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
    }

    public final void N(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i11 != 0) {
            throw e.d("TYPE_SETTINGS streamId != 0", new Object[0]);
        } else if ((b10 & 1) != 0) {
            if (i10 == 0) {
                bVar.a();
                return;
            }
            throw e.d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        } else if (i10 % 6 == 0) {
            m mVar = new m();
            for (int i12 = 0; i12 < i10; i12 += 6) {
                short readShort = this.O.readShort() & p2.R;
                int readInt = this.O.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort == 4) {
                        readShort = 7;
                        if (readInt < 0) {
                            throw e.d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                    } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                        throw e.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                    }
                } else if (!(readInt == 0 || readInt == 1)) {
                    throw e.d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
                mVar.k(readShort, readInt);
            }
            bVar.f(false, mVar);
        } else {
            throw e.d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
        }
    }

    public final void P(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 == 4) {
            long readInt = ((long) this.O.readInt()) & y4.c.M0;
            if (readInt != 0) {
                bVar.d(i11, readInt);
            } else {
                throw e.d("windowSizeIncrement was 0", Long.valueOf(readInt));
            }
        } else {
            throw e.d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
        }
    }

    public void close() throws IOException {
        this.O.close();
    }

    public boolean f(boolean z10, b bVar) throws IOException {
        try {
            this.O.E1(9);
            int m10 = m(this.O);
            if (m10 < 0 || m10 > 16384) {
                throw e.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(m10));
            }
            byte readByte = (byte) (this.O.readByte() & 255);
            if (!z10 || readByte == 4) {
                byte readByte2 = (byte) (this.O.readByte() & 255);
                int readInt = this.O.readInt() & Integer.MAX_VALUE;
                Logger logger = S;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.b(true, readInt, m10, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        h(bVar, m10, readByte2, readInt);
                        break;
                    case 1:
                        l(bVar, m10, readByte2, readInt);
                        break;
                    case 2:
                        t(bVar, m10, readByte2, readInt);
                        break;
                    case 3:
                        A(bVar, m10, readByte2, readInt);
                        break;
                    case 4:
                        N(bVar, m10, readByte2, readInt);
                        break;
                    case 5:
                        w(bVar, m10, readByte2, readInt);
                        break;
                    case 6:
                        o(bVar, m10, readByte2, readInt);
                        break;
                    case 7:
                        i(bVar, m10, readByte2, readInt);
                        break;
                    case 8:
                        P(bVar, m10, readByte2, readInt);
                        break;
                    default:
                        this.O.skip((long) m10);
                        break;
                }
                return true;
            }
            throw e.d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
        } catch (EOFException unused) {
            return false;
        }
    }

    public void g(b bVar) throws IOException {
        if (!this.Q) {
            e eVar = this.O;
            f fVar = e.f24186a;
            f B = eVar.B((long) fVar.R());
            Logger logger = S;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(pg.e.r("<< CONNECTION %s", B.s()));
            }
            if (!fVar.equals(B)) {
                throw e.d("Expected a connection header but was %s", B.a0());
            }
        } else if (!f(true, bVar)) {
            throw e.d("Required SETTINGS preface not received", new Object[0]);
        }
    }

    public final void h(b bVar, int i10, byte b10, int i11) throws IOException {
        short s10 = 0;
        if (i11 != 0) {
            boolean z10 = true;
            boolean z11 = (b10 & 1) != 0;
            if ((b10 & 32) == 0) {
                z10 = false;
            }
            if (!z10) {
                if ((b10 & 8) != 0) {
                    s10 = (short) (this.O.readByte() & 255);
                }
                bVar.b(z11, i11, this.O, c(i10, b10, s10));
                this.O.skip((long) s10);
                return;
            }
            throw e.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw e.d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    public final void i(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 < 8) {
            throw e.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
        } else if (i11 == 0) {
            int readInt = this.O.readInt();
            int readInt2 = this.O.readInt();
            int i12 = i10 - 8;
            b a10 = b.a(readInt2);
            if (a10 != null) {
                f fVar = f.T;
                if (i12 > 0) {
                    fVar = this.O.B((long) i12);
                }
                bVar.j(readInt, a10, fVar);
                return;
            }
            throw e.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
        } else {
            throw e.d("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
    }

    public final List<c> k(int i10, short s10, byte b10, int i11) throws IOException {
        a aVar = this.P;
        aVar.S = i10;
        aVar.P = i10;
        aVar.T = s10;
        aVar.Q = b10;
        aVar.R = i11;
        this.R.l();
        return this.R.e();
    }

    public final void l(b bVar, int i10, byte b10, int i11) throws IOException {
        short s10 = 0;
        if (i11 != 0) {
            boolean z10 = (b10 & 1) != 0;
            if ((b10 & 8) != 0) {
                s10 = (short) (this.O.readByte() & 255);
            }
            if ((b10 & 32) != 0) {
                q(bVar, i11);
                i10 -= 5;
            }
            bVar.c(z10, i11, -1, k(c(i10, b10, s10), s10, b10, i11));
            return;
        }
        throw e.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    public final void o(b bVar, int i10, byte b10, int i11) throws IOException {
        boolean z10 = false;
        if (i10 != 8) {
            throw e.d("TYPE_PING length != 8: %s", Integer.valueOf(i10));
        } else if (i11 == 0) {
            int readInt = this.O.readInt();
            int readInt2 = this.O.readInt();
            if ((b10 & 1) != 0) {
                z10 = true;
            }
            bVar.h(z10, readInt, readInt2);
        } else {
            throw e.d("TYPE_PING streamId != 0", new Object[0]);
        }
    }

    public final void q(b bVar, int i10) throws IOException {
        int readInt = this.O.readInt();
        bVar.i(i10, readInt & Integer.MAX_VALUE, (this.O.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    public final void t(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 5) {
            throw e.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
        } else if (i11 != 0) {
            q(bVar, i11);
        } else {
            throw e.d("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
    }

    public final void w(b bVar, int i10, byte b10, int i11) throws IOException {
        short s10 = 0;
        if (i11 != 0) {
            if ((b10 & 8) != 0) {
                s10 = (short) (this.O.readByte() & 255);
            }
            bVar.k(i11, this.O.readInt() & Integer.MAX_VALUE, k(c(i10 - 4, b10, s10), s10, b10, i11));
            return;
        }
        throw e.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }
}

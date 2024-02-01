package ch;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class u implements d {
    public final c O = new c();
    public final z P;
    public boolean Q;

    public class a extends OutputStream {
        public a() {
        }

        public void close() throws IOException {
            u.this.close();
        }

        public void flush() throws IOException {
            u uVar = u.this;
            if (!uVar.Q) {
                uVar.flush();
            }
        }

        public String toString() {
            return u.this + ".outputStream()";
        }

        public void write(int i10) throws IOException {
            u uVar = u.this;
            if (!uVar.Q) {
                uVar.O.writeByte((byte) i10);
                u.this.i0();
                return;
            }
            throw new IOException("closed");
        }

        public void write(byte[] bArr, int i10, int i11) throws IOException {
            u uVar = u.this;
            if (!uVar.Q) {
                uVar.O.write(bArr, i10, i11);
                u.this.i0();
                return;
            }
            throw new IOException("closed");
        }
    }

    public u(z zVar) {
        if (zVar != null) {
            this.P = zVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public d A0(int i10) throws IOException {
        if (!this.Q) {
            this.O.A0(i10);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public d D0(String str) throws IOException {
        if (!this.Q) {
            this.O.D0(str);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public d D1(String str, int i10, int i11, Charset charset) throws IOException {
        if (!this.Q) {
            this.O.D1(str, i10, i11, charset);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public d G1(long j10) throws IOException {
        if (!this.Q) {
            this.O.G1(j10);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public d H() throws IOException {
        if (!this.Q) {
            long size = this.O.size();
            if (size > 0) {
                this.P.d1(this.O, size);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public d J(int i10) throws IOException {
        if (!this.Q) {
            this.O.J(i10);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public OutputStream J1() {
        return new a();
    }

    public d O(long j10) throws IOException {
        if (!this.Q) {
            this.O.O(j10);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public d O0(String str, int i10, int i11) throws IOException {
        if (!this.Q) {
            this.O.O0(str, i10, i11);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public d P0(long j10) throws IOException {
        if (!this.Q) {
            this.O.P0(j10);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public d R0(String str, Charset charset) throws IOException {
        if (!this.Q) {
            this.O.R0(str, charset);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public d T(f fVar) throws IOException {
        if (!this.Q) {
            this.O.T(fVar);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public long V0(a0 a0Var) throws IOException {
        if (a0Var != null) {
            long j10 = 0;
            while (true) {
                long C0 = a0Var.C0(this.O, 8192);
                if (C0 == -1) {
                    return j10;
                }
                j10 += C0;
                i0();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public d W(int i10) throws IOException {
        if (!this.Q) {
            this.O.W(i10);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public b0 b() {
        return this.P.b();
    }

    public void close() throws IOException {
        if (!this.Q) {
            Throwable th2 = null;
            try {
                c cVar = this.O;
                long j10 = cVar.P;
                if (j10 > 0) {
                    this.P.d1(cVar, j10);
                }
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                this.P.close();
            } catch (Throwable th4) {
                if (th2 == null) {
                    th2 = th4;
                }
            }
            this.Q = true;
            if (th2 != null) {
                d0.f(th2);
            }
        }
    }

    public void d1(c cVar, long j10) throws IOException {
        if (!this.Q) {
            this.O.d1(cVar, j10);
            i0();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public void flush() throws IOException {
        if (!this.Q) {
            c cVar = this.O;
            long j10 = cVar.P;
            if (j10 > 0) {
                this.P.d1(cVar, j10);
            }
            this.P.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public d i0() throws IOException {
        if (!this.Q) {
            long k10 = this.O.k();
            if (k10 > 0) {
                this.P.d1(this.O, k10);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.Q;
    }

    public c j() {
        return this.O;
    }

    public d t0(a0 a0Var, long j10) throws IOException {
        while (j10 > 0) {
            long C0 = a0Var.C0(this.O, j10);
            if (C0 != -1) {
                j10 -= C0;
                i0();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    public String toString() {
        return "buffer(" + this.P + ")";
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.Q) {
            int write = this.O.write(byteBuffer);
            i0();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public d write(byte[] bArr) throws IOException {
        if (!this.Q) {
            this.O.write(bArr);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public d write(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.Q) {
            this.O.write(bArr, i10, i11);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public d writeByte(int i10) throws IOException {
        if (!this.Q) {
            this.O.writeByte(i10);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public d writeInt(int i10) throws IOException {
        if (!this.Q) {
            this.O.writeInt(i10);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public d writeLong(long j10) throws IOException {
        if (!this.Q) {
            this.O.writeLong(j10);
            return i0();
        }
        throw new IllegalStateException("closed");
    }

    public d writeShort(int i10) throws IOException {
        if (!this.Q) {
            this.O.writeShort(i10);
            return i0();
        }
        throw new IllegalStateException("closed");
    }
}

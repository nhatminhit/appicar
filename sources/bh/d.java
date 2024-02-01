package bh;

import ch.c;
import ch.e;
import ch.f;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import xe.o;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16310a;

    /* renamed from: b  reason: collision with root package name */
    public final e f16311b;

    /* renamed from: c  reason: collision with root package name */
    public final a f16312c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16313d;

    /* renamed from: e  reason: collision with root package name */
    public int f16314e;

    /* renamed from: f  reason: collision with root package name */
    public long f16315f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16316g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16317h;

    /* renamed from: i  reason: collision with root package name */
    public final c f16318i = new c();

    /* renamed from: j  reason: collision with root package name */
    public final c f16319j = new c();

    /* renamed from: k  reason: collision with root package name */
    public final byte[] f16320k;

    /* renamed from: l  reason: collision with root package name */
    public final c.C0271c f16321l;

    public interface a {
        void a(f fVar) throws IOException;

        void d(String str) throws IOException;

        void e(f fVar);

        void i(int i10, String str);

        void j(f fVar);
    }

    public d(boolean z10, e eVar, a aVar) {
        if (eVar == null) {
            throw new NullPointerException("source == null");
        } else if (aVar != null) {
            this.f16310a = z10;
            this.f16311b = eVar;
            this.f16312c = aVar;
            c.C0271c cVar = null;
            this.f16320k = z10 ? null : new byte[4];
            this.f16321l = !z10 ? new c.C0271c() : cVar;
        } else {
            throw new NullPointerException("frameCallback == null");
        }
    }

    public void a() throws IOException {
        c();
        if (this.f16317h) {
            b();
        } else {
            e();
        }
    }

    public final void b() throws IOException {
        String str;
        long j10 = this.f16315f;
        if (j10 > 0) {
            this.f16311b.B1(this.f16318i, j10);
            if (!this.f16310a) {
                this.f16318i.m0(this.f16321l);
                this.f16321l.h(0);
                c.c(this.f16321l, this.f16320k);
                this.f16321l.close();
            }
        }
        switch (this.f16314e) {
            case 8:
                short s10 = 1005;
                long size = this.f16318i.size();
                if (size != 1) {
                    if (size != 0) {
                        s10 = this.f16318i.readShort();
                        str = this.f16318i.o1();
                        String b10 = c.b(s10);
                        if (b10 != null) {
                            throw new ProtocolException(b10);
                        }
                    } else {
                        str = "";
                    }
                    this.f16312c.i(s10, str);
                    this.f16313d = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.f16312c.j(this.f16318i.Q0());
                return;
            case 10:
                this.f16312c.e(this.f16318i.Q0());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f16314e));
        }
    }

    /* JADX INFO: finally extract failed */
    public final void c() throws IOException {
        if (!this.f16313d) {
            long j10 = this.f16311b.b().j();
            this.f16311b.b().b();
            try {
                byte readByte = this.f16311b.readByte() & 255;
                this.f16311b.b().i(j10, TimeUnit.NANOSECONDS);
                this.f16314e = readByte & 15;
                boolean z10 = true;
                boolean z11 = (readByte & o.f24535b) != 0;
                this.f16316g = z11;
                boolean z12 = (readByte & 8) != 0;
                this.f16317h = z12;
                if (!z12 || z11) {
                    boolean z13 = (readByte & 64) != 0;
                    boolean z14 = (readByte & 32) != 0;
                    boolean z15 = (readByte & 16) != 0;
                    if (z13 || z14 || z15) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    byte readByte2 = this.f16311b.readByte() & 255;
                    if ((readByte2 & o.f24535b) == 0) {
                        z10 = false;
                    }
                    if (z10 == this.f16310a) {
                        throw new ProtocolException(this.f16310a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                    }
                    long j11 = (long) (readByte2 & Byte.MAX_VALUE);
                    this.f16315f = j11;
                    if (j11 == 126) {
                        this.f16315f = ((long) this.f16311b.readShort()) & c.f16306s;
                    } else if (j11 == 127) {
                        long readLong = this.f16311b.readLong();
                        this.f16315f = readLong;
                        if (readLong < 0) {
                            throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f16315f) + " > 0x7FFFFFFFFFFFFFFF");
                        }
                    }
                    if (this.f16317h && this.f16315f > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z10) {
                        this.f16311b.readFully(this.f16320k);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th2) {
                this.f16311b.b().i(j10, TimeUnit.NANOSECONDS);
                throw th2;
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void d() throws IOException {
        while (!this.f16313d) {
            long j10 = this.f16315f;
            if (j10 > 0) {
                this.f16311b.B1(this.f16319j, j10);
                if (!this.f16310a) {
                    this.f16319j.m0(this.f16321l);
                    this.f16321l.h(this.f16319j.size() - this.f16315f);
                    c.c(this.f16321l, this.f16320k);
                    this.f16321l.close();
                }
            }
            if (!this.f16316g) {
                f();
                if (this.f16314e != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.f16314e));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void e() throws IOException {
        int i10 = this.f16314e;
        if (i10 == 1 || i10 == 2) {
            d();
            if (i10 == 1) {
                this.f16312c.d(this.f16319j.o1());
            } else {
                this.f16312c.a(this.f16319j.Q0());
            }
        } else {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i10));
        }
    }

    public final void f() throws IOException {
        while (!this.f16313d) {
            c();
            if (this.f16317h) {
                b();
            } else {
                return;
            }
        }
    }
}

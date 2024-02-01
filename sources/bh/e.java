package bh;

import ch.b0;
import ch.c;
import ch.d;
import ch.f;
import ch.z;
import java.io.IOException;
import java.util.Random;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16322a;

    /* renamed from: b  reason: collision with root package name */
    public final Random f16323b;

    /* renamed from: c  reason: collision with root package name */
    public final d f16324c;

    /* renamed from: d  reason: collision with root package name */
    public final c f16325d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16326e;

    /* renamed from: f  reason: collision with root package name */
    public final c f16327f = new c();

    /* renamed from: g  reason: collision with root package name */
    public final a f16328g = new a();

    /* renamed from: h  reason: collision with root package name */
    public boolean f16329h;

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f16330i;

    /* renamed from: j  reason: collision with root package name */
    public final c.C0271c f16331j;

    public final class a implements z {
        public int O;
        public long P;
        public boolean Q;
        public boolean R;

        public a() {
        }

        public b0 b() {
            return e.this.f16324c.b();
        }

        public void close() throws IOException {
            if (!this.R) {
                e eVar = e.this;
                eVar.d(this.O, eVar.f16327f.size(), this.Q, true);
                this.R = true;
                e.this.f16329h = false;
                return;
            }
            throw new IOException("closed");
        }

        public void d1(c cVar, long j10) throws IOException {
            if (!this.R) {
                e.this.f16327f.d1(cVar, j10);
                boolean z10 = this.Q && this.P != -1 && e.this.f16327f.size() > this.P - 8192;
                long k10 = e.this.f16327f.k();
                if (k10 > 0 && !z10) {
                    e.this.d(this.O, k10, this.Q, false);
                    this.Q = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        public void flush() throws IOException {
            if (!this.R) {
                e eVar = e.this;
                eVar.d(this.O, eVar.f16327f.size(), this.Q, false);
                this.Q = false;
                return;
            }
            throw new IOException("closed");
        }
    }

    public e(boolean z10, d dVar, Random random) {
        if (dVar == null) {
            throw new NullPointerException("sink == null");
        } else if (random != null) {
            this.f16322a = z10;
            this.f16324c = dVar;
            this.f16325d = dVar.j();
            this.f16323b = random;
            c.C0271c cVar = null;
            this.f16330i = z10 ? new byte[4] : null;
            this.f16331j = z10 ? new c.C0271c() : cVar;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    public z a(int i10, long j10) {
        if (!this.f16329h) {
            this.f16329h = true;
            a aVar = this.f16328g;
            aVar.O = i10;
            aVar.P = j10;
            aVar.Q = true;
            aVar.R = false;
            return aVar;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    public void b(int i10, f fVar) throws IOException {
        f fVar2 = f.T;
        if (!(i10 == 0 && fVar == null)) {
            if (i10 != 0) {
                c.d(i10);
            }
            c cVar = new c();
            cVar.writeShort(i10);
            if (fVar != null) {
                cVar.T(fVar);
            }
            fVar2 = cVar.Q0();
        }
        try {
            c(8, fVar2);
        } finally {
            this.f16326e = true;
        }
    }

    public final void c(int i10, f fVar) throws IOException {
        if (!this.f16326e) {
            int R = fVar.R();
            if (((long) R) <= 125) {
                this.f16325d.writeByte(i10 | 128);
                if (this.f16322a) {
                    this.f16325d.writeByte(R | 128);
                    this.f16323b.nextBytes(this.f16330i);
                    this.f16325d.write(this.f16330i);
                    if (R > 0) {
                        long size = this.f16325d.size();
                        this.f16325d.T(fVar);
                        this.f16325d.m0(this.f16331j);
                        this.f16331j.h(size);
                        c.c(this.f16331j, this.f16330i);
                        this.f16331j.close();
                    }
                } else {
                    this.f16325d.writeByte(R);
                    this.f16325d.T(fVar);
                }
                this.f16324c.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    public void d(int i10, long j10, boolean z10, boolean z11) throws IOException {
        if (!this.f16326e) {
            int i11 = 0;
            if (!z10) {
                i10 = 0;
            }
            if (z11) {
                i10 |= 128;
            }
            this.f16325d.writeByte(i10);
            if (this.f16322a) {
                i11 = 128;
            }
            if (j10 <= 125) {
                this.f16325d.writeByte(((int) j10) | i11);
            } else if (j10 <= c.f16306s) {
                this.f16325d.writeByte(i11 | 126);
                this.f16325d.writeShort((int) j10);
            } else {
                this.f16325d.writeByte(i11 | 127);
                this.f16325d.writeLong(j10);
            }
            if (this.f16322a) {
                this.f16323b.nextBytes(this.f16330i);
                this.f16325d.write(this.f16330i);
                if (j10 > 0) {
                    long size = this.f16325d.size();
                    this.f16325d.d1(this.f16327f, j10);
                    this.f16325d.m0(this.f16331j);
                    this.f16331j.h(size);
                    c.c(this.f16331j, this.f16330i);
                    this.f16331j.close();
                }
            } else {
                this.f16325d.d1(this.f16327f, j10);
            }
            this.f16324c.H();
            return;
        }
        throw new IOException("closed");
    }

    public void e(f fVar) throws IOException {
        c(9, fVar);
    }

    public void f(f fVar) throws IOException {
        c(10, fVar);
    }
}

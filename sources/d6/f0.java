package d6;

import d6.l;
import java.nio.ByteBuffer;
import w7.q0;

public final class f0 extends y {

    /* renamed from: q  reason: collision with root package name */
    public static final long f6301q = 150000;

    /* renamed from: r  reason: collision with root package name */
    public static final long f6302r = 20000;

    /* renamed from: s  reason: collision with root package name */
    public static final short f6303s = 1024;

    /* renamed from: t  reason: collision with root package name */
    public static final byte f6304t = 4;

    /* renamed from: u  reason: collision with root package name */
    public static final int f6305u = 0;

    /* renamed from: v  reason: collision with root package name */
    public static final int f6306v = 1;

    /* renamed from: w  reason: collision with root package name */
    public static final int f6307w = 2;

    /* renamed from: h  reason: collision with root package name */
    public int f6308h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6309i;

    /* renamed from: j  reason: collision with root package name */
    public byte[] f6310j;

    /* renamed from: k  reason: collision with root package name */
    public byte[] f6311k;

    /* renamed from: l  reason: collision with root package name */
    public int f6312l;

    /* renamed from: m  reason: collision with root package name */
    public int f6313m;

    /* renamed from: n  reason: collision with root package name */
    public int f6314n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6315o;

    /* renamed from: p  reason: collision with root package name */
    public long f6316p;

    public f0() {
        byte[] bArr = q0.f14791f;
        this.f6310j = bArr;
        this.f6311k = bArr;
    }

    public boolean c() {
        return super.c() && this.f6309i;
    }

    public void d(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !j()) {
            int i10 = this.f6312l;
            if (i10 == 0) {
                w(byteBuffer);
            } else if (i10 == 1) {
                v(byteBuffer);
            } else if (i10 == 2) {
                x(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public boolean i(int i10, int i11, int i12) throws l.a {
        if (i12 == 2) {
            this.f6308h = i11 * 2;
            return o(i10, i11, i12);
        }
        throw new l.a(i10, i11, i12);
    }

    public void k() {
        if (c()) {
            int p10 = p(f6301q) * this.f6308h;
            if (this.f6310j.length != p10) {
                this.f6310j = new byte[p10];
            }
            int p11 = p(f6302r) * this.f6308h;
            this.f6314n = p11;
            if (this.f6311k.length != p11) {
                this.f6311k = new byte[p11];
            }
        }
        this.f6312l = 0;
        this.f6316p = 0;
        this.f6313m = 0;
        this.f6315o = false;
    }

    public void l() {
        int i10 = this.f6313m;
        if (i10 > 0) {
            u(this.f6310j, i10);
        }
        if (!this.f6315o) {
            this.f6316p += (long) (this.f6314n / this.f6308h);
        }
    }

    public void m() {
        this.f6309i = false;
        this.f6314n = 0;
        byte[] bArr = q0.f14791f;
        this.f6310j = bArr;
        this.f6311k = bArr;
    }

    public final int p(long j10) {
        return (int) ((j10 * ((long) this.f6496b)) / 1000000);
    }

    public final int q(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (Math.abs(byteBuffer.get(limit)) > 4) {
                int i10 = this.f6308h;
                return ((limit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    public final int r(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.get(position)) > 4) {
                int i10 = this.f6308h;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    public long s() {
        return this.f6316p;
    }

    public final void t(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        n(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f6315o = true;
        }
    }

    public final void u(byte[] bArr, int i10) {
        n(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f6315o = true;
        }
    }

    public final void v(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int r10 = r(byteBuffer);
        int position = r10 - byteBuffer.position();
        byte[] bArr = this.f6310j;
        int length = bArr.length;
        int i10 = this.f6313m;
        int i11 = length - i10;
        if (r10 >= limit || position >= i11) {
            int min = Math.min(position, i11);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.f6310j, this.f6313m, min);
            int i12 = this.f6313m + min;
            this.f6313m = i12;
            byte[] bArr2 = this.f6310j;
            if (i12 == bArr2.length) {
                if (this.f6315o) {
                    u(bArr2, this.f6314n);
                    this.f6316p += (long) ((this.f6313m - (this.f6314n * 2)) / this.f6308h);
                } else {
                    this.f6316p += (long) ((i12 - this.f6314n) / this.f6308h);
                }
                z(byteBuffer, this.f6310j, this.f6313m);
                this.f6313m = 0;
                this.f6312l = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        u(bArr, i10);
        this.f6313m = 0;
        this.f6312l = 0;
    }

    public final void w(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f6310j.length));
        int q10 = q(byteBuffer);
        if (q10 == byteBuffer.position()) {
            this.f6312l = 1;
        } else {
            byteBuffer.limit(q10);
            t(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    public final void x(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int r10 = r(byteBuffer);
        byteBuffer.limit(r10);
        this.f6316p += (long) (byteBuffer.remaining() / this.f6308h);
        z(byteBuffer, this.f6311k, this.f6314n);
        if (r10 < limit) {
            u(this.f6311k, this.f6314n);
            this.f6312l = 0;
            byteBuffer.limit(limit);
        }
    }

    public void y(boolean z10) {
        this.f6309i = z10;
        flush();
    }

    public final void z(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f6314n);
        int i11 = this.f6314n - min;
        System.arraycopy(bArr, i10 - i11, this.f6311k, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f6311k, i11, min);
    }
}

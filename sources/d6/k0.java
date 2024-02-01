package d6;

import d6.l;
import java.nio.ByteBuffer;
import w7.q0;

public final class k0 extends y {

    /* renamed from: q  reason: collision with root package name */
    public static final int f6424q = 2;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6425h;

    /* renamed from: i  reason: collision with root package name */
    public int f6426i;

    /* renamed from: j  reason: collision with root package name */
    public int f6427j;

    /* renamed from: k  reason: collision with root package name */
    public int f6428k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6429l;

    /* renamed from: m  reason: collision with root package name */
    public int f6430m;

    /* renamed from: n  reason: collision with root package name */
    public byte[] f6431n = q0.f14791f;

    /* renamed from: o  reason: collision with root package name */
    public int f6432o;

    /* renamed from: p  reason: collision with root package name */
    public long f6433p;

    public boolean a() {
        return super.a() && this.f6432o == 0;
    }

    public ByteBuffer b() {
        int i10;
        if (super.a() && (i10 = this.f6432o) > 0) {
            n(i10).put(this.f6431n, 0, this.f6432o).flip();
            this.f6432o = 0;
        }
        return super.b();
    }

    public boolean c() {
        return this.f6425h;
    }

    public void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            this.f6429l = true;
            int min = Math.min(i10, this.f6430m);
            this.f6433p += (long) (min / this.f6428k);
            this.f6430m -= min;
            byteBuffer.position(position + min);
            if (this.f6430m <= 0) {
                int i11 = i10 - min;
                int length = (this.f6432o + i11) - this.f6431n.length;
                ByteBuffer n10 = n(length);
                int u10 = q0.u(length, 0, this.f6432o);
                n10.put(this.f6431n, 0, u10);
                int u11 = q0.u(length - u10, 0, i11);
                byteBuffer.limit(byteBuffer.position() + u11);
                n10.put(byteBuffer);
                byteBuffer.limit(limit);
                int i12 = i11 - u11;
                int i13 = this.f6432o - u10;
                this.f6432o = i13;
                byte[] bArr = this.f6431n;
                System.arraycopy(bArr, u10, bArr, 0, i13);
                byteBuffer.get(this.f6431n, this.f6432o, i12);
                this.f6432o += i12;
                n10.flip();
            }
        }
    }

    public boolean i(int i10, int i11, int i12) throws l.a {
        if (i12 == 2) {
            int i13 = this.f6432o;
            if (i13 > 0) {
                this.f6433p += (long) (i13 / this.f6428k);
            }
            int Z = q0.Z(2, i11);
            this.f6428k = Z;
            int i14 = this.f6427j;
            this.f6431n = new byte[(i14 * Z)];
            this.f6432o = 0;
            int i15 = this.f6426i;
            this.f6430m = Z * i15;
            boolean z10 = this.f6425h;
            this.f6425h = (i15 == 0 && i14 == 0) ? false : true;
            this.f6429l = false;
            o(i10, i11, i12);
            return z10 != this.f6425h;
        }
        throw new l.a(i10, i11, i12);
    }

    public void k() {
        if (this.f6429l) {
            this.f6430m = 0;
        }
        this.f6432o = 0;
    }

    public void m() {
        this.f6431n = q0.f14791f;
    }

    public long p() {
        return this.f6433p;
    }

    public void q() {
        this.f6433p = 0;
    }

    public void r(int i10, int i11) {
        this.f6426i = i10;
        this.f6427j = i11;
    }
}

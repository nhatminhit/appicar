package d6;

import android.support.v4.media.session.PlaybackStateCompat;
import d.o0;
import d6.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import w7.a;
import w7.q0;

public final class i0 implements l {

    /* renamed from: p  reason: collision with root package name */
    public static final float f6389p = 8.0f;

    /* renamed from: q  reason: collision with root package name */
    public static final float f6390q = 0.1f;

    /* renamed from: r  reason: collision with root package name */
    public static final float f6391r = 8.0f;

    /* renamed from: s  reason: collision with root package name */
    public static final float f6392s = 0.1f;

    /* renamed from: t  reason: collision with root package name */
    public static final int f6393t = -1;

    /* renamed from: u  reason: collision with root package name */
    public static final float f6394u = 0.01f;

    /* renamed from: v  reason: collision with root package name */
    public static final int f6395v = 1024;

    /* renamed from: b  reason: collision with root package name */
    public int f6396b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f6397c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float f6398d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f6399e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int f6400f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f6401g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6402h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public h0 f6403i;

    /* renamed from: j  reason: collision with root package name */
    public ByteBuffer f6404j;

    /* renamed from: k  reason: collision with root package name */
    public ShortBuffer f6405k;

    /* renamed from: l  reason: collision with root package name */
    public ByteBuffer f6406l;

    /* renamed from: m  reason: collision with root package name */
    public long f6407m;

    /* renamed from: n  reason: collision with root package name */
    public long f6408n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6409o;

    public i0() {
        ByteBuffer byteBuffer = l.f6434a;
        this.f6404j = byteBuffer;
        this.f6405k = byteBuffer.asShortBuffer();
        this.f6406l = byteBuffer;
        this.f6401g = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f6403i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r1 = this;
            boolean r0 = r1.f6409o
            if (r0 == 0) goto L_0x0010
            d6.h0 r0 = r1.f6403i
            if (r0 == 0) goto L_0x000e
            int r0 = r0.k()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.i0.a():boolean");
    }

    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f6406l;
        this.f6406l = l.f6434a;
        return byteBuffer;
    }

    public boolean c() {
        return this.f6397c != -1 && (Math.abs(this.f6398d - 1.0f) >= 0.01f || Math.abs(this.f6399e - 1.0f) >= 0.01f || this.f6400f != this.f6397c);
    }

    public void d(ByteBuffer byteBuffer) {
        h0 h0Var = (h0) a.g(this.f6403i);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f6407m += (long) remaining;
            h0Var.s(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int k10 = h0Var.k();
        if (k10 > 0) {
            if (this.f6404j.capacity() < k10) {
                ByteBuffer order = ByteBuffer.allocateDirect(k10).order(ByteOrder.nativeOrder());
                this.f6404j = order;
                this.f6405k = order.asShortBuffer();
            } else {
                this.f6404j.clear();
                this.f6405k.clear();
            }
            h0Var.j(this.f6405k);
            this.f6408n += (long) k10;
            this.f6404j.limit(k10);
            this.f6406l = this.f6404j;
        }
    }

    public int e() {
        return this.f6396b;
    }

    public int f() {
        return this.f6400f;
    }

    public void flush() {
        if (c()) {
            if (this.f6402h) {
                this.f6403i = new h0(this.f6397c, this.f6396b, this.f6398d, this.f6399e, this.f6400f);
            } else {
                h0 h0Var = this.f6403i;
                if (h0Var != null) {
                    h0Var.i();
                }
            }
        }
        this.f6406l = l.f6434a;
        this.f6407m = 0;
        this.f6408n = 0;
        this.f6409o = false;
    }

    public int g() {
        return 2;
    }

    public void h() {
        h0 h0Var = this.f6403i;
        if (h0Var != null) {
            h0Var.r();
        }
        this.f6409o = true;
    }

    public boolean i(int i10, int i11, int i12) throws l.a {
        if (i12 == 2) {
            int i13 = this.f6401g;
            if (i13 == -1) {
                i13 = i10;
            }
            if (this.f6397c == i10 && this.f6396b == i11 && this.f6400f == i13) {
                return false;
            }
            this.f6397c = i10;
            this.f6396b = i11;
            this.f6400f = i13;
            this.f6402h = true;
            return true;
        }
        throw new l.a(i10, i11, i12);
    }

    public long j(long j10) {
        long j11 = this.f6408n;
        if (j11 < PlaybackStateCompat.f554k0) {
            return (long) (((double) this.f6398d) * ((double) j10));
        }
        int i10 = this.f6400f;
        int i11 = this.f6397c;
        long j12 = this.f6407m;
        if (i10 == i11) {
            return q0.L0(j10, j12, j11);
        }
        return q0.L0(j10, j12 * ((long) i10), j11 * ((long) i11));
    }

    public void k(int i10) {
        this.f6401g = i10;
    }

    public float l(float f10) {
        float t10 = q0.t(f10, 0.1f, 8.0f);
        if (this.f6399e != t10) {
            this.f6399e = t10;
            this.f6402h = true;
        }
        flush();
        return t10;
    }

    public float m(float f10) {
        float t10 = q0.t(f10, 0.1f, 8.0f);
        if (this.f6398d != t10) {
            this.f6398d = t10;
            this.f6402h = true;
        }
        flush();
        return t10;
    }

    public void reset() {
        this.f6398d = 1.0f;
        this.f6399e = 1.0f;
        this.f6396b = -1;
        this.f6397c = -1;
        this.f6400f = -1;
        ByteBuffer byteBuffer = l.f6434a;
        this.f6404j = byteBuffer;
        this.f6405k = byteBuffer.asShortBuffer();
        this.f6406l = byteBuffer;
        this.f6401g = -1;
        this.f6402h = false;
        this.f6403i = null;
        this.f6407m = 0;
        this.f6408n = 0;
        this.f6409o = false;
    }
}

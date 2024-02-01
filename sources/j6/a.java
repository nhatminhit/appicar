package j6;

import d.o0;
import j6.q;
import java.io.IOException;
import java.nio.ByteBuffer;
import w7.q0;

public abstract class a {

    /* renamed from: e  reason: collision with root package name */
    public static final long f9524e = 262144;

    /* renamed from: a  reason: collision with root package name */
    public final C0162a f9525a;

    /* renamed from: b  reason: collision with root package name */
    public final g f9526b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public d f9527c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9528d;

    /* renamed from: j6.a$a  reason: collision with other inner class name */
    public static class C0162a implements q {

        /* renamed from: d  reason: collision with root package name */
        public final e f9529d;

        /* renamed from: e  reason: collision with root package name */
        public final long f9530e;

        /* renamed from: f  reason: collision with root package name */
        public final long f9531f;

        /* renamed from: g  reason: collision with root package name */
        public final long f9532g;

        /* renamed from: h  reason: collision with root package name */
        public final long f9533h;

        /* renamed from: i  reason: collision with root package name */
        public final long f9534i;

        /* renamed from: j  reason: collision with root package name */
        public final long f9535j;

        public C0162a(e eVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f9529d = eVar;
            this.f9530e = j10;
            this.f9531f = j11;
            this.f9532g = j12;
            this.f9533h = j13;
            this.f9534i = j14;
            this.f9535j = j15;
        }

        public boolean d() {
            return true;
        }

        public q.a i(long j10) {
            return new q.a(new r(j10, d.h(this.f9529d.a(j10), this.f9531f, this.f9532g, this.f9533h, this.f9534i, this.f9535j)));
        }

        public long j() {
            return this.f9530e;
        }

        public long k(long j10) {
            return this.f9529d.a(j10);
        }
    }

    public static final class b implements e {
        public long a(long j10) {
            return j10;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f9536a;

        /* renamed from: b  reason: collision with root package name */
        public long f9537b = 0;

        public c(ByteBuffer byteBuffer) {
            this.f9536a = byteBuffer;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f9538a;

        /* renamed from: b  reason: collision with root package name */
        public final long f9539b;

        /* renamed from: c  reason: collision with root package name */
        public final long f9540c;

        /* renamed from: d  reason: collision with root package name */
        public long f9541d;

        /* renamed from: e  reason: collision with root package name */
        public long f9542e;

        /* renamed from: f  reason: collision with root package name */
        public long f9543f;

        /* renamed from: g  reason: collision with root package name */
        public long f9544g;

        /* renamed from: h  reason: collision with root package name */
        public long f9545h;

        public d(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f9538a = j10;
            this.f9539b = j11;
            this.f9541d = j12;
            this.f9542e = j13;
            this.f9543f = j14;
            this.f9544g = j15;
            this.f9540c = j16;
            this.f9545h = h(j11, j12, j13, j14, j15, j16);
        }

        public static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) (((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11))));
            return q0.v(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        public final long i() {
            return this.f9544g;
        }

        public final long j() {
            return this.f9543f;
        }

        public final long k() {
            return this.f9545h;
        }

        public final long l() {
            return this.f9538a;
        }

        public final long m() {
            return this.f9539b;
        }

        public final void n() {
            this.f9545h = h(this.f9539b, this.f9541d, this.f9542e, this.f9543f, this.f9544g, this.f9540c);
        }

        public final void o(long j10, long j11) {
            this.f9542e = j10;
            this.f9544g = j11;
            n();
        }

        public final void p(long j10, long j11) {
            this.f9541d = j10;
            this.f9543f = j11;
            n();
        }
    }

    public interface e {
        long a(long j10);
    }

    public static final class f {

        /* renamed from: d  reason: collision with root package name */
        public static final int f9546d = 0;

        /* renamed from: e  reason: collision with root package name */
        public static final int f9547e = -1;

        /* renamed from: f  reason: collision with root package name */
        public static final int f9548f = -2;

        /* renamed from: g  reason: collision with root package name */
        public static final int f9549g = -3;

        /* renamed from: h  reason: collision with root package name */
        public static final f f9550h = new f(-3, b6.c.f4201b, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f9551a;

        /* renamed from: b  reason: collision with root package name */
        public final long f9552b;

        /* renamed from: c  reason: collision with root package name */
        public final long f9553c;

        public f(int i10, long j10, long j11) {
            this.f9551a = i10;
            this.f9552b = j10;
            this.f9553c = j11;
        }

        public static f d(long j10, long j11) {
            return new f(-1, j10, j11);
        }

        public static f e(long j10) {
            return new f(0, b6.c.f4201b, j10);
        }

        public static f f(long j10, long j11) {
            return new f(-2, j10, j11);
        }
    }

    public interface g {
        f a(j jVar, long j10, c cVar) throws IOException, InterruptedException;

        void b();
    }

    public a(e eVar, g gVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f9526b = gVar;
        this.f9528d = i10;
        this.f9525a = new C0162a(eVar, j10, j11, j12, j13, j14, j15);
    }

    public d a(long j10) {
        long j11 = j10;
        return new d(j11, this.f9525a.k(j11), this.f9525a.f9531f, this.f9525a.f9532g, this.f9525a.f9533h, this.f9525a.f9534i, this.f9525a.f9535j);
    }

    public final q b() {
        return this.f9525a;
    }

    public int c(j jVar, p pVar, c cVar) throws InterruptedException, IOException {
        g gVar = (g) w7.a.g(this.f9526b);
        while (true) {
            d dVar = (d) w7.a.g(this.f9527c);
            long b10 = dVar.j();
            long c10 = dVar.i();
            long d10 = dVar.k();
            if (c10 - b10 <= ((long) this.f9528d)) {
                e(false, b10);
                return g(jVar, b10, pVar);
            } else if (!i(jVar, d10)) {
                return g(jVar, d10, pVar);
            } else {
                jVar.h();
                f a10 = gVar.a(jVar, dVar.m(), cVar);
                int a11 = a10.f9551a;
                if (a11 == -3) {
                    e(false, d10);
                    return g(jVar, d10, pVar);
                } else if (a11 == -2) {
                    dVar.p(a10.f9552b, a10.f9553c);
                } else if (a11 == -1) {
                    dVar.o(a10.f9552b, a10.f9553c);
                } else if (a11 == 0) {
                    e(true, a10.f9553c);
                    i(jVar, a10.f9553c);
                    return g(jVar, a10.f9553c, pVar);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    public final boolean d() {
        return this.f9527c != null;
    }

    public final void e(boolean z10, long j10) {
        this.f9527c = null;
        this.f9526b.b();
        f(z10, j10);
    }

    public void f(boolean z10, long j10) {
    }

    public final int g(j jVar, long j10, p pVar) {
        if (j10 == jVar.getPosition()) {
            return 0;
        }
        pVar.f9610a = j10;
        return 1;
    }

    public final void h(long j10) {
        d dVar = this.f9527c;
        if (dVar == null || dVar.l() != j10) {
            this.f9527c = a(j10);
        }
    }

    public final boolean i(j jVar, long j10) throws IOException, InterruptedException {
        long position = j10 - jVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        jVar.i((int) position);
        return true;
    }
}

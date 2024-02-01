package b7;

import b6.c0;
import b7.p0;
import com.google.android.exoplayer2.Format;
import d.o0;
import g6.f;
import j6.j;
import j6.s;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import w7.w;
import xe.o;

public class q0 implements s {

    /* renamed from: p  reason: collision with root package name */
    public static final int f4665p = -1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f4666q = 32;

    /* renamed from: a  reason: collision with root package name */
    public final t7.b f4667a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4668b;

    /* renamed from: c  reason: collision with root package name */
    public final p0 f4669c = new p0();

    /* renamed from: d  reason: collision with root package name */
    public final p0.a f4670d = new p0.a();

    /* renamed from: e  reason: collision with root package name */
    public final w f4671e = new w(32);

    /* renamed from: f  reason: collision with root package name */
    public a f4672f;

    /* renamed from: g  reason: collision with root package name */
    public a f4673g;

    /* renamed from: h  reason: collision with root package name */
    public a f4674h;

    /* renamed from: i  reason: collision with root package name */
    public Format f4675i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4676j;

    /* renamed from: k  reason: collision with root package name */
    public Format f4677k;

    /* renamed from: l  reason: collision with root package name */
    public long f4678l;

    /* renamed from: m  reason: collision with root package name */
    public long f4679m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4680n;

    /* renamed from: o  reason: collision with root package name */
    public b f4681o;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f4682a;

        /* renamed from: b  reason: collision with root package name */
        public final long f4683b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4684c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public t7.a f4685d;
        @o0

        /* renamed from: e  reason: collision with root package name */
        public a f4686e;

        public a(long j10, int i10) {
            this.f4682a = j10;
            this.f4683b = j10 + ((long) i10);
        }

        public a a() {
            this.f4685d = null;
            a aVar = this.f4686e;
            this.f4686e = null;
            return aVar;
        }

        public void b(t7.a aVar, a aVar2) {
            this.f4685d = aVar;
            this.f4686e = aVar2;
            this.f4684c = true;
        }

        public int c(long j10) {
            return ((int) (j10 - this.f4682a)) + this.f4685d.f13047b;
        }
    }

    public interface b {
        void l(Format format);
    }

    public q0(t7.b bVar) {
        this.f4667a = bVar;
        int f10 = bVar.f();
        this.f4668b = f10;
        a aVar = new a(0, f10);
        this.f4672f = aVar;
        this.f4673g = aVar;
        this.f4674h = aVar;
    }

    public static Format n(Format format, long j10) {
        if (format == null) {
            return null;
        }
        if (j10 == 0) {
            return format;
        }
        long j11 = format.f5068a0;
        return j11 != Long.MAX_VALUE ? format.l(j11 + j10) : format;
    }

    public final void A(long j10, ByteBuffer byteBuffer, int i10) {
        e(j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (this.f4673g.f4683b - j10));
            a aVar = this.f4673g;
            byteBuffer.put(aVar.f4685d.f13046a, aVar.c(j10), min);
            i10 -= min;
            j10 += (long) min;
            a aVar2 = this.f4673g;
            if (j10 == aVar2.f4683b) {
                this.f4673g = aVar2.f4686e;
            }
        }
    }

    public final void B(long j10, byte[] bArr, int i10) {
        e(j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (this.f4673g.f4683b - j10));
            a aVar = this.f4673g;
            System.arraycopy(aVar.f4685d.f13046a, aVar.c(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += (long) min;
            a aVar2 = this.f4673g;
            if (j10 == aVar2.f4683b) {
                this.f4673g = aVar2.f4686e;
            }
        }
    }

    public final void C(f fVar, p0.a aVar) {
        f fVar2 = fVar;
        p0.a aVar2 = aVar;
        long j10 = aVar2.f4663b;
        int i10 = 1;
        this.f4671e.M(1);
        B(j10, this.f4671e.f14880a, 1);
        long j11 = j10 + 1;
        byte b10 = this.f4671e.f14880a[0];
        boolean z10 = (b10 & o.f24535b) != 0;
        byte b11 = b10 & Byte.MAX_VALUE;
        g6.b bVar = fVar2.P;
        if (bVar.f8047a == null) {
            bVar.f8047a = new byte[16];
        }
        B(j11, bVar.f8047a, b11);
        long j12 = j11 + ((long) b11);
        if (z10) {
            this.f4671e.M(2);
            B(j12, this.f4671e.f14880a, 2);
            j12 += 2;
            i10 = this.f4671e.J();
        }
        int i11 = i10;
        g6.b bVar2 = fVar2.P;
        int[] iArr = bVar2.f8050d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = bVar2.f8051e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            this.f4671e.M(i12);
            B(j12, this.f4671e.f14880a, i12);
            j12 += (long) i12;
            this.f4671e.Q(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = this.f4671e.J();
                iArr4[i13] = this.f4671e.H();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar2.f4662a - ((int) (j12 - aVar2.f4663b));
        }
        s.a aVar3 = aVar2.f4664c;
        g6.b bVar3 = fVar2.P;
        bVar3.c(i11, iArr2, iArr4, aVar3.f9619b, bVar3.f8047a, aVar3.f9618a, aVar3.f9620c, aVar3.f9621d);
        long j13 = aVar2.f4663b;
        int i14 = (int) (j12 - j13);
        aVar2.f4663b = j13 + ((long) i14);
        aVar2.f4662a -= i14;
    }

    public void D() {
        E(false);
    }

    public void E(boolean z10) {
        this.f4669c.x(z10);
        h(this.f4672f);
        a aVar = new a(0, this.f4668b);
        this.f4672f = aVar;
        this.f4673g = aVar;
        this.f4674h = aVar;
        this.f4679m = 0;
        this.f4667a.c();
    }

    public void F() {
        this.f4669c.y();
        this.f4673g = this.f4672f;
    }

    public boolean G(int i10) {
        return this.f4669c.z(i10);
    }

    public void H(long j10) {
        if (this.f4678l != j10) {
            this.f4678l = j10;
            this.f4676j = true;
        }
    }

    public void I(b bVar) {
        this.f4681o = bVar;
    }

    public void J(int i10) {
        this.f4669c.A(i10);
    }

    public void K() {
        this.f4680n = true;
    }

    public void a(w wVar, int i10) {
        while (i10 > 0) {
            int y10 = y(i10);
            a aVar = this.f4674h;
            wVar.i(aVar.f4685d.f13046a, aVar.c(this.f4679m), y10);
            i10 -= y10;
            x(y10);
        }
    }

    public int b(j jVar, int i10, boolean z10) throws IOException, InterruptedException {
        int y10 = y(i10);
        a aVar = this.f4674h;
        int read = jVar.read(aVar.f4685d.f13046a, aVar.c(this.f4679m), y10);
        if (read != -1) {
            x(read);
            return read;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void c(long j10, int i10, int i11, int i12, @o0 s.a aVar) {
        if (this.f4676j) {
            d(this.f4677k);
        }
        long j11 = j10 + this.f4678l;
        if (this.f4680n) {
            if ((i10 & 1) != 0 && this.f4669c.c(j11)) {
                this.f4680n = false;
            } else {
                return;
            }
        }
        int i13 = i11;
        this.f4669c.d(j11, i10, (this.f4679m - ((long) i13)) - ((long) i12), i13, aVar);
    }

    public void d(Format format) {
        Format n10 = n(format, this.f4678l);
        boolean k10 = this.f4669c.k(n10);
        this.f4677k = format;
        this.f4676j = false;
        b bVar = this.f4681o;
        if (bVar != null && k10) {
            bVar.l(n10);
        }
    }

    public final void e(long j10) {
        while (true) {
            a aVar = this.f4673g;
            if (j10 >= aVar.f4683b) {
                this.f4673g = aVar.f4686e;
            } else {
                return;
            }
        }
    }

    public int f(long j10, boolean z10, boolean z11) {
        return this.f4669c.a(j10, z10, z11);
    }

    public int g() {
        return this.f4669c.b();
    }

    public final void h(a aVar) {
        if (aVar.f4684c) {
            a aVar2 = this.f4674h;
            int i10 = (aVar2.f4684c ? 1 : 0) + (((int) (aVar2.f4682a - aVar.f4682a)) / this.f4668b);
            t7.a[] aVarArr = new t7.a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = aVar.f4685d;
                aVar = aVar.a();
            }
            this.f4667a.a(aVarArr);
        }
    }

    public final void i(long j10) {
        a aVar;
        if (j10 != -1) {
            while (true) {
                aVar = this.f4672f;
                if (j10 < aVar.f4683b) {
                    break;
                }
                this.f4667a.e(aVar.f4685d);
                this.f4672f = this.f4672f.a();
            }
            if (this.f4673g.f4682a < aVar.f4682a) {
                this.f4673g = aVar;
            }
        }
    }

    public void j(long j10, boolean z10, boolean z11) {
        i(this.f4669c.f(j10, z10, z11));
    }

    public void k() {
        i(this.f4669c.g());
    }

    public void l() {
        i(this.f4669c.h());
    }

    public void m(int i10) {
        long i11 = this.f4669c.i(i10);
        this.f4679m = i11;
        if (i11 != 0) {
            a aVar = this.f4672f;
            if (i11 != aVar.f4682a) {
                while (this.f4679m > aVar.f4683b) {
                    aVar = aVar.f4686e;
                }
                a aVar2 = aVar.f4686e;
                h(aVar2);
                a aVar3 = new a(aVar.f4683b, this.f4668b);
                aVar.f4686e = aVar3;
                if (this.f4679m == aVar.f4683b) {
                    aVar = aVar3;
                }
                this.f4674h = aVar;
                if (this.f4673g == aVar2) {
                    this.f4673g = aVar3;
                    return;
                }
                return;
            }
        }
        h(this.f4672f);
        a aVar4 = new a(this.f4679m, this.f4668b);
        this.f4672f = aVar4;
        this.f4673g = aVar4;
        this.f4674h = aVar4;
    }

    public int o() {
        return this.f4669c.l();
    }

    public long p() {
        return this.f4669c.m();
    }

    public long q() {
        return this.f4669c.n();
    }

    public int r() {
        return this.f4669c.p();
    }

    public Format s() {
        return this.f4669c.r();
    }

    public int t() {
        return this.f4669c.s();
    }

    public boolean u() {
        return this.f4669c.t();
    }

    public boolean v() {
        return this.f4669c.u();
    }

    public int w() {
        return this.f4669c.v();
    }

    public final void x(int i10) {
        long j10 = this.f4679m + ((long) i10);
        this.f4679m = j10;
        a aVar = this.f4674h;
        if (j10 == aVar.f4683b) {
            this.f4674h = aVar.f4686e;
        }
    }

    public final int y(int i10) {
        a aVar = this.f4674h;
        if (!aVar.f4684c) {
            aVar.b(this.f4667a.b(), new a(this.f4674h.f4683b, this.f4668b));
        }
        return Math.min(i10, (int) (this.f4674h.f4683b - this.f4679m));
    }

    public int z(c0 c0Var, f fVar, boolean z10, boolean z11, long j10) {
        int w10 = this.f4669c.w(c0Var, fVar, z10, z11, this.f4675i, this.f4670d);
        if (w10 == -5) {
            this.f4675i = c0Var.f4302c;
            return -5;
        } else if (w10 == -4) {
            if (!fVar.n()) {
                if (fVar.R < j10) {
                    fVar.i(Integer.MIN_VALUE);
                }
                if (!fVar.u()) {
                    if (fVar.t()) {
                        C(fVar, this.f4670d);
                    }
                    fVar.r(this.f4670d.f4662a);
                    p0.a aVar = this.f4670d;
                    A(aVar.f4663b, fVar.Q, aVar.f4662a);
                }
            }
            return -4;
        } else if (w10 == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }
}

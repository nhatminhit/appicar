package b7;

import b6.c0;
import b6.v0;
import b7.i0;
import b7.w;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import d.o0;
import g6.f;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t7.g0;
import t7.h0;
import t7.l;
import t7.o;
import t7.p0;
import t7.r0;
import w7.q0;
import w7.s;

public final class w0 implements w, h0.b<c> {

    /* renamed from: e0  reason: collision with root package name */
    public static final int f4718e0 = 1024;
    public final o O;
    public final l.a P;
    @o0
    public final r0 Q;
    public final g0 R;
    public final i0.a S;
    public final TrackGroupArray T;
    public final ArrayList<b> U = new ArrayList<>();
    public final long V;
    public final h0 W = new h0("Loader:SingleSampleMediaPeriod");
    public final Format X;
    public final boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f4719a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f4720b0;

    /* renamed from: c0  reason: collision with root package name */
    public byte[] f4721c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f4722d0;

    public final class b implements r0 {
        public static final int R = 0;
        public static final int S = 1;
        public static final int T = 2;
        public int O;
        public boolean P;

        public b() {
        }

        public void a() throws IOException {
            w0 w0Var = w0.this;
            if (!w0Var.Y) {
                w0Var.W.a();
            }
        }

        public final void b() {
            if (!this.P) {
                w0.this.S.l(s.g(w0.this.X.W), w0.this.X, 0, (Object) null, 0);
                this.P = true;
            }
        }

        public void c() {
            if (this.O == 2) {
                this.O = 1;
            }
        }

        public boolean isReady() {
            return w0.this.f4719a0;
        }

        public int l(long j10) {
            b();
            if (j10 <= 0 || this.O == 2) {
                return 0;
            }
            this.O = 2;
            return 1;
        }

        public int q(c0 c0Var, f fVar, boolean z10) {
            b();
            int i10 = this.O;
            if (i10 == 2) {
                fVar.i(4);
                return -4;
            } else if (z10 || i10 == 0) {
                c0Var.f4302c = w0.this.X;
                this.O = 1;
                return -5;
            } else {
                w0 w0Var = w0.this;
                if (!w0Var.f4719a0) {
                    return -3;
                }
                if (w0Var.f4720b0) {
                    fVar.i(1);
                    fVar.R = 0;
                    if (fVar.u()) {
                        return -4;
                    }
                    fVar.r(w0.this.f4722d0);
                    ByteBuffer byteBuffer = fVar.Q;
                    w0 w0Var2 = w0.this;
                    byteBuffer.put(w0Var2.f4721c0, 0, w0Var2.f4722d0);
                } else {
                    fVar.i(4);
                }
                this.O = 2;
                return -4;
            }
        }
    }

    public static final class c implements h0.e {

        /* renamed from: a  reason: collision with root package name */
        public final o f4723a;

        /* renamed from: b  reason: collision with root package name */
        public final p0 f4724b;

        /* renamed from: c  reason: collision with root package name */
        public byte[] f4725c;

        public c(o oVar, l lVar) {
            this.f4723a = oVar;
            this.f4724b = new p0(lVar);
        }

        public void b() throws IOException, InterruptedException {
            this.f4724b.k();
            try {
                this.f4724b.a(this.f4723a);
                int i10 = 0;
                while (i10 != -1) {
                    int h10 = (int) this.f4724b.h();
                    byte[] bArr = this.f4725c;
                    if (bArr == null) {
                        this.f4725c = new byte[1024];
                    } else if (h10 == bArr.length) {
                        this.f4725c = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    p0 p0Var = this.f4724b;
                    byte[] bArr2 = this.f4725c;
                    i10 = p0Var.read(bArr2, h10, bArr2.length - h10);
                }
            } finally {
                q0.r(this.f4724b);
            }
        }

        public void c() {
        }
    }

    public w0(o oVar, l.a aVar, @o0 r0 r0Var, Format format, long j10, g0 g0Var, i0.a aVar2, boolean z10) {
        this.O = oVar;
        this.P = aVar;
        this.Q = r0Var;
        this.X = format;
        this.V = j10;
        this.R = g0Var;
        this.S = aVar2;
        this.Y = z10;
        this.T = new TrackGroupArray(new TrackGroup(format));
        aVar2.I();
    }

    public long b() {
        return (this.f4719a0 || this.W.i()) ? Long.MIN_VALUE : 0;
    }

    public long c(long j10, v0 v0Var) {
        return j10;
    }

    public boolean d(long j10) {
        if (this.f4719a0 || this.W.i()) {
            return false;
        }
        l a10 = this.P.a();
        r0 r0Var = this.Q;
        if (r0Var != null) {
            a10.d(r0Var);
        }
        this.S.G(this.O, 1, -1, this.X, 0, (Object) null, 0, this.V, this.W.l(new c(this.O, a10), this, this.R.c(1)));
        return true;
    }

    public long e() {
        return this.f4719a0 ? Long.MIN_VALUE : 0;
    }

    public void f(long j10) {
    }

    public long h(com.google.android.exoplayer2.trackselection.f[] fVarArr, boolean[] zArr, r0[] r0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            r0 r0Var = r0VarArr[i10];
            if (r0Var != null && (fVarArr[i10] == null || !zArr[i10])) {
                this.U.remove(r0Var);
                r0VarArr[i10] = null;
            }
            if (r0VarArr[i10] == null && fVarArr[i10] != null) {
                b bVar = new b();
                this.U.add(bVar);
                r0VarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    /* renamed from: i */
    public void k(c cVar, long j10, long j11, boolean z10) {
        this.S.x(cVar.f4723a, cVar.f4724b.i(), cVar.f4724b.j(), 1, -1, (Format) null, 0, (Object) null, 0, this.V, j10, j11, cVar.f4724b.h());
    }

    /* renamed from: l */
    public void g(c cVar, long j10, long j11) {
        this.f4722d0 = (int) cVar.f4724b.h();
        this.f4721c0 = cVar.f4725c;
        this.f4719a0 = true;
        this.f4720b0 = true;
        this.S.A(cVar.f4723a, cVar.f4724b.i(), cVar.f4724b.j(), 1, -1, this.X, 0, (Object) null, 0, this.V, j10, j11, (long) this.f4722d0);
    }

    public /* synthetic */ List m(List list) {
        return v.a(this, list);
    }

    public void n(w.a aVar, long j10) {
        aVar.i(this);
    }

    public void o() throws IOException {
    }

    public long p(long j10) {
        for (int i10 = 0; i10 < this.U.size(); i10++) {
            this.U.get(i10).c();
        }
        return j10;
    }

    /* renamed from: q */
    public h0.c j(c cVar, long j10, long j11, IOException iOException, int i10) {
        h0.c cVar2;
        long a10 = this.R.a(1, j11, iOException, i10);
        int i11 = (a10 > b6.c.f4201b ? 1 : (a10 == b6.c.f4201b ? 0 : -1));
        boolean z10 = i11 == 0 || i10 >= this.R.c(1);
        if (!this.Y || !z10) {
            cVar2 = i11 != 0 ? h0.h(false, a10) : h0.f13085k;
        } else {
            this.f4719a0 = true;
            cVar2 = h0.f13084j;
        }
        this.S.D(cVar.f4723a, cVar.f4724b.i(), cVar.f4724b.j(), 1, -1, this.X, 0, (Object) null, 0, this.V, j10, j11, cVar.f4724b.h(), iOException, !cVar2.c());
        return cVar2;
    }

    public void r() {
        this.W.j();
        this.S.J();
    }

    public long s() {
        if (this.Z) {
            return b6.c.f4201b;
        }
        this.S.L();
        this.Z = true;
        return b6.c.f4201b;
    }

    public TrackGroupArray t() {
        return this.T;
    }

    public void u(long j10, boolean z10) {
    }
}

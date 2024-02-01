package b7;

import b6.c;
import b6.v0;
import b7.w;
import b7.y;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.f;
import d.o0;
import java.io.IOException;
import java.util.List;
import t7.b;

public final class o implements w, w.a {
    public final y O;
    public final y.a P;
    public final b Q;
    public w R;
    public w.a S;
    public long T;
    @o0
    public a U;
    public boolean V;
    public long W = c.f4201b;

    public interface a {
        void a(y.a aVar, IOException iOException);
    }

    public o(y yVar, y.a aVar, b bVar, long j10) {
        this.P = aVar;
        this.Q = bVar;
        this.O = yVar;
        this.T = j10;
    }

    public long b() {
        return this.R.b();
    }

    public long c(long j10, v0 v0Var) {
        return this.R.c(j10, v0Var);
    }

    public boolean d(long j10) {
        w wVar = this.R;
        return wVar != null && wVar.d(j10);
    }

    public long e() {
        return this.R.e();
    }

    public void f(long j10) {
        this.R.f(j10);
    }

    public void g(y.a aVar) {
        long q10 = q(this.T);
        w c10 = this.O.c(aVar, this.Q, q10);
        this.R = c10;
        if (this.S != null) {
            c10.n(this, q10);
        }
    }

    public long h(f[] fVarArr, boolean[] zArr, r0[] r0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.W;
        if (j12 == c.f4201b || j10 != this.T) {
            j11 = j10;
        } else {
            this.W = c.f4201b;
            j11 = j12;
        }
        return this.R.h(fVarArr, zArr, r0VarArr, zArr2, j11);
    }

    public void i(w wVar) {
        this.S.i(this);
    }

    public long j() {
        return this.T;
    }

    public /* synthetic */ List m(List list) {
        return v.a(this, list);
    }

    public void n(w.a aVar, long j10) {
        this.S = aVar;
        w wVar = this.R;
        if (wVar != null) {
            wVar.n(this, q(this.T));
        }
    }

    public void o() throws IOException {
        try {
            w wVar = this.R;
            if (wVar != null) {
                wVar.o();
            } else {
                this.O.h();
            }
        } catch (IOException e10) {
            a aVar = this.U;
            if (aVar == null) {
                throw e10;
            } else if (!this.V) {
                this.V = true;
                aVar.a(this.P, e10);
            }
        }
    }

    public long p(long j10) {
        return this.R.p(j10);
    }

    public final long q(long j10) {
        long j11 = this.W;
        return j11 != c.f4201b ? j11 : j10;
    }

    /* renamed from: r */
    public void k(w wVar) {
        this.S.k(this);
    }

    public long s() {
        return this.R.s();
    }

    public TrackGroupArray t() {
        return this.R.t();
    }

    public void u(long j10, boolean z10) {
        this.R.u(j10, z10);
    }

    public void v(long j10) {
        this.W = j10;
    }

    public void w() {
        w wVar = this.R;
        if (wVar != null) {
            this.O.i(wVar);
        }
    }

    public void x(a aVar) {
        this.U = aVar;
    }
}

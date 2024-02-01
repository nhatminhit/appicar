package b6;

import b7.r0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import d.o0;
import g6.f;
import h6.l;
import java.io.IOException;
import w7.a;
import w7.r;

public abstract class b implements r0, s0 {
    public final int O;
    public t0 P;
    public int Q;
    public int R;
    public r0 S;
    public Format[] T;
    public long U;
    public long V = Long.MIN_VALUE;
    public boolean W;

    public b(int i10) {
        this.O = i10;
    }

    public static boolean J(@o0 l<?> lVar, @o0 DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (lVar == null) {
            return false;
        }
        return lVar.d(drmInitData);
    }

    public void A() {
    }

    public void B(boolean z10) throws i {
    }

    public void C(long j10, boolean z10) throws i {
    }

    public void D() {
    }

    public void E() throws i {
    }

    public void F() throws i {
    }

    public void G(Format[] formatArr, long j10) throws i {
    }

    public final int H(c0 c0Var, f fVar, boolean z10) {
        int q10 = this.S.q(c0Var, fVar, z10);
        if (q10 == -4) {
            if (fVar.n()) {
                this.V = Long.MIN_VALUE;
                return this.W ? -4 : -3;
            }
            long j10 = fVar.R + this.U;
            fVar.R = j10;
            this.V = Math.max(this.V, j10);
        } else if (q10 == -5) {
            Format format = c0Var.f4302c;
            long j11 = format.f5068a0;
            if (j11 != Long.MAX_VALUE) {
                c0Var.f4302c = format.l(j11 + this.U);
            }
        }
        return q10;
    }

    public int I(long j10) {
        return this.S.l(j10 - this.U);
    }

    public final void e() {
        boolean z10 = true;
        if (this.R != 1) {
            z10 = false;
        }
        a.i(z10);
        this.R = 0;
        this.S = null;
        this.T = null;
        this.W = false;
        A();
    }

    public final int f() {
        return this.O;
    }

    public final boolean g() {
        return this.V == Long.MIN_VALUE;
    }

    public final int getState() {
        return this.R;
    }

    public final void h() {
        this.W = true;
    }

    public final s0 i() {
        return this;
    }

    public final void k(Format[] formatArr, r0 r0Var, long j10) throws i {
        a.i(!this.W);
        this.S = r0Var;
        this.V = j10;
        this.T = formatArr;
        this.U = j10;
        G(formatArr, j10);
    }

    public int l() throws i {
        return 0;
    }

    public void n(int i10, @o0 Object obj) throws i {
    }

    public final r0 o() {
        return this.S;
    }

    public /* synthetic */ void p(float f10) {
        q0.a(this, f10);
    }

    public final void q() throws IOException {
        this.S.a();
    }

    public final long r() {
        return this.V;
    }

    public final void reset() {
        a.i(this.R == 0);
        D();
    }

    public final void s(long j10) throws i {
        this.W = false;
        this.V = j10;
        C(j10, false);
    }

    public final void setIndex(int i10) {
        this.Q = i10;
    }

    public final void start() throws i {
        boolean z10 = true;
        if (this.R != 1) {
            z10 = false;
        }
        a.i(z10);
        this.R = 2;
        E();
    }

    public final void stop() throws i {
        a.i(this.R == 2);
        this.R = 1;
        F();
    }

    public final boolean t() {
        return this.W;
    }

    public final void u(t0 t0Var, Format[] formatArr, r0 r0Var, long j10, boolean z10, long j11) throws i {
        a.i(this.R == 0);
        this.P = t0Var;
        this.R = 1;
        B(z10);
        k(formatArr, r0Var, j11);
        C(j10, z10);
    }

    public r v() {
        return null;
    }

    public final t0 w() {
        return this.P;
    }

    public final int x() {
        return this.Q;
    }

    public final Format[] y() {
        return this.T;
    }

    public final boolean z() {
        return g() ? this.W : this.S.isReady();
    }
}

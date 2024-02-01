package b6;

import b7.r0;
import com.google.android.exoplayer2.Format;
import d.o0;
import java.io.IOException;
import w7.a;
import w7.r;

public abstract class i0 implements r0, s0 {
    public t0 O;
    public int P;
    public int Q;
    public r0 R;
    public boolean S;

    public void A() throws i {
    }

    public void B() throws i {
    }

    public boolean a() {
        return true;
    }

    public int b(Format format) throws i {
        return 0;
    }

    public final t0 c() {
        return this.O;
    }

    public final int d() {
        return this.P;
    }

    public final void e() {
        boolean z10 = true;
        if (this.Q != 1) {
            z10 = false;
        }
        a.i(z10);
        this.Q = 0;
        this.R = null;
        this.S = false;
        j();
    }

    public final int f() {
        return 6;
    }

    public final boolean g() {
        return true;
    }

    public final int getState() {
        return this.Q;
    }

    public final void h() {
        this.S = true;
    }

    public final s0 i() {
        return this;
    }

    public boolean isReady() {
        return true;
    }

    public void j() {
    }

    public final void k(Format[] formatArr, r0 r0Var, long j10) throws i {
        a.i(!this.S);
        this.R = r0Var;
        y(j10);
    }

    public int l() throws i {
        return 0;
    }

    public void n(int i10, @o0 Object obj) throws i {
    }

    public final r0 o() {
        return this.R;
    }

    public /* synthetic */ void p(float f10) {
        q0.a(this, f10);
    }

    public final void q() throws IOException {
    }

    public long r() {
        return Long.MIN_VALUE;
    }

    public final void reset() {
        a.i(this.Q == 0);
        z();
    }

    public final void s(long j10) throws i {
        this.S = false;
        x(j10, false);
    }

    public final void setIndex(int i10) {
        this.P = i10;
    }

    public final void start() throws i {
        boolean z10 = true;
        if (this.Q != 1) {
            z10 = false;
        }
        a.i(z10);
        this.Q = 2;
        A();
    }

    public final void stop() throws i {
        a.i(this.Q == 2);
        this.Q = 1;
        B();
    }

    public final boolean t() {
        return this.S;
    }

    public final void u(t0 t0Var, Format[] formatArr, r0 r0Var, long j10, boolean z10, long j11) throws i {
        a.i(this.Q == 0);
        this.O = t0Var;
        this.Q = 1;
        w(z10);
        k(formatArr, r0Var, j11);
        x(j10, z10);
    }

    public r v() {
        return null;
    }

    public void w(boolean z10) throws i {
    }

    public void x(long j10, boolean z10) throws i {
    }

    public void y(long j10) throws i {
    }

    public void z() {
    }
}

package u2;

import a3.h;
import d.m0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import u2.n2;

public final class f2 implements h {
    public final h O;
    public final n2.f P;
    public final String Q;
    public final List<Object> R = new ArrayList();
    public final Executor S;

    public f2(@m0 h hVar, @m0 n2.f fVar, String str, @m0 Executor executor) {
        this.O = hVar;
        this.P = fVar;
        this.Q = str;
        this.S = executor;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.P.a(this.Q, this.R);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.P.a(this.Q, this.R);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.P.a(this.Q, this.R);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.P.a(this.Q, this.R);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.P.a(this.Q, this.R);
    }

    public void B0(int i10, byte[] bArr) {
        t(i10, bArr);
        this.O.B0(i10, bArr);
    }

    public String E0() {
        this.S.execute(new d2(this));
        return this.O.E0();
    }

    public void F(int i10, String str) {
        t(i10, str);
        this.O.F(i10, str);
    }

    public long I1() {
        this.S.execute(new c2(this));
        return this.O.I1();
    }

    public int K() {
        this.S.execute(new a2(this));
        return this.O.K();
    }

    public void R(int i10, double d10) {
        t(i10, Double.valueOf(d10));
        this.O.R(i10, d10);
    }

    public void a1(int i10) {
        t(i10, this.R.toArray());
        this.O.a1(i10);
    }

    public void close() throws IOException {
        this.O.close();
    }

    public void e() {
        this.S.execute(new b2(this));
        this.O.e();
    }

    public void q0(int i10, long j10) {
        t(i10, Long.valueOf(j10));
        this.O.q0(i10, j10);
    }

    public final void t(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 >= this.R.size()) {
            for (int size = this.R.size(); size <= i11; size++) {
                this.R.add((Object) null);
            }
        }
        this.R.set(i11, obj);
    }

    public long x() {
        this.S.execute(new e2(this));
        return this.O.x();
    }

    public void z1() {
        this.R.clear();
        this.O.z1();
    }
}

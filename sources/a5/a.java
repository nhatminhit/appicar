package a5;

import h5.h;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import w4.i;
import w4.o;
import w4.u;

public class a extends h {
    public d R;
    public boolean S;
    public boolean T;
    @Deprecated
    public boolean U;
    public e V;
    public d W;
    public int X;

    public a(i iVar, d dVar, boolean z10, boolean z11) {
        super(iVar, false);
        this.R = dVar;
        this.W = dVar;
        this.V = e.y(dVar);
        this.T = z10;
        this.S = z11;
    }

    public void E2(Object obj) throws IOException {
        if (this.W != null) {
            this.P.E2(obj);
        }
    }

    public void F2(Object obj) throws IOException {
        if (this.W != null) {
            this.P.F2(obj);
        }
    }

    public void G2(String str) throws IOException {
        if (this.W != null) {
            this.P.G2(str);
        }
    }

    public void H2(char c10) throws IOException {
        if (n3()) {
            this.P.H2(c10);
        }
    }

    public void I2(String str) throws IOException {
        if (n3()) {
            this.P.I2(str);
        }
    }

    public void J2(String str, int i10, int i11) throws IOException {
        if (n3()) {
            this.P.J2(str, i10, i11);
        }
    }

    public void K2(u uVar) throws IOException {
        if (n3()) {
            this.P.K2(uVar);
        }
    }

    public void L2(char[] cArr, int i10, int i11) throws IOException {
        if (n3()) {
            this.P.L2(cArr, i10, i11);
        }
    }

    public void M2(byte[] bArr, int i10, int i11) throws IOException {
        if (n3()) {
            this.P.M2(bArr, i10, i11);
        }
    }

    public void N2(String str) throws IOException {
        if (n3()) {
            this.P.N2(str);
        }
    }

    public void O2(String str, int i10, int i11) throws IOException {
        if (n3()) {
            this.P.O2(str, i10, i11);
        }
    }

    public void Q2(char[] cArr, int i10, int i11) throws IOException {
        if (n3()) {
            this.P.Q2(cArr, i10, i11);
        }
    }

    public void R2() throws IOException {
        d dVar = this.W;
        if (dVar == null) {
            this.V = this.V.w((d) null, false);
            return;
        }
        d dVar2 = d.f198a;
        if (dVar == dVar2) {
            this.V = this.V.w(dVar, true);
            this.P.R2();
            return;
        }
        d t10 = this.V.t(dVar);
        this.W = t10;
        if (t10 == null) {
            this.V = this.V.w((d) null, false);
            return;
        }
        if (t10 != dVar2) {
            this.W = t10.d();
        }
        d dVar3 = this.W;
        if (dVar3 == dVar2) {
            l3();
            this.V = this.V.w(this.W, true);
            this.P.R2();
            return;
        }
        this.V = this.V.w(dVar3, false);
    }

    public void S2(int i10) throws IOException {
        d dVar = this.W;
        if (dVar == null) {
            this.V = this.V.w((d) null, false);
            return;
        }
        d dVar2 = d.f198a;
        if (dVar == dVar2) {
            this.V = this.V.w(dVar, true);
            this.P.S2(i10);
            return;
        }
        d t10 = this.V.t(dVar);
        this.W = t10;
        if (t10 == null) {
            this.V = this.V.w((d) null, false);
            return;
        }
        if (t10 != dVar2) {
            this.W = t10.d();
        }
        d dVar3 = this.W;
        if (dVar3 == dVar2) {
            l3();
            this.V = this.V.w(this.W, true);
            this.P.S2(i10);
            return;
        }
        this.V = this.V.w(dVar3, false);
    }

    public o T0() {
        return this.V;
    }

    public void T2(Object obj) throws IOException {
        d dVar = this.W;
        if (dVar == null) {
            this.V = this.V.w((d) null, false);
            return;
        }
        d dVar2 = d.f198a;
        if (dVar == dVar2) {
            this.V = this.V.w(dVar, true);
            this.P.T2(obj);
            return;
        }
        d t10 = this.V.t(dVar);
        this.W = t10;
        if (t10 == null) {
            this.V = this.V.w((d) null, false);
            return;
        }
        if (t10 != dVar2) {
            this.W = t10.d();
        }
        d dVar3 = this.W;
        if (dVar3 == dVar2) {
            l3();
            this.V = this.V.w(this.W, true);
            this.P.T2(obj);
            return;
        }
        this.V = this.V.w(dVar3, false);
    }

    public void U2(Object obj, int i10) throws IOException {
        d dVar = this.W;
        if (dVar == null) {
            this.V = this.V.w((d) null, false);
            return;
        }
        d dVar2 = d.f198a;
        if (dVar == dVar2) {
            this.V = this.V.w(dVar, true);
            this.P.U2(obj, i10);
            return;
        }
        d t10 = this.V.t(dVar);
        this.W = t10;
        if (t10 == null) {
            this.V = this.V.w((d) null, false);
            return;
        }
        if (t10 != dVar2) {
            this.W = t10.d();
        }
        d dVar3 = this.W;
        if (dVar3 == dVar2) {
            l3();
            this.V = this.V.w(this.W, true);
            this.P.U2(obj, i10);
            return;
        }
        this.V = this.V.w(dVar3, false);
    }

    public void V2() throws IOException {
        d dVar = this.W;
        if (dVar == null) {
            this.V = this.V.x(dVar, false);
            return;
        }
        d dVar2 = d.f198a;
        if (dVar == dVar2) {
            this.V = this.V.x(dVar, true);
            this.P.V2();
            return;
        }
        d t10 = this.V.t(dVar);
        if (t10 != null) {
            if (t10 != dVar2) {
                t10 = t10.e();
            }
            if (t10 == dVar2) {
                l3();
                this.V = this.V.x(t10, true);
                this.P.V2();
                return;
            }
            this.V = this.V.x(t10, false);
        }
    }

    public void W2(Object obj) throws IOException {
        d dVar = this.W;
        if (dVar == null) {
            this.V = this.V.x(dVar, false);
            return;
        }
        d dVar2 = d.f198a;
        if (dVar == dVar2) {
            this.V = this.V.x(dVar, true);
            this.P.W2(obj);
            return;
        }
        d t10 = this.V.t(dVar);
        if (t10 != null) {
            if (t10 != dVar2) {
                t10 = t10.e();
            }
            if (t10 == dVar2) {
                l3();
                this.V = this.V.x(t10, true);
                this.P.W2(obj);
                return;
            }
            this.V = this.V.x(t10, false);
        }
    }

    public int X1(w4.a aVar, InputStream inputStream, int i10) throws IOException {
        if (k3()) {
            return this.P.X1(aVar, inputStream, i10);
        }
        return -1;
    }

    public void X2(Object obj, int i10) throws IOException {
        d dVar = this.W;
        if (dVar == null) {
            this.V = this.V.x(dVar, false);
            return;
        }
        d dVar2 = d.f198a;
        if (dVar == dVar2) {
            this.V = this.V.x(dVar, true);
            this.P.X2(obj, i10);
            return;
        }
        d t10 = this.V.t(dVar);
        if (t10 != null) {
            if (t10 != dVar2) {
                t10 = t10.e();
            }
            if (t10 == dVar2) {
                l3();
                this.V = this.V.x(t10, true);
                this.P.X2(obj, i10);
                return;
            }
            this.V = this.V.x(t10, false);
        }
    }

    public void Y1(w4.a aVar, byte[] bArr, int i10, int i11) throws IOException {
        if (k3()) {
            this.P.Y1(aVar, bArr, i10, i11);
        }
    }

    public void Y2(Reader reader, int i10) throws IOException {
        d dVar = this.W;
        if (dVar != null) {
            d dVar2 = d.f198a;
            if (dVar != dVar2) {
                d t10 = this.V.t(dVar);
                if (t10 != null) {
                    if (t10 == dVar2 || t10.t(reader, i10)) {
                        l3();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P.Y2(reader, i10);
        }
    }

    public void Z2(String str) throws IOException {
        d dVar = this.W;
        if (dVar != null) {
            d dVar2 = d.f198a;
            if (dVar != dVar2) {
                d t10 = this.V.t(dVar);
                if (t10 != null) {
                    if (t10 == dVar2 || t10.u(str)) {
                        l3();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P.Z2(str);
        }
    }

    public void a3(u uVar) throws IOException {
        d dVar = this.W;
        if (dVar != null) {
            d dVar2 = d.f198a;
            if (dVar != dVar2) {
                d t10 = this.V.t(dVar);
                if (t10 != null) {
                    if (t10 == dVar2 || t10.u(uVar.getValue())) {
                        l3();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P.a3(uVar);
        }
    }

    public void b3(char[] cArr, int i10, int i11) throws IOException {
        d dVar = this.W;
        if (dVar != null) {
            d dVar2 = d.f198a;
            if (dVar != dVar2) {
                String str = new String(cArr, i10, i11);
                d t10 = this.V.t(this.W);
                if (t10 != null) {
                    if (t10 == dVar2 || t10.u(str)) {
                        l3();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P.b3(cArr, i10, i11);
        }
    }

    public void c2(boolean z10) throws IOException {
        d dVar = this.W;
        if (dVar != null) {
            d dVar2 = d.f198a;
            if (dVar != dVar2) {
                d t10 = this.V.t(dVar);
                if (t10 != null) {
                    if (t10 == dVar2 || t10.g(z10)) {
                        l3();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P.c2(z10);
        }
    }

    public void e3(Object obj) throws IOException {
        if (this.W != null) {
            this.P.e3(obj);
        }
    }

    public void f2() throws IOException {
        e u10 = this.V.u(this.P);
        this.V = u10;
        if (u10 != null) {
            this.W = u10.A();
        }
    }

    public void g2() throws IOException {
        e v10 = this.V.v(this.P);
        this.V = v10;
        if (v10 != null) {
            this.W = v10.A();
        }
    }

    public void h2(long j10) throws IOException {
        i2(Long.toString(j10));
    }

    public void h3(byte[] bArr, int i10, int i11) throws IOException {
        if (n3()) {
            this.P.h3(bArr, i10, i11);
        }
    }

    public void i2(String str) throws IOException {
        d F = this.V.F(str);
        if (F == null) {
            this.W = null;
            return;
        }
        d dVar = d.f198a;
        if (F == dVar) {
            this.W = F;
            this.P.i2(str);
            return;
        }
        d q10 = F.q(str);
        this.W = q10;
        if (q10 == dVar) {
            m3();
        }
    }

    public void j2(u uVar) throws IOException {
        d F = this.V.F(uVar.getValue());
        if (F == null) {
            this.W = null;
            return;
        }
        d dVar = d.f198a;
        if (F == dVar) {
            this.W = F;
            this.P.j2(uVar);
            return;
        }
        d q10 = F.q(uVar.getValue());
        this.W = q10;
        if (q10 == dVar) {
            m3();
        }
    }

    public void k2() throws IOException {
        d dVar = this.W;
        if (dVar != null) {
            d dVar2 = d.f198a;
            if (dVar != dVar2) {
                d t10 = this.V.t(dVar);
                if (t10 != null) {
                    if (t10 == dVar2 || t10.j()) {
                        l3();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P.k2();
        }
    }

    public boolean k3() throws IOException {
        d dVar = this.W;
        if (dVar == null) {
            return false;
        }
        if (dVar == d.f198a) {
            return true;
        }
        if (!dVar.f()) {
            return false;
        }
        l3();
        return true;
    }

    public void l3() throws IOException {
        this.X++;
        if (this.T) {
            this.V.I(this.P);
        }
        if (!this.S) {
            this.V.G();
        }
    }

    public void m2(double d10) throws IOException {
        d dVar = this.W;
        if (dVar != null) {
            d dVar2 = d.f198a;
            if (dVar != dVar2) {
                d t10 = this.V.t(dVar);
                if (t10 != null) {
                    if (t10 == dVar2 || t10.k(d10)) {
                        l3();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P.m2(d10);
        }
    }

    public void m3() throws IOException {
        this.X++;
        if (this.T) {
            this.V.I(this.P);
        } else if (this.U) {
            this.V.H(this.P);
        }
        if (!this.S) {
            this.V.G();
        }
    }

    public void n2(float f10) throws IOException {
        d dVar = this.W;
        if (dVar != null) {
            d dVar2 = d.f198a;
            if (dVar != dVar2) {
                d t10 = this.V.t(dVar);
                if (t10 != null) {
                    if (t10 == dVar2 || t10.l(f10)) {
                        l3();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P.n2(f10);
        }
    }

    public boolean n3() throws IOException {
        d dVar = this.W;
        if (dVar == null) {
            return false;
        }
        if (dVar == d.f198a) {
            return true;
        }
        if (!dVar.r()) {
            return false;
        }
        l3();
        return true;
    }

    public void o2(int i10) throws IOException {
        d dVar = this.W;
        if (dVar != null) {
            d dVar2 = d.f198a;
            if (dVar != dVar2) {
                d t10 = this.V.t(dVar);
                if (t10 != null) {
                    if (t10 == dVar2 || t10.m(i10)) {
                        l3();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P.o2(i10);
        }
    }

    public d o3() {
        return this.R;
    }

    public void p2(long j10) throws IOException {
        d dVar = this.W;
        if (dVar != null) {
            d dVar2 = d.f198a;
            if (dVar != dVar2) {
                d t10 = this.V.t(dVar);
                if (t10 != null) {
                    if (t10 == dVar2 || t10.n(j10)) {
                        l3();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P.p2(j10);
        }
    }

    public o p3() {
        return this.V;
    }

    public void q2(String str) throws IOException, UnsupportedOperationException {
        d dVar = this.W;
        if (dVar != null) {
            d dVar2 = d.f198a;
            if (dVar != dVar2) {
                d t10 = this.V.t(dVar);
                if (t10 != null) {
                    if (t10 == dVar2 || t10.r()) {
                        l3();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P.q2(str);
        }
    }

    public int q3() {
        return this.X;
    }

    public void r2(BigDecimal bigDecimal) throws IOException {
        d dVar = this.W;
        if (dVar != null) {
            d dVar2 = d.f198a;
            if (dVar != dVar2) {
                d t10 = this.V.t(dVar);
                if (t10 != null) {
                    if (t10 == dVar2 || t10.o(bigDecimal)) {
                        l3();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P.r2(bigDecimal);
        }
    }

    public void s2(BigInteger bigInteger) throws IOException {
        d dVar = this.W;
        if (dVar != null) {
            d dVar2 = d.f198a;
            if (dVar != dVar2) {
                d t10 = this.V.t(dVar);
                if (t10 != null) {
                    if (t10 == dVar2 || t10.p(bigInteger)) {
                        l3();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P.s2(bigInteger);
        }
    }

    public void t2(short s10) throws IOException {
        d dVar = this.W;
        if (dVar != null) {
            d dVar2 = d.f198a;
            if (dVar != dVar2) {
                d t10 = this.V.t(dVar);
                if (t10 != null) {
                    if (t10 == dVar2 || t10.m(s10)) {
                        l3();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P.t2(s10);
        }
    }

    public void u2(char[] cArr, int i10, int i11) throws IOException, UnsupportedOperationException {
        d dVar = this.W;
        if (dVar != null) {
            d dVar2 = d.f198a;
            if (dVar != dVar2) {
                d t10 = this.V.t(dVar);
                if (t10 != null) {
                    if (t10 == dVar2 || t10.r()) {
                        l3();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P.u2(cArr, i10, i11);
        }
    }
}

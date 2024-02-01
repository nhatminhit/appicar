package h5;

import c5.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import w4.a;
import w4.a0;
import w4.b0;
import w4.d;
import w4.i;
import w4.l;
import w4.o;
import w4.s;
import w4.t;
import w4.u;

public class h extends i {
    public i P;
    public boolean Q;

    public h(i iVar) {
        this(iVar, true);
    }

    public h(i iVar, boolean z10) {
        this.P = iVar;
        this.Q = z10;
    }

    public void A1(Object obj) {
        this.P.A1(obj);
    }

    public void E2(Object obj) throws IOException {
        this.P.E2(obj);
    }

    @Deprecated
    public i F1(int i10) {
        this.P.F1(i10);
        return this;
    }

    public void F2(Object obj) throws IOException {
        this.P.F2(obj);
    }

    public void G2(String str) throws IOException {
        this.P.G2(str);
    }

    public int H0() {
        return this.P.H0();
    }

    public void H2(char c10) throws IOException {
        this.P.H2(c10);
    }

    public void I2(String str) throws IOException {
        this.P.I2(str);
    }

    public void J2(String str, int i10, int i11) throws IOException {
        this.P.J2(str, i10, i11);
    }

    public void K2(u uVar) throws IOException {
        this.P.K2(uVar);
    }

    public i L1(int i10) {
        this.P.L1(i10);
        return this;
    }

    public void L2(char[] cArr, int i10, int i11) throws IOException {
        this.P.L2(cArr, i10, i11);
    }

    public void M2(byte[] bArr, int i10, int i11) throws IOException {
        this.P.M2(bArr, i10, i11);
    }

    public void N(l lVar) throws IOException {
        if (this.Q) {
            this.P.N(lVar);
        } else {
            super.N(lVar);
        }
    }

    public i N1(t tVar) {
        this.P.N1(tVar);
        return this;
    }

    public void N2(String str) throws IOException {
        this.P.N2(str);
    }

    public i O1(u uVar) {
        this.P.O1(uVar);
        return this;
    }

    public void O2(String str, int i10, int i11) throws IOException {
        this.P.O2(str, i10, i11);
    }

    public void P(l lVar) throws IOException {
        if (this.Q) {
            this.P.P(lVar);
        } else {
            super.P(lVar);
        }
    }

    public void P1(d dVar) {
        this.P.P1(dVar);
    }

    public i Q(i.b bVar) {
        this.P.Q(bVar);
        return this;
    }

    public i Q1() {
        this.P.Q1();
        return this;
    }

    public void Q2(char[] cArr, int i10, int i11) throws IOException {
        this.P.Q2(cArr, i10, i11);
    }

    public void R1(double[] dArr, int i10, int i11) throws IOException {
        this.P.R1(dArr, i10, i11);
    }

    public void R2() throws IOException {
        this.P.R2();
    }

    public void S1(int[] iArr, int i10, int i11) throws IOException {
        this.P.S1(iArr, i10, i11);
    }

    public void S2(int i10) throws IOException {
        this.P.S2(i10);
    }

    public o T0() {
        return this.P.T0();
    }

    public void T1(long[] jArr, int i10, int i11) throws IOException {
        this.P.T1(jArr, i10, i11);
    }

    public void T2(Object obj) throws IOException {
        this.P.T2(obj);
    }

    public void U1(String[] strArr, int i10, int i11) throws IOException {
        this.P.U1(strArr, i10, i11);
    }

    public void U2(Object obj, int i10) throws IOException {
        this.P.U2(obj, i10);
    }

    public void V2() throws IOException {
        this.P.V2();
    }

    public Object W0() {
        return this.P.W0();
    }

    public void W2(Object obj) throws IOException {
        this.P.W2(obj);
    }

    public t X0() {
        return this.P.X0();
    }

    public int X1(a aVar, InputStream inputStream, int i10) throws IOException {
        return this.P.X1(aVar, inputStream, i10);
    }

    public void X2(Object obj, int i10) throws IOException {
        this.P.X2(obj, i10);
    }

    public i Y(i.b bVar) {
        this.P.Y(bVar);
        return this;
    }

    public void Y1(a aVar, byte[] bArr, int i10, int i11) throws IOException {
        this.P.Y1(aVar, bArr, i10, i11);
    }

    public void Y2(Reader reader, int i10) throws IOException {
        this.P.Y2(reader, i10);
    }

    public d Z0() {
        return this.P.Z0();
    }

    public void Z2(String str) throws IOException {
        this.P.Z2(str);
    }

    public b a0() {
        return this.P.a0();
    }

    public void a3(u uVar) throws IOException {
        this.P.a3(uVar);
    }

    public void b3(char[] cArr, int i10, int i11) throws IOException {
        this.P.b3(cArr, i10, i11);
    }

    public s c0() {
        return this.P.c0();
    }

    public void c2(boolean z10) throws IOException {
        this.P.c2(z10);
    }

    public void close() throws IOException {
        this.P.close();
    }

    public void d3(a0 a0Var) throws IOException {
        if (this.Q) {
            this.P.d3(a0Var);
        } else if (a0Var == null) {
            k2();
        } else {
            s c02 = c0();
            if (c02 != null) {
                c02.g(this, a0Var);
                return;
            }
            throw new IllegalStateException("No ObjectCodec defined");
        }
    }

    public Object e0() {
        return this.P.e0();
    }

    public void e2(Object obj) throws IOException {
        this.P.e2(obj);
    }

    public void e3(Object obj) throws IOException {
        this.P.e3(obj);
    }

    public boolean f1(i.b bVar) {
        return this.P.f1(bVar);
    }

    public void f2() throws IOException {
        this.P.f2();
    }

    public void flush() throws IOException {
        this.P.flush();
    }

    public void g2() throws IOException {
        this.P.g2();
    }

    public i h1(int i10, int i11) {
        this.P.h1(i10, i11);
        return this;
    }

    public void h2(long j10) throws IOException {
        this.P.h2(j10);
    }

    public void h3(byte[] bArr, int i10, int i11) throws IOException {
        this.P.h3(bArr, i10, i11);
    }

    public void i2(String str) throws IOException {
        this.P.i2(str);
    }

    public i i3() {
        return this.P;
    }

    public boolean isClosed() {
        return this.P.isClosed();
    }

    public void j2(u uVar) throws IOException {
        this.P.j2(uVar);
    }

    @Deprecated
    public i j3() {
        return this.P;
    }

    public int k0() {
        return this.P.k0();
    }

    public void k2() throws IOException {
        this.P.k2();
    }

    public boolean l() {
        return this.P.l();
    }

    public boolean m(d dVar) {
        return this.P.m(dVar);
    }

    public i m1(int i10, int i11) {
        this.P.m1(i10, i11);
        return this;
    }

    public void m2(double d10) throws IOException {
        this.P.m2(d10);
    }

    public void n2(float f10) throws IOException {
        this.P.n2(f10);
    }

    public boolean o() {
        return this.P.o();
    }

    public void o2(int i10) throws IOException {
        this.P.o2(i10);
    }

    public i p1(b bVar) {
        this.P.p1(bVar);
        return this;
    }

    public void p2(long j10) throws IOException {
        this.P.p2(j10);
    }

    public boolean q() {
        return this.P.q();
    }

    public void q2(String str) throws IOException, UnsupportedOperationException {
        this.P.q2(str);
    }

    public i r1(s sVar) {
        this.P.r1(sVar);
        return this;
    }

    public void r2(BigDecimal bigDecimal) throws IOException {
        this.P.r2(bigDecimal);
    }

    public void s2(BigInteger bigInteger) throws IOException {
        this.P.s2(bigInteger);
    }

    public boolean t() {
        return this.P.t();
    }

    public void t2(short s10) throws IOException {
        this.P.t2(s10);
    }

    public void u2(char[] cArr, int i10, int i11) throws IOException, UnsupportedOperationException {
        this.P.u2(cArr, i10, i11);
    }

    public b0 version() {
        return this.P.version();
    }

    public boolean w() {
        return this.P.w();
    }

    public void writeObject(Object obj) throws IOException {
        if (this.Q) {
            this.P.writeObject(obj);
        } else if (obj == null) {
            k2();
        } else {
            s c02 = c0();
            if (c02 != null) {
                c02.q(this, obj);
            } else {
                k(obj);
            }
        }
    }

    public int z0() {
        return this.P.z0();
    }
}

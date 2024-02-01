package a5;

import h5.i;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import w4.a;
import w4.j;
import w4.l;
import w4.o;
import w4.p;

public class b extends i {
    public d V;
    public boolean W;
    public boolean X;
    @Deprecated
    public boolean Y;
    public p Z;

    /* renamed from: a0  reason: collision with root package name */
    public p f192a0;

    /* renamed from: b0  reason: collision with root package name */
    public e f193b0;

    /* renamed from: c0  reason: collision with root package name */
    public e f194c0;

    /* renamed from: d0  reason: collision with root package name */
    public d f195d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f196e0;

    public b(l lVar, d dVar, boolean z10, boolean z11) {
        super(lVar);
        this.V = dVar;
        this.f195d0 = dVar;
        this.f193b0 = e.y(dVar);
        this.X = z10;
        this.W = z11;
    }

    public float A1() throws IOException {
        return this.U.A1();
    }

    public p D2() throws IOException {
        p D2;
        p e32;
        e x10;
        p e33;
        d q10;
        p e34;
        d t10;
        p pVar;
        if (this.W || (pVar = this.Z) == null || this.f194c0 != null || !pVar.k() || this.f193b0.C() || this.X || this.f195d0 != d.f198a) {
            e eVar = this.f194c0;
            if (eVar != null) {
                do {
                    p D = eVar.D();
                    if (D != null) {
                        this.Z = D;
                        return D;
                    }
                    e eVar2 = this.f193b0;
                    if (eVar == eVar2) {
                        this.f194c0 = null;
                        if (eVar.k()) {
                            D2 = this.U.Z0();
                            this.Z = D2;
                            return D2;
                        }
                    } else {
                        eVar = eVar2.z(eVar);
                        this.f194c0 = eVar;
                    }
                } while (eVar != null);
                throw k("Unexpected problem: chain of filtered context broken");
            }
            D2 = this.U.D2();
            if (D2 == null) {
                this.Z = D2;
                return D2;
            }
            int e10 = D2.e();
            if (e10 != 1) {
                if (e10 != 2) {
                    if (e10 == 3) {
                        d dVar = this.f195d0;
                        d dVar2 = d.f198a;
                        if (dVar != dVar2) {
                            if (!(dVar == null || (dVar = this.f193b0.t(dVar)) == null)) {
                                if (dVar != dVar2) {
                                    dVar = dVar.d();
                                }
                                this.f195d0 = dVar;
                                if (dVar != dVar2) {
                                    e w10 = this.f193b0.w(dVar, false);
                                    this.f193b0 = w10;
                                    if (this.X && (e33 = e3(w10)) != null) {
                                        this.Z = e33;
                                        return e33;
                                    }
                                    return d3();
                                }
                            }
                            this.U.Z2();
                            return d3();
                        }
                        x10 = this.f193b0.w(dVar, true);
                    } else if (e10 != 4) {
                        if (e10 != 5) {
                            d dVar3 = this.f195d0;
                            d dVar4 = d.f198a;
                            if (dVar3 == dVar4) {
                                this.Z = D2;
                                return D2;
                            } else if (dVar3 != null && (((t10 = this.f193b0.t(dVar3)) == dVar4 || (t10 != null && t10.v(this.U))) && f3())) {
                                this.Z = D2;
                                return D2;
                            }
                        } else {
                            String X0 = this.U.X0();
                            d F = this.f193b0.F(X0);
                            d dVar5 = d.f198a;
                            if (F == dVar5) {
                                this.f195d0 = F;
                                if (!this.X && this.Y && !this.f193b0.C()) {
                                    D2 = this.f193b0.D();
                                    this.f194c0 = this.f193b0;
                                }
                                this.Z = D2;
                                return D2;
                            } else if (F == null || (q10 = F.q(X0)) == null) {
                                this.U.D2();
                                this.U.Z2();
                            } else {
                                this.f195d0 = q10;
                                if (q10 == dVar5) {
                                    if (!f3()) {
                                        this.U.D2();
                                        this.U.Z2();
                                    } else if (this.X) {
                                        this.Z = D2;
                                        return D2;
                                    }
                                }
                                if (this.X && (e34 = e3(this.f193b0)) != null) {
                                    this.Z = e34;
                                    return e34;
                                }
                            }
                        }
                        return d3();
                    }
                }
                boolean C = this.f193b0.C();
                d A = this.f193b0.A();
                if (!(A == null || A == d.f198a)) {
                    A.b();
                }
                e B = this.f193b0.e();
                this.f193b0 = B;
                this.f195d0 = B.A();
                if (C) {
                    this.Z = D2;
                    return D2;
                }
                return d3();
            }
            d dVar6 = this.f195d0;
            d dVar7 = d.f198a;
            if (dVar6 != dVar7) {
                if (!(dVar6 == null || (dVar6 = this.f193b0.t(dVar6)) == null)) {
                    if (dVar6 != dVar7) {
                        dVar6 = dVar6.e();
                    }
                    this.f195d0 = dVar6;
                    if (dVar6 != dVar7) {
                        e x11 = this.f193b0.x(dVar6, false);
                        this.f193b0 = x11;
                        if (this.X && (e32 = e3(x11)) != null) {
                            this.Z = e32;
                            return e32;
                        }
                        return d3();
                    }
                }
                this.U.Z2();
                return d3();
            }
            x10 = this.f193b0.x(dVar6, true);
            this.f193b0 = x10;
            this.Z = D2;
            return D2;
        }
        this.Z = null;
        return null;
    }

    public p E2() throws IOException {
        p D2 = D2();
        return D2 == p.FIELD_NAME ? D2() : D2;
    }

    public void F2(String str) {
        throw new UnsupportedOperationException("Can not currently override name during filtering read");
    }

    public byte H0() throws IOException {
        return this.U.H0();
    }

    public int J2(a aVar, OutputStream outputStream) throws IOException {
        return this.U.J2(aVar, outputStream);
    }

    public int N1() throws IOException {
        return this.U.N1();
    }

    public p O1() {
        return this.f192a0;
    }

    public p P() {
        return this.Z;
    }

    public long P1() throws IOException {
        return this.U.P1();
    }

    public final int Q() {
        p pVar = this.Z;
        if (pVar == null) {
            return 0;
        }
        return pVar.e();
    }

    public l.b R1() throws IOException {
        return this.U.R1();
    }

    public Number S1() throws IOException {
        return this.U.S1();
    }

    public o U1() {
        return b3();
    }

    public j W0() {
        return this.U.W0();
    }

    public short W1() throws IOException {
        return this.U.W1();
    }

    public String X0() throws IOException {
        o b32 = b3();
        p pVar = this.Z;
        if (pVar != p.START_OBJECT && pVar != p.START_ARRAY) {
            return b32.b();
        }
        o e10 = b32.e();
        if (e10 == null) {
            return null;
        }
        return e10.b();
    }

    public String Y1() throws IOException {
        return this.U.Y1();
    }

    public p Z0() {
        return this.Z;
    }

    public char[] Z1() throws IOException {
        return this.U.Z1();
    }

    public l Z2() throws IOException {
        p pVar = this.Z;
        if (pVar != p.START_OBJECT && pVar != p.START_ARRAY) {
            return this;
        }
        int i10 = 1;
        while (true) {
            p D2 = D2();
            if (D2 == null) {
                return this;
            }
            if (D2.m()) {
                i10++;
            } else if (D2.l() && i10 - 1 == 0) {
                return this;
            }
        }
    }

    public int a2() throws IOException {
        return this.U.a2();
    }

    public int b2() throws IOException {
        return this.U.b2();
    }

    public o b3() {
        e eVar = this.f194c0;
        return eVar != null ? eVar : this.f193b0;
    }

    public j c2() {
        return this.U.c2();
    }

    public final p c3(e eVar) throws IOException {
        this.f194c0 = eVar;
        p D = eVar.D();
        if (D != null) {
            return D;
        }
        while (eVar != this.f193b0) {
            eVar = this.f194c0.z(eVar);
            this.f194c0 = eVar;
            if (eVar != null) {
                p D2 = eVar.D();
                if (D2 != null) {
                    return D2;
                }
            } else {
                throw k("Unexpected problem: chain of filtered context broken");
            }
        }
        throw k("Internal error: failed to locate expected buffered tokens");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0090, code lost:
        r1 = r6.f193b0.w(r1, true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w4.p d3() throws java.io.IOException {
        /*
            r6 = this;
        L_0x0000:
            w4.l r0 = r6.U
            w4.p r0 = r0.D2()
            if (r0 != 0) goto L_0x000b
            r6.Z = r0
            return r0
        L_0x000b:
            int r1 = r0.e()
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L_0x00ed
            r4 = 2
            if (r1 == r4) goto L_0x00c5
            r4 = 3
            if (r1 == r4) goto L_0x008a
            r2 = 4
            if (r1 == r2) goto L_0x00c5
            r2 = 5
            if (r1 == r2) goto L_0x0045
            a5.d r1 = r6.f195d0
            a5.d r2 = a5.d.f198a
            if (r1 != r2) goto L_0x0028
            r6.Z = r0
            return r0
        L_0x0028:
            if (r1 == 0) goto L_0x0000
            a5.e r3 = r6.f193b0
            a5.d r1 = r3.t(r1)
            if (r1 == r2) goto L_0x003c
            if (r1 == 0) goto L_0x0000
            w4.l r2 = r6.U
            boolean r1 = r1.v(r2)
            if (r1 == 0) goto L_0x0000
        L_0x003c:
            boolean r1 = r6.f3()
            if (r1 == 0) goto L_0x0000
            r6.Z = r0
            return r0
        L_0x0045:
            w4.l r1 = r6.U
            java.lang.String r1 = r1.X0()
            a5.e r2 = r6.f193b0
            a5.d r2 = r2.F(r1)
            a5.d r3 = a5.d.f198a
            if (r2 != r3) goto L_0x005a
            r6.f195d0 = r2
        L_0x0057:
            r6.Z = r0
            return r0
        L_0x005a:
            if (r2 != 0) goto L_0x0063
        L_0x005c:
            w4.l r0 = r6.U
            r0.D2()
            goto L_0x00fc
        L_0x0063:
            a5.d r1 = r2.q(r1)
            if (r1 != 0) goto L_0x006a
            goto L_0x005c
        L_0x006a:
            r6.f195d0 = r1
            if (r1 != r3) goto L_0x007b
            boolean r1 = r6.f3()
            if (r1 == 0) goto L_0x0000
            boolean r1 = r6.X
            if (r1 == 0) goto L_0x0000
            r6.Z = r0
            return r0
        L_0x007b:
            boolean r0 = r6.X
            if (r0 == 0) goto L_0x0000
            a5.e r0 = r6.f193b0
            w4.p r0 = r6.e3(r0)
            if (r0 == 0) goto L_0x0000
            r6.Z = r0
            return r0
        L_0x008a:
            a5.d r1 = r6.f195d0
            a5.d r4 = a5.d.f198a
            if (r1 != r4) goto L_0x0099
        L_0x0090:
            a5.e r2 = r6.f193b0
            a5.e r1 = r2.w(r1, r3)
        L_0x0096:
            r6.f193b0 = r1
            goto L_0x0057
        L_0x0099:
            if (r1 != 0) goto L_0x009c
            goto L_0x00fc
        L_0x009c:
            a5.e r5 = r6.f193b0
            a5.d r1 = r5.t(r1)
            if (r1 != 0) goto L_0x00a5
            goto L_0x00fc
        L_0x00a5:
            if (r1 == r4) goto L_0x00ab
            a5.d r1 = r1.d()
        L_0x00ab:
            r6.f195d0 = r1
            if (r1 != r4) goto L_0x00b0
            goto L_0x0090
        L_0x00b0:
            a5.e r0 = r6.f193b0
            a5.e r0 = r0.w(r1, r2)
            r6.f193b0 = r0
            boolean r1 = r6.X
            if (r1 == 0) goto L_0x0000
            w4.p r0 = r6.e3(r0)
            if (r0 == 0) goto L_0x0000
            r6.Z = r0
            return r0
        L_0x00c5:
            a5.e r1 = r6.f193b0
            boolean r1 = r1.C()
            a5.e r2 = r6.f193b0
            a5.d r2 = r2.A()
            if (r2 == 0) goto L_0x00da
            a5.d r3 = a5.d.f198a
            if (r2 == r3) goto L_0x00da
            r2.b()
        L_0x00da:
            a5.e r2 = r6.f193b0
            a5.e r2 = r2.e()
            r6.f193b0 = r2
            a5.d r2 = r2.A()
            r6.f195d0 = r2
            if (r1 == 0) goto L_0x0000
            r6.Z = r0
            return r0
        L_0x00ed:
            a5.d r1 = r6.f195d0
            a5.d r4 = a5.d.f198a
            if (r1 != r4) goto L_0x00fa
        L_0x00f3:
            a5.e r2 = r6.f193b0
            a5.e r1 = r2.x(r1, r3)
            goto L_0x0096
        L_0x00fa:
            if (r1 != 0) goto L_0x0103
        L_0x00fc:
            w4.l r0 = r6.U
            r0.Z2()
            goto L_0x0000
        L_0x0103:
            a5.e r5 = r6.f193b0
            a5.d r1 = r5.t(r1)
            if (r1 != 0) goto L_0x010c
            goto L_0x00fc
        L_0x010c:
            if (r1 == r4) goto L_0x0112
            a5.d r1 = r1.e()
        L_0x0112:
            r6.f195d0 = r1
            if (r1 != r4) goto L_0x0117
            goto L_0x00f3
        L_0x0117:
            a5.e r0 = r6.f193b0
            a5.e r0 = r0.x(r1, r2)
            r6.f193b0 = r0
            boolean r1 = r6.X
            if (r1 == 0) goto L_0x0000
            w4.p r0 = r6.e3(r0)
            if (r0 == 0) goto L_0x0000
            r6.Z = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.b.d3():w4.p");
    }

    public BigInteger e0() throws IOException {
        return this.U.e0();
    }

    public boolean e2() throws IOException {
        return this.U.e2();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a9, code lost:
        r5.f193b0 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w4.p e3(a5.e r6) throws java.io.IOException {
        /*
            r5 = this;
        L_0x0000:
            w4.l r0 = r5.U
            w4.p r0 = r0.D2()
            if (r0 != 0) goto L_0x0009
            return r0
        L_0x0009:
            int r1 = r0.e()
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L_0x00e6
            r4 = 2
            if (r1 == r4) goto L_0x00b6
            r4 = 3
            if (r1 == r4) goto L_0x0086
            r4 = 4
            if (r1 == r4) goto L_0x00b6
            r0 = 5
            if (r1 == r0) goto L_0x0047
            a5.d r0 = r5.f195d0
            a5.d r1 = a5.d.f198a
            if (r0 != r1) goto L_0x0028
            w4.p r6 = r5.c3(r6)
            return r6
        L_0x0028:
            if (r0 == 0) goto L_0x0000
            a5.e r2 = r5.f193b0
            a5.d r0 = r2.t(r0)
            if (r0 == r1) goto L_0x003c
            if (r0 == 0) goto L_0x0000
            w4.l r1 = r5.U
            boolean r0 = r0.v(r1)
            if (r0 == 0) goto L_0x0000
        L_0x003c:
            boolean r0 = r5.f3()
            if (r0 == 0) goto L_0x0000
            w4.p r6 = r5.c3(r6)
            return r6
        L_0x0047:
            w4.l r0 = r5.U
            java.lang.String r0 = r0.X0()
            a5.e r1 = r5.f193b0
            a5.d r1 = r1.F(r0)
            a5.d r2 = a5.d.f198a
            if (r1 != r2) goto L_0x005e
            r5.f195d0 = r1
        L_0x0059:
            w4.p r6 = r5.c3(r6)
            return r6
        L_0x005e:
            if (r1 != 0) goto L_0x0066
        L_0x0060:
            w4.l r0 = r5.U
            r0.D2()
            goto L_0x0090
        L_0x0066:
            a5.d r1 = r1.q(r0)
            if (r1 != 0) goto L_0x006d
            goto L_0x0060
        L_0x006d:
            r5.f195d0 = r1
            if (r1 != r2) goto L_0x0000
            boolean r1 = r5.f3()
            if (r1 == 0) goto L_0x007c
            w4.p r6 = r5.c3(r6)
            return r6
        L_0x007c:
            a5.e r1 = r5.f193b0
            a5.d r0 = r1.F(r0)
            r5.f195d0 = r0
            goto L_0x0000
        L_0x0086:
            a5.e r0 = r5.f193b0
            a5.d r1 = r5.f195d0
            a5.d r0 = r0.t(r1)
            if (r0 != 0) goto L_0x0097
        L_0x0090:
            w4.l r0 = r5.U
            r0.Z2()
            goto L_0x0000
        L_0x0097:
            a5.d r1 = a5.d.f198a
            if (r0 == r1) goto L_0x009f
            a5.d r0 = r0.d()
        L_0x009f:
            r5.f195d0 = r0
            if (r0 != r1) goto L_0x00ac
            a5.e r1 = r5.f193b0
            a5.e r0 = r1.w(r0, r3)
        L_0x00a9:
            r5.f193b0 = r0
            goto L_0x0059
        L_0x00ac:
            a5.e r1 = r5.f193b0
            a5.e r0 = r1.w(r0, r2)
        L_0x00b2:
            r5.f193b0 = r0
            goto L_0x0000
        L_0x00b6:
            a5.e r1 = r5.f193b0
            a5.d r1 = r1.A()
            if (r1 == 0) goto L_0x00c5
            a5.d r4 = a5.d.f198a
            if (r1 == r4) goto L_0x00c5
            r1.b()
        L_0x00c5:
            a5.e r1 = r5.f193b0
            if (r1 != r6) goto L_0x00cb
            r4 = r3
            goto L_0x00cc
        L_0x00cb:
            r4 = r2
        L_0x00cc:
            if (r4 == 0) goto L_0x00d5
            boolean r1 = r1.C()
            if (r1 == 0) goto L_0x00d5
            r2 = r3
        L_0x00d5:
            a5.e r1 = r5.f193b0
            a5.e r1 = r1.e()
            r5.f193b0 = r1
            a5.d r1 = r1.A()
            r5.f195d0 = r1
            if (r2 == 0) goto L_0x0000
            return r0
        L_0x00e6:
            a5.d r1 = r5.f195d0
            a5.d r4 = a5.d.f198a
            if (r1 != r4) goto L_0x00f5
            a5.e r6 = r5.f193b0
            a5.e r6 = r6.x(r1, r3)
            r5.f193b0 = r6
            return r0
        L_0x00f5:
            if (r1 != 0) goto L_0x00f8
            goto L_0x0090
        L_0x00f8:
            a5.e r0 = r5.f193b0
            a5.d r0 = r0.t(r1)
            if (r0 != 0) goto L_0x0101
            goto L_0x0090
        L_0x0101:
            if (r0 == r4) goto L_0x0107
            a5.d r0 = r0.e()
        L_0x0107:
            r5.f195d0 = r0
            a5.e r1 = r5.f193b0
            if (r0 != r4) goto L_0x0112
            a5.e r0 = r1.x(r0, r3)
            goto L_0x00a9
        L_0x0112:
            a5.e r0 = r1.x(r0, r2)
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.b.e3(a5.e):w4.p");
    }

    public final int f1() {
        p pVar = this.Z;
        if (pVar == null) {
            return 0;
        }
        return pVar.e();
    }

    public boolean f2(boolean z10) throws IOException {
        return this.U.f2(z10);
    }

    public final boolean f3() throws IOException {
        int i10 = this.f196e0;
        if (i10 != 0 && !this.W) {
            return false;
        }
        this.f196e0 = i10 + 1;
        return true;
    }

    public double g2() throws IOException {
        return this.U.g2();
    }

    public d g3() {
        return this.V;
    }

    public BigDecimal h1() throws IOException {
        return this.U.h1();
    }

    public double h2(double d10) throws IOException {
        return this.U.h2(d10);
    }

    public int h3() {
        return this.f196e0;
    }

    public int i2() throws IOException {
        return this.U.i2();
    }

    public int j2(int i10) throws IOException {
        return this.U.j2(i10);
    }

    public long k2() throws IOException {
        return this.U.k2();
    }

    public long l2(long j10) throws IOException {
        return this.U.l2(j10);
    }

    public byte[] m0(a aVar) throws IOException {
        return this.U.m0(aVar);
    }

    public double m1() throws IOException {
        return this.U.m1();
    }

    public String m2() throws IOException {
        return this.U.m2();
    }

    public String n2(String str) throws IOException {
        return this.U.n2(str);
    }

    public boolean o2() {
        return this.Z != null;
    }

    public Object p1() throws IOException {
        return this.U.p1();
    }

    public boolean p2() {
        return this.U.p2();
    }

    public final boolean q2(p pVar) {
        return this.Z == pVar;
    }

    public boolean r2(int i10) {
        p pVar = this.Z;
        return pVar == null ? i10 == 0 : pVar.e() == i10;
    }

    public boolean u2() {
        return this.Z == p.START_ARRAY;
    }

    public boolean v2() {
        return this.Z == p.START_OBJECT;
    }

    public void w() {
        p pVar = this.Z;
        if (pVar != null) {
            this.f192a0 = pVar;
            this.Z = null;
        }
    }

    public boolean z0() throws IOException {
        return this.U.z0();
    }
}

package n5;

import a6.w;
import com.fasterxml.jackson.databind.node.a;
import com.fasterxml.jackson.databind.node.u;
import i5.g;
import i5.h;
import i5.m;
import java.io.IOException;
import u5.f;
import w4.l;
import w4.n;
import w4.p;

public abstract class d<T extends m> extends a0<T> {
    public final Boolean T;

    public d(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this.T = bool;
    }

    public final m E0(l lVar, g gVar, com.fasterxml.jackson.databind.node.m mVar) throws IOException {
        Object p12 = lVar.p1();
        return p12 == null ? mVar.b() : p12.getClass() == byte[].class ? mVar.s((byte[]) p12) : p12 instanceof w ? mVar.n((w) p12) : p12 instanceof m ? (m) p12 : mVar.o(p12);
    }

    public final m F0(l lVar, g gVar, com.fasterxml.jackson.databind.node.m mVar) throws IOException {
        l.b R1 = lVar.R1();
        return R1 == l.b.BIG_DECIMAL ? mVar.j(lVar.h1()) : gVar.v0(h.USE_BIG_DECIMAL_FOR_FLOATS) ? lVar.w2() ? mVar.L(lVar.m1()) : mVar.j(lVar.h1()) : R1 == l.b.FLOAT ? mVar.H(lVar.A1()) : mVar.L(lVar.m1());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i5.m G0(w4.l r2, i5.g r3, com.fasterxml.jackson.databind.node.m r4) throws java.io.IOException {
        /*
            r1 = this;
            int r3 = r3.W()
            int r0 = n5.a0.R
            r0 = r0 & r3
            if (r0 == 0) goto L_0x001f
            i5.h r0 = i5.h.USE_BIG_INTEGER_FOR_INTS
            boolean r0 = r0.d(r3)
            if (r0 == 0) goto L_0x0014
            w4.l$b r3 = w4.l.b.BIG_INTEGER
            goto L_0x0023
        L_0x0014:
            i5.h r0 = i5.h.USE_LONG_FOR_INTS
            boolean r3 = r0.d(r3)
            if (r3 == 0) goto L_0x001f
            w4.l$b r3 = w4.l.b.LONG
            goto L_0x0023
        L_0x001f:
            w4.l$b r3 = r2.R1()
        L_0x0023:
            w4.l$b r0 = w4.l.b.INT
            if (r3 != r0) goto L_0x0030
            int r2 = r2.N1()
            com.fasterxml.jackson.databind.node.t r2 = r4.I(r2)
            return r2
        L_0x0030:
            w4.l$b r0 = w4.l.b.LONG
            if (r3 != r0) goto L_0x003d
            long r2 = r2.P1()
            com.fasterxml.jackson.databind.node.t r2 = r4.M(r2)
            return r2
        L_0x003d:
            java.math.BigInteger r2 = r2.e0()
            com.fasterxml.jackson.databind.node.z r2 = r4.f(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.d.G0(w4.l, i5.g, com.fasterxml.jackson.databind.node.m):i5.m");
    }

    public void H0(l lVar, g gVar, com.fasterxml.jackson.databind.node.m mVar, String str, u uVar, m mVar2, m mVar3) throws n {
        if (gVar.v0(h.FAIL_ON_READING_DUP_TREE_KEY)) {
            gVar.P0(m.class, "Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str);
        }
    }

    public final m I0(l lVar, g gVar, com.fasterxml.jackson.databind.node.m mVar) throws IOException {
        int Q = lVar.Q();
        if (Q == 2) {
            return mVar.A();
        }
        switch (Q) {
            case 5:
                return L0(lVar, gVar, mVar);
            case 6:
                return mVar.c(lVar.Y1());
            case 7:
                return G0(lVar, gVar, mVar);
            case 8:
                return F0(lVar, gVar, mVar);
            case 9:
                return mVar.C(true);
            case 10:
                return mVar.C(false);
            case 11:
                return mVar.b();
            case 12:
                return E0(lVar, gVar, mVar);
            default:
                return (m) gVar.i0(r(), lVar);
        }
    }

    public final a J0(l lVar, g gVar, com.fasterxml.jackson.databind.node.m mVar) throws IOException {
        m mVar2;
        boolean z10;
        a z11 = mVar.z();
        while (true) {
            switch (lVar.D2().e()) {
                case 1:
                    mVar2 = K0(lVar, gVar, mVar);
                    continue;
                case 3:
                    mVar2 = J0(lVar, gVar, mVar);
                    continue;
                case 4:
                    return z11;
                case 6:
                    mVar2 = mVar.c(lVar.Y1());
                    continue;
                case 7:
                    mVar2 = G0(lVar, gVar, mVar);
                    continue;
                case 9:
                    z10 = true;
                    break;
                case 10:
                    z10 = false;
                    break;
                case 11:
                    mVar2 = mVar.b();
                    continue;
                case 12:
                    mVar2 = E0(lVar, gVar, mVar);
                    continue;
                default:
                    mVar2 = I0(lVar, gVar, mVar);
                    continue;
            }
            mVar2 = mVar.C(z10);
            z11.M1(mVar2);
        }
    }

    public final u K0(l lVar, g gVar, com.fasterxml.jackson.databind.node.m mVar) throws IOException {
        m mVar2;
        u A = mVar.A();
        String y22 = lVar.y2();
        while (y22 != null) {
            p D2 = lVar.D2();
            if (D2 == null) {
                D2 = p.NOT_AVAILABLE;
            }
            int e10 = D2.e();
            if (e10 == 1) {
                mVar2 = K0(lVar, gVar, mVar);
            } else if (e10 == 3) {
                mVar2 = J0(lVar, gVar, mVar);
            } else if (e10 == 6) {
                mVar2 = mVar.c(lVar.Y1());
            } else if (e10 != 7) {
                switch (e10) {
                    case 9:
                        mVar2 = mVar.C(true);
                        break;
                    case 10:
                        mVar2 = mVar.C(false);
                        break;
                    case 11:
                        mVar2 = mVar.b();
                        break;
                    case 12:
                        mVar2 = E0(lVar, gVar, mVar);
                        break;
                    default:
                        mVar2 = I0(lVar, gVar, mVar);
                        break;
                }
            } else {
                mVar2 = G0(lVar, gVar, mVar);
            }
            m mVar3 = mVar2;
            m k22 = A.k2(y22, mVar3);
            if (k22 != null) {
                H0(lVar, gVar, mVar, y22, A, k22, mVar3);
            }
            y22 = lVar.y2();
        }
        return A;
    }

    public final u L0(l lVar, g gVar, com.fasterxml.jackson.databind.node.m mVar) throws IOException {
        m mVar2;
        u A = mVar.A();
        String X0 = lVar.X0();
        while (X0 != null) {
            p D2 = lVar.D2();
            if (D2 == null) {
                D2 = p.NOT_AVAILABLE;
            }
            int e10 = D2.e();
            if (e10 == 1) {
                mVar2 = K0(lVar, gVar, mVar);
            } else if (e10 == 3) {
                mVar2 = J0(lVar, gVar, mVar);
            } else if (e10 == 6) {
                mVar2 = mVar.c(lVar.Y1());
            } else if (e10 != 7) {
                switch (e10) {
                    case 9:
                        mVar2 = mVar.C(true);
                        break;
                    case 10:
                        mVar2 = mVar.C(false);
                        break;
                    case 11:
                        mVar2 = mVar.b();
                        break;
                    case 12:
                        mVar2 = E0(lVar, gVar, mVar);
                        break;
                    default:
                        mVar2 = I0(lVar, gVar, mVar);
                        break;
                }
            } else {
                mVar2 = G0(lVar, gVar, mVar);
            }
            m mVar3 = mVar2;
            m k22 = A.k2(X0, mVar3);
            if (k22 != null) {
                H0(lVar, gVar, mVar, X0, A, k22, mVar3);
            }
            X0 = lVar.y2();
        }
        return A;
    }

    public final m M0(l lVar, g gVar, a aVar) throws IOException {
        m mVar;
        boolean z10;
        com.fasterxml.jackson.databind.node.m Y = gVar.Y();
        while (true) {
            switch (lVar.D2().e()) {
                case 1:
                    mVar = K0(lVar, gVar, Y);
                    continue;
                case 3:
                    mVar = J0(lVar, gVar, Y);
                    continue;
                case 4:
                    return aVar;
                case 6:
                    mVar = Y.c(lVar.Y1());
                    continue;
                case 7:
                    mVar = G0(lVar, gVar, Y);
                    continue;
                case 9:
                    z10 = true;
                    break;
                case 10:
                    z10 = false;
                    break;
                case 11:
                    mVar = Y.b();
                    continue;
                case 12:
                    mVar = E0(lVar, gVar, Y);
                    continue;
                default:
                    mVar = I0(lVar, gVar, Y);
                    continue;
            }
            mVar = Y.C(z10);
            aVar.M1(mVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r1 != r7) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r1 != r7) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i5.m N0(w4.l r11, i5.g r12, com.fasterxml.jackson.databind.node.u r13) throws java.io.IOException {
        /*
            r10 = this;
            boolean r0 = r11.v2()
            if (r0 == 0) goto L_0x000b
        L_0x0006:
            java.lang.String r0 = r11.y2()
            goto L_0x001e
        L_0x000b:
            w4.p r0 = w4.p.FIELD_NAME
            boolean r0 = r11.q2(r0)
            if (r0 != 0) goto L_0x001a
            java.lang.Object r11 = r10.f(r11, r12)
            i5.m r11 = (i5.m) r11
            return r11
        L_0x001a:
            java.lang.String r0 = r11.X0()
        L_0x001e:
            if (r0 == 0) goto L_0x00a6
            w4.p r1 = r11.D2()
            i5.m r7 = r13.g(r0)
            if (r7 == 0) goto L_0x0049
            boolean r2 = r7 instanceof com.fasterxml.jackson.databind.node.u
            if (r2 == 0) goto L_0x003b
            r1 = r7
            com.fasterxml.jackson.databind.node.u r1 = (com.fasterxml.jackson.databind.node.u) r1
            i5.m r1 = r10.N0(r11, r12, r1)
            if (r1 == r7) goto L_0x0006
        L_0x0037:
            r13.n2(r0, r1)
            goto L_0x0006
        L_0x003b:
            boolean r2 = r7 instanceof com.fasterxml.jackson.databind.node.a
            if (r2 == 0) goto L_0x0049
            r1 = r7
            com.fasterxml.jackson.databind.node.a r1 = (com.fasterxml.jackson.databind.node.a) r1
            i5.m r1 = r10.M0(r11, r12, r1)
            if (r1 == r7) goto L_0x0006
            goto L_0x0037
        L_0x0049:
            if (r1 != 0) goto L_0x004d
            w4.p r1 = w4.p.NOT_AVAILABLE
        L_0x004d:
            com.fasterxml.jackson.databind.node.m r4 = r12.Y()
            int r1 = r1.e()
            r2 = 1
            if (r1 == r2) goto L_0x0091
            r3 = 3
            if (r1 == r3) goto L_0x008c
            r3 = 6
            if (r1 == r3) goto L_0x0083
            r3 = 7
            if (r1 == r3) goto L_0x007e
            switch(r1) {
                case 9: goto L_0x0079;
                case 10: goto L_0x0073;
                case 11: goto L_0x006e;
                case 12: goto L_0x0069;
                default: goto L_0x0064;
            }
        L_0x0064:
            i5.m r1 = r10.I0(r11, r12, r4)
            goto L_0x0095
        L_0x0069:
            i5.m r1 = r10.E0(r11, r12, r4)
            goto L_0x0095
        L_0x006e:
            com.fasterxml.jackson.databind.node.s r1 = r4.b()
            goto L_0x0095
        L_0x0073:
            r1 = 0
            com.fasterxml.jackson.databind.node.e r1 = r4.C(r1)
            goto L_0x0095
        L_0x0079:
            com.fasterxml.jackson.databind.node.e r1 = r4.C(r2)
            goto L_0x0095
        L_0x007e:
            i5.m r1 = r10.G0(r11, r12, r4)
            goto L_0x0095
        L_0x0083:
            java.lang.String r1 = r11.Y1()
            com.fasterxml.jackson.databind.node.x r1 = r4.c(r1)
            goto L_0x0095
        L_0x008c:
            com.fasterxml.jackson.databind.node.a r1 = r10.J0(r11, r12, r4)
            goto L_0x0095
        L_0x0091:
            com.fasterxml.jackson.databind.node.u r1 = r10.K0(r11, r12, r4)
        L_0x0095:
            r9 = r1
            if (r7 == 0) goto L_0x00a1
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r0
            r6 = r13
            r8 = r9
            r1.H0(r2, r3, r4, r5, r6, r7, r8)
        L_0x00a1:
            r13.n2(r0, r9)
            goto L_0x0006
        L_0x00a6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.d.N0(w4.l, i5.g, com.fasterxml.jackson.databind.node.u):i5.m");
    }

    public Object h(l lVar, g gVar, f fVar) throws IOException {
        return fVar.c(lVar, gVar);
    }

    public boolean s() {
        return true;
    }

    public Boolean u(i5.f fVar) {
        return this.T;
    }
}

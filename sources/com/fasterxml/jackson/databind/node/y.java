package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.node.q;
import i5.m;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import w4.b0;
import w4.j;
import w4.k;
import w4.l;
import w4.o;
import w4.p;
import w4.s;
import y4.c;

public class y extends c {
    public s S0;
    public q T0;
    public boolean U0;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5022a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                w4.p[] r0 = w4.p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5022a = r0
                w4.p r1 = w4.p.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5022a     // Catch:{ NoSuchFieldError -> 0x001d }
                w4.p r1 = w4.p.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5022a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w4.p r1 = w4.p.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5022a     // Catch:{ NoSuchFieldError -> 0x0033 }
                w4.p r1 = w4.p.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5022a     // Catch:{ NoSuchFieldError -> 0x003e }
                w4.p r1 = w4.p.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5022a     // Catch:{ NoSuchFieldError -> 0x0049 }
                w4.p r1 = w4.p.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5022a     // Catch:{ NoSuchFieldError -> 0x0054 }
                w4.p r1 = w4.p.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f5022a     // Catch:{ NoSuchFieldError -> 0x0060 }
                w4.p r1 = w4.p.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f5022a     // Catch:{ NoSuchFieldError -> 0x006c }
                w4.p r1 = w4.p.VALUE_EMBEDDED_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.y.a.<clinit>():void");
        }
    }

    public y(m mVar) {
        this(mVar, (s) null);
    }

    public y(m mVar, s sVar) {
        super(0);
        this.S0 = sVar;
        this.T0 = new q.c(mVar, (q) null);
    }

    public float A1() throws IOException {
        return (float) G3().r0();
    }

    public p D2() throws IOException, k {
        q qVar;
        p u10 = this.T0.u();
        this.U = u10;
        if (u10 == null) {
            this.U0 = true;
            return null;
        }
        int i10 = a.f5022a[u10.ordinal()];
        if (i10 == 1) {
            qVar = this.T0.x();
        } else if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                qVar = this.T0.e();
            }
            return this.U;
        } else {
            qVar = this.T0.w();
        }
        this.T0 = qVar;
        return this.U;
    }

    public void F2(String str) {
        q qVar = this.T0;
        p pVar = this.U;
        if (pVar == p.START_OBJECT || pVar == p.START_ARRAY) {
            qVar = qVar.e();
        }
        if (qVar != null) {
            qVar.v(str);
        }
    }

    public m F3() {
        q qVar;
        if (this.U0 || (qVar = this.T0) == null) {
            return null;
        }
        return qVar.r();
    }

    public m G3() throws k {
        m F3 = F3();
        if (F3 != null && F3.Y0()) {
            return F3;
        }
        p w10 = F3 == null ? null : F3.w();
        throw k("Current token (" + w10 + ") not numeric, cannot use numeric value accessors");
    }

    public int J2(w4.a aVar, OutputStream outputStream) throws IOException, k {
        byte[] m02 = m0(aVar);
        if (m02 == null) {
            return 0;
        }
        outputStream.write(m02, 0, m02.length);
        return m02.length;
    }

    public int N1() throws IOException {
        t tVar = (t) G3();
        if (!tVar.n0()) {
            y3();
        }
        return tVar.M0();
    }

    public long P1() throws IOException {
        t tVar = (t) G3();
        if (!tVar.o0()) {
            B3();
        }
        return tVar.c1();
    }

    public l.b R1() throws IOException {
        m G3 = G3();
        if (G3 == null) {
            return null;
        }
        return G3.q();
    }

    public Number S1() throws IOException {
        return G3().d1();
    }

    public void S2(s sVar) {
        this.S0 = sVar;
    }

    public s T0() {
        return this.S0;
    }

    public o U1() {
        return this.T0;
    }

    public j W0() {
        return j.V;
    }

    public String X0() {
        q qVar = this.T0;
        p pVar = this.U;
        if (pVar == p.START_OBJECT || pVar == p.START_ARRAY) {
            qVar = qVar.e();
        }
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public String Y1() {
        if (this.U0) {
            return null;
        }
        switch (a.f5022a[this.U.ordinal()]) {
            case 5:
                return this.T0.b();
            case 6:
                return F3().n1();
            case 7:
            case 8:
                return String.valueOf(F3().d1());
            case 9:
                m F3 = F3();
                if (F3 != null && F3.P0()) {
                    return F3.g0();
                }
        }
        p pVar = this.U;
        if (pVar == null) {
            return null;
        }
        return pVar.d();
    }

    public char[] Z1() throws IOException, k {
        return Y1().toCharArray();
    }

    public l Z2() throws IOException {
        p pVar;
        p pVar2 = this.U;
        if (pVar2 == p.START_OBJECT) {
            this.T0 = this.T0.e();
            pVar = p.END_OBJECT;
        } else {
            if (pVar2 == p.START_ARRAY) {
                this.T0 = this.T0.e();
                pVar = p.END_ARRAY;
            }
            return this;
        }
        this.U = pVar;
        return this;
    }

    public int a2() throws IOException, k {
        return Y1().length();
    }

    public int b2() throws IOException, k {
        return 0;
    }

    public j c2() {
        return j.V;
    }

    public void close() throws IOException {
        if (!this.U0) {
            this.U0 = true;
            this.T0 = null;
            this.U = null;
        }
    }

    public BigInteger e0() throws IOException {
        return G3().k0();
    }

    public void f3() throws k {
        u3();
    }

    public BigDecimal h1() throws IOException {
        return G3().p0();
    }

    public boolean isClosed() {
        return this.U0;
    }

    public byte[] m0(w4.a aVar) throws IOException, k {
        m F3 = F3();
        if (F3 != null) {
            return F3 instanceof x ? ((x) F3).u1(aVar) : F3.l0();
        }
        return null;
    }

    public double m1() throws IOException {
        return G3().r0();
    }

    public Object p1() {
        m F3;
        if (this.U0 || (F3 = F3()) == null) {
            return null;
        }
        if (F3.Z0()) {
            return ((v) F3).u1();
        }
        if (F3.P0()) {
            return ((d) F3).l0();
        }
        return null;
    }

    public boolean p2() {
        return false;
    }

    public b0 version() {
        return k5.l.O;
    }

    public boolean w2() {
        if (this.U0) {
            return false;
        }
        m F3 = F3();
        if (F3 instanceof t) {
            return ((t) F3).t1();
        }
        return false;
    }
}

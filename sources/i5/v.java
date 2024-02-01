package i5;

import a5.d;
import a6.h;
import com.fasterxml.jackson.databind.node.y;
import g5.a;
import g5.b;
import java.io.DataInput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import k5.e;
import l5.l;
import l5.m;
import t7.t;
import w4.a0;
import w4.b0;
import w4.c;
import w4.c0;
import w4.f;
import w4.i;
import w4.k;
import w4.l;
import w4.n;
import w4.p;
import w4.s;
import zb.r;

public class v extends s implements c0, Serializable {

    /* renamed from: b0  reason: collision with root package name */
    public static final long f9125b0 = 2;
    public final f O;
    public final m P;
    public final f Q;
    public final boolean R;
    public final d S;
    public final j T;
    public final k<Object> U;
    public final Object V;
    public final w4.d W;
    public final i X;
    public final l Y;
    public final ConcurrentHashMap<j, k<Object>> Z;

    /* renamed from: a0  reason: collision with root package name */
    public transient j f9126a0;

    public v(u uVar, f fVar) {
        this(uVar, fVar, (j) null, (Object) null, (w4.d) null, (i) null);
    }

    public v(u uVar, f fVar, j jVar, Object obj, w4.d dVar, i iVar) {
        this.O = fVar;
        this.P = uVar.Y;
        this.Z = uVar.f9120a0;
        this.Q = uVar.O;
        this.T = jVar;
        this.V = obj;
        this.W = dVar;
        this.X = iVar;
        this.R = fVar.X();
        this.U = O(jVar);
        this.Y = null;
        this.S = null;
    }

    public v(v vVar, d dVar) {
        this.O = vVar.O;
        this.P = vVar.P;
        this.Z = vVar.Z;
        this.Q = vVar.Q;
        this.T = vVar.T;
        this.U = vVar.U;
        this.V = vVar.V;
        this.W = vVar.W;
        this.X = vVar.X;
        this.R = vVar.R;
        this.Y = vVar.Y;
        this.S = dVar;
    }

    public v(v vVar, f fVar) {
        this.O = fVar;
        this.P = vVar.P;
        this.Z = vVar.Z;
        this.Q = vVar.Q;
        this.T = vVar.T;
        this.U = vVar.U;
        this.V = vVar.V;
        this.W = vVar.W;
        this.X = vVar.X;
        this.R = fVar.X();
        this.Y = vVar.Y;
        this.S = vVar.S;
    }

    public v(v vVar, f fVar, j jVar, k<Object> kVar, Object obj, w4.d dVar, i iVar, l lVar) {
        this.O = fVar;
        this.P = vVar.P;
        this.Z = vVar.Z;
        this.Q = vVar.Q;
        this.T = jVar;
        this.U = kVar;
        this.V = obj;
        this.W = dVar;
        this.X = iVar;
        this.R = fVar.X();
        this.Y = lVar;
        this.S = vVar.S;
    }

    public v(v vVar, f fVar) {
        this.O = (f) vVar.O.Y(q.SORT_PROPERTIES_ALPHABETICALLY, fVar.F());
        this.P = vVar.P;
        this.Z = vVar.Z;
        this.Q = fVar;
        this.T = vVar.T;
        this.U = vVar.U;
        this.V = vVar.V;
        this.W = vVar.W;
        this.X = vVar.X;
        this.R = vVar.R;
        this.Y = vVar.Y;
        this.S = vVar.S;
    }

    public Object A(byte[] bArr, int i10, int i11) throws IOException {
        l.b d10 = this.Y.d(bArr, i10, i11);
        if (!d10.f()) {
            Q(this.Y, d10);
        }
        return d10.e().t(d10.a());
    }

    public m A0(InputStream inputStream) throws IOException {
        return this.Y != null ? B(inputStream) : u(y(d0(inputStream), false));
    }

    public v A1(c... cVarArr) {
        return U(this.O.d1(cVarArr));
    }

    public m B(InputStream inputStream) throws IOException {
        l.b b10 = this.Y.b(inputStream);
        if (!b10.f()) {
            Q(this.Y, b10);
        }
        w4.l a10 = b10.a();
        a10.a0(l.a.AUTO_CLOSE_SOURCE);
        return b10.e().u(a10);
    }

    public m B0(Reader reader) throws IOException {
        if (this.Y != null) {
            P(reader);
        }
        return u(y(e0(reader), false));
    }

    public v B1(l.a... aVarArr) {
        return U(this.O.e1(aVarArr));
    }

    public <T> r<T> C(l.b bVar, boolean z10) throws IOException {
        if (!bVar.f()) {
            Q(this.Y, bVar);
        }
        w4.l a10 = bVar.a();
        if (z10) {
            a10.a0(l.a.AUTO_CLOSE_SOURCE);
        }
        return bVar.e().v(a10);
    }

    public m C0(String str) throws n, l {
        if (this.Y != null) {
            P(str);
        }
        try {
            return u(y(f0(str), false));
        } catch (n e10) {
            throw e10;
        } catch (IOException e11) {
            throw l.p(e11);
        }
    }

    public v C1(l5.l lVar) {
        return L(this, this.O, this.T, this.U, this.V, this.W, this.X, lVar);
    }

    public k<Object> D(g gVar) throws l {
        k<Object> kVar = this.U;
        if (kVar != null) {
            return kVar;
        }
        j jVar = this.T;
        if (jVar == null) {
            gVar.z((j) null, "No value type configured for ObjectReader");
        }
        k<Object> kVar2 = this.Z.get(jVar);
        if (kVar2 != null) {
            return kVar2;
        }
        k<Object> Q2 = gVar.Q(jVar);
        if (Q2 == null) {
            gVar.z(jVar, "Cannot find a deserializer for type " + jVar);
        }
        this.Z.put(jVar, Q2);
        return Q2;
    }

    public m D0(byte[] bArr) throws IOException {
        r("json", bArr);
        if (this.Y != null) {
            P(bArr);
        }
        return u(y(h0(bArr), false));
    }

    public v D1(v... vVarArr) {
        return C1(new l5.l(vVarArr));
    }

    public k<Object> E(g gVar) throws l {
        j J = J();
        k<Object> kVar = this.Z.get(J);
        if (kVar == null) {
            kVar = gVar.Q(J);
            if (kVar == null) {
                gVar.z(J, "Cannot find a deserializer for type " + J);
            }
            this.Z.put(J, kVar);
        }
        return kVar;
    }

    public m E0(byte[] bArr, int i10, int i11) throws IOException {
        if (this.Y != null) {
            P(bArr);
        }
        return u(y(i0(bArr, i10, i11), false));
    }

    public v E1(l5.n nVar) {
        return U(this.O.f1(nVar));
    }

    public void F(g gVar, w4.l lVar) throws IOException {
        w4.d dVar = this.W;
        if (dVar != null) {
            lVar.Y2(dVar);
        }
        this.O.O0(lVar);
    }

    public <T> T F0(m mVar) throws IOException {
        r(t.f13205o, mVar);
        if (this.Y != null) {
            P(mVar);
        }
        return t(y(f(mVar), false));
    }

    public v F1(y yVar) {
        return U(this.O.y0(yVar));
    }

    public p G(g gVar, w4.l lVar) throws IOException {
        w4.d dVar = this.W;
        if (dVar != null) {
            lVar.Y2(dVar);
        }
        this.O.O0(lVar);
        p Z0 = lVar.Z0();
        if (Z0 == null && (Z0 = lVar.D2()) == null) {
            gVar.N0(this.T, "No content to map due to end-of-input", new Object[0]);
        }
        return Z0;
    }

    public <T> T G0(m mVar, Class<T> cls) throws IOException {
        return n0(cls).F0(mVar);
    }

    public v G1(String str) {
        return U((f) this.O.z0(str));
    }

    public InputStream H(File file) throws IOException {
        return new FileInputStream(file);
    }

    public <T> T H0(DataInput dataInput) throws IOException {
        if (this.Y != null) {
            P(dataInput);
        }
        return t(y(b0(dataInput), false));
    }

    @Deprecated
    public v H1(b<?> bVar) {
        return m0(this.O.M().Y(bVar.b()));
    }

    public InputStream I(URL url) throws IOException {
        return url.openStream();
    }

    public <T> T I0(DataInput dataInput, Class<T> cls) throws IOException {
        return n0(cls).H0(dataInput);
    }

    @Deprecated
    public v I1(j jVar) {
        return m0(jVar);
    }

    public final j J() {
        j jVar = this.f9126a0;
        if (jVar != null) {
            return jVar;
        }
        j Y2 = r0().Y(m.class);
        this.f9126a0 = Y2;
        return Y2;
    }

    public <T> T J0(File file) throws IOException {
        l5.l lVar = this.Y;
        return lVar != null ? z(lVar.b(H(file)), true) : t(y(c0(file), false));
    }

    @Deprecated
    public v J1(Class<?> cls) {
        return m0(this.O.h(cls));
    }

    public v K(v vVar, f fVar) {
        return new v(vVar, fVar);
    }

    public <T> T K0(File file, Class<T> cls) throws IOException {
        return n0(cls).J0(file);
    }

    @Deprecated
    public v K1(Type type) {
        return m0(this.O.M().Y(type));
    }

    public v L(v vVar, f fVar, j jVar, k<Object> kVar, Object obj, w4.d dVar, i iVar, l5.l lVar) {
        return new v(vVar, fVar, jVar, kVar, obj, dVar, iVar, lVar);
    }

    public <T> T L0(InputStream inputStream) throws IOException {
        l5.l lVar = this.Y;
        return lVar != null ? z(lVar.b(inputStream), false) : t(y(d0(inputStream), false));
    }

    public v L1(Object obj) {
        j jVar;
        f fVar;
        k<Object> kVar;
        w4.d dVar;
        i iVar;
        l5.l lVar;
        v vVar;
        v vVar2;
        Object obj2;
        if (obj == this.V) {
            return this;
        }
        if (obj == null) {
            fVar = this.O;
            jVar = this.T;
            kVar = this.U;
            obj2 = null;
            dVar = this.W;
            iVar = this.X;
            lVar = this.Y;
            vVar = this;
            vVar2 = this;
        } else {
            j jVar2 = this.T;
            if (jVar2 == null) {
                jVar2 = this.O.h(obj.getClass());
            }
            jVar = jVar2;
            fVar = this.O;
            kVar = this.U;
            dVar = this.W;
            iVar = this.X;
            lVar = this.Y;
            vVar = this;
            vVar2 = this;
            obj2 = obj;
        }
        return vVar.L(vVar2, fVar, jVar, kVar, obj2, dVar, iVar, lVar);
    }

    public v M(v vVar, f fVar) {
        return new v(vVar, fVar);
    }

    public <T> T M0(InputStream inputStream, Class<T> cls) throws IOException {
        return n0(cls).L0(inputStream);
    }

    public v M1(Class<?> cls) {
        return U(this.O.A0(cls));
    }

    public <T> r<T> N(w4.l lVar, g gVar, k<?> kVar, boolean z10) {
        return new r(this.T, lVar, gVar, kVar, z10, this.V);
    }

    public <T> T N0(Reader reader) throws IOException {
        if (this.Y != null) {
            P(reader);
        }
        return t(y(e0(reader), false));
    }

    public v N1(h hVar) {
        return U(this.O.j1(hVar));
    }

    public k<Object> O(j jVar) {
        if (jVar == null || !this.O.S0(h.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        k<Object> kVar = this.Z.get(jVar);
        if (kVar == null) {
            try {
                kVar = Y((w4.l) null).Q(jVar);
                if (kVar != null) {
                    this.Z.put(jVar, kVar);
                }
            } catch (n unused) {
            }
        }
        return kVar;
    }

    public <T> T O0(Reader reader, Class<T> cls) throws IOException {
        return n0(cls).N0(reader);
    }

    public v O1(h hVar, h... hVarArr) {
        return U(this.O.k1(hVar, hVarArr));
    }

    public void P(Object obj) throws k {
        throw new k((w4.l) null, "Cannot use source of type " + obj.getClass().getName() + " with format auto-detection: must be byte- not char-based");
    }

    public <T> T P0(String str) throws n, l {
        if (this.Y != null) {
            P(str);
        }
        try {
            return t(y(f0(str), false));
        } catch (n e10) {
            throw e10;
        } catch (IOException e11) {
            throw l.p(e11);
        }
    }

    public v P1(c cVar) {
        return U(this.O.l1(cVar));
    }

    public void Q(l5.l lVar, l.b bVar) throws n {
        throw new k((w4.l) null, "Cannot detect format from input, does not look like any of detectable formats " + lVar.toString());
    }

    public <T> T Q0(String str, Class<T> cls) throws IOException {
        return n0(cls).P0(str);
    }

    public v Q1(l.a aVar) {
        return U(this.O.m1(aVar));
    }

    public Object R(w4.l lVar, g gVar, j jVar, k<Object> kVar) throws IOException {
        Object obj;
        String d10 = this.O.j(jVar).d();
        p Z0 = lVar.Z0();
        p pVar = p.START_OBJECT;
        if (Z0 != pVar) {
            gVar.X0(jVar, pVar, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", d10, lVar.Z0());
        }
        p D2 = lVar.D2();
        p pVar2 = p.FIELD_NAME;
        if (D2 != pVar2) {
            gVar.X0(jVar, pVar2, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", d10, lVar.Z0());
        }
        String X0 = lVar.X0();
        if (!d10.equals(X0)) {
            gVar.S0(jVar, X0, "Root name '%s' does not match expected ('%s') for type %s", X0, d10, jVar);
        }
        lVar.D2();
        Object obj2 = this.V;
        if (obj2 == null) {
            obj = kVar.f(lVar, gVar);
        } else {
            kVar.g(lVar, gVar, obj2);
            obj = this.V;
        }
        p D22 = lVar.D2();
        p pVar3 = p.END_OBJECT;
        if (D22 != pVar3) {
            gVar.X0(jVar, pVar3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", d10, lVar.Z0());
        }
        if (this.O.S0(h.FAIL_ON_TRAILING_TOKENS)) {
            S(lVar, gVar, this.T);
        }
        return obj;
    }

    public <T> T R0(URL url) throws IOException {
        l5.l lVar = this.Y;
        return lVar != null ? z(lVar.b(I(url)), true) : t(y(g0(url), false));
    }

    public v R1(w4.v vVar) {
        return U(this.O.m1(vVar.i()));
    }

    public final void S(w4.l lVar, g gVar, j jVar) throws IOException {
        Object obj;
        p D2 = lVar.D2();
        if (D2 != null) {
            Class<?> k02 = h.k0(jVar);
            if (k02 == null && (obj = this.V) != null) {
                k02 = obj.getClass();
            }
            gVar.U0(k02, lVar, D2);
        }
    }

    public <T> T S0(URL url, Class<T> cls) throws IOException {
        return n0(cls).R0(url);
    }

    public v S1(Object obj) {
        return U((f) this.O.C0(obj));
    }

    public void T(w4.d dVar) {
        if (dVar != null && !this.Q.e(dVar)) {
            throw new IllegalArgumentException("Cannot use FormatSchema of type " + dVar.getClass().getName() + " for format " + this.Q.x());
        }
    }

    public <T> T T0(w4.l lVar) throws IOException {
        r("p", lVar);
        return s(lVar, this.V);
    }

    public v T1(h... hVarArr) {
        return U(this.O.n1(hVarArr));
    }

    public v U(f fVar) {
        if (fVar == this.O) {
            return this;
        }
        v K = K(this, fVar);
        l5.l lVar = this.Y;
        return lVar != null ? K.C1(lVar.e(fVar)) : K;
    }

    public <T> T U0(w4.l lVar, j jVar) throws IOException {
        r("p", lVar);
        return m0(jVar).T0(lVar);
    }

    public v U1(c... cVarArr) {
        return U(this.O.o1(cVarArr));
    }

    public v V(String str) {
        r("pointerExpr", str);
        return new v(this, (d) new a5.c(str));
    }

    public <T> T V0(byte[] bArr) throws IOException {
        return this.Y != null ? A(bArr, 0, bArr.length) : t(y(h0(bArr), false));
    }

    public v V1(l.a... aVarArr) {
        return U(this.O.p1(aVarArr));
    }

    public v W(w4.m mVar) {
        r("pointer", mVar);
        return new v(this, (d) new a5.c(mVar));
    }

    public <T> T W0(byte[] bArr, int i10, int i11) throws IOException {
        return this.Y != null ? A(bArr, i10, i11) : t(y(i0(bArr, i10, i11), false));
    }

    public v W1() {
        return U(this.O.y0(y.V));
    }

    /* renamed from: X */
    public m a() {
        return this.O.K0().z();
    }

    public <T> T X0(byte[] bArr, int i10, int i11, Class<T> cls) throws IOException {
        return n0(cls).W0(bArr, i10, i11);
    }

    public m Y(w4.l lVar) {
        return this.P.m1(this.O, lVar, this.X);
    }

    public <T> T Y0(byte[] bArr, Class<T> cls) throws IOException {
        return n0(cls).V0(bArr);
    }

    public w4.l Z() throws IOException {
        return this.Q.l();
    }

    public <T> r<T> Z0(DataInput dataInput) throws IOException {
        if (this.Y != null) {
            P(dataInput);
        }
        return v(y(b0(dataInput), true));
    }

    /* renamed from: a0 */
    public m b() {
        return this.O.K0().A();
    }

    public <T> r<T> a1(File file) throws IOException {
        l5.l lVar = this.Y;
        return lVar != null ? C(lVar.b(H(file)), false) : v(y(c0(file), true));
    }

    public w4.l b0(DataInput dataInput) throws IOException {
        r(t.f13205o, dataInput);
        return this.Q.m(dataInput);
    }

    public <T> r<T> b1(InputStream inputStream) throws IOException {
        l5.l lVar = this.Y;
        return lVar != null ? C(lVar.b(inputStream), false) : v(y(d0(inputStream), true));
    }

    public w4.l c0(File file) throws IOException {
        r("src", file);
        return this.Q.n(file);
    }

    public <T> r<T> c1(Reader reader) throws IOException {
        if (this.Y != null) {
            P(reader);
        }
        w4.l y10 = y(e0(reader), true);
        m Y2 = Y(y10);
        F(Y2, y10);
        y10.D2();
        return N(y10, Y2, D(Y2), true);
    }

    public w4.l d0(InputStream inputStream) throws IOException {
        r("in", inputStream);
        return this.Q.o(inputStream);
    }

    public <T> r<T> d1(String str) throws IOException {
        if (this.Y != null) {
            P(str);
        }
        w4.l y10 = y(f0(str), true);
        m Y2 = Y(y10);
        F(Y2, y10);
        y10.D2();
        return N(y10, Y2, D(Y2), true);
    }

    public <T extends a0> T e(w4.l lVar) throws IOException {
        r("p", lVar);
        return x(lVar);
    }

    public w4.l e0(Reader reader) throws IOException {
        r(r.f25096b, reader);
        return this.Q.p(reader);
    }

    public <T> r<T> e1(URL url) throws IOException {
        l5.l lVar = this.Y;
        return lVar != null ? C(lVar.b(I(url)), true) : v(y(g0(url), true));
    }

    public w4.l f(a0 a0Var) {
        r("n", a0Var);
        return new y((m) a0Var, L1((Object) null));
    }

    public w4.l f0(String str) throws IOException {
        r(t.f13205o, str);
        return this.Q.q(str);
    }

    public <T> r<T> f1(w4.l lVar) throws IOException {
        r("p", lVar);
        m Y2 = Y(lVar);
        return N(lVar, Y2, D(Y2), false);
    }

    public void g(i iVar, a0 a0Var) {
        throw new UnsupportedOperationException();
    }

    public w4.l g0(URL url) throws IOException {
        r("src", url);
        return this.Q.r(url);
    }

    public final <T> r<T> g1(byte[] bArr) throws IOException {
        r("src", bArr);
        return h1(bArr, 0, bArr.length);
    }

    public f h() {
        return this.Q;
    }

    public w4.l h0(byte[] bArr) throws IOException {
        r(t.f13205o, bArr);
        return this.Q.s(bArr);
    }

    public <T> r<T> h1(byte[] bArr, int i10, int i11) throws IOException {
        l5.l lVar = this.Y;
        return lVar != null ? C(lVar.d(bArr, i10, i11), false) : v(y(i0(bArr, i10, i11), true));
    }

    public w4.l i0(byte[] bArr, int i10, int i11) throws IOException {
        r(t.f13205o, bArr);
        return this.Q.t(bArr, i10, i11);
    }

    public <T> Iterator<T> i1(w4.l lVar, j jVar) throws IOException {
        r("p", lVar);
        return m0(jVar).f1(lVar);
    }

    public <T> T j(w4.l lVar, a aVar) throws IOException {
        r("p", lVar);
        return m0((j) aVar).T0(lVar);
    }

    public w4.l j0(char[] cArr) throws IOException {
        r(t.f13205o, cArr);
        return this.Q.u(cArr);
    }

    public v j1(com.fasterxml.jackson.databind.node.m mVar) {
        return U(this.O.V0(mVar));
    }

    public <T> T k(w4.l lVar, b<T> bVar) throws IOException {
        r("p", lVar);
        return l0(bVar).T0(lVar);
    }

    public w4.l k0(char[] cArr, int i10, int i11) throws IOException {
        r(t.f13205o, cArr);
        return this.Q.v(cArr, i10, i11);
    }

    public v k1(f fVar) {
        return U(fVar);
    }

    public <T> T l(w4.l lVar, Class<T> cls) throws IOException {
        r("p", lVar);
        return n0(cls).T0(lVar);
    }

    public v l0(b<?> bVar) {
        return m0(this.O.M().Y(bVar.b()));
    }

    public v l1(h hVar) {
        return U(this.O.W0(hVar));
    }

    public <T> Iterator<T> m(w4.l lVar, a aVar) throws IOException {
        r("p", lVar);
        return i1(lVar, (j) aVar);
    }

    public v m0(j jVar) {
        if (jVar != null && jVar.equals(this.T)) {
            return this;
        }
        k<Object> O2 = O(jVar);
        l5.l lVar = this.Y;
        if (lVar != null) {
            lVar = lVar.j(jVar);
        }
        return L(this, this.O, jVar, O2, this.V, this.W, this.X, lVar);
    }

    public v m1(h hVar, h... hVarArr) {
        return U(this.O.X0(hVar, hVarArr));
    }

    public <T> Iterator<T> n(w4.l lVar, b<T> bVar) throws IOException {
        r("p", lVar);
        return l0(bVar).f1(lVar);
    }

    public v n0(Class<?> cls) {
        return m0(this.O.h(cls));
    }

    public v n1(i iVar) {
        if (this.X == iVar) {
            return this;
        }
        return L(this, this.O, this.T, this.U, this.V, this.W, iVar, this.Y);
    }

    public <T> Iterator<T> o(w4.l lVar, Class<T> cls) throws IOException {
        r("p", lVar);
        return n0(cls).f1(lVar);
    }

    public e o0() {
        return this.O.n();
    }

    public v o1(Locale locale) {
        return U((f) this.O.k0(locale));
    }

    public <T> T p(a0 a0Var, Class<T> cls) throws n {
        r("n", a0Var);
        try {
            return l(f(a0Var), cls);
        } catch (n e10) {
            throw e10;
        } catch (IOException e11) {
            throw l.p(e11);
        }
    }

    public f p0() {
        return this.O;
    }

    public v p1(TimeZone timeZone) {
        return U((f) this.O.l0(timeZone));
    }

    public void q(i iVar, Object obj) throws IOException {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    public i q0() {
        return this.X;
    }

    public v q1(e eVar) {
        return U(this.O.m0(eVar));
    }

    public final void r(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", new Object[]{str}));
        }
    }

    public z5.n r0() {
        return this.O.M();
    }

    public v r1(w4.a aVar) {
        return U((f) this.O.r0(aVar));
    }

    public Object s(w4.l lVar, Object obj) throws IOException {
        m Y2 = Y(lVar);
        p G = G(Y2, lVar);
        if (G == p.VALUE_NULL) {
            if (obj == null) {
                obj = D(Y2).d(Y2);
            }
        } else if (!(G == p.END_ARRAY || G == p.END_OBJECT)) {
            k<Object> D = D(Y2);
            obj = this.R ? R(lVar, Y2, this.T, D) : obj == null ? D.f(lVar, Y2) : D.g(lVar, Y2, obj);
        }
        lVar.w();
        if (this.O.S0(h.FAIL_ON_TRAILING_TOKENS)) {
            S(lVar, Y2, this.T);
        }
        return obj;
    }

    public j s0() {
        return this.T;
    }

    public v s1(c cVar) {
        return U(this.O.a1(cVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        if (r5 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        r0.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object t(w4.l r5) throws java.io.IOException {
        /*
            r4 = this;
            l5.m r0 = r4.Y(r5)     // Catch:{ all -> 0x0054 }
            w4.p r1 = r4.G(r0, r5)     // Catch:{ all -> 0x0054 }
            w4.p r2 = w4.p.VALUE_NULL     // Catch:{ all -> 0x0054 }
            if (r1 != r2) goto L_0x0019
            java.lang.Object r1 = r4.V     // Catch:{ all -> 0x0054 }
            if (r1 != 0) goto L_0x003f
            i5.k r1 = r4.D(r0)     // Catch:{ all -> 0x0054 }
            java.lang.Object r1 = r1.d(r0)     // Catch:{ all -> 0x0054 }
            goto L_0x003f
        L_0x0019:
            w4.p r2 = w4.p.END_ARRAY     // Catch:{ all -> 0x0054 }
            if (r1 == r2) goto L_0x003d
            w4.p r2 = w4.p.END_OBJECT     // Catch:{ all -> 0x0054 }
            if (r1 != r2) goto L_0x0022
            goto L_0x003d
        L_0x0022:
            i5.k r1 = r4.D(r0)     // Catch:{ all -> 0x0054 }
            boolean r2 = r4.R     // Catch:{ all -> 0x0054 }
            if (r2 == 0) goto L_0x0031
            i5.j r2 = r4.T     // Catch:{ all -> 0x0054 }
            java.lang.Object r1 = r4.R(r5, r0, r2, r1)     // Catch:{ all -> 0x0054 }
            goto L_0x003f
        L_0x0031:
            java.lang.Object r2 = r4.V     // Catch:{ all -> 0x0054 }
            if (r2 != 0) goto L_0x003a
            java.lang.Object r1 = r1.f(r5, r0)     // Catch:{ all -> 0x0054 }
            goto L_0x003f
        L_0x003a:
            r1.g(r5, r0, r2)     // Catch:{ all -> 0x0054 }
        L_0x003d:
            java.lang.Object r1 = r4.V     // Catch:{ all -> 0x0054 }
        L_0x003f:
            i5.f r2 = r4.O     // Catch:{ all -> 0x0054 }
            i5.h r3 = i5.h.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x0054 }
            boolean r2 = r2.S0(r3)     // Catch:{ all -> 0x0054 }
            if (r2 == 0) goto L_0x004e
            i5.j r2 = r4.T     // Catch:{ all -> 0x0054 }
            r4.S(r5, r0, r2)     // Catch:{ all -> 0x0054 }
        L_0x004e:
            if (r5 == 0) goto L_0x0053
            r5.close()
        L_0x0053:
            return r1
        L_0x0054:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r1 = move-exception
            if (r5 == 0) goto L_0x0061
            r5.close()     // Catch:{ all -> 0x005d }
            goto L_0x0061
        L_0x005d:
            r5 = move-exception
            r0.addSuppressed(r5)
        L_0x0061:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.v.t(w4.l):java.lang.Object");
    }

    public boolean t0(h hVar) {
        return this.O.S0(hVar);
    }

    public v t1(w4.d dVar) {
        if (this.W == dVar) {
            return this;
        }
        T(dVar);
        return L(this, this.O, this.T, this.U, this.V, dVar, this.X, this.Y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        r0.addSuppressed(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0017, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        if (r3 != null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i5.m u(w4.l r3) throws java.io.IOException {
        /*
            r2 = this;
            i5.m r0 = r2.w(r3)     // Catch:{ all -> 0x000a }
            if (r3 == 0) goto L_0x0009
            r3.close()
        L_0x0009:
            return r0
        L_0x000a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000c }
        L_0x000c:
            r1 = move-exception
            if (r3 == 0) goto L_0x0017
            r3.close()     // Catch:{ all -> 0x0013 }
            goto L_0x0017
        L_0x0013:
            r3 = move-exception
            r0.addSuppressed(r3)
        L_0x0017:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.v.u(w4.l):i5.m");
    }

    public boolean u0(q qVar) {
        return this.O.T(qVar);
    }

    public v u1(f fVar) {
        if (fVar == this.Q) {
            return this;
        }
        v M = M(this, fVar);
        if (fVar.w0() == null) {
            fVar.J0(M);
        }
        return M;
    }

    public <T> r<T> v(w4.l lVar) throws IOException {
        m Y2 = Y(lVar);
        F(Y2, lVar);
        lVar.D2();
        return N(lVar, Y2, D(Y2), true);
    }

    public boolean v0(l.a aVar) {
        return this.O.T0(aVar, this.Q);
    }

    public v v1(l.a aVar) {
        return U(this.O.b1(aVar));
    }

    public b0 version() {
        return k5.l.O;
    }

    public final m w(w4.l lVar) throws IOException {
        m mVar;
        m mVar2;
        this.O.O0(lVar);
        w4.d dVar = this.W;
        if (dVar != null) {
            lVar.Y2(dVar);
        }
        p Z0 = lVar.Z0();
        if (Z0 == null && (Z0 = lVar.D2()) == null) {
            return this.O.K0().h();
        }
        f fVar = this.O;
        h hVar = h.FAIL_ON_TRAILING_TOKENS;
        boolean S0 = fVar.S0(hVar);
        if (Z0 == p.VALUE_NULL) {
            mVar2 = this.O.K0().b();
            if (!S0) {
                return mVar2;
            }
            mVar = Y(lVar);
        } else {
            mVar = Y(lVar);
            k<Object> E = E(mVar);
            mVar2 = (m) (this.R ? R(lVar, mVar, J(), E) : E.f(lVar, mVar));
        }
        if (this.O.S0(hVar)) {
            S(lVar, mVar, J());
        }
        return mVar2;
    }

    public boolean w0(w4.v vVar) {
        return this.O.T0(vVar.i(), this.Q);
    }

    public v w1(w4.v vVar) {
        return U(this.O.b1(vVar.i()));
    }

    public final m x(w4.l lVar) throws IOException {
        m mVar;
        m mVar2;
        this.O.O0(lVar);
        w4.d dVar = this.W;
        if (dVar != null) {
            lVar.Y2(dVar);
        }
        p Z0 = lVar.Z0();
        if (Z0 == null && (Z0 = lVar.D2()) == null) {
            return null;
        }
        boolean S0 = this.O.S0(h.FAIL_ON_TRAILING_TOKENS);
        if (Z0 == p.VALUE_NULL) {
            mVar2 = this.O.K0().b();
            if (!S0) {
                return mVar2;
            }
            mVar = Y(lVar);
        } else {
            mVar = Y(lVar);
            k<Object> E = E(mVar);
            mVar2 = (m) (this.R ? R(lVar, mVar, J(), E) : E.f(lVar, mVar));
        }
        if (S0) {
            S(lVar, mVar, J());
        }
        return mVar2;
    }

    /* renamed from: x0 */
    public m c() {
        return this.O.K0().h();
    }

    public v x1(Object obj, Object obj2) {
        return U((f) this.O.v0(obj, obj2));
    }

    public w4.l y(w4.l lVar, boolean z10) {
        return (this.S == null || a5.b.class.isInstance(lVar)) ? lVar : new a5.b(lVar, this.S, false, z10);
    }

    /* renamed from: y0 */
    public m d() {
        return this.O.K0().b();
    }

    public v y1(Map<?, ?> map) {
        return U((f) this.O.w0(map));
    }

    public Object z(l.b bVar, boolean z10) throws IOException {
        if (!bVar.f()) {
            Q(this.Y, bVar);
        }
        w4.l a10 = bVar.a();
        if (z10) {
            a10.a0(l.a.AUTO_CLOSE_SOURCE);
        }
        return bVar.e().t(a10);
    }

    public m z0(DataInput dataInput) throws IOException {
        if (this.Y != null) {
            P(dataInput);
        }
        return u(y(b0(dataInput), false));
    }

    public v z1(h... hVarArr) {
        return U(this.O.c1(hVarArr));
    }
}

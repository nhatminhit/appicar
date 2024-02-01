package i5;

import a6.h;
import c5.l;
import c5.m;
import com.fasterxml.jackson.databind.ser.r;
import h5.k;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import s5.g;
import w4.b0;
import w4.c;
import w4.c0;
import w4.d;
import w4.e;
import w4.f;
import w4.i;
import w4.l;
import w4.n;
import w4.t;
import w4.u;
import x5.q;

public class w implements c0, Serializable {
    public static final long U = 1;
    public static final t V = new k();
    public final c0 O;
    public final com.fasterxml.jackson.databind.ser.k P;
    public final r Q;
    public final f R;
    public final a S;
    public final b T;

    public static final class a implements Serializable {
        public static final long S = 1;
        public static final a T = new a((t) null, (d) null, (c5.b) null, (u) null);
        public final t O;
        public final d P;
        public final c5.b Q;
        public final u R;

        public a(t tVar, d dVar, c5.b bVar, u uVar) {
            this.O = tVar;
            this.P = dVar;
            this.Q = bVar;
            this.R = uVar;
        }

        public final String a() {
            u uVar = this.R;
            if (uVar == null) {
                return null;
            }
            return uVar.getValue();
        }

        public void b(i iVar) {
            t tVar = this.O;
            if (tVar != null) {
                if (tVar == w.V) {
                    tVar = null;
                } else if (tVar instanceof h5.f) {
                    tVar = (t) ((h5.f) tVar).d();
                }
                iVar.N1(tVar);
            }
            c5.b bVar = this.Q;
            if (bVar != null) {
                iVar.p1(bVar);
            }
            d dVar = this.P;
            if (dVar != null) {
                iVar.P1(dVar);
            }
            u uVar = this.R;
            if (uVar != null) {
                iVar.O1(uVar);
            }
        }

        public a c(c5.b bVar) {
            return this.Q == bVar ? this : new a(this.O, this.P, bVar, this.R);
        }

        public a d(d dVar) {
            return this.P == dVar ? this : new a(this.O, dVar, this.Q, this.R);
        }

        public a e(t tVar) {
            if (tVar == null) {
                tVar = w.V;
            }
            return tVar == this.O ? this : new a(tVar, this.P, this.Q, this.R);
        }

        public a f(String str) {
            return str == null ? this.R == null ? this : new a(this.O, this.P, this.Q, (u) null) : str.equals(a()) ? this : new a(this.O, this.P, this.Q, new m(str));
        }

        public a g(u uVar) {
            return uVar == null ? this.R == null ? this : new a(this.O, this.P, this.Q, (u) null) : uVar.equals(this.R) ? this : new a(this.O, this.P, this.Q, uVar);
        }
    }

    public static final class b implements Serializable {
        public static final long R = 1;
        public static final b S = new b((j) null, (o<Object>) null, (u5.i) null);
        public final j O;
        public final o<Object> P;
        public final u5.i Q;

        public b(j jVar, o<Object> oVar, u5.i iVar) {
            this.O = jVar;
            this.P = oVar;
            this.Q = iVar;
        }

        public b a(w wVar, j jVar) {
            if (jVar == null) {
                return (this.O == null || this.P == null) ? this : new b((j) null, (o<Object>) null, (u5.i) null);
            }
            if (jVar.equals(this.O)) {
                return this;
            }
            if (jVar.X()) {
                try {
                    return new b((j) null, (o<Object>) null, wVar.h().c0(jVar));
                } catch (l e10) {
                    throw new a0(e10);
                }
            } else {
                if (wVar.C(d0.EAGER_SERIALIZER_FETCH)) {
                    try {
                        o<Object> d02 = wVar.h().d0(jVar, true, (d) null);
                        return d02 instanceof q ? new b(jVar, (o<Object>) null, ((q) d02).r()) : new b(jVar, d02, (u5.i) null);
                    } catch (l unused) {
                    }
                }
                return new b(jVar, (o<Object>) null, this.Q);
            }
        }

        public final u5.i b() {
            return this.Q;
        }

        public final o<Object> c() {
            return this.P;
        }

        public boolean d() {
            return (this.P == null && this.Q == null) ? false : true;
        }

        public void e(i iVar, Object obj, com.fasterxml.jackson.databind.ser.k kVar) throws IOException {
            u5.i iVar2 = this.Q;
            if (iVar2 != null) {
                kVar.X0(iVar, obj, this.O, this.P, iVar2);
                return;
            }
            o<Object> oVar = this.P;
            if (oVar != null) {
                kVar.a1(iVar, obj, this.O, oVar);
                return;
            }
            j jVar = this.O;
            if (jVar != null) {
                kVar.Z0(iVar, obj, jVar);
            } else {
                kVar.Y0(iVar, obj);
            }
        }
    }

    public w(u uVar, c0 c0Var) {
        this.O = c0Var;
        this.P = uVar.V;
        this.Q = uVar.W;
        this.R = uVar.O;
        this.S = a.T;
        this.T = b.S;
    }

    public w(u uVar, c0 c0Var, j jVar, t tVar) {
        this.O = c0Var;
        this.P = uVar.V;
        this.Q = uVar.W;
        this.R = uVar.O;
        this.S = tVar == null ? a.T : new a(tVar, (d) null, (c5.b) null, (u) null);
        this.T = jVar == null ? b.S : jVar.j(Object.class) ? b.S.a(this, jVar) : b.S.a(this, jVar.g0());
    }

    public w(u uVar, c0 c0Var, d dVar) {
        this.O = c0Var;
        this.P = uVar.V;
        this.Q = uVar.W;
        this.R = uVar.O;
        this.S = dVar == null ? a.T : new a((t) null, dVar, (c5.b) null, (u) null);
        this.T = b.S;
    }

    public w(w wVar, c0 c0Var) {
        this.O = c0Var;
        this.P = wVar.P;
        this.Q = wVar.Q;
        this.R = wVar.R;
        this.S = wVar.S;
        this.T = wVar.T;
    }

    public w(w wVar, c0 c0Var, a aVar, b bVar) {
        this.O = c0Var;
        this.P = wVar.P;
        this.Q = wVar.Q;
        this.R = wVar.R;
        this.S = aVar;
        this.T = bVar;
    }

    public w(w wVar, f fVar) {
        this.O = (c0) wVar.O.Y(q.SORT_PROPERTIES_ALPHABETICALLY, fVar.F());
        this.P = wVar.P;
        this.Q = wVar.Q;
        this.R = fVar;
        this.S = wVar.S;
        this.T = wVar.T;
    }

    public boolean A() {
        return this.T.d();
    }

    public String A0(Object obj) throws n {
        l lVar = new l(this.R.W());
        try {
            b(s(lVar), obj);
            return lVar.c();
        } catch (n e10) {
            throw e10;
        } catch (IOException e11) {
            throw l.p(e11);
        }
    }

    public boolean B(q qVar) {
        return this.O.T(qVar);
    }

    public b0 B0(DataOutput dataOutput) throws IOException {
        return g(false, o(dataOutput), true);
    }

    public boolean C(d0 d0Var) {
        return this.O.P0(d0Var);
    }

    public b0 C0(File file) throws IOException {
        return g(false, p(file, e.UTF8), true);
    }

    public boolean D(i.b bVar) {
        return this.R.D(bVar);
    }

    public b0 D0(OutputStream outputStream) throws IOException {
        return g(false, r(outputStream, e.UTF8), true);
    }

    @Deprecated
    public boolean E(l.a aVar) {
        return this.R.E(aVar);
    }

    public b0 E0(Writer writer) throws IOException {
        return g(false, s(writer), true);
    }

    public boolean F(w4.w wVar) {
        return this.R.E0(wVar);
    }

    public b0 F0(i iVar) throws IOException {
        a("g", iVar);
        c(iVar);
        return g(false, iVar, false);
    }

    public w G(c5.b bVar) {
        return d(this.S.c(bVar), this.T);
    }

    public b0 G0(DataOutput dataOutput) throws IOException {
        return g(true, o(dataOutput), true);
    }

    public w H(com.fasterxml.jackson.databind.ser.l lVar) {
        return lVar == this.O.J0() ? this : e(this, this.O.c1(lVar));
    }

    public b0 H0(File file) throws IOException {
        return g(true, p(file, e.UTF8), true);
    }

    public w I(d0 d0Var) {
        return e(this, this.O.R0(d0Var));
    }

    public b0 I0(OutputStream outputStream) throws IOException {
        return g(true, r(outputStream, e.UTF8), true);
    }

    public w J(d0 d0Var, d0... d0VarArr) {
        return e(this, this.O.S0(d0Var, d0VarArr));
    }

    public b0 J0(Writer writer) throws IOException {
        return g(true, s(writer), true);
    }

    public w K(DateFormat dateFormat) {
        return e(this, this.O.j0(dateFormat));
    }

    public b0 K0(i iVar) throws IOException {
        a("gen", iVar);
        return g(true, iVar, false);
    }

    public w L(Locale locale) {
        return e(this, (c0) this.O.k0(locale));
    }

    public w M(TimeZone timeZone) {
        return e(this, (c0) this.O.l0(timeZone));
    }

    public w N(k5.e eVar) {
        return e(this, this.O.m0(eVar));
    }

    public w O(w4.a aVar) {
        return e(this, (c0) this.O.r0(aVar));
    }

    public w P(c cVar) {
        return e(this, this.O.W0(cVar));
    }

    public w Q(d dVar) {
        i(dVar);
        return d(this.S.d(dVar), this.T);
    }

    public w R(f fVar) {
        return fVar == this.R ? this : f(this, fVar);
    }

    public w S(i.b bVar) {
        return e(this, this.O.X0(bVar));
    }

    public w T(t tVar) {
        return d(this.S.e(tVar), this.T);
    }

    public w U(w4.w wVar) {
        return e(this, this.O.X0(wVar.i()));
    }

    public w V(Object obj, Object obj2) {
        return e(this, (c0) this.O.v0(obj, obj2));
    }

    public w W(Map<?, ?> map) {
        return e(this, (c0) this.O.w0(map));
    }

    public w X() {
        return T(this.O.I0());
    }

    public w Y(d0... d0VarArr) {
        return e(this, this.O.Z0(d0VarArr));
    }

    public w Z(c... cVarArr) {
        return e(this, this.O.a1(cVarArr));
    }

    public final void a(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", new Object[]{str}));
        }
    }

    public w a0(i.b... bVarArr) {
        return e(this, this.O.b1(bVarArr));
    }

    public final void b(i iVar, Object obj) throws IOException {
        c(iVar);
        if (!this.O.P0(d0.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                this.T.e(iVar, obj, h());
                iVar.close();
            } catch (Exception e10) {
                h.k(iVar, e10);
            }
        } else {
            j(iVar, obj);
        }
    }

    public w b0(y yVar) {
        return e(this, this.O.y0(yVar));
    }

    public final void c(i iVar) {
        this.O.N0(iVar);
        this.S.b(iVar);
    }

    public w c0(String str) {
        return e(this, (c0) this.O.z0(str));
    }

    public w d(a aVar, b bVar) {
        return (this.S == aVar && this.T == bVar) ? this : new w(this, this.O, aVar, bVar);
    }

    public w d0(String str) {
        return d(this.S.f(str), this.T);
    }

    public w e(w wVar, c0 c0Var) {
        return c0Var == this.O ? this : new w(wVar, c0Var);
    }

    public w e0(u uVar) {
        return d(this.S.g(uVar), this.T);
    }

    public w f(w wVar, f fVar) {
        return new w(wVar, fVar);
    }

    @Deprecated
    public w f0(d dVar) {
        return Q(dVar);
    }

    public b0 g(boolean z10, i iVar, boolean z11) throws IOException {
        c(iVar);
        return new b0(h(), iVar, z11, this.T).i(z10);
    }

    @Deprecated
    public w g0(g5.b<?> bVar) {
        return t(bVar);
    }

    public com.fasterxml.jackson.databind.ser.k h() {
        return this.P.T0(this.O, this.Q);
    }

    @Deprecated
    public w h0(j jVar) {
        return u(jVar);
    }

    public void i(d dVar) {
        if (dVar != null && !this.R.e(dVar)) {
            throw new IllegalArgumentException("Cannot use FormatSchema of type " + dVar.getClass().getName() + " for format " + this.R.x());
        }
    }

    @Deprecated
    public w i0(Class<?> cls) {
        return v(cls);
    }

    public final void j(i iVar, Object obj) throws IOException {
        Closeable closeable;
        Exception e10;
        Closeable closeable2 = (Closeable) obj;
        try {
            this.T.e(iVar, obj, h());
            closeable = null;
            try {
                closeable2.close();
                iVar.close();
            } catch (Exception e11) {
                e10 = e11;
                h.j(iVar, closeable, e10);
            }
        } catch (Exception e12) {
            Closeable closeable3 = closeable2;
            e10 = e12;
            closeable = closeable3;
            h.j(iVar, closeable, e10);
        }
    }

    public w j0(Class<?> cls) {
        return e(this, this.O.A0(cls));
    }

    public void k(j jVar, g gVar) throws l {
        a("type", jVar);
        a("visitor", gVar);
        h().Q0(jVar, gVar);
    }

    public w k0(d0 d0Var) {
        return e(this, this.O.g1(d0Var));
    }

    public void l(Class<?> cls, g gVar) throws l {
        a("type", cls);
        a("visitor", gVar);
        k(this.O.h(cls), gVar);
    }

    public w l0(d0 d0Var, d0... d0VarArr) {
        return e(this, this.O.h1(d0Var, d0VarArr));
    }

    public boolean m(Class<?> cls) {
        a("type", cls);
        return h().W0(cls, (AtomicReference<Throwable>) null);
    }

    public w m0(c cVar) {
        return e(this, this.O.i1(cVar));
    }

    public boolean n(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        a("type", cls);
        return h().W0(cls, atomicReference);
    }

    public w n0(i.b bVar) {
        return e(this, this.O.j1(bVar));
    }

    public i o(DataOutput dataOutput) throws IOException {
        a("out", dataOutput);
        return this.R.f(dataOutput);
    }

    public w o0(w4.w wVar) {
        return e(this, this.O.j1(wVar.i()));
    }

    public i p(File file, e eVar) throws IOException {
        a("outputFile", file);
        return this.R.h(file, eVar);
    }

    public w p0(Object obj) {
        return e(this, (c0) this.O.C0(obj));
    }

    public i q(OutputStream outputStream) throws IOException {
        a("out", outputStream);
        return this.R.j(outputStream, e.UTF8);
    }

    public w q0(d0... d0VarArr) {
        return e(this, this.O.k1(d0VarArr));
    }

    public i r(OutputStream outputStream, e eVar) throws IOException {
        a("out", outputStream);
        return this.R.j(outputStream, eVar);
    }

    public w r0(c... cVarArr) {
        return e(this, this.O.l1(cVarArr));
    }

    public i s(Writer writer) throws IOException {
        a("w", writer);
        return this.R.k(writer);
    }

    public w s0(i.b... bVarArr) {
        return e(this, this.O.m1(bVarArr));
    }

    public w t(g5.b<?> bVar) {
        return u(this.O.M().Y(bVar.b()));
    }

    public w t0() {
        return e(this, this.O.y0(y.V));
    }

    public w u(j jVar) {
        return d(this.S, this.T.a(this, jVar));
    }

    public void u0(DataOutput dataOutput, Object obj) throws IOException {
        b(o(dataOutput), obj);
    }

    public w v(Class<?> cls) {
        return u(this.O.h(cls));
    }

    public void v0(File file, Object obj) throws IOException, w4.h, l {
        b(p(file, e.UTF8), obj);
    }

    public b0 version() {
        return k5.l.O;
    }

    public k5.e w() {
        return this.O.n();
    }

    public void w0(OutputStream outputStream, Object obj) throws IOException, w4.h, l {
        b(r(outputStream, e.UTF8), obj);
    }

    public c0 x() {
        return this.O;
    }

    public void x0(Writer writer, Object obj) throws IOException, w4.h, l {
        b(s(writer), obj);
    }

    public f y() {
        return this.R;
    }

    public void y0(i iVar, Object obj) throws IOException {
        a("g", iVar);
        c(iVar);
        if (!this.O.P0(d0.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            this.T.e(iVar, obj, h());
            if (this.O.P0(d0.FLUSH_AFTER_WRITE_VALUE)) {
                iVar.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            this.T.e(iVar, obj, h());
            if (this.O.P0(d0.FLUSH_AFTER_WRITE_VALUE)) {
                iVar.flush();
            }
            closeable.close();
        } catch (Exception e10) {
            h.j((i) null, closeable, e10);
        }
    }

    public z5.n z() {
        return this.O.M();
    }

    public byte[] z0(Object obj) throws n {
        h5.c cVar = new h5.c(this.R.W());
        try {
            b(r(cVar, e.UTF8), obj);
            byte[] P2 = cVar.P();
            cVar.a();
            return P2;
        } catch (n e10) {
            throw e10;
        } catch (IOException e11) {
            throw l.p(e11);
        }
    }
}

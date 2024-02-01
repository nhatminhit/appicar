package w4;

import b5.c;
import b5.d;
import c5.k;
import c5.o;
import d5.h;
import d5.j;
import d5.m;
import f5.b;
import h5.e;
import java.io.CharArrayReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;
import w4.i;
import w4.l;

public class f extends y implements c0, Serializable {

    /* renamed from: b0  reason: collision with root package name */
    public static final long f14618b0 = 2;

    /* renamed from: c0  reason: collision with root package name */
    public static final String f14619c0 = "JSON";

    /* renamed from: d0  reason: collision with root package name */
    public static final int f14620d0 = a.a();

    /* renamed from: e0  reason: collision with root package name */
    public static final int f14621e0 = l.a.a();

    /* renamed from: f0  reason: collision with root package name */
    public static final int f14622f0 = i.b.a();

    /* renamed from: g0  reason: collision with root package name */
    public static final u f14623g0 = e.W;

    /* renamed from: h0  reason: collision with root package name */
    public static final char f14624h0 = '\"';
    public final transient b P;
    public final transient f5.a Q;
    public int R;
    public int S;
    public int T;
    public s U;
    public c5.b V;
    public c5.e W;
    public k X;
    public u Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public final char f14625a0;

    public enum a {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        
        public final boolean O;

        /* access modifiers changed from: public */
        a(boolean z10) {
            this.O = z10;
        }

        public static int a() {
            int i10 = 0;
            for (a aVar : values()) {
                if (aVar.b()) {
                    i10 |= aVar.e();
                }
            }
            return i10;
        }

        public boolean b() {
            return this.O;
        }

        public boolean d(int i10) {
            return (i10 & e()) != 0;
        }

        public int e() {
            return 1 << ordinal();
        }
    }

    public f() {
        this((s) null);
    }

    public f(f fVar, s sVar) {
        this.P = b.o();
        this.Q = f5.a.F();
        this.R = f14620d0;
        this.S = f14621e0;
        this.T = f14622f0;
        this.Y = f14623g0;
        this.U = sVar;
        this.R = fVar.R;
        this.S = fVar.S;
        this.T = fVar.T;
        this.W = fVar.W;
        this.X = fVar.X;
        this.V = fVar.V;
        this.Y = fVar.Y;
        this.Z = fVar.Z;
        this.f14625a0 = fVar.f14625a0;
    }

    public f(g gVar) {
        this.P = b.o();
        this.Q = f5.a.F();
        this.R = f14620d0;
        this.S = f14621e0;
        this.T = f14622f0;
        this.Y = f14623g0;
        this.U = null;
        this.R = gVar.f14678a;
        this.S = gVar.f14679b;
        this.T = gVar.f14680c;
        this.W = gVar.f14681d;
        this.X = gVar.f14682e;
        this.V = gVar.f14626i;
        this.Y = gVar.f14627j;
        this.Z = gVar.f14628k;
        this.f14625a0 = gVar.f14629l;
    }

    public f(s sVar) {
        this.P = b.o();
        this.Q = f5.a.F();
        this.R = f14620d0;
        this.S = f14621e0;
        this.T = f14622f0;
        this.Y = f14623g0;
        this.U = sVar;
        this.f14625a0 = '\"';
    }

    public f(x<?, ?> xVar, boolean z10) {
        this.P = b.o();
        this.Q = f5.a.F();
        this.R = f14620d0;
        this.S = f14621e0;
        this.T = f14622f0;
        this.Y = f14623g0;
        this.U = null;
        this.R = xVar.f14678a;
        this.S = xVar.f14679b;
        this.T = xVar.f14680c;
        this.W = xVar.f14681d;
        this.X = xVar.f14682e;
        this.V = null;
        this.Y = null;
        this.Z = 0;
        this.f14625a0 = '\"';
    }

    public static x<?, ?> Z() {
        return new g();
    }

    public Class<? extends c> A() {
        return null;
    }

    public d A0(c cVar) throws IOException {
        if (getClass() == f.class) {
            return B0(cVar);
        }
        return null;
    }

    public final int B() {
        return this.T;
    }

    public d B0(c cVar) throws IOException {
        return d5.a.h(cVar);
    }

    public final int C() {
        return this.S;
    }

    public final boolean C0(a aVar) {
        return (aVar.e() & this.R) != 0;
    }

    public final boolean D(i.b bVar) {
        return (bVar.e() & this.T) != 0;
    }

    public final boolean D0(v vVar) {
        return (vVar.i().e() & this.S) != 0;
    }

    public final boolean E(l.a aVar) {
        return (aVar.e() & this.S) != 0;
    }

    public final boolean E0(w wVar) {
        return (wVar.i().e() & this.T) != 0;
    }

    public boolean F() {
        return false;
    }

    public Object F0() {
        return new f(this, this.U);
    }

    public void G(Class<?> cls) {
        if (getClass() != cls) {
            throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
        }
    }

    public x<?, ?> G0() {
        Y("Factory implementation for format (%s) MUST override `rebuild()` method");
        return new g(this);
    }

    public c5.d H(Object obj, boolean z10) {
        return new c5.d(W(), obj, z10);
    }

    public boolean H0() {
        return false;
    }

    public i I(Writer writer, c5.d dVar) throws IOException {
        m mVar = new m(dVar, this.T, this.U, writer, this.f14625a0);
        int i10 = this.Z;
        if (i10 > 0) {
            mVar.L1(i10);
        }
        c5.b bVar = this.V;
        if (bVar != null) {
            mVar.p1(bVar);
        }
        u uVar = this.Y;
        if (uVar != f14623g0) {
            mVar.O1(uVar);
        }
        return mVar;
    }

    public f I0(c5.b bVar) {
        this.V = bVar;
        return this;
    }

    public c5.d J(Object obj) {
        return new c5.d(W(), obj, false);
    }

    public f J0(s sVar) {
        this.U = sVar;
        return this;
    }

    public l K(DataInput dataInput, c5.d dVar) throws IOException {
        Y("InputData source not (yet?) supported for this format (%s)");
        int l10 = d5.a.l(dataInput);
        return new j(dVar, this.S, dataInput, this.U, this.Q.M(this.R), l10);
    }

    @Deprecated
    public f K0(c5.e eVar) {
        this.W = eVar;
        return this;
    }

    public l L(InputStream inputStream, c5.d dVar) throws IOException {
        return new d5.a(dVar, inputStream).c(this.S, this.U, this.Q, this.P, this.R);
    }

    @Deprecated
    public f L0(k kVar) {
        this.X = kVar;
        return this;
    }

    public l M(Reader reader, c5.d dVar) throws IOException {
        return new d5.i(dVar, this.S, reader, this.U, this.P.s(this.R));
    }

    public f M0(String str) {
        this.Y = str == null ? null : new c5.m(str);
        return this;
    }

    public l N(byte[] bArr, int i10, int i11, c5.d dVar) throws IOException {
        return new d5.a(dVar, bArr, i10, i11).c(this.S, this.U, this.Q, this.P, this.R);
    }

    public l O(char[] cArr, int i10, int i11, c5.d dVar, boolean z10) throws IOException {
        return new d5.i(dVar, this.S, (Reader) null, this.U, this.P.s(this.R), cArr, i10, i10 + i11, z10);
    }

    public i P(OutputStream outputStream, c5.d dVar) throws IOException {
        d5.k kVar = new d5.k(dVar, this.T, this.U, outputStream, this.f14625a0);
        int i10 = this.Z;
        if (i10 > 0) {
            kVar.L1(i10);
        }
        c5.b bVar = this.V;
        if (bVar != null) {
            kVar.p1(bVar);
        }
        u uVar = this.Y;
        if (uVar != f14623g0) {
            kVar.O1(uVar);
        }
        return kVar;
    }

    public Writer Q(OutputStream outputStream, e eVar, c5.d dVar) throws IOException {
        return eVar == e.UTF8 ? new o(dVar, outputStream) : new OutputStreamWriter(outputStream, eVar.b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.a(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.DataInput R(java.io.DataInput r2, c5.d r3) throws java.io.IOException {
        /*
            r1 = this;
            c5.e r0 = r1.W
            if (r0 == 0) goto L_0x000b
            java.io.DataInput r3 = r0.a(r3, r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.f.R(java.io.DataInput, c5.d):java.io.DataInput");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.b(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream S(java.io.InputStream r2, c5.d r3) throws java.io.IOException {
        /*
            r1 = this;
            c5.e r0 = r1.W
            if (r0 == 0) goto L_0x000b
            java.io.InputStream r3 = r0.b(r3, r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.f.S(java.io.InputStream, c5.d):java.io.InputStream");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.a(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.OutputStream T(java.io.OutputStream r2, c5.d r3) throws java.io.IOException {
        /*
            r1 = this;
            c5.k r0 = r1.X
            if (r0 == 0) goto L_0x000b
            java.io.OutputStream r3 = r0.a(r3, r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.f.T(java.io.OutputStream, c5.d):java.io.OutputStream");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.d(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Reader U(java.io.Reader r2, c5.d r3) throws java.io.IOException {
        /*
            r1 = this;
            c5.e r0 = r1.W
            if (r0 == 0) goto L_0x000b
            java.io.Reader r3 = r0.d(r3, r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.f.U(java.io.Reader, c5.d):java.io.Reader");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.b(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Writer V(java.io.Writer r2, c5.d r3) throws java.io.IOException {
        /*
            r1 = this;
            c5.k r0 = r1.X
            if (r0 == 0) goto L_0x000b
            java.io.Writer r3 = r0.b(r3, r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.f.V(java.io.Writer, c5.d):java.io.Writer");
    }

    public h5.a W() {
        return a.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.d(this.R) ? h5.b.a() : new h5.a();
    }

    public final boolean X() {
        return x() == f14619c0;
    }

    public final void Y(String str) {
        if (!X()) {
            throw new UnsupportedOperationException(String.format(str, new Object[]{x()}));
        }
    }

    public boolean a0() {
        return true;
    }

    @Deprecated
    public final f b0(a aVar, boolean z10) {
        return z10 ? s0(aVar) : p0(aVar);
    }

    public boolean c() {
        return false;
    }

    public final f c0(i.b bVar, boolean z10) {
        return z10 ? t0(bVar) : q0(bVar);
    }

    public boolean d() {
        return X();
    }

    public final f d0(l.a aVar, boolean z10) {
        return z10 ? u0(aVar) : r0(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r1 = x();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(w4.d r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r2.x()
            if (r1 == 0) goto L_0x0015
            java.lang.String r3 = r3.a()
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0015
            r0 = 1
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.f.e(w4.d):boolean");
    }

    public f e0() {
        G(f.class);
        return new f(this, (s) null);
    }

    public i f(DataOutput dataOutput) throws IOException {
        return j(a(dataOutput), e.UTF8);
    }

    @Deprecated
    public i f0(OutputStream outputStream) throws IOException {
        return j(outputStream, e.UTF8);
    }

    public i g(DataOutput dataOutput, e eVar) throws IOException {
        return j(a(dataOutput), eVar);
    }

    @Deprecated
    public i g0(OutputStream outputStream, e eVar) throws IOException {
        return j(outputStream, eVar);
    }

    public i h(File file, e eVar) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        c5.d H = H(fileOutputStream, true);
        H.x(eVar);
        return eVar == e.UTF8 ? P(T(fileOutputStream, H), H) : I(V(Q(fileOutputStream, eVar, H), H), H);
    }

    @Deprecated
    public i h0(Writer writer) throws IOException {
        return k(writer);
    }

    public i i(OutputStream outputStream) throws IOException {
        return j(outputStream, e.UTF8);
    }

    @Deprecated
    public l i0(File file) throws IOException, k {
        return n(file);
    }

    public i j(OutputStream outputStream, e eVar) throws IOException {
        c5.d H = H(outputStream, false);
        H.x(eVar);
        return eVar == e.UTF8 ? P(T(outputStream, H), H) : I(V(Q(outputStream, eVar, H), H), H);
    }

    @Deprecated
    public l j0(InputStream inputStream) throws IOException, k {
        return o(inputStream);
    }

    public i k(Writer writer) throws IOException {
        c5.d H = H(writer, false);
        return I(V(writer, H), H);
    }

    @Deprecated
    public l k0(Reader reader) throws IOException, k {
        return p(reader);
    }

    public l l() throws IOException {
        Y("Non-blocking source not (yet?) supported for this format (%s)");
        return new e5.a(J((Object) null), this.S, this.Q.M(this.R));
    }

    @Deprecated
    public l l0(String str) throws IOException, k {
        return q(str);
    }

    public l m(DataInput dataInput) throws IOException {
        c5.d H = H(dataInput, false);
        return K(R(dataInput, H), H);
    }

    @Deprecated
    public l m0(URL url) throws IOException, k {
        return r(url);
    }

    public l n(File file) throws IOException, k {
        c5.d H = H(file, true);
        return L(S(new FileInputStream(file), H), H);
    }

    @Deprecated
    public l n0(byte[] bArr) throws IOException, k {
        return s(bArr);
    }

    public l o(InputStream inputStream) throws IOException, k {
        c5.d H = H(inputStream, false);
        return L(S(inputStream, H), H);
    }

    @Deprecated
    public l o0(byte[] bArr, int i10, int i11) throws IOException, k {
        return t(bArr, i10, i11);
    }

    public l p(Reader reader) throws IOException, k {
        c5.d H = H(reader, false);
        return M(U(reader, H), H);
    }

    @Deprecated
    public f p0(a aVar) {
        this.R = (~aVar.e()) & this.R;
        return this;
    }

    public l q(String str) throws IOException, k {
        int length = str.length();
        if (this.W != null || length > 32768 || !a0()) {
            return p(new StringReader(str));
        }
        c5.d H = H(str, true);
        char[] k10 = H.k(length);
        str.getChars(0, length, k10, 0);
        return O(k10, 0, length, H, true);
    }

    public f q0(i.b bVar) {
        this.T = (~bVar.e()) & this.T;
        return this;
    }

    public l r(URL url) throws IOException, k {
        c5.d H = H(url, true);
        return L(S(b(url), H), H);
    }

    public f r0(l.a aVar) {
        this.S = (~aVar.e()) & this.S;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r1.c(r0, r5, 0, r5.length);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w4.l s(byte[] r5) throws java.io.IOException, w4.k {
        /*
            r4 = this;
            r0 = 1
            c5.d r0 = r4.H(r5, r0)
            c5.e r1 = r4.W
            r2 = 0
            if (r1 == 0) goto L_0x0016
            int r3 = r5.length
            java.io.InputStream r1 = r1.c(r0, r5, r2, r3)
            if (r1 == 0) goto L_0x0016
            w4.l r5 = r4.L(r1, r0)
            return r5
        L_0x0016:
            int r1 = r5.length
            w4.l r5 = r4.N(r5, r2, r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.f.s(byte[]):w4.l");
    }

    @Deprecated
    public f s0(a aVar) {
        this.R = aVar.e() | this.R;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r1.c(r0, r3, r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w4.l t(byte[] r3, int r4, int r5) throws java.io.IOException, w4.k {
        /*
            r2 = this;
            r0 = 1
            c5.d r0 = r2.H(r3, r0)
            c5.e r1 = r2.W
            if (r1 == 0) goto L_0x0014
            java.io.InputStream r1 = r1.c(r0, r3, r4, r5)
            if (r1 == 0) goto L_0x0014
            w4.l r3 = r2.L(r1, r0)
            return r3
        L_0x0014:
            w4.l r3 = r2.N(r3, r4, r5, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.f.t(byte[], int, int):w4.l");
    }

    public f t0(i.b bVar) {
        this.T = bVar.e() | this.T;
        return this;
    }

    public l u(char[] cArr) throws IOException {
        return v(cArr, 0, cArr.length);
    }

    public f u0(l.a aVar) {
        this.S = aVar.e() | this.S;
        return this;
    }

    public l v(char[] cArr, int i10, int i11) throws IOException {
        if (this.W != null) {
            return p(new CharArrayReader(cArr, i10, i11));
        }
        return O(cArr, i10, i11, H(cArr, true), false);
    }

    public c5.b v0() {
        return this.V;
    }

    public b0 version() {
        return h.O;
    }

    public int w() {
        return 0;
    }

    public s w0() {
        return this.U;
    }

    public String x() {
        if (getClass() == f.class) {
            return f14619c0;
        }
        return null;
    }

    public c5.e x0() {
        return this.W;
    }

    public int y() {
        return 0;
    }

    public k y0() {
        return this.X;
    }

    public Class<? extends c> z() {
        return null;
    }

    public String z0() {
        u uVar = this.Y;
        if (uVar == null) {
            return null;
        }
        return uVar.getValue();
    }
}

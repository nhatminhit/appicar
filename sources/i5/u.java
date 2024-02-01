package i5;

import a6.x;
import com.fasterxml.jackson.databind.node.y;
import com.fasterxml.jackson.databind.ser.h;
import com.fasterxml.jackson.databind.ser.k;
import com.fasterxml.jackson.databind.ser.r;
import i5.t;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import k5.j;
import l5.g;
import l5.m;
import l5.p;
import l5.q;
import l5.z;
import q5.f0;
import q5.t;
import q5.w;
import v4.c0;
import v4.f0;
import v4.h;
import v4.p0;
import v4.u;
import w4.a0;
import w4.b0;
import w4.c0;
import w4.f;
import w4.i;
import w4.l;
import w4.s;
import w4.v;
import z5.n;
import z5.o;

public class u extends s implements c0, Serializable {

    /* renamed from: b0  reason: collision with root package name */
    public static final long f9117b0 = 2;

    /* renamed from: c0  reason: collision with root package name */
    public static final b f9118c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final k5.a f9119d0;
    public final f O;
    public n P;
    public i Q;
    public u5.e R;
    public final k5.d S;
    public q5.c0 T;
    public c0 U;
    public k V;
    public r W;
    public f X;
    public m Y;
    public Set<Object> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final ConcurrentHashMap<j, k<Object>> f9120a0;

    public class a implements t.a {
        public a() {
        }

        public n A() {
            return u.this.P;
        }

        public void B(o oVar) {
            u.this.t3(u.this.P.o0(oVar));
        }

        public boolean a(i.b bVar) {
            return u.this.y1(bVar);
        }

        public k5.k b(Class<?> cls) {
            return u.this.b0(cls);
        }

        public void c(h hVar) {
            u uVar = u.this;
            uVar.W = uVar.W.g(hVar);
        }

        public void d(l5.n nVar) {
            u.this.T(nVar);
        }

        public void e(q5.t tVar) {
            u uVar = u.this;
            uVar.X = (f) uVar.X.o0(tVar);
            u uVar2 = u.this;
            uVar2.U = (c0) uVar2.U.o0(tVar);
        }

        public void f(com.fasterxml.jackson.databind.ser.s sVar) {
            u uVar = u.this;
            uVar.W = uVar.W.f(sVar);
        }

        public boolean g(h hVar) {
            return u.this.u1(hVar);
        }

        public void h(a aVar) {
            p p10 = u.this.Y.Q.p(aVar);
            u uVar = u.this;
            uVar.Y = uVar.Y.p1(p10);
        }

        public b0 i() {
            return u.this.version();
        }

        public void j(Collection<Class<?>> collection) {
            u.this.K2(collection);
        }

        public void k(z zVar) {
            u.this.n3(zVar);
        }

        public boolean l(d0 d0Var) {
            return u.this.w1(d0Var);
        }

        public <C extends s> C m() {
            return u.this;
        }

        public void n(b bVar) {
            u uVar = u.this;
            uVar.X = (f) uVar.X.u0(bVar);
            u uVar2 = u.this;
            uVar2.U = (c0) uVar2.U.u0(bVar);
        }

        public boolean o(l.a aVar) {
            return u.this.z1(aVar);
        }

        public void p(z zVar) {
            p t10 = u.this.Y.Q.t(zVar);
            u uVar = u.this;
            uVar.Y = uVar.Y.p1(t10);
        }

        public void q(g gVar) {
            p s10 = u.this.Y.Q.s(gVar);
            u uVar = u.this;
            uVar.Y = uVar.Y.p1(s10);
        }

        public boolean r(q qVar) {
            return u.this.v1(qVar);
        }

        public void s(q qVar) {
            p q10 = u.this.Y.Q.q(qVar);
            u uVar = u.this;
            uVar.Y = uVar.Y.p1(q10);
        }

        public boolean t(f.a aVar) {
            return u.this.x1(aVar);
        }

        public void u(com.fasterxml.jackson.databind.ser.s sVar) {
            u uVar = u.this;
            uVar.W = uVar.W.e(sVar);
        }

        public void v(b bVar) {
            u uVar = u.this;
            uVar.X = (f) uVar.X.x0(bVar);
            u uVar2 = u.this;
            uVar2.U = (c0) uVar2.U.x0(bVar);
        }

        public void w(Class<?>... clsArr) {
            u.this.L2(clsArr);
        }

        public void x(Class<?> cls, Class<?> cls2) {
            u.this.U(cls, cls2);
        }

        public void y(u5.c... cVarArr) {
            u.this.M2(cVarArr);
        }

        public void z(l5.r rVar) {
            p r10 = u.this.Y.Q.r(rVar);
            u uVar = u.this;
            uVar.Y = uVar.Y.p1(r10);
        }
    }

    public static class b implements PrivilegedAction<ServiceLoader<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ClassLoader f9122a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Class f9123b;

        public b(ClassLoader classLoader, Class cls) {
            this.f9122a = classLoader;
            this.f9123b = cls;
        }

        /* renamed from: a */
        public ServiceLoader<T> run() {
            ClassLoader classLoader = this.f9122a;
            return classLoader == null ? ServiceLoader.load(this.f9123b) : ServiceLoader.load(this.f9123b, classLoader);
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9124a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                i5.u$e[] r0 = i5.u.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9124a = r0
                i5.u$e r1 = i5.u.e.NON_CONCRETE_AND_ARRAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9124a     // Catch:{ NoSuchFieldError -> 0x001d }
                i5.u$e r1 = i5.u.e.OBJECT_AND_NON_CONCRETE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9124a     // Catch:{ NoSuchFieldError -> 0x0028 }
                i5.u$e r1 = i5.u.e.NON_FINAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9124a     // Catch:{ NoSuchFieldError -> 0x0033 }
                i5.u$e r1 = i5.u.e.EVERYTHING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9124a     // Catch:{ NoSuchFieldError -> 0x003e }
                i5.u$e r1 = i5.u.e.JAVA_LANG_OBJECT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.u.c.<clinit>():void");
        }
    }

    public static class d extends v5.n implements Serializable {
        public static final long W = 1;
        public final e U;
        public final u5.d V;

        @Deprecated
        public d(e eVar) {
            this(eVar, v5.k.R);
        }

        public d(e eVar, u5.d dVar) {
            this.U = (e) w(eVar, "Can not pass `null` DefaultTyping");
            this.V = (u5.d) w(dVar, "Can not pass `null` PolymorphicTypeValidator");
        }

        public static <T> T w(T t10, String str) {
            if (t10 != null) {
                return t10;
            }
            throw new NullPointerException(str);
        }

        public static d x(e eVar, u5.d dVar) {
            return new d(eVar, dVar);
        }

        public u5.f c(f fVar, j jVar, Collection<u5.c> collection) {
            if (y(jVar)) {
                return super.c(fVar, jVar, collection);
            }
            return null;
        }

        public u5.i h(c0 c0Var, j jVar, Collection<u5.c> collection) {
            if (y(jVar)) {
                return super.h(c0Var, jVar, collection);
            }
            return null;
        }

        public u5.d s(k5.i<?> iVar) {
            return this.V;
        }

        public boolean y(j jVar) {
            Class<a0> cls = a0.class;
            if (jVar.u()) {
                return false;
            }
            int i10 = c.f9124a[this.U.ordinal()];
            if (i10 == 1) {
                while (jVar.l()) {
                    jVar = jVar.d();
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    while (jVar.l()) {
                        jVar = jVar.d();
                    }
                    while (jVar.v()) {
                        jVar = jVar.h();
                    }
                    return !jVar.q() && !cls.isAssignableFrom(jVar.g());
                } else if (i10 != 4) {
                    return jVar.X();
                } else {
                    return true;
                }
            }
            while (jVar.v()) {
                jVar = jVar.h();
            }
            return jVar.X() || (!jVar.n() && !cls.isAssignableFrom(jVar.g()));
        }
    }

    public enum e {
        JAVA_LANG_OBJECT,
        OBJECT_AND_NON_CONCRETE,
        NON_CONCRETE_AND_ARRAYS,
        NON_FINAL,
        EVERYTHING
    }

    static {
        w wVar = new w();
        f9118c0 = wVar;
        f9119d0 = new k5.a((q5.t) null, wVar, (z) null, n.c0(), (u5.h<?>) null, a6.a0.f209e0, (k5.g) null, Locale.getDefault(), (TimeZone) null, w4.b.a(), v5.k.R);
    }

    public u() {
        this((f) null, (k) null, (m) null);
    }

    public u(u uVar) {
        this.f9120a0 = new ConcurrentHashMap<>(64, 0.6f, 2);
        f e02 = uVar.O.e0();
        this.O = e02;
        e02.J0(this);
        this.R = uVar.R.g();
        this.P = uVar.P;
        this.Q = uVar.Q;
        k5.d b10 = uVar.S.b();
        this.S = b10;
        this.T = uVar.T.a();
        x xVar = new x();
        this.U = new c0(uVar.U, this.T, xVar, b10);
        this.X = new f(uVar.X, this.T, xVar, b10);
        this.V = uVar.V.S0();
        this.Y = uVar.Y.l1();
        this.W = uVar.W;
        Set<Object> set = uVar.Z;
        if (set == null) {
            this.Z = null;
        } else {
            this.Z = new LinkedHashSet(set);
        }
    }

    public u(f fVar) {
        this(fVar, (k) null, (m) null);
    }

    public u(f fVar, k kVar, m mVar) {
        this.f9120a0 = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (fVar == null) {
            this.O = new s(this);
        } else {
            this.O = fVar;
            if (fVar.w0() == null) {
                fVar.J0(this);
            }
        }
        this.R = new v5.m();
        x xVar = new x();
        this.P = n.c0();
        q5.c0 c0Var = new q5.c0((t.a) null);
        this.T = c0Var;
        k5.a u10 = f9119d0.u(G0());
        k5.d dVar = new k5.d();
        this.S = dVar;
        k5.a aVar = u10;
        q5.c0 c0Var2 = c0Var;
        x xVar2 = xVar;
        k5.d dVar2 = dVar;
        this.U = new c0(aVar, this.R, c0Var2, xVar2, dVar2);
        this.X = new f(aVar, this.R, c0Var2, xVar2, dVar2);
        boolean F = this.O.F();
        c0 c0Var3 = this.U;
        q qVar = q.SORT_PROPERTIES_ALPHABETICALLY;
        if (c0Var3.T(qVar) ^ F) {
            d0(qVar, F);
        }
        this.V = kVar == null ? new k.a() : kVar;
        this.Y = mVar == null ? new m.a((p) l5.f.Z) : mVar;
        this.W = com.fasterxml.jackson.databind.ser.g.S;
    }

    public static <T> ServiceLoader<T> N2(Class<T> cls, ClassLoader classLoader) {
        return System.getSecurityManager() == null ? classLoader == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader) : (ServiceLoader) AccessController.doPrivileged(new b(classLoader, cls));
    }

    public static List<t> c1() {
        return d1((ClassLoader) null);
    }

    public static List<t> d1(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        Iterator<t> it = N2(t.class, classLoader).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public v A(f fVar) {
        return new v(this, fVar);
    }

    public l A0(URL url) throws IOException {
        r("src", url);
        return this.O.r(url);
    }

    public boolean A1(v vVar) {
        return z1(vVar.i());
    }

    public v A2(j jVar) {
        return B(g1(), jVar, (Object) null, (w4.d) null, this.Q);
    }

    public void A3(i iVar, m mVar) throws IOException, w4.n {
        r("g", iVar);
        c0 n12 = n1();
        I(n12).Y0(iVar, mVar);
        if (n12.P0(d0.FLUSH_AFTER_WRITE_VALUE)) {
            iVar.flush();
        }
    }

    public v B(f fVar, j jVar, Object obj, w4.d dVar, i iVar) {
        return new v(this, fVar, jVar, obj, dVar, iVar);
    }

    public l B0(byte[] bArr) throws IOException {
        r(t7.t.f13205o, bArr);
        return this.O.s(bArr);
    }

    public boolean B1(w4.w wVar) {
        return y1(wVar.i());
    }

    public v B2(Class<?> cls) {
        return B(g1(), this.P.Y(cls), (Object) null, (w4.d) null, this.Q);
    }

    public void B3(DataOutput dataOutput, Object obj) throws IOException {
        u(o0(dataOutput), obj);
    }

    public w C(c0 c0Var) {
        return new w(this, c0Var);
    }

    public l C0(byte[] bArr, int i10, int i11) throws IOException {
        r(t7.t.f13205o, bArr);
        return this.O.t(bArr, i10, i11);
    }

    /* renamed from: C1 */
    public m c() {
        return this.X.K0().h();
    }

    public v C2(Class<?> cls) {
        return B(g1(), this.P.z(cls), (Object) null, (w4.d) null, this.Q);
    }

    public void C3(File file, Object obj) throws IOException, w4.h, l {
        u(p0(file, w4.e.UTF8), obj);
    }

    public w D(c0 c0Var, j jVar, w4.t tVar) {
        return new w(this, c0Var, jVar, tVar);
    }

    public l D0(char[] cArr) throws IOException {
        r(t7.t.f13205o, cArr);
        return this.O.u(cArr);
    }

    public int D1() {
        return this.T.f();
    }

    public v D2(Class<?> cls) {
        return B(g1(), this.P.D(List.class, cls), (Object) null, (w4.d) null, this.Q);
    }

    public void D3(OutputStream outputStream, Object obj) throws IOException, w4.h, l {
        u(r0(outputStream, w4.e.UTF8), obj);
    }

    public w E(c0 c0Var, w4.d dVar) {
        return new w(this, c0Var, dVar);
    }

    public l E0(char[] cArr, int i10, int i11) throws IOException {
        r(t7.t.f13205o, cArr);
        return this.O.v(cArr, i10, i11);
    }

    /* renamed from: E1 */
    public m d() {
        return this.X.K0().b();
    }

    public v E2(Class<?> cls) {
        return B(g1(), this.P.J(Map.class, String.class, cls), (Object) null, (w4.d) null, this.Q);
    }

    public void E3(Writer writer, Object obj) throws IOException, w4.h, l {
        u(s0(writer), obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r10 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        r11.addSuppressed(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object F(w4.l r10, i5.j r11) throws java.io.IOException {
        /*
            r9 = this;
            w4.p r0 = r9.z(r10, r11)     // Catch:{ all -> 0x0050 }
            i5.f r7 = r9.g1()     // Catch:{ all -> 0x0050 }
            l5.m r8 = r9.n0(r10, r7)     // Catch:{ all -> 0x0050 }
            w4.p r1 = w4.p.VALUE_NULL     // Catch:{ all -> 0x0050 }
            if (r0 != r1) goto L_0x0019
            i5.k r0 = r9.x(r8, r11)     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.d(r8)     // Catch:{ all -> 0x0050 }
            goto L_0x003f
        L_0x0019:
            w4.p r1 = w4.p.END_ARRAY     // Catch:{ all -> 0x0050 }
            if (r0 == r1) goto L_0x003e
            w4.p r1 = w4.p.END_OBJECT     // Catch:{ all -> 0x0050 }
            if (r0 != r1) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            i5.k r6 = r9.x(r8, r11)     // Catch:{ all -> 0x0050 }
            boolean r0 = r7.X()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0036
            r1 = r9
            r2 = r10
            r3 = r8
            r4 = r7
            r5 = r11
            java.lang.Object r0 = r1.J(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0050 }
            goto L_0x003a
        L_0x0036:
            java.lang.Object r0 = r6.f(r10, r8)     // Catch:{ all -> 0x0050 }
        L_0x003a:
            r8.F()     // Catch:{ all -> 0x0050 }
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            i5.h r1 = i5.h.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x0050 }
            boolean r1 = r7.S0(r1)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004a
            r9.K(r10, r8, r11)     // Catch:{ all -> 0x0050 }
        L_0x004a:
            if (r10 == 0) goto L_0x004f
            r10.close()
        L_0x004f:
            return r0
        L_0x0050:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            if (r10 == 0) goto L_0x005d
            r10.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r10 = move-exception
            r11.addSuppressed(r10)
        L_0x005d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.u.F(w4.l, i5.j):java.lang.Object");
    }

    public u F0() {
        return a3((u5.h<?>) null);
    }

    public m F1(File file) throws IOException, w4.n {
        r("file", file);
        return G(this.O.n(file));
    }

    public v F2(Object obj) {
        return B(g1(), this.P.Y(obj.getClass()), obj, (w4.d) null, this.Q);
    }

    public byte[] F3(Object obj) throws w4.n {
        h5.c cVar = new h5.c(this.O.W());
        try {
            u(r0(cVar, w4.e.UTF8), obj);
            byte[] P2 = cVar.P();
            cVar.a();
            return P2;
        } catch (w4.n e10) {
            throw e10;
        } catch (IOException e11) {
            throw l.p(e11);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r10 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0073, code lost:
        r0.addSuppressed(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.m G(w4.l r10) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.Class<i5.m> r0 = i5.m.class
            i5.j r0 = r9.h0(r0)     // Catch:{ all -> 0x0069 }
            i5.f r4 = r9.g1()     // Catch:{ all -> 0x0069 }
            r4.O0(r10)     // Catch:{ all -> 0x0069 }
            w4.p r1 = r10.Z0()     // Catch:{ all -> 0x0069 }
            if (r1 != 0) goto L_0x0025
            w4.p r1 = r10.D2()     // Catch:{ all -> 0x0069 }
            if (r1 != 0) goto L_0x0025
            com.fasterxml.jackson.databind.node.m r0 = r4.K0()     // Catch:{ all -> 0x0069 }
            i5.m r0 = r0.h()     // Catch:{ all -> 0x0069 }
            r10.close()
            return r0
        L_0x0025:
            i5.h r2 = i5.h.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x0069 }
            boolean r7 = r4.S0(r2)     // Catch:{ all -> 0x0069 }
            w4.p r2 = w4.p.VALUE_NULL     // Catch:{ all -> 0x0069 }
            if (r1 != r2) goto L_0x0042
            com.fasterxml.jackson.databind.node.m r1 = r4.K0()     // Catch:{ all -> 0x0069 }
            com.fasterxml.jackson.databind.node.s r1 = r1.b()     // Catch:{ all -> 0x0069 }
            if (r7 != 0) goto L_0x003d
            r10.close()
            return r1
        L_0x003d:
            l5.m r2 = r9.n0(r10, r4)     // Catch:{ all -> 0x0069 }
            goto L_0x0060
        L_0x0042:
            l5.m r8 = r9.n0(r10, r4)     // Catch:{ all -> 0x0069 }
            i5.k r6 = r9.x(r8, r0)     // Catch:{ all -> 0x0069 }
            boolean r1 = r4.X()     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x0059
            r1 = r9
            r2 = r10
            r3 = r8
            r5 = r0
            java.lang.Object r1 = r1.J(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0069 }
            goto L_0x005d
        L_0x0059:
            java.lang.Object r1 = r6.f(r10, r8)     // Catch:{ all -> 0x0069 }
        L_0x005d:
            i5.m r1 = (i5.m) r1     // Catch:{ all -> 0x0069 }
            r2 = r8
        L_0x0060:
            if (r7 == 0) goto L_0x0065
            r9.K(r10, r2, r0)     // Catch:{ all -> 0x0069 }
        L_0x0065:
            r10.close()
            return r1
        L_0x0069:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006b }
        L_0x006b:
            r1 = move-exception
            if (r10 == 0) goto L_0x0076
            r10.close()     // Catch:{ all -> 0x0072 }
            goto L_0x0076
        L_0x0072:
            r10 = move-exception
            r0.addSuppressed(r10)
        L_0x0076:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.u.G(w4.l):i5.m");
    }

    public q5.t G0() {
        return new q5.r();
    }

    public m G1(InputStream inputStream) throws IOException {
        r("in", inputStream);
        return G(this.O.o(inputStream));
    }

    public v G2(Class<?> cls) {
        return A(g1().A0(cls));
    }

    public String G3(Object obj) throws w4.n {
        c5.l lVar = new c5.l(this.O.W());
        try {
            u(s0(lVar), obj);
            return lVar.c();
        } catch (w4.n e10) {
            throw e10;
        } catch (IOException e11) {
            throw l.p(e11);
        }
    }

    public Object H(f fVar, l lVar, j jVar) throws IOException {
        Object obj;
        w4.p z10 = z(lVar, jVar);
        m n02 = n0(lVar, fVar);
        if (z10 == w4.p.VALUE_NULL) {
            obj = x(n02, jVar).d(n02);
        } else if (z10 == w4.p.END_ARRAY || z10 == w4.p.END_OBJECT) {
            obj = null;
        } else {
            k<Object> x10 = x(n02, jVar);
            obj = fVar.X() ? J(lVar, n02, fVar, jVar, x10) : x10.f(lVar, n02);
        }
        lVar.w();
        if (fVar.S0(h.FAIL_ON_TRAILING_TOKENS)) {
            K(lVar, n02, jVar);
        }
        return obj;
    }

    public u H0(h hVar) {
        this.X = this.X.j1(hVar);
        return this;
    }

    public m H1(Reader reader) throws IOException {
        r(zb.r.f25096b, reader);
        return G(this.O.p(reader));
    }

    public u H2(t tVar) {
        Object c10;
        r("module", tVar);
        if (tVar.b() == null) {
            throw new IllegalArgumentException("Module without defined name");
        } else if (tVar.version() != null) {
            for (t H2 : tVar.a()) {
                H2(H2);
            }
            if (v1(q.IGNORE_DUPLICATE_MODULE_REGISTRATIONS) && (c10 = tVar.c()) != null) {
                if (this.Z == null) {
                    this.Z = new LinkedHashSet();
                }
                if (!this.Z.add(c10)) {
                    return this;
                }
            }
            tVar.d(new a());
            return this;
        } else {
            throw new IllegalArgumentException("Module without defined version");
        }
    }

    public w H3() {
        return C(n1());
    }

    public k I(c0 c0Var) {
        return this.V.T0(c0Var, this.W);
    }

    public u I0(h hVar, h... hVarArr) {
        this.X = this.X.k1(hVar, hVarArr);
        return this;
    }

    public m I1(String str) throws w4.n, l {
        r(t7.t.f13205o, str);
        try {
            return G(this.O.q(str));
        } catch (w4.n e10) {
            throw e10;
        } catch (IOException e11) {
            throw l.p(e11);
        }
    }

    public u I2(Iterable<? extends t> iterable) {
        r("modules", iterable);
        for (t H2 : iterable) {
            H2(H2);
        }
        return this;
    }

    public w I3(c5.b bVar) {
        return C(n1()).G(bVar);
    }

    public Object J(l lVar, g gVar, f fVar, j jVar, k<Object> kVar) throws IOException {
        String d10 = fVar.j(jVar).d();
        w4.p Z0 = lVar.Z0();
        w4.p pVar = w4.p.START_OBJECT;
        if (Z0 != pVar) {
            gVar.X0(jVar, pVar, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", d10, lVar.Z0());
        }
        w4.p D2 = lVar.D2();
        w4.p pVar2 = w4.p.FIELD_NAME;
        if (D2 != pVar2) {
            gVar.X0(jVar, pVar2, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", d10, lVar.Z0());
        }
        String X0 = lVar.X0();
        if (!d10.equals(X0)) {
            gVar.S0(jVar, X0, "Root name '%s' does not match expected ('%s') for type %s", X0, d10, jVar);
        }
        lVar.D2();
        Object f10 = kVar.f(lVar, gVar);
        w4.p D22 = lVar.D2();
        w4.p pVar3 = w4.p.END_OBJECT;
        if (D22 != pVar3) {
            gVar.X0(jVar, pVar3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", d10, lVar.Z0());
        }
        if (fVar.S0(h.FAIL_ON_TRAILING_TOKENS)) {
            K(lVar, gVar, jVar);
        }
        return f10;
    }

    public u J0(d0 d0Var) {
        this.U = this.U.g1(d0Var);
        return this;
    }

    public m J1(URL url) throws IOException {
        r(b4.a.P, url);
        return G(this.O.r(url));
    }

    public u J2(t... tVarArr) {
        for (t H2 : tVarArr) {
            H2(H2);
        }
        return this;
    }

    public w J3(com.fasterxml.jackson.databind.ser.l lVar) {
        return C(n1().c1(lVar));
    }

    public final void K(l lVar, g gVar, j jVar) throws IOException {
        w4.p D2 = lVar.D2();
        if (D2 != null) {
            gVar.U0(a6.h.k0(jVar), lVar, D2);
        }
    }

    public u K0(d0 d0Var, d0... d0VarArr) {
        this.U = this.U.h1(d0Var, d0VarArr);
        return this;
    }

    public m K1(byte[] bArr) throws IOException {
        r(t7.t.f13205o, bArr);
        return G(this.O.s(bArr));
    }

    public void K2(Collection<Class<?>> collection) {
        r1().h(collection);
    }

    public w K3(d0 d0Var) {
        return C(n1().R0(d0Var));
    }

    public void L(w4.d dVar) {
        if (dVar != null && !this.O.e(dVar)) {
            throw new IllegalArgumentException("Cannot use FormatSchema of type " + dVar.getClass().getName() + " for format " + this.O.x());
        }
    }

    public u L0(q... qVarArr) {
        this.X = (f) this.X.a0(qVarArr);
        this.U = (c0) this.U.a0(qVarArr);
        return this;
    }

    public m L1(byte[] bArr, int i10, int i11) throws IOException {
        r(t7.t.f13205o, bArr);
        return G(this.O.t(bArr, i10, i11));
    }

    public void L2(Class<?>... clsArr) {
        r1().i(clsArr);
    }

    public w L3(d0 d0Var, d0... d0VarArr) {
        return C(n1().S0(d0Var, d0VarArr));
    }

    public final void M(i iVar, Object obj, c0 c0Var) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            I(c0Var).Y0(iVar, obj);
            if (c0Var.P0(d0.FLUSH_AFTER_WRITE_VALUE)) {
                iVar.flush();
            }
            closeable.close();
        } catch (Exception e10) {
            a6.h.j((i) null, closeable, e10);
        }
    }

    public u M0(i.b... bVarArr) {
        for (i.b q02 : bVarArr) {
            this.O.q0(q02);
        }
        return this;
    }

    public <T> T M1(DataInput dataInput, j jVar) throws IOException {
        r("src", dataInput);
        return F(this.O.m(dataInput), jVar);
    }

    public void M2(u5.c... cVarArr) {
        r1().j(cVarArr);
    }

    public w M3(DateFormat dateFormat) {
        return C(n1().j0(dateFormat));
    }

    public void N(j jVar, s5.g gVar) throws l {
        if (jVar != null) {
            I(n1()).Q0(jVar, gVar);
            return;
        }
        throw new IllegalArgumentException("type must be provided");
    }

    public u N0(l.a... aVarArr) {
        for (l.a r02 : aVarArr) {
            this.O.r0(r02);
        }
        return this;
    }

    public <T> T N1(DataInput dataInput, Class<T> cls) throws IOException {
        r("src", dataInput);
        return F(this.O.m(dataInput), this.P.Y(cls));
    }

    public w N3(k5.e eVar) {
        return C(n1().m0(eVar));
    }

    public void O(Class<?> cls, s5.g gVar) throws l {
        N(this.P.Y(cls), gVar);
    }

    @Deprecated
    public u O0() {
        return a3((u5.h<?>) null);
    }

    public <T> T O1(File file, g5.b<T> bVar) throws IOException, w4.k, l {
        r("src", file);
        return F(this.O.n(file), this.P.X(bVar));
    }

    public u O2(b bVar) {
        this.U = (c0) this.U.g0(bVar);
        this.X = (f) this.X.g0(bVar);
        return this;
    }

    public w O3(w4.a aVar) {
        return C((c0) n1().r0(aVar));
    }

    public u P(u5.d dVar) {
        return Q(dVar, e.OBJECT_AND_NON_CONCRETE);
    }

    public u P0(h hVar) {
        this.X = this.X.W0(hVar);
        return this;
    }

    public <T> T P1(File file, j jVar) throws IOException, w4.k, l {
        r("src", file);
        return F(this.O.n(file), jVar);
    }

    public u P2(b bVar, b bVar2) {
        this.U = (c0) this.U.g0(bVar);
        this.X = (f) this.X.g0(bVar2);
        return this;
    }

    public w P3(w4.d dVar) {
        L(dVar);
        return E(n1(), dVar);
    }

    public u Q(u5.d dVar, e eVar) {
        return R(dVar, eVar, f0.a.WRAPPER_ARRAY);
    }

    public u Q0(h hVar, h... hVarArr) {
        this.X = this.X.X0(hVar, hVarArr);
        return this;
    }

    public <T> T Q1(File file, Class<T> cls) throws IOException, w4.k, l {
        r("src", file);
        return F(this.O.n(file), this.P.Y(cls));
    }

    public u Q2(w4.a aVar) {
        this.U = (c0) this.U.r0(aVar);
        this.X = (f) this.X.r0(aVar);
        return this;
    }

    public w Q3(w4.t tVar) {
        if (tVar == null) {
            tVar = w.V;
        }
        return D(n1(), (j) null, tVar);
    }

    public u R(u5.d dVar, e eVar, f0.a aVar) {
        if (aVar != f0.a.EXTERNAL_PROPERTY) {
            return a3(v(eVar, dVar).e(f0.b.CLASS, (u5.g) null).f(aVar));
        }
        throw new IllegalArgumentException("Cannot use includeAs of " + aVar);
    }

    public u R0(d0 d0Var) {
        this.U = this.U.R0(d0Var);
        return this;
    }

    public <T> T R1(InputStream inputStream, g5.b<T> bVar) throws IOException, w4.k, l {
        r("src", inputStream);
        return F(this.O.o(inputStream), this.P.X(bVar));
    }

    public u R2(f fVar) {
        r("config", fVar);
        this.X = fVar;
        return this;
    }

    public w R3(g5.b<?> bVar) {
        return D(n1(), bVar == null ? null : this.P.X(bVar), (w4.t) null);
    }

    public u S(u5.d dVar, e eVar, String str) {
        return a3(v(eVar, k1()).e(f0.b.CLASS, (u5.g) null).f(f0.a.PROPERTY).b(str));
    }

    public u S0(d0 d0Var, d0... d0VarArr) {
        this.U = this.U.S0(d0Var, d0VarArr);
        return this;
    }

    public <T> T S1(InputStream inputStream, j jVar) throws IOException, w4.k, l {
        r("src", inputStream);
        return F(this.O.o(inputStream), jVar);
    }

    public u S2(c0 c0Var) {
        r("config", c0Var);
        this.U = c0Var;
        return this;
    }

    public w S3(j jVar) {
        return D(n1(), jVar, (w4.t) null);
    }

    public u T(l5.n nVar) {
        this.X = this.X.f1(nVar);
        return this;
    }

    public u T0(q... qVarArr) {
        this.X = (f) this.X.Z(qVarArr);
        this.U = (c0) this.U.Z(qVarArr);
        return this;
    }

    public <T> T T1(InputStream inputStream, Class<T> cls) throws IOException, w4.k, l {
        r("src", inputStream);
        return F(this.O.o(inputStream), this.P.Y(cls));
    }

    public u T2(DateFormat dateFormat) {
        this.X = (f) this.X.j0(dateFormat);
        this.U = this.U.j0(dateFormat);
        return this;
    }

    public w T3(Class<?> cls) {
        return D(n1(), cls == null ? null : this.P.Y(cls), (w4.t) null);
    }

    public u U(Class<?> cls, Class<?> cls2) {
        this.T.c(cls, cls2);
        return this;
    }

    public u U0(i.b... bVarArr) {
        for (i.b t02 : bVarArr) {
            this.O.t0(t02);
        }
        return this;
    }

    public <T> T U1(Reader reader, g5.b<T> bVar) throws IOException, w4.k, l {
        r("src", reader);
        return F(this.O.p(reader), this.P.X(bVar));
    }

    public u U2(Boolean bool) {
        this.S.l(bool);
        return this;
    }

    public w U3() {
        c0 n12 = n1();
        return D(n12, (j) null, n12.I0());
    }

    @Deprecated
    public final void V(Class<?> cls, Class<?> cls2) {
        U(cls, cls2);
    }

    public u V0(l.a... aVarArr) {
        for (l.a u02 : aVarArr) {
            this.O.u0(u02);
        }
        return this;
    }

    public <T> T V1(Reader reader, j jVar) throws IOException, w4.k, l {
        r("src", reader);
        return F(this.O.p(reader), jVar);
    }

    public u V2(Boolean bool) {
        this.S.m(bool);
        return this;
    }

    @Deprecated
    public w V3(g5.b<?> bVar) {
        return D(n1(), bVar == null ? null : this.P.X(bVar), (w4.t) null);
    }

    public boolean W(j jVar) {
        return n0((l) null, g1()).s0(jVar, (AtomicReference<Throwable>) null);
    }

    @Deprecated
    public u W0() {
        return P(k1());
    }

    public <T> T W1(Reader reader, Class<T> cls) throws IOException, w4.k, l {
        r("src", reader);
        return F(this.O.p(reader), this.P.Y(cls));
    }

    public u W2(w4.t tVar) {
        this.U = this.U.Y0(tVar);
        return this;
    }

    @Deprecated
    public w W3(j jVar) {
        return D(n1(), jVar, (w4.t) null);
    }

    public boolean X(j jVar, AtomicReference<Throwable> atomicReference) {
        return n0((l) null, g1()).s0(jVar, atomicReference);
    }

    @Deprecated
    public u X0(e eVar) {
        return Y0(eVar, f0.a.WRAPPER_ARRAY);
    }

    public <T> T X1(String str, g5.b<T> bVar) throws w4.n, l {
        r(t7.t.f13205o, str);
        return Y1(str, this.P.X(bVar));
    }

    public u X2(u.a aVar) {
        this.S.k(u.b.b(aVar, aVar));
        return this;
    }

    @Deprecated
    public w X3(Class<?> cls) {
        return D(n1(), cls == null ? null : this.P.Y(cls), (w4.t) null);
    }

    public boolean Y(Class<?> cls) {
        return I(n1()).W0(cls, (AtomicReference<Throwable>) null);
    }

    @Deprecated
    public u Y0(e eVar, f0.a aVar) {
        return R(k1(), eVar, aVar);
    }

    public <T> T Y1(String str, j jVar) throws w4.n, l {
        r(t7.t.f13205o, str);
        try {
            return F(this.O.q(str), jVar);
        } catch (w4.n e10) {
            throw e10;
        } catch (IOException e11) {
            throw l.p(e11);
        }
    }

    public u Y2(u.b bVar) {
        this.S.k(bVar);
        return this;
    }

    public w Y3(Class<?> cls) {
        return C(n1().A0(cls));
    }

    public boolean Z(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        return I(n1()).W0(cls, atomicReference);
    }

    @Deprecated
    public u Z0(e eVar, String str) {
        return S(k1(), eVar, str);
    }

    public <T> T Z1(String str, Class<T> cls) throws w4.n, l {
        r(t7.t.f13205o, str);
        return Y1(str, this.P.Y(cls));
    }

    public u Z2(c0.a aVar) {
        this.S.n(aVar);
        return this;
    }

    public u a0() {
        this.X = this.X.g1();
        return this;
    }

    public u a1() {
        return I2(c1());
    }

    public <T> T a2(URL url, g5.b<T> bVar) throws IOException, w4.k, l {
        r("src", url);
        return F(this.O.r(url), this.P.X(bVar));
    }

    public u a3(u5.h<?> hVar) {
        this.X = (f) this.X.q0(hVar);
        this.U = (c0) this.U.q0(hVar);
        return this;
    }

    public k5.k b0(Class<?> cls) {
        return this.S.d(cls);
    }

    public Class<?> b1(Class<?> cls) {
        return this.T.b(cls);
    }

    public <T> T b2(URL url, j jVar) throws IOException, w4.k, l {
        r("src", url);
        return F(this.O.r(url), jVar);
    }

    public u b3(h.b bVar) {
        this.S.o(f0.b.v(bVar));
        return this;
    }

    public u c0(h hVar, boolean z10) {
        this.X = z10 ? this.X.W0(hVar) : this.X.j1(hVar);
        return this;
    }

    public <T> T c2(URL url, Class<T> cls) throws IOException, w4.k, l {
        r("src", url);
        return F(this.O.r(url), this.P.Y(cls));
    }

    public u c3(com.fasterxml.jackson.databind.ser.l lVar) {
        this.U = this.U.c1(lVar);
        return this;
    }

    public u d0(q qVar, boolean z10) {
        j jVar;
        j jVar2;
        c0 c0Var = this.U;
        q[] qVarArr = new q[1];
        if (z10) {
            qVarArr[0] = qVar;
            jVar = c0Var.Z(qVarArr);
        } else {
            qVarArr[0] = qVar;
            jVar = c0Var.a0(qVarArr);
        }
        this.U = (c0) jVar;
        if (z10) {
            jVar2 = this.X.Z(qVar);
        } else {
            jVar2 = this.X.a0(qVar);
        }
        this.X = (f) jVar2;
        return this;
    }

    public <T> T d2(l lVar, j jVar) throws IOException, w4.k, l {
        r("p", lVar);
        return H(g1(), lVar, jVar);
    }

    @Deprecated
    public void d3(com.fasterxml.jackson.databind.ser.l lVar) {
        this.U = this.U.c1(lVar);
    }

    public <T extends a0> T e(l lVar) throws IOException, w4.n {
        r("p", lVar);
        f g12 = g1();
        if (lVar.Z0() == null && lVar.D2() == null) {
            return null;
        }
        T t10 = (m) H(g12, lVar, h0(m.class));
        return t10 == null ? j1().b() : t10;
    }

    public u e0(d0 d0Var, boolean z10) {
        this.U = z10 ? this.U.R0(d0Var) : this.U.g1(d0Var);
        return this;
    }

    @Deprecated
    public t5.a e1(Class<?> cls) throws l {
        return I(n1()).V0(cls);
    }

    public <T> T e2(byte[] bArr, int i10, int i11, g5.b<T> bVar) throws IOException, w4.k, l {
        r("src", bArr);
        return F(this.O.t(bArr, i10, i11), this.P.X(bVar));
    }

    public Object e3(k5.g gVar) {
        this.X = (f) this.X.n0(gVar);
        this.U = (c0) this.U.n0(gVar);
        return this;
    }

    public l f(a0 a0Var) {
        r("n", a0Var);
        return new y((m) a0Var, this);
    }

    public u f0(i.b bVar, boolean z10) {
        this.O.c0(bVar, z10);
        return this;
    }

    public DateFormat f1() {
        return this.U.r();
    }

    public <T> T f2(byte[] bArr, int i10, int i11, j jVar) throws IOException, w4.k, l {
        r("src", bArr);
        return F(this.O.t(bArr, i10, i11), jVar);
    }

    public u f3(i iVar) {
        this.Q = iVar;
        return this;
    }

    public void g(i iVar, a0 a0Var) throws IOException, w4.n {
        r("g", iVar);
        c0 n12 = n1();
        I(n12).Y0(iVar, a0Var);
        if (n12.P0(d0.FLUSH_AFTER_WRITE_VALUE)) {
            iVar.flush();
        }
    }

    public u g0(l.a aVar, boolean z10) {
        this.O.d0(aVar, z10);
        return this;
    }

    public f g1() {
        return this.X;
    }

    public <T> T g2(byte[] bArr, int i10, int i11, Class<T> cls) throws IOException, w4.k, l {
        r("src", bArr);
        return F(this.O.t(bArr, i10, i11), this.P.Y(cls));
    }

    public u g3(Locale locale) {
        this.X = (f) this.X.k0(locale);
        this.U = (c0) this.U.k0(locale);
        return this;
    }

    public f h() {
        return this.O;
    }

    public j h0(Type type) {
        r(zb.t.f25097a, type);
        return this.P.Y(type);
    }

    public g h1() {
        return this.Y;
    }

    public <T> T h2(byte[] bArr, g5.b<T> bVar) throws IOException, w4.k, l {
        r("src", bArr);
        return F(this.O.s(bArr), this.P.X(bVar));
    }

    @Deprecated
    public void h3(Map<Class<?>, Class<?>> map) {
        j3(map);
    }

    @Deprecated
    public f i() {
        return h();
    }

    public <T> T i0(Object obj, g5.b<T> bVar) throws IllegalArgumentException {
        return w(obj, this.P.X(bVar));
    }

    public i i1() {
        return this.Q;
    }

    public <T> T i2(byte[] bArr, j jVar) throws IOException, w4.k, l {
        r("src", bArr);
        return F(this.O.s(bArr), jVar);
    }

    public u i3(t.a aVar) {
        q5.c0 h10 = this.T.h(aVar);
        if (h10 != this.T) {
            this.T = h10;
            this.X = new f(this.X, h10);
            this.U = new c0(this.U, h10);
        }
        return this;
    }

    public final <T> T j(l lVar, g5.a aVar) throws IOException, w4.k, l {
        r("p", lVar);
        return H(g1(), lVar, (j) aVar);
    }

    public <T> T j0(Object obj, j jVar) throws IllegalArgumentException {
        return w(obj, jVar);
    }

    public com.fasterxml.jackson.databind.node.m j1() {
        return this.X.K0();
    }

    public <T> T j2(byte[] bArr, Class<T> cls) throws IOException, w4.k, l {
        r("src", bArr);
        return F(this.O.s(bArr), this.P.Y(cls));
    }

    public u j3(Map<Class<?>, Class<?>> map) {
        this.T.g(map);
        return this;
    }

    public <T> T k(l lVar, g5.b<T> bVar) throws IOException, w4.k, l {
        r("p", lVar);
        return H(g1(), lVar, this.P.X(bVar));
    }

    public <T> T k0(Object obj, Class<T> cls) throws IllegalArgumentException {
        return w(obj, this.P.Y(cls));
    }

    public u5.d k1() {
        return this.X.I0().i();
    }

    /* renamed from: k2 */
    public <T> r<T> m(l lVar, g5.a aVar) throws IOException, w4.n {
        return m2(lVar, (j) aVar);
    }

    public u k3(com.fasterxml.jackson.databind.node.m mVar) {
        this.X = this.X.V0(mVar);
        return this;
    }

    public <T> T l(l lVar, Class<T> cls) throws IOException, w4.k, l {
        r("p", lVar);
        return H(g1(), lVar, this.P.Y(cls));
    }

    public u l0() {
        s(u.class);
        return new u(this);
    }

    public z l1() {
        return this.U.J();
    }

    /* renamed from: l2 */
    public <T> r<T> n(l lVar, g5.b<T> bVar) throws IOException, w4.n {
        return m2(lVar, this.P.X(bVar));
    }

    public u l3(u5.d dVar) {
        this.X = this.X.b0(this.X.I0().q(dVar));
        return this;
    }

    /* renamed from: m0 */
    public com.fasterxml.jackson.databind.node.a a() {
        return this.X.K0().z();
    }

    public Set<Object> m1() {
        Set<Object> set = this.Z;
        return set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
    }

    public <T> r<T> m2(l lVar, j jVar) throws IOException, w4.n {
        r("p", lVar);
        m n02 = n0(lVar, g1());
        return new r(jVar, lVar, n02, x(n02, jVar), false, (Object) null);
    }

    @Deprecated
    public u m3(u.b bVar) {
        return Y2(bVar);
    }

    public m n0(l lVar, f fVar) {
        return this.Y.m1(fVar, lVar, this.Q);
    }

    public c0 n1() {
        return this.U;
    }

    /* renamed from: n2 */
    public <T> r<T> o(l lVar, Class<T> cls) throws IOException, w4.n {
        return m2(lVar, this.P.Y(cls));
    }

    public u n3(z zVar) {
        this.U = (c0) this.U.i0(zVar);
        this.X = (f) this.X.i0(zVar);
        return this;
    }

    public i o0(DataOutput dataOutput) throws IOException {
        r("out", dataOutput);
        return this.O.f(dataOutput);
    }

    public r o1() {
        return this.W;
    }

    public v o2() {
        return A(g1()).n1(this.Q);
    }

    public u o3(u.a aVar) {
        m3(u.b.b(aVar, aVar));
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        r0 = ((com.fasterxml.jackson.databind.node.v) r4).u1();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T p(w4.a0 r4, java.lang.Class<T> r5) throws w4.n {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Class<w4.a0> r1 = w4.a0.class
            boolean r1 = r1.isAssignableFrom(r5)     // Catch:{ n -> 0x004c, IOException -> 0x0041 }
            if (r1 == 0) goto L_0x0017
            java.lang.Class r1 = r4.getClass()     // Catch:{ n -> 0x004c, IOException -> 0x0041 }
            boolean r1 = r5.isAssignableFrom(r1)     // Catch:{ n -> 0x004c, IOException -> 0x0041 }
            if (r1 == 0) goto L_0x0017
            return r4
        L_0x0017:
            w4.p r1 = r4.w()     // Catch:{ n -> 0x004c, IOException -> 0x0041 }
            w4.p r2 = w4.p.VALUE_NULL     // Catch:{ n -> 0x004c, IOException -> 0x0041 }
            if (r1 != r2) goto L_0x0020
            return r0
        L_0x0020:
            w4.p r0 = w4.p.VALUE_EMBEDDED_OBJECT     // Catch:{ n -> 0x004c, IOException -> 0x0041 }
            if (r1 != r0) goto L_0x0038
            boolean r0 = r4 instanceof com.fasterxml.jackson.databind.node.v     // Catch:{ n -> 0x004c, IOException -> 0x0041 }
            if (r0 == 0) goto L_0x0038
            r0 = r4
            com.fasterxml.jackson.databind.node.v r0 = (com.fasterxml.jackson.databind.node.v) r0     // Catch:{ n -> 0x004c, IOException -> 0x0041 }
            java.lang.Object r0 = r0.u1()     // Catch:{ n -> 0x004c, IOException -> 0x0041 }
            if (r0 == 0) goto L_0x0037
            boolean r1 = r5.isInstance(r0)     // Catch:{ n -> 0x004c, IOException -> 0x0041 }
            if (r1 == 0) goto L_0x0038
        L_0x0037:
            return r0
        L_0x0038:
            w4.l r4 = r3.f(r4)     // Catch:{ n -> 0x004c, IOException -> 0x0041 }
            java.lang.Object r4 = r3.l(r4, r5)     // Catch:{ n -> 0x004c, IOException -> 0x0041 }
            return r4
        L_0x0041:
            r4 = move-exception
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r4.getMessage()
            r5.<init>(r0, r4)
            throw r5
        L_0x004c:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.u.p(w4.a0, java.lang.Class):java.lang.Object");
    }

    public i p0(File file, w4.e eVar) throws IOException {
        r("outputFile", file);
        return this.O.h(file, eVar);
    }

    public e0 p1() {
        return this.V;
    }

    public v p2(com.fasterxml.jackson.databind.node.m mVar) {
        return A(g1()).j1(mVar);
    }

    public u p3(r rVar) {
        this.W = rVar;
        return this;
    }

    public void q(i iVar, Object obj) throws IOException, w4.h, l {
        r("g", iVar);
        c0 n12 = n1();
        if (n12.P0(d0.INDENT_OUTPUT) && iVar.X0() == null) {
            iVar.N1(n12.H0());
        }
        if (!n12.P0(d0.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            I(n12).Y0(iVar, obj);
            if (n12.P0(d0.FLUSH_AFTER_WRITE_VALUE)) {
                iVar.flush();
                return;
            }
            return;
        }
        M(iVar, obj, n12);
    }

    public i q0(OutputStream outputStream) throws IOException {
        r("out", outputStream);
        return this.O.j(outputStream, w4.e.UTF8);
    }

    public e0 q1() {
        return I(this.U);
    }

    @Deprecated
    public v q2(g5.b<?> bVar) {
        return B(g1(), this.P.X(bVar), (Object) null, (w4.d) null, this.Q);
    }

    public u q3(k kVar) {
        this.V = kVar;
        return this;
    }

    public final void r(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", new Object[]{str}));
        }
    }

    public i r0(OutputStream outputStream, w4.e eVar) throws IOException {
        r("out", outputStream);
        return this.O.j(outputStream, eVar);
    }

    public u5.e r1() {
        return this.R;
    }

    public v r2(h hVar) {
        return A(g1().W0(hVar));
    }

    public u r3(u5.e eVar) {
        this.R = eVar;
        this.X = this.X.p0(eVar);
        this.U = this.U.p0(eVar);
        return this;
    }

    public void s(Class<?> cls) {
        if (getClass() != cls) {
            throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
        }
    }

    public i s0(Writer writer) throws IOException {
        r("w", writer);
        return this.O.k(writer);
    }

    public n s1() {
        return this.P;
    }

    public v s2(h hVar, h... hVarArr) {
        return A(g1().X0(hVar, hVarArr));
    }

    public u s3(TimeZone timeZone) {
        this.X = (f) this.X.l0(timeZone);
        this.U = (c0) this.U.l0(timeZone);
        return this;
    }

    public final void t(i iVar, Object obj, c0 c0Var) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            I(c0Var).Y0(iVar, obj);
            try {
                closeable.close();
                iVar.close();
            } catch (Exception e10) {
                e = e10;
                closeable = null;
                a6.h.j(iVar, closeable, e);
            }
        } catch (Exception e11) {
            e = e11;
            a6.h.j(iVar, closeable, e);
        }
    }

    public l t0() throws IOException {
        return this.O.l();
    }

    public q5.f0<?> t1() {
        return this.U.E();
    }

    public v t2(i iVar) {
        return B(g1(), (j) null, (Object) null, (w4.d) null, iVar);
    }

    public u t3(n nVar) {
        this.P = nVar;
        this.X = (f) this.X.s0(nVar);
        this.U = (c0) this.U.s0(nVar);
        return this;
    }

    public final void u(i iVar, Object obj) throws IOException {
        c0 n12 = n1();
        n12.N0(iVar);
        if (!n12.P0(d0.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                I(n12).Y0(iVar, obj);
                iVar.close();
            } catch (Exception e10) {
                a6.h.k(iVar, e10);
            }
        } else {
            t(iVar, obj, n12);
        }
    }

    /* renamed from: u0 */
    public com.fasterxml.jackson.databind.node.u b() {
        return this.X.K0().A();
    }

    public boolean u1(h hVar) {
        return this.X.S0(hVar);
    }

    @Deprecated
    public v u2(j jVar) {
        return B(g1(), jVar, (Object) null, (w4.d) null, this.Q);
    }

    public u u3(q5.f0<?> f0Var) {
        this.S.o(f0Var);
        return this;
    }

    public u5.h<?> v(e eVar, u5.d dVar) {
        return d.x(eVar, dVar);
    }

    public l v0(DataInput dataInput) throws IOException {
        r(t7.t.f13205o, dataInput);
        return this.O.m(dataInput);
    }

    public boolean v1(q qVar) {
        return this.U.T(qVar);
    }

    @Deprecated
    public v v2(Class<?> cls) {
        return B(g1(), this.P.Y(cls), (Object) null, (w4.d) null, this.Q);
    }

    public u v3(p0 p0Var, h.c cVar) {
        this.S.o(this.S.j().m(p0Var, cVar));
        return this;
    }

    public b0 version() {
        return k5.l.O;
    }

    public Object w(Object obj, j jVar) throws IllegalArgumentException {
        Object obj2;
        a6.b0 b0Var = new a6.b0((s) this, false);
        if (u1(h.USE_BIG_DECIMAL_FOR_FLOATS)) {
            b0Var = b0Var.z3(true);
        }
        try {
            I(n1().g1(d0.WRAP_ROOT_VALUE)).Y0(b0Var, obj);
            l t32 = b0Var.t3();
            f g12 = g1();
            w4.p z10 = z(t32, jVar);
            if (z10 == w4.p.VALUE_NULL) {
                m n02 = n0(t32, g12);
                obj2 = x(n02, jVar).d(n02);
            } else {
                if (z10 != w4.p.END_ARRAY) {
                    if (z10 != w4.p.END_OBJECT) {
                        m n03 = n0(t32, g12);
                        obj2 = x(n03, jVar).f(t32, n03);
                    }
                }
                obj2 = null;
            }
            t32.close();
            return obj2;
        } catch (IOException e10) {
            throw new IllegalArgumentException(e10.getMessage(), e10);
        }
    }

    public l w0(File file) throws IOException {
        r("src", file);
        return this.O.n(file);
    }

    public boolean w1(d0 d0Var) {
        return this.U.P0(d0Var);
    }

    public v w2(k5.e eVar) {
        return A(g1().m0(eVar));
    }

    @Deprecated
    public void w3(q5.f0<?> f0Var) {
        u3(f0Var);
    }

    public k<Object> x(g gVar, j jVar) throws l {
        k<Object> kVar = this.f9120a0.get(jVar);
        if (kVar != null) {
            return kVar;
        }
        k<Object> Q2 = gVar.Q(jVar);
        if (Q2 == null) {
            return (k) gVar.z(jVar, "Cannot find a deserializer for type " + jVar);
        }
        this.f9120a0.put(jVar, Q2);
        return Q2;
    }

    public l x0(InputStream inputStream) throws IOException {
        r("in", inputStream);
        return this.O.o(inputStream);
    }

    public boolean x1(f.a aVar) {
        return this.O.C0(aVar);
    }

    public v x2(w4.a aVar) {
        return A((f) g1().r0(aVar));
    }

    public f x3() {
        return this.O;
    }

    @Deprecated
    public w4.p y(l lVar) throws IOException {
        return z(lVar, (j) null);
    }

    public l y0(Reader reader) throws IOException {
        r(zb.r.f25096b, reader);
        return this.O.p(reader);
    }

    public boolean y1(i.b bVar) {
        return this.U.Q0(bVar, this.O);
    }

    public v y2(w4.d dVar) {
        L(dVar);
        return B(g1(), (j) null, (Object) null, dVar, this.Q);
    }

    public <T> T y3(T t10, Object obj) throws l {
        if (t10 == null || obj == null) {
            return t10;
        }
        a6.b0 b0Var = new a6.b0((s) this, false);
        if (u1(h.USE_BIG_DECIMAL_FOR_FLOATS)) {
            b0Var = b0Var.z3(true);
        }
        try {
            I(n1().g1(d0.WRAP_ROOT_VALUE)).Y0(b0Var, obj);
            l t32 = b0Var.t3();
            T T0 = F2(t10).T0(t32);
            t32.close();
            return T0;
        } catch (IOException e10) {
            if (e10 instanceof l) {
                throw ((l) e10);
            }
            throw l.p(e10);
        }
    }

    public w4.p z(l lVar, j jVar) throws IOException {
        this.X.O0(lVar);
        w4.p Z0 = lVar.Z0();
        if (Z0 != null || (Z0 = lVar.D2()) != null) {
            return Z0;
        }
        throw o5.f.z(lVar, jVar, "No content to map due to end-of-input");
    }

    public l z0(String str) throws IOException {
        r(t7.t.f13205o, str);
        return this.O.q(str);
    }

    public boolean z1(l.a aVar) {
        return this.X.T0(aVar, this.O);
    }

    public v z2(g5.b<?> bVar) {
        return B(g1(), this.P.X(bVar), (Object) null, (w4.d) null, this.Q);
    }

    public <T extends m> T z3(Object obj) throws IllegalArgumentException {
        if (obj == null) {
            return j1().b();
        }
        a6.b0 b0Var = new a6.b0((s) this, false);
        if (u1(h.USE_BIG_DECIMAL_FOR_FLOATS)) {
            b0Var = b0Var.z3(true);
        }
        try {
            q(b0Var, obj);
            l t32 = b0Var.t3();
            T t10 = (m) e(t32);
            t32.close();
            return t10;
        } catch (IOException e10) {
            throw new IllegalArgumentException(e10.getMessage(), e10);
        }
    }
}

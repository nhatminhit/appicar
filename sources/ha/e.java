package ha;

import ja.m;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import ka.g;
import ka.h;
import ka.i;
import ka.j;
import ka.k;
import ka.n;
import y3.q;

public final class e {
    public static final boolean A = true;
    public static final boolean B = false;
    public static final boolean C = false;
    public static final boolean D = false;
    public static final oa.a<?> E = oa.a.b(Object.class);
    public static final String F = ")]}'\n";

    /* renamed from: x  reason: collision with root package name */
    public static final boolean f19463x = false;

    /* renamed from: y  reason: collision with root package name */
    public static final boolean f19464y = false;

    /* renamed from: z  reason: collision with root package name */
    public static final boolean f19465z = false;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal<Map<oa.a<?>, f<?>>> f19466a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<oa.a<?>, y<?>> f19467b;

    /* renamed from: c  reason: collision with root package name */
    public final ja.c f19468c;

    /* renamed from: d  reason: collision with root package name */
    public final ka.e f19469d;

    /* renamed from: e  reason: collision with root package name */
    public final List<z> f19470e;

    /* renamed from: f  reason: collision with root package name */
    public final ja.d f19471f;

    /* renamed from: g  reason: collision with root package name */
    public final d f19472g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Type, g<?>> f19473h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f19474i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f19475j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f19476k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f19477l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f19478m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f19479n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f19480o;

    /* renamed from: p  reason: collision with root package name */
    public final String f19481p;

    /* renamed from: q  reason: collision with root package name */
    public final int f19482q;

    /* renamed from: r  reason: collision with root package name */
    public final int f19483r;

    /* renamed from: s  reason: collision with root package name */
    public final v f19484s;

    /* renamed from: t  reason: collision with root package name */
    public final List<z> f19485t;

    /* renamed from: u  reason: collision with root package name */
    public final List<z> f19486u;

    /* renamed from: v  reason: collision with root package name */
    public final x f19487v;

    /* renamed from: w  reason: collision with root package name */
    public final x f19488w;

    public class a extends y<Number> {
        public a() {
        }

        /* renamed from: j */
        public Double e(pa.a aVar) throws IOException {
            if (aVar.z0() != pa.c.NULL) {
                return Double.valueOf(aVar.N());
            }
            aVar.c0();
            return null;
        }

        /* renamed from: k */
        public void i(pa.d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.N();
                return;
            }
            e.d(number.doubleValue());
            dVar.X0(number);
        }
    }

    public class b extends y<Number> {
        public b() {
        }

        /* renamed from: j */
        public Float e(pa.a aVar) throws IOException {
            if (aVar.z0() != pa.c.NULL) {
                return Float.valueOf((float) aVar.N());
            }
            aVar.c0();
            return null;
        }

        /* renamed from: k */
        public void i(pa.d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.N();
                return;
            }
            e.d((double) number.floatValue());
            dVar.X0(number);
        }
    }

    public class c extends y<Number> {
        /* renamed from: j */
        public Number e(pa.a aVar) throws IOException {
            if (aVar.z0() != pa.c.NULL) {
                return Long.valueOf(aVar.Q());
            }
            aVar.c0();
            return null;
        }

        /* renamed from: k */
        public void i(pa.d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.N();
            } else {
                dVar.Z0(number.toString());
            }
        }
    }

    public class d extends y<AtomicLong> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y f19491a;

        public d(y yVar) {
            this.f19491a = yVar;
        }

        /* renamed from: j */
        public AtomicLong e(pa.a aVar) throws IOException {
            return new AtomicLong(((Number) this.f19491a.e(aVar)).longValue());
        }

        /* renamed from: k */
        public void i(pa.d dVar, AtomicLong atomicLong) throws IOException {
            this.f19491a.i(dVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: ha.e$e  reason: collision with other inner class name */
    public class C0319e extends y<AtomicLongArray> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y f19492a;

        public C0319e(y yVar) {
            this.f19492a = yVar;
        }

        /* renamed from: j */
        public AtomicLongArray e(pa.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.c();
            while (aVar.o()) {
                arrayList.add(Long.valueOf(((Number) this.f19492a.e(aVar)).longValue()));
            }
            aVar.k();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: k */
        public void i(pa.d dVar, AtomicLongArray atomicLongArray) throws IOException {
            dVar.g();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f19492a.i(dVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            dVar.k();
        }
    }

    public static class f<T> extends y<T> {

        /* renamed from: a  reason: collision with root package name */
        public y<T> f19493a;

        public T e(pa.a aVar) throws IOException {
            y<T> yVar = this.f19493a;
            if (yVar != null) {
                return yVar.e(aVar);
            }
            throw new IllegalStateException();
        }

        public void i(pa.d dVar, T t10) throws IOException {
            y<T> yVar = this.f19493a;
            if (yVar != null) {
                yVar.i(dVar, t10);
                return;
            }
            throw new IllegalStateException();
        }

        public void j(y<T> yVar) {
            if (this.f19493a == null) {
                this.f19493a = yVar;
                return;
            }
            throw new AssertionError();
        }
    }

    public e() {
        this(ja.d.V, c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, v.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), w.DOUBLE, w.LAZILY_PARSED_NUMBER);
    }

    public e(ja.d dVar, d dVar2, Map<Type, g<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, v vVar, String str, int i10, int i11, List<z> list, List<z> list2, List<z> list3, x xVar, x xVar2) {
        boolean z17 = z11;
        boolean z18 = z16;
        this.f19466a = new ThreadLocal<>();
        this.f19467b = new ConcurrentHashMap();
        this.f19471f = dVar;
        this.f19472g = dVar2;
        this.f19473h = map;
        ja.c cVar = new ja.c(map);
        this.f19468c = cVar;
        this.f19474i = z10;
        this.f19475j = z17;
        this.f19476k = z12;
        this.f19477l = z13;
        this.f19478m = z14;
        this.f19479n = z15;
        this.f19480o = z18;
        this.f19484s = vVar;
        this.f19481p = str;
        this.f19482q = i10;
        this.f19483r = i11;
        this.f19485t = list;
        this.f19486u = list2;
        this.f19487v = xVar;
        this.f19488w = xVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(n.V);
        arrayList.add(j.j(xVar));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(n.B);
        arrayList.add(n.f20065m);
        arrayList.add(n.f20059g);
        arrayList.add(n.f20061i);
        arrayList.add(n.f20063k);
        y<Number> t10 = t(vVar);
        arrayList.add(n.b(Long.TYPE, Long.class, t10));
        arrayList.add(n.b(Double.TYPE, Double.class, e(z18)));
        arrayList.add(n.b(Float.TYPE, Float.class, h(z18)));
        arrayList.add(i.j(xVar2));
        arrayList.add(n.f20067o);
        arrayList.add(n.f20069q);
        arrayList.add(n.a(AtomicLong.class, b(t10)));
        arrayList.add(n.a(AtomicLongArray.class, c(t10)));
        arrayList.add(n.f20071s);
        arrayList.add(n.f20076x);
        arrayList.add(n.D);
        arrayList.add(n.F);
        arrayList.add(n.a(BigDecimal.class, n.f20078z));
        arrayList.add(n.a(BigInteger.class, n.A));
        arrayList.add(n.H);
        arrayList.add(n.J);
        arrayList.add(n.N);
        arrayList.add(n.P);
        arrayList.add(n.T);
        arrayList.add(n.L);
        arrayList.add(n.f20056d);
        arrayList.add(ka.c.f20008b);
        arrayList.add(n.R);
        if (na.d.f21182a) {
            arrayList.add(na.d.f21186e);
            arrayList.add(na.d.f21185d);
            arrayList.add(na.d.f21187f);
        }
        arrayList.add(ka.a.f20003c);
        arrayList.add(n.f20054b);
        arrayList.add(new ka.b(cVar));
        arrayList.add(new h(cVar, z17));
        ka.e eVar = new ka.e(cVar);
        this.f19469d = eVar;
        arrayList.add(eVar);
        arrayList.add(n.W);
        arrayList.add(new k(cVar, dVar2, dVar, eVar));
        this.f19470e = Collections.unmodifiableList(arrayList);
    }

    public static void a(Object obj, pa.a aVar) {
        if (obj != null) {
            try {
                if (aVar.z0() != pa.c.END_DOCUMENT) {
                    throw new l("JSON document was not fully consumed.");
                }
            } catch (pa.e e10) {
                throw new u((Throwable) e10);
            } catch (IOException e11) {
                throw new l((Throwable) e11);
            }
        }
    }

    public static y<AtomicLong> b(y<Number> yVar) {
        return new d(yVar).d();
    }

    public static y<AtomicLongArray> c(y<Number> yVar) {
        return new C0319e(yVar).d();
    }

    public static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static y<Number> t(v vVar) {
        return vVar == v.DEFAULT ? n.f20072t : new c();
    }

    public String A(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        E(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void B(k kVar, Appendable appendable) throws l {
        try {
            C(kVar, w(ja.n.c(appendable)));
        } catch (IOException e10) {
            throw new l((Throwable) e10);
        }
    }

    public void C(k kVar, pa.d dVar) throws l {
        boolean q10 = dVar.q();
        dVar.k0(true);
        boolean o10 = dVar.o();
        dVar.c0(this.f19477l);
        boolean m10 = dVar.m();
        dVar.m0(this.f19474i);
        try {
            ja.n.b(kVar, dVar);
            dVar.k0(q10);
            dVar.c0(o10);
            dVar.m0(m10);
        } catch (IOException e10) {
            throw new l((Throwable) e10);
        } catch (AssertionError e11) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e11.getMessage());
            assertionError.initCause(e11);
            throw assertionError;
        } catch (Throwable th2) {
            dVar.k0(q10);
            dVar.c0(o10);
            dVar.m0(m10);
            throw th2;
        }
    }

    public void D(Object obj, Appendable appendable) throws l {
        if (obj != null) {
            E(obj, obj.getClass(), appendable);
        } else {
            B(m.O, appendable);
        }
    }

    public void E(Object obj, Type type, Appendable appendable) throws l {
        try {
            F(obj, type, w(ja.n.c(appendable)));
        } catch (IOException e10) {
            throw new l((Throwable) e10);
        }
    }

    public void F(Object obj, Type type, pa.d dVar) throws l {
        y<?> q10 = q(oa.a.c(type));
        boolean q11 = dVar.q();
        dVar.k0(true);
        boolean o10 = dVar.o();
        dVar.c0(this.f19477l);
        boolean m10 = dVar.m();
        dVar.m0(this.f19474i);
        try {
            q10.i(dVar, obj);
            dVar.k0(q11);
            dVar.c0(o10);
            dVar.m0(m10);
        } catch (IOException e10) {
            throw new l((Throwable) e10);
        } catch (AssertionError e11) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e11.getMessage());
            assertionError.initCause(e11);
            throw assertionError;
        } catch (Throwable th2) {
            dVar.k0(q11);
            dVar.c0(o10);
            dVar.m0(m10);
            throw th2;
        }
    }

    public k G(Object obj) {
        return obj == null ? m.O : H(obj, obj.getClass());
    }

    public k H(Object obj, Type type) {
        g gVar = new g();
        F(obj, type, gVar);
        return gVar.h1();
    }

    public final y<Number> e(boolean z10) {
        return z10 ? n.f20074v : new a();
    }

    @Deprecated
    public ja.d f() {
        return this.f19471f;
    }

    public d g() {
        return this.f19472g;
    }

    public final y<Number> h(boolean z10) {
        return z10 ? n.f20073u : new b();
    }

    public <T> T i(k kVar, Class<T> cls) throws u {
        return m.d(cls).cast(j(kVar, cls));
    }

    public <T> T j(k kVar, Type type) throws u {
        if (kVar == null) {
            return null;
        }
        return o(new ka.f(kVar), type);
    }

    public <T> T k(Reader reader, Class<T> cls) throws u, l {
        pa.a v10 = v(reader);
        T o10 = o(v10, cls);
        a(o10, v10);
        return m.d(cls).cast(o10);
    }

    public <T> T l(Reader reader, Type type) throws l, u {
        pa.a v10 = v(reader);
        T o10 = o(v10, type);
        a(o10, v10);
        return o10;
    }

    public <T> T m(String str, Class<T> cls) throws u {
        return m.d(cls).cast(n(str, cls));
    }

    public <T> T n(String str, Type type) throws u {
        if (str == null) {
            return null;
        }
        return l(new StringReader(str), type);
    }

    public <T> T o(pa.a aVar, Type type) throws l, u {
        boolean q10 = aVar.q();
        aVar.Z0(true);
        try {
            aVar.z0();
            T e10 = q(oa.a.c(type)).e(aVar);
            aVar.Z0(q10);
            return e10;
        } catch (EOFException e11) {
            if (1 != 0) {
                aVar.Z0(q10);
                return null;
            }
            throw new u((Throwable) e11);
        } catch (IllegalStateException e12) {
            throw new u((Throwable) e12);
        } catch (IOException e13) {
            throw new u((Throwable) e13);
        } catch (AssertionError e14) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e14.getMessage());
            assertionError.initCause(e14);
            throw assertionError;
        } catch (Throwable th2) {
            aVar.Z0(q10);
            throw th2;
        }
    }

    public <T> y<T> p(Class<T> cls) {
        return q(oa.a.b(cls));
    }

    public <T> y<T> q(oa.a<T> aVar) {
        y<T> yVar = this.f19467b.get(aVar == null ? E : aVar);
        if (yVar != null) {
            return yVar;
        }
        Map map = this.f19466a.get();
        boolean z10 = false;
        if (map == null) {
            map = new HashMap();
            this.f19466a.set(map);
            z10 = true;
        }
        f fVar = (f) map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f fVar2 = new f();
            map.put(aVar, fVar2);
            for (z a10 : this.f19470e) {
                y<T> a11 = a10.a(this, aVar);
                if (a11 != null) {
                    fVar2.j(a11);
                    this.f19467b.put(aVar, a11);
                    return a11;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z10) {
                this.f19466a.remove();
            }
        }
    }

    public <T> y<T> r(z zVar, oa.a<T> aVar) {
        if (!this.f19470e.contains(zVar)) {
            zVar = this.f19469d;
        }
        boolean z10 = false;
        for (z next : this.f19470e) {
            if (z10) {
                y<T> a10 = next.a(this, aVar);
                if (a10 != null) {
                    return a10;
                }
            } else if (next == zVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public boolean s() {
        return this.f19477l;
    }

    public String toString() {
        return "{serializeNulls:" + this.f19474i + ",factories:" + this.f19470e + ",instanceCreators:" + this.f19468c + p7.a.f11639j;
    }

    public f u() {
        return new f(this);
    }

    public pa.a v(Reader reader) {
        pa.a aVar = new pa.a(reader);
        aVar.Z0(this.f19479n);
        return aVar;
    }

    public pa.d w(Writer writer) throws IOException {
        if (this.f19476k) {
            writer.write(F);
        }
        pa.d dVar = new pa.d(writer);
        if (this.f19478m) {
            dVar.e0(q.a.R);
        }
        dVar.m0(this.f19474i);
        return dVar;
    }

    public boolean x() {
        return this.f19474i;
    }

    public String y(k kVar) {
        StringWriter stringWriter = new StringWriter();
        B(kVar, stringWriter);
        return stringWriter.toString();
    }

    public String z(Object obj) {
        return obj == null ? y(m.O) : A(obj, obj.getClass());
    }
}

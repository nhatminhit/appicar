package z5;

import a6.h;
import a6.q;
import g5.b;
import i5.j;
import i5.m;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

public class n implements Serializable {
    public static final long S = 1;
    public static final j[] T = new j[0];
    public static final n U = new n();
    public static final m V = m.h();
    public static final Class<?> W;
    public static final Class<?> X;
    public static final Class<?> Y;
    public static final Class<?> Z;

    /* renamed from: a0  reason: collision with root package name */
    public static final Class<?> f15887a0;

    /* renamed from: b0  reason: collision with root package name */
    public static final Class<?> f15888b0;

    /* renamed from: c0  reason: collision with root package name */
    public static final Class<?> f15889c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final Class<?> f15890d0;

    /* renamed from: e0  reason: collision with root package name */
    public static final Class<?> f15891e0;

    /* renamed from: f0  reason: collision with root package name */
    public static final k f15892f0;

    /* renamed from: g0  reason: collision with root package name */
    public static final k f15893g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final k f15894h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final k f15895i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final k f15896j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final k f15897k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final k f15898l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final k f15899m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final k f15900n0;
    public final q<Object, j> O;
    public final o[] P;
    public final p Q;
    public final ClassLoader R;

    static {
        Class<String> cls = String.class;
        W = cls;
        Class<Object> cls2 = Object.class;
        X = cls2;
        Class<Comparable> cls3 = Comparable.class;
        Y = cls3;
        Class<Class> cls4 = Class.class;
        Z = cls4;
        Class<Enum> cls5 = Enum.class;
        f15887a0 = cls5;
        Class<m> cls6 = m.class;
        f15888b0 = cls6;
        Class<?> cls7 = Boolean.TYPE;
        f15889c0 = cls7;
        Class<?> cls8 = Integer.TYPE;
        f15890d0 = cls8;
        Class<?> cls9 = Long.TYPE;
        f15891e0 = cls9;
        f15892f0 = new k(cls7);
        f15893g0 = new k(cls8);
        f15894h0 = new k(cls9);
        f15895i0 = new k((Class<?>) cls);
        f15896j0 = new k((Class<?>) cls2);
        f15897k0 = new k((Class<?>) cls3);
        f15898l0 = new k((Class<?>) cls5);
        f15899m0 = new k((Class<?>) cls4);
        f15900n0 = new k((Class<?>) cls6);
    }

    public n() {
        this((q<Object, j>) null);
    }

    public n(q<Object, j> qVar) {
        this.O = qVar == null ? new q<>(16, 200) : qVar;
        this.Q = new p(this);
        this.P = null;
        this.R = null;
    }

    public n(q<Object, j> qVar, p pVar, o[] oVarArr, ClassLoader classLoader) {
        this.O = qVar == null ? new q<>(16, 200) : qVar;
        this.Q = pVar.f(this);
        this.P = oVarArr;
        this.R = classLoader;
    }

    public static n c0() {
        return U;
    }

    public static Class<?> j0(Type type) {
        return type instanceof Class ? (Class) type : c0().Y(type).g();
    }

    public static j l0() {
        return c0().t();
    }

    public d A(Class<?> cls, j jVar) {
        j h10 = h((c) null, cls, m.f(cls, jVar));
        return h10 instanceof d ? (d) h10 : d.p0(h10, jVar);
    }

    public d B(Class<?> cls, Class<?> cls2) {
        return A(cls, h((c) null, cls2, V));
    }

    public e C(Class<? extends Collection> cls, j jVar) {
        m f10 = m.f(cls, jVar);
        e eVar = (e) h((c) null, cls, f10);
        if (f10.n() && jVar != null) {
            j G = eVar.C(Collection.class).d();
            if (!G.equals(jVar)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", new Object[]{h.e0(cls), jVar, G}));
            }
        }
        return eVar;
    }

    public e D(Class<? extends Collection> cls, Class<?> cls2) {
        return C(cls, h((c) null, cls2, V));
    }

    public j E(String str) throws IllegalArgumentException {
        return this.Q.c(str);
    }

    public j F(j jVar, Class<?> cls) {
        Class<?> g10 = jVar.g();
        if (g10 == cls) {
            return jVar;
        }
        j C = jVar.C(cls);
        if (C != null) {
            return C;
        }
        if (!cls.isAssignableFrom(g10)) {
            throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", new Object[]{cls.getName(), jVar}));
        }
        throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", new Object[]{cls.getName(), jVar}));
    }

    public f G(Class<?> cls, j jVar, j jVar2) {
        j h10 = h((c) null, cls, m.g(cls, new j[]{jVar, jVar2}));
        return h10 instanceof f ? (f) h10 : f.o0(h10, jVar, jVar2);
    }

    public f H(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        m mVar = V;
        return G(cls, h((c) null, cls2, mVar), h((c) null, cls3, mVar));
    }

    public g I(Class<? extends Map> cls, j jVar, j jVar2) {
        m g10 = m.g(cls, new j[]{jVar, jVar2});
        g gVar = (g) h((c) null, cls, g10);
        if (g10.n()) {
            j C = gVar.C(Map.class);
            j O2 = C.e();
            if (O2.equals(jVar)) {
                j G = C.d();
                if (!G.equals(jVar2)) {
                    throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", new Object[]{h.e0(cls), jVar2, G}));
                }
            } else {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", new Object[]{h.e0(cls), jVar, O2}));
            }
        }
        return gVar;
    }

    public g J(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        j jVar;
        j jVar2;
        if (cls == Properties.class) {
            jVar2 = f15895i0;
            jVar = jVar2;
        } else {
            m mVar = V;
            jVar2 = h((c) null, cls2, mVar);
            jVar = h((c) null, cls3, mVar);
        }
        return I(cls, jVar2, jVar);
    }

    public j K(Class<?> cls, j... jVarArr) {
        return h((c) null, cls, m.e(cls, jVarArr));
    }

    public j L(Class<?> cls, Class<?>... clsArr) {
        int length = clsArr.length;
        j[] jVarArr = new j[length];
        for (int i10 = 0; i10 < length; i10++) {
            jVarArr[i10] = h((c) null, clsArr[i10], V);
        }
        return K(cls, jVarArr);
    }

    @Deprecated
    public j M(Class<?> cls, Class<?> cls2, j... jVarArr) {
        return K(cls, jVarArr);
    }

    @Deprecated
    public j N(Class<?> cls, Class<?> cls2, Class<?>... clsArr) {
        return L(cls, clsArr);
    }

    public d O(Class<?> cls) {
        return A(cls, l0());
    }

    public e P(Class<? extends Collection> cls) {
        return C(cls, l0());
    }

    public f Q(Class<?> cls) {
        return G(cls, l0(), l0());
    }

    public g R(Class<? extends Map> cls) {
        return I(cls, l0(), l0());
    }

    public j S(Class<?> cls, j jVar) {
        return i.u0(cls, (m) null, (j) null, (j[]) null, jVar);
    }

    @Deprecated
    public j T(Class<?> cls, Class<?> cls2, j[] jVarArr) {
        return U(cls, jVarArr);
    }

    public j U(Class<?> cls, j[] jVarArr) {
        return h((c) null, cls, m.e(cls, jVarArr));
    }

    public j V(j jVar, Class<?> cls) throws IllegalArgumentException {
        return W(jVar, cls, false);
    }

    public j W(j jVar, Class<?> cls, boolean z10) throws IllegalArgumentException {
        int length;
        m a10;
        Class<?> g10 = jVar.g();
        if (g10 == cls) {
            return jVar;
        }
        if (g10 != Object.class) {
            if (g10.isAssignableFrom(cls)) {
                if (jVar.o()) {
                    if (jVar.t()) {
                        if (cls == HashMap.class || cls == LinkedHashMap.class || cls == EnumMap.class || cls == TreeMap.class) {
                            a10 = m.c(cls, jVar.e(), jVar.d());
                            return h((c) null, cls, a10).f0(jVar);
                        }
                    } else if (jVar.m()) {
                        if (cls == ArrayList.class || cls == LinkedList.class || cls == HashSet.class || cls == TreeSet.class) {
                            a10 = m.b(cls, jVar.d());
                            return h((c) null, cls, a10).f0(jVar);
                        } else if (g10 == EnumSet.class) {
                            return jVar;
                        }
                    }
                }
                if (!jVar.F().n() && (length = cls.getTypeParameters().length) != 0) {
                    a10 = a(jVar, length, cls, z10);
                    return h((c) null, cls, a10).f0(jVar);
                }
            } else {
                throw new IllegalArgumentException(String.format("Class %s not subtype of %s", new Object[]{h.e0(cls), h.N(jVar)}));
            }
        }
        a10 = V;
        return h((c) null, cls, a10).f0(jVar);
    }

    public j X(b<?> bVar) {
        return f((c) null, bVar.b(), V);
    }

    public j Y(Type type) {
        return f((c) null, type, V);
    }

    @Deprecated
    public j Z(Type type, j jVar) {
        m mVar;
        if (jVar == null) {
            mVar = V;
        } else {
            m F = jVar.F();
            if (type.getClass() != Class.class) {
                m mVar2 = F;
                j jVar2 = jVar;
                mVar = mVar2;
                while (mVar.n() && (jVar2 = jVar2.Q()) != null) {
                    mVar = jVar2.F();
                }
            } else {
                mVar = F;
            }
        }
        return f((c) null, type, mVar);
    }

    public final m a(j jVar, int i10, Class<?> cls, boolean z10) {
        h[] hVarArr = new h[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            hVarArr[i11] = new h(i11);
        }
        j C = h((c) null, cls, m.e(cls, hVarArr)).C(jVar.g());
        if (C != null) {
            String s10 = s(jVar, C);
            if (s10 == null || z10) {
                j[] jVarArr = new j[i10];
                for (int i12 = 0; i12 < i10; i12++) {
                    j n02 = hVarArr[i12].n0();
                    if (n02 == null) {
                        n02 = l0();
                    }
                    jVarArr[i12] = n02;
                }
                return m.e(cls, jVarArr);
            }
            throw new IllegalArgumentException("Failed to specialize base type " + jVar.x() + " as " + cls.getName() + ", problem: " + s10);
        }
        throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", new Object[]{jVar.g().getName(), cls.getName()}));
    }

    @Deprecated
    public j a0(Type type, Class<?> cls) {
        return Z(type, cls == null ? null : Y(cls));
    }

    public final j b(Class<?> cls, m mVar, j jVar, j[] jVarArr) {
        j jVar2;
        List<j> l10 = mVar.l();
        if (l10.isEmpty()) {
            jVar2 = t();
        } else if (l10.size() == 1) {
            jVar2 = l10.get(0);
        } else {
            throw new IllegalArgumentException("Strange Collection type " + cls.getName() + ": cannot determine type parameters");
        }
        return e.w0(cls, mVar, jVar, jVarArr, jVar2);
    }

    public j b0(Type type, m mVar) {
        return f((c) null, type, mVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = e(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.j c(java.lang.Class<?> r2, z5.m r3, i5.j r4, i5.j[] r5) {
        /*
            r1 = this;
            boolean r0 = r3.n()
            if (r0 == 0) goto L_0x000d
            i5.j r0 = r1.e(r2)
            if (r0 == 0) goto L_0x000d
            return r0
        L_0x000d:
            i5.j r2 = r1.o(r2, r3, r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.n.c(java.lang.Class, z5.m, i5.j, i5.j[]):i5.j");
    }

    public Class<?> d(String str) {
        if ("int".equals(str)) {
            return Integer.TYPE;
        }
        if ("long".equals(str)) {
            return Long.TYPE;
        }
        if ("float".equals(str)) {
            return Float.TYPE;
        }
        if ("double".equals(str)) {
            return Double.TYPE;
        }
        if ("boolean".equals(str)) {
            return Boolean.TYPE;
        }
        if ("byte".equals(str)) {
            return Byte.TYPE;
        }
        if ("char".equals(str)) {
            return Character.TYPE;
        }
        if ("short".equals(str)) {
            return Short.TYPE;
        }
        if ("void".equals(str)) {
            return Void.TYPE;
        }
        return null;
    }

    public Class<?> d0(String str) throws ClassNotFoundException {
        Class<?> d10;
        if (str.indexOf(46) < 0 && (d10 = d(str)) != null) {
            return d10;
        }
        Throwable th2 = null;
        ClassLoader h02 = h0();
        if (h02 == null) {
            h02 = Thread.currentThread().getContextClassLoader();
        }
        if (h02 != null) {
            try {
                return w(str, true, h02);
            } catch (Exception e10) {
                th2 = h.M(e10);
            }
        }
        try {
            return v(str);
        } catch (Exception e11) {
            if (th2 == null) {
                th2 = h.M(e11);
            }
            h.q0(th2);
            throw new ClassNotFoundException(th2.getMessage(), th2);
        }
    }

    public j e(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == f15889c0) {
                return f15892f0;
            }
            if (cls == f15890d0) {
                return f15893g0;
            }
            if (cls == f15891e0) {
                return f15894h0;
            }
            return null;
        } else if (cls == W) {
            return f15895i0;
        } else {
            if (cls == X) {
                return f15896j0;
            }
            if (cls == f15888b0) {
                return f15900n0;
            }
            return null;
        }
    }

    public j[] e0(j jVar, Class<?> cls) {
        j C = jVar.C(cls);
        return C == null ? T : C.F().q();
    }

    public j f(c cVar, Type type, m mVar) {
        j jVar;
        if (type instanceof Class) {
            jVar = h(cVar, (Class) type, V);
        } else if (type instanceof ParameterizedType) {
            jVar = i(cVar, (ParameterizedType) type, mVar);
        } else if (type instanceof j) {
            return (j) type;
        } else {
            if (type instanceof GenericArrayType) {
                jVar = g(cVar, (GenericArrayType) type, mVar);
            } else if (type instanceof TypeVariable) {
                jVar = j(cVar, (TypeVariable) type, mVar);
            } else if (type instanceof WildcardType) {
                jVar = m(cVar, (WildcardType) type, mVar);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unrecognized Type: ");
                sb2.append(type == null ? "[null]" : type.toString());
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        if (this.P != null) {
            m F = jVar.F();
            if (F == null) {
                F = V;
            }
            o[] oVarArr = this.P;
            int length = oVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                o oVar = oVarArr[i10];
                j a10 = oVar.a(jVar, type, F, this);
                if (a10 != null) {
                    i10++;
                    jVar = a10;
                } else {
                    throw new IllegalStateException(String.format("TypeModifier %s (of type %s) return null for type %s", new Object[]{oVar, oVar.getClass().getName(), jVar}));
                }
            }
        }
        return jVar;
    }

    @Deprecated
    public j[] f0(Class<?> cls, Class<?> cls2) {
        return e0(Y(cls), cls2);
    }

    public j g(c cVar, GenericArrayType genericArrayType, m mVar) {
        return a.n0(f(cVar, genericArrayType.getGenericComponentType(), mVar), mVar);
    }

    @Deprecated
    public j[] g0(Class<?> cls, Class<?> cls2, m mVar) {
        return e0(b0(cls, mVar), cls2);
    }

    public j h(c cVar, Class<?> cls, m mVar) {
        c cVar2;
        j jVar;
        j e10 = e(cls);
        if (e10 != null) {
            return e10;
        }
        Object a10 = (mVar == null || mVar.n()) ? cls : mVar.a(cls);
        j b10 = this.O.b(a10);
        if (b10 != null) {
            return b10;
        }
        if (cVar == null) {
            cVar2 = new c(cls);
        } else {
            c c10 = cVar.c(cls);
            if (c10 != null) {
                j jVar2 = new j(cls, V);
                c10.a(jVar2);
                return jVar2;
            }
            cVar2 = cVar.b(cls);
        }
        if (cls.isArray()) {
            jVar = a.n0(f(cVar2, cls.getComponentType(), mVar), mVar);
        } else {
            j q10 = cls.isInterface() ? null : q(cVar2, cls, mVar);
            j[] r10 = r(cVar2, cls, mVar);
            if (cls == Properties.class) {
                k kVar = f15895i0;
                b10 = g.y0(cls, mVar, q10, r10, kVar, kVar);
            } else if (q10 != null) {
                b10 = q10.a0(cls, mVar, q10, r10);
            }
            jVar = (b10 == null && (b10 = k(cVar2, cls, mVar, q10, r10)) == null && (b10 = l(cVar2, cls, mVar, q10, r10)) == null) ? o(cls, mVar, q10, r10) : b10;
        }
        cVar2.d(jVar);
        if (!jVar.U()) {
            this.O.d(a10, jVar);
        }
        return jVar;
    }

    public ClassLoader h0() {
        return this.R;
    }

    public j i(c cVar, ParameterizedType parameterizedType, m mVar) {
        m mVar2;
        Class<?> cls = (Class) parameterizedType.getRawType();
        if (cls == f15887a0) {
            return f15898l0;
        }
        if (cls == Y) {
            return f15897k0;
        }
        if (cls == Z) {
            return f15899m0;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
        if (length == 0) {
            mVar2 = V;
        } else {
            j[] jVarArr = new j[length];
            for (int i10 = 0; i10 < length; i10++) {
                jVarArr[i10] = f(cVar, actualTypeArguments[i10], mVar);
            }
            mVar2 = m.e(cls, jVarArr);
        }
        return h(cVar, cls, mVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r3.g();
        r1 = r4.g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.j i0(i5.j r3, i5.j r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return r4
        L_0x0003:
            if (r4 != 0) goto L_0x0006
            return r3
        L_0x0006:
            java.lang.Class r0 = r3.g()
            java.lang.Class r1 = r4.g()
            if (r0 != r1) goto L_0x0011
            return r3
        L_0x0011:
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x0018
            return r4
        L_0x0018:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.n.i0(i5.j, i5.j):i5.j");
    }

    public j j(c cVar, TypeVariable<?> typeVariable, m mVar) {
        Type[] bounds;
        String name = typeVariable.getName();
        if (mVar != null) {
            j i10 = mVar.i(name);
            if (i10 != null) {
                return i10;
            }
            if (mVar.m(name)) {
                return f15896j0;
            }
            m r10 = mVar.r(name);
            synchronized (typeVariable) {
                bounds = typeVariable.getBounds();
            }
            return f(cVar, bounds[0], r10);
        }
        throw new IllegalArgumentException("Null `bindings` passed (type variable \"" + name + "\")");
    }

    public j k(c cVar, Class<?> cls, m mVar, j jVar, j[] jVarArr) {
        if (mVar == null) {
            mVar = V;
        }
        if (cls == Map.class) {
            return n(cls, mVar, jVar, jVarArr);
        }
        if (cls == Collection.class) {
            return b(cls, mVar, jVar, jVarArr);
        }
        if (cls == AtomicReference.class) {
            return p(cls, mVar, jVar, jVarArr);
        }
        return null;
    }

    @Deprecated
    public j k0(Class<?> cls) {
        return c(cls, V, (j) null, (j[]) null);
    }

    public j l(c cVar, Class<?> cls, m mVar, j jVar, j[] jVarArr) {
        for (j a02 : jVarArr) {
            j a03 = a02.a0(cls, mVar, jVar, jVarArr);
            if (a03 != null) {
                return a03;
            }
        }
        return null;
    }

    public j m(c cVar, WildcardType wildcardType, m mVar) {
        return f(cVar, wildcardType.getUpperBounds()[0], mVar);
    }

    public n m0(q<Object, j> qVar) {
        return new n(qVar, this.Q, this.P, this.R);
    }

    public final j n(Class<?> cls, m mVar, j jVar, j[] jVarArr) {
        j jVar2;
        j jVar3;
        j t10;
        if (cls == Properties.class) {
            t10 = f15895i0;
        } else {
            List<j> l10 = mVar.l();
            int size = l10.size();
            if (size == 0) {
                t10 = t();
            } else if (size == 2) {
                jVar2 = l10.get(1);
                jVar3 = l10.get(0);
                return g.y0(cls, mVar, jVar, jVarArr, jVar3, jVar2);
            } else {
                throw new IllegalArgumentException("Strange Map type " + cls.getName() + ": cannot determine type parameters");
            }
        }
        jVar3 = t10;
        jVar2 = jVar3;
        return g.y0(cls, mVar, jVar, jVarArr, jVar3, jVar2);
    }

    public n n0(ClassLoader classLoader) {
        return new n(this.O, this.Q, this.P, classLoader);
    }

    public j o(Class<?> cls, m mVar, j jVar, j[] jVarArr) {
        return new k(cls, mVar, jVar, jVarArr);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z5.n o0(z5.o r6) {
        /*
            r5 = this;
            a6.q<java.lang.Object, i5.j> r0 = r5.O
            r1 = 0
            if (r6 != 0) goto L_0x0007
            r0 = r1
            goto L_0x001c
        L_0x0007:
            z5.o[] r2 = r5.P
            if (r2 != 0) goto L_0x0015
            r0 = 1
            z5.o[] r0 = new z5.o[r0]
            r2 = 0
            r0[r2] = r6
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x001c
        L_0x0015:
            java.lang.Object[] r6 = a6.c.j(r2, r6)
            r1 = r6
            z5.o[] r1 = (z5.o[]) r1
        L_0x001c:
            z5.n r6 = new z5.n
            z5.p r2 = r5.Q
            java.lang.ClassLoader r3 = r5.R
            r6.<init>(r0, r2, r1, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.n.o0(z5.o):z5.n");
    }

    public final j p(Class<?> cls, m mVar, j jVar, j[] jVarArr) {
        j jVar2;
        List<j> l10 = mVar.l();
        if (l10.isEmpty()) {
            jVar2 = t();
        } else if (l10.size() == 1) {
            jVar2 = l10.get(0);
        } else {
            throw new IllegalArgumentException("Strange Reference type " + cls.getName() + ": cannot determine type parameters");
        }
        return i.u0(cls, mVar, jVar, jVarArr, jVar2);
    }

    public j q(c cVar, Class<?> cls, m mVar) {
        Type J = h.J(cls);
        if (J == null) {
            return null;
        }
        return f(cVar, J, mVar);
    }

    public j[] r(c cVar, Class<?> cls, m mVar) {
        Type[] I = h.I(cls);
        if (I == null || I.length == 0) {
            return T;
        }
        int length = I.length;
        j[] jVarArr = new j[length];
        for (int i10 = 0; i10 < length; i10++) {
            jVarArr[i10] = f(cVar, I[i10], mVar);
        }
        return jVarArr;
    }

    public final String s(j jVar, j jVar2) throws IllegalArgumentException {
        Class<Object> cls = Object.class;
        List<j> l10 = jVar.F().l();
        List<j> l11 = jVar2.F().l();
        int size = l11.size();
        int size2 = l10.size();
        int i10 = 0;
        while (i10 < size2) {
            j jVar3 = l10.get(i10);
            j l02 = i10 < size ? l11.get(i10) : l0();
            if (u(jVar3, l02) || jVar3.j(cls) || ((i10 == 0 && jVar.t() && l02.j(cls)) || (jVar3.s() && jVar3.Z(l02.g())))) {
                i10++;
            } else {
                return String.format("Type parameter #%d/%d differs; can not specialize %s with %s", new Object[]{Integer.valueOf(i10 + 1), Integer.valueOf(size2), jVar3.x(), l02.x()});
            }
        }
        return null;
    }

    public j t() {
        return f15896j0;
    }

    public final boolean u(j jVar, j jVar2) {
        if (jVar2 instanceof h) {
            ((h) jVar2).o0(jVar);
            return true;
        } else if (jVar.g() != jVar2.g()) {
            return false;
        } else {
            List<j> l10 = jVar.F().l();
            List<j> l11 = jVar2.F().l();
            int size = l10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!u(l10.get(i10), l11.get(i10))) {
                    return false;
                }
            }
            return true;
        }
    }

    public Class<?> v(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    public Class<?> w(String str, boolean z10, ClassLoader classLoader) throws ClassNotFoundException {
        return Class.forName(str, true, classLoader);
    }

    public void x() {
        this.O.a();
    }

    public a y(j jVar) {
        return a.n0(jVar, (m) null);
    }

    public a z(Class<?> cls) {
        return a.n0(f((c) null, cls, (m) null), (m) null);
    }
}

package xe;

import be.a1;
import be.w;
import be.x;
import be.z0;
import fh.g;
import fh.h;
import hf.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lf.c0;
import we.b;
import we.c;
import we.e;
import we.f;
import we.i;
import we.j;
import we.k;
import we.l;
import we.m;
import we.n;
import we.o;
import we.p;
import we.q;
import we.r;
import we.s;
import we.t;
import zd.h1;
import zd.r1;
import zd.u0;
import zd.v;
import zd.y;

public final class u implements d<Object>, t {
    @g
    public static final a P = new a((w) null);
    @g
    public static final Map<Class<? extends v<?>>, Integer> Q;
    @g
    public static final HashMap<String, String> R;
    @g
    public static final HashMap<String, String> S;
    @g
    public static final HashMap<String, String> T;
    @g
    public static final Map<String, String> U;
    @g
    public final Class<?> O;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @h
        public final String a(@g Class<?> cls) {
            String str;
            l0.p(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) u.T.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "kotlin.Array" : str2;
            }
            String str3 = (String) u.T.get(cls.getName());
            return str3 == null ? cls.getCanonicalName() : str3;
        }

        @h
        public final String b(@g Class<?> cls) {
            String str;
            l0.p(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        l0.o(simpleName, "name");
                        String q52 = c0.q5(simpleName, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
                        if (q52 != null) {
                            return q52;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    l0.o(simpleName, "name");
                    if (enclosingConstructor == null) {
                        return c0.p5(simpleName, '$', (String) null, 2, (Object) null);
                    }
                    return c0.q5(simpleName, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) u.U.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                } else {
                    String str3 = (String) u.U.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
            }
            return str2;
        }

        public final boolean c(@h Object obj, @g Class<?> cls) {
            l0.p(cls, "jClass");
            Map y10 = u.Q;
            l0.n(y10, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) y10.get(cls);
            if (num != null) {
                return u1.B(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = ve.a.g(ve.a.i(cls));
            }
            return cls.isInstance(obj);
        }
    }

    static {
        int i10 = 0;
        List L = w.L(we.a.class, l.class, p.class, q.class, r.class, s.class, t.class, we.u.class, we.v.class, we.w.class, b.class, c.class, we.d.class, e.class, f.class, we.g.class, we.h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(x.Y(L, 10));
        for (Object next : L) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            arrayList.add(r1.a((Class) next, Integer.valueOf(i10)));
            i10 = i11;
        }
        Q = a1.D0(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        R = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        S = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        l0.o(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            l0.o(str, "kotlinName");
            sb2.append(c0.t5(str, '.', (String) null, 2, (Object) null));
            sb2.append("CompanionObject");
            String sb3 = sb2.toString();
            u0 a10 = r1.a(sb3, str + ".Companion");
            hashMap3.put(a10.e(), a10.f());
        }
        for (Map.Entry next2 : Q.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        T = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(z0.j(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), c0.t5((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
        U = linkedHashMap;
    }

    public u(@g Class<?> cls) {
        l0.p(cls, "jClass");
        this.O = cls;
    }

    @h1(version = "1.3")
    public static /* synthetic */ void C() {
    }

    @h1(version = "1.1")
    public static /* synthetic */ void D() {
    }

    @h1(version = "1.1")
    public static /* synthetic */ void E() {
    }

    @h1(version = "1.1")
    public static /* synthetic */ void M() {
    }

    @h1(version = "1.1")
    public static /* synthetic */ void O() {
    }

    @h1(version = "1.1")
    public static /* synthetic */ void V() {
    }

    @h1(version = "1.1")
    public static /* synthetic */ void X() {
    }

    @h1(version = "1.1")
    public static /* synthetic */ void Y() {
    }

    @h1(version = "1.4")
    public static /* synthetic */ void b0() {
    }

    @h1(version = "1.1")
    public static /* synthetic */ void d0() {
    }

    @h1(version = "1.1")
    public static /* synthetic */ void e0() {
    }

    @h1(version = "1.1")
    public static /* synthetic */ void g0() {
    }

    @h1(version = "1.5")
    public static /* synthetic */ void h0() {
    }

    public final Void A() {
        throw new ve.q();
    }

    @g
    public List<d<? extends Object>> B() {
        A();
        throw new y();
    }

    public boolean F() {
        A();
        throw new y();
    }

    public boolean G() {
        A();
        throw new y();
    }

    @h
    public String H() {
        return P.b(o());
    }

    @g
    public List<hf.s> J() {
        A();
        throw new y();
    }

    @h
    public Object N() {
        A();
        throw new y();
    }

    public boolean R() {
        A();
        throw new y();
    }

    public boolean S() {
        A();
        throw new y();
    }

    @h1(version = "1.1")
    public boolean Z(@h Object obj) {
        return P.c(obj, o());
    }

    @h
    public hf.w d() {
        A();
        throw new y();
    }

    public boolean equals(@h Object obj) {
        return (obj instanceof u) && l0.g(ve.a.g(this), ve.a.g((d) obj));
    }

    public boolean f() {
        A();
        throw new y();
    }

    @g
    public List<Annotation> getAnnotations() {
        A();
        throw new y();
    }

    @g
    public List<hf.t> getTypeParameters() {
        A();
        throw new y();
    }

    public boolean h() {
        A();
        throw new y();
    }

    public int hashCode() {
        return ve.a.g(this).hashCode();
    }

    public boolean isOpen() {
        A();
        throw new y();
    }

    @g
    public Collection<hf.c<?>> k() {
        A();
        throw new y();
    }

    @h
    public String m() {
        return P.a(o());
    }

    @g
    public Class<?> o() {
        return this.O;
    }

    @g
    public Collection<d<?>> p() {
        A();
        throw new y();
    }

    public boolean q0() {
        A();
        throw new y();
    }

    @g
    public String toString() {
        return o().toString() + l1.f24529b;
    }

    @g
    public Collection<hf.i<Object>> u() {
        A();
        throw new y();
    }

    public boolean w() {
        A();
        throw new y();
    }
}

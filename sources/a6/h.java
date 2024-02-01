package a6;

import i5.g;
import i5.j;
import i5.l;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import og.c0;
import w4.i;
import w4.n;
import x0.e;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f244a = Object.class;

    /* renamed from: b  reason: collision with root package name */
    public static final Annotation[] f245b = new Annotation[0];

    /* renamed from: c  reason: collision with root package name */
    public static final a[] f246c = new a[0];

    /* renamed from: d  reason: collision with root package name */
    public static final Iterator<?> f247d = Collections.emptyIterator();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Constructor<?> f248a;

        /* renamed from: b  reason: collision with root package name */
        public transient Annotation[] f249b;

        /* renamed from: c  reason: collision with root package name */
        public transient Annotation[][] f250c;

        /* renamed from: d  reason: collision with root package name */
        public int f251d = -1;

        public a(Constructor<?> constructor) {
            this.f248a = constructor;
        }

        public Constructor<?> a() {
            return this.f248a;
        }

        public Annotation[] b() {
            Annotation[] annotationArr = this.f249b;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[] declaredAnnotations = this.f248a.getDeclaredAnnotations();
            this.f249b = declaredAnnotations;
            return declaredAnnotations;
        }

        public Class<?> c() {
            return this.f248a.getDeclaringClass();
        }

        public int d() {
            int i10 = this.f251d;
            if (i10 >= 0) {
                return i10;
            }
            int length = this.f248a.getParameterTypes().length;
            this.f251d = length;
            return length;
        }

        public Annotation[][] e() {
            Annotation[][] annotationArr = this.f250c;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[][] parameterAnnotations = this.f248a.getParameterAnnotations();
            this.f250c = parameterAnnotations;
            return parameterAnnotations;
        }
    }

    public static class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f252c = new b();

        /* renamed from: a  reason: collision with root package name */
        public final Field f253a = d(EnumSet.class, "elementType", Class.class);

        /* renamed from: b  reason: collision with root package name */
        public final Field f254b = d(EnumMap.class, "elementType", Class.class);

        public static Field d(Class<?> cls, String str, Class<?> cls2) {
            Field field;
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i10];
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    break;
                }
                i10++;
            }
            if (field == null) {
                for (Field field2 : declaredFields) {
                    if (field2.getType() == cls2) {
                        if (field != null) {
                            return null;
                        }
                        field = field2;
                    }
                }
            }
            if (field != null) {
                try {
                    field.setAccessible(true);
                } catch (Throwable unused) {
                }
            }
            return field;
        }

        public Class<? extends Enum<?>> a(EnumMap<?, ?> enumMap) {
            Field field = this.f254b;
            if (field != null) {
                return (Class) c(enumMap, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumMap (odd JDK platform?)");
        }

        public Class<? extends Enum<?>> b(EnumSet<?> enumSet) {
            Field field = this.f253a;
            if (field != null) {
                return (Class) c(enumSet, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumSet (odd JDK platform?)");
        }

        public final Object c(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e10) {
                throw new IllegalArgumentException(e10);
            }
        }
    }

    @Deprecated
    public static List<Class<?>> A(Class<?> cls, Class<?> cls2, List<Class<?>> list) {
        a(cls, cls2, list, false);
        return list;
    }

    public static String B(Object obj) {
        if (obj == null) {
            return e.f15004b;
        }
        return e0(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static Method[] C(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (ClassNotFoundException e11) {
                    e10.addSuppressed(e11);
                    throw e10;
                }
            } else {
                throw e10;
            }
        }
    }

    public static a[] D(Class<?> cls) {
        if (cls.isInterface() || b0(cls)) {
            return f246c;
        }
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10] = new a(declaredConstructors[i10]);
        }
        return aVarArr;
    }

    @Deprecated
    public static Field[] E(Class<?> cls) {
        return cls.getDeclaredFields();
    }

    @Deprecated
    public static Method[] F(Class<?> cls) {
        return cls.getDeclaredMethods();
    }

    public static Class<?> G(Class<?> cls) {
        if (b0(cls)) {
            return null;
        }
        return cls.getDeclaringClass();
    }

    public static Class<?> H(Class<?> cls) {
        if (b0(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static Type[] I(Class<?> cls) {
        return cls.getGenericInterfaces();
    }

    public static Type J(Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    public static Class<?> K(Class<?> cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (P(cls)) {
                    return null;
                }
                return H(cls);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public static String L(Class<?> cls) {
        Package packageR = cls.getPackage();
        if (packageR == null) {
            return null;
        }
        return packageR.getName();
    }

    public static Throwable M(Throwable th2) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        return th2;
    }

    public static String N(j jVar) {
        if (jVar == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append('`');
        sb2.append(jVar.x());
        sb2.append('`');
        return sb2.toString();
    }

    public static boolean O(Object obj, Class<?> cls) {
        return obj != null && obj.getClass() == cls;
    }

    public static boolean P(Class<?> cls) {
        return !b0(cls) && cls.getEnclosingMethod() != null;
    }

    @Deprecated
    public static boolean Q(Method method) {
        if (Modifier.isStatic(method.getModifiers())) {
            return false;
        }
        Class[] parameterTypes = method.getParameterTypes();
        return (parameterTypes == null || parameterTypes.length == 0) && Void.TYPE != method.getReturnType();
    }

    public static boolean R(Class<?> cls) {
        return cls == Void.class || cls == Void.TYPE || cls == j5.j.class;
    }

    public static boolean S(Class<?> cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    public static boolean T(Class<?> cls) {
        return (cls.getModifiers() & d6.a.f6181d) == 0;
    }

    public static boolean U(Member member) {
        return (member.getModifiers() & d6.a.f6181d) == 0;
    }

    public static boolean V(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    public static boolean W(Class<?> cls) {
        return cls.getName().startsWith("java.");
    }

    public static boolean X(Class<?> cls) {
        return cls.getAnnotation(j5.a.class) != null;
    }

    public static boolean Y(Object obj) {
        return obj == null || X(obj.getClass());
    }

    public static String Z(Class<?> cls, boolean z10) {
        try {
            boolean isStatic = Modifier.isStatic(cls.getModifiers());
            if (!isStatic && P(cls)) {
                return "local/anonymous";
            }
            if (z10 || isStatic || H(cls) == null) {
                return null;
            }
            return "non-static member class";
        } catch (NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public static void a(Class<?> cls, Class<?> cls2, Collection<Class<?>> collection, boolean z10) {
        if (cls != cls2 && cls != null && cls != Object.class) {
            if (z10) {
                if (!collection.contains(cls)) {
                    collection.add(cls);
                } else {
                    return;
                }
            }
            for (Class a10 : c(cls)) {
                a(a10, cls2, collection, true);
            }
            a(cls.getSuperclass(), cls2, collection, true);
        }
    }

    public static boolean a0(Class<?> cls) {
        return !Modifier.isStatic(cls.getModifiers()) && H(cls) != null;
    }

    public static void b(j jVar, Class<?> cls, Collection<j> collection, boolean z10) {
        Class<?> g10;
        if (jVar != null && (g10 = jVar.g()) != cls && g10 != Object.class) {
            if (z10) {
                if (!collection.contains(jVar)) {
                    collection.add(jVar);
                } else {
                    return;
                }
            }
            for (j b10 : jVar.N()) {
                b(b10, cls, collection, true);
            }
            b(jVar.Q(), cls, collection, true);
        }
    }

    public static boolean b0(Class<?> cls) {
        return cls == f244a || cls.isPrimitive();
    }

    public static Class<?>[] c(Class<?> cls) {
        return cls.getInterfaces();
    }

    public static boolean c0(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.");
    }

    public static String d(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('`');
        sb2.append(str);
        sb2.append('`');
        return sb2.toString();
    }

    public static String d0(t tVar) {
        return tVar == null ? "[null]" : d(tVar.getName());
    }

    public static String e(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    public static String e0(Class<?> cls) {
        if (cls == null) {
            return "[null]";
        }
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i10 > 0) {
            StringBuilder sb2 = new StringBuilder(simpleName);
            do {
                sb2.append(c0.f21474n);
                i10--;
            } while (i10 > 0);
            simpleName = sb2.toString();
        }
        return d(simpleName);
    }

    @Deprecated
    public static void f(Member member) {
        g(member, false);
    }

    public static <T> T f0(T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    public static void g(Member member, boolean z10) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        if (!z10) {
            try {
                if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                    return;
                }
            } catch (SecurityException e10) {
                if (!accessibleObject.isAccessible()) {
                    Class<?> declaringClass = member.getDeclaringClass();
                    throw new IllegalArgumentException("Cannot access " + member + " (from class " + declaringClass.getName() + "; failed to set access: " + e10.getMessage());
                }
                return;
            }
        }
        accessibleObject.setAccessible(true);
    }

    public static String g0(String str) {
        return str == null ? "" : str;
    }

    public static String h(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return e0(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static String h0(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static Class<?> i(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    public static Class<?> i0(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static void j(i iVar, Closeable closeable, Exception exc) throws IOException {
        if (iVar != null) {
            iVar.Q(i.b.AUTO_CLOSE_JSON_CONTENT);
            try {
                iVar.close();
            } catch (Exception e10) {
                exc.addSuppressed(e10);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e11) {
                exc.addSuppressed(e11);
            }
        }
        p0(exc);
        q0(exc);
        throw new RuntimeException(exc);
    }

    public static String j0(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        return String.format("\"%s\"", new Object[]{obj});
    }

    public static void k(i iVar, Exception exc) throws IOException {
        iVar.Q(i.b.AUTO_CLOSE_JSON_CONTENT);
        try {
            iVar.close();
        } catch (Exception e10) {
            exc.addSuppressed(e10);
        }
        p0(exc);
        q0(exc);
        throw new RuntimeException(exc);
    }

    public static Class<?> k0(j jVar) {
        if (jVar == null) {
            return null;
        }
        return jVar.g();
    }

    public static <T> T l(Class<T> cls, boolean z10) throws IllegalArgumentException {
        Constructor<T> q10 = q(cls, z10);
        if (q10 != null) {
            try {
                return q10.newInstance(new Object[0]);
            } catch (Exception e10) {
                t0(e10, "Failed to instantiate class " + cls.getName() + ", problem: " + e10.getMessage());
                return null;
            }
        } else {
            throw new IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
        }
    }

    public static void l0(Throwable th2) {
        m0(th2, th2.getMessage());
    }

    public static Object m(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Character.TYPE) {
            return 0;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static void m0(Throwable th2, String str) {
        q0(th2);
        o0(th2);
        throw new IllegalArgumentException(str, th2);
    }

    public static <T> Iterator<T> n() {
        return f247d;
    }

    public static <T> T n0(g gVar, IOException iOException) throws l {
        if (iOException instanceof l) {
            throw ((l) iOException);
        }
        l h10 = l.h(gVar, iOException.getMessage());
        h10.initCause(iOException);
        throw h10;
    }

    public static String o(Throwable th2) {
        return th2 instanceof n ? ((n) th2).d() : th2.getMessage();
    }

    public static Throwable o0(Throwable th2) {
        if (!(th2 instanceof Error)) {
            return th2;
        }
        throw ((Error) th2);
    }

    public static Annotation[] p(Class<?> cls) {
        return b0(cls) ? f245b : cls.getDeclaredAnnotations();
    }

    public static Throwable p0(Throwable th2) throws IOException {
        if (!(th2 instanceof IOException)) {
            return th2;
        }
        throw ((IOException) th2);
    }

    public static <T> Constructor<T> q(Class<T> cls, boolean z10) throws IllegalArgumentException {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z10) {
                g(declaredConstructor, z10);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e10) {
            t0(e10, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e10.getMessage());
            return null;
        }
    }

    public static Throwable q0(Throwable th2) {
        if (!(th2 instanceof RuntimeException)) {
            return th2;
        }
        throw ((RuntimeException) th2);
    }

    public static Class<? extends Enum<?>> r(Class<?> cls) {
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static Throwable r0(Throwable th2) throws IOException {
        return p0(M(th2));
    }

    public static Class<? extends Enum<?>> s(Enum<?> enumR) {
        Class<?> cls = enumR.getClass();
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static void s0(Throwable th2) {
        l0(M(th2));
    }

    public static Class<? extends Enum<?>> t(EnumMap<?, ?> enumMap) {
        return !enumMap.isEmpty() ? s((Enum) enumMap.keySet().iterator().next()) : b.f252c.a(enumMap);
    }

    public static void t0(Throwable th2, String str) {
        m0(M(th2), str);
    }

    public static Class<? extends Enum<?>> u(EnumSet<?> enumSet) {
        return !enumSet.isEmpty() ? s((Enum) enumSet.iterator().next()) : b.f252c.b(enumSet);
    }

    public static void u0(Class<?> cls, Object obj, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", new Object[]{obj.getClass().getName(), cls.getName(), str}));
        }
    }

    public static <T extends Annotation> Enum<?> v(Class<Enum<?>> cls, Class<T> cls2) {
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                String name = field.getName();
                for (Enum<?> enumR : (Enum[]) cls.getEnumConstants()) {
                    if (name.equals(enumR.name())) {
                        return enumR;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static Class<?> v0(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static List<Class<?>> w(Class<?> cls, Class<?> cls2, boolean z10) {
        if (cls == null || cls == cls2 || cls == Object.class) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(8);
        a(cls, cls2, arrayList, z10);
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r4 != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r2 = r2.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r2 == null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r2 != r3) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0.add(r2);
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r2v0, types: [java.lang.Class<?>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.Class<?>> x(java.lang.Class r2, java.lang.Class<?> r3, boolean r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 8
            r0.<init>(r1)
            if (r2 == 0) goto L_0x001b
            if (r2 == r3) goto L_0x001b
            if (r4 == 0) goto L_0x000e
            goto L_0x0017
        L_0x000e:
            java.lang.Class r2 = r2.getSuperclass()
            if (r2 == 0) goto L_0x001b
            if (r2 != r3) goto L_0x0017
            goto L_0x001b
        L_0x0017:
            r0.add(r2)
            goto L_0x000e
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.h.x(java.lang.Class, java.lang.Class, boolean):java.util.List");
    }

    public static List<j> y(j jVar, Class<?> cls, boolean z10) {
        if (jVar == null || jVar.j(cls) || jVar.j(Object.class)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(8);
        b(jVar, cls, arrayList, z10);
        return arrayList;
    }

    @Deprecated
    public static List<Class<?>> z(Class<?> cls, Class<?> cls2) {
        return A(cls, cls2, new ArrayList(8));
    }
}

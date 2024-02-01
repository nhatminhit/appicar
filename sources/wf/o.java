package wf;

import be.b0;
import be.e0;
import be.x;
import fh.g;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Metadata;
import lf.c0;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u0004\u0018\u00010\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\bJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J3\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J.\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0018*\u00020\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u001aH\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0002R\u0014\u0010\"\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010!¨\u0006%"}, d2 = {"Lwf/o;", "", "", "Lwf/d0;", "d", "()Ljava/util/List;", "S", "Ljava/lang/Class;", "service", "Ljava/lang/ClassLoader;", "loader", "e", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "baseClass", "", "serviceClass", "a", "c", "name", "b", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "url", "f", "R", "Ljava/util/jar/JarFile;", "Lkotlin/Function1;", "block", "h", "(Ljava/util/jar/JarFile;Lwe/l;)Ljava/lang/Object;", "Ljava/io/BufferedReader;", "r", "g", "Ljava/lang/String;", "PREFIX", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class o {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final o f24110a = new o();
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final String f24111b = "META-INF/services/";

    public final d0 a(Class<d0> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final <S> S b(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    public final <S> List<S> c(Class<S> cls, ClassLoader classLoader) {
        try {
            return e(cls, classLoader);
        } catch (Throwable unused) {
            return e0.Q5(ServiceLoader.load(cls, classLoader));
        }
    }

    @g
    public final List<d0> d() {
        d0 d0Var;
        Class<d0> cls = d0.class;
        if (!p.a()) {
            return c(cls, cls.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            d0 d0Var2 = null;
            try {
                d0Var = cls.cast(Class.forName("qf.a", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                d0Var = null;
            }
            if (d0Var != null) {
                arrayList.add(d0Var);
            }
            try {
                d0Var2 = cls.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (d0Var2 == null) {
                return arrayList;
            }
            arrayList.add(d0Var2);
            return arrayList;
        } catch (Throwable unused3) {
            return c(cls, cls.getClassLoader());
        }
    }

    @g
    public final <S> List<S> e(@g Class<S> cls, @g ClassLoader classLoader) {
        ArrayList<T> list = Collections.list(classLoader.getResources(f24111b + cls.getName()));
        l0.o(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (T f10 : list) {
            b0.o0(arrayList, f24110a.f(f10));
        }
        Set<String> V5 = e0.V5(arrayList);
        if (!V5.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(x.Y(V5, 10));
            for (String b10 : V5) {
                arrayList2.add(f24110a.b(b10, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        re.c.a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        zd.p.a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0077, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        re.c.a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007b, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> f(java.net.URL r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "jar"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = lf.b0.v2(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L_0x005d
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = lf.c0.q5(r0, r6, r4, r3, r4)
            r1 = 33
            java.lang.String r6 = lf.c0.x5(r6, r1, r4, r3, r4)
            java.lang.String r1 = "!/"
            java.lang.String r0 = lf.c0.q5(r0, r1, r4, r3, r4)
            java.util.jar.JarFile r1 = new java.util.jar.JarFile
            r1.<init>(r6, r2)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0051 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0051 }
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0051 }
            r3.<init>(r0)     // Catch:{ all -> 0x0051 }
            java.io.InputStream r0 = r1.getInputStream(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0051 }
            r6.<init>(r2)     // Catch:{ all -> 0x0051 }
            wf.o r0 = f24110a     // Catch:{ all -> 0x004a }
            java.util.List r0 = r0.g(r6)     // Catch:{ all -> 0x004a }
            re.c.a(r6, r4)     // Catch:{ all -> 0x0051 }
            r1.close()     // Catch:{ all -> 0x0048 }
            return r0
        L_0x0048:
            r6 = move-exception
            throw r6
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r2 = move-exception
            re.c.a(r6, r0)     // Catch:{ all -> 0x0051 }
            throw r2     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0058 }
            throw r0
        L_0x0058:
            r0 = move-exception
            zd.p.a(r6, r0)
            throw r6
        L_0x005d:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = r6.openStream()
            r1.<init>(r6)
            r0.<init>(r1)
            wf.o r6 = f24110a     // Catch:{ all -> 0x0075 }
            java.util.List r6 = r6.g(r0)     // Catch:{ all -> 0x0075 }
            re.c.a(r0, r4)
            return r6
        L_0x0075:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            re.c.a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.o.f(java.net.URL):java.util.List");
    }

    public final List<String> g(BufferedReader bufferedReader) {
        boolean z10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return e0.Q5(linkedHashSet);
            }
            String obj = c0.F5(c0.y5(readLine, "#", (String) null, 2, (Object) null)).toString();
            boolean z11 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= obj.length()) {
                    z10 = true;
                    break;
                }
                char charAt = obj.charAt(i10);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (z10) {
                if (obj.length() > 0) {
                    z11 = true;
                }
                if (z11) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0013, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0014, code lost:
        xe.i0.d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001a, code lost:
        xe.i0.c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x001e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x001f, code lost:
        zd.p.a(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0022, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> R h(java.util.jar.JarFile r3, we.l<? super java.util.jar.JarFile, ? extends R> r4) {
        /*
            r2 = this;
            r0 = 1
            java.lang.Object r4 = r4.A(r3)     // Catch:{ all -> 0x0011 }
            xe.i0.d(r0)
            r3.close()     // Catch:{ all -> 0x000f }
            xe.i0.c(r0)
            return r4
        L_0x000f:
            r3 = move-exception
            throw r3
        L_0x0011:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0013 }
        L_0x0013:
            r1 = move-exception
            xe.i0.d(r0)
            r3.close()     // Catch:{ all -> 0x001e }
            xe.i0.c(r0)
            throw r1
        L_0x001e:
            r3 = move-exception
            zd.p.a(r4, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.o.h(java.util.jar.JarFile, we.l):java.lang.Object");
    }
}

package rh;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import og.c0;
import og.g;
import og.g0;
import og.k0;
import og.m0;
import rh.a;
import rh.c;
import rh.f;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Method, w<?>> f22737a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final g.a f22738b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f22739c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f.a> f22740d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c.a> f22741e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final Executor f22742f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f22743g;

    public class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final r f22744a = r.g();

        /* renamed from: b  reason: collision with root package name */
        public final Object[] f22745b = new Object[0];

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Class f22746c;

        public a(Class cls) {
            this.f22746c = cls;
        }

        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f22745b;
            }
            return this.f22744a.i(method) ? this.f22744a.h(method, this.f22746c, obj, objArr) : v.this.h(method).a(objArr);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final r f22748a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public g.a f22749b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public c0 f22750c;

        /* renamed from: d  reason: collision with root package name */
        public final List<f.a> f22751d;

        /* renamed from: e  reason: collision with root package name */
        public final List<c.a> f22752e;
        @Nullable

        /* renamed from: f  reason: collision with root package name */
        public Executor f22753f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f22754g;

        public b() {
            this(r.g());
        }

        public b(r rVar) {
            this.f22751d = new ArrayList();
            this.f22752e = new ArrayList();
            this.f22748a = rVar;
        }

        public b(v vVar) {
            this.f22751d = new ArrayList();
            this.f22752e = new ArrayList();
            r g10 = r.g();
            this.f22748a = g10;
            this.f22749b = vVar.f22738b;
            this.f22750c = vVar.f22739c;
            int size = vVar.f22740d.size() - g10.e();
            for (int i10 = 1; i10 < size; i10++) {
                this.f22751d.add(vVar.f22740d.get(i10));
            }
            int size2 = vVar.f22741e.size() - this.f22748a.b();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f22752e.add(vVar.f22741e.get(i11));
            }
            this.f22753f = vVar.f22742f;
            this.f22754g = vVar.f22743g;
        }

        public b a(c.a aVar) {
            List<c.a> list = this.f22752e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(f.a aVar) {
            List<f.a> list = this.f22751d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return e(c0.m(str));
        }

        public b d(URL url) {
            Objects.requireNonNull(url, "baseUrl == null");
            return e(c0.m(url.toString()));
        }

        public b e(c0 c0Var) {
            Objects.requireNonNull(c0Var, "baseUrl == null");
            List<String> w10 = c0Var.w();
            if ("".equals(w10.get(w10.size() - 1))) {
                this.f22750c = c0Var;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + c0Var);
        }

        public v f() {
            if (this.f22750c != null) {
                g.a aVar = this.f22749b;
                if (aVar == null) {
                    aVar = new g0();
                }
                g.a aVar2 = aVar;
                Executor executor = this.f22753f;
                if (executor == null) {
                    executor = this.f22748a.c();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f22752e);
                arrayList.addAll(this.f22748a.a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f22751d.size() + 1 + this.f22748a.e());
                arrayList2.add(new a());
                arrayList2.addAll(this.f22751d);
                arrayList2.addAll(this.f22748a.d());
                return new v(aVar2, this.f22750c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f22754g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public List<c.a> g() {
            return this.f22752e;
        }

        public b h(g.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f22749b = aVar;
            return this;
        }

        public b i(Executor executor) {
            Objects.requireNonNull(executor, "executor == null");
            this.f22753f = executor;
            return this;
        }

        public b j(g0 g0Var) {
            Objects.requireNonNull(g0Var, "client == null");
            return h(g0Var);
        }

        public List<f.a> k() {
            return this.f22751d;
        }

        public b l(boolean z10) {
            this.f22754g = z10;
            return this;
        }
    }

    public v(g.a aVar, c0 c0Var, List<f.a> list, List<c.a> list2, @Nullable Executor executor, boolean z10) {
        this.f22738b = aVar;
        this.f22739c = c0Var;
        this.f22740d = list;
        this.f22741e = list2;
        this.f22742f = executor;
        this.f22743g = z10;
    }

    public c0 a() {
        return this.f22739c;
    }

    public c<?, ?> b(Type type, Annotation[] annotationArr) {
        return j((c.a) null, type, annotationArr);
    }

    public List<c.a> c() {
        return this.f22741e;
    }

    public g.a d() {
        return this.f22738b;
    }

    @Nullable
    public Executor e() {
        return this.f22742f;
    }

    public List<f.a> f() {
        return this.f22740d;
    }

    public <T> T g(Class<T> cls) {
        p(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public w<?> h(Method method) {
        w<?> wVar;
        w<?> wVar2 = this.f22737a.get(method);
        if (wVar2 != null) {
            return wVar2;
        }
        synchronized (this.f22737a) {
            wVar = this.f22737a.get(method);
            if (wVar == null) {
                wVar = w.b(this, method);
                this.f22737a.put(method, wVar);
            }
        }
        return wVar;
    }

    public b i() {
        return new b(this);
    }

    public c<?, ?> j(@Nullable c.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f22741e.indexOf(aVar) + 1;
        int size = this.f22741e.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            c<?, ?> a10 = this.f22741e.get(i10).a(type, annotationArr, this);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f22741e.get(i11).getClass().getName());
            }
            sb2.append(10);
        }
        sb2.append("  Tried:");
        int size2 = this.f22741e.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f22741e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, k0> k(@Nullable f.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f22740d.indexOf(aVar) + 1;
        int size = this.f22740d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<?, k0> c10 = this.f22740d.get(i10).c(type, annotationArr, annotationArr2, this);
            if (c10 != null) {
                return c10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f22740d.get(i11).getClass().getName());
            }
            sb2.append(10);
        }
        sb2.append("  Tried:");
        int size2 = this.f22740d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f22740d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<m0, T> l(@Nullable f.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f22740d.indexOf(aVar) + 1;
        int size = this.f22740d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<m0, ?> d10 = this.f22740d.get(i10).d(type, annotationArr, this);
            if (d10 != null) {
                return d10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f22740d.get(i11).getClass().getName());
            }
            sb2.append(10);
        }
        sb2.append("  Tried:");
        int size2 = this.f22740d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f22740d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, k0> m(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return k((f.a) null, type, annotationArr, annotationArr2);
    }

    public <T> f<m0, T> n(Type type, Annotation[] annotationArr) {
        return l((f.a) null, type, annotationArr);
    }

    public <T> f<T, String> o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f22740d.size();
        for (int i10 = 0; i10 < size; i10++) {
            f<?, String> e10 = this.f22740d.get(i10).e(type, annotationArr, this);
            if (e10 != null) {
                return e10;
            }
        }
        return a.d.f22601a;
    }

    public final void p(Class<?> cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                    sb2.append(cls2.getName());
                    if (cls2 != cls) {
                        sb2.append(" which is an interface of ");
                        sb2.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb2.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f22743g) {
                r g10 = r.g();
                for (Method method : cls.getDeclaredMethods()) {
                    if (!g10.i(method) && !Modifier.isStatic(method.getModifiers())) {
                        h(method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }
}

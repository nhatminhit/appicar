package rh;

import hh.c;
import ie.d;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import og.b0;
import og.c0;
import og.e0;
import og.f0;
import og.j0;
import rh.p;
import th.b;
import th.e;
import th.f;
import th.g;
import th.h;
import th.i;
import th.j;
import th.k;
import th.l;
import th.m;
import th.n;
import th.o;
import th.p;
import th.q;
import th.r;
import th.s;
import th.u;
import th.v;
import th.x;
import th.y;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final Method f22697a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f22698b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22699c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final String f22700d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final b0 f22701e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final e0 f22702f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f22703g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f22704h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f22705i;

    /* renamed from: j  reason: collision with root package name */
    public final p<?>[] f22706j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f22707k;

    public static final class a {

        /* renamed from: x  reason: collision with root package name */
        public static final String f22708x = "[a-zA-Z][a-zA-Z0-9_-]*";

        /* renamed from: y  reason: collision with root package name */
        public static final Pattern f22709y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: z  reason: collision with root package name */
        public static final Pattern f22710z = Pattern.compile(f22708x);

        /* renamed from: a  reason: collision with root package name */
        public final v f22711a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f22712b;

        /* renamed from: c  reason: collision with root package name */
        public final Annotation[] f22713c;

        /* renamed from: d  reason: collision with root package name */
        public final Annotation[][] f22714d;

        /* renamed from: e  reason: collision with root package name */
        public final Type[] f22715e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f22716f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f22717g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f22718h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f22719i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f22720j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f22721k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f22722l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f22723m;
        @Nullable

        /* renamed from: n  reason: collision with root package name */
        public String f22724n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f22725o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f22726p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f22727q;
        @Nullable

        /* renamed from: r  reason: collision with root package name */
        public String f22728r;
        @Nullable

        /* renamed from: s  reason: collision with root package name */
        public b0 f22729s;
        @Nullable

        /* renamed from: t  reason: collision with root package name */
        public e0 f22730t;
        @Nullable

        /* renamed from: u  reason: collision with root package name */
        public Set<String> f22731u;
        @Nullable

        /* renamed from: v  reason: collision with root package name */
        public p<?>[] f22732v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f22733w;

        public a(v vVar, Method method) {
            this.f22711a = vVar;
            this.f22712b = method;
            this.f22713c = method.getAnnotations();
            this.f22715e = method.getGenericParameterTypes();
            this.f22714d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public static Set<String> h(String str) {
            Matcher matcher = f22709y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        public t b() {
            for (Annotation e10 : this.f22713c) {
                e(e10);
            }
            if (this.f22724n != null) {
                if (!this.f22725o) {
                    if (this.f22727q) {
                        throw z.m(this.f22712b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f22726p) {
                        throw z.m(this.f22712b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f22714d.length;
                this.f22732v = new p[length];
                int i10 = length - 1;
                int i11 = 0;
                while (true) {
                    boolean z10 = true;
                    if (i11 >= length) {
                        break;
                    }
                    p<?>[] pVarArr = this.f22732v;
                    Type type = this.f22715e[i11];
                    Annotation[] annotationArr = this.f22714d[i11];
                    if (i11 != i10) {
                        z10 = false;
                    }
                    pVarArr[i11] = f(i11, type, annotationArr, z10);
                    i11++;
                }
                if (this.f22728r != null || this.f22723m) {
                    boolean z11 = this.f22726p;
                    if (!z11 && !this.f22727q && !this.f22725o && this.f22718h) {
                        throw z.m(this.f22712b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z11 && !this.f22716f) {
                        throw z.m(this.f22712b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!this.f22727q || this.f22717g) {
                        return new t(this);
                    } else {
                        throw z.m(this.f22712b, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw z.m(this.f22712b, "Missing either @%s URL or @Url parameter.", this.f22724n);
                }
            } else {
                throw z.m(this.f22712b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }

        public final b0 c(String[] strArr) {
            b0.a aVar = new b0.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw z.m(this.f22712b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if (c.f19573f.equalsIgnoreCase(substring)) {
                    try {
                        this.f22730t = e0.c(trim);
                    } catch (IllegalArgumentException e10) {
                        throw z.n(this.f22712b, e10, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.b(substring, trim);
                }
            }
            return aVar.i();
        }

        public final void d(String str, String str2, boolean z10) {
            String str3 = this.f22724n;
            if (str3 == null) {
                this.f22724n = str;
                this.f22725o = z10;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f22709y.matcher(substring).find()) {
                            throw z.m(this.f22712b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f22728r = str2;
                    this.f22731u = h(str2);
                    return;
                }
                return;
            }
            throw z.m(this.f22712b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void e(Annotation annotation) {
            String value;
            String str;
            String value2;
            String str2;
            if (annotation instanceof b) {
                value = ((b) annotation).value();
                str = "DELETE";
            } else if (annotation instanceof f) {
                value = ((f) annotation).value();
                str = "GET";
            } else if (annotation instanceof g) {
                value = ((g) annotation).value();
                str = "HEAD";
            } else {
                if (annotation instanceof n) {
                    value2 = ((n) annotation).value();
                    str2 = "PATCH";
                } else if (annotation instanceof o) {
                    value2 = ((o) annotation).value();
                    str2 = "POST";
                } else if (annotation instanceof p) {
                    value2 = ((p) annotation).value();
                    str2 = "PUT";
                } else if (annotation instanceof m) {
                    value = ((m) annotation).value();
                    str = "OPTIONS";
                } else if (annotation instanceof h) {
                    h hVar = (h) annotation;
                    d(hVar.method(), hVar.path(), hVar.hasBody());
                    return;
                } else if (annotation instanceof k) {
                    String[] value3 = ((k) annotation).value();
                    if (value3.length != 0) {
                        this.f22729s = c(value3);
                        return;
                    }
                    throw z.m(this.f22712b, "@Headers annotation is empty.", new Object[0]);
                } else if (annotation instanceof l) {
                    if (!this.f22726p) {
                        this.f22727q = true;
                        return;
                    }
                    throw z.m(this.f22712b, "Only one encoding annotation is allowed.", new Object[0]);
                } else if (!(annotation instanceof e)) {
                    return;
                } else {
                    if (!this.f22727q) {
                        this.f22726p = true;
                        return;
                    }
                    throw z.m(this.f22712b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                d(str2, value2, true);
                return;
            }
            d(str, value, false);
        }

        @Nullable
        public final p<?> f(int i10, Type type, @Nullable Annotation[] annotationArr, boolean z10) {
            p<?> pVar;
            if (annotationArr != null) {
                pVar = null;
                for (Annotation g10 : annotationArr) {
                    p<?> g11 = g(i10, type, annotationArr, g10);
                    if (g11 != null) {
                        if (pVar == null) {
                            pVar = g11;
                        } else {
                            throw z.o(this.f22712b, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                pVar = null;
            }
            if (pVar != null) {
                return pVar;
            }
            if (z10) {
                try {
                    if (z.h(type) == d.class) {
                        this.f22733w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw z.o(this.f22712b, i10, "No Retrofit annotation found.", new Object[0]);
        }

        @Nullable
        public final p<?> g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            Class<f0.b> cls2 = f0.b.class;
            if (annotation instanceof y) {
                j(i10, type);
                if (this.f22723m) {
                    throw z.o(this.f22712b, i10, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f22719i) {
                    throw z.o(this.f22712b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f22720j) {
                    throw z.o(this.f22712b, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                } else if (this.f22721k) {
                    throw z.o(this.f22712b, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f22722l) {
                    throw z.o(this.f22712b, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f22728r == null) {
                    this.f22723m = true;
                    if (type == c0.class || type == cls || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new p.C0416p(this.f22712b, i10);
                    }
                    throw z.o(this.f22712b, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw z.o(this.f22712b, i10, "@Url cannot be used with @%s URL", this.f22724n);
                }
            } else if (annotation instanceof s) {
                j(i10, type);
                if (this.f22720j) {
                    throw z.o(this.f22712b, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f22721k) {
                    throw z.o(this.f22712b, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f22722l) {
                    throw z.o(this.f22712b, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f22723m) {
                    throw z.o(this.f22712b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f22728r != null) {
                    this.f22719i = true;
                    s sVar = (s) annotation;
                    String value = sVar.value();
                    i(i10, value);
                    return new p.k(this.f22712b, i10, value, this.f22711a.o(type, annotationArr), sVar.encoded());
                } else {
                    throw z.o(this.f22712b, i10, "@Path can only be used with relative url on @%s", this.f22724n);
                }
            } else if (annotation instanceof th.t) {
                j(i10, type);
                th.t tVar = (th.t) annotation;
                String value2 = tVar.value();
                boolean encoded = tVar.encoded();
                Class<?> h10 = z.h(type);
                this.f22720j = true;
                if (Iterable.class.isAssignableFrom(h10)) {
                    if (type instanceof ParameterizedType) {
                        return new p.l(value2, this.f22711a.o(z.g(0, (ParameterizedType) type), annotationArr), encoded).c();
                    }
                    throw z.o(this.f22712b, i10, h10.getSimpleName() + " must include generic type (e.g., " + h10.getSimpleName() + "<String>)", new Object[0]);
                } else if (!h10.isArray()) {
                    return new p.l(value2, this.f22711a.o(type, annotationArr), encoded);
                } else {
                    return new p.l(value2, this.f22711a.o(a(h10.getComponentType()), annotationArr), encoded).b();
                }
            } else if (annotation instanceof v) {
                j(i10, type);
                boolean encoded2 = ((v) annotation).encoded();
                Class<?> h11 = z.h(type);
                this.f22721k = true;
                if (Iterable.class.isAssignableFrom(h11)) {
                    if (type instanceof ParameterizedType) {
                        return new p.n(this.f22711a.o(z.g(0, (ParameterizedType) type), annotationArr), encoded2).c();
                    }
                    throw z.o(this.f22712b, i10, h11.getSimpleName() + " must include generic type (e.g., " + h11.getSimpleName() + "<String>)", new Object[0]);
                } else if (!h11.isArray()) {
                    return new p.n(this.f22711a.o(type, annotationArr), encoded2);
                } else {
                    return new p.n(this.f22711a.o(a(h11.getComponentType()), annotationArr), encoded2).b();
                }
            } else if (annotation instanceof u) {
                j(i10, type);
                Class<?> h12 = z.h(type);
                this.f22722l = true;
                if (Map.class.isAssignableFrom(h12)) {
                    Type i11 = z.i(type, h12, Map.class);
                    if (i11 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) i11;
                        Type g10 = z.g(0, parameterizedType);
                        if (cls == g10) {
                            return new p.m(this.f22712b, i10, this.f22711a.o(z.g(1, parameterizedType), annotationArr), ((u) annotation).encoded());
                        }
                        throw z.o(this.f22712b, i10, "@QueryMap keys must be of type String: " + g10, new Object[0]);
                    }
                    throw z.o(this.f22712b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw z.o(this.f22712b, i10, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof i) {
                j(i10, type);
                String value3 = ((i) annotation).value();
                Class<?> h13 = z.h(type);
                if (Iterable.class.isAssignableFrom(h13)) {
                    if (type instanceof ParameterizedType) {
                        return new p.f(value3, this.f22711a.o(z.g(0, (ParameterizedType) type), annotationArr)).c();
                    }
                    throw z.o(this.f22712b, i10, h13.getSimpleName() + " must include generic type (e.g., " + h13.getSimpleName() + "<String>)", new Object[0]);
                } else if (!h13.isArray()) {
                    return new p.f(value3, this.f22711a.o(type, annotationArr));
                } else {
                    return new p.f(value3, this.f22711a.o(a(h13.getComponentType()), annotationArr)).b();
                }
            } else if (annotation instanceof j) {
                if (type == b0.class) {
                    return new p.h(this.f22712b, i10);
                }
                j(i10, type);
                Class<?> h14 = z.h(type);
                if (Map.class.isAssignableFrom(h14)) {
                    Type i12 = z.i(type, h14, Map.class);
                    if (i12 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) i12;
                        Type g11 = z.g(0, parameterizedType2);
                        if (cls == g11) {
                            return new p.g(this.f22712b, i10, this.f22711a.o(z.g(1, parameterizedType2), annotationArr));
                        }
                        throw z.o(this.f22712b, i10, "@HeaderMap keys must be of type String: " + g11, new Object[0]);
                    }
                    throw z.o(this.f22712b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw z.o(this.f22712b, i10, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof th.c) {
                j(i10, type);
                if (this.f22726p) {
                    th.c cVar = (th.c) annotation;
                    String value4 = cVar.value();
                    boolean encoded3 = cVar.encoded();
                    this.f22716f = true;
                    Class<?> h15 = z.h(type);
                    if (Iterable.class.isAssignableFrom(h15)) {
                        if (type instanceof ParameterizedType) {
                            return new p.d(value4, this.f22711a.o(z.g(0, (ParameterizedType) type), annotationArr), encoded3).c();
                        }
                        throw z.o(this.f22712b, i10, h15.getSimpleName() + " must include generic type (e.g., " + h15.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h15.isArray()) {
                        return new p.d(value4, this.f22711a.o(type, annotationArr), encoded3);
                    } else {
                        return new p.d(value4, this.f22711a.o(a(h15.getComponentType()), annotationArr), encoded3).b();
                    }
                } else {
                    throw z.o(this.f22712b, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof th.d) {
                j(i10, type);
                if (this.f22726p) {
                    Class<?> h16 = z.h(type);
                    if (Map.class.isAssignableFrom(h16)) {
                        Type i13 = z.i(type, h16, Map.class);
                        if (i13 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) i13;
                            Type g12 = z.g(0, parameterizedType3);
                            if (cls == g12) {
                                f o10 = this.f22711a.o(z.g(1, parameterizedType3), annotationArr);
                                this.f22716f = true;
                                return new p.e(this.f22712b, i10, o10, ((th.d) annotation).encoded());
                            }
                            throw z.o(this.f22712b, i10, "@FieldMap keys must be of type String: " + g12, new Object[0]);
                        }
                        throw z.o(this.f22712b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw z.o(this.f22712b, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw z.o(this.f22712b, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof q) {
                j(i10, type);
                if (this.f22727q) {
                    q qVar = (q) annotation;
                    this.f22717g = true;
                    String value5 = qVar.value();
                    Class<?> h17 = z.h(type);
                    if (!value5.isEmpty()) {
                        b0 l10 = b0.l("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                        if (Iterable.class.isAssignableFrom(h17)) {
                            if (type instanceof ParameterizedType) {
                                Type g13 = z.g(0, (ParameterizedType) type);
                                if (!cls2.isAssignableFrom(z.h(g13))) {
                                    return new p.i(this.f22712b, i10, l10, this.f22711a.m(g13, annotationArr, this.f22713c)).c();
                                }
                                throw z.o(this.f22712b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            throw z.o(this.f22712b, i10, h17.getSimpleName() + " must include generic type (e.g., " + h17.getSimpleName() + "<String>)", new Object[0]);
                        } else if (h17.isArray()) {
                            Class<?> a10 = a(h17.getComponentType());
                            if (!cls2.isAssignableFrom(a10)) {
                                return new p.i(this.f22712b, i10, l10, this.f22711a.m(a10, annotationArr, this.f22713c)).b();
                            }
                            throw z.o(this.f22712b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!cls2.isAssignableFrom(h17)) {
                            return new p.i(this.f22712b, i10, l10, this.f22711a.m(type, annotationArr, this.f22713c));
                        } else {
                            throw z.o(this.f22712b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(h17)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw z.o(this.f22712b, i10, h17.getSimpleName() + " must include generic type (e.g., " + h17.getSimpleName() + "<String>)", new Object[0]);
                        } else if (cls2.isAssignableFrom(z.h(z.g(0, (ParameterizedType) type)))) {
                            return p.o.f22674a.c();
                        } else {
                            throw z.o(this.f22712b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (h17.isArray()) {
                        if (cls2.isAssignableFrom(h17.getComponentType())) {
                            return p.o.f22674a.b();
                        }
                        throw z.o(this.f22712b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (cls2.isAssignableFrom(h17)) {
                        return p.o.f22674a;
                    } else {
                        throw z.o(this.f22712b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw z.o(this.f22712b, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof r) {
                j(i10, type);
                if (this.f22727q) {
                    this.f22717g = true;
                    Class<?> h18 = z.h(type);
                    if (Map.class.isAssignableFrom(h18)) {
                        Type i14 = z.i(type, h18, Map.class);
                        if (i14 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) i14;
                            Type g14 = z.g(0, parameterizedType4);
                            if (cls == g14) {
                                Type g15 = z.g(1, parameterizedType4);
                                if (!cls2.isAssignableFrom(z.h(g15))) {
                                    return new p.j(this.f22712b, i10, this.f22711a.m(g15, annotationArr, this.f22713c), ((r) annotation).encoding());
                                }
                                throw z.o(this.f22712b, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw z.o(this.f22712b, i10, "@PartMap keys must be of type String: " + g14, new Object[0]);
                        }
                        throw z.o(this.f22712b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw z.o(this.f22712b, i10, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw z.o(this.f22712b, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof th.a) {
                j(i10, type);
                if (this.f22726p || this.f22727q) {
                    throw z.o(this.f22712b, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f22718h) {
                    try {
                        f m10 = this.f22711a.m(type, annotationArr, this.f22713c);
                        this.f22718h = true;
                        return new p.c(this.f22712b, i10, m10);
                    } catch (RuntimeException e10) {
                        throw z.p(this.f22712b, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw z.o(this.f22712b, i10, "Multiple @Body method annotations found.", new Object[0]);
                }
            } else if (!(annotation instanceof x)) {
                return null;
            } else {
                j(i10, type);
                Class<?> h19 = z.h(type);
                int i15 = i10 - 1;
                while (i15 >= 0) {
                    p<?> pVar = this.f22732v[i15];
                    if (!(pVar instanceof p.q) || !((p.q) pVar).f22677a.equals(h19)) {
                        i15--;
                    } else {
                        throw z.o(this.f22712b, i10, "@Tag type " + h19.getName() + " is duplicate of parameter #" + (i15 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new p.q(h19);
            }
        }

        public final void i(int i10, String str) {
            if (!f22710z.matcher(str).matches()) {
                throw z.o(this.f22712b, i10, "@Path parameter name must match %s. Found: %s", f22709y.pattern(), str);
            } else if (!this.f22731u.contains(str)) {
                throw z.o(this.f22712b, i10, "URL \"%s\" does not contain \"{%s}\".", this.f22728r, str);
            }
        }

        public final void j(int i10, Type type) {
            if (z.j(type)) {
                throw z.o(this.f22712b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public t(a aVar) {
        this.f22697a = aVar.f22712b;
        this.f22698b = aVar.f22711a.f22739c;
        this.f22699c = aVar.f22724n;
        this.f22700d = aVar.f22728r;
        this.f22701e = aVar.f22729s;
        this.f22702f = aVar.f22730t;
        this.f22703g = aVar.f22725o;
        this.f22704h = aVar.f22726p;
        this.f22705i = aVar.f22727q;
        this.f22706j = aVar.f22732v;
        this.f22707k = aVar.f22733w;
    }

    public static t b(v vVar, Method method) {
        return new a(vVar, method).b();
    }

    public j0 a(Object[] objArr) throws IOException {
        p<?>[] pVarArr = this.f22706j;
        int length = objArr.length;
        if (length == pVarArr.length) {
            s sVar = new s(this.f22699c, this.f22698b, this.f22700d, this.f22701e, this.f22702f, this.f22703g, this.f22704h, this.f22705i);
            if (this.f22707k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(objArr[i10]);
                pVarArr[i10].a(sVar, objArr[i10]);
            }
            return sVar.k().o(l.class, new l(this.f22697a, arrayList)).b();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + pVarArr.length + ")");
    }
}

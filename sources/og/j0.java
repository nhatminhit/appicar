package og;

import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import og.b0;
import pg.e;
import ug.f;

public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f21623a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21624b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f21625c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final k0 f21626d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Class<?>, Object> f21627e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public volatile f f21628f;

    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public c0 f21629a;

        /* renamed from: b  reason: collision with root package name */
        public String f21630b;

        /* renamed from: c  reason: collision with root package name */
        public b0.a f21631c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public k0 f21632d;

        /* renamed from: e  reason: collision with root package name */
        public Map<Class<?>, Object> f21633e;

        public a() {
            this.f21633e = Collections.emptyMap();
            this.f21630b = "GET";
            this.f21631c = new b0.a();
        }

        public a(j0 j0Var) {
            this.f21633e = Collections.emptyMap();
            this.f21629a = j0Var.f21623a;
            this.f21630b = j0Var.f21624b;
            this.f21632d = j0Var.f21626d;
            this.f21633e = j0Var.f21627e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(j0Var.f21627e);
            this.f21631c = j0Var.f21625c.j();
        }

        public a a(String str, String str2) {
            this.f21631c.b(str, str2);
            return this;
        }

        public j0 b() {
            if (this.f21629a != null) {
                return new j0(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a c(f fVar) {
            String fVar2 = fVar.toString();
            return fVar2.isEmpty() ? n("Cache-Control") : h("Cache-Control", fVar2);
        }

        public a d() {
            return e(e.f22069e);
        }

        public a e(@Nullable k0 k0Var) {
            return j("DELETE", k0Var);
        }

        public a f() {
            return j("GET", (k0) null);
        }

        public a g() {
            return j("HEAD", (k0) null);
        }

        public a h(String str, String str2) {
            this.f21631c.l(str, str2);
            return this;
        }

        public a i(b0 b0Var) {
            this.f21631c = b0Var.j();
            return this;
        }

        public a j(String str, @Nullable k0 k0Var) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (k0Var != null && !f.b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (k0Var != null || !f.e(str)) {
                this.f21630b = str;
                this.f21632d = k0Var;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public a k(k0 k0Var) {
            return j("PATCH", k0Var);
        }

        public a l(k0 k0Var) {
            return j("POST", k0Var);
        }

        public a m(k0 k0Var) {
            return j("PUT", k0Var);
        }

        public a n(String str) {
            this.f21631c.k(str);
            return this;
        }

        public <T> a o(Class<? super T> cls, @Nullable T t10) {
            if (cls != null) {
                if (t10 == null) {
                    this.f21633e.remove(cls);
                } else {
                    if (this.f21633e.isEmpty()) {
                        this.f21633e = new LinkedHashMap();
                    }
                    this.f21633e.put(cls, cls.cast(t10));
                }
                return this;
            }
            throw new NullPointerException("type == null");
        }

        public a p(@Nullable Object obj) {
            return o(Object.class, obj);
        }

        public a q(String str) {
            StringBuilder sb2;
            int i10;
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    sb2 = new StringBuilder();
                    sb2.append("http:");
                    i10 = 3;
                } else {
                    if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                        sb2 = new StringBuilder();
                        sb2.append("https:");
                        i10 = 4;
                    }
                    return s(c0.m(str));
                }
                sb2.append(str.substring(i10));
                str = sb2.toString();
                return s(c0.m(str));
            }
            throw new NullPointerException("url == null");
        }

        public a r(URL url) {
            if (url != null) {
                return s(c0.m(url.toString()));
            }
            throw new NullPointerException("url == null");
        }

        public a s(c0 c0Var) {
            if (c0Var != null) {
                this.f21629a = c0Var;
                return this;
            }
            throw new NullPointerException("url == null");
        }
    }

    public j0(a aVar) {
        this.f21623a = aVar.f21629a;
        this.f21624b = aVar.f21630b;
        this.f21625c = aVar.f21631c.i();
        this.f21626d = aVar.f21632d;
        this.f21627e = e.w(aVar.f21633e);
    }

    @Nullable
    public k0 a() {
        return this.f21626d;
    }

    public f b() {
        f fVar = this.f21628f;
        if (fVar != null) {
            return fVar;
        }
        f m10 = f.m(this.f21625c);
        this.f21628f = m10;
        return m10;
    }

    @Nullable
    public String c(String str) {
        return this.f21625c.d(str);
    }

    public List<String> d(String str) {
        return this.f21625c.p(str);
    }

    public b0 e() {
        return this.f21625c;
    }

    public boolean f() {
        return this.f21623a.q();
    }

    public String g() {
        return this.f21624b;
    }

    public a h() {
        return new a(this);
    }

    @Nullable
    public Object i() {
        return j(Object.class);
    }

    @Nullable
    public <T> T j(Class<? extends T> cls) {
        return cls.cast(this.f21627e.get(cls));
    }

    public c0 k() {
        return this.f21623a;
    }

    public String toString() {
        return "Request{method=" + this.f21624b + ", url=" + this.f21623a + ", tags=" + this.f21627e + '}';
    }
}

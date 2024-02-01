package rh;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import og.b0;
import og.f0;
import og.k0;

public abstract class p<T> {

    public class a extends p<Iterable<T>> {
        public a() {
        }

        /* renamed from: d */
        public void a(s sVar, @Nullable Iterable<T> iterable) throws IOException {
            if (iterable != null) {
                for (T a10 : iterable) {
                    p.this.a(sVar, a10);
                }
            }
        }
    }

    public class b extends p<Object> {
        public b() {
        }

        public void a(s sVar, @Nullable Object obj) throws IOException {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i10 = 0; i10 < length; i10++) {
                    p.this.a(sVar, Array.get(obj, i10));
                }
            }
        }
    }

    public static final class c<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f22635a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22636b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, k0> f22637c;

        public c(Method method, int i10, f<T, k0> fVar) {
            this.f22635a = method;
            this.f22636b = i10;
            this.f22637c = fVar;
        }

        public void a(s sVar, @Nullable T t10) {
            if (t10 != null) {
                try {
                    sVar.l(this.f22637c.a(t10));
                } catch (IOException e10) {
                    Method method = this.f22635a;
                    int i10 = this.f22636b;
                    throw z.p(method, e10, i10, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
                }
            } else {
                throw z.o(this.f22635a, this.f22636b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    public static final class d<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f22638a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f22639b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f22640c;

        public d(String str, f<T, String> fVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f22638a = str;
            this.f22639b = fVar;
            this.f22640c = z10;
        }

        public void a(s sVar, @Nullable T t10) throws IOException {
            String a10;
            if (t10 != null && (a10 = this.f22639b.a(t10)) != null) {
                sVar.a(this.f22638a, a10, this.f22640c);
            }
        }
    }

    public static final class e<T> extends p<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f22641a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22642b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, String> f22643c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f22644d;

        public e(Method method, int i10, f<T, String> fVar, boolean z10) {
            this.f22641a = method;
            this.f22642b = i10;
            this.f22643c = fVar;
            this.f22644d = z10;
        }

        /* renamed from: d */
        public void a(s sVar, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a10 = this.f22643c.a(value);
                            if (a10 != null) {
                                sVar.a(str, a10, this.f22644d);
                            } else {
                                Method method = this.f22641a;
                                int i10 = this.f22642b;
                                throw z.o(method, i10, "Field map value '" + value + "' converted to null by " + this.f22643c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f22641a;
                            int i11 = this.f22642b;
                            throw z.o(method2, i11, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw z.o(this.f22641a, this.f22642b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw z.o(this.f22641a, this.f22642b, "Field map was null.", new Object[0]);
        }
    }

    public static final class f<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f22645a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f22646b;

        public f(String str, f<T, String> fVar) {
            Objects.requireNonNull(str, "name == null");
            this.f22645a = str;
            this.f22646b = fVar;
        }

        public void a(s sVar, @Nullable T t10) throws IOException {
            String a10;
            if (t10 != null && (a10 = this.f22646b.a(t10)) != null) {
                sVar.b(this.f22645a, a10);
            }
        }
    }

    public static final class g<T> extends p<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f22647a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22648b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, String> f22649c;

        public g(Method method, int i10, f<T, String> fVar) {
            this.f22647a = method;
            this.f22648b = i10;
            this.f22649c = fVar;
        }

        /* renamed from: d */
        public void a(s sVar, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            sVar.b(str, this.f22649c.a(value));
                        } else {
                            Method method = this.f22647a;
                            int i10 = this.f22648b;
                            throw z.o(method, i10, "Header map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw z.o(this.f22647a, this.f22648b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw z.o(this.f22647a, this.f22648b, "Header map was null.", new Object[0]);
        }
    }

    public static final class h extends p<b0> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f22650a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22651b;

        public h(Method method, int i10) {
            this.f22650a = method;
            this.f22651b = i10;
        }

        /* renamed from: d */
        public void a(s sVar, @Nullable b0 b0Var) {
            if (b0Var != null) {
                sVar.c(b0Var);
                return;
            }
            throw z.o(this.f22650a, this.f22651b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    public static final class i<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f22652a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22653b;

        /* renamed from: c  reason: collision with root package name */
        public final b0 f22654c;

        /* renamed from: d  reason: collision with root package name */
        public final f<T, k0> f22655d;

        public i(Method method, int i10, b0 b0Var, f<T, k0> fVar) {
            this.f22652a = method;
            this.f22653b = i10;
            this.f22654c = b0Var;
            this.f22655d = fVar;
        }

        public void a(s sVar, @Nullable T t10) {
            if (t10 != null) {
                try {
                    sVar.d(this.f22654c, this.f22655d.a(t10));
                } catch (IOException e10) {
                    Method method = this.f22652a;
                    int i10 = this.f22653b;
                    throw z.o(method, i10, "Unable to convert " + t10 + " to RequestBody", e10);
                }
            }
        }
    }

    public static final class j<T> extends p<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f22656a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22657b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, k0> f22658c;

        /* renamed from: d  reason: collision with root package name */
        public final String f22659d;

        public j(Method method, int i10, f<T, k0> fVar, String str) {
            this.f22656a = method;
            this.f22657b = i10;
            this.f22658c = fVar;
            this.f22659d = str;
        }

        /* renamed from: d */
        public void a(s sVar, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            sVar.d(b0.l("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f22659d), this.f22658c.a(value));
                        } else {
                            Method method = this.f22656a;
                            int i10 = this.f22657b;
                            throw z.o(method, i10, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw z.o(this.f22656a, this.f22657b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw z.o(this.f22656a, this.f22657b, "Part map was null.", new Object[0]);
        }
    }

    public static final class k<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f22660a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22661b;

        /* renamed from: c  reason: collision with root package name */
        public final String f22662c;

        /* renamed from: d  reason: collision with root package name */
        public final f<T, String> f22663d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f22664e;

        public k(Method method, int i10, String str, f<T, String> fVar, boolean z10) {
            this.f22660a = method;
            this.f22661b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f22662c = str;
            this.f22663d = fVar;
            this.f22664e = z10;
        }

        public void a(s sVar, @Nullable T t10) throws IOException {
            if (t10 != null) {
                sVar.f(this.f22662c, this.f22663d.a(t10), this.f22664e);
                return;
            }
            Method method = this.f22660a;
            int i10 = this.f22661b;
            throw z.o(method, i10, "Path parameter \"" + this.f22662c + "\" value must not be null.", new Object[0]);
        }
    }

    public static final class l<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f22665a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f22666b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f22667c;

        public l(String str, f<T, String> fVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f22665a = str;
            this.f22666b = fVar;
            this.f22667c = z10;
        }

        public void a(s sVar, @Nullable T t10) throws IOException {
            String a10;
            if (t10 != null && (a10 = this.f22666b.a(t10)) != null) {
                sVar.g(this.f22665a, a10, this.f22667c);
            }
        }
    }

    public static final class m<T> extends p<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f22668a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22669b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, String> f22670c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f22671d;

        public m(Method method, int i10, f<T, String> fVar, boolean z10) {
            this.f22668a = method;
            this.f22669b = i10;
            this.f22670c = fVar;
            this.f22671d = z10;
        }

        /* renamed from: d */
        public void a(s sVar, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a10 = this.f22670c.a(value);
                            if (a10 != null) {
                                sVar.g(str, a10, this.f22671d);
                            } else {
                                Method method = this.f22668a;
                                int i10 = this.f22669b;
                                throw z.o(method, i10, "Query map value '" + value + "' converted to null by " + this.f22670c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f22668a;
                            int i11 = this.f22669b;
                            throw z.o(method2, i11, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw z.o(this.f22668a, this.f22669b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw z.o(this.f22668a, this.f22669b, "Query map was null", new Object[0]);
        }
    }

    public static final class n<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final f<T, String> f22672a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f22673b;

        public n(f<T, String> fVar, boolean z10) {
            this.f22672a = fVar;
            this.f22673b = z10;
        }

        public void a(s sVar, @Nullable T t10) throws IOException {
            if (t10 != null) {
                sVar.g(this.f22672a.a(t10), (String) null, this.f22673b);
            }
        }
    }

    public static final class o extends p<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f22674a = new o();

        /* renamed from: d */
        public void a(s sVar, @Nullable f0.b bVar) {
            if (bVar != null) {
                sVar.e(bVar);
            }
        }
    }

    /* renamed from: rh.p$p  reason: collision with other inner class name */
    public static final class C0416p extends p<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f22675a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22676b;

        public C0416p(Method method, int i10) {
            this.f22675a = method;
            this.f22676b = i10;
        }

        public void a(s sVar, @Nullable Object obj) {
            if (obj != null) {
                sVar.m(obj);
                return;
            }
            throw z.o(this.f22675a, this.f22676b, "@Url parameter is null.", new Object[0]);
        }
    }

    public static final class q<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f22677a;

        public q(Class<T> cls) {
            this.f22677a = cls;
        }

        public void a(s sVar, @Nullable T t10) {
            sVar.h(this.f22677a, t10);
        }
    }

    public abstract void a(s sVar, @Nullable T t10) throws IOException;

    public final p<Object> b() {
        return new b();
    }

    public final p<Iterable<T>> c() {
        return new a();
    }
}

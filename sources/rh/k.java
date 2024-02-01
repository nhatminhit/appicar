package rh;

import ie.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import og.g;
import og.l0;
import og.m0;
import rh.z;

public abstract class k<ResponseT, ReturnT> extends w<ReturnT> {

    /* renamed from: a  reason: collision with root package name */
    public final t f22617a;

    /* renamed from: b  reason: collision with root package name */
    public final g.a f22618b;

    /* renamed from: c  reason: collision with root package name */
    public final f<m0, ResponseT> f22619c;

    public static final class a<ResponseT, ReturnT> extends k<ResponseT, ReturnT> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, ReturnT> f22620d;

        public a(t tVar, g.a aVar, f<m0, ResponseT> fVar, c<ResponseT, ReturnT> cVar) {
            super(tVar, aVar, fVar);
            this.f22620d = cVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [rh.b<ResponseT>, rh.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT c(rh.b<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                rh.c<ResponseT, ReturnT> r2 = r0.f22620d
                java.lang.Object r1 = r2.b(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: rh.k.a.c(rh.b, java.lang.Object[]):java.lang.Object");
        }
    }

    public static final class b<ResponseT> extends k<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, b<ResponseT>> f22621d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f22622e;

        public b(t tVar, g.a aVar, f<m0, ResponseT> fVar, c<ResponseT, b<ResponseT>> cVar, boolean z10) {
            super(tVar, aVar, fVar);
            this.f22621d = cVar;
            this.f22622e = z10;
        }

        public Object c(b<ResponseT> bVar, Object[] objArr) {
            b bVar2 = (b) this.f22621d.b(bVar);
            d dVar = objArr[objArr.length - 1];
            try {
                return this.f22622e ? m.b(bVar2, dVar) : m.a(bVar2, dVar);
            } catch (Exception e10) {
                return m.e(e10, dVar);
            }
        }
    }

    public static final class c<ResponseT> extends k<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, b<ResponseT>> f22623d;

        public c(t tVar, g.a aVar, f<m0, ResponseT> fVar, c<ResponseT, b<ResponseT>> cVar) {
            super(tVar, aVar, fVar);
            this.f22623d = cVar;
        }

        public Object c(b<ResponseT> bVar, Object[] objArr) {
            b bVar2 = (b) this.f22623d.b(bVar);
            d dVar = objArr[objArr.length - 1];
            try {
                return m.c(bVar2, dVar);
            } catch (Exception e10) {
                return m.e(e10, dVar);
            }
        }
    }

    public k(t tVar, g.a aVar, f<m0, ResponseT> fVar) {
        this.f22617a = tVar;
        this.f22618b = aVar;
        this.f22619c = fVar;
    }

    public static <ResponseT, ReturnT> c<ResponseT, ReturnT> d(v vVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return vVar.b(type, annotationArr);
        } catch (RuntimeException e10) {
            throw z.n(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    public static <ResponseT> f<m0, ResponseT> e(v vVar, Method method, Type type) {
        try {
            return vVar.n(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw z.n(method, e10, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> k<ResponseT, ReturnT> f(v vVar, Method method, t tVar) {
        Type type;
        boolean z10;
        Class<u> cls = u.class;
        boolean z11 = tVar.f22707k;
        Annotation[] annotations = method.getAnnotations();
        if (z11) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f10 = z.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (z.h(f10) != cls || !(f10 instanceof ParameterizedType)) {
                z10 = false;
            } else {
                f10 = z.g(0, (ParameterizedType) f10);
                z10 = true;
            }
            type = new z.b((Type) null, b.class, f10);
            annotations = y.a(annotations);
        } else {
            type = method.getGenericReturnType();
            z10 = false;
        }
        c d10 = d(vVar, method, type, annotations);
        Type a10 = d10.a();
        if (a10 == l0.class) {
            throw z.m(method, "'" + z.h(a10).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (a10 == cls) {
            throw z.m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!tVar.f22699c.equals("HEAD") || Void.class.equals(a10)) {
            f e10 = e(vVar, method, a10);
            g.a aVar = vVar.f22738b;
            return !z11 ? new a(tVar, aVar, e10, d10) : z10 ? new c(tVar, aVar, e10, d10) : new b(tVar, aVar, e10, d10, false);
        } else {
            throw z.m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
    }

    @Nullable
    public final ReturnT a(Object[] objArr) {
        return c(new n(this.f22617a, objArr, this.f22618b, this.f22619c), objArr);
    }

    @Nullable
    public abstract ReturnT c(b<ResponseT> bVar, Object[] objArr);
}

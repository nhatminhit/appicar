package wf;

import be.p;
import fh.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import kotlin.Metadata;
import pf.m0;
import we.l;
import xe.l0;
import xe.n0;
import zd.d1;
import zd.e1;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a2\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002\u001a*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002\u001a1\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b2\u0014\b\u0004\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007H\b\u001a\u0018\u0010\u0011\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u001b\u0010\u0013\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000fH\u0010\"\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018*(\b\u0002\u0010\u001a\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007¨\u0006\u001b"}, d2 = {"", "E", "exception", "h", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/Class;", "clz", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "b", "Ljava/lang/reflect/Constructor;", "constructor", "c", "block", "g", "", "defaultValue", "f", "accumulator", "d", "a", "I", "throwableFields", "Lwf/k;", "Lwf/k;", "ctorCache", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final int f24108a = f(Throwable.class, -1);
    @fh.g

    /* renamed from: b  reason: collision with root package name */
    public static final k f24109b;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "fe/g$c", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return fe.g.l(Integer.valueOf(((Constructor) t11).getParameterTypes().length), Integer.valueOf(((Constructor) t10).getParameterTypes().length));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "E", "it", "", "c", "(Ljava/lang/Throwable;)Ljava/lang/Void;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends n0 implements l {
        public static final b P = new b();

        public b() {
            super(1);
        }

        @h
        /* renamed from: c */
        public final Void A(@fh.g Throwable th2) {
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "c", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "wf/n$g"}, k = 3, mv = {1, 6, 0})
    public static final class c extends n0 implements l<Throwable, Throwable> {
        public final /* synthetic */ Constructor P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.P = constructor;
        }

        @h
        /* renamed from: c */
        public final Throwable A(@fh.g Throwable th2) {
            Object obj;
            try {
                d1.a aVar = d1.P;
                Object newInstance = this.P.newInstance(new Object[]{th2.getMessage(), th2});
                if (newInstance != null) {
                    obj = d1.b((Throwable) newInstance);
                    if (d1.i(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                d1.a aVar2 = d1.P;
                obj = d1.b(e1.a(th3));
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "c", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "wf/n$g"}, k = 3, mv = {1, 6, 0})
    public static final class d extends n0 implements l<Throwable, Throwable> {
        public final /* synthetic */ Constructor P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.P = constructor;
        }

        @h
        /* renamed from: c */
        public final Throwable A(@fh.g Throwable th2) {
            Object obj;
            try {
                d1.a aVar = d1.P;
                Object newInstance = this.P.newInstance(new Object[]{th2});
                if (newInstance != null) {
                    obj = d1.b((Throwable) newInstance);
                    if (d1.i(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                d1.a aVar2 = d1.P;
                obj = d1.b(e1.a(th3));
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "c", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "wf/n$g"}, k = 3, mv = {1, 6, 0})
    public static final class e extends n0 implements l<Throwable, Throwable> {
        public final /* synthetic */ Constructor P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Constructor constructor) {
            super(1);
            this.P = constructor;
        }

        @h
        /* renamed from: c */
        public final Throwable A(@fh.g Throwable th2) {
            Object obj;
            try {
                d1.a aVar = d1.P;
                Object newInstance = this.P.newInstance(new Object[]{th2.getMessage()});
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th2);
                    obj = d1.b(th3);
                    if (d1.i(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th4) {
                d1.a aVar2 = d1.P;
                obj = d1.b(e1.a(th4));
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "c", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "wf/n$g"}, k = 3, mv = {1, 6, 0})
    public static final class f extends n0 implements l<Throwable, Throwable> {
        public final /* synthetic */ Constructor P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Constructor constructor) {
            super(1);
            this.P = constructor;
        }

        @h
        /* renamed from: c */
        public final Throwable A(@fh.g Throwable th2) {
            Object obj;
            try {
                d1.a aVar = d1.P;
                Object newInstance = this.P.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th2);
                    obj = d1.b(th3);
                    if (d1.i(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th4) {
                d1.a aVar2 = d1.P;
                obj = d1.b(e1.a(th4));
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "e", "c", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 6, 0})
    public static final class g extends n0 implements l<Throwable, Throwable> {
        public final /* synthetic */ l<Throwable, Throwable> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(l<? super Throwable, ? extends Throwable> lVar) {
            super(1);
            this.P = lVar;
        }

        @h
        /* renamed from: c */
        public final Throwable A(@fh.g Throwable th2) {
            Object obj;
            l<Throwable, Throwable> lVar = this.P;
            try {
                d1.a aVar = d1.P;
                obj = d1.b(lVar.A(th2));
            } catch (Throwable th3) {
                d1.a aVar2 = d1.P;
                obj = d1.b(e1.a(th3));
            }
            if (d1.i(obj)) {
                obj = null;
            }
            return (Throwable) obj;
        }
    }

    static {
        k kVar;
        try {
            kVar = p.a() ? e1.f24094a : e.f24089a;
        } catch (Throwable unused) {
            kVar = e1.f24094a;
        }
        f24109b = kVar;
    }

    public static final <E extends Throwable> l<Throwable, Throwable> b(Class<E> cls) {
        b bVar = b.P;
        if (f24108a != f(cls, 0)) {
            return bVar;
        }
        for (Constructor c10 : p.mw(cls.getConstructors(), new a())) {
            l<Throwable, Throwable> c11 = c(c10);
            if (c11 != null) {
                return c11;
            }
        }
        return bVar;
    }

    public static final l<Throwable, Throwable> c(Constructor<?> constructor) {
        Class<String> cls = String.class;
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new f(constructor);
        }
        if (length == 1) {
            Class cls2 = parameterTypes[0];
            if (l0.g(cls2, Throwable.class)) {
                return new d(constructor);
            }
            if (l0.g(cls2, cls)) {
                return new e(constructor);
            }
            return null;
        } else if (length == 2 && l0.g(parameterTypes[0], cls) && l0.g(parameterTypes[1], Throwable.class)) {
            return new c(constructor);
        } else {
            return null;
        }
    }

    public static final int d(Class<?> cls, int i10) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r5.getDeclaredFields();
            int length = declaredFields.length;
            int i11 = 0;
            Class<? super Object> cls2 = cls;
            for (int i12 = 0; i12 < length; i12++) {
                if (!Modifier.isStatic(declaredFields[i12].getModifiers())) {
                    i11++;
                }
            }
            i10 += i11;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i10;
    }

    public static /* synthetic */ int e(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return d(cls, i10);
    }

    public static final int f(Class<?> cls, int i10) {
        Integer num;
        ve.a.i(cls);
        try {
            d1.a aVar = d1.P;
            num = d1.b(Integer.valueOf(e(cls, 0, 1, (Object) null)));
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            num = d1.b(e1.a(th2));
        }
        Integer valueOf = Integer.valueOf(i10);
        if (d1.i(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    public static final l<Throwable, Throwable> g(l<? super Throwable, ? extends Throwable> lVar) {
        return new g(lVar);
    }

    @h
    public static final <E extends Throwable> E h(@fh.g E e10) {
        E e11;
        if (!(e10 instanceof m0)) {
            return (Throwable) f24109b.a(e10.getClass()).A(e10);
        }
        try {
            d1.a aVar = d1.P;
            e11 = d1.b(((m0) e10).a());
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            e11 = d1.b(e1.a(th2));
        }
        if (d1.i(e11)) {
            e11 = null;
        }
        return (Throwable) e11;
    }
}

package hf;

import be.e0;
import be.x;
import fh.g;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import oe.h;
import og.c0;
import p000if.m;
import p000if.s;
import p000if.u;
import we.l;
import xe.h0;
import xe.l0;
import zd.h1;
import zd.j0;
import zd.r;

public final class b0 {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19545a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                hf.v[] r0 = hf.v.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                hf.v r1 = hf.v.IN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                hf.v r1 = hf.v.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                hf.v r1 = hf.v.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f19545a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hf.b0.a.<clinit>():void");
        }
    }

    public /* synthetic */ class b extends h0 implements l<Class<?>, Class<?>> {
        public static final b X = new b();

        public b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        /* renamed from: z0 */
        public final Class<?> A(@g Class<?> cls) {
            l0.p(cls, "p0");
            return cls.getComponentType();
        }
    }

    @r
    public static final Type c(s sVar, boolean z10) {
        g W = sVar.W();
        if (W instanceof t) {
            return new a0((t) W);
        }
        if (W instanceof d) {
            d dVar = (d) W;
            Class g10 = z10 ? ve.a.g(dVar) : ve.a.d(dVar);
            List<u> U = sVar.U();
            if (U.isEmpty()) {
                return g10;
            }
            if (!g10.isArray()) {
                return e(g10, U);
            }
            if (g10.getComponentType().isPrimitive()) {
                return g10;
            }
            u uVar = (u) e0.f5(U);
            if (uVar != null) {
                v a10 = uVar.a();
                s b10 = uVar.b();
                int i10 = a10 == null ? -1 : a.f19545a[a10.ordinal()];
                if (i10 == -1 || i10 == 1) {
                    return g10;
                }
                if (i10 == 2 || i10 == 3) {
                    l0.m(b10);
                    Type d10 = d(b10, false, 1, (Object) null);
                    return d10 instanceof Class ? g10 : new a(d10);
                }
                throw new j0();
            }
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + sVar);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + sVar);
    }

    public static /* synthetic */ Type d(s sVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(sVar, z10);
    }

    @r
    public static final Type e(Class<?> cls, List<u> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(x.Y(list, 10));
            for (u g10 : list) {
                arrayList.add(g(g10));
            }
            return new x(cls, (Type) null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(x.Y(list, 10));
            for (u g11 : list) {
                arrayList2.add(g(g11));
            }
            return new x(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type e10 = e(declaringClass, list.subList(length, list.size()));
            List<u> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(x.Y(subList, 10));
            for (u g12 : subList) {
                arrayList3.add(g(g12));
            }
            return new x(cls, e10, arrayList3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = ((xe.m0) r3).P();
     */
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.reflect.Type f(@fh.g hf.s r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            boolean r0 = r3 instanceof xe.m0
            if (r0 == 0) goto L_0x0013
            r0 = r3
            xe.m0 r0 = (xe.m0) r0
            java.lang.reflect.Type r0 = r0.P()
            if (r0 == 0) goto L_0x0013
            return r0
        L_0x0013:
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.reflect.Type r3 = d(r3, r0, r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.b0.f(hf.s):java.lang.reflect.Type");
    }

    public static final Type g(u uVar) {
        v h10 = uVar.h();
        if (h10 == null) {
            return c0.Q.a();
        }
        s g10 = uVar.g();
        l0.m(g10);
        int i10 = a.f19545a[h10.ordinal()];
        if (i10 == 1) {
            return new c0((Type) null, c(g10, true));
        }
        if (i10 == 2) {
            return c(g10, true);
        }
        if (i10 == 3) {
            return new c0(c(g10, true), (Type) null);
        }
        throw new j0();
    }

    @h1(version = "1.4")
    @r
    @h
    public static /* synthetic */ void h(s sVar) {
    }

    @r
    public static /* synthetic */ void i(u uVar) {
    }

    public static final String j(Type type) {
        String str;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            m l10 = s.l(type, b.X);
            str = ((Class) u.f1(l10)).getName() + lf.b0.h2(c0.f21474n, u.g0(l10));
        } else {
            str = cls.getName();
        }
        l0.o(str, "{\n        if (type.isArr…   } else type.name\n    }");
        return str;
    }
}

package y5;

import a6.h;
import i5.c0;
import i5.d0;
import i5.e0;
import i5.j;
import i5.l;
import i5.o;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import s5.g;
import w4.i;
import x5.k;

public abstract class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final o<Object> f15523a = new j0();

    /* renamed from: b  reason: collision with root package name */
    public static final o<Object> f15524b = new d();

    public static class a extends m0<Object> {
        public static final int S = 1;
        public static final int T = 2;
        public static final int U = 3;
        public static final int V = 4;
        public static final int W = 5;
        public static final int X = 6;
        public static final int Y = 7;
        public static final int Z = 8;
        public final int R;

        public a(int i10, Class<?> cls) {
            super(cls, false);
            this.R = i10;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m(java.lang.Object r3, w4.i r4, i5.e0 r5) throws java.io.IOException {
            /*
                r2 = this;
                int r0 = r2.R
                switch(r0) {
                    case 1: goto L_0x0058;
                    case 2: goto L_0x004e;
                    case 3: goto L_0x0044;
                    case 4: goto L_0x0023;
                    case 5: goto L_0x0019;
                    case 6: goto L_0x0019;
                    case 7: goto L_0x000a;
                    default: goto L_0x0005;
                }
            L_0x0005:
                java.lang.String r3 = r3.toString()
                goto L_0x004a
            L_0x000a:
                i5.c0 r5 = r5.q()
                w4.a r5 = r5.o()
                byte[] r3 = (byte[]) r3
                java.lang.String r3 = r5.h(r3)
                goto L_0x004a
            L_0x0019:
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                r4.h2(r0)
                goto L_0x005d
            L_0x0023:
                i5.d0 r0 = i5.d0.WRITE_ENUMS_USING_TO_STRING
                boolean r0 = r5.w0(r0)
                if (r0 == 0) goto L_0x002c
                goto L_0x0005
            L_0x002c:
                java.lang.Enum r3 = (java.lang.Enum) r3
                i5.d0 r0 = i5.d0.WRITE_ENUM_KEYS_USING_INDEX
                boolean r5 = r5.w0(r0)
                if (r5 == 0) goto L_0x003f
                int r3 = r3.ordinal()
                java.lang.String r3 = java.lang.String.valueOf(r3)
                goto L_0x004a
            L_0x003f:
                java.lang.String r3 = r3.name()
                goto L_0x004a
            L_0x0044:
                java.lang.Class r3 = (java.lang.Class) r3
                java.lang.String r3 = r3.getName()
            L_0x004a:
                r4.i2(r3)
                goto L_0x005d
            L_0x004e:
                java.util.Calendar r3 = (java.util.Calendar) r3
                long r0 = r3.getTimeInMillis()
                r5.M(r0, r4)
                goto L_0x005d
            L_0x0058:
                java.util.Date r3 = (java.util.Date) r3
                r5.N(r3, r4)
            L_0x005d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y5.k0.a.m(java.lang.Object, w4.i, i5.e0):void");
        }
    }

    public static class b extends m0<Object> {
        public transient k R = k.c();

        public b() {
            super(String.class, false);
        }

        public o<Object> M(k kVar, Class<?> cls, e0 e0Var) throws l {
            if (cls == Object.class) {
                a aVar = new a(8, cls);
                this.R = kVar.m(cls, aVar);
                return aVar;
            }
            k.d f10 = kVar.f(cls, e0Var, (i5.d) null);
            k kVar2 = f10.f15105b;
            if (kVar != kVar2) {
                this.R = kVar2;
            }
            return f10.f15104a;
        }

        public Object N() {
            this.R = k.c();
            return this;
        }

        public void e(g gVar, j jVar) throws l {
            I(gVar, jVar);
        }

        public void m(Object obj, i iVar, e0 e0Var) throws IOException {
            Class<?> cls = obj.getClass();
            k kVar = this.R;
            o<Object> n10 = kVar.n(cls);
            if (n10 == null) {
                n10 = M(kVar, cls, e0Var);
            }
            n10.m(obj, iVar, e0Var);
        }
    }

    public static class c extends m0<Object> {
        public final a6.l R;

        public c(Class<?> cls, a6.l lVar) {
            super(cls, false);
            this.R = lVar;
        }

        public static c M(Class<?> cls, a6.l lVar) {
            return new c(cls, lVar);
        }

        public void m(Object obj, i iVar, e0 e0Var) throws IOException {
            if (e0Var.w0(d0.WRITE_ENUMS_USING_TO_STRING)) {
                iVar.i2(obj.toString());
                return;
            }
            Enum enumR = (Enum) obj;
            if (e0Var.w0(d0.WRITE_ENUM_KEYS_USING_INDEX)) {
                iVar.i2(String.valueOf(enumR.ordinal()));
            } else {
                iVar.j2(this.R.i(enumR));
            }
        }
    }

    public static class d extends m0<Object> {
        public d() {
            super(String.class, false);
        }

        public void m(Object obj, i iVar, e0 e0Var) throws IOException {
            iVar.i2((String) obj);
        }
    }

    @Deprecated
    public static o<Object> a() {
        return f15523a;
    }

    public static o<Object> b(c0 c0Var, Class<?> cls) {
        if (cls != null) {
            if (cls == Enum.class) {
                return new b();
            }
            if (h.V(cls)) {
                return c.M(cls, a6.l.d(c0Var, cls));
            }
        }
        return new a(8, cls);
    }

    public static o<Object> c(c0 c0Var, Class<?> cls, boolean z10) {
        if (cls == null || cls == Object.class) {
            return new b();
        }
        if (cls == String.class) {
            return f15524b;
        }
        if (cls.isPrimitive()) {
            cls = h.v0(cls);
        }
        if (cls == Integer.class) {
            return new a(5, cls);
        }
        if (cls == Long.class) {
            return new a(6, cls);
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
            return new a(8, cls);
        }
        if (cls == Class.class) {
            return new a(3, cls);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return new a(1, cls);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new a(2, cls);
        }
        if (cls == UUID.class) {
            return new a(8, cls);
        }
        if (cls == byte[].class) {
            return new a(7, cls);
        }
        if (z10) {
            return new a(8, cls);
        }
        return null;
    }
}

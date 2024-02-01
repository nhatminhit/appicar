package com.fasterxml.jackson.databind.ser;

import a6.e;
import a6.h;
import i5.b;
import i5.c;
import i5.c0;
import i5.j;
import i5.l;
import j5.f;
import v4.u;

public class m {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f5055g = Boolean.FALSE;

    /* renamed from: a  reason: collision with root package name */
    public final c0 f5056a;

    /* renamed from: b  reason: collision with root package name */
    public final c f5057b;

    /* renamed from: c  reason: collision with root package name */
    public final b f5058c;

    /* renamed from: d  reason: collision with root package name */
    public Object f5059d;

    /* renamed from: e  reason: collision with root package name */
    public final u.b f5060e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5061f;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5062a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                v4.u$a[] r0 = v4.u.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5062a = r0
                v4.u$a r1 = v4.u.a.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5062a     // Catch:{ NoSuchFieldError -> 0x001d }
                v4.u$a r1 = v4.u.a.NON_ABSENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5062a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v4.u$a r1 = v4.u.a.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5062a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v4.u$a r1 = v4.u.a.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5062a     // Catch:{ NoSuchFieldError -> 0x003e }
                v4.u$a r1 = v4.u.a.NON_NULL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5062a     // Catch:{ NoSuchFieldError -> 0x0049 }
                v4.u$a r1 = v4.u.a.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.m.a.<clinit>():void");
        }
    }

    public m(c0 c0Var, c cVar) {
        this.f5056a = c0Var;
        this.f5057b = cVar;
        u.b j10 = u.b.j(cVar.u(u.b.d()), c0Var.B(cVar.x(), u.b.d()));
        this.f5060e = u.b.j(c0Var.z(), j10);
        this.f5061f = j10.i() == u.a.NON_DEFAULT;
        this.f5058c = c0Var.m();
    }

    public Object a(Exception exc, String str, Object obj) {
        while (true) {
            Throwable cause = r3.getCause();
            Throwable th2 = exc;
            if (cause != null) {
                th2 = th2.getCause();
            } else {
                h.o0(th2);
                h.q0(th2);
                throw new IllegalArgumentException("Failed to get property '" + str + "' of default " + obj.getClass().getName() + " instance");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        if (r0.v() != false) goto L_0x00c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.ser.d b(i5.e0 r16, q5.s r17, i5.j r18, i5.o<?> r19, u5.i r20, u5.i r21, q5.h r22, boolean r23) throws i5.l {
        /*
            r15 = this;
            r1 = r15
            r2 = r16
            r4 = r17
            r7 = r18
            r0 = r21
            r14 = r22
            r3 = 0
            r5 = r23
            i5.j r5 = r15.c(r14, r5, r7)     // Catch:{ l -> 0x0151 }
            if (r0 == 0) goto L_0x0043
            if (r5 != 0) goto L_0x0017
            r5 = r7
        L_0x0017:
            i5.j r6 = r5.d()
            if (r6 != 0) goto L_0x003a
            i5.c r6 = r1.f5057b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "serialization type "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r9 = " has no content"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r2.C0(r6, r4, r8, r9)
        L_0x003a:
            i5.j r0 = r5.d0(r0)
            r0.d()
            r10 = r0
            goto L_0x0044
        L_0x0043:
            r10 = r5
        L_0x0044:
            r5 = 0
            if (r10 != 0) goto L_0x0049
            r0 = r7
            goto L_0x004a
        L_0x0049:
            r0 = r10
        L_0x004a:
            q5.h r6 = r17.y()
            if (r6 != 0) goto L_0x005d
            i5.c r0 = r1.f5057b
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = "could not determine property type"
            java.lang.Object r0 = r2.C0(r0, r4, r5, r3)
        L_0x005a:
            com.fasterxml.jackson.databind.ser.d r0 = (com.fasterxml.jackson.databind.ser.d) r0
            return r0
        L_0x005d:
            java.lang.Class r6 = r6.g()
            i5.c0 r8 = r1.f5056a
            java.lang.Class r9 = r0.g()
            v4.u$b r11 = r1.f5060e
            v4.u$b r6 = r8.t(r9, r6, r11)
            v4.u$b r8 = r17.t()
            v4.u$b r6 = r6.o(r8)
            v4.u$a r8 = r6.i()
            v4.u$a r9 = v4.u.a.USE_DEFAULTS
            if (r8 != r9) goto L_0x007f
            v4.u$a r8 = v4.u.a.ALWAYS
        L_0x007f:
            int[] r9 = com.fasterxml.jackson.databind.ser.m.a.f5062a
            int r8 = r8.ordinal()
            r8 = r9[r8]
            r9 = 1
            if (r8 == r9) goto L_0x00cf
            r11 = 2
            if (r8 == r11) goto L_0x00c5
            r11 = 3
            if (r8 == r11) goto L_0x00c1
            r11 = 4
            if (r8 == r11) goto L_0x00af
            r6 = 5
            if (r8 == r6) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r3 = r9
        L_0x0098:
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x00ab
            i5.c0 r0 = r1.f5056a
            i5.d0 r6 = i5.d0.WRITE_EMPTY_JSON_ARRAYS
            boolean r0 = r0.P0(r6)
            if (r0 != 0) goto L_0x00ab
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.d.f5030k0
            goto L_0x00be
        L_0x00ab:
            r11 = r3
            r12 = r5
            goto L_0x0112
        L_0x00af:
            java.lang.Class r0 = r6.h()
            java.lang.Object r0 = r2.u0(r4, r0)
            if (r0 != 0) goto L_0x00ba
            goto L_0x00c3
        L_0x00ba:
            boolean r3 = r2.v0(r0)
        L_0x00be:
            r12 = r0
            r11 = r3
            goto L_0x0112
        L_0x00c1:
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.d.f5030k0
        L_0x00c3:
            r12 = r0
            goto L_0x00cd
        L_0x00c5:
            boolean r0 = r0.v()
            if (r0 == 0) goto L_0x00cc
            goto L_0x00c1
        L_0x00cc:
            r12 = r5
        L_0x00cd:
            r11 = r9
            goto L_0x0112
        L_0x00cf:
            boolean r6 = r1.f5061f
            if (r6 == 0) goto L_0x00fb
            java.lang.Object r6 = r15.e()
            if (r6 == 0) goto L_0x00fb
            i5.q r0 = i5.q.CAN_OVERRIDE_ACCESS_MODIFIERS
            boolean r0 = r2.w(r0)
            if (r0 == 0) goto L_0x00ec
            i5.c0 r0 = r1.f5056a
            i5.q r8 = i5.q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r0 = r0.T(r8)
            r14.l(r0)
        L_0x00ec:
            java.lang.Object r5 = r14.r(r6)     // Catch:{ Exception -> 0x00f1 }
            goto L_0x0100
        L_0x00f1:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = r17.getName()
            r15.a(r8, r0, r6)
            goto L_0x0100
        L_0x00fb:
            java.lang.Object r5 = a6.e.a(r0)
            r3 = r9
        L_0x0100:
            if (r5 != 0) goto L_0x0103
            goto L_0x00cc
        L_0x0103:
            java.lang.Class r0 = r5.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = a6.c.b(r5)
            goto L_0x00be
        L_0x0112:
            java.lang.Class[] r0 = r17.x()
            if (r0 != 0) goto L_0x011e
            i5.c r0 = r1.f5057b
            java.lang.Class[] r0 = r0.j()
        L_0x011e:
            r13 = r0
            com.fasterxml.jackson.databind.ser.d r0 = new com.fasterxml.jackson.databind.ser.d
            i5.c r3 = r1.f5057b
            a6.b r6 = r3.y()
            r3 = r0
            r4 = r17
            r5 = r22
            r7 = r18
            r8 = r19
            r9 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            i5.b r3 = r1.f5058c
            java.lang.Object r3 = r3.I(r14)
            if (r3 == 0) goto L_0x0144
            i5.o r2 = r2.G0(r14, r3)
            r0.x(r2)
        L_0x0144:
            i5.b r2 = r1.f5058c
            a6.s r2 = r2.q0(r14)
            if (r2 == 0) goto L_0x0150
            com.fasterxml.jackson.databind.ser.d r0 = r0.T(r2)
        L_0x0150:
            return r0
        L_0x0151:
            r0 = move-exception
            r5 = r0
            if (r4 != 0) goto L_0x015f
            java.lang.String r0 = a6.h.o(r5)
            java.lang.Object r0 = r2.z(r7, r0)
            goto L_0x005a
        L_0x015f:
            i5.c r0 = r1.f5057b
            java.lang.String r5 = a6.h.o(r5)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object r0 = r2.C0(r0, r4, r5, r3)
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.m.b(i5.e0, q5.s, i5.j, i5.o, u5.i, u5.i, q5.h, boolean):com.fasterxml.jackson.databind.ser.d");
    }

    public j c(q5.a aVar, boolean z10, j jVar) throws l {
        j J0 = this.f5058c.J0(this.f5056a, aVar, jVar);
        boolean z11 = true;
        if (J0 != jVar) {
            Class<?> g10 = J0.g();
            Class<?> g11 = jVar.g();
            if (!g10.isAssignableFrom(g11) && !g11.isAssignableFrom(g10)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + aVar.f() + "': class " + g10.getName() + " not a super-type of (declared) class " + g11.getName());
            }
            jVar = J0;
            z10 = true;
        }
        f.b k02 = this.f5058c.k0(aVar);
        if (!(k02 == null || k02 == f.b.DEFAULT_TYPING)) {
            if (k02 != f.b.STATIC) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            return jVar.g0();
        }
        return null;
    }

    public a6.b d() {
        return this.f5057b.y();
    }

    public Object e() {
        Object obj = this.f5059d;
        if (obj == null) {
            obj = this.f5057b.G(this.f5056a.c());
            if (obj == null) {
                obj = f5055g;
            }
            this.f5059d = obj;
        }
        if (obj == f5055g) {
            return null;
        }
        return this.f5059d;
    }

    @Deprecated
    public Object f(j jVar) {
        return e.a(jVar);
    }

    @Deprecated
    public Object g(String str, q5.h hVar, j jVar) {
        Object e10 = e();
        if (e10 == null) {
            return f(jVar);
        }
        try {
            return hVar.r(e10);
        } catch (Exception e11) {
            return a(e11, str, e10);
        }
    }
}

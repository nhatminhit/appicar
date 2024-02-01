package m5;

import a6.b0;
import i5.h;
import i5.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import l5.v;
import u5.f;
import w4.l;
import w4.p;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final j f10395a;

    /* renamed from: b  reason: collision with root package name */
    public final b[] f10396b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Object> f10397c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f10398d;

    /* renamed from: e  reason: collision with root package name */
    public final b0[] f10399e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final j f10400a;

        /* renamed from: b  reason: collision with root package name */
        public final List<b> f10401b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, Object> f10402c = new HashMap();

        public a(j jVar) {
            this.f10400a = jVar;
        }

        public final void a(String str, Integer num) {
            Object obj = this.f10402c.get(str);
            if (obj == null) {
                this.f10402c.put(str, num);
            } else if (obj instanceof List) {
                ((List) obj).add(num);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(obj);
                linkedList.add(num);
                this.f10402c.put(str, linkedList);
            }
        }

        public void b(v vVar, f fVar) {
            Integer valueOf = Integer.valueOf(this.f10401b.size());
            this.f10401b.add(new b(vVar, fVar));
            a(vVar.getName(), valueOf);
            a(fVar.i(), valueOf);
        }

        public g c(c cVar) {
            int size = this.f10401b.size();
            b[] bVarArr = new b[size];
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = this.f10401b.get(i10);
                v s10 = cVar.s(bVar.d());
                if (s10 != null) {
                    bVar.g(s10);
                }
                bVarArr[i10] = bVar;
            }
            return new g(this.f10400a, bVarArr, this.f10402c, (String[]) null, (b0[]) null);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final v f10403a;

        /* renamed from: b  reason: collision with root package name */
        public final f f10404b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10405c;

        /* renamed from: d  reason: collision with root package name */
        public v f10406d;

        public b(v vVar, f fVar) {
            this.f10403a = vVar;
            this.f10404b = fVar;
            this.f10405c = fVar.i();
        }

        public String a() {
            Class<?> h10 = this.f10404b.h();
            if (h10 == null) {
                return null;
            }
            return this.f10404b.j().c((Object) null, h10);
        }

        public v b() {
            return this.f10403a;
        }

        public v c() {
            return this.f10406d;
        }

        public String d() {
            return this.f10405c;
        }

        public boolean e() {
            return this.f10404b.h() != null;
        }

        public boolean f(String str) {
            return str.equals(this.f10405c);
        }

        public void g(v vVar) {
            this.f10406d = vVar;
        }
    }

    public g(j jVar, b[] bVarArr, Map<String, Object> map, String[] strArr, b0[] b0VarArr) {
        this.f10395a = jVar;
        this.f10396b = bVarArr;
        this.f10397c = map;
        this.f10398d = strArr;
        this.f10399e = b0VarArr;
    }

    public g(g gVar) {
        this.f10395a = gVar.f10395a;
        b[] bVarArr = gVar.f10396b;
        this.f10396b = bVarArr;
        this.f10397c = gVar.f10397c;
        int length = bVarArr.length;
        this.f10398d = new String[length];
        this.f10399e = new b0[length];
    }

    public static a d(j jVar) {
        return new a(jVar);
    }

    public final Object a(l lVar, i5.g gVar, int i10, String str) throws IOException {
        l u32 = this.f10399e[i10].u3(lVar);
        if (u32.D2() == p.VALUE_NULL) {
            return null;
        }
        b0 b0Var = new b0(lVar, gVar);
        b0Var.R2();
        b0Var.Z2(str);
        b0Var.P(u32);
        b0Var.f2();
        l u33 = b0Var.u3(lVar);
        u33.D2();
        return this.f10396b[i10].b().s(u33, gVar);
    }

    public final void b(l lVar, i5.g gVar, Object obj, int i10, String str) throws IOException {
        l u32 = this.f10399e[i10].u3(lVar);
        if (u32.D2() == p.VALUE_NULL) {
            this.f10396b[i10].b().M(obj, (Object) null);
            return;
        }
        b0 b0Var = new b0(lVar, gVar);
        b0Var.R2();
        b0Var.Z2(str);
        b0Var.P(u32);
        b0Var.f2();
        l u33 = b0Var.u3(lVar);
        u33.D2();
        this.f10396b[i10].b().t(u33, gVar, obj);
    }

    public final boolean c(l lVar, i5.g gVar, String str, Object obj, String str2, int i10) throws IOException {
        boolean z10 = false;
        if (!this.f10396b[i10].f(str)) {
            return false;
        }
        if (!(obj == null || this.f10399e[i10] == null)) {
            z10 = true;
        }
        if (z10) {
            b(lVar, gVar, obj, i10, str2);
            this.f10399e[i10] = null;
        } else {
            this.f10398d[i10] = str2;
        }
        return true;
    }

    public Object e(l lVar, i5.g gVar, Object obj) throws IOException {
        int length = this.f10396b.length;
        for (int i10 = 0; i10 < length; i10++) {
            String str = this.f10398d[i10];
            b0[] b0VarArr = this.f10399e;
            if (str == null) {
                b0 b0Var = b0VarArr[i10];
                if (b0Var != null) {
                    if (b0Var.y3().k()) {
                        l u32 = b0Var.u3(lVar);
                        u32.D2();
                        v b10 = this.f10396b[i10].b();
                        Object a10 = f.a(u32, gVar, b10.e());
                        if (a10 != null) {
                            b10.M(obj, a10);
                        } else if (!this.f10396b[i10].e()) {
                            gVar.T0(obj.getClass(), b10.getName(), "Missing external type id property '%s'", this.f10396b[i10].d());
                        } else {
                            str = this.f10396b[i10].a();
                        }
                    }
                }
            } else if (b0VarArr[i10] == null) {
                v b11 = this.f10396b[i10].b();
                if (b11.m() || gVar.v0(h.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    gVar.T0(obj.getClass(), b11.getName(), "Missing property '%s' for external type id '%s'", b11.getName(), this.f10396b[i10].d());
                }
                return obj;
            }
            b(lVar, gVar, obj, i10, str);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r13.v0(i5.h.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY) != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(w4.l r12, i5.g r13, m5.y r14, m5.v r15) throws java.io.IOException {
        /*
            r11 = this;
            m5.g$b[] r0 = r11.f10396b
            int r0 = r0.length
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = r2
        L_0x0007:
            if (r3 >= r0) goto L_0x00c5
            java.lang.String[] r4 = r11.f10398d
            r4 = r4[r3]
            m5.g$b[] r5 = r11.f10396b
            r5 = r5[r3]
            r6 = 1
            a6.b0[] r7 = r11.f10399e
            if (r4 != 0) goto L_0x003f
            r7 = r7[r3]
            if (r7 != 0) goto L_0x001c
            goto L_0x00c1
        L_0x001c:
            boolean r7 = r5.e()
            if (r7 != 0) goto L_0x003a
            i5.j r7 = r11.f10395a
            l5.v r8 = r5.b()
            java.lang.String r8 = r8.getName()
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r9 = r5.d()
            r6[r2] = r9
            java.lang.String r9 = "Missing external type id property '%s'"
            r13.S0(r7, r8, r9, r6)
            goto L_0x0073
        L_0x003a:
            java.lang.String r4 = r5.a()
            goto L_0x0073
        L_0x003f:
            r7 = r7[r3]
            if (r7 != 0) goto L_0x0073
            l5.v r7 = r5.b()
            boolean r8 = r7.m()
            if (r8 != 0) goto L_0x0055
            i5.h r8 = i5.h.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY
            boolean r8 = r13.v0(r8)
            if (r8 == 0) goto L_0x0073
        L_0x0055:
            i5.j r8 = r11.f10395a
            java.lang.String r9 = r7.getName()
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r7 = r7.getName()
            r10[r2] = r7
            m5.g$b[] r7 = r11.f10396b
            r7 = r7[r3]
            java.lang.String r7 = r7.d()
            r10[r6] = r7
            java.lang.String r6 = "Missing property '%s' for external type id '%s'"
            r13.S0(r8, r9, r6, r10)
        L_0x0073:
            a6.b0[] r6 = r11.f10399e
            r6 = r6[r3]
            if (r6 == 0) goto L_0x007f
            java.lang.Object r6 = r11.a(r12, r13, r3, r4)
            r1[r3] = r6
        L_0x007f:
            l5.v r6 = r5.b()
            int r7 = r6.x()
            if (r7 < 0) goto L_0x00c1
            r7 = r1[r3]
            r14.b(r6, r7)
            l5.v r5 = r5.c()
            if (r5 == 0) goto L_0x00c1
            int r6 = r5.x()
            if (r6 < 0) goto L_0x00c1
            i5.j r6 = r5.e()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = r6.j(r7)
            if (r6 == 0) goto L_0x00a7
            goto L_0x00be
        L_0x00a7:
            a6.b0 r6 = new a6.b0
            r6.<init>((w4.l) r12, (i5.g) r13)
            r6.Z2(r4)
            i5.k r4 = r5.E()
            w4.l r7 = r6.w3()
            java.lang.Object r4 = r4.f(r7, r13)
            r6.close()
        L_0x00be:
            r14.b(r5, r4)
        L_0x00c1:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x00c5:
            java.lang.Object r12 = r15.a(r13, r14)
        L_0x00c9:
            if (r2 >= r0) goto L_0x00e1
            m5.g$b[] r13 = r11.f10396b
            r13 = r13[r2]
            l5.v r13 = r13.b()
            int r14 = r13.x()
            if (r14 >= 0) goto L_0x00de
            r14 = r1[r2]
            r13.M(r12, r14)
        L_0x00de:
            int r2 = r2 + 1
            goto L_0x00c9
        L_0x00e1:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.g.f(w4.l, i5.g, m5.y, m5.v):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        if (r10.f10399e[r0] != null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00aa, code lost:
        if (r10.f10398d[r0] != null) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(w4.l r11, i5.g r12, java.lang.String r13, java.lang.Object r14) throws java.io.IOException {
        /*
            r10 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.f10397c
            java.lang.Object r0 = r0.get(r13)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            boolean r2 = r0 instanceof java.util.List
            r3 = 1
            if (r2 == 0) goto L_0x0073
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r14 = r0.iterator()
            java.lang.Object r0 = r14.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            m5.g$b[] r1 = r10.f10396b
            int r2 = r0.intValue()
            r1 = r1[r2]
            boolean r13 = r1.f(r13)
            if (r13 == 0) goto L_0x004d
            java.lang.String r12 = r11.Y1()
            r11.Z2()
            java.lang.String[] r11 = r10.f10398d
            int r13 = r0.intValue()
            r11[r13] = r12
        L_0x0038:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L_0x0072
            java.lang.String[] r11 = r10.f10398d
            java.lang.Object r13 = r14.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11[r13] = r12
            goto L_0x0038
        L_0x004d:
            a6.b0 r13 = new a6.b0
            r13.<init>((w4.l) r11, (i5.g) r12)
            r13.P(r11)
            a6.b0[] r11 = r10.f10399e
            int r12 = r0.intValue()
            r11[r12] = r13
        L_0x005d:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L_0x0072
            a6.b0[] r11 = r10.f10399e
            java.lang.Object r12 = r14.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11[r12] = r13
            goto L_0x005d
        L_0x0072:
            return r3
        L_0x0073:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            m5.g$b[] r2 = r10.f10396b
            r2 = r2[r0]
            boolean r13 = r2.f(r13)
            if (r13 == 0) goto L_0x0098
            java.lang.String[] r13 = r10.f10398d
            java.lang.String r2 = r11.Y1()
            r13[r0] = r2
            r11.Z2()
            if (r14 == 0) goto L_0x00ad
            a6.b0[] r13 = r10.f10399e
            r13 = r13[r0]
            if (r13 == 0) goto L_0x00ad
        L_0x0096:
            r1 = r3
            goto L_0x00ad
        L_0x0098:
            a6.b0 r13 = new a6.b0
            r13.<init>((w4.l) r11, (i5.g) r12)
            r13.P(r11)
            a6.b0[] r2 = r10.f10399e
            r2[r0] = r13
            if (r14 == 0) goto L_0x00ad
            java.lang.String[] r13 = r10.f10398d
            r13 = r13[r0]
            if (r13 == 0) goto L_0x00ad
            goto L_0x0096
        L_0x00ad:
            if (r1 == 0) goto L_0x00c2
            java.lang.String[] r13 = r10.f10398d
            r9 = r13[r0]
            r1 = 0
            r13[r0] = r1
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r14
            r8 = r0
            r4.b(r5, r6, r7, r8, r9)
            a6.b0[] r11 = r10.f10399e
            r11[r0] = r1
        L_0x00c2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.g.g(w4.l, i5.g, java.lang.String, java.lang.Object):boolean");
    }

    public boolean h(l lVar, i5.g gVar, String str, Object obj) throws IOException {
        Object obj2 = this.f10397c.get(str);
        boolean z10 = false;
        if (obj2 == null) {
            return false;
        }
        String Y1 = lVar.Y1();
        if (obj2 instanceof List) {
            for (Integer intValue : (List) obj2) {
                if (c(lVar, gVar, str, obj, Y1, intValue.intValue())) {
                    z10 = true;
                }
            }
            return z10;
        }
        return c(lVar, gVar, str, obj, Y1, ((Integer) obj2).intValue());
    }

    public g i() {
        return new g(this);
    }
}

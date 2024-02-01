package n5;

import a6.c;
import i5.d;
import i5.g;
import i5.h;
import i5.j;
import i5.k;
import i5.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l5.i;
import l5.s;
import l5.t;
import l5.w;
import l5.y;
import m5.v;
import m5.z;
import u5.f;
import v4.s;
import w4.l;

@j5.a
public class r extends g<Map<Object, Object>> implements i, t {

    /* renamed from: g0  reason: collision with root package name */
    public static final long f10861g0 = 1;
    public final p X;
    public boolean Y;
    public final k<Object> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final f f10862a0;

    /* renamed from: b0  reason: collision with root package name */
    public final y f10863b0;

    /* renamed from: c0  reason: collision with root package name */
    public k<Object> f10864c0;

    /* renamed from: d0  reason: collision with root package name */
    public v f10865d0;

    /* renamed from: e0  reason: collision with root package name */
    public final boolean f10866e0;

    /* renamed from: f0  reason: collision with root package name */
    public Set<String> f10867f0;

    public static class a extends z.a {

        /* renamed from: c  reason: collision with root package name */
        public final b f10868c;

        /* renamed from: d  reason: collision with root package name */
        public final Map<Object, Object> f10869d = new LinkedHashMap();

        /* renamed from: e  reason: collision with root package name */
        public final Object f10870e;

        public a(b bVar, w wVar, Class<?> cls, Object obj) {
            super(wVar, cls);
            this.f10868c = bVar;
            this.f10870e = obj;
        }

        public void c(Object obj, Object obj2) throws IOException {
            this.f10868c.c(obj, obj2);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Class<?> f10871a;

        /* renamed from: b  reason: collision with root package name */
        public Map<Object, Object> f10872b;

        /* renamed from: c  reason: collision with root package name */
        public List<a> f10873c = new ArrayList();

        public b(Class<?> cls, Map<Object, Object> map) {
            this.f10871a = cls;
            this.f10872b = map;
        }

        public z.a a(w wVar, Object obj) {
            a aVar = new a(this, wVar, this.f10871a, obj);
            this.f10873c.add(aVar);
            return aVar;
        }

        public void b(Object obj, Object obj2) {
            Map<Object, Object> map;
            if (this.f10873c.isEmpty()) {
                map = this.f10872b;
            } else {
                List<a> list = this.f10873c;
                map = list.get(list.size() - 1).f10869d;
            }
            map.put(obj, obj2);
        }

        public void c(Object obj, Object obj2) throws IOException {
            Iterator<a> it = this.f10873c.iterator();
            Map<Object, Object> map = this.f10872b;
            while (it.hasNext()) {
                a next = it.next();
                if (next.d(obj)) {
                    it.remove();
                    map.put(next.f10870e, obj2);
                    map.putAll(next.f10869d);
                    return;
                }
                map = next.f10869d;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public r(j jVar, y yVar, p pVar, k<Object> kVar, f fVar) {
        super(jVar, (s) null, (Boolean) null);
        this.X = pVar;
        this.Z = kVar;
        this.f10862a0 = fVar;
        this.f10863b0 = yVar;
        this.f10866e0 = yVar.i();
        this.f10864c0 = null;
        this.f10865d0 = null;
        this.Y = I0(jVar, pVar);
    }

    public r(r rVar) {
        super((g<?>) rVar);
        this.X = rVar.X;
        this.Z = rVar.Z;
        this.f10862a0 = rVar.f10862a0;
        this.f10863b0 = rVar.f10863b0;
        this.f10865d0 = rVar.f10865d0;
        this.f10864c0 = rVar.f10864c0;
        this.f10866e0 = rVar.f10866e0;
        this.f10867f0 = rVar.f10867f0;
        this.Y = rVar.Y;
    }

    public r(r rVar, p pVar, k<Object> kVar, f fVar, s sVar, Set<String> set) {
        super((g<?>) rVar, sVar, rVar.W);
        this.X = pVar;
        this.Z = kVar;
        this.f10862a0 = fVar;
        this.f10863b0 = rVar.f10863b0;
        this.f10865d0 = rVar.f10865d0;
        this.f10864c0 = rVar.f10864c0;
        this.f10866e0 = rVar.f10866e0;
        this.f10867f0 = set;
        this.Y = I0(this.T, pVar);
    }

    public k<Object> E0() {
        return this.Z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093 A[SYNTHETIC, Splitter:B:40:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.Object, java.lang.Object> H0(w4.l r10, i5.g r11) throws java.io.IOException {
        /*
            r9 = this;
            m5.v r0 = r9.f10865d0
            r1 = 0
            m5.y r2 = r0.h(r10, r11, r1)
            i5.k<java.lang.Object> r3 = r9.Z
            u5.f r4 = r9.f10862a0
            boolean r5 = r10.v2()
            if (r5 == 0) goto L_0x0016
        L_0x0011:
            java.lang.String r5 = r10.y2()
            goto L_0x0024
        L_0x0016:
            w4.p r5 = w4.p.FIELD_NAME
            boolean r5 = r10.q2(r5)
            if (r5 == 0) goto L_0x0023
            java.lang.String r5 = r10.X0()
            goto L_0x0024
        L_0x0023:
            r5 = r1
        L_0x0024:
            if (r5 == 0) goto L_0x0093
            w4.p r6 = r10.D2()
            java.util.Set<java.lang.String> r7 = r9.f10867f0
            if (r7 == 0) goto L_0x0038
            boolean r7 = r7.contains(r5)
            if (r7 == 0) goto L_0x0038
            r10.Z2()
            goto L_0x0011
        L_0x0038:
            l5.v r7 = r0.f(r5)
            if (r7 == 0) goto L_0x0063
            java.lang.Object r6 = r7.s(r10, r11)
            boolean r6 = r2.b(r7, r6)
            if (r6 == 0) goto L_0x0011
            r10.D2()
            java.lang.Object r0 = r0.a(r11, r2)     // Catch:{ Exception -> 0x0055 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x0055 }
            r9.J0(r10, r11, r0)
            return r0
        L_0x0055:
            r10 = move-exception
            i5.j r11 = r9.T
            java.lang.Class r11 = r11.g()
            java.lang.Object r10 = r9.G0(r10, r11, r5)
            java.util.Map r10 = (java.util.Map) r10
            return r10
        L_0x0063:
            i5.p r7 = r9.X
            java.lang.Object r7 = r7.a(r5, r11)
            w4.p r8 = w4.p.VALUE_NULL     // Catch:{ Exception -> 0x0088 }
            if (r6 != r8) goto L_0x0079
            boolean r6 = r9.V     // Catch:{ Exception -> 0x0088 }
            if (r6 == 0) goto L_0x0072
            goto L_0x0011
        L_0x0072:
            l5.s r6 = r9.U     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r5 = r6.d(r11)     // Catch:{ Exception -> 0x0088 }
            goto L_0x0084
        L_0x0079:
            if (r4 != 0) goto L_0x0080
            java.lang.Object r5 = r3.f(r10, r11)     // Catch:{ Exception -> 0x0088 }
            goto L_0x0084
        L_0x0080:
            java.lang.Object r5 = r3.h(r10, r11, r4)     // Catch:{ Exception -> 0x0088 }
        L_0x0084:
            r2.d(r7, r5)
            goto L_0x0011
        L_0x0088:
            r10 = move-exception
            i5.j r11 = r9.T
            java.lang.Class r11 = r11.g()
            r9.G0(r10, r11, r5)
            return r1
        L_0x0093:
            java.lang.Object r10 = r0.a(r11, r2)     // Catch:{ Exception -> 0x0088 }
            java.util.Map r10 = (java.util.Map) r10     // Catch:{ Exception -> 0x0088 }
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.r.H0(w4.l, i5.g):java.util.Map");
    }

    public final boolean I0(j jVar, p pVar) {
        j O;
        if (pVar == null || (O = jVar.e()) == null) {
            return true;
        }
        Class<?> g10 = O.g();
        return (g10 == String.class || g10 == Object.class) && C0(pVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:19|(4:24|25|(1:(1:32)(1:33))(3:27|(1:29)|30)|(1:35)(1:36))(1:23)|21|24|25|(0)(0)|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0082, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        G0(r5, r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0087, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0088, code lost:
        Q0(r12, r6, r5, r4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A[Catch:{ w -> 0x0087, Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d A[Catch:{ w -> 0x0087, Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a A[Catch:{ w -> 0x0087, Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e A[Catch:{ w -> 0x0087, Exception -> 0x0082 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J0(w4.l r11, i5.g r12, java.util.Map<java.lang.Object, java.lang.Object> r13) throws java.io.IOException {
        /*
            r10 = this;
            i5.p r0 = r10.X
            i5.k<java.lang.Object> r1 = r10.Z
            u5.f r2 = r10.f10862a0
            m5.s r3 = r1.q()
            r4 = 0
            if (r3 == 0) goto L_0x000f
            r3 = 1
            goto L_0x0010
        L_0x000f:
            r3 = r4
        L_0x0010:
            r5 = 0
            if (r3 == 0) goto L_0x0023
            n5.r$b r6 = new n5.r$b
            i5.j r7 = r10.T
            i5.j r7 = r7.d()
            java.lang.Class r7 = r7.g()
            r6.<init>(r7, r13)
            goto L_0x0024
        L_0x0023:
            r6 = r5
        L_0x0024:
            boolean r7 = r11.v2()
            if (r7 == 0) goto L_0x002f
        L_0x002a:
            java.lang.String r4 = r11.y2()
            goto L_0x0045
        L_0x002f:
            w4.p r7 = r11.Z0()
            w4.p r8 = w4.p.FIELD_NAME
            if (r7 == r8) goto L_0x0041
            w4.p r9 = w4.p.END_OBJECT
            if (r7 != r9) goto L_0x003c
            return
        L_0x003c:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r12.Y0(r10, r8, r5, r4)
        L_0x0041:
            java.lang.String r4 = r11.X0()
        L_0x0045:
            if (r4 == 0) goto L_0x008c
            java.lang.Object r5 = r0.a(r4, r12)
            w4.p r7 = r11.D2()
            java.util.Set<java.lang.String> r8 = r10.f10867f0
            if (r8 == 0) goto L_0x005d
            boolean r8 = r8.contains(r4)
            if (r8 == 0) goto L_0x005d
            r11.Z2()
            goto L_0x002a
        L_0x005d:
            w4.p r8 = w4.p.VALUE_NULL     // Catch:{ w -> 0x0087, Exception -> 0x0082 }
            if (r7 != r8) goto L_0x006d
            boolean r7 = r10.V     // Catch:{ w -> 0x0087, Exception -> 0x0082 }
            if (r7 == 0) goto L_0x0066
            goto L_0x002a
        L_0x0066:
            l5.s r7 = r10.U     // Catch:{ w -> 0x0087, Exception -> 0x0082 }
            java.lang.Object r7 = r7.d(r12)     // Catch:{ w -> 0x0087, Exception -> 0x0082 }
            goto L_0x0078
        L_0x006d:
            if (r2 != 0) goto L_0x0074
            java.lang.Object r7 = r1.f(r11, r12)     // Catch:{ w -> 0x0087, Exception -> 0x0082 }
            goto L_0x0078
        L_0x0074:
            java.lang.Object r7 = r1.h(r11, r12, r2)     // Catch:{ w -> 0x0087, Exception -> 0x0082 }
        L_0x0078:
            if (r3 == 0) goto L_0x007e
            r6.b(r5, r7)     // Catch:{ w -> 0x0087, Exception -> 0x0082 }
            goto L_0x002a
        L_0x007e:
            r13.put(r5, r7)     // Catch:{ w -> 0x0087, Exception -> 0x0082 }
            goto L_0x002a
        L_0x0082:
            r5 = move-exception
            r10.G0(r5, r13, r4)
            goto L_0x002a
        L_0x0087:
            r4 = move-exception
            r10.Q0(r12, r6, r5, r4)
            goto L_0x002a
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.r.J0(w4.l, i5.g, java.util.Map):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:19|(4:24|25|(1:(1:32)(1:33))(3:27|(1:29)|30)|(1:35)(1:36))(1:23)|21|24|25|(0)(0)|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        G0(r4, r11, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0081, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0082, code lost:
        Q0(r10, r5, r3, r4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[Catch:{ w -> 0x0081, Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0067 A[Catch:{ w -> 0x0081, Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074 A[Catch:{ w -> 0x0081, Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0078 A[Catch:{ w -> 0x0081, Exception -> 0x007c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K0(w4.l r9, i5.g r10, java.util.Map<java.lang.Object, java.lang.Object> r11) throws java.io.IOException {
        /*
            r8 = this;
            i5.k<java.lang.Object> r0 = r8.Z
            u5.f r1 = r8.f10862a0
            m5.s r2 = r0.q()
            r3 = 0
            if (r2 == 0) goto L_0x000d
            r2 = 1
            goto L_0x000e
        L_0x000d:
            r2 = r3
        L_0x000e:
            r4 = 0
            if (r2 == 0) goto L_0x0021
            n5.r$b r5 = new n5.r$b
            i5.j r6 = r8.T
            i5.j r6 = r6.d()
            java.lang.Class r6 = r6.g()
            r5.<init>(r6, r11)
            goto L_0x0022
        L_0x0021:
            r5 = r4
        L_0x0022:
            boolean r6 = r9.v2()
            if (r6 == 0) goto L_0x002d
        L_0x0028:
            java.lang.String r3 = r9.y2()
            goto L_0x0043
        L_0x002d:
            w4.p r6 = r9.Z0()
            w4.p r7 = w4.p.END_OBJECT
            if (r6 != r7) goto L_0x0036
            return
        L_0x0036:
            w4.p r7 = w4.p.FIELD_NAME
            if (r6 == r7) goto L_0x003f
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r10.Y0(r8, r7, r4, r3)
        L_0x003f:
            java.lang.String r3 = r9.X0()
        L_0x0043:
            if (r3 == 0) goto L_0x0086
            w4.p r4 = r9.D2()
            java.util.Set<java.lang.String> r6 = r8.f10867f0
            if (r6 == 0) goto L_0x0057
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L_0x0057
            r9.Z2()
            goto L_0x0028
        L_0x0057:
            w4.p r6 = w4.p.VALUE_NULL     // Catch:{ w -> 0x0081, Exception -> 0x007c }
            if (r4 != r6) goto L_0x0067
            boolean r4 = r8.V     // Catch:{ w -> 0x0081, Exception -> 0x007c }
            if (r4 == 0) goto L_0x0060
            goto L_0x0028
        L_0x0060:
            l5.s r4 = r8.U     // Catch:{ w -> 0x0081, Exception -> 0x007c }
            java.lang.Object r4 = r4.d(r10)     // Catch:{ w -> 0x0081, Exception -> 0x007c }
            goto L_0x0072
        L_0x0067:
            if (r1 != 0) goto L_0x006e
            java.lang.Object r4 = r0.f(r9, r10)     // Catch:{ w -> 0x0081, Exception -> 0x007c }
            goto L_0x0072
        L_0x006e:
            java.lang.Object r4 = r0.h(r9, r10, r1)     // Catch:{ w -> 0x0081, Exception -> 0x007c }
        L_0x0072:
            if (r2 == 0) goto L_0x0078
            r5.b(r3, r4)     // Catch:{ w -> 0x0081, Exception -> 0x007c }
            goto L_0x0028
        L_0x0078:
            r11.put(r3, r4)     // Catch:{ w -> 0x0081, Exception -> 0x007c }
            goto L_0x0028
        L_0x007c:
            r4 = move-exception
            r8.G0(r4, r11, r3)
            goto L_0x0028
        L_0x0081:
            r4 = move-exception
            r8.Q0(r10, r5, r3, r4)
            goto L_0x0028
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.r.K0(w4.l, i5.g, java.util.Map):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:11|(3:16|17|(3:23|(1:(1:29)(1:30))(1:(1:26)(1:27))|(1:32))(2:19|(1:21)(1:22)))(1:15)|13|16|17|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        G0(r4, r10, r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045 A[Catch:{ Exception -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054 A[Catch:{ Exception -> 0x0077 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L0(w4.l r8, i5.g r9, java.util.Map<java.lang.Object, java.lang.Object> r10) throws java.io.IOException {
        /*
            r7 = this;
            i5.p r0 = r7.X
            i5.k<java.lang.Object> r1 = r7.Z
            u5.f r2 = r7.f10862a0
            boolean r3 = r8.v2()
            if (r3 == 0) goto L_0x0011
        L_0x000c:
            java.lang.String r3 = r8.y2()
            goto L_0x0029
        L_0x0011:
            w4.p r3 = r8.Z0()
            w4.p r4 = w4.p.END_OBJECT
            if (r3 != r4) goto L_0x001a
            return
        L_0x001a:
            w4.p r4 = w4.p.FIELD_NAME
            if (r3 == r4) goto L_0x0025
            r3 = 0
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r9.Y0(r7, r4, r3, r5)
        L_0x0025:
            java.lang.String r3 = r8.X0()
        L_0x0029:
            if (r3 == 0) goto L_0x007c
            java.lang.Object r4 = r0.a(r3, r9)
            w4.p r5 = r8.D2()
            java.util.Set<java.lang.String> r6 = r7.f10867f0
            if (r6 == 0) goto L_0x0041
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L_0x0041
            r8.Z2()
            goto L_0x000c
        L_0x0041:
            w4.p r6 = w4.p.VALUE_NULL     // Catch:{ Exception -> 0x0077 }
            if (r5 != r6) goto L_0x0054
            boolean r5 = r7.V     // Catch:{ Exception -> 0x0077 }
            if (r5 == 0) goto L_0x004a
            goto L_0x000c
        L_0x004a:
            l5.s r5 = r7.U     // Catch:{ Exception -> 0x0077 }
            java.lang.Object r5 = r5.d(r9)     // Catch:{ Exception -> 0x0077 }
            r10.put(r4, r5)     // Catch:{ Exception -> 0x0077 }
            goto L_0x000c
        L_0x0054:
            java.lang.Object r5 = r10.get(r4)     // Catch:{ Exception -> 0x0077 }
            if (r5 == 0) goto L_0x0066
            if (r2 != 0) goto L_0x0061
            java.lang.Object r6 = r1.g(r8, r9, r5)     // Catch:{ Exception -> 0x0077 }
            goto L_0x0071
        L_0x0061:
            java.lang.Object r6 = r1.i(r8, r9, r2, r5)     // Catch:{ Exception -> 0x0077 }
            goto L_0x0071
        L_0x0066:
            if (r2 != 0) goto L_0x006d
            java.lang.Object r6 = r1.f(r8, r9)     // Catch:{ Exception -> 0x0077 }
            goto L_0x0071
        L_0x006d:
            java.lang.Object r6 = r1.h(r8, r9, r2)     // Catch:{ Exception -> 0x0077 }
        L_0x0071:
            if (r6 == r5) goto L_0x000c
            r10.put(r4, r6)     // Catch:{ Exception -> 0x0077 }
            goto L_0x000c
        L_0x0077:
            r4 = move-exception
            r7.G0(r4, r10, r3)
            goto L_0x000c
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.r.L0(w4.l, i5.g, java.util.Map):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:11|(3:16|17|(3:23|(1:(1:29)(1:30))(1:(1:26)(1:27))|(1:32))(2:19|(1:21)(1:22)))(1:15)|13|16|17|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0071, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        G0(r3, r8, r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[Catch:{ Exception -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e A[Catch:{ Exception -> 0x0071 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void M0(w4.l r6, i5.g r7, java.util.Map<java.lang.Object, java.lang.Object> r8) throws java.io.IOException {
        /*
            r5 = this;
            i5.k<java.lang.Object> r0 = r5.Z
            u5.f r1 = r5.f10862a0
            boolean r2 = r6.v2()
            if (r2 == 0) goto L_0x000f
        L_0x000a:
            java.lang.String r2 = r6.y2()
            goto L_0x0027
        L_0x000f:
            w4.p r2 = r6.Z0()
            w4.p r3 = w4.p.END_OBJECT
            if (r2 != r3) goto L_0x0018
            return
        L_0x0018:
            w4.p r3 = w4.p.FIELD_NAME
            if (r2 == r3) goto L_0x0023
            r2 = 0
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r7.Y0(r5, r3, r2, r4)
        L_0x0023:
            java.lang.String r2 = r6.X0()
        L_0x0027:
            if (r2 == 0) goto L_0x0076
            w4.p r3 = r6.D2()
            java.util.Set<java.lang.String> r4 = r5.f10867f0
            if (r4 == 0) goto L_0x003b
            boolean r4 = r4.contains(r2)
            if (r4 == 0) goto L_0x003b
            r6.Z2()
            goto L_0x000a
        L_0x003b:
            w4.p r4 = w4.p.VALUE_NULL     // Catch:{ Exception -> 0x0071 }
            if (r3 != r4) goto L_0x004e
            boolean r3 = r5.V     // Catch:{ Exception -> 0x0071 }
            if (r3 == 0) goto L_0x0044
            goto L_0x000a
        L_0x0044:
            l5.s r3 = r5.U     // Catch:{ Exception -> 0x0071 }
            java.lang.Object r3 = r3.d(r7)     // Catch:{ Exception -> 0x0071 }
            r8.put(r2, r3)     // Catch:{ Exception -> 0x0071 }
            goto L_0x000a
        L_0x004e:
            java.lang.Object r3 = r8.get(r2)     // Catch:{ Exception -> 0x0071 }
            if (r3 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x005b
            java.lang.Object r4 = r0.g(r6, r7, r3)     // Catch:{ Exception -> 0x0071 }
            goto L_0x006b
        L_0x005b:
            java.lang.Object r4 = r0.i(r6, r7, r1, r3)     // Catch:{ Exception -> 0x0071 }
            goto L_0x006b
        L_0x0060:
            if (r1 != 0) goto L_0x0067
            java.lang.Object r4 = r0.f(r6, r7)     // Catch:{ Exception -> 0x0071 }
            goto L_0x006b
        L_0x0067:
            java.lang.Object r4 = r0.h(r6, r7, r1)     // Catch:{ Exception -> 0x0071 }
        L_0x006b:
            if (r4 == r3) goto L_0x000a
            r8.put(r2, r4)     // Catch:{ Exception -> 0x0071 }
            goto L_0x000a
        L_0x0071:
            r3 = move-exception
            r5.G0(r3, r8, r2)
            goto L_0x000a
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.r.M0(w4.l, i5.g, java.util.Map):void");
    }

    /* renamed from: N0 */
    public Map<Object, Object> f(l lVar, g gVar) throws IOException {
        Object h02;
        if (this.f10865d0 != null) {
            return H0(lVar, gVar);
        }
        k<Object> kVar = this.f10864c0;
        if (kVar != null) {
            h02 = this.f10863b0.u(gVar, kVar.f(lVar, gVar));
        } else if (!this.f10866e0) {
            h02 = gVar.c0(P0(), e(), lVar, "no default constructor found", new Object[0]);
        } else {
            w4.p Z0 = lVar.Z0();
            if (Z0 == w4.p.START_OBJECT || Z0 == w4.p.FIELD_NAME || Z0 == w4.p.END_OBJECT) {
                Map<Object, Object> map = (Map) this.f10863b0.t(gVar);
                if (this.Y) {
                    K0(lVar, gVar, map);
                    return map;
                }
                J0(lVar, gVar, map);
                return map;
            } else if (Z0 == w4.p.VALUE_STRING) {
                h02 = this.f10863b0.r(gVar, lVar.Y1());
            } else {
                if (Z0 == w4.p.START_ARRAY) {
                    w4.p D2 = lVar.D2();
                    w4.p pVar = w4.p.END_ARRAY;
                    if (D2 == pVar) {
                        if (gVar.v0(h.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                            return null;
                        }
                    } else if (gVar.v0(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                        Map<Object, Object> N0 = f(lVar, gVar);
                        if (lVar.D2() != pVar) {
                            z0(lVar, gVar);
                        }
                        return N0;
                    }
                }
                h02 = gVar.h0(y0(gVar), Z0, lVar, (String) null, new Object[0]);
            }
        }
        return (Map) h02;
    }

    /* renamed from: O0 */
    public Map<Object, Object> g(l lVar, g gVar, Map<Object, Object> map) throws IOException {
        lVar.T2(map);
        w4.p Z0 = lVar.Z0();
        if (Z0 != w4.p.START_OBJECT && Z0 != w4.p.FIELD_NAME) {
            return (Map) gVar.i0(P0(), lVar);
        }
        if (this.Y) {
            M0(lVar, gVar, map);
            return map;
        }
        L0(lVar, gVar, map);
        return map;
    }

    public final Class<?> P0() {
        return this.T.g();
    }

    public final void Q0(g gVar, b bVar, Object obj, w wVar) throws i5.l {
        if (bVar == null) {
            gVar.O0(this, "Unresolved forward reference but no identity info: " + wVar, new Object[0]);
        }
        wVar.A().a(bVar.a(wVar, obj));
    }

    public void R0(Set<String> set) {
        if (set == null || set.size() == 0) {
            set = null;
        }
        this.f10867f0 = set;
    }

    public void S0(String[] strArr) {
        this.f10867f0 = (strArr == null || strArr.length == 0) ? null : c.a(strArr);
    }

    public r T0(p pVar, f fVar, k<?> kVar, s sVar, Set<String> set) {
        return (this.X == pVar && this.Z == kVar && this.f10862a0 == fVar && this.U == sVar && this.f10867f0 == set) ? this : new r(this, pVar, kVar, fVar, sVar, set);
    }

    public k<?> a(g gVar, d dVar) throws i5.l {
        q5.h i10;
        s.a U;
        p pVar = this.X;
        if (pVar == null) {
            pVar = gVar.N(this.T.e(), dVar);
        } else if (pVar instanceof l5.j) {
            pVar = ((l5.j) pVar).a(gVar, dVar);
        }
        p pVar2 = pVar;
        k kVar = this.Z;
        if (dVar != null) {
            kVar = r0(gVar, dVar, kVar);
        }
        j G = this.T.d();
        k L = kVar == null ? gVar.L(G, dVar) : gVar.f0(kVar, dVar, G);
        f fVar = this.f10862a0;
        if (fVar != null) {
            fVar = fVar.g(dVar);
        }
        f fVar2 = fVar;
        Set<String> set = this.f10867f0;
        i5.b o10 = gVar.o();
        if (!(!a0.O(o10, dVar) || (i10 = dVar.i()) == null || (U = o10.U(i10)) == null)) {
            Set<String> h10 = U.h();
            if (!h10.isEmpty()) {
                set = set == null ? new HashSet<>() : new HashSet<>(set);
                for (String add : h10) {
                    set.add(add);
                }
            }
        }
        return T0(pVar2, fVar2, L, p0(gVar, dVar, L), set);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(i5.g r7) throws i5.l {
        /*
            r6 = this;
            l5.y r0 = r6.f10863b0
            boolean r0 = r0.j()
            r1 = 1
            r2 = 0
            r3 = 2
            r4 = 0
            if (r0 == 0) goto L_0x003a
            l5.y r0 = r6.f10863b0
            i5.f r5 = r7.q()
            i5.j r0 = r0.z(r5)
            if (r0 != 0) goto L_0x0033
            i5.j r5 = r6.T
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r5
            l5.y r2 = r6.f10863b0
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r3[r1] = r2
            java.lang.String r1 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"
            java.lang.String r1 = java.lang.String.format(r1, r3)
        L_0x0030:
            r7.z(r5, r1)
        L_0x0033:
            i5.k r0 = r6.s0(r7, r0, r4)
            r6.f10864c0 = r0
            goto L_0x0067
        L_0x003a:
            l5.y r0 = r6.f10863b0
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0067
            l5.y r0 = r6.f10863b0
            i5.f r5 = r7.q()
            i5.j r0 = r0.w(r5)
            if (r0 != 0) goto L_0x0033
            i5.j r5 = r6.T
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r5
            l5.y r2 = r6.f10863b0
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r3[r1] = r2
            java.lang.String r1 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            goto L_0x0030
        L_0x0067:
            l5.y r0 = r6.f10863b0
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0087
            l5.y r0 = r6.f10863b0
            i5.f r1 = r7.q()
            l5.v[] r0 = r0.A(r1)
            l5.y r1 = r6.f10863b0
            i5.q r2 = i5.q.ACCEPT_CASE_INSENSITIVE_PROPERTIES
            boolean r2 = r7.w(r2)
            m5.v r7 = m5.v.d(r7, r1, r0, r2)
            r6.f10865d0 = r7
        L_0x0087:
            i5.j r7 = r6.T
            i5.p r0 = r6.X
            boolean r7 = r6.I0(r7, r0)
            r6.Y = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.r.b(i5.g):void");
    }

    public y e() {
        return this.f10863b0;
    }

    public Object h(l lVar, g gVar, f fVar) throws IOException {
        return fVar.e(lVar, gVar);
    }

    public boolean s() {
        return this.Z == null && this.X == null && this.f10862a0 == null && this.f10867f0 == null;
    }

    public j x0() {
        return this.T;
    }
}

package a0;

import a0.f;
import a0.p;
import java.util.List;
import z.d;
import z.e;
import z.i;

public class l extends p {

    /* renamed from: k  reason: collision with root package name */
    public static int[] f56k = new int[2];

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f57a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                a0.p$b[] r0 = a0.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57a = r0
                a0.p$b r1 = a0.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f57a     // Catch:{ NoSuchFieldError -> 0x001d }
                a0.p$b r1 = a0.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f57a     // Catch:{ NoSuchFieldError -> 0x0028 }
                a0.p$b r1 = a0.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a0.l.a.<clinit>():void");
        }
    }

    public l(e eVar) {
        super(eVar);
        this.f95h.f42e = f.a.LEFT;
        this.f96i.f42e = f.a.RIGHT;
        this.f93f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0292, code lost:
        if (r14 != 1) goto L_0x02e7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(a0.d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = a0.l.a.f57a
            a0.p$b r1 = r8.f97j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            z.e r0 = r8.f89b
            z.d r1 = r0.J
            z.d r0 = r0.L
            r3 = r17
            r8.q(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.r(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.s(r17)
        L_0x002e:
            a0.g r0 = r8.f92e
            boolean r0 = r0.f47j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x02e7
            z.e$b r0 = r8.f91d
            z.e$b r3 = z.e.b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x02e7
            z.e r0 = r8.f89b
            int r3 = r0.f15672p
            if (r3 == r1) goto L_0x02ca
            if (r3 == r2) goto L_0x0046
            goto L_0x02e7
        L_0x0046:
            int r1 = r0.f15674q
            r3 = -1
            if (r1 == 0) goto L_0x007c
            if (r1 != r2) goto L_0x004e
            goto L_0x007c
        L_0x004e:
            int r0 = r0.B()
            if (r0 == r3) goto L_0x006a
            if (r0 == 0) goto L_0x005b
            if (r0 == r9) goto L_0x006a
            r0 = r10
            goto L_0x02e2
        L_0x005b:
            z.e r0 = r8.f89b
            a0.n r1 = r0.f15652f
            a0.g r1 = r1.f92e
            int r1 = r1.f44g
            float r1 = (float) r1
            float r0 = r0.A()
            float r1 = r1 / r0
            goto L_0x0078
        L_0x006a:
            z.e r0 = r8.f89b
            a0.n r1 = r0.f15652f
            a0.g r1 = r1.f92e
            int r1 = r1.f44g
            float r1 = (float) r1
            float r0 = r0.A()
            float r1 = r1 * r0
        L_0x0078:
            float r1 = r1 + r11
            int r0 = (int) r1
            goto L_0x02e2
        L_0x007c:
            a0.n r1 = r0.f15652f
            a0.f r12 = r1.f95h
            a0.f r13 = r1.f96i
            z.d r1 = r0.J
            z.d r1 = r1.f15623f
            if (r1 == 0) goto L_0x008a
            r1 = r9
            goto L_0x008b
        L_0x008a:
            r1 = r10
        L_0x008b:
            z.d r2 = r0.K
            z.d r2 = r2.f15623f
            if (r2 == 0) goto L_0x0093
            r2 = r9
            goto L_0x0094
        L_0x0093:
            r2 = r10
        L_0x0094:
            z.d r4 = r0.L
            z.d r4 = r4.f15623f
            if (r4 == 0) goto L_0x009c
            r4 = r9
            goto L_0x009d
        L_0x009c:
            r4 = r10
        L_0x009d:
            z.d r5 = r0.M
            z.d r5 = r5.f15623f
            if (r5 == 0) goto L_0x00a5
            r5 = r9
            goto L_0x00a6
        L_0x00a5:
            r5 = r10
        L_0x00a6:
            int r14 = r0.B()
            if (r1 == 0) goto L_0x01ea
            if (r2 == 0) goto L_0x01ea
            if (r4 == 0) goto L_0x01ea
            if (r5 == 0) goto L_0x01ea
            z.e r0 = r8.f89b
            float r15 = r0.A()
            boolean r0 = r12.f47j
            if (r0 == 0) goto L_0x011b
            boolean r0 = r13.f47j
            if (r0 == 0) goto L_0x011b
            a0.f r0 = r8.f95h
            boolean r1 = r0.f40c
            if (r1 == 0) goto L_0x011a
            a0.f r1 = r8.f96i
            boolean r1 = r1.f40c
            if (r1 != 0) goto L_0x00cd
            goto L_0x011a
        L_0x00cd:
            java.util.List<a0.f> r0 = r0.f49l
            java.lang.Object r0 = r0.get(r10)
            a0.f r0 = (a0.f) r0
            int r0 = r0.f44g
            a0.f r1 = r8.f95h
            int r1 = r1.f43f
            int r2 = r0 + r1
            a0.f r0 = r8.f96i
            java.util.List<a0.f> r0 = r0.f49l
            java.lang.Object r0 = r0.get(r10)
            a0.f r0 = (a0.f) r0
            int r0 = r0.f44g
            a0.f r1 = r8.f96i
            int r1 = r1.f43f
            int r3 = r0 - r1
            int r0 = r12.f44g
            int r1 = r12.f43f
            int r4 = r0 + r1
            int r0 = r13.f44g
            int r1 = r13.f43f
            int r5 = r0 - r1
            int[] r1 = f56k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.u(r1, r2, r3, r4, r5, r6, r7)
            a0.g r0 = r8.f92e
            int[] r1 = f56k
            r1 = r1[r10]
            r0.e(r1)
            z.e r0 = r8.f89b
            a0.n r0 = r0.f15652f
            a0.g r0 = r0.f92e
            int[] r1 = f56k
            r1 = r1[r9]
            r0.e(r1)
        L_0x011a:
            return
        L_0x011b:
            a0.f r0 = r8.f95h
            boolean r1 = r0.f47j
            if (r1 == 0) goto L_0x0178
            a0.f r1 = r8.f96i
            boolean r2 = r1.f47j
            if (r2 == 0) goto L_0x0178
            boolean r2 = r12.f40c
            if (r2 == 0) goto L_0x0177
            boolean r2 = r13.f40c
            if (r2 != 0) goto L_0x0130
            goto L_0x0177
        L_0x0130:
            int r2 = r0.f44g
            int r0 = r0.f43f
            int r2 = r2 + r0
            int r0 = r1.f44g
            int r1 = r1.f43f
            int r3 = r0 - r1
            java.util.List<a0.f> r0 = r12.f49l
            java.lang.Object r0 = r0.get(r10)
            a0.f r0 = (a0.f) r0
            int r0 = r0.f44g
            int r1 = r12.f43f
            int r4 = r0 + r1
            java.util.List<a0.f> r0 = r13.f49l
            java.lang.Object r0 = r0.get(r10)
            a0.f r0 = (a0.f) r0
            int r0 = r0.f44g
            int r1 = r13.f43f
            int r5 = r0 - r1
            int[] r1 = f56k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.u(r1, r2, r3, r4, r5, r6, r7)
            a0.g r0 = r8.f92e
            int[] r1 = f56k
            r1 = r1[r10]
            r0.e(r1)
            z.e r0 = r8.f89b
            a0.n r0 = r0.f15652f
            a0.g r0 = r0.f92e
            int[] r1 = f56k
            r1 = r1[r9]
            r0.e(r1)
            goto L_0x0178
        L_0x0177:
            return
        L_0x0178:
            a0.f r0 = r8.f95h
            boolean r1 = r0.f40c
            if (r1 == 0) goto L_0x01e9
            a0.f r1 = r8.f96i
            boolean r1 = r1.f40c
            if (r1 == 0) goto L_0x01e9
            boolean r1 = r12.f40c
            if (r1 == 0) goto L_0x01e9
            boolean r1 = r13.f40c
            if (r1 != 0) goto L_0x018d
            goto L_0x01e9
        L_0x018d:
            java.util.List<a0.f> r0 = r0.f49l
            java.lang.Object r0 = r0.get(r10)
            a0.f r0 = (a0.f) r0
            int r0 = r0.f44g
            a0.f r1 = r8.f95h
            int r1 = r1.f43f
            int r2 = r0 + r1
            a0.f r0 = r8.f96i
            java.util.List<a0.f> r0 = r0.f49l
            java.lang.Object r0 = r0.get(r10)
            a0.f r0 = (a0.f) r0
            int r0 = r0.f44g
            a0.f r1 = r8.f96i
            int r1 = r1.f43f
            int r3 = r0 - r1
            java.util.List<a0.f> r0 = r12.f49l
            java.lang.Object r0 = r0.get(r10)
            a0.f r0 = (a0.f) r0
            int r0 = r0.f44g
            int r1 = r12.f43f
            int r4 = r0 + r1
            java.util.List<a0.f> r0 = r13.f49l
            java.lang.Object r0 = r0.get(r10)
            a0.f r0 = (a0.f) r0
            int r0 = r0.f44g
            int r1 = r13.f43f
            int r5 = r0 - r1
            int[] r1 = f56k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.u(r1, r2, r3, r4, r5, r6, r7)
            a0.g r0 = r8.f92e
            int[] r1 = f56k
            r1 = r1[r10]
            r0.e(r1)
            z.e r0 = r8.f89b
            a0.n r0 = r0.f15652f
            a0.g r0 = r0.f92e
            int[] r1 = f56k
            r1 = r1[r9]
            goto L_0x02c5
        L_0x01e9:
            return
        L_0x01ea:
            if (r1 == 0) goto L_0x0261
            if (r4 == 0) goto L_0x0261
            a0.f r0 = r8.f95h
            boolean r0 = r0.f40c
            if (r0 == 0) goto L_0x0260
            a0.f r0 = r8.f96i
            boolean r0 = r0.f40c
            if (r0 != 0) goto L_0x01fb
            goto L_0x0260
        L_0x01fb:
            z.e r0 = r8.f89b
            float r0 = r0.A()
            a0.f r1 = r8.f95h
            java.util.List<a0.f> r1 = r1.f49l
            java.lang.Object r1 = r1.get(r10)
            a0.f r1 = (a0.f) r1
            int r1 = r1.f44g
            a0.f r2 = r8.f95h
            int r2 = r2.f43f
            int r1 = r1 + r2
            a0.f r2 = r8.f96i
            java.util.List<a0.f> r2 = r2.f49l
            java.lang.Object r2 = r2.get(r10)
            a0.f r2 = (a0.f) r2
            int r2 = r2.f44g
            a0.f r4 = r8.f96i
            int r4 = r4.f43f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x023d
            if (r14 == 0) goto L_0x023d
            if (r14 == r9) goto L_0x022b
            goto L_0x02e7
        L_0x022b:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0250
            float r1 = (float) r3
            float r1 = r1 * r0
            goto L_0x024e
        L_0x023d:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0250
            float r1 = (float) r3
            float r1 = r1 / r0
        L_0x024e:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0250:
            a0.g r0 = r8.f92e
            r0.e(r1)
            z.e r0 = r8.f89b
            a0.n r0 = r0.f15652f
            a0.g r0 = r0.f92e
            r0.e(r3)
            goto L_0x02e7
        L_0x0260:
            return
        L_0x0261:
            if (r2 == 0) goto L_0x02e7
            if (r5 == 0) goto L_0x02e7
            boolean r0 = r12.f40c
            if (r0 == 0) goto L_0x02c9
            boolean r0 = r13.f40c
            if (r0 != 0) goto L_0x026e
            goto L_0x02c9
        L_0x026e:
            z.e r0 = r8.f89b
            float r0 = r0.A()
            java.util.List<a0.f> r1 = r12.f49l
            java.lang.Object r1 = r1.get(r10)
            a0.f r1 = (a0.f) r1
            int r1 = r1.f44g
            int r2 = r12.f43f
            int r1 = r1 + r2
            java.util.List<a0.f> r2 = r13.f49l
            java.lang.Object r2 = r2.get(r10)
            a0.f r2 = (a0.f) r2
            int r2 = r2.f44g
            int r4 = r13.f43f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02a7
            if (r14 == 0) goto L_0x0295
            if (r14 == r9) goto L_0x02a7
            goto L_0x02e7
        L_0x0295:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02ba
            float r1 = (float) r3
            float r1 = r1 / r0
            goto L_0x02b8
        L_0x02a7:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02ba
            float r1 = (float) r3
            float r1 = r1 * r0
        L_0x02b8:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02ba:
            a0.g r0 = r8.f92e
            r0.e(r3)
            z.e r0 = r8.f89b
            a0.n r0 = r0.f15652f
            a0.g r0 = r0.f92e
        L_0x02c5:
            r0.e(r1)
            goto L_0x02e7
        L_0x02c9:
            return
        L_0x02ca:
            z.e r0 = r0.U()
            if (r0 == 0) goto L_0x02e7
            a0.l r0 = r0.f15650e
            a0.g r0 = r0.f92e
            boolean r1 = r0.f47j
            if (r1 == 0) goto L_0x02e7
            z.e r1 = r8.f89b
            float r1 = r1.f15682u
            int r0 = r0.f44g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
        L_0x02e2:
            a0.g r1 = r8.f92e
            r1.e(r0)
        L_0x02e7:
            a0.f r0 = r8.f95h
            boolean r1 = r0.f40c
            if (r1 == 0) goto L_0x0407
            a0.f r1 = r8.f96i
            boolean r2 = r1.f40c
            if (r2 != 0) goto L_0x02f5
            goto L_0x0407
        L_0x02f5:
            boolean r0 = r0.f47j
            if (r0 == 0) goto L_0x0304
            boolean r0 = r1.f47j
            if (r0 == 0) goto L_0x0304
            a0.g r0 = r8.f92e
            boolean r0 = r0.f47j
            if (r0 == 0) goto L_0x0304
            return
        L_0x0304:
            a0.g r0 = r8.f92e
            boolean r0 = r0.f47j
            if (r0 != 0) goto L_0x034e
            z.e$b r0 = r8.f91d
            z.e$b r1 = z.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x034e
            z.e r0 = r8.f89b
            int r1 = r0.f15672p
            if (r1 != 0) goto L_0x034e
            boolean r0 = r0.s0()
            if (r0 != 0) goto L_0x034e
            a0.f r0 = r8.f95h
            java.util.List<a0.f> r0 = r0.f49l
            java.lang.Object r0 = r0.get(r10)
            a0.f r0 = (a0.f) r0
            a0.f r1 = r8.f96i
            java.util.List<a0.f> r1 = r1.f49l
            java.lang.Object r1 = r1.get(r10)
            a0.f r1 = (a0.f) r1
            int r0 = r0.f44g
            a0.f r2 = r8.f95h
            int r3 = r2.f43f
            int r0 = r0 + r3
            int r1 = r1.f44g
            a0.f r3 = r8.f96i
            int r3 = r3.f43f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.e(r0)
            a0.f r0 = r8.f96i
            r0.e(r1)
            a0.g r0 = r8.f92e
            r0.e(r3)
            return
        L_0x034e:
            a0.g r0 = r8.f92e
            boolean r0 = r0.f47j
            if (r0 != 0) goto L_0x03b2
            z.e$b r0 = r8.f91d
            z.e$b r1 = z.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03b2
            int r0 = r8.f88a
            if (r0 != r9) goto L_0x03b2
            a0.f r0 = r8.f95h
            java.util.List<a0.f> r0 = r0.f49l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03b2
            a0.f r0 = r8.f96i
            java.util.List<a0.f> r0 = r0.f49l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03b2
            a0.f r0 = r8.f95h
            java.util.List<a0.f> r0 = r0.f49l
            java.lang.Object r0 = r0.get(r10)
            a0.f r0 = (a0.f) r0
            a0.f r1 = r8.f96i
            java.util.List<a0.f> r1 = r1.f49l
            java.lang.Object r1 = r1.get(r10)
            a0.f r1 = (a0.f) r1
            int r0 = r0.f44g
            a0.f r2 = r8.f95h
            int r2 = r2.f43f
            int r0 = r0 + r2
            int r1 = r1.f44g
            a0.f r2 = r8.f96i
            int r2 = r2.f43f
            int r1 = r1 + r2
            int r1 = r1 - r0
            a0.g r0 = r8.f92e
            int r0 = r0.f50m
            int r0 = java.lang.Math.min(r1, r0)
            z.e r1 = r8.f89b
            int r2 = r1.f15680t
            int r1 = r1.f15678s
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03ad
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03ad:
            a0.g r1 = r8.f92e
            r1.e(r0)
        L_0x03b2:
            a0.g r0 = r8.f92e
            boolean r0 = r0.f47j
            if (r0 != 0) goto L_0x03b9
            return
        L_0x03b9:
            a0.f r0 = r8.f95h
            java.util.List<a0.f> r0 = r0.f49l
            java.lang.Object r0 = r0.get(r10)
            a0.f r0 = (a0.f) r0
            a0.f r1 = r8.f96i
            java.util.List<a0.f> r1 = r1.f49l
            java.lang.Object r1 = r1.get(r10)
            a0.f r1 = (a0.f) r1
            int r2 = r0.f44g
            a0.f r3 = r8.f95h
            int r3 = r3.f43f
            int r2 = r2 + r3
            int r3 = r1.f44g
            a0.f r4 = r8.f96i
            int r4 = r4.f43f
            int r3 = r3 + r4
            z.e r4 = r8.f89b
            float r4 = r4.E()
            if (r0 != r1) goto L_0x03e8
            int r2 = r0.f44g
            int r3 = r1.f44g
            r4 = r11
        L_0x03e8:
            int r3 = r3 - r2
            a0.g r0 = r8.f92e
            int r0 = r0.f44g
            int r3 = r3 - r0
            a0.f r0 = r8.f95h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.e(r1)
            a0.f r0 = r8.f96i
            a0.f r1 = r8.f95h
            int r1 = r1.f44g
            a0.g r2 = r8.f92e
            int r2 = r2.f44g
            int r1 = r1 + r2
            r0.e(r1)
        L_0x0407:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.l.a(a0.d):void");
    }

    public void d() {
        d dVar;
        f fVar;
        int i10;
        f fVar2;
        f fVar3;
        Object obj;
        List list;
        f fVar4;
        int i11;
        f fVar5;
        f fVar6;
        int i12;
        f fVar7;
        f fVar8;
        e U;
        e U2;
        e eVar = this.f89b;
        if (eVar.f15642a) {
            this.f92e.e(eVar.j0());
        }
        if (!this.f92e.f47j) {
            e.b H = this.f89b.H();
            this.f91d = H;
            if (H != e.b.MATCH_CONSTRAINT) {
                e.b bVar = e.b.MATCH_PARENT;
                if (H == bVar && (((U2 = this.f89b.U()) != null && U2.H() == e.b.FIXED) || U2.H() == bVar)) {
                    int j02 = (U2.j0() - this.f89b.J.g()) - this.f89b.L.g();
                    b(this.f95h, U2.f15650e.f95h, this.f89b.J.g());
                    b(this.f96i, U2.f15650e.f96i, -this.f89b.L.g());
                    this.f92e.e(j02);
                    return;
                } else if (this.f91d == e.b.FIXED) {
                    this.f92e.e(this.f89b.j0());
                }
            }
        } else {
            e.b bVar2 = this.f91d;
            e.b bVar3 = e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (((U = this.f89b.U()) != null && U.H() == e.b.FIXED) || U.H() == bVar3)) {
                b(this.f95h, U.f15650e.f95h, this.f89b.J.g());
                b(this.f96i, U.f15650e.f96i, -this.f89b.L.g());
                return;
            }
        }
        g gVar = this.f92e;
        if (gVar.f47j) {
            e eVar2 = this.f89b;
            if (eVar2.f15642a) {
                d[] dVarArr = eVar2.R;
                d dVar2 = dVarArr[0];
                d dVar3 = dVar2.f15623f;
                if (dVar3 == null || dVarArr[1].f15623f == null) {
                    if (dVar3 != null) {
                        fVar8 = h(dVar2);
                        if (fVar8 != null) {
                            fVar7 = this.f95h;
                            i12 = this.f89b.R[0].g();
                        } else {
                            return;
                        }
                    } else {
                        d dVar4 = dVarArr[1];
                        if (dVar4.f15623f != null) {
                            f h10 = h(dVar4);
                            if (h10 != null) {
                                b(this.f96i, h10, -this.f89b.R[1].g());
                                fVar6 = this.f95h;
                                fVar5 = this.f96i;
                                i11 = -this.f92e.f44g;
                                b(fVar6, fVar5, i11);
                                return;
                            }
                            return;
                        } else if (!(eVar2 instanceof i) && eVar2.U() != null && this.f89b.r(d.b.CENTER).f15623f == null) {
                            fVar8 = this.f89b.U().f15650e.f95h;
                            fVar7 = this.f95h;
                            i12 = this.f89b.k0();
                        } else {
                            return;
                        }
                    }
                    b(fVar7, fVar8, i12);
                    fVar6 = this.f96i;
                    fVar5 = this.f95h;
                    i11 = this.f92e.f44g;
                    b(fVar6, fVar5, i11);
                    return;
                } else if (eVar2.s0()) {
                    this.f95h.f43f = this.f89b.R[0].g();
                    fVar = this.f96i;
                    dVar = this.f89b.R[1];
                    fVar.f43f = -dVar.g();
                } else {
                    f h11 = h(this.f89b.R[0]);
                    if (h11 != null) {
                        b(this.f95h, h11, this.f89b.R[0].g());
                    }
                    f h12 = h(this.f89b.R[1]);
                    if (h12 != null) {
                        b(this.f96i, h12, -this.f89b.R[1].g());
                    }
                    this.f95h.f39b = true;
                    this.f96i.f39b = true;
                    return;
                }
            }
        }
        if (this.f91d == e.b.MATCH_CONSTRAINT) {
            e eVar3 = this.f89b;
            int i13 = eVar3.f15672p;
            if (i13 == 2) {
                e U3 = eVar3.U();
                if (U3 != null) {
                    g gVar2 = U3.f15652f.f92e;
                    this.f92e.f49l.add(gVar2);
                    gVar2.f48k.add(this.f92e);
                    g gVar3 = this.f92e;
                    gVar3.f39b = true;
                    gVar3.f48k.add(this.f95h);
                    list = this.f92e.f48k;
                    obj = this.f96i;
                }
            } else if (i13 == 3) {
                if (eVar3.f15674q == 3) {
                    this.f95h.f38a = this;
                    this.f96i.f38a = this;
                    n nVar = eVar3.f15652f;
                    nVar.f95h.f38a = this;
                    nVar.f96i.f38a = this;
                    gVar.f38a = this;
                    if (eVar3.u0()) {
                        this.f92e.f49l.add(this.f89b.f15652f.f92e);
                        this.f89b.f15652f.f92e.f48k.add(this.f92e);
                        n nVar2 = this.f89b.f15652f;
                        nVar2.f92e.f38a = this;
                        this.f92e.f49l.add(nVar2.f95h);
                        this.f92e.f49l.add(this.f89b.f15652f.f96i);
                        this.f89b.f15652f.f95h.f48k.add(this.f92e);
                        list = this.f89b.f15652f.f96i.f48k;
                        obj = this.f92e;
                    } else if (this.f89b.s0()) {
                        this.f89b.f15652f.f92e.f49l.add(this.f92e);
                        list = this.f92e.f48k;
                        obj = this.f89b.f15652f.f92e;
                    } else {
                        fVar4 = this.f89b.f15652f.f92e;
                    }
                } else {
                    g gVar4 = eVar3.f15652f.f92e;
                    gVar.f49l.add(gVar4);
                    gVar4.f48k.add(this.f92e);
                    this.f89b.f15652f.f95h.f48k.add(this.f92e);
                    this.f89b.f15652f.f96i.f48k.add(this.f92e);
                    g gVar5 = this.f92e;
                    gVar5.f39b = true;
                    gVar5.f48k.add(this.f95h);
                    this.f92e.f48k.add(this.f96i);
                    this.f95h.f49l.add(this.f92e);
                    fVar4 = this.f96i;
                }
                list = fVar4.f49l;
                obj = this.f92e;
            }
            list.add(obj);
        }
        e eVar4 = this.f89b;
        d[] dVarArr2 = eVar4.R;
        d dVar5 = dVarArr2[0];
        d dVar6 = dVar5.f15623f;
        if (dVar6 == null || dVarArr2[1].f15623f == null) {
            if (dVar6 != null) {
                fVar3 = h(dVar5);
                if (fVar3 != null) {
                    fVar2 = this.f95h;
                    i10 = this.f89b.R[0].g();
                } else {
                    return;
                }
            } else {
                d dVar7 = dVarArr2[1];
                if (dVar7.f15623f != null) {
                    f h13 = h(dVar7);
                    if (h13 != null) {
                        b(this.f96i, h13, -this.f89b.R[1].g());
                        c(this.f95h, this.f96i, -1, this.f92e);
                        return;
                    }
                    return;
                } else if (!(eVar4 instanceof i) && eVar4.U() != null) {
                    fVar3 = this.f89b.U().f15650e.f95h;
                    fVar2 = this.f95h;
                    i10 = this.f89b.k0();
                } else {
                    return;
                }
            }
            b(fVar2, fVar3, i10);
            c(this.f96i, this.f95h, 1, this.f92e);
        } else if (eVar4.s0()) {
            this.f95h.f43f = this.f89b.R[0].g();
            fVar = this.f96i;
            dVar = this.f89b.R[1];
            fVar.f43f = -dVar.g();
        } else {
            f h14 = h(this.f89b.R[0]);
            f h15 = h(this.f89b.R[1]);
            h14.b(this);
            h15.b(this);
            this.f97j = p.b.CENTER;
        }
    }

    public void e() {
        f fVar = this.f95h;
        if (fVar.f47j) {
            this.f89b.J1(fVar.f44g);
        }
    }

    public void f() {
        this.f90c = null;
        this.f95h.c();
        this.f96i.c();
        this.f92e.c();
        this.f94g = false;
    }

    public void n() {
        this.f94g = false;
        this.f95h.c();
        this.f95h.f47j = false;
        this.f96i.c();
        this.f96i.f47j = false;
        this.f92e.f47j = false;
    }

    public boolean p() {
        return this.f91d != e.b.MATCH_CONSTRAINT || this.f89b.f15672p == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f89b.y();
    }

    public final void u(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 == -1) {
            int i17 = (int) ((((float) i16) * f10) + 0.5f);
            int i18 = (int) ((((float) i15) / f10) + 0.5f);
            if (i17 <= i15) {
                iArr[0] = i17;
                iArr[1] = i16;
            } else if (i18 <= i16) {
                iArr[0] = i15;
                iArr[1] = i18;
            }
        } else if (i14 == 0) {
            iArr[0] = (int) ((((float) i16) * f10) + 0.5f);
            iArr[1] = i16;
        } else if (i14 == 1) {
            iArr[0] = i15;
            iArr[1] = (int) ((((float) i15) * f10) + 0.5f);
        }
    }
}

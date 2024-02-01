package z;

import java.util.HashMap;
import w.e;
import w.i;
import z.d;
import z.e;

public class h extends e {
    public static final int A1 = -1;

    /* renamed from: v1  reason: collision with root package name */
    public static final int f15737v1 = 0;

    /* renamed from: w1  reason: collision with root package name */
    public static final int f15738w1 = 1;

    /* renamed from: x1  reason: collision with root package name */
    public static final int f15739x1 = 0;

    /* renamed from: y1  reason: collision with root package name */
    public static final int f15740y1 = 1;

    /* renamed from: z1  reason: collision with root package name */
    public static final int f15741z1 = 2;

    /* renamed from: o1  reason: collision with root package name */
    public float f15742o1 = -1.0f;

    /* renamed from: p1  reason: collision with root package name */
    public int f15743p1 = -1;

    /* renamed from: q1  reason: collision with root package name */
    public int f15744q1 = -1;

    /* renamed from: r1  reason: collision with root package name */
    public d f15745r1 = this.K;

    /* renamed from: s1  reason: collision with root package name */
    public int f15746s1;

    /* renamed from: t1  reason: collision with root package name */
    public int f15747t1;

    /* renamed from: u1  reason: collision with root package name */
    public boolean f15748u1;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15749a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                z.d$b[] r0 = z.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15749a = r0
                z.d$b r1 = z.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15749a     // Catch:{ NoSuchFieldError -> 0x001d }
                z.d$b r1 = z.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15749a     // Catch:{ NoSuchFieldError -> 0x0028 }
                z.d$b r1 = z.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15749a     // Catch:{ NoSuchFieldError -> 0x0033 }
                z.d$b r1 = z.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15749a     // Catch:{ NoSuchFieldError -> 0x003e }
                z.d$b r1 = z.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15749a     // Catch:{ NoSuchFieldError -> 0x0049 }
                z.d$b r1 = z.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f15749a     // Catch:{ NoSuchFieldError -> 0x0054 }
                z.d$b r1 = z.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f15749a     // Catch:{ NoSuchFieldError -> 0x0060 }
                z.d$b r1 = z.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f15749a     // Catch:{ NoSuchFieldError -> 0x006c }
                z.d$b r1 = z.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z.h.a.<clinit>():void");
        }
    }

    public h() {
        this.f15746s1 = 0;
        this.f15747t1 = 0;
        this.S.clear();
        this.S.add(this.f15745r1);
        int length = this.R.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.R[i10] = this.f15745r1;
        }
    }

    public void N1(e eVar, boolean z10) {
        if (U() != null) {
            int O = eVar.O(this.f15745r1);
            if (this.f15746s1 == 1) {
                J1(O);
                K1(0);
                d1(U().D());
                H1(0);
                return;
            }
            J1(0);
            K1(O);
            H1(U().j0());
            d1(0);
        }
    }

    public void O1() {
        if (this.f15743p1 != -1) {
            X1();
        } else if (this.f15742o1 != -1.0f) {
            W1();
        } else if (this.f15744q1 != -1) {
            V1();
        }
    }

    public d P1() {
        return this.f15745r1;
    }

    public int Q1() {
        return this.f15746s1;
    }

    public int R1() {
        return this.f15743p1;
    }

    public int S1() {
        if (this.f15742o1 != -1.0f) {
            return 0;
        }
        if (this.f15743p1 != -1) {
            return 1;
        }
        return this.f15744q1 != -1 ? 2 : -1;
    }

    public int T1() {
        return this.f15744q1;
    }

    public float U1() {
        return this.f15742o1;
    }

    public void V1() {
        int k02 = k0();
        if (this.f15746s1 == 0) {
            k02 = l0();
        }
        a2(k02);
    }

    public void W1() {
        int j02 = U().j0() - k0();
        if (this.f15746s1 == 0) {
            j02 = U().D() - l0();
        }
        b2(j02);
    }

    public void X1() {
        float k02 = ((float) k0()) / ((float) U().j0());
        if (this.f15746s1 == 0) {
            k02 = ((float) l0()) / ((float) U().D());
        }
        c2(k02);
    }

    public boolean Y1() {
        return this.f15742o1 != -1.0f && this.f15743p1 == -1 && this.f15744q1 == -1;
    }

    public void Z1(int i10) {
        this.f15745r1.A(i10);
        this.f15748u1 = true;
    }

    public void a2(int i10) {
        if (i10 > -1) {
            this.f15742o1 = -1.0f;
            this.f15743p1 = i10;
            this.f15744q1 = -1;
        }
    }

    public void b2(int i10) {
        if (i10 > -1) {
            this.f15742o1 = -1.0f;
            this.f15743p1 = -1;
            this.f15744q1 = i10;
        }
    }

    public String c0() {
        return "Guideline";
    }

    public void c2(float f10) {
        if (f10 > -1.0f) {
            this.f15742o1 = f10;
            this.f15743p1 = -1;
            this.f15744q1 = -1;
        }
    }

    public void d2(int i10) {
        c2(((float) i10) / 100.0f);
    }

    public void e2(int i10) {
        this.f15747t1 = i10;
    }

    public void f2(int i10) {
        if (this.f15746s1 != i10) {
            this.f15746s1 = i10;
            this.S.clear();
            this.f15745r1 = this.f15746s1 == 1 ? this.J : this.K;
            this.S.add(this.f15745r1);
            int length = this.R.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.R[i11] = this.f15745r1;
            }
        }
    }

    public void g(e eVar, boolean z10) {
        f fVar = (f) U();
        if (fVar != null) {
            d r10 = fVar.r(d.b.LEFT);
            d r11 = fVar.r(d.b.RIGHT);
            e eVar2 = this.V;
            boolean z11 = true;
            boolean z12 = eVar2 != null && eVar2.U[0] == e.b.WRAP_CONTENT;
            if (this.f15746s1 == 0) {
                r10 = fVar.r(d.b.TOP);
                r11 = fVar.r(d.b.BOTTOM);
                e eVar3 = this.V;
                if (eVar3 == null || eVar3.U[1] != e.b.WRAP_CONTENT) {
                    z11 = false;
                }
                z12 = z11;
            }
            if (this.f15748u1 && this.f15745r1.o()) {
                i u10 = eVar.u(this.f15745r1);
                eVar.f(u10, this.f15745r1.f());
                if (this.f15743p1 != -1) {
                    if (z12) {
                        eVar.i(eVar.u(r11), u10, 0, 5);
                    }
                } else if (this.f15744q1 != -1 && z12) {
                    i u11 = eVar.u(r11);
                    eVar.i(u10, eVar.u(r10), 0, 5);
                    eVar.i(u11, u10, 0, 5);
                }
                this.f15748u1 = false;
            } else if (this.f15743p1 != -1) {
                i u12 = eVar.u(this.f15745r1);
                eVar.e(u12, eVar.u(r10), this.f15743p1, 8);
                if (z12) {
                    eVar.i(eVar.u(r11), u12, 0, 5);
                }
            } else if (this.f15744q1 != -1) {
                i u13 = eVar.u(this.f15745r1);
                i u14 = eVar.u(r11);
                eVar.e(u13, u14, -this.f15744q1, 8);
                if (z12) {
                    eVar.i(u13, eVar.u(r10), 0, 5);
                    eVar.i(u14, u13, 0, 5);
                }
            } else if (this.f15742o1 != -1.0f) {
                eVar.d(w.e.w(eVar, eVar.u(this.f15745r1), eVar.u(r11), this.f15742o1));
            }
        }
    }

    public boolean h() {
        return true;
    }

    public void n(e eVar, HashMap<e, e> hashMap) {
        super.n(eVar, hashMap);
        h hVar = (h) eVar;
        this.f15742o1 = hVar.f15742o1;
        this.f15743p1 = hVar.f15743p1;
        this.f15744q1 = hVar.f15744q1;
        f2(hVar.f15746s1);
    }

    public d r(d.b bVar) {
        switch (a.f15749a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f15746s1 == 1) {
                    return this.f15745r1;
                }
                break;
            case 3:
            case 4:
                if (this.f15746s1 == 0) {
                    return this.f15745r1;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }

    public boolean x0() {
        return this.f15748u1;
    }

    public boolean y0() {
        return this.f15748u1;
    }
}

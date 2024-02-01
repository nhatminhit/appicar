package a0;

import z.d;
import z.e;

public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f88a;

    /* renamed from: b  reason: collision with root package name */
    public e f89b;

    /* renamed from: c  reason: collision with root package name */
    public m f90c;

    /* renamed from: d  reason: collision with root package name */
    public e.b f91d;

    /* renamed from: e  reason: collision with root package name */
    public g f92e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f93f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f94g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f95h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f96i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public b f97j = b.NONE;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f98a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                z.d$b[] r0 = z.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f98a = r0
                z.d$b r1 = z.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f98a     // Catch:{ NoSuchFieldError -> 0x001d }
                z.d$b r1 = z.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f98a     // Catch:{ NoSuchFieldError -> 0x0028 }
                z.d$b r1 = z.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f98a     // Catch:{ NoSuchFieldError -> 0x0033 }
                z.d$b r1 = z.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f98a     // Catch:{ NoSuchFieldError -> 0x003e }
                z.d$b r1 = z.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a0.p.a.<clinit>():void");
        }
    }

    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(e eVar) {
        this.f89b = eVar;
    }

    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i10) {
        fVar.f49l.add(fVar2);
        fVar.f43f = i10;
        fVar2.f48k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f49l.add(fVar2);
        fVar.f49l.add(this.f92e);
        fVar.f45h = i10;
        fVar.f46i = gVar;
        fVar2.f48k.add(fVar);
        gVar.f48k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int i12;
        if (i11 == 0) {
            e eVar = this.f89b;
            int i13 = eVar.f15680t;
            i12 = Math.max(eVar.f15678s, i10);
            if (i13 > 0) {
                i12 = Math.min(i13, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        } else {
            e eVar2 = this.f89b;
            int i14 = eVar2.f15686w;
            int max = Math.max(eVar2.f15684v, i10);
            if (i14 > 0) {
                max = Math.min(i14, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        }
        return i12;
    }

    public final f h(d dVar) {
        p pVar;
        p pVar2;
        d dVar2 = dVar.f15623f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f15621d;
        int i10 = a.f98a[dVar2.f15622e.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                pVar2 = eVar.f15650e;
            } else if (i10 == 3) {
                pVar = eVar.f15652f;
            } else if (i10 == 4) {
                return eVar.f15652f.f69k;
            } else {
                if (i10 != 5) {
                    return null;
                }
                pVar2 = eVar.f15652f;
            }
            return pVar2.f96i;
        }
        pVar = eVar.f15650e;
        return pVar.f95h;
    }

    public final f i(d dVar, int i10) {
        d dVar2 = dVar.f15623f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f15621d;
        p pVar = i10 == 0 ? eVar.f15650e : eVar.f15652f;
        int i11 = a.f98a[dVar2.f15622e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f96i;
        }
        return pVar.f95h;
    }

    public long j() {
        g gVar = this.f92e;
        if (gVar.f47j) {
            return (long) gVar.f44g;
        }
        return 0;
    }

    public boolean k() {
        int size = this.f95h.f49l.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f95h.f49l.get(i11).f41d != this) {
                i10++;
            }
        }
        int size2 = this.f96i.f49l.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (this.f96i.f49l.get(i12).f41d != this) {
                i10++;
            }
        }
        return i10 >= 2;
    }

    public boolean l() {
        return this.f92e.f47j;
    }

    public boolean m() {
        return this.f94g;
    }

    public abstract void n();

    public final void o(int i10, int i11) {
        int i12;
        g gVar;
        int i13 = this.f88a;
        if (i13 != 0) {
            if (i13 == 1) {
                int g10 = g(this.f92e.f50m, i10);
                gVar = this.f92e;
                i12 = Math.min(g10, i11);
                gVar.e(i12);
            } else if (i13 == 2) {
                e U = this.f89b.U();
                if (U != null) {
                    g gVar2 = (i10 == 0 ? U.f15650e : U.f15652f).f92e;
                    if (gVar2.f47j) {
                        e eVar = this.f89b;
                        i11 = (int) ((((float) gVar2.f44g) * (i10 == 0 ? eVar.f15682u : eVar.f15688x)) + 0.5f);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i13 == 3) {
                e eVar2 = this.f89b;
                p pVar = eVar2.f15650e;
                e.b bVar = pVar.f91d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && pVar.f88a == 3) {
                    n nVar = eVar2.f15652f;
                    if (nVar.f91d == bVar2 && nVar.f88a == 3) {
                        return;
                    }
                }
                if (i10 == 0) {
                    pVar = eVar2.f15652f;
                }
                if (pVar.f92e.f47j) {
                    float A = eVar2.A();
                    this.f92e.e(i10 == 1 ? (int) ((((float) pVar.f92e.f44g) / A) + 0.5f) : (int) ((A * ((float) pVar.f92e.f44g)) + 0.5f));
                    return;
                }
                return;
            } else {
                return;
            }
        }
        gVar = this.f92e;
        i12 = g(i11, i10);
        gVar.e(i12);
    }

    public abstract boolean p();

    public void q(d dVar, d dVar2, d dVar3, int i10) {
        f fVar;
        f h10 = h(dVar2);
        f h11 = h(dVar3);
        if (h10.f47j && h11.f47j) {
            int g10 = h10.f44g + dVar2.g();
            int g11 = h11.f44g - dVar3.g();
            int i11 = g11 - g10;
            if (!this.f92e.f47j && this.f91d == e.b.MATCH_CONSTRAINT) {
                o(i10, i11);
            }
            g gVar = this.f92e;
            if (gVar.f47j) {
                if (gVar.f44g == i11) {
                    this.f95h.e(g10);
                    fVar = this.f96i;
                } else {
                    e eVar = this.f89b;
                    float E = i10 == 0 ? eVar.E() : eVar.d0();
                    if (h10 == h11) {
                        g10 = h10.f44g;
                        g11 = h11.f44g;
                        E = 0.5f;
                    }
                    this.f95h.e((int) (((float) g10) + 0.5f + (((float) ((g11 - g10) - this.f92e.f44g)) * E)));
                    fVar = this.f96i;
                    g11 = this.f95h.f44g + this.f92e.f44g;
                }
                fVar.e(g11);
            }
        }
    }

    public void r(d dVar) {
    }

    public void s(d dVar) {
    }

    public long t(int i10) {
        int i11;
        g gVar = this.f92e;
        if (!gVar.f47j) {
            return 0;
        }
        long j10 = (long) gVar.f44g;
        if (k()) {
            i11 = this.f95h.f43f - this.f96i.f43f;
        } else if (i10 != 0) {
            return j10 - ((long) this.f96i.f43f);
        } else {
            i11 = this.f95h.f43f;
        }
        return j10 + ((long) i11);
    }
}

package a0;

import java.util.ArrayList;
import z.f;

public class m {

    /* renamed from: h  reason: collision with root package name */
    public static final int f58h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f59i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f60j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static int f61k;

    /* renamed from: a  reason: collision with root package name */
    public int f62a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f63b = false;

    /* renamed from: c  reason: collision with root package name */
    public p f64c = null;

    /* renamed from: d  reason: collision with root package name */
    public p f65d = null;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<p> f66e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public int f67f;

    /* renamed from: g  reason: collision with root package name */
    public int f68g;

    public m(p pVar, int i10) {
        int i11 = f61k;
        this.f67f = i11;
        f61k = i11 + 1;
        this.f64c = pVar;
        this.f65d = pVar;
        this.f68g = i10;
    }

    public void a(p pVar) {
        this.f66e.add(pVar);
        this.f65d = pVar;
    }

    public long b(f fVar, int i10) {
        p pVar;
        long j10;
        long j11;
        long j12;
        p pVar2 = this.f64c;
        long j13 = 0;
        if (pVar2 instanceof c) {
            if (((c) pVar2).f93f != i10) {
                return 0;
            }
        } else if (i10 == 0) {
            if (!(pVar2 instanceof l)) {
                return 0;
            }
        } else if (!(pVar2 instanceof n)) {
            return 0;
        }
        f fVar2 = (i10 == 0 ? fVar.f15650e : fVar.f15652f).f95h;
        f fVar3 = (i10 == 0 ? fVar.f15650e : fVar.f15652f).f96i;
        boolean contains = pVar2.f95h.f49l.contains(fVar2);
        boolean contains2 = this.f64c.f96i.f49l.contains(fVar3);
        long j14 = this.f64c.j();
        if (!contains || !contains2) {
            if (contains) {
                f fVar4 = this.f64c.f95h;
                j12 = f(fVar4, (long) fVar4.f43f);
                j11 = ((long) this.f64c.f95h.f43f) + j14;
            } else if (contains2) {
                f fVar5 = this.f64c.f96i;
                long e10 = e(fVar5, (long) fVar5.f43f);
                j11 = ((long) (-this.f64c.f96i.f43f)) + j14;
                j12 = -e10;
            } else {
                p pVar3 = this.f64c;
                j10 = ((long) pVar3.f95h.f43f) + pVar3.j();
                pVar = this.f64c;
            }
            return Math.max(j12, j11);
        }
        long f10 = f(this.f64c.f95h, 0);
        long e11 = e(this.f64c.f96i, 0);
        long j15 = f10 - j14;
        p pVar4 = this.f64c;
        int i11 = pVar4.f96i.f43f;
        if (j15 >= ((long) (-i11))) {
            j15 += (long) i11;
        }
        int i12 = pVar4.f95h.f43f;
        long j16 = ((-e11) - j14) - ((long) i12);
        if (j16 >= ((long) i12)) {
            j16 -= (long) i12;
        }
        float u10 = pVar4.f89b.u(i10);
        if (u10 > 0.0f) {
            j13 = (long) ((((float) j16) / u10) + (((float) j15) / (1.0f - u10)));
        }
        float f11 = (float) j13;
        long j17 = ((long) ((f11 * u10) + 0.5f)) + j14 + ((long) ((f11 * (1.0f - u10)) + 0.5f));
        pVar = this.f64c;
        j10 = ((long) pVar.f95h.f43f) + j17;
        return j10 - ((long) pVar.f96i.f43f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        r2 = (a0.f) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r2 = (a0.f) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(a0.p r6, int r7) {
        /*
            r5 = this;
            z.e r0 = r6.f89b
            boolean[] r0 = r0.f15654g
            boolean r0 = r0[r7]
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            a0.f r0 = r6.f95h
            java.util.List<a0.d> r0 = r0.f48k
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x005a
            java.lang.Object r2 = r0.next()
            a0.d r2 = (a0.d) r2
            boolean r3 = r2 instanceof a0.f
            if (r3 == 0) goto L_0x0012
            a0.f r2 = (a0.f) r2
            a0.p r3 = r2.f41d
            if (r3 != r6) goto L_0x0029
            goto L_0x0012
        L_0x0029:
            a0.f r3 = r3.f95h
            if (r2 != r3) goto L_0x0012
            boolean r3 = r6 instanceof a0.c
            if (r3 == 0) goto L_0x004a
            r3 = r6
            a0.c r3 = (a0.c) r3
            java.util.ArrayList<a0.p> r3 = r3.f26k
            java.util.Iterator r3 = r3.iterator()
        L_0x003a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0054
            java.lang.Object r4 = r3.next()
            a0.p r4 = (a0.p) r4
            r5.c(r4, r7)
            goto L_0x003a
        L_0x004a:
            boolean r3 = r6 instanceof a0.k
            if (r3 != 0) goto L_0x0054
            z.e r3 = r6.f89b
            boolean[] r3 = r3.f15654g
            r3[r7] = r1
        L_0x0054:
            a0.p r2 = r2.f41d
            r5.c(r2, r7)
            goto L_0x0012
        L_0x005a:
            a0.f r0 = r6.f96i
            java.util.List<a0.d> r0 = r0.f48k
            java.util.Iterator r0 = r0.iterator()
        L_0x0062:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00aa
            java.lang.Object r2 = r0.next()
            a0.d r2 = (a0.d) r2
            boolean r3 = r2 instanceof a0.f
            if (r3 == 0) goto L_0x0062
            a0.f r2 = (a0.f) r2
            a0.p r3 = r2.f41d
            if (r3 != r6) goto L_0x0079
            goto L_0x0062
        L_0x0079:
            a0.f r3 = r3.f95h
            if (r2 != r3) goto L_0x0062
            boolean r3 = r6 instanceof a0.c
            if (r3 == 0) goto L_0x009a
            r3 = r6
            a0.c r3 = (a0.c) r3
            java.util.ArrayList<a0.p> r3 = r3.f26k
            java.util.Iterator r3 = r3.iterator()
        L_0x008a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00a4
            java.lang.Object r4 = r3.next()
            a0.p r4 = (a0.p) r4
            r5.c(r4, r7)
            goto L_0x008a
        L_0x009a:
            boolean r3 = r6 instanceof a0.k
            if (r3 != 0) goto L_0x00a4
            z.e r3 = r6.f89b
            boolean[] r3 = r3.f15654g
            r3[r7] = r1
        L_0x00a4:
            a0.p r2 = r2.f41d
            r5.c(r2, r7)
            goto L_0x0062
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.m.c(a0.p, int):boolean");
    }

    public void d(boolean z10, boolean z11) {
        if (z10) {
            p pVar = this.f64c;
            if (pVar instanceof l) {
                c(pVar, 0);
            }
        }
        if (z11) {
            p pVar2 = this.f64c;
            if (pVar2 instanceof n) {
                c(pVar2, 1);
            }
        }
    }

    public final long e(f fVar, long j10) {
        p pVar = fVar.f41d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f48k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f48k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f41d != pVar) {
                    j11 = Math.min(j11, e(fVar2, ((long) fVar2.f43f) + j10));
                }
            }
        }
        if (fVar != pVar.f96i) {
            return j11;
        }
        long j12 = j10 - pVar.j();
        return Math.min(Math.min(j11, e(pVar.f95h, j12)), j12 - ((long) pVar.f95h.f43f));
    }

    public final long f(f fVar, long j10) {
        p pVar = fVar.f41d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f48k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f48k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f41d != pVar) {
                    j11 = Math.max(j11, f(fVar2, ((long) fVar2.f43f) + j10));
                }
            }
        }
        if (fVar != pVar.f95h) {
            return j11;
        }
        long j12 = j10 + pVar.j();
        return Math.max(Math.max(j11, f(pVar.f96i, j12)), j12 - ((long) pVar.f96i.f43f));
    }
}

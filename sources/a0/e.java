package a0;

import a0.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import z.a;
import z.e;
import z.f;
import z.h;
import z.j;

public class e {

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f28j = true;

    /* renamed from: a  reason: collision with root package name */
    public f f29a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f30b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f31c = true;

    /* renamed from: d  reason: collision with root package name */
    public f f32d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<p> f33e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<m> f34f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public b.C0002b f35g = null;

    /* renamed from: h  reason: collision with root package name */
    public b.a f36h = new b.a();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<m> f37i = new ArrayList<>();

    public e(f fVar) {
        this.f29a = fVar;
        this.f32d = fVar;
    }

    public final void a(f fVar, int i10, int i11, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f41d;
        if (pVar.f90c == null) {
            f fVar3 = this.f29a;
            if (pVar != fVar3.f15650e && pVar != fVar3.f15652f) {
                if (mVar == null) {
                    mVar = new m(pVar, i11);
                    arrayList.add(mVar);
                }
                pVar.f90c = mVar;
                mVar.a(pVar);
                for (d next : pVar.f95h.f48k) {
                    if (next instanceof f) {
                        a((f) next, i10, 0, fVar2, arrayList, mVar);
                    }
                }
                for (d next2 : pVar.f96i.f48k) {
                    if (next2 instanceof f) {
                        a((f) next2, i10, 1, fVar2, arrayList, mVar);
                    }
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    for (d next3 : ((n) pVar).f69k.f48k) {
                        if (next3 instanceof f) {
                            a((f) next3, i10, 2, fVar2, arrayList, mVar);
                        }
                    }
                }
                for (f next4 : pVar.f95h.f49l) {
                    if (next4 == fVar2) {
                        mVar.f63b = true;
                    }
                    a(next4, i10, 0, fVar2, arrayList, mVar);
                }
                for (f next5 : pVar.f96i.f49l) {
                    if (next5 == fVar2) {
                        mVar.f63b = true;
                    }
                    a(next5, i10, 1, fVar2, arrayList, mVar);
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    for (f a10 : ((n) pVar).f69k.f49l) {
                        a(a10, i10, 2, fVar2, arrayList, mVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0074, code lost:
        if (r2.f15674q == 0) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(z.f r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<z.e> r1 = r0.f15783o1
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x025d
            java.lang.Object r2 = r1.next()
            z.e r2 = (z.e) r2
            z.e$b[] r4 = r2.U
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.i0()
            r7 = 8
            if (r6 != r7) goto L_0x0027
        L_0x0024:
            r2.f15642a = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.f15682u
            r11 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r7 = 2
            if (r6 >= 0) goto L_0x0036
            z.e$b r6 = z.e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.f15672p = r7
        L_0x0036:
            float r6 = r2.f15688x
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            z.e$b r6 = z.e.b.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.f15674q = r7
        L_0x0042:
            float r6 = r2.A()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r8 = 3
            if (r6 <= 0) goto L_0x0077
            z.e$b r6 = z.e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            z.e$b r9 = z.e.b.WRAP_CONTENT
            if (r4 == r9) goto L_0x0058
            z.e$b r9 = z.e.b.FIXED
            if (r4 != r9) goto L_0x005b
        L_0x0058:
            r2.f15672p = r8
            goto L_0x0077
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            z.e$b r9 = z.e.b.WRAP_CONTENT
            if (r5 == r9) goto L_0x0065
            z.e$b r9 = z.e.b.FIXED
            if (r5 != r9) goto L_0x0068
        L_0x0065:
            r2.f15674q = r8
            goto L_0x0077
        L_0x0068:
            if (r5 != r6) goto L_0x0077
            if (r4 != r6) goto L_0x0077
            int r6 = r2.f15672p
            if (r6 != 0) goto L_0x0072
            r2.f15672p = r8
        L_0x0072:
            int r6 = r2.f15674q
            if (r6 != 0) goto L_0x0077
            goto L_0x0065
        L_0x0077:
            z.e$b r6 = z.e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008d
            int r9 = r2.f15672p
            if (r9 != r10) goto L_0x008d
            z.d r9 = r2.J
            z.d r9 = r9.f15623f
            if (r9 == 0) goto L_0x008b
            z.d r9 = r2.L
            z.d r9 = r9.f15623f
            if (r9 != 0) goto L_0x008d
        L_0x008b:
            z.e$b r5 = z.e.b.WRAP_CONTENT
        L_0x008d:
            r9 = r5
            if (r4 != r6) goto L_0x00a2
            int r5 = r2.f15674q
            if (r5 != r10) goto L_0x00a2
            z.d r5 = r2.K
            z.d r5 = r5.f15623f
            if (r5 == 0) goto L_0x00a0
            z.d r5 = r2.M
            z.d r5 = r5.f15623f
            if (r5 != 0) goto L_0x00a2
        L_0x00a0:
            z.e$b r4 = z.e.b.WRAP_CONTENT
        L_0x00a2:
            r12 = r4
            a0.l r4 = r2.f15650e
            r4.f91d = r9
            int r5 = r2.f15672p
            r4.f88a = r5
            a0.n r4 = r2.f15652f
            r4.f91d = r12
            int r13 = r2.f15674q
            r4.f88a = r13
            z.e$b r4 = z.e.b.MATCH_PARENT
            if (r9 == r4) goto L_0x00bf
            z.e$b r14 = z.e.b.FIXED
            if (r9 == r14) goto L_0x00bf
            z.e$b r14 = z.e.b.WRAP_CONTENT
            if (r9 != r14) goto L_0x00cb
        L_0x00bf:
            if (r12 == r4) goto L_0x0209
            z.e$b r14 = z.e.b.FIXED
            if (r12 == r14) goto L_0x0209
            z.e$b r14 = z.e.b.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cb
            goto L_0x0209
        L_0x00cb:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r9 != r6) goto L_0x0141
            z.e$b r15 = z.e.b.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d7
            z.e$b r11 = z.e.b.FIXED
            if (r12 != r11) goto L_0x0141
        L_0x00d7:
            if (r5 != r8) goto L_0x00f7
            if (r12 != r15) goto L_0x00e5
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.r(r5, r6, r7, r8, r9)
        L_0x00e5:
            int r9 = r2.D()
            float r3 = (float) r9
            float r4 = r2.Y
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
        L_0x00ef:
            z.e$b r8 = z.e.b.FIXED
        L_0x00f1:
            r4 = r16
            r5 = r2
            r6 = r8
            goto L_0x0242
        L_0x00f7:
            if (r5 != r10) goto L_0x010f
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.r(r5, r6, r7, r8, r9)
            a0.l r3 = r2.f15650e
            a0.g r3 = r3.f92e
            int r2 = r2.j0()
        L_0x010b:
            r3.f50m = r2
            goto L_0x0008
        L_0x010f:
            if (r5 != r7) goto L_0x012a
            z.e$b[] r11 = r0.U
            r11 = r11[r3]
            z.e$b r15 = z.e.b.FIXED
            if (r11 == r15) goto L_0x011b
            if (r11 != r4) goto L_0x0141
        L_0x011b:
            float r3 = r2.f15682u
            int r4 = r17.j0()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            int r9 = r2.D()
            goto L_0x013a
        L_0x012a:
            z.d[] r11 = r2.R
            r7 = r11[r3]
            z.d r7 = r7.f15623f
            if (r7 == 0) goto L_0x0138
            r7 = r11[r10]
            z.d r7 = r7.f15623f
            if (r7 != 0) goto L_0x0141
        L_0x0138:
            r7 = 0
            r9 = 0
        L_0x013a:
            r4 = r16
            r5 = r2
            r6 = r15
        L_0x013e:
            r8 = r12
            goto L_0x0242
        L_0x0141:
            if (r12 != r6) goto L_0x01b6
            z.e$b r11 = z.e.b.WRAP_CONTENT
            if (r9 == r11) goto L_0x014b
            z.e$b r7 = z.e.b.FIXED
            if (r9 != r7) goto L_0x01b6
        L_0x014b:
            if (r13 != r8) goto L_0x016f
            if (r9 != r11) goto L_0x0159
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.r(r5, r6, r7, r8, r9)
        L_0x0159:
            int r7 = r2.j0()
            float r3 = r2.Y
            int r4 = r2.B()
            r5 = -1
            if (r4 != r5) goto L_0x016a
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x016a:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00ef
        L_0x016f:
            if (r13 != r10) goto L_0x017e
            r7 = 0
            r3 = 0
            r4 = r16
            r5 = r2
            r6 = r9
            r8 = r11
            r9 = r3
            r4.r(r5, r6, r7, r8, r9)
            goto L_0x01ff
        L_0x017e:
            r7 = 2
            if (r13 != r7) goto L_0x01a0
            z.e$b[] r7 = r0.U
            r7 = r7[r10]
            z.e$b r8 = z.e.b.FIXED
            if (r7 == r8) goto L_0x018b
            if (r7 != r4) goto L_0x01b6
        L_0x018b:
            float r3 = r2.f15688x
            int r7 = r2.j0()
            int r4 = r17.D()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r9
            r9 = r3
            goto L_0x0242
        L_0x01a0:
            z.d[] r4 = r2.R
            r7 = 2
            r15 = r4[r7]
            z.d r7 = r15.f15623f
            if (r7 == 0) goto L_0x01af
            r4 = r4[r8]
            z.d r4 = r4.f15623f
            if (r4 != 0) goto L_0x01b6
        L_0x01af:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            goto L_0x013e
        L_0x01b6:
            if (r9 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x01ea
            if (r13 != r10) goto L_0x01bf
            goto L_0x01ea
        L_0x01bf:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            z.e$b[] r4 = r0.U
            r3 = r4[r3]
            z.e$b r8 = z.e.b.FIXED
            if (r3 == r8) goto L_0x01ce
            if (r3 != r8) goto L_0x0008
        L_0x01ce:
            r3 = r4[r10]
            if (r3 == r8) goto L_0x01d4
            if (r3 != r8) goto L_0x0008
        L_0x01d4:
            float r3 = r2.f15682u
            float r4 = r2.f15688x
            int r5 = r17.j0()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.D()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00f1
        L_0x01ea:
            z.e$b r8 = z.e.b.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.r(r5, r6, r7, r8, r9)
            a0.l r3 = r2.f15650e
            a0.g r3 = r3.f92e
            int r4 = r2.j0()
            r3.f50m = r4
        L_0x01ff:
            a0.n r3 = r2.f15652f
            a0.g r3 = r3.f92e
            int r2 = r2.D()
            goto L_0x010b
        L_0x0209:
            int r3 = r2.j0()
            if (r9 != r4) goto L_0x0222
            int r3 = r17.j0()
            z.d r5 = r2.J
            int r5 = r5.f15624g
            int r3 = r3 - r5
            z.d r5 = r2.L
            int r5 = r5.f15624g
            int r3 = r3 - r5
            z.e$b r5 = z.e.b.FIXED
            r7 = r3
            r6 = r5
            goto L_0x0224
        L_0x0222:
            r7 = r3
            r6 = r9
        L_0x0224:
            int r3 = r2.D()
            if (r12 != r4) goto L_0x023d
            int r3 = r17.D()
            z.d r4 = r2.K
            int r4 = r4.f15624g
            int r3 = r3 - r4
            z.d r4 = r2.M
            int r4 = r4.f15624g
            int r3 = r3 - r4
            z.e$b r4 = z.e.b.FIXED
            r9 = r3
            r8 = r4
            goto L_0x023f
        L_0x023d:
            r9 = r3
            r8 = r12
        L_0x023f:
            r4 = r16
            r5 = r2
        L_0x0242:
            r4.r(r5, r6, r7, r8, r9)
            a0.l r3 = r2.f15650e
            a0.g r3 = r3.f92e
            int r4 = r2.j0()
            r3.e(r4)
            a0.n r3 = r2.f15652f
            a0.g r3 = r3.f92e
            int r4 = r2.D()
            r3.e(r4)
            goto L_0x0024
        L_0x025d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.e.b(z.f):boolean");
    }

    public void c() {
        d(this.f33e);
        this.f37i.clear();
        m.f61k = 0;
        k(this.f29a.f15650e, 0, this.f37i);
        k(this.f29a.f15652f, 1, this.f37i);
        this.f30b = false;
    }

    public void d(ArrayList<p> arrayList) {
        Object kVar;
        arrayList.clear();
        this.f32d.f15650e.f();
        this.f32d.f15652f.f();
        arrayList.add(this.f32d.f15650e);
        arrayList.add(this.f32d.f15652f);
        Iterator<z.e> it = this.f32d.f15783o1.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            z.e next = it.next();
            if (next instanceof h) {
                kVar = new j(next);
            } else {
                if (next.s0()) {
                    if (next.f15646c == null) {
                        next.f15646c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f15646c);
                } else {
                    arrayList.add(next.f15650e);
                }
                if (next.u0()) {
                    if (next.f15648d == null) {
                        next.f15648d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f15648d);
                } else {
                    arrayList.add(next.f15652f);
                }
                if (next instanceof j) {
                    kVar = new k(next);
                }
            }
            arrayList.add(kVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f89b != this.f32d) {
                next2.d();
            }
        }
    }

    public final int e(f fVar, int i10) {
        int size = this.f37i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, this.f37i.get(i11).b(fVar, i10));
        }
        return (int) j10;
    }

    public void f(e.b bVar, e.b bVar2) {
        if (this.f30b) {
            c();
            Iterator<z.e> it = this.f29a.f15783o1.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                z.e next = it.next();
                boolean[] zArr = next.f15654g;
                zArr[0] = true;
                zArr[1] = true;
                if (next instanceof a) {
                    z10 = true;
                }
            }
            if (!z10) {
                Iterator<m> it2 = this.f37i.iterator();
                while (it2.hasNext()) {
                    m next2 = it2.next();
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    next2.d(bVar == bVar3, bVar2 == bVar3);
                }
            }
        }
    }

    public boolean g(boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        if (this.f30b || this.f31c) {
            Iterator<z.e> it = this.f29a.f15783o1.iterator();
            while (it.hasNext()) {
                z.e next = it.next();
                next.q();
                next.f15642a = false;
                next.f15650e.n();
                next.f15652f.n();
            }
            this.f29a.q();
            f fVar = this.f29a;
            fVar.f15642a = false;
            fVar.f15650e.n();
            this.f29a.f15652f.n();
            this.f31c = false;
        }
        if (b(this.f32d)) {
            return false;
        }
        this.f29a.J1(0);
        this.f29a.K1(0);
        e.b z14 = this.f29a.z(0);
        e.b z15 = this.f29a.z(1);
        if (this.f30b) {
            c();
        }
        int k02 = this.f29a.k0();
        int l02 = this.f29a.l0();
        this.f29a.f15650e.f95h.e(k02);
        this.f29a.f15652f.f95h.e(l02);
        s();
        e.b bVar = e.b.WRAP_CONTENT;
        if (z14 == bVar || z15 == bVar) {
            if (z13) {
                Iterator<p> it2 = this.f33e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().p()) {
                            z13 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z13 && z14 == e.b.WRAP_CONTENT) {
                this.f29a.i1(e.b.FIXED);
                f fVar2 = this.f29a;
                fVar2.H1(e(fVar2, 0));
                f fVar3 = this.f29a;
                fVar3.f15650e.f92e.e(fVar3.j0());
            }
            if (z13 && z15 == e.b.WRAP_CONTENT) {
                this.f29a.D1(e.b.FIXED);
                f fVar4 = this.f29a;
                fVar4.d1(e(fVar4, 1));
                f fVar5 = this.f29a;
                fVar5.f15652f.f92e.e(fVar5.D());
            }
        }
        f fVar6 = this.f29a;
        e.b bVar2 = fVar6.U[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int j02 = fVar6.j0() + k02;
            this.f29a.f15650e.f96i.e(j02);
            this.f29a.f15650e.f92e.e(j02 - k02);
            s();
            f fVar7 = this.f29a;
            e.b bVar4 = fVar7.U[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int D = fVar7.D() + l02;
                this.f29a.f15652f.f96i.e(D);
                this.f29a.f15652f.f92e.e(D - l02);
            }
            s();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<p> it3 = this.f33e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f89b != this.f29a || next2.f94g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f33e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            p next3 = it4.next();
            if ((z11 || next3.f89b != this.f29a) && (!next3.f95h.f47j || ((!next3.f96i.f47j && !(next3 instanceof j)) || (!next3.f92e.f47j && !(next3 instanceof c) && !(next3 instanceof j))))) {
                z12 = false;
            }
        }
        z12 = false;
        this.f29a.i1(z14);
        this.f29a.D1(z15);
        return z12;
    }

    public boolean h(boolean z10) {
        if (this.f30b) {
            Iterator<z.e> it = this.f29a.f15783o1.iterator();
            while (it.hasNext()) {
                z.e next = it.next();
                next.q();
                next.f15642a = false;
                l lVar = next.f15650e;
                lVar.f92e.f47j = false;
                lVar.f94g = false;
                lVar.n();
                n nVar = next.f15652f;
                nVar.f92e.f47j = false;
                nVar.f94g = false;
                nVar.n();
            }
            this.f29a.q();
            f fVar = this.f29a;
            fVar.f15642a = false;
            l lVar2 = fVar.f15650e;
            lVar2.f92e.f47j = false;
            lVar2.f94g = false;
            lVar2.n();
            n nVar2 = this.f29a.f15652f;
            nVar2.f92e.f47j = false;
            nVar2.f94g = false;
            nVar2.n();
            c();
        }
        if (b(this.f32d)) {
            return false;
        }
        this.f29a.J1(0);
        this.f29a.K1(0);
        this.f29a.f15650e.f95h.e(0);
        this.f29a.f15652f.f95h.e(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013a A[EDGE_INSN: B:78:0x013a->B:64:0x013a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            z.f r1 = r9.f29a
            r2 = 0
            z.e$b r1 = r1.z(r2)
            z.f r3 = r9.f29a
            z.e$b r3 = r3.z(r0)
            z.f r4 = r9.f29a
            int r4 = r4.k0()
            z.f r5 = r9.f29a
            int r5 = r5.l0()
            if (r10 == 0) goto L_0x0086
            z.e$b r6 = z.e.b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0086
        L_0x0023:
            java.util.ArrayList<a0.p> r6 = r9.f33e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            a0.p r7 = (a0.p) r7
            int r8 = r7.f93f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.p()
            if (r7 != 0) goto L_0x0029
            r10 = r2
        L_0x0040:
            if (r11 != 0) goto L_0x0063
            if (r10 == 0) goto L_0x0086
            z.e$b r10 = z.e.b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0086
            z.f r10 = r9.f29a
            z.e$b r6 = z.e.b.FIXED
            r10.i1(r6)
            z.f r10 = r9.f29a
            int r6 = r9.e(r10, r2)
            r10.H1(r6)
            z.f r10 = r9.f29a
            a0.l r6 = r10.f15650e
            a0.g r6 = r6.f92e
            int r10 = r10.j0()
            goto L_0x0083
        L_0x0063:
            if (r10 == 0) goto L_0x0086
            z.e$b r10 = z.e.b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0086
            z.f r10 = r9.f29a
            z.e$b r6 = z.e.b.FIXED
            r10.D1(r6)
            z.f r10 = r9.f29a
            int r6 = r9.e(r10, r0)
            r10.d1(r6)
            z.f r10 = r9.f29a
            a0.n r6 = r10.f15652f
            a0.g r6 = r6.f92e
            int r10 = r10.D()
        L_0x0083:
            r6.e(r10)
        L_0x0086:
            z.f r10 = r9.f29a
            if (r11 != 0) goto L_0x00af
            z.e$b[] r5 = r10.U
            r5 = r5[r2]
            z.e$b r6 = z.e.b.FIXED
            if (r5 == r6) goto L_0x0096
            z.e$b r6 = z.e.b.MATCH_PARENT
            if (r5 != r6) goto L_0x00bc
        L_0x0096:
            int r10 = r10.j0()
            int r10 = r10 + r4
            z.f r5 = r9.f29a
            a0.l r5 = r5.f15650e
            a0.f r5 = r5.f96i
            r5.e(r10)
            z.f r5 = r9.f29a
            a0.l r5 = r5.f15650e
            a0.g r5 = r5.f92e
            int r10 = r10 - r4
            r5.e(r10)
            goto L_0x00d6
        L_0x00af:
            z.e$b[] r4 = r10.U
            r4 = r4[r0]
            z.e$b r6 = z.e.b.FIXED
            if (r4 == r6) goto L_0x00be
            z.e$b r6 = z.e.b.MATCH_PARENT
            if (r4 != r6) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            r10 = r2
            goto L_0x00d7
        L_0x00be:
            int r10 = r10.D()
            int r10 = r10 + r5
            z.f r4 = r9.f29a
            a0.n r4 = r4.f15652f
            a0.f r4 = r4.f96i
            r4.e(r10)
            z.f r4 = r9.f29a
            a0.n r4 = r4.f15652f
            a0.g r4 = r4.f92e
            int r10 = r10 - r5
            r4.e(r10)
        L_0x00d6:
            r10 = r0
        L_0x00d7:
            r9.s()
            java.util.ArrayList<a0.p> r4 = r9.f33e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0100
            java.lang.Object r5 = r4.next()
            a0.p r5 = (a0.p) r5
            int r6 = r5.f93f
            if (r6 == r11) goto L_0x00f1
            goto L_0x00e0
        L_0x00f1:
            z.e r6 = r5.f89b
            z.f r7 = r9.f29a
            if (r6 != r7) goto L_0x00fc
            boolean r6 = r5.f94g
            if (r6 != 0) goto L_0x00fc
            goto L_0x00e0
        L_0x00fc:
            r5.e()
            goto L_0x00e0
        L_0x0100:
            java.util.ArrayList<a0.p> r4 = r9.f33e
            java.util.Iterator r4 = r4.iterator()
        L_0x0106:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013a
            java.lang.Object r5 = r4.next()
            a0.p r5 = (a0.p) r5
            int r6 = r5.f93f
            if (r6 == r11) goto L_0x0117
            goto L_0x0106
        L_0x0117:
            if (r10 != 0) goto L_0x0120
            z.e r6 = r5.f89b
            z.f r7 = r9.f29a
            if (r6 != r7) goto L_0x0120
            goto L_0x0106
        L_0x0120:
            a0.f r6 = r5.f95h
            boolean r6 = r6.f47j
            if (r6 != 0) goto L_0x0128
        L_0x0126:
            r0 = r2
            goto L_0x013a
        L_0x0128:
            a0.f r6 = r5.f96i
            boolean r6 = r6.f47j
            if (r6 != 0) goto L_0x012f
            goto L_0x0126
        L_0x012f:
            boolean r6 = r5 instanceof a0.c
            if (r6 != 0) goto L_0x0106
            a0.g r5 = r5.f92e
            boolean r5 = r5.f47j
            if (r5 != 0) goto L_0x0106
            goto L_0x0126
        L_0x013a:
            z.f r10 = r9.f29a
            r10.i1(r1)
            z.f r10 = r9.f29a
            r10.D1(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.e.i(boolean, int):boolean");
    }

    public final void j() {
        Iterator<p> it = this.f33e.iterator();
        String str = "digraph {\n";
        while (it.hasNext()) {
            str = m(it.next(), str);
        }
        String str2 = str + "\n}\n";
        System.out.println("content:<<\n" + str2 + "\n>>");
    }

    public final void k(p pVar, int i10, ArrayList<m> arrayList) {
        for (d next : pVar.f95h.f48k) {
            if (next instanceof f) {
                a((f) next, i10, 0, pVar.f96i, arrayList, (m) null);
            } else if (next instanceof p) {
                a(((p) next).f95h, i10, 0, pVar.f96i, arrayList, (m) null);
            }
        }
        for (d next2 : pVar.f96i.f48k) {
            if (next2 instanceof f) {
                a((f) next2, i10, 1, pVar.f95h, arrayList, (m) null);
            } else if (next2 instanceof p) {
                a(((p) next2).f96i, i10, 1, pVar.f95h, arrayList, (m) null);
            }
        }
        if (i10 == 1) {
            for (d next3 : ((n) pVar).f69k.f48k) {
                if (next3 instanceof f) {
                    a((f) next3, i10, 2, (f) null, arrayList, (m) null);
                }
            }
        }
    }

    public final String l(c cVar, String str) {
        StringBuilder sb2;
        String str2;
        StringBuilder sb3;
        String str3;
        int i10 = cVar.f93f;
        String str4 = "cluster_" + cVar.f89b.y();
        if (i10 == 0) {
            sb2.append(str4);
            str2 = "_h";
        } else {
            sb2 = new StringBuilder();
            sb2.append(str4);
            str2 = "_v";
        }
        sb2.append(str2);
        String str5 = "subgraph " + sb2.toString() + " {\n";
        Iterator<p> it = cVar.f26k.iterator();
        String str6 = "";
        while (it.hasNext()) {
            p next = it.next();
            String y10 = next.f89b.y();
            if (i10 == 0) {
                sb3.append(y10);
                str3 = "_HORIZONTAL";
            } else {
                sb3 = new StringBuilder();
                sb3.append(y10);
                str3 = "_VERTICAL";
            }
            sb3.append(str3);
            str5 = str5 + sb3.toString() + ";\n";
            str6 = m(next, str6);
        }
        return str + str6 + (str5 + "}\n");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        if (r9.f89b.A() > 0.0f) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012c, code lost:
        if (r9.f89b.A() > 0.0f) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a9 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String m(a0.p r9, java.lang.String r10) {
        /*
            r8 = this;
            a0.f r0 = r9.f95h
            a0.f r1 = r9.f96i
            boolean r2 = r9 instanceof a0.k
            if (r2 != 0) goto L_0x0028
            java.util.List<a0.d> r2 = r0.f48k
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0028
            java.util.List<a0.d> r2 = r1.f48k
            boolean r2 = r2.isEmpty()
            java.util.List<a0.f> r3 = r0.f49l
            boolean r3 = r3.isEmpty()
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0028
            java.util.List<a0.f> r2 = r1.f49l
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0028
            return r10
        L_0x0028:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r10 = r8.t(r9)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            boolean r2 = r8.q(r0, r1)
            java.lang.String r10 = r8.n(r0, r2, r10)
            java.lang.String r10 = r8.n(r1, r2, r10)
            boolean r3 = r9 instanceof a0.n
            if (r3 == 0) goto L_0x0054
            r4 = r9
            a0.n r4 = (a0.n) r4
            a0.f r4 = r4.f69k
            java.lang.String r10 = r8.n(r4, r2, r10)
        L_0x0054:
            boolean r2 = r9 instanceof a0.l
            r4 = 0
            java.lang.String r5 = " -> "
            java.lang.String r6 = "\n"
            if (r2 != 0) goto L_0x0111
            boolean r2 = r9 instanceof a0.c
            if (r2 == 0) goto L_0x006a
            r7 = r9
            a0.c r7 = (a0.c) r7
            int r7 = r7.f93f
            if (r7 != 0) goto L_0x006a
            goto L_0x0111
        L_0x006a:
            if (r3 != 0) goto L_0x0076
            if (r2 == 0) goto L_0x019e
            r2 = r9
            a0.c r2 = (a0.c) r2
            int r2 = r2.f93f
            r3 = 1
            if (r2 != r3) goto L_0x019e
        L_0x0076:
            z.e r2 = r9.f89b
            z.e$b r2 = r2.g0()
            z.e$b r3 = z.e.b.FIXED
            if (r2 == r3) goto L_0x009a
            z.e$b r3 = z.e.b.WRAP_CONTENT
            if (r2 != r3) goto L_0x0085
            goto L_0x009a
        L_0x0085:
            z.e$b r0 = z.e.b.MATCH_CONSTRAINT
            if (r2 != r0) goto L_0x019e
            z.e r0 = r9.f89b
            float r0 = r0.A()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x019e
        L_0x0093:
            z.e r0 = r9.f89b
            r0.y()
            goto L_0x019e
        L_0x009a:
            java.util.List<a0.f> r2 = r0.f49l
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00db
            java.util.List<a0.f> r2 = r1.f49l
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00db
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r1 = r1.d()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r0 = r0.d()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x00cf:
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            goto L_0x019e
        L_0x00db:
            java.util.List<a0.f> r2 = r0.f49l
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x019e
            java.util.List<a0.f> r2 = r1.f49l
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x019e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r0 = r0.d()
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r1.d()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00cf
        L_0x0111:
            z.e r2 = r9.f89b
            z.e$b r2 = r2.H()
            z.e$b r3 = z.e.b.FIXED
            if (r2 == r3) goto L_0x0130
            z.e$b r3 = z.e.b.WRAP_CONTENT
            if (r2 != r3) goto L_0x0120
            goto L_0x0130
        L_0x0120:
            z.e$b r0 = z.e.b.MATCH_CONSTRAINT
            if (r2 != r0) goto L_0x019e
            z.e r0 = r9.f89b
            float r0 = r0.A()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x019e
            goto L_0x0093
        L_0x0130:
            java.util.List<a0.f> r2 = r0.f49l
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0167
            java.util.List<a0.f> r2 = r1.f49l
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0167
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r1 = r1.d()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r0 = r0.d()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00cf
        L_0x0167:
            java.util.List<a0.f> r2 = r0.f49l
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x019e
            java.util.List<a0.f> r2 = r1.f49l
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x019e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r0 = r0.d()
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r1.d()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00cf
        L_0x019e:
            boolean r0 = r9 instanceof a0.c
            if (r0 == 0) goto L_0x01a9
            a0.c r9 = (a0.c) r9
            java.lang.String r9 = r8.l(r9, r10)
            return r9
        L_0x01a9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.e.m(a0.p, java.lang.String):java.lang.String");
    }

    public final String n(f fVar, boolean z10, String str) {
        for (f d10 : fVar.f49l) {
            String str2 = ("\n" + fVar.d()) + " -> " + d10.d();
            if (fVar.f43f > 0 || z10 || (fVar.f41d instanceof k)) {
                String str3 = str2 + "[";
                if (fVar.f43f > 0) {
                    str3 = str3 + "label=\"" + fVar.f43f + "\"";
                    if (z10) {
                        str3 = str3 + ",";
                    }
                }
                if (z10) {
                    str3 = str3 + " style=dashed ";
                }
                if (fVar.f41d instanceof k) {
                    str3 = str3 + " style=bold,color=gray ";
                }
                str2 = str3 + "]";
            }
            str = str + (str2 + "\n");
        }
        return str;
    }

    public void o() {
        this.f30b = true;
    }

    public void p() {
        this.f31c = true;
    }

    public final boolean q(f fVar, f fVar2) {
        int i10 = 0;
        for (f fVar3 : fVar.f49l) {
            if (fVar3 != fVar2) {
                i10++;
            }
        }
        int i11 = 0;
        for (f fVar4 : fVar2.f49l) {
            if (fVar4 != fVar) {
                i11++;
            }
        }
        return i10 > 0 && i11 > 0;
    }

    public final void r(z.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f36h;
        aVar.f16a = bVar;
        aVar.f17b = bVar2;
        aVar.f18c = i10;
        aVar.f19d = i11;
        this.f35g.b(eVar, aVar);
        eVar.H1(this.f36h.f20e);
        eVar.d1(this.f36h.f21f);
        eVar.c1(this.f36h.f23h);
        eVar.L0(this.f36h.f22g);
    }

    public void s() {
        g gVar;
        g gVar2;
        int j02;
        g gVar3;
        int j03;
        Iterator<z.e> it = this.f29a.f15783o1.iterator();
        while (it.hasNext()) {
            z.e next = it.next();
            if (!next.f15642a) {
                e.b[] bVarArr = next.U;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = next.f15672p;
                int i11 = next.f15674q;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar4 = next.f15650e.f92e;
                boolean z12 = gVar4.f47j;
                g gVar5 = next.f15652f.f92e;
                boolean z13 = gVar5.f47j;
                if (!z12 || !z13) {
                    if (!z12 || !z10) {
                        if (z13 && z11) {
                            r(next, bVar3, gVar4.f44g, e.b.FIXED, gVar5.f44g);
                            if (bVar == e.b.MATCH_CONSTRAINT) {
                                gVar3 = next.f15650e.f92e;
                                j03 = next.j0();
                            } else {
                                gVar2 = next.f15650e.f92e;
                                j02 = next.j0();
                                gVar2.e(j02);
                            }
                        }
                        if (next.f15642a && (gVar = next.f15652f.f70l) != null) {
                            gVar.e(next.t());
                        }
                    } else {
                        r(next, e.b.FIXED, gVar4.f44g, bVar3, gVar5.f44g);
                        if (bVar2 == e.b.MATCH_CONSTRAINT) {
                            gVar3 = next.f15652f.f92e;
                            j03 = next.D();
                        } else {
                            gVar2 = next.f15652f.f92e;
                            j02 = next.D();
                            gVar2.e(j02);
                        }
                    }
                    gVar3.f50m = j03;
                    gVar.e(next.t());
                } else {
                    e.b bVar4 = e.b.FIXED;
                    r(next, bVar4, gVar4.f44g, bVar4, gVar5.f44g);
                }
                next.f15642a = true;
                gVar.e(next.t());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String t(a0.p r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof a0.n
            z.e r1 = r10.f89b
            java.lang.String r1 = r1.y()
            z.e r2 = r10.f89b
            if (r0 != 0) goto L_0x0011
            z.e$b r2 = r2.H()
            goto L_0x0015
        L_0x0011:
            z.e$b r2 = r2.g0()
        L_0x0015:
            a0.m r3 = r10.f90c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            if (r0 != 0) goto L_0x0024
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = "_HORIZONTAL"
            goto L_0x002c
        L_0x0024:
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = "_VERTICAL"
        L_0x002c:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " [shape=none, label=<"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "  <TR>"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = " BGCOLOR=\"green\""
            java.lang.String r6 = "    <TD "
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            if (r0 != 0) goto L_0x009b
            r7.<init>()
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            a0.f r7 = r10.f95h
            boolean r7 = r7.f47j
            if (r7 == 0) goto L_0x0090
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = r7.toString()
        L_0x0090:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " PORT=\"LEFT\" BORDER=\"1\">L</TD>"
            goto L_0x00c7
        L_0x009b:
            r7.<init>()
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            a0.f r7 = r10.f95h
            boolean r7 = r7.f47j
            if (r7 == 0) goto L_0x00bd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = r7.toString()
        L_0x00bd:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " PORT=\"TOP\" BORDER=\"1\">T</TD>"
        L_0x00c7:
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = "    <TD BORDER=\"1\" "
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            a0.g r7 = r10.f92e
            boolean r7 = r7.f47j
            if (r7 == 0) goto L_0x00fd
            z.e r8 = r10.f89b
            boolean r8 = r8.f15642a
            if (r8 != 0) goto L_0x00fd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " BGCOLOR=\"green\" "
        L_0x00f5:
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            goto L_0x0123
        L_0x00fd:
            if (r7 == 0) goto L_0x0110
            z.e r8 = r10.f89b
            boolean r8 = r8.f15642a
            if (r8 == 0) goto L_0x0110
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " BGCOLOR=\"lightgray\" "
            goto L_0x00f5
        L_0x0110:
            if (r7 != 0) goto L_0x0123
            z.e r7 = r10.f89b
            boolean r7 = r7.f15642a
            if (r7 == 0) goto L_0x0123
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " BGCOLOR=\"yellow\" "
            goto L_0x00f5
        L_0x0123:
            z.e$b r7 = z.e.b.MATCH_CONSTRAINT
            if (r2 != r7) goto L_0x0138
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = "style=\"dashed\""
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L_0x0138:
            if (r3 == 0) goto L_0x015f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = " ["
            r2.append(r7)
            int r3 = r3.f67f
            int r3 = r3 + 1
            r2.append(r3)
            java.lang.String r3 = "/"
            r2.append(r3)
            int r3 = a0.m.f61k
            r2.append(r3)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x0161
        L_0x015f:
            java.lang.String r2 = ""
        L_0x0161:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = ">"
            r3.append(r4)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = " </TD>"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            if (r0 != 0) goto L_0x01b5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            a0.f r10 = r10.f96i
            boolean r10 = r10.f47j
            if (r10 == 0) goto L_0x01a3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = r10.toString()
        L_0x01a3:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r0 = " PORT=\"RIGHT\" BORDER=\"1\">R</TD>"
        L_0x01ad:
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            goto L_0x0220
        L_0x01b5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            boolean r1 = r10 instanceof a0.n
            if (r1 == 0) goto L_0x01e0
            r1 = r10
            a0.n r1 = (a0.n) r1
            a0.f r1 = r1.f69k
            boolean r1 = r1.f47j
            if (r1 == 0) goto L_0x01e0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L_0x01e0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " PORT=\"BASELINE\" BORDER=\"1\">b</TD>"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            a0.f r10 = r10.f96i
            boolean r10 = r10.f47j
            if (r10 == 0) goto L_0x0215
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = r10.toString()
        L_0x0215:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r0 = " PORT=\"BOTTOM\" BORDER=\"1\">B</TD>"
            goto L_0x01ad
        L_0x0220:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = "  </TR></TABLE>"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = ">];\n"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.e.t(a0.p):java.lang.String");
    }

    public void u(b.C0002b bVar) {
        this.f35g = bVar;
    }
}

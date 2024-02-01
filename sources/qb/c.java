package qb;

import qa.m;
import qa.t;
import ya.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f22204a;

    /* renamed from: b  reason: collision with root package name */
    public final t f22205b;

    /* renamed from: c  reason: collision with root package name */
    public final t f22206c;

    /* renamed from: d  reason: collision with root package name */
    public final t f22207d;

    /* renamed from: e  reason: collision with root package name */
    public final t f22208e;

    /* renamed from: f  reason: collision with root package name */
    public final int f22209f;

    /* renamed from: g  reason: collision with root package name */
    public final int f22210g;

    /* renamed from: h  reason: collision with root package name */
    public final int f22211h;

    /* renamed from: i  reason: collision with root package name */
    public final int f22212i;

    public c(c cVar) {
        this.f22204a = cVar.f22204a;
        this.f22205b = cVar.f22205b;
        this.f22206c = cVar.f22206c;
        this.f22207d = cVar.f22207d;
        this.f22208e = cVar.f22208e;
        this.f22209f = cVar.f22209f;
        this.f22210g = cVar.f22210g;
        this.f22211h = cVar.f22211h;
        this.f22212i = cVar.f22212i;
    }

    public c(b bVar, t tVar, t tVar2, t tVar3, t tVar4) throws m {
        boolean z10 = false;
        boolean z11 = tVar == null || tVar2 == null;
        z10 = (tVar3 == null || tVar4 == null) ? true : z10;
        if (!z11 || !z10) {
            if (z11) {
                tVar = new t(0.0f, tVar3.d());
                tVar2 = new t(0.0f, tVar4.d());
            } else if (z10) {
                tVar3 = new t((float) (bVar.s() - 1), tVar.d());
                tVar4 = new t((float) (bVar.s() - 1), tVar2.d());
            }
            this.f22204a = bVar;
            this.f22205b = tVar;
            this.f22206c = tVar2;
            this.f22207d = tVar3;
            this.f22208e = tVar4;
            this.f22209f = (int) Math.min(tVar.c(), tVar2.c());
            this.f22210g = (int) Math.max(tVar3.c(), tVar4.c());
            this.f22211h = (int) Math.min(tVar.d(), tVar3.d());
            this.f22212i = (int) Math.max(tVar2.d(), tVar4.d());
            return;
        }
        throw m.a();
    }

    public static c j(c cVar, c cVar2) throws m {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new c(cVar.f22204a, cVar.f22205b, cVar.f22206c, cVar2.f22207d, cVar2.f22208e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qb.c a(int r13, int r14, boolean r15) throws qa.m {
        /*
            r12 = this;
            qa.t r0 = r12.f22205b
            qa.t r1 = r12.f22206c
            qa.t r2 = r12.f22207d
            qa.t r3 = r12.f22208e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            qa.t r13 = new qa.t
            float r4 = r4.c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            qa.t r13 = r12.f22206c
            goto L_0x0034
        L_0x0032:
            qa.t r13 = r12.f22208e
        L_0x0034:
            float r0 = r13.d()
            int r0 = (int) r0
            int r0 = r0 + r14
            ya.b r14 = r12.f22204a
            int r14 = r14.n()
            if (r0 < r14) goto L_0x004a
            ya.b r14 = r12.f22204a
            int r14 = r14.n()
            int r0 = r14 + -1
        L_0x004a:
            qa.t r14 = new qa.t
            float r13 = r13.c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            qb.c r13 = new qb.c
            ya.b r7 = r12.f22204a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.c.a(int, int, boolean):qb.c");
    }

    public t b() {
        return this.f22206c;
    }

    public t c() {
        return this.f22208e;
    }

    public int d() {
        return this.f22210g;
    }

    public int e() {
        return this.f22212i;
    }

    public int f() {
        return this.f22209f;
    }

    public int g() {
        return this.f22211h;
    }

    public t h() {
        return this.f22205b;
    }

    public t i() {
        return this.f22207d;
    }
}

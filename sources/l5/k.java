package l5;

import a6.b;
import a6.h;
import i5.g;
import i5.j;
import i5.x;
import i5.y;
import java.io.IOException;
import java.lang.annotation.Annotation;
import q5.l;
import u5.f;
import v4.d;

public class k extends v {

    /* renamed from: i0  reason: collision with root package name */
    public static final long f10165i0 = 1;

    /* renamed from: d0  reason: collision with root package name */
    public final l f10166d0;

    /* renamed from: e0  reason: collision with root package name */
    public final d.a f10167e0;

    /* renamed from: f0  reason: collision with root package name */
    public v f10168f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f10169g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f10170h0;

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(i5.y r13, i5.j r14, i5.y r15, u5.f r16, a6.b r17, q5.l r18, int r19, java.lang.Object r20, i5.x r21) {
        /*
            r12 = this;
            r0 = r20
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x000a
        L_0x0006:
            v4.d$a r1 = v4.d.a.c(r0, r1)
        L_0x000a:
            r10 = r1
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r11 = r21
            r2.<init>((i5.y) r3, (i5.j) r4, (i5.y) r5, (u5.f) r6, (a6.b) r7, (q5.l) r8, (int) r9, (v4.d.a) r10, (i5.x) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.k.<init>(i5.y, i5.j, i5.y, u5.f, a6.b, q5.l, int, java.lang.Object, i5.x):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(y yVar, j jVar, y yVar2, f fVar, b bVar, l lVar, int i10, d.a aVar, x xVar) {
        super(yVar, jVar, yVar2, fVar, bVar, xVar);
        this.f10166d0 = lVar;
        this.f10169g0 = i10;
        this.f10167e0 = aVar;
        this.f10168f0 = null;
    }

    public k(k kVar, i5.k<?> kVar2, s sVar) {
        super(kVar, kVar2, sVar);
        this.f10166d0 = kVar.f10166d0;
        this.f10167e0 = kVar.f10167e0;
        this.f10168f0 = kVar.f10168f0;
        this.f10169g0 = kVar.f10169g0;
        this.f10170h0 = kVar.f10170h0;
    }

    public k(k kVar, y yVar) {
        super(kVar, yVar);
        this.f10166d0 = kVar.f10166d0;
        this.f10167e0 = kVar.f10167e0;
        this.f10168f0 = kVar.f10168f0;
        this.f10169g0 = kVar.f10169g0;
        this.f10170h0 = kVar.f10170h0;
    }

    public static k Y(y yVar, j jVar, y yVar2, f fVar, b bVar, l lVar, int i10, d.a aVar, x xVar) {
        return new k(yVar, jVar, yVar2, fVar, bVar, lVar, i10, aVar, xVar);
    }

    public boolean J() {
        return this.f10170h0;
    }

    public boolean K() {
        d.a aVar = this.f10167e0;
        return aVar != null && !aVar.j(true);
    }

    public void L() {
        this.f10170h0 = true;
    }

    public void M(Object obj, Object obj2) throws IOException {
        X();
        this.f10168f0.M(obj, obj2);
    }

    public Object N(Object obj, Object obj2) throws IOException {
        X();
        return this.f10168f0.N(obj, obj2);
    }

    public v S(y yVar) {
        return new k(this, yVar);
    }

    public v T(s sVar) {
        return new k(this, this.V, sVar);
    }

    public v V(i5.k<?> kVar) {
        i5.k<Object> kVar2 = this.V;
        if (kVar2 == kVar) {
            return this;
        }
        s sVar = this.X;
        if (kVar2 == sVar) {
            sVar = kVar;
        }
        return new k(this, kVar, sVar);
    }

    public final void W(w4.l lVar, g gVar) throws IOException {
        String str = "No fallback setter/field defined for creator property '" + getName() + "'";
        if (gVar != null) {
            gVar.z(e(), str);
            return;
        }
        throw o5.b.C(lVar, str, e());
    }

    public final void X() throws IOException {
        if (this.f10168f0 == null) {
            W((w4.l) null, (g) null);
        }
    }

    @Deprecated
    public Object Z(g gVar, Object obj) throws i5.l {
        if (this.f10167e0 == null) {
            gVar.A(h.i(obj), String.format("Property '%s' (type %s) has no injectable value id configured", new Object[]{getName(), getClass().getName()}));
        }
        return gVar.M(this.f10167e0.g(), this, obj);
    }

    @Deprecated
    public void a0(g gVar, Object obj) throws IOException {
        M(obj, Z(gVar, obj));
    }

    public void b0(v vVar) {
        this.f10168f0 = vVar;
    }

    public x d() {
        x d10 = super.d();
        v vVar = this.f10168f0;
        return vVar != null ? d10.q(vVar.d().g()) : d10;
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        l lVar = this.f10166d0;
        if (lVar == null) {
            return null;
        }
        return lVar.d(cls);
    }

    public q5.h i() {
        return this.f10166d0;
    }

    public void t(w4.l lVar, g gVar, Object obj) throws IOException {
        X();
        this.f10168f0.M(obj, s(lVar, gVar));
    }

    public String toString() {
        return "[creator property, name '" + getName() + "'; inject id '" + z() + "']";
    }

    public Object u(w4.l lVar, g gVar, Object obj) throws IOException {
        X();
        return this.f10168f0.N(obj, s(lVar, gVar));
    }

    public void w(i5.f fVar) {
        v vVar = this.f10168f0;
        if (vVar != null) {
            vVar.w(fVar);
        }
    }

    public int x() {
        return this.f10169g0;
    }

    public Object z() {
        d.a aVar = this.f10167e0;
        if (aVar == null) {
            return null;
        }
        return aVar.g();
    }
}

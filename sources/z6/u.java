package z6;

import d.o0;
import t7.b0;
import t7.j;
import t7.l;
import t7.l0;
import u7.a;
import u7.b;
import u7.c;
import u7.d;
import u7.e;
import u7.i;
import w7.z;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final a f15982a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final i f15983b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final z f15984c;

    /* renamed from: d  reason: collision with root package name */
    public final e f15985d;

    /* renamed from: e  reason: collision with root package name */
    public final e f15986e;

    public u(a aVar, l.a aVar2) {
        this(aVar, aVar2, (l.a) null, (j.a) null, (z) null);
    }

    public u(a aVar, l.a aVar2, @o0 l.a aVar3, @o0 j.a aVar4, @o0 z zVar) {
        this(aVar, aVar2, aVar3, aVar4, zVar, (i) null);
    }

    public u(a aVar, l.a aVar2, @o0 l.a aVar3, @o0 j.a aVar4, @o0 z zVar, @o0 i iVar) {
        l0 l0Var;
        a aVar5 = aVar;
        z zVar2 = zVar;
        if (zVar2 != null) {
            l.a aVar6 = aVar2;
            l0Var = new l0(aVar2, zVar2, -1000);
        } else {
            l0Var = aVar2;
        }
        a aVar7 = aVar;
        l.a b0Var = aVar3 != null ? aVar3 : new b0();
        i iVar2 = iVar;
        this.f15985d = new e(aVar7, l0Var, b0Var, aVar4 == null ? new c(aVar, b.f13766l) : aVar4, 1, (d.b) null, iVar2);
        this.f15986e = new e(aVar7, t7.z.f13255c, b0Var, (j.a) null, 1, (d.b) null, iVar2);
        this.f15982a = aVar5;
        this.f15984c = zVar2;
        this.f15983b = iVar;
    }

    public d a() {
        return this.f15985d.a();
    }

    public d b() {
        return this.f15986e.a();
    }

    public a c() {
        return this.f15982a;
    }

    public i d() {
        i iVar = this.f15983b;
        return iVar != null ? iVar : u7.l.f13832b;
    }

    public z e() {
        z zVar = this.f15984c;
        return zVar != null ? zVar : new z();
    }
}

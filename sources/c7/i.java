package c7;

import b6.c;
import b6.x0;
import b7.s;
import d.g1;
import w7.a;

@g1(otherwise = 3)
public final class i extends s {

    /* renamed from: c  reason: collision with root package name */
    public final a f4921c;

    public i(x0 x0Var, a aVar) {
        super(x0Var);
        boolean z10 = false;
        a.i(x0Var.i() == 1);
        a.i(x0Var.q() == 1 ? true : z10);
        this.f4921c = aVar;
    }

    public x0.b g(int i10, x0.b bVar, boolean z10) {
        this.f4694b.g(i10, bVar, z10);
        bVar.q(bVar.f4492a, bVar.f4493b, bVar.f4494c, bVar.f4495d, bVar.m(), this.f4921c);
        return bVar;
    }

    public x0.c p(int i10, x0.c cVar, boolean z10, long j10) {
        x0.c p10 = super.p(i10, cVar, z10, j10);
        if (p10.f4506i == c.f4201b) {
            p10.f4506i = this.f4921c.f4899e;
        }
        return p10;
    }
}

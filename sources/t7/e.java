package t7;

import d.o0;
import java.util.ArrayList;
import java.util.Map;
import w7.q0;

public abstract class e implements l {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13058b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<r0> f13059c = new ArrayList<>(1);

    /* renamed from: d  reason: collision with root package name */
    public int f13060d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public o f13061e;

    public e(boolean z10) {
        this.f13058b = z10;
    }

    public /* synthetic */ Map b() {
        return k.a(this);
    }

    public final void d(r0 r0Var) {
        if (!this.f13059c.contains(r0Var)) {
            this.f13059c.add(r0Var);
            this.f13060d++;
        }
    }

    public final void h(int i10) {
        o oVar = (o) q0.l(this.f13061e);
        for (int i11 = 0; i11 < this.f13060d; i11++) {
            this.f13059c.get(i11).c(this, oVar, this.f13058b, i10);
        }
    }

    public final void i() {
        o oVar = (o) q0.l(this.f13061e);
        for (int i10 = 0; i10 < this.f13060d; i10++) {
            this.f13059c.get(i10).a(this, oVar, this.f13058b);
        }
        this.f13061e = null;
    }

    public final void j(o oVar) {
        for (int i10 = 0; i10 < this.f13060d; i10++) {
            this.f13059c.get(i10).h(this, oVar, this.f13058b);
        }
    }

    public final void k(o oVar) {
        this.f13061e = oVar;
        for (int i10 = 0; i10 < this.f13060d; i10++) {
            this.f13059c.get(i10).d(this, oVar, this.f13058b);
        }
    }
}

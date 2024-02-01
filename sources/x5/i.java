package x5;

import c5.m;
import i5.j;
import i5.o;
import i5.y;
import v4.l0;
import w4.u;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final j f15090a;

    /* renamed from: b  reason: collision with root package name */
    public final u f15091b;

    /* renamed from: c  reason: collision with root package name */
    public final l0<?> f15092c;

    /* renamed from: d  reason: collision with root package name */
    public final o<Object> f15093d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f15094e;

    public i(j jVar, u uVar, l0<?> l0Var, o<?> oVar, boolean z10) {
        this.f15090a = jVar;
        this.f15091b = uVar;
        this.f15092c = l0Var;
        this.f15093d = oVar;
        this.f15094e = z10;
    }

    public static i a(j jVar, y yVar, l0<?> l0Var, boolean z10) {
        m mVar = null;
        String d10 = yVar == null ? null : yVar.d();
        if (d10 != null) {
            mVar = new m(d10);
        }
        return new i(jVar, mVar, l0Var, (o<?>) null, z10);
    }

    public i b(boolean z10) {
        return z10 == this.f15094e ? this : new i(this.f15090a, this.f15091b, this.f15092c, this.f15093d, z10);
    }

    public i c(o<?> oVar) {
        return new i(this.f15090a, this.f15091b, this.f15092c, oVar, this.f15094e);
    }
}

package m5;

import i5.g;
import java.io.IOException;
import l5.v;
import q5.h;
import w4.l;

public class n extends v.a {

    /* renamed from: f0  reason: collision with root package name */
    public static final long f10435f0 = 1;

    /* renamed from: e0  reason: collision with root package name */
    public final h f10436e0;

    public n(v vVar, h hVar) {
        super(vVar);
        this.f10436e0 = hVar;
    }

    public n(n nVar, v vVar) {
        super(vVar);
        this.f10436e0 = nVar.f10436e0;
    }

    public static n Z(v vVar, h hVar) {
        return new n(vVar, hVar);
    }

    public void M(Object obj, Object obj2) throws IOException {
        if (obj2 != null) {
            this.f10194d0.M(obj, obj2);
        }
    }

    public Object N(Object obj, Object obj2) throws IOException {
        return obj2 != null ? this.f10194d0.N(obj, obj2) : obj;
    }

    public v Y(v vVar) {
        return new n(vVar, this.f10436e0);
    }

    public void t(l lVar, g gVar, Object obj) throws IOException {
        Object r10 = this.f10436e0.r(obj);
        v vVar = this.f10194d0;
        Object s10 = r10 == null ? vVar.s(lVar, gVar) : vVar.v(lVar, gVar, r10);
        if (s10 != r10) {
            this.f10194d0.M(obj, s10);
        }
    }

    public Object u(l lVar, g gVar, Object obj) throws IOException {
        Object r10 = this.f10436e0.r(obj);
        v vVar = this.f10194d0;
        Object s10 = r10 == null ? vVar.s(lVar, gVar) : vVar.v(lVar, gVar, r10);
        return (s10 == r10 || s10 == null) ? obj : this.f10194d0.N(obj, s10);
    }
}

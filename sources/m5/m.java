package m5;

import i5.f;
import i5.g;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import l5.v;
import w4.l;

public final class m extends v.a {

    /* renamed from: h0  reason: collision with root package name */
    public static final long f10431h0 = 1;

    /* renamed from: e0  reason: collision with root package name */
    public final String f10432e0;

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f10433f0;

    /* renamed from: g0  reason: collision with root package name */
    public final v f10434g0;

    public m(v vVar, String str, v vVar2, boolean z10) {
        super(vVar);
        this.f10432e0 = str;
        this.f10434g0 = vVar2;
        this.f10433f0 = z10;
    }

    public final void M(Object obj, Object obj2) throws IOException {
        N(obj, obj2);
    }

    public Object N(Object obj, Object obj2) throws IOException {
        if (obj2 != null) {
            if (!this.f10433f0) {
                this.f10434g0.M(obj2, obj);
            } else if (obj2 instanceof Object[]) {
                for (Object obj3 : (Object[]) obj2) {
                    if (obj3 != null) {
                        this.f10434g0.M(obj3, obj);
                    }
                }
            } else if (obj2 instanceof Collection) {
                for (Object next : (Collection) obj2) {
                    if (next != null) {
                        this.f10434g0.M(next, obj);
                    }
                }
            } else if (obj2 instanceof Map) {
                for (Object next2 : ((Map) obj2).values()) {
                    if (next2 != null) {
                        this.f10434g0.M(next2, obj);
                    }
                }
            } else {
                throw new IllegalStateException("Unsupported container type (" + obj2.getClass().getName() + ") when resolving reference '" + this.f10432e0 + "'");
            }
        }
        return this.f10194d0.N(obj, obj2);
    }

    public v Y(v vVar) {
        throw new IllegalStateException("Should never try to reset delegate");
    }

    public void t(l lVar, g gVar, Object obj) throws IOException {
        M(obj, this.f10194d0.s(lVar, gVar));
    }

    public Object u(l lVar, g gVar, Object obj) throws IOException {
        return N(obj, s(lVar, gVar));
    }

    public void w(f fVar) {
        this.f10194d0.w(fVar);
        this.f10434g0.w(fVar);
    }
}

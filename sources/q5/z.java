package q5;

import a6.h;
import i5.y;
import v4.l0;
import v4.n0;
import v4.q0;

public class z {

    /* renamed from: f  reason: collision with root package name */
    public static final z f11996f = new z(y.V, Object.class, (Class<? extends l0<?>>) null, false, (Class<? extends n0>) null);

    /* renamed from: a  reason: collision with root package name */
    public final y f11997a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<? extends l0<?>> f11998b;

    /* renamed from: c  reason: collision with root package name */
    public final Class<? extends n0> f11999c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<?> f12000d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12001e;

    public z(y yVar, Class<?> cls, Class<? extends l0<?>> cls2, Class<? extends n0> cls3) {
        this(yVar, cls, cls2, false, cls3);
    }

    public z(y yVar, Class<?> cls, Class<? extends l0<?>> cls2, boolean z10) {
        this(yVar, cls, cls2, z10, q0.class);
    }

    public z(y yVar, Class<?> cls, Class<? extends l0<?>> cls2, boolean z10, Class<? extends n0> cls3) {
        this.f11997a = yVar;
        this.f12000d = cls;
        this.f11998b = cls2;
        this.f12001e = z10;
        this.f11999c = cls3 == null ? q0.class : cls3;
    }

    public static z a() {
        return f11996f;
    }

    public boolean b() {
        return this.f12001e;
    }

    public Class<? extends l0<?>> c() {
        return this.f11998b;
    }

    public y d() {
        return this.f11997a;
    }

    public Class<? extends n0> e() {
        return this.f11999c;
    }

    public Class<?> f() {
        return this.f12000d;
    }

    public z g(boolean z10) {
        if (this.f12001e == z10) {
            return this;
        }
        return new z(this.f11997a, this.f12000d, this.f11998b, z10, this.f11999c);
    }

    public String toString() {
        return "ObjectIdInfo: propName=" + this.f11997a + ", scope=" + h.e0(this.f12000d) + ", generatorType=" + h.e0(this.f11998b) + ", alwaysAsId=" + this.f12001e;
    }
}

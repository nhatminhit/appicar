package v5;

import i5.c0;
import i5.d;
import i5.j;
import i5.q;
import java.util.Collection;
import u5.c;
import u5.d;
import u5.f;
import u5.g;
import u5.h;
import u5.i;
import v4.f0;

public class n implements h<n> {
    public f0.b O;
    public f0.a P;
    public String Q;
    public boolean R = false;
    public Class<?> S;
    public g T;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14183a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f14184b;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        static {
            /*
                v4.f0$b[] r0 = v4.f0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14184b = r0
                r1 = 1
                v4.f0$b r2 = v4.f0.b.CLASS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f14184b     // Catch:{ NoSuchFieldError -> 0x001d }
                v4.f0$b r3 = v4.f0.b.MINIMAL_CLASS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f14184b     // Catch:{ NoSuchFieldError -> 0x0028 }
                v4.f0$b r4 = v4.f0.b.NAME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f14184b     // Catch:{ NoSuchFieldError -> 0x0033 }
                v4.f0$b r5 = v4.f0.b.NONE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f14184b     // Catch:{ NoSuchFieldError -> 0x003e }
                v4.f0$b r6 = v4.f0.b.CUSTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                v4.f0$a[] r5 = v4.f0.a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f14183a = r5
                v4.f0$a r6 = v4.f0.a.WRAPPER_ARRAY     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f14183a     // Catch:{ NoSuchFieldError -> 0x0059 }
                v4.f0$a r5 = v4.f0.a.PROPERTY     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f14183a     // Catch:{ NoSuchFieldError -> 0x0063 }
                v4.f0$a r1 = v4.f0.a.WRAPPER_OBJECT     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f14183a     // Catch:{ NoSuchFieldError -> 0x006d }
                v4.f0$a r1 = v4.f0.a.EXTERNAL_PROPERTY     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f14183a     // Catch:{ NoSuchFieldError -> 0x0077 }
                v4.f0$a r1 = v4.f0.a.EXISTING_PROPERTY     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v5.n.a.<clinit>():void");
        }
    }

    public n() {
    }

    public n(f0.b bVar, f0.a aVar, String str) {
        this.O = bVar;
        this.P = aVar;
        this.Q = str;
    }

    public static n q() {
        return new n().e(f0.b.NONE, (g) null);
    }

    public f c(i5.f fVar, j jVar, Collection<c> collection) {
        if (this.O == f0.b.NONE) {
            return null;
        }
        if (jVar.u() && !i(fVar, jVar)) {
            return null;
        }
        g m10 = m(fVar, jVar, v(fVar, jVar), collection, false, true);
        j k10 = k(fVar, jVar);
        int i10 = a.f14183a[this.P.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return new h(jVar, m10, this.Q, this.R, k10);
                } else if (i10 == 4) {
                    return new d(jVar, m10, this.Q, this.R, k10);
                } else if (i10 != 5) {
                    throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.P);
                }
            }
            return new f(jVar, m10, this.Q, this.R, k10, this.P);
        }
        return new a(jVar, m10, this.Q, this.R, k10);
    }

    public Class<?> g() {
        return this.S;
    }

    public i h(c0 c0Var, j jVar, Collection<c> collection) {
        if (this.O == f0.b.NONE) {
            return null;
        }
        if (jVar.u() && !i(c0Var, jVar)) {
            return null;
        }
        g m10 = m(c0Var, jVar, s(c0Var), collection, true, false);
        int i10 = a.f14183a[this.P.ordinal()];
        if (i10 == 1) {
            return new b(m10, (d) null);
        }
        if (i10 == 2) {
            return new g(m10, (d) null, this.Q);
        }
        if (i10 == 3) {
            return new i(m10, (d) null);
        }
        if (i10 == 4) {
            return new e(m10, (d) null, this.Q);
        }
        if (i10 == 5) {
            return new c(m10, (d) null, this.Q);
        }
        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.P);
    }

    public boolean i(k5.i<?> iVar, j jVar) {
        return false;
    }

    /* renamed from: j */
    public n d(Class<?> cls) {
        this.S = cls;
        return this;
    }

    public j k(i5.f fVar, j jVar) {
        Class<?> cls = this.S;
        if (cls == null) {
            if (fVar.T(q.USE_BASE_TYPE_AS_DEFAULT_IMPL) && !jVar.k()) {
                return jVar;
            }
        } else if (cls == Void.class || cls == j5.j.class) {
            return fVar.M().Y(this.S);
        } else {
            if (jVar.j(cls)) {
                return jVar;
            }
            if (jVar.Z(this.S)) {
                return fVar.M().V(jVar, this.S);
            }
        }
        return null;
    }

    public String l() {
        return this.Q;
    }

    public g m(k5.i<?> iVar, j jVar, u5.d dVar, Collection<c> collection, boolean z10, boolean z11) {
        g gVar = this.T;
        if (gVar != null) {
            return gVar;
        }
        f0.b bVar = this.O;
        if (bVar != null) {
            int i10 = a.f14184b[bVar.ordinal()];
            if (i10 == 1) {
                return j.j(jVar, iVar, dVar);
            }
            if (i10 == 2) {
                return l.l(jVar, iVar, dVar);
            }
            if (i10 == 3) {
                return r.j(iVar, jVar, collection, z10, z11);
            }
            if (i10 == 4) {
                return null;
            }
            throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this.O);
        }
        throw new IllegalStateException("Cannot build, 'init()' not yet called");
    }

    /* renamed from: n */
    public n f(f0.a aVar) {
        if (aVar != null) {
            this.P = aVar;
            return this;
        }
        throw new IllegalArgumentException("includeAs cannot be null");
    }

    /* renamed from: o */
    public n e(f0.b bVar, g gVar) {
        if (bVar != null) {
            this.O = bVar;
            this.T = gVar;
            this.Q = bVar.a();
            return this;
        }
        throw new IllegalArgumentException("idType cannot be null");
    }

    public boolean p() {
        return this.R;
    }

    public u5.d r(k5.i<?> iVar, j jVar, u5.d dVar) {
        throw new IllegalArgumentException(String.format("Configured `PolymorphicTypeValidator` (of type %s) denied resolution of all subtypes of base type %s", new Object[]{a6.h.h(dVar), a6.h.h(jVar.g())}));
    }

    public u5.d s(k5.i<?> iVar) {
        return iVar.I();
    }

    /* renamed from: t */
    public n a(boolean z10) {
        this.R = z10;
        return this;
    }

    /* renamed from: u */
    public n b(String str) {
        if (str == null || str.length() == 0) {
            str = this.O.a();
        }
        this.Q = str;
        return this;
    }

    public u5.d v(k5.i<?> iVar, j jVar) {
        u5.d s10 = s(iVar);
        f0.b bVar = this.O;
        if (bVar == f0.b.CLASS || bVar == f0.b.MINIMAL_CLASS) {
            d.b a10 = s10.a(iVar, jVar);
            if (a10 == d.b.DENIED) {
                return r(iVar, jVar, s10);
            }
            if (a10 == d.b.ALLOWED) {
                return k.R;
            }
        }
        return s10;
    }
}

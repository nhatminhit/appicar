package x5;

import a6.e;
import com.fasterxml.jackson.databind.ser.i;
import com.fasterxml.jackson.databind.ser.j;
import g5.c;
import i5.b;
import i5.d;
import i5.e0;
import i5.l;
import i5.o;
import java.io.IOException;
import java.util.Map;
import q5.s;
import v4.u;
import w4.p;
import x5.k;

@j5.a
public class h extends i<Map.Entry<?, ?>> implements j {

    /* renamed from: c0  reason: collision with root package name */
    public static final Object f15086c0 = u.a.NON_EMPTY;
    public final d R;
    public final boolean S;
    public final i5.j T;
    public final i5.j U;
    public final i5.j V;
    public o<Object> W;
    public o<Object> X;
    public final u5.i Y;
    public k Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Object f15087a0;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f15088b0;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15089a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                v4.u$a[] r0 = v4.u.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15089a = r0
                v4.u$a r1 = v4.u.a.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15089a     // Catch:{ NoSuchFieldError -> 0x001d }
                v4.u$a r1 = v4.u.a.NON_ABSENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15089a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v4.u$a r1 = v4.u.a.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15089a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v4.u$a r1 = v4.u.a.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15089a     // Catch:{ NoSuchFieldError -> 0x003e }
                v4.u$a r1 = v4.u.a.NON_NULL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15089a     // Catch:{ NoSuchFieldError -> 0x0049 }
                v4.u$a r1 = v4.u.a.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x5.h.a.<clinit>():void");
        }
    }

    public h(i5.j jVar, i5.j jVar2, i5.j jVar3, boolean z10, u5.i iVar, d dVar) {
        super(jVar);
        this.T = jVar;
        this.U = jVar2;
        this.V = jVar3;
        this.S = z10;
        this.Y = iVar;
        this.R = dVar;
        this.Z = k.c();
        this.f15087a0 = null;
        this.f15088b0 = false;
    }

    @Deprecated
    public h(h hVar, d dVar, u5.i iVar, o<?> oVar, o<?> oVar2) {
        this(hVar, dVar, iVar, oVar, oVar2, hVar.f15087a0, hVar.f15088b0);
    }

    public h(h hVar, d dVar, u5.i iVar, o<?> oVar, o<?> oVar2, Object obj, boolean z10) {
        super(Map.class, false);
        this.T = hVar.T;
        this.U = hVar.U;
        this.V = hVar.V;
        this.S = hVar.S;
        this.Y = hVar.Y;
        this.W = oVar;
        this.X = oVar2;
        this.Z = k.c();
        this.R = hVar.R;
        this.f15087a0 = obj;
        this.f15088b0 = z10;
    }

    public i<?> M(u5.i iVar) {
        return new h(this, this.R, iVar, this.W, this.X, this.f15087a0, this.f15088b0);
    }

    public o<?> N() {
        return this.X;
    }

    public i5.j O() {
        return this.V;
    }

    public final o<Object> S(k kVar, i5.j jVar, e0 e0Var) throws l {
        k.d k10 = kVar.k(jVar, e0Var, this.R);
        k kVar2 = k10.f15105b;
        if (kVar != kVar2) {
            this.Z = kVar2;
        }
        return k10.f15104a;
    }

    public final o<Object> T(k kVar, Class<?> cls, e0 e0Var) throws l {
        k.d l10 = kVar.l(cls, e0Var, this.R);
        k kVar2 = l10.f15105b;
        if (kVar != kVar2) {
            this.Z = kVar2;
        }
        return l10.f15104a;
    }

    /* renamed from: U */
    public boolean Q(Map.Entry<?, ?> entry) {
        return true;
    }

    /* renamed from: V */
    public boolean h(e0 e0Var, Map.Entry<?, ?> entry) {
        Object value = entry.getValue();
        if (value == null) {
            return this.f15088b0;
        }
        if (this.f15087a0 == null) {
            return false;
        }
        o<Object> oVar = this.X;
        if (oVar == null) {
            Class<?> cls = value.getClass();
            o<Object> n10 = this.Z.n(cls);
            if (n10 == null) {
                try {
                    oVar = T(this.Z, cls, e0Var);
                } catch (l unused) {
                    return false;
                }
            } else {
                oVar = n10;
            }
        }
        Object obj = this.f15087a0;
        return obj == f15086c0 ? oVar.h(e0Var, value) : obj.equals(value);
    }

    /* renamed from: W */
    public void m(Map.Entry<?, ?> entry, w4.i iVar, e0 e0Var) throws IOException {
        iVar.W2(entry);
        X(entry, iVar, e0Var);
        iVar.g2();
    }

    public void X(Map.Entry<?, ?> entry, w4.i iVar, e0 e0Var) throws IOException {
        o<Object> oVar;
        u5.i iVar2 = this.Y;
        Object key = entry.getKey();
        o<Object> X2 = key == null ? e0Var.X(this.U, this.R) : this.W;
        Object value = entry.getValue();
        if (value != null) {
            oVar = this.X;
            if (oVar == null) {
                Class<?> cls = value.getClass();
                o<Object> n10 = this.Z.n(cls);
                oVar = n10 == null ? this.V.i() ? S(this.Z, e0Var.k(this.V, cls), e0Var) : T(this.Z, cls, e0Var) : n10;
            }
            Object obj = this.f15087a0;
            if (obj != null && ((obj == f15086c0 && oVar.h(e0Var, value)) || this.f15087a0.equals(value))) {
                return;
            }
        } else if (!this.f15088b0) {
            oVar = e0Var.l0();
        } else {
            return;
        }
        X2.m(key, iVar, e0Var);
        if (iVar2 == null) {
            try {
                oVar.m(value, iVar, e0Var);
            } catch (Exception e10) {
                L(e0Var, e10, entry, "" + key);
            }
        } else {
            oVar.n(value, iVar, e0Var, iVar2);
        }
    }

    /* renamed from: Y */
    public void n(Map.Entry<?, ?> entry, w4.i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        iVar.A1(entry);
        c o10 = iVar2.o(iVar, iVar2.g(entry, p.START_OBJECT));
        X(entry, iVar, e0Var);
        iVar2.v(iVar, o10);
    }

    public h Z(Object obj, boolean z10) {
        if (this.f15087a0 == obj && this.f15088b0 == z10) {
            return this;
        }
        return new h(this, this.R, this.Y, this.W, this.X, obj, z10);
    }

    public h a0(d dVar, o<?> oVar, o<?> oVar2, Object obj, boolean z10) {
        return new h(this, dVar, this.Y, oVar, oVar2, obj, z10);
    }

    public o<?> d(e0 e0Var, d dVar) throws l {
        o oVar;
        o oVar2;
        boolean z10;
        Object obj;
        u.b n10;
        u.a g10;
        boolean v02;
        b o10 = e0Var.o();
        Object obj2 = null;
        q5.h i10 = dVar == null ? null : dVar.i();
        if (i10 == null || o10 == null) {
            oVar2 = null;
            oVar = null;
        } else {
            Object D = o10.D(i10);
            oVar = D != null ? e0Var.G0(i10, D) : null;
            Object j10 = o10.j(i10);
            oVar2 = j10 != null ? e0Var.G0(i10, j10) : null;
        }
        if (oVar2 == null) {
            oVar2 = this.X;
        }
        o w10 = w(e0Var, dVar, oVar2);
        if (w10 == null && this.S && !this.V.X()) {
            w10 = e0Var.T(this.V, dVar);
        }
        o oVar3 = w10;
        if (oVar == null) {
            oVar = this.W;
        }
        o V2 = oVar == null ? e0Var.V(this.U, dVar) : e0Var.s0(oVar, dVar);
        Object obj3 = this.f15087a0;
        boolean z11 = this.f15088b0;
        if (dVar == null || (n10 = dVar.n(e0Var.q(), (Class<?>) null)) == null || (g10 = n10.g()) == u.a.USE_DEFAULTS) {
            obj = obj3;
            z10 = z11;
        } else {
            int i11 = a.f15089a[g10.ordinal()];
            if (i11 == 1) {
                obj2 = e.a(this.V);
                if (obj2 != null && obj2.getClass().isArray()) {
                    obj2 = a6.c.b(obj2);
                }
            } else if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        obj2 = e0Var.u0((s) null, n10.f());
                        if (obj2 != null) {
                            v02 = e0Var.v0(obj2);
                        }
                    } else if (i11 != 5) {
                        v02 = false;
                    }
                    z10 = v02;
                    obj = obj2;
                } else {
                    obj2 = f15086c0;
                }
            } else if (this.V.v()) {
                obj2 = f15086c0;
            }
            obj = obj2;
            z10 = true;
        }
        return a0(dVar, V2, oVar3, obj, z10);
    }
}

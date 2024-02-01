package w;

import java.util.Arrays;
import java.util.Comparator;
import w.b;

public class h extends b {

    /* renamed from: o  reason: collision with root package name */
    public static final float f14302o = 1.0E-4f;

    /* renamed from: p  reason: collision with root package name */
    public static final boolean f14303p = false;

    /* renamed from: q  reason: collision with root package name */
    public static final int f14304q = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f14305i = 128;

    /* renamed from: j  reason: collision with root package name */
    public i[] f14306j = new i[128];

    /* renamed from: k  reason: collision with root package name */
    public i[] f14307k = new i[128];

    /* renamed from: l  reason: collision with root package name */
    public int f14308l = 0;

    /* renamed from: m  reason: collision with root package name */
    public b f14309m = new b(this);

    /* renamed from: n  reason: collision with root package name */
    public c f14310n;

    public class a implements Comparator<i> {
        public a() {
        }

        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            return iVar.f14322c - iVar2.f14322c;
        }
    }

    public class b implements Comparable {
        public i O;
        public h P;

        public b(h hVar) {
            this.P = hVar;
        }

        public void a(i iVar) {
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.O.f14328i;
                float f10 = fArr[i10] + iVar.f14328i[i10];
                fArr[i10] = f10;
                if (Math.abs(f10) < 1.0E-4f) {
                    this.O.f14328i[i10] = 0.0f;
                }
            }
        }

        public boolean b(i iVar, float f10) {
            boolean z10 = true;
            if (this.O.f14320a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr = this.O.f14328i;
                    float f11 = fArr[i10] + (iVar.f14328i[i10] * f10);
                    fArr[i10] = f11;
                    if (Math.abs(f11) < 1.0E-4f) {
                        this.O.f14328i[i10] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    h.this.J(this.O);
                }
                return false;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float f12 = iVar.f14328i[i11];
                if (f12 != 0.0f) {
                    float f13 = f12 * f10;
                    if (Math.abs(f13) < 1.0E-4f) {
                        f13 = 0.0f;
                    }
                    this.O.f14328i[i11] = f13;
                } else {
                    this.O.f14328i[i11] = 0.0f;
                }
            }
            return true;
        }

        public int compareTo(Object obj) {
            return this.O.f14322c - ((i) obj).f14322c;
        }

        public void d(i iVar) {
            this.O = iVar;
        }

        public final boolean e() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.O.f14328i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean i() {
            for (int i10 = 0; i10 < 9; i10++) {
                if (this.O.f14328i[i10] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean j(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.f14328i[i10];
                float f11 = this.O.f14328i[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void k() {
            Arrays.fill(this.O.f14328i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.O != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.O.f14328i[i10] + " ";
                }
            }
            return str + "] " + this.O;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f14310n = cVar;
    }

    public final void I(i iVar) {
        int i10;
        int i11 = this.f14308l + 1;
        i[] iVarArr = this.f14306j;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f14306j = iVarArr2;
            this.f14307k = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f14306j;
        int i12 = this.f14308l;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f14308l = i13;
        if (i13 > 1 && iVarArr3[i13 - 1].f14322c > iVar.f14322c) {
            int i14 = 0;
            while (true) {
                i10 = this.f14308l;
                if (i14 >= i10) {
                    break;
                }
                this.f14307k[i14] = this.f14306j[i14];
                i14++;
            }
            Arrays.sort(this.f14307k, 0, i10, new a());
            for (int i15 = 0; i15 < this.f14308l; i15++) {
                this.f14306j[i15] = this.f14307k[i15];
            }
        }
        iVar.f14320a = true;
        iVar.a(this);
    }

    public final void J(i iVar) {
        int i10 = 0;
        while (i10 < this.f14308l) {
            if (this.f14306j[i10] == iVar) {
                while (true) {
                    int i11 = this.f14308l;
                    if (i10 < i11 - 1) {
                        i[] iVarArr = this.f14306j;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f14308l = i11 - 1;
                        iVar.f14320a = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    public i c(e eVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f14308l; i11++) {
            i iVar = this.f14306j[i11];
            if (!zArr[iVar.f14322c]) {
                this.f14309m.d(iVar);
                b bVar = this.f14309m;
                if (i10 == -1) {
                    if (!bVar.e()) {
                    }
                } else if (!bVar.j(this.f14306j[i10])) {
                }
                i10 = i11;
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f14306j[i10];
    }

    public void clear() {
        this.f14308l = 0;
        this.f14237b = 0.0f;
    }

    public void e(i iVar) {
        this.f14309m.d(iVar);
        this.f14309m.k();
        iVar.f14328i[iVar.f14324e] = 1.0f;
        I(iVar);
    }

    public void f(e eVar, b bVar, boolean z10) {
        i iVar = bVar.f14236a;
        if (iVar != null) {
            b.a aVar = bVar.f14240e;
            int d10 = aVar.d();
            for (int i10 = 0; i10 < d10; i10++) {
                i h10 = aVar.h(i10);
                float j10 = aVar.j(i10);
                this.f14309m.d(h10);
                if (this.f14309m.b(iVar, j10)) {
                    I(h10);
                }
                this.f14237b += bVar.f14237b * j10;
            }
            J(iVar);
        }
    }

    public boolean isEmpty() {
        return this.f14308l == 0;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f14237b + ") : ";
        for (int i10 = 0; i10 < this.f14308l; i10++) {
            this.f14309m.d(this.f14306j[i10]);
            str = str + this.f14309m + " ";
        }
        return str;
    }
}

package kb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import qa.e;
import qa.m;
import qa.t;
import qa.u;
import wb.d;
import wb.f;
import wb.g;

public final class b extends f {

    /* renamed from: j  reason: collision with root package name */
    public static final g[] f20093j = new g[0];

    /* renamed from: k  reason: collision with root package name */
    public static final d[] f20094k = new d[0];

    /* renamed from: l  reason: collision with root package name */
    public static final d[][] f20095l = new d[0][];

    /* renamed from: m  reason: collision with root package name */
    public static final float f20096m = 180.0f;

    /* renamed from: n  reason: collision with root package name */
    public static final float f20097n = 9.0f;

    /* renamed from: o  reason: collision with root package name */
    public static final float f20098o = 0.05f;

    /* renamed from: p  reason: collision with root package name */
    public static final float f20099p = 0.5f;

    /* renamed from: kb.b$b  reason: collision with other inner class name */
    public static final class C0344b implements Serializable, Comparator<d> {
        public C0344b() {
        }

        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            double i10 = (double) (dVar2.i() - dVar.i());
            if (i10 < 0.0d) {
                return -1;
            }
            return i10 > 0.0d ? 1 : 0;
        }
    }

    public b(ya.b bVar, u uVar) {
        super(bVar, uVar);
    }

    public g[] u(Map<e, ?> map) throws m {
        boolean z10 = map != null && map.containsKey(e.TRY_HARDER);
        ya.b m10 = m();
        int n10 = m10.n();
        int s10 = m10.s();
        int i10 = (n10 * 3) / dg.a.Mt;
        if (i10 < 3 || z10) {
            i10 = 3;
        }
        int[] iArr = new int[5];
        for (int i11 = i10 - 1; i11 < n10; i11 += i10) {
            f.f(iArr);
            int i12 = 0;
            for (int i13 = 0; i13 < s10; i13++) {
                if (m10.j(i13, i11)) {
                    if ((i12 & 1) == 1) {
                        i12++;
                    }
                    iArr[i12] = iArr[i12] + 1;
                } else if ((i12 & 1) != 0) {
                    iArr[i12] = iArr[i12] + 1;
                } else if (i12 != 4) {
                    i12++;
                    iArr[i12] = iArr[i12] + 1;
                } else if (!f.j(iArr) || !o(iArr, i11, i13)) {
                    f.g(iArr);
                    i12 = 3;
                } else {
                    f.f(iArr);
                    i12 = 0;
                }
            }
            if (f.j(iArr)) {
                o(iArr, i11, s10);
            }
        }
        d[][] v10 = v();
        ArrayList arrayList = new ArrayList();
        for (d[] dVarArr : v10) {
            t.e(dVarArr);
            arrayList.add(new g(dVarArr));
        }
        return arrayList.isEmpty() ? f20093j : (g[]) arrayList.toArray(f20093j);
    }

    public final d[][] v() throws m {
        List<d> n10 = n();
        int size = n10.size();
        int i10 = 3;
        if (size >= 3) {
            char c10 = 0;
            if (size == 3) {
                return new d[][]{(d[]) n10.toArray(f20094k)};
            }
            Collections.sort(n10, new C0344b());
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (i11 < size - 2) {
                d dVar = n10.get(i11);
                if (dVar != null) {
                    int i12 = i11 + 1;
                    while (i12 < size - 1) {
                        d dVar2 = n10.get(i12);
                        if (dVar2 != null) {
                            float i13 = (dVar.i() - dVar2.i()) / Math.min(dVar.i(), dVar2.i());
                            float f10 = 0.5f;
                            float f11 = 0.05f;
                            if (Math.abs(dVar.i() - dVar2.i()) > 0.5f && i13 >= 0.05f) {
                                break;
                            }
                            int i14 = i12 + 1;
                            while (i14 < size) {
                                d dVar3 = n10.get(i14);
                                if (dVar3 != null) {
                                    float i15 = (dVar2.i() - dVar3.i()) / Math.min(dVar2.i(), dVar3.i());
                                    if (Math.abs(dVar2.i() - dVar3.i()) > f10 && i15 >= f11) {
                                        break;
                                    }
                                    d[] dVarArr = new d[i10];
                                    dVarArr[c10] = dVar;
                                    dVarArr[1] = dVar2;
                                    dVarArr[2] = dVar3;
                                    t.e(dVarArr);
                                    g gVar = new g(dVarArr);
                                    float b10 = t.b(gVar.b(), gVar.a());
                                    float b11 = t.b(gVar.c(), gVar.a());
                                    float b12 = t.b(gVar.b(), gVar.c());
                                    float i16 = (b10 + b12) / (dVar.i() * 2.0f);
                                    if (i16 <= 180.0f && i16 >= 9.0f && Math.abs((b10 - b12) / Math.min(b10, b12)) < 0.1f) {
                                        double d10 = (double) b10;
                                        double d11 = (double) b12;
                                        float sqrt = (float) Math.sqrt((d10 * d10) + (d11 * d11));
                                        if (Math.abs((b11 - sqrt) / Math.min(b11, sqrt)) < 0.1f) {
                                            arrayList.add(dVarArr);
                                        }
                                    }
                                }
                                i14++;
                                i10 = 3;
                                c10 = 0;
                                f10 = 0.5f;
                                f11 = 0.05f;
                            }
                        }
                        i12++;
                        i10 = 3;
                        c10 = 0;
                    }
                }
                i11++;
                i10 = 3;
                c10 = 0;
            }
            if (!arrayList.isEmpty()) {
                return (d[][]) arrayList.toArray(f20095l);
            }
            throw m.a();
        }
        throw m.a();
    }
}

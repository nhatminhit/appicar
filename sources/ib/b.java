package ib;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import qa.c;
import qa.e;
import qa.m;
import qa.p;
import qa.q;
import qa.r;
import qa.t;

public final class b implements c {

    /* renamed from: b  reason: collision with root package name */
    public static final int f19685b = 100;

    /* renamed from: c  reason: collision with root package name */
    public static final int f19686c = 4;

    /* renamed from: d  reason: collision with root package name */
    public static final r[] f19687d = new r[0];

    /* renamed from: a  reason: collision with root package name */
    public final p f19688a;

    public b(p pVar) {
        this.f19688a = pVar;
    }

    public static r b(r rVar, int i10, int i11) {
        t[] f10 = rVar.f();
        if (f10 == null) {
            return rVar;
        }
        t[] tVarArr = new t[f10.length];
        for (int i12 = 0; i12 < f10.length; i12++) {
            t tVar = f10[i12];
            if (tVar != null) {
                tVarArr[i12] = new t(tVar.c() + ((float) i10), tVar.d() + ((float) i11));
            }
        }
        r rVar2 = new r(rVar.g(), rVar.d(), rVar.c(), tVarArr, rVar.b(), rVar.h());
        rVar2.i(rVar.e());
        return rVar2;
    }

    public final void a(c cVar, Map<e, ?> map, List<r> list, int i10, int i11, int i12) {
        boolean z10;
        int i13;
        int i14;
        float f10;
        float f11;
        int i15;
        int i16;
        c cVar2 = cVar;
        int i17 = i10;
        int i18 = i11;
        int i19 = i12;
        if (i19 <= 4) {
            try {
                r a10 = this.f19688a.a(cVar2, map);
                Iterator<r> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().g().equals(a10.g())) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    list.add(b(a10, i17, i18));
                } else {
                    List<r> list2 = list;
                }
                t[] f12 = a10.f();
                if (f12 != null && f12.length != 0) {
                    int e10 = cVar.e();
                    int d10 = cVar.d();
                    float f13 = (float) e10;
                    float f14 = 0.0f;
                    float f15 = (float) d10;
                    float f16 = 0.0f;
                    for (t tVar : f12) {
                        if (tVar != null) {
                            float c10 = tVar.c();
                            float d11 = tVar.d();
                            if (c10 < f13) {
                                f13 = c10;
                            }
                            if (d11 < f15) {
                                f15 = d11;
                            }
                            if (c10 > f16) {
                                f16 = c10;
                            }
                            if (d11 > f14) {
                                f14 = d11;
                            }
                        }
                    }
                    if (f13 > 100.0f) {
                        f10 = f16;
                        f11 = f15;
                        i14 = d10;
                        i13 = e10;
                        a(cVar2.a(0, 0, (int) f13, d10), map, list, i10, i11, i19 + 1);
                    } else {
                        f10 = f16;
                        f11 = f15;
                        i14 = d10;
                        i13 = e10;
                    }
                    if (f11 > 100.0f) {
                        int i20 = (int) f11;
                        i15 = i13;
                        a(cVar2.a(0, 0, i15, i20), map, list, i10, i11, i19 + 1);
                    } else {
                        i15 = i13;
                    }
                    float f17 = f10;
                    if (f17 < ((float) (i15 - 100))) {
                        int i21 = (int) f17;
                        i16 = i14;
                        a(cVar2.a(i21, 0, i15 - i21, i16), map, list, i17 + i21, i11, i19 + 1);
                    } else {
                        i16 = i14;
                    }
                    if (f14 < ((float) (i16 - 100))) {
                        int i22 = (int) f14;
                        a(cVar2.a(0, i22, i15, i16 - i22), map, list, i10, i18 + i22, i19 + 1);
                    }
                }
            } catch (q unused) {
            }
        }
    }

    public r[] c(c cVar, Map<e, ?> map) throws m {
        ArrayList arrayList = new ArrayList();
        a(cVar, map, arrayList, 0, 0, 0);
        if (!arrayList.isEmpty()) {
            return (r[]) arrayList.toArray(f19687d);
        }
        throw m.a();
    }

    public r[] d(c cVar) throws m {
        return c(cVar, (Map<e, ?>) null);
    }
}

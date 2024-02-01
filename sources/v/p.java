package v;

import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.d;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import u.b;
import u.c;
import u.i;
import z.e;

public class p {
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 3;
    public static final int N = 4;
    public static final int O = 5;
    public static final int P = 6;
    public static final String Q = "MotionController";
    public static final boolean R = false;
    public static final boolean S = false;
    public n[] A;
    public int B = e.f13910f;
    public String[] C;

    /* renamed from: a  reason: collision with root package name */
    public View f14083a;

    /* renamed from: b  reason: collision with root package name */
    public int f14084b;

    /* renamed from: c  reason: collision with root package name */
    public String f14085c;

    /* renamed from: d  reason: collision with root package name */
    public int f14086d = -1;

    /* renamed from: e  reason: collision with root package name */
    public r f14087e = new r();

    /* renamed from: f  reason: collision with root package name */
    public r f14088f = new r();

    /* renamed from: g  reason: collision with root package name */
    public o f14089g = new o();

    /* renamed from: h  reason: collision with root package name */
    public o f14090h = new o();

    /* renamed from: i  reason: collision with root package name */
    public b[] f14091i;

    /* renamed from: j  reason: collision with root package name */
    public b f14092j;

    /* renamed from: k  reason: collision with root package name */
    public float f14093k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f14094l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    public float f14095m = 1.0f;

    /* renamed from: n  reason: collision with root package name */
    public int[] f14096n;

    /* renamed from: o  reason: collision with root package name */
    public double[] f14097o;

    /* renamed from: p  reason: collision with root package name */
    public double[] f14098p;

    /* renamed from: q  reason: collision with root package name */
    public String[] f14099q;

    /* renamed from: r  reason: collision with root package name */
    public int[] f14100r;

    /* renamed from: s  reason: collision with root package name */
    public int f14101s = 4;

    /* renamed from: t  reason: collision with root package name */
    public float[] f14102t = new float[4];

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<r> f14103u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public float[] f14104v = new float[1];

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<e> f14105w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public HashMap<String, u> f14106x;

    /* renamed from: y  reason: collision with root package name */
    public HashMap<String, t> f14107y;

    /* renamed from: z  reason: collision with root package name */
    public HashMap<String, i> f14108z;

    public p(View view) {
        H(view);
    }

    public void A(View view, l lVar, float f10, float f11, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        r rVar = this.f14087e;
        float f12 = rVar.S;
        rectF.left = f12;
        float f13 = rVar.T;
        rectF.top = f13;
        rectF.right = f12 + rVar.U;
        rectF.bottom = f13 + rVar.V;
        RectF rectF2 = new RectF();
        r rVar2 = this.f14088f;
        float f14 = rVar2.S;
        rectF2.left = f14;
        float f15 = rVar2.T;
        rectF2.top = f15;
        rectF2.right = f14 + rVar2.U;
        rectF2.bottom = f15 + rVar2.V;
        lVar.n(view, rectF, rectF2, f10, f11, strArr, fArr);
    }

    public final void B(r rVar) {
        rVar.s((float) ((int) this.f14083a.getX()), (float) ((int) this.f14083a.getY()), (float) this.f14083a.getWidth(), (float) this.f14083a.getHeight());
    }

    public void C(int i10) {
        this.f14087e.P = i10;
    }

    public void D(e eVar, d dVar) {
        r rVar = this.f14088f;
        rVar.Q = 1.0f;
        rVar.R = 1.0f;
        B(rVar);
        this.f14088f.s((float) eVar.k0(), (float) eVar.l0(), (float) eVar.j0(), (float) eVar.D());
        this.f14088f.a(dVar.h0(this.f14084b));
        this.f14090h.r(eVar, dVar, this.f14084b);
    }

    public void E(int i10) {
        this.B = i10;
    }

    public void F(View view) {
        r rVar = this.f14087e;
        rVar.Q = 0.0f;
        rVar.R = 0.0f;
        rVar.s(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f14089g.q(view);
    }

    public void G(e eVar, d dVar) {
        r rVar = this.f14087e;
        rVar.Q = 0.0f;
        rVar.R = 0.0f;
        B(rVar);
        this.f14087e.s((float) eVar.k0(), (float) eVar.l0(), (float) eVar.j0(), (float) eVar.D());
        d.a h02 = dVar.h0(this.f14084b);
        this.f14087e.a(h02);
        this.f14093k = h02.f1998c.f2077f;
        this.f14089g.r(eVar, dVar, this.f14084b);
    }

    public void H(View view) {
        this.f14083a = view;
        this.f14084b = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.f14085c = ((ConstraintLayout.b) layoutParams).a();
        }
    }

    public void I(int i10, int i11, float f10, long j10) {
        ArrayList arrayList;
        String[] strArr;
        u uVar;
        a aVar;
        t tVar;
        a aVar2;
        new HashSet();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashMap hashMap = new HashMap();
        int i12 = this.B;
        if (i12 != e.f13910f) {
            this.f14087e.Y = i12;
        }
        this.f14089g.j(this.f14090h, hashSet2);
        ArrayList<e> arrayList2 = this.f14105w;
        if (arrayList2 != null) {
            Iterator<e> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                e next = it.next();
                if (next instanceof k) {
                    k kVar = (k) next;
                    x(new r(i10, i11, kVar, this.f14087e, this.f14088f));
                    int i13 = kVar.f14026y;
                    if (i13 != e.f13910f) {
                        this.f14086d = i13;
                    }
                } else if (next instanceof h) {
                    next.b(hashSet3);
                } else if (next instanceof m) {
                    next.b(hashSet);
                } else if (next instanceof n) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((n) next);
                } else {
                    next.e(hashMap);
                    next.b(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i14 = 0;
        if (arrayList != null) {
            this.A = (n[]) arrayList.toArray(new n[0]);
        }
        char c10 = 1;
        if (!hashSet2.isEmpty()) {
            this.f14107y = new HashMap<>();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    Iterator<e> it3 = this.f14105w.iterator();
                    while (it3.hasNext()) {
                        e next2 = it3.next();
                        HashMap<String, a> hashMap2 = next2.f13933e;
                        if (!(hashMap2 == null || (aVar2 = hashMap2.get(str2)) == null)) {
                            sparseArray.append(next2.f13929a, aVar2);
                        }
                    }
                    tVar = t.d(str, sparseArray);
                } else {
                    tVar = t.e(str);
                }
                if (tVar != null) {
                    tVar.h(str);
                    this.f14107y.put(str, tVar);
                }
            }
            ArrayList<e> arrayList3 = this.f14105w;
            if (arrayList3 != null) {
                Iterator<e> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    e next3 = it4.next();
                    if (next3 instanceof f) {
                        next3.a(this.f14107y);
                    }
                }
            }
            this.f14089g.a(this.f14107y, 0);
            this.f14090h.a(this.f14107y, 100);
            for (String next4 : this.f14107y.keySet()) {
                this.f14107y.get(next4).i(hashMap.containsKey(next4) ? ((Integer) hashMap.get(next4)).intValue() : 0);
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f14106x == null) {
                this.f14106x = new HashMap<>();
            }
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String str3 = (String) it5.next();
                if (!this.f14106x.containsKey(str3)) {
                    if (str3.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str4 = str3.split(",")[1];
                        Iterator<e> it6 = this.f14105w.iterator();
                        while (it6.hasNext()) {
                            e next5 = it6.next();
                            HashMap<String, a> hashMap3 = next5.f13933e;
                            if (!(hashMap3 == null || (aVar = hashMap3.get(str4)) == null)) {
                                sparseArray2.append(next5.f13929a, aVar);
                            }
                        }
                        uVar = u.d(str3, sparseArray2);
                        long j11 = j10;
                    } else {
                        uVar = u.e(str3, j10);
                    }
                    if (uVar != null) {
                        uVar.i(str3);
                        this.f14106x.put(str3, uVar);
                    }
                }
            }
            ArrayList<e> arrayList4 = this.f14105w;
            if (arrayList4 != null) {
                Iterator<e> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    e next6 = it7.next();
                    if (next6 instanceof m) {
                        ((m) next6).Q(this.f14106x);
                    }
                }
            }
            for (String next7 : this.f14106x.keySet()) {
                this.f14106x.get(next7).j(hashMap.containsKey(next7) ? ((Integer) hashMap.get(next7)).intValue() : 0);
            }
        }
        int i15 = 2;
        int size = this.f14103u.size() + 2;
        r[] rVarArr = new r[size];
        rVarArr[0] = this.f14087e;
        rVarArr[size - 1] = this.f14088f;
        if (this.f14103u.size() > 0 && this.f14086d == -1) {
            this.f14086d = 0;
        }
        Iterator<r> it8 = this.f14103u.iterator();
        int i16 = 1;
        while (it8.hasNext()) {
            rVarArr[i16] = it8.next();
            i16++;
        }
        HashSet hashSet4 = new HashSet();
        for (String next8 : this.f14088f.Z.keySet()) {
            if (this.f14087e.Z.containsKey(next8)) {
                if (!hashSet2.contains("CUSTOM," + next8)) {
                    hashSet4.add(next8);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f14099q = strArr2;
        this.f14100r = new int[strArr2.length];
        int i17 = 0;
        while (true) {
            strArr = this.f14099q;
            if (i17 >= strArr.length) {
                break;
            }
            String str5 = strArr[i17];
            this.f14100r[i17] = 0;
            int i18 = 0;
            while (true) {
                if (i18 >= size) {
                    break;
                } else if (rVarArr[i18].Z.containsKey(str5)) {
                    int[] iArr = this.f14100r;
                    iArr[i17] = iArr[i17] + rVarArr[i18].Z.get(str5).g();
                    break;
                } else {
                    i18++;
                }
            }
            i17++;
        }
        boolean z10 = rVarArr[0].Y != e.f13910f;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i19 = 1; i19 < size; i19++) {
            rVarArr[i19].e(rVarArr[i19 - 1], zArr, this.f14099q, z10);
        }
        int i20 = 0;
        for (int i21 = 1; i21 < length; i21++) {
            if (zArr[i21]) {
                i20++;
            }
        }
        int[] iArr2 = new int[i20];
        this.f14096n = iArr2;
        this.f14097o = new double[iArr2.length];
        this.f14098p = new double[iArr2.length];
        int i22 = 0;
        for (int i23 = 1; i23 < length; i23++) {
            if (zArr[i23]) {
                this.f14096n[i22] = i23;
                i22++;
            }
        }
        int[] iArr3 = new int[2];
        iArr3[1] = this.f14096n.length;
        iArr3[0] = size;
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, iArr3);
        double[] dArr2 = new double[size];
        for (int i24 = 0; i24 < size; i24++) {
            rVarArr[i24].i(dArr[i24], this.f14096n);
            dArr2[i24] = (double) rVarArr[i24].Q;
        }
        int i25 = 0;
        while (true) {
            int[] iArr4 = this.f14096n;
            if (i25 >= iArr4.length) {
                break;
            }
            if (iArr4[i25] < r.f14121p0.length) {
                String str6 = r.f14121p0[this.f14096n[i25]] + " [";
                for (int i26 = 0; i26 < size; i26++) {
                    str6 = str6 + dArr[i26][i25];
                }
            }
            i25++;
        }
        this.f14091i = new b[(this.f14099q.length + 1)];
        int i27 = 0;
        while (true) {
            String[] strArr3 = this.f14099q;
            if (i27 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i27];
            int i28 = i14;
            int i29 = i28;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i28 < size) {
                if (rVarArr[i28].o(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr5 = new int[i15];
                        iArr5[c10] = rVarArr[i28].m(str7);
                        iArr5[i14] = size;
                        dArr4 = (double[][]) Array.newInstance(Double.TYPE, iArr5);
                    }
                    r rVar = rVarArr[i28];
                    dArr3[i29] = (double) rVar.Q;
                    rVar.l(str7, dArr4[i29], 0);
                    i29++;
                }
                i28++;
                i15 = 2;
                i14 = 0;
                c10 = 1;
            }
            i27++;
            this.f14091i[i27] = b.a(this.f14086d, Arrays.copyOf(dArr3, i29), (double[][]) Arrays.copyOf(dArr4, i29));
            i15 = 2;
            i14 = 0;
            c10 = 1;
        }
        this.f14091i[0] = b.a(this.f14086d, dArr2, dArr);
        if (rVarArr[0].Y != e.f13910f) {
            int[] iArr6 = new int[size];
            double[] dArr5 = new double[size];
            int[] iArr7 = new int[2];
            iArr7[1] = 2;
            iArr7[0] = size;
            double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, iArr7);
            for (int i30 = 0; i30 < size; i30++) {
                r rVar2 = rVarArr[i30];
                iArr6[i30] = rVar2.Y;
                dArr5[i30] = (double) rVar2.Q;
                double[] dArr7 = dArr6[i30];
                dArr7[0] = (double) rVar2.S;
                dArr7[1] = (double) rVar2.T;
            }
            this.f14092j = b.b(iArr6, dArr5, dArr6);
        }
        float f11 = Float.NaN;
        this.f14108z = new HashMap<>();
        if (this.f14105w != null) {
            Iterator it9 = hashSet3.iterator();
            while (it9.hasNext()) {
                String str8 = (String) it9.next();
                i d10 = i.d(str8);
                if (d10 != null) {
                    if (d10.j() && Float.isNaN(f11)) {
                        f11 = t();
                    }
                    d10.h(str8);
                    this.f14108z.put(str8, d10);
                }
            }
            Iterator<e> it10 = this.f14105w.iterator();
            while (it10.hasNext()) {
                e next9 = it10.next();
                if (next9 instanceof h) {
                    ((h) next9).S(this.f14108z);
                }
            }
            for (i i31 : this.f14108z.values()) {
                i31.i(f11);
            }
        }
    }

    public void a(e eVar) {
        this.f14105w.add(eVar);
    }

    public void b(ArrayList<e> arrayList) {
        this.f14105w.addAll(arrayList);
    }

    public void c(float[] fArr, int i10) {
        int i11 = i10;
        float f10 = 1.0f / ((float) (i11 - 1));
        HashMap<String, t> hashMap = this.f14107y;
        if (hashMap != null) {
            t tVar = hashMap.get(e.f13924t);
        }
        HashMap<String, t> hashMap2 = this.f14107y;
        if (hashMap2 != null) {
            t tVar2 = hashMap2.get(e.f13925u);
        }
        HashMap<String, i> hashMap3 = this.f14108z;
        if (hashMap3 != null) {
            i iVar = hashMap3.get(e.f13924t);
        }
        HashMap<String, i> hashMap4 = this.f14108z;
        if (hashMap4 != null) {
            i iVar2 = hashMap4.get(e.f13925u);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            float f11 = ((float) i12) * f10;
            float f12 = this.f14095m;
            float f13 = 0.0f;
            if (f12 != 1.0f) {
                float f14 = this.f14094l;
                if (f11 < f14) {
                    f11 = 0.0f;
                }
                if (f11 > f14 && ((double) f11) < 1.0d) {
                    f11 = (f11 - f14) * f12;
                }
            }
            double d10 = (double) f11;
            c cVar = this.f14087e.O;
            float f15 = Float.NaN;
            Iterator<r> it = this.f14103u.iterator();
            while (it.hasNext()) {
                r next = it.next();
                c cVar2 = next.O;
                if (cVar2 != null) {
                    float f16 = next.Q;
                    if (f16 < f11) {
                        cVar = cVar2;
                        f13 = f16;
                    } else if (Float.isNaN(f15)) {
                        f15 = next.Q;
                    }
                }
            }
            if (cVar != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                float f17 = f15 - f13;
                d10 = (double) ((((float) cVar.a((double) ((f11 - f13) / f17))) * f17) + f13);
            }
            this.f14091i[0].d(d10, this.f14097o);
            b bVar = this.f14092j;
            if (bVar != null) {
                double[] dArr = this.f14097o;
                if (dArr.length > 0) {
                    bVar.d(d10, dArr);
                }
            }
            this.f14087e.j(this.f14096n, this.f14097o, fArr, i12 * 2);
        }
    }

    public int d(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h10 = this.f14091i[0].h();
        if (iArr != null) {
            Iterator<r> it = this.f14103u.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = it.next().f14122a0;
                i10++;
            }
        }
        int i11 = 0;
        for (double d10 : h10) {
            this.f14091i[0].d(d10, this.f14097o);
            this.f14087e.j(this.f14096n, this.f14097o, fArr, i11);
            i11 += 2;
        }
        return i11 / 2;
    }

    public int e(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h10 = this.f14091i[0].h();
        if (iArr != null) {
            Iterator<r> it = this.f14103u.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = it.next().f14122a0;
                i10++;
            }
        }
        int i11 = 0;
        for (double d10 : h10) {
            this.f14091i[0].d(d10, this.f14097o);
            this.f14087e.k(this.f14096n, this.f14097o, fArr, i11);
            i11 += 2;
        }
        return i11 / 2;
    }

    public void f(float[] fArr, int i10) {
        float[] fArr2 = fArr;
        int i11 = i10;
        float f10 = 1.0f;
        float f11 = 1.0f / ((float) (i11 - 1));
        HashMap<String, t> hashMap = this.f14107y;
        i iVar = null;
        t tVar = hashMap == null ? null : hashMap.get(e.f13924t);
        HashMap<String, t> hashMap2 = this.f14107y;
        t tVar2 = hashMap2 == null ? null : hashMap2.get(e.f13925u);
        HashMap<String, i> hashMap3 = this.f14108z;
        i iVar2 = hashMap3 == null ? null : hashMap3.get(e.f13924t);
        HashMap<String, i> hashMap4 = this.f14108z;
        if (hashMap4 != null) {
            iVar = hashMap4.get(e.f13925u);
        }
        int i12 = 0;
        while (i12 < i11) {
            float f12 = ((float) i12) * f11;
            float f13 = this.f14095m;
            if (f13 != f10) {
                float f14 = this.f14094l;
                if (f12 < f14) {
                    f12 = 0.0f;
                }
                if (f12 > f14 && ((double) f12) < 1.0d) {
                    f12 = (f12 - f14) * f13;
                }
            }
            double d10 = (double) f12;
            c cVar = this.f14087e.O;
            float f15 = Float.NaN;
            Iterator<r> it = this.f14103u.iterator();
            float f16 = 0.0f;
            while (it.hasNext()) {
                r next = it.next();
                c cVar2 = next.O;
                if (cVar2 != null) {
                    c cVar3 = cVar2;
                    float f17 = next.Q;
                    if (f17 < f12) {
                        f16 = f17;
                        cVar = cVar3;
                    } else if (Float.isNaN(f15)) {
                        f15 = next.Q;
                    }
                }
                int i13 = i10;
            }
            if (cVar != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                float f18 = f15 - f16;
                d10 = (double) ((((float) cVar.a((double) ((f12 - f16) / f18))) * f18) + f16);
            }
            this.f14091i[0].d(d10, this.f14097o);
            b bVar = this.f14092j;
            if (bVar != null) {
                double[] dArr = this.f14097o;
                if (dArr.length > 0) {
                    bVar.d(d10, dArr);
                }
            }
            int i14 = i12 * 2;
            this.f14087e.k(this.f14096n, this.f14097o, fArr2, i14);
            if (iVar2 != null) {
                fArr2[i14] = fArr2[i14] + iVar2.a(f12);
            } else if (tVar != null) {
                fArr2[i14] = fArr2[i14] + tVar.a(f12);
            }
            if (iVar != null) {
                int i15 = i14 + 1;
                fArr2[i15] = fArr2[i15] + iVar.a(f12);
            } else if (tVar2 != null) {
                int i16 = i14 + 1;
                fArr2[i16] = fArr2[i16] + tVar2.a(f12);
            }
            i12++;
            i11 = i10;
            f10 = 1.0f;
        }
    }

    public void g(float f10, float[] fArr, int i10) {
        this.f14091i[0].d((double) i(f10, (float[]) null), this.f14097o);
        this.f14087e.n(this.f14096n, this.f14097o, fArr, i10);
    }

    public void h(float[] fArr, int i10) {
        float f10 = 1.0f / ((float) (i10 - 1));
        for (int i11 = 0; i11 < i10; i11++) {
            this.f14091i[0].d((double) i(((float) i11) * f10, (float[]) null), this.f14097o);
            this.f14087e.n(this.f14096n, this.f14097o, fArr, i11 * 8);
        }
    }

    public final float i(float f10, float[] fArr) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f13 = this.f14095m;
            if (((double) f13) != 1.0d) {
                float f14 = this.f14094l;
                if (f10 < f14) {
                    f10 = 0.0f;
                }
                if (f10 > f14 && ((double) f10) < 1.0d) {
                    f10 = (f10 - f14) * f13;
                }
            }
        }
        c cVar = this.f14087e.O;
        float f15 = Float.NaN;
        Iterator<r> it = this.f14103u.iterator();
        while (it.hasNext()) {
            r next = it.next();
            c cVar2 = next.O;
            if (cVar2 != null) {
                float f16 = next.Q;
                if (f16 < f10) {
                    cVar = cVar2;
                    f11 = f16;
                } else if (Float.isNaN(f15)) {
                    f15 = next.Q;
                }
            }
        }
        if (cVar != null) {
            if (!Float.isNaN(f15)) {
                f12 = f15;
            }
            float f17 = f12 - f11;
            double d10 = (double) ((f10 - f11) / f17);
            f10 = (((float) cVar.a(d10)) * f17) + f11;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d10);
            }
        }
        return f10;
    }

    public int j(String str, float[] fArr, int i10) {
        t tVar = this.f14107y.get(str);
        if (tVar == null) {
            return -1;
        }
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr[i11] = tVar.a((float) (i11 / (fArr.length - 1)));
        }
        return fArr.length;
    }

    public void k(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float i10 = i(f10, this.f14104v);
        b[] bVarArr = this.f14091i;
        int i11 = 0;
        if (bVarArr != null) {
            double d10 = (double) i10;
            bVarArr[0].g(d10, this.f14098p);
            this.f14091i[0].d(d10, this.f14097o);
            float f13 = this.f14104v[0];
            while (true) {
                dArr = this.f14098p;
                if (i11 >= dArr.length) {
                    break;
                }
                dArr[i11] = dArr[i11] * ((double) f13);
                i11++;
            }
            b bVar = this.f14092j;
            if (bVar != null) {
                double[] dArr2 = this.f14097o;
                if (dArr2.length > 0) {
                    bVar.d(d10, dArr2);
                    this.f14092j.g(d10, this.f14098p);
                    this.f14087e.t(f11, f12, fArr, this.f14096n, this.f14098p, this.f14097o);
                    return;
                }
                return;
            }
            this.f14087e.t(f11, f12, fArr, this.f14096n, dArr, this.f14097o);
            return;
        }
        r rVar = this.f14088f;
        float f14 = rVar.S;
        r rVar2 = this.f14087e;
        float f15 = f14 - rVar2.S;
        float f16 = rVar.T - rVar2.T;
        float f17 = (rVar.U - rVar2.U) + f15;
        float f18 = (rVar.V - rVar2.V) + f16;
        fArr[0] = (f15 * (1.0f - f11)) + (f17 * f11);
        fArr[1] = (f16 * (1.0f - f12)) + (f18 * f12);
    }

    public int l() {
        int i10 = this.f14087e.P;
        Iterator<r> it = this.f14103u.iterator();
        while (it.hasNext()) {
            i10 = Math.max(i10, it.next().P);
        }
        return Math.max(i10, this.f14088f.P);
    }

    public float m() {
        return this.f14088f.S;
    }

    public float n() {
        return this.f14088f.T;
    }

    public r o(int i10) {
        return this.f14103u.get(i10);
    }

    public int p(int i10, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<e> it = this.f14105w.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            e next = it.next();
            int i13 = next.f13932d;
            if (i13 == i10 || i10 != -1) {
                iArr[i12] = 0;
                int i14 = i12 + 1;
                iArr[i14] = i13;
                int i15 = i14 + 1;
                int i16 = next.f13929a;
                iArr[i15] = i16;
                this.f14091i[0].d((double) (((float) i16) / 100.0f), this.f14097o);
                this.f14087e.k(this.f14096n, this.f14097o, fArr, 0);
                int i17 = i15 + 1;
                iArr[i17] = Float.floatToIntBits(fArr[0]);
                int i18 = i17 + 1;
                iArr[i18] = Float.floatToIntBits(fArr[1]);
                if (next instanceof k) {
                    k kVar = (k) next;
                    int i19 = i18 + 1;
                    iArr[i19] = kVar.J;
                    int i20 = i19 + 1;
                    iArr[i20] = Float.floatToIntBits(kVar.F);
                    i18 = i20 + 1;
                    iArr[i18] = Float.floatToIntBits(kVar.G);
                }
                int i21 = i18 + 1;
                iArr[i12] = i21 - i12;
                i11++;
                i12 = i21;
            }
        }
        return i11;
    }

    public float q(int i10, float f10, float f11) {
        r rVar = this.f14088f;
        float f12 = rVar.S;
        r rVar2 = this.f14087e;
        float f13 = rVar2.S;
        float f14 = f12 - f13;
        float f15 = rVar.T;
        float f16 = rVar2.T;
        float f17 = f15 - f16;
        float f18 = f13 + (rVar2.U / 2.0f);
        float f19 = f16 + (rVar2.V / 2.0f);
        float hypot = (float) Math.hypot((double) f14, (double) f17);
        if (((double) hypot) < 1.0E-7d) {
            return Float.NaN;
        }
        float f20 = f10 - f18;
        float f21 = f11 - f19;
        if (((float) Math.hypot((double) f20, (double) f21)) == 0.0f) {
            return 0.0f;
        }
        float f22 = (f20 * f14) + (f21 * f17);
        if (i10 == 0) {
            return f22 / hypot;
        }
        if (i10 == 1) {
            return (float) Math.sqrt((double) ((hypot * hypot) - (f22 * f22)));
        }
        if (i10 == 2) {
            return f20 / f14;
        }
        if (i10 == 3) {
            return f21 / f14;
        }
        if (i10 == 4) {
            return f20 / f17;
        }
        if (i10 != 5) {
            return 0.0f;
        }
        return f21 / f17;
    }

    public l r(int i10, int i11, float f10, float f11) {
        RectF rectF = new RectF();
        r rVar = this.f14087e;
        float f12 = rVar.S;
        rectF.left = f12;
        float f13 = rVar.T;
        rectF.top = f13;
        rectF.right = f12 + rVar.U;
        rectF.bottom = f13 + rVar.V;
        RectF rectF2 = new RectF();
        r rVar2 = this.f14088f;
        float f14 = rVar2.S;
        rectF2.left = f14;
        float f15 = rVar2.T;
        rectF2.top = f15;
        rectF2.right = f14 + rVar2.U;
        rectF2.bottom = f15 + rVar2.V;
        Iterator<e> it = this.f14105w.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next instanceof l) {
                l lVar = (l) next;
                if (lVar.m(i10, i11, rectF, rectF2, f10, f11)) {
                    return lVar;
                }
            }
        }
        return null;
    }

    public void s(float f10, int i10, int i11, float f11, float f12, float[] fArr) {
        float i12 = i(f10, this.f14104v);
        HashMap<String, t> hashMap = this.f14107y;
        i iVar = null;
        t tVar = hashMap == null ? null : hashMap.get(e.f13924t);
        HashMap<String, t> hashMap2 = this.f14107y;
        t tVar2 = hashMap2 == null ? null : hashMap2.get(e.f13925u);
        HashMap<String, t> hashMap3 = this.f14107y;
        t tVar3 = hashMap3 == null ? null : hashMap3.get(e.f13913i);
        HashMap<String, t> hashMap4 = this.f14107y;
        t tVar4 = hashMap4 == null ? null : hashMap4.get(e.f13919o);
        HashMap<String, t> hashMap5 = this.f14107y;
        t tVar5 = hashMap5 == null ? null : hashMap5.get(e.f13920p);
        HashMap<String, i> hashMap6 = this.f14108z;
        i iVar2 = hashMap6 == null ? null : hashMap6.get(e.f13924t);
        HashMap<String, i> hashMap7 = this.f14108z;
        i iVar3 = hashMap7 == null ? null : hashMap7.get(e.f13925u);
        HashMap<String, i> hashMap8 = this.f14108z;
        i iVar4 = hashMap8 == null ? null : hashMap8.get(e.f13913i);
        HashMap<String, i> hashMap9 = this.f14108z;
        i iVar5 = hashMap9 == null ? null : hashMap9.get(e.f13919o);
        HashMap<String, i> hashMap10 = this.f14108z;
        if (hashMap10 != null) {
            iVar = hashMap10.get(e.f13920p);
        }
        i iVar6 = new i();
        iVar6.b();
        iVar6.d(tVar3, i12);
        iVar6.h(tVar, tVar2, i12);
        iVar6.f(tVar4, tVar5, i12);
        iVar6.c(iVar4, i12);
        iVar6.g(iVar2, iVar3, i12);
        iVar6.e(iVar5, iVar, i12);
        b bVar = this.f14092j;
        if (bVar != null) {
            double[] dArr = this.f14097o;
            if (dArr.length > 0) {
                double d10 = (double) i12;
                bVar.d(d10, dArr);
                this.f14092j.g(d10, this.f14098p);
                this.f14087e.t(f11, f12, fArr, this.f14096n, this.f14098p, this.f14097o);
            }
            iVar6.a(f11, f12, i10, i11, fArr);
            return;
        }
        int i13 = 0;
        if (this.f14091i != null) {
            double i14 = (double) i(i12, this.f14104v);
            this.f14091i[0].g(i14, this.f14098p);
            this.f14091i[0].d(i14, this.f14097o);
            float f13 = this.f14104v[0];
            while (true) {
                double[] dArr2 = this.f14098p;
                if (i13 < dArr2.length) {
                    dArr2[i13] = dArr2[i13] * ((double) f13);
                    i13++;
                } else {
                    float f14 = f11;
                    float f15 = f12;
                    this.f14087e.t(f14, f15, fArr, this.f14096n, dArr2, this.f14097o);
                    iVar6.a(f14, f15, i10, i11, fArr);
                    return;
                }
            }
        } else {
            r rVar = this.f14088f;
            float f16 = rVar.S;
            r rVar2 = this.f14087e;
            float f17 = f16 - rVar2.S;
            float f18 = rVar.T - rVar2.T;
            i iVar7 = iVar5;
            float f19 = (rVar.V - rVar2.V) + f18;
            fArr[0] = (f17 * (1.0f - f11)) + (((rVar.U - rVar2.U) + f17) * f11);
            fArr[1] = (f18 * (1.0f - f12)) + (f19 * f12);
            iVar6.b();
            iVar6.d(tVar3, i12);
            iVar6.h(tVar, tVar2, i12);
            iVar6.f(tVar4, tVar5, i12);
            iVar6.c(iVar4, i12);
            iVar6.g(iVar2, iVar3, i12);
            iVar6.e(iVar7, iVar, i12);
            iVar6.a(f11, f12, i10, i11, fArr);
        }
    }

    public final float t() {
        float[] fArr = new float[2];
        float f10 = 1.0f / ((float) 99);
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i10 = 0;
        float f11 = 0.0f;
        while (i10 < 100) {
            float f12 = ((float) i10) * f10;
            double d12 = (double) f12;
            c cVar = this.f14087e.O;
            float f13 = Float.NaN;
            Iterator<r> it = this.f14103u.iterator();
            float f14 = 0.0f;
            while (it.hasNext()) {
                r next = it.next();
                c cVar2 = next.O;
                float f15 = f10;
                if (cVar2 != null) {
                    float f16 = next.Q;
                    if (f16 < f12) {
                        f14 = f16;
                        cVar = cVar2;
                    } else if (Float.isNaN(f13)) {
                        f13 = next.Q;
                    }
                }
                f10 = f15;
            }
            float f17 = f10;
            if (cVar != null) {
                if (Float.isNaN(f13)) {
                    f13 = 1.0f;
                }
                float f18 = f13 - f14;
                d12 = (double) ((((float) cVar.a((double) ((f12 - f14) / f18))) * f18) + f14);
            }
            this.f14091i[0].d(d12, this.f14097o);
            this.f14087e.k(this.f14096n, this.f14097o, fArr, 0);
            if (i10 > 0) {
                f11 = (float) (((double) f11) + Math.hypot(d11 - ((double) fArr[1]), d10 - ((double) fArr[0])));
            }
            d10 = (double) fArr[0];
            d11 = (double) fArr[1];
            i10++;
            f10 = f17;
        }
        return f11;
    }

    public String toString() {
        return " start: x: " + this.f14087e.S + " y: " + this.f14087e.T + " end: x: " + this.f14088f.S + " y: " + this.f14088f.T;
    }

    public float u() {
        return this.f14087e.S;
    }

    public float v() {
        return this.f14087e.T;
    }

    public int w(int[] iArr, float[] fArr) {
        Iterator<e> it = this.f14105w.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            e next = it.next();
            int i12 = next.f13929a;
            iArr[i10] = (next.f13932d * 1000) + i12;
            this.f14091i[0].d((double) (((float) i12) / 100.0f), this.f14097o);
            this.f14087e.k(this.f14096n, this.f14097o, fArr, i11);
            i11 += 2;
            i10++;
        }
        return i10;
    }

    public final void x(r rVar) {
        int binarySearch = Collections.binarySearch(this.f14103u, rVar);
        if (binarySearch == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" KeyPath positon \"");
            sb2.append(rVar.R);
            sb2.append("\" outside of range");
        }
        this.f14103u.add((-binarySearch) - 1, rVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: v.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: v.u$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean y(android.view.View r23, float r24, long r25, v.g r27) {
        /*
            r22 = this;
            r0 = r22
            r11 = r23
            r1 = 0
            r2 = r24
            float r12 = r0.i(r2, r1)
            java.util.HashMap<java.lang.String, v.t> r2 = r0.f14107y
            if (r2 == 0) goto L_0x0027
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0017:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0027
            java.lang.Object r3 = r2.next()
            v.t r3 = (v.t) r3
            r3.g(r11, r12)
            goto L_0x0017
        L_0x0027:
            java.util.HashMap<java.lang.String, v.u> r2 = r0.f14106x
            r13 = 0
            if (r2 == 0) goto L_0x0059
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = r13
        L_0x0036:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r7.next()
            v.u r1 = (v.u) r1
            boolean r2 = r1 instanceof v.u.d
            if (r2 == 0) goto L_0x004a
            r8 = r1
            v.u$d r8 = (v.u.d) r8
            goto L_0x0036
        L_0x004a:
            r2 = r23
            r3 = r12
            r4 = r25
            r6 = r27
            boolean r1 = r1.g(r2, r3, r4, r6)
            r9 = r9 | r1
            goto L_0x0036
        L_0x0057:
            r14 = r9
            goto L_0x005b
        L_0x0059:
            r8 = r1
            r14 = r13
        L_0x005b:
            u.b[] r1 = r0.f14091i
            r15 = 1
            if (r1 == 0) goto L_0x013a
            r1 = r1[r13]
            double r9 = (double) r12
            double[] r2 = r0.f14097o
            r1.d(r9, r2)
            u.b[] r1 = r0.f14091i
            r1 = r1[r13]
            double[] r2 = r0.f14098p
            r1.g(r9, r2)
            u.b r1 = r0.f14092j
            if (r1 == 0) goto L_0x0084
            double[] r2 = r0.f14097o
            int r3 = r2.length
            if (r3 <= 0) goto L_0x0084
            r1.d(r9, r2)
            u.b r1 = r0.f14092j
            double[] r2 = r0.f14098p
            r1.g(r9, r2)
        L_0x0084:
            v.r r1 = r0.f14087e
            int[] r3 = r0.f14096n
            double[] r4 = r0.f14097o
            double[] r5 = r0.f14098p
            r6 = 0
            r2 = r23
            r1.u(r2, r3, r4, r5, r6)
            java.util.HashMap<java.lang.String, v.t> r1 = r0.f14107y
            if (r1 == 0) goto L_0x00bd
            java.util.Collection r1 = r1.values()
            java.util.Iterator r16 = r1.iterator()
        L_0x009e:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x00bd
            java.lang.Object r1 = r16.next()
            v.t r1 = (v.t) r1
            boolean r2 = r1 instanceof v.t.d
            if (r2 == 0) goto L_0x009e
            v.t$d r1 = (v.t.d) r1
            double[] r2 = r0.f14098p
            r4 = r2[r13]
            r6 = r2[r15]
            r2 = r23
            r3 = r12
            r1.j(r2, r3, r4, r6)
            goto L_0x009e
        L_0x00bd:
            if (r8 == 0) goto L_0x00da
            double[] r1 = r0.f14098p
            r16 = r1[r13]
            r18 = r1[r15]
            r1 = r8
            r2 = r23
            r3 = r27
            r4 = r12
            r5 = r25
            r7 = r16
            r20 = r9
            r9 = r18
            boolean r1 = r1.k(r2, r3, r4, r5, r7, r9)
            r1 = r1 | r14
            r14 = r1
            goto L_0x00dc
        L_0x00da:
            r20 = r9
        L_0x00dc:
            r1 = r15
        L_0x00dd:
            u.b[] r2 = r0.f14091i
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0103
            r2 = r2[r1]
            float[] r3 = r0.f14102t
            r4 = r20
            r2.e(r4, r3)
            v.r r2 = r0.f14087e
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r2.Z
            java.lang.String[] r3 = r0.f14099q
            int r6 = r1 + -1
            r3 = r3[r6]
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.widget.a r2 = (androidx.constraintlayout.widget.a) r2
            float[] r3 = r0.f14102t
            r2.m(r11, r3)
            int r1 = r1 + 1
            goto L_0x00dd
        L_0x0103:
            v.o r1 = r0.f14089g
            int r2 = r1.P
            if (r2 != 0) goto L_0x0128
            r2 = 0
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0114
        L_0x010e:
            int r1 = r1.Q
            r11.setVisibility(r1)
            goto L_0x0128
        L_0x0114:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x011d
            v.o r1 = r0.f14090h
            goto L_0x010e
        L_0x011d:
            v.o r2 = r0.f14090h
            int r2 = r2.Q
            int r1 = r1.Q
            if (r2 == r1) goto L_0x0128
            r11.setVisibility(r13)
        L_0x0128:
            v.n[] r1 = r0.A
            if (r1 == 0) goto L_0x0182
            r1 = r13
        L_0x012d:
            v.n[] r2 = r0.A
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0182
            r2 = r2[r1]
            r2.v(r12, r11)
            int r1 = r1 + 1
            goto L_0x012d
        L_0x013a:
            v.r r1 = r0.f14087e
            float r2 = r1.S
            v.r r3 = r0.f14088f
            float r4 = r3.S
            float r4 = r4 - r2
            float r4 = r4 * r12
            float r2 = r2 + r4
            float r4 = r1.T
            float r5 = r3.T
            float r5 = r5 - r4
            float r5 = r5 * r12
            float r4 = r4 + r5
            float r5 = r1.U
            float r6 = r3.U
            float r7 = r6 - r5
            float r7 = r7 * r12
            float r7 = r7 + r5
            float r1 = r1.V
            float r3 = r3.V
            float r8 = r3 - r1
            float r8 = r8 * r12
            float r8 = r8 + r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r10 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r10
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0172
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x017f
        L_0x0172:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r11.measure(r3, r1)
        L_0x017f:
            r11.layout(r10, r9, r2, r4)
        L_0x0182:
            java.util.HashMap<java.lang.String, v.i> r1 = r0.f14108z
            if (r1 == 0) goto L_0x01b1
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x018e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x01b1
            java.lang.Object r1 = r8.next()
            v.i r1 = (v.i) r1
            boolean r2 = r1 instanceof v.i.h
            if (r2 == 0) goto L_0x01ad
            v.i$h r1 = (v.i.h) r1
            double[] r2 = r0.f14098p
            r4 = r2[r13]
            r6 = r2[r15]
            r2 = r23
            r3 = r12
            r1.k(r2, r3, r4, r6)
            goto L_0x018e
        L_0x01ad:
            r1.g(r11, r12)
            goto L_0x018e
        L_0x01b1:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: v.p.y(android.view.View, float, long, v.g):boolean");
    }

    public String z() {
        return this.f14083a.getContext().getResources().getResourceEntryName(this.f14083a.getId());
    }
}

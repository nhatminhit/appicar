package y7;

import d.o0;
import java.util.ArrayList;
import java.util.zip.Inflater;
import w7.q0;
import w7.v;
import w7.w;
import y7.d;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f15568a = q0.T("ytmp");

    /* renamed from: b  reason: collision with root package name */
    public static final int f15569b = q0.T("mshp");

    /* renamed from: c  reason: collision with root package name */
    public static final int f15570c = q0.T("raw ");

    /* renamed from: d  reason: collision with root package name */
    public static final int f15571d = q0.T("dfl8");

    /* renamed from: e  reason: collision with root package name */
    public static final int f15572e = q0.T("mesh");

    /* renamed from: f  reason: collision with root package name */
    public static final int f15573f = q0.T("proj");

    /* renamed from: g  reason: collision with root package name */
    public static final int f15574g = 10000;

    /* renamed from: h  reason: collision with root package name */
    public static final int f15575h = 32000;

    /* renamed from: i  reason: collision with root package name */
    public static final int f15576i = 128000;

    @o0
    public static d a(byte[] bArr, int i10) {
        ArrayList<d.b> arrayList;
        w wVar = new w(bArr);
        try {
            arrayList = c(wVar) ? f(wVar) : e(wVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new d(arrayList.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new d(arrayList.get(0), arrayList.get(1), i10);
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    public static boolean c(w wVar) {
        wVar.R(4);
        int l10 = wVar.l();
        wVar.Q(0);
        return l10 == f15573f;
    }

    @o0
    public static d.b d(w wVar) {
        int l10 = wVar.l();
        if (l10 > 10000) {
            return null;
        }
        float[] fArr = new float[l10];
        for (int i10 = 0; i10 < l10; i10++) {
            fArr[i10] = wVar.k();
        }
        int l11 = wVar.l();
        if (l11 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(((double) l10) * 2.0d) / log);
        v vVar = new v(wVar.f14880a);
        int i11 = 8;
        vVar.n(wVar.c() * 8);
        float[] fArr2 = new float[(l11 * 5)];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < l11) {
            int i15 = 0;
            while (i15 < i12) {
                int b10 = iArr[i15] + b(vVar.h(ceil));
                if (b10 >= l10 || b10 < 0) {
                    return null;
                }
                fArr2[i14] = fArr[b10];
                iArr[i15] = b10;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        vVar.n((vVar.e() + 7) & -8);
        int i16 = 32;
        int h10 = vVar.h(32);
        d.c[] cVarArr = new d.c[h10];
        int i17 = 0;
        while (i17 < h10) {
            int h11 = vVar.h(i11);
            int h12 = vVar.h(i11);
            int h13 = vVar.h(i16);
            if (h13 > 128000) {
                return null;
            }
            int i18 = h11;
            int ceil2 = (int) Math.ceil(Math.log(((double) l11) * d10) / log);
            float[] fArr3 = new float[(h13 * 3)];
            float[] fArr4 = new float[(h13 * 2)];
            int i19 = 0;
            for (int i20 = 0; i20 < h13; i20++) {
                i19 += b(vVar.h(ceil2));
                if (i19 < 0 || i19 >= l11) {
                    return null;
                }
                int i21 = i20 * 3;
                int i22 = i19 * 5;
                fArr3[i21] = fArr2[i22];
                fArr3[i21 + 1] = fArr2[i22 + 1];
                fArr3[i21 + 2] = fArr2[i22 + 2];
                int i23 = i20 * 2;
                fArr4[i23] = fArr2[i22 + 3];
                fArr4[i23 + 1] = fArr2[i22 + 4];
            }
            cVarArr[i17] = new d.c(i18, fArr3, fArr4, h12);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new d.b(cVarArr);
    }

    @o0
    public static ArrayList<d.b> e(w wVar) {
        if (wVar.D() != 0) {
            return null;
        }
        wVar.R(7);
        int l10 = wVar.l();
        if (l10 == f15571d) {
            w wVar2 = new w();
            Inflater inflater = new Inflater(true);
            try {
                if (!q0.q0(wVar, wVar2, inflater)) {
                    return null;
                }
                wVar = wVar2;
            } finally {
                inflater.end();
            }
        } else if (l10 != f15570c) {
            return null;
        }
        return g(wVar);
    }

    @o0
    public static ArrayList<d.b> f(w wVar) {
        int l10;
        wVar.R(8);
        int c10 = wVar.c();
        int d10 = wVar.d();
        while (c10 < d10 && (l10 = wVar.l() + c10) > c10 && l10 <= d10) {
            int l11 = wVar.l();
            if (l11 == f15568a || l11 == f15569b) {
                wVar.P(l10);
                return e(wVar);
            }
            wVar.Q(l10);
            c10 = l10;
        }
        return null;
    }

    @o0
    public static ArrayList<d.b> g(w wVar) {
        ArrayList<d.b> arrayList = new ArrayList<>();
        int c10 = wVar.c();
        int d10 = wVar.d();
        while (c10 < d10) {
            int l10 = wVar.l() + c10;
            if (l10 <= c10 || l10 > d10) {
                return null;
            }
            if (wVar.l() == f15572e) {
                d.b d11 = d(wVar);
                if (d11 == null) {
                    return null;
                }
                arrayList.add(d11);
            }
            wVar.Q(l10);
            c10 = l10;
        }
        return arrayList;
    }
}

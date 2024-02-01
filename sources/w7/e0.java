package w7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class e0 {

    /* renamed from: h  reason: collision with root package name */
    public static final Comparator<b> f14712h = new c0();

    /* renamed from: i  reason: collision with root package name */
    public static final Comparator<b> f14713i = new d0();

    /* renamed from: j  reason: collision with root package name */
    public static final int f14714j = -1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f14715k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final int f14716l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f14717m = 5;

    /* renamed from: a  reason: collision with root package name */
    public final int f14718a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f14719b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final b[] f14720c = new b[5];

    /* renamed from: d  reason: collision with root package name */
    public int f14721d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f14722e;

    /* renamed from: f  reason: collision with root package name */
    public int f14723f;

    /* renamed from: g  reason: collision with root package name */
    public int f14724g;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f14725a;

        /* renamed from: b  reason: collision with root package name */
        public int f14726b;

        /* renamed from: c  reason: collision with root package name */
        public float f14727c;

        public b() {
        }
    }

    public e0(int i10) {
        this.f14718a = i10;
    }

    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f14725a - bVar2.f14725a;
    }

    public void c(int i10, float f10) {
        b bVar;
        int i11;
        b bVar2;
        int i12;
        d();
        int i13 = this.f14724g;
        if (i13 > 0) {
            b[] bVarArr = this.f14720c;
            int i14 = i13 - 1;
            this.f14724g = i14;
            bVar = bVarArr[i14];
        } else {
            bVar = new b();
        }
        int i15 = this.f14722e;
        this.f14722e = i15 + 1;
        bVar.f14725a = i15;
        bVar.f14726b = i10;
        bVar.f14727c = f10;
        this.f14719b.add(bVar);
        int i16 = this.f14723f + i10;
        while (true) {
            this.f14723f = i16;
            while (true) {
                int i17 = this.f14723f;
                int i18 = this.f14718a;
                if (i17 > i18) {
                    i11 = i17 - i18;
                    bVar2 = this.f14719b.get(0);
                    i12 = bVar2.f14726b;
                    if (i12 > i11) {
                        break;
                    }
                    this.f14723f -= i12;
                    this.f14719b.remove(0);
                    int i19 = this.f14724g;
                    if (i19 < 5) {
                        b[] bVarArr2 = this.f14720c;
                        this.f14724g = i19 + 1;
                        bVarArr2[i19] = bVar2;
                    }
                } else {
                    return;
                }
            }
            bVar2.f14726b = i12 - i11;
            i16 = this.f14723f - i11;
        }
    }

    public final void d() {
        if (this.f14721d != 1) {
            Collections.sort(this.f14719b, f14712h);
            this.f14721d = 1;
        }
    }

    public final void e() {
        if (this.f14721d != 0) {
            Collections.sort(this.f14719b, f14713i);
            this.f14721d = 0;
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * ((float) this.f14723f);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f14719b.size(); i11++) {
            b bVar = this.f14719b.get(i11);
            i10 += bVar.f14726b;
            if (((float) i10) >= f11) {
                return bVar.f14727c;
            }
        }
        if (this.f14719b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f14719b;
        return arrayList.get(arrayList.size() - 1).f14727c;
    }

    public void i() {
        this.f14719b.clear();
        this.f14721d = -1;
        this.f14722e = 0;
        this.f14723f = 0;
    }
}

package o6;

import w7.a;
import w7.q0;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final l f11319a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11320b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f11321c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f11322d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11323e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f11324f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f11325g;

    /* renamed from: h  reason: collision with root package name */
    public final long f11326h;

    public o(l lVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10 = false;
        a.a(iArr.length == jArr2.length);
        a.a(jArr.length == jArr2.length);
        a.a(iArr2.length == jArr2.length ? true : z10);
        this.f11319a = lVar;
        this.f11321c = jArr;
        this.f11322d = iArr;
        this.f11323e = i10;
        this.f11324f = jArr2;
        this.f11325g = iArr2;
        this.f11326h = j10;
        this.f11320b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int k10 = q0.k(this.f11324f, j10, true, false); k10 >= 0; k10--) {
            if ((this.f11325g[k10] & 1) != 0) {
                return k10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int h10 = q0.h(this.f11324f, j10, true, false); h10 < this.f11324f.length; h10++) {
            if ((this.f11325g[h10] & 1) != 0) {
                return h10;
            }
        }
        return -1;
    }
}

package wg;

import java.util.Arrays;

public final class m {

    /* renamed from: c  reason: collision with root package name */
    public static final int f24276c = 65535;

    /* renamed from: d  reason: collision with root package name */
    public static final int f24277d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f24278e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final int f24279f = 4;

    /* renamed from: g  reason: collision with root package name */
    public static final int f24280g = 5;

    /* renamed from: h  reason: collision with root package name */
    public static final int f24281h = 6;

    /* renamed from: i  reason: collision with root package name */
    public static final int f24282i = 7;

    /* renamed from: j  reason: collision with root package name */
    public static final int f24283j = 10;

    /* renamed from: a  reason: collision with root package name */
    public int f24284a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f24285b = new int[10];

    public void a() {
        this.f24284a = 0;
        Arrays.fill(this.f24285b, 0);
    }

    public int b(int i10) {
        return this.f24285b[i10];
    }

    public boolean c(boolean z10) {
        return ((this.f24284a & 4) != 0 ? this.f24285b[2] : z10 ? 1 : 0) == 1;
    }

    public int d() {
        if ((this.f24284a & 2) != 0) {
            return this.f24285b[1];
        }
        return -1;
    }

    public int e() {
        if ((this.f24284a & 128) != 0) {
            return this.f24285b[7];
        }
        return 65535;
    }

    public int f(int i10) {
        return (this.f24284a & 16) != 0 ? this.f24285b[4] : i10;
    }

    public int g(int i10) {
        return (this.f24284a & 32) != 0 ? this.f24285b[5] : i10;
    }

    public int h(int i10) {
        return (this.f24284a & 64) != 0 ? this.f24285b[6] : i10;
    }

    public boolean i(int i10) {
        return ((1 << i10) & this.f24284a) != 0;
    }

    public void j(m mVar) {
        for (int i10 = 0; i10 < 10; i10++) {
            if (mVar.i(i10)) {
                k(i10, mVar.b(i10));
            }
        }
    }

    public m k(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f24285b;
            if (i10 < iArr.length) {
                this.f24284a = (1 << i10) | this.f24284a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public int l() {
        return Integer.bitCount(this.f24284a);
    }
}

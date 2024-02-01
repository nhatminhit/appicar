package t7;

import java.util.Arrays;
import w7.a;
import w7.q0;

public final class p implements b {

    /* renamed from: i  reason: collision with root package name */
    public static final int f13139i = 100;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13140a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13141b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f13142c;

    /* renamed from: d  reason: collision with root package name */
    public final a[] f13143d;

    /* renamed from: e  reason: collision with root package name */
    public int f13144e;

    /* renamed from: f  reason: collision with root package name */
    public int f13145f;

    /* renamed from: g  reason: collision with root package name */
    public int f13146g;

    /* renamed from: h  reason: collision with root package name */
    public a[] f13147h;

    public p(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public p(boolean z10, int i10, int i11) {
        a.a(i10 > 0);
        a.a(i11 >= 0);
        this.f13140a = z10;
        this.f13141b = i10;
        this.f13146g = i11;
        this.f13147h = new a[(i11 + 100)];
        if (i11 > 0) {
            this.f13142c = new byte[(i11 * i10)];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f13147h[i12] = new a(this.f13142c, i12 * i10);
            }
        } else {
            this.f13142c = null;
        }
        this.f13143d = new a[1];
    }

    public synchronized void a(a[] aVarArr) {
        int i10 = this.f13146g;
        int length = aVarArr.length + i10;
        a[] aVarArr2 = this.f13147h;
        if (length >= aVarArr2.length) {
            this.f13147h = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            a[] aVarArr3 = this.f13147h;
            int i11 = this.f13146g;
            this.f13146g = i11 + 1;
            aVarArr3[i11] = aVar;
        }
        this.f13145f -= aVarArr.length;
        notifyAll();
    }

    public synchronized a b() {
        a aVar;
        this.f13145f++;
        int i10 = this.f13146g;
        if (i10 > 0) {
            a[] aVarArr = this.f13147h;
            int i11 = i10 - 1;
            this.f13146g = i11;
            aVar = aVarArr[i11];
            aVarArr[i11] = null;
        } else {
            aVar = new a(new byte[this.f13141b], 0);
        }
        return aVar;
    }

    public synchronized void c() {
        int i10 = 0;
        int max = Math.max(0, q0.n(this.f13144e, this.f13141b) - this.f13145f);
        int i11 = this.f13146g;
        if (max < i11) {
            if (this.f13142c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a[] aVarArr = this.f13147h;
                    a aVar = aVarArr[i10];
                    byte[] bArr = aVar.f13046a;
                    byte[] bArr2 = this.f13142c;
                    if (bArr == bArr2) {
                        i10++;
                    } else {
                        a aVar2 = aVarArr[i12];
                        if (aVar2.f13046a != bArr2) {
                            i12--;
                        } else {
                            aVarArr[i10] = aVar2;
                            aVarArr[i12] = aVar;
                            i12--;
                            i10++;
                        }
                    }
                }
                max = Math.max(max, i10);
                if (max >= this.f13146g) {
                    return;
                }
            }
            Arrays.fill(this.f13147h, max, this.f13146g, (Object) null);
            this.f13146g = max;
        }
    }

    public synchronized int d() {
        return this.f13145f * this.f13141b;
    }

    public synchronized void e(a aVar) {
        a[] aVarArr = this.f13143d;
        aVarArr[0] = aVar;
        a(aVarArr);
    }

    public int f() {
        return this.f13141b;
    }

    public synchronized void g() {
        if (this.f13140a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f13144e;
        this.f13144e = i10;
        if (z10) {
            c();
        }
    }
}

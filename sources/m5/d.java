package m5;

import i5.b;
import i5.y;
import q5.l;
import q5.m;
import q5.s;
import v4.d;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final b f10369a;

    /* renamed from: b  reason: collision with root package name */
    public final m f10370b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10371c;

    /* renamed from: d  reason: collision with root package name */
    public final a[] f10372d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final l f10373a;

        /* renamed from: b  reason: collision with root package name */
        public final s f10374b;

        /* renamed from: c  reason: collision with root package name */
        public final d.a f10375c;

        public a(l lVar, s sVar, d.a aVar) {
            this.f10373a = lVar;
            this.f10374b = sVar;
            this.f10375c = aVar;
        }

        public y a() {
            s sVar = this.f10374b;
            if (sVar == null) {
                return null;
            }
            return sVar.a();
        }

        public boolean b() {
            s sVar = this.f10374b;
            if (sVar == null) {
                return false;
            }
            return sVar.a().f();
        }
    }

    public d(b bVar, m mVar, a[] aVarArr, int i10) {
        this.f10369a = bVar;
        this.f10370b = mVar;
        this.f10372d = aVarArr;
        this.f10371c = i10;
    }

    public static d a(b bVar, m mVar, s[] sVarArr) {
        int C = mVar.C();
        a[] aVarArr = new a[C];
        for (int i10 = 0; i10 < C; i10++) {
            l A = mVar.A(i10);
            aVarArr[i10] = new a(A, sVarArr == null ? null : sVarArr[i10], bVar.A(A));
        }
        return new d(bVar, mVar, aVarArr, C);
    }

    public m b() {
        return this.f10370b;
    }

    public y c(int i10) {
        s sVar = this.f10372d[i10].f10374b;
        if (sVar == null || !sVar.Q()) {
            return null;
        }
        return sVar.a();
    }

    public y d(int i10) {
        String z10 = this.f10369a.z(this.f10372d[i10].f10373a);
        if (z10 == null || z10.isEmpty()) {
            return null;
        }
        return y.a(z10);
    }

    public int e() {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f10371c; i11++) {
            if (this.f10372d[i11].f10375c == null) {
                if (i10 >= 0) {
                    return -1;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    public d.a f(int i10) {
        return this.f10372d[i10].f10375c;
    }

    public int g() {
        return this.f10371c;
    }

    public y h(int i10) {
        s sVar = this.f10372d[i10].f10374b;
        if (sVar != null) {
            return sVar.a();
        }
        return null;
    }

    public l i(int i10) {
        return this.f10372d[i10].f10373a;
    }

    public s j(int i10) {
        return this.f10372d[i10].f10374b;
    }

    public String toString() {
        return this.f10370b.toString();
    }
}

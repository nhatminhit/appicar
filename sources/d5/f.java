package d5;

import w4.h;
import w4.i;
import w4.n;
import w4.o;

public class f extends o {

    /* renamed from: l  reason: collision with root package name */
    public static final int f6121l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static final int f6122m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f6123n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f6124o = 3;

    /* renamed from: p  reason: collision with root package name */
    public static final int f6125p = 4;

    /* renamed from: q  reason: collision with root package name */
    public static final int f6126q = 5;

    /* renamed from: f  reason: collision with root package name */
    public final f f6127f;

    /* renamed from: g  reason: collision with root package name */
    public b f6128g;

    /* renamed from: h  reason: collision with root package name */
    public f f6129h;

    /* renamed from: i  reason: collision with root package name */
    public String f6130i;

    /* renamed from: j  reason: collision with root package name */
    public Object f6131j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6132k;

    public f(int i10, f fVar, b bVar) {
        this.f14648a = i10;
        this.f6127f = fVar;
        this.f6128g = bVar;
        this.f14649b = -1;
    }

    public f(int i10, f fVar, b bVar, Object obj) {
        this.f14648a = i10;
        this.f6127f = fVar;
        this.f6128g = bVar;
        this.f14649b = -1;
        this.f6131j = obj;
    }

    @Deprecated
    public static f x() {
        return y((b) null);
    }

    public static f y(b bVar) {
        return new f(0, (f) null, bVar);
    }

    /* renamed from: A */
    public final f e() {
        return this.f6127f;
    }

    public f B(int i10) {
        this.f14648a = i10;
        this.f14649b = -1;
        this.f6130i = null;
        this.f6132k = false;
        this.f6131j = null;
        b bVar = this.f6128g;
        if (bVar != null) {
            bVar.e();
        }
        return this;
    }

    public f C(int i10, Object obj) {
        this.f14648a = i10;
        this.f14649b = -1;
        this.f6130i = null;
        this.f6132k = false;
        this.f6131j = obj;
        b bVar = this.f6128g;
        if (bVar != null) {
            bVar.e();
        }
        return this;
    }

    public f D(b bVar) {
        this.f6128g = bVar;
        return this;
    }

    public int E(String str) throws n {
        if (this.f14648a != 2 || this.f6132k) {
            return 4;
        }
        this.f6132k = true;
        this.f6130i = str;
        b bVar = this.f6128g;
        if (bVar != null) {
            r(bVar, str);
        }
        return this.f14649b < 0 ? 0 : 1;
    }

    public int F() {
        int i10 = this.f14648a;
        if (i10 == 2) {
            if (!this.f6132k) {
                return 5;
            }
            this.f6132k = false;
            this.f14649b++;
            return 2;
        } else if (i10 == 1) {
            int i11 = this.f14649b;
            this.f14649b = i11 + 1;
            return i11 < 0 ? 0 : 1;
        } else {
            int i12 = this.f14649b + 1;
            this.f14649b = i12;
            return i12 == 0 ? 0 : 3;
        }
    }

    public final String b() {
        return this.f6130i;
    }

    public Object c() {
        return this.f6131j;
    }

    public boolean i() {
        return this.f6130i != null;
    }

    public void p(Object obj) {
        this.f6131j = obj;
    }

    public final void r(b bVar, String str) throws n {
        if (bVar.d(str)) {
            Object c10 = bVar.c();
            throw new h("Duplicate field '" + str + "'", c10 instanceof i ? (i) c10 : null);
        }
    }

    public f s() {
        this.f6131j = null;
        return this.f6127f;
    }

    public f t() {
        f fVar = this.f6129h;
        if (fVar != null) {
            return fVar.B(1);
        }
        b bVar = this.f6128g;
        f fVar2 = new f(1, this, bVar == null ? null : bVar.a());
        this.f6129h = fVar2;
        return fVar2;
    }

    public f u(Object obj) {
        f fVar = this.f6129h;
        if (fVar != null) {
            return fVar.C(1, obj);
        }
        b bVar = this.f6128g;
        f fVar2 = new f(1, this, bVar == null ? null : bVar.a(), obj);
        this.f6129h = fVar2;
        return fVar2;
    }

    public f v() {
        f fVar = this.f6129h;
        if (fVar != null) {
            return fVar.B(2);
        }
        b bVar = this.f6128g;
        f fVar2 = new f(2, this, bVar == null ? null : bVar.a());
        this.f6129h = fVar2;
        return fVar2;
    }

    public f w(Object obj) {
        f fVar = this.f6129h;
        if (fVar != null) {
            return fVar.C(2, obj);
        }
        b bVar = this.f6128g;
        f fVar2 = new f(2, this, bVar == null ? null : bVar.a(), obj);
        this.f6129h = fVar2;
        return fVar2;
    }

    public b z() {
        return this.f6128g;
    }
}

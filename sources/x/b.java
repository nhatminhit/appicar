package x;

import z.e;

public class b {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f14962i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final Object f14963j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static final Object f14964k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static final Object f14965l = new Object();

    /* renamed from: m  reason: collision with root package name */
    public static final Object f14966m = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final int f14967a;

    /* renamed from: b  reason: collision with root package name */
    public int f14968b;

    /* renamed from: c  reason: collision with root package name */
    public int f14969c;

    /* renamed from: d  reason: collision with root package name */
    public float f14970d;

    /* renamed from: e  reason: collision with root package name */
    public int f14971e;

    /* renamed from: f  reason: collision with root package name */
    public float f14972f;

    /* renamed from: g  reason: collision with root package name */
    public Object f14973g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14974h;

    public enum a {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    public b() {
        this.f14967a = -2;
        this.f14968b = 0;
        this.f14969c = Integer.MAX_VALUE;
        this.f14970d = 1.0f;
        this.f14971e = 0;
        this.f14972f = 1.0f;
        this.f14973g = f14963j;
        this.f14974h = false;
    }

    public b(Object obj) {
        this.f14967a = -2;
        this.f14968b = 0;
        this.f14969c = Integer.MAX_VALUE;
        this.f14970d = 1.0f;
        this.f14971e = 0;
        this.f14972f = 1.0f;
        this.f14974h = false;
        this.f14973g = obj;
    }

    public static b a(int i10) {
        b bVar = new b(f14962i);
        bVar.j(i10);
        return bVar;
    }

    public static b b(Object obj) {
        b bVar = new b(f14962i);
        bVar.k(obj);
        return bVar;
    }

    public static b c() {
        return new b(f14965l);
    }

    public static b d(Object obj, float f10) {
        b bVar = new b(f14966m);
        bVar.r(obj, f10);
        return bVar;
    }

    public static b e() {
        return new b(f14964k);
    }

    public static b f(int i10) {
        b bVar = new b();
        bVar.v(i10);
        return bVar;
    }

    public static b g(Object obj) {
        b bVar = new b();
        bVar.w(obj);
        return bVar;
    }

    public static b h() {
        return new b(f14963j);
    }

    public void i(e eVar, e eVar2, int i10) {
        e.b bVar;
        e.b bVar2;
        int i11 = 2;
        if (i10 == 0) {
            if (this.f14974h) {
                eVar2.i1(e.b.MATCH_CONSTRAINT);
                Object obj = this.f14973g;
                if (obj == f14963j) {
                    i11 = 1;
                } else if (obj != f14966m) {
                    i11 = 0;
                }
                eVar2.j1(i11, this.f14968b, this.f14969c, this.f14970d);
                return;
            }
            int i12 = this.f14968b;
            if (i12 > 0) {
                eVar2.u1(i12);
            }
            int i13 = this.f14969c;
            if (i13 < Integer.MAX_VALUE) {
                eVar2.r1(i13);
            }
            Object obj2 = this.f14973g;
            if (obj2 == f14963j) {
                bVar2 = e.b.WRAP_CONTENT;
            } else if (obj2 == f14965l) {
                bVar2 = e.b.MATCH_PARENT;
            } else if (obj2 == null) {
                eVar2.i1(e.b.FIXED);
                eVar2.H1(this.f14971e);
                return;
            } else {
                return;
            }
            eVar2.i1(bVar2);
        } else if (this.f14974h) {
            eVar2.D1(e.b.MATCH_CONSTRAINT);
            Object obj3 = this.f14973g;
            if (obj3 == f14963j) {
                i11 = 1;
            } else if (obj3 != f14966m) {
                i11 = 0;
            }
            eVar2.E1(i11, this.f14968b, this.f14969c, this.f14970d);
        } else {
            int i14 = this.f14968b;
            if (i14 > 0) {
                eVar2.t1(i14);
            }
            int i15 = this.f14969c;
            if (i15 < Integer.MAX_VALUE) {
                eVar2.q1(i15);
            }
            Object obj4 = this.f14973g;
            if (obj4 == f14963j) {
                bVar = e.b.WRAP_CONTENT;
            } else if (obj4 == f14965l) {
                bVar = e.b.MATCH_PARENT;
            } else if (obj4 == null) {
                eVar2.D1(e.b.FIXED);
                eVar2.d1(this.f14971e);
                return;
            } else {
                return;
            }
            eVar2.D1(bVar);
        }
    }

    public b j(int i10) {
        this.f14973g = null;
        this.f14971e = i10;
        return this;
    }

    public b k(Object obj) {
        this.f14973g = obj;
        if (obj instanceof Integer) {
            this.f14971e = ((Integer) obj).intValue();
            this.f14973g = null;
        }
        return this;
    }

    public float l() {
        return this.f14972f;
    }

    public int m() {
        return this.f14971e;
    }

    public b n(int i10) {
        if (this.f14969c >= 0) {
            this.f14969c = i10;
        }
        return this;
    }

    public b o(Object obj) {
        Object obj2 = f14963j;
        if (obj == obj2 && this.f14974h) {
            this.f14973g = obj2;
            this.f14969c = Integer.MAX_VALUE;
        }
        return this;
    }

    public b p(int i10) {
        if (i10 >= 0) {
            this.f14968b = i10;
        }
        return this;
    }

    public b q(Object obj) {
        if (obj == f14963j) {
            this.f14968b = -2;
        }
        return this;
    }

    public b r(Object obj, float f10) {
        this.f14970d = f10;
        return this;
    }

    public b s(float f10) {
        return this;
    }

    public void t(float f10) {
        this.f14972f = f10;
    }

    public void u(int i10) {
        this.f14974h = false;
        this.f14973g = null;
        this.f14971e = i10;
    }

    public b v(int i10) {
        this.f14974h = true;
        return this;
    }

    public b w(Object obj) {
        this.f14973g = obj;
        this.f14974h = true;
        return this;
    }
}

package w4;

import c5.a;

public abstract class o {

    /* renamed from: c  reason: collision with root package name */
    public static final int f14645c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final int f14646d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f14647e = 2;

    /* renamed from: a  reason: collision with root package name */
    public int f14648a;

    /* renamed from: b  reason: collision with root package name */
    public int f14649b;

    public o() {
    }

    public o(int i10, int i11) {
        this.f14648a = i10;
        this.f14649b = i11;
    }

    public o(o oVar) {
        this.f14648a = oVar.f14648a;
        this.f14649b = oVar.f14649b;
    }

    public final int a() {
        int i10 = this.f14649b;
        if (i10 < 0) {
            return 0;
        }
        return i10;
    }

    public abstract String b();

    public Object c() {
        return null;
    }

    public final int d() {
        return this.f14649b + 1;
    }

    public abstract o e();

    public j f(Object obj) {
        return j.V;
    }

    @Deprecated
    public final String g() {
        int i10 = this.f14648a;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "OBJECT" : "ARRAY" : "ROOT";
    }

    public boolean h() {
        return this.f14649b >= 0;
    }

    public boolean i() {
        return b() != null;
    }

    public boolean j() {
        int i10 = this.f14648a;
        if (i10 == 2) {
            return i();
        }
        if (i10 == 1) {
            return h();
        }
        return false;
    }

    public final boolean k() {
        return this.f14648a == 1;
    }

    public final boolean l() {
        return this.f14648a == 2;
    }

    public final boolean m() {
        return this.f14648a == 0;
    }

    public m n() {
        return m.l(this, false);
    }

    public m o(boolean z10) {
        return m.l(this, z10);
    }

    public void p(Object obj) {
    }

    public String q() {
        int i10 = this.f14648a;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "Object" : "Array" : "root";
    }

    public String toString() {
        char c10;
        StringBuilder sb2 = new StringBuilder(64);
        int i10 = this.f14648a;
        if (i10 != 0) {
            if (i10 != 1) {
                sb2.append('{');
                String b10 = b();
                if (b10 != null) {
                    sb2.append('\"');
                    a.b(sb2, b10);
                    sb2.append('\"');
                } else {
                    sb2.append('?');
                }
                c10 = '}';
            } else {
                sb2.append('[');
                sb2.append(a());
                c10 = ']';
            }
            sb2.append(c10);
        } else {
            sb2.append("/");
        }
        return sb2.toString();
    }
}

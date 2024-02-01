package zb;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public int f25071a = -1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f25072b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f25073c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f25074d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25075e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f25076f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f25077g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f25078h = false;

    /* renamed from: i  reason: collision with root package name */
    public a f25079i = a.AUTO;

    public enum a {
        AUTO,
        CONTINUOUS,
        INFINITY,
        MACRO
    }

    public a a() {
        return this.f25079i;
    }

    public int b() {
        return this.f25071a;
    }

    public boolean c() {
        return this.f25075e;
    }

    public boolean d() {
        return this.f25078h;
    }

    public boolean e() {
        return this.f25073c;
    }

    public boolean f() {
        return this.f25076f;
    }

    public boolean g() {
        return this.f25077g;
    }

    public boolean h() {
        return this.f25074d;
    }

    public boolean i() {
        return this.f25072b;
    }

    public void j(boolean z10) {
        this.f25075e = z10;
        this.f25079i = (!z10 || !this.f25076f) ? z10 ? a.AUTO : null : a.CONTINUOUS;
    }

    public void k(boolean z10) {
        this.f25078h = z10;
    }

    public void l(boolean z10) {
        this.f25073c = z10;
    }

    public void m(boolean z10) {
        this.f25076f = z10;
        this.f25079i = z10 ? a.CONTINUOUS : this.f25075e ? a.AUTO : null;
    }

    public void n(boolean z10) {
        this.f25077g = z10;
    }

    public void o(a aVar) {
        this.f25079i = aVar;
    }

    public void p(boolean z10) {
        this.f25074d = z10;
    }

    public void q(int i10) {
        this.f25071a = i10;
    }

    public void r(boolean z10) {
        this.f25072b = z10;
    }
}

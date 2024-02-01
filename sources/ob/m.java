package ob;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public int f21339a = 0;

    /* renamed from: b  reason: collision with root package name */
    public a f21340b = a.NUMERIC;

    public enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    public int a() {
        return this.f21339a;
    }

    public void b(int i10) {
        this.f21339a += i10;
    }

    public boolean c() {
        return this.f21340b == a.ALPHA;
    }

    public boolean d() {
        return this.f21340b == a.ISO_IEC_646;
    }

    public boolean e() {
        return this.f21340b == a.NUMERIC;
    }

    public void f() {
        this.f21340b = a.ALPHA;
    }

    public void g() {
        this.f21340b = a.ISO_IEC_646;
    }

    public void h() {
        this.f21340b = a.NUMERIC;
    }

    public void i(int i10) {
        this.f21339a = i10;
    }
}

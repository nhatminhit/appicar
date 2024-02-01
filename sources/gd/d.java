package gd;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public int f19204a;

    /* renamed from: b  reason: collision with root package name */
    public float f19205b;

    /* renamed from: c  reason: collision with root package name */
    public int f19206c;

    /* renamed from: d  reason: collision with root package name */
    public int f19207d;

    public d() {
        this.f19204a = 0;
        this.f19205b = 0.0f;
        this.f19206c = 0;
        this.f19207d = 0;
    }

    public d(int i10, float f10, int i11) {
        this.f19207d = 0;
        this.f19204a = i10;
        this.f19205b = f10;
        this.f19206c = i11;
    }

    public d(int i10, float f10, int i11, int i12) {
        this.f19204a = i10;
        this.f19205b = f10;
        this.f19206c = i11;
        this.f19207d = i12;
    }

    public int a() {
        return this.f19204a;
    }

    public float b() {
        return this.f19205b;
    }

    public int c() {
        return this.f19207d;
    }

    public int d() {
        return this.f19206c;
    }

    public boolean e() {
        return this.f19207d == 4;
    }

    public d f(int i10) {
        this.f19204a = i10;
        return this;
    }

    public d g(float f10) {
        this.f19205b = f10;
        return this;
    }

    public d h(int i10) {
        this.f19207d = i10;
        return this;
    }

    public d i(int i10) {
        this.f19206c = i10;
        return this;
    }

    public String toString() {
        return "Tire{id=" + this.f19204a + ", press=" + this.f19205b + ", temp=" + this.f19206c + ", status=" + this.f19207d + '}';
    }
}
